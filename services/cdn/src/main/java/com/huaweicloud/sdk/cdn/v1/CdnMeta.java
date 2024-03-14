package com.huaweicloud.sdk.cdn.v1;

import com.huaweicloud.sdk.cdn.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.BlackWhiteListBody;
import com.huaweicloud.sdk.cdn.v1.model.CacheConfigRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreatePreheatingTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreatePreheatingTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreateRefreshTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateRefreshTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreateTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateTagsRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.CreateTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.DeleteTagsRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.DisableDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.DisableDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.EnableDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.EnableDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.Follow302StatusRequest;
import com.huaweicloud.sdk.cdn.v1.model.HeaderBody;
import com.huaweicloud.sdk.cdn.v1.model.HttpInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ModifyDomainConfigRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.OriginHostRequest;
import com.huaweicloud.sdk.cdn.v1.model.OriginRequest;
import com.huaweicloud.sdk.cdn.v1.model.PreheatingTaskRequest;
import com.huaweicloud.sdk.cdn.v1.model.RangeStatusRequest;
import com.huaweicloud.sdk.cdn.v1.model.RefererBody;
import com.huaweicloud.sdk.cdn.v1.model.RefreshTaskRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowBlackWhiteListRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowBlackWhiteListResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowCacheRulesRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowCacheRulesResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHttpInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHttpInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowIpInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowIpInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowLogsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowLogsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowOriginHostRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowOriginHostResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowReferRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowReferResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowResponseHeaderRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowResponseHeaderResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowUrlTaskInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowUrlTaskInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateBlackWhiteListRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateBlackWhiteListResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateCacheRulesRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateCacheRulesResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesRequestBody;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainOriginRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainOriginResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateFollow302SwitchRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateFollow302SwitchResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateOriginHostRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateOriginHostResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessBody;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateRangeSwitchRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateRangeSwitchResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateReferRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateReferResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateResponseHeaderRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateResponseHeaderResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdnMeta {

    public static final HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTags =
        genForBatchDeleteTags();

    private static HttpRequestDef<BatchDeleteTagsRequest, BatchDeleteTagsResponse> genForBatchDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTagsRequest, BatchDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTagsRequest.class, BatchDeleteTagsResponse.class)
                .withName("BatchDeleteTags")
                .withUri("/v1.0/cdn/configuration/tags/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTagsRequest::getBody, BatchDeleteTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteTagsResponse::getXRequestId, BatchDeleteTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
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
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDomainResponse::getXRequestId, CreateDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasks =
        genForCreatePreheatingTasks();

    private static HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> genForCreatePreheatingTasks() {
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
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getEnterpriseProjectId,
                CreatePreheatingTasksRequest::setEnterpriseProjectId));
        builder.<PreheatingTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreheatingTaskRequest.class),
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getBody, CreatePreheatingTasksRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePreheatingTasksResponse::getXRequestId,
                CreatePreheatingTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasks =
        genForCreateRefreshTasks();

    private static HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> genForCreateRefreshTasks() {
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
            f -> f.withMarshaller(CreateRefreshTasksRequest::getEnterpriseProjectId,
                CreateRefreshTasksRequest::setEnterpriseProjectId));
        builder.<RefreshTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefreshTaskRequest.class),
            f -> f.withMarshaller(CreateRefreshTasksRequest::getBody, CreateRefreshTasksRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRefreshTasksResponse::getXRequestId,
                CreateRefreshTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTagsRequest, CreateTagsResponse> createTags = genForCreateTags();

    private static HttpRequestDef<CreateTagsRequest, CreateTagsResponse> genForCreateTags() {
        // basic
        HttpRequestDef.Builder<CreateTagsRequest, CreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagsRequest.class, CreateTagsResponse.class)
                .withName("CreateTags")
                .withUri("/v1.0/cdn/configuration/tags")
                .withContentType("application/json");

        // requests
        builder.<CreateTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagsRequestBody.class),
            f -> f.withMarshaller(CreateTagsRequest::getBody, CreateTagsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTagsResponse::getXRequestId, CreateTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
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
            f -> f.withMarshaller(DeleteDomainRequest::getDomainId, DeleteDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getEnterpriseProjectId,
                DeleteDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDomainResponse::getXRequestId, DeleteDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DisableDomainRequest, DisableDomainResponse> disableDomain =
        genForDisableDomain();

    private static HttpRequestDef<DisableDomainRequest, DisableDomainResponse> genForDisableDomain() {
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
            f -> f.withMarshaller(DisableDomainRequest::getDomainId, DisableDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDomainRequest::getEnterpriseProjectId,
                DisableDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableDomainResponse::getXRequestId, DisableDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<EnableDomainRequest, EnableDomainResponse> enableDomain = genForEnableDomain();

    private static HttpRequestDef<EnableDomainRequest, EnableDomainResponse> genForEnableDomain() {
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
            f -> f.withMarshaller(EnableDomainRequest::getDomainId, EnableDomainRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getEnterpriseProjectId,
                EnableDomainRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableDomainResponse::getXRequestId, EnableDomainResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForListDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForListDomains() {
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
            f -> f.withMarshaller(ListDomainsRequest::getDomainName, ListDomainsRequest::setDomainName));
        builder.<ListDomainsRequest.BusinessTypeEnum>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.BusinessTypeEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getBusinessType, ListDomainsRequest::setBusinessType));
        builder.<ListDomainsRequest.DomainStatusEnum>withRequestField("domain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.DomainStatusEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainStatus, ListDomainsRequest::setDomainStatus));
        builder.<ListDomainsRequest.ServiceAreaEnum>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.ServiceAreaEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getServiceArea, ListDomainsRequest::setServiceArea));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageSize, ListDomainsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageNumber, ListDomainsRequest::setPageNumber));
        builder.<Boolean>withRequestField("show_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getShowTags, ListDomainsRequest::setShowTags));
        builder.<Boolean>withRequestField("exact_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getExactMatch, ListDomainsRequest::setExactMatch));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getEnterpriseProjectId,
                ListDomainsRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainsResponse::getXRequestId, ListDomainsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteList =
        genForShowBlackWhiteList();

    private static HttpRequestDef<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> genForShowBlackWhiteList() {
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
            f -> f.withMarshaller(ShowBlackWhiteListRequest::getDomainId, ShowBlackWhiteListRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlackWhiteListRequest::getEnterpriseProjectId,
                ShowBlackWhiteListRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowBlackWhiteListResponse::getXRequestId,
                ShowBlackWhiteListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRules =
        genForShowCacheRules();

    private static HttpRequestDef<ShowCacheRulesRequest, ShowCacheRulesResponse> genForShowCacheRules() {
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
            f -> f.withMarshaller(ShowCacheRulesRequest::getDomainId, ShowCacheRulesRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCacheRulesRequest::getEnterpriseProjectId,
                ShowCacheRulesRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCacheRulesResponse::getXRequestId, ShowCacheRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfo =
        genForShowCertificatesHttpsInfo();

    private static HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> genForShowCertificatesHttpsInfo() {
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
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageSize,
                ShowCertificatesHttpsInfoRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageNumber,
                ShowCertificatesHttpsInfoRequest::setPageNumber));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getDomainName,
                ShowCertificatesHttpsInfoRequest::setDomainName));
        builder.<String>withRequestField("user_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getUserDomainId,
                ShowCertificatesHttpsInfoRequest::setUserDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getEnterpriseProjectId,
                ShowCertificatesHttpsInfoRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCertificatesHttpsInfoResponse::getXRequestId,
                ShowCertificatesHttpsInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetail =
        genForShowDomainDetail();

    private static HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> genForShowDomainDetail() {
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
            f -> f.withMarshaller(ShowDomainDetailRequest::getDomainId, ShowDomainDetailRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailRequest::getEnterpriseProjectId,
                ShowDomainDetailRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainDetailResponse::getXRequestId, ShowDomainDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfig =
        genForShowDomainFullConfig();

    private static HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> genForShowDomainFullConfig() {
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
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getDomainName,
                ShowDomainFullConfigRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getEnterpriseProjectId,
                ShowDomainFullConfigRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDomainFullConfigResponse::getXRequestId,
                ShowDomainFullConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetails =
        genForShowDomainItemDetails();

    private static HttpRequestDef<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> genForShowDomainItemDetails() {
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
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getEnterpriseProjectId,
                ShowDomainItemDetailsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getStartTime,
                ShowDomainItemDetailsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getEndTime, ShowDomainItemDetailsRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getDomainName,
                ShowDomainItemDetailsRequest::setDomainName));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getServiceArea,
                ShowDomainItemDetailsRequest::setServiceArea));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getStatType,
                ShowDomainItemDetailsRequest::setStatType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetails =
        genForShowDomainItemLocationDetails();

    private static HttpRequestDef<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> genForShowDomainItemLocationDetails() {
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
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getEnterpriseProjectId,
                ShowDomainItemLocationDetailsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getStartTime,
                ShowDomainItemLocationDetailsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getEndTime,
                ShowDomainItemLocationDetailsRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getDomainName,
                ShowDomainItemLocationDetailsRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getStatType,
                ShowDomainItemLocationDetailsRequest::setStatType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getRegion,
                ShowDomainItemLocationDetailsRequest::setRegion));
        builder.<String>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getIsp,
                ShowDomainItemLocationDetailsRequest::setIsp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStats =
        genForShowDomainLocationStats();

    private static HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> genForShowDomainLocationStats() {
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
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getAction,
                ShowDomainLocationStatsRequest::setAction));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStartTime,
                ShowDomainLocationStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEndTime,
                ShowDomainLocationStatsRequest::setEndTime));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getInterval,
                ShowDomainLocationStatsRequest::setInterval));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getDomainName,
                ShowDomainLocationStatsRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStatType,
                ShowDomainLocationStatsRequest::setStatType));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getGroupBy,
                ShowDomainLocationStatsRequest::setGroupBy));
        builder.<String>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getCountry,
                ShowDomainLocationStatsRequest::setCountry));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getProvince,
                ShowDomainLocationStatsRequest::setProvince));
        builder.<String>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getIsp, ShowDomainLocationStatsRequest::setIsp));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEnterpriseProjectId,
                ShowDomainLocationStatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStats =
        genForShowDomainStats();

    private static HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> genForShowDomainStats() {
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
            f -> f.withMarshaller(ShowDomainStatsRequest::getAction, ShowDomainStatsRequest::setAction));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStartTime, ShowDomainStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEndTime, ShowDomainStatsRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getDomainName, ShowDomainStatsRequest::setDomainName));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStatType, ShowDomainStatsRequest::setStatType));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getInterval, ShowDomainStatsRequest::setInterval));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getGroupBy, ShowDomainStatsRequest::setGroupBy));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getServiceArea, ShowDomainStatsRequest::setServiceArea));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEnterpriseProjectId,
                ShowDomainStatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetails =
        genForShowHistoryTaskDetails();

    private static HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> genForShowHistoryTaskDetails() {
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
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getHistoryTasksId,
                ShowHistoryTaskDetailsRequest::setHistoryTasksId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getEnterpriseProjectId,
                ShowHistoryTaskDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageSize,
                ShowHistoryTaskDetailsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageNumber,
                ShowHistoryTaskDetailsRequest::setPageNumber));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getStatus, ShowHistoryTaskDetailsRequest::setStatus));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getUrl, ShowHistoryTaskDetailsRequest::setUrl));
        builder.<Long>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getCreateTime,
                ShowHistoryTaskDetailsRequest::setCreateTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHistoryTaskDetailsResponse::getXRequestId,
                ShowHistoryTaskDetailsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasks =
        genForShowHistoryTasks();

    private static HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> genForShowHistoryTasks() {
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
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEnterpriseProjectId,
                ShowHistoryTasksRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageSize, ShowHistoryTasksRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageNumber, ShowHistoryTasksRequest::setPageNumber));
        builder.<ShowHistoryTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStatus, ShowHistoryTasksRequest::setStatus));
        builder.<Long>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStartDate, ShowHistoryTasksRequest::setStartDate));
        builder.<Long>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEndDate, ShowHistoryTasksRequest::setEndDate));
        builder.<String>withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderField, ShowHistoryTasksRequest::setOrderField));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderType, ShowHistoryTasksRequest::setOrderType));
        builder.<ShowHistoryTasksRequest.FileTypeEnum>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.FileTypeEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getFileType, ShowHistoryTasksRequest::setFileType));
        builder.<ShowHistoryTasksRequest.TaskTypeEnum>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.TaskTypeEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getTaskType, ShowHistoryTasksRequest::setTaskType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHistoryTasksResponse::getXRequestId, ShowHistoryTasksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfo = genForShowHttpInfo();

    private static HttpRequestDef<ShowHttpInfoRequest, ShowHttpInfoResponse> genForShowHttpInfo() {
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
            f -> f.withMarshaller(ShowHttpInfoRequest::getDomainId, ShowHttpInfoRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpInfoRequest::getEnterpriseProjectId,
                ShowHttpInfoRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHttpInfoResponse::getXRequestId, ShowHttpInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfo = genForShowIpInfo();

    private static HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> genForShowIpInfo() {
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
            f -> f.withMarshaller(ShowIpInfoRequest::getEnterpriseProjectId,
                ShowIpInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("ips",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpInfoRequest::getIps, ShowIpInfoRequest::setIps));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIpInfoResponse::getXRequestId, ShowIpInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLogsRequest, ShowLogsResponse> showLogs = genForShowLogs();

    private static HttpRequestDef<ShowLogsRequest, ShowLogsResponse> genForShowLogs() {
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
            f -> f.withMarshaller(ShowLogsRequest::getDomainName, ShowLogsRequest::setDomainName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLogsRequest::getStartTime, ShowLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLogsRequest::getEndTime, ShowLogsRequest::setEndTime));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageSize, ShowLogsRequest::setPageSize));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageNumber, ShowLogsRequest::setPageNumber));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsRequest::getEnterpriseProjectId, ShowLogsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHost =
        genForShowOriginHost();

    private static HttpRequestDef<ShowOriginHostRequest, ShowOriginHostResponse> genForShowOriginHost() {
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
            f -> f.withMarshaller(ShowOriginHostRequest::getDomainId, ShowOriginHostRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOriginHostRequest::getEnterpriseProjectId,
                ShowOriginHostRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowOriginHostResponse::getXRequestId, ShowOriginHostResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
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

    public static final HttpRequestDef<ShowReferRequest, ShowReferResponse> showRefer = genForShowRefer();

    private static HttpRequestDef<ShowReferRequest, ShowReferResponse> genForShowRefer() {
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
            f -> f.withMarshaller(ShowReferRequest::getDomainId, ShowReferRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReferRequest::getEnterpriseProjectId, ShowReferRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowReferResponse::getXRequestId, ShowReferResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeader =
        genForShowResponseHeader();

    private static HttpRequestDef<ShowResponseHeaderRequest, ShowResponseHeaderResponse> genForShowResponseHeader() {
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
            f -> f.withMarshaller(ShowResponseHeaderRequest::getDomainId, ShowResponseHeaderRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResponseHeaderRequest::getEnterpriseProjectId,
                ShowResponseHeaderRequest::setEnterpriseProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResponseHeaderResponse::getXRequestId,
                ShowResponseHeaderResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForShowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForShowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v1.0/cdn/configuration/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagsRequest::getResourceId, ShowTagsRequest::setResourceId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowTagsResponse::getXRequestId, ShowTagsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrl = genForShowTopUrl();

    private static HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> genForShowTopUrl() {
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
            f -> f.withMarshaller(ShowTopUrlRequest::getEnterpriseProjectId,
                ShowTopUrlRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStartTime, ShowTopUrlRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEndTime, ShowTopUrlRequest::setEndTime));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getDomainName, ShowTopUrlRequest::setDomainName));
        builder.<ShowTopUrlRequest.ServiceAreaEnum>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTopUrlRequest.ServiceAreaEnum.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getServiceArea, ShowTopUrlRequest::setServiceArea));
        builder.<ShowTopUrlRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTopUrlRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStatType, ShowTopUrlRequest::setStatType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfo =
        genForShowUrlTaskInfo();

    private static HttpRequestDef<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> genForShowUrlTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUrlTaskInfoRequest.class, ShowUrlTaskInfoResponse.class)
                .withName("ShowUrlTaskInfo")
                .withUri("/v1.0/cdn/contentgateway/url-tasks")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getStartTime, ShowUrlTaskInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getEndTime, ShowUrlTaskInfoRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getOffset, ShowUrlTaskInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getLimit, ShowUrlTaskInfoRequest::setLimit));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getUrl, ShowUrlTaskInfoRequest::setUrl));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getTaskType, ShowUrlTaskInfoRequest::setTaskType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getStatus, ShowUrlTaskInfoRequest::setStatus));
        builder.<String>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUrlTaskInfoRequest::getFileType, ShowUrlTaskInfoRequest::setFileType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUrlTaskInfoResponse::getXRequestId, ShowUrlTaskInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteList =
        genForUpdateBlackWhiteList();

    private static HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> genForUpdateBlackWhiteList() {
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
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getDomainId, UpdateBlackWhiteListRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getEnterpriseProjectId,
                UpdateBlackWhiteListRequest::setEnterpriseProjectId));
        builder.<BlackWhiteListBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteListBody.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getBody, UpdateBlackWhiteListRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateBlackWhiteListResponse::getXRequestId,
                UpdateBlackWhiteListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRules =
        genForUpdateCacheRules();

    private static HttpRequestDef<UpdateCacheRulesRequest, UpdateCacheRulesResponse> genForUpdateCacheRules() {
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
            f -> f.withMarshaller(UpdateCacheRulesRequest::getDomainId, UpdateCacheRulesRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCacheRulesRequest::getEnterpriseProjectId,
                UpdateCacheRulesRequest::setEnterpriseProjectId));
        builder.<CacheConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CacheConfigRequestBody.class),
            f -> f.withMarshaller(UpdateCacheRulesRequest::getBody, UpdateCacheRulesRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateCacheRulesResponse::getXRequestId, UpdateCacheRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfig =
        genForUpdateDomainFullConfig();

    private static HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> genForUpdateDomainFullConfig() {
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
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getDomainName,
                UpdateDomainFullConfigRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getEnterpriseProjectId,
                UpdateDomainFullConfigRequest::setEnterpriseProjectId));
        builder.<ModifyDomainConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDomainConfigRequestBody.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getBody, UpdateDomainFullConfigRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDomainFullConfigResponse::getXRequestId,
                UpdateDomainFullConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificates =
        genForUpdateDomainMultiCertificates();

    private static HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> genForUpdateDomainMultiCertificates() {
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
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainMultiCertificatesRequest::getEnterpriseProjectId,
                UpdateDomainMultiCertificatesRequest::setEnterpriseProjectId));
        builder.<UpdateDomainMultiCertificatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDomainMultiCertificatesRequestBody.class),
            f -> f.withMarshaller(UpdateDomainMultiCertificatesRequest::getBody,
                UpdateDomainMultiCertificatesRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDomainMultiCertificatesResponse::getXRequestId,
                UpdateDomainMultiCertificatesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOrigin =
        genForUpdateDomainOrigin();

    private static HttpRequestDef<UpdateDomainOriginRequest, UpdateDomainOriginResponse> genForUpdateDomainOrigin() {
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
            f -> f.withMarshaller(UpdateDomainOriginRequest::getDomainId, UpdateDomainOriginRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainOriginRequest::getEnterpriseProjectId,
                UpdateDomainOriginRequest::setEnterpriseProjectId));
        builder.<OriginRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OriginRequest.class),
            f -> f.withMarshaller(UpdateDomainOriginRequest::getBody, UpdateDomainOriginRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDomainOriginResponse::getXRequestId,
                UpdateDomainOriginResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302Switch =
        genForUpdateFollow302Switch();

    private static HttpRequestDef<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> genForUpdateFollow302Switch() {
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
            f -> f.withMarshaller(UpdateFollow302SwitchRequest::getDomainId,
                UpdateFollow302SwitchRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFollow302SwitchRequest::getEnterpriseProjectId,
                UpdateFollow302SwitchRequest::setEnterpriseProjectId));
        builder.<Follow302StatusRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Follow302StatusRequest.class),
            f -> f.withMarshaller(UpdateFollow302SwitchRequest::getBody, UpdateFollow302SwitchRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateFollow302SwitchResponse::getXRequestId,
                UpdateFollow302SwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfo =
        genForUpdateHttpsInfo();

    private static HttpRequestDef<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> genForUpdateHttpsInfo() {
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
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getDomainId, UpdateHttpsInfoRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getEnterpriseProjectId,
                UpdateHttpsInfoRequest::setEnterpriseProjectId));
        builder.<HttpInfoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HttpInfoRequest.class),
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getBody, UpdateHttpsInfoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHttpsInfoResponse::getXRequestId, UpdateHttpsInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHost =
        genForUpdateOriginHost();

    private static HttpRequestDef<UpdateOriginHostRequest, UpdateOriginHostResponse> genForUpdateOriginHost() {
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
            f -> f.withMarshaller(UpdateOriginHostRequest::getDomainId, UpdateOriginHostRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOriginHostRequest::getEnterpriseProjectId,
                UpdateOriginHostRequest::setEnterpriseProjectId));
        builder.<OriginHostRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OriginHostRequest.class),
            f -> f.withMarshaller(UpdateOriginHostRequest::getBody, UpdateOriginHostRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateOriginHostResponse::getXRequestId, UpdateOriginHostResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccess =
        genForUpdatePrivateBucketAccess();

    private static HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> genForUpdatePrivateBucketAccess() {
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
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getDomainId,
                UpdatePrivateBucketAccessRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getEnterpriseProjectId,
                UpdatePrivateBucketAccessRequest::setEnterpriseProjectId));
        builder.<UpdatePrivateBucketAccessBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePrivateBucketAccessBody.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getBody,
                UpdatePrivateBucketAccessRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePrivateBucketAccessResponse::getXRequestId,
                UpdatePrivateBucketAccessResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitch =
        genForUpdateRangeSwitch();

    private static HttpRequestDef<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> genForUpdateRangeSwitch() {
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
            f -> f.withMarshaller(UpdateRangeSwitchRequest::getDomainId, UpdateRangeSwitchRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRangeSwitchRequest::getEnterpriseProjectId,
                UpdateRangeSwitchRequest::setEnterpriseProjectId));
        builder.<RangeStatusRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RangeStatusRequest.class),
            f -> f.withMarshaller(UpdateRangeSwitchRequest::getBody, UpdateRangeSwitchRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRangeSwitchResponse::getXRequestId, UpdateRangeSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateReferRequest, UpdateReferResponse> updateRefer = genForUpdateRefer();

    private static HttpRequestDef<UpdateReferRequest, UpdateReferResponse> genForUpdateRefer() {
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
            f -> f.withMarshaller(UpdateReferRequest::getDomainId, UpdateReferRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReferRequest::getEnterpriseProjectId,
                UpdateReferRequest::setEnterpriseProjectId));
        builder.<RefererBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefererBody.class),
            f -> f.withMarshaller(UpdateReferRequest::getBody, UpdateReferRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateReferResponse::getXRequestId, UpdateReferResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeader =
        genForUpdateResponseHeader();

    private static HttpRequestDef<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> genForUpdateResponseHeader() {
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
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getDomainId, UpdateResponseHeaderRequest::setDomainId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getEnterpriseProjectId,
                UpdateResponseHeaderRequest::setEnterpriseProjectId));
        builder.<HeaderBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HeaderBody.class),
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getBody, UpdateResponseHeaderRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateResponseHeaderResponse::getXRequestId,
                UpdateResponseHeaderResponse::setXRequestId));
        return builder.build();
    }

}

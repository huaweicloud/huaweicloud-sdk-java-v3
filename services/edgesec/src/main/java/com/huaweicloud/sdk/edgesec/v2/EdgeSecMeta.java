package com.huaweicloud.sdk.edgesec.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.ApplyHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpAccessControlRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpBlockTrustIpRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpCcRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpGeoIpRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIgnoreRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIpGroupRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPunishmentRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpReferenceTableRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.CreateHttpReferenceTableResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DeleteHttpReferenceTableResponse;
import com.huaweicloud.sdk.edgesec.v2.model.DownloadDdosAttackLogsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.DownloadDdosAttackLogsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.HttpStatisticsItem;
import com.huaweicloud.sdk.edgesec.v2.model.ResetHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ResetHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackLogsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackLogsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackTimelineStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDdosAttackTimelineStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowDomainsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAccessControlRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackDistributionStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackDistributionStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTimelineStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTimelineStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTopStatsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpAttackTopStatsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpBlockTrustIpRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpCcRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpGeoIpRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIgnoreRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpIpGroupsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpOverviewsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpOverviewsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPoliciesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRulesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpPunishmentRulesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpReferenceTablesRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpReferenceTablesResponse;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpStatisticsRequest;
import com.huaweicloud.sdk.edgesec.v2.model.ShowHttpStatisticsResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateDomainResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpAccessControlRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpAccessControlRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpAccessControlRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpBlockTrustIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpBlockTrustIpRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpBlockTrustIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpCcRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpCcRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpCcRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpGeoIpRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpGeoIpRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpGeoIpRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIgnoreRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIgnoreRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIgnoreRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIpGroupRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIpGroupRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpIpGroupResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPolicyRuleStatusResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPunishmentRuleRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPunishmentRuleRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpPunishmentRuleResponse;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpReferenceTableRequest;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpReferenceTableRequestBody;
import com.huaweicloud.sdk.edgesec.v2.model.UpdateHttpReferenceTableResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EdgeSecMeta {

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForCreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForCreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1/edgesec/configuration/domains")
                .withContentType("application/json");

        // requests
        builder.<CreateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainRequestBody.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, CreateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse> createHttpReferenceTable =
        genForCreateHttpReferenceTable();

    private static HttpRequestDef<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse> genForCreateHttpReferenceTable() {
        // basic
        HttpRequestDef.Builder<CreateHttpReferenceTableRequest, CreateHttpReferenceTableResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateHttpReferenceTableRequest.class, CreateHttpReferenceTableResponse.class)
                .withName("CreateHttpReferenceTable")
                .withUri("/v1/edgesec/configuration/http/reference-table")
                .withContentType("application/json");

        // requests
        builder.<CreateHttpReferenceTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpReferenceTableRequestBody.class),
            f -> f.withMarshaller(CreateHttpReferenceTableRequest::getBody, CreateHttpReferenceTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genForDeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genForDeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
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

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse> deleteHttpReferenceTable =
        genForDeleteHttpReferenceTable();

    private static HttpRequestDef<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse> genForDeleteHttpReferenceTable() {
        // basic
        HttpRequestDef.Builder<DeleteHttpReferenceTableRequest, DeleteHttpReferenceTableResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHttpReferenceTableRequest.class,
                    DeleteHttpReferenceTableResponse.class)
                .withName("DeleteHttpReferenceTable")
                .withUri("/v1/edgesec/configuration/http/reference-table/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpReferenceTableRequest::getTableId,
                DeleteHttpReferenceTableRequest::setTableId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetail =
        genForShowDomainDetail();

    private static HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> genForShowDomainDetail() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetailRequest, ShowDomainDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainDetailRequest.class, ShowDomainDetailResponse.class)
                .withName("ShowDomainDetail")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailRequest::getDomainId, ShowDomainDetailRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainsRequest, ShowDomainsResponse> showDomains = genForShowDomains();

    private static HttpRequestDef<ShowDomainsRequest, ShowDomainsResponse> genForShowDomains() {
        // basic
        HttpRequestDef.Builder<ShowDomainsRequest, ShowDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainsRequest.class, ShowDomainsResponse.class)
                .withName("ShowDomains")
                .withUri("/v1/edgesec/configuration/domains")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainsRequest::getOffset, ShowDomainsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDomainsRequest::getLimit, ShowDomainsRequest::setLimit));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getDomainName, ShowDomainsRequest::setDomainName));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getPolicyName, ShowDomainsRequest::setPolicyName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainsRequest::getEnterpriseProjectId,
                ShowDomainsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse> showHttpOverviews =
        genForShowHttpOverviews();

    private static HttpRequestDef<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse> genForShowHttpOverviews() {
        // basic
        HttpRequestDef.Builder<ShowHttpOverviewsRequest, ShowHttpOverviewsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpOverviewsRequest.class, ShowHttpOverviewsResponse.class)
                .withName("ShowHttpOverviews")
                .withUri("/v1/edgesec/stat/http/overviews/classification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpOverviewsRequest::getEnterpriseProjectId,
                ShowHttpOverviewsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpOverviewsRequest::getFrom, ShowHttpOverviewsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpOverviewsRequest::getTo, ShowHttpOverviewsRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpOverviewsRequest::getTop, ShowHttpOverviewsRequest::setTop));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpOverviewsRequest::getDomainName, ShowHttpOverviewsRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse> showHttpReferenceTables =
        genForShowHttpReferenceTables();

    private static HttpRequestDef<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse> genForShowHttpReferenceTables() {
        // basic
        HttpRequestDef.Builder<ShowHttpReferenceTablesRequest, ShowHttpReferenceTablesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHttpReferenceTablesRequest.class, ShowHttpReferenceTablesResponse.class)
            .withName("ShowHttpReferenceTables")
            .withUri("/v1/edgesec/configuration/http/reference-table")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpReferenceTablesRequest::getEnterpriseProjectId,
                ShowHttpReferenceTablesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpReferenceTablesRequest::getPage, ShowHttpReferenceTablesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpReferenceTablesRequest::getPagesize,
                ShowHttpReferenceTablesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpReferenceTablesRequest::getName, ShowHttpReferenceTablesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse> showHttpStatistics =
        genForShowHttpStatistics();

    private static HttpRequestDef<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse> genForShowHttpStatistics() {
        // basic
        HttpRequestDef.Builder<ShowHttpStatisticsRequest, ShowHttpStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpStatisticsRequest.class, ShowHttpStatisticsResponse.class)
                .withName("ShowHttpStatistics")
                .withUri("/v1/edgesec/stat/http/overviews/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpStatisticsRequest::getEnterpriseProjectId,
                ShowHttpStatisticsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpStatisticsRequest::getFrom, ShowHttpStatisticsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpStatisticsRequest::getTo, ShowHttpStatisticsRequest::setTo));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpStatisticsRequest::getDomainName, ShowHttpStatisticsRequest::setDomainName));

        // response
        builder.<List<HttpStatisticsItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowHttpStatisticsResponse::getBody, ShowHttpStatisticsResponse::setBody)
                .withInnerContainerType(HttpStatisticsItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> updateDomain = genForUpdateDomain();

    private static HttpRequestDef<UpdateDomainRequest, UpdateDomainResponse> genForUpdateDomain() {
        // basic
        HttpRequestDef.Builder<UpdateDomainRequest, UpdateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainRequest.class, UpdateDomainResponse.class)
                .withName("UpdateDomain")
                .withUri("/v1/edgesec/configuration/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainRequest::getDomainId, UpdateDomainRequest::setDomainId));
        builder.<UpdateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainRequestBody.class),
            f -> f.withMarshaller(UpdateDomainRequest::getBody, UpdateDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse> updateHttpReferenceTable =
        genForUpdateHttpReferenceTable();

    private static HttpRequestDef<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse> genForUpdateHttpReferenceTable() {
        // basic
        HttpRequestDef.Builder<UpdateHttpReferenceTableRequest, UpdateHttpReferenceTableResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateHttpReferenceTableRequest.class, UpdateHttpReferenceTableResponse.class)
                .withName("UpdateHttpReferenceTable")
                .withUri("/v1/edgesec/configuration/http/reference-table/{table_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("table_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpReferenceTableRequest::getTableId,
                UpdateHttpReferenceTableRequest::setTableId));
        builder.<UpdateHttpReferenceTableRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpReferenceTableRequestBody.class),
            f -> f.withMarshaller(UpdateHttpReferenceTableRequest::getBody, UpdateHttpReferenceTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse> downloadDdosAttackLogs =
        genForDownloadDdosAttackLogs();

    private static HttpRequestDef<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse> genForDownloadDdosAttackLogs() {
        // basic
        HttpRequestDef.Builder<DownloadDdosAttackLogsRequest, DownloadDdosAttackLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DownloadDdosAttackLogsRequest.class, DownloadDdosAttackLogsResponse.class)
            .withName("DownloadDdosAttackLogs")
            .withUri("/v1/edgesec/log/ddos-attack-logs/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadDdosAttackLogsRequest::getEnterpriseProjectId,
                DownloadDdosAttackLogsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadDdosAttackLogsRequest::getStartTime,
                DownloadDdosAttackLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadDdosAttackLogsRequest::getEndTime,
                DownloadDdosAttackLogsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadDdosAttackLogsRequest::getOffset, DownloadDdosAttackLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadDdosAttackLogsRequest::getLimit, DownloadDdosAttackLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse> showDdosAttackLogs =
        genForShowDdosAttackLogs();

    private static HttpRequestDef<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse> genForShowDdosAttackLogs() {
        // basic
        HttpRequestDef.Builder<ShowDdosAttackLogsRequest, ShowDdosAttackLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDdosAttackLogsRequest.class, ShowDdosAttackLogsResponse.class)
                .withName("ShowDdosAttackLogs")
                .withUri("/v1/edgesec/log/ddos-attack-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDdosAttackLogsRequest::getEnterpriseProjectId,
                ShowDdosAttackLogsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDdosAttackLogsRequest::getStartTime, ShowDdosAttackLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDdosAttackLogsRequest::getEndTime, ShowDdosAttackLogsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDdosAttackLogsRequest::getOffset, ShowDdosAttackLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDdosAttackLogsRequest::getLimit, ShowDdosAttackLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse> showDdosAttackTimelineStats =
        genForShowDdosAttackTimelineStats();

    private static HttpRequestDef<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse> genForShowDdosAttackTimelineStats() {
        // basic
        HttpRequestDef.Builder<ShowDdosAttackTimelineStatsRequest, ShowDdosAttackTimelineStatsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDdosAttackTimelineStatsRequest.class,
                    ShowDdosAttackTimelineStatsResponse.class)
                .withName("ShowDdosAttackTimelineStats")
                .withUri("/v1/edgesec/stat/ddos-attack-timelines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDdosAttackTimelineStatsRequest::getEnterpriseProjectId,
                ShowDdosAttackTimelineStatsRequest::setEnterpriseProjectId));
        builder.<ShowDdosAttackTimelineStatsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDdosAttackTimelineStatsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowDdosAttackTimelineStatsRequest::getStatType,
                ShowDdosAttackTimelineStatsRequest::setStatType));
        builder.<ShowDdosAttackTimelineStatsRequest.GroupByEnum>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDdosAttackTimelineStatsRequest.GroupByEnum.class),
            f -> f.withMarshaller(ShowDdosAttackTimelineStatsRequest::getGroupBy,
                ShowDdosAttackTimelineStatsRequest::setGroupBy));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDdosAttackTimelineStatsRequest::getStartTime,
                ShowDdosAttackTimelineStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDdosAttackTimelineStatsRequest::getEndTime,
                ShowDdosAttackTimelineStatsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> applyHttpPolicy =
        genForApplyHttpPolicy();

    private static HttpRequestDef<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> genForApplyHttpPolicy() {
        // basic
        HttpRequestDef.Builder<ApplyHttpPolicyRequest, ApplyHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyHttpPolicyRequest.class, ApplyHttpPolicyResponse.class)
                .withName("ApplyHttpPolicy")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyHttpPolicyRequest::getPolicyId, ApplyHttpPolicyRequest::setPolicyId));
        builder.<ApplyHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyHttpPolicyRequestBody.class),
            f -> f.withMarshaller(ApplyHttpPolicyRequest::getBody, ApplyHttpPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse> createHttpAccessControlRule =
        genForCreateHttpAccessControlRule();

    private static HttpRequestDef<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse> genForCreateHttpAccessControlRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpAccessControlRuleRequest, CreateHttpAccessControlRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHttpAccessControlRuleRequest.class,
                    CreateHttpAccessControlRuleResponse.class)
                .withName("CreateHttpAccessControlRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/access-control-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpAccessControlRuleRequest::getPolicyId,
                CreateHttpAccessControlRuleRequest::setPolicyId));
        builder.<CreateHttpAccessControlRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpAccessControlRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpAccessControlRuleRequest::getBody,
                CreateHttpAccessControlRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse> createHttpGeoIpRule =
        genForCreateHttpGeoIpRule();

    private static HttpRequestDef<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse> genForCreateHttpGeoIpRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpGeoIpRuleRequest, CreateHttpGeoIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttpGeoIpRuleRequest.class, CreateHttpGeoIpRuleResponse.class)
                .withName("CreateHttpGeoIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/geoip-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpGeoIpRuleRequest::getPolicyId, CreateHttpGeoIpRuleRequest::setPolicyId));
        builder.<CreateHttpGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpGeoIpRuleRequest::getBody, CreateHttpGeoIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse> createHttpIgnoreRule =
        genForCreateHttpIgnoreRule();

    private static HttpRequestDef<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse> genForCreateHttpIgnoreRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpIgnoreRuleRequest, CreateHttpIgnoreRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateHttpIgnoreRuleRequest.class, CreateHttpIgnoreRuleResponse.class)
            .withName("CreateHttpIgnoreRule")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpIgnoreRuleRequest::getPolicyId, CreateHttpIgnoreRuleRequest::setPolicyId));
        builder.<CreateHttpIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpIgnoreRuleRequest::getBody, CreateHttpIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpPolicyRequest, CreateHttpPolicyResponse> createHttpPolicy =
        genForCreateHttpPolicy();

    private static HttpRequestDef<CreateHttpPolicyRequest, CreateHttpPolicyResponse> genForCreateHttpPolicy() {
        // basic
        HttpRequestDef.Builder<CreateHttpPolicyRequest, CreateHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttpPolicyRequest.class, CreateHttpPolicyResponse.class)
                .withName("CreateHttpPolicy")
                .withUri("/v1/edgesec/configuration/http/policies")
                .withContentType("application/json");

        // requests
        builder.<CreateHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHttpPolicyRequestBody.class),
            f -> f.withMarshaller(CreateHttpPolicyRequest::getBody, CreateHttpPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse> createHttpPunishmentRule =
        genForCreateHttpPunishmentRule();

    private static HttpRequestDef<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse> genForCreateHttpPunishmentRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpPunishmentRuleRequest, CreateHttpPunishmentRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateHttpPunishmentRuleRequest.class, CreateHttpPunishmentRuleResponse.class)
                .withName("CreateHttpPunishmentRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/punishment-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpPunishmentRuleRequest::getPolicyId,
                CreateHttpPunishmentRuleRequest::setPolicyId));
        builder.<CreateHttpPunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpPunishmentRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpPunishmentRuleRequest::getBody, CreateHttpPunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse> deleteHttpAccessControlRule =
        genForDeleteHttpAccessControlRule();

    private static HttpRequestDef<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse> genForDeleteHttpAccessControlRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpAccessControlRuleRequest, DeleteHttpAccessControlRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHttpAccessControlRuleRequest.class,
                    DeleteHttpAccessControlRuleResponse.class)
                .withName("DeleteHttpAccessControlRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/access-control-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpAccessControlRuleRequest::getPolicyId,
                DeleteHttpAccessControlRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpAccessControlRuleRequest::getRuleId,
                DeleteHttpAccessControlRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse> deleteHttpGeoIpRule =
        genForDeleteHttpGeoIpRule();

    private static HttpRequestDef<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse> genForDeleteHttpGeoIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpGeoIpRuleRequest, DeleteHttpGeoIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHttpGeoIpRuleRequest.class, DeleteHttpGeoIpRuleResponse.class)
            .withName("DeleteHttpGeoIpRule")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/geoip-rule/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpGeoIpRuleRequest::getPolicyId, DeleteHttpGeoIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpGeoIpRuleRequest::getRuleId, DeleteHttpGeoIpRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse> deleteHttpIgnoreRule =
        genForDeleteHttpIgnoreRule();

    private static HttpRequestDef<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse> genForDeleteHttpIgnoreRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpIgnoreRuleRequest, DeleteHttpIgnoreRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHttpIgnoreRuleRequest.class, DeleteHttpIgnoreRuleResponse.class)
            .withName("DeleteHttpIgnoreRule")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpIgnoreRuleRequest::getPolicyId, DeleteHttpIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpIgnoreRuleRequest::getRuleId, DeleteHttpIgnoreRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> deleteHttpPolicy =
        genForDeleteHttpPolicy();

    private static HttpRequestDef<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> genForDeleteHttpPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteHttpPolicyRequest, DeleteHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHttpPolicyRequest.class, DeleteHttpPolicyResponse.class)
                .withName("DeleteHttpPolicy")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpPolicyRequest::getPolicyId, DeleteHttpPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse> deleteHttpPunishmentRule =
        genForDeleteHttpPunishmentRule();

    private static HttpRequestDef<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse> genForDeleteHttpPunishmentRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpPunishmentRuleRequest, DeleteHttpPunishmentRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHttpPunishmentRuleRequest.class,
                    DeleteHttpPunishmentRuleResponse.class)
                .withName("DeleteHttpPunishmentRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/punishment-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpPunishmentRuleRequest::getPolicyId,
                DeleteHttpPunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpPunishmentRuleRequest::getRuleId,
                DeleteHttpPunishmentRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse> resetHttpIgnoreRule =
        genForResetHttpIgnoreRule();

    private static HttpRequestDef<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse> genForResetHttpIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ResetHttpIgnoreRuleRequest, ResetHttpIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetHttpIgnoreRuleRequest.class, ResetHttpIgnoreRuleResponse.class)
                .withName("ResetHttpIgnoreRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule/{rule_id}/recount")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetHttpIgnoreRuleRequest::getPolicyId, ResetHttpIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetHttpIgnoreRuleRequest::getRuleId, ResetHttpIgnoreRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse> showHttpAccessControlRule =
        genForShowHttpAccessControlRule();

    private static HttpRequestDef<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse> genForShowHttpAccessControlRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpAccessControlRuleRequest, ShowHttpAccessControlRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHttpAccessControlRuleRequest.class,
                    ShowHttpAccessControlRuleResponse.class)
                .withName("ShowHttpAccessControlRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/access-control-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAccessControlRuleRequest::getPolicyId,
                ShowHttpAccessControlRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAccessControlRuleRequest::getRuleId,
                ShowHttpAccessControlRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse> showHttpAccessControlRules =
        genForShowHttpAccessControlRules();

    private static HttpRequestDef<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse> genForShowHttpAccessControlRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpAccessControlRulesRequest, ShowHttpAccessControlRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHttpAccessControlRulesRequest.class,
                    ShowHttpAccessControlRulesResponse.class)
                .withName("ShowHttpAccessControlRules")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/access-control-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAccessControlRulesRequest::getPolicyId,
                ShowHttpAccessControlRulesRequest::setPolicyId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAccessControlRulesRequest::getName,
                ShowHttpAccessControlRulesRequest::setName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpAccessControlRulesRequest::getPage,
                ShowHttpAccessControlRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpAccessControlRulesRequest::getPagesize,
                ShowHttpAccessControlRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse> showHttpAttackDistributionStats =
        genForShowHttpAttackDistributionStats();

    private static HttpRequestDef<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse> genForShowHttpAttackDistributionStats() {
        // basic
        HttpRequestDef.Builder<ShowHttpAttackDistributionStatsRequest, ShowHttpAttackDistributionStatsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHttpAttackDistributionStatsRequest.class,
                    ShowHttpAttackDistributionStatsResponse.class)
                .withName("ShowHttpAttackDistributionStats")
                .withUri("/v1/edgesec/stat/http-attack-distribution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getEnterpriseProjectId,
                ShowHttpAttackDistributionStatsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getDomainName,
                ShowHttpAttackDistributionStatsRequest::setDomainName));
        builder.<ShowHttpAttackDistributionStatsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackDistributionStatsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getStatType,
                ShowHttpAttackDistributionStatsRequest::setStatType));
        builder.<ShowHttpAttackDistributionStatsRequest.GroupByEnum>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackDistributionStatsRequest.GroupByEnum.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getGroupBy,
                ShowHttpAttackDistributionStatsRequest::setGroupBy));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getStartTime,
                ShowHttpAttackDistributionStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackDistributionStatsRequest::getEndTime,
                ShowHttpAttackDistributionStatsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse> showHttpAttackTimelineStats =
        genForShowHttpAttackTimelineStats();

    private static HttpRequestDef<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse> genForShowHttpAttackTimelineStats() {
        // basic
        HttpRequestDef.Builder<ShowHttpAttackTimelineStatsRequest, ShowHttpAttackTimelineStatsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHttpAttackTimelineStatsRequest.class,
                    ShowHttpAttackTimelineStatsResponse.class)
                .withName("ShowHttpAttackTimelineStats")
                .withUri("/v1/edgesec/stat/http-attack-timelines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getEnterpriseProjectId,
                ShowHttpAttackTimelineStatsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getDomainName,
                ShowHttpAttackTimelineStatsRequest::setDomainName));
        builder.<ShowHttpAttackTimelineStatsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackTimelineStatsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getStatType,
                ShowHttpAttackTimelineStatsRequest::setStatType));
        builder.<ShowHttpAttackTimelineStatsRequest.GroupByEnum>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackTimelineStatsRequest.GroupByEnum.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getGroupBy,
                ShowHttpAttackTimelineStatsRequest::setGroupBy));
        builder.<String>withRequestField("group_by_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getGroupByValue,
                ShowHttpAttackTimelineStatsRequest::setGroupByValue));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getInterval,
                ShowHttpAttackTimelineStatsRequest::setInterval));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getStartTime,
                ShowHttpAttackTimelineStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackTimelineStatsRequest::getEndTime,
                ShowHttpAttackTimelineStatsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse> showHttpAttackTopStats =
        genForShowHttpAttackTopStats();

    private static HttpRequestDef<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse> genForShowHttpAttackTopStats() {
        // basic
        HttpRequestDef.Builder<ShowHttpAttackTopStatsRequest, ShowHttpAttackTopStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHttpAttackTopStatsRequest.class, ShowHttpAttackTopStatsResponse.class)
            .withName("ShowHttpAttackTopStats")
            .withUri("/v1/edgesec/stat/http-attack-top")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getEnterpriseProjectId,
                ShowHttpAttackTopStatsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getDomainName,
                ShowHttpAttackTopStatsRequest::setDomainName));
        builder.<ShowHttpAttackTopStatsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackTopStatsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getStatType,
                ShowHttpAttackTopStatsRequest::setStatType));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getGroupBy,
                ShowHttpAttackTopStatsRequest::setGroupBy));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getLimit, ShowHttpAttackTopStatsRequest::setLimit));
        builder.<ShowHttpAttackTopStatsRequest.TimeTypeEnum>withRequestField("time_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowHttpAttackTopStatsRequest.TimeTypeEnum.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getTimeType,
                ShowHttpAttackTopStatsRequest::setTimeType));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getStartTime,
                ShowHttpAttackTopStatsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHttpAttackTopStatsRequest::getEndTime,
                ShowHttpAttackTopStatsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse> showHttpGeoIpRule =
        genForShowHttpGeoIpRule();

    private static HttpRequestDef<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse> genForShowHttpGeoIpRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpGeoIpRuleRequest, ShowHttpGeoIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpGeoIpRuleRequest.class, ShowHttpGeoIpRuleResponse.class)
                .withName("ShowHttpGeoIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/geoip-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpGeoIpRuleRequest::getPolicyId, ShowHttpGeoIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpGeoIpRuleRequest::getRuleId, ShowHttpGeoIpRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse> showHttpGeoIpRules =
        genForShowHttpGeoIpRules();

    private static HttpRequestDef<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse> genForShowHttpGeoIpRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpGeoIpRulesRequest, ShowHttpGeoIpRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpGeoIpRulesRequest.class, ShowHttpGeoIpRulesResponse.class)
                .withName("ShowHttpGeoIpRules")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/geoip-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpGeoIpRulesRequest::getPolicyId, ShowHttpGeoIpRulesRequest::setPolicyId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpGeoIpRulesRequest::getPage, ShowHttpGeoIpRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpGeoIpRulesRequest::getPagesize, ShowHttpGeoIpRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse> showHttpIgnoreRule =
        genForShowHttpIgnoreRule();

    private static HttpRequestDef<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse> genForShowHttpIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpIgnoreRuleRequest, ShowHttpIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpIgnoreRuleRequest.class, ShowHttpIgnoreRuleResponse.class)
                .withName("ShowHttpIgnoreRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIgnoreRuleRequest::getPolicyId, ShowHttpIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIgnoreRuleRequest::getRuleId, ShowHttpIgnoreRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse> showHttpIgnoreRules =
        genForShowHttpIgnoreRules();

    private static HttpRequestDef<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse> genForShowHttpIgnoreRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpIgnoreRulesRequest, ShowHttpIgnoreRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpIgnoreRulesRequest.class, ShowHttpIgnoreRulesResponse.class)
                .withName("ShowHttpIgnoreRules")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIgnoreRulesRequest::getPolicyId, ShowHttpIgnoreRulesRequest::setPolicyId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpIgnoreRulesRequest::getStatus, ShowHttpIgnoreRulesRequest::setStatus));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpIgnoreRulesRequest::getPage, ShowHttpIgnoreRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpIgnoreRulesRequest::getPagesize, ShowHttpIgnoreRulesRequest::setPagesize));
        builder.<String>withRequestField("rule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIgnoreRulesRequest::getRule, ShowHttpIgnoreRulesRequest::setRule));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> showHttpPolicies =
        genForShowHttpPolicies();

    private static HttpRequestDef<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> genForShowHttpPolicies() {
        // basic
        HttpRequestDef.Builder<ShowHttpPoliciesRequest, ShowHttpPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpPoliciesRequest.class, ShowHttpPoliciesResponse.class)
                .withName("ShowHttpPolicies")
                .withUri("/v1/edgesec/configuration/http/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getEnterpriseProjectId,
                ShowHttpPoliciesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getPage, ShowHttpPoliciesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getPagesize, ShowHttpPoliciesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getName, ShowHttpPoliciesRequest::setName));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPoliciesRequest::getHostname, ShowHttpPoliciesRequest::setHostname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpPolicyRequest, ShowHttpPolicyResponse> showHttpPolicy =
        genForShowHttpPolicy();

    private static HttpRequestDef<ShowHttpPolicyRequest, ShowHttpPolicyResponse> genForShowHttpPolicy() {
        // basic
        HttpRequestDef.Builder<ShowHttpPolicyRequest, ShowHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpPolicyRequest.class, ShowHttpPolicyResponse.class)
                .withName("ShowHttpPolicy")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPolicyRequest::getPolicyId, ShowHttpPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse> showHttpPunishmentRule =
        genForShowHttpPunishmentRule();

    private static HttpRequestDef<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse> genForShowHttpPunishmentRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpPunishmentRuleRequest, ShowHttpPunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHttpPunishmentRuleRequest.class, ShowHttpPunishmentRuleResponse.class)
            .withName("ShowHttpPunishmentRule")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/punishment-rule/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPunishmentRuleRequest::getPolicyId,
                ShowHttpPunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPunishmentRuleRequest::getRuleId, ShowHttpPunishmentRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse> showHttpPunishmentRules =
        genForShowHttpPunishmentRules();

    private static HttpRequestDef<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse> genForShowHttpPunishmentRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpPunishmentRulesRequest, ShowHttpPunishmentRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHttpPunishmentRulesRequest.class, ShowHttpPunishmentRulesResponse.class)
            .withName("ShowHttpPunishmentRules")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/punishment-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpPunishmentRulesRequest::getPolicyId,
                ShowHttpPunishmentRulesRequest::setPolicyId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPunishmentRulesRequest::getPage, ShowHttpPunishmentRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpPunishmentRulesRequest::getPagesize,
                ShowHttpPunishmentRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse> updateHttpAccessControlRule =
        genForUpdateHttpAccessControlRule();

    private static HttpRequestDef<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse> genForUpdateHttpAccessControlRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpAccessControlRuleRequest, UpdateHttpAccessControlRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHttpAccessControlRuleRequest.class,
                    UpdateHttpAccessControlRuleResponse.class)
                .withName("UpdateHttpAccessControlRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/access-control-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpAccessControlRuleRequest::getPolicyId,
                UpdateHttpAccessControlRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpAccessControlRuleRequest::getRuleId,
                UpdateHttpAccessControlRuleRequest::setRuleId));
        builder.<UpdateHttpAccessControlRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpAccessControlRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpAccessControlRuleRequest::getBody,
                UpdateHttpAccessControlRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse> updateHttpGeoIpRule =
        genForUpdateHttpGeoIpRule();

    private static HttpRequestDef<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse> genForUpdateHttpGeoIpRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpGeoIpRuleRequest, UpdateHttpGeoIpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpGeoIpRuleRequest.class, UpdateHttpGeoIpRuleResponse.class)
                .withName("UpdateHttpGeoIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/geoip-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpGeoIpRuleRequest::getPolicyId, UpdateHttpGeoIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpGeoIpRuleRequest::getRuleId, UpdateHttpGeoIpRuleRequest::setRuleId));
        builder.<UpdateHttpGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpGeoIpRuleRequest::getBody, UpdateHttpGeoIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse> updateHttpIgnoreRule =
        genForUpdateHttpIgnoreRule();

    private static HttpRequestDef<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse> genForUpdateHttpIgnoreRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpIgnoreRuleRequest, UpdateHttpIgnoreRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHttpIgnoreRuleRequest.class, UpdateHttpIgnoreRuleResponse.class)
            .withName("UpdateHttpIgnoreRule")
            .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/ignore-rule/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpIgnoreRuleRequest::getPolicyId, UpdateHttpIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpIgnoreRuleRequest::getRuleId, UpdateHttpIgnoreRuleRequest::setRuleId));
        builder.<UpdateHttpIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpIgnoreRuleRequest::getBody, UpdateHttpIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> updateHttpPolicy =
        genForUpdateHttpPolicy();

    private static HttpRequestDef<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> genForUpdateHttpPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateHttpPolicyRequest, UpdateHttpPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpPolicyRequest.class, UpdateHttpPolicyResponse.class)
                .withName("UpdateHttpPolicy")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRequest::getPolicyId, UpdateHttpPolicyRequest::setPolicyId));
        builder.<UpdateHttpPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateHttpPolicyRequest::getBody, UpdateHttpPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> updateHttpPolicyRuleStatus =
        genForUpdateHttpPolicyRuleStatus();

    private static HttpRequestDef<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> genForUpdateHttpPolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHttpPolicyRuleStatusRequest, UpdateHttpPolicyRuleStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHttpPolicyRuleStatusRequest.class,
                    UpdateHttpPolicyRuleStatusResponse.class)
                .withName("UpdateHttpPolicyRuleStatus")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/{rule_type}/{rule_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getPolicyId,
                UpdateHttpPolicyRuleStatusRequest::setPolicyId));
        builder.<String>withRequestField("rule_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getRuleType,
                UpdateHttpPolicyRuleStatusRequest::setRuleType));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getRuleId,
                UpdateHttpPolicyRuleStatusRequest::setRuleId));
        builder.<UpdateHttpPolicyRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpPolicyRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHttpPolicyRuleStatusRequest::getBody,
                UpdateHttpPolicyRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse> updateHttpPunishmentRule =
        genForUpdateHttpPunishmentRule();

    private static HttpRequestDef<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse> genForUpdateHttpPunishmentRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpPunishmentRuleRequest, UpdateHttpPunishmentRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateHttpPunishmentRuleRequest.class, UpdateHttpPunishmentRuleResponse.class)
                .withName("UpdateHttpPunishmentRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/punishment-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPunishmentRuleRequest::getPolicyId,
                UpdateHttpPunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpPunishmentRuleRequest::getRuleId,
                UpdateHttpPunishmentRuleRequest::setRuleId));
        builder.<UpdateHttpPunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpPunishmentRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpPunishmentRuleRequest::getBody, UpdateHttpPunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse> createHttpCcRule =
        genForCreateHttpCcRule();

    private static HttpRequestDef<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse> genForCreateHttpCcRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpCcRuleRequest, CreateHttpCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttpCcRuleRequest.class, CreateHttpCcRuleResponse.class)
                .withName("CreateHttpCcRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/cc-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpCcRuleRequest::getPolicyId, CreateHttpCcRuleRequest::setPolicyId));
        builder.<CreateHttpCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpCcRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpCcRuleRequest::getBody, CreateHttpCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse> deleteHttpCcRule =
        genForDeleteHttpCcRule();

    private static HttpRequestDef<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse> genForDeleteHttpCcRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpCcRuleRequest, DeleteHttpCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHttpCcRuleRequest.class, DeleteHttpCcRuleResponse.class)
                .withName("DeleteHttpCcRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/cc-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpCcRuleRequest::getPolicyId, DeleteHttpCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpCcRuleRequest::getRuleId, DeleteHttpCcRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse> showHttpCcRule =
        genForShowHttpCcRule();

    private static HttpRequestDef<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse> genForShowHttpCcRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpCcRuleRequest, ShowHttpCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpCcRuleRequest.class, ShowHttpCcRuleResponse.class)
                .withName("ShowHttpCcRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/cc-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpCcRuleRequest::getPolicyId, ShowHttpCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpCcRuleRequest::getRuleId, ShowHttpCcRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse> showHttpCcRules =
        genForShowHttpCcRules();

    private static HttpRequestDef<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse> genForShowHttpCcRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpCcRulesRequest, ShowHttpCcRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpCcRulesRequest.class, ShowHttpCcRulesResponse.class)
                .withName("ShowHttpCcRules")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/cc-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpCcRulesRequest::getPolicyId, ShowHttpCcRulesRequest::setPolicyId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpCcRulesRequest::getName, ShowHttpCcRulesRequest::setName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpCcRulesRequest::getPage, ShowHttpCcRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpCcRulesRequest::getPagesize, ShowHttpCcRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse> updateHttpCcRule =
        genForUpdateHttpCcRule();

    private static HttpRequestDef<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse> genForUpdateHttpCcRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpCcRuleRequest, UpdateHttpCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpCcRuleRequest.class, UpdateHttpCcRuleResponse.class)
                .withName("UpdateHttpCcRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/cc-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpCcRuleRequest::getPolicyId, UpdateHttpCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpCcRuleRequest::getRuleId, UpdateHttpCcRuleRequest::setRuleId));
        builder.<UpdateHttpCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpCcRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpCcRuleRequest::getBody, UpdateHttpCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse> createHttpBlockTrustIpRule =
        genForCreateHttpBlockTrustIpRule();

    private static HttpRequestDef<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse> genForCreateHttpBlockTrustIpRule() {
        // basic
        HttpRequestDef.Builder<CreateHttpBlockTrustIpRuleRequest, CreateHttpBlockTrustIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHttpBlockTrustIpRuleRequest.class,
                    CreateHttpBlockTrustIpRuleResponse.class)
                .withName("CreateHttpBlockTrustIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/blocktrustip-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttpBlockTrustIpRuleRequest::getPolicyId,
                CreateHttpBlockTrustIpRuleRequest::setPolicyId));
        builder.<CreateHttpBlockTrustIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHttpBlockTrustIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateHttpBlockTrustIpRuleRequest::getBody,
                CreateHttpBlockTrustIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse> deleteHttpBlockTrustIpRule =
        genForDeleteHttpBlockTrustIpRule();

    private static HttpRequestDef<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse> genForDeleteHttpBlockTrustIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteHttpBlockTrustIpRuleRequest, DeleteHttpBlockTrustIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteHttpBlockTrustIpRuleRequest.class,
                    DeleteHttpBlockTrustIpRuleResponse.class)
                .withName("DeleteHttpBlockTrustIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/blocktrustip-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpBlockTrustIpRuleRequest::getPolicyId,
                DeleteHttpBlockTrustIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpBlockTrustIpRuleRequest::getRuleId,
                DeleteHttpBlockTrustIpRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse> showHttpBlockTrustIpRule =
        genForShowHttpBlockTrustIpRule();

    private static HttpRequestDef<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse> genForShowHttpBlockTrustIpRule() {
        // basic
        HttpRequestDef.Builder<ShowHttpBlockTrustIpRuleRequest, ShowHttpBlockTrustIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHttpBlockTrustIpRuleRequest.class, ShowHttpBlockTrustIpRuleResponse.class)
                .withName("ShowHttpBlockTrustIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/blocktrustip-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRuleRequest::getPolicyId,
                ShowHttpBlockTrustIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRuleRequest::getRuleId,
                ShowHttpBlockTrustIpRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse> showHttpBlockTrustIpRules =
        genForShowHttpBlockTrustIpRules();

    private static HttpRequestDef<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse> genForShowHttpBlockTrustIpRules() {
        // basic
        HttpRequestDef.Builder<ShowHttpBlockTrustIpRulesRequest, ShowHttpBlockTrustIpRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHttpBlockTrustIpRulesRequest.class,
                    ShowHttpBlockTrustIpRulesResponse.class)
                .withName("ShowHttpBlockTrustIpRules")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/blocktrustip-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRulesRequest::getPolicyId,
                ShowHttpBlockTrustIpRulesRequest::setPolicyId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRulesRequest::getName,
                ShowHttpBlockTrustIpRulesRequest::setName));
        builder.<String>withRequestField("addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRulesRequest::getAddr,
                ShowHttpBlockTrustIpRulesRequest::setAddr));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRulesRequest::getPage,
                ShowHttpBlockTrustIpRulesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpBlockTrustIpRulesRequest::getPagesize,
                ShowHttpBlockTrustIpRulesRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse> updateHttpBlockTrustIpRule =
        genForUpdateHttpBlockTrustIpRule();

    private static HttpRequestDef<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse> genForUpdateHttpBlockTrustIpRule() {
        // basic
        HttpRequestDef.Builder<UpdateHttpBlockTrustIpRuleRequest, UpdateHttpBlockTrustIpRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHttpBlockTrustIpRuleRequest.class,
                    UpdateHttpBlockTrustIpRuleResponse.class)
                .withName("UpdateHttpBlockTrustIpRule")
                .withUri("/v1/edgesec/configuration/http/policies/{policy_id}/blocktrustip-rule/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpBlockTrustIpRuleRequest::getPolicyId,
                UpdateHttpBlockTrustIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpBlockTrustIpRuleRequest::getRuleId,
                UpdateHttpBlockTrustIpRuleRequest::setRuleId));
        builder.<UpdateHttpBlockTrustIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHttpBlockTrustIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateHttpBlockTrustIpRuleRequest::getBody,
                UpdateHttpBlockTrustIpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse> createHttpIpGroup =
        genForCreateHttpIpGroup();

    private static HttpRequestDef<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse> genForCreateHttpIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateHttpIpGroupRequest, CreateHttpIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttpIpGroupRequest.class, CreateHttpIpGroupResponse.class)
                .withName("CreateHttpIpGroup")
                .withUri("/v1/edgesec/configuration/http/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateHttpIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHttpIpGroupRequestBody.class),
            f -> f.withMarshaller(CreateHttpIpGroupRequest::getBody, CreateHttpIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse> deleteHttpIpGroup =
        genForDeleteHttpIpGroup();

    private static HttpRequestDef<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse> genForDeleteHttpIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteHttpIpGroupRequest, DeleteHttpIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHttpIpGroupRequest.class, DeleteHttpIpGroupResponse.class)
                .withName("DeleteHttpIpGroup")
                .withUri("/v1/edgesec/configuration/http/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttpIpGroupRequest::getIpGroupId, DeleteHttpIpGroupRequest::setIpGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse> showHttpIpGroup =
        genForShowHttpIpGroup();

    private static HttpRequestDef<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse> genForShowHttpIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowHttpIpGroupRequest, ShowHttpIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpIpGroupRequest.class, ShowHttpIpGroupResponse.class)
                .withName("ShowHttpIpGroup")
                .withUri("/v1/edgesec/configuration/http/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIpGroupRequest::getIpGroupId, ShowHttpIpGroupRequest::setIpGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse> showHttpIpGroups =
        genForShowHttpIpGroups();

    private static HttpRequestDef<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse> genForShowHttpIpGroups() {
        // basic
        HttpRequestDef.Builder<ShowHttpIpGroupsRequest, ShowHttpIpGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpIpGroupsRequest.class, ShowHttpIpGroupsResponse.class)
                .withName("ShowHttpIpGroups")
                .withUri("/v1/edgesec/configuration/http/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIpGroupsRequest::getEnterpriseProjectId,
                ShowHttpIpGroupsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpIpGroupsRequest::getPage, ShowHttpIpGroupsRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHttpIpGroupsRequest::getPagesize, ShowHttpIpGroupsRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIpGroupsRequest::getName, ShowHttpIpGroupsRequest::setName));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpIpGroupsRequest::getIp, ShowHttpIpGroupsRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse> updateHttpIpGroup =
        genForUpdateHttpIpGroup();

    private static HttpRequestDef<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse> genForUpdateHttpIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateHttpIpGroupRequest, UpdateHttpIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpIpGroupRequest.class, UpdateHttpIpGroupResponse.class)
                .withName("UpdateHttpIpGroup")
                .withUri("/v1/edgesec/configuration/http/ip-groups/{ip_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ip_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpIpGroupRequest::getIpGroupId, UpdateHttpIpGroupRequest::setIpGroupId));
        builder.<UpdateHttpIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHttpIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateHttpIpGroupRequest::getBody, UpdateHttpIpGroupRequest::setBody));

        // response

        return builder.build();
    }

}

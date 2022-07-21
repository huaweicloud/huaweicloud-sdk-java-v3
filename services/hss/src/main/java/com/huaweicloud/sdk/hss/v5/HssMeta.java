package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hss.v5.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class HssMeta {

    public static final HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> listHostStatus =
        genForlistHostStatus();

    private static HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> genForlistHostStatus() {
        // basic
        HttpRequestDef.Builder<ListHostStatusRequest, ListHostStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostStatusRequest.class, ListHostStatusResponse.class)
                .withName("ListHostStatus")
                .withUri("/v5/{project_id}/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentStatus, (req, v) -> {
                req.setAgentStatus(v);
            }));
        builder.<String>withRequestField("detect_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getDetectResult, (req, v) -> {
                req.setDetectResult(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostStatus, (req, v) -> {
                req.setHostStatus(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPublicIp, (req, v) -> {
                req.setPublicIp(v);
            }));
        builder.<String>withRequestField("ip_addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getIpAddr, (req, v) -> {
                req.setIpAddr(v);
            }));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("policy_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupId, (req, v) -> {
                req.setPolicyGroupId(v);
            }));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupName, (req, v) -> {
                req.setPolicyGroupName(v);
            }));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            }));
        builder.<Boolean>withRequestField("refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRefresh, (req, v) -> {
                req.setRefresh(v);
            }));
        builder.<Boolean>withRequestField("above_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAboveVersion, (req, v) -> {
                req.setAboveVersion(v);
            }));
        builder.<Boolean>withRequestField("outside_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOutsideHost, (req, v) -> {
                req.setOutsideHost(v);
            }));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAssetValue, (req, v) -> {
                req.setAssetValue(v);
            }));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexity =
        genForlistPasswordComplexity();

    private static HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> genForlistPasswordComplexity() {
        // basic
        HttpRequestDef.Builder<ListPasswordComplexityRequest, ListPasswordComplexityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPasswordComplexityRequest.class, ListPasswordComplexityResponse.class)
            .withName("ListPasswordComplexity")
            .withUri("/v5/{project_id}/baseline/password-complexity")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRules =
        genForlistRiskConfigCheckRules();

    private static HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> genForlistRiskConfigCheckRules() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRiskConfigCheckRulesRequest.class, ListRiskConfigCheckRulesResponse.class)
                .withName("ListRiskConfigCheckRules")
                .withUri("/v5/{project_id}/baseline/risk-config/{check_type}/check-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getResultType, (req, v) -> {
                req.setResultType(v);
            }));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckRuleName, (req, v) -> {
                req.setCheckRuleName(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHosts =
        genForlistRiskConfigHosts();

    private static HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> genForlistRiskConfigHosts() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskConfigHostsRequest.class, ListRiskConfigHostsResponse.class)
                .withName("ListRiskConfigHosts")
                .withUri("/v5/{project_id}/baseline/risk-config/{check_type}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigs =
        genForlistRiskConfigs();

    private static HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> genForlistRiskConfigs() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigsRequest, ListRiskConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskConfigsRequest.class, ListRiskConfigsResponse.class)
                .withName("ListRiskConfigs")
                .withUri("/v5/{project_id}/baseline/risk-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEvents =
        genForlistSecurityEvents();

    private static HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> genForlistSecurityEvents() {
        // basic
        HttpRequestDef.Builder<ListSecurityEventsRequest, ListSecurityEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityEventsRequest.class, ListSecurityEventsResponse.class)
                .withName("ListSecurityEvents")
                .withUri("/v5/{project_id}/event/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLastDays, (req, v) -> {
                req.setLastDays(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getContainerName, (req, v) -> {
                req.setContainerName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<Integer>>withRequestField("event_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventTypes, (req, v) -> {
                req.setEventTypes(v);
            }));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHandleStatus, (req, v) -> {
                req.setHandleStatus(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilities =
        genForlistVulnerabilities();

    private static HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> genForlistVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulnerabilitiesRequest.class, ListVulnerabilitiesResponse.class)
                .withName("ListVulnerabilities")
                .withUri("/v5/{project_id}/vulnerability/vulnerabilities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulId, (req, v) -> {
                req.setVulId(v);
            }));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulName, (req, v) -> {
                req.setVulName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsers =
        genForlistWeakPasswordUsers();

    private static HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> genForlistWeakPasswordUsers() {
        // basic
        HttpRequestDef.Builder<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWeakPasswordUsersRequest.class, ListWeakPasswordUsersResponse.class)
            .withName("ListWeakPasswordUsers")
            .withUri("/v5/{project_id}/baseline/weak-password-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetail =
        genForshowCheckRuleDetail();

    private static HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> genForshowCheckRuleDetail() {
        // basic
        HttpRequestDef.Builder<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckRuleDetailRequest.class, ShowCheckRuleDetailResponse.class)
                .withName("ShowCheckRuleDetail")
                .withUri("/v5/{project_id}/baseline/check-rule/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckRuleId, (req, v) -> {
                req.setCheckRuleId(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetail =
        genForshowRiskConfigDetail();

    private static HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> genForshowRiskConfigDetail() {
        // basic
        HttpRequestDef.Builder<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRiskConfigDetailRequest.class, ShowRiskConfigDetailResponse.class)
            .withName("ShowRiskConfigDetail")
            .withUri("/v5/{project_id}/baseline/risk-config/{check_type}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

}

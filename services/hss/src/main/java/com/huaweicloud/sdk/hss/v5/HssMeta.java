package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanPrivateImageRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.CloseProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostProtectHistoryInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostProtectHistoryInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostRaspProtectHistoryInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostRaspProtectHistoryInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerResponse;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class HssMeta {

    public static final HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroup =
        genForaddHostsGroup();

    private static HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> genForaddHostsGroup() {
        // basic
        HttpRequestDef.Builder<AddHostsGroupRequest, AddHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddHostsGroupRequest.class, AddHostsGroupResponse.class)
                .withName("AddHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<AddHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddHostsGroupRequestInfo.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroup =
        genForassociatePolicyGroup();

    private static HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> genForassociatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociatePolicyGroupRequest.class, AssociatePolicyGroupResponse.class)
            .withName("AssociatePolicyGroup")
            .withUri("/v5/{project_id}/policy/deploy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<AssociatePolicyGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePolicyGroupRequestInfo.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForbatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForbatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateTagsRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequestInfo.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> batchScanSwrImage =
        genForbatchScanSwrImage();

    private static HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> genForbatchScanSwrImage() {
        // basic
        HttpRequestDef.Builder<BatchScanSwrImageRequest, BatchScanSwrImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchScanSwrImageRequest.class, BatchScanSwrImageResponse.class)
                .withName("BatchScanSwrImage")
                .withUri("/v5/{project_id}/image/batch-scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<BatchScanPrivateImageRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchScanPrivateImageRequestInfo.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> changeBlockedIp =
        genForchangeBlockedIp();

    private static HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> genForchangeBlockedIp() {
        // basic
        HttpRequestDef.Builder<ChangeBlockedIpRequest, ChangeBlockedIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeBlockedIpRequest.class, ChangeBlockedIpResponse.class)
                .withName("ChangeBlockedIp")
                .withUri("/v5/{project_id}/event/blocked-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<ChangeBlockedIpRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeBlockedIpRequestInfo.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEventRequest, ChangeEventResponse> changeEvent = genForchangeEvent();

    private static HttpRequestDef<ChangeEventRequest, ChangeEventResponse> genForchangeEvent() {
        // basic
        HttpRequestDef.Builder<ChangeEventRequest, ChangeEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeEventRequest.class, ChangeEventResponse.class)
                .withName("ChangeEvent")
                .withUri("/v5/{project_id}/event/operate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerName, (req, v) -> {
                req.setContainerName(v);
            }));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerId, (req, v) -> {
                req.setContainerId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<ChangeEventRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeEventRequestInfo.class),
            f -> f.withMarshaller(ChangeEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroup =
        genForchangeHostsGroup();

    private static HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> genForchangeHostsGroup() {
        // basic
        HttpRequestDef.Builder<ChangeHostsGroupRequest, ChangeHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeHostsGroupRequest.class, ChangeHostsGroupResponse.class)
                .withName("ChangeHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<ChangeHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeHostsGroupRequestInfo.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> changeIsolatedFile =
        genForchangeIsolatedFile();

    private static HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> genForchangeIsolatedFile() {
        // basic
        HttpRequestDef.Builder<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeIsolatedFileRequest.class, ChangeIsolatedFileResponse.class)
                .withName("ChangeIsolatedFile")
                .withUri("/v5/{project_id}/event/isolated-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<ChangeIsolatedFileRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIsolatedFileRequestInfo.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> changeVulScanPolicy =
        genForchangeVulScanPolicy();

    private static HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> genForchangeVulScanPolicy() {
        // basic
        HttpRequestDef.Builder<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeVulScanPolicyRequest.class, ChangeVulScanPolicyResponse.class)
                .withName("ChangeVulScanPolicy")
                .withUri("/v5/{project_id}/vulnerability/scan-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ChangeVulScanPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulScanPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatus =
        genForchangeVulStatus();

    private static HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> genForchangeVulStatus() {
        // basic
        HttpRequestDef.Builder<ChangeVulStatusRequest, ChangeVulStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeVulStatusRequest.class, ChangeVulStatusResponse.class)
                .withName("ChangeVulStatus")
                .withUri("/v5/{project_id}/vulnerability/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeVulStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ChangeVulStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulStatusRequestInfo.class),
            f -> f.withMarshaller(ChangeVulStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroup =
        genFordeleteHostsGroup();

    private static HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> genFordeleteHostsGroup() {
        // basic
        HttpRequestDef.Builder<DeleteHostsGroupRequest, DeleteHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostsGroupRequest.class, DeleteHostsGroupResponse.class)
                .withName("DeleteHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTag =
        genFordeleteResourceInstanceTag();

    private static HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> genFordeleteResourceInstanceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteResourceInstanceTagRequest.class,
                    DeleteResourceInstanceTagResponse.class)
                .withName("DeleteResourceInstanceTag")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteList =
        genForlistAlarmWhiteList();

    private static HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> genForlistAlarmWhiteList() {
        // basic
        HttpRequestDef.Builder<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmWhiteListRequest.class, ListAlarmWhiteListResponse.class)
                .withName("ListAlarmWhiteList")
                .withUri("/v5/{project_id}/event/white-list/alarm")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getHash, (req, v) -> {
                req.setHash(v);
            }));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistories =
        genForlistAppChangeHistories();

    private static HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> genForlistAppChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppChangeHistoriesRequest.class, ListAppChangeHistoriesResponse.class)
            .withName("ListAppChangeHistories")
            .withUri("/v5/{project_id}/asset/app/change-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getVariationType, (req, v) -> {
                req.setVariationType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatistics =
        genForlistAppStatistics();

    private static HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> genForlistAppStatistics() {
        // basic
        HttpRequestDef.Builder<ListAppStatisticsRequest, ListAppStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppStatisticsRequest.class, ListAppStatisticsResponse.class)
                .withName("ListAppStatistics")
                .withUri("/v5/{project_id}/asset/app/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v5/{project_id}/asset/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("install_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getInstallDir, (req, v) -> {
                req.setInstallDir(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistories =
        genForlistAutoLaunchChangeHistories();

    private static HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> genForlistAutoLaunchChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAutoLaunchChangeHistoriesRequest.class,
                    ListAutoLaunchChangeHistoriesResponse.class)
                .withName("ListAutoLaunchChangeHistories")
                .withUri("/v5/{project_id}/asset/auto-launch/change-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("auto_launch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getAutoLaunchName, (req, v) -> {
                req.setAutoLaunchName(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getVariationType, (req, v) -> {
                req.setVariationType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatistics =
        genForlistAutoLaunchStatistics();

    private static HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> genForlistAutoLaunchStatistics() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAutoLaunchStatisticsRequest.class, ListAutoLaunchStatisticsResponse.class)
                .withName("ListAutoLaunchStatistics")
                .withUri("/v5/{project_id}/asset/auto-launch/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchs =
        genForlistAutoLaunchs();

    private static HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> genForlistAutoLaunchs() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchsRequest, ListAutoLaunchsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAutoLaunchsRequest.class, ListAutoLaunchsResponse.class)
                .withName("ListAutoLaunchs")
                .withUri("/v5/{project_id}/asset/auto-launchs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> listBlockedIp =
        genForlistBlockedIp();

    private static HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> genForlistBlockedIp() {
        // basic
        HttpRequestDef.Builder<ListBlockedIpRequest, ListBlockedIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlockedIpRequest.class, ListBlockedIpResponse.class)
                .withName("ListBlockedIp")
                .withUri("/v5/{project_id}/event/blocked-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLastDays, (req, v) -> {
                req.setLastDays(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<String>withRequestField("intercept_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getInterceptStatus, (req, v) -> {
                req.setInterceptStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodes =
        genForlistContainerNodes();

    private static HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> genForlistContainerNodes() {
        // basic
        HttpRequestDef.Builder<ListContainerNodesRequest, ListContainerNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainerNodesRequest.class, ListContainerNodesResponse.class)
                .withName("ListContainerNodes")
                .withUri("/v5/{project_id}/container/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getAgentStatus, (req, v) -> {
                req.setAgentStatus(v);
            }));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups =
        genForlistHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForlistHostGroups() {
        // basic
        HttpRequestDef.Builder<ListHostGroupsRequest, ListHostGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostGroupsRequest.class, ListHostGroupsResponse.class)
                .withName("ListHostGroups")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfo =
        genForlistHostProtectHistoryInfo();

    private static HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> genForlistHostProtectHistoryInfo() {
        // basic
        HttpRequestDef.Builder<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHostProtectHistoryInfoRequest.class,
                    ListHostProtectHistoryInfoResponse.class)
                .withName("ListHostProtectHistoryInfo")
                .withUri("/v5/{project_id}/webtamper/static/protect-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFilePath, (req, v) -> {
                req.setFilePath(v);
            }));
        builder.<String>withRequestField("file_operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFileOperation, (req, v) -> {
                req.setFileOperation(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfo =
        genForlistHostRaspProtectHistoryInfo();

    private static HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> genForlistHostRaspProtectHistoryInfo() {
        // basic
        HttpRequestDef.Builder<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHostRaspProtectHistoryInfoRequest.class,
                    ListHostRaspProtectHistoryInfoResponse.class)
                .withName("ListHostRaspProtectHistoryInfo")
                .withUri("/v5/{project_id}/webtamper/rasp/protect-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getAlarmLevel, (req, v) -> {
                req.setAlarmLevel(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

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
        builder.<Boolean>withRequestField("has_intrusion",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHasIntrusion, (req, v) -> {
                req.setHasIntrusion(v);
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
        builder.<String>withRequestField("server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getServerGroup, (req, v) -> {
                req.setServerGroup(v);
            }));
        builder.<Boolean>withRequestField("agent_upgradable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentUpgradable, (req, v) -> {
                req.setAgentUpgradable(v);
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

    public static final HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> listHostVuls = genForlistHostVuls();

    private static HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> genForlistHostVuls() {
        // basic
        HttpRequestDef.Builder<ListHostVulsRequest, ListHostVulsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostVulsRequest.class, ListHostVulsResponse.class)
                .withName("ListHostVuls")
                .withUri("/v5/{project_id}/vulnerability/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getVulName, (req, v) -> {
                req.setVulName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getHandleStatus, (req, v) -> {
                req.setHandleStatus(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> listImageRiskConfigRules =
        genForlistImageRiskConfigRules();

    private static HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> genForlistImageRiskConfigRules() {
        // basic
        HttpRequestDef.Builder<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListImageRiskConfigRulesRequest.class, ListImageRiskConfigRulesResponse.class)
                .withName("ListImageRiskConfigRules")
                .withUri("/v5/{project_id}/image/baseline/risk-configs/{check_name}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageName, (req, v) -> {
                req.setImageName(v);
            }));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageVersion, (req, v) -> {
                req.setImageVersion(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getResultType, (req, v) -> {
                req.setResultType(v);
            }));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckRuleName, (req, v) -> {
                req.setCheckRuleName(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> listImageRiskConfigs =
        genForlistImageRiskConfigs();

    private static HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> genForlistImageRiskConfigs() {
        // basic
        HttpRequestDef.Builder<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListImageRiskConfigsRequest.class, ListImageRiskConfigsResponse.class)
            .withName("ListImageRiskConfigs")
            .withUri("/v5/{project_id}/image/baseline/risk-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageName, (req, v) -> {
                req.setImageName(v);
            }));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageVersion, (req, v) -> {
                req.setImageVersion(v);
            }));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> listImageVulnerabilities =
        genForlistImageVulnerabilities();

    private static HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> genForlistImageVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListImageVulnerabilitiesRequest.class, ListImageVulnerabilitiesResponse.class)
                .withName("ListImageVulnerabilities")
                .withUri("/v5/{project_id}/image/{image_id}/vulnerabilities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageId, (req, v) -> {
                req.setImageId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageName, (req, v) -> {
                req.setImageName(v);
            }));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getTagName, (req, v) -> {
                req.setTagName(v);
            }));
        builder.<String>withRequestField("repair_necessity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRepairNecessity, (req, v) -> {
                req.setRepairNecessity(v);
            }));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getVulId, (req, v) -> {
                req.setVulId(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> listIsolatedFile =
        genForlistIsolatedFile();

    private static HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> genForlistIsolatedFile() {
        // basic
        HttpRequestDef.Builder<ListIsolatedFileRequest, ListIsolatedFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIsolatedFileRequest.class, ListIsolatedFileResponse.class)
                .withName("ListIsolatedFile")
                .withUri("/v5/{project_id}/event/isolated-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getLastDays, (req, v) -> {
                req.setLastDays(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("isolation_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getIsolationStatus, (req, v) -> {
                req.setIsolationStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfo =
        genForlistJarPackageHostInfo();

    private static HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> genForlistJarPackageHostInfo() {
        // basic
        HttpRequestDef.Builder<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListJarPackageHostInfoRequest.class, ListJarPackageHostInfoResponse.class)
            .withName("ListJarPackageHostInfo")
            .withUri("/v5/{project_id}/asset/midwares/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatistics =
        genForlistJarPackageStatistics();

    private static HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> genForlistJarPackageStatistics() {
        // basic
        HttpRequestDef.Builder<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListJarPackageStatisticsRequest.class, ListJarPackageStatisticsResponse.class)
                .withName("ListJarPackageStatistics")
                .withUri("/v5/{project_id}/asset/midwares")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
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

    public static final HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroup =
        genForlistPolicyGroup();

    private static HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> genForlistPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListPolicyGroupRequest, ListPolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyGroupRequest.class, ListPolicyGroupResponse.class)
                .withName("ListPolicyGroup")
                .withUri("/v5/{project_id}/policy/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatistics =
        genForlistPortStatistics();

    private static HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> genForlistPortStatistics() {
        // basic
        HttpRequestDef.Builder<ListPortStatisticsRequest, ListPortStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortStatisticsRequest.class, ListPortStatisticsResponse.class)
                .withName("ListPortStatistics")
                .withUri("/v5/{project_id}/asset/port/statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<String>withRequestField("port_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getPortString, (req, v) -> {
                req.setPortString(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForlistPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForlistPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v5/{project_id}/asset/ports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatistics =
        genForlistProcessStatistics();

    private static HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> genForlistProcessStatistics() {
        // basic
        HttpRequestDef.Builder<ListProcessStatisticsRequest, ListProcessStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProcessStatisticsRequest.class, ListProcessStatisticsResponse.class)
            .withName("ListProcessStatistics")
            .withUri("/v5/{project_id}/asset/process/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicy =
        genForlistProtectionPolicy();

    private static HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> genForlistProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<ListProtectionPolicyRequest, ListProtectionPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionPolicyRequest.class, ListProtectionPolicyResponse.class)
            .withName("ListProtectionPolicy")
            .withUri("/v5/{project_id}/ransomware/protection/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getPolicyName, (req, v) -> {
                req.setPolicyName(v);
            }));
        builder.<String>withRequestField("protect_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getProtectPolicyId, (req, v) -> {
                req.setProtectPolicyId(v);
            }));
        builder.<String>withRequestField("operating_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOperatingSystem, (req, v) -> {
                req.setOperatingSystem(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServer =
        genForlistProtectionServer();

    private static HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> genForlistProtectionServer() {
        // basic
        HttpRequestDef.Builder<ListProtectionServerRequest, ListProtectionServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionServerRequest.class, ListProtectionServerResponse.class)
            .withName("ListProtectionServer")
            .withUri("/v5/{project_id}/ransomware/server")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostStatus, (req, v) -> {
                req.setHostStatus(v);
            }));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLastDays, (req, v) -> {
                req.setLastDays(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetail =
        genForlistQuotasDetail();

    private static HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> genForlistQuotasDetail() {
        // basic
        HttpRequestDef.Builder<ListQuotasDetailRequest, ListQuotasDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasDetailRequest.class, ListQuotasDetailResponse.class)
                .withName("ListQuotasDetail")
                .withUri("/v5/{project_id}/billing/quotas-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));
        builder.<String>withRequestField("quota_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getQuotaStatus, (req, v) -> {
                req.setQuotaStatus(v);
            }));
        builder.<String>withRequestField("used_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getUsedStatus, (req, v) -> {
                req.setUsedStatus(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getRegion, (req, v) -> {
                req.setRegion(v);
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
                .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/check-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
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
                .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
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
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
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
        builder.<List<String>>withRequestField("event_class_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventClassIds, (req, v) -> {
                req.setEventClassIds(v);
            }));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverityList, (req, v) -> {
                req.setSeverityList(v);
            }));
        builder.<String>withRequestField("attack_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttackTag, (req, v) -> {
                req.setAttackTag(v);
            }));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAssetValue, (req, v) -> {
                req.setAssetValue(v);
            }));
        builder.<List<String>>withRequestField("tag_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getTagList, (req, v) -> {
                req.setTagList(v);
            }));
        builder.<String>withRequestField("att_ck",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttCk, (req, v) -> {
                req.setAttCk(v);
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

    public static final HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> listSwrImageRepository =
        genForlistSwrImageRepository();

    private static HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> genForlistSwrImageRepository() {
        // basic
        HttpRequestDef.Builder<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSwrImageRepositoryRequest.class, ListSwrImageRepositoryResponse.class)
            .withName("ListSwrImageRepository")
            .withUri("/v5/{project_id}/image/swr-repository")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageName, (req, v) -> {
                req.setImageName(v);
            }));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageVersion, (req, v) -> {
                req.setImageVersion(v);
            }));
        builder.<Boolean>withRequestField("latest_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLatestVersion, (req, v) -> {
                req.setLatestVersion(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getScanStatus, (req, v) -> {
                req.setScanStatus(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistories =
        genForlistUserChangeHistories();

    private static HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> genForlistUserChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserChangeHistoriesRequest.class, ListUserChangeHistoriesResponse.class)
            .withName("ListUserChangeHistories")
            .withUri("/v5/{project_id}/asset/user/change-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getRootPermission, (req, v) -> {
                req.setRootPermission(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("change_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getChangeType, (req, v) -> {
                req.setChangeType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatistics =
        genForlistUserStatistics();

    private static HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> genForlistUserStatistics() {
        // basic
        HttpRequestDef.Builder<ListUserStatisticsRequest, ListUserStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserStatisticsRequest.class, ListUserStatisticsResponse.class)
                .withName("ListUserStatistics")
                .withUri("/v5/{project_id}/asset/user/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForlistUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForlistUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v5/{project_id}/asset/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<Boolean>withRequestField("login_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getLoginPermission, (req, v) -> {
                req.setLoginPermission(v);
            }));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getRootPermission, (req, v) -> {
                req.setRootPermission(v);
            }));
        builder.<String>withRequestField("user_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserGroup, (req, v) -> {
                req.setUserGroup(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> listVulHosts = genForlistVulHosts();

    private static HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> genForlistVulHosts() {
        // basic
        HttpRequestDef.Builder<ListVulHostsRequest, ListVulHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulHostsRequest.class, ListVulHostsResponse.class)
                .withName("ListVulHosts")
                .withUri("/v5/{project_id}/vulnerability/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getVulId, (req, v) -> {
                req.setVulId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getAssetValue, (req, v) -> {
                req.setAssetValue(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHandleStatus, (req, v) -> {
                req.setHandleStatus(v);
            }));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getSeverityLevel, (req, v) -> {
                req.setSeverityLevel(v);
            }));
        builder.<Boolean>withRequestField("is_affect_business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVulHostsRequest::getIsAffectBusiness, (req, v) -> {
                req.setIsAffectBusiness(v);
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
            FieldExistence.NULL_IGNORE,
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
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getRepairPriority, (req, v) -> {
                req.setRepairPriority(v);
            }));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getHandleStatus, (req, v) -> {
                req.setHandleStatus(v);
            }));
        builder.<String>withRequestField("cve_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getCveId, (req, v) -> {
                req.setCveId(v);
            }));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLabelList, (req, v) -> {
                req.setLabelList(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getAssetValue, (req, v) -> {
                req.setAssetValue(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> listVulnerabilityCve =
        genForlistVulnerabilityCve();

    private static HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> genForlistVulnerabilityCve() {
        // basic
        HttpRequestDef.Builder<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVulnerabilityCveRequest.class, ListVulnerabilityCveResponse.class)
            .withName("ListVulnerabilityCve")
            .withUri("/v5/{project_id}/image/vulnerability/{vul_id}/cve")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vul_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getVulId, (req, v) -> {
                req.setVulId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getRegion, (req, v) -> {
                req.setRegion(v);
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

    public static final HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHost =
        genForlistWtpProtectHost();

    private static HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> genForlistWtpProtectHost() {
        // basic
        HttpRequestDef.Builder<ListWtpProtectHostRequest, ListWtpProtectHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWtpProtectHostRequest.class, ListWtpProtectHostResponse.class)
                .withName("ListWtpProtectHost")
                .withUri("/v5/{project_id}/webtamper/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPublicIp, (req, v) -> {
                req.setPublicIp(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            }));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            }));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getAgentStatus, (req, v) -> {
                req.setAgentStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> runImageSynchronize =
        genForrunImageSynchronize();

    private static HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> genForrunImageSynchronize() {
        // basic
        HttpRequestDef.Builder<RunImageSynchronizeRequest, RunImageSynchronizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageSynchronizeRequest.class, RunImageSynchronizeResponse.class)
                .withName("RunImageSynchronize")
                .withUri("/v5/{project_id}/image/synchronize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<RunImageSynchronizeRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunImageSynchronizeRequestInfo.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitch =
        genForsetRaspSwitch();

    private static HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> genForsetRaspSwitch() {
        // basic
        HttpRequestDef.Builder<SetRaspSwitchRequest, SetRaspSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetRaspSwitchRequest.class, SetRaspSwitchResponse.class)
                .withName("SetRaspSwitch")
                .withUri("/v5/{project_id}/webtamper/rasp/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<SetRaspSwitchRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRaspSwitchRequestInfo.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfo =
        genForsetWtpProtectionStatusInfo();

    private static HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> genForsetWtpProtectionStatusInfo() {
        // basic
        HttpRequestDef.Builder<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetWtpProtectionStatusInfoRequest.class,
                    SetWtpProtectionStatusInfoResponse.class)
                .withName("SetWtpProtectionStatusInfo")
                .withUri("/v5/{project_id}/webtamper/static/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<SetWtpProtectionStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetWtpProtectionStatusRequestInfo.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatistic =
        genForshowAssetStatistic();

    private static HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> genForshowAssetStatistic() {
        // basic
        HttpRequestDef.Builder<ShowAssetStatisticRequest, ShowAssetStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetStatisticRequest.class, ShowAssetStatisticResponse.class)
                .withName("ShowAssetStatistic")
                .withUri("/v5/{project_id}/asset/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getHostId, (req, v) -> {
                req.setHostId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfo =
        genForshowBackupPolicyInfo();

    private static HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> genForshowBackupPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupPolicyInfoRequest.class, ShowBackupPolicyInfoResponse.class)
            .withName("ShowBackupPolicyInfo")
            .withUri("/v5/{project_id}/backup/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getRegion, (req, v) -> {
                req.setRegion(v);
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
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
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

    public static final HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> showImageCheckRuleDetail =
        genForshowImageCheckRuleDetail();

    private static HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> genForshowImageCheckRuleDetail() {
        // basic
        HttpRequestDef.Builder<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowImageCheckRuleDetailRequest.class, ShowImageCheckRuleDetailResponse.class)
                .withName("ShowImageCheckRuleDetail")
                .withUri("/v5/{project_id}/image/baseline/check-rule/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageType, (req, v) -> {
                req.setImageType(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageName, (req, v) -> {
                req.setImageName(v);
            }));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageVersion, (req, v) -> {
                req.setImageVersion(v);
            }));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
            }));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckType, (req, v) -> {
                req.setCheckType(v);
            }));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckRuleId, (req, v) -> {
                req.setCheckRuleId(v);
            }));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getStandard, (req, v) -> {
                req.setStandard(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotas =
        genForshowResourceQuotas();

    private static HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> genForshowResourceQuotas() {
        // basic
        HttpRequestDef.Builder<ShowResourceQuotasRequest, ShowResourceQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceQuotasRequest.class, ShowResourceQuotasResponse.class)
                .withName("ShowResourceQuotas")
                .withUri("/v5/{project_id}/billing/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getRegion, (req, v) -> {
                req.setRegion(v);
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
            .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getCheckName, (req, v) -> {
                req.setCheckName(v);
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

    public static final HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> showVulScanPolicy =
        genForshowVulScanPolicy();

    private static HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> genForshowVulScanPolicy() {
        // basic
        HttpRequestDef.Builder<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVulScanPolicyRequest.class, ShowVulScanPolicyResponse.class)
                .withName("ShowVulScanPolicy")
                .withUri("/v5/{project_id}/vulnerability/scan-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulScanPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> showVulStatics =
        genForshowVulStatics();

    private static HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> genForshowVulStatics() {
        // basic
        HttpRequestDef.Builder<ShowVulStaticsRequest, ShowVulStaticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVulStaticsRequest.class, ShowVulStaticsResponse.class)
                .withName("ShowVulStatics")
                .withUri("/v5/{project_id}/vulnerability/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulStaticsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartProtectionRequest, StartProtectionResponse> startProtection =
        genForstartProtection();

    private static HttpRequestDef<StartProtectionRequest, StartProtectionResponse> genForstartProtection() {
        // basic
        HttpRequestDef.Builder<StartProtectionRequest, StartProtectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartProtectionRequest.class, StartProtectionResponse.class)
                .withName("StartProtection")
                .withUri("/v5/{project_id}/ransomware/protection/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<ProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StartProtectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopProtectionRequest, StopProtectionResponse> stopProtection =
        genForstopProtection();

    private static HttpRequestDef<StopProtectionRequest, StopProtectionResponse> genForstopProtection() {
        // basic
        HttpRequestDef.Builder<StopProtectionRequest, StopProtectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopProtectionRequest.class, StopProtectionResponse.class)
                .withName("StopProtection")
                .withUri("/v5/{project_id}/ransomware/protection/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<CloseProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloseProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StopProtectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatus =
        genForswitchHostsProtectStatus();

    private static HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> genForswitchHostsProtectStatus() {
        // basic
        HttpRequestDef.Builder<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SwitchHostsProtectStatusRequest.class, SwitchHostsProtectStatusResponse.class)
                .withName("SwitchHostsProtectStatus")
                .withUri("/v5/{project_id}/host-management/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<SwitchHostsProtectStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchHostsProtectStatusRequestInfo.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfo =
        genForupdateBackupPolicyInfo();

    private static HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> genForupdateBackupPolicyInfo() {
        // basic
        HttpRequestDef.Builder<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBackupPolicyInfoRequest.class, UpdateBackupPolicyInfoResponse.class)
            .withName("UpdateBackupPolicyInfo")
            .withUri("/v5/{project_id}/backup/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<UpdateBackupPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBackupPolicyRequestInfo.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicy =
        genForupdateProtectionPolicy();

    private static HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> genForupdateProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProtectionPolicyRequest.class, UpdateProtectionPolicyResponse.class)
            .withName("UpdateProtectionPolicy")
            .withUri("/v5/{project_id}/ransomware/protection/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<UpdateProtectionPolicyInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectionPolicyInfoRequestInfo.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanPrivateImageRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
import com.huaweicloud.sdk.hss.v5.model.CCEClusterInfoListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CceIntegrationProtectionRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionResponse;
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
import com.huaweicloud.sdk.hss.v5.model.CheckRuleIdListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CloseProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeRequest;
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProcessesHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProcessesHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerResponse;
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ManualVulScanRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ResourceProductDataObjectInfo;
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
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosResponse;
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
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateDaemonsetRequestBody;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class HssMeta {

    public static final HttpRequestDef<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> addCceIntegrationProtection =
        genForAddCceIntegrationProtection();

    private static HttpRequestDef<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> genForAddCceIntegrationProtection() {
        // basic
        HttpRequestDef.Builder<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddCceIntegrationProtectionRequest.class,
                    AddCceIntegrationProtectionResponse.class)
                .withName("AddCceIntegrationProtection")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/protection-enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getEnterpriseProjectId,
                AddCceIntegrationProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getRegion,
                AddCceIntegrationProtectionRequest::setRegion));
        builder.<CceIntegrationProtectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CceIntegrationProtectionRequestBody.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getBody,
                AddCceIntegrationProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroup =
        genForAddHostsGroup();

    private static HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> genForAddHostsGroup() {
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
            f -> f.withMarshaller(AddHostsGroupRequest::getEnterpriseProjectId,
                AddHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getRegion, AddHostsGroupRequest::setRegion));
        builder.<AddHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddHostsGroupRequestInfo.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getBody, AddHostsGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroup =
        genForAssociatePolicyGroup();

    private static HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> genForAssociatePolicyGroup() {
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
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getEnterpriseProjectId,
                AssociatePolicyGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getRegion, AssociatePolicyGroupRequest::setRegion));
        builder.<AssociatePolicyGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePolicyGroupRequestInfo.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getBody, AssociatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddAccountsRequest, BatchAddAccountsResponse> batchAddAccounts =
        genForBatchAddAccounts();

    private static HttpRequestDef<BatchAddAccountsRequest, BatchAddAccountsResponse> genForBatchAddAccounts() {
        // basic
        HttpRequestDef.Builder<BatchAddAccountsRequest, BatchAddAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddAccountsRequest.class, BatchAddAccountsResponse.class)
                .withName("BatchAddAccounts")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getEnterpriseProjectId,
                BatchAddAccountsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getXSecurityToken,
                BatchAddAccountsRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getRegion, BatchAddAccountsRequest::setRegion));
        builder.<BatchAddAccountsRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddAccountsRequestInfo.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getBody, BatchAddAccountsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAddAccountsResponse::getXRequestId, BatchAddAccountsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
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
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, BatchCreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, BatchCreateTagsRequest::setResourceId));
        builder.<BatchCreateTagsRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequestInfo.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> batchScanSwrImage =
        genForBatchScanSwrImage();

    private static HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> genForBatchScanSwrImage() {
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
            f -> f.withMarshaller(BatchScanSwrImageRequest::getEnterpriseProjectId,
                BatchScanSwrImageRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getRegion, BatchScanSwrImageRequest::setRegion));
        builder.<BatchScanPrivateImageRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchScanPrivateImageRequestInfo.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getBody, BatchScanSwrImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> changeBlockedIp =
        genForChangeBlockedIp();

    private static HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> genForChangeBlockedIp() {
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
            f -> f.withMarshaller(ChangeBlockedIpRequest::getEnterpriseProjectId,
                ChangeBlockedIpRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getRegion, ChangeBlockedIpRequest::setRegion));
        builder.<ChangeBlockedIpRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeBlockedIpRequestInfo.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getBody, ChangeBlockedIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> changeCheckRuleAction =
        genForChangeCheckRuleAction();

    private static HttpRequestDef<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> genForChangeCheckRuleAction() {
        // basic
        HttpRequestDef.Builder<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeCheckRuleActionRequest.class, ChangeCheckRuleActionResponse.class)
            .withName("ChangeCheckRuleAction")
            .withUri("/v5/{project_id}/baseline/check-rule/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getEnterpriseProjectId,
                ChangeCheckRuleActionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getHostId, ChangeCheckRuleActionRequest::setHostId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getAction, ChangeCheckRuleActionRequest::setAction));
        builder.<CheckRuleIdListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckRuleIdListRequestInfo.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getBody, ChangeCheckRuleActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEventRequest, ChangeEventResponse> changeEvent = genForChangeEvent();

    private static HttpRequestDef<ChangeEventRequest, ChangeEventResponse> genForChangeEvent() {
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
            f -> f.withMarshaller(ChangeEventRequest::getEnterpriseProjectId,
                ChangeEventRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerName, ChangeEventRequest::setContainerName));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerId, ChangeEventRequest::setContainerId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getRegion, ChangeEventRequest::setRegion));
        builder.<ChangeEventRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeEventRequestInfo.class),
            f -> f.withMarshaller(ChangeEventRequest::getBody, ChangeEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroup =
        genForChangeHostsGroup();

    private static HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> genForChangeHostsGroup() {
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
            f -> f.withMarshaller(ChangeHostsGroupRequest::getEnterpriseProjectId,
                ChangeHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getRegion, ChangeHostsGroupRequest::setRegion));
        builder.<ChangeHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeHostsGroupRequestInfo.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getBody, ChangeHostsGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> changeIsolatedFile =
        genForChangeIsolatedFile();

    private static HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> genForChangeIsolatedFile() {
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
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getEnterpriseProjectId,
                ChangeIsolatedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getRegion, ChangeIsolatedFileRequest::setRegion));
        builder.<ChangeIsolatedFileRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIsolatedFileRequestInfo.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getBody, ChangeIsolatedFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> changeVulScanPolicy =
        genForChangeVulScanPolicy();

    private static HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> genForChangeVulScanPolicy() {
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
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getEnterpriseProjectId,
                ChangeVulScanPolicyRequest::setEnterpriseProjectId));
        builder.<ChangeVulScanPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulScanPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getBody, ChangeVulScanPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatus =
        genForChangeVulStatus();

    private static HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> genForChangeVulStatus() {
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
            f -> f.withMarshaller(ChangeVulStatusRequest::getEnterpriseProjectId,
                ChangeVulStatusRequest::setEnterpriseProjectId));
        builder.<ChangeVulStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulStatusRequestInfo.class),
            f -> f.withMarshaller(ChangeVulStatusRequest::getBody, ChangeVulStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQuotasOrderRequest, CreateQuotasOrderResponse> createQuotasOrder =
        genForCreateQuotasOrder();

    private static HttpRequestDef<CreateQuotasOrderRequest, CreateQuotasOrderResponse> genForCreateQuotasOrder() {
        // basic
        HttpRequestDef.Builder<CreateQuotasOrderRequest, CreateQuotasOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQuotasOrderRequest.class, CreateQuotasOrderResponse.class)
                .withName("CreateQuotasOrder")
                .withUri("/v5/{project_id}/quotas/orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getEnterpriseProjectId,
                CreateQuotasOrderRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getRegion, CreateQuotasOrderRequest::setRegion));
        builder.<CreateQuotasOrderRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQuotasOrderRequestInfo.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getBody, CreateQuotasOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> createVulnerabilityScanTask =
        genForCreateVulnerabilityScanTask();

    private static HttpRequestDef<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> genForCreateVulnerabilityScanTask() {
        // basic
        HttpRequestDef.Builder<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVulnerabilityScanTaskRequest.class,
                    CreateVulnerabilityScanTaskResponse.class)
                .withName("CreateVulnerabilityScanTask")
                .withUri("/v5/{project_id}/vulnerability/scan-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVulnerabilityScanTaskRequest::getEnterpriseProjectId,
                CreateVulnerabilityScanTaskRequest::setEnterpriseProjectId));
        builder.<ManualVulScanRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ManualVulScanRequestInfo.class),
            f -> f.withMarshaller(CreateVulnerabilityScanTaskRequest::getBody,
                CreateVulnerabilityScanTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccountRequest, DeleteAccountResponse> deleteAccount =
        genForDeleteAccount();

    private static HttpRequestDef<DeleteAccountRequest, DeleteAccountResponse> genForDeleteAccount() {
        // basic
        HttpRequestDef.Builder<DeleteAccountRequest, DeleteAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccountRequest.class, DeleteAccountResponse.class)
                .withName("DeleteAccount")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getEnterpriseProjectId,
                DeleteAccountRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getXSecurityToken, DeleteAccountRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getRegion, DeleteAccountRequest::setRegion));
        builder.<DeleteAccountRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccountRequestInfo.class),
            f -> f.withMarshaller(DeleteAccountRequest::getBody, DeleteAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> deleteAgentDaemonset =
        genForDeleteAgentDaemonset();

    private static HttpRequestDef<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> genForDeleteAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAgentDaemonsetRequest.class, DeleteAgentDaemonsetResponse.class)
            .withName("DeleteAgentDaemonset")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getClusterId,
                DeleteAgentDaemonsetRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getEnterpriseProjectId,
                DeleteAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("invoked_service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getInvokedService,
                DeleteAgentDaemonsetRequest::setInvokedService));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getRegion, DeleteAgentDaemonsetRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroup =
        genForDeleteHostsGroup();

    private static HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> genForDeleteHostsGroup() {
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
            f -> f.withMarshaller(DeleteHostsGroupRequest::getEnterpriseProjectId,
                DeleteHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getGroupId, DeleteHostsGroupRequest::setGroupId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getRegion, DeleteHostsGroupRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTag =
        genForDeleteResourceInstanceTag();

    private static HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> genForDeleteResourceInstanceTag() {
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
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceType,
                DeleteResourceInstanceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceId,
                DeleteResourceInstanceTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getKey, DeleteResourceInstanceTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportVulsRequest, ExportVulsResponse> exportVuls = genForExportVuls();

    private static HttpRequestDef<ExportVulsRequest, ExportVulsResponse> genForExportVuls() {
        // basic
        HttpRequestDef.Builder<ExportVulsRequest, ExportVulsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportVulsRequest.class, ExportVulsResponse.class)
                .withName("ExportVuls")
                .withUri("/v5/{project_id}/vul/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getEnterpriseProjectId,
                ExportVulsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getType, ExportVulsRequest::setType));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getVulId, ExportVulsRequest::setVulId));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getVulName, ExportVulsRequest::setVulName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getHostId, ExportVulsRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getLimit, ExportVulsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getOffset, ExportVulsRequest::setOffset));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getRepairPriority, ExportVulsRequest::setRepairPriority));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getHandleStatus, ExportVulsRequest::setHandleStatus));
        builder.<String>withRequestField("cve_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getCveId, ExportVulsRequest::setCveId));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getLabelList, ExportVulsRequest::setLabelList));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getStatus, ExportVulsRequest::setStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getAssetValue, ExportVulsRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getGroupName, ExportVulsRequest::setGroupName));
        builder.<Integer>withRequestField("export_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getExportSize, ExportVulsRequest::setExportSize));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getCategory, ExportVulsRequest::setCategory));
        builder.<ExportVulRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportVulRequestBody.class),
            f -> f.withMarshaller(ExportVulsRequest::getBody, ExportVulsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsRequest, ListAccountsResponse> listAccounts = genForListAccounts();

    private static HttpRequestDef<ListAccountsRequest, ListAccountsResponse> genForListAccounts() {
        // basic
        HttpRequestDef.Builder<ListAccountsRequest, ListAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountsRequest.class, ListAccountsResponse.class)
                .withName("ListAccounts")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getLimit, ListAccountsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getOffset, ListAccountsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getEnterpriseProjectId,
                ListAccountsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getXSecurityToken, ListAccountsRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getRegion, ListAccountsRequest::setRegion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAccountsResponse::getXRequestId, ListAccountsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> listAgentInstallScript =
        genForListAgentInstallScript();

    private static HttpRequestDef<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> genForListAgentInstallScript() {
        // basic
        HttpRequestDef.Builder<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAgentInstallScriptRequest.class, ListAgentInstallScriptResponse.class)
            .withName("ListAgentInstallScript")
            .withUri("/v5/{project_id}/setting/agent-install-script")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getEnterpriseProjectId,
                ListAgentInstallScriptRequest::setEnterpriseProjectId));
        builder.<ListAgentInstallScriptRequest.OsTypeEnum>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.OsTypeEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOsType, ListAgentInstallScriptRequest::setOsType));
        builder.<ListAgentInstallScriptRequest.OsArchEnum>withRequestField("os_arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.OsArchEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOsArch, ListAgentInstallScriptRequest::setOsArch));
        builder.<Boolean>withRequestField("outside_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOutsideHost,
                ListAgentInstallScriptRequest::setOutsideHost));
        builder.<String>withRequestField("outside_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOutsideGroupId,
                ListAgentInstallScriptRequest::setOutsideGroupId));
        builder.<Boolean>withRequestField("batch_install",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getBatchInstall,
                ListAgentInstallScriptRequest::setBatchInstall));
        builder.<ListAgentInstallScriptRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getType, ListAgentInstallScriptRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getRegion, ListAgentInstallScriptRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteList =
        genForListAlarmWhiteList();

    private static HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> genForListAlarmWhiteList() {
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
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEnterpriseProjectId,
                ListAlarmWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getHash, ListAlarmWhiteListRequest::setHash));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEventType, ListAlarmWhiteListRequest::setEventType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getOffset, ListAlarmWhiteListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getLimit, ListAlarmWhiteListRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getRegion, ListAlarmWhiteListRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistories =
        genForListAppChangeHistories();

    private static HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> genForListAppChangeHistories() {
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
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostId, ListAppChangeHistoriesRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostIp, ListAppChangeHistoriesRequest::setHostIp));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostName,
                ListAppChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getAppName,
                ListAppChangeHistoriesRequest::setAppName));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getVariationType,
                ListAppChangeHistoriesRequest::setVariationType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEnterpriseProjectId,
                ListAppChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortKey,
                ListAppChangeHistoriesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortDir,
                ListAppChangeHistoriesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getLimit, ListAppChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getOffset, ListAppChangeHistoriesRequest::setOffset));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getStartTime,
                ListAppChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEndTime,
                ListAppChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatistics =
        genForListAppStatistics();

    private static HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> genForListAppStatistics() {
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
            f -> f.withMarshaller(ListAppStatisticsRequest::getAppName, ListAppStatisticsRequest::setAppName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getEnterpriseProjectId,
                ListAppStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getLimit, ListAppStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getOffset, ListAppStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getCategory, ListAppStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v5/{project_id}/asset/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostId, ListAppsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostName, ListAppsRequest::setHostName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAppName, ListAppsRequest::setAppName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostIp, ListAppsRequest::setHostIp));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getVersion, ListAppsRequest::setVersion));
        builder.<String>withRequestField("install_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getInstallDir, ListAppsRequest::setInstallDir));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getEnterpriseProjectId, ListAppsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getCategory, ListAppsRequest::setCategory));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAppsRequest::getPartMatch, ListAppsRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistories =
        genForListAutoLaunchChangeHistories();

    private static HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> genForListAutoLaunchChangeHistories() {
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
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostId,
                ListAutoLaunchChangeHistoriesRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostIp,
                ListAutoLaunchChangeHistoriesRequest::setHostIp));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostName,
                ListAutoLaunchChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("auto_launch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getAutoLaunchName,
                ListAutoLaunchChangeHistoriesRequest::setAutoLaunchName));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getType,
                ListAutoLaunchChangeHistoriesRequest::setType));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getVariationType,
                ListAutoLaunchChangeHistoriesRequest::setVariationType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEnterpriseProjectId,
                ListAutoLaunchChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortKey,
                ListAutoLaunchChangeHistoriesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortDir,
                ListAutoLaunchChangeHistoriesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getLimit,
                ListAutoLaunchChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getOffset,
                ListAutoLaunchChangeHistoriesRequest::setOffset));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getStartTime,
                ListAutoLaunchChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEndTime,
                ListAutoLaunchChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatistics =
        genForListAutoLaunchStatistics();

    private static HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> genForListAutoLaunchStatistics() {
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
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getName, ListAutoLaunchStatisticsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getType, ListAutoLaunchStatisticsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getEnterpriseProjectId,
                ListAutoLaunchStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getLimit,
                ListAutoLaunchStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getOffset,
                ListAutoLaunchStatisticsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchs =
        genForListAutoLaunchs();

    private static HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> genForListAutoLaunchs() {
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
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostId, ListAutoLaunchsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostName, ListAutoLaunchsRequest::setHostName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getName, ListAutoLaunchsRequest::setName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostIp, ListAutoLaunchsRequest::setHostIp));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getType, ListAutoLaunchsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getEnterpriseProjectId,
                ListAutoLaunchsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getLimit, ListAutoLaunchsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getOffset, ListAutoLaunchsRequest::setOffset));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getPartMatch, ListAutoLaunchsRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> listBlockedIp =
        genForListBlockedIp();

    private static HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> genForListBlockedIp() {
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
            f -> f.withMarshaller(ListBlockedIpRequest::getEnterpriseProjectId,
                ListBlockedIpRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLastDays, ListBlockedIpRequest::setLastDays));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getHostName, ListBlockedIpRequest::setHostName));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getSrcIp, ListBlockedIpRequest::setSrcIp));
        builder.<String>withRequestField("intercept_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getInterceptStatus, ListBlockedIpRequest::setInterceptStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getOffset, ListBlockedIpRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLimit, ListBlockedIpRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getRegion, ListBlockedIpRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCceClusterConfigRequest, ListCceClusterConfigResponse> listCceClusterConfig =
        genForListCceClusterConfig();

    private static HttpRequestDef<ListCceClusterConfigRequest, ListCceClusterConfigResponse> genForListCceClusterConfig() {
        // basic
        HttpRequestDef.Builder<ListCceClusterConfigRequest, ListCceClusterConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCceClusterConfigRequest.class, ListCceClusterConfigResponse.class)
            .withName("ListCceClusterConfig")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/configs/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getEnterpriseProjectId,
                ListCceClusterConfigRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getRegion, ListCceClusterConfigRequest::setRegion));
        builder.<CCEClusterInfoListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CCEClusterInfoListRequestBody.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getBody, ListCceClusterConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodes =
        genForListContainerNodes();

    private static HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> genForListContainerNodes() {
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
            f -> f.withMarshaller(ListContainerNodesRequest::getEnterpriseProjectId,
                ListContainerNodesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getOffset, ListContainerNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getLimit, ListContainerNodesRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getHostName, ListContainerNodesRequest::setHostName));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getAgentStatus,
                ListContainerNodesRequest::setAgentStatus));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getProtectStatus,
                ListContainerNodesRequest::setProtectStatus));
        builder.<String>withRequestField("container_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getContainerTags,
                ListContainerNodesRequest::setContainerTags));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getRegion, ListContainerNodesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainersRequest, ListContainersResponse> listContainers =
        genForListContainers();

    private static HttpRequestDef<ListContainersRequest, ListContainersResponse> genForListContainers() {
        // basic
        HttpRequestDef.Builder<ListContainersRequest, ListContainersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainersRequest.class, ListContainersResponse.class)
                .withName("ListContainers")
                .withUri("/v5/{project_id}/container/kubernetes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getEnterpriseProjectId,
                ListContainersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getContainerName, ListContainersRequest::setContainerName));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getPodName, ListContainersRequest::setPodName));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getImageName, ListContainersRequest::setImageName));
        builder.<Boolean>withRequestField("cluster_container",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListContainersRequest::getClusterContainer,
                ListContainersRequest::setClusterContainer));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainersRequest::getLimit, ListContainersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainersRequest::getOffset, ListContainersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> listDownloadExportedFile =
        genForListDownloadExportedFile();

    private static HttpRequestDef<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> genForListDownloadExportedFile() {
        // basic
        HttpRequestDef.Builder<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDownloadExportedFileRequest.class, ListDownloadExportedFileResponse.class)
                .withName("ListDownloadExportedFile")
                .withUri("/v5/{project_id}/download/{file_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getFileId,
                ListDownloadExportedFileRequest::setFileId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getEnterpriseProjectId,
                ListDownloadExportedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getRegion,
                ListDownloadExportedFileRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups =
        genForListHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForListHostGroups() {
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
            f -> f.withMarshaller(ListHostGroupsRequest::getEnterpriseProjectId,
                ListHostGroupsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, ListHostGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, ListHostGroupsRequest::setLimit));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getGroupName, ListHostGroupsRequest::setGroupName));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getRegion, ListHostGroupsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfo =
        genForListHostProtectHistoryInfo();

    private static HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> genForListHostProtectHistoryInfo() {
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
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEnterpriseProjectId,
                ListHostProtectHistoryInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostId,
                ListHostProtectHistoryInfoRequest::setHostId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getStartTime,
                ListHostProtectHistoryInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEndTime,
                ListHostProtectHistoryInfoRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getLimit,
                ListHostProtectHistoryInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getOffset,
                ListHostProtectHistoryInfoRequest::setOffset));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostName,
                ListHostProtectHistoryInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostIp,
                ListHostProtectHistoryInfoRequest::setHostIp));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFilePath,
                ListHostProtectHistoryInfoRequest::setFilePath));
        builder.<String>withRequestField("file_operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFileOperation,
                ListHostProtectHistoryInfoRequest::setFileOperation));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getRegion,
                ListHostProtectHistoryInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfo =
        genForListHostRaspProtectHistoryInfo();

    private static HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> genForListHostRaspProtectHistoryInfo() {
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
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEnterpriseProjectId,
                ListHostRaspProtectHistoryInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getHostId,
                ListHostRaspProtectHistoryInfoRequest::setHostId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getStartTime,
                ListHostRaspProtectHistoryInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEndTime,
                ListHostRaspProtectHistoryInfoRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getLimit,
                ListHostRaspProtectHistoryInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getOffset,
                ListHostRaspProtectHistoryInfoRequest::setOffset));
        builder.<Integer>withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getAlarmLevel,
                ListHostRaspProtectHistoryInfoRequest::setAlarmLevel));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getSeverity,
                ListHostRaspProtectHistoryInfoRequest::setSeverity));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getProtectStatus,
                ListHostRaspProtectHistoryInfoRequest::setProtectStatus));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getRegion,
                ListHostRaspProtectHistoryInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> listHostStatus =
        genForListHostStatus();

    private static HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> genForListHostStatus() {
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
            f -> f.withMarshaller(ListHostStatusRequest::getEnterpriseProjectId,
                ListHostStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getVersion, ListHostStatusRequest::setVersion));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentStatus, ListHostStatusRequest::setAgentStatus));
        builder.<String>withRequestField("detect_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getDetectResult, ListHostStatusRequest::setDetectResult));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostName, ListHostStatusRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostId, ListHostStatusRequest::setHostId));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostStatus, ListHostStatusRequest::setHostStatus));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOsType, ListHostStatusRequest::setOsType));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPrivateIp, ListHostStatusRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPublicIp, ListHostStatusRequest::setPublicIp));
        builder.<String>withRequestField("ip_addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getIpAddr, ListHostStatusRequest::setIpAddr));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getProtectStatus, ListHostStatusRequest::setProtectStatus));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupId, ListHostStatusRequest::setGroupId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupName, ListHostStatusRequest::setGroupName));
        builder.<Boolean>withRequestField("has_intrusion",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHasIntrusion, ListHostStatusRequest::setHasIntrusion));
        builder.<String>withRequestField("policy_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupId, ListHostStatusRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupName,
                ListHostStatusRequest::setPolicyGroupName));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getChargingMode, ListHostStatusRequest::setChargingMode));
        builder.<Boolean>withRequestField("refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRefresh, ListHostStatusRequest::setRefresh));
        builder.<Boolean>withRequestField("above_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAboveVersion, ListHostStatusRequest::setAboveVersion));
        builder.<Boolean>withRequestField("outside_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOutsideHost, ListHostStatusRequest::setOutsideHost));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAssetValue, ListHostStatusRequest::setAssetValue));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLabel, ListHostStatusRequest::setLabel));
        builder.<String>withRequestField("server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getServerGroup, ListHostStatusRequest::setServerGroup));
        builder.<Boolean>withRequestField("agent_upgradable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentUpgradable,
                ListHostStatusRequest::setAgentUpgradable));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLimit, ListHostStatusRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOffset, ListHostStatusRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRegion, ListHostStatusRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> listHostVuls = genForListHostVuls();

    private static HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> genForListHostVuls() {
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
            f -> f.withMarshaller(ListHostVulsRequest::getHostId, ListHostVulsRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getEnterpriseProjectId,
                ListHostVulsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getType, ListHostVulsRequest::setType));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getVulName, ListHostVulsRequest::setVulName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getLimit, ListHostVulsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getOffset, ListHostVulsRequest::setOffset));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getHandleStatus, ListHostVulsRequest::setHandleStatus));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getStatus, ListHostVulsRequest::setStatus));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getRepairPriority, ListHostVulsRequest::setRepairPriority));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageLocalRequest, ListImageLocalResponse> listImageLocal =
        genForListImageLocal();

    private static HttpRequestDef<ListImageLocalRequest, ListImageLocalResponse> genForListImageLocal() {
        // basic
        HttpRequestDef.Builder<ListImageLocalRequest, ListImageLocalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageLocalRequest.class, ListImageLocalResponse.class)
                .withName("ListImageLocal")
                .withUri("/v5/{project_id}/image/local-repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEnterpriseProjectId,
                ListImageLocalRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageName, ListImageLocalRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageVersion, ListImageLocalRequest::setImageVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageLocalRequest::getOffset, ListImageLocalRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageLocalRequest::getLimit, ListImageLocalRequest::setLimit));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getScanStatus, ListImageLocalRequest::setScanStatus));
        builder.<String>withRequestField("local_image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getLocalImageType, ListImageLocalRequest::setLocalImageType));
        builder.<Long>withRequestField("image_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageSize, ListImageLocalRequest::setImageSize));
        builder.<Long>withRequestField("start_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getStartLatestUpdateTime,
                ListImageLocalRequest::setStartLatestUpdateTime));
        builder.<Long>withRequestField("end_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEndLatestUpdateTime,
                ListImageLocalRequest::setEndLatestUpdateTime));
        builder.<Long>withRequestField("start_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getStartLatestScanTime,
                ListImageLocalRequest::setStartLatestScanTime));
        builder.<Long>withRequestField("end_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEndLatestScanTime,
                ListImageLocalRequest::setEndLatestScanTime));
        builder.<Boolean>withRequestField("has_vul",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHasVul, ListImageLocalRequest::setHasVul));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostName, ListImageLocalRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostId, ListImageLocalRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostIp, ListImageLocalRequest::setHostIp));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getContainerId, ListImageLocalRequest::setContainerId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getContainerName, ListImageLocalRequest::setContainerName));
        builder.<String>withRequestField("pod_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getPodId, ListImageLocalRequest::setPodId));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getPodName, ListImageLocalRequest::setPodName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getAppName, ListImageLocalRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> listImageRiskConfigRules =
        genForListImageRiskConfigRules();

    private static HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> genForListImageRiskConfigRules() {
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
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckName,
                ListImageRiskConfigRulesRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getEnterpriseProjectId,
                ListImageRiskConfigRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageType,
                ListImageRiskConfigRulesRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getOffset,
                ListImageRiskConfigRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getLimit,
                ListImageRiskConfigRulesRequest::setLimit));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getNamespace,
                ListImageRiskConfigRulesRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageName,
                ListImageRiskConfigRulesRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageVersion,
                ListImageRiskConfigRulesRequest::setImageVersion));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getStandard,
                ListImageRiskConfigRulesRequest::setStandard));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getResultType,
                ListImageRiskConfigRulesRequest::setResultType));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckRuleName,
                ListImageRiskConfigRulesRequest::setCheckRuleName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getSeverity,
                ListImageRiskConfigRulesRequest::setSeverity));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getInstanceId,
                ListImageRiskConfigRulesRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getRegion,
                ListImageRiskConfigRulesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> listImageRiskConfigs =
        genForListImageRiskConfigs();

    private static HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> genForListImageRiskConfigs() {
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
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getEnterpriseProjectId,
                ListImageRiskConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageType,
                ListImageRiskConfigsRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getOffset, ListImageRiskConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getLimit, ListImageRiskConfigsRequest::setLimit));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getNamespace,
                ListImageRiskConfigsRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageName,
                ListImageRiskConfigsRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageVersion,
                ListImageRiskConfigsRequest::setImageVersion));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getCheckName,
                ListImageRiskConfigsRequest::setCheckName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getSeverity, ListImageRiskConfigsRequest::setSeverity));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getStandard, ListImageRiskConfigsRequest::setStandard));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getInstanceId,
                ListImageRiskConfigsRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getRegion, ListImageRiskConfigsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> listImageVulnerabilities =
        genForListImageVulnerabilities();

    private static HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> genForListImageVulnerabilities() {
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
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageId,
                ListImageVulnerabilitiesRequest::setImageId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getEnterpriseProjectId,
                ListImageVulnerabilitiesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageType,
                ListImageVulnerabilitiesRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getOffset,
                ListImageVulnerabilitiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getLimit,
                ListImageVulnerabilitiesRequest::setLimit));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getInstanceId,
                ListImageVulnerabilitiesRequest::setInstanceId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getNamespace,
                ListImageVulnerabilitiesRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageName,
                ListImageVulnerabilitiesRequest::setImageName));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getTagName,
                ListImageVulnerabilitiesRequest::setTagName));
        builder.<String>withRequestField("repair_necessity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRepairNecessity,
                ListImageVulnerabilitiesRequest::setRepairNecessity));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getVulId,
                ListImageVulnerabilitiesRequest::setVulId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getAppName,
                ListImageVulnerabilitiesRequest::setAppName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getType, ListImageVulnerabilitiesRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRegion,
                ListImageVulnerabilitiesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> listIsolatedFile =
        genForListIsolatedFile();

    private static HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> genForListIsolatedFile() {
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
            f -> f.withMarshaller(ListIsolatedFileRequest::getEnterpriseProjectId,
                ListIsolatedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getFilePath, ListIsolatedFileRequest::setFilePath));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getHostName, ListIsolatedFileRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getPrivateIp, ListIsolatedFileRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getPublicIp, ListIsolatedFileRequest::setPublicIp));
        builder.<String>withRequestField("file_hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getFileHash, ListIsolatedFileRequest::setFileHash));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getAssetValue, ListIsolatedFileRequest::setAssetValue));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getOffset, ListIsolatedFileRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getLimit, ListIsolatedFileRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getRegion, ListIsolatedFileRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfo =
        genForListJarPackageHostInfo();

    private static HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> genForListJarPackageHostInfo() {
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
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getEnterpriseProjectId,
                ListJarPackageHostInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getFileName,
                ListJarPackageHostInfoRequest::setFileName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getCategory,
                ListJarPackageHostInfoRequest::setCategory));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostName,
                ListJarPackageHostInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostIp, ListJarPackageHostInfoRequest::setHostIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getLimit, ListJarPackageHostInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getOffset, ListJarPackageHostInfoRequest::setOffset));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getPartMatch,
                ListJarPackageHostInfoRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatistics =
        genForListJarPackageStatistics();

    private static HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> genForListJarPackageStatistics() {
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
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getEnterpriseProjectId,
                ListJarPackageStatisticsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getFileName,
                ListJarPackageStatisticsRequest::setFileName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getCategory,
                ListJarPackageStatisticsRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getLimit,
                ListJarPackageStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getOffset,
                ListJarPackageStatisticsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTree =
        genForListOrganizationTree();

    private static HttpRequestDef<ListOrganizationTreeRequest, ListOrganizationTreeResponse> genForListOrganizationTree() {
        // basic
        HttpRequestDef.Builder<ListOrganizationTreeRequest, ListOrganizationTreeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOrganizationTreeRequest.class, ListOrganizationTreeResponse.class)
            .withName("ListOrganizationTree")
            .withUri("/v5/setting/account/organization-tree")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getIsRefresh,
                ListOrganizationTreeRequest::setIsRefresh));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getEnterpriseProjectId,
                ListOrganizationTreeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getXSecurityToken,
                ListOrganizationTreeRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getRegion, ListOrganizationTreeRequest::setRegion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOrganizationTreeResponse::getXRequestId,
                ListOrganizationTreeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexity =
        genForListPasswordComplexity();

    private static HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> genForListPasswordComplexity() {
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
            f -> f.withMarshaller(ListPasswordComplexityRequest::getEnterpriseProjectId,
                ListPasswordComplexityRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostName,
                ListPasswordComplexityRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostIp, ListPasswordComplexityRequest::setHostIp));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostId, ListPasswordComplexityRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getLimit, ListPasswordComplexityRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getOffset, ListPasswordComplexityRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroup =
        genForListPolicyGroup();

    private static HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> genForListPolicyGroup() {
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
            f -> f.withMarshaller(ListPolicyGroupRequest::getEnterpriseProjectId,
                ListPolicyGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getGroupName, ListPolicyGroupRequest::setGroupName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, ListPolicyGroupRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, ListPolicyGroupRequest::setLimit));
        builder.<Boolean>withRequestField("container_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getContainerMode, ListPolicyGroupRequest::setContainerMode));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getRegion, ListPolicyGroupRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortHostRequest, ListPortHostResponse> listPortHost = genForListPortHost();

    private static HttpRequestDef<ListPortHostRequest, ListPortHostResponse> genForListPortHost() {
        // basic
        HttpRequestDef.Builder<ListPortHostRequest, ListPortHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortHostRequest.class, ListPortHostResponse.class)
                .withName("ListPortHost")
                .withUri("/v5/{project_id}/asset/ports/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getEnterpriseProjectId,
                ListPortHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getHostName, ListPortHostRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getHostIp, ListPortHostRequest::setHostIp));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getPort, ListPortHostRequest::setPort));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getType, ListPortHostRequest::setType));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getCategory, ListPortHostRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getLimit, ListPortHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getOffset, ListPortHostRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatistics =
        genForListPortStatistics();

    private static HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> genForListPortStatistics() {
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
            f -> f.withMarshaller(ListPortStatisticsRequest::getPort, ListPortStatisticsRequest::setPort));
        builder.<String>withRequestField("port_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getPortString, ListPortStatisticsRequest::setPortString));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getType, ListPortStatisticsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getEnterpriseProjectId,
                ListPortStatisticsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortKey, ListPortStatisticsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortDir, ListPortStatisticsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getLimit, ListPortStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getOffset, ListPortStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getCategory, ListPortStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForListPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForListPorts() {
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
            f -> f.withMarshaller(ListPortsRequest::getHostId, ListPortsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostName, ListPortsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostIp, ListPortsRequest::setHostIp));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getPort, ListPortsRequest::setPort));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getType, ListPortsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, ListPortsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, ListPortsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getOffset, ListPortsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getCategory, ListPortsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatistics =
        genForListProcessStatistics();

    private static HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> genForListProcessStatistics() {
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
            f -> f.withMarshaller(ListProcessStatisticsRequest::getPath, ListProcessStatisticsRequest::setPath));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getEnterpriseProjectId,
                ListProcessStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getLimit, ListProcessStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getOffset, ListProcessStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getCategory,
                ListProcessStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessesHostRequest, ListProcessesHostResponse> listProcessesHost =
        genForListProcessesHost();

    private static HttpRequestDef<ListProcessesHostRequest, ListProcessesHostResponse> genForListProcessesHost() {
        // basic
        HttpRequestDef.Builder<ListProcessesHostRequest, ListProcessesHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProcessesHostRequest.class, ListProcessesHostResponse.class)
                .withName("ListProcessesHost")
                .withUri("/v5/{project_id}/asset/processes/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getEnterpriseProjectId,
                ListProcessesHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getHostName, ListProcessesHostRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getHostIp, ListProcessesHostRequest::setHostIp));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getPath, ListProcessesHostRequest::setPath));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getCategory, ListProcessesHostRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getLimit, ListProcessesHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getOffset, ListProcessesHostRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicy =
        genForListProtectionPolicy();

    private static HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> genForListProtectionPolicy() {
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
            f -> f.withMarshaller(ListProtectionPolicyRequest::getEnterpriseProjectId,
                ListProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOffset, ListProtectionPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getLimit, ListProtectionPolicyRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getPolicyName,
                ListProtectionPolicyRequest::setPolicyName));
        builder.<String>withRequestField("protect_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getProtectPolicyId,
                ListProtectionPolicyRequest::setProtectPolicyId));
        builder.<String>withRequestField("operating_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOperatingSystem,
                ListProtectionPolicyRequest::setOperatingSystem));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getRegion, ListProtectionPolicyRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServer =
        genForListProtectionServer();

    private static HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> genForListProtectionServer() {
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
            f -> f.withMarshaller(ListProtectionServerRequest::getEnterpriseProjectId,
                ListProtectionServerRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOffset, ListProtectionServerRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLimit, ListProtectionServerRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostName, ListProtectionServerRequest::setHostName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOsType, ListProtectionServerRequest::setOsType));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostIp, ListProtectionServerRequest::setHostIp));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostStatus,
                ListProtectionServerRequest::setHostStatus));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLastDays, ListProtectionServerRequest::setLastDays));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getRegion, ListProtectionServerRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryExportTaskRequest, ListQueryExportTaskResponse> listQueryExportTask =
        genForListQueryExportTask();

    private static HttpRequestDef<ListQueryExportTaskRequest, ListQueryExportTaskResponse> genForListQueryExportTask() {
        // basic
        HttpRequestDef.Builder<ListQueryExportTaskRequest, ListQueryExportTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueryExportTaskRequest.class, ListQueryExportTaskResponse.class)
                .withName("ListQueryExportTask")
                .withUri("/v5/{project_id}/export-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getTaskId, ListQueryExportTaskRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getEnterpriseProjectId,
                ListQueryExportTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getRegion, ListQueryExportTaskRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetail =
        genForListQuotasDetail();

    private static HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> genForListQuotasDetail() {
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
            f -> f.withMarshaller(ListQuotasDetailRequest::getEnterpriseProjectId,
                ListQuotasDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getVersion, ListQuotasDetailRequest::setVersion));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getCategory, ListQuotasDetailRequest::setCategory));
        builder.<String>withRequestField("quota_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getQuotaStatus, ListQuotasDetailRequest::setQuotaStatus));
        builder.<String>withRequestField("used_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getUsedStatus, ListQuotasDetailRequest::setUsedStatus));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getHostName, ListQuotasDetailRequest::setHostName));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getResourceId, ListQuotasDetailRequest::setResourceId));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getChargingMode, ListQuotasDetailRequest::setChargingMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getLimit, ListQuotasDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getOffset, ListQuotasDetailRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getRegion, ListQuotasDetailRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRules =
        genForListRiskConfigCheckRules();

    private static HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> genForListRiskConfigCheckRules() {
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
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckName,
                ListRiskConfigCheckRulesRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getEnterpriseProjectId,
                ListRiskConfigCheckRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getStandard,
                ListRiskConfigCheckRulesRequest::setStandard));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getResultType,
                ListRiskConfigCheckRulesRequest::setResultType));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckRuleName,
                ListRiskConfigCheckRulesRequest::setCheckRuleName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getSeverity,
                ListRiskConfigCheckRulesRequest::setSeverity));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getHostId,
                ListRiskConfigCheckRulesRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getLimit,
                ListRiskConfigCheckRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getOffset,
                ListRiskConfigCheckRulesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHosts =
        genForListRiskConfigHosts();

    private static HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> genForListRiskConfigHosts() {
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
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getCheckName, ListRiskConfigHostsRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getEnterpriseProjectId,
                ListRiskConfigHostsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getStandard, ListRiskConfigHostsRequest::setStandard));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostName, ListRiskConfigHostsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostIp, ListRiskConfigHostsRequest::setHostIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getLimit, ListRiskConfigHostsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getOffset, ListRiskConfigHostsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigs =
        genForListRiskConfigs();

    private static HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> genForListRiskConfigs() {
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
            f -> f.withMarshaller(ListRiskConfigsRequest::getEnterpriseProjectId,
                ListRiskConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getCheckName, ListRiskConfigsRequest::setCheckName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getGroupId, ListRiskConfigsRequest::setGroupId));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getSeverity, ListRiskConfigsRequest::setSeverity));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getStandard, ListRiskConfigsRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getHostId, ListRiskConfigsRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getLimit, ListRiskConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getOffset, ListRiskConfigsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEvents =
        genForListSecurityEvents();

    private static HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> genForListSecurityEvents() {
        // basic
        HttpRequestDef.Builder<ListSecurityEventsRequest, ListSecurityEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityEventsRequest.class, ListSecurityEventsResponse.class)
                .withName("ListSecurityEvents")
                .withUri("/v5/{project_id}/event/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getCategory, ListSecurityEventsRequest::setCategory));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEnterpriseProjectId,
                ListSecurityEventsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLastDays, ListSecurityEventsRequest::setLastDays));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostName, ListSecurityEventsRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostId, ListSecurityEventsRequest::setHostId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getPrivateIp, ListSecurityEventsRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getPublicIp, ListSecurityEventsRequest::setPublicIp));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getContainerName,
                ListSecurityEventsRequest::setContainerName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getOffset, ListSecurityEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLimit, ListSecurityEventsRequest::setLimit));
        builder.<List<Integer>>withRequestField("event_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventTypes, ListSecurityEventsRequest::setEventTypes));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHandleStatus,
                ListSecurityEventsRequest::setHandleStatus));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverity, ListSecurityEventsRequest::setSeverity));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getBeginTime, ListSecurityEventsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEndTime, ListSecurityEventsRequest::setEndTime));
        builder.<List<String>>withRequestField("event_class_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventClassIds,
                ListSecurityEventsRequest::setEventClassIds));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverityList,
                ListSecurityEventsRequest::setSeverityList));
        builder.<String>withRequestField("attack_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttackTag, ListSecurityEventsRequest::setAttackTag));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAssetValue, ListSecurityEventsRequest::setAssetValue));
        builder.<List<String>>withRequestField("tag_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getTagList, ListSecurityEventsRequest::setTagList));
        builder.<String>withRequestField("att_ck",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttCk, ListSecurityEventsRequest::setAttCk));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventName, ListSecurityEventsRequest::setEventName));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getRegion, ListSecurityEventsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> listSwrImageRepository =
        genForListSwrImageRepository();

    private static HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> genForListSwrImageRepository() {
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
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEnterpriseProjectId,
                ListSwrImageRepositoryRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getNamespace,
                ListSwrImageRepositoryRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageName,
                ListSwrImageRepositoryRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageVersion,
                ListSwrImageRepositoryRequest::setImageVersion));
        builder.<Boolean>withRequestField("latest_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLatestVersion,
                ListSwrImageRepositoryRequest::setLatestVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getOffset, ListSwrImageRepositoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLimit, ListSwrImageRepositoryRequest::setLimit));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageType,
                ListSwrImageRepositoryRequest::setImageType));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getScanStatus,
                ListSwrImageRepositoryRequest::setScanStatus));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getInstanceName,
                ListSwrImageRepositoryRequest::setInstanceName));
        builder.<Long>withRequestField("image_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageSize,
                ListSwrImageRepositoryRequest::setImageSize));
        builder.<Long>withRequestField("start_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getStartLatestUpdateTime,
                ListSwrImageRepositoryRequest::setStartLatestUpdateTime));
        builder.<Long>withRequestField("end_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEndLatestUpdateTime,
                ListSwrImageRepositoryRequest::setEndLatestUpdateTime));
        builder.<Long>withRequestField("start_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getStartLatestScanTime,
                ListSwrImageRepositoryRequest::setStartLatestScanTime));
        builder.<Long>withRequestField("end_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEndLatestScanTime,
                ListSwrImageRepositoryRequest::setEndLatestScanTime));
        builder.<Boolean>withRequestField("has_malicious_file",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasMaliciousFile,
                ListSwrImageRepositoryRequest::setHasMaliciousFile));
        builder.<Boolean>withRequestField("has_unsafe_setting",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasUnsafeSetting,
                ListSwrImageRepositoryRequest::setHasUnsafeSetting));
        builder.<Boolean>withRequestField("has_vul",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasVul, ListSwrImageRepositoryRequest::setHasVul));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getInstanceId,
                ListSwrImageRepositoryRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getRegion, ListSwrImageRepositoryRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistories =
        genForListUserChangeHistories();

    private static HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> genForListUserChangeHistories() {
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
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getUserName,
                ListUserChangeHistoriesRequest::setUserName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostId,
                ListUserChangeHistoriesRequest::setHostId));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getRootPermission,
                ListUserChangeHistoriesRequest::setRootPermission));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostName,
                ListUserChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getPrivateIp,
                ListUserChangeHistoriesRequest::setPrivateIp));
        builder.<String>withRequestField("change_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getChangeType,
                ListUserChangeHistoriesRequest::setChangeType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getLimit, ListUserChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getOffset,
                ListUserChangeHistoriesRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEnterpriseProjectId,
                ListUserChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getStartTime,
                ListUserChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEndTime,
                ListUserChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatistics =
        genForListUserStatistics();

    private static HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> genForListUserStatistics() {
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
            f -> f.withMarshaller(ListUserStatisticsRequest::getUserName, ListUserStatisticsRequest::setUserName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getEnterpriseProjectId,
                ListUserStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getLimit, ListUserStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getOffset, ListUserStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getCategory, ListUserStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
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
            f -> f.withMarshaller(ListUsersRequest::getHostId, ListUsersRequest::setHostId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, ListUsersRequest::setUserName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getHostName, ListUsersRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getPrivateIp, ListUsersRequest::setPrivateIp));
        builder.<Boolean>withRequestField("login_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getLoginPermission, ListUsersRequest::setLoginPermission));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getRootPermission, ListUsersRequest::setRootPermission));
        builder.<String>withRequestField("user_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserGroup, ListUsersRequest::setUserGroup));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getEnterpriseProjectId, ListUsersRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getCategory, ListUsersRequest::setCategory));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getPartMatch, ListUsersRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> listVulHosts = genForListVulHosts();

    private static HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> genForListVulHosts() {
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
            f -> f.withMarshaller(ListVulHostsRequest::getEnterpriseProjectId,
                ListVulHostsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getVulId, ListVulHostsRequest::setVulId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getType, ListVulHostsRequest::setType));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostName, ListVulHostsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostIp, ListVulHostsRequest::setHostIp));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getStatus, ListVulHostsRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getLimit, ListVulHostsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getOffset, ListVulHostsRequest::setOffset));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getAssetValue, ListVulHostsRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getGroupName, ListVulHostsRequest::setGroupName));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHandleStatus, ListVulHostsRequest::setHandleStatus));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getSeverityLevel, ListVulHostsRequest::setSeverityLevel));
        builder.<Boolean>withRequestField("is_affect_business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVulHostsRequest::getIsAffectBusiness, ListVulHostsRequest::setIsAffectBusiness));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getRepairPriority, ListVulHostsRequest::setRepairPriority));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulScanTaskRequest, ListVulScanTaskResponse> listVulScanTask =
        genForListVulScanTask();

    private static HttpRequestDef<ListVulScanTaskRequest, ListVulScanTaskResponse> genForListVulScanTask() {
        // basic
        HttpRequestDef.Builder<ListVulScanTaskRequest, ListVulScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulScanTaskRequest.class, ListVulScanTaskResponse.class)
                .withName("ListVulScanTask")
                .withUri("/v5/{project_id}/vulnerability/scan-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getEnterpriseProjectId,
                ListVulScanTaskRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getLimit, ListVulScanTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getOffset, ListVulScanTaskRequest::setOffset));
        builder.<String>withRequestField("scan_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getScanType, ListVulScanTaskRequest::setScanType));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getTaskId, ListVulScanTaskRequest::setTaskId));
        builder.<Long>withRequestField("min_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getMinStartTime, ListVulScanTaskRequest::setMinStartTime));
        builder.<Long>withRequestField("max_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getMaxStartTime, ListVulScanTaskRequest::setMaxStartTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> listVulScanTaskHost =
        genForListVulScanTaskHost();

    private static HttpRequestDef<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> genForListVulScanTaskHost() {
        // basic
        HttpRequestDef.Builder<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulScanTaskHostRequest.class, ListVulScanTaskHostResponse.class)
                .withName("ListVulScanTaskHost")
                .withUri("/v5/{project_id}/vulnerability/scan-task/{task_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getTaskId, ListVulScanTaskHostRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getEnterpriseProjectId,
                ListVulScanTaskHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getLimit, ListVulScanTaskHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getOffset, ListVulScanTaskHostRequest::setOffset));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getScanStatus,
                ListVulScanTaskHostRequest::setScanStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilities =
        genForListVulnerabilities();

    private static HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> genForListVulnerabilities() {
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
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getEnterpriseProjectId,
                ListVulnerabilitiesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getType, ListVulnerabilitiesRequest::setType));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulId, ListVulnerabilitiesRequest::setVulId));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulName, ListVulnerabilitiesRequest::setVulName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLimit, ListVulnerabilitiesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getOffset, ListVulnerabilitiesRequest::setOffset));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getRepairPriority,
                ListVulnerabilitiesRequest::setRepairPriority));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getHandleStatus,
                ListVulnerabilitiesRequest::setHandleStatus));
        builder.<String>withRequestField("cve_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getCveId, ListVulnerabilitiesRequest::setCveId));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLabelList, ListVulnerabilitiesRequest::setLabelList));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getStatus, ListVulnerabilitiesRequest::setStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getAssetValue,
                ListVulnerabilitiesRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getGroupName, ListVulnerabilitiesRequest::setGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> listVulnerabilityCve =
        genForListVulnerabilityCve();

    private static HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> genForListVulnerabilityCve() {
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
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getVulId, ListVulnerabilityCveRequest::setVulId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getEnterpriseProjectId,
                ListVulnerabilityCveRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getOffset, ListVulnerabilityCveRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getLimit, ListVulnerabilityCveRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getRegion, ListVulnerabilityCveRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsers =
        genForListWeakPasswordUsers();

    private static HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> genForListWeakPasswordUsers() {
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
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getEnterpriseProjectId,
                ListWeakPasswordUsersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostName,
                ListWeakPasswordUsersRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostIp, ListWeakPasswordUsersRequest::setHostIp));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getUserName,
                ListWeakPasswordUsersRequest::setUserName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostId, ListWeakPasswordUsersRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getLimit, ListWeakPasswordUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getOffset, ListWeakPasswordUsersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHost =
        genForListWtpProtectHost();

    private static HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> genForListWtpProtectHost() {
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
            f -> f.withMarshaller(ListWtpProtectHostRequest::getEnterpriseProjectId,
                ListWtpProtectHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostName, ListWtpProtectHostRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostId, ListWtpProtectHostRequest::setHostId));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPublicIp, ListWtpProtectHostRequest::setPublicIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPrivateIp, ListWtpProtectHostRequest::setPrivateIp));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getGroupName, ListWtpProtectHostRequest::setGroupName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOsType, ListWtpProtectHostRequest::setOsType));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getProtectStatus,
                ListWtpProtectHostRequest::setProtectStatus));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getAgentStatus,
                ListWtpProtectHostRequest::setAgentStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getLimit, ListWtpProtectHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOffset, ListWtpProtectHostRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getRegion, ListWtpProtectHostRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> runImageSynchronize =
        genForRunImageSynchronize();

    private static HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> genForRunImageSynchronize() {
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
            f -> f.withMarshaller(RunImageSynchronizeRequest::getEnterpriseProjectId,
                RunImageSynchronizeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getRegion, RunImageSynchronizeRequest::setRegion));
        builder.<RunImageSynchronizeRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunImageSynchronizeRequestInfo.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getBody, RunImageSynchronizeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitch =
        genForSetRaspSwitch();

    private static HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> genForSetRaspSwitch() {
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
            f -> f.withMarshaller(SetRaspSwitchRequest::getEnterpriseProjectId,
                SetRaspSwitchRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getRegion, SetRaspSwitchRequest::setRegion));
        builder.<SetRaspSwitchRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRaspSwitchRequestInfo.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getBody, SetRaspSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfo =
        genForSetWtpProtectionStatusInfo();

    private static HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> genForSetWtpProtectionStatusInfo() {
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
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getEnterpriseProjectId,
                SetWtpProtectionStatusInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getRegion,
                SetWtpProtectionStatusInfoRequest::setRegion));
        builder.<SetWtpProtectionStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetWtpProtectionStatusRequestInfo.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getBody,
                SetWtpProtectionStatusInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatistic =
        genForShowAssetStatistic();

    private static HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> genForShowAssetStatistic() {
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
            f -> f.withMarshaller(ShowAssetStatisticRequest::getEnterpriseProjectId,
                ShowAssetStatisticRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getHostId, ShowAssetStatisticRequest::setHostId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getCategory, ShowAssetStatisticRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfo =
        genForShowBackupPolicyInfo();

    private static HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> genForShowBackupPolicyInfo() {
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
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getEnterpriseProjectId,
                ShowBackupPolicyInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getRegion, ShowBackupPolicyInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetail =
        genForShowCheckRuleDetail();

    private static HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> genForShowCheckRuleDetail() {
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
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getEnterpriseProjectId,
                ShowCheckRuleDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckName, ShowCheckRuleDetailRequest::setCheckName));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckType, ShowCheckRuleDetailRequest::setCheckType));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckRuleId,
                ShowCheckRuleDetailRequest::setCheckRuleId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getStandard, ShowCheckRuleDetailRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getHostId, ShowCheckRuleDetailRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> showImageCheckRuleDetail =
        genForShowImageCheckRuleDetail();

    private static HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> genForShowImageCheckRuleDetail() {
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
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getEnterpriseProjectId,
                ShowImageCheckRuleDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageType,
                ShowImageCheckRuleDetailRequest::setImageType));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getNamespace,
                ShowImageCheckRuleDetailRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageName,
                ShowImageCheckRuleDetailRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageVersion,
                ShowImageCheckRuleDetailRequest::setImageVersion));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckName,
                ShowImageCheckRuleDetailRequest::setCheckName));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckType,
                ShowImageCheckRuleDetailRequest::setCheckType));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckRuleId,
                ShowImageCheckRuleDetailRequest::setCheckRuleId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getStandard,
                ShowImageCheckRuleDetailRequest::setStandard));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getInstanceId,
                ShowImageCheckRuleDetailRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getRegion,
                ShowImageCheckRuleDetailRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> showProductdataOfferingInfos =
        genForShowProductdataOfferingInfos();

    private static HttpRequestDef<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> genForShowProductdataOfferingInfos() {
        // basic
        HttpRequestDef.Builder<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProductdataOfferingInfosRequest.class,
                    ShowProductdataOfferingInfosResponse.class)
                .withName("ShowProductdataOfferingInfos")
                .withUri("/v5/{project_id}/product/productdata/offering-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getEnterpriseProjectId,
                ShowProductdataOfferingInfosRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("site_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getSiteCode,
                ShowProductdataOfferingInfosRequest::setSiteCode));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getRegion,
                ShowProductdataOfferingInfosRequest::setRegion));

        // response
        builder.<List<ResourceProductDataObjectInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowProductdataOfferingInfosResponse::getBody,
                    ShowProductdataOfferingInfosResponse::setBody)
                .withInnerContainerType(ResourceProductDataObjectInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotas =
        genForShowResourceQuotas();

    private static HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> genForShowResourceQuotas() {
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
            f -> f.withMarshaller(ShowResourceQuotasRequest::getEnterpriseProjectId,
                ShowResourceQuotasRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getVersion, ShowResourceQuotasRequest::setVersion));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getChargingMode,
                ShowResourceQuotasRequest::setChargingMode));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getRegion, ShowResourceQuotasRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetail =
        genForShowRiskConfigDetail();

    private static HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> genForShowRiskConfigDetail() {
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
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getCheckName,
                ShowRiskConfigDetailRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getEnterpriseProjectId,
                ShowRiskConfigDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getStandard, ShowRiskConfigDetailRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getHostId, ShowRiskConfigDetailRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getLimit, ShowRiskConfigDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getOffset, ShowRiskConfigDetailRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> showVulScanPolicy =
        genForShowVulScanPolicy();

    private static HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> genForShowVulScanPolicy() {
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
            f -> f.withMarshaller(ShowVulScanPolicyRequest::getEnterpriseProjectId,
                ShowVulScanPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> showVulStatics =
        genForShowVulStatics();

    private static HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> genForShowVulStatics() {
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
            f -> f.withMarshaller(ShowVulStaticsRequest::getEnterpriseProjectId,
                ShowVulStaticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartProtectionRequest, StartProtectionResponse> startProtection =
        genForStartProtection();

    private static HttpRequestDef<StartProtectionRequest, StartProtectionResponse> genForStartProtection() {
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
            f -> f.withMarshaller(StartProtectionRequest::getEnterpriseProjectId,
                StartProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionRequest::getRegion, StartProtectionRequest::setRegion));
        builder.<ProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StartProtectionRequest::getBody, StartProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopProtectionRequest, StopProtectionResponse> stopProtection =
        genForStopProtection();

    private static HttpRequestDef<StopProtectionRequest, StopProtectionResponse> genForStopProtection() {
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
            f -> f.withMarshaller(StopProtectionRequest::getEnterpriseProjectId,
                StopProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionRequest::getRegion, StopProtectionRequest::setRegion));
        builder.<CloseProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloseProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StopProtectionRequest::getBody, StopProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatus =
        genForSwitchHostsProtectStatus();

    private static HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> genForSwitchHostsProtectStatus() {
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
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getEnterpriseProjectId,
                SwitchHostsProtectStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getRegion,
                SwitchHostsProtectStatusRequest::setRegion));
        builder.<SwitchHostsProtectStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchHostsProtectStatusRequestInfo.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getBody, SwitchHostsProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> updateAgentDaemonset =
        genForUpdateAgentDaemonset();

    private static HttpRequestDef<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> genForUpdateAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAgentDaemonsetRequest.class, UpdateAgentDaemonsetResponse.class)
            .withName("UpdateAgentDaemonset")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getClusterId,
                UpdateAgentDaemonsetRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getEnterpriseProjectId,
                UpdateAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getRegion, UpdateAgentDaemonsetRequest::setRegion));
        builder.<UpdateDaemonsetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDaemonsetRequestBody.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getBody, UpdateAgentDaemonsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfo =
        genForUpdateBackupPolicyInfo();

    private static HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> genForUpdateBackupPolicyInfo() {
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
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getEnterpriseProjectId,
                UpdateBackupPolicyInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getRegion, UpdateBackupPolicyInfoRequest::setRegion));
        builder.<UpdateBackupPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBackupPolicyRequestInfo.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getBody, UpdateBackupPolicyInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicy =
        genForUpdateProtectionPolicy();

    private static HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> genForUpdateProtectionPolicy() {
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
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getEnterpriseProjectId,
                UpdateProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getRegion, UpdateProtectionPolicyRequest::setRegion));
        builder.<UpdateProtectionPolicyInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectionPolicyInfoRequestInfo.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getBody, UpdateProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

}

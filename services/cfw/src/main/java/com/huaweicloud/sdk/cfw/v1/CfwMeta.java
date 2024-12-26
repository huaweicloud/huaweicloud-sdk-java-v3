package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemsInfoDto;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetDto;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListDto;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainListDto;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetInfoDto;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddRuleAclDto;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsUsingPOSTRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetUsingPOSTRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.AdvancedIpsRuleDto;
import com.huaweicloud.sdk.cfw.v1.model.AntiVirusRuleDto;
import com.huaweicloud.sdk.cfw.v1.model.AntiVirusSwitchDto;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetsDto;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskDto;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.CaptureTaskDto;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsRuleModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsRuleModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeProtectStatusRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.ClearAccessLogRuleHitCountsDto;
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallReq;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagsDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemsInfoDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteRuleAclDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemDto;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagsDto;
import com.huaweicloud.sdk.cfw.v1.model.EipOperateProtectReq;
import com.huaweicloud.sdk.cfw.v1.model.IpsProtectDTO;
import com.huaweicloud.sdk.cfw.v1.model.IpsRuleChangeDto;
import com.huaweicloud.sdk.cfw.v1.model.IpsSwitchDTO;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRuleHitCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAddressSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAlarmWhitelistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAlarmWhitelistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureResultRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureResultResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseIpRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseIpResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEipCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEipCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListEipsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListEipsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallListRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFirewallListResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsProtectModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsProtectModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRules1Request;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRules1Response;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListJobRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListJobResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleHitCountDto;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.LogConfigDto;
import com.huaweicloud.sdk.cfw.v1.model.OrderRuleAclDto;
import com.huaweicloud.sdk.cfw.v1.model.QueryFireWallInstanceDto;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeResponse;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.SwitchEipStatusDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAdvancedIpsRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAdvancedIpsRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAlarmConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAlarmConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAntiVirusSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAttackLogAlarmConfigDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetInfoDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateRuleAclDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateSecurityPolciesActionDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetUsingPUTRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CfwMeta {

    public static final HttpRequestDef<AddAddressItemRequest, AddAddressItemResponse> addAddressItem =
        genForAddAddressItem();

    private static HttpRequestDef<AddAddressItemRequest, AddAddressItemResponse> genForAddAddressItem() {
        // basic
        HttpRequestDef.Builder<AddAddressItemRequest, AddAddressItemResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAddressItemRequest.class, AddAddressItemResponse.class)
                .withName("AddAddressItem")
                .withUri("/v1/{project_id}/address-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressItemRequest::getEnterpriseProjectId,
                AddAddressItemRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressItemRequest::getFwInstanceId, AddAddressItemRequest::setFwInstanceId));
        builder.<AddAddressItemsInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressItemsInfoDto.class),
            f -> f.withMarshaller(AddAddressItemRequest::getBody, AddAddressItemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAddressSetRequest, AddAddressSetResponse> addAddressSet =
        genForAddAddressSet();

    private static HttpRequestDef<AddAddressSetRequest, AddAddressSetResponse> genForAddAddressSet() {
        // basic
        HttpRequestDef.Builder<AddAddressSetRequest, AddAddressSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAddressSetRequest.class, AddAddressSetResponse.class)
                .withName("AddAddressSet")
                .withUri("/v1/{project_id}/address-set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressSetRequest::getEnterpriseProjectId,
                AddAddressSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressSetRequest::getFwInstanceId, AddAddressSetRequest::setFwInstanceId));
        builder.<AddAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressSetDto.class),
            f -> f.withMarshaller(AddAddressSetRequest::getBody, AddAddressSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteList =
        genForAddBlackWhiteList();

    private static HttpRequestDef<AddBlackWhiteListRequest, AddBlackWhiteListResponse> genForAddBlackWhiteList() {
        // basic
        HttpRequestDef.Builder<AddBlackWhiteListRequest, AddBlackWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddBlackWhiteListRequest.class, AddBlackWhiteListResponse.class)
                .withName("AddBlackWhiteList")
                .withUri("/v1/{project_id}/black-white-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBlackWhiteListRequest::getEnterpriseProjectId,
                AddBlackWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBlackWhiteListRequest::getFwInstanceId,
                AddBlackWhiteListRequest::setFwInstanceId));
        builder.<AddBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBlackWhiteListDto.class),
            f -> f.withMarshaller(AddBlackWhiteListRequest::getBody, AddBlackWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDomainSetRequest, AddDomainSetResponse> addDomainSet = genForAddDomainSet();

    private static HttpRequestDef<AddDomainSetRequest, AddDomainSetResponse> genForAddDomainSet() {
        // basic
        HttpRequestDef.Builder<AddDomainSetRequest, AddDomainSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDomainSetRequest.class, AddDomainSetResponse.class)
                .withName("AddDomainSet")
                .withUri("/v1/{project_id}/domain-set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainSetRequest::getEnterpriseProjectId,
                AddDomainSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainSetRequest::getFwInstanceId, AddDomainSetRequest::setFwInstanceId));
        builder.<AddDomainSetInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDomainSetInfoDto.class),
            f -> f.withMarshaller(AddDomainSetRequest::getBody, AddDomainSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDomainsRequest, AddDomainsResponse> addDomains = genForAddDomains();

    private static HttpRequestDef<AddDomainsRequest, AddDomainsResponse> genForAddDomains() {
        // basic
        HttpRequestDef.Builder<AddDomainsRequest, AddDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDomainsRequest.class, AddDomainsResponse.class)
                .withName("AddDomains")
                .withUri("/v1/{project_id}/domain-set/domains/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainsRequest::getSetId, AddDomainsRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainsRequest::getEnterpriseProjectId,
                AddDomainsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainsRequest::getFwInstanceId, AddDomainsRequest::setFwInstanceId));
        builder.<AddDomainListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDomainListDto.class),
            f -> f.withMarshaller(AddDomainsRequest::getBody, AddDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddLogConfigRequest, AddLogConfigResponse> addLogConfig = genForAddLogConfig();

    private static HttpRequestDef<AddLogConfigRequest, AddLogConfigResponse> genForAddLogConfig() {
        // basic
        HttpRequestDef.Builder<AddLogConfigRequest, AddLogConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddLogConfigRequest.class, AddLogConfigResponse.class)
                .withName("AddLogConfig")
                .withUri("/v1/{project_id}/cfw/logs/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddLogConfigRequest::getFwInstanceId, AddLogConfigRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddLogConfigRequest::getEnterpriseProjectId,
                AddLogConfigRequest::setEnterpriseProjectId));
        builder.<LogConfigDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogConfigDto.class),
            f -> f.withMarshaller(AddLogConfigRequest::getBody, AddLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItems =
        genForAddServiceItems();

    private static HttpRequestDef<AddServiceItemsRequest, AddServiceItemsResponse> genForAddServiceItems() {
        // basic
        HttpRequestDef.Builder<AddServiceItemsRequest, AddServiceItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddServiceItemsRequest.class, AddServiceItemsResponse.class)
                .withName("AddServiceItems")
                .withUri("/v1/{project_id}/service-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceItemsRequest::getEnterpriseProjectId,
                AddServiceItemsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceItemsRequest::getFwInstanceId, AddServiceItemsRequest::setFwInstanceId));
        builder.<AddServiceItemsUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceItemsUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceItemsRequest::getBody, AddServiceItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceSetRequest, AddServiceSetResponse> addServiceSet =
        genForAddServiceSet();

    private static HttpRequestDef<AddServiceSetRequest, AddServiceSetResponse> genForAddServiceSet() {
        // basic
        HttpRequestDef.Builder<AddServiceSetRequest, AddServiceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddServiceSetRequest.class, AddServiceSetResponse.class)
                .withName("AddServiceSet")
                .withUri("/v1/{project_id}/service-set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceSetRequest::getEnterpriseProjectId,
                AddServiceSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceSetRequest::getFwInstanceId, AddServiceSetRequest::setFwInstanceId));
        builder.<AddServiceSetUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceSetUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceSetRequest::getBody, AddServiceSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItems =
        genForBatchDeleteAddressItems();

    private static HttpRequestDef<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> genForBatchDeleteAddressItems() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteAddressItemsRequest.class, BatchDeleteAddressItemsResponse.class)
            .withName("BatchDeleteAddressItems")
            .withUri("/v1/{project_id}/address-items")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getEnterpriseProjectId,
                BatchDeleteAddressItemsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getFwInstanceId,
                BatchDeleteAddressItemsRequest::setFwInstanceId));
        builder.<DeleteAddressItemsInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAddressItemsInfoDto.class),
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getBody, BatchDeleteAddressItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> batchDeleteDomainSet =
        genForBatchDeleteDomainSet();

    private static HttpRequestDef<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> genForBatchDeleteDomainSet() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteDomainSetRequest.class, BatchDeleteDomainSetResponse.class)
            .withName("BatchDeleteDomainSet")
            .withUri("/v1/{project_id}/domain-sets/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDomainSetRequest::getFwInstanceId,
                BatchDeleteDomainSetRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDomainSetRequest::getEnterpriseProjectId,
                BatchDeleteDomainSetRequest::setEnterpriseProjectId));
        builder.<BatchDeleteDomainSetsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDomainSetsDto.class),
            f -> f.withMarshaller(BatchDeleteDomainSetRequest::getBody, BatchDeleteDomainSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItems =
        genForBatchDeleteServiceItems();

    private static HttpRequestDef<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> genForBatchDeleteServiceItems() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteServiceItemsRequest.class, BatchDeleteServiceItemsResponse.class)
            .withName("BatchDeleteServiceItems")
            .withUri("/v1/{project_id}/service-items")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getEnterpriseProjectId,
                BatchDeleteServiceItemsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getFwInstanceId,
                BatchDeleteServiceItemsRequest::setFwInstanceId));
        builder.<DeleteServiceItemDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServiceItemDto.class),
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getBody, BatchDeleteServiceItemsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelCaptureTaskRequest, CancelCaptureTaskResponse> cancelCaptureTask =
        genForCancelCaptureTask();

    private static HttpRequestDef<CancelCaptureTaskRequest, CancelCaptureTaskResponse> genForCancelCaptureTask() {
        // basic
        HttpRequestDef.Builder<CancelCaptureTaskRequest, CancelCaptureTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelCaptureTaskRequest.class, CancelCaptureTaskResponse.class)
                .withName("CancelCaptureTask")
                .withUri("/v1/{project_id}/capture-task/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelCaptureTaskRequest::getFwInstanceId,
                CancelCaptureTaskRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelCaptureTaskRequest::getEnterpriseProjectId,
                CancelCaptureTaskRequest::setEnterpriseProjectId));
        builder.<CancelCaptureTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelCaptureTaskDto.class),
            f -> f.withMarshaller(CancelCaptureTaskRequest::getBody, CancelCaptureTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatus =
        genForChangeEastWestFirewallStatus();

    private static HttpRequestDef<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> genForChangeEastWestFirewallStatus() {
        // basic
        HttpRequestDef.Builder<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeEastWestFirewallStatusRequest.class,
                    ChangeEastWestFirewallStatusResponse.class)
                .withName("ChangeEastWestFirewallStatus")
                .withUri("/v1/{project_id}/firewall/east-west/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getEnterpriseProjectId,
                ChangeEastWestFirewallStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getFwInstanceId,
                ChangeEastWestFirewallStatusRequest::setFwInstanceId));
        builder.<ChangeProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeProtectStatusRequestBody.class),
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getBody,
                ChangeEastWestFirewallStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCaptureTaskRequest, CreateCaptureTaskResponse> createCaptureTask =
        genForCreateCaptureTask();

    private static HttpRequestDef<CreateCaptureTaskRequest, CreateCaptureTaskResponse> genForCreateCaptureTask() {
        // basic
        HttpRequestDef.Builder<CreateCaptureTaskRequest, CreateCaptureTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCaptureTaskRequest.class, CreateCaptureTaskResponse.class)
                .withName("CreateCaptureTask")
                .withUri("/v1/{project_id}/capture-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaptureTaskRequest::getEnterpriseProjectId,
                CreateCaptureTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCaptureTaskRequest::getFwInstanceId,
                CreateCaptureTaskRequest::setFwInstanceId));
        builder.<CaptureTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CaptureTaskDto.class),
            f -> f.withMarshaller(CreateCaptureTaskRequest::getBody, CreateCaptureTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewall =
        genForCreateEastWestFirewall();

    private static HttpRequestDef<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> genForCreateEastWestFirewall() {
        // basic
        HttpRequestDef.Builder<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEastWestFirewallRequest.class, CreateEastWestFirewallResponse.class)
            .withName("CreateEastWestFirewall")
            .withUri("/v1/{project_id}/firewall/east-west")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getEnterpriseProjectId,
                CreateEastWestFirewallRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getFwInstanceId,
                CreateEastWestFirewallRequest::setFwInstanceId));
        builder.<CreateEastWestFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEastWestFirewallRequestBody.class),
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getBody, CreateEastWestFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForCreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForCreateFirewall() {
        // basic
        HttpRequestDef.Builder<CreateFirewallRequest, CreateFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFirewallRequest.class, CreateFirewallResponse.class)
                .withName("CreateFirewall")
                .withUri("/v2/{project_id}/firewall")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFirewallRequest::getXClientToken, CreateFirewallRequest::setXClientToken));
        builder.<CreateFirewallReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallReq.class),
            f -> f.withMarshaller(CreateFirewallRequest::getBody, CreateFirewallRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/cfw-cfw/{fw_instance_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getFwInstanceId, CreateTagRequest::setFwInstanceId));
        builder.<CreateTagsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagsDto.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTagResponse::getBody, CreateTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItem =
        genForDeleteAddressItem();

    private static HttpRequestDef<DeleteAddressItemRequest, DeleteAddressItemResponse> genForDeleteAddressItem() {
        // basic
        HttpRequestDef.Builder<DeleteAddressItemRequest, DeleteAddressItemResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAddressItemRequest.class, DeleteAddressItemResponse.class)
                .withName("DeleteAddressItem")
                .withUri("/v1/{project_id}/address-items/{item_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("item_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemRequest::getItemId, DeleteAddressItemRequest::setItemId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemRequest::getEnterpriseProjectId,
                DeleteAddressItemRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemRequest::getFwInstanceId,
                DeleteAddressItemRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSet =
        genForDeleteAddressSet();

    private static HttpRequestDef<DeleteAddressSetRequest, DeleteAddressSetResponse> genForDeleteAddressSet() {
        // basic
        HttpRequestDef.Builder<DeleteAddressSetRequest, DeleteAddressSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAddressSetRequest.class, DeleteAddressSetResponse.class)
                .withName("DeleteAddressSet")
                .withUri("/v1/{project_id}/address-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetRequest::getSetId, DeleteAddressSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetRequest::getEnterpriseProjectId,
                DeleteAddressSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetRequest::getFwInstanceId, DeleteAddressSetRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteList =
        genForDeleteBlackWhiteList();

    private static HttpRequestDef<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> genForDeleteBlackWhiteList() {
        // basic
        HttpRequestDef.Builder<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBlackWhiteListRequest.class, DeleteBlackWhiteListResponse.class)
            .withName("DeleteBlackWhiteList")
            .withUri("/v1/{project_id}/black-white-list/{list_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("list_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getListId, DeleteBlackWhiteListRequest::setListId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getEnterpriseProjectId,
                DeleteBlackWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getFwInstanceId,
                DeleteBlackWhiteListRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> deleteCaptureTask =
        genForDeleteCaptureTask();

    private static HttpRequestDef<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> genForDeleteCaptureTask() {
        // basic
        HttpRequestDef.Builder<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteCaptureTaskRequest.class, DeleteCaptureTaskResponse.class)
                .withName("DeleteCaptureTask")
                .withUri("/v1/{project_id}/capture-task/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaptureTaskRequest::getFwInstanceId,
                DeleteCaptureTaskRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCaptureTaskRequest::getEnterpriseProjectId,
                DeleteCaptureTaskRequest::setEnterpriseProjectId));
        builder.<DeleteCaptureTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCaptureTaskDto.class),
            f -> f.withMarshaller(DeleteCaptureTaskRequest::getBody, DeleteCaptureTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSet =
        genForDeleteDomainSet();

    private static HttpRequestDef<DeleteDomainSetRequest, DeleteDomainSetResponse> genForDeleteDomainSet() {
        // basic
        HttpRequestDef.Builder<DeleteDomainSetRequest, DeleteDomainSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainSetRequest.class, DeleteDomainSetResponse.class)
                .withName("DeleteDomainSet")
                .withUri("/v1/{project_id}/domain-set/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainSetRequest::getSetId, DeleteDomainSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainSetRequest::getEnterpriseProjectId,
                DeleteDomainSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainSetRequest::getFwInstanceId, DeleteDomainSetRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genForDeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genForDeleteDomains() {
        // basic
        HttpRequestDef.Builder<DeleteDomainsRequest, DeleteDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainsRequest.class, DeleteDomainsResponse.class)
                .withName("DeleteDomains")
                .withUri("/v1/{project_id}/domain-set/domains/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getSetId, DeleteDomainsRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getEnterpriseProjectId,
                DeleteDomainsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getFwInstanceId, DeleteDomainsRequest::setFwInstanceId));
        builder.<DeleteDomainDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDomainDto.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getBody, DeleteDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genForDeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genForDeleteFirewall() {
        // basic
        HttpRequestDef.Builder<DeleteFirewallRequest, DeleteFirewallResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFirewallRequest.class, DeleteFirewallResponse.class)
                .withName("DeleteFirewall")
                .withUri("/v2/{project_id}/firewall/{resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFirewallRequest::getResourceId, DeleteFirewallRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItem =
        genForDeleteServiceItem();

    private static HttpRequestDef<DeleteServiceItemRequest, DeleteServiceItemResponse> genForDeleteServiceItem() {
        // basic
        HttpRequestDef.Builder<DeleteServiceItemRequest, DeleteServiceItemResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceItemRequest.class, DeleteServiceItemResponse.class)
                .withName("DeleteServiceItem")
                .withUri("/v1/{project_id}/service-items/{item_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("item_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemRequest::getItemId, DeleteServiceItemRequest::setItemId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemRequest::getEnterpriseProjectId,
                DeleteServiceItemRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemRequest::getFwInstanceId,
                DeleteServiceItemRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSet =
        genForDeleteServiceSet();

    private static HttpRequestDef<DeleteServiceSetRequest, DeleteServiceSetResponse> genForDeleteServiceSet() {
        // basic
        HttpRequestDef.Builder<DeleteServiceSetRequest, DeleteServiceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceSetRequest.class, DeleteServiceSetResponse.class)
                .withName("DeleteServiceSet")
                .withUri("/v1/{project_id}/service-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetRequest::getSetId, DeleteServiceSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetRequest::getEnterpriseProjectId,
                DeleteServiceSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetRequest::getFwInstanceId, DeleteServiceSetRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v2/{project_id}/cfw-cfw/{fw_instance_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getFwInstanceId, DeleteTagRequest::setFwInstanceId));
        builder.<DeleteTagsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteTagsDto.class),
            f -> f.withMarshaller(DeleteTagRequest::getBody, DeleteTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTagResponse::getBody, DeleteTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogs =
        genForListAccessControlLogs();

    private static HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> genForListAccessControlLogs() {
        // basic
        HttpRequestDef.Builder<ListAccessControlLogsRequest, ListAccessControlLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessControlLogsRequest.class, ListAccessControlLogsResponse.class)
            .withName("ListAccessControlLogs")
            .withUri("/v1/{project_id}/cfw/logs/access-control")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getFwInstanceId,
                ListAccessControlLogsRequest::setFwInstanceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getRuleId, ListAccessControlLogsRequest::setRuleId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getStartTime,
                ListAccessControlLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getEndTime, ListAccessControlLogsRequest::setEndTime));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcIp, ListAccessControlLogsRequest::setSrcIp));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcPort, ListAccessControlLogsRequest::setSrcPort));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstIp, ListAccessControlLogsRequest::setDstIp));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstPort, ListAccessControlLogsRequest::setDstPort));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getProtocol,
                ListAccessControlLogsRequest::setProtocol));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getApp, ListAccessControlLogsRequest::setApp));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogId, ListAccessControlLogsRequest::setLogId));
        builder.<Integer>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getNextDate,
                ListAccessControlLogsRequest::setNextDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getOffset, ListAccessControlLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLimit, ListAccessControlLogsRequest::setLimit));
        builder.<ListAccessControlLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccessControlLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogType, ListAccessControlLogsRequest::setLogType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getEnterpriseProjectId,
                ListAccessControlLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstHost, ListAccessControlLogsRequest::setDstHost));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getRuleName,
                ListAccessControlLogsRequest::setRuleName));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getAction, ListAccessControlLogsRequest::setAction));
        builder.<String>withRequestField("src_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcRegionName,
                ListAccessControlLogsRequest::setSrcRegionName));
        builder.<String>withRequestField("dst_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstRegionName,
                ListAccessControlLogsRequest::setDstRegionName));
        builder.<String>withRequestField("src_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcProvinceName,
                ListAccessControlLogsRequest::setSrcProvinceName));
        builder.<String>withRequestField("dst_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstProvinceName,
                ListAccessControlLogsRequest::setDstProvinceName));
        builder.<String>withRequestField("src_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcCityName,
                ListAccessControlLogsRequest::setSrcCityName));
        builder.<String>withRequestField("dst_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstCityName,
                ListAccessControlLogsRequest::setDstCityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItems =
        genForListAddressItems();

    private static HttpRequestDef<ListAddressItemsRequest, ListAddressItemsResponse> genForListAddressItems() {
        // basic
        HttpRequestDef.Builder<ListAddressItemsRequest, ListAddressItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddressItemsRequest.class, ListAddressItemsResponse.class)
                .withName("ListAddressItems")
                .withUri("/v1/{project_id}/address-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getSetId, ListAddressItemsRequest::setSetId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getKeyWord, ListAddressItemsRequest::setKeyWord));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getLimit, ListAddressItemsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getOffset, ListAddressItemsRequest::setOffset));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getAddress, ListAddressItemsRequest::setAddress));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getEnterpriseProjectId,
                ListAddressItemsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getFwInstanceId, ListAddressItemsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_address_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getQueryAddressSetType,
                ListAddressItemsRequest::setQueryAddressSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetail =
        genForListAddressSetDetail();

    private static HttpRequestDef<ListAddressSetDetailRequest, ListAddressSetDetailResponse> genForListAddressSetDetail() {
        // basic
        HttpRequestDef.Builder<ListAddressSetDetailRequest, ListAddressSetDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAddressSetDetailRequest.class, ListAddressSetDetailResponse.class)
            .withName("ListAddressSetDetail")
            .withUri("/v1/{project_id}/address-sets/{set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getSetId, ListAddressSetDetailRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getEnterpriseProjectId,
                ListAddressSetDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getFwInstanceId,
                ListAddressSetDetailRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_address_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getQueryAddressSetType,
                ListAddressSetDetailRequest::setQueryAddressSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSets =
        genForListAddressSets();

    private static HttpRequestDef<ListAddressSetsRequest, ListAddressSetsResponse> genForListAddressSets() {
        // basic
        HttpRequestDef.Builder<ListAddressSetsRequest, ListAddressSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddressSetsRequest.class, ListAddressSetsResponse.class)
                .withName("ListAddressSets")
                .withUri("/v1/{project_id}/address-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getObjectId, ListAddressSetsRequest::setObjectId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getKeyWord, ListAddressSetsRequest::setKeyWord));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getLimit, ListAddressSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getOffset, ListAddressSetsRequest::setOffset));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getAddress, ListAddressSetsRequest::setAddress));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getAddressType, ListAddressSetsRequest::setAddressType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getEnterpriseProjectId,
                ListAddressSetsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getFwInstanceId, ListAddressSetsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_address_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getQueryAddressSetType,
                ListAddressSetsRequest::setQueryAddressSetType));
        builder.<Integer>withRequestField("address_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getAddressSetType,
                ListAddressSetsRequest::setAddressSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogs =
        genForListAttackLogs();

    private static HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> genForListAttackLogs() {
        // basic
        HttpRequestDef.Builder<ListAttackLogsRequest, ListAttackLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttackLogsRequest.class, ListAttackLogsResponse.class)
                .withName("ListAttackLogs")
                .withUri("/v1/{project_id}/cfw/logs/attack")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getStartTime, ListAttackLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getEndTime, ListAttackLogsRequest::setEndTime));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcIp, ListAttackLogsRequest::setSrcIp));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcPort, ListAttackLogsRequest::setSrcPort));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstIp, ListAttackLogsRequest::setDstIp));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstPort, ListAttackLogsRequest::setDstPort));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getProtocol, ListAttackLogsRequest::setProtocol));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getApp, ListAttackLogsRequest::setApp));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLogId, ListAttackLogsRequest::setLogId));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getNextDate, ListAttackLogsRequest::setNextDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getOffset, ListAttackLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLimit, ListAttackLogsRequest::setLimit));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getFwInstanceId, ListAttackLogsRequest::setFwInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAction, ListAttackLogsRequest::setAction));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDirection, ListAttackLogsRequest::setDirection));
        builder.<String>withRequestField("attack_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackType, ListAttackLogsRequest::setAttackType));
        builder.<String>withRequestField("attack_rule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackRule, ListAttackLogsRequest::setAttackRule));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLevel, ListAttackLogsRequest::setLevel));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getEnterpriseProjectId,
                ListAttackLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstHost, ListAttackLogsRequest::setDstHost));
        builder.<ListAttackLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLogType, ListAttackLogsRequest::setLogType));
        builder.<String>withRequestField("attack_rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackRuleId, ListAttackLogsRequest::setAttackRuleId));
        builder.<String>withRequestField("src_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcRegionName, ListAttackLogsRequest::setSrcRegionName));
        builder.<String>withRequestField("dst_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstRegionName, ListAttackLogsRequest::setDstRegionName));
        builder.<String>withRequestField("src_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcProvinceName,
                ListAttackLogsRequest::setSrcProvinceName));
        builder.<String>withRequestField("dst_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstProvinceName,
                ListAttackLogsRequest::setDstProvinceName));
        builder.<String>withRequestField("src_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcCityName, ListAttackLogsRequest::setSrcCityName));
        builder.<String>withRequestField("dst_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstCityName, ListAttackLogsRequest::setDstCityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteLists =
        genForListBlackWhiteLists();

    private static HttpRequestDef<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> genForListBlackWhiteLists() {
        // basic
        HttpRequestDef.Builder<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlackWhiteListsRequest.class, ListBlackWhiteListsResponse.class)
                .withName("ListBlackWhiteLists")
                .withUri("/v1/{project_id}/black-white-lists")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getObjectId, ListBlackWhiteListsRequest::setObjectId));
        builder.<ListBlackWhiteListsRequest.ListTypeEnum>withRequestField("list_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBlackWhiteListsRequest.ListTypeEnum.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getListType, ListBlackWhiteListsRequest::setListType));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getAddressType,
                ListBlackWhiteListsRequest::setAddressType));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getAddress, ListBlackWhiteListsRequest::setAddress));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getPort, ListBlackWhiteListsRequest::setPort));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getLimit, ListBlackWhiteListsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getOffset, ListBlackWhiteListsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getEnterpriseProjectId,
                ListBlackWhiteListsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getFwInstanceId,
                ListBlackWhiteListsRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaptureResultRequest, ListCaptureResultResponse> listCaptureResult =
        genForListCaptureResult();

    private static HttpRequestDef<ListCaptureResultRequest, ListCaptureResultResponse> genForListCaptureResult() {
        // basic
        HttpRequestDef.Builder<ListCaptureResultRequest, ListCaptureResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaptureResultRequest.class, ListCaptureResultResponse.class)
                .withName("ListCaptureResult")
                .withUri("/v1/{project_id}/capture-task/capture-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaptureResultRequest::getFwInstanceId,
                ListCaptureResultRequest::setFwInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaptureResultRequest::getTaskId, ListCaptureResultRequest::setTaskId));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaptureResultRequest::getType, ListCaptureResultRequest::setType));
        builder.<List<String>>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCaptureResultRequest::getIp, ListCaptureResultRequest::setIp));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaptureResultRequest::getEnterpriseProjectId,
                ListCaptureResultRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCaptureTaskRequest, ListCaptureTaskResponse> listCaptureTask =
        genForListCaptureTask();

    private static HttpRequestDef<ListCaptureTaskRequest, ListCaptureTaskResponse> genForListCaptureTask() {
        // basic
        HttpRequestDef.Builder<ListCaptureTaskRequest, ListCaptureTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCaptureTaskRequest.class, ListCaptureTaskResponse.class)
                .withName("ListCaptureTask")
                .withUri("/v1/{project_id}/capture-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaptureTaskRequest::getEnterpriseProjectId,
                ListCaptureTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCaptureTaskRequest::getFwInstanceId, ListCaptureTaskRequest::setFwInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaptureTaskRequest::getLimit, ListCaptureTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCaptureTaskRequest::getOffset, ListCaptureTaskRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> listDnsServers =
        genForListDnsServers();

    private static HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> genForListDnsServers() {
        // basic
        HttpRequestDef.Builder<ListDnsServersRequest, ListDnsServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDnsServersRequest.class, ListDnsServersResponse.class)
                .withName("ListDnsServers")
                .withUri("/v1/{project_id}/dns/servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDnsServersRequest::getLimit, ListDnsServersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDnsServersRequest::getOffset, ListDnsServersRequest::setOffset));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDnsServersRequest::getFwInstanceId, ListDnsServersRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDnsServersRequest::getEnterpriseProjectId,
                ListDnsServersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetail =
        genForListDomainParseDetail();

    private static HttpRequestDef<ListDomainParseDetailRequest, ListDomainParseDetailResponse> genForListDomainParseDetail() {
        // basic
        HttpRequestDef.Builder<ListDomainParseDetailRequest, ListDomainParseDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDomainParseDetailRequest.class, ListDomainParseDetailResponse.class)
            .withName("ListDomainParseDetail")
            .withUri("/v1/{project_id}/domain/parse/{domain_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getDomainName,
                ListDomainParseDetailRequest::setDomainName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getEnterpriseProjectId,
                ListDomainParseDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getFwInstanceId,
                ListDomainParseDetailRequest::setFwInstanceId));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getAddressType,
                ListDomainParseDetailRequest::setAddressType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainParseIpRequest, ListDomainParseIpResponse> listDomainParseIp =
        genForListDomainParseIp();

    private static HttpRequestDef<ListDomainParseIpRequest, ListDomainParseIpResponse> genForListDomainParseIp() {
        // basic
        HttpRequestDef.Builder<ListDomainParseIpRequest, ListDomainParseIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainParseIpRequest.class, ListDomainParseIpResponse.class)
                .withName("ListDomainParseIp")
                .withUri("/v1/{project_id}/domain/parse-ip-list/{domain_address_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_address_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseIpRequest::getDomainAddressId,
                ListDomainParseIpRequest::setDomainAddressId));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainParseIpRequest::getAddressType, ListDomainParseIpRequest::setAddressType));
        builder.<String>withRequestField("domain_set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseIpRequest::getDomainSetId, ListDomainParseIpRequest::setDomainSetId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseIpRequest::getFwInstanceId,
                ListDomainParseIpRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseIpRequest::getEnterpriseProjectId,
                ListDomainParseIpRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSets =
        genForListDomainSets();

    private static HttpRequestDef<ListDomainSetsRequest, ListDomainSetsResponse> genForListDomainSets() {
        // basic
        HttpRequestDef.Builder<ListDomainSetsRequest, ListDomainSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainSetsRequest.class, ListDomainSetsResponse.class)
                .withName("ListDomainSets")
                .withUri("/v1/{project_id}/domain-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getEnterpriseProjectId,
                ListDomainSetsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getFwInstanceId, ListDomainSetsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getLimit, ListDomainSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getOffset, ListDomainSetsRequest::setOffset));
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getObjectId, ListDomainSetsRequest::setObjectId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getKeyWord, ListDomainSetsRequest::setKeyWord));
        builder.<Integer>withRequestField("domain_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getDomainSetType, ListDomainSetsRequest::setDomainSetType));
        builder.<Integer>withRequestField("config_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getConfigStatus, ListDomainSetsRequest::setConfigStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForListDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForListDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v1/{project_id}/domain-set/domains/{domain_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainSetId, ListDomainsRequest::setDomainSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getEnterpriseProjectId,
                ListDomainsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getFwInstanceId, ListDomainsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getLimit, ListDomainsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getOffset, ListDomainsRequest::setOffset));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainName, ListDomainsRequest::setDomainName));
        builder.<String>withRequestField("object_Id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getObjectId, ListDomainsRequest::setObjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewall =
        genForListEastWestFirewall();

    private static HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> genForListEastWestFirewall() {
        // basic
        HttpRequestDef.Builder<ListEastWestFirewallRequest, ListEastWestFirewallResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEastWestFirewallRequest.class, ListEastWestFirewallResponse.class)
            .withName("ListEastWestFirewall")
            .withUri("/v1/{project_id}/firewall/east-west")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getLimit, ListEastWestFirewallRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getOffset, ListEastWestFirewallRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getEnterpriseProjectId,
                ListEastWestFirewallRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getFwInstanceId,
                ListEastWestFirewallRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetail =
        genForListFirewallDetail();

    private static HttpRequestDef<ListFirewallDetailRequest, ListFirewallDetailResponse> genForListFirewallDetail() {
        // basic
        HttpRequestDef.Builder<ListFirewallDetailRequest, ListFirewallDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirewallDetailRequest.class, ListFirewallDetailResponse.class)
                .withName("ListFirewallDetail")
                .withUri("/v1/{project_id}/firewall/exist")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getOffset, ListFirewallDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getLimit, ListFirewallDetailRequest::setLimit));
        builder.<Integer>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getServiceType,
                ListFirewallDetailRequest::setServiceType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getEnterpriseProjectId,
                ListFirewallDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getFwInstanceId,
                ListFirewallDetailRequest::setFwInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getName, ListFirewallDetailRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallListRequest, ListFirewallListResponse> listFirewallList =
        genForListFirewallList();

    private static HttpRequestDef<ListFirewallListRequest, ListFirewallListResponse> genForListFirewallList() {
        // basic
        HttpRequestDef.Builder<ListFirewallListRequest, ListFirewallListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFirewallListRequest.class, ListFirewallListResponse.class)
                .withName("ListFirewallList")
                .withUri("/v1/{project_id}/firewalls/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallListRequest::getEnterpriseProjectId,
                ListFirewallListRequest::setEnterpriseProjectId));
        builder.<QueryFireWallInstanceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryFireWallInstanceDto.class),
            f -> f.withMarshaller(ListFirewallListRequest::getBody, ListFirewallListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForListFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForListFlowLogs() {
        // basic
        HttpRequestDef.Builder<ListFlowLogsRequest, ListFlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlowLogsRequest.class, ListFlowLogsResponse.class)
                .withName("ListFlowLogs")
                .withUri("/v1/{project_id}/cfw/logs/flow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getFwInstanceId, ListFlowLogsRequest::setFwInstanceId));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDirection, ListFlowLogsRequest::setDirection));
        builder.<ListFlowLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogType, ListFlowLogsRequest::setLogType));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getStartTime, ListFlowLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getEndTime, ListFlowLogsRequest::setEndTime));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcIp, ListFlowLogsRequest::setSrcIp));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcPort, ListFlowLogsRequest::setSrcPort));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstIp, ListFlowLogsRequest::setDstIp));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstPort, ListFlowLogsRequest::setDstPort));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getProtocol, ListFlowLogsRequest::setProtocol));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getApp, ListFlowLogsRequest::setApp));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogId, ListFlowLogsRequest::setLogId));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getNextDate, ListFlowLogsRequest::setNextDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getOffset, ListFlowLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, ListFlowLogsRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getEnterpriseProjectId,
                ListFlowLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstHost, ListFlowLogsRequest::setDstHost));
        builder.<String>withRequestField("src_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcRegionName, ListFlowLogsRequest::setSrcRegionName));
        builder.<String>withRequestField("dst_region_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstRegionName, ListFlowLogsRequest::setDstRegionName));
        builder.<String>withRequestField("src_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcProvinceName, ListFlowLogsRequest::setSrcProvinceName));
        builder.<String>withRequestField("dst_province_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstProvinceName, ListFlowLogsRequest::setDstProvinceName));
        builder.<String>withRequestField("src_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcCityName, ListFlowLogsRequest::setSrcCityName));
        builder.<String>withRequestField("dst_city_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstCityName, ListFlowLogsRequest::setDstCityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForListJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForListJob() {
        // basic
        HttpRequestDef.Builder<ListJobRequest, ListJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobRequest.class, ListJobResponse.class)
                .withName("ListJob")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobRequest::getJobId, ListJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogConfigRequest, ListLogConfigResponse> listLogConfig =
        genForListLogConfig();

    private static HttpRequestDef<ListLogConfigRequest, ListLogConfigResponse> genForListLogConfig() {
        // basic
        HttpRequestDef.Builder<ListLogConfigRequest, ListLogConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogConfigRequest.class, ListLogConfigResponse.class)
                .withName("ListLogConfig")
                .withUri("/v1/{project_id}/cfw/logs/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogConfigRequest::getFwInstanceId, ListLogConfigRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogConfigRequest::getEnterpriseProjectId,
                ListLogConfigRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v2/{project_id}/cfw-cfw/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, ListProjectTagsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, ListProjectTagsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getEnterpriseProjectId,
                ListProjectTagsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcs =
        genForListProtectedVpcs();

    private static HttpRequestDef<ListProtectedVpcsRequest, ListProtectedVpcsResponse> genForListProtectedVpcs() {
        // basic
        HttpRequestDef.Builder<ListProtectedVpcsRequest, ListProtectedVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProtectedVpcsRequest.class, ListProtectedVpcsResponse.class)
                .withName("ListProtectedVpcs")
                .withUri("/v1/{project_id}/vpcs/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedVpcsRequest::getObjectId, ListProtectedVpcsRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedVpcsRequest::getEnterpriseProjectId,
                ListProtectedVpcsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedVpcsRequest::getFwInstanceId,
                ListProtectedVpcsRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForListResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForListResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v2/{project_id}/cfw-cfw/{fw_instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getFwInstanceId, ListResourceTagsRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getEnterpriseProjectId,
                ListResourceTagsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItems =
        genForListServiceItems();

    private static HttpRequestDef<ListServiceItemsRequest, ListServiceItemsResponse> genForListServiceItems() {
        // basic
        HttpRequestDef.Builder<ListServiceItemsRequest, ListServiceItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceItemsRequest.class, ListServiceItemsResponse.class)
                .withName("ListServiceItems")
                .withUri("/v1/{project_id}/service-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getSetId, ListServiceItemsRequest::setSetId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getKeyWord, ListServiceItemsRequest::setKeyWord));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getLimit, ListServiceItemsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getOffset, ListServiceItemsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getEnterpriseProjectId,
                ListServiceItemsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getFwInstanceId, ListServiceItemsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_service_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getQueryServiceSetType,
                ListServiceItemsRequest::setQueryServiceSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetail =
        genForListServiceSetDetail();

    private static HttpRequestDef<ListServiceSetDetailRequest, ListServiceSetDetailResponse> genForListServiceSetDetail() {
        // basic
        HttpRequestDef.Builder<ListServiceSetDetailRequest, ListServiceSetDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServiceSetDetailRequest.class, ListServiceSetDetailResponse.class)
            .withName("ListServiceSetDetail")
            .withUri("/v1/{project_id}/service-sets/{set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getSetId, ListServiceSetDetailRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getEnterpriseProjectId,
                ListServiceSetDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getFwInstanceId,
                ListServiceSetDetailRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_service_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getQueryServiceSetType,
                ListServiceSetDetailRequest::setQueryServiceSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSets =
        genForListServiceSets();

    private static HttpRequestDef<ListServiceSetsRequest, ListServiceSetsResponse> genForListServiceSets() {
        // basic
        HttpRequestDef.Builder<ListServiceSetsRequest, ListServiceSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServiceSetsRequest.class, ListServiceSetsResponse.class)
                .withName("ListServiceSets")
                .withUri("/v1/{project_id}/service-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getObjectId, ListServiceSetsRequest::setObjectId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getKeyWord, ListServiceSetsRequest::setKeyWord));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getLimit, ListServiceSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getOffset, ListServiceSetsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getEnterpriseProjectId,
                ListServiceSetsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getFwInstanceId, ListServiceSetsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("query_service_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getQueryServiceSetType,
                ListServiceSetsRequest::setQueryServiceSetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveTagsRequest, SaveTagsResponse> saveTags = genForSaveTags();

    private static HttpRequestDef<SaveTagsRequest, SaveTagsResponse> genForSaveTags() {
        // basic
        HttpRequestDef.Builder<SaveTagsRequest, SaveTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SaveTagsRequest.class, SaveTagsResponse.class)
                .withName("SaveTags")
                .withUri("/v2/{project_id}/cfw-cfw/{fw_instance_id}/tags/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTagsRequest::getFwInstanceId, SaveTagsRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTagsRequest::getEnterpriseProjectId, SaveTagsRequest::setEnterpriseProjectId));
        builder.<CreateTagsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagsDto.class),
            f -> f.withMarshaller(SaveTagsRequest::getBody, SaveTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfig =
        genForShowAlarmConfig();

    private static HttpRequestDef<ShowAlarmConfigRequest, ShowAlarmConfigResponse> genForShowAlarmConfig() {
        // basic
        HttpRequestDef.Builder<ShowAlarmConfigRequest, ShowAlarmConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmConfigRequest.class, ShowAlarmConfigResponse.class)
                .withName("ShowAlarmConfig")
                .withUri("/v1/{project_id}/cfw/alarm/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmConfigRequest::getFwInstanceId, ShowAlarmConfigRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmConfigRequest::getEnterpriseProjectId,
                ShowAlarmConfigRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> showAntiVirusRule =
        genForShowAntiVirusRule();

    private static HttpRequestDef<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> genForShowAntiVirusRule() {
        // basic
        HttpRequestDef.Builder<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntiVirusRuleRequest.class, ShowAntiVirusRuleResponse.class)
                .withName("ShowAntiVirusRule")
                .withUri("/v1/{project_id}/anti-virus/rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntiVirusRuleRequest::getObjectId, ShowAntiVirusRuleRequest::setObjectId));
        builder.<Integer>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAntiVirusRuleRequest::getEngineType, ShowAntiVirusRuleRequest::setEngineType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAntiVirusRuleRequest::getLimit, ShowAntiVirusRuleRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAntiVirusRuleRequest::getOffset, ShowAntiVirusRuleRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntiVirusRuleRequest::getEnterpriseProjectId,
                ShowAntiVirusRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> showAntiVirusSwitch =
        genForShowAntiVirusSwitch();

    private static HttpRequestDef<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> genForShowAntiVirusSwitch() {
        // basic
        HttpRequestDef.Builder<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntiVirusSwitchRequest.class, ShowAntiVirusSwitchResponse.class)
                .withName("ShowAntiVirusSwitch")
                .withUri("/v1/{project_id}/anti-virus/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntiVirusSwitchRequest::getObjectId, ShowAntiVirusSwitchRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntiVirusSwitchRequest::getEnterpriseProjectId,
                ShowAntiVirusSwitchRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> showDomainSetDetail =
        genForShowDomainSetDetail();

    private static HttpRequestDef<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> genForShowDomainSetDetail() {
        // basic
        HttpRequestDef.Builder<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainSetDetailRequest.class, ShowDomainSetDetailResponse.class)
                .withName("ShowDomainSetDetail")
                .withUri("/v1/{project_id}/domain-set/{domain_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainSetDetailRequest::getDomainSetId,
                ShowDomainSetDetailRequest::setDomainSetId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainSetDetailRequest::getFwInstanceId,
                ShowDomainSetDetailRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainSetDetailRequest::getEnterpriseProjectId,
                ShowDomainSetDetailRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSet =
        genForUpdateAddressSet();

    private static HttpRequestDef<UpdateAddressSetRequest, UpdateAddressSetResponse> genForUpdateAddressSet() {
        // basic
        HttpRequestDef.Builder<UpdateAddressSetRequest, UpdateAddressSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddressSetRequest.class, UpdateAddressSetResponse.class)
                .withName("UpdateAddressSet")
                .withUri("/v1/{project_id}/address-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getSetId, UpdateAddressSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getEnterpriseProjectId,
                UpdateAddressSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getFwInstanceId, UpdateAddressSetRequest::setFwInstanceId));
        builder.<UpdateAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAddressSetDto.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getBody, UpdateAddressSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfig =
        genForUpdateAlarmConfig();

    private static HttpRequestDef<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> genForUpdateAlarmConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmConfigRequest.class, UpdateAlarmConfigResponse.class)
                .withName("UpdateAlarmConfig")
                .withUri("/v1/{project_id}/cfw/alarm/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmConfigRequest::getFwInstanceId,
                UpdateAlarmConfigRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmConfigRequest::getEnterpriseProjectId,
                UpdateAlarmConfigRequest::setEnterpriseProjectId));
        builder.<UpdateAttackLogAlarmConfigDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAttackLogAlarmConfigDto.class),
            f -> f.withMarshaller(UpdateAlarmConfigRequest::getBody, UpdateAlarmConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> updateAntiVirusRule =
        genForUpdateAntiVirusRule();

    private static HttpRequestDef<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> genForUpdateAntiVirusRule() {
        // basic
        HttpRequestDef.Builder<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAntiVirusRuleRequest.class, UpdateAntiVirusRuleResponse.class)
                .withName("UpdateAntiVirusRule")
                .withUri("/v1/{project_id}/anti-virus/rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiVirusRuleRequest::getEnterpriseProjectId,
                UpdateAntiVirusRuleRequest::setEnterpriseProjectId));
        builder.<AntiVirusRuleDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AntiVirusRuleDto.class),
            f -> f.withMarshaller(UpdateAntiVirusRuleRequest::getBody, UpdateAntiVirusRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> updateAntiVirusSwitch =
        genForUpdateAntiVirusSwitch();

    private static HttpRequestDef<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> genForUpdateAntiVirusSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAntiVirusSwitchRequest.class, UpdateAntiVirusSwitchResponse.class)
            .withName("UpdateAntiVirusSwitch")
            .withUri("/v1/{project_id}/anti-virus/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiVirusSwitchRequest::getEnterpriseProjectId,
                UpdateAntiVirusSwitchRequest::setEnterpriseProjectId));
        builder.<AntiVirusSwitchDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AntiVirusSwitchDto.class),
            f -> f.withMarshaller(UpdateAntiVirusSwitchRequest::getBody, UpdateAntiVirusSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteList =
        genForUpdateBlackWhiteList();

    private static HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> genForUpdateBlackWhiteList() {
        // basic
        HttpRequestDef.Builder<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBlackWhiteListRequest.class, UpdateBlackWhiteListResponse.class)
            .withName("UpdateBlackWhiteList")
            .withUri("/v1/{project_id}/black-white-list/{list_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("list_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getListId, UpdateBlackWhiteListRequest::setListId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getEnterpriseProjectId,
                UpdateBlackWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getFwInstanceId,
                UpdateBlackWhiteListRequest::setFwInstanceId));
        builder.<UpdateBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBlackWhiteListDto.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getBody, UpdateBlackWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServers =
        genForUpdateDnsServers();

    private static HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> genForUpdateDnsServers() {
        // basic
        HttpRequestDef.Builder<UpdateDnsServersRequest, UpdateDnsServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDnsServersRequest.class, UpdateDnsServersResponse.class)
                .withName("UpdateDnsServers")
                .withUri("/v1/{project_id}/dns/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getFwInstanceId, UpdateDnsServersRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getEnterpriseProjectId,
                UpdateDnsServersRequest::setEnterpriseProjectId));
        builder.<UpdateDnsServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDnsServersRequestBody.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getBody, UpdateDnsServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSet =
        genForUpdateDomainSet();

    private static HttpRequestDef<UpdateDomainSetRequest, UpdateDomainSetResponse> genForUpdateDomainSet() {
        // basic
        HttpRequestDef.Builder<UpdateDomainSetRequest, UpdateDomainSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainSetRequest.class, UpdateDomainSetResponse.class)
                .withName("UpdateDomainSet")
                .withUri("/v1/{project_id}/domain-set/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getSetId, UpdateDomainSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getEnterpriseProjectId,
                UpdateDomainSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getFwInstanceId, UpdateDomainSetRequest::setFwInstanceId));
        builder.<UpdateDomainSetInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainSetInfoDto.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getBody, UpdateDomainSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfig =
        genForUpdateLogConfig();

    private static HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> genForUpdateLogConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLogConfigRequest, UpdateLogConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogConfigRequest.class, UpdateLogConfigResponse.class)
                .withName("UpdateLogConfig")
                .withUri("/v1/{project_id}/cfw/logs/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getFwInstanceId, UpdateLogConfigRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getEnterpriseProjectId,
                UpdateLogConfigRequest::setEnterpriseProjectId));
        builder.<LogConfigDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogConfigDto.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getBody, UpdateLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSet =
        genForUpdateServiceSet();

    private static HttpRequestDef<UpdateServiceSetRequest, UpdateServiceSetResponse> genForUpdateServiceSet() {
        // basic
        HttpRequestDef.Builder<UpdateServiceSetRequest, UpdateServiceSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceSetRequest.class, UpdateServiceSetResponse.class)
                .withName("UpdateServiceSet")
                .withUri("/v1/{project_id}/service-sets/{set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getSetId, UpdateServiceSetRequest::setSetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getEnterpriseProjectId,
                UpdateServiceSetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getFwInstanceId, UpdateServiceSetRequest::setFwInstanceId));
        builder.<UpdateServiceSetUsingPUTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServiceSetUsingPUTRequestBody.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getBody, UpdateServiceSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAclRuleRequest, AddAclRuleResponse> addAclRule = genForAddAclRule();

    private static HttpRequestDef<AddAclRuleRequest, AddAclRuleResponse> genForAddAclRule() {
        // basic
        HttpRequestDef.Builder<AddAclRuleRequest, AddAclRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAclRuleRequest.class, AddAclRuleResponse.class)
                .withName("AddAclRule")
                .withUri("/v1/{project_id}/acl-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAclRuleRequest::getEnterpriseProjectId,
                AddAclRuleRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAclRuleRequest::getFwInstanceId, AddAclRuleRequest::setFwInstanceId));
        builder.<AddRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRuleAclDto.class),
            f -> f.withMarshaller(AddAclRuleRequest::getBody, AddAclRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRules =
        genForBatchDeleteAclRules();

    private static HttpRequestDef<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> genForBatchDeleteAclRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteAclRulesRequest.class, BatchDeleteAclRulesResponse.class)
            .withName("BatchDeleteAclRules")
            .withUri("/v1/{project_id}/acl-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getEnterpriseProjectId,
                BatchDeleteAclRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getFwInstanceId,
                BatchDeleteAclRulesRequest::setFwInstanceId));
        builder.<DeleteRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRuleAclDto.class),
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getBody, BatchDeleteAclRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActions =
        genForBatchUpdateAclRuleActions();

    private static HttpRequestDef<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> genForBatchUpdateAclRuleActions() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateAclRuleActionsRequest.class,
                    BatchUpdateAclRuleActionsResponse.class)
                .withName("BatchUpdateAclRuleActions")
                .withUri("/v1/{project_id}/acl-rule/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAclRuleActionsRequest::getEnterpriseProjectId,
                BatchUpdateAclRuleActionsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateAclRuleActionsRequest::getFwInstanceId,
                BatchUpdateAclRuleActionsRequest::setFwInstanceId));
        builder.<UpdateSecurityPolciesActionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityPolciesActionDto.class),
            f -> f.withMarshaller(BatchUpdateAclRuleActionsRequest::getBody,
                BatchUpdateAclRuleActionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRule =
        genForDeleteAclRule();

    private static HttpRequestDef<DeleteAclRuleRequest, DeleteAclRuleResponse> genForDeleteAclRule() {
        // basic
        HttpRequestDef.Builder<DeleteAclRuleRequest, DeleteAclRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclRuleRequest.class, DeleteAclRuleResponse.class)
                .withName("DeleteAclRule")
                .withUri("/v1/{project_id}/acl-rule/{acl_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleRequest::getAclRuleId, DeleteAclRuleRequest::setAclRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleRequest::getEnterpriseProjectId,
                DeleteAclRuleRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleRequest::getFwInstanceId, DeleteAclRuleRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCount =
        genForDeleteAclRuleHitCount();

    private static HttpRequestDef<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> genForDeleteAclRuleHitCount() {
        // basic
        HttpRequestDef.Builder<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAclRuleHitCountRequest.class, DeleteAclRuleHitCountResponse.class)
            .withName("DeleteAclRuleHitCount")
            .withUri("/v1/{project_id}/acl-rule/count")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getEnterpriseProjectId,
                DeleteAclRuleHitCountRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getFwInstanceId,
                DeleteAclRuleHitCountRequest::setFwInstanceId));
        builder.<ClearAccessLogRuleHitCountsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClearAccessLogRuleHitCountsDto.class),
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getBody, DeleteAclRuleHitCountRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAclRuleHitCountResponse::getBody, DeleteAclRuleHitCountResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCount =
        genForListAclRuleHitCount();

    private static HttpRequestDef<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> genForListAclRuleHitCount() {
        // basic
        HttpRequestDef.Builder<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAclRuleHitCountRequest.class, ListAclRuleHitCountResponse.class)
                .withName("ListAclRuleHitCount")
                .withUri("/v1/{project_id}/acl-rule/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getEnterpriseProjectId,
                ListAclRuleHitCountRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getFwInstanceId,
                ListAclRuleHitCountRequest::setFwInstanceId));
        builder.<ListRuleHitCountDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleHitCountDto.class),
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getBody, ListAclRuleHitCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclRulesRequest, ListAclRulesResponse> listAclRules = genForListAclRules();

    private static HttpRequestDef<ListAclRulesRequest, ListAclRulesResponse> genForListAclRules() {
        // basic
        HttpRequestDef.Builder<ListAclRulesRequest, ListAclRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclRulesRequest.class, ListAclRulesResponse.class)
                .withName("ListAclRules")
                .withUri("/v1/{project_id}/acl-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getObjectId, ListAclRulesRequest::setObjectId));
        builder.<ListAclRulesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getType, ListAclRulesRequest::setType));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getIp, ListAclRulesRequest::setIp));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getName, ListAclRulesRequest::setName));
        builder.<Integer>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getDirection, ListAclRulesRequest::setDirection));
        builder.<ListAclRulesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getStatus, ListAclRulesRequest::setStatus));
        builder.<ListAclRulesRequest.ActionTypeEnum>withRequestField("action_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.ActionTypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getActionType, ListAclRulesRequest::setActionType));
        builder.<ListAclRulesRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getAddressType, ListAclRulesRequest::setAddressType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getLimit, ListAclRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getOffset, ListAclRulesRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getEnterpriseProjectId,
                ListAclRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getFwInstanceId, ListAclRulesRequest::setFwInstanceId));
        builder.<String>withRequestField("tags_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getTagsId, ListAclRulesRequest::setTagsId));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getSource, ListAclRulesRequest::setSource));
        builder.<String>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getDestination, ListAclRulesRequest::setDestination));
        builder.<String>withRequestField("service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getService, ListAclRulesRequest::setService));
        builder.<String>withRequestField("application",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getApplication, ListAclRulesRequest::setApplication));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegionsRequest, ListRegionsResponse> listRegions = genForListRegions();

    private static HttpRequestDef<ListRegionsRequest, ListRegionsResponse> genForListRegions() {
        // basic
        HttpRequestDef.Builder<ListRegionsRequest, ListRegionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRegionsRequest.class, ListRegionsResponse.class)
                .withName("ListRegions")
                .withUri("/v1/{project_id}/regions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getFwInstanceId, ListRegionsRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegionsRequest::getEnterpriseProjectId,
                ListRegionsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTags =
        genForListRuleAclTags();

    private static HttpRequestDef<ListRuleAclTagsRequest, ListRuleAclTagsResponse> genForListRuleAclTags() {
        // basic
        HttpRequestDef.Builder<ListRuleAclTagsRequest, ListRuleAclTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleAclTagsRequest.class, ListRuleAclTagsResponse.class)
                .withName("ListRuleAclTags")
                .withUri("/v2/{project_id}/cfw-acl/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getEnterpriseProjectId,
                ListRuleAclTagsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getFwInstanceId, ListRuleAclTagsRequest::setFwInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getOffset, ListRuleAclTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getLimit, ListRuleAclTagsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImportStatusRequest, ShowImportStatusResponse> showImportStatus =
        genForShowImportStatus();

    private static HttpRequestDef<ShowImportStatusRequest, ShowImportStatusResponse> genForShowImportStatus() {
        // basic
        HttpRequestDef.Builder<ShowImportStatusRequest, ShowImportStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImportStatusRequest.class, ShowImportStatusResponse.class)
                .withName("ShowImportStatus")
                .withUri("/v1/{project_id}/acl-rule/import-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImportStatusRequest::getObjectId, ShowImportStatusRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImportStatusRequest::getEnterpriseProjectId,
                ShowImportStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRule =
        genForUpdateAclRule();

    private static HttpRequestDef<UpdateAclRuleRequest, UpdateAclRuleResponse> genForUpdateAclRule() {
        // basic
        HttpRequestDef.Builder<UpdateAclRuleRequest, UpdateAclRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclRuleRequest.class, UpdateAclRuleResponse.class)
                .withName("UpdateAclRule")
                .withUri("/v1/{project_id}/acl-rule/{acl_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getAclRuleId, UpdateAclRuleRequest::setAclRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getEnterpriseProjectId,
                UpdateAclRuleRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getFwInstanceId, UpdateAclRuleRequest::setFwInstanceId));
        builder.<UpdateRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleAclDto.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getBody, UpdateAclRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrder =
        genForUpdateAclRuleOrder();

    private static HttpRequestDef<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> genForUpdateAclRuleOrder() {
        // basic
        HttpRequestDef.Builder<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclRuleOrderRequest.class, UpdateAclRuleOrderResponse.class)
                .withName("UpdateAclRuleOrder")
                .withUri("/v1/{project_id}/acl-rule/order/{acl_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("acl_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getAclRuleId, UpdateAclRuleOrderRequest::setAclRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getEnterpriseProjectId,
                UpdateAclRuleOrderRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getFwInstanceId,
                UpdateAclRuleOrderRequest::setFwInstanceId));
        builder.<OrderRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderRuleAclDto.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getBody, UpdateAclRuleOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatus =
        genForChangeEipStatus();

    private static HttpRequestDef<ChangeEipStatusRequest, ChangeEipStatusResponse> genForChangeEipStatus() {
        // basic
        HttpRequestDef.Builder<ChangeEipStatusRequest, ChangeEipStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeEipStatusRequest.class, ChangeEipStatusResponse.class)
                .withName("ChangeEipStatus")
                .withUri("/v1/{project_id}/eip/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEipStatusRequest::getEnterpriseProjectId,
                ChangeEipStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEipStatusRequest::getFwInstanceId, ChangeEipStatusRequest::setFwInstanceId));
        builder.<EipOperateProtectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipOperateProtectReq.class),
            f -> f.withMarshaller(ChangeEipStatusRequest::getBody, ChangeEipStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> listAlarmWhitelist =
        genForListAlarmWhitelist();

    private static HttpRequestDef<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> genForListAlarmWhitelist() {
        // basic
        HttpRequestDef.Builder<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmWhitelistRequest.class, ListAlarmWhitelistResponse.class)
                .withName("ListAlarmWhitelist")
                .withUri("/v1/{project_id}/eip/alarm-whitelist/{fw_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhitelistRequest::getFwInstanceId,
                ListAlarmWhitelistRequest::setFwInstanceId));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhitelistRequest::getIpAddress, ListAlarmWhitelistRequest::setIpAddress));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhitelistRequest::getLimit, ListAlarmWhitelistRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhitelistRequest::getOffset, ListAlarmWhitelistRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhitelistRequest::getEnterpriseProjectId,
                ListAlarmWhitelistRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipCountRequest, ListEipCountResponse> listEipCount = genForListEipCount();

    private static HttpRequestDef<ListEipCountRequest, ListEipCountResponse> genForListEipCount() {
        // basic
        HttpRequestDef.Builder<ListEipCountRequest, ListEipCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEipCountRequest.class, ListEipCountResponse.class)
                .withName("ListEipCount")
                .withUri("/v1/{project_id}/eip-count/{object_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipCountRequest::getObjectId, ListEipCountRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipCountRequest::getEnterpriseProjectId,
                ListEipCountRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipCountRequest::getFwInstanceId, ListEipCountRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipsRequest, ListEipsResponse> listEips = genForListEips();

    private static HttpRequestDef<ListEipsRequest, ListEipsResponse> genForListEips() {
        // basic
        HttpRequestDef.Builder<ListEipsRequest, ListEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEipsRequest.class, ListEipsResponse.class)
                .withName("ListEips")
                .withUri("/v1/{project_id}/eips/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getObjectId, ListEipsRequest::setObjectId));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getKeyWord, ListEipsRequest::setKeyWord));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getStatus, ListEipsRequest::setStatus));
        builder.<Integer>withRequestField("sync",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getSync, ListEipsRequest::setSync));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getLimit, ListEipsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getOffset, ListEipsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getEnterpriseProjectId, ListEipsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("device_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getDeviceKey, ListEipsRequest::setDeviceKey));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getAddressType, ListEipsRequest::setAddressType));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getFwInstanceId, ListEipsRequest::setFwInstanceId));
        builder.<String>withRequestField("fw_key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getFwKeyWord, ListEipsRequest::setFwKeyWord));
        builder.<String>withRequestField("eps_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getEpsId, ListEipsRequest::setEpsId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getTags, ListEipsRequest::setTags));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> showAutoProtectStatus =
        genForShowAutoProtectStatus();

    private static HttpRequestDef<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> genForShowAutoProtectStatus() {
        // basic
        HttpRequestDef.Builder<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoProtectStatusRequest.class, ShowAutoProtectStatusResponse.class)
            .withName("ShowAutoProtectStatus")
            .withUri("/v1/{project_id}/eip/auto-protect-status/{object_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoProtectStatusRequest::getObjectId,
                ShowAutoProtectStatusRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoProtectStatusRequest::getEnterpriseProjectId,
                ShowAutoProtectStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> switchAutoProtectStatus =
        genForSwitchAutoProtectStatus();

    private static HttpRequestDef<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> genForSwitchAutoProtectStatus() {
        // basic
        HttpRequestDef.Builder<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchAutoProtectStatusRequest.class, SwitchAutoProtectStatusResponse.class)
            .withName("SwitchAutoProtectStatus")
            .withUri("/v1/{project_id}/eip/auto-protect-status/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAutoProtectStatusRequest::getEnterpriseProjectId,
                SwitchAutoProtectStatusRequest::setEnterpriseProjectId));
        builder.<SwitchEipStatusDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchEipStatusDto.class),
            f -> f.withMarshaller(SwitchAutoProtectStatusRequest::getBody, SwitchAutoProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectMode =
        genForChangeIpsProtectMode();

    private static HttpRequestDef<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> genForChangeIpsProtectMode() {
        // basic
        HttpRequestDef.Builder<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeIpsProtectModeRequest.class, ChangeIpsProtectModeResponse.class)
            .withName("ChangeIpsProtectMode")
            .withUri("/v1/{project_id}/ips/protect")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getEnterpriseProjectId,
                ChangeIpsProtectModeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getFwInstanceId,
                ChangeIpsProtectModeRequest::setFwInstanceId));
        builder.<IpsProtectDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsProtectDTO.class),
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getBody, ChangeIpsProtectModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> changeIpsRuleMode =
        genForChangeIpsRuleMode();

    private static HttpRequestDef<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> genForChangeIpsRuleMode() {
        // basic
        HttpRequestDef.Builder<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeIpsRuleModeRequest.class, ChangeIpsRuleModeResponse.class)
                .withName("ChangeIpsRuleMode")
                .withUri("/v1/{project_id}/ips-rule/mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsRuleModeRequest::getEnterpriseProjectId,
                ChangeIpsRuleModeRequest::setEnterpriseProjectId));
        builder.<IpsRuleChangeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsRuleChangeDto.class),
            f -> f.withMarshaller(ChangeIpsRuleModeRequest::getBody, ChangeIpsRuleModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatus =
        genForChangeIpsSwitchStatus();

    private static HttpRequestDef<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> genForChangeIpsSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeIpsSwitchStatusRequest.class, ChangeIpsSwitchStatusResponse.class)
            .withName("ChangeIpsSwitchStatus")
            .withUri("/v1/{project_id}/ips/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getEnterpriseProjectId,
                ChangeIpsSwitchStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getFwInstanceId,
                ChangeIpsSwitchStatusRequest::setFwInstanceId));
        builder.<IpsSwitchDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsSwitchDTO.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getBody, ChangeIpsSwitchStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomerIpsRequest, ListCustomerIpsResponse> listCustomerIps =
        genForListCustomerIps();

    private static HttpRequestDef<ListCustomerIpsRequest, ListCustomerIpsResponse> genForListCustomerIps() {
        // basic
        HttpRequestDef.Builder<ListCustomerIpsRequest, ListCustomerIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomerIpsRequest.class, ListCustomerIpsResponse.class)
                .withName("ListCustomerIps")
                .withUri("/v1/{project_id}/ips/custom-rule")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("action_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getActionType, ListCustomerIpsRequest::setActionType));
        builder.<Integer>withRequestField("affected_os",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getAffectedOs, ListCustomerIpsRequest::setAffectedOs));
        builder.<Integer>withRequestField("attack_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getAttackType, ListCustomerIpsRequest::setAttackType));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getFwInstanceId, ListCustomerIpsRequest::setFwInstanceId));
        builder.<String>withRequestField("ips_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getIpsName, ListCustomerIpsRequest::setIpsName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getLimit, ListCustomerIpsRequest::setLimit));
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getObjectId, ListCustomerIpsRequest::setObjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getOffset, ListCustomerIpsRequest::setOffset));
        builder.<Integer>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getProtocol, ListCustomerIpsRequest::setProtocol));
        builder.<Integer>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getSeverity, ListCustomerIpsRequest::setSeverity));
        builder.<Integer>withRequestField("software",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getSoftware, ListCustomerIpsRequest::setSoftware));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomerIpsRequest::getEnterpriseProjectId,
                ListCustomerIpsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectMode =
        genForListIpsProtectMode();

    private static HttpRequestDef<ListIpsProtectModeRequest, ListIpsProtectModeResponse> genForListIpsProtectMode() {
        // basic
        HttpRequestDef.Builder<ListIpsProtectModeRequest, ListIpsProtectModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpsProtectModeRequest.class, ListIpsProtectModeResponse.class)
                .withName("ListIpsProtectMode")
                .withUri("/v1/{project_id}/ips/protect")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeRequest::getObjectId, ListIpsProtectModeRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeRequest::getEnterpriseProjectId,
                ListIpsProtectModeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeRequest::getFwInstanceId,
                ListIpsProtectModeRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsRulesRequest, ListIpsRulesResponse> listIpsRules = genForListIpsRules();

    private static HttpRequestDef<ListIpsRulesRequest, ListIpsRulesResponse> genForListIpsRules() {
        // basic
        HttpRequestDef.Builder<ListIpsRulesRequest, ListIpsRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpsRulesRequest.class, ListIpsRulesResponse.class)
                .withName("ListIpsRules")
                .withUri("/v1/{project_id}/advanced-ips-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRulesRequest::getObjectId, ListIpsRulesRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRulesRequest::getEnterpriseProjectId,
                ListIpsRulesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsRules1Request, ListIpsRules1Response> listIpsRules1 =
        genForListIpsRules1();

    private static HttpRequestDef<ListIpsRules1Request, ListIpsRules1Response> genForListIpsRules1() {
        // basic
        HttpRequestDef.Builder<ListIpsRules1Request, ListIpsRules1Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpsRules1Request.class, ListIpsRules1Response.class)
                .withName("ListIpsRules1")
                .withUri("/v1/{project_id}/ips-rule")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("affected_application_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getAffectedApplicationLike,
                ListIpsRules1Request::setAffectedApplicationLike));
        builder.<Integer>withRequestField("create_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getCreateTime, ListIpsRules1Request::setCreateTime));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getFwInstanceId, ListIpsRules1Request::setFwInstanceId));
        builder.<Integer>withRequestField("ips_cve_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsCveLike, ListIpsRules1Request::setIpsCveLike));
        builder.<Integer>withRequestField("ips_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsGroup, ListIpsRules1Request::setIpsGroup));
        builder.<String>withRequestField("ips_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsId, ListIpsRules1Request::setIpsId));
        builder.<Integer>withRequestField("ips_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsLevel, ListIpsRules1Request::setIpsLevel));
        builder.<String>withRequestField("ips_name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsNameLike, ListIpsRules1Request::setIpsNameLike));
        builder.<Integer>withRequestField("ips_rules_type_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsRulesTypeLike,
                ListIpsRules1Request::setIpsRulesTypeLike));
        builder.<String>withRequestField("ips_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIpsStatus, ListIpsRules1Request::setIpsStatus));
        builder.<Boolean>withRequestField("is_updated_ips_rule_queried",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIpsRules1Request::getIsUpdatedIpsRuleQueried,
                ListIpsRules1Request::setIsUpdatedIpsRuleQueried));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getLimit, ListIpsRules1Request::setLimit));
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getObjectId, ListIpsRules1Request::setObjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpsRules1Request::getOffset, ListIpsRules1Request::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsRules1Request::getEnterpriseProjectId,
                ListIpsRules1Request::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatus =
        genForListIpsSwitchStatus();

    private static HttpRequestDef<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> genForListIpsSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpsSwitchStatusRequest.class, ListIpsSwitchStatusResponse.class)
                .withName("ListIpsSwitchStatus")
                .withUri("/v1/{project_id}/ips/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getObjectId, ListIpsSwitchStatusRequest::setObjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getEnterpriseProjectId,
                ListIpsSwitchStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getFwInstanceId,
                ListIpsSwitchStatusRequest::setFwInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> showIpsUpdateTime =
        genForShowIpsUpdateTime();

    private static HttpRequestDef<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> genForShowIpsUpdateTime() {
        // basic
        HttpRequestDef.Builder<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpsUpdateTimeRequest.class, ShowIpsUpdateTimeResponse.class)
                .withName("ShowIpsUpdateTime")
                .withUri("/v1/{project_id}/ips-rule/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpsUpdateTimeRequest::getFwInstanceId,
                ShowIpsUpdateTimeRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpsUpdateTimeRequest::getEnterpriseProjectId,
                ShowIpsUpdateTimeRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRule =
        genForUpdateAdvancedIpsRule();

    private static HttpRequestDef<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> genForUpdateAdvancedIpsRule() {
        // basic
        HttpRequestDef.Builder<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAdvancedIpsRuleRequest.class, UpdateAdvancedIpsRuleResponse.class)
            .withName("UpdateAdvancedIpsRule")
            .withUri("/v1/{project_id}/advanced-ips-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAdvancedIpsRuleRequest::getFwInstanceId,
                UpdateAdvancedIpsRuleRequest::setFwInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAdvancedIpsRuleRequest::getEnterpriseProjectId,
                UpdateAdvancedIpsRuleRequest::setEnterpriseProjectId));
        builder.<AdvancedIpsRuleDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdvancedIpsRuleDto.class),
            f -> f.withMarshaller(UpdateAdvancedIpsRuleRequest::getBody, UpdateAdvancedIpsRuleRequest::setBody));

        // response

        return builder.build();
    }

}

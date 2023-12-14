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
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEastWestFirewallStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeEipStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsProtectModeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ChangeIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ChangeProtectStatusRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.ClearAccessLogRuleHitCountsDto;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequestBody;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallReq;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.EipOperateProtectReq;
import com.huaweicloud.sdk.cfw.v1.model.IpsProtectDTO;
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
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListBlackWhiteListsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListDomainParseDetailResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpsSwitchStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListJobRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListJobResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetDto;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetResponse;
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

@SuppressWarnings("unchecked")
public class CfwMeta {

    public static final HttpRequestDef<AddAddressItemRequest, AddAddressItemResponse> addAddressItem =
        genForaddAddressItem();

    private static HttpRequestDef<AddAddressItemRequest, AddAddressItemResponse> genForaddAddressItem() {
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
            f -> f.withMarshaller(AddAddressItemRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressItemRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddAddressItemsInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressItemsInfoDto.class),
            f -> f.withMarshaller(AddAddressItemRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAddressSetRequest, AddAddressSetResponse> addAddressSet =
        genForaddAddressSet();

    private static HttpRequestDef<AddAddressSetRequest, AddAddressSetResponse> genForaddAddressSet() {
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
            f -> f.withMarshaller(AddAddressSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAddressSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAddressSetDto.class),
            f -> f.withMarshaller(AddAddressSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteList =
        genForaddBlackWhiteList();

    private static HttpRequestDef<AddBlackWhiteListRequest, AddBlackWhiteListResponse> genForaddBlackWhiteList() {
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
            f -> f.withMarshaller(AddBlackWhiteListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBlackWhiteListRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBlackWhiteListDto.class),
            f -> f.withMarshaller(AddBlackWhiteListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDomainSetRequest, AddDomainSetResponse> addDomainSet = genForaddDomainSet();

    private static HttpRequestDef<AddDomainSetRequest, AddDomainSetResponse> genForaddDomainSet() {
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
            f -> f.withMarshaller(AddDomainSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddDomainSetInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDomainSetInfoDto.class),
            f -> f.withMarshaller(AddDomainSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDomainsRequest, AddDomainsResponse> addDomains = genForaddDomains();

    private static HttpRequestDef<AddDomainsRequest, AddDomainsResponse> genForaddDomains() {
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
            f -> f.withMarshaller(AddDomainsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDomainsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddDomainListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDomainListDto.class),
            f -> f.withMarshaller(AddDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddLogConfigRequest, AddLogConfigResponse> addLogConfig = genForaddLogConfig();

    private static HttpRequestDef<AddLogConfigRequest, AddLogConfigResponse> genForaddLogConfig() {
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
            f -> f.withMarshaller(AddLogConfigRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddLogConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<LogConfigDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogConfigDto.class),
            f -> f.withMarshaller(AddLogConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItems =
        genForaddServiceItems();

    private static HttpRequestDef<AddServiceItemsRequest, AddServiceItemsResponse> genForaddServiceItems() {
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
            f -> f.withMarshaller(AddServiceItemsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceItemsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddServiceItemsUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceItemsUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddServiceSetRequest, AddServiceSetResponse> addServiceSet =
        genForaddServiceSet();

    private static HttpRequestDef<AddServiceSetRequest, AddServiceSetResponse> genForaddServiceSet() {
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
            f -> f.withMarshaller(AddServiceSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddServiceSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddServiceSetUsingPOSTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddServiceSetUsingPOSTRequestBody.class),
            f -> f.withMarshaller(AddServiceSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItems =
        genForbatchDeleteAddressItems();

    private static HttpRequestDef<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> genForbatchDeleteAddressItems() {
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
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<DeleteAddressItemsInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAddressItemsInfoDto.class),
            f -> f.withMarshaller(BatchDeleteAddressItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItems =
        genForbatchDeleteServiceItems();

    private static HttpRequestDef<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> genForbatchDeleteServiceItems() {
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
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<DeleteServiceItemDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteServiceItemDto.class),
            f -> f.withMarshaller(BatchDeleteServiceItemsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatus =
        genForchangeEastWestFirewallStatus();

    private static HttpRequestDef<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> genForchangeEastWestFirewallStatus() {
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
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<ChangeProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeProtectStatusRequestBody.class),
            f -> f.withMarshaller(ChangeEastWestFirewallStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewall =
        genForcreateEastWestFirewall();

    private static HttpRequestDef<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> genForcreateEastWestFirewall() {
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
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<CreateEastWestFirewallRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEastWestFirewallRequestBody.class),
            f -> f.withMarshaller(CreateEastWestFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> createFirewall =
        genForcreateFirewall();

    private static HttpRequestDef<CreateFirewallRequest, CreateFirewallResponse> genForcreateFirewall() {
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
            f -> f.withMarshaller(CreateFirewallRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<String>withRequestField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFirewallRequest::getXTraceId, (req, v) -> {
                req.setXTraceId(v);
            }));
        builder.<CreateFirewallReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFirewallReq.class),
            f -> f.withMarshaller(CreateFirewallRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItem =
        genFordeleteAddressItem();

    private static HttpRequestDef<DeleteAddressItemRequest, DeleteAddressItemResponse> genFordeleteAddressItem() {
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
            f -> f.withMarshaller(DeleteAddressItemRequest::getItemId, (req, v) -> {
                req.setItemId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressItemRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSet =
        genFordeleteAddressSet();

    private static HttpRequestDef<DeleteAddressSetRequest, DeleteAddressSetResponse> genFordeleteAddressSet() {
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
            f -> f.withMarshaller(DeleteAddressSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddressSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteList =
        genFordeleteBlackWhiteList();

    private static HttpRequestDef<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> genFordeleteBlackWhiteList() {
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
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getListId, (req, v) -> {
                req.setListId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBlackWhiteListRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSet =
        genFordeleteDomainSet();

    private static HttpRequestDef<DeleteDomainSetRequest, DeleteDomainSetResponse> genFordeleteDomainSet() {
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
            f -> f.withMarshaller(DeleteDomainSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomains =
        genFordeleteDomains();

    private static HttpRequestDef<DeleteDomainsRequest, DeleteDomainsResponse> genFordeleteDomains() {
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
            f -> f.withMarshaller(DeleteDomainsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<DeleteDomainDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDomainDto.class),
            f -> f.withMarshaller(DeleteDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewall =
        genFordeleteFirewall();

    private static HttpRequestDef<DeleteFirewallRequest, DeleteFirewallResponse> genFordeleteFirewall() {
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
            f -> f.withMarshaller(DeleteFirewallRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItem =
        genFordeleteServiceItem();

    private static HttpRequestDef<DeleteServiceItemRequest, DeleteServiceItemResponse> genFordeleteServiceItem() {
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
            f -> f.withMarshaller(DeleteServiceItemRequest::getItemId, (req, v) -> {
                req.setItemId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceItemRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSet =
        genFordeleteServiceSet();

    private static HttpRequestDef<DeleteServiceSetRequest, DeleteServiceSetResponse> genFordeleteServiceSet() {
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
            f -> f.withMarshaller(DeleteServiceSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogs =
        genForlistAccessControlLogs();

    private static HttpRequestDef<ListAccessControlLogsRequest, ListAccessControlLogsResponse> genForlistAccessControlLogs() {
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
            f -> f.withMarshaller(ListAccessControlLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Integer>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListAccessControlLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccessControlLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getDstHost, (req, v) -> {
                req.setDstHost(v);
            }));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessControlLogsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItems =
        genForlistAddressItems();

    private static HttpRequestDef<ListAddressItemsRequest, ListAddressItemsResponse> genForlistAddressItems() {
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
            f -> f.withMarshaller(ListAddressItemsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressItemsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetail =
        genForlistAddressSetDetail();

    private static HttpRequestDef<ListAddressSetDetailRequest, ListAddressSetDetailResponse> genForlistAddressSetDetail() {
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
            f -> f.withMarshaller(ListAddressSetDetailRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetDetailRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSets =
        genForlistAddressSets();

    private static HttpRequestDef<ListAddressSetsRequest, ListAddressSetsResponse> genForlistAddressSets() {
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
            f -> f.withMarshaller(ListAddressSetsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<ListAddressSetsRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAddressSetsRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddressSetsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogs =
        genForlistAttackLogs();

    private static HttpRequestDef<ListAttackLogsRequest, ListAttackLogsResponse> genForlistAttackLogs() {
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
            f -> f.withMarshaller(ListAttackLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<ListAttackLogsRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<ListAttackLogsRequest.ActionEnum>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.ActionEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<ListAttackLogsRequest.DirectionEnum>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.DirectionEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<String>withRequestField("attack_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackType, (req, v) -> {
                req.setAttackType(v);
            }));
        builder.<String>withRequestField("attack_rule",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getAttackRule, (req, v) -> {
                req.setAttackRule(v);
            }));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getSource, (req, v) -> {
                req.setSource(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getDstHost, (req, v) -> {
                req.setDstHost(v);
            }));
        builder.<ListAttackLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAttackLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListAttackLogsRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteLists =
        genForlistBlackWhiteLists();

    private static HttpRequestDef<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> genForlistBlackWhiteLists() {
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
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<ListBlackWhiteListsRequest.ListTypeEnum>withRequestField("list_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBlackWhiteListsRequest.ListTypeEnum.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getListType, (req, v) -> {
                req.setListType(v);
            }));
        builder.<ListBlackWhiteListsRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBlackWhiteListsRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlackWhiteListsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> listDnsServers =
        genForlistDnsServers();

    private static HttpRequestDef<ListDnsServersRequest, ListDnsServersResponse> genForlistDnsServers() {
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
            f -> f.withMarshaller(ListDnsServersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDnsServersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDnsServersRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDnsServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetail =
        genForlistDomainParseDetail();

    private static HttpRequestDef<ListDomainParseDetailRequest, ListDomainParseDetailResponse> genForlistDomainParseDetail() {
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
            f -> f.withMarshaller(ListDomainParseDetailRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainParseDetailRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSets =
        genForlistDomainSets();

    private static HttpRequestDef<ListDomainSetsRequest, ListDomainSetsResponse> genForlistDomainSets() {
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
            f -> f.withMarshaller(ListDomainSetsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("object_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("domain_set_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getDomainSetType, (req, v) -> {
                req.setDomainSetType(v);
            }));
        builder.<Integer>withRequestField("config_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainSetsRequest::getConfigStatus, (req, v) -> {
                req.setConfigStatus(v);
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
                .withUri("/v1/{project_id}/domain-set/domains/{domain_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainSetId, (req, v) -> {
                req.setDomainSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("object_Id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewall =
        genForlistEastWestFirewall();

    private static HttpRequestDef<ListEastWestFirewallRequest, ListEastWestFirewallResponse> genForlistEastWestFirewall() {
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
            f -> f.withMarshaller(ListEastWestFirewallRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEastWestFirewallRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetail =
        genForlistFirewallDetail();

    private static HttpRequestDef<ListFirewallDetailRequest, ListFirewallDetailResponse> genForlistFirewallDetail() {
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
            f -> f.withMarshaller(ListFirewallDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListFirewallDetailRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFirewallDetailRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirewallDetailRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirewallListRequest, ListFirewallListResponse> listFirewallList =
        genForlistFirewallList();

    private static HttpRequestDef<ListFirewallListRequest, ListFirewallListResponse> genForlistFirewallList() {
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
            f -> f.withMarshaller(ListFirewallListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<QueryFireWallInstanceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryFireWallInstanceDto.class),
            f -> f.withMarshaller(ListFirewallListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogs = genForlistFlowLogs();

    private static HttpRequestDef<ListFlowLogsRequest, ListFlowLogsResponse> genForlistFlowLogs() {
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
            f -> f.withMarshaller(ListFlowLogsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<ListFlowLogsRequest.LogTypeEnum>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.LogTypeEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogType, (req, v) -> {
                req.setLogType(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcIp, (req, v) -> {
                req.setSrcIp(v);
            }));
        builder.<Integer>withRequestField("src_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getSrcPort, (req, v) -> {
                req.setSrcPort(v);
            }));
        builder.<String>withRequestField("dst_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstIp, (req, v) -> {
                req.setDstIp(v);
            }));
        builder.<Integer>withRequestField("dst_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstPort, (req, v) -> {
                req.setDstPort(v);
            }));
        builder.<ListFlowLogsRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlowLogsRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("log_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLogId, (req, v) -> {
                req.setLogId(v);
            }));
        builder.<Long>withRequestField("next_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getNextDate, (req, v) -> {
                req.setNextDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("dst_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlowLogsRequest::getDstHost, (req, v) -> {
                req.setDstHost(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobRequest, ListJobResponse> listJob = genForlistJob();

    private static HttpRequestDef<ListJobRequest, ListJobResponse> genForlistJob() {
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
            f -> f.withMarshaller(ListJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogConfigRequest, ListLogConfigResponse> listLogConfig =
        genForlistLogConfig();

    private static HttpRequestDef<ListLogConfigRequest, ListLogConfigResponse> genForlistLogConfig() {
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
            f -> f.withMarshaller(ListLogConfigRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcs =
        genForlistProtectedVpcs();

    private static HttpRequestDef<ListProtectedVpcsRequest, ListProtectedVpcsResponse> genForlistProtectedVpcs() {
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
            f -> f.withMarshaller(ListProtectedVpcsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedVpcsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectedVpcsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItems =
        genForlistServiceItems();

    private static HttpRequestDef<ListServiceItemsRequest, ListServiceItemsResponse> genForlistServiceItems() {
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
            f -> f.withMarshaller(ListServiceItemsRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceItemsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetail =
        genForlistServiceSetDetail();

    private static HttpRequestDef<ListServiceSetDetailRequest, ListServiceSetDetailResponse> genForlistServiceSetDetail() {
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
            f -> f.withMarshaller(ListServiceSetDetailRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetDetailRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSets =
        genForlistServiceSets();

    private static HttpRequestDef<ListServiceSetsRequest, ListServiceSetsResponse> genForlistServiceSets() {
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
            f -> f.withMarshaller(ListServiceSetsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServiceSetsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSet =
        genForupdateAddressSet();

    private static HttpRequestDef<UpdateAddressSetRequest, UpdateAddressSetResponse> genForupdateAddressSet() {
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
            f -> f.withMarshaller(UpdateAddressSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<UpdateAddressSetDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAddressSetDto.class),
            f -> f.withMarshaller(UpdateAddressSetRequest::getBody, (req, v) -> {
                req.setBody(v);
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
            .withUri("/v1/{project_id}/black-white-list/{list_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("list_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getListId, (req, v) -> {
                req.setListId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<UpdateBlackWhiteListDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBlackWhiteListDto.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServers =
        genForupdateDnsServers();

    private static HttpRequestDef<UpdateDnsServersRequest, UpdateDnsServersResponse> genForupdateDnsServers() {
        // basic
        HttpRequestDef.Builder<UpdateDnsServersRequest, UpdateDnsServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDnsServersRequest.class, UpdateDnsServersResponse.class)
                .withName("UpdateDnsServers")
                .withUri("/v1/{project_id}/dns/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateDnsServersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDnsServersRequestBody.class),
            f -> f.withMarshaller(UpdateDnsServersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSet =
        genForupdateDomainSet();

    private static HttpRequestDef<UpdateDomainSetRequest, UpdateDomainSetResponse> genForupdateDomainSet() {
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
            f -> f.withMarshaller(UpdateDomainSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<UpdateDomainSetInfoDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDomainSetInfoDto.class),
            f -> f.withMarshaller(UpdateDomainSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfig =
        genForupdateLogConfig();

    private static HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> genForupdateLogConfig() {
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
            f -> f.withMarshaller(UpdateLogConfigRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<LogConfigDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogConfigDto.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSet =
        genForupdateServiceSet();

    private static HttpRequestDef<UpdateServiceSetRequest, UpdateServiceSetResponse> genForupdateServiceSet() {
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
            f -> f.withMarshaller(UpdateServiceSetRequest::getSetId, (req, v) -> {
                req.setSetId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<UpdateServiceSetUsingPUTRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServiceSetUsingPUTRequestBody.class),
            f -> f.withMarshaller(UpdateServiceSetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAclRuleRequest, AddAclRuleResponse> addAclRule = genForaddAclRule();

    private static HttpRequestDef<AddAclRuleRequest, AddAclRuleResponse> genForaddAclRule() {
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
            f -> f.withMarshaller(AddAclRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAclRuleRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<AddRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRuleAclDto.class),
            f -> f.withMarshaller(AddAclRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRules =
        genForbatchDeleteAclRules();

    private static HttpRequestDef<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> genForbatchDeleteAclRules() {
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
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<DeleteRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRuleAclDto.class),
            f -> f.withMarshaller(BatchDeleteAclRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActions =
        genForbatchUpdateAclRuleActions();

    private static HttpRequestDef<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> genForbatchUpdateAclRuleActions() {
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
            f -> f.withMarshaller(BatchUpdateAclRuleActionsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<UpdateSecurityPolciesActionDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityPolciesActionDto.class),
            f -> f.withMarshaller(BatchUpdateAclRuleActionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRule =
        genFordeleteAclRule();

    private static HttpRequestDef<DeleteAclRuleRequest, DeleteAclRuleResponse> genFordeleteAclRule() {
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
            f -> f.withMarshaller(DeleteAclRuleRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCount =
        genFordeleteAclRuleHitCount();

    private static HttpRequestDef<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> genFordeleteAclRuleHitCount() {
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
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<ClearAccessLogRuleHitCountsDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClearAccessLogRuleHitCountsDto.class),
            f -> f.withMarshaller(DeleteAclRuleHitCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAclRuleHitCountResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCount =
        genForlistAclRuleHitCount();

    private static HttpRequestDef<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> genForlistAclRuleHitCount() {
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
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<ListRuleHitCountDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRuleHitCountDto.class),
            f -> f.withMarshaller(ListAclRuleHitCountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclRulesRequest, ListAclRulesResponse> listAclRules = genForlistAclRules();

    private static HttpRequestDef<ListAclRulesRequest, ListAclRulesResponse> genForlistAclRules() {
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
            f -> f.withMarshaller(ListAclRulesRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<ListAclRulesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ListAclRulesRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getIp, (req, v) -> {
                req.setIp(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<ListAclRulesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListAclRulesRequest.ActionTypeEnum>withRequestField("action_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.ActionTypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getActionType, (req, v) -> {
                req.setActionType(v);
            }));
        builder.<ListAclRulesRequest.AddressTypeEnum>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAclRulesRequest.AddressTypeEnum.class),
            f -> f.withMarshaller(ListAclRulesRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("tags_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getTagsId, (req, v) -> {
                req.setTagsId(v);
            }));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getSource, (req, v) -> {
                req.setSource(v);
            }));
        builder.<String>withRequestField("destination",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getDestination, (req, v) -> {
                req.setDestination(v);
            }));
        builder.<String>withRequestField("service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclRulesRequest::getService, (req, v) -> {
                req.setService(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTags =
        genForlistRuleAclTags();

    private static HttpRequestDef<ListRuleAclTagsRequest, ListRuleAclTagsResponse> genForlistRuleAclTags() {
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
            f -> f.withMarshaller(ListRuleAclTagsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleAclTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRule =
        genForupdateAclRule();

    private static HttpRequestDef<UpdateAclRuleRequest, UpdateAclRuleResponse> genForupdateAclRule() {
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
            f -> f.withMarshaller(UpdateAclRuleRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<UpdateRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleAclDto.class),
            f -> f.withMarshaller(UpdateAclRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrder =
        genForupdateAclRuleOrder();

    private static HttpRequestDef<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> genForupdateAclRuleOrder() {
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
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getAclRuleId, (req, v) -> {
                req.setAclRuleId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<OrderRuleAclDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderRuleAclDto.class),
            f -> f.withMarshaller(UpdateAclRuleOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatus =
        genForchangeEipStatus();

    private static HttpRequestDef<ChangeEipStatusRequest, ChangeEipStatusResponse> genForchangeEipStatus() {
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
            f -> f.withMarshaller(ChangeEipStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEipStatusRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<EipOperateProtectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipOperateProtectReq.class),
            f -> f.withMarshaller(ChangeEipStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipCountRequest, ListEipCountResponse> listEipCount = genForlistEipCount();

    private static HttpRequestDef<ListEipCountRequest, ListEipCountResponse> genForlistEipCount() {
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
            f -> f.withMarshaller(ListEipCountRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipCountRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipCountRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEipsRequest, ListEipsResponse> listEips = genForlistEips();

    private static HttpRequestDef<ListEipsRequest, ListEipsResponse> genForlistEips() {
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
            f -> f.withMarshaller(ListEipsRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getKeyWord, (req, v) -> {
                req.setKeyWord(v);
            }));
        builder.<ListEipsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEipsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListEipsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<ListEipsRequest.SyncEnum>withRequestField("sync",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEipsRequest.SyncEnum.class),
            f -> f.withMarshaller(ListEipsRequest::getSync, (req, v) -> {
                req.setSync(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("device_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getDeviceKey, (req, v) -> {
                req.setDeviceKey(v);
            }));
        builder.<Integer>withRequestField("address_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEipsRequest::getAddressType, (req, v) -> {
                req.setAddressType(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("fw_key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getFwKeyWord, (req, v) -> {
                req.setFwKeyWord(v);
            }));
        builder.<String>withRequestField("eps_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getEpsId, (req, v) -> {
                req.setEpsId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEipsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectMode =
        genForchangeIpsProtectMode();

    private static HttpRequestDef<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> genForchangeIpsProtectMode() {
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
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<IpsProtectDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsProtectDTO.class),
            f -> f.withMarshaller(ChangeIpsProtectModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatus =
        genForchangeIpsSwitchStatus();

    private static HttpRequestDef<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> genForchangeIpsSwitchStatus() {
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
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<IpsSwitchDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IpsSwitchDTO.class),
            f -> f.withMarshaller(ChangeIpsSwitchStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectMode =
        genForlistIpsProtectMode();

    private static HttpRequestDef<ListIpsProtectModeRequest, ListIpsProtectModeResponse> genForlistIpsProtectMode() {
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
            f -> f.withMarshaller(ListIpsProtectModeRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsProtectModeRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatus =
        genForlistIpsSwitchStatus();

    private static HttpRequestDef<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> genForlistIpsSwitchStatus() {
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
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getObjectId, (req, v) -> {
                req.setObjectId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("fw_instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpsSwitchStatusRequest::getFwInstanceId, (req, v) -> {
                req.setFwInstanceId(v);
            }));

        // response

        return builder.build();
    }

}

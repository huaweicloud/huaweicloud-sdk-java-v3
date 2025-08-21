package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.AddServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAclRulesResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteAddressItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchDeleteServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.BatchUpdateAclRuleActionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CancelCaptureTaskResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleHitCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteAddressSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteCaptureTaskResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteDomainsResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagResponse;
import com.huaweicloud.sdk.cfw.v1.model.EnableIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.EnableIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.EnableMultiAccountRequest;
import com.huaweicloud.sdk.cfw.v1.model.EnableMultiAccountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ExportIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ExportIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ExportLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ExportLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ImportIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ImportIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAccessControlLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAccountsResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListAttackStatisticRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListAttackStatisticResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListFlowStatisticRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListFlowStatisticResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListIpBlacklistSwitchResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListLogsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListLogsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationAccountsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationAccountsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationTreeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListOrganizationTreeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListProtectedVpcsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRegionsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListReportProfilesRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListReportProfilesResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListRuleAclTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.RetryIpBlacklistRequest;
import com.huaweicloud.sdk.cfw.v1.model.RetryIpBlacklistResponse;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsRequest;
import com.huaweicloud.sdk.cfw.v1.model.SaveTagsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAccessTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAntiVirusSwitchResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTotalRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTotalResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAttackTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowCustomerIpsInfoRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowCustomerIpsInfoResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowDomainSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedErRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedErResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedVpcRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowEwAssociatedVpcResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFirewallReportRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFirewallReportResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTopRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTopResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowFlowTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowImportStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowIpsUpdateTimeResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowLogsCountRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowLogsCountResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.ShowTrafficTrendRequest;
import com.huaweicloud.sdk.cfw.v1.model.ShowTrafficTrendResponse;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusRequest;
import com.huaweicloud.sdk.cfw.v1.model.SwitchAutoProtectStatusResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateBlackWhiteListResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateCustomerIpsRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateCustomerIpsResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateObjectConfigDescRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateObjectConfigDescResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateReportProfileRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateReportProfileResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CfwClient {

    protected HcClient hcClient;

    public CfwClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CfwClient> newBuilder() {
        ClientBuilder<CfwClient> clientBuilder = new ClientBuilder<>(CfwClient::new);
        return clientBuilder;
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressItemRequest 请求对象
     * @return AddAddressItemResponse
     */
    public AddAddressItemResponse addAddressItem(AddAddressItemRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addAddressItem);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressItemRequest 请求对象
     * @return SyncInvoker<AddAddressItemRequest, AddAddressItemResponse>
     */
    public SyncInvoker<AddAddressItemRequest, AddAddressItemResponse> addAddressItemInvoker(
        AddAddressItemRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addAddressItem, hcClient);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return AddAddressSetResponse
     */
    public AddAddressSetResponse addAddressSet(AddAddressSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addAddressSet);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return SyncInvoker<AddAddressSetRequest, AddAddressSetResponse>
     */
    public SyncInvoker<AddAddressSetRequest, AddAddressSetResponse> addAddressSetInvoker(AddAddressSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addAddressSet, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return AddBlackWhiteListResponse
     */
    public AddBlackWhiteListResponse addBlackWhiteList(AddBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addBlackWhiteList);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return SyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>
     */
    public SyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteListInvoker(
        AddBlackWhiteListRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addBlackWhiteList, hcClient);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return AddDomainSetResponse
     */
    public AddDomainSetResponse addDomainSet(AddDomainSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addDomainSet);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return SyncInvoker<AddDomainSetRequest, AddDomainSetResponse>
     */
    public SyncInvoker<AddDomainSetRequest, AddDomainSetResponse> addDomainSetInvoker(AddDomainSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addDomainSet, hcClient);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return AddDomainsResponse
     */
    public AddDomainsResponse addDomains(AddDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addDomains);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return SyncInvoker<AddDomainsRequest, AddDomainsResponse>
     */
    public SyncInvoker<AddDomainsRequest, AddDomainsResponse> addDomainsInvoker(AddDomainsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addDomains, hcClient);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return AddLogConfigResponse
     */
    public AddLogConfigResponse addLogConfig(AddLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addLogConfig);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return SyncInvoker<AddLogConfigRequest, AddLogConfigResponse>
     */
    public SyncInvoker<AddLogConfigRequest, AddLogConfigResponse> addLogConfigInvoker(AddLogConfigRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addLogConfig, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return AddServiceItemsResponse
     */
    public AddServiceItemsResponse addServiceItems(AddServiceItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addServiceItems);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return SyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>
     */
    public SyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItemsInvoker(
        AddServiceItemsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addServiceItems, hcClient);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return AddServiceSetResponse
     */
    public AddServiceSetResponse addServiceSet(AddServiceSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addServiceSet);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return SyncInvoker<AddServiceSetRequest, AddServiceSetResponse>
     */
    public SyncInvoker<AddServiceSetRequest, AddServiceSetResponse> addServiceSetInvoker(AddServiceSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addServiceSet, hcClient);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return BatchDeleteAddressItemsResponse
     */
    public BatchDeleteAddressItemsResponse batchDeleteAddressItems(BatchDeleteAddressItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.batchDeleteAddressItems);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return SyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>
     */
    public SyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItemsInvoker(
        BatchDeleteAddressItemsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.batchDeleteAddressItems, hcClient);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return BatchDeleteDomainSetResponse
     */
    public BatchDeleteDomainSetResponse batchDeleteDomainSet(BatchDeleteDomainSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.batchDeleteDomainSet);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return SyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse>
     */
    public SyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> batchDeleteDomainSetInvoker(
        BatchDeleteDomainSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.batchDeleteDomainSet, hcClient);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return BatchDeleteServiceItemsResponse
     */
    public BatchDeleteServiceItemsResponse batchDeleteServiceItems(BatchDeleteServiceItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.batchDeleteServiceItems);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return SyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>
     */
    public SyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItemsInvoker(
        BatchDeleteServiceItemsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.batchDeleteServiceItems, hcClient);
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return CancelCaptureTaskResponse
     */
    public CancelCaptureTaskResponse cancelCaptureTask(CancelCaptureTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.cancelCaptureTask);
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return SyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse>
     */
    public SyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse> cancelCaptureTaskInvoker(
        CancelCaptureTaskRequest request) {
        return new SyncInvoker<>(request, CfwMeta.cancelCaptureTask, hcClient);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return CreateCaptureTaskResponse
     */
    public CreateCaptureTaskResponse createCaptureTask(CreateCaptureTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.createCaptureTask);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return SyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse>
     */
    public SyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse> createCaptureTaskInvoker(
        CreateCaptureTaskRequest request) {
        return new SyncInvoker<>(request, CfwMeta.createCaptureTask, hcClient);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return CreateEastWestFirewallResponse
     */
    public CreateEastWestFirewallResponse createEastWestFirewall(CreateEastWestFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.createEastWestFirewall);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return SyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse>
     */
    public SyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewallInvoker(
        CreateEastWestFirewallRequest request) {
        return new SyncInvoker<>(request, CfwMeta.createEastWestFirewall, hcClient);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CreateFirewallResponse
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.createFirewall);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public SyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallInvoker(
        CreateFirewallRequest request) {
        return new SyncInvoker<>(request, CfwMeta.createFirewall, hcClient);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.createTag);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, CfwMeta.createTag, hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return DeleteAddressItemResponse
     */
    public DeleteAddressItemResponse deleteAddressItem(DeleteAddressItemRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAddressItem);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return SyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>
     */
    public SyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItemInvoker(
        DeleteAddressItemRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteAddressItem, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return DeleteAddressSetResponse
     */
    public DeleteAddressSetResponse deleteAddressSet(DeleteAddressSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAddressSet);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return SyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>
     */
    public SyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSetInvoker(
        DeleteAddressSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteAddressSet, hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return DeleteBlackWhiteListResponse
     */
    public DeleteBlackWhiteListResponse deleteBlackWhiteList(DeleteBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteBlackWhiteList);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return SyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>
     */
    public SyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteListInvoker(
        DeleteBlackWhiteListRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteBlackWhiteList, hcClient);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return DeleteCaptureTaskResponse
     */
    public DeleteCaptureTaskResponse deleteCaptureTask(DeleteCaptureTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteCaptureTask);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return SyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse>
     */
    public SyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> deleteCaptureTaskInvoker(
        DeleteCaptureTaskRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteCaptureTask, hcClient);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return DeleteDomainSetResponse
     */
    public DeleteDomainSetResponse deleteDomainSet(DeleteDomainSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteDomainSet);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return SyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>
     */
    public SyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSetInvoker(
        DeleteDomainSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteDomainSet, hcClient);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return DeleteDomainsResponse
     */
    public DeleteDomainsResponse deleteDomains(DeleteDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteDomains);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteDomains, hcClient);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return DeleteFirewallResponse
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteFirewall);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallInvoker(
        DeleteFirewallRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteFirewall, hcClient);
    }

    /**
     * 删除已经导入的IP黑名单
     *
     * 删除流量过滤功能下已经导入的IP黑名单，指定生效范围进行删除。 标准版的墙只会存在生效范围为EIP的IP黑名单，专业版的墙会存在生效范围为EIP和NAT的IP黑名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpBlacklistRequest 请求对象
     * @return DeleteIpBlacklistResponse
     */
    public DeleteIpBlacklistResponse deleteIpBlacklist(DeleteIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteIpBlacklist);
    }

    /**
     * 删除已经导入的IP黑名单
     *
     * 删除流量过滤功能下已经导入的IP黑名单，指定生效范围进行删除。 标准版的墙只会存在生效范围为EIP的IP黑名单，专业版的墙会存在生效范围为EIP和NAT的IP黑名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpBlacklistRequest 请求对象
     * @return SyncInvoker<DeleteIpBlacklistRequest, DeleteIpBlacklistResponse>
     */
    public SyncInvoker<DeleteIpBlacklistRequest, DeleteIpBlacklistResponse> deleteIpBlacklistInvoker(
        DeleteIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteIpBlacklist, hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return DeleteServiceItemResponse
     */
    public DeleteServiceItemResponse deleteServiceItem(DeleteServiceItemRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteServiceItem);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return SyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>
     */
    public SyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItemInvoker(
        DeleteServiceItemRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteServiceItem, hcClient);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return DeleteServiceSetResponse
     */
    public DeleteServiceSetResponse deleteServiceSet(DeleteServiceSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteServiceSet);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return SyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>
     */
    public SyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSetInvoker(
        DeleteServiceSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteServiceSet, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteTag, hcClient);
    }

    /**
     * 开启或者关闭流量过滤的IP黑名单功能
     *
     * 开启或者关闭流量过滤功能，当前流量过滤是通过导入IP黑名单实现的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableIpBlacklistRequest 请求对象
     * @return EnableIpBlacklistResponse
     */
    public EnableIpBlacklistResponse enableIpBlacklist(EnableIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.enableIpBlacklist);
    }

    /**
     * 开启或者关闭流量过滤的IP黑名单功能
     *
     * 开启或者关闭流量过滤功能，当前流量过滤是通过导入IP黑名单实现的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableIpBlacklistRequest 请求对象
     * @return SyncInvoker<EnableIpBlacklistRequest, EnableIpBlacklistResponse>
     */
    public SyncInvoker<EnableIpBlacklistRequest, EnableIpBlacklistResponse> enableIpBlacklistInvoker(
        EnableIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.enableIpBlacklist, hcClient);
    }

    /**
     * 导出用于流量过滤的IP黑名单
     *
     * 指定IP黑名单的名字进行导出，当前只有两种文件名，在EIP生效的文件名为ip-blacklist-eip.txt，在 NAT生效的文件名为ip-blacklist-nat.txt。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpBlacklistRequest 请求对象
     * @return ExportIpBlacklistResponse
     */
    public ExportIpBlacklistResponse exportIpBlacklist(ExportIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.exportIpBlacklist);
    }

    /**
     * 导出用于流量过滤的IP黑名单
     *
     * 指定IP黑名单的名字进行导出，当前只有两种文件名，在EIP生效的文件名为ip-blacklist-eip.txt，在 NAT生效的文件名为ip-blacklist-nat.txt。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpBlacklistRequest 请求对象
     * @return SyncInvoker<ExportIpBlacklistRequest, ExportIpBlacklistResponse>
     */
    public SyncInvoker<ExportIpBlacklistRequest, ExportIpBlacklistResponse> exportIpBlacklistInvoker(
        ExportIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.exportIpBlacklist, hcClient);
    }

    /**
     * 导入IP黑名单用于流量过滤
     *
     * 此接口用来导入IP黑名单，IP列表保存在request的body中，IP列表支持的格式如下：
     * 单个IP地址，例如：100.1.1.10
     * 连续的IP地址段，例如：80.1.1.3-80.1.1.30
     * 掩码格式的网段，例如：6.6.6.0/24
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpBlacklistRequest 请求对象
     * @return ImportIpBlacklistResponse
     */
    public ImportIpBlacklistResponse importIpBlacklist(ImportIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.importIpBlacklist);
    }

    /**
     * 导入IP黑名单用于流量过滤
     *
     * 此接口用来导入IP黑名单，IP列表保存在request的body中，IP列表支持的格式如下：
     * 单个IP地址，例如：100.1.1.10
     * 连续的IP地址段，例如：80.1.1.3-80.1.1.30
     * 掩码格式的网段，例如：6.6.6.0/24
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpBlacklistRequest 请求对象
     * @return SyncInvoker<ImportIpBlacklistRequest, ImportIpBlacklistResponse>
     */
    public SyncInvoker<ImportIpBlacklistRequest, ImportIpBlacklistResponse> importIpBlacklistInvoker(
        ImportIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.importIpBlacklist, hcClient);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return ListAccessControlLogsResponse
     */
    public ListAccessControlLogsResponse listAccessControlLogs(ListAccessControlLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAccessControlLogs);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return SyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>
     */
    public SyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogsInvoker(
        ListAccessControlLogsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAccessControlLogs, hcClient);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return ListAddressItemsResponse
     */
    public ListAddressItemsResponse listAddressItems(ListAddressItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressItems);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return SyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>
     */
    public SyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItemsInvoker(
        ListAddressItemsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAddressItems, hcClient);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return ListAddressSetDetailResponse
     */
    public ListAddressSetDetailResponse listAddressSetDetail(ListAddressSetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressSetDetail);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return SyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>
     */
    public SyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetailInvoker(
        ListAddressSetDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAddressSetDetail, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return ListAddressSetsResponse
     */
    public ListAddressSetsResponse listAddressSets(ListAddressSetsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressSets);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return SyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>
     */
    public SyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSetsInvoker(
        ListAddressSetsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAddressSets, hcClient);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return ListAttackLogsResponse
     */
    public ListAttackLogsResponse listAttackLogs(ListAttackLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAttackLogs);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return SyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>
     */
    public SyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogsInvoker(
        ListAttackLogsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAttackLogs, hcClient);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return ListBlackWhiteListsResponse
     */
    public ListBlackWhiteListsResponse listBlackWhiteLists(ListBlackWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listBlackWhiteLists);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return SyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>
     */
    public SyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteListsInvoker(
        ListBlackWhiteListsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listBlackWhiteLists, hcClient);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return ListCaptureResultResponse
     */
    public ListCaptureResultResponse listCaptureResult(ListCaptureResultRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listCaptureResult);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return SyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse>
     */
    public SyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse> listCaptureResultInvoker(
        ListCaptureResultRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listCaptureResult, hcClient);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return ListCaptureTaskResponse
     */
    public ListCaptureTaskResponse listCaptureTask(ListCaptureTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listCaptureTask);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return SyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse>
     */
    public SyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse> listCaptureTaskInvoker(
        ListCaptureTaskRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listCaptureTask, hcClient);
    }

    /**
     * 查询dns服务器列表
     *
     * 查询dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return ListDnsServersResponse
     */
    public ListDnsServersResponse listDnsServers(ListDnsServersRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listDnsServers);
    }

    /**
     * 查询dns服务器列表
     *
     * 查询dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return SyncInvoker<ListDnsServersRequest, ListDnsServersResponse>
     */
    public SyncInvoker<ListDnsServersRequest, ListDnsServersResponse> listDnsServersInvoker(
        ListDnsServersRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listDnsServers, hcClient);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return ListDomainParseDetailResponse
     */
    public ListDomainParseDetailResponse listDomainParseDetail(ListDomainParseDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listDomainParseDetail);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return SyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>
     */
    public SyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetailInvoker(
        ListDomainParseDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listDomainParseDetail, hcClient);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return ListDomainParseIpResponse
     */
    public ListDomainParseIpResponse listDomainParseIp(ListDomainParseIpRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listDomainParseIp);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return SyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse>
     */
    public SyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse> listDomainParseIpInvoker(
        ListDomainParseIpRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listDomainParseIp, hcClient);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return ListDomainSetsResponse
     */
    public ListDomainSetsResponse listDomainSets(ListDomainSetsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listDomainSets);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return SyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>
     */
    public SyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSetsInvoker(
        ListDomainSetsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listDomainSets, hcClient);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listDomains);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listDomains, hcClient);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return ListEastWestFirewallResponse
     */
    public ListEastWestFirewallResponse listEastWestFirewall(ListEastWestFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listEastWestFirewall);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return SyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>
     */
    public SyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewallInvoker(
        ListEastWestFirewallRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listEastWestFirewall, hcClient);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return ListFirewallDetailResponse
     */
    public ListFirewallDetailResponse listFirewallDetail(ListFirewallDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listFirewallDetail);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return SyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>
     */
    public SyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetailInvoker(
        ListFirewallDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listFirewallDetail, hcClient);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return ListFirewallListResponse
     */
    public ListFirewallListResponse listFirewallList(ListFirewallListRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listFirewallList);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return SyncInvoker<ListFirewallListRequest, ListFirewallListResponse>
     */
    public SyncInvoker<ListFirewallListRequest, ListFirewallListResponse> listFirewallListInvoker(
        ListFirewallListRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listFirewallList, hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return ListFlowLogsResponse
     */
    public ListFlowLogsResponse listFlowLogs(ListFlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listFlowLogs);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsInvoker(ListFlowLogsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listFlowLogs, hcClient);
    }

    /**
     * 获取导入的IP黑名单列表信息
     *
     * 获取防火墙实例中已经导入的IP黑名单信息，标准版防火墙只会显示一条EIP的记录，专业版防火墙可能显示EIP、NAT或EIP和NAT的记录，根据导入的情况确定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistRequest 请求对象
     * @return ListIpBlacklistResponse
     */
    public ListIpBlacklistResponse listIpBlacklist(ListIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpBlacklist);
    }

    /**
     * 获取导入的IP黑名单列表信息
     *
     * 获取防火墙实例中已经导入的IP黑名单信息，标准版防火墙只会显示一条EIP的记录，专业版防火墙可能显示EIP、NAT或EIP和NAT的记录，根据导入的情况确定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistRequest 请求对象
     * @return SyncInvoker<ListIpBlacklistRequest, ListIpBlacklistResponse>
     */
    public SyncInvoker<ListIpBlacklistRequest, ListIpBlacklistResponse> listIpBlacklistInvoker(
        ListIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listIpBlacklist, hcClient);
    }

    /**
     * 获取流量过滤功能的开关信息
     *
     * 流量过滤功能可以打开或者关闭，通过此接口可以获取当前的开关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistSwitchRequest 请求对象
     * @return ListIpBlacklistSwitchResponse
     */
    public ListIpBlacklistSwitchResponse listIpBlacklistSwitch(ListIpBlacklistSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpBlacklistSwitch);
    }

    /**
     * 获取流量过滤功能的开关信息
     *
     * 流量过滤功能可以打开或者关闭，通过此接口可以获取当前的开关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpBlacklistSwitchRequest 请求对象
     * @return SyncInvoker<ListIpBlacklistSwitchRequest, ListIpBlacklistSwitchResponse>
     */
    public SyncInvoker<ListIpBlacklistSwitchRequest, ListIpBlacklistSwitchResponse> listIpBlacklistSwitchInvoker(
        ListIpBlacklistSwitchRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listIpBlacklistSwitch, hcClient);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return ListJobResponse
     */
    public ListJobResponse listJob(ListJobRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listJob);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return SyncInvoker<ListJobRequest, ListJobResponse>
     */
    public SyncInvoker<ListJobRequest, ListJobResponse> listJobInvoker(ListJobRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listJob, hcClient);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return ListLogConfigResponse
     */
    public ListLogConfigResponse listLogConfig(ListLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listLogConfig);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return SyncInvoker<ListLogConfigRequest, ListLogConfigResponse>
     */
    public SyncInvoker<ListLogConfigRequest, ListLogConfigResponse> listLogConfigInvoker(ListLogConfigRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listLogConfig, hcClient);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listProjectTags);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listProjectTags, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return ListProtectedVpcsResponse
     */
    public ListProtectedVpcsResponse listProtectedVpcs(ListProtectedVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listProtectedVpcs);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return SyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>
     */
    public SyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcsInvoker(
        ListProtectedVpcsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listProtectedVpcs, hcClient);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listResourceTags);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listResourceTags, hcClient);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return ListServiceItemsResponse
     */
    public ListServiceItemsResponse listServiceItems(ListServiceItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceItems);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return SyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>
     */
    public SyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItemsInvoker(
        ListServiceItemsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listServiceItems, hcClient);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return ListServiceSetDetailResponse
     */
    public ListServiceSetDetailResponse listServiceSetDetail(ListServiceSetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceSetDetail);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return SyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>
     */
    public SyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetailInvoker(
        ListServiceSetDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listServiceSetDetail, hcClient);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return ListServiceSetsResponse
     */
    public ListServiceSetsResponse listServiceSets(ListServiceSetsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceSets);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return SyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>
     */
    public SyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSetsInvoker(
        ListServiceSetsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listServiceSets, hcClient);
    }

    /**
     * 用于流量过滤的IP黑名单导入失败后进行重新导入
     *
     * 用于流量过滤的IP黑名单导入失败后，调用此接口进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryIpBlacklistRequest 请求对象
     * @return RetryIpBlacklistResponse
     */
    public RetryIpBlacklistResponse retryIpBlacklist(RetryIpBlacklistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.retryIpBlacklist);
    }

    /**
     * 用于流量过滤的IP黑名单导入失败后进行重新导入
     *
     * 用于流量过滤的IP黑名单导入失败后，调用此接口进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryIpBlacklistRequest 请求对象
     * @return SyncInvoker<RetryIpBlacklistRequest, RetryIpBlacklistResponse>
     */
    public SyncInvoker<RetryIpBlacklistRequest, RetryIpBlacklistResponse> retryIpBlacklistInvoker(
        RetryIpBlacklistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.retryIpBlacklist, hcClient);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return SaveTagsResponse
     */
    public SaveTagsResponse saveTags(SaveTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.saveTags);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return SyncInvoker<SaveTagsRequest, SaveTagsResponse>
     */
    public SyncInvoker<SaveTagsRequest, SaveTagsResponse> saveTagsInvoker(SaveTagsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.saveTags, hcClient);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return ShowAlarmConfigResponse
     */
    public ShowAlarmConfigResponse showAlarmConfig(ShowAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAlarmConfig);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigInvoker(
        ShowAlarmConfigRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAlarmConfig, hcClient);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return ShowAntiVirusRuleResponse
     */
    public ShowAntiVirusRuleResponse showAntiVirusRule(ShowAntiVirusRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAntiVirusRule);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return SyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse>
     */
    public SyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> showAntiVirusRuleInvoker(
        ShowAntiVirusRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAntiVirusRule, hcClient);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return ShowAntiVirusSwitchResponse
     */
    public ShowAntiVirusSwitchResponse showAntiVirusSwitch(ShowAntiVirusSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAntiVirusSwitch);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return SyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse>
     */
    public SyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> showAntiVirusSwitchInvoker(
        ShowAntiVirusSwitchRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAntiVirusSwitch, hcClient);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return ShowDomainSetDetailResponse
     */
    public ShowDomainSetDetailResponse showDomainSetDetail(ShowDomainSetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showDomainSetDetail);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return SyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse>
     */
    public SyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> showDomainSetDetailInvoker(
        ShowDomainSetDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showDomainSetDetail, hcClient);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return UpdateAddressSetResponse
     */
    public UpdateAddressSetResponse updateAddressSet(UpdateAddressSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAddressSet);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return SyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>
     */
    public SyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSetInvoker(
        UpdateAddressSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAddressSet, hcClient);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return UpdateAlarmConfigResponse
     */
    public UpdateAlarmConfigResponse updateAlarmConfig(UpdateAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAlarmConfig);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigInvoker(
        UpdateAlarmConfigRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return UpdateAntiVirusRuleResponse
     */
    public UpdateAntiVirusRuleResponse updateAntiVirusRule(UpdateAntiVirusRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAntiVirusRule);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return SyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse>
     */
    public SyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> updateAntiVirusRuleInvoker(
        UpdateAntiVirusRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAntiVirusRule, hcClient);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return UpdateAntiVirusSwitchResponse
     */
    public UpdateAntiVirusSwitchResponse updateAntiVirusSwitch(UpdateAntiVirusSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAntiVirusSwitch);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return SyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse>
     */
    public SyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> updateAntiVirusSwitchInvoker(
        UpdateAntiVirusSwitchRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAntiVirusSwitch, hcClient);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return UpdateBlackWhiteListResponse
     */
    public UpdateBlackWhiteListResponse updateBlackWhiteList(UpdateBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateBlackWhiteList);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListInvoker(
        UpdateBlackWhiteListRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 更新dns服务器列表
     *
     * 更新dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return UpdateDnsServersResponse
     */
    public UpdateDnsServersResponse updateDnsServers(UpdateDnsServersRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateDnsServers);
    }

    /**
     * 更新dns服务器列表
     *
     * 更新dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return SyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>
     */
    public SyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServersInvoker(
        UpdateDnsServersRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateDnsServers, hcClient);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return UpdateDomainSetResponse
     */
    public UpdateDomainSetResponse updateDomainSet(UpdateDomainSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateDomainSet);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return SyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>
     */
    public SyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSetInvoker(
        UpdateDomainSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateDomainSet, hcClient);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return UpdateLogConfigResponse
     */
    public UpdateLogConfigResponse updateLogConfig(UpdateLogConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateLogConfig);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigInvoker(
        UpdateLogConfigRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateLogConfig, hcClient);
    }

    /**
     * 编辑对象组内成员的描述信息
     *
     * 编辑对象组内成员的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObjectConfigDescRequest 请求对象
     * @return UpdateObjectConfigDescResponse
     */
    public UpdateObjectConfigDescResponse updateObjectConfigDesc(UpdateObjectConfigDescRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateObjectConfigDesc);
    }

    /**
     * 编辑对象组内成员的描述信息
     *
     * 编辑对象组内成员的描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObjectConfigDescRequest 请求对象
     * @return SyncInvoker<UpdateObjectConfigDescRequest, UpdateObjectConfigDescResponse>
     */
    public SyncInvoker<UpdateObjectConfigDescRequest, UpdateObjectConfigDescResponse> updateObjectConfigDescInvoker(
        UpdateObjectConfigDescRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateObjectConfigDesc, hcClient);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return UpdateServiceSetResponse
     */
    public UpdateServiceSetResponse updateServiceSet(UpdateServiceSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateServiceSet);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return SyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>
     */
    public SyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSetInvoker(
        UpdateServiceSetRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateServiceSet, hcClient);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return AddAclRuleResponse
     */
    public AddAclRuleResponse addAclRule(AddAclRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addAclRule);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return SyncInvoker<AddAclRuleRequest, AddAclRuleResponse>
     */
    public SyncInvoker<AddAclRuleRequest, AddAclRuleResponse> addAclRuleInvoker(AddAclRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.addAclRule, hcClient);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return BatchDeleteAclRulesResponse
     */
    public BatchDeleteAclRulesResponse batchDeleteAclRules(BatchDeleteAclRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.batchDeleteAclRules);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>
     */
    public SyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRulesInvoker(
        BatchDeleteAclRulesRequest request) {
        return new SyncInvoker<>(request, CfwMeta.batchDeleteAclRules, hcClient);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return BatchUpdateAclRuleActionsResponse
     */
    public BatchUpdateAclRuleActionsResponse batchUpdateAclRuleActions(BatchUpdateAclRuleActionsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.batchUpdateAclRuleActions);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return SyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>
     */
    public SyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsInvoker(
        BatchUpdateAclRuleActionsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.batchUpdateAclRuleActions, hcClient);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return DeleteAclRuleResponse
     */
    public DeleteAclRuleResponse deleteAclRule(DeleteAclRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAclRule);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return SyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>
     */
    public SyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRuleInvoker(DeleteAclRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteAclRule, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return DeleteAclRuleHitCountResponse
     */
    public DeleteAclRuleHitCountResponse deleteAclRuleHitCount(DeleteAclRuleHitCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAclRuleHitCount);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return SyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>
     */
    public SyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCountInvoker(
        DeleteAclRuleHitCountRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteAclRuleHitCount, hcClient);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return ListAclRuleHitCountResponse
     */
    public ListAclRuleHitCountResponse listAclRuleHitCount(ListAclRuleHitCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAclRuleHitCount);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return SyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>
     */
    public SyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCountInvoker(
        ListAclRuleHitCountRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAclRuleHitCount, hcClient);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return ListAclRulesResponse
     */
    public ListAclRulesResponse listAclRules(ListAclRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAclRules);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return SyncInvoker<ListAclRulesRequest, ListAclRulesResponse>
     */
    public SyncInvoker<ListAclRulesRequest, ListAclRulesResponse> listAclRulesInvoker(ListAclRulesRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAclRules, hcClient);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listRegions);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listRegions, hcClient);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return ListRuleAclTagsResponse
     */
    public ListRuleAclTagsResponse listRuleAclTags(ListRuleAclTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listRuleAclTags);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return SyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>
     */
    public SyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTagsInvoker(
        ListRuleAclTagsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listRuleAclTags, hcClient);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return ShowImportStatusResponse
     */
    public ShowImportStatusResponse showImportStatus(ShowImportStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showImportStatus);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return SyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse>
     */
    public SyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse> showImportStatusInvoker(
        ShowImportStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showImportStatus, hcClient);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return UpdateAclRuleResponse
     */
    public UpdateAclRuleResponse updateAclRule(UpdateAclRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAclRule);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return SyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>
     */
    public SyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRuleInvoker(UpdateAclRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAclRule, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return UpdateAclRuleOrderResponse
     */
    public UpdateAclRuleOrderResponse updateAclRuleOrder(UpdateAclRuleOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAclRuleOrder);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return SyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>
     */
    public SyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrderInvoker(
        UpdateAclRuleOrderRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAclRuleOrder, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return ChangeEipStatusResponse
     */
    public ChangeEipStatusResponse changeEipStatus(ChangeEipStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeEipStatus);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return SyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>
     */
    public SyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatusInvoker(
        ChangeEipStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.changeEipStatus, hcClient);
    }

    /**
     * 查看eip告警白名单
     *
     * 查看eip告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return ListAlarmWhitelistResponse
     */
    public ListAlarmWhitelistResponse listAlarmWhitelist(ListAlarmWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAlarmWhitelist);
    }

    /**
     * 查看eip告警白名单
     *
     * 查看eip告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return SyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse>
     */
    public SyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> listAlarmWhitelistInvoker(
        ListAlarmWhitelistRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAlarmWhitelist, hcClient);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return ListEipCountResponse
     */
    public ListEipCountResponse listEipCount(ListEipCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listEipCount);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return SyncInvoker<ListEipCountRequest, ListEipCountResponse>
     */
    public SyncInvoker<ListEipCountRequest, ListEipCountResponse> listEipCountInvoker(ListEipCountRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listEipCount, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return ListEipsResponse
     */
    public ListEipsResponse listEips(ListEipsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listEips);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return SyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public SyncInvoker<ListEipsRequest, ListEipsResponse> listEipsInvoker(ListEipsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listEips, hcClient);
    }

    /**
     * 获取eip自动防护状态信息
     *
     * 获取eip自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return ShowAutoProtectStatusResponse
     */
    public ShowAutoProtectStatusResponse showAutoProtectStatus(ShowAutoProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAutoProtectStatus);
    }

    /**
     * 获取eip自动防护状态信息
     *
     * 获取eip自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return SyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse>
     */
    public SyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> showAutoProtectStatusInvoker(
        ShowAutoProtectStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAutoProtectStatus, hcClient);
    }

    /**
     * 修改eip自动防护开关
     *
     * 修改eip自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return SwitchAutoProtectStatusResponse
     */
    public SwitchAutoProtectStatusResponse switchAutoProtectStatus(SwitchAutoProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.switchAutoProtectStatus);
    }

    /**
     * 修改eip自动防护开关
     *
     * 修改eip自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return SyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse>
     */
    public SyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> switchAutoProtectStatusInvoker(
        SwitchAutoProtectStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.switchAutoProtectStatus, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return ChangeIpsProtectModeResponse
     */
    public ChangeIpsProtectModeResponse changeIpsProtectMode(ChangeIpsProtectModeRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeIpsProtectMode);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return SyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>
     */
    public SyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectModeInvoker(
        ChangeIpsProtectModeRequest request) {
        return new SyncInvoker<>(request, CfwMeta.changeIpsProtectMode, hcClient);
    }

    /**
     * 改变ips规则模式
     *
     * 改变ips规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return ChangeIpsRuleModeResponse
     */
    public ChangeIpsRuleModeResponse changeIpsRuleMode(ChangeIpsRuleModeRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeIpsRuleMode);
    }

    /**
     * 改变ips规则模式
     *
     * 改变ips规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return SyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse>
     */
    public SyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> changeIpsRuleModeInvoker(
        ChangeIpsRuleModeRequest request) {
        return new SyncInvoker<>(request, CfwMeta.changeIpsRuleMode, hcClient);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return ChangeIpsSwitchStatusResponse
     */
    public ChangeIpsSwitchStatusResponse changeIpsSwitchStatus(ChangeIpsSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeIpsSwitchStatus);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>
     */
    public SyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusInvoker(
        ChangeIpsSwitchStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.changeIpsSwitchStatus, hcClient);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return ListIpsProtectModeResponse
     */
    public ListIpsProtectModeResponse listIpsProtectMode(ListIpsProtectModeRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsProtectMode);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return SyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>
     */
    public SyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectModeInvoker(
        ListIpsProtectModeRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listIpsProtectMode, hcClient);
    }

    /**
     * 查询频率ips规则信息
     *
     * 查询频率ips规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return ListIpsRulesResponse
     */
    public ListIpsRulesResponse listIpsRules(ListIpsRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsRules);
    }

    /**
     * 查询频率ips规则信息
     *
     * 查询频率ips规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return SyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse>
     */
    public SyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse> listIpsRulesInvoker(ListIpsRulesRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listIpsRules, hcClient);
    }

    /**
     * 获取ips规则列表
     *
     * 获取ips规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRules1Request 请求对象
     * @return ListIpsRules1Response
     */
    public ListIpsRules1Response listIpsRules1(ListIpsRules1Request request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsRules1);
    }

    /**
     * 获取ips规则列表
     *
     * 获取ips规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRules1Request 请求对象
     * @return SyncInvoker<ListIpsRules1Request, ListIpsRules1Response>
     */
    public SyncInvoker<ListIpsRules1Request, ListIpsRules1Response> listIpsRules1Invoker(ListIpsRules1Request request) {
        return new SyncInvoker<>(request, CfwMeta.listIpsRules1, hcClient);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return ListIpsSwitchStatusResponse
     */
    public ListIpsSwitchStatusResponse listIpsSwitchStatus(ListIpsSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsSwitchStatus);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return SyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>
     */
    public SyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatusInvoker(
        ListIpsSwitchStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listIpsSwitchStatus, hcClient);
    }

    /**
     * 获取ips规则细节
     *
     * 获取ips规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return ShowIpsUpdateTimeResponse
     */
    public ShowIpsUpdateTimeResponse showIpsUpdateTime(ShowIpsUpdateTimeRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showIpsUpdateTime);
    }

    /**
     * 获取ips规则细节
     *
     * 获取ips规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return SyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse>
     */
    public SyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> showIpsUpdateTimeInvoker(
        ShowIpsUpdateTimeRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showIpsUpdateTime, hcClient);
    }

    /**
     * 创建频率ips规则
     *
     * 创建频率ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return UpdateAdvancedIpsRuleResponse
     */
    public UpdateAdvancedIpsRuleResponse updateAdvancedIpsRule(UpdateAdvancedIpsRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAdvancedIpsRule);
    }

    /**
     * 创建频率ips规则
     *
     * 创建频率ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return SyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse>
     */
    public SyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRuleInvoker(
        UpdateAdvancedIpsRuleRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateAdvancedIpsRule, hcClient);
    }

    /**
     * 查看自定义IPS规则列表
     *
     * 查看自定义IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return ListCustomerIpsResponse
     */
    public ListCustomerIpsResponse listCustomerIps(ListCustomerIpsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listCustomerIps);
    }

    /**
     * 查看自定义IPS规则列表
     *
     * 查看自定义IPS规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return SyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse>
     */
    public SyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse> listCustomerIpsInvoker(
        ListCustomerIpsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listCustomerIps, hcClient);
    }

    /**
     * 查询自定义IPS规则详情
     *
     * 功能说明：自定义IPS规则详情，特性:根据路径输入的IPS ID查看对应的自定义IPS详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerIpsInfoRequest 请求对象
     * @return ShowCustomerIpsInfoResponse
     */
    public ShowCustomerIpsInfoResponse showCustomerIpsInfo(ShowCustomerIpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showCustomerIpsInfo);
    }

    /**
     * 查询自定义IPS规则详情
     *
     * 功能说明：自定义IPS规则详情，特性:根据路径输入的IPS ID查看对应的自定义IPS详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomerIpsInfoRequest 请求对象
     * @return SyncInvoker<ShowCustomerIpsInfoRequest, ShowCustomerIpsInfoResponse>
     */
    public SyncInvoker<ShowCustomerIpsInfoRequest, ShowCustomerIpsInfoResponse> showCustomerIpsInfoInvoker(
        ShowCustomerIpsInfoRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showCustomerIpsInfo, hcClient);
    }

    /**
     * 更新自定义IPS规则
     *
     * 更新自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomerIpsRequest 请求对象
     * @return UpdateCustomerIpsResponse
     */
    public UpdateCustomerIpsResponse updateCustomerIps(UpdateCustomerIpsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateCustomerIps);
    }

    /**
     * 更新自定义IPS规则
     *
     * 更新自定义IPS规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomerIpsRequest 请求对象
     * @return SyncInvoker<UpdateCustomerIpsRequest, UpdateCustomerIpsResponse>
     */
    public SyncInvoker<UpdateCustomerIpsRequest, UpdateCustomerIpsResponse> updateCustomerIpsInvoker(
        UpdateCustomerIpsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateCustomerIps, hcClient);
    }

    /**
     * 查询攻击统计
     *
     * 根据防火墙攻击日志，查询攻击统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackStatisticRequest 请求对象
     * @return ListAttackStatisticResponse
     */
    public ListAttackStatisticResponse listAttackStatistic(ListAttackStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAttackStatistic);
    }

    /**
     * 查询攻击统计
     *
     * 根据防火墙攻击日志，查询攻击统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackStatisticRequest 请求对象
     * @return SyncInvoker<ListAttackStatisticRequest, ListAttackStatisticResponse>
     */
    public SyncInvoker<ListAttackStatisticRequest, ListAttackStatisticResponse> listAttackStatisticInvoker(
        ListAttackStatisticRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAttackStatistic, hcClient);
    }

    /**
     * 查询流量日志统计
     *
     * 查询流量日志统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowStatisticRequest 请求对象
     * @return ListFlowStatisticResponse
     */
    public ListFlowStatisticResponse listFlowStatistic(ListFlowStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listFlowStatistic);
    }

    /**
     * 查询流量日志统计
     *
     * 查询流量日志统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowStatisticRequest 请求对象
     * @return SyncInvoker<ListFlowStatisticRequest, ListFlowStatisticResponse>
     */
    public SyncInvoker<ListFlowStatisticRequest, ListFlowStatisticResponse> listFlowStatisticInvoker(
        ListFlowStatisticRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listFlowStatistic, hcClient);
    }

    /**
     * 查询访问控制统计详情
     *
     * 查询访问控制统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDetailRequest 请求对象
     * @return ShowAccessDetailResponse
     */
    public ShowAccessDetailResponse showAccessDetail(ShowAccessDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAccessDetail);
    }

    /**
     * 查询访问控制统计详情
     *
     * 查询访问控制统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessDetailRequest 请求对象
     * @return SyncInvoker<ShowAccessDetailRequest, ShowAccessDetailResponse>
     */
    public SyncInvoker<ShowAccessDetailRequest, ShowAccessDetailResponse> showAccessDetailInvoker(
        ShowAccessDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAccessDetail, hcClient);
    }

    /**
     * 查询访问日志统计信息
     *
     * 获取访问日志的TOP统计信息，如TOP命中规则等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessTopRequest 请求对象
     * @return ShowAccessTopResponse
     */
    public ShowAccessTopResponse showAccessTop(ShowAccessTopRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAccessTop);
    }

    /**
     * 查询访问日志统计信息
     *
     * 获取访问日志的TOP统计信息，如TOP命中规则等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessTopRequest 请求对象
     * @return SyncInvoker<ShowAccessTopRequest, ShowAccessTopResponse>
     */
    public SyncInvoker<ShowAccessTopRequest, ShowAccessTopResponse> showAccessTopInvoker(ShowAccessTopRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAccessTop, hcClient);
    }

    /**
     * 查询攻击日志统计详情
     *
     * 查询攻击日志统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackDetailRequest 请求对象
     * @return ShowAttackDetailResponse
     */
    public ShowAttackDetailResponse showAttackDetail(ShowAttackDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAttackDetail);
    }

    /**
     * 查询攻击日志统计详情
     *
     * 查询攻击日志统计详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackDetailRequest 请求对象
     * @return SyncInvoker<ShowAttackDetailRequest, ShowAttackDetailResponse>
     */
    public SyncInvoker<ShowAttackDetailRequest, ShowAttackDetailResponse> showAttackDetailInvoker(
        ShowAttackDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAttackDetail, hcClient);
    }

    /**
     * 查询攻击日志TOP统计
     *
     * 查询攻击日志TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTopRequest 请求对象
     * @return ShowAttackTopResponse
     */
    public ShowAttackTopResponse showAttackTop(ShowAttackTopRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAttackTop);
    }

    /**
     * 查询攻击日志TOP统计
     *
     * 查询攻击日志TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTopRequest 请求对象
     * @return SyncInvoker<ShowAttackTopRequest, ShowAttackTopResponse>
     */
    public SyncInvoker<ShowAttackTopRequest, ShowAttackTopResponse> showAttackTopInvoker(ShowAttackTopRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAttackTop, hcClient);
    }

    /**
     * 查询攻击概览
     *
     * 查询攻击概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTotalRequest 请求对象
     * @return ShowAttackTotalResponse
     */
    public ShowAttackTotalResponse showAttackTotal(ShowAttackTotalRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAttackTotal);
    }

    /**
     * 查询攻击概览
     *
     * 查询攻击概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTotalRequest 请求对象
     * @return SyncInvoker<ShowAttackTotalRequest, ShowAttackTotalResponse>
     */
    public SyncInvoker<ShowAttackTotalRequest, ShowAttackTotalResponse> showAttackTotalInvoker(
        ShowAttackTotalRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAttackTotal, hcClient);
    }

    /**
     * 查询攻击趋势
     *
     * 查询攻击趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTrendRequest 请求对象
     * @return ShowAttackTrendResponse
     */
    public ShowAttackTrendResponse showAttackTrend(ShowAttackTrendRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showAttackTrend);
    }

    /**
     * 查询攻击趋势
     *
     * 查询攻击趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAttackTrendRequest 请求对象
     * @return SyncInvoker<ShowAttackTrendRequest, ShowAttackTrendResponse>
     */
    public SyncInvoker<ShowAttackTrendRequest, ShowAttackTrendResponse> showAttackTrendInvoker(
        ShowAttackTrendRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showAttackTrend, hcClient);
    }

    /**
     * 查询流量日志统计详情
     *
     * 查询流量日志统计详情，如统计某个源IP访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return ShowFlowDetailResponse
     */
    public ShowFlowDetailResponse showFlowDetail(ShowFlowDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showFlowDetail);
    }

    /**
     * 查询流量日志统计详情
     *
     * 查询流量日志统计详情，如统计某个源IP访问详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return SyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse>
     */
    public SyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse> showFlowDetailInvoker(
        ShowFlowDetailRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showFlowDetail, hcClient);
    }

    /**
     * 查询流量TOP统计
     *
     * 查询流量TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTopRequest 请求对象
     * @return ShowFlowTopResponse
     */
    public ShowFlowTopResponse showFlowTop(ShowFlowTopRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showFlowTop);
    }

    /**
     * 查询流量TOP统计
     *
     * 查询流量TOP统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTopRequest 请求对象
     * @return SyncInvoker<ShowFlowTopRequest, ShowFlowTopResponse>
     */
    public SyncInvoker<ShowFlowTopRequest, ShowFlowTopResponse> showFlowTopInvoker(ShowFlowTopRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showFlowTop, hcClient);
    }

    /**
     * 查询会话趋势
     *
     * 查询会话趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTrendRequest 请求对象
     * @return ShowFlowTrendResponse
     */
    public ShowFlowTrendResponse showFlowTrend(ShowFlowTrendRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showFlowTrend);
    }

    /**
     * 查询会话趋势
     *
     * 查询会话趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowTrendRequest 请求对象
     * @return SyncInvoker<ShowFlowTrendRequest, ShowFlowTrendResponse>
     */
    public SyncInvoker<ShowFlowTrendRequest, ShowFlowTrendResponse> showFlowTrendInvoker(ShowFlowTrendRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showFlowTrend, hcClient);
    }

    /**
     * 查询日志数量
     *
     * 统计日志数量，如统计风险IP的数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsCountRequest 请求对象
     * @return ShowLogsCountResponse
     */
    public ShowLogsCountResponse showLogsCount(ShowLogsCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showLogsCount);
    }

    /**
     * 查询日志数量
     *
     * 统计日志数量，如统计风险IP的数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsCountRequest 请求对象
     * @return SyncInvoker<ShowLogsCountRequest, ShowLogsCountResponse>
     */
    public SyncInvoker<ShowLogsCountRequest, ShowLogsCountResponse> showLogsCountInvoker(ShowLogsCountRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showLogsCount, hcClient);
    }

    /**
     * 查询流量趋势
     *
     * 查询流量趋势，包括南北向、EIP、东西向的流量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficTrendRequest 请求对象
     * @return ShowTrafficTrendResponse
     */
    public ShowTrafficTrendResponse showTrafficTrend(ShowTrafficTrendRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showTrafficTrend);
    }

    /**
     * 查询流量趋势
     *
     * 查询流量趋势，包括南北向、EIP、东西向的流量趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficTrendRequest 请求对象
     * @return SyncInvoker<ShowTrafficTrendRequest, ShowTrafficTrendResponse>
     */
    public SyncInvoker<ShowTrafficTrendRequest, ShowTrafficTrendResponse> showTrafficTrendInvoker(
        ShowTrafficTrendRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showTrafficTrend, hcClient);
    }

    /**
     * 导出防火墙日志
     *
     * 导出防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLogsRequest 请求对象
     * @return ExportLogsResponse
     */
    public ExportLogsResponse exportLogs(ExportLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.exportLogs);
    }

    /**
     * 导出防火墙日志
     *
     * 导出防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportLogsRequest 请求对象
     * @return SyncInvoker<ExportLogsRequest, ExportLogsResponse>
     */
    public SyncInvoker<ExportLogsRequest, ExportLogsResponse> exportLogsInvoker(ExportLogsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.exportLogs, hcClient);
    }

    /**
     * 查询防火墙日志
     *
     * 查询防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogs(ListLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listLogs);
    }

    /**
     * 查询防火墙日志
     *
     * 查询防火墙日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsRequest 请求对象
     * @return SyncInvoker<ListLogsRequest, ListLogsResponse>
     */
    public SyncInvoker<ListLogsRequest, ListLogsResponse> listLogsInvoker(ListLogsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listLogs, hcClient);
    }

    /**
     * 开启多账号管理
     *
     * 开启多账号管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMultiAccountRequest 请求对象
     * @return EnableMultiAccountResponse
     */
    public EnableMultiAccountResponse enableMultiAccount(EnableMultiAccountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.enableMultiAccount);
    }

    /**
     * 开启多账号管理
     *
     * 开启多账号管理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableMultiAccountRequest 请求对象
     * @return SyncInvoker<EnableMultiAccountRequest, EnableMultiAccountResponse>
     */
    public SyncInvoker<EnableMultiAccountRequest, EnableMultiAccountResponse> enableMultiAccountInvoker(
        EnableMultiAccountRequest request) {
        return new SyncInvoker<>(request, CfwMeta.enableMultiAccount, hcClient);
    }

    /**
     * 查询账号列表
     *
     * 查询账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAccounts);
    }

    /**
     * 查询账号列表
     *
     * 查询账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return SyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public SyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsInvoker(ListAccountsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listAccounts, hcClient);
    }

    /**
     * 查询组织账号列表
     *
     * 查询组织账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationAccountsRequest 请求对象
     * @return ListOrganizationAccountsResponse
     */
    public ListOrganizationAccountsResponse listOrganizationAccounts(ListOrganizationAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listOrganizationAccounts);
    }

    /**
     * 查询组织账号列表
     *
     * 查询组织账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationAccountsRequest 请求对象
     * @return SyncInvoker<ListOrganizationAccountsRequest, ListOrganizationAccountsResponse>
     */
    public SyncInvoker<ListOrganizationAccountsRequest, ListOrganizationAccountsResponse> listOrganizationAccountsInvoker(
        ListOrganizationAccountsRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listOrganizationAccounts, hcClient);
    }

    /**
     * 查询组织结构
     *
     * 查询组织结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return ListOrganizationTreeResponse
     */
    public ListOrganizationTreeResponse listOrganizationTree(ListOrganizationTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listOrganizationTree);
    }

    /**
     * 查询组织结构
     *
     * 查询组织结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return SyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse>
     */
    public SyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTreeInvoker(
        ListOrganizationTreeRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listOrganizationTree, hcClient);
    }

    /**
     * 创建安全报告模板
     *
     * 创建安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportProfileRequest 请求对象
     * @return CreateReportProfileResponse
     */
    public CreateReportProfileResponse createReportProfile(CreateReportProfileRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.createReportProfile);
    }

    /**
     * 创建安全报告模板
     *
     * 创建安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportProfileRequest 请求对象
     * @return SyncInvoker<CreateReportProfileRequest, CreateReportProfileResponse>
     */
    public SyncInvoker<CreateReportProfileRequest, CreateReportProfileResponse> createReportProfileInvoker(
        CreateReportProfileRequest request) {
        return new SyncInvoker<>(request, CfwMeta.createReportProfile, hcClient);
    }

    /**
     * 删除安全报告模板
     *
     * 删除安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportProfileRequest 请求对象
     * @return DeleteReportProfileResponse
     */
    public DeleteReportProfileResponse deleteReportProfile(DeleteReportProfileRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteReportProfile);
    }

    /**
     * 删除安全报告模板
     *
     * 删除安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReportProfileRequest 请求对象
     * @return SyncInvoker<DeleteReportProfileRequest, DeleteReportProfileResponse>
     */
    public SyncInvoker<DeleteReportProfileRequest, DeleteReportProfileResponse> deleteReportProfileInvoker(
        DeleteReportProfileRequest request) {
        return new SyncInvoker<>(request, CfwMeta.deleteReportProfile, hcClient);
    }

    /**
     * 查询安全报告模板列表
     *
     * 查询安全报告模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportProfilesRequest 请求对象
     * @return ListReportProfilesResponse
     */
    public ListReportProfilesResponse listReportProfiles(ListReportProfilesRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listReportProfiles);
    }

    /**
     * 查询安全报告模板列表
     *
     * 查询安全报告模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportProfilesRequest 请求对象
     * @return SyncInvoker<ListReportProfilesRequest, ListReportProfilesResponse>
     */
    public SyncInvoker<ListReportProfilesRequest, ListReportProfilesResponse> listReportProfilesInvoker(
        ListReportProfilesRequest request) {
        return new SyncInvoker<>(request, CfwMeta.listReportProfiles, hcClient);
    }

    /**
     * 查询安全报告
     *
     * 查询安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallReportRequest 请求对象
     * @return ShowFirewallReportResponse
     */
    public ShowFirewallReportResponse showFirewallReport(ShowFirewallReportRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showFirewallReport);
    }

    /**
     * 查询安全报告
     *
     * 查询安全报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallReportRequest 请求对象
     * @return SyncInvoker<ShowFirewallReportRequest, ShowFirewallReportResponse>
     */
    public SyncInvoker<ShowFirewallReportRequest, ShowFirewallReportResponse> showFirewallReportInvoker(
        ShowFirewallReportRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showFirewallReport, hcClient);
    }

    /**
     * 获取安全报告模板
     *
     * 获取安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportProfileRequest 请求对象
     * @return ShowReportProfileResponse
     */
    public ShowReportProfileResponse showReportProfile(ShowReportProfileRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showReportProfile);
    }

    /**
     * 获取安全报告模板
     *
     * 获取安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportProfileRequest 请求对象
     * @return SyncInvoker<ShowReportProfileRequest, ShowReportProfileResponse>
     */
    public SyncInvoker<ShowReportProfileRequest, ShowReportProfileResponse> showReportProfileInvoker(
        ShowReportProfileRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showReportProfile, hcClient);
    }

    /**
     * 更新安全报告模板
     *
     * 更新安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportProfileRequest 请求对象
     * @return UpdateReportProfileResponse
     */
    public UpdateReportProfileResponse updateReportProfile(UpdateReportProfileRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateReportProfile);
    }

    /**
     * 更新安全报告模板
     *
     * 更新安全报告模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReportProfileRequest 请求对象
     * @return SyncInvoker<UpdateReportProfileRequest, UpdateReportProfileResponse>
     */
    public SyncInvoker<UpdateReportProfileRequest, UpdateReportProfileResponse> updateReportProfileInvoker(
        UpdateReportProfileRequest request) {
        return new SyncInvoker<>(request, CfwMeta.updateReportProfile, hcClient);
    }

    /**
     * 更新VPC间防火墙防护状态
     *
     * 更新VPC间防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return ChangeEastWestFirewallStatusResponse
     */
    public ChangeEastWestFirewallStatusResponse changeEastWestFirewallStatus(
        ChangeEastWestFirewallStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeEastWestFirewallStatus);
    }

    /**
     * 更新VPC间防火墙防护状态
     *
     * 更新VPC间防火墙防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return SyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>
     */
    public SyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusInvoker(
        ChangeEastWestFirewallStatusRequest request) {
        return new SyncInvoker<>(request, CfwMeta.changeEastWestFirewallStatus, hcClient);
    }

    /**
     * 查询VPC间防火墙使用的企业路由器信息
     *
     * 查询VPC间防火墙使用的企业路由器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedErRequest 请求对象
     * @return ShowEwAssociatedErResponse
     */
    public ShowEwAssociatedErResponse showEwAssociatedEr(ShowEwAssociatedErRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showEwAssociatedEr);
    }

    /**
     * 查询VPC间防火墙使用的企业路由器信息
     *
     * 查询VPC间防火墙使用的企业路由器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedErRequest 请求对象
     * @return SyncInvoker<ShowEwAssociatedErRequest, ShowEwAssociatedErResponse>
     */
    public SyncInvoker<ShowEwAssociatedErRequest, ShowEwAssociatedErResponse> showEwAssociatedErInvoker(
        ShowEwAssociatedErRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showEwAssociatedEr, hcClient);
    }

    /**
     * 查询VPC边界防火墙使用的引流VPC信息
     *
     * 查询VPC边界防火墙使用的引流VPC信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedVpcRequest 请求对象
     * @return ShowEwAssociatedVpcResponse
     */
    public ShowEwAssociatedVpcResponse showEwAssociatedVpc(ShowEwAssociatedVpcRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.showEwAssociatedVpc);
    }

    /**
     * 查询VPC边界防火墙使用的引流VPC信息
     *
     * 查询VPC边界防火墙使用的引流VPC信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEwAssociatedVpcRequest 请求对象
     * @return SyncInvoker<ShowEwAssociatedVpcRequest, ShowEwAssociatedVpcResponse>
     */
    public SyncInvoker<ShowEwAssociatedVpcRequest, ShowEwAssociatedVpcResponse> showEwAssociatedVpcInvoker(
        ShowEwAssociatedVpcRequest request) {
        return new SyncInvoker<>(request, CfwMeta.showEwAssociatedVpc, hcClient);
    }

}

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
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceItemResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteServiceSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagRequest;
import com.huaweicloud.sdk.cfw.v1.model.DeleteTagResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDnsServersResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateDomainSetResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateLogConfigResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateServiceSetResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CfwAsyncClient {

    protected HcClient hcClient;

    public CfwAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CfwAsyncClient> newBuilder() {
        ClientBuilder<CfwAsyncClient> clientBuilder = new ClientBuilder<>(CfwAsyncClient::new);
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
     * @return CompletableFuture<AddAddressItemResponse>
     */
    public CompletableFuture<AddAddressItemResponse> addAddressItemAsync(AddAddressItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressItem);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressItemRequest 请求对象
     * @return AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse>
     */
    public AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse> addAddressItemAsyncInvoker(
        AddAddressItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAddressItem, hcClient);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return CompletableFuture<AddAddressSetResponse>
     */
    public CompletableFuture<AddAddressSetResponse> addAddressSetAsync(AddAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressSet);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAddressSetRequest 请求对象
     * @return AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse>
     */
    public AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse> addAddressSetAsyncInvoker(
        AddAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAddressSet, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return CompletableFuture<AddBlackWhiteListResponse>
     */
    public CompletableFuture<AddBlackWhiteListResponse> addBlackWhiteListAsync(AddBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addBlackWhiteList);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>
     */
    public AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteListAsyncInvoker(
        AddBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addBlackWhiteList, hcClient);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return CompletableFuture<AddDomainSetResponse>
     */
    public CompletableFuture<AddDomainSetResponse> addDomainSetAsync(AddDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addDomainSet);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainSetRequest 请求对象
     * @return AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse>
     */
    public AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse> addDomainSetAsyncInvoker(
        AddDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addDomainSet, hcClient);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return CompletableFuture<AddDomainsResponse>
     */
    public CompletableFuture<AddDomainsResponse> addDomainsAsync(AddDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addDomains);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDomainsRequest 请求对象
     * @return AsyncInvoker<AddDomainsRequest, AddDomainsResponse>
     */
    public AsyncInvoker<AddDomainsRequest, AddDomainsResponse> addDomainsAsyncInvoker(AddDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addDomains, hcClient);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return CompletableFuture<AddLogConfigResponse>
     */
    public CompletableFuture<AddLogConfigResponse> addLogConfigAsync(AddLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addLogConfig);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLogConfigRequest 请求对象
     * @return AsyncInvoker<AddLogConfigRequest, AddLogConfigResponse>
     */
    public AsyncInvoker<AddLogConfigRequest, AddLogConfigResponse> addLogConfigAsyncInvoker(
        AddLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addLogConfig, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return CompletableFuture<AddServiceItemsResponse>
     */
    public CompletableFuture<AddServiceItemsResponse> addServiceItemsAsync(AddServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceItems);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceItemsRequest 请求对象
     * @return AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>
     */
    public AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItemsAsyncInvoker(
        AddServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addServiceItems, hcClient);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return CompletableFuture<AddServiceSetResponse>
     */
    public CompletableFuture<AddServiceSetResponse> addServiceSetAsync(AddServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceSet);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServiceSetRequest 请求对象
     * @return AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse>
     */
    public AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse> addServiceSetAsyncInvoker(
        AddServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addServiceSet, hcClient);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteAddressItemsResponse>
     */
    public CompletableFuture<BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsync(
        BatchDeleteAddressItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAddressItems);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAddressItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>
     */
    public AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsyncInvoker(
        BatchDeleteAddressItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteAddressItems, hcClient);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return CompletableFuture<BatchDeleteDomainSetResponse>
     */
    public CompletableFuture<BatchDeleteDomainSetResponse> batchDeleteDomainSetAsync(
        BatchDeleteDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteDomainSet);
    }

    /**
     * 批量删除域名组
     *
     * 批量删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDomainSetRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse>
     */
    public AsyncInvoker<BatchDeleteDomainSetRequest, BatchDeleteDomainSetResponse> batchDeleteDomainSetAsyncInvoker(
        BatchDeleteDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteDomainSet, hcClient);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServiceItemsResponse>
     */
    public CompletableFuture<BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsync(
        BatchDeleteServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteServiceItems);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServiceItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>
     */
    public AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsyncInvoker(
        BatchDeleteServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteServiceItems, hcClient);
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return CompletableFuture<CancelCaptureTaskResponse>
     */
    public CompletableFuture<CancelCaptureTaskResponse> cancelCaptureTaskAsync(CancelCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.cancelCaptureTask);
    }

    /**
     * 取消抓包任务
     *
     * 取消抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelCaptureTaskRequest 请求对象
     * @return AsyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse>
     */
    public AsyncInvoker<CancelCaptureTaskRequest, CancelCaptureTaskResponse> cancelCaptureTaskAsyncInvoker(
        CancelCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.cancelCaptureTask, hcClient);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return CompletableFuture<ChangeEastWestFirewallStatusResponse>
     */
    public CompletableFuture<ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsync(
        ChangeEastWestFirewallStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEastWestFirewallStatus);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEastWestFirewallStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>
     */
    public AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsyncInvoker(
        ChangeEastWestFirewallStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeEastWestFirewallStatus, hcClient);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return CompletableFuture<CreateCaptureTaskResponse>
     */
    public CompletableFuture<CreateCaptureTaskResponse> createCaptureTaskAsync(CreateCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createCaptureTask);
    }

    /**
     * 创建抓包任务
     *
     * 创建抓包任务，每个任务只能执行一次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaptureTaskRequest 请求对象
     * @return AsyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse>
     */
    public AsyncInvoker<CreateCaptureTaskRequest, CreateCaptureTaskResponse> createCaptureTaskAsyncInvoker(
        CreateCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createCaptureTask, hcClient);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return CompletableFuture<CreateEastWestFirewallResponse>
     */
    public CompletableFuture<CreateEastWestFirewallResponse> createEastWestFirewallAsync(
        CreateEastWestFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createEastWestFirewall);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEastWestFirewallRequest 请求对象
     * @return AsyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse>
     */
    public AsyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewallAsyncInvoker(
        CreateEastWestFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createEastWestFirewall, hcClient);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createFirewall);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(
        CreateFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createFirewall, hcClient);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.createTag);
    }

    /**
     * 标签创建接口
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.createTag, hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return CompletableFuture<DeleteAddressItemResponse>
     */
    public CompletableFuture<DeleteAddressItemResponse> deleteAddressItemAsync(DeleteAddressItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressItem);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressItemRequest 请求对象
     * @return AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>
     */
    public AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItemAsyncInvoker(
        DeleteAddressItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAddressItem, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return CompletableFuture<DeleteAddressSetResponse>
     */
    public CompletableFuture<DeleteAddressSetResponse> deleteAddressSetAsync(DeleteAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressSet);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressSetRequest 请求对象
     * @return AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>
     */
    public AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSetAsyncInvoker(
        DeleteAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAddressSet, hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return CompletableFuture<DeleteBlackWhiteListResponse>
     */
    public CompletableFuture<DeleteBlackWhiteListResponse> deleteBlackWhiteListAsync(
        DeleteBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteBlackWhiteList);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>
     */
    public AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteListAsyncInvoker(
        DeleteBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteBlackWhiteList, hcClient);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return CompletableFuture<DeleteCaptureTaskResponse>
     */
    public CompletableFuture<DeleteCaptureTaskResponse> deleteCaptureTaskAsync(DeleteCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteCaptureTask);
    }

    /**
     * 批量删除抓包任务
     *
     * 批量删除抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaptureTaskRequest 请求对象
     * @return AsyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse>
     */
    public AsyncInvoker<DeleteCaptureTaskRequest, DeleteCaptureTaskResponse> deleteCaptureTaskAsyncInvoker(
        DeleteCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteCaptureTask, hcClient);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return CompletableFuture<DeleteDomainSetResponse>
     */
    public CompletableFuture<DeleteDomainSetResponse> deleteDomainSetAsync(DeleteDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteDomainSet);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainSetRequest 请求对象
     * @return AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>
     */
    public AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSetAsyncInvoker(
        DeleteDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteDomainSet, hcClient);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return CompletableFuture<DeleteDomainsResponse>
     */
    public CompletableFuture<DeleteDomainsResponse> deleteDomainsAsync(DeleteDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteDomains);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteDomains, hcClient);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteFirewall);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(
        DeleteFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteFirewall, hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return CompletableFuture<DeleteServiceItemResponse>
     */
    public CompletableFuture<DeleteServiceItemResponse> deleteServiceItemAsync(DeleteServiceItemRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceItem);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceItemRequest 请求对象
     * @return AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>
     */
    public AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItemAsyncInvoker(
        DeleteServiceItemRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteServiceItem, hcClient);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return CompletableFuture<DeleteServiceSetResponse>
     */
    public CompletableFuture<DeleteServiceSetResponse> deleteServiceSetAsync(DeleteServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceSet);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceSetRequest 请求对象
     * @return AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>
     */
    public AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSetAsyncInvoker(
        DeleteServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteServiceSet, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteTag, hcClient);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return CompletableFuture<ListAccessControlLogsResponse>
     */
    public CompletableFuture<ListAccessControlLogsResponse> listAccessControlLogsAsync(
        ListAccessControlLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAccessControlLogs);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlLogsRequest 请求对象
     * @return AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>
     */
    public AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogsAsyncInvoker(
        ListAccessControlLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAccessControlLogs, hcClient);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return CompletableFuture<ListAddressItemsResponse>
     */
    public CompletableFuture<ListAddressItemsResponse> listAddressItemsAsync(ListAddressItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressItems);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressItemsRequest 请求对象
     * @return AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>
     */
    public AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItemsAsyncInvoker(
        ListAddressItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressItems, hcClient);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return CompletableFuture<ListAddressSetDetailResponse>
     */
    public CompletableFuture<ListAddressSetDetailResponse> listAddressSetDetailAsync(
        ListAddressSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSetDetail);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetDetailRequest 请求对象
     * @return AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>
     */
    public AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetailAsyncInvoker(
        ListAddressSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressSetDetail, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return CompletableFuture<ListAddressSetsResponse>
     */
    public CompletableFuture<ListAddressSetsResponse> listAddressSetsAsync(ListAddressSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSets);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressSetsRequest 请求对象
     * @return AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>
     */
    public AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSetsAsyncInvoker(
        ListAddressSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAddressSets, hcClient);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return CompletableFuture<ListAttackLogsResponse>
     */
    public CompletableFuture<ListAttackLogsResponse> listAttackLogsAsync(ListAttackLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAttackLogs);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackLogsRequest 请求对象
     * @return AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>
     */
    public AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogsAsyncInvoker(
        ListAttackLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAttackLogs, hcClient);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return CompletableFuture<ListBlackWhiteListsResponse>
     */
    public CompletableFuture<ListBlackWhiteListsResponse> listBlackWhiteListsAsync(ListBlackWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listBlackWhiteLists);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlackWhiteListsRequest 请求对象
     * @return AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>
     */
    public AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteListsAsyncInvoker(
        ListBlackWhiteListsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listBlackWhiteLists, hcClient);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return CompletableFuture<ListCaptureResultResponse>
     */
    public CompletableFuture<ListCaptureResultResponse> listCaptureResultAsync(ListCaptureResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCaptureResult);
    }

    /**
     * 获取抓包任务结果
     *
     * 获取抓包任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureResultRequest 请求对象
     * @return AsyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse>
     */
    public AsyncInvoker<ListCaptureResultRequest, ListCaptureResultResponse> listCaptureResultAsyncInvoker(
        ListCaptureResultRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCaptureResult, hcClient);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return CompletableFuture<ListCaptureTaskResponse>
     */
    public CompletableFuture<ListCaptureTaskResponse> listCaptureTaskAsync(ListCaptureTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCaptureTask);
    }

    /**
     * 查询抓包任务
     *
     * 查询抓包任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCaptureTaskRequest 请求对象
     * @return AsyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse>
     */
    public AsyncInvoker<ListCaptureTaskRequest, ListCaptureTaskResponse> listCaptureTaskAsyncInvoker(
        ListCaptureTaskRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCaptureTask, hcClient);
    }

    /**
     * 查询dns服务器列表
     *
     * 查询dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return CompletableFuture<ListDnsServersResponse>
     */
    public CompletableFuture<ListDnsServersResponse> listDnsServersAsync(ListDnsServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDnsServers);
    }

    /**
     * 查询dns服务器列表
     *
     * 查询dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDnsServersRequest 请求对象
     * @return AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse>
     */
    public AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse> listDnsServersAsyncInvoker(
        ListDnsServersRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDnsServers, hcClient);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return CompletableFuture<ListDomainParseDetailResponse>
     */
    public CompletableFuture<ListDomainParseDetailResponse> listDomainParseDetailAsync(
        ListDomainParseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainParseDetail);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseDetailRequest 请求对象
     * @return AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>
     */
    public AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetailAsyncInvoker(
        ListDomainParseDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainParseDetail, hcClient);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return CompletableFuture<ListDomainParseIpResponse>
     */
    public CompletableFuture<ListDomainParseIpResponse> listDomainParseIpAsync(ListDomainParseIpRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainParseIp);
    }

    /**
     * 获取域名地址解析结果
     *
     * 获取域名地址解析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainParseIpRequest 请求对象
     * @return AsyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse>
     */
    public AsyncInvoker<ListDomainParseIpRequest, ListDomainParseIpResponse> listDomainParseIpAsyncInvoker(
        ListDomainParseIpRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainParseIp, hcClient);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return CompletableFuture<ListDomainSetsResponse>
     */
    public CompletableFuture<ListDomainSetsResponse> listDomainSetsAsync(ListDomainSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomainSets);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainSetsRequest 请求对象
     * @return AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>
     */
    public AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSetsAsyncInvoker(
        ListDomainSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomainSets, hcClient);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listDomains);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listDomains, hcClient);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return CompletableFuture<ListEastWestFirewallResponse>
     */
    public CompletableFuture<ListEastWestFirewallResponse> listEastWestFirewallAsync(
        ListEastWestFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEastWestFirewall);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEastWestFirewallRequest 请求对象
     * @return AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>
     */
    public AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewallAsyncInvoker(
        ListEastWestFirewallRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEastWestFirewall, hcClient);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return CompletableFuture<ListFirewallDetailResponse>
     */
    public CompletableFuture<ListFirewallDetailResponse> listFirewallDetailAsync(ListFirewallDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFirewallDetail);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallDetailRequest 请求对象
     * @return AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>
     */
    public AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetailAsyncInvoker(
        ListFirewallDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFirewallDetail, hcClient);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return CompletableFuture<ListFirewallListResponse>
     */
    public CompletableFuture<ListFirewallListResponse> listFirewallListAsync(ListFirewallListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFirewallList);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallListRequest 请求对象
     * @return AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse>
     */
    public AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse> listFirewallListAsyncInvoker(
        ListFirewallListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFirewallList, hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return CompletableFuture<ListFlowLogsResponse>
     */
    public CompletableFuture<ListFlowLogsResponse> listFlowLogsAsync(ListFlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFlowLogs);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowLogsRequest 请求对象
     * @return AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsAsyncInvoker(
        ListFlowLogsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listFlowLogs, hcClient);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return CompletableFuture<ListJobResponse>
     */
    public CompletableFuture<ListJobResponse> listJobAsync(ListJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listJob);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRequest 请求对象
     * @return AsyncInvoker<ListJobRequest, ListJobResponse>
     */
    public AsyncInvoker<ListJobRequest, ListJobResponse> listJobAsyncInvoker(ListJobRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listJob, hcClient);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return CompletableFuture<ListLogConfigResponse>
     */
    public CompletableFuture<ListLogConfigResponse> listLogConfigAsync(ListLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listLogConfig);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogConfigRequest 请求对象
     * @return AsyncInvoker<ListLogConfigRequest, ListLogConfigResponse>
     */
    public AsyncInvoker<ListLogConfigRequest, ListLogConfigResponse> listLogConfigAsyncInvoker(
        ListLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listLogConfig, hcClient);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listProjectTags);
    }

    /**
     * 查询标签信息
     *
     * 查询标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listProjectTags, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return CompletableFuture<ListProtectedVpcsResponse>
     */
    public CompletableFuture<ListProtectedVpcsResponse> listProtectedVpcsAsync(ListProtectedVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listProtectedVpcs);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedVpcsRequest 请求对象
     * @return AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>
     */
    public AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcsAsyncInvoker(
        ListProtectedVpcsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listProtectedVpcs, hcClient);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listResourceTags);
    }

    /**
     * 查询资源标签信息
     *
     * 查询资源标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listResourceTags, hcClient);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return CompletableFuture<ListServiceItemsResponse>
     */
    public CompletableFuture<ListServiceItemsResponse> listServiceItemsAsync(ListServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceItems);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceItemsRequest 请求对象
     * @return AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>
     */
    public AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItemsAsyncInvoker(
        ListServiceItemsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceItems, hcClient);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return CompletableFuture<ListServiceSetDetailResponse>
     */
    public CompletableFuture<ListServiceSetDetailResponse> listServiceSetDetailAsync(
        ListServiceSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSetDetail);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetDetailRequest 请求对象
     * @return AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>
     */
    public AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetailAsyncInvoker(
        ListServiceSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceSetDetail, hcClient);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return CompletableFuture<ListServiceSetsResponse>
     */
    public CompletableFuture<ListServiceSetsResponse> listServiceSetsAsync(ListServiceSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSets);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServiceSetsRequest 请求对象
     * @return AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>
     */
    public AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSetsAsyncInvoker(
        ListServiceSetsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listServiceSets, hcClient);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return CompletableFuture<SaveTagsResponse>
     */
    public CompletableFuture<SaveTagsResponse> saveTagsAsync(SaveTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.saveTags);
    }

    /**
     * 保存资源标签接口
     *
     * 保存资源标签接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTagsRequest 请求对象
     * @return AsyncInvoker<SaveTagsRequest, SaveTagsResponse>
     */
    public AsyncInvoker<SaveTagsRequest, SaveTagsResponse> saveTagsAsyncInvoker(SaveTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.saveTags, hcClient);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return CompletableFuture<ShowAlarmConfigResponse>
     */
    public CompletableFuture<ShowAlarmConfigResponse> showAlarmConfigAsync(ShowAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAlarmConfig);
    }

    /**
     * 获取告警配置信息
     *
     * 获取告警配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigAsyncInvoker(
        ShowAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAlarmConfig, hcClient);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return CompletableFuture<ShowAntiVirusRuleResponse>
     */
    public CompletableFuture<ShowAntiVirusRuleResponse> showAntiVirusRuleAsync(ShowAntiVirusRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAntiVirusRule);
    }

    /**
     * 获取防火墙反病毒规则信息
     *
     * 获取防火墙反病毒规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusRuleRequest 请求对象
     * @return AsyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse>
     */
    public AsyncInvoker<ShowAntiVirusRuleRequest, ShowAntiVirusRuleResponse> showAntiVirusRuleAsyncInvoker(
        ShowAntiVirusRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAntiVirusRule, hcClient);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return CompletableFuture<ShowAntiVirusSwitchResponse>
     */
    public CompletableFuture<ShowAntiVirusSwitchResponse> showAntiVirusSwitchAsync(ShowAntiVirusSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAntiVirusSwitch);
    }

    /**
     * 查看反病毒开关
     *
     * 查看反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntiVirusSwitchRequest 请求对象
     * @return AsyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse>
     */
    public AsyncInvoker<ShowAntiVirusSwitchRequest, ShowAntiVirusSwitchResponse> showAntiVirusSwitchAsyncInvoker(
        ShowAntiVirusSwitchRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAntiVirusSwitch, hcClient);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainSetDetailResponse>
     */
    public CompletableFuture<ShowDomainSetDetailResponse> showDomainSetDetailAsync(ShowDomainSetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showDomainSetDetail);
    }

    /**
     * 查看域名组详情
     *
     * 查看域名组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainSetDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse>
     */
    public AsyncInvoker<ShowDomainSetDetailRequest, ShowDomainSetDetailResponse> showDomainSetDetailAsyncInvoker(
        ShowDomainSetDetailRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showDomainSetDetail, hcClient);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return CompletableFuture<UpdateAddressSetResponse>
     */
    public CompletableFuture<UpdateAddressSetResponse> updateAddressSetAsync(UpdateAddressSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAddressSet);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressSetRequest 请求对象
     * @return AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>
     */
    public AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSetAsyncInvoker(
        UpdateAddressSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAddressSet, hcClient);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlarmConfigResponse>
     */
    public CompletableFuture<UpdateAlarmConfigResponse> updateAlarmConfigAsync(UpdateAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAlarmConfig);
    }

    /**
     * 修改告警配置接口
     *
     * 修改告警配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigAsyncInvoker(
        UpdateAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return CompletableFuture<UpdateAntiVirusRuleResponse>
     */
    public CompletableFuture<UpdateAntiVirusRuleResponse> updateAntiVirusRuleAsync(UpdateAntiVirusRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAntiVirusRule);
    }

    /**
     * 修改反病毒规则
     *
     * 修改反病毒规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse>
     */
    public AsyncInvoker<UpdateAntiVirusRuleRequest, UpdateAntiVirusRuleResponse> updateAntiVirusRuleAsyncInvoker(
        UpdateAntiVirusRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAntiVirusRule, hcClient);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return CompletableFuture<UpdateAntiVirusSwitchResponse>
     */
    public CompletableFuture<UpdateAntiVirusSwitchResponse> updateAntiVirusSwitchAsync(
        UpdateAntiVirusSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAntiVirusSwitch);
    }

    /**
     * 修改反病毒开关
     *
     * 修改反病毒开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiVirusSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse>
     */
    public AsyncInvoker<UpdateAntiVirusSwitchRequest, UpdateAntiVirusSwitchResponse> updateAntiVirusSwitchAsyncInvoker(
        UpdateAntiVirusSwitchRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAntiVirusSwitch, hcClient);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return CompletableFuture<UpdateBlackWhiteListResponse>
     */
    public CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteListAsync(
        UpdateBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateBlackWhiteList);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 更新dns服务器列表
     *
     * 更新dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return CompletableFuture<UpdateDnsServersResponse>
     */
    public CompletableFuture<UpdateDnsServersResponse> updateDnsServersAsync(UpdateDnsServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateDnsServers);
    }

    /**
     * 更新dns服务器列表
     *
     * 更新dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsServersRequest 请求对象
     * @return AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>
     */
    public AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServersAsyncInvoker(
        UpdateDnsServersRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateDnsServers, hcClient);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return CompletableFuture<UpdateDomainSetResponse>
     */
    public CompletableFuture<UpdateDomainSetResponse> updateDomainSetAsync(UpdateDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateDomainSet);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainSetRequest 请求对象
     * @return AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>
     */
    public AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSetAsyncInvoker(
        UpdateDomainSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateDomainSet, hcClient);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return CompletableFuture<UpdateLogConfigResponse>
     */
    public CompletableFuture<UpdateLogConfigResponse> updateLogConfigAsync(UpdateLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateLogConfig);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public AsyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigAsyncInvoker(
        UpdateLogConfigRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateLogConfig, hcClient);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return CompletableFuture<UpdateServiceSetResponse>
     */
    public CompletableFuture<UpdateServiceSetResponse> updateServiceSetAsync(UpdateServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateServiceSet);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceSetRequest 请求对象
     * @return AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>
     */
    public AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSetAsyncInvoker(
        UpdateServiceSetRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateServiceSet, hcClient);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return CompletableFuture<AddAclRuleResponse>
     */
    public CompletableFuture<AddAclRuleResponse> addAclRuleAsync(AddAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAclRule);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAclRuleRequest 请求对象
     * @return AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse>
     */
    public AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse> addAclRuleAsyncInvoker(AddAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.addAclRule, hcClient);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAclRulesResponse>
     */
    public CompletableFuture<BatchDeleteAclRulesResponse> batchDeleteAclRulesAsync(BatchDeleteAclRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAclRules);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAclRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRulesAsyncInvoker(
        BatchDeleteAclRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchDeleteAclRules, hcClient);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return CompletableFuture<BatchUpdateAclRuleActionsResponse>
     */
    public CompletableFuture<BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsync(
        BatchUpdateAclRuleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchUpdateAclRuleActions);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAclRuleActionsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>
     */
    public AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsyncInvoker(
        BatchUpdateAclRuleActionsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.batchUpdateAclRuleActions, hcClient);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return CompletableFuture<DeleteAclRuleResponse>
     */
    public CompletableFuture<DeleteAclRuleResponse> deleteAclRuleAsync(DeleteAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAclRule);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>
     */
    public AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRuleAsyncInvoker(
        DeleteAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAclRule, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return CompletableFuture<DeleteAclRuleHitCountResponse>
     */
    public CompletableFuture<DeleteAclRuleHitCountResponse> deleteAclRuleHitCountAsync(
        DeleteAclRuleHitCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAclRuleHitCount);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>
     */
    public AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCountAsyncInvoker(
        DeleteAclRuleHitCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.deleteAclRuleHitCount, hcClient);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return CompletableFuture<ListAclRuleHitCountResponse>
     */
    public CompletableFuture<ListAclRuleHitCountResponse> listAclRuleHitCountAsync(ListAclRuleHitCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAclRuleHitCount);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>
     */
    public AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCountAsyncInvoker(
        ListAclRuleHitCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAclRuleHitCount, hcClient);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return CompletableFuture<ListAclRulesResponse>
     */
    public CompletableFuture<ListAclRulesResponse> listAclRulesAsync(ListAclRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAclRules);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclRulesRequest 请求对象
     * @return AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse>
     */
    public AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse> listAclRulesAsyncInvoker(
        ListAclRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAclRules, hcClient);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse>
     */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRegions);
    }

    /**
     * 查看region列表
     *
     * 查看region列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listRegions, hcClient);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return CompletableFuture<ListRuleAclTagsResponse>
     */
    public CompletableFuture<ListRuleAclTagsResponse> listRuleAclTagsAsync(ListRuleAclTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleAclTags);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleAclTagsRequest 请求对象
     * @return AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>
     */
    public AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTagsAsyncInvoker(
        ListRuleAclTagsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listRuleAclTags, hcClient);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return CompletableFuture<ShowImportStatusResponse>
     */
    public CompletableFuture<ShowImportStatusResponse> showImportStatusAsync(ShowImportStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showImportStatus);
    }

    /**
     * 查看导入状态接口
     *
     * 查看导入状态接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImportStatusRequest 请求对象
     * @return AsyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse>
     */
    public AsyncInvoker<ShowImportStatusRequest, ShowImportStatusResponse> showImportStatusAsyncInvoker(
        ShowImportStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showImportStatus, hcClient);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return CompletableFuture<UpdateAclRuleResponse>
     */
    public CompletableFuture<UpdateAclRuleResponse> updateAclRuleAsync(UpdateAclRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAclRule);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>
     */
    public AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRuleAsyncInvoker(
        UpdateAclRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAclRule, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return CompletableFuture<UpdateAclRuleOrderResponse>
     */
    public CompletableFuture<UpdateAclRuleOrderResponse> updateAclRuleOrderAsync(UpdateAclRuleOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAclRuleOrder);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclRuleOrderRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>
     */
    public AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrderAsyncInvoker(
        UpdateAclRuleOrderRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAclRuleOrder, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return CompletableFuture<ChangeEipStatusResponse>
     */
    public CompletableFuture<ChangeEipStatusResponse> changeEipStatusAsync(ChangeEipStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEipStatus);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEipStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>
     */
    public AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatusAsyncInvoker(
        ChangeEipStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeEipStatus, hcClient);
    }

    /**
     * 查看eip告警白名单
     *
     * 查看eip告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return CompletableFuture<ListAlarmWhitelistResponse>
     */
    public CompletableFuture<ListAlarmWhitelistResponse> listAlarmWhitelistAsync(ListAlarmWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAlarmWhitelist);
    }

    /**
     * 查看eip告警白名单
     *
     * 查看eip告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhitelistRequest 请求对象
     * @return AsyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse>
     */
    public AsyncInvoker<ListAlarmWhitelistRequest, ListAlarmWhitelistResponse> listAlarmWhitelistAsyncInvoker(
        ListAlarmWhitelistRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listAlarmWhitelist, hcClient);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return CompletableFuture<ListEipCountResponse>
     */
    public CompletableFuture<ListEipCountResponse> listEipCountAsync(ListEipCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEipCount);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipCountRequest 请求对象
     * @return AsyncInvoker<ListEipCountRequest, ListEipCountResponse>
     */
    public AsyncInvoker<ListEipCountRequest, ListEipCountResponse> listEipCountAsyncInvoker(
        ListEipCountRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEipCount, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return CompletableFuture<ListEipsResponse>
     */
    public CompletableFuture<ListEipsResponse> listEipsAsync(ListEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEips);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEipsRequest 请求对象
     * @return AsyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public AsyncInvoker<ListEipsRequest, ListEipsResponse> listEipsAsyncInvoker(ListEipsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listEips, hcClient);
    }

    /**
     * 获取eip自动防护状态信息
     *
     * 获取eip自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return CompletableFuture<ShowAutoProtectStatusResponse>
     */
    public CompletableFuture<ShowAutoProtectStatusResponse> showAutoProtectStatusAsync(
        ShowAutoProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showAutoProtectStatus);
    }

    /**
     * 获取eip自动防护状态信息
     *
     * 获取eip自动防护状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoProtectStatusRequest 请求对象
     * @return AsyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse>
     */
    public AsyncInvoker<ShowAutoProtectStatusRequest, ShowAutoProtectStatusResponse> showAutoProtectStatusAsyncInvoker(
        ShowAutoProtectStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showAutoProtectStatus, hcClient);
    }

    /**
     * 修改eip自动防护开关
     *
     * 修改eip自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return CompletableFuture<SwitchAutoProtectStatusResponse>
     */
    public CompletableFuture<SwitchAutoProtectStatusResponse> switchAutoProtectStatusAsync(
        SwitchAutoProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.switchAutoProtectStatus);
    }

    /**
     * 修改eip自动防护开关
     *
     * 修改eip自动防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAutoProtectStatusRequest 请求对象
     * @return AsyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse>
     */
    public AsyncInvoker<SwitchAutoProtectStatusRequest, SwitchAutoProtectStatusResponse> switchAutoProtectStatusAsyncInvoker(
        SwitchAutoProtectStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.switchAutoProtectStatus, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return CompletableFuture<ChangeIpsProtectModeResponse>
     */
    public CompletableFuture<ChangeIpsProtectModeResponse> changeIpsProtectModeAsync(
        ChangeIpsProtectModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsProtectMode);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>
     */
    public AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectModeAsyncInvoker(
        ChangeIpsProtectModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsProtectMode, hcClient);
    }

    /**
     * 改变ips规则模式
     *
     * 改变ips规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return CompletableFuture<ChangeIpsRuleModeResponse>
     */
    public CompletableFuture<ChangeIpsRuleModeResponse> changeIpsRuleModeAsync(ChangeIpsRuleModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsRuleMode);
    }

    /**
     * 改变ips规则模式
     *
     * 改变ips规则模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsRuleModeRequest 请求对象
     * @return AsyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse>
     */
    public AsyncInvoker<ChangeIpsRuleModeRequest, ChangeIpsRuleModeResponse> changeIpsRuleModeAsyncInvoker(
        ChangeIpsRuleModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsRuleMode, hcClient);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeIpsSwitchStatusResponse>
     */
    public CompletableFuture<ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusAsync(
        ChangeIpsSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsSwitchStatus);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusAsyncInvoker(
        ChangeIpsSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.changeIpsSwitchStatus, hcClient);
    }

    /**
     * 获取自定义ips规则
     *
     * 获取自定义ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return CompletableFuture<ListCustomerIpsResponse>
     */
    public CompletableFuture<ListCustomerIpsResponse> listCustomerIpsAsync(ListCustomerIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listCustomerIps);
    }

    /**
     * 获取自定义ips规则
     *
     * 获取自定义ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomerIpsRequest 请求对象
     * @return AsyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse>
     */
    public AsyncInvoker<ListCustomerIpsRequest, ListCustomerIpsResponse> listCustomerIpsAsyncInvoker(
        ListCustomerIpsRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listCustomerIps, hcClient);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return CompletableFuture<ListIpsProtectModeResponse>
     */
    public CompletableFuture<ListIpsProtectModeResponse> listIpsProtectModeAsync(ListIpsProtectModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsProtectMode);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>
     */
    public AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectModeAsyncInvoker(
        ListIpsProtectModeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsProtectMode, hcClient);
    }

    /**
     * 查询频率ips规则信息
     *
     * 查询频率ips规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return CompletableFuture<ListIpsRulesResponse>
     */
    public CompletableFuture<ListIpsRulesResponse> listIpsRulesAsync(ListIpsRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsRules);
    }

    /**
     * 查询频率ips规则信息
     *
     * 查询频率ips规则信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRulesRequest 请求对象
     * @return AsyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse>
     */
    public AsyncInvoker<ListIpsRulesRequest, ListIpsRulesResponse> listIpsRulesAsyncInvoker(
        ListIpsRulesRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsRules, hcClient);
    }

    /**
     * 获取ips规则列表
     *
     * 获取ips规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRules1Request 请求对象
     * @return CompletableFuture<ListIpsRules1Response>
     */
    public CompletableFuture<ListIpsRules1Response> listIpsRules1Async(ListIpsRules1Request request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsRules1);
    }

    /**
     * 获取ips规则列表
     *
     * 获取ips规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsRules1Request 请求对象
     * @return AsyncInvoker<ListIpsRules1Request, ListIpsRules1Response>
     */
    public AsyncInvoker<ListIpsRules1Request, ListIpsRules1Response> listIpsRules1AsyncInvoker(
        ListIpsRules1Request request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsRules1, hcClient);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return CompletableFuture<ListIpsSwitchStatusResponse>
     */
    public CompletableFuture<ListIpsSwitchStatusResponse> listIpsSwitchStatusAsync(ListIpsSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsSwitchStatus);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatusAsyncInvoker(
        ListIpsSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.listIpsSwitchStatus, hcClient);
    }

    /**
     * 获取ips规则细节
     *
     * 获取ips规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return CompletableFuture<ShowIpsUpdateTimeResponse>
     */
    public CompletableFuture<ShowIpsUpdateTimeResponse> showIpsUpdateTimeAsync(ShowIpsUpdateTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.showIpsUpdateTime);
    }

    /**
     * 获取ips规则细节
     *
     * 获取ips规则细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpsUpdateTimeRequest 请求对象
     * @return AsyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse>
     */
    public AsyncInvoker<ShowIpsUpdateTimeRequest, ShowIpsUpdateTimeResponse> showIpsUpdateTimeAsyncInvoker(
        ShowIpsUpdateTimeRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.showIpsUpdateTime, hcClient);
    }

    /**
     * 创建频率ips规则
     *
     * 创建频率ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return CompletableFuture<UpdateAdvancedIpsRuleResponse>
     */
    public CompletableFuture<UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRuleAsync(
        UpdateAdvancedIpsRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAdvancedIpsRule);
    }

    /**
     * 创建频率ips规则
     *
     * 创建频率ips规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAdvancedIpsRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse>
     */
    public AsyncInvoker<UpdateAdvancedIpsRuleRequest, UpdateAdvancedIpsRuleResponse> updateAdvancedIpsRuleAsyncInvoker(
        UpdateAdvancedIpsRuleRequest request) {
        return new AsyncInvoker<>(request, CfwMeta.updateAdvancedIpsRule, hcClient);
    }

}

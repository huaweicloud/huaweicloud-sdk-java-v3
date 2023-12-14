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
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateEastWestFirewallResponse;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallRequest;
import com.huaweicloud.sdk.cfw.v1.model.CreateFirewallResponse;
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
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceItemsResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetDetailResponse;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsRequest;
import com.huaweicloud.sdk.cfw.v1.model.ListServiceSetsResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleOrderResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAclRuleResponse;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetRequest;
import com.huaweicloud.sdk.cfw.v1.model.UpdateAddressSetResponse;
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
     * @param AddAddressItemRequest 请求对象
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
     * @param AddAddressItemRequest 请求对象
     * @return SyncInvoker<AddAddressItemRequest, AddAddressItemResponse>
     */
    public SyncInvoker<AddAddressItemRequest, AddAddressItemResponse> addAddressItemInvoker(
        AddAddressItemRequest request) {
        return new SyncInvoker<AddAddressItemRequest, AddAddressItemResponse>(request, CfwMeta.addAddressItem,
            hcClient);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressSetRequest 请求对象
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
     * @param AddAddressSetRequest 请求对象
     * @return SyncInvoker<AddAddressSetRequest, AddAddressSetResponse>
     */
    public SyncInvoker<AddAddressSetRequest, AddAddressSetResponse> addAddressSetInvoker(AddAddressSetRequest request) {
        return new SyncInvoker<AddAddressSetRequest, AddAddressSetResponse>(request, CfwMeta.addAddressSet, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBlackWhiteListRequest 请求对象
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
     * @param AddBlackWhiteListRequest 请求对象
     * @return SyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>
     */
    public SyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteListInvoker(
        AddBlackWhiteListRequest request) {
        return new SyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>(request, CfwMeta.addBlackWhiteList,
            hcClient);
    }

    /**
     * 添加域名组
     *
     * 添加域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDomainSetRequest 请求对象
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
     * @param AddDomainSetRequest 请求对象
     * @return SyncInvoker<AddDomainSetRequest, AddDomainSetResponse>
     */
    public SyncInvoker<AddDomainSetRequest, AddDomainSetResponse> addDomainSetInvoker(AddDomainSetRequest request) {
        return new SyncInvoker<AddDomainSetRequest, AddDomainSetResponse>(request, CfwMeta.addDomainSet, hcClient);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDomainsRequest 请求对象
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
     * @param AddDomainsRequest 请求对象
     * @return SyncInvoker<AddDomainsRequest, AddDomainsResponse>
     */
    public SyncInvoker<AddDomainsRequest, AddDomainsResponse> addDomainsInvoker(AddDomainsRequest request) {
        return new SyncInvoker<AddDomainsRequest, AddDomainsResponse>(request, CfwMeta.addDomains, hcClient);
    }

    /**
     * 创建日志配置
     *
     * 创建日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddLogConfigRequest 请求对象
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
     * @param AddLogConfigRequest 请求对象
     * @return SyncInvoker<AddLogConfigRequest, AddLogConfigResponse>
     */
    public SyncInvoker<AddLogConfigRequest, AddLogConfigResponse> addLogConfigInvoker(AddLogConfigRequest request) {
        return new SyncInvoker<AddLogConfigRequest, AddLogConfigResponse>(request, CfwMeta.addLogConfig, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceItemsRequest 请求对象
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
     * @param AddServiceItemsRequest 请求对象
     * @return SyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>
     */
    public SyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItemsInvoker(
        AddServiceItemsRequest request) {
        return new SyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>(request, CfwMeta.addServiceItems,
            hcClient);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceSetRequest 请求对象
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
     * @param AddServiceSetRequest 请求对象
     * @return SyncInvoker<AddServiceSetRequest, AddServiceSetResponse>
     */
    public SyncInvoker<AddServiceSetRequest, AddServiceSetResponse> addServiceSetInvoker(AddServiceSetRequest request) {
        return new SyncInvoker<AddServiceSetRequest, AddServiceSetResponse>(request, CfwMeta.addServiceSet, hcClient);
    }

    /**
     * 批量删除地址组成员
     *
     * 批量删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAddressItemsRequest 请求对象
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
     * @param BatchDeleteAddressItemsRequest 请求对象
     * @return SyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>
     */
    public SyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItemsInvoker(
        BatchDeleteAddressItemsRequest request) {
        return new SyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>(request,
            CfwMeta.batchDeleteAddressItems, hcClient);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 批量删除服务组成员信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServiceItemsRequest 请求对象
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
     * @param BatchDeleteServiceItemsRequest 请求对象
     * @return SyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>
     */
    public SyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItemsInvoker(
        BatchDeleteServiceItemsRequest request) {
        return new SyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>(request,
            CfwMeta.batchDeleteServiceItems, hcClient);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEastWestFirewallStatusRequest 请求对象
     * @return ChangeEastWestFirewallStatusResponse
     */
    public ChangeEastWestFirewallStatusResponse changeEastWestFirewallStatus(
        ChangeEastWestFirewallStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeEastWestFirewallStatus);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEastWestFirewallStatusRequest 请求对象
     * @return SyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>
     */
    public SyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusInvoker(
        ChangeEastWestFirewallStatusRequest request) {
        return new SyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>(request,
            CfwMeta.changeEastWestFirewallStatus, hcClient);
    }

    /**
     * 创建东西向防火墙
     *
     * 创建东西向防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEastWestFirewallRequest 请求对象
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
     * @param CreateEastWestFirewallRequest 请求对象
     * @return SyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse>
     */
    public SyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse> createEastWestFirewallInvoker(
        CreateEastWestFirewallRequest request) {
        return new SyncInvoker<CreateEastWestFirewallRequest, CreateEastWestFirewallResponse>(request,
            CfwMeta.createEastWestFirewall, hcClient);
    }

    /**
     * 创建防火墙
     *
     * 创建防火墙
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFirewallRequest 请求对象
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
     * @param CreateFirewallRequest 请求对象
     * @return SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public SyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallInvoker(
        CreateFirewallRequest request) {
        return new SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>(request, CfwMeta.createFirewall,
            hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressItemRequest 请求对象
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
     * @param DeleteAddressItemRequest 请求对象
     * @return SyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>
     */
    public SyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItemInvoker(
        DeleteAddressItemRequest request) {
        return new SyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>(request, CfwMeta.deleteAddressItem,
            hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressSetRequest 请求对象
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
     * @param DeleteAddressSetRequest 请求对象
     * @return SyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>
     */
    public SyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSetInvoker(
        DeleteAddressSetRequest request) {
        return new SyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>(request, CfwMeta.deleteAddressSet,
            hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlackWhiteListRequest 请求对象
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
     * @param DeleteBlackWhiteListRequest 请求对象
     * @return SyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>
     */
    public SyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteListInvoker(
        DeleteBlackWhiteListRequest request) {
        return new SyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>(request,
            CfwMeta.deleteBlackWhiteList, hcClient);
    }

    /**
     * 删除域名组
     *
     * 删除域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainSetRequest 请求对象
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
     * @param DeleteDomainSetRequest 请求对象
     * @return SyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>
     */
    public SyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSetInvoker(
        DeleteDomainSetRequest request) {
        return new SyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>(request, CfwMeta.deleteDomainSet,
            hcClient);
    }

    /**
     * 删除域名列表
     *
     * 删除域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainsRequest 请求对象
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
     * @param DeleteDomainsRequest 请求对象
     * @return SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsInvoker(DeleteDomainsRequest request) {
        return new SyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, CfwMeta.deleteDomains, hcClient);
    }

    /**
     * 删除防火墙
     *
     * 删除防火墙，仅按需生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFirewallRequest 请求对象
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
     * @param DeleteFirewallRequest 请求对象
     * @return SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallInvoker(
        DeleteFirewallRequest request) {
        return new SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>(request, CfwMeta.deleteFirewall,
            hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemRequest 请求对象
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
     * @param DeleteServiceItemRequest 请求对象
     * @return SyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>
     */
    public SyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItemInvoker(
        DeleteServiceItemRequest request) {
        return new SyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>(request, CfwMeta.deleteServiceItem,
            hcClient);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceSetRequest 请求对象
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
     * @param DeleteServiceSetRequest 请求对象
     * @return SyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>
     */
    public SyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSetInvoker(
        DeleteServiceSetRequest request) {
        return new SyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>(request, CfwMeta.deleteServiceSet,
            hcClient);
    }

    /**
     * 查询访问控制日志
     *
     * 查询访问控制日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessControlLogsRequest 请求对象
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
     * @param ListAccessControlLogsRequest 请求对象
     * @return SyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>
     */
    public SyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogsInvoker(
        ListAccessControlLogsRequest request) {
        return new SyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>(request,
            CfwMeta.listAccessControlLogs, hcClient);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressItemsRequest 请求对象
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
     * @param ListAddressItemsRequest 请求对象
     * @return SyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>
     */
    public SyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItemsInvoker(
        ListAddressItemsRequest request) {
        return new SyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>(request, CfwMeta.listAddressItems,
            hcClient);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetDetailRequest 请求对象
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
     * @param ListAddressSetDetailRequest 请求对象
     * @return SyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>
     */
    public SyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetailInvoker(
        ListAddressSetDetailRequest request) {
        return new SyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>(request,
            CfwMeta.listAddressSetDetail, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetsRequest 请求对象
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
     * @param ListAddressSetsRequest 请求对象
     * @return SyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>
     */
    public SyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSetsInvoker(
        ListAddressSetsRequest request) {
        return new SyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>(request, CfwMeta.listAddressSets,
            hcClient);
    }

    /**
     * 查询攻击日志
     *
     * 查询攻击日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttackLogsRequest 请求对象
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
     * @param ListAttackLogsRequest 请求对象
     * @return SyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>
     */
    public SyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogsInvoker(
        ListAttackLogsRequest request) {
        return new SyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>(request, CfwMeta.listAttackLogs,
            hcClient);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlackWhiteListsRequest 请求对象
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
     * @param ListBlackWhiteListsRequest 请求对象
     * @return SyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>
     */
    public SyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteListsInvoker(
        ListBlackWhiteListsRequest request) {
        return new SyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>(request,
            CfwMeta.listBlackWhiteLists, hcClient);
    }

    /**
     * 查询dns服务器列表
     *
     * 查询dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDnsServersRequest 请求对象
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
     * @param ListDnsServersRequest 请求对象
     * @return SyncInvoker<ListDnsServersRequest, ListDnsServersResponse>
     */
    public SyncInvoker<ListDnsServersRequest, ListDnsServersResponse> listDnsServersInvoker(
        ListDnsServersRequest request) {
        return new SyncInvoker<ListDnsServersRequest, ListDnsServersResponse>(request, CfwMeta.listDnsServers,
            hcClient);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainParseDetailRequest 请求对象
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
     * @param ListDomainParseDetailRequest 请求对象
     * @return SyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>
     */
    public SyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetailInvoker(
        ListDomainParseDetailRequest request) {
        return new SyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>(request,
            CfwMeta.listDomainParseDetail, hcClient);
    }

    /**
     * 查询域名组列表
     *
     * 查询域名组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainSetsRequest 请求对象
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
     * @param ListDomainSetsRequest 请求对象
     * @return SyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>
     */
    public SyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSetsInvoker(
        ListDomainSetsRequest request) {
        return new SyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>(request, CfwMeta.listDomainSets,
            hcClient);
    }

    /**
     * 获取域名组下域名列表
     *
     * 获取域名组下域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
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
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CfwMeta.listDomains, hcClient);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEastWestFirewallRequest 请求对象
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
     * @param ListEastWestFirewallRequest 请求对象
     * @return SyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>
     */
    public SyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewallInvoker(
        ListEastWestFirewallRequest request) {
        return new SyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>(request,
            CfwMeta.listEastWestFirewall, hcClient);
    }

    /**
     * 查询防火墙详细信息
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallDetailRequest 请求对象
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
     * @param ListFirewallDetailRequest 请求对象
     * @return SyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>
     */
    public SyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetailInvoker(
        ListFirewallDetailRequest request) {
        return new SyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>(request,
            CfwMeta.listFirewallDetail, hcClient);
    }

    /**
     * 查询防火墙列表
     *
     * 查询防火墙列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallListRequest 请求对象
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
     * @param ListFirewallListRequest 请求对象
     * @return SyncInvoker<ListFirewallListRequest, ListFirewallListResponse>
     */
    public SyncInvoker<ListFirewallListRequest, ListFirewallListResponse> listFirewallListInvoker(
        ListFirewallListRequest request) {
        return new SyncInvoker<ListFirewallListRequest, ListFirewallListResponse>(request, CfwMeta.listFirewallList,
            hcClient);
    }

    /**
     * 查询流日志
     *
     * 查询流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowLogsRequest 请求对象
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
     * @param ListFlowLogsRequest 请求对象
     * @return SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsInvoker(ListFlowLogsRequest request) {
        return new SyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>(request, CfwMeta.listFlowLogs, hcClient);
    }

    /**
     * 获取CFW任务执行状态
     *
     * 获取CFW任务执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJobRequest 请求对象
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
     * @param ListJobRequest 请求对象
     * @return SyncInvoker<ListJobRequest, ListJobResponse>
     */
    public SyncInvoker<ListJobRequest, ListJobResponse> listJobInvoker(ListJobRequest request) {
        return new SyncInvoker<ListJobRequest, ListJobResponse>(request, CfwMeta.listJob, hcClient);
    }

    /**
     * 获取日志配置
     *
     * 获取日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLogConfigRequest 请求对象
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
     * @param ListLogConfigRequest 请求对象
     * @return SyncInvoker<ListLogConfigRequest, ListLogConfigResponse>
     */
    public SyncInvoker<ListLogConfigRequest, ListLogConfigResponse> listLogConfigInvoker(ListLogConfigRequest request) {
        return new SyncInvoker<ListLogConfigRequest, ListLogConfigResponse>(request, CfwMeta.listLogConfig, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedVpcsRequest 请求对象
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
     * @param ListProtectedVpcsRequest 请求对象
     * @return SyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>
     */
    public SyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcsInvoker(
        ListProtectedVpcsRequest request) {
        return new SyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>(request, CfwMeta.listProtectedVpcs,
            hcClient);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceItemsRequest 请求对象
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
     * @param ListServiceItemsRequest 请求对象
     * @return SyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>
     */
    public SyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItemsInvoker(
        ListServiceItemsRequest request) {
        return new SyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>(request, CfwMeta.listServiceItems,
            hcClient);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetDetailRequest 请求对象
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
     * @param ListServiceSetDetailRequest 请求对象
     * @return SyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>
     */
    public SyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetailInvoker(
        ListServiceSetDetailRequest request) {
        return new SyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>(request,
            CfwMeta.listServiceSetDetail, hcClient);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetsRequest 请求对象
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
     * @param ListServiceSetsRequest 请求对象
     * @return SyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>
     */
    public SyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSetsInvoker(
        ListServiceSetsRequest request) {
        return new SyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>(request, CfwMeta.listServiceSets,
            hcClient);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressSetRequest 请求对象
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
     * @param UpdateAddressSetRequest 请求对象
     * @return SyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>
     */
    public SyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSetInvoker(
        UpdateAddressSetRequest request) {
        return new SyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>(request, CfwMeta.updateAddressSet,
            hcClient);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListRequest 请求对象
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
     * @param UpdateBlackWhiteListRequest 请求对象
     * @return SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListInvoker(
        UpdateBlackWhiteListRequest request) {
        return new SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
            CfwMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 更新dns服务器列表
     *
     * 更新dns服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDnsServersRequest 请求对象
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
     * @param UpdateDnsServersRequest 请求对象
     * @return SyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>
     */
    public SyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServersInvoker(
        UpdateDnsServersRequest request) {
        return new SyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>(request, CfwMeta.updateDnsServers,
            hcClient);
    }

    /**
     * 更新域名组
     *
     * 更新域名组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSetRequest 请求对象
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
     * @param UpdateDomainSetRequest 请求对象
     * @return SyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>
     */
    public SyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSetInvoker(
        UpdateDomainSetRequest request) {
        return new SyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>(request, CfwMeta.updateDomainSet,
            hcClient);
    }

    /**
     * 更新日志配置
     *
     * 更新日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLogConfigRequest 请求对象
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
     * @param UpdateLogConfigRequest 请求对象
     * @return SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>
     */
    public SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfigInvoker(
        UpdateLogConfigRequest request) {
        return new SyncInvoker<UpdateLogConfigRequest, UpdateLogConfigResponse>(request, CfwMeta.updateLogConfig,
            hcClient);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceSetRequest 请求对象
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
     * @param UpdateServiceSetRequest 请求对象
     * @return SyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>
     */
    public SyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSetInvoker(
        UpdateServiceSetRequest request) {
        return new SyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>(request, CfwMeta.updateServiceSet,
            hcClient);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAclRuleRequest 请求对象
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
     * @param AddAclRuleRequest 请求对象
     * @return SyncInvoker<AddAclRuleRequest, AddAclRuleResponse>
     */
    public SyncInvoker<AddAclRuleRequest, AddAclRuleResponse> addAclRuleInvoker(AddAclRuleRequest request) {
        return new SyncInvoker<AddAclRuleRequest, AddAclRuleResponse>(request, CfwMeta.addAclRule, hcClient);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAclRulesRequest 请求对象
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
     * @param BatchDeleteAclRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>
     */
    public SyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRulesInvoker(
        BatchDeleteAclRulesRequest request) {
        return new SyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>(request,
            CfwMeta.batchDeleteAclRules, hcClient);
    }

    /**
     * 批量更新规则动作
     *
     * 批量更新规则动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateAclRuleActionsRequest 请求对象
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
     * @param BatchUpdateAclRuleActionsRequest 请求对象
     * @return SyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>
     */
    public SyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsInvoker(
        BatchUpdateAclRuleActionsRequest request) {
        return new SyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>(request,
            CfwMeta.batchUpdateAclRuleActions, hcClient);
    }

    /**
     * 删除ACL规则
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleRequest 请求对象
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
     * @param DeleteAclRuleRequest 请求对象
     * @return SyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>
     */
    public SyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRuleInvoker(DeleteAclRuleRequest request) {
        return new SyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>(request, CfwMeta.deleteAclRule, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleHitCountRequest 请求对象
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
     * @param DeleteAclRuleHitCountRequest 请求对象
     * @return SyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>
     */
    public SyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCountInvoker(
        DeleteAclRuleHitCountRequest request) {
        return new SyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>(request,
            CfwMeta.deleteAclRuleHitCount, hcClient);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclRuleHitCountRequest 请求对象
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
     * @param ListAclRuleHitCountRequest 请求对象
     * @return SyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>
     */
    public SyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCountInvoker(
        ListAclRuleHitCountRequest request) {
        return new SyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>(request,
            CfwMeta.listAclRuleHitCount, hcClient);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAclRulesRequest 请求对象
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
     * @param ListAclRulesRequest 请求对象
     * @return SyncInvoker<ListAclRulesRequest, ListAclRulesResponse>
     */
    public SyncInvoker<ListAclRulesRequest, ListAclRulesResponse> listAclRulesInvoker(ListAclRulesRequest request) {
        return new SyncInvoker<ListAclRulesRequest, ListAclRulesResponse>(request, CfwMeta.listAclRules, hcClient);
    }

    /**
     * 查询规则标签
     *
     * 查询规则标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclTagsRequest 请求对象
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
     * @param ListRuleAclTagsRequest 请求对象
     * @return SyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>
     */
    public SyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTagsInvoker(
        ListRuleAclTagsRequest request) {
        return new SyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>(request, CfwMeta.listRuleAclTags,
            hcClient);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAclRuleRequest 请求对象
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
     * @param UpdateAclRuleRequest 请求对象
     * @return SyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>
     */
    public SyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRuleInvoker(UpdateAclRuleRequest request) {
        return new SyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>(request, CfwMeta.updateAclRule, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAclRuleOrderRequest 请求对象
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
     * @param UpdateAclRuleOrderRequest 请求对象
     * @return SyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>
     */
    public SyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrderInvoker(
        UpdateAclRuleOrderRequest request) {
        return new SyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>(request,
            CfwMeta.updateAclRuleOrder, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP，客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEipStatusRequest 请求对象
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
     * @param ChangeEipStatusRequest 请求对象
     * @return SyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>
     */
    public SyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatusInvoker(
        ChangeEipStatusRequest request) {
        return new SyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>(request, CfwMeta.changeEipStatus,
            hcClient);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipCountRequest 请求对象
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
     * @param ListEipCountRequest 请求对象
     * @return SyncInvoker<ListEipCountRequest, ListEipCountResponse>
     */
    public SyncInvoker<ListEipCountRequest, ListEipCountResponse> listEipCountInvoker(ListEipCountRequest request) {
        return new SyncInvoker<ListEipCountRequest, ListEipCountResponse>(request, CfwMeta.listEipCount, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipsRequest 请求对象
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
     * @param ListEipsRequest 请求对象
     * @return SyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public SyncInvoker<ListEipsRequest, ListEipsResponse> listEipsInvoker(ListEipsRequest request) {
        return new SyncInvoker<ListEipsRequest, ListEipsResponse>(request, CfwMeta.listEips, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsProtectModeRequest 请求对象
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
     * @param ChangeIpsProtectModeRequest 请求对象
     * @return SyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>
     */
    public SyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectModeInvoker(
        ChangeIpsProtectModeRequest request) {
        return new SyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>(request,
            CfwMeta.changeIpsProtectMode, hcClient);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsSwitchStatusRequest 请求对象
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
     * @param ChangeIpsSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>
     */
    public SyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusInvoker(
        ChangeIpsSwitchStatusRequest request) {
        return new SyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>(request,
            CfwMeta.changeIpsSwitchStatus, hcClient);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsProtectModeRequest 请求对象
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
     * @param ListIpsProtectModeRequest 请求对象
     * @return SyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>
     */
    public SyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectModeInvoker(
        ListIpsProtectModeRequest request) {
        return new SyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>(request,
            CfwMeta.listIpsProtectMode, hcClient);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsSwitchStatusRequest 请求对象
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
     * @param ListIpsSwitchStatusRequest 请求对象
     * @return SyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>
     */
    public SyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatusInvoker(
        ListIpsSwitchStatusRequest request) {
        return new SyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>(request,
            CfwMeta.listIpsSwitchStatus, hcClient);
    }

}

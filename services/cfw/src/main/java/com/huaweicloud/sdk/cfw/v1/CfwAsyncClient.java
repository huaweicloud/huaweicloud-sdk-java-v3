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
     * @param AddAddressItemRequest 请求对象
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
     * @param AddAddressItemRequest 请求对象
     * @return AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse>
     */
    public AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse> addAddressItemAsyncInvoker(
        AddAddressItemRequest request) {
        return new AsyncInvoker<AddAddressItemRequest, AddAddressItemResponse>(request, CfwMeta.addAddressItem,
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
     * @param AddAddressSetRequest 请求对象
     * @return AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse>
     */
    public AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse> addAddressSetAsyncInvoker(
        AddAddressSetRequest request) {
        return new AsyncInvoker<AddAddressSetRequest, AddAddressSetResponse>(request, CfwMeta.addAddressSet, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBlackWhiteListRequest 请求对象
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
     * @param AddBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>
     */
    public AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse> addBlackWhiteListAsyncInvoker(
        AddBlackWhiteListRequest request) {
        return new AsyncInvoker<AddBlackWhiteListRequest, AddBlackWhiteListResponse>(request, CfwMeta.addBlackWhiteList,
            hcClient);
    }

    /**
     * 添加域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDomainSetRequest 请求对象
     * @return CompletableFuture<AddDomainSetResponse>
     */
    public CompletableFuture<AddDomainSetResponse> addDomainSetAsync(AddDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addDomainSet);
    }

    /**
     * 添加域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDomainSetRequest 请求对象
     * @return AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse>
     */
    public AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse> addDomainSetAsyncInvoker(
        AddDomainSetRequest request) {
        return new AsyncInvoker<AddDomainSetRequest, AddDomainSetResponse>(request, CfwMeta.addDomainSet, hcClient);
    }

    /**
     * 添加域名列表
     *
     * 添加域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDomainsRequest 请求对象
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
     * @param AddDomainsRequest 请求对象
     * @return AsyncInvoker<AddDomainsRequest, AddDomainsResponse>
     */
    public AsyncInvoker<AddDomainsRequest, AddDomainsResponse> addDomainsAsyncInvoker(AddDomainsRequest request) {
        return new AsyncInvoker<AddDomainsRequest, AddDomainsResponse>(request, CfwMeta.addDomains, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceItemsRequest 请求对象
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
     * @param AddServiceItemsRequest 请求对象
     * @return AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>
     */
    public AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse> addServiceItemsAsyncInvoker(
        AddServiceItemsRequest request) {
        return new AsyncInvoker<AddServiceItemsRequest, AddServiceItemsResponse>(request, CfwMeta.addServiceItems,
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
     * @param AddServiceSetRequest 请求对象
     * @return AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse>
     */
    public AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse> addServiceSetAsyncInvoker(
        AddServiceSetRequest request) {
        return new AsyncInvoker<AddServiceSetRequest, AddServiceSetResponse>(request, CfwMeta.addServiceSet, hcClient);
    }

    /**
     * 批量删除地址组成员
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAddressItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteAddressItemsResponse>
     */
    public CompletableFuture<BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsync(
        BatchDeleteAddressItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteAddressItems);
    }

    /**
     * 批量删除地址组成员
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAddressItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>
     */
    public AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse> batchDeleteAddressItemsAsyncInvoker(
        BatchDeleteAddressItemsRequest request) {
        return new AsyncInvoker<BatchDeleteAddressItemsRequest, BatchDeleteAddressItemsResponse>(request,
            CfwMeta.batchDeleteAddressItems, hcClient);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServiceItemsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServiceItemsResponse>
     */
    public CompletableFuture<BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsync(
        BatchDeleteServiceItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchDeleteServiceItems);
    }

    /**
     * 批量删除服务组成员信息
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServiceItemsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>
     */
    public AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse> batchDeleteServiceItemsAsyncInvoker(
        BatchDeleteServiceItemsRequest request) {
        return new AsyncInvoker<BatchDeleteServiceItemsRequest, BatchDeleteServiceItemsResponse>(request,
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
     * @return CompletableFuture<ChangeEastWestFirewallStatusResponse>
     */
    public CompletableFuture<ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsync(
        ChangeEastWestFirewallStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEastWestFirewallStatus);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEastWestFirewallStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>
     */
    public AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse> changeEastWestFirewallStatusAsyncInvoker(
        ChangeEastWestFirewallStatusRequest request) {
        return new AsyncInvoker<ChangeEastWestFirewallStatusRequest, ChangeEastWestFirewallStatusResponse>(request,
            CfwMeta.changeEastWestFirewallStatus, hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressItemRequest 请求对象
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
     * @param DeleteAddressItemRequest 请求对象
     * @return AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>
     */
    public AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse> deleteAddressItemAsyncInvoker(
        DeleteAddressItemRequest request) {
        return new AsyncInvoker<DeleteAddressItemRequest, DeleteAddressItemResponse>(request, CfwMeta.deleteAddressItem,
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
     * @param DeleteAddressSetRequest 请求对象
     * @return AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>
     */
    public AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse> deleteAddressSetAsyncInvoker(
        DeleteAddressSetRequest request) {
        return new AsyncInvoker<DeleteAddressSetRequest, DeleteAddressSetResponse>(request, CfwMeta.deleteAddressSet,
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
     * @param DeleteBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>
     */
    public AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse> deleteBlackWhiteListAsyncInvoker(
        DeleteBlackWhiteListRequest request) {
        return new AsyncInvoker<DeleteBlackWhiteListRequest, DeleteBlackWhiteListResponse>(request,
            CfwMeta.deleteBlackWhiteList, hcClient);
    }

    /**
     * 删除域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainSetRequest 请求对象
     * @return CompletableFuture<DeleteDomainSetResponse>
     */
    public CompletableFuture<DeleteDomainSetResponse> deleteDomainSetAsync(DeleteDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteDomainSet);
    }

    /**
     * 删除域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainSetRequest 请求对象
     * @return AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>
     */
    public AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse> deleteDomainSetAsyncInvoker(
        DeleteDomainSetRequest request) {
        return new AsyncInvoker<DeleteDomainSetRequest, DeleteDomainSetResponse>(request, CfwMeta.deleteDomainSet,
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
     * @param DeleteDomainsRequest 请求对象
     * @return AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>
     */
    public AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse> deleteDomainsAsyncInvoker(
        DeleteDomainsRequest request) {
        return new AsyncInvoker<DeleteDomainsRequest, DeleteDomainsResponse>(request, CfwMeta.deleteDomains, hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemRequest 请求对象
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
     * @param DeleteServiceItemRequest 请求对象
     * @return AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>
     */
    public AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse> deleteServiceItemAsyncInvoker(
        DeleteServiceItemRequest request) {
        return new AsyncInvoker<DeleteServiceItemRequest, DeleteServiceItemResponse>(request, CfwMeta.deleteServiceItem,
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
     * @param DeleteServiceSetRequest 请求对象
     * @return AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>
     */
    public AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse> deleteServiceSetAsyncInvoker(
        DeleteServiceSetRequest request) {
        return new AsyncInvoker<DeleteServiceSetRequest, DeleteServiceSetResponse>(request, CfwMeta.deleteServiceSet,
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
     * @param ListAccessControlLogsRequest 请求对象
     * @return AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>
     */
    public AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse> listAccessControlLogsAsyncInvoker(
        ListAccessControlLogsRequest request) {
        return new AsyncInvoker<ListAccessControlLogsRequest, ListAccessControlLogsResponse>(request,
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
     * @param ListAddressItemsRequest 请求对象
     * @return AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>
     */
    public AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse> listAddressItemsAsyncInvoker(
        ListAddressItemsRequest request) {
        return new AsyncInvoker<ListAddressItemsRequest, ListAddressItemsResponse>(request, CfwMeta.listAddressItems,
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
     * @param ListAddressSetDetailRequest 请求对象
     * @return AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>
     */
    public AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse> listAddressSetDetailAsyncInvoker(
        ListAddressSetDetailRequest request) {
        return new AsyncInvoker<ListAddressSetDetailRequest, ListAddressSetDetailResponse>(request,
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
     * @param ListAddressSetsRequest 请求对象
     * @return AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>
     */
    public AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse> listAddressSetsAsyncInvoker(
        ListAddressSetsRequest request) {
        return new AsyncInvoker<ListAddressSetsRequest, ListAddressSetsResponse>(request, CfwMeta.listAddressSets,
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
     * @param ListAttackLogsRequest 请求对象
     * @return AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>
     */
    public AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse> listAttackLogsAsyncInvoker(
        ListAttackLogsRequest request) {
        return new AsyncInvoker<ListAttackLogsRequest, ListAttackLogsResponse>(request, CfwMeta.listAttackLogs,
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
     * @param ListBlackWhiteListsRequest 请求对象
     * @return AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>
     */
    public AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse> listBlackWhiteListsAsyncInvoker(
        ListBlackWhiteListsRequest request) {
        return new AsyncInvoker<ListBlackWhiteListsRequest, ListBlackWhiteListsResponse>(request,
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
     * @param ListDnsServersRequest 请求对象
     * @return AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse>
     */
    public AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse> listDnsServersAsyncInvoker(
        ListDnsServersRequest request) {
        return new AsyncInvoker<ListDnsServersRequest, ListDnsServersResponse>(request, CfwMeta.listDnsServers,
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
     * @param ListDomainParseDetailRequest 请求对象
     * @return AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>
     */
    public AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse> listDomainParseDetailAsyncInvoker(
        ListDomainParseDetailRequest request) {
        return new AsyncInvoker<ListDomainParseDetailRequest, ListDomainParseDetailResponse>(request,
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
     * @param ListDomainSetsRequest 请求对象
     * @return AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>
     */
    public AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse> listDomainSetsAsyncInvoker(
        ListDomainSetsRequest request) {
        return new AsyncInvoker<ListDomainSetsRequest, ListDomainSetsResponse>(request, CfwMeta.listDomainSets,
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
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CfwMeta.listDomains, hcClient);
    }

    /**
     * 获取东西向防火墙信息
     *
     * 获取东西向防火墙信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEastWestFirewallRequest 请求对象
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
     * @param ListEastWestFirewallRequest 请求对象
     * @return AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>
     */
    public AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse> listEastWestFirewallAsyncInvoker(
        ListEastWestFirewallRequest request) {
        return new AsyncInvoker<ListEastWestFirewallRequest, ListEastWestFirewallResponse>(request,
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
     * @param ListFirewallDetailRequest 请求对象
     * @return AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>
     */
    public AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse> listFirewallDetailAsyncInvoker(
        ListFirewallDetailRequest request) {
        return new AsyncInvoker<ListFirewallDetailRequest, ListFirewallDetailResponse>(request,
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
     * @param ListFirewallListRequest 请求对象
     * @return AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse>
     */
    public AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse> listFirewallListAsyncInvoker(
        ListFirewallListRequest request) {
        return new AsyncInvoker<ListFirewallListRequest, ListFirewallListResponse>(request, CfwMeta.listFirewallList,
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
     * @param ListFlowLogsRequest 请求对象
     * @return AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsAsyncInvoker(
        ListFlowLogsRequest request) {
        return new AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>(request, CfwMeta.listFlowLogs, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedVpcsRequest 请求对象
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
     * @param ListProtectedVpcsRequest 请求对象
     * @return AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>
     */
    public AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse> listProtectedVpcsAsyncInvoker(
        ListProtectedVpcsRequest request) {
        return new AsyncInvoker<ListProtectedVpcsRequest, ListProtectedVpcsResponse>(request, CfwMeta.listProtectedVpcs,
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
     * @param ListServiceItemsRequest 请求对象
     * @return AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>
     */
    public AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse> listServiceItemsAsyncInvoker(
        ListServiceItemsRequest request) {
        return new AsyncInvoker<ListServiceItemsRequest, ListServiceItemsResponse>(request, CfwMeta.listServiceItems,
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
     * @param ListServiceSetDetailRequest 请求对象
     * @return AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>
     */
    public AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse> listServiceSetDetailAsyncInvoker(
        ListServiceSetDetailRequest request) {
        return new AsyncInvoker<ListServiceSetDetailRequest, ListServiceSetDetailResponse>(request,
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
     * @param ListServiceSetsRequest 请求对象
     * @return AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>
     */
    public AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse> listServiceSetsAsyncInvoker(
        ListServiceSetsRequest request) {
        return new AsyncInvoker<ListServiceSetsRequest, ListServiceSetsResponse>(request, CfwMeta.listServiceSets,
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
     * @param UpdateAddressSetRequest 请求对象
     * @return AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>
     */
    public AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse> updateAddressSetAsyncInvoker(
        UpdateAddressSetRequest request) {
        return new AsyncInvoker<UpdateAddressSetRequest, UpdateAddressSetResponse>(request, CfwMeta.updateAddressSet,
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
     * @param UpdateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
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
     * @param UpdateDnsServersRequest 请求对象
     * @return AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>
     */
    public AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse> updateDnsServersAsyncInvoker(
        UpdateDnsServersRequest request) {
        return new AsyncInvoker<UpdateDnsServersRequest, UpdateDnsServersResponse>(request, CfwMeta.updateDnsServers,
            hcClient);
    }

    /**
     * 更新域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSetRequest 请求对象
     * @return CompletableFuture<UpdateDomainSetResponse>
     */
    public CompletableFuture<UpdateDomainSetResponse> updateDomainSetAsync(UpdateDomainSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateDomainSet);
    }

    /**
     * 更新域名组
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainSetRequest 请求对象
     * @return AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>
     */
    public AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse> updateDomainSetAsyncInvoker(
        UpdateDomainSetRequest request) {
        return new AsyncInvoker<UpdateDomainSetRequest, UpdateDomainSetResponse>(request, CfwMeta.updateDomainSet,
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
     * @param UpdateServiceSetRequest 请求对象
     * @return AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>
     */
    public AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse> updateServiceSetAsyncInvoker(
        UpdateServiceSetRequest request) {
        return new AsyncInvoker<UpdateServiceSetRequest, UpdateServiceSetResponse>(request, CfwMeta.updateServiceSet,
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
     * @param AddAclRuleRequest 请求对象
     * @return AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse>
     */
    public AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse> addAclRuleAsyncInvoker(AddAclRuleRequest request) {
        return new AsyncInvoker<AddAclRuleRequest, AddAclRuleResponse>(request, CfwMeta.addAclRule, hcClient);
    }

    /**
     * 批量删除Acl规则
     *
     * 批量删除Acl规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAclRulesRequest 请求对象
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
     * @param BatchDeleteAclRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse> batchDeleteAclRulesAsyncInvoker(
        BatchDeleteAclRulesRequest request) {
        return new AsyncInvoker<BatchDeleteAclRulesRequest, BatchDeleteAclRulesResponse>(request,
            CfwMeta.batchDeleteAclRules, hcClient);
    }

    /**
     * 批量更新规则动作
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateAclRuleActionsRequest 请求对象
     * @return CompletableFuture<BatchUpdateAclRuleActionsResponse>
     */
    public CompletableFuture<BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsync(
        BatchUpdateAclRuleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.batchUpdateAclRuleActions);
    }

    /**
     * 批量更新规则动作
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateAclRuleActionsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>
     */
    public AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse> batchUpdateAclRuleActionsAsyncInvoker(
        BatchUpdateAclRuleActionsRequest request) {
        return new AsyncInvoker<BatchUpdateAclRuleActionsRequest, BatchUpdateAclRuleActionsResponse>(request,
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
     * @param DeleteAclRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>
     */
    public AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse> deleteAclRuleAsyncInvoker(
        DeleteAclRuleRequest request) {
        return new AsyncInvoker<DeleteAclRuleRequest, DeleteAclRuleResponse>(request, CfwMeta.deleteAclRule, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleHitCountRequest 请求对象
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
     * @param DeleteAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>
     */
    public AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse> deleteAclRuleHitCountAsyncInvoker(
        DeleteAclRuleHitCountRequest request) {
        return new AsyncInvoker<DeleteAclRuleHitCountRequest, DeleteAclRuleHitCountResponse>(request,
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
     * @param ListAclRuleHitCountRequest 请求对象
     * @return AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>
     */
    public AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse> listAclRuleHitCountAsyncInvoker(
        ListAclRuleHitCountRequest request) {
        return new AsyncInvoker<ListAclRuleHitCountRequest, ListAclRuleHitCountResponse>(request,
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
     * @param ListAclRulesRequest 请求对象
     * @return AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse>
     */
    public AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse> listAclRulesAsyncInvoker(
        ListAclRulesRequest request) {
        return new AsyncInvoker<ListAclRulesRequest, ListAclRulesResponse>(request, CfwMeta.listAclRules, hcClient);
    }

    /**
     * 查询规则标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclTagsRequest 请求对象
     * @return CompletableFuture<ListRuleAclTagsResponse>
     */
    public CompletableFuture<ListRuleAclTagsResponse> listRuleAclTagsAsync(ListRuleAclTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleAclTags);
    }

    /**
     * 查询规则标签
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclTagsRequest 请求对象
     * @return AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>
     */
    public AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse> listRuleAclTagsAsyncInvoker(
        ListRuleAclTagsRequest request) {
        return new AsyncInvoker<ListRuleAclTagsRequest, ListRuleAclTagsResponse>(request, CfwMeta.listRuleAclTags,
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
     * @param UpdateAclRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>
     */
    public AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse> updateAclRuleAsyncInvoker(
        UpdateAclRuleRequest request) {
        return new AsyncInvoker<UpdateAclRuleRequest, UpdateAclRuleResponse>(request, CfwMeta.updateAclRule, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAclRuleOrderRequest 请求对象
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
     * @param UpdateAclRuleOrderRequest 请求对象
     * @return AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>
     */
    public AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse> updateAclRuleOrderAsyncInvoker(
        UpdateAclRuleOrderRequest request) {
        return new AsyncInvoker<UpdateAclRuleOrderRequest, UpdateAclRuleOrderResponse>(request,
            CfwMeta.updateAclRuleOrder, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP,客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEipStatusRequest 请求对象
     * @return CompletableFuture<ChangeEipStatusResponse>
     */
    public CompletableFuture<ChangeEipStatusResponse> changeEipStatusAsync(ChangeEipStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEipStatus);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP,客户购买EIP后首次开启EIP防护前需使用ListEips同步EIP资产，sync字段设置为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEipStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>
     */
    public AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse> changeEipStatusAsyncInvoker(
        ChangeEipStatusRequest request) {
        return new AsyncInvoker<ChangeEipStatusRequest, ChangeEipStatusResponse>(request, CfwMeta.changeEipStatus,
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
     * @param ListEipCountRequest 请求对象
     * @return AsyncInvoker<ListEipCountRequest, ListEipCountResponse>
     */
    public AsyncInvoker<ListEipCountRequest, ListEipCountResponse> listEipCountAsyncInvoker(
        ListEipCountRequest request) {
        return new AsyncInvoker<ListEipCountRequest, ListEipCountResponse>(request, CfwMeta.listEipCount, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipsRequest 请求对象
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
     * @param ListEipsRequest 请求对象
     * @return AsyncInvoker<ListEipsRequest, ListEipsResponse>
     */
    public AsyncInvoker<ListEipsRequest, ListEipsResponse> listEipsAsyncInvoker(ListEipsRequest request) {
        return new AsyncInvoker<ListEipsRequest, ListEipsResponse>(request, CfwMeta.listEips, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsProtectModeRequest 请求对象
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
     * @param ChangeIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>
     */
    public AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse> changeIpsProtectModeAsyncInvoker(
        ChangeIpsProtectModeRequest request) {
        return new AsyncInvoker<ChangeIpsProtectModeRequest, ChangeIpsProtectModeResponse>(request,
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
     * @param ChangeIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse> changeIpsSwitchStatusAsyncInvoker(
        ChangeIpsSwitchStatusRequest request) {
        return new AsyncInvoker<ChangeIpsSwitchStatusRequest, ChangeIpsSwitchStatusResponse>(request,
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
     * @param ListIpsProtectModeRequest 请求对象
     * @return AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>
     */
    public AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse> listIpsProtectModeAsyncInvoker(
        ListIpsProtectModeRequest request) {
        return new AsyncInvoker<ListIpsProtectModeRequest, ListIpsProtectModeResponse>(request,
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
     * @param ListIpsSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>
     */
    public AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse> listIpsSwitchStatusAsyncInvoker(
        ListIpsSwitchStatusRequest request) {
        return new AsyncInvoker<ListIpsSwitchStatusRequest, ListIpsSwitchStatusResponse>(request,
            CfwMeta.listIpsSwitchStatus, hcClient);
    }

}

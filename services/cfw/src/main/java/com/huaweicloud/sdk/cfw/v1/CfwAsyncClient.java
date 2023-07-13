package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.*;
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
        return new ClientBuilder<>(CfwAsyncClient::new);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressItemsUsingPostRequest 请求对象
     * @return CompletableFuture<AddAddressItemsUsingPostResponse>
     */
    public CompletableFuture<AddAddressItemsUsingPostResponse> addAddressItemsUsingPostAsync(
        AddAddressItemsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressItemsUsingPost);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressItemsUsingPostRequest 请求对象
     * @return AsyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse>
     */
    public AsyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse> addAddressItemsUsingPostAsyncInvoker(
        AddAddressItemsUsingPostRequest request) {
        return new AsyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse>(request,
            CfwMeta.addAddressItemsUsingPost, hcClient);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressSetInfoUsingPostRequest 请求对象
     * @return CompletableFuture<AddAddressSetInfoUsingPostResponse>
     */
    public CompletableFuture<AddAddressSetInfoUsingPostResponse> addAddressSetInfoUsingPostAsync(
        AddAddressSetInfoUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addAddressSetInfoUsingPost);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressSetInfoUsingPostRequest 请求对象
     * @return AsyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse>
     */
    public AsyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse> addAddressSetInfoUsingPostAsyncInvoker(
        AddAddressSetInfoUsingPostRequest request) {
        return new AsyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse>(request,
            CfwMeta.addAddressSetInfoUsingPost, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBlackWhiteListUsingPostRequest 请求对象
     * @return CompletableFuture<AddBlackWhiteListUsingPostResponse>
     */
    public CompletableFuture<AddBlackWhiteListUsingPostResponse> addBlackWhiteListUsingPostAsync(
        AddBlackWhiteListUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addBlackWhiteListUsingPost);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBlackWhiteListUsingPostRequest 请求对象
     * @return AsyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse>
     */
    public AsyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse> addBlackWhiteListUsingPostAsyncInvoker(
        AddBlackWhiteListUsingPostRequest request) {
        return new AsyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse>(request,
            CfwMeta.addBlackWhiteListUsingPost, hcClient);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceItemsUsingPostRequest 请求对象
     * @return CompletableFuture<AddServiceItemsUsingPostResponse>
     */
    public CompletableFuture<AddServiceItemsUsingPostResponse> addServiceItemsUsingPostAsync(
        AddServiceItemsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceItemsUsingPost);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceItemsUsingPostRequest 请求对象
     * @return AsyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse>
     */
    public AsyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse> addServiceItemsUsingPostAsyncInvoker(
        AddServiceItemsUsingPostRequest request) {
        return new AsyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse>(request,
            CfwMeta.addServiceItemsUsingPost, hcClient);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceSetUsingPostRequest 请求对象
     * @return CompletableFuture<AddServiceSetUsingPostResponse>
     */
    public CompletableFuture<AddServiceSetUsingPostResponse> addServiceSetUsingPostAsync(
        AddServiceSetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addServiceSetUsingPost);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceSetUsingPostRequest 请求对象
     * @return AsyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse>
     */
    public AsyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse> addServiceSetUsingPostAsyncInvoker(
        AddServiceSetUsingPostRequest request) {
        return new AsyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse>(request,
            CfwMeta.addServiceSetUsingPost, hcClient);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEwProtectStatusRequest 请求对象
     * @return CompletableFuture<ChangeEwProtectStatusResponse>
     */
    public CompletableFuture<ChangeEwProtectStatusResponse> changeEwProtectStatusAsync(
        ChangeEwProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeEwProtectStatus);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEwProtectStatusRequest 请求对象
     * @return AsyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse>
     */
    public AsyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse> changeEwProtectStatusAsyncInvoker(
        ChangeEwProtectStatusRequest request) {
        return new AsyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse>(request,
            CfwMeta.changeEwProtectStatus, hcClient);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsProtectModeUsingPostRequest 请求对象
     * @return CompletableFuture<ChangeIpsProtectModeUsingPostResponse>
     */
    public CompletableFuture<ChangeIpsProtectModeUsingPostResponse> changeIpsProtectModeUsingPostAsync(
        ChangeIpsProtectModeUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsProtectModeUsingPost);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsProtectModeUsingPostRequest 请求对象
     * @return AsyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse>
     */
    public AsyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse> changeIpsProtectModeUsingPostAsyncInvoker(
        ChangeIpsProtectModeUsingPostRequest request) {
        return new AsyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse>(request,
            CfwMeta.changeIpsProtectModeUsingPost, hcClient);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleCountRequest 请求对象
     * @return CompletableFuture<DeleteAclRuleCountResponse>
     */
    public CompletableFuture<DeleteAclRuleCountResponse> deleteAclRuleCountAsync(DeleteAclRuleCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAclRuleCount);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleCountRequest 请求对象
     * @return AsyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse>
     */
    public AsyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse> deleteAclRuleCountAsyncInvoker(
        DeleteAclRuleCountRequest request) {
        return new AsyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse>(request,
            CfwMeta.deleteAclRuleCount, hcClient);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressItemUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteAddressItemUsingDeleteResponse>
     */
    public CompletableFuture<DeleteAddressItemUsingDeleteResponse> deleteAddressItemUsingDeleteAsync(
        DeleteAddressItemUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressItemUsingDelete);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressItemUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse> deleteAddressItemUsingDeleteAsyncInvoker(
        DeleteAddressItemUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse>(request,
            CfwMeta.deleteAddressItemUsingDelete, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressSetInfoUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteAddressSetInfoUsingDeleteResponse>
     */
    public CompletableFuture<DeleteAddressSetInfoUsingDeleteResponse> deleteAddressSetInfoUsingDeleteAsync(
        DeleteAddressSetInfoUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteAddressSetInfoUsingDelete);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressSetInfoUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse> deleteAddressSetInfoUsingDeleteAsyncInvoker(
        DeleteAddressSetInfoUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse>(
            request, CfwMeta.deleteAddressSetInfoUsingDelete, hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlackWhiteListUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteBlackWhiteListUsingDeleteResponse>
     */
    public CompletableFuture<DeleteBlackWhiteListUsingDeleteResponse> deleteBlackWhiteListUsingDeleteAsync(
        DeleteBlackWhiteListUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteBlackWhiteListUsingDelete);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlackWhiteListUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse> deleteBlackWhiteListUsingDeleteAsyncInvoker(
        DeleteBlackWhiteListUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse>(
            request, CfwMeta.deleteBlackWhiteListUsingDelete, hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteServiceItemUsingDeleteResponse>
     */
    public CompletableFuture<DeleteServiceItemUsingDeleteResponse> deleteServiceItemUsingDeleteAsync(
        DeleteServiceItemUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceItemUsingDelete);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse> deleteServiceItemUsingDeleteAsyncInvoker(
        DeleteServiceItemUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse>(request,
            CfwMeta.deleteServiceItemUsingDelete, hcClient);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceSetUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteServiceSetUsingDeleteResponse>
     */
    public CompletableFuture<DeleteServiceSetUsingDeleteResponse> deleteServiceSetUsingDeleteAsync(
        DeleteServiceSetUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteServiceSetUsingDelete);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceSetUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse> deleteServiceSetUsingDeleteAsyncInvoker(
        DeleteServiceSetUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse>(request,
            CfwMeta.deleteServiceSetUsingDelete, hcClient);
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
     * @param ListAddressItemsUsingGetRequest 请求对象
     * @return CompletableFuture<ListAddressItemsUsingGetResponse>
     */
    public CompletableFuture<ListAddressItemsUsingGetResponse> listAddressItemsUsingGetAsync(
        ListAddressItemsUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressItemsUsingGet);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressItemsUsingGetRequest 请求对象
     * @return AsyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse>
     */
    public AsyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse> listAddressItemsUsingGetAsyncInvoker(
        ListAddressItemsUsingGetRequest request) {
        return new AsyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse>(request,
            CfwMeta.listAddressItemsUsingGet, hcClient);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetDetailUsingGetRequest 请求对象
     * @return CompletableFuture<ListAddressSetDetailUsingGetResponse>
     */
    public CompletableFuture<ListAddressSetDetailUsingGetResponse> listAddressSetDetailUsingGetAsync(
        ListAddressSetDetailUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSetDetailUsingGet);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetDetailUsingGetRequest 请求对象
     * @return AsyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse>
     */
    public AsyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse> listAddressSetDetailUsingGetAsyncInvoker(
        ListAddressSetDetailUsingGetRequest request) {
        return new AsyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse>(request,
            CfwMeta.listAddressSetDetailUsingGet, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetListUsingGetRequest 请求对象
     * @return CompletableFuture<ListAddressSetListUsingGetResponse>
     */
    public CompletableFuture<ListAddressSetListUsingGetResponse> listAddressSetListUsingGetAsync(
        ListAddressSetListUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listAddressSetListUsingGet);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetListUsingGetRequest 请求对象
     * @return AsyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse>
     */
    public AsyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse> listAddressSetListUsingGetAsyncInvoker(
        ListAddressSetListUsingGetRequest request) {
        return new AsyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse>(request,
            CfwMeta.listAddressSetListUsingGet, hcClient);
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
     * @param ListBlackWhiteListsUsingGetRequest 请求对象
     * @return CompletableFuture<ListBlackWhiteListsUsingGetResponse>
     */
    public CompletableFuture<ListBlackWhiteListsUsingGetResponse> listBlackWhiteListsUsingGetAsync(
        ListBlackWhiteListsUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listBlackWhiteListsUsingGet);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlackWhiteListsUsingGetRequest 请求对象
     * @return AsyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse>
     */
    public AsyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse> listBlackWhiteListsUsingGetAsyncInvoker(
        ListBlackWhiteListsUsingGetRequest request) {
        return new AsyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse>(request,
            CfwMeta.listBlackWhiteListsUsingGet, hcClient);
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
     * 获取东西向防火墙信息
     *
     * 查询东西向防火墙信息
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
     * 查询东西向防火墙信息
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
     * 查询防火墙实例
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallUsingGetRequest 请求对象
     * @return CompletableFuture<ListFirewallUsingGetResponse>
     */
    public CompletableFuture<ListFirewallUsingGetResponse> listFirewallUsingGetAsync(
        ListFirewallUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listFirewallUsingGet);
    }

    /**
     * 查询防火墙实例
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallUsingGetRequest 请求对象
     * @return AsyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse>
     */
    public AsyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse> listFirewallUsingGetAsyncInvoker(
        ListFirewallUsingGetRequest request) {
        return new AsyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse>(request,
            CfwMeta.listFirewallUsingGet, hcClient);
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
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsProtectModeUsingPostRequest 请求对象
     * @return CompletableFuture<ListIpsProtectModeUsingPostResponse>
     */
    public CompletableFuture<ListIpsProtectModeUsingPostResponse> listIpsProtectModeUsingPostAsync(
        ListIpsProtectModeUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsProtectModeUsingPost);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsProtectModeUsingPostRequest 请求对象
     * @return AsyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse>
     */
    public AsyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse> listIpsProtectModeUsingPostAsyncInvoker(
        ListIpsProtectModeUsingPostRequest request) {
        return new AsyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse>(request,
            CfwMeta.listIpsProtectModeUsingPost, hcClient);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListParseDomainDetailsRequest 请求对象
     * @return CompletableFuture<ListParseDomainDetailsResponse>
     */
    public CompletableFuture<ListParseDomainDetailsResponse> listParseDomainDetailsAsync(
        ListParseDomainDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listParseDomainDetails);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListParseDomainDetailsRequest 请求对象
     * @return AsyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse>
     */
    public AsyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse> listParseDomainDetailsAsyncInvoker(
        ListParseDomainDetailsRequest request) {
        return new AsyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse>(request,
            CfwMeta.listParseDomainDetails, hcClient);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleHitCountRequest 请求对象
     * @return CompletableFuture<ListRuleHitCountResponse>
     */
    public CompletableFuture<ListRuleHitCountResponse> listRuleHitCountAsync(ListRuleHitCountRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleHitCount);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleHitCountRequest 请求对象
     * @return AsyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse>
     */
    public AsyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse> listRuleHitCountAsyncInvoker(
        ListRuleHitCountRequest request) {
        return new AsyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse>(request, CfwMeta.listRuleHitCount,
            hcClient);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceItemsDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceItemsDetailsResponse>
     */
    public CompletableFuture<ListServiceItemsDetailsResponse> listServiceItemsDetailsAsync(
        ListServiceItemsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceItemsDetails);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceItemsDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse>
     */
    public AsyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse> listServiceItemsDetailsAsyncInvoker(
        ListServiceItemsDetailsRequest request) {
        return new AsyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse>(request,
            CfwMeta.listServiceItemsDetails, hcClient);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetRequest 请求对象
     * @return CompletableFuture<ListServiceSetResponse>
     */
    public CompletableFuture<ListServiceSetResponse> listServiceSetAsync(ListServiceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSet);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetRequest 请求对象
     * @return AsyncInvoker<ListServiceSetRequest, ListServiceSetResponse>
     */
    public AsyncInvoker<ListServiceSetRequest, ListServiceSetResponse> listServiceSetAsyncInvoker(
        ListServiceSetRequest request) {
        return new AsyncInvoker<ListServiceSetRequest, ListServiceSetResponse>(request, CfwMeta.listServiceSet,
            hcClient);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetDetailsRequest 请求对象
     * @return CompletableFuture<ListServiceSetDetailsResponse>
     */
    public CompletableFuture<ListServiceSetDetailsResponse> listServiceSetDetailsAsync(
        ListServiceSetDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listServiceSetDetails);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetDetailsRequest 请求对象
     * @return AsyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse>
     */
    public AsyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse> listServiceSetDetailsAsyncInvoker(
        ListServiceSetDetailsRequest request) {
        return new AsyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse>(request,
            CfwMeta.listServiceSetDetails, hcClient);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressSetInfoUsingPutRequest 请求对象
     * @return CompletableFuture<UpdateAddressSetInfoUsingPutResponse>
     */
    public CompletableFuture<UpdateAddressSetInfoUsingPutResponse> updateAddressSetInfoUsingPutAsync(
        UpdateAddressSetInfoUsingPutRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateAddressSetInfoUsingPut);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressSetInfoUsingPutRequest 请求对象
     * @return AsyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse>
     */
    public AsyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse> updateAddressSetInfoUsingPutAsyncInvoker(
        UpdateAddressSetInfoUsingPutRequest request) {
        return new AsyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse>(request,
            CfwMeta.updateAddressSetInfoUsingPut, hcClient);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListUsingPutRequest 请求对象
     * @return CompletableFuture<UpdateBlackWhiteListUsingPutResponse>
     */
    public CompletableFuture<UpdateBlackWhiteListUsingPutResponse> updateBlackWhiteListUsingPutAsync(
        UpdateBlackWhiteListUsingPutRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateBlackWhiteListUsingPut);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListUsingPutRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse> updateBlackWhiteListUsingPutAsyncInvoker(
        UpdateBlackWhiteListUsingPutRequest request) {
        return new AsyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse>(request,
            CfwMeta.updateBlackWhiteListUsingPut, hcClient);
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
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceSetUsingPutRequest 请求对象
     * @return CompletableFuture<UpdateServiceSetUsingPutResponse>
     */
    public CompletableFuture<UpdateServiceSetUsingPutResponse> updateServiceSetUsingPutAsync(
        UpdateServiceSetUsingPutRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateServiceSetUsingPut);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceSetUsingPutRequest 请求对象
     * @return AsyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse>
     */
    public AsyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse> updateServiceSetUsingPutAsyncInvoker(
        UpdateServiceSetUsingPutRequest request) {
        return new AsyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse>(request,
            CfwMeta.updateServiceSetUsingPut, hcClient);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleAclUsingPostRequest 请求对象
     * @return CompletableFuture<AddRuleAclUsingPostResponse>
     */
    public CompletableFuture<AddRuleAclUsingPostResponse> addRuleAclUsingPostAsync(AddRuleAclUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.addRuleAclUsingPost);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleAclUsingPostRequest 请求对象
     * @return AsyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse>
     */
    public AsyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse> addRuleAclUsingPostAsyncInvoker(
        AddRuleAclUsingPostRequest request) {
        return new AsyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse>(request,
            CfwMeta.addRuleAclUsingPost, hcClient);
    }

    /**
     * 删除ACL规则组
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleAclUsingDeleteRequest 请求对象
     * @return CompletableFuture<DeleteRuleAclUsingDeleteResponse>
     */
    public CompletableFuture<DeleteRuleAclUsingDeleteResponse> deleteRuleAclUsingDeleteAsync(
        DeleteRuleAclUsingDeleteRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.deleteRuleAclUsingDelete);
    }

    /**
     * 删除ACL规则组
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleAclUsingDeleteRequest 请求对象
     * @return AsyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse>
     */
    public AsyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse> deleteRuleAclUsingDeleteAsyncInvoker(
        DeleteRuleAclUsingDeleteRequest request) {
        return new AsyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse>(request,
            CfwMeta.deleteRuleAclUsingDelete, hcClient);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclUsingPutRequest 请求对象
     * @return CompletableFuture<ListRuleAclUsingPutResponse>
     */
    public CompletableFuture<ListRuleAclUsingPutResponse> listRuleAclUsingPutAsync(ListRuleAclUsingPutRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleAclUsingPut);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclUsingPutRequest 请求对象
     * @return AsyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse>
     */
    public AsyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse> listRuleAclUsingPutAsyncInvoker(
        ListRuleAclUsingPutRequest request) {
        return new AsyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse>(request,
            CfwMeta.listRuleAclUsingPut, hcClient);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclsUsingGetRequest 请求对象
     * @return CompletableFuture<ListRuleAclsUsingGetResponse>
     */
    public CompletableFuture<ListRuleAclsUsingGetResponse> listRuleAclsUsingGetAsync(
        ListRuleAclsUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listRuleAclsUsingGet);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclsUsingGetRequest 请求对象
     * @return AsyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse>
     */
    public AsyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse> listRuleAclsUsingGetAsyncInvoker(
        ListRuleAclsUsingGetRequest request) {
        return new AsyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse>(request,
            CfwMeta.listRuleAclsUsingGet, hcClient);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleAclUsingPutRequest 请求对象
     * @return CompletableFuture<UpdateRuleAclUsingPutResponse>
     */
    public CompletableFuture<UpdateRuleAclUsingPutResponse> updateRuleAclUsingPutAsync(
        UpdateRuleAclUsingPutRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.updateRuleAclUsingPut);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleAclUsingPutRequest 请求对象
     * @return AsyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse>
     */
    public AsyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse> updateRuleAclUsingPutAsyncInvoker(
        UpdateRuleAclUsingPutRequest request) {
        return new AsyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse>(request,
            CfwMeta.updateRuleAclUsingPut, hcClient);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeProtectEipRequest 请求对象
     * @return CompletableFuture<ChangeProtectEipResponse>
     */
    public CompletableFuture<ChangeProtectEipResponse> changeProtectEipAsync(ChangeProtectEipRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeProtectEip);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeProtectEipRequest 请求对象
     * @return AsyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse>
     */
    public AsyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse> changeProtectEipAsyncInvoker(
        ChangeProtectEipRequest request) {
        return new AsyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse>(request, CfwMeta.changeProtectEip,
            hcClient);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipsRequest 请求对象
     * @return CompletableFuture<CountEipsResponse>
     */
    public CompletableFuture<CountEipsResponse> countEipsAsync(CountEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.countEips);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipsRequest 请求对象
     * @return AsyncInvoker<CountEipsRequest, CountEipsResponse>
     */
    public AsyncInvoker<CountEipsRequest, CountEipsResponse> countEipsAsyncInvoker(CountEipsRequest request) {
        return new AsyncInvoker<CountEipsRequest, CountEipsResponse>(request, CfwMeta.countEips, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipResourcesRequest 请求对象
     * @return CompletableFuture<ListEipResourcesResponse>
     */
    public CompletableFuture<ListEipResourcesResponse> listEipResourcesAsync(ListEipResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listEipResources);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipResourcesRequest 请求对象
     * @return AsyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse>
     */
    public AsyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse> listEipResourcesAsyncInvoker(
        ListEipResourcesRequest request) {
        return new AsyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse>(request, CfwMeta.listEipResources,
            hcClient);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsSwitchUsingPostRequest 请求对象
     * @return CompletableFuture<ChangeIpsSwitchUsingPostResponse>
     */
    public CompletableFuture<ChangeIpsSwitchUsingPostResponse> changeIpsSwitchUsingPostAsync(
        ChangeIpsSwitchUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.changeIpsSwitchUsingPost);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsSwitchUsingPostRequest 请求对象
     * @return AsyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse>
     */
    public AsyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse> changeIpsSwitchUsingPostAsyncInvoker(
        ChangeIpsSwitchUsingPostRequest request) {
        return new AsyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse>(request,
            CfwMeta.changeIpsSwitchUsingPost, hcClient);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsSwitchStatusUsingGetRequest 请求对象
     * @return CompletableFuture<ListIpsSwitchStatusUsingGetResponse>
     */
    public CompletableFuture<ListIpsSwitchStatusUsingGetResponse> listIpsSwitchStatusUsingGetAsync(
        ListIpsSwitchStatusUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listIpsSwitchStatusUsingGet);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsSwitchStatusUsingGetRequest 请求对象
     * @return AsyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse>
     */
    public AsyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse> listIpsSwitchStatusUsingGetAsyncInvoker(
        ListIpsSwitchStatusUsingGetRequest request) {
        return new AsyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse>(request,
            CfwMeta.listIpsSwitchStatusUsingGet, hcClient);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcProtectsRequest 请求对象
     * @return CompletableFuture<ListVpcProtectsResponse>
     */
    public CompletableFuture<ListVpcProtectsResponse> listVpcProtectsAsync(ListVpcProtectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CfwMeta.listVpcProtects);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcProtectsRequest 请求对象
     * @return AsyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse>
     */
    public AsyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse> listVpcProtectsAsyncInvoker(
        ListVpcProtectsRequest request) {
        return new AsyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse>(request, CfwMeta.listVpcProtects,
            hcClient);
    }

}

package com.huaweicloud.sdk.cfw.v1;

import com.huaweicloud.sdk.cfw.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CfwClient {

    protected HcClient hcClient;

    public CfwClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CfwClient> newBuilder() {
        return new ClientBuilder<>(CfwClient::new);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressItemsUsingPostRequest 请求对象
     * @return AddAddressItemsUsingPostResponse
     */
    public AddAddressItemsUsingPostResponse addAddressItemsUsingPost(AddAddressItemsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addAddressItemsUsingPost);
    }

    /**
     * 添加地址组成员
     *
     * 添加地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressItemsUsingPostRequest 请求对象
     * @return SyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse>
     */
    public SyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse> addAddressItemsUsingPostInvoker(
        AddAddressItemsUsingPostRequest request) {
        return new SyncInvoker<AddAddressItemsUsingPostRequest, AddAddressItemsUsingPostResponse>(request,
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
     * @return AddAddressSetInfoUsingPostResponse
     */
    public AddAddressSetInfoUsingPostResponse addAddressSetInfoUsingPost(AddAddressSetInfoUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addAddressSetInfoUsingPost);
    }

    /**
     * 添加地址组
     *
     * 添加地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddAddressSetInfoUsingPostRequest 请求对象
     * @return SyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse>
     */
    public SyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse> addAddressSetInfoUsingPostInvoker(
        AddAddressSetInfoUsingPostRequest request) {
        return new SyncInvoker<AddAddressSetInfoUsingPostRequest, AddAddressSetInfoUsingPostResponse>(request,
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
     * @return AddBlackWhiteListUsingPostResponse
     */
    public AddBlackWhiteListUsingPostResponse addBlackWhiteListUsingPost(AddBlackWhiteListUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addBlackWhiteListUsingPost);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddBlackWhiteListUsingPostRequest 请求对象
     * @return SyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse>
     */
    public SyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse> addBlackWhiteListUsingPostInvoker(
        AddBlackWhiteListUsingPostRequest request) {
        return new SyncInvoker<AddBlackWhiteListUsingPostRequest, AddBlackWhiteListUsingPostResponse>(request,
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
     * @return AddServiceItemsUsingPostResponse
     */
    public AddServiceItemsUsingPostResponse addServiceItemsUsingPost(AddServiceItemsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addServiceItemsUsingPost);
    }

    /**
     * 新建服务成员
     *
     * 批量添加服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceItemsUsingPostRequest 请求对象
     * @return SyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse>
     */
    public SyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse> addServiceItemsUsingPostInvoker(
        AddServiceItemsUsingPostRequest request) {
        return new SyncInvoker<AddServiceItemsUsingPostRequest, AddServiceItemsUsingPostResponse>(request,
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
     * @return AddServiceSetUsingPostResponse
     */
    public AddServiceSetUsingPostResponse addServiceSetUsingPost(AddServiceSetUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addServiceSetUsingPost);
    }

    /**
     * 新建服务组
     *
     * 创建服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServiceSetUsingPostRequest 请求对象
     * @return SyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse>
     */
    public SyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse> addServiceSetUsingPostInvoker(
        AddServiceSetUsingPostRequest request) {
        return new SyncInvoker<AddServiceSetUsingPostRequest, AddServiceSetUsingPostResponse>(request,
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
     * @return ChangeEwProtectStatusResponse
     */
    public ChangeEwProtectStatusResponse changeEwProtectStatus(ChangeEwProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeEwProtectStatus);
    }

    /**
     * 修改东西向防火墙防护状态
     *
     * 东西向防护资源防护开启/关闭
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEwProtectStatusRequest 请求对象
     * @return SyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse>
     */
    public SyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse> changeEwProtectStatusInvoker(
        ChangeEwProtectStatusRequest request) {
        return new SyncInvoker<ChangeEwProtectStatusRequest, ChangeEwProtectStatusResponse>(request,
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
     * @return ChangeIpsProtectModeUsingPostResponse
     */
    public ChangeIpsProtectModeUsingPostResponse changeIpsProtectModeUsingPost(
        ChangeIpsProtectModeUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeIpsProtectModeUsingPost);
    }

    /**
     * 切换防护模式
     *
     * 切换防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsProtectModeUsingPostRequest 请求对象
     * @return SyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse>
     */
    public SyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse> changeIpsProtectModeUsingPostInvoker(
        ChangeIpsProtectModeUsingPostRequest request) {
        return new SyncInvoker<ChangeIpsProtectModeUsingPostRequest, ChangeIpsProtectModeUsingPostResponse>(request,
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
     * @return DeleteAclRuleCountResponse
     */
    public DeleteAclRuleCountResponse deleteAclRuleCount(DeleteAclRuleCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAclRuleCount);
    }

    /**
     * 删除规则击中次数
     *
     * 清除规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAclRuleCountRequest 请求对象
     * @return SyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse>
     */
    public SyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse> deleteAclRuleCountInvoker(
        DeleteAclRuleCountRequest request) {
        return new SyncInvoker<DeleteAclRuleCountRequest, DeleteAclRuleCountResponse>(request,
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
     * @return DeleteAddressItemUsingDeleteResponse
     */
    public DeleteAddressItemUsingDeleteResponse deleteAddressItemUsingDelete(
        DeleteAddressItemUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAddressItemUsingDelete);
    }

    /**
     * 删除地址组成员
     *
     * 删除地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressItemUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse>
     */
    public SyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse> deleteAddressItemUsingDeleteInvoker(
        DeleteAddressItemUsingDeleteRequest request) {
        return new SyncInvoker<DeleteAddressItemUsingDeleteRequest, DeleteAddressItemUsingDeleteResponse>(request,
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
     * @return DeleteAddressSetInfoUsingDeleteResponse
     */
    public DeleteAddressSetInfoUsingDeleteResponse deleteAddressSetInfoUsingDelete(
        DeleteAddressSetInfoUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteAddressSetInfoUsingDelete);
    }

    /**
     * 删除地址组
     *
     * 删除地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAddressSetInfoUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse>
     */
    public SyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse> deleteAddressSetInfoUsingDeleteInvoker(
        DeleteAddressSetInfoUsingDeleteRequest request) {
        return new SyncInvoker<DeleteAddressSetInfoUsingDeleteRequest, DeleteAddressSetInfoUsingDeleteResponse>(request,
            CfwMeta.deleteAddressSetInfoUsingDelete, hcClient);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlackWhiteListUsingDeleteRequest 请求对象
     * @return DeleteBlackWhiteListUsingDeleteResponse
     */
    public DeleteBlackWhiteListUsingDeleteResponse deleteBlackWhiteListUsingDelete(
        DeleteBlackWhiteListUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteBlackWhiteListUsingDelete);
    }

    /**
     * 删除黑白名单规则
     *
     * 删除黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBlackWhiteListUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse>
     */
    public SyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse> deleteBlackWhiteListUsingDeleteInvoker(
        DeleteBlackWhiteListUsingDeleteRequest request) {
        return new SyncInvoker<DeleteBlackWhiteListUsingDeleteRequest, DeleteBlackWhiteListUsingDeleteResponse>(request,
            CfwMeta.deleteBlackWhiteListUsingDelete, hcClient);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemUsingDeleteRequest 请求对象
     * @return DeleteServiceItemUsingDeleteResponse
     */
    public DeleteServiceItemUsingDeleteResponse deleteServiceItemUsingDelete(
        DeleteServiceItemUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteServiceItemUsingDelete);
    }

    /**
     * 删除服务成员
     *
     * 删除服务组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceItemUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse>
     */
    public SyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse> deleteServiceItemUsingDeleteInvoker(
        DeleteServiceItemUsingDeleteRequest request) {
        return new SyncInvoker<DeleteServiceItemUsingDeleteRequest, DeleteServiceItemUsingDeleteResponse>(request,
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
     * @return DeleteServiceSetUsingDeleteResponse
     */
    public DeleteServiceSetUsingDeleteResponse deleteServiceSetUsingDelete(DeleteServiceSetUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteServiceSetUsingDelete);
    }

    /**
     * 删除服务组
     *
     * 删除服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServiceSetUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse>
     */
    public SyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse> deleteServiceSetUsingDeleteInvoker(
        DeleteServiceSetUsingDeleteRequest request) {
        return new SyncInvoker<DeleteServiceSetUsingDeleteRequest, DeleteServiceSetUsingDeleteResponse>(request,
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
     * @param ListAddressItemsUsingGetRequest 请求对象
     * @return ListAddressItemsUsingGetResponse
     */
    public ListAddressItemsUsingGetResponse listAddressItemsUsingGet(ListAddressItemsUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressItemsUsingGet);
    }

    /**
     * 查询地址组成员
     *
     * 查询地址组成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressItemsUsingGetRequest 请求对象
     * @return SyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse>
     */
    public SyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse> listAddressItemsUsingGetInvoker(
        ListAddressItemsUsingGetRequest request) {
        return new SyncInvoker<ListAddressItemsUsingGetRequest, ListAddressItemsUsingGetResponse>(request,
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
     * @return ListAddressSetDetailUsingGetResponse
     */
    public ListAddressSetDetailUsingGetResponse listAddressSetDetailUsingGet(
        ListAddressSetDetailUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressSetDetailUsingGet);
    }

    /**
     * 查询地址组详细信息
     *
     * 查询地址组详细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetDetailUsingGetRequest 请求对象
     * @return SyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse>
     */
    public SyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse> listAddressSetDetailUsingGetInvoker(
        ListAddressSetDetailUsingGetRequest request) {
        return new SyncInvoker<ListAddressSetDetailUsingGetRequest, ListAddressSetDetailUsingGetResponse>(request,
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
     * @return ListAddressSetListUsingGetResponse
     */
    public ListAddressSetListUsingGetResponse listAddressSetListUsingGet(ListAddressSetListUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listAddressSetListUsingGet);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAddressSetListUsingGetRequest 请求对象
     * @return SyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse>
     */
    public SyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse> listAddressSetListUsingGetInvoker(
        ListAddressSetListUsingGetRequest request) {
        return new SyncInvoker<ListAddressSetListUsingGetRequest, ListAddressSetListUsingGetResponse>(request,
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
     * @param ListBlackWhiteListsUsingGetRequest 请求对象
     * @return ListBlackWhiteListsUsingGetResponse
     */
    public ListBlackWhiteListsUsingGetResponse listBlackWhiteListsUsingGet(ListBlackWhiteListsUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listBlackWhiteListsUsingGet);
    }

    /**
     * 查询黑白名单列表
     *
     * 查询黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlackWhiteListsUsingGetRequest 请求对象
     * @return SyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse>
     */
    public SyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse> listBlackWhiteListsUsingGetInvoker(
        ListBlackWhiteListsUsingGetRequest request) {
        return new SyncInvoker<ListBlackWhiteListsUsingGetRequest, ListBlackWhiteListsUsingGetResponse>(request,
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
     * 获取东西向防火墙信息
     *
     * 查询东西向防火墙信息
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
     * 查询东西向防火墙信息
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
     * 查询防火墙实例
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallUsingGetRequest 请求对象
     * @return ListFirewallUsingGetResponse
     */
    public ListFirewallUsingGetResponse listFirewallUsingGet(ListFirewallUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listFirewallUsingGet);
    }

    /**
     * 查询防火墙实例
     *
     * 查询防火墙实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFirewallUsingGetRequest 请求对象
     * @return SyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse>
     */
    public SyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse> listFirewallUsingGetInvoker(
        ListFirewallUsingGetRequest request) {
        return new SyncInvoker<ListFirewallUsingGetRequest, ListFirewallUsingGetResponse>(request,
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
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsProtectModeUsingPostRequest 请求对象
     * @return ListIpsProtectModeUsingPostResponse
     */
    public ListIpsProtectModeUsingPostResponse listIpsProtectModeUsingPost(ListIpsProtectModeUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsProtectModeUsingPost);
    }

    /**
     * 查询防护模式
     *
     * 查询防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsProtectModeUsingPostRequest 请求对象
     * @return SyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse>
     */
    public SyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse> listIpsProtectModeUsingPostInvoker(
        ListIpsProtectModeUsingPostRequest request) {
        return new SyncInvoker<ListIpsProtectModeUsingPostRequest, ListIpsProtectModeUsingPostResponse>(request,
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
     * @return ListParseDomainDetailsResponse
     */
    public ListParseDomainDetailsResponse listParseDomainDetails(ListParseDomainDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listParseDomainDetails);
    }

    /**
     * 查询域名解析ip地址
     *
     * 测试域名有效性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListParseDomainDetailsRequest 请求对象
     * @return SyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse>
     */
    public SyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse> listParseDomainDetailsInvoker(
        ListParseDomainDetailsRequest request) {
        return new SyncInvoker<ListParseDomainDetailsRequest, ListParseDomainDetailsResponse>(request,
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
     * @return ListRuleHitCountResponse
     */
    public ListRuleHitCountResponse listRuleHitCount(ListRuleHitCountRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listRuleHitCount);
    }

    /**
     * 获取规则击中次数
     *
     * 获取规则击中次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleHitCountRequest 请求对象
     * @return SyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse>
     */
    public SyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse> listRuleHitCountInvoker(
        ListRuleHitCountRequest request) {
        return new SyncInvoker<ListRuleHitCountRequest, ListRuleHitCountResponse>(request, CfwMeta.listRuleHitCount,
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
     * @return ListServiceItemsDetailsResponse
     */
    public ListServiceItemsDetailsResponse listServiceItemsDetails(ListServiceItemsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceItemsDetails);
    }

    /**
     * 查询服务成员列表
     *
     * 查询服务组成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceItemsDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse>
     */
    public SyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse> listServiceItemsDetailsInvoker(
        ListServiceItemsDetailsRequest request) {
        return new SyncInvoker<ListServiceItemsDetailsRequest, ListServiceItemsDetailsResponse>(request,
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
     * @return ListServiceSetResponse
     */
    public ListServiceSetResponse listServiceSet(ListServiceSetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceSet);
    }

    /**
     * 获取服务组列表
     *
     * 获取服务组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetRequest 请求对象
     * @return SyncInvoker<ListServiceSetRequest, ListServiceSetResponse>
     */
    public SyncInvoker<ListServiceSetRequest, ListServiceSetResponse> listServiceSetInvoker(
        ListServiceSetRequest request) {
        return new SyncInvoker<ListServiceSetRequest, ListServiceSetResponse>(request, CfwMeta.listServiceSet,
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
     * @return ListServiceSetDetailsResponse
     */
    public ListServiceSetDetailsResponse listServiceSetDetails(ListServiceSetDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listServiceSetDetails);
    }

    /**
     * 查询服务组详情
     *
     * 查询服务组细节
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServiceSetDetailsRequest 请求对象
     * @return SyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse>
     */
    public SyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse> listServiceSetDetailsInvoker(
        ListServiceSetDetailsRequest request) {
        return new SyncInvoker<ListServiceSetDetailsRequest, ListServiceSetDetailsResponse>(request,
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
     * @return UpdateAddressSetInfoUsingPutResponse
     */
    public UpdateAddressSetInfoUsingPutResponse updateAddressSetInfoUsingPut(
        UpdateAddressSetInfoUsingPutRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateAddressSetInfoUsingPut);
    }

    /**
     * 更新地址组信息
     *
     * 更新地址组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAddressSetInfoUsingPutRequest 请求对象
     * @return SyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse>
     */
    public SyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse> updateAddressSetInfoUsingPutInvoker(
        UpdateAddressSetInfoUsingPutRequest request) {
        return new SyncInvoker<UpdateAddressSetInfoUsingPutRequest, UpdateAddressSetInfoUsingPutResponse>(request,
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
     * @return UpdateBlackWhiteListUsingPutResponse
     */
    public UpdateBlackWhiteListUsingPutResponse updateBlackWhiteListUsingPut(
        UpdateBlackWhiteListUsingPutRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateBlackWhiteListUsingPut);
    }

    /**
     * 更新黑白名单列表
     *
     * 更新黑白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListUsingPutRequest 请求对象
     * @return SyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse>
     */
    public SyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse> updateBlackWhiteListUsingPutInvoker(
        UpdateBlackWhiteListUsingPutRequest request) {
        return new SyncInvoker<UpdateBlackWhiteListUsingPutRequest, UpdateBlackWhiteListUsingPutResponse>(request,
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
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceSetUsingPutRequest 请求对象
     * @return UpdateServiceSetUsingPutResponse
     */
    public UpdateServiceSetUsingPutResponse updateServiceSetUsingPut(UpdateServiceSetUsingPutRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateServiceSetUsingPut);
    }

    /**
     * 修改服务组
     *
     * 更新服务组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServiceSetUsingPutRequest 请求对象
     * @return SyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse>
     */
    public SyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse> updateServiceSetUsingPutInvoker(
        UpdateServiceSetUsingPutRequest request) {
        return new SyncInvoker<UpdateServiceSetUsingPutRequest, UpdateServiceSetUsingPutResponse>(request,
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
     * @return AddRuleAclUsingPostResponse
     */
    public AddRuleAclUsingPostResponse addRuleAclUsingPost(AddRuleAclUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.addRuleAclUsingPost);
    }

    /**
     * 创建ACL规则
     *
     * 创建ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRuleAclUsingPostRequest 请求对象
     * @return SyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse>
     */
    public SyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse> addRuleAclUsingPostInvoker(
        AddRuleAclUsingPostRequest request) {
        return new SyncInvoker<AddRuleAclUsingPostRequest, AddRuleAclUsingPostResponse>(request,
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
     * @return DeleteRuleAclUsingDeleteResponse
     */
    public DeleteRuleAclUsingDeleteResponse deleteRuleAclUsingDelete(DeleteRuleAclUsingDeleteRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.deleteRuleAclUsingDelete);
    }

    /**
     * 删除ACL规则组
     *
     * 删除ACL规则组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleAclUsingDeleteRequest 请求对象
     * @return SyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse>
     */
    public SyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse> deleteRuleAclUsingDeleteInvoker(
        DeleteRuleAclUsingDeleteRequest request) {
        return new SyncInvoker<DeleteRuleAclUsingDeleteRequest, DeleteRuleAclUsingDeleteResponse>(request,
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
     * @return ListRuleAclUsingPutResponse
     */
    public ListRuleAclUsingPutResponse listRuleAclUsingPut(ListRuleAclUsingPutRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listRuleAclUsingPut);
    }

    /**
     * ACL防护规则优先级设置
     *
     * ACL防护规则优先级设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclUsingPutRequest 请求对象
     * @return SyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse>
     */
    public SyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse> listRuleAclUsingPutInvoker(
        ListRuleAclUsingPutRequest request) {
        return new SyncInvoker<ListRuleAclUsingPutRequest, ListRuleAclUsingPutResponse>(request,
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
     * @return ListRuleAclsUsingGetResponse
     */
    public ListRuleAclsUsingGetResponse listRuleAclsUsingGet(ListRuleAclsUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listRuleAclsUsingGet);
    }

    /**
     * 查询防护规则
     *
     * 查询防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleAclsUsingGetRequest 请求对象
     * @return SyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse>
     */
    public SyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse> listRuleAclsUsingGetInvoker(
        ListRuleAclsUsingGetRequest request) {
        return new SyncInvoker<ListRuleAclsUsingGetRequest, ListRuleAclsUsingGetResponse>(request,
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
     * @return UpdateRuleAclUsingPutResponse
     */
    public UpdateRuleAclUsingPutResponse updateRuleAclUsingPut(UpdateRuleAclUsingPutRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.updateRuleAclUsingPut);
    }

    /**
     * 更新ACL规则
     *
     * 更新ACL规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleAclUsingPutRequest 请求对象
     * @return SyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse>
     */
    public SyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse> updateRuleAclUsingPutInvoker(
        UpdateRuleAclUsingPutRequest request) {
        return new SyncInvoker<UpdateRuleAclUsingPutRequest, UpdateRuleAclUsingPutResponse>(request,
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
     * @return ChangeProtectEipResponse
     */
    public ChangeProtectEipResponse changeProtectEip(ChangeProtectEipRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeProtectEip);
    }

    /**
     * 弹性IP开启关闭
     *
     * 开启关闭EIP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeProtectEipRequest 请求对象
     * @return SyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse>
     */
    public SyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse> changeProtectEipInvoker(
        ChangeProtectEipRequest request) {
        return new SyncInvoker<ChangeProtectEipRequest, ChangeProtectEipResponse>(request, CfwMeta.changeProtectEip,
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
     * @return CountEipsResponse
     */
    public CountEipsResponse countEips(CountEipsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.countEips);
    }

    /**
     * 查询Eip个数
     *
     * 查询Eip个数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountEipsRequest 请求对象
     * @return SyncInvoker<CountEipsRequest, CountEipsResponse>
     */
    public SyncInvoker<CountEipsRequest, CountEipsResponse> countEipsInvoker(CountEipsRequest request) {
        return new SyncInvoker<CountEipsRequest, CountEipsResponse>(request, CfwMeta.countEips, hcClient);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipResourcesRequest 请求对象
     * @return ListEipResourcesResponse
     */
    public ListEipResourcesResponse listEipResources(ListEipResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listEipResources);
    }

    /**
     * 弹性IP列表查询
     *
     * 弹性IP列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEipResourcesRequest 请求对象
     * @return SyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse>
     */
    public SyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse> listEipResourcesInvoker(
        ListEipResourcesRequest request) {
        return new SyncInvoker<ListEipResourcesRequest, ListEipResourcesResponse>(request, CfwMeta.listEipResources,
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
     * @return ChangeIpsSwitchUsingPostResponse
     */
    public ChangeIpsSwitchUsingPostResponse changeIpsSwitchUsingPost(ChangeIpsSwitchUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.changeIpsSwitchUsingPost);
    }

    /**
     * IPS特性开关操作
     *
     * 切换开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIpsSwitchUsingPostRequest 请求对象
     * @return SyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse>
     */
    public SyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse> changeIpsSwitchUsingPostInvoker(
        ChangeIpsSwitchUsingPostRequest request) {
        return new SyncInvoker<ChangeIpsSwitchUsingPostRequest, ChangeIpsSwitchUsingPostResponse>(request,
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
     * @return ListIpsSwitchStatusUsingGetResponse
     */
    public ListIpsSwitchStatusUsingGetResponse listIpsSwitchStatusUsingGet(ListIpsSwitchStatusUsingGetRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listIpsSwitchStatusUsingGet);
    }

    /**
     * 查询IPS特性开关状态
     *
     * 查询IPS特性开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIpsSwitchStatusUsingGetRequest 请求对象
     * @return SyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse>
     */
    public SyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse> listIpsSwitchStatusUsingGetInvoker(
        ListIpsSwitchStatusUsingGetRequest request) {
        return new SyncInvoker<ListIpsSwitchStatusUsingGetRequest, ListIpsSwitchStatusUsingGetResponse>(request,
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
     * @return ListVpcProtectsResponse
     */
    public ListVpcProtectsResponse listVpcProtects(ListVpcProtectsRequest request) {
        return hcClient.syncInvokeHttp(request, CfwMeta.listVpcProtects);
    }

    /**
     * 查询防护VPC数
     *
     * 查询防护vpc信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcProtectsRequest 请求对象
     * @return SyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse>
     */
    public SyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse> listVpcProtectsInvoker(
        ListVpcProtectsRequest request) {
        return new SyncInvoker<ListVpcProtectsRequest, ListVpcProtectsResponse>(request, CfwMeta.listVpcProtects,
            hcClient);
    }

}

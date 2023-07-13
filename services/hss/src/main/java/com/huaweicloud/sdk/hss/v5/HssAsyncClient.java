package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.*;

import java.util.concurrent.CompletableFuture;

public class HssAsyncClient {

    protected HcClient hcClient;

    public HssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssAsyncClient> newBuilder() {
        return new ClientBuilder<>(HssAsyncClient::new);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHostsGroupRequest 请求对象
     * @return CompletableFuture<AddHostsGroupResponse>
     */
    public CompletableFuture<AddHostsGroupResponse> addHostsGroupAsync(AddHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addHostsGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHostsGroupRequest 请求对象
     * @return AsyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>
     */
    public AsyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroupAsyncInvoker(
        AddHostsGroupRequest request) {
        return new AsyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>(request, HssMeta.addHostsGroup, hcClient);
    }

    /**
     * 部署策略
     *
     * 部署策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePolicyGroupRequest 请求对象
     * @return CompletableFuture<AssociatePolicyGroupResponse>
     */
    public CompletableFuture<AssociatePolicyGroupResponse> associatePolicyGroupAsync(
        AssociatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.associatePolicyGroup);
    }

    /**
     * 部署策略
     *
     * 部署策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>
     */
    public AsyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroupAsyncInvoker(
        AssociatePolicyGroupRequest request) {
        return new AsyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>(request,
            HssMeta.associatePolicyGroup, hcClient);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchCreateTags);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>(request, HssMeta.batchCreateTags,
            hcClient);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEventRequest 请求对象
     * @return CompletableFuture<ChangeEventResponse>
     */
    public CompletableFuture<ChangeEventResponse> changeEventAsync(ChangeEventRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeEvent);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEventRequest 请求对象
     * @return AsyncInvoker<ChangeEventRequest, ChangeEventResponse>
     */
    public AsyncInvoker<ChangeEventRequest, ChangeEventResponse> changeEventAsyncInvoker(ChangeEventRequest request) {
        return new AsyncInvoker<ChangeEventRequest, ChangeEventResponse>(request, HssMeta.changeEvent, hcClient);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeHostsGroupRequest 请求对象
     * @return CompletableFuture<ChangeHostsGroupResponse>
     */
    public CompletableFuture<ChangeHostsGroupResponse> changeHostsGroupAsync(ChangeHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeHostsGroup);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeHostsGroupRequest 请求对象
     * @return AsyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>
     */
    public AsyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroupAsyncInvoker(
        ChangeHostsGroupRequest request) {
        return new AsyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>(request, HssMeta.changeHostsGroup,
            hcClient);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeVulStatusRequest 请求对象
     * @return CompletableFuture<ChangeVulStatusResponse>
     */
    public CompletableFuture<ChangeVulStatusResponse> changeVulStatusAsync(ChangeVulStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeVulStatus);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeVulStatusRequest 请求对象
     * @return AsyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>
     */
    public AsyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatusAsyncInvoker(
        ChangeVulStatusRequest request) {
        return new AsyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>(request, HssMeta.changeVulStatus,
            hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostsGroupRequest 请求对象
     * @return CompletableFuture<DeleteHostsGroupResponse>
     */
    public CompletableFuture<DeleteHostsGroupResponse> deleteHostsGroupAsync(DeleteHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteHostsGroup);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostsGroupRequest 请求对象
     * @return AsyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>
     */
    public AsyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroupAsyncInvoker(
        DeleteHostsGroupRequest request) {
        return new AsyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>(request, HssMeta.deleteHostsGroup,
            hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceInstanceTagResponse>
     */
    public CompletableFuture<DeleteResourceInstanceTagResponse> deleteResourceInstanceTagAsync(
        DeleteResourceInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteResourceInstanceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>
     */
    public AsyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTagAsyncInvoker(
        DeleteResourceInstanceTagRequest request) {
        return new AsyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>(request,
            HssMeta.deleteResourceInstanceTag, hcClient);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmWhiteListRequest 请求对象
     * @return CompletableFuture<ListAlarmWhiteListResponse>
     */
    public CompletableFuture<ListAlarmWhiteListResponse> listAlarmWhiteListAsync(ListAlarmWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAlarmWhiteList);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmWhiteListRequest 请求对象
     * @return AsyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>
     */
    public AsyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteListAsyncInvoker(
        ListAlarmWhiteListRequest request) {
        return new AsyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>(request,
            HssMeta.listAlarmWhiteList, hcClient);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListAppChangeHistoriesResponse>
     */
    public CompletableFuture<ListAppChangeHistoriesResponse> listAppChangeHistoriesAsync(
        ListAppChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppChangeHistories);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>
     */
    public AsyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistoriesAsyncInvoker(
        ListAppChangeHistoriesRequest request) {
        return new AsyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>(request,
            HssMeta.listAppChangeHistories, hcClient);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppStatisticsRequest 请求对象
     * @return CompletableFuture<ListAppStatisticsResponse>
     */
    public CompletableFuture<ListAppStatisticsResponse> listAppStatisticsAsync(ListAppStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppStatistics);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppStatisticsRequest 请求对象
     * @return AsyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>
     */
    public AsyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatisticsAsyncInvoker(
        ListAppStatisticsRequest request) {
        return new AsyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>(request, HssMeta.listAppStatistics,
            hcClient);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listApps);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<ListAppsRequest, ListAppsResponse>(request, HssMeta.listApps, hcClient);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchChangeHistoriesResponse>
     */
    public CompletableFuture<ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesAsync(
        ListAutoLaunchChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchChangeHistories);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>
     */
    public AsyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesAsyncInvoker(
        ListAutoLaunchChangeHistoriesRequest request) {
        return new AsyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>(request,
            HssMeta.listAutoLaunchChangeHistories, hcClient);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchStatisticsRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchStatisticsResponse>
     */
    public CompletableFuture<ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsAsync(
        ListAutoLaunchStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchStatistics);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchStatisticsRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>
     */
    public AsyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsAsyncInvoker(
        ListAutoLaunchStatisticsRequest request) {
        return new AsyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>(request,
            HssMeta.listAutoLaunchStatistics, hcClient);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchsRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchsResponse>
     */
    public CompletableFuture<ListAutoLaunchsResponse> listAutoLaunchsAsync(ListAutoLaunchsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchs);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchsRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>
     */
    public AsyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchsAsyncInvoker(
        ListAutoLaunchsRequest request) {
        return new AsyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>(request, HssMeta.listAutoLaunchs,
            hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return CompletableFuture<ListHostGroupsResponse>
     */
    public CompletableFuture<ListHostGroupsResponse> listHostGroupsAsync(ListHostGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request, HssMeta.listHostGroups,
            hcClient);
    }

    /**
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostProtectHistoryInfoRequest 请求对象
     * @return CompletableFuture<ListHostProtectHistoryInfoResponse>
     */
    public CompletableFuture<ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoAsync(
        ListHostProtectHistoryInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostProtectHistoryInfo);
    }

    /**
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostProtectHistoryInfoRequest 请求对象
     * @return AsyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>
     */
    public AsyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoAsyncInvoker(
        ListHostProtectHistoryInfoRequest request) {
        return new AsyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>(request,
            HssMeta.listHostProtectHistoryInfo, hcClient);
    }

    /**
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return CompletableFuture<ListHostRaspProtectHistoryInfoResponse>
     */
    public CompletableFuture<ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoAsync(
        ListHostRaspProtectHistoryInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostRaspProtectHistoryInfo);
    }

    /**
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return AsyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>
     */
    public AsyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoAsyncInvoker(
        ListHostRaspProtectHistoryInfoRequest request) {
        return new AsyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>(request,
            HssMeta.listHostRaspProtectHistoryInfo, hcClient);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostStatusRequest 请求对象
     * @return CompletableFuture<ListHostStatusResponse>
     */
    public CompletableFuture<ListHostStatusResponse> listHostStatusAsync(ListHostStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostStatus);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostStatusRequest 请求对象
     * @return AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusAsyncInvoker(
        ListHostStatusRequest request) {
        return new AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse>(request, HssMeta.listHostStatus,
            hcClient);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostVulsRequest 请求对象
     * @return CompletableFuture<ListHostVulsResponse>
     */
    public CompletableFuture<ListHostVulsResponse> listHostVulsAsync(ListHostVulsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostVuls);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostVulsRequest 请求对象
     * @return AsyncInvoker<ListHostVulsRequest, ListHostVulsResponse>
     */
    public AsyncInvoker<ListHostVulsRequest, ListHostVulsResponse> listHostVulsAsyncInvoker(
        ListHostVulsRequest request) {
        return new AsyncInvoker<ListHostVulsRequest, ListHostVulsResponse>(request, HssMeta.listHostVuls, hcClient);
    }

    /**
     * 资产管理-资产指纹-Jar包的服务器列表
     *
     * 资产管理-资产指纹-Jar包的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJarPackageHostInfoRequest 请求对象
     * @return CompletableFuture<ListJarPackageHostInfoResponse>
     */
    public CompletableFuture<ListJarPackageHostInfoResponse> listJarPackageHostInfoAsync(
        ListJarPackageHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listJarPackageHostInfo);
    }

    /**
     * 资产管理-资产指纹-Jar包的服务器列表
     *
     * 资产管理-资产指纹-Jar包的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJarPackageHostInfoRequest 请求对象
     * @return AsyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse>
     */
    public AsyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfoAsyncInvoker(
        ListJarPackageHostInfoRequest request) {
        return new AsyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse>(request,
            HssMeta.listJarPackageHostInfo, hcClient);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJarPackageStatisticsRequest 请求对象
     * @return CompletableFuture<ListJarPackageStatisticsResponse>
     */
    public CompletableFuture<ListJarPackageStatisticsResponse> listJarPackageStatisticsAsync(
        ListJarPackageStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listJarPackageStatistics);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListJarPackageStatisticsRequest 请求对象
     * @return AsyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse>
     */
    public AsyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatisticsAsyncInvoker(
        ListJarPackageStatisticsRequest request) {
        return new AsyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse>(request,
            HssMeta.listJarPackageStatistics, hcClient);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return CompletableFuture<ListPasswordComplexityResponse>
     */
    public CompletableFuture<ListPasswordComplexityResponse> listPasswordComplexityAsync(
        ListPasswordComplexityRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPasswordComplexity);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityAsyncInvoker(
        ListPasswordComplexityRequest request) {
        return new AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>(request,
            HssMeta.listPasswordComplexity, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyGroupResponse> listPolicyGroupAsync(ListPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupAsyncInvoker(
        ListPolicyGroupRequest request) {
        return new AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>(request, HssMeta.listPolicyGroup,
            hcClient);
    }

    /**
     * 查询开放端口列表
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortStatisticsRequest 请求对象
     * @return CompletableFuture<ListPortStatisticsResponse>
     */
    public CompletableFuture<ListPortStatisticsResponse> listPortStatisticsAsync(ListPortStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPortStatistics);
    }

    /**
     * 查询开放端口列表
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortStatisticsRequest 请求对象
     * @return AsyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>
     */
    public AsyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatisticsAsyncInvoker(
        ListPortStatisticsRequest request) {
        return new AsyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>(request,
            HssMeta.listPortStatistics, hcClient);
    }

    /**
     * 查询开放端口的服务器列表
     *
     * 查询开放端口的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPorts);
    }

    /**
     * 查询开放端口的服务器列表
     *
     * 查询开放端口的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<ListPortsRequest, ListPortsResponse>(request, HssMeta.listPorts, hcClient);
    }

    /**
     * 查询进程列表
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProcessStatisticsRequest 请求对象
     * @return CompletableFuture<ListProcessStatisticsResponse>
     */
    public CompletableFuture<ListProcessStatisticsResponse> listProcessStatisticsAsync(
        ListProcessStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProcessStatistics);
    }

    /**
     * 查询进程列表
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProcessStatisticsRequest 请求对象
     * @return AsyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>
     */
    public AsyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatisticsAsyncInvoker(
        ListProcessStatisticsRequest request) {
        return new AsyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>(request,
            HssMeta.listProcessStatistics, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionPolicyRequest 请求对象
     * @return CompletableFuture<ListProtectionPolicyResponse>
     */
    public CompletableFuture<ListProtectionPolicyResponse> listProtectionPolicyAsync(
        ListProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProtectionPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>
     */
    public AsyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicyAsyncInvoker(
        ListProtectionPolicyRequest request) {
        return new AsyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>(request,
            HssMeta.listProtectionPolicy, hcClient);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionServerRequest 请求对象
     * @return CompletableFuture<ListProtectionServerResponse>
     */
    public CompletableFuture<ListProtectionServerResponse> listProtectionServerAsync(
        ListProtectionServerRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProtectionServer);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionServerRequest 请求对象
     * @return AsyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>
     */
    public AsyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServerAsyncInvoker(
        ListProtectionServerRequest request) {
        return new AsyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>(request,
            HssMeta.listProtectionServer, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasDetailRequest 请求对象
     * @return CompletableFuture<ListQuotasDetailResponse>
     */
    public CompletableFuture<ListQuotasDetailResponse> listQuotasDetailAsync(ListQuotasDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listQuotasDetail);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasDetailRequest 请求对象
     * @return AsyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>
     */
    public AsyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetailAsyncInvoker(
        ListQuotasDetailRequest request) {
        return new AsyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>(request, HssMeta.listQuotasDetail,
            hcClient);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigCheckRulesRequest 请求对象
     * @return CompletableFuture<ListRiskConfigCheckRulesResponse>
     */
    public CompletableFuture<ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsync(
        ListRiskConfigCheckRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigCheckRulesRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsyncInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>(request,
            HssMeta.listRiskConfigCheckRules, hcClient);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigHostsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigHostsResponse>
     */
    public CompletableFuture<ListRiskConfigHostsResponse> listRiskConfigHostsAsync(ListRiskConfigHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigHosts);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigHostsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsAsyncInvoker(
        ListRiskConfigHostsRequest request) {
        return new AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>(request,
            HssMeta.listRiskConfigHosts, hcClient);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigsResponse>
     */
    public CompletableFuture<ListRiskConfigsResponse> listRiskConfigsAsync(ListRiskConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigs);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsAsyncInvoker(
        ListRiskConfigsRequest request) {
        return new AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>(request, HssMeta.listRiskConfigs,
            hcClient);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityEventsRequest 请求对象
     * @return CompletableFuture<ListSecurityEventsResponse>
     */
    public CompletableFuture<ListSecurityEventsResponse> listSecurityEventsAsync(ListSecurityEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityEventsRequest 请求对象
     * @return AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsAsyncInvoker(
        ListSecurityEventsRequest request) {
        return new AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>(request,
            HssMeta.listSecurityEvents, hcClient);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListUserChangeHistoriesResponse>
     */
    public CompletableFuture<ListUserChangeHistoriesResponse> listUserChangeHistoriesAsync(
        ListUserChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUserChangeHistories);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>
     */
    public AsyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistoriesAsyncInvoker(
        ListUserChangeHistoriesRequest request) {
        return new AsyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>(request,
            HssMeta.listUserChangeHistories, hcClient);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserStatisticsRequest 请求对象
     * @return CompletableFuture<ListUserStatisticsResponse>
     */
    public CompletableFuture<ListUserStatisticsResponse> listUserStatisticsAsync(ListUserStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUserStatistics);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserStatisticsRequest 请求对象
     * @return AsyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>
     */
    public AsyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatisticsAsyncInvoker(
        ListUserStatisticsRequest request) {
        return new AsyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>(request,
            HssMeta.listUserStatistics, hcClient);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUsers);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, HssMeta.listUsers, hcClient);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulHostsRequest 请求对象
     * @return CompletableFuture<ListVulHostsResponse>
     */
    public CompletableFuture<ListVulHostsResponse> listVulHostsAsync(ListVulHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHosts);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulHostsRequest 请求对象
     * @return AsyncInvoker<ListVulHostsRequest, ListVulHostsResponse>
     */
    public AsyncInvoker<ListVulHostsRequest, ListVulHostsResponse> listVulHostsAsyncInvoker(
        ListVulHostsRequest request) {
        return new AsyncInvoker<ListVulHostsRequest, ListVulHostsResponse>(request, HssMeta.listVulHosts, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListVulnerabilitiesResponse>
     */
    public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync(ListVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesAsyncInvoker(
        ListVulnerabilitiesRequest request) {
        return new AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>(request,
            HssMeta.listVulnerabilities, hcClient);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWeakPasswordUsersRequest 请求对象
     * @return CompletableFuture<ListWeakPasswordUsersResponse>
     */
    public CompletableFuture<ListWeakPasswordUsersResponse> listWeakPasswordUsersAsync(
        ListWeakPasswordUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWeakPasswordUsersRequest 请求对象
     * @return AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersAsyncInvoker(
        ListWeakPasswordUsersRequest request) {
        return new AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>(request,
            HssMeta.listWeakPasswordUsers, hcClient);
    }

    /**
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWtpProtectHostRequest 请求对象
     * @return CompletableFuture<ListWtpProtectHostResponse>
     */
    public CompletableFuture<ListWtpProtectHostResponse> listWtpProtectHostAsync(ListWtpProtectHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWtpProtectHost);
    }

    /**
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWtpProtectHostRequest 请求对象
     * @return AsyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>
     */
    public AsyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHostAsyncInvoker(
        ListWtpProtectHostRequest request) {
        return new AsyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>(request,
            HssMeta.listWtpProtectHost, hcClient);
    }

    /**
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRaspSwitchRequest 请求对象
     * @return CompletableFuture<SetRaspSwitchResponse>
     */
    public CompletableFuture<SetRaspSwitchResponse> setRaspSwitchAsync(SetRaspSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setRaspSwitch);
    }

    /**
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRaspSwitchRequest 请求对象
     * @return AsyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>
     */
    public AsyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitchAsyncInvoker(
        SetRaspSwitchRequest request) {
        return new AsyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>(request, HssMeta.setRaspSwitch, hcClient);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetWtpProtectionStatusInfoRequest 请求对象
     * @return CompletableFuture<SetWtpProtectionStatusInfoResponse>
     */
    public CompletableFuture<SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoAsync(
        SetWtpProtectionStatusInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setWtpProtectionStatusInfo);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetWtpProtectionStatusInfoRequest 请求对象
     * @return AsyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>
     */
    public AsyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoAsyncInvoker(
        SetWtpProtectionStatusInfoRequest request) {
        return new AsyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>(request,
            HssMeta.setWtpProtectionStatusInfo, hcClient);
    }

    /**
     * 统计资产信息，账号、端口、进程等
     *
     * 资产统计信息，账号、端口、进程等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetStatisticRequest 请求对象
     * @return CompletableFuture<ShowAssetStatisticResponse>
     */
    public CompletableFuture<ShowAssetStatisticResponse> showAssetStatisticAsync(ShowAssetStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAssetStatistic);
    }

    /**
     * 统计资产信息，账号、端口、进程等
     *
     * 资产统计信息，账号、端口、进程等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetStatisticRequest 请求对象
     * @return AsyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>
     */
    public AsyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatisticAsyncInvoker(
        ShowAssetStatisticRequest request) {
        return new AsyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>(request,
            HssMeta.showAssetStatistic, hcClient);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyInfoRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyInfoResponse>
     */
    public CompletableFuture<ShowBackupPolicyInfoResponse> showBackupPolicyInfoAsync(
        ShowBackupPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showBackupPolicyInfo);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>
     */
    public AsyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfoAsyncInvoker(
        ShowBackupPolicyInfoRequest request) {
        return new AsyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>(request,
            HssMeta.showBackupPolicyInfo, hcClient);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckRuleDetailRequest 请求对象
     * @return CompletableFuture<ShowCheckRuleDetailResponse>
     */
    public CompletableFuture<ShowCheckRuleDetailResponse> showCheckRuleDetailAsync(ShowCheckRuleDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showCheckRuleDetail);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckRuleDetailRequest 请求对象
     * @return AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailAsyncInvoker(
        ShowCheckRuleDetailRequest request) {
        return new AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>(request,
            HssMeta.showCheckRuleDetail, hcClient);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceQuotasRequest 请求对象
     * @return CompletableFuture<ShowResourceQuotasResponse>
     */
    public CompletableFuture<ShowResourceQuotasResponse> showResourceQuotasAsync(ShowResourceQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showResourceQuotas);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceQuotasRequest 请求对象
     * @return AsyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>
     */
    public AsyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotasAsyncInvoker(
        ShowResourceQuotasRequest request) {
        return new AsyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>(request,
            HssMeta.showResourceQuotas, hcClient);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRiskConfigDetailRequest 请求对象
     * @return CompletableFuture<ShowRiskConfigDetailResponse>
     */
    public CompletableFuture<ShowRiskConfigDetailResponse> showRiskConfigDetailAsync(
        ShowRiskConfigDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRiskConfigDetail);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRiskConfigDetailRequest 请求对象
     * @return AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailAsyncInvoker(
        ShowRiskConfigDetailRequest request) {
        return new AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>(request,
            HssMeta.showRiskConfigDetail, hcClient);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartProtectionRequest 请求对象
     * @return CompletableFuture<StartProtectionResponse>
     */
    public CompletableFuture<StartProtectionResponse> startProtectionAsync(StartProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.startProtection);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartProtectionRequest 请求对象
     * @return AsyncInvoker<StartProtectionRequest, StartProtectionResponse>
     */
    public AsyncInvoker<StartProtectionRequest, StartProtectionResponse> startProtectionAsyncInvoker(
        StartProtectionRequest request) {
        return new AsyncInvoker<StartProtectionRequest, StartProtectionResponse>(request, HssMeta.startProtection,
            hcClient);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopProtectionRequest 请求对象
     * @return CompletableFuture<StopProtectionResponse>
     */
    public CompletableFuture<StopProtectionResponse> stopProtectionAsync(StopProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.stopProtection);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopProtectionRequest 请求对象
     * @return AsyncInvoker<StopProtectionRequest, StopProtectionResponse>
     */
    public AsyncInvoker<StopProtectionRequest, StopProtectionResponse> stopProtectionAsyncInvoker(
        StopProtectionRequest request) {
        return new AsyncInvoker<StopProtectionRequest, StopProtectionResponse>(request, HssMeta.stopProtection,
            hcClient);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchHostsProtectStatusRequest 请求对象
     * @return CompletableFuture<SwitchHostsProtectStatusResponse>
     */
    public CompletableFuture<SwitchHostsProtectStatusResponse> switchHostsProtectStatusAsync(
        SwitchHostsProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchHostsProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchHostsProtectStatusRequest 请求对象
     * @return AsyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>
     */
    public AsyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatusAsyncInvoker(
        SwitchHostsProtectStatusRequest request) {
        return new AsyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>(request,
            HssMeta.switchHostsProtectStatus, hcClient);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackupPolicyInfoRequest 请求对象
     * @return CompletableFuture<UpdateBackupPolicyInfoResponse>
     */
    public CompletableFuture<UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoAsync(
        UpdateBackupPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateBackupPolicyInfo);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackupPolicyInfoRequest 请求对象
     * @return AsyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>
     */
    public AsyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoAsyncInvoker(
        UpdateBackupPolicyInfoRequest request) {
        return new AsyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>(request,
            HssMeta.updateBackupPolicyInfo, hcClient);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectionPolicyRequest 请求对象
     * @return CompletableFuture<UpdateProtectionPolicyResponse>
     */
    public CompletableFuture<UpdateProtectionPolicyResponse> updateProtectionPolicyAsync(
        UpdateProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateProtectionPolicy);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>
     */
    public AsyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicyAsyncInvoker(
        UpdateProtectionPolicyRequest request) {
        return new AsyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>(request,
            HssMeta.updateProtectionPolicy, hcClient);
    }

}

package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.*;

public class HssClient {

    protected HcClient hcClient;

    public HssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssClient> newBuilder() {
        return new ClientBuilder<>(HssClient::new);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHostsGroupRequest 请求对象
     * @return AddHostsGroupResponse
     */
    public AddHostsGroupResponse addHostsGroup(AddHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addHostsGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHostsGroupRequest 请求对象
     * @return SyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>
     */
    public SyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroupInvoker(AddHostsGroupRequest request) {
        return new SyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>(request, HssMeta.addHostsGroup, hcClient);
    }

    /**
     * 部署策略
     *
     * 部署策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePolicyGroupRequest 请求对象
     * @return AssociatePolicyGroupResponse
     */
    public AssociatePolicyGroupResponse associatePolicyGroup(AssociatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associatePolicyGroup);
    }

    /**
     * 部署策略
     *
     * 部署策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociatePolicyGroupRequest 请求对象
     * @return SyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>
     */
    public SyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroupInvoker(
        AssociatePolicyGroupRequest request) {
        return new SyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>(request,
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
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchCreateTags);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>(request, HssMeta.batchCreateTags,
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
     * @return ChangeEventResponse
     */
    public ChangeEventResponse changeEvent(ChangeEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeEvent);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeEventRequest 请求对象
     * @return SyncInvoker<ChangeEventRequest, ChangeEventResponse>
     */
    public SyncInvoker<ChangeEventRequest, ChangeEventResponse> changeEventInvoker(ChangeEventRequest request) {
        return new SyncInvoker<ChangeEventRequest, ChangeEventResponse>(request, HssMeta.changeEvent, hcClient);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeHostsGroupRequest 请求对象
     * @return ChangeHostsGroupResponse
     */
    public ChangeHostsGroupResponse changeHostsGroup(ChangeHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeHostsGroup);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeHostsGroupRequest 请求对象
     * @return SyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>
     */
    public SyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroupInvoker(
        ChangeHostsGroupRequest request) {
        return new SyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>(request, HssMeta.changeHostsGroup,
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
     * @return ChangeVulStatusResponse
     */
    public ChangeVulStatusResponse changeVulStatus(ChangeVulStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeVulStatus);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeVulStatusRequest 请求对象
     * @return SyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>
     */
    public SyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatusInvoker(
        ChangeVulStatusRequest request) {
        return new SyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>(request, HssMeta.changeVulStatus,
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
     * @return DeleteHostsGroupResponse
     */
    public DeleteHostsGroupResponse deleteHostsGroup(DeleteHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteHostsGroup);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHostsGroupRequest 请求对象
     * @return SyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>
     */
    public SyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroupInvoker(
        DeleteHostsGroupRequest request) {
        return new SyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>(request, HssMeta.deleteHostsGroup,
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
     * @return DeleteResourceInstanceTagResponse
     */
    public DeleteResourceInstanceTagResponse deleteResourceInstanceTag(DeleteResourceInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteResourceInstanceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>
     */
    public SyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTagInvoker(
        DeleteResourceInstanceTagRequest request) {
        return new SyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>(request,
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
     * @return ListAlarmWhiteListResponse
     */
    public ListAlarmWhiteListResponse listAlarmWhiteList(ListAlarmWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAlarmWhiteList);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmWhiteListRequest 请求对象
     * @return SyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>
     */
    public SyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteListInvoker(
        ListAlarmWhiteListRequest request) {
        return new SyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>(request,
            HssMeta.listAlarmWhiteList, hcClient);
    }

    /**
     * 资产指纹-软件信息-历史变动记录
     *
     * 资产指纹-软件信息-历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppChangeHistoriesRequest 请求对象
     * @return ListAppChangeHistoriesResponse
     */
    public ListAppChangeHistoriesResponse listAppChangeHistories(ListAppChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppChangeHistories);
    }

    /**
     * 资产指纹-软件信息-历史变动记录
     *
     * 资产指纹-软件信息-历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>
     */
    public SyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistoriesInvoker(
        ListAppChangeHistoriesRequest request) {
        return new SyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>(request,
            HssMeta.listAppChangeHistories, hcClient);
    }

    /**
     * 资产指纹-软件信息
     *
     * 资产指纹-软件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppStatisticsRequest 请求对象
     * @return ListAppStatisticsResponse
     */
    public ListAppStatisticsResponse listAppStatistics(ListAppStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppStatistics);
    }

    /**
     * 资产指纹-软件信息
     *
     * 资产指纹-软件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppStatisticsRequest 请求对象
     * @return SyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>
     */
    public SyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatisticsInvoker(
        ListAppStatisticsRequest request) {
        return new SyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>(request, HssMeta.listAppStatistics,
            hcClient);
    }

    /**
     * 单主机资产指纹-软件
     *
     * 单主机资产指纹-软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listApps);
    }

    /**
     * 单主机资产指纹-软件
     *
     * 单主机资产指纹-软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, HssMeta.listApps, hcClient);
    }

    /**
     * 资产指纹-自启动项-历史变动记录
     *
     * 资产指纹-自启动项-历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return ListAutoLaunchChangeHistoriesResponse
     */
    public ListAutoLaunchChangeHistoriesResponse listAutoLaunchChangeHistories(
        ListAutoLaunchChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchChangeHistories);
    }

    /**
     * 资产指纹-自启动项-历史变动记录
     *
     * 资产指纹-自启动项-历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>
     */
    public SyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesInvoker(
        ListAutoLaunchChangeHistoriesRequest request) {
        return new SyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>(request,
            HssMeta.listAutoLaunchChangeHistories, hcClient);
    }

    /**
     * 资产指纹-自启动项信息
     *
     * 资产指纹-自启动项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchStatisticsRequest 请求对象
     * @return ListAutoLaunchStatisticsResponse
     */
    public ListAutoLaunchStatisticsResponse listAutoLaunchStatistics(ListAutoLaunchStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchStatistics);
    }

    /**
     * 资产指纹-自启动项信息
     *
     * 资产指纹-自启动项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchStatisticsRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>
     */
    public SyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsInvoker(
        ListAutoLaunchStatisticsRequest request) {
        return new SyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>(request,
            HssMeta.listAutoLaunchStatistics, hcClient);
    }

    /**
     * 单主机资产指纹-自启动项
     *
     * 单主机资产指纹-自启动项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchsRequest 请求对象
     * @return ListAutoLaunchsResponse
     */
    public ListAutoLaunchsResponse listAutoLaunchs(ListAutoLaunchsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchs);
    }

    /**
     * 单主机资产指纹-自启动项
     *
     * 单主机资产指纹-自启动项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchsRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>
     */
    public SyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchsInvoker(
        ListAutoLaunchsRequest request) {
        return new SyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>(request, HssMeta.listAutoLaunchs,
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
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request, HssMeta.listHostGroups,
            hcClient);
    }

    /**
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostProtectHistoryInfoRequest 请求对象
     * @return ListHostProtectHistoryInfoResponse
     */
    public ListHostProtectHistoryInfoResponse listHostProtectHistoryInfo(ListHostProtectHistoryInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostProtectHistoryInfo);
    }

    /**
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostProtectHistoryInfoRequest 请求对象
     * @return SyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>
     */
    public SyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoInvoker(
        ListHostProtectHistoryInfoRequest request) {
        return new SyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>(request,
            HssMeta.listHostProtectHistoryInfo, hcClient);
    }

    /**
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return ListHostRaspProtectHistoryInfoResponse
     */
    public ListHostRaspProtectHistoryInfoResponse listHostRaspProtectHistoryInfo(
        ListHostRaspProtectHistoryInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostRaspProtectHistoryInfo);
    }

    /**
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return SyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>
     */
    public SyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoInvoker(
        ListHostRaspProtectHistoryInfoRequest request) {
        return new SyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>(request,
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
     * @return ListHostStatusResponse
     */
    public ListHostStatusResponse listHostStatus(ListHostStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostStatus);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostStatusRequest 请求对象
     * @return SyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public SyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusInvoker(
        ListHostStatusRequest request) {
        return new SyncInvoker<ListHostStatusRequest, ListHostStatusResponse>(request, HssMeta.listHostStatus,
            hcClient);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return ListPasswordComplexityResponse
     */
    public ListPasswordComplexityResponse listPasswordComplexity(ListPasswordComplexityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPasswordComplexity);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPasswordComplexityRequest 请求对象
     * @return SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityInvoker(
        ListPasswordComplexityRequest request) {
        return new SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>(request,
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
     * @return ListPolicyGroupResponse
     */
    public ListPolicyGroupResponse listPolicyGroup(ListPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupInvoker(
        ListPolicyGroupRequest request) {
        return new SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>(request, HssMeta.listPolicyGroup,
            hcClient);
    }

    /**
     * 资产指纹-开放端口信息
     *
     * 资产指纹-开放端口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortStatisticsRequest 请求对象
     * @return ListPortStatisticsResponse
     */
    public ListPortStatisticsResponse listPortStatistics(ListPortStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPortStatistics);
    }

    /**
     * 资产指纹-开放端口信息
     *
     * 资产指纹-开放端口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortStatisticsRequest 请求对象
     * @return SyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>
     */
    public SyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatisticsInvoker(
        ListPortStatisticsRequest request) {
        return new SyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>(request,
            HssMeta.listPortStatistics, hcClient);
    }

    /**
     * 单主机资产指纹-开放端口信息
     *
     * 单主机资产指纹-开放端口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPorts);
    }

    /**
     * 单主机资产指纹-开放端口信息
     *
     * 单主机资产指纹-开放端口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, HssMeta.listPorts, hcClient);
    }

    /**
     * 资产指纹-进程信息
     *
     * 资产指纹-进程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProcessStatisticsRequest 请求对象
     * @return ListProcessStatisticsResponse
     */
    public ListProcessStatisticsResponse listProcessStatistics(ListProcessStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProcessStatistics);
    }

    /**
     * 资产指纹-进程信息
     *
     * 资产指纹-进程信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProcessStatisticsRequest 请求对象
     * @return SyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>
     */
    public SyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatisticsInvoker(
        ListProcessStatisticsRequest request) {
        return new SyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>(request,
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
     * @return ListProtectionPolicyResponse
     */
    public ListProtectionPolicyResponse listProtectionPolicy(ListProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProtectionPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionPolicyRequest 请求对象
     * @return SyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>
     */
    public SyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicyInvoker(
        ListProtectionPolicyRequest request) {
        return new SyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>(request,
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
     * @return ListProtectionServerResponse
     */
    public ListProtectionServerResponse listProtectionServer(ListProtectionServerRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProtectionServer);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectionServerRequest 请求对象
     * @return SyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>
     */
    public SyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServerInvoker(
        ListProtectionServerRequest request) {
        return new SyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>(request,
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
     * @return ListQuotasDetailResponse
     */
    public ListQuotasDetailResponse listQuotasDetail(ListQuotasDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listQuotasDetail);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasDetailRequest 请求对象
     * @return SyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>
     */
    public SyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetailInvoker(
        ListQuotasDetailRequest request) {
        return new SyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>(request, HssMeta.listQuotasDetail,
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
     * @return ListRiskConfigCheckRulesResponse
     */
    public ListRiskConfigCheckRulesResponse listRiskConfigCheckRules(ListRiskConfigCheckRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigCheckRulesRequest 请求对象
     * @return SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>(request,
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
     * @return ListRiskConfigHostsResponse
     */
    public ListRiskConfigHostsResponse listRiskConfigHosts(ListRiskConfigHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigHosts);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigHostsRequest 请求对象
     * @return SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsInvoker(
        ListRiskConfigHostsRequest request) {
        return new SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>(request,
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
     * @return ListRiskConfigsResponse
     */
    public ListRiskConfigsResponse listRiskConfigs(ListRiskConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigs);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRiskConfigsRequest 请求对象
     * @return SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsInvoker(
        ListRiskConfigsRequest request) {
        return new SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>(request, HssMeta.listRiskConfigs,
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
     * @return ListSecurityEventsResponse
     */
    public ListSecurityEventsResponse listSecurityEvents(ListSecurityEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSecurityEventsRequest 请求对象
     * @return SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsInvoker(
        ListSecurityEventsRequest request) {
        return new SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>(request,
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
     * @return ListUserChangeHistoriesResponse
     */
    public ListUserChangeHistoriesResponse listUserChangeHistories(ListUserChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUserChangeHistories);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>
     */
    public SyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistoriesInvoker(
        ListUserChangeHistoriesRequest request) {
        return new SyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>(request,
            HssMeta.listUserChangeHistories, hcClient);
    }

    /**
     * 资产指纹-账号信息
     *
     * 资产指纹-账号信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserStatisticsRequest 请求对象
     * @return ListUserStatisticsResponse
     */
    public ListUserStatisticsResponse listUserStatistics(ListUserStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUserStatistics);
    }

    /**
     * 资产指纹-账号信息
     *
     * 资产指纹-账号信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserStatisticsRequest 请求对象
     * @return SyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>
     */
    public SyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatisticsInvoker(
        ListUserStatisticsRequest request) {
        return new SyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>(request,
            HssMeta.listUserStatistics, hcClient);
    }

    /**
     * 获取资产的账号列表
     *
     * 获取资产的账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUsers);
    }

    /**
     * 获取资产的账号列表
     *
     * 获取资产的账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, HssMeta.listUsers, hcClient);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulHostsRequest 请求对象
     * @return ListVulHostsResponse
     */
    public ListVulHostsResponse listVulHosts(ListVulHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHosts);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulHostsRequest 请求对象
     * @return SyncInvoker<ListVulHostsRequest, ListVulHostsResponse>
     */
    public SyncInvoker<ListVulHostsRequest, ListVulHostsResponse> listVulHostsInvoker(ListVulHostsRequest request) {
        return new SyncInvoker<ListVulHostsRequest, ListVulHostsResponse>(request, HssMeta.listVulHosts, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesInvoker(
        ListVulnerabilitiesRequest request) {
        return new SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>(request,
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
     * @return ListWeakPasswordUsersResponse
     */
    public ListWeakPasswordUsersResponse listWeakPasswordUsers(ListWeakPasswordUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWeakPasswordUsersRequest 请求对象
     * @return SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersInvoker(
        ListWeakPasswordUsersRequest request) {
        return new SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>(request,
            HssMeta.listWeakPasswordUsers, hcClient);
    }

    /**
     * 查询防护列表
     *
     * 查询防护列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWtpProtectHostRequest 请求对象
     * @return ListWtpProtectHostResponse
     */
    public ListWtpProtectHostResponse listWtpProtectHost(ListWtpProtectHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWtpProtectHost);
    }

    /**
     * 查询防护列表
     *
     * 查询防护列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWtpProtectHostRequest 请求对象
     * @return SyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>
     */
    public SyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHostInvoker(
        ListWtpProtectHostRequest request) {
        return new SyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>(request,
            HssMeta.listWtpProtectHost, hcClient);
    }

    /**
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRaspSwitchRequest 请求对象
     * @return SetRaspSwitchResponse
     */
    public SetRaspSwitchResponse setRaspSwitch(SetRaspSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setRaspSwitch);
    }

    /**
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRaspSwitchRequest 请求对象
     * @return SyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>
     */
    public SyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitchInvoker(SetRaspSwitchRequest request) {
        return new SyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>(request, HssMeta.setRaspSwitch, hcClient);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetWtpProtectionStatusInfoRequest 请求对象
     * @return SetWtpProtectionStatusInfoResponse
     */
    public SetWtpProtectionStatusInfoResponse setWtpProtectionStatusInfo(SetWtpProtectionStatusInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setWtpProtectionStatusInfo);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetWtpProtectionStatusInfoRequest 请求对象
     * @return SyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>
     */
    public SyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoInvoker(
        SetWtpProtectionStatusInfoRequest request) {
        return new SyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>(request,
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
     * @return ShowAssetStatisticResponse
     */
    public ShowAssetStatisticResponse showAssetStatistic(ShowAssetStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAssetStatistic);
    }

    /**
     * 统计资产信息，账号、端口、进程等
     *
     * 资产统计信息，账号、端口、进程等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetStatisticRequest 请求对象
     * @return SyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>
     */
    public SyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatisticInvoker(
        ShowAssetStatisticRequest request) {
        return new SyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>(request,
            HssMeta.showAssetStatistic, hcClient);
    }

    /**
     * 查询备份策略信息
     *
     * 查询备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyInfoRequest 请求对象
     * @return ShowBackupPolicyInfoResponse
     */
    public ShowBackupPolicyInfoResponse showBackupPolicyInfo(ShowBackupPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBackupPolicyInfo);
    }

    /**
     * 查询备份策略信息
     *
     * 查询备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyInfoRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>
     */
    public SyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfoInvoker(
        ShowBackupPolicyInfoRequest request) {
        return new SyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>(request,
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
     * @return ShowCheckRuleDetailResponse
     */
    public ShowCheckRuleDetailResponse showCheckRuleDetail(ShowCheckRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCheckRuleDetail);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckRuleDetailRequest 请求对象
     * @return SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailInvoker(
        ShowCheckRuleDetailRequest request) {
        return new SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>(request,
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
     * @return ShowResourceQuotasResponse
     */
    public ShowResourceQuotasResponse showResourceQuotas(ShowResourceQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showResourceQuotas);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceQuotasRequest 请求对象
     * @return SyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>
     */
    public SyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotasInvoker(
        ShowResourceQuotasRequest request) {
        return new SyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>(request,
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
     * @return ShowRiskConfigDetailResponse
     */
    public ShowRiskConfigDetailResponse showRiskConfigDetail(ShowRiskConfigDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRiskConfigDetail);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRiskConfigDetailRequest 请求对象
     * @return SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailInvoker(
        ShowRiskConfigDetailRequest request) {
        return new SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>(request,
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
     * @return StartProtectionResponse
     */
    public StartProtectionResponse startProtection(StartProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.startProtection);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartProtectionRequest 请求对象
     * @return SyncInvoker<StartProtectionRequest, StartProtectionResponse>
     */
    public SyncInvoker<StartProtectionRequest, StartProtectionResponse> startProtectionInvoker(
        StartProtectionRequest request) {
        return new SyncInvoker<StartProtectionRequest, StartProtectionResponse>(request, HssMeta.startProtection,
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
     * @return StopProtectionResponse
     */
    public StopProtectionResponse stopProtection(StopProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.stopProtection);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopProtectionRequest 请求对象
     * @return SyncInvoker<StopProtectionRequest, StopProtectionResponse>
     */
    public SyncInvoker<StopProtectionRequest, StopProtectionResponse> stopProtectionInvoker(
        StopProtectionRequest request) {
        return new SyncInvoker<StopProtectionRequest, StopProtectionResponse>(request, HssMeta.stopProtection,
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
     * @return SwitchHostsProtectStatusResponse
     */
    public SwitchHostsProtectStatusResponse switchHostsProtectStatus(SwitchHostsProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchHostsProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchHostsProtectStatusRequest 请求对象
     * @return SyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>
     */
    public SyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatusInvoker(
        SwitchHostsProtectStatusRequest request) {
        return new SyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>(request,
            HssMeta.switchHostsProtectStatus, hcClient);
    }

    /**
     * 修改备份策略
     *
     * 修改备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackupPolicyInfoRequest 请求对象
     * @return UpdateBackupPolicyInfoResponse
     */
    public UpdateBackupPolicyInfoResponse updateBackupPolicyInfo(UpdateBackupPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateBackupPolicyInfo);
    }

    /**
     * 修改备份策略
     *
     * 修改备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBackupPolicyInfoRequest 请求对象
     * @return SyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>
     */
    public SyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoInvoker(
        UpdateBackupPolicyInfoRequest request) {
        return new SyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>(request,
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
     * @return UpdateProtectionPolicyResponse
     */
    public UpdateProtectionPolicyResponse updateProtectionPolicy(UpdateProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateProtectionPolicy);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProtectionPolicyRequest 请求对象
     * @return SyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>
     */
    public SyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicyInvoker(
        UpdateProtectionPolicyRequest request) {
        return new SyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>(request,
            HssMeta.updateProtectionPolicy, hcClient);
    }

}

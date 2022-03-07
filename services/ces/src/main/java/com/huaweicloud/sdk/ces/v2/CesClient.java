package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
    }

    /** 增加告警资源(资源分组类型的告警规则不支持) 增加告警资源(资源分组类型的告警规则不支持)
     *
     * @param AddAlarmResourcesRequest 请求对象
     * @return AddAlarmResourcesResponse */
    public AddAlarmResourcesResponse addAlarmResources(AddAlarmResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.addAlarmResources);
    }

    /** 增加告警资源(资源分组类型的告警规则不支持) 增加告警资源(资源分组类型的告警规则不支持)
     *
     * @param AddAlarmResourcesRequest 请求对象
     * @return SyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse> */
    public SyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse> addAlarmResourcesInvoker(
        AddAlarmResourcesRequest request) {
        return new SyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse>(request, CesMeta.addAlarmResources,
            hcClient);
    }

    /** 自定义资源分组批量增加关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量增加关联资源
     *
     * @param AddResourceGroupsResourcesBatchRequest 请求对象
     * @return AddResourceGroupsResourcesBatchResponse */
    public AddResourceGroupsResourcesBatchResponse addResourceGroupsResourcesBatch(
        AddResourceGroupsResourcesBatchRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.addResourceGroupsResourcesBatch);
    }

    /** 自定义资源分组批量增加关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量增加关联资源
     *
     * @param AddResourceGroupsResourcesBatchRequest 请求对象
     * @return SyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> */
    public SyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> addResourceGroupsResourcesBatchInvoker(
        AddResourceGroupsResourcesBatchRequest request) {
        return new SyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse>(request,
            CesMeta.addResourceGroupsResourcesBatch, hcClient);
    }

    /** 创建告警 创建告警，接口对应后端API路径open-alarms
     *
     * @param CreateAlarmRequest 请求对象
     * @return CreateAlarmResponse */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarm);
    }

    /** 创建告警 创建告警，接口对应后端API路径open-alarms
     *
     * @param CreateAlarmRequest 请求对象
     * @return SyncInvoker<CreateAlarmRequest, CreateAlarmResponse> */
    public SyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmInvoker(CreateAlarmRequest request) {
        return new SyncInvoker<CreateAlarmRequest, CreateAlarmResponse>(request, CesMeta.createAlarm, hcClient);
    }

    /** 删除告警规则 删除告警规则V2接口，APIG上注册为V2，后端实际上使用的是V1
     *
     * @param DeleteAlarmRequest 请求对象
     * @return DeleteAlarmResponse */
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /** 删除告警规则 删除告警规则V2接口，APIG上注册为V2，后端实际上使用的是V1
     *
     * @param DeleteAlarmRequest 请求对象
     * @return SyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> */
    public SyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmInvoker(DeleteAlarmRequest request) {
        return new SyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>(request, CesMeta.deleteAlarm, hcClient);
    }

    /** 删除告警资源（资源分组类型的告警规则不支持） 删除告警资源（资源分组类型的告警规则不支持）
     *
     * @param DeleteAlarmResourcesRequest 请求对象
     * @return DeleteAlarmResourcesResponse */
    public DeleteAlarmResourcesResponse deleteAlarmResources(DeleteAlarmResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmResources);
    }

    /** 删除告警资源（资源分组类型的告警规则不支持） 删除告警资源（资源分组类型的告警规则不支持）
     *
     * @param DeleteAlarmResourcesRequest 请求对象
     * @return SyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> */
    public SyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> deleteAlarmResourcesInvoker(
        DeleteAlarmResourcesRequest request) {
        return new SyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse>(request,
            CesMeta.deleteAlarmResources, hcClient);
    }

    /** 自定义资源分组批量删除关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量删除关联资源
     *
     * @param DeleteResourceGroupsResourcesBatchRequest 请求对象
     * @return DeleteResourceGroupsResourcesBatchResponse */
    public DeleteResourceGroupsResourcesBatchResponse deleteResourceGroupsResourcesBatch(
        DeleteResourceGroupsResourcesBatchRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteResourceGroupsResourcesBatch);
    }

    /** 自定义资源分组批量删除关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量删除关联资源
     *
     * @param DeleteResourceGroupsResourcesBatchRequest 请求对象
     * @return SyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> */
    public SyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> deleteResourceGroupsResourcesBatchInvoker(
        DeleteResourceGroupsResourcesBatchRequest request) {
        return new SyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse>(
            request, CesMeta.deleteResourceGroupsResourcesBatch, hcClient);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return ListAlarmHistoriesResponse */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> */
    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /** 根据告警ID查询告警资源列表 根据告警ID查询告警资源列表
     *
     * @param ListAlarmResourcesRequest 请求对象
     * @return ListAlarmResourcesResponse */
    public ListAlarmResourcesResponse listAlarmResources(ListAlarmResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmResources);
    }

    /** 根据告警ID查询告警资源列表 根据告警ID查询告警资源列表
     *
     * @param ListAlarmResourcesRequest 请求对象
     * @return SyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse> */
    public SyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse> listAlarmResourcesInvoker(
        ListAlarmResourcesRequest request) {
        return new SyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse>(request,
            CesMeta.listAlarmResources, hcClient);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarms);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> */
    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

    /** 修改告警规则基本信息 修改告警规则基本信息
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return UpdateAlarmActionResponse */
    public UpdateAlarmActionResponse updateAlarmAction(UpdateAlarmActionRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    /** 修改告警规则基本信息 修改告警规则基本信息
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return SyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> */
    public SyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionInvoker(
        UpdateAlarmActionRequest request) {
        return new SyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>(request, CesMeta.updateAlarmAction,
            hcClient);
    }

}

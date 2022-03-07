package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        return new ClientBuilder<>(CesAsyncClient::new);
    }

    /** 增加告警资源(资源分组类型的告警规则不支持) 增加告警资源(资源分组类型的告警规则不支持)
     *
     * @param AddAlarmResourcesRequest 请求对象
     * @return CompletableFuture<AddAlarmResourcesResponse> */
    public CompletableFuture<AddAlarmResourcesResponse> addAlarmResourcesAsync(AddAlarmResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.addAlarmResources);
    }

    /** 增加告警资源(资源分组类型的告警规则不支持) 增加告警资源(资源分组类型的告警规则不支持)
     *
     * @param AddAlarmResourcesRequest 请求对象
     * @return AsyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse> */
    public AsyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse> addAlarmResourcesAsyncInvoker(
        AddAlarmResourcesRequest request) {
        return new AsyncInvoker<AddAlarmResourcesRequest, AddAlarmResourcesResponse>(request, CesMeta.addAlarmResources,
            hcClient);
    }

    /** 自定义资源分组批量增加关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量增加关联资源
     *
     * @param AddResourceGroupsResourcesBatchRequest 请求对象
     * @return CompletableFuture<AddResourceGroupsResourcesBatchResponse> */
    public CompletableFuture<AddResourceGroupsResourcesBatchResponse> addResourceGroupsResourcesBatchAsync(
        AddResourceGroupsResourcesBatchRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.addResourceGroupsResourcesBatch);
    }

    /** 自定义资源分组批量增加关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量增加关联资源
     *
     * @param AddResourceGroupsResourcesBatchRequest 请求对象
     * @return AsyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> */
    public AsyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse> addResourceGroupsResourcesBatchAsyncInvoker(
        AddResourceGroupsResourcesBatchRequest request) {
        return new AsyncInvoker<AddResourceGroupsResourcesBatchRequest, AddResourceGroupsResourcesBatchResponse>(
            request, CesMeta.addResourceGroupsResourcesBatch, hcClient);
    }

    /** 创建告警 创建告警，接口对应后端API路径open-alarms
     *
     * @param CreateAlarmRequest 请求对象
     * @return CompletableFuture<CreateAlarmResponse> */
    public CompletableFuture<CreateAlarmResponse> createAlarmAsync(CreateAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarm);
    }

    /** 创建告警 创建告警，接口对应后端API路径open-alarms
     *
     * @param CreateAlarmRequest 请求对象
     * @return AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse> */
    public AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmAsyncInvoker(CreateAlarmRequest request) {
        return new AsyncInvoker<CreateAlarmRequest, CreateAlarmResponse>(request, CesMeta.createAlarm, hcClient);
    }

    /** 删除告警规则 删除告警规则V2接口，APIG上注册为V2，后端实际上使用的是V1
     *
     * @param DeleteAlarmRequest 请求对象
     * @return CompletableFuture<DeleteAlarmResponse> */
    public CompletableFuture<DeleteAlarmResponse> deleteAlarmAsync(DeleteAlarmRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    /** 删除告警规则 删除告警规则V2接口，APIG上注册为V2，后端实际上使用的是V1
     *
     * @param DeleteAlarmRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> */
    public AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmAsyncInvoker(DeleteAlarmRequest request) {
        return new AsyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>(request, CesMeta.deleteAlarm, hcClient);
    }

    /** 删除告警资源（资源分组类型的告警规则不支持） 删除告警资源（资源分组类型的告警规则不支持）
     *
     * @param DeleteAlarmResourcesRequest 请求对象
     * @return CompletableFuture<DeleteAlarmResourcesResponse> */
    public CompletableFuture<DeleteAlarmResourcesResponse> deleteAlarmResourcesAsync(
        DeleteAlarmResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmResources);
    }

    /** 删除告警资源（资源分组类型的告警规则不支持） 删除告警资源（资源分组类型的告警规则不支持）
     *
     * @param DeleteAlarmResourcesRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> */
    public AsyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse> deleteAlarmResourcesAsyncInvoker(
        DeleteAlarmResourcesRequest request) {
        return new AsyncInvoker<DeleteAlarmResourcesRequest, DeleteAlarmResourcesResponse>(request,
            CesMeta.deleteAlarmResources, hcClient);
    }

    /** 自定义资源分组批量删除关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量删除关联资源
     *
     * @param DeleteResourceGroupsResourcesBatchRequest 请求对象
     * @return CompletableFuture<DeleteResourceGroupsResourcesBatchResponse> */
    public CompletableFuture<DeleteResourceGroupsResourcesBatchResponse> deleteResourceGroupsResourcesBatchAsync(
        DeleteResourceGroupsResourcesBatchRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteResourceGroupsResourcesBatch);
    }

    /** 自定义资源分组批量删除关联资源 给自定义资源分组,即非自动企业项目和标签关联,批量删除关联资源
     *
     * @param DeleteResourceGroupsResourcesBatchRequest 请求对象
     * @return AsyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> */
    public AsyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse> deleteResourceGroupsResourcesBatchAsyncInvoker(
        DeleteResourceGroupsResourcesBatchRequest request) {
        return new AsyncInvoker<DeleteResourceGroupsResourcesBatchRequest, DeleteResourceGroupsResourcesBatchResponse>(
            request, CesMeta.deleteResourceGroupsResourcesBatch, hcClient);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse> */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /** 查询告警历史 查询告警历史列表
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /** 根据告警ID查询告警资源列表 根据告警ID查询告警资源列表
     *
     * @param ListAlarmResourcesRequest 请求对象
     * @return CompletableFuture<ListAlarmResourcesResponse> */
    public CompletableFuture<ListAlarmResourcesResponse> listAlarmResourcesAsync(ListAlarmResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmResources);
    }

    /** 根据告警ID查询告警资源列表 根据告警ID查询告警资源列表
     *
     * @param ListAlarmResourcesRequest 请求对象
     * @return AsyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse> */
    public AsyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse> listAlarmResourcesAsyncInvoker(
        ListAlarmResourcesRequest request) {
        return new AsyncInvoker<ListAlarmResourcesRequest, ListAlarmResourcesResponse>(request,
            CesMeta.listAlarmResources, hcClient);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse> */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarms);
    }

    /** 查询告警列表 查询告警列表,实际上内部对应的是v3的版本号
     *
     * @param ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

    /** 修改告警规则基本信息 修改告警规则基本信息
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return CompletableFuture<UpdateAlarmActionResponse> */
    public CompletableFuture<UpdateAlarmActionResponse> updateAlarmActionAsync(UpdateAlarmActionRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    /** 修改告警规则基本信息 修改告警规则基本信息
     *
     * @param UpdateAlarmActionRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> */
    public AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionAsyncInvoker(
        UpdateAlarmActionRequest request) {
        return new AsyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>(request, CesMeta.updateAlarmAction,
            hcClient);
    }

}

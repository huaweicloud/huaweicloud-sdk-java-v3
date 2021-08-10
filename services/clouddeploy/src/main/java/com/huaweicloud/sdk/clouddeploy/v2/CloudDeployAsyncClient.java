package com.huaweicloud.sdk.clouddeploy.v2;

import com.huaweicloud.sdk.clouddeploy.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudDeployAsyncClient {

    protected HcClient hcClient;

    public CloudDeployAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudDeployAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudDeployAsyncClient::new);
    }

    /** 通过模板新建部署任务 通过模板新建部署任务cloudpipeline流水线调用
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return CompletableFuture<CreateDeployTaskByTemplateResponse> */
    public CompletableFuture<CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsync(
        CreateDeployTaskByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.createDeployTaskByTemplate);
    }

    /** 通过模板新建部署任务 通过模板新建部署任务cloudpipeline流水线调用
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> */
    public AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsyncInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
            CloudDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /** 删除部署任务 Delete Task by id
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return CompletableFuture<DeleteDeployTaskResponse> */
    public CompletableFuture<DeleteDeployTaskResponse> deleteDeployTaskAsync(DeleteDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.deleteDeployTask);
    }

    /** 删除部署任务 Delete Task by id
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> */
    public AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskAsyncInvoker(
        DeleteDeployTaskRequest request) {
        return new AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
            CloudDeployMeta.deleteDeployTask, hcClient);
    }

    /** 获取部署任务详情 Get Task Detail By Id
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowDeployTaskDetailResponse> */
    public CompletableFuture<ShowDeployTaskDetailResponse> showDeployTaskDetailAsync(
        ShowDeployTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.showDeployTaskDetail);
    }

    /** 获取部署任务详情 Get Task Detail By Id
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> */
    public AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailAsyncInvoker(
        ShowDeployTaskDetailRequest request) {
        return new AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
            CloudDeployMeta.showDeployTaskDetail, hcClient);
    }

    /** 启动部署任务 Deploy Task Start
     *
     * @param StartDeployTaskRequest 请求对象
     * @return CompletableFuture<StartDeployTaskResponse> */
    public CompletableFuture<StartDeployTaskResponse> startDeployTaskAsync(StartDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.startDeployTask);
    }

    /** 启动部署任务 Deploy Task Start
     *
     * @param StartDeployTaskRequest 请求对象
     * @return AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> */
    public AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskAsyncInvoker(
        StartDeployTaskRequest request) {
        return new AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
            CloudDeployMeta.startDeployTask, hcClient);
    }

    /** 新建主机 在指定主机组下新建主机
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return CompletableFuture<CreateDeploymentHostResponse> */
    public CompletableFuture<CreateDeploymentHostResponse> createDeploymentHostAsync(
        CreateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.createDeploymentHost);
    }

    /** 新建主机 在指定主机组下新建主机
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> */
    public AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostAsyncInvoker(
        CreateDeploymentHostRequest request) {
        return new AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
            CloudDeployMeta.createDeploymentHost, hcClient);
    }

    /** 删除主机 根据主机id删除主机
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentHostResponse> */
    public CompletableFuture<DeleteDeploymentHostResponse> deleteDeploymentHostAsync(
        DeleteDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.deleteDeploymentHost);
    }

    /** 删除主机 根据主机id删除主机
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> */
    public AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostAsyncInvoker(
        DeleteDeploymentHostRequest request) {
        return new AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>(request,
            CloudDeployMeta.deleteDeploymentHost, hcClient);
    }

    /** 查询主机列表 查询指定主机组下的主机列表
     *
     * @param ListHostsRequest 请求对象
     * @return CompletableFuture<ListHostsResponse> */
    public CompletableFuture<ListHostsResponse> listHostsAsync(ListHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.listHosts);
    }

    /** 查询主机列表 查询指定主机组下的主机列表
     *
     * @param ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse> */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<ListHostsRequest, ListHostsResponse>(request, CloudDeployMeta.listHosts, hcClient);
    }

    /** 查询主机详情 根据主机id查询主机详情
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentHostDetailResponse> */
    public CompletableFuture<ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsync(
        ShowDeploymentHostDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.showDeploymentHostDetail);
    }

    /** 查询主机详情 根据主机id查询主机详情
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> */
    public AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsyncInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>(request,
            CloudDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /** 修改主机 修改主机信息
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentHostResponse> */
    public CompletableFuture<UpdateDeploymentHostResponse> updateDeploymentHostAsync(
        UpdateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.updateDeploymentHost);
    }

    /** 修改主机 修改主机信息
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> */
    public AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostAsyncInvoker(
        UpdateDeploymentHostRequest request) {
        return new AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>(request,
            CloudDeployMeta.updateDeploymentHost, hcClient);
    }

    /** 新建主机组 新建主机组
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<CreateDeploymentGroupResponse> */
    public CompletableFuture<CreateDeploymentGroupResponse> createDeploymentGroupAsync(
        CreateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.createDeploymentGroup);
    }

    /** 新建主机组 新建主机组
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> */
    public AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupAsyncInvoker(
        CreateDeploymentGroupRequest request) {
        return new AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
            CloudDeployMeta.createDeploymentGroup, hcClient);
    }

    /** 删除主机组 根据主机组id删除主机组
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentGroupResponse> */
    public CompletableFuture<DeleteDeploymentGroupResponse> deleteDeploymentGroupAsync(
        DeleteDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.deleteDeploymentGroup);
    }

    /** 删除主机组 根据主机组id删除主机组
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> */
    public AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupAsyncInvoker(
        DeleteDeploymentGroupRequest request) {
        return new AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
            CloudDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /** 查询主机组列表 查询主机组列表
     *
     * @param ListHostGroupsRequest 请求对象
     * @return CompletableFuture<ListHostGroupsResponse> */
    public CompletableFuture<ListHostGroupsResponse> listHostGroupsAsync(ListHostGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.listHostGroups);
    }

    /** 查询主机组列表 查询主机组列表
     *
     * @param ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request, CloudDeployMeta.listHostGroups,
            hcClient);
    }

    /** 查询主机组 根据主机组id查询主机组详情
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentGroupDetailResponse> */
    public CompletableFuture<ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsync(
        ShowDeploymentGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.showDeploymentGroupDetail);
    }

    /** 查询主机组 根据主机组id查询主机组详情
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> */
    public AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsyncInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
            CloudDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /** 修改主机组 修改主机组信息
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentGroupResponse> */
    public CompletableFuture<UpdateDeploymentGroupResponse> updateDeploymentGroupAsync(
        UpdateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudDeployMeta.updateDeploymentGroup);
    }

    /** 修改主机组 修改主机组信息
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> */
    public AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupAsyncInvoker(
        UpdateDeploymentGroupRequest request) {
        return new AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
            CloudDeployMeta.updateDeploymentGroup, hcClient);
    }

}

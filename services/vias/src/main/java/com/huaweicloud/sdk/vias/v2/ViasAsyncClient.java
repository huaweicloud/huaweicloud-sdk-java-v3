package com.huaweicloud.sdk.vias.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vias.v2.model.BatchStartStopTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.BatchStartStopTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateEdgePoolRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateEdgePoolResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoSourceResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteEdgePoolRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteEdgePoolResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoSourceResponse;
import com.huaweicloud.sdk.vias.v2.model.DeployAlgorithmRequest;
import com.huaweicloud.sdk.vias.v2.model.DeployAlgorithmResponse;
import com.huaweicloud.sdk.vias.v2.model.ListBatchTasksRequest;
import com.huaweicloud.sdk.vias.v2.model.ListBatchTasksResponse;
import com.huaweicloud.sdk.vias.v2.model.ListEdgePoolsRequest;
import com.huaweicloud.sdk.vias.v2.model.ListEdgePoolsResponse;
import com.huaweicloud.sdk.vias.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.vias.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.vias.v2.model.ListUserServicesRequest;
import com.huaweicloud.sdk.vias.v2.model.ListUserServicesResponse;
import com.huaweicloud.sdk.vias.v2.model.ListVideoGroupsRequest;
import com.huaweicloud.sdk.vias.v2.model.ListVideoGroupsResponse;
import com.huaweicloud.sdk.vias.v2.model.ListVideoSourcesRequest;
import com.huaweicloud.sdk.vias.v2.model.ListVideoSourcesResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowEdgePoolInfoRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowEdgePoolInfoResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowServiceDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowServiceDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowTaskInfoRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowTaskInfoResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoGroupDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoGroupDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoSourceDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoSourceDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.StartStopTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.StartStopTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.StopDeployAlgorithmRequest;
import com.huaweicloud.sdk.vias.v2.model.StopDeployAlgorithmResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoSourceResponse;

import java.util.concurrent.CompletableFuture;

public class ViasAsyncClient {

    protected HcClient hcClient;

    public ViasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ViasAsyncClient> newBuilder() {
        ClientBuilder<ViasAsyncClient> clientBuilder = new ClientBuilder<>(ViasAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 部署算法
     *
     * 部署算法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployAlgorithmRequest 请求对象
     * @return CompletableFuture<DeployAlgorithmResponse>
     */
    public CompletableFuture<DeployAlgorithmResponse> deployAlgorithmAsync(DeployAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deployAlgorithm);
    }

    /**
     * 部署算法
     *
     * 部署算法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployAlgorithmRequest 请求对象
     * @return AsyncInvoker<DeployAlgorithmRequest, DeployAlgorithmResponse>
     */
    public AsyncInvoker<DeployAlgorithmRequest, DeployAlgorithmResponse> deployAlgorithmAsyncInvoker(
        DeployAlgorithmRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deployAlgorithm, hcClient);
    }

    /**
     * 我的算法服务列表
     *
     * 我的算法服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserServicesRequest 请求对象
     * @return CompletableFuture<ListUserServicesResponse>
     */
    public CompletableFuture<ListUserServicesResponse> listUserServicesAsync(ListUserServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listUserServices);
    }

    /**
     * 我的算法服务列表
     *
     * 我的算法服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserServicesRequest 请求对象
     * @return AsyncInvoker<ListUserServicesRequest, ListUserServicesResponse>
     */
    public AsyncInvoker<ListUserServicesRequest, ListUserServicesResponse> listUserServicesAsyncInvoker(
        ListUserServicesRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listUserServices, hcClient);
    }

    /**
     * 获取服务详情
     *
     * 获取服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return CompletableFuture<ShowServiceDetailResponse>
     */
    public CompletableFuture<ShowServiceDetailResponse> showServiceDetailAsync(ShowServiceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.showServiceDetail);
    }

    /**
     * 获取服务详情
     *
     * 获取服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return AsyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>
     */
    public AsyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetailAsyncInvoker(
        ShowServiceDetailRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.showServiceDetail, hcClient);
    }

    /**
     * 停止算法部署
     *
     * 停止算法部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployAlgorithmRequest 请求对象
     * @return CompletableFuture<StopDeployAlgorithmResponse>
     */
    public CompletableFuture<StopDeployAlgorithmResponse> stopDeployAlgorithmAsync(StopDeployAlgorithmRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.stopDeployAlgorithm);
    }

    /**
     * 停止算法部署
     *
     * 停止算法部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployAlgorithmRequest 请求对象
     * @return AsyncInvoker<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse>
     */
    public AsyncInvoker<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse> stopDeployAlgorithmAsyncInvoker(
        StopDeployAlgorithmRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.stopDeployAlgorithm, hcClient);
    }

    /**
     * 启动/停止批量配置任务
     *
     * 启动/停止批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartStopTaskRequest 请求对象
     * @return CompletableFuture<BatchStartStopTaskResponse>
     */
    public CompletableFuture<BatchStartStopTaskResponse> batchStartStopTaskAsync(BatchStartStopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.batchStartStopTask);
    }

    /**
     * 启动/停止批量配置任务
     *
     * 启动/停止批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartStopTaskRequest 请求对象
     * @return AsyncInvoker<BatchStartStopTaskRequest, BatchStartStopTaskResponse>
     */
    public AsyncInvoker<BatchStartStopTaskRequest, BatchStartStopTaskResponse> batchStartStopTaskAsyncInvoker(
        BatchStartStopTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.batchStartStopTask, hcClient);
    }

    /**
     * 新增批量任务
     *
     * 新增批量任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return CompletableFuture<CreateBatchTaskResponse>
     */
    public CompletableFuture<CreateBatchTaskResponse> createBatchTaskAsync(CreateBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.createBatchTask);
    }

    /**
     * 新增批量任务
     *
     * 新增批量任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>
     */
    public AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskAsyncInvoker(
        CreateBatchTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.createBatchTask, hcClient);
    }

    /**
     * 删除批量配置任务
     *
     * 删除批量配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return CompletableFuture<DeleteBatchTaskResponse>
     */
    public CompletableFuture<DeleteBatchTaskResponse> deleteBatchTaskAsync(DeleteBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deleteBatchTask);
    }

    /**
     * 删除批量配置任务
     *
     * 删除批量配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse>
     */
    public AsyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse> deleteBatchTaskAsyncInvoker(
        DeleteBatchTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deleteBatchTask, hcClient);
    }

    /**
     * 获取批量配置任务列表
     *
     * 获取批量配置任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return CompletableFuture<ListBatchTasksResponse>
     */
    public CompletableFuture<ListBatchTasksResponse> listBatchTasksAsync(ListBatchTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listBatchTasks);
    }

    /**
     * 获取批量配置任务列表
     *
     * 获取批量配置任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>
     */
    public AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksAsyncInvoker(
        ListBatchTasksRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listBatchTasks, hcClient);
    }

    /**
     * 修改批量配置任务
     *
     * 修改批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchTaskRequest 请求对象
     * @return CompletableFuture<UpdateBatchTaskResponse>
     */
    public CompletableFuture<UpdateBatchTaskResponse> updateBatchTaskAsync(UpdateBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.updateBatchTask);
    }

    /**
     * 修改批量配置任务
     *
     * 修改批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchTaskRequest 请求对象
     * @return AsyncInvoker<UpdateBatchTaskRequest, UpdateBatchTaskResponse>
     */
    public AsyncInvoker<UpdateBatchTaskRequest, UpdateBatchTaskResponse> updateBatchTaskAsyncInvoker(
        UpdateBatchTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.updateBatchTask, hcClient);
    }

    /**
     * 创建边缘资源池
     *
     * 创建边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgePoolRequest 请求对象
     * @return CompletableFuture<CreateEdgePoolResponse>
     */
    public CompletableFuture<CreateEdgePoolResponse> createEdgePoolAsync(CreateEdgePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.createEdgePool);
    }

    /**
     * 创建边缘资源池
     *
     * 创建边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgePoolRequest 请求对象
     * @return AsyncInvoker<CreateEdgePoolRequest, CreateEdgePoolResponse>
     */
    public AsyncInvoker<CreateEdgePoolRequest, CreateEdgePoolResponse> createEdgePoolAsyncInvoker(
        CreateEdgePoolRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.createEdgePool, hcClient);
    }

    /**
     * 删除边缘资源池
     *
     * 删除边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgePoolRequest 请求对象
     * @return CompletableFuture<DeleteEdgePoolResponse>
     */
    public CompletableFuture<DeleteEdgePoolResponse> deleteEdgePoolAsync(DeleteEdgePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deleteEdgePool);
    }

    /**
     * 删除边缘资源池
     *
     * 删除边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgePoolRequest 请求对象
     * @return AsyncInvoker<DeleteEdgePoolRequest, DeleteEdgePoolResponse>
     */
    public AsyncInvoker<DeleteEdgePoolRequest, DeleteEdgePoolResponse> deleteEdgePoolAsyncInvoker(
        DeleteEdgePoolRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deleteEdgePool, hcClient);
    }

    /**
     * 查询边缘资源池列表
     *
     * 查询边缘资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgePoolsRequest 请求对象
     * @return CompletableFuture<ListEdgePoolsResponse>
     */
    public CompletableFuture<ListEdgePoolsResponse> listEdgePoolsAsync(ListEdgePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listEdgePools);
    }

    /**
     * 查询边缘资源池列表
     *
     * 查询边缘资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgePoolsRequest 请求对象
     * @return AsyncInvoker<ListEdgePoolsRequest, ListEdgePoolsResponse>
     */
    public AsyncInvoker<ListEdgePoolsRequest, ListEdgePoolsResponse> listEdgePoolsAsyncInvoker(
        ListEdgePoolsRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listEdgePools, hcClient);
    }

    /**
     * 查询边缘资源池详情
     *
     * 查询边缘资源池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgePoolInfoRequest 请求对象
     * @return CompletableFuture<ShowEdgePoolInfoResponse>
     */
    public CompletableFuture<ShowEdgePoolInfoResponse> showEdgePoolInfoAsync(ShowEdgePoolInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.showEdgePoolInfo);
    }

    /**
     * 查询边缘资源池详情
     *
     * 查询边缘资源池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgePoolInfoRequest 请求对象
     * @return AsyncInvoker<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse>
     */
    public AsyncInvoker<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse> showEdgePoolInfoAsyncInvoker(
        ShowEdgePoolInfoRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.showEdgePoolInfo, hcClient);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.createTask, hcClient);
    }

    /**
     * 删除单个任务
     *
     * 删除单个任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deleteTask);
    }

    /**
     * 删除单个任务
     *
     * 删除单个任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deleteTask, hcClient);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listTasks);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listTasks, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 用于获取视频智能分析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowTaskInfoResponse>
     */
    public CompletableFuture<ShowTaskInfoResponse> showTaskInfoAsync(ShowTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.showTaskInfo);
    }

    /**
     * 获取任务详情
     *
     * 用于获取视频智能分析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>
     */
    public AsyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfoAsyncInvoker(
        ShowTaskInfoRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.showTaskInfo, hcClient);
    }

    /**
     * 任务启停
     *
     * 该接口用于启动或停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopTaskRequest 请求对象
     * @return CompletableFuture<StartStopTaskResponse>
     */
    public CompletableFuture<StartStopTaskResponse> startStopTaskAsync(StartStopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.startStopTask);
    }

    /**
     * 任务启停
     *
     * 该接口用于启动或停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopTaskRequest 请求对象
     * @return AsyncInvoker<StartStopTaskRequest, StartStopTaskResponse>
     */
    public AsyncInvoker<StartStopTaskRequest, StartStopTaskResponse> startStopTaskAsyncInvoker(
        StartStopTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.startStopTask, hcClient);
    }

    /**
     * 修改任务
     *
     * 任务修改接口，用于修改任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.updateTask);
    }

    /**
     * 修改任务
     *
     * 任务修改接口，用于修改任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.updateTask, hcClient);
    }

    /**
     * 创建视频源分组
     *
     * 创建视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoGroupRequest 请求对象
     * @return CompletableFuture<CreateVideoGroupResponse>
     */
    public CompletableFuture<CreateVideoGroupResponse> createVideoGroupAsync(CreateVideoGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.createVideoGroup);
    }

    /**
     * 创建视频源分组
     *
     * 创建视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoGroupRequest 请求对象
     * @return AsyncInvoker<CreateVideoGroupRequest, CreateVideoGroupResponse>
     */
    public AsyncInvoker<CreateVideoGroupRequest, CreateVideoGroupResponse> createVideoGroupAsyncInvoker(
        CreateVideoGroupRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.createVideoGroup, hcClient);
    }

    /**
     * 删除视频源分组
     *
     * 删除视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoGroupRequest 请求对象
     * @return CompletableFuture<DeleteVideoGroupResponse>
     */
    public CompletableFuture<DeleteVideoGroupResponse> deleteVideoGroupAsync(DeleteVideoGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deleteVideoGroup);
    }

    /**
     * 删除视频源分组
     *
     * 删除视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoGroupRequest 请求对象
     * @return AsyncInvoker<DeleteVideoGroupRequest, DeleteVideoGroupResponse>
     */
    public AsyncInvoker<DeleteVideoGroupRequest, DeleteVideoGroupResponse> deleteVideoGroupAsyncInvoker(
        DeleteVideoGroupRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deleteVideoGroup, hcClient);
    }

    /**
     * 获取视频源分组列表
     *
     * 获取视频源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoGroupsRequest 请求对象
     * @return CompletableFuture<ListVideoGroupsResponse>
     */
    public CompletableFuture<ListVideoGroupsResponse> listVideoGroupsAsync(ListVideoGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listVideoGroups);
    }

    /**
     * 获取视频源分组列表
     *
     * 获取视频源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoGroupsRequest 请求对象
     * @return AsyncInvoker<ListVideoGroupsRequest, ListVideoGroupsResponse>
     */
    public AsyncInvoker<ListVideoGroupsRequest, ListVideoGroupsResponse> listVideoGroupsAsyncInvoker(
        ListVideoGroupsRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listVideoGroups, hcClient);
    }

    /**
     * 获取视频源分组详情
     *
     * 获取视频源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowVideoGroupDetailResponse>
     */
    public CompletableFuture<ShowVideoGroupDetailResponse> showVideoGroupDetailAsync(
        ShowVideoGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.showVideoGroupDetail);
    }

    /**
     * 获取视频源分组详情
     *
     * 获取视频源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse>
     */
    public AsyncInvoker<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse> showVideoGroupDetailAsyncInvoker(
        ShowVideoGroupDetailRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.showVideoGroupDetail, hcClient);
    }

    /**
     * 更新视频源分组
     *
     * 更新视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoGroupRequest 请求对象
     * @return CompletableFuture<UpdateVideoGroupResponse>
     */
    public CompletableFuture<UpdateVideoGroupResponse> updateVideoGroupAsync(UpdateVideoGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.updateVideoGroup);
    }

    /**
     * 更新视频源分组
     *
     * 更新视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoGroupRequest 请求对象
     * @return AsyncInvoker<UpdateVideoGroupRequest, UpdateVideoGroupResponse>
     */
    public AsyncInvoker<UpdateVideoGroupRequest, UpdateVideoGroupResponse> updateVideoGroupAsyncInvoker(
        UpdateVideoGroupRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.updateVideoGroup, hcClient);
    }

    /**
     * 创建视频源
     *
     * 创建视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoSourceRequest 请求对象
     * @return CompletableFuture<CreateVideoSourceResponse>
     */
    public CompletableFuture<CreateVideoSourceResponse> createVideoSourceAsync(CreateVideoSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.createVideoSource);
    }

    /**
     * 创建视频源
     *
     * 创建视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoSourceRequest 请求对象
     * @return AsyncInvoker<CreateVideoSourceRequest, CreateVideoSourceResponse>
     */
    public AsyncInvoker<CreateVideoSourceRequest, CreateVideoSourceResponse> createVideoSourceAsyncInvoker(
        CreateVideoSourceRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.createVideoSource, hcClient);
    }

    /**
     * 删除视频源
     *
     * 删除视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoSourceRequest 请求对象
     * @return CompletableFuture<DeleteVideoSourceResponse>
     */
    public CompletableFuture<DeleteVideoSourceResponse> deleteVideoSourceAsync(DeleteVideoSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.deleteVideoSource);
    }

    /**
     * 删除视频源
     *
     * 删除视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoSourceRequest 请求对象
     * @return AsyncInvoker<DeleteVideoSourceRequest, DeleteVideoSourceResponse>
     */
    public AsyncInvoker<DeleteVideoSourceRequest, DeleteVideoSourceResponse> deleteVideoSourceAsyncInvoker(
        DeleteVideoSourceRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.deleteVideoSource, hcClient);
    }

    /**
     * 获取视频源列表
     *
     * 获取视频源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoSourcesRequest 请求对象
     * @return CompletableFuture<ListVideoSourcesResponse>
     */
    public CompletableFuture<ListVideoSourcesResponse> listVideoSourcesAsync(ListVideoSourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.listVideoSources);
    }

    /**
     * 获取视频源列表
     *
     * 获取视频源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoSourcesRequest 请求对象
     * @return AsyncInvoker<ListVideoSourcesRequest, ListVideoSourcesResponse>
     */
    public AsyncInvoker<ListVideoSourcesRequest, ListVideoSourcesResponse> listVideoSourcesAsyncInvoker(
        ListVideoSourcesRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.listVideoSources, hcClient);
    }

    /**
     * 获取视频源详情
     *
     * 视频源详情展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoSourceDetailRequest 请求对象
     * @return CompletableFuture<ShowVideoSourceDetailResponse>
     */
    public CompletableFuture<ShowVideoSourceDetailResponse> showVideoSourceDetailAsync(
        ShowVideoSourceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.showVideoSourceDetail);
    }

    /**
     * 获取视频源详情
     *
     * 视频源详情展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoSourceDetailRequest 请求对象
     * @return AsyncInvoker<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse>
     */
    public AsyncInvoker<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse> showVideoSourceDetailAsyncInvoker(
        ShowVideoSourceDetailRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.showVideoSourceDetail, hcClient);
    }

    /**
     * 修改视频源
     *
     * 修改视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoSourceRequest 请求对象
     * @return CompletableFuture<UpdateVideoSourceResponse>
     */
    public CompletableFuture<UpdateVideoSourceResponse> updateVideoSourceAsync(UpdateVideoSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, ViasMeta.updateVideoSource);
    }

    /**
     * 修改视频源
     *
     * 修改视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoSourceRequest 请求对象
     * @return AsyncInvoker<UpdateVideoSourceRequest, UpdateVideoSourceResponse>
     */
    public AsyncInvoker<UpdateVideoSourceRequest, UpdateVideoSourceResponse> updateVideoSourceAsyncInvoker(
        UpdateVideoSourceRequest request) {
        return new AsyncInvoker<>(request, ViasMeta.updateVideoSource, hcClient);
    }

}

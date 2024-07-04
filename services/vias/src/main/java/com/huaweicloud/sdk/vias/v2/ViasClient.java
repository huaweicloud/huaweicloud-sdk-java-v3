package com.huaweicloud.sdk.vias.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class ViasClient {

    protected HcClient hcClient;

    public ViasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ViasClient> newBuilder() {
        ClientBuilder<ViasClient> clientBuilder = new ClientBuilder<>(ViasClient::new);
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
     * @return DeployAlgorithmResponse
     */
    public DeployAlgorithmResponse deployAlgorithm(DeployAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deployAlgorithm);
    }

    /**
     * 部署算法
     *
     * 部署算法
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployAlgorithmRequest 请求对象
     * @return SyncInvoker<DeployAlgorithmRequest, DeployAlgorithmResponse>
     */
    public SyncInvoker<DeployAlgorithmRequest, DeployAlgorithmResponse> deployAlgorithmInvoker(
        DeployAlgorithmRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deployAlgorithm, hcClient);
    }

    /**
     * 我的算法服务列表
     *
     * 我的算法服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserServicesRequest 请求对象
     * @return ListUserServicesResponse
     */
    public ListUserServicesResponse listUserServices(ListUserServicesRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listUserServices);
    }

    /**
     * 我的算法服务列表
     *
     * 我的算法服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserServicesRequest 请求对象
     * @return SyncInvoker<ListUserServicesRequest, ListUserServicesResponse>
     */
    public SyncInvoker<ListUserServicesRequest, ListUserServicesResponse> listUserServicesInvoker(
        ListUserServicesRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listUserServices, hcClient);
    }

    /**
     * 获取服务详情
     *
     * 获取服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return ShowServiceDetailResponse
     */
    public ShowServiceDetailResponse showServiceDetail(ShowServiceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.showServiceDetail);
    }

    /**
     * 获取服务详情
     *
     * 获取服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceDetailRequest 请求对象
     * @return SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse>
     */
    public SyncInvoker<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetailInvoker(
        ShowServiceDetailRequest request) {
        return new SyncInvoker<>(request, ViasMeta.showServiceDetail, hcClient);
    }

    /**
     * 停止算法部署
     *
     * 停止算法部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployAlgorithmRequest 请求对象
     * @return StopDeployAlgorithmResponse
     */
    public StopDeployAlgorithmResponse stopDeployAlgorithm(StopDeployAlgorithmRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.stopDeployAlgorithm);
    }

    /**
     * 停止算法部署
     *
     * 停止算法部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDeployAlgorithmRequest 请求对象
     * @return SyncInvoker<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse>
     */
    public SyncInvoker<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse> stopDeployAlgorithmInvoker(
        StopDeployAlgorithmRequest request) {
        return new SyncInvoker<>(request, ViasMeta.stopDeployAlgorithm, hcClient);
    }

    /**
     * 启动/停止批量配置任务
     *
     * 启动/停止批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartStopTaskRequest 请求对象
     * @return BatchStartStopTaskResponse
     */
    public BatchStartStopTaskResponse batchStartStopTask(BatchStartStopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.batchStartStopTask);
    }

    /**
     * 启动/停止批量配置任务
     *
     * 启动/停止批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartStopTaskRequest 请求对象
     * @return SyncInvoker<BatchStartStopTaskRequest, BatchStartStopTaskResponse>
     */
    public SyncInvoker<BatchStartStopTaskRequest, BatchStartStopTaskResponse> batchStartStopTaskInvoker(
        BatchStartStopTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.batchStartStopTask, hcClient);
    }

    /**
     * 新增批量任务
     *
     * 新增批量任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return CreateBatchTaskResponse
     */
    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.createBatchTask);
    }

    /**
     * 新增批量任务
     *
     * 新增批量任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>
     */
    public SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskInvoker(
        CreateBatchTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.createBatchTask, hcClient);
    }

    /**
     * 删除批量配置任务
     *
     * 删除批量配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return DeleteBatchTaskResponse
     */
    public DeleteBatchTaskResponse deleteBatchTask(DeleteBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deleteBatchTask);
    }

    /**
     * 删除批量配置任务
     *
     * 删除批量配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return SyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse>
     */
    public SyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse> deleteBatchTaskInvoker(
        DeleteBatchTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deleteBatchTask, hcClient);
    }

    /**
     * 获取批量配置任务列表
     *
     * 获取批量配置任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return ListBatchTasksResponse
     */
    public ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listBatchTasks);
    }

    /**
     * 获取批量配置任务列表
     *
     * 获取批量配置任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>
     */
    public SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksInvoker(
        ListBatchTasksRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listBatchTasks, hcClient);
    }

    /**
     * 修改批量配置任务
     *
     * 修改批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchTaskRequest 请求对象
     * @return UpdateBatchTaskResponse
     */
    public UpdateBatchTaskResponse updateBatchTask(UpdateBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.updateBatchTask);
    }

    /**
     * 修改批量配置任务
     *
     * 修改批量配置任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchTaskRequest 请求对象
     * @return SyncInvoker<UpdateBatchTaskRequest, UpdateBatchTaskResponse>
     */
    public SyncInvoker<UpdateBatchTaskRequest, UpdateBatchTaskResponse> updateBatchTaskInvoker(
        UpdateBatchTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.updateBatchTask, hcClient);
    }

    /**
     * 创建边缘资源池
     *
     * 创建边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgePoolRequest 请求对象
     * @return CreateEdgePoolResponse
     */
    public CreateEdgePoolResponse createEdgePool(CreateEdgePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.createEdgePool);
    }

    /**
     * 创建边缘资源池
     *
     * 创建边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEdgePoolRequest 请求对象
     * @return SyncInvoker<CreateEdgePoolRequest, CreateEdgePoolResponse>
     */
    public SyncInvoker<CreateEdgePoolRequest, CreateEdgePoolResponse> createEdgePoolInvoker(
        CreateEdgePoolRequest request) {
        return new SyncInvoker<>(request, ViasMeta.createEdgePool, hcClient);
    }

    /**
     * 删除边缘资源池
     *
     * 删除边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgePoolRequest 请求对象
     * @return DeleteEdgePoolResponse
     */
    public DeleteEdgePoolResponse deleteEdgePool(DeleteEdgePoolRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deleteEdgePool);
    }

    /**
     * 删除边缘资源池
     *
     * 删除边缘资源池
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEdgePoolRequest 请求对象
     * @return SyncInvoker<DeleteEdgePoolRequest, DeleteEdgePoolResponse>
     */
    public SyncInvoker<DeleteEdgePoolRequest, DeleteEdgePoolResponse> deleteEdgePoolInvoker(
        DeleteEdgePoolRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deleteEdgePool, hcClient);
    }

    /**
     * 查询边缘资源池列表
     *
     * 查询边缘资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgePoolsRequest 请求对象
     * @return ListEdgePoolsResponse
     */
    public ListEdgePoolsResponse listEdgePools(ListEdgePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listEdgePools);
    }

    /**
     * 查询边缘资源池列表
     *
     * 查询边缘资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEdgePoolsRequest 请求对象
     * @return SyncInvoker<ListEdgePoolsRequest, ListEdgePoolsResponse>
     */
    public SyncInvoker<ListEdgePoolsRequest, ListEdgePoolsResponse> listEdgePoolsInvoker(ListEdgePoolsRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listEdgePools, hcClient);
    }

    /**
     * 查询边缘资源池详情
     *
     * 查询边缘资源池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgePoolInfoRequest 请求对象
     * @return ShowEdgePoolInfoResponse
     */
    public ShowEdgePoolInfoResponse showEdgePoolInfo(ShowEdgePoolInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.showEdgePoolInfo);
    }

    /**
     * 查询边缘资源池详情
     *
     * 查询边缘资源池详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEdgePoolInfoRequest 请求对象
     * @return SyncInvoker<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse>
     */
    public SyncInvoker<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse> showEdgePoolInfoInvoker(
        ShowEdgePoolInfoRequest request) {
        return new SyncInvoker<>(request, ViasMeta.showEdgePoolInfo, hcClient);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.createTask, hcClient);
    }

    /**
     * 删除单个任务
     *
     * 删除单个任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deleteTask);
    }

    /**
     * 删除单个任务
     *
     * 删除单个任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deleteTask, hcClient);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listTasks);
    }

    /**
     * 获取任务列表
     *
     * 获取任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listTasks, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 用于获取视频智能分析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return ShowTaskInfoResponse
     */
    public ShowTaskInfoResponse showTaskInfo(ShowTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.showTaskInfo);
    }

    /**
     * 获取任务详情
     *
     * 用于获取视频智能分析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse>
     */
    public SyncInvoker<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfoInvoker(ShowTaskInfoRequest request) {
        return new SyncInvoker<>(request, ViasMeta.showTaskInfo, hcClient);
    }

    /**
     * 任务启停
     *
     * 该接口用于启动或停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopTaskRequest 请求对象
     * @return StartStopTaskResponse
     */
    public StartStopTaskResponse startStopTask(StartStopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.startStopTask);
    }

    /**
     * 任务启停
     *
     * 该接口用于启动或停止任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartStopTaskRequest 请求对象
     * @return SyncInvoker<StartStopTaskRequest, StartStopTaskResponse>
     */
    public SyncInvoker<StartStopTaskRequest, StartStopTaskResponse> startStopTaskInvoker(StartStopTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.startStopTask, hcClient);
    }

    /**
     * 修改任务
     *
     * 任务修改接口，用于修改任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.updateTask);
    }

    /**
     * 修改任务
     *
     * 任务修改接口，用于修改任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<>(request, ViasMeta.updateTask, hcClient);
    }

    /**
     * 创建视频源分组
     *
     * 创建视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoGroupRequest 请求对象
     * @return CreateVideoGroupResponse
     */
    public CreateVideoGroupResponse createVideoGroup(CreateVideoGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.createVideoGroup);
    }

    /**
     * 创建视频源分组
     *
     * 创建视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoGroupRequest 请求对象
     * @return SyncInvoker<CreateVideoGroupRequest, CreateVideoGroupResponse>
     */
    public SyncInvoker<CreateVideoGroupRequest, CreateVideoGroupResponse> createVideoGroupInvoker(
        CreateVideoGroupRequest request) {
        return new SyncInvoker<>(request, ViasMeta.createVideoGroup, hcClient);
    }

    /**
     * 删除视频源分组
     *
     * 删除视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoGroupRequest 请求对象
     * @return DeleteVideoGroupResponse
     */
    public DeleteVideoGroupResponse deleteVideoGroup(DeleteVideoGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deleteVideoGroup);
    }

    /**
     * 删除视频源分组
     *
     * 删除视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoGroupRequest 请求对象
     * @return SyncInvoker<DeleteVideoGroupRequest, DeleteVideoGroupResponse>
     */
    public SyncInvoker<DeleteVideoGroupRequest, DeleteVideoGroupResponse> deleteVideoGroupInvoker(
        DeleteVideoGroupRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deleteVideoGroup, hcClient);
    }

    /**
     * 获取视频源分组列表
     *
     * 获取视频源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoGroupsRequest 请求对象
     * @return ListVideoGroupsResponse
     */
    public ListVideoGroupsResponse listVideoGroups(ListVideoGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listVideoGroups);
    }

    /**
     * 获取视频源分组列表
     *
     * 获取视频源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoGroupsRequest 请求对象
     * @return SyncInvoker<ListVideoGroupsRequest, ListVideoGroupsResponse>
     */
    public SyncInvoker<ListVideoGroupsRequest, ListVideoGroupsResponse> listVideoGroupsInvoker(
        ListVideoGroupsRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listVideoGroups, hcClient);
    }

    /**
     * 获取视频源分组详情
     *
     * 获取视频源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoGroupDetailRequest 请求对象
     * @return ShowVideoGroupDetailResponse
     */
    public ShowVideoGroupDetailResponse showVideoGroupDetail(ShowVideoGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.showVideoGroupDetail);
    }

    /**
     * 获取视频源分组详情
     *
     * 获取视频源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse>
     */
    public SyncInvoker<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse> showVideoGroupDetailInvoker(
        ShowVideoGroupDetailRequest request) {
        return new SyncInvoker<>(request, ViasMeta.showVideoGroupDetail, hcClient);
    }

    /**
     * 更新视频源分组
     *
     * 更新视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoGroupRequest 请求对象
     * @return UpdateVideoGroupResponse
     */
    public UpdateVideoGroupResponse updateVideoGroup(UpdateVideoGroupRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.updateVideoGroup);
    }

    /**
     * 更新视频源分组
     *
     * 更新视频源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoGroupRequest 请求对象
     * @return SyncInvoker<UpdateVideoGroupRequest, UpdateVideoGroupResponse>
     */
    public SyncInvoker<UpdateVideoGroupRequest, UpdateVideoGroupResponse> updateVideoGroupInvoker(
        UpdateVideoGroupRequest request) {
        return new SyncInvoker<>(request, ViasMeta.updateVideoGroup, hcClient);
    }

    /**
     * 创建视频源
     *
     * 创建视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoSourceRequest 请求对象
     * @return CreateVideoSourceResponse
     */
    public CreateVideoSourceResponse createVideoSource(CreateVideoSourceRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.createVideoSource);
    }

    /**
     * 创建视频源
     *
     * 创建视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoSourceRequest 请求对象
     * @return SyncInvoker<CreateVideoSourceRequest, CreateVideoSourceResponse>
     */
    public SyncInvoker<CreateVideoSourceRequest, CreateVideoSourceResponse> createVideoSourceInvoker(
        CreateVideoSourceRequest request) {
        return new SyncInvoker<>(request, ViasMeta.createVideoSource, hcClient);
    }

    /**
     * 删除视频源
     *
     * 删除视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoSourceRequest 请求对象
     * @return DeleteVideoSourceResponse
     */
    public DeleteVideoSourceResponse deleteVideoSource(DeleteVideoSourceRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.deleteVideoSource);
    }

    /**
     * 删除视频源
     *
     * 删除视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoSourceRequest 请求对象
     * @return SyncInvoker<DeleteVideoSourceRequest, DeleteVideoSourceResponse>
     */
    public SyncInvoker<DeleteVideoSourceRequest, DeleteVideoSourceResponse> deleteVideoSourceInvoker(
        DeleteVideoSourceRequest request) {
        return new SyncInvoker<>(request, ViasMeta.deleteVideoSource, hcClient);
    }

    /**
     * 获取视频源列表
     *
     * 获取视频源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoSourcesRequest 请求对象
     * @return ListVideoSourcesResponse
     */
    public ListVideoSourcesResponse listVideoSources(ListVideoSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.listVideoSources);
    }

    /**
     * 获取视频源列表
     *
     * 获取视频源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoSourcesRequest 请求对象
     * @return SyncInvoker<ListVideoSourcesRequest, ListVideoSourcesResponse>
     */
    public SyncInvoker<ListVideoSourcesRequest, ListVideoSourcesResponse> listVideoSourcesInvoker(
        ListVideoSourcesRequest request) {
        return new SyncInvoker<>(request, ViasMeta.listVideoSources, hcClient);
    }

    /**
     * 获取视频源详情
     *
     * 视频源详情展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoSourceDetailRequest 请求对象
     * @return ShowVideoSourceDetailResponse
     */
    public ShowVideoSourceDetailResponse showVideoSourceDetail(ShowVideoSourceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.showVideoSourceDetail);
    }

    /**
     * 获取视频源详情
     *
     * 视频源详情展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoSourceDetailRequest 请求对象
     * @return SyncInvoker<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse>
     */
    public SyncInvoker<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse> showVideoSourceDetailInvoker(
        ShowVideoSourceDetailRequest request) {
        return new SyncInvoker<>(request, ViasMeta.showVideoSourceDetail, hcClient);
    }

    /**
     * 修改视频源
     *
     * 修改视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoSourceRequest 请求对象
     * @return UpdateVideoSourceResponse
     */
    public UpdateVideoSourceResponse updateVideoSource(UpdateVideoSourceRequest request) {
        return hcClient.syncInvokeHttp(request, ViasMeta.updateVideoSource);
    }

    /**
     * 修改视频源
     *
     * 修改视频源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoSourceRequest 请求对象
     * @return SyncInvoker<UpdateVideoSourceRequest, UpdateVideoSourceResponse>
     */
    public SyncInvoker<UpdateVideoSourceRequest, UpdateVideoSourceResponse> updateVideoSourceInvoker(
        UpdateVideoSourceRequest request) {
        return new SyncInvoker<>(request, ViasMeta.updateVideoSource, hcClient);
    }

}

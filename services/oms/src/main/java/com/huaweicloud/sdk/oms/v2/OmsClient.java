package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.oms.v2.model.*;

public class OmsClient {

    protected HcClient hcClient;

    public OmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsClient> newBuilder() {
        return new ClientBuilder<>(OmsClient::new);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return CreateSyncEventsResponse
     */
    public CreateSyncEventsResponse createSyncEvents(CreateSyncEventsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createSyncEvents);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步(目前只支持华北-北京四、华东-上海一地区)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return SyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>
     */
    public SyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEventsInvoker(
        CreateSyncEventsRequest request) {
        return new SyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>(request, OmsMeta.createSyncEvents,
            hcClient);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createTask);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, OmsMeta.createTask, hcClient);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteTask);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, OmsMeta.deleteTask, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listTasks);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<ListTasksRequest, ListTasksResponse>(request, OmsMeta.listTasks, hcClient);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showTask);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, OmsMeta.showTask, hcClient);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startTask);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<StartTaskRequest, StartTaskResponse>(request, OmsMeta.startTask, hcClient);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopTask);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<StopTaskRequest, StopTaskResponse>(request, OmsMeta.stopTask, hcClient);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return UpdateBandwidthPolicyResponse
     */
    public UpdateBandwidthPolicyResponse updateBandwidthPolicy(UpdateBandwidthPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return SyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>
     */
    public SyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicyInvoker(
        UpdateBandwidthPolicyRequest request) {
        return new SyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>(request,
            OmsMeta.updateBandwidthPolicy, hcClient);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return CreateTaskGroupResponse
     */
    public CreateTaskGroupResponse createTaskGroup(CreateTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createTaskGroup);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return SyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>
     */
    public SyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroupInvoker(
        CreateTaskGroupRequest request) {
        return new SyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>(request, OmsMeta.createTaskGroup,
            hcClient);
    }

    /**
     * 删除指定ID的迁移任务组
     *
     * 删除指定的迁移任务组.（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return DeleteTaskGroupResponse
     */
    public DeleteTaskGroupResponse deleteTaskGroup(DeleteTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteTaskGroup);
    }

    /**
     * 删除指定ID的迁移任务组
     *
     * 删除指定的迁移任务组.（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return SyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>
     */
    public SyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroupInvoker(
        DeleteTaskGroupRequest request) {
        return new SyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>(request, OmsMeta.deleteTaskGroup,
            hcClient);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return ListTaskGroupResponse
     */
    public ListTaskGroupResponse listTaskGroup(ListTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listTaskGroup);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return SyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>
     */
    public SyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroupInvoker(ListTaskGroupRequest request) {
        return new SyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>(request, OmsMeta.listTaskGroup, hcClient);
    }

    /**
     * 对已经失败的指定ID迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定ID的迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return RetryTaskGroupResponse
     */
    public RetryTaskGroupResponse retryTaskGroup(RetryTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.retryTaskGroup);
    }

    /**
     * 对已经失败的指定ID迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定ID的迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return SyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>
     */
    public SyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroupInvoker(
        RetryTaskGroupRequest request) {
        return new SyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>(request, OmsMeta.retryTaskGroup,
            hcClient);
    }

    /**
     * 获取指定ID的taskgroup信息
     *
     * 获取指定ID的taskgroup信息（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return ShowTaskGroupResponse
     */
    public ShowTaskGroupResponse showTaskGroup(ShowTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showTaskGroup);
    }

    /**
     * 获取指定ID的taskgroup信息
     *
     * 获取指定ID的taskgroup信息（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return SyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>
     */
    public SyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroupInvoker(ShowTaskGroupRequest request) {
        return new SyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>(request, OmsMeta.showTaskGroup, hcClient);
    }

    /**
     * 恢复指定ID的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定ID的迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return StartTaskGroupResponse
     */
    public StartTaskGroupResponse startTaskGroup(StartTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startTaskGroup);
    }

    /**
     * 恢复指定ID的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定ID的迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return SyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>
     */
    public SyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroupInvoker(
        StartTaskGroupRequest request) {
        return new SyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>(request, OmsMeta.startTaskGroup,
            hcClient);
    }

    /**
     * 暂停指定ID的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return StopTaskGroupResponse
     */
    public StopTaskGroupResponse stopTaskGroup(StopTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopTaskGroup);
    }

    /**
     * 暂停指定ID的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return SyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>
     */
    public SyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroupInvoker(StopTaskGroupRequest request) {
        return new SyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>(request, OmsMeta.stopTaskGroup, hcClient);
    }

    /**
     * 更新指定ID的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return UpdateTaskGroupResponse
     */
    public UpdateTaskGroupResponse updateTaskGroup(UpdateTaskGroupRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updateTaskGroup);
    }

    /**
     * 更新指定ID的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略（目前只支持华南-广州用户友好环境、西南-贵阳一、亚太-香港和亚太-新加坡地区）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return SyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>
     */
    public SyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroupInvoker(
        UpdateTaskGroupRequest request) {
        return new SyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>(request, OmsMeta.updateTaskGroup,
            hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, OmsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
     */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showApiInfo);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoInvoker(ShowApiInfoRequest request) {
        return new SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, OmsMeta.showApiInfo, hcClient);
    }

}

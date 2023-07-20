package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupResponse;

import java.util.concurrent.CompletableFuture;

public class OmsAsyncClient {

    protected HcClient hcClient;

    public OmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsAsyncClient> newBuilder() {
        ClientBuilder<OmsAsyncClient> clientBuilder = new ClientBuilder<>(OmsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return CompletableFuture<CreateSyncEventsResponse>
     */
    public CompletableFuture<CreateSyncEventsResponse> createSyncEventsAsync(CreateSyncEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createSyncEvents);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSyncEventsRequest 请求对象
     * @return AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>
     */
    public AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEventsAsyncInvoker(
        CreateSyncEventsRequest request) {
        return new AsyncInvoker<CreateSyncEventsRequest, CreateSyncEventsResponse>(request, OmsMeta.createSyncEvents,
            hcClient);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createTask);
    }

    /**
     * 创建迁移任务
     *
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, OmsMeta.createTask, hcClient);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteTask);
    }

    /**
     * 删除迁移任务
     *
     * 调用该接口删除迁移任务。
     * 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, OmsMeta.deleteTask, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listTasks);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询用户账户下的所有任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<ListTasksRequest, ListTasksResponse>(request, OmsMeta.listTasks, hcClient);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showTask);
    }

    /**
     * 查询指定ID的任务详情
     *
     * 查询指定ID的任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, OmsMeta.showTask, hcClient);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return CompletableFuture<StartTaskResponse>
     */
    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startTask);
    }

    /**
     * 启动迁移任务
     *
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
     * @return AsyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public AsyncInvoker<StartTaskRequest, StartTaskResponse> startTaskAsyncInvoker(StartTaskRequest request) {
        return new AsyncInvoker<StartTaskRequest, StartTaskResponse>(request, OmsMeta.startTask, hcClient);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse>
     */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopTask);
    }

    /**
     * 暂停迁移任务
     *
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<StopTaskRequest, StopTaskResponse>(request, OmsMeta.stopTask, hcClient);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthPolicyResponse>
     */
    public CompletableFuture<UpdateBandwidthPolicyResponse> updateBandwidthPolicyAsync(
        UpdateBandwidthPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    /**
     * 更新任务带宽策略
     *
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>
     */
    public AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicyAsyncInvoker(
        UpdateBandwidthPolicyRequest request) {
        return new AsyncInvoker<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse>(request,
            OmsMeta.updateBandwidthPolicy, hcClient);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return CompletableFuture<CreateTaskGroupResponse>
     */
    public CompletableFuture<CreateTaskGroupResponse> createTaskGroupAsync(CreateTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createTaskGroup);
    }

    /**
     * 创建迁移任务组
     *
     * 创建迁移任务组，创建成功后，迁移任务组会自动创建迁移任务，不需要额外调用启动任务命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskGroupRequest 请求对象
     * @return AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>
     */
    public AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroupAsyncInvoker(
        CreateTaskGroupRequest request) {
        return new AsyncInvoker<CreateTaskGroupRequest, CreateTaskGroupResponse>(request, OmsMeta.createTaskGroup,
            hcClient);
    }

    /**
     * 删除指定ID的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return CompletableFuture<DeleteTaskGroupResponse>
     */
    public CompletableFuture<DeleteTaskGroupResponse> deleteTaskGroupAsync(DeleteTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteTaskGroup);
    }

    /**
     * 删除指定ID的迁移任务组
     *
     * 删除指定的迁移任务组.
     * 创建任务中、监控中、暂停中状态的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>
     */
    public AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroupAsyncInvoker(
        DeleteTaskGroupRequest request) {
        return new AsyncInvoker<DeleteTaskGroupRequest, DeleteTaskGroupResponse>(request, OmsMeta.deleteTaskGroup,
            hcClient);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return CompletableFuture<ListTaskGroupResponse>
     */
    public CompletableFuture<ListTaskGroupResponse> listTaskGroupAsync(ListTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listTaskGroup);
    }

    /**
     * 查询迁移任务组列表
     *
     * 查询用户账户下的任务组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskGroupRequest 请求对象
     * @return AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>
     */
    public AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroupAsyncInvoker(
        ListTaskGroupRequest request) {
        return new AsyncInvoker<ListTaskGroupRequest, ListTaskGroupResponse>(request, OmsMeta.listTaskGroup, hcClient);
    }

    /**
     * 对已经失败的指定ID迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定ID的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return CompletableFuture<RetryTaskGroupResponse>
     */
    public CompletableFuture<RetryTaskGroupResponse> retryTaskGroupAsync(RetryTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.retryTaskGroup);
    }

    /**
     * 对已经失败的指定ID迁移任务组进行重启
     *
     * 当迁移任务组处于迁移失败状态时，调用该接口重启指定ID的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryTaskGroupRequest 请求对象
     * @return AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>
     */
    public AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroupAsyncInvoker(
        RetryTaskGroupRequest request) {
        return new AsyncInvoker<RetryTaskGroupRequest, RetryTaskGroupResponse>(request, OmsMeta.retryTaskGroup,
            hcClient);
    }

    /**
     * 获取指定ID的taskgroup信息
     *
     * 获取指定ID的taskgroup信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return CompletableFuture<ShowTaskGroupResponse>
     */
    public CompletableFuture<ShowTaskGroupResponse> showTaskGroupAsync(ShowTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showTaskGroup);
    }

    /**
     * 获取指定ID的taskgroup信息
     *
     * 获取指定ID的taskgroup信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskGroupRequest 请求对象
     * @return AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>
     */
    public AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroupAsyncInvoker(
        ShowTaskGroupRequest request) {
        return new AsyncInvoker<ShowTaskGroupRequest, ShowTaskGroupResponse>(request, OmsMeta.showTaskGroup, hcClient);
    }

    /**
     * 恢复指定ID的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定ID的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return CompletableFuture<StartTaskGroupResponse>
     */
    public CompletableFuture<StartTaskGroupResponse> startTaskGroupAsync(StartTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startTaskGroup);
    }

    /**
     * 恢复指定ID的迁移任务组
     *
     * 当迁移任务组处于暂停状态时，调用该接口启动指定ID的迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskGroupRequest 请求对象
     * @return AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>
     */
    public AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroupAsyncInvoker(
        StartTaskGroupRequest request) {
        return new AsyncInvoker<StartTaskGroupRequest, StartTaskGroupResponse>(request, OmsMeta.startTaskGroup,
            hcClient);
    }

    /**
     * 暂停指定ID的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return CompletableFuture<StopTaskGroupResponse>
     */
    public CompletableFuture<StopTaskGroupResponse> stopTaskGroupAsync(StopTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopTaskGroup);
    }

    /**
     * 暂停指定ID的迁移任务组
     *
     * 当迁移任务组处于创建任务中或监控中时，调用该接口暂停指定迁移任务组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskGroupRequest 请求对象
     * @return AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>
     */
    public AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroupAsyncInvoker(
        StopTaskGroupRequest request) {
        return new AsyncInvoker<StopTaskGroupRequest, StopTaskGroupResponse>(request, OmsMeta.stopTaskGroup, hcClient);
    }

    /**
     * 更新指定ID的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return CompletableFuture<UpdateTaskGroupResponse>
     */
    public CompletableFuture<UpdateTaskGroupResponse> updateTaskGroupAsync(UpdateTaskGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.updateTaskGroup);
    }

    /**
     * 更新指定ID的迁移任务组的流控策略
     *
     * 当迁移任务组未执行完成时，修改迁移任务组的流量控制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>
     */
    public AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroupAsyncInvoker(
        UpdateTaskGroupRequest request) {
        return new AsyncInvoker<UpdateTaskGroupRequest, UpdateTaskGroupResponse>(request, OmsMeta.updateTaskGroup,
            hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, OmsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return CompletableFuture<ShowApiInfoResponse>
     */
    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showApiInfo);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询对象存储迁移服务指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, OmsMeta.showApiInfo, hcClient);
    }

}

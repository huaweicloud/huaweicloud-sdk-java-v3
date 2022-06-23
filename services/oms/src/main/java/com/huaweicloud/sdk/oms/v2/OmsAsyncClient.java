package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.oms.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class OmsAsyncClient {

    protected HcClient hcClient;

    public OmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(OmsAsyncClient::new);
    }

    /**
     * 创建同步事件
     *
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步（目前只支持华北-北京四、华东-上海一地区）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 源端有对象需要进行同步时，调用该接口创建一个同步事件，系统将根据同步事件中包含的对象名称进行同步（目前只支持华北-北京四、华东-上海一地区）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询API版本信息列表
     *
     * 查询对象存储迁移服务的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, OmsMeta.showApiInfo, hcClient);
    }

}

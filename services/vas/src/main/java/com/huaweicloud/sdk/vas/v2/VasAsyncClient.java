package com.huaweicloud.sdk.vas.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vas.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class VasAsyncClient {

    protected HcClient hcClient;

    public VasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VasAsyncClient> newBuilder() {
        return new ClientBuilder<>(VasAsyncClient::new);
    }

    /** 创建服务作业 该接口用于创建服务作业
     *
     * @param CreateTasksRequest 请求对象
     * @return CompletableFuture<CreateTasksResponse> */
    public CompletableFuture<CreateTasksResponse> createTasksAsync(CreateTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.createTasks);
    }

    /** 创建服务作业 该接口用于创建服务作业
     *
     * @param CreateTasksRequest 请求对象
     * @return AsyncInvoker<CreateTasksRequest, CreateTasksResponse> */
    public AsyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksAsyncInvoker(CreateTasksRequest request) {
        return new AsyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, VasMeta.createTasks, hcClient);
    }

    /** 删除服务作业 该接口用于删除服务作业
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse> */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.deleteTask);
    }

    /** 删除服务作业 该接口用于删除服务作业
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, VasMeta.deleteTask, hcClient);
    }

    /** 获取服务作业列表 该接口用于获取服务作业列表
     *
     * @param ListTasksDetailsRequest 请求对象
     * @return CompletableFuture<ListTasksDetailsResponse> */
    public CompletableFuture<ListTasksDetailsResponse> listTasksDetailsAsync(ListTasksDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.listTasksDetails);
    }

    /** 获取服务作业列表 该接口用于获取服务作业列表
     *
     * @param ListTasksDetailsRequest 请求对象
     * @return AsyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse> */
    public AsyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetailsAsyncInvoker(
        ListTasksDetailsRequest request) {
        return new AsyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>(request, VasMeta.listTasksDetails,
            hcClient);
    }

    /** 查询服务作业 该接口用于查询服务作业
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse> */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.showTask);
    }

    /** 查询服务作业 该接口用于查询服务作业
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse> */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, VasMeta.showTask, hcClient);
    }

    /** 启动服务作业 该接口用于启动服务作业
     *
     * @param StartTaskRequest 请求对象
     * @return CompletableFuture<StartTaskResponse> */
    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.startTask);
    }

    /** 启动服务作业 该接口用于启动服务作业
     *
     * @param StartTaskRequest 请求对象
     * @return AsyncInvoker<StartTaskRequest, StartTaskResponse> */
    public AsyncInvoker<StartTaskRequest, StartTaskResponse> startTaskAsyncInvoker(StartTaskRequest request) {
        return new AsyncInvoker<StartTaskRequest, StartTaskResponse>(request, VasMeta.startTask, hcClient);
    }

    /** 停止服务作业 该接口用于停止服务作业
     *
     * @param StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse> */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.stopTask);
    }

    /** 停止服务作业 该接口用于停止服务作业
     *
     * @param StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse> */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<StopTaskRequest, StopTaskResponse>(request, VasMeta.stopTask, hcClient);
    }

    /** 更新服务作业 该接口用于更新服务作业
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse> */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.updateTask);
    }

    /** 更新服务作业 该接口用于更新服务作业
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, VasMeta.updateTask, hcClient);
    }

}

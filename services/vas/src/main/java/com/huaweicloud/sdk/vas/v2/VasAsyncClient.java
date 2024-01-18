package com.huaweicloud.sdk.vas.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vas.v2.model.CreateTasksRequest;
import com.huaweicloud.sdk.vas.v2.model.CreateTasksResponse;
import com.huaweicloud.sdk.vas.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.vas.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.vas.v2.model.ListTasksDetailsRequest;
import com.huaweicloud.sdk.vas.v2.model.ListTasksDetailsResponse;
import com.huaweicloud.sdk.vas.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.vas.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.vas.v2.model.StartTaskRequest;
import com.huaweicloud.sdk.vas.v2.model.StartTaskResponse;
import com.huaweicloud.sdk.vas.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.vas.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.vas.v2.model.UpdateTaskRequest;
import com.huaweicloud.sdk.vas.v2.model.UpdateTaskResponse;

import java.util.concurrent.CompletableFuture;

public class VasAsyncClient {

    protected HcClient hcClient;

    public VasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VasAsyncClient> newBuilder() {
        ClientBuilder<VasAsyncClient> clientBuilder = new ClientBuilder<>(VasAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建服务作业
     *
     * 该接口用于创建服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTasksRequest 请求对象
     * @return CompletableFuture<CreateTasksResponse>
     */
    public CompletableFuture<CreateTasksResponse> createTasksAsync(CreateTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.createTasks);
    }

    /**
     * 创建服务作业
     *
     * 该接口用于创建服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTasksRequest 请求对象
     * @return AsyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public AsyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksAsyncInvoker(CreateTasksRequest request) {
        return new AsyncInvoker<>(request, VasMeta.createTasks, hcClient);
    }

    /**
     * 删除服务作业
     *
     * 该接口用于删除服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.deleteTask);
    }

    /**
     * 删除服务作业
     *
     * 该接口用于删除服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<>(request, VasMeta.deleteTask, hcClient);
    }

    /**
     * 获取服务作业列表
     *
     * 该接口用于获取服务作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksDetailsRequest 请求对象
     * @return CompletableFuture<ListTasksDetailsResponse>
     */
    public CompletableFuture<ListTasksDetailsResponse> listTasksDetailsAsync(ListTasksDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.listTasksDetails);
    }

    /**
     * 获取服务作业列表
     *
     * 该接口用于获取服务作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksDetailsRequest 请求对象
     * @return AsyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>
     */
    public AsyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetailsAsyncInvoker(
        ListTasksDetailsRequest request) {
        return new AsyncInvoker<>(request, VasMeta.listTasksDetails, hcClient);
    }

    /**
     * 查询服务作业
     *
     * 该接口用于查询服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.showTask);
    }

    /**
     * 查询服务作业
     *
     * 该接口用于查询服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<>(request, VasMeta.showTask, hcClient);
    }

    /**
     * 启动服务作业
     *
     * 该接口用于启动服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return CompletableFuture<StartTaskResponse>
     */
    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.startTask);
    }

    /**
     * 启动服务作业
     *
     * 该接口用于启动服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return AsyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public AsyncInvoker<StartTaskRequest, StartTaskResponse> startTaskAsyncInvoker(StartTaskRequest request) {
        return new AsyncInvoker<>(request, VasMeta.startTask, hcClient);
    }

    /**
     * 停止服务作业
     *
     * 该接口用于停止服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return CompletableFuture<StopTaskResponse>
     */
    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.stopTask);
    }

    /**
     * 停止服务作业
     *
     * 该接口用于停止服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return AsyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public AsyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskAsyncInvoker(StopTaskRequest request) {
        return new AsyncInvoker<>(request, VasMeta.stopTask, hcClient);
    }

    /**
     * 更新服务作业
     *
     * 该接口用于更新服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VasMeta.updateTask);
    }

    /**
     * 更新服务作业
     *
     * 该接口用于更新服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<>(request, VasMeta.updateTask, hcClient);
    }

}

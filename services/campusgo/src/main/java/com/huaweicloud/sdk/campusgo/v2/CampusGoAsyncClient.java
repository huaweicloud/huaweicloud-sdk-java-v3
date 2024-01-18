package com.huaweicloud.sdk.campusgo.v2;

import com.huaweicloud.sdk.campusgo.v2.model.CreateTasksRequest;
import com.huaweicloud.sdk.campusgo.v2.model.CreateTasksResponse;
import com.huaweicloud.sdk.campusgo.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.campusgo.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.campusgo.v2.model.ListTasksDetailsRequest;
import com.huaweicloud.sdk.campusgo.v2.model.ListTasksDetailsResponse;
import com.huaweicloud.sdk.campusgo.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.campusgo.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CampusGoAsyncClient {

    protected HcClient hcClient;

    public CampusGoAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CampusGoAsyncClient> newBuilder() {
        ClientBuilder<CampusGoAsyncClient> clientBuilder = new ClientBuilder<>(CampusGoAsyncClient::new);
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
        return hcClient.asyncInvokeHttp(request, CampusGoMeta.createTasks);
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
        return new AsyncInvoker<>(request, CampusGoMeta.createTasks, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CampusGoMeta.deleteTask);
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
        return new AsyncInvoker<>(request, CampusGoMeta.deleteTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CampusGoMeta.listTasksDetails);
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
        return new AsyncInvoker<>(request, CampusGoMeta.listTasksDetails, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CampusGoMeta.showTask);
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
        return new AsyncInvoker<>(request, CampusGoMeta.showTask, hcClient);
    }

}

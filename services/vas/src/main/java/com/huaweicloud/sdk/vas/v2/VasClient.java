package com.huaweicloud.sdk.vas.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class VasClient {

    protected HcClient hcClient;

    public VasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VasClient> newBuilder() {
        ClientBuilder<VasClient> clientBuilder = new ClientBuilder<>(VasClient::new);
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
     * @return CreateTasksResponse
     */
    public CreateTasksResponse createTasks(CreateTasksRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.createTasks);
    }

    /**
     * 创建服务作业
     *
     * 该接口用于创建服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTasksRequest 请求对象
     * @return SyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public SyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksInvoker(CreateTasksRequest request) {
        return new SyncInvoker<>(request, VasMeta.createTasks, hcClient);
    }

    /**
     * 删除服务作业
     *
     * 该接口用于删除服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.deleteTask);
    }

    /**
     * 删除服务作业
     *
     * 该接口用于删除服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, VasMeta.deleteTask, hcClient);
    }

    /**
     * 获取服务作业列表
     *
     * 该接口用于获取服务作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksDetailsRequest 请求对象
     * @return ListTasksDetailsResponse
     */
    public ListTasksDetailsResponse listTasksDetails(ListTasksDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.listTasksDetails);
    }

    /**
     * 获取服务作业列表
     *
     * 该接口用于获取服务作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksDetailsRequest 请求对象
     * @return SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>
     */
    public SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetailsInvoker(
        ListTasksDetailsRequest request) {
        return new SyncInvoker<>(request, VasMeta.listTasksDetails, hcClient);
    }

    /**
     * 查询服务作业
     *
     * 该接口用于查询服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.showTask);
    }

    /**
     * 查询服务作业
     *
     * 该接口用于查询服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, VasMeta.showTask, hcClient);
    }

    /**
     * 启动服务作业
     *
     * 该接口用于启动服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.startTask);
    }

    /**
     * 启动服务作业
     *
     * 该接口用于启动服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<>(request, VasMeta.startTask, hcClient);
    }

    /**
     * 停止服务作业
     *
     * 该接口用于停止服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.stopTask);
    }

    /**
     * 停止服务作业
     *
     * 该接口用于停止服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<>(request, VasMeta.stopTask, hcClient);
    }

    /**
     * 更新服务作业
     *
     * 该接口用于更新服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VasMeta.updateTask);
    }

    /**
     * 更新服务作业
     *
     * 该接口用于更新服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<>(request, VasMeta.updateTask, hcClient);
    }

}

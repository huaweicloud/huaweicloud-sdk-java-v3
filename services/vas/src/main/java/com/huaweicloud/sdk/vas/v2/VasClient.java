package com.huaweicloud.sdk.vas.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vas.v2.model.*;

public class VasClient {

    protected HcClient hcClient;

    public VasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VasClient> newBuilder() {
        return new ClientBuilder<>(VasClient::new);
    }

    /**
     * 创建服务作业
     *
     * 该接口用于创建服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTasksRequest 请求对象
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
     * @param CreateTasksRequest 请求对象
     * @return SyncInvoker<CreateTasksRequest, CreateTasksResponse>
     */
    public SyncInvoker<CreateTasksRequest, CreateTasksResponse> createTasksInvoker(CreateTasksRequest request) {
        return new SyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, VasMeta.createTasks, hcClient);
    }

    /**
     * 删除服务作业
     *
     * 该接口用于删除服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
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
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, VasMeta.deleteTask, hcClient);
    }

    /**
     * 获取服务作业列表
     *
     * 该接口用于获取服务作业列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksDetailsRequest 请求对象
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
     * @param ListTasksDetailsRequest 请求对象
     * @return SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>
     */
    public SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetailsInvoker(
        ListTasksDetailsRequest request) {
        return new SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>(request, VasMeta.listTasksDetails,
            hcClient);
    }

    /**
     * 查询服务作业
     *
     * 该接口用于查询服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
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
     * @param ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, VasMeta.showTask, hcClient);
    }

    /**
     * 启动服务作业
     *
     * 该接口用于启动服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartTaskRequest 请求对象
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
     * @param StartTaskRequest 请求对象
     * @return SyncInvoker<StartTaskRequest, StartTaskResponse>
     */
    public SyncInvoker<StartTaskRequest, StartTaskResponse> startTaskInvoker(StartTaskRequest request) {
        return new SyncInvoker<StartTaskRequest, StartTaskResponse>(request, VasMeta.startTask, hcClient);
    }

    /**
     * 停止服务作业
     *
     * 该接口用于停止服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskRequest 请求对象
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
     * @param StopTaskRequest 请求对象
     * @return SyncInvoker<StopTaskRequest, StopTaskResponse>
     */
    public SyncInvoker<StopTaskRequest, StopTaskResponse> stopTaskInvoker(StopTaskRequest request) {
        return new SyncInvoker<StopTaskRequest, StopTaskResponse>(request, VasMeta.stopTask, hcClient);
    }

    /**
     * 更新服务作业
     *
     * 该接口用于更新服务作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
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
     * @param UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, VasMeta.updateTask, hcClient);
    }

}

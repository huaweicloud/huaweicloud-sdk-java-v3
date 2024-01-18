package com.huaweicloud.sdk.oroas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.oroas.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.ListTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.ListTaskResponse;
import com.huaweicloud.sdk.oroas.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.oroas.v1.model.ShowTaskResponse;

public class OroasClient {

    protected HcClient hcClient;

    public OroasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OroasClient> newBuilder() {
        ClientBuilder<OroasClient> clientBuilder = new ClientBuilder<>(OroasClient::new);
        return clientBuilder;
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OroasMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, OroasMeta.createTask, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OroasMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, OroasMeta.deleteTask, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRequest 请求对象
     * @return ListTaskResponse
     */
    public ListTaskResponse listTask(ListTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OroasMeta.listTask);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRequest 请求对象
     * @return SyncInvoker<ListTaskRequest, ListTaskResponse>
     */
    public SyncInvoker<ListTaskRequest, ListTaskResponse> listTaskInvoker(ListTaskRequest request) {
        return new SyncInvoker<>(request, OroasMeta.listTask, hcClient);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OroasMeta.showTask);
    }

    /**
     * 获取任务详情
     *
     * 获取任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<>(request, OroasMeta.showTask, hcClient);
    }

}

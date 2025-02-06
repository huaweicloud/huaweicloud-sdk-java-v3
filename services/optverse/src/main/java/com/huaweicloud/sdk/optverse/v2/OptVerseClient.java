package com.huaweicloud.sdk.optverse.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.optverse.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.ListTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.ListTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.ShowTaskResponse;

public class OptVerseClient {

    protected HcClient hcClient;

    public OptVerseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OptVerseClient> newBuilder() {
        ClientBuilder<OptVerseClient> clientBuilder = new ClientBuilder<>(OptVerseClient::new);
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
        return hcClient.syncInvokeHttp(request, OptVerseMeta.createTask);
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
        return new SyncInvoker<>(request, OptVerseMeta.createTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, OptVerseMeta.deleteTask);
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
        return new SyncInvoker<>(request, OptVerseMeta.deleteTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, OptVerseMeta.listTask);
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
        return new SyncInvoker<>(request, OptVerseMeta.listTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, OptVerseMeta.showTask);
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
        return new SyncInvoker<>(request, OptVerseMeta.showTask, hcClient);
    }

}

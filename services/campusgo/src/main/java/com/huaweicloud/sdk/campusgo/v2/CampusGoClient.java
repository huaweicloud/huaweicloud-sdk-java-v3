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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CampusGoClient {

    protected HcClient hcClient;

    public CampusGoClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CampusGoClient> newBuilder() {
        ClientBuilder<CampusGoClient> clientBuilder = new ClientBuilder<>(CampusGoClient::new);
        return clientBuilder;
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
        return hcClient.syncInvokeHttp(request, CampusGoMeta.createTasks);
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
        return new SyncInvoker<CreateTasksRequest, CreateTasksResponse>(request, CampusGoMeta.createTasks, hcClient);
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
        return hcClient.syncInvokeHttp(request, CampusGoMeta.deleteTask);
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
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CampusGoMeta.deleteTask, hcClient);
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
        return hcClient.syncInvokeHttp(request, CampusGoMeta.listTasksDetails);
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
        return new SyncInvoker<ListTasksDetailsRequest, ListTasksDetailsResponse>(request,
            CampusGoMeta.listTasksDetails, hcClient);
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
        return hcClient.syncInvokeHttp(request, CampusGoMeta.showTask);
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
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, CampusGoMeta.showTask, hcClient);
    }

}

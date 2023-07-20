package com.huaweicloud.sdk.devsecurity.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusResponse;

public class DevSecurityClient {

    protected HcClient hcClient;

    public DevSecurityClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevSecurityClient> newBuilder() {
        ClientBuilder<DevSecurityClient> clientBuilder = new ClientBuilder<>(DevSecurityClient::new);
        return clientBuilder;
    }

    /**
     * 创建移动应用安全任务并启动
     *
     * 创建移动应用安全任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecAppTaskRequest 请求对象
     * @return CreateSecAppTaskResponse
     */
    public CreateSecAppTaskResponse createSecAppTask(CreateSecAppTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DevSecurityMeta.createSecAppTask);
    }

    /**
     * 创建移动应用安全任务并启动
     *
     * 创建移动应用安全任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSecAppTaskRequest 请求对象
     * @return SyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse>
     */
    public SyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse> createSecAppTaskInvoker(
        CreateSecAppTaskRequest request) {
        return new SyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse>(request,
            DevSecurityMeta.createSecAppTask, hcClient);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecAppTaskRequest 请求对象
     * @return DeleteSecAppTaskResponse
     */
    public DeleteSecAppTaskResponse deleteSecAppTask(DeleteSecAppTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DevSecurityMeta.deleteSecAppTask);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSecAppTaskRequest 请求对象
     * @return SyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse>
     */
    public SyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> deleteSecAppTaskInvoker(
        DeleteSecAppTaskRequest request) {
        return new SyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse>(request,
            DevSecurityMeta.deleteSecAppTask, hcClient);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecAppTaskResultRequest 请求对象
     * @return ShowSecAppTaskResultResponse
     */
    public ShowSecAppTaskResultResponse showSecAppTaskResult(ShowSecAppTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, DevSecurityMeta.showSecAppTaskResult);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecAppTaskResultRequest 请求对象
     * @return SyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse>
     */
    public SyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> showSecAppTaskResultInvoker(
        ShowSecAppTaskResultRequest request) {
        return new SyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse>(request,
            DevSecurityMeta.showSecAppTaskResult, hcClient);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecAppTaskStatusRequest 请求对象
     * @return ShowSecAppTaskStatusResponse
     */
    public ShowSecAppTaskStatusResponse showSecAppTaskStatus(ShowSecAppTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevSecurityMeta.showSecAppTaskStatus);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecAppTaskStatusRequest 请求对象
     * @return SyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse>
     */
    public SyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> showSecAppTaskStatusInvoker(
        ShowSecAppTaskStatusRequest request) {
        return new SyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse>(request,
            DevSecurityMeta.showSecAppTaskStatus, hcClient);
    }

}

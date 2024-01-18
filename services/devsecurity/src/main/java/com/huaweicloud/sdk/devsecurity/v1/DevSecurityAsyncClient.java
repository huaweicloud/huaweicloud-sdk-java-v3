package com.huaweicloud.sdk.devsecurity.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.CreateSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.DeleteSecAppTaskResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskResultResponse;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusRequest;
import com.huaweicloud.sdk.devsecurity.v1.model.ShowSecAppTaskStatusResponse;

import java.util.concurrent.CompletableFuture;

public class DevSecurityAsyncClient {

    protected HcClient hcClient;

    public DevSecurityAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevSecurityAsyncClient> newBuilder() {
        ClientBuilder<DevSecurityAsyncClient> clientBuilder = new ClientBuilder<>(DevSecurityAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建移动应用安全任务并启动
     *
     * 创建移动应用安全任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecAppTaskRequest 请求对象
     * @return CompletableFuture<CreateSecAppTaskResponse>
     */
    public CompletableFuture<CreateSecAppTaskResponse> createSecAppTaskAsync(CreateSecAppTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DevSecurityMeta.createSecAppTask);
    }

    /**
     * 创建移动应用安全任务并启动
     *
     * 创建移动应用安全任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecAppTaskRequest 请求对象
     * @return AsyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse>
     */
    public AsyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse> createSecAppTaskAsyncInvoker(
        CreateSecAppTaskRequest request) {
        return new AsyncInvoker<>(request, DevSecurityMeta.createSecAppTask, hcClient);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecAppTaskRequest 请求对象
     * @return CompletableFuture<DeleteSecAppTaskResponse>
     */
    public CompletableFuture<DeleteSecAppTaskResponse> deleteSecAppTaskAsync(DeleteSecAppTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DevSecurityMeta.deleteSecAppTask);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecAppTaskRequest 请求对象
     * @return AsyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse>
     */
    public AsyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> deleteSecAppTaskAsyncInvoker(
        DeleteSecAppTaskRequest request) {
        return new AsyncInvoker<>(request, DevSecurityMeta.deleteSecAppTask, hcClient);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskResultRequest 请求对象
     * @return CompletableFuture<ShowSecAppTaskResultResponse>
     */
    public CompletableFuture<ShowSecAppTaskResultResponse> showSecAppTaskResultAsync(
        ShowSecAppTaskResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DevSecurityMeta.showSecAppTaskResult);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskResultRequest 请求对象
     * @return AsyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse>
     */
    public AsyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> showSecAppTaskResultAsyncInvoker(
        ShowSecAppTaskResultRequest request) {
        return new AsyncInvoker<>(request, DevSecurityMeta.showSecAppTaskResult, hcClient);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskStatusRequest 请求对象
     * @return CompletableFuture<ShowSecAppTaskStatusResponse>
     */
    public CompletableFuture<ShowSecAppTaskStatusResponse> showSecAppTaskStatusAsync(
        ShowSecAppTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevSecurityMeta.showSecAppTaskStatus);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskStatusRequest 请求对象
     * @return AsyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse>
     */
    public AsyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> showSecAppTaskStatusAsyncInvoker(
        ShowSecAppTaskStatusRequest request) {
        return new AsyncInvoker<>(request, DevSecurityMeta.showSecAppTaskStatus, hcClient);
    }

}

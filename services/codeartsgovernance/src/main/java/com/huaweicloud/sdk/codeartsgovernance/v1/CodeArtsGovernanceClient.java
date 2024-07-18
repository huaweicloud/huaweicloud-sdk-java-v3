package com.huaweicloud.sdk.codeartsgovernance.v1;

import com.huaweicloud.sdk.codeartsgovernance.v1.model.CreateSecAppTaskRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.CreateSecAppTaskResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.DeleteSecAppTaskRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.DeleteSecAppTaskResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowHmReportRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowHmReportResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskResultRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskResultResponse;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskStatusRequest;
import com.huaweicloud.sdk.codeartsgovernance.v1.model.ShowSecAppTaskStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsGovernanceClient {

    protected HcClient hcClient;

    public CodeArtsGovernanceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsGovernanceClient> newBuilder() {
        ClientBuilder<CodeArtsGovernanceClient> clientBuilder = new ClientBuilder<>(CodeArtsGovernanceClient::new);
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
     * @return CreateSecAppTaskResponse
     */
    public CreateSecAppTaskResponse createSecAppTask(CreateSecAppTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsGovernanceMeta.createSecAppTask);
    }

    /**
     * 创建移动应用安全任务并启动
     *
     * 创建移动应用安全任务并启动
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecAppTaskRequest 请求对象
     * @return SyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse>
     */
    public SyncInvoker<CreateSecAppTaskRequest, CreateSecAppTaskResponse> createSecAppTaskInvoker(
        CreateSecAppTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsGovernanceMeta.createSecAppTask, hcClient);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecAppTaskRequest 请求对象
     * @return DeleteSecAppTaskResponse
     */
    public DeleteSecAppTaskResponse deleteSecAppTask(DeleteSecAppTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsGovernanceMeta.deleteSecAppTask);
    }

    /**
     * 删除移动应用安全任务
     *
     * 删除移动应用安全任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecAppTaskRequest 请求对象
     * @return SyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse>
     */
    public SyncInvoker<DeleteSecAppTaskRequest, DeleteSecAppTaskResponse> deleteSecAppTaskInvoker(
        DeleteSecAppTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsGovernanceMeta.deleteSecAppTask, hcClient);
    }

    /**
     * 获取鸿蒙生态应用检查结果
     *
     * 获取鸿蒙生态应用检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHmReportRequest 请求对象
     * @return ShowHmReportResponse
     */
    public ShowHmReportResponse showHmReport(ShowHmReportRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsGovernanceMeta.showHmReport);
    }

    /**
     * 获取鸿蒙生态应用检查结果
     *
     * 获取鸿蒙生态应用检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHmReportRequest 请求对象
     * @return SyncInvoker<ShowHmReportRequest, ShowHmReportResponse>
     */
    public SyncInvoker<ShowHmReportRequest, ShowHmReportResponse> showHmReportInvoker(ShowHmReportRequest request) {
        return new SyncInvoker<>(request, CodeArtsGovernanceMeta.showHmReport, hcClient);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskResultRequest 请求对象
     * @return ShowSecAppTaskResultResponse
     */
    public ShowSecAppTaskResultResponse showSecAppTaskResult(ShowSecAppTaskResultRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsGovernanceMeta.showSecAppTaskResult);
    }

    /**
     * 获取移动应用安全任务结果
     *
     * 获取移动应用安全任务结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskResultRequest 请求对象
     * @return SyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse>
     */
    public SyncInvoker<ShowSecAppTaskResultRequest, ShowSecAppTaskResultResponse> showSecAppTaskResultInvoker(
        ShowSecAppTaskResultRequest request) {
        return new SyncInvoker<>(request, CodeArtsGovernanceMeta.showSecAppTaskResult, hcClient);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskStatusRequest 请求对象
     * @return ShowSecAppTaskStatusResponse
     */
    public ShowSecAppTaskStatusResponse showSecAppTaskStatus(ShowSecAppTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsGovernanceMeta.showSecAppTaskStatus);
    }

    /**
     * 查询移动应用安全任务状态
     *
     * 查询移动应用安全任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecAppTaskStatusRequest 请求对象
     * @return SyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse>
     */
    public SyncInvoker<ShowSecAppTaskStatusRequest, ShowSecAppTaskStatusResponse> showSecAppTaskStatusInvoker(
        ShowSecAppTaskStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsGovernanceMeta.showSecAppTaskStatus, hcClient);
    }

}

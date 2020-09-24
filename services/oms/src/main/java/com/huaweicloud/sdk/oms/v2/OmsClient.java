package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.oms.v2.model.*;

public class OmsClient {
    protected HcClient hcClient;

    public OmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsClient> newBuilder() {
        return new ClientBuilder<>(OmsClient::new);
    }


    /**
     * 创建迁移任务
     * 创建迁移任务，创建成功后，任务会被自动启动，不需要额外调用启动任务命令。
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
    */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.createTask);
    }

    /**
     * 删除迁移任务
     * 调用该接口删除迁移任务。 正在运行的任务不允许删除，如果删除会返回失败；若要删除，请先行暂停任务。
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
    */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.deleteTask);
    }

    /**
     * 查询迁移任务列表
     * 查询用户账户下的所有任务信息。
     *
     * @param ListTasksRequest 请求对象
     * @return ListTasksResponse
    */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listTasks);
    }

    /**
     * 查询指定ID的任务详情
     * 查询指定ID的任务详情。
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse
    */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showTask);
    }

    /**
     * 启动迁移任务
     * 迁移任务暂停或失败后，调用该接口以启动任务。
     *
     * @param StartTaskRequest 请求对象
     * @return StartTaskResponse
    */
    public StartTaskResponse startTask(StartTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.startTask);
    }

    /**
     * 暂停迁移任务
     * 当迁移任务处于迁移中时，调用该接口停止任务。
     *
     * @param StopTaskRequest 请求对象
     * @return StopTaskResponse
    */
    public StopTaskResponse stopTask(StopTaskRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.stopTask);
    }

    /**
     * 更新任务带宽策略
     * 当迁移任务未执行完成时，修改迁移任务的流量控制策略。
     *
     * @param UpdateBandwidthPolicyRequest 请求对象
     * @return UpdateBandwidthPolicyResponse
    */
    public UpdateBandwidthPolicyResponse updateBandwidthPolicy(UpdateBandwidthPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    /**
     * 查询API版本信息列表
     * 查询对象存储迁移服务的API版本信息。
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
    */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    /**
     * 查询指定API版本信息
     * 查询对象存储迁移服务指定API版本信息。
     *
     * @param ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
    */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OmsMeta.showApiInfo);
    }

}
package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.CreateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.CreateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteAllFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteAllFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.DeleteKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.DeleteKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.DisassociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.DisassociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.ListFailedTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListFailedTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairDetailRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairDetailResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairsRequest;
import com.huaweicloud.sdk.kps.v3.model.ListKeypairsResponse;
import com.huaweicloud.sdk.kps.v3.model.ListRunningTaskRequest;
import com.huaweicloud.sdk.kps.v3.model.ListRunningTaskResponse;
import com.huaweicloud.sdk.kps.v3.model.UpdateKeypairDescriptionRequest;
import com.huaweicloud.sdk.kps.v3.model.UpdateKeypairDescriptionResponse;

public class KpsClient {

    protected HcClient hcClient;

    public KpsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KpsClient> newBuilder() {
        ClientBuilder<KpsClient> clientBuilder = new ClientBuilder<>(KpsClient::new);
        return clientBuilder;
    }

    /**
     * 绑定SSH密钥对
     *
     * 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateKeypairRequest 请求对象
     * @return AssociateKeypairResponse
     */
    public AssociateKeypairResponse associateKeypair(AssociateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.associateKeypair);
    }

    /**
     * 绑定SSH密钥对
     *
     * 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateKeypairRequest 请求对象
     * @return SyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse>
     */
    public SyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypairInvoker(
        AssociateKeypairRequest request) {
        return new SyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse>(request, KpsMeta.associateKeypair,
            hcClient);
    }

    /**
     * 创建和导入SSH密钥对
     *
     * 创建和导入SSH密钥对
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return CreateKeypairResponse
     */
    public CreateKeypairResponse createKeypair(CreateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.createKeypair);
    }

    /**
     * 创建和导入SSH密钥对
     *
     * 创建和导入SSH密钥对
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateKeypairRequest 请求对象
     * @return SyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public SyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairInvoker(CreateKeypairRequest request) {
        return new SyncInvoker<CreateKeypairRequest, CreateKeypairResponse>(request, KpsMeta.createKeypair, hcClient);
    }

    /**
     * 删除所有失败的任务
     *
     * 删除操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllFailedTaskRequest 请求对象
     * @return DeleteAllFailedTaskResponse
     */
    public DeleteAllFailedTaskResponse deleteAllFailedTask(DeleteAllFailedTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.deleteAllFailedTask);
    }

    /**
     * 删除所有失败的任务
     *
     * 删除操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllFailedTaskRequest 请求对象
     * @return SyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse>
     */
    public SyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTaskInvoker(
        DeleteAllFailedTaskRequest request) {
        return new SyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse>(request,
            KpsMeta.deleteAllFailedTask, hcClient);
    }

    /**
     * 删除失败的任务
     *
     * 删除失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFailedTaskRequest 请求对象
     * @return DeleteFailedTaskResponse
     */
    public DeleteFailedTaskResponse deleteFailedTask(DeleteFailedTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.deleteFailedTask);
    }

    /**
     * 删除失败的任务
     *
     * 删除失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFailedTaskRequest 请求对象
     * @return SyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse>
     */
    public SyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTaskInvoker(
        DeleteFailedTaskRequest request) {
        return new SyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse>(request, KpsMeta.deleteFailedTask,
            hcClient);
    }

    /**
     * 删除SSH密钥对
     *
     * 删除SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return DeleteKeypairResponse
     */
    public DeleteKeypairResponse deleteKeypair(DeleteKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.deleteKeypair);
    }

    /**
     * 删除SSH密钥对
     *
     * 删除SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteKeypairRequest 请求对象
     * @return SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairInvoker(DeleteKeypairRequest request) {
        return new SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>(request, KpsMeta.deleteKeypair, hcClient);
    }

    /**
     * 解绑SSH密钥对
     *
     * 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateKeypairRequest 请求对象
     * @return DisassociateKeypairResponse
     */
    public DisassociateKeypairResponse disassociateKeypair(DisassociateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.disassociateKeypair);
    }

    /**
     * 解绑SSH密钥对
     *
     * 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateKeypairRequest 请求对象
     * @return SyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse>
     */
    public SyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypairInvoker(
        DisassociateKeypairRequest request) {
        return new SyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse>(request,
            KpsMeta.disassociateKeypair, hcClient);
    }

    /**
     * 查询失败的任务信息
     *
     * 查询绑定、解绑等操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFailedTaskRequest 请求对象
     * @return ListFailedTaskResponse
     */
    public ListFailedTaskResponse listFailedTask(ListFailedTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.listFailedTask);
    }

    /**
     * 查询失败的任务信息
     *
     * 查询绑定、解绑等操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFailedTaskRequest 请求对象
     * @return SyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse>
     */
    public SyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTaskInvoker(
        ListFailedTaskRequest request) {
        return new SyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse>(request, KpsMeta.listFailedTask,
            hcClient);
    }

    /**
     * 查询SSH密钥对详细信息
     *
     * 查询SSH密钥对详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairDetailRequest 请求对象
     * @return ListKeypairDetailResponse
     */
    public ListKeypairDetailResponse listKeypairDetail(ListKeypairDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.listKeypairDetail);
    }

    /**
     * 查询SSH密钥对详细信息
     *
     * 查询SSH密钥对详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairDetailRequest 请求对象
     * @return SyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse>
     */
    public SyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetailInvoker(
        ListKeypairDetailRequest request) {
        return new SyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse>(request, KpsMeta.listKeypairDetail,
            hcClient);
    }

    /**
     * 查询任务信息
     *
     * 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairTaskRequest 请求对象
     * @return ListKeypairTaskResponse
     */
    public ListKeypairTaskResponse listKeypairTask(ListKeypairTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.listKeypairTask);
    }

    /**
     * 查询任务信息
     *
     * 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairTaskRequest 请求对象
     * @return SyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse>
     */
    public SyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTaskInvoker(
        ListKeypairTaskRequest request) {
        return new SyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse>(request, KpsMeta.listKeypairTask,
            hcClient);
    }

    /**
     * 查询SSH密钥对列表
     *
     * 查询SSH密钥对列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return ListKeypairsResponse
     */
    public ListKeypairsResponse listKeypairs(ListKeypairsRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.listKeypairs);
    }

    /**
     * 查询SSH密钥对列表
     *
     * 查询SSH密钥对列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListKeypairsRequest 请求对象
     * @return SyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public SyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsInvoker(ListKeypairsRequest request) {
        return new SyncInvoker<ListKeypairsRequest, ListKeypairsResponse>(request, KpsMeta.listKeypairs, hcClient);
    }

    /**
     * 查询正在处理的任务信息
     *
     * 查询正在处理的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunningTaskRequest 请求对象
     * @return ListRunningTaskResponse
     */
    public ListRunningTaskResponse listRunningTask(ListRunningTaskRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.listRunningTask);
    }

    /**
     * 查询正在处理的任务信息
     *
     * 查询正在处理的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRunningTaskRequest 请求对象
     * @return SyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse>
     */
    public SyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTaskInvoker(
        ListRunningTaskRequest request) {
        return new SyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse>(request, KpsMeta.listRunningTask,
            hcClient);
    }

    /**
     * 更新SSH密钥对描述
     *
     * 更新SSH密钥对描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairDescriptionRequest 请求对象
     * @return UpdateKeypairDescriptionResponse
     */
    public UpdateKeypairDescriptionResponse updateKeypairDescription(UpdateKeypairDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.updateKeypairDescription);
    }

    /**
     * 更新SSH密钥对描述
     *
     * 更新SSH密钥对描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateKeypairDescriptionRequest 请求对象
     * @return SyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse>
     */
    public SyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescriptionInvoker(
        UpdateKeypairDescriptionRequest request) {
        return new SyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse>(request,
            KpsMeta.updateKeypairDescription, hcClient);
    }

}

package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kps.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class KpsAsyncClient {

    protected HcClient hcClient;

    public KpsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KpsAsyncClient> newBuilder() {
        return new ClientBuilder<>(KpsAsyncClient::new);
    }

    /** 绑定SSH密钥对 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     *
     * @param AssociateKeypairRequest 请求对象
     * @return CompletableFuture<AssociateKeypairResponse> */
    public CompletableFuture<AssociateKeypairResponse> associateKeypairAsync(AssociateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.associateKeypair);
    }

    /** 绑定SSH密钥对 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     *
     * @param AssociateKeypairRequest 请求对象
     * @return AsyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse> */
    public AsyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypairAsyncInvoker(
        AssociateKeypairRequest request) {
        return new AsyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse>(request, KpsMeta.associateKeypair,
            hcClient);
    }

    /** 创建和导入SSH密钥对 创建和导入SSH密钥对
     *
     * @param CreateKeypairRequest 请求对象
     * @return CompletableFuture<CreateKeypairResponse> */
    public CompletableFuture<CreateKeypairResponse> createKeypairAsync(CreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.createKeypair);
    }

    /** 创建和导入SSH密钥对 创建和导入SSH密钥对
     *
     * @param CreateKeypairRequest 请求对象
     * @return AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse> */
    public AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairAsyncInvoker(
        CreateKeypairRequest request) {
        return new AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>(request, KpsMeta.createKeypair, hcClient);
    }

    /** 删除所有失败的任务 删除操作失败的任务信息。
     *
     * @param DeleteAllFailedTaskRequest 请求对象
     * @return CompletableFuture<DeleteAllFailedTaskResponse> */
    public CompletableFuture<DeleteAllFailedTaskResponse> deleteAllFailedTaskAsync(DeleteAllFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteAllFailedTask);
    }

    /** 删除所有失败的任务 删除操作失败的任务信息。
     *
     * @param DeleteAllFailedTaskRequest 请求对象
     * @return AsyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> */
    public AsyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTaskAsyncInvoker(
        DeleteAllFailedTaskRequest request) {
        return new AsyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse>(request,
            KpsMeta.deleteAllFailedTask, hcClient);
    }

    /** 删除失败的任务 删除失败的任务。
     *
     * @param DeleteFailedTaskRequest 请求对象
     * @return CompletableFuture<DeleteFailedTaskResponse> */
    public CompletableFuture<DeleteFailedTaskResponse> deleteFailedTaskAsync(DeleteFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteFailedTask);
    }

    /** 删除失败的任务 删除失败的任务。
     *
     * @param DeleteFailedTaskRequest 请求对象
     * @return AsyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse> */
    public AsyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTaskAsyncInvoker(
        DeleteFailedTaskRequest request) {
        return new AsyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse>(request, KpsMeta.deleteFailedTask,
            hcClient);
    }

    /** 删除SSH密钥对 删除SSH密钥对。
     *
     * @param DeleteKeypairRequest 请求对象
     * @return CompletableFuture<DeleteKeypairResponse> */
    public CompletableFuture<DeleteKeypairResponse> deleteKeypairAsync(DeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteKeypair);
    }

    /** 删除SSH密钥对 删除SSH密钥对。
     *
     * @param DeleteKeypairRequest 请求对象
     * @return AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> */
    public AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairAsyncInvoker(
        DeleteKeypairRequest request) {
        return new AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>(request, KpsMeta.deleteKeypair, hcClient);
    }

    /** 解绑SSH密钥对 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     *
     * @param DisassociateKeypairRequest 请求对象
     * @return CompletableFuture<DisassociateKeypairResponse> */
    public CompletableFuture<DisassociateKeypairResponse> disassociateKeypairAsync(DisassociateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.disassociateKeypair);
    }

    /** 解绑SSH密钥对 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     *
     * @param DisassociateKeypairRequest 请求对象
     * @return AsyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse> */
    public AsyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypairAsyncInvoker(
        DisassociateKeypairRequest request) {
        return new AsyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse>(request,
            KpsMeta.disassociateKeypair, hcClient);
    }

    /** 查询失败的任务信息 查询绑定、解绑等操作失败的任务信息。
     *
     * @param ListFailedTaskRequest 请求对象
     * @return CompletableFuture<ListFailedTaskResponse> */
    public CompletableFuture<ListFailedTaskResponse> listFailedTaskAsync(ListFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listFailedTask);
    }

    /** 查询失败的任务信息 查询绑定、解绑等操作失败的任务信息。
     *
     * @param ListFailedTaskRequest 请求对象
     * @return AsyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse> */
    public AsyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTaskAsyncInvoker(
        ListFailedTaskRequest request) {
        return new AsyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse>(request, KpsMeta.listFailedTask,
            hcClient);
    }

    /** 查询SSH密钥对详细信息 查询SSH密钥对详细信息
     *
     * @param ListKeypairDetailRequest 请求对象
     * @return CompletableFuture<ListKeypairDetailResponse> */
    public CompletableFuture<ListKeypairDetailResponse> listKeypairDetailAsync(ListKeypairDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairDetail);
    }

    /** 查询SSH密钥对详细信息 查询SSH密钥对详细信息
     *
     * @param ListKeypairDetailRequest 请求对象
     * @return AsyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse> */
    public AsyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetailAsyncInvoker(
        ListKeypairDetailRequest request) {
        return new AsyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse>(request, KpsMeta.listKeypairDetail,
            hcClient);
    }

    /** 查询任务信息 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     *
     * @param ListKeypairTaskRequest 请求对象
     * @return CompletableFuture<ListKeypairTaskResponse> */
    public CompletableFuture<ListKeypairTaskResponse> listKeypairTaskAsync(ListKeypairTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairTask);
    }

    /** 查询任务信息 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     *
     * @param ListKeypairTaskRequest 请求对象
     * @return AsyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse> */
    public AsyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTaskAsyncInvoker(
        ListKeypairTaskRequest request) {
        return new AsyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse>(request, KpsMeta.listKeypairTask,
            hcClient);
    }

    /** 查询SSH密钥对列表 查询SSH密钥对列表
     *
     * @param ListKeypairsRequest 请求对象
     * @return CompletableFuture<ListKeypairsResponse> */
    public CompletableFuture<ListKeypairsResponse> listKeypairsAsync(ListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairs);
    }

    /** 查询SSH密钥对列表 查询SSH密钥对列表
     *
     * @param ListKeypairsRequest 请求对象
     * @return AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse> */
    public AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsAsyncInvoker(
        ListKeypairsRequest request) {
        return new AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>(request, KpsMeta.listKeypairs, hcClient);
    }

    /** 查询正在处理的任务信息 查询正在处理的任务信息。
     *
     * @param ListRunningTaskRequest 请求对象
     * @return CompletableFuture<ListRunningTaskResponse> */
    public CompletableFuture<ListRunningTaskResponse> listRunningTaskAsync(ListRunningTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listRunningTask);
    }

    /** 查询正在处理的任务信息 查询正在处理的任务信息。
     *
     * @param ListRunningTaskRequest 请求对象
     * @return AsyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse> */
    public AsyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTaskAsyncInvoker(
        ListRunningTaskRequest request) {
        return new AsyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse>(request, KpsMeta.listRunningTask,
            hcClient);
    }

    /** 更新SSH密钥对描述 更新SSH密钥对描述。
     *
     * @param UpdateKeypairDescriptionRequest 请求对象
     * @return CompletableFuture<UpdateKeypairDescriptionResponse> */
    public CompletableFuture<UpdateKeypairDescriptionResponse> updateKeypairDescriptionAsync(
        UpdateKeypairDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.updateKeypairDescription);
    }

    /** 更新SSH密钥对描述 更新SSH密钥对描述。
     *
     * @param UpdateKeypairDescriptionRequest 请求对象
     * @return AsyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> */
    public AsyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescriptionAsyncInvoker(
        UpdateKeypairDescriptionRequest request) {
        return new AsyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse>(request,
            KpsMeta.updateKeypairDescription, hcClient);
    }

}

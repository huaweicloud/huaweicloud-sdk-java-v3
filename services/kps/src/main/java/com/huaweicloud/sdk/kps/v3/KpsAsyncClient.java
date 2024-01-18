package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.ClearPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ClearPrivateKeyResponse;
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
import com.huaweicloud.sdk.kps.v3.model.ExportPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ExportPrivateKeyResponse;
import com.huaweicloud.sdk.kps.v3.model.ImportPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.ImportPrivateKeyResponse;
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

import java.util.concurrent.CompletableFuture;

public class KpsAsyncClient {

    protected HcClient hcClient;

    public KpsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KpsAsyncClient> newBuilder() {
        ClientBuilder<KpsAsyncClient> clientBuilder = new ClientBuilder<>(KpsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 绑定SSH密钥对
     *
     * 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateKeypairRequest 请求对象
     * @return CompletableFuture<AssociateKeypairResponse>
     */
    public CompletableFuture<AssociateKeypairResponse> associateKeypairAsync(AssociateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.associateKeypair);
    }

    /**
     * 绑定SSH密钥对
     *
     * 给指定的虚拟机绑定（替换或重置，替换需提供虚拟机已配置的SSH密钥对私钥；重置不需要提供虚拟机的SSH密钥对私钥）新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateKeypairRequest 请求对象
     * @return AsyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse>
     */
    public AsyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypairAsyncInvoker(
        AssociateKeypairRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.associateKeypair, hcClient);
    }

    /**
     * 批量绑定SSH密钥对
     *
     * 给指定的虚拟机批量绑定新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateKeypairRequest 请求对象
     * @return CompletableFuture<BatchAssociateKeypairResponse>
     */
    public CompletableFuture<BatchAssociateKeypairResponse> batchAssociateKeypairAsync(
        BatchAssociateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.batchAssociateKeypair);
    }

    /**
     * 批量绑定SSH密钥对
     *
     * 给指定的虚拟机批量绑定新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateKeypairRequest 请求对象
     * @return AsyncInvoker<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse>
     */
    public AsyncInvoker<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse> batchAssociateKeypairAsyncInvoker(
        BatchAssociateKeypairRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.batchAssociateKeypair, hcClient);
    }

    /**
     * 清除私钥
     *
     * 清除SSH密钥对私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearPrivateKeyRequest 请求对象
     * @return CompletableFuture<ClearPrivateKeyResponse>
     */
    public CompletableFuture<ClearPrivateKeyResponse> clearPrivateKeyAsync(ClearPrivateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.clearPrivateKey);
    }

    /**
     * 清除私钥
     *
     * 清除SSH密钥对私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearPrivateKeyRequest 请求对象
     * @return AsyncInvoker<ClearPrivateKeyRequest, ClearPrivateKeyResponse>
     */
    public AsyncInvoker<ClearPrivateKeyRequest, ClearPrivateKeyResponse> clearPrivateKeyAsyncInvoker(
        ClearPrivateKeyRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.clearPrivateKey, hcClient);
    }

    /**
     * 创建和导入SSH密钥对
     *
     * 创建和导入SSH密钥对
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeypairRequest 请求对象
     * @return CompletableFuture<CreateKeypairResponse>
     */
    public CompletableFuture<CreateKeypairResponse> createKeypairAsync(CreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.createKeypair);
    }

    /**
     * 创建和导入SSH密钥对
     *
     * 创建和导入SSH密钥对
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeypairRequest 请求对象
     * @return AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public AsyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairAsyncInvoker(
        CreateKeypairRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.createKeypair, hcClient);
    }

    /**
     * 删除所有失败的任务
     *
     * 删除操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAllFailedTaskRequest 请求对象
     * @return CompletableFuture<DeleteAllFailedTaskResponse>
     */
    public CompletableFuture<DeleteAllFailedTaskResponse> deleteAllFailedTaskAsync(DeleteAllFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteAllFailedTask);
    }

    /**
     * 删除所有失败的任务
     *
     * 删除操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAllFailedTaskRequest 请求对象
     * @return AsyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse>
     */
    public AsyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTaskAsyncInvoker(
        DeleteAllFailedTaskRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.deleteAllFailedTask, hcClient);
    }

    /**
     * 删除失败的任务
     *
     * 删除失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFailedTaskRequest 请求对象
     * @return CompletableFuture<DeleteFailedTaskResponse>
     */
    public CompletableFuture<DeleteFailedTaskResponse> deleteFailedTaskAsync(DeleteFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteFailedTask);
    }

    /**
     * 删除失败的任务
     *
     * 删除失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFailedTaskRequest 请求对象
     * @return AsyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse>
     */
    public AsyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTaskAsyncInvoker(
        DeleteFailedTaskRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.deleteFailedTask, hcClient);
    }

    /**
     * 删除SSH密钥对
     *
     * 删除SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeypairRequest 请求对象
     * @return CompletableFuture<DeleteKeypairResponse>
     */
    public CompletableFuture<DeleteKeypairResponse> deleteKeypairAsync(DeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.deleteKeypair);
    }

    /**
     * 删除SSH密钥对
     *
     * 删除SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeypairRequest 请求对象
     * @return AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public AsyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairAsyncInvoker(
        DeleteKeypairRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.deleteKeypair, hcClient);
    }

    /**
     * 解绑SSH密钥对
     *
     * 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateKeypairRequest 请求对象
     * @return CompletableFuture<DisassociateKeypairResponse>
     */
    public CompletableFuture<DisassociateKeypairResponse> disassociateKeypairAsync(DisassociateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.disassociateKeypair);
    }

    /**
     * 解绑SSH密钥对
     *
     * 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateKeypairRequest 请求对象
     * @return AsyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse>
     */
    public AsyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypairAsyncInvoker(
        DisassociateKeypairRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.disassociateKeypair, hcClient);
    }

    /**
     * 导出私钥
     *
     * 导出指定密钥对的私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPrivateKeyRequest 请求对象
     * @return CompletableFuture<ExportPrivateKeyResponse>
     */
    public CompletableFuture<ExportPrivateKeyResponse> exportPrivateKeyAsync(ExportPrivateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.exportPrivateKey);
    }

    /**
     * 导出私钥
     *
     * 导出指定密钥对的私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPrivateKeyRequest 请求对象
     * @return AsyncInvoker<ExportPrivateKeyRequest, ExportPrivateKeyResponse>
     */
    public AsyncInvoker<ExportPrivateKeyRequest, ExportPrivateKeyResponse> exportPrivateKeyAsyncInvoker(
        ExportPrivateKeyRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.exportPrivateKey, hcClient);
    }

    /**
     * 导入私钥
     *
     * 导入私钥到指定密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPrivateKeyRequest 请求对象
     * @return CompletableFuture<ImportPrivateKeyResponse>
     */
    public CompletableFuture<ImportPrivateKeyResponse> importPrivateKeyAsync(ImportPrivateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.importPrivateKey);
    }

    /**
     * 导入私钥
     *
     * 导入私钥到指定密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPrivateKeyRequest 请求对象
     * @return AsyncInvoker<ImportPrivateKeyRequest, ImportPrivateKeyResponse>
     */
    public AsyncInvoker<ImportPrivateKeyRequest, ImportPrivateKeyResponse> importPrivateKeyAsyncInvoker(
        ImportPrivateKeyRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.importPrivateKey, hcClient);
    }

    /**
     * 查询失败的任务信息
     *
     * 查询绑定、解绑等操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFailedTaskRequest 请求对象
     * @return CompletableFuture<ListFailedTaskResponse>
     */
    public CompletableFuture<ListFailedTaskResponse> listFailedTaskAsync(ListFailedTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listFailedTask);
    }

    /**
     * 查询失败的任务信息
     *
     * 查询绑定、解绑等操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFailedTaskRequest 请求对象
     * @return AsyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse>
     */
    public AsyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTaskAsyncInvoker(
        ListFailedTaskRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.listFailedTask, hcClient);
    }

    /**
     * 查询SSH密钥对详细信息
     *
     * 查询SSH密钥对详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairDetailRequest 请求对象
     * @return CompletableFuture<ListKeypairDetailResponse>
     */
    public CompletableFuture<ListKeypairDetailResponse> listKeypairDetailAsync(ListKeypairDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairDetail);
    }

    /**
     * 查询SSH密钥对详细信息
     *
     * 查询SSH密钥对详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairDetailRequest 请求对象
     * @return AsyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse>
     */
    public AsyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetailAsyncInvoker(
        ListKeypairDetailRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.listKeypairDetail, hcClient);
    }

    /**
     * 查询任务信息
     *
     * 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairTaskRequest 请求对象
     * @return CompletableFuture<ListKeypairTaskResponse>
     */
    public CompletableFuture<ListKeypairTaskResponse> listKeypairTaskAsync(ListKeypairTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairTask);
    }

    /**
     * 查询任务信息
     *
     * 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairTaskRequest 请求对象
     * @return AsyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse>
     */
    public AsyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTaskAsyncInvoker(
        ListKeypairTaskRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.listKeypairTask, hcClient);
    }

    /**
     * 查询SSH密钥对列表
     *
     * 查询SSH密钥对列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairsRequest 请求对象
     * @return CompletableFuture<ListKeypairsResponse>
     */
    public CompletableFuture<ListKeypairsResponse> listKeypairsAsync(ListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listKeypairs);
    }

    /**
     * 查询SSH密钥对列表
     *
     * 查询SSH密钥对列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairsRequest 请求对象
     * @return AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public AsyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsAsyncInvoker(
        ListKeypairsRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.listKeypairs, hcClient);
    }

    /**
     * 查询正在处理的任务信息
     *
     * 查询正在处理的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningTaskRequest 请求对象
     * @return CompletableFuture<ListRunningTaskResponse>
     */
    public CompletableFuture<ListRunningTaskResponse> listRunningTaskAsync(ListRunningTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.listRunningTask);
    }

    /**
     * 查询正在处理的任务信息
     *
     * 查询正在处理的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningTaskRequest 请求对象
     * @return AsyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse>
     */
    public AsyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTaskAsyncInvoker(
        ListRunningTaskRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.listRunningTask, hcClient);
    }

    /**
     * 更新SSH密钥对描述
     *
     * 更新SSH密钥对描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeypairDescriptionRequest 请求对象
     * @return CompletableFuture<UpdateKeypairDescriptionResponse>
     */
    public CompletableFuture<UpdateKeypairDescriptionResponse> updateKeypairDescriptionAsync(
        UpdateKeypairDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KpsMeta.updateKeypairDescription);
    }

    /**
     * 更新SSH密钥对描述
     *
     * 更新SSH密钥对描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeypairDescriptionRequest 请求对象
     * @return AsyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse>
     */
    public AsyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescriptionAsyncInvoker(
        UpdateKeypairDescriptionRequest request) {
        return new AsyncInvoker<>(request, KpsMeta.updateKeypairDescription, hcClient);
    }

}

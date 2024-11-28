package com.huaweicloud.sdk.kps.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.AssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.BatchAssociateKeypairResponse;
import com.huaweicloud.sdk.kps.v3.model.BatchExportPrivateKeyRequest;
import com.huaweicloud.sdk.kps.v3.model.BatchExportPrivateKeyResponse;
import com.huaweicloud.sdk.kps.v3.model.BatchImportKeypairRequest;
import com.huaweicloud.sdk.kps.v3.model.BatchImportKeypairResponse;
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
     * @param request AssociateKeypairRequest 请求对象
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
     * @param request AssociateKeypairRequest 请求对象
     * @return SyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse>
     */
    public SyncInvoker<AssociateKeypairRequest, AssociateKeypairResponse> associateKeypairInvoker(
        AssociateKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.associateKeypair, hcClient);
    }

    /**
     * 批量绑定SSH密钥对
     *
     * 给指定的虚拟机批量绑定新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateKeypairRequest 请求对象
     * @return BatchAssociateKeypairResponse
     */
    public BatchAssociateKeypairResponse batchAssociateKeypair(BatchAssociateKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.batchAssociateKeypair);
    }

    /**
     * 批量绑定SSH密钥对
     *
     * 给指定的虚拟机批量绑定新的SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateKeypairRequest 请求对象
     * @return SyncInvoker<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse>
     */
    public SyncInvoker<BatchAssociateKeypairRequest, BatchAssociateKeypairResponse> batchAssociateKeypairInvoker(
        BatchAssociateKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.batchAssociateKeypair, hcClient);
    }

    /**
     * 批量导出密钥对私钥
     *
     * 批量导出密钥对私钥，单次最多导出10条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportPrivateKeyRequest 请求对象
     * @return BatchExportPrivateKeyResponse
     */
    public BatchExportPrivateKeyResponse batchExportPrivateKey(BatchExportPrivateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.batchExportPrivateKey);
    }

    /**
     * 批量导出密钥对私钥
     *
     * 批量导出密钥对私钥，单次最多导出10条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportPrivateKeyRequest 请求对象
     * @return SyncInvoker<BatchExportPrivateKeyRequest, BatchExportPrivateKeyResponse>
     */
    public SyncInvoker<BatchExportPrivateKeyRequest, BatchExportPrivateKeyResponse> batchExportPrivateKeyInvoker(
        BatchExportPrivateKeyRequest request) {
        return new SyncInvoker<>(request, KpsMeta.batchExportPrivateKey, hcClient);
    }

    /**
     * 批量导入SSH密钥对
     *
     * 批量导入SSH密钥对,单次批量导入不得超过10条记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportKeypairRequest 请求对象
     * @return BatchImportKeypairResponse
     */
    public BatchImportKeypairResponse batchImportKeypair(BatchImportKeypairRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.batchImportKeypair);
    }

    /**
     * 批量导入SSH密钥对
     *
     * 批量导入SSH密钥对,单次批量导入不得超过10条记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportKeypairRequest 请求对象
     * @return SyncInvoker<BatchImportKeypairRequest, BatchImportKeypairResponse>
     */
    public SyncInvoker<BatchImportKeypairRequest, BatchImportKeypairResponse> batchImportKeypairInvoker(
        BatchImportKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.batchImportKeypair, hcClient);
    }

    /**
     * 清除私钥
     *
     * 清除SSH密钥对私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearPrivateKeyRequest 请求对象
     * @return ClearPrivateKeyResponse
     */
    public ClearPrivateKeyResponse clearPrivateKey(ClearPrivateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.clearPrivateKey);
    }

    /**
     * 清除私钥
     *
     * 清除SSH密钥对私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearPrivateKeyRequest 请求对象
     * @return SyncInvoker<ClearPrivateKeyRequest, ClearPrivateKeyResponse>
     */
    public SyncInvoker<ClearPrivateKeyRequest, ClearPrivateKeyResponse> clearPrivateKeyInvoker(
        ClearPrivateKeyRequest request) {
        return new SyncInvoker<>(request, KpsMeta.clearPrivateKey, hcClient);
    }

    /**
     * 创建和导入SSH密钥对
     *
     * 创建和导入SSH密钥对
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKeypairRequest 请求对象
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
     * @param request CreateKeypairRequest 请求对象
     * @return SyncInvoker<CreateKeypairRequest, CreateKeypairResponse>
     */
    public SyncInvoker<CreateKeypairRequest, CreateKeypairResponse> createKeypairInvoker(CreateKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.createKeypair, hcClient);
    }

    /**
     * 删除所有失败的任务
     *
     * 删除操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAllFailedTaskRequest 请求对象
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
     * @param request DeleteAllFailedTaskRequest 请求对象
     * @return SyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse>
     */
    public SyncInvoker<DeleteAllFailedTaskRequest, DeleteAllFailedTaskResponse> deleteAllFailedTaskInvoker(
        DeleteAllFailedTaskRequest request) {
        return new SyncInvoker<>(request, KpsMeta.deleteAllFailedTask, hcClient);
    }

    /**
     * 删除失败的任务
     *
     * 删除失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFailedTaskRequest 请求对象
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
     * @param request DeleteFailedTaskRequest 请求对象
     * @return SyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse>
     */
    public SyncInvoker<DeleteFailedTaskRequest, DeleteFailedTaskResponse> deleteFailedTaskInvoker(
        DeleteFailedTaskRequest request) {
        return new SyncInvoker<>(request, KpsMeta.deleteFailedTask, hcClient);
    }

    /**
     * 删除SSH密钥对
     *
     * 删除SSH密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKeypairRequest 请求对象
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
     * @param request DeleteKeypairRequest 请求对象
     * @return SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse>
     */
    public SyncInvoker<DeleteKeypairRequest, DeleteKeypairResponse> deleteKeypairInvoker(DeleteKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.deleteKeypair, hcClient);
    }

    /**
     * 解绑SSH密钥对
     *
     * 给指定的虚拟机解除绑定SSH密钥对并恢复SSH密码登录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateKeypairRequest 请求对象
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
     * @param request DisassociateKeypairRequest 请求对象
     * @return SyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse>
     */
    public SyncInvoker<DisassociateKeypairRequest, DisassociateKeypairResponse> disassociateKeypairInvoker(
        DisassociateKeypairRequest request) {
        return new SyncInvoker<>(request, KpsMeta.disassociateKeypair, hcClient);
    }

    /**
     * 导出私钥
     *
     * 导出指定密钥对的私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPrivateKeyRequest 请求对象
     * @return ExportPrivateKeyResponse
     */
    public ExportPrivateKeyResponse exportPrivateKey(ExportPrivateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.exportPrivateKey);
    }

    /**
     * 导出私钥
     *
     * 导出指定密钥对的私钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPrivateKeyRequest 请求对象
     * @return SyncInvoker<ExportPrivateKeyRequest, ExportPrivateKeyResponse>
     */
    public SyncInvoker<ExportPrivateKeyRequest, ExportPrivateKeyResponse> exportPrivateKeyInvoker(
        ExportPrivateKeyRequest request) {
        return new SyncInvoker<>(request, KpsMeta.exportPrivateKey, hcClient);
    }

    /**
     * 导入私钥
     *
     * 导入私钥到指定密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPrivateKeyRequest 请求对象
     * @return ImportPrivateKeyResponse
     */
    public ImportPrivateKeyResponse importPrivateKey(ImportPrivateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KpsMeta.importPrivateKey);
    }

    /**
     * 导入私钥
     *
     * 导入私钥到指定密钥对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPrivateKeyRequest 请求对象
     * @return SyncInvoker<ImportPrivateKeyRequest, ImportPrivateKeyResponse>
     */
    public SyncInvoker<ImportPrivateKeyRequest, ImportPrivateKeyResponse> importPrivateKeyInvoker(
        ImportPrivateKeyRequest request) {
        return new SyncInvoker<>(request, KpsMeta.importPrivateKey, hcClient);
    }

    /**
     * 查询失败的任务信息
     *
     * 查询绑定、解绑等操作失败的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFailedTaskRequest 请求对象
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
     * @param request ListFailedTaskRequest 请求对象
     * @return SyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse>
     */
    public SyncInvoker<ListFailedTaskRequest, ListFailedTaskResponse> listFailedTaskInvoker(
        ListFailedTaskRequest request) {
        return new SyncInvoker<>(request, KpsMeta.listFailedTask, hcClient);
    }

    /**
     * 查询SSH密钥对详细信息
     *
     * 查询SSH密钥对详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairDetailRequest 请求对象
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
     * @param request ListKeypairDetailRequest 请求对象
     * @return SyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse>
     */
    public SyncInvoker<ListKeypairDetailRequest, ListKeypairDetailResponse> listKeypairDetailInvoker(
        ListKeypairDetailRequest request) {
        return new SyncInvoker<>(request, KpsMeta.listKeypairDetail, hcClient);
    }

    /**
     * 查询任务信息
     *
     * 根据SSH密钥对接口返回的task_id，查询SSH密钥对当前任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairTaskRequest 请求对象
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
     * @param request ListKeypairTaskRequest 请求对象
     * @return SyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse>
     */
    public SyncInvoker<ListKeypairTaskRequest, ListKeypairTaskResponse> listKeypairTaskInvoker(
        ListKeypairTaskRequest request) {
        return new SyncInvoker<>(request, KpsMeta.listKeypairTask, hcClient);
    }

    /**
     * 查询SSH密钥对列表
     *
     * 查询SSH密钥对列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeypairsRequest 请求对象
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
     * @param request ListKeypairsRequest 请求对象
     * @return SyncInvoker<ListKeypairsRequest, ListKeypairsResponse>
     */
    public SyncInvoker<ListKeypairsRequest, ListKeypairsResponse> listKeypairsInvoker(ListKeypairsRequest request) {
        return new SyncInvoker<>(request, KpsMeta.listKeypairs, hcClient);
    }

    /**
     * 查询正在处理的任务信息
     *
     * 查询正在处理的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunningTaskRequest 请求对象
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
     * @param request ListRunningTaskRequest 请求对象
     * @return SyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse>
     */
    public SyncInvoker<ListRunningTaskRequest, ListRunningTaskResponse> listRunningTaskInvoker(
        ListRunningTaskRequest request) {
        return new SyncInvoker<>(request, KpsMeta.listRunningTask, hcClient);
    }

    /**
     * 更新SSH密钥对描述
     *
     * 更新SSH密钥对描述。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKeypairDescriptionRequest 请求对象
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
     * @param request UpdateKeypairDescriptionRequest 请求对象
     * @return SyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse>
     */
    public SyncInvoker<UpdateKeypairDescriptionRequest, UpdateKeypairDescriptionResponse> updateKeypairDescriptionInvoker(
        UpdateKeypairDescriptionRequest request) {
        return new SyncInvoker<>(request, KpsMeta.updateKeypairDescription, hcClient);
    }

}

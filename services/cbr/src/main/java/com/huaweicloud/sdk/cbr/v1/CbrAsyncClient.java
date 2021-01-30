package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cbr.v1.model.*;

public class CbrAsyncClient {
    protected HcClient hcClient;

    public CbrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbrAsyncClient> newBuilder() {
        return new ClientBuilder<>(CbrAsyncClient::new);
    }


    /**
     * 添加备份成员
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     *
     * @param AddMemberRequest 请求对象
     * @return CompletableFuture<AddMemberResponse>
     */
    public CompletableFuture<AddMemberResponse> addMemberAsync(AddMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addMember);
    }

    /**
     * 添加备份成员
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     *
     * @param AddMemberRequest 请求对象
     * @return AsyncInvoker<AddMemberRequest, AddMemberResponse>
     */
    public AsyncInvoker<AddMemberRequest, AddMemberResponse> addMemberAsyncInvoker(AddMemberRequest request) {
        return new AsyncInvoker<AddMemberRequest, AddMemberResponse>(request, CbrMeta.addMember, hcClient);
    }

    /**
     * 添加资源
     * 存储库添加资源
     *
     * @param AddVaultResourceRequest 请求对象
     * @return CompletableFuture<AddVaultResourceResponse>
     */
    public CompletableFuture<AddVaultResourceResponse> addVaultResourceAsync(AddVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    /**
     * 添加资源
     * 存储库添加资源
     *
     * @param AddVaultResourceRequest 请求对象
     * @return AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>
     */
    public AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResourceAsyncInvoker(AddVaultResourceRequest request) {
        return new AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>(request, CbrMeta.addVaultResource, hcClient);
    }

    /**
     * 设置存储库策略
     * 存储库设置策略
     *
     * @param AssociateVaultPolicyRequest 请求对象
     * @return CompletableFuture<AssociateVaultPolicyResponse>
     */
    public CompletableFuture<AssociateVaultPolicyResponse> associateVaultPolicyAsync(AssociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    /**
     * 设置存储库策略
     * 存储库设置策略
     *
     * @param AssociateVaultPolicyRequest 请求对象
     * @return AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>
     */
    public AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicyAsyncInvoker(AssociateVaultPolicyRequest request) {
        return new AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>(request, CbrMeta.associateVaultPolicy, hcClient);
    }

    /**
     * 批量添加删除存储库资源标签
     * 为指定实例批量添加或删除标签 标签管理服务需要使用该接口批量管理实例的标签。 一个资源上最多有10个标签。 此接口为幂等接口：     创建时如果请求体中存在重复key则报错。     创建时，不允许重复key，如果数据库存在就覆盖。     删除时，允许重复key。     删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。key长度127个字符，value为255个字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateAndDeleteVaultTagsResponse>
     */
    public CompletableFuture<BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsync(BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
    }

    /**
     * 批量添加删除存储库资源标签
     * 为指定实例批量添加或删除标签 标签管理服务需要使用该接口批量管理实例的标签。 一个资源上最多有10个标签。 此接口为幂等接口：     创建时如果请求体中存在重复key则报错。     创建时，不允许重复key，如果数据库存在就覆盖。     删除时，允许重复key。     删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。key长度127个字符，value为255个字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>
     */
    public AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsyncInvoker(BatchCreateAndDeleteVaultTagsRequest request) {
        return new AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>(request, CbrMeta.batchCreateAndDeleteVaultTags, hcClient);
    }

    /**
     * 复制备份
     * 跨区域复制备份。
     *
     * @param CopyBackupRequest 请求对象
     * @return CompletableFuture<CopyBackupResponse>
     */
    public CompletableFuture<CopyBackupResponse> copyBackupAsync(CopyBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.copyBackup);
    }

    /**
     * 复制备份
     * 跨区域复制备份。
     *
     * @param CopyBackupRequest 请求对象
     * @return AsyncInvoker<CopyBackupRequest, CopyBackupResponse>
     */
    public AsyncInvoker<CopyBackupRequest, CopyBackupResponse> copyBackupAsyncInvoker(CopyBackupRequest request) {
        return new AsyncInvoker<CopyBackupRequest, CopyBackupResponse>(request, CbrMeta.copyBackup, hcClient);
    }

    /**
     * 复制备份还原点
     * 执行复制
     *
     * @param CopyCheckpointRequest 请求对象
     * @return CompletableFuture<CopyCheckpointResponse>
     */
    public CompletableFuture<CopyCheckpointResponse> copyCheckpointAsync(CopyCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.copyCheckpoint);
    }

    /**
     * 复制备份还原点
     * 执行复制
     *
     * @param CopyCheckpointRequest 请求对象
     * @return AsyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse>
     */
    public AsyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse> copyCheckpointAsyncInvoker(CopyCheckpointRequest request) {
        return new AsyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse>(request, CbrMeta.copyCheckpoint, hcClient);
    }

    /**
     * 创建备份还原点
     * 对存储库执行备份，生成备份还原点
     *
     * @param CreateCheckpointRequest 请求对象
     * @return CompletableFuture<CreateCheckpointResponse>
     */
    public CompletableFuture<CreateCheckpointResponse> createCheckpointAsync(CreateCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    /**
     * 创建备份还原点
     * 对存储库执行备份，生成备份还原点
     *
     * @param CreateCheckpointRequest 请求对象
     * @return AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>
     */
    public AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpointAsyncInvoker(CreateCheckpointRequest request) {
        return new AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>(request, CbrMeta.createCheckpoint, hcClient);
    }

    /**
     * 创建策略
     * [创建策略，策略分为备份策略和复制策略。](tag:hws,hws_hk) [创建备份策略。](tag:dt,ocb,tlf,sbc,fcs_vm,ctc)
     *
     * @param CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createPolicy);
    }

    /**
     * 创建策略
     * [创建策略，策略分为备份策略和复制策略。](tag:hws,hws_hk) [创建备份策略。](tag:dt,ocb,tlf,sbc,fcs_vm,ctc)
     *
     * @param CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, CbrMeta.createPolicy, hcClient);
    }

    /**
     * 创建存储库
     * 创建存储库
     *
     * @param CreateVaultRequest 请求对象
     * @return CompletableFuture<CreateVaultResponse>
     */
    public CompletableFuture<CreateVaultResponse> createVaultAsync(CreateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVault);
    }

    /**
     * 创建存储库
     * 创建存储库
     *
     * @param CreateVaultRequest 请求对象
     * @return AsyncInvoker<CreateVaultRequest, CreateVaultResponse>
     */
    public AsyncInvoker<CreateVaultRequest, CreateVaultResponse> createVaultAsyncInvoker(CreateVaultRequest request) {
        return new AsyncInvoker<CreateVaultRequest, CreateVaultResponse>(request, CbrMeta.createVault, hcClient);
    }

    /**
     * 添加存储库资源标签
     * 一个资源上最多有10个标签。 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateVaultTagsRequest 请求对象
     * @return CompletableFuture<CreateVaultTagsResponse>
     */
    public CompletableFuture<CreateVaultTagsResponse> createVaultTagsAsync(CreateVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    /**
     * 添加存储库资源标签
     * 一个资源上最多有10个标签。 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateVaultTagsRequest 请求对象
     * @return AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>
     */
    public AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTagsAsyncInvoker(CreateVaultTagsRequest request) {
        return new AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>(request, CbrMeta.createVaultTags, hcClient);
    }

    /**
     * 删除备份
     * 删除单个备份。
     *
     * @param DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    /**
     * 删除备份
     * 删除单个备份。
     *
     * @param DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(DeleteBackupRequest request) {
        return new AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, CbrMeta.deleteBackup, hcClient);
    }

    /**
     * 删除指定备份成员
     * 删除指定的备份共享成员
     *
     * @param DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteMember);
    }

    /**
     * 删除指定备份成员
     * 删除指定的备份共享成员
     *
     * @param DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(DeleteMemberRequest request) {
        return new AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, CbrMeta.deleteMember, hcClient);
    }

    /**
     * 删除策略
     * 删除策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    /**
     * 删除策略
     * 删除策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, CbrMeta.deletePolicy, hcClient);
    }

    /**
     * 删除存储库
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     *
     * @param DeleteVaultRequest 请求对象
     * @return CompletableFuture<DeleteVaultResponse>
     */
    public CompletableFuture<DeleteVaultResponse> deleteVaultAsync(DeleteVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVault);
    }

    /**
     * 删除存储库
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     *
     * @param DeleteVaultRequest 请求对象
     * @return AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse>
     */
    public AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse> deleteVaultAsyncInvoker(DeleteVaultRequest request) {
        return new AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse>(request, CbrMeta.deleteVault, hcClient);
    }

    /**
     * 删除存储库资源标签
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     *
     * @param DeleteVaultTagRequest 请求对象
     * @return CompletableFuture<DeleteVaultTagResponse>
     */
    public CompletableFuture<DeleteVaultTagResponse> deleteVaultTagAsync(DeleteVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    /**
     * 删除存储库资源标签
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     *
     * @param DeleteVaultTagRequest 请求对象
     * @return AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>
     */
    public AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTagAsyncInvoker(DeleteVaultTagRequest request) {
        return new AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>(request, CbrMeta.deleteVaultTag, hcClient);
    }

    /**
     * 解除存储库策略
     * 存储库解除策略
     *
     * @param DisassociateVaultPolicyRequest 请求对象
     * @return CompletableFuture<DisassociateVaultPolicyResponse>
     */
    public CompletableFuture<DisassociateVaultPolicyResponse> disassociateVaultPolicyAsync(DisassociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    /**
     * 解除存储库策略
     * 存储库解除策略
     *
     * @param DisassociateVaultPolicyRequest 请求对象
     * @return AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>
     */
    public AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicyAsyncInvoker(DisassociateVaultPolicyRequest request) {
        return new AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>(request, CbrMeta.disassociateVaultPolicy, hcClient);
    }

    /**
     * 同步备份
     * 同步备份副本
     *
     * @param ImportBackupRequest 请求对象
     * @return CompletableFuture<ImportBackupResponse>
     */
    public CompletableFuture<ImportBackupResponse> importBackupAsync(ImportBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.importBackup);
    }

    /**
     * 同步备份
     * 同步备份副本
     *
     * @param ImportBackupRequest 请求对象
     * @return AsyncInvoker<ImportBackupRequest, ImportBackupResponse>
     */
    public AsyncInvoker<ImportBackupRequest, ImportBackupResponse> importBackupAsyncInvoker(ImportBackupRequest request) {
        return new AsyncInvoker<ImportBackupRequest, ImportBackupResponse>(request, CbrMeta.importBackup, hcClient);
    }

    /**
     * 查询所有备份
     * 查询所有副本
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listBackups);
    }

    /**
     * 查询所有备份
     * 查询所有副本
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, CbrMeta.listBackups, hcClient);
    }

    /**
     * 查询任务列表
     * 查询任务列表
     *
     * @param ListOpLogsRequest 请求对象
     * @return CompletableFuture<ListOpLogsResponse>
     */
    public CompletableFuture<ListOpLogsResponse> listOpLogsAsync(ListOpLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    /**
     * 查询任务列表
     * 查询任务列表
     *
     * @param ListOpLogsRequest 请求对象
     * @return AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse>
     */
    public AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse> listOpLogsAsyncInvoker(ListOpLogsRequest request) {
        return new AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse>(request, CbrMeta.listOpLogs, hcClient);
    }

    /**
     * 查询策略列表
     * 查询策略列表
     *
     * @param ListPoliciesRequest 请求对象
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listPolicies);
    }

    /**
     * 查询策略列表
     * 查询策略列表
     *
     * @param ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(ListPoliciesRequest request) {
        return new AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, CbrMeta.listPolicies, hcClient);
    }

    /**
     * 查询可保护资源
     * 查询可保护性资源列表
     *
     * @param ListProtectableRequest 请求对象
     * @return CompletableFuture<ListProtectableResponse>
     */
    public CompletableFuture<ListProtectableResponse> listProtectableAsync(ListProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listProtectable);
    }

    /**
     * 查询可保护资源
     * 查询可保护性资源列表
     *
     * @param ListProtectableRequest 请求对象
     * @return AsyncInvoker<ListProtectableRequest, ListProtectableResponse>
     */
    public AsyncInvoker<ListProtectableRequest, ListProtectableResponse> listProtectableAsyncInvoker(ListProtectableRequest request) {
        return new AsyncInvoker<ListProtectableRequest, ListProtectableResponse>(request, CbrMeta.listProtectable, hcClient);
    }

    /**
     * 查询存储库列表
     * 查询存储库列表
     *
     * @param ListVaultRequest 请求对象
     * @return CompletableFuture<ListVaultResponse>
     */
    public CompletableFuture<ListVaultResponse> listVaultAsync(ListVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listVault);
    }

    /**
     * 查询存储库列表
     * 查询存储库列表
     *
     * @param ListVaultRequest 请求对象
     * @return AsyncInvoker<ListVaultRequest, ListVaultResponse>
     */
    public AsyncInvoker<ListVaultRequest, ListVaultResponse> listVaultAsyncInvoker(ListVaultRequest request) {
        return new AsyncInvoker<ListVaultRequest, ListVaultResponse>(request, CbrMeta.listVault, hcClient);
    }

    /**
     * 迁移资源
     * 支持资源迁移到另一个存储库，不删除备份。
     *
     * @param MigrateVaultResourceRequest 请求对象
     * @return CompletableFuture<MigrateVaultResourceResponse>
     */
    public CompletableFuture<MigrateVaultResourceResponse> migrateVaultResourceAsync(MigrateVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.migrateVaultResource);
    }

    /**
     * 迁移资源
     * 支持资源迁移到另一个存储库，不删除备份。
     *
     * @param MigrateVaultResourceRequest 请求对象
     * @return AsyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse>
     */
    public AsyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse> migrateVaultResourceAsyncInvoker(MigrateVaultResourceRequest request) {
        return new AsyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse>(request, CbrMeta.migrateVaultResource, hcClient);
    }

    /**
     * 移除资源
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     *
     * @param RemoveVaultResourceRequest 请求对象
     * @return CompletableFuture<RemoveVaultResourceResponse>
     */
    public CompletableFuture<RemoveVaultResourceResponse> removeVaultResourceAsync(RemoveVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    /**
     * 移除资源
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     *
     * @param RemoveVaultResourceRequest 请求对象
     * @return AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>
     */
    public AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResourceAsyncInvoker(RemoveVaultResourceRequest request) {
        return new AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>(request, CbrMeta.removeVaultResource, hcClient);
    }

    /**
     * 备份恢复
     * 恢复备份数据
     *
     * @param RestoreBackupRequest 请求对象
     * @return CompletableFuture<RestoreBackupResponse>
     */
    public CompletableFuture<RestoreBackupResponse> restoreBackupAsync(RestoreBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    /**
     * 备份恢复
     * 恢复备份数据
     *
     * @param RestoreBackupRequest 请求对象
     * @return AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupAsyncInvoker(RestoreBackupRequest request) {
        return new AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, CbrMeta.restoreBackup, hcClient);
    }

    /**
     * 查询指定备份
     * 根据指定id查询单个副本。
     *
     * @param ShowBackupRequest 请求对象
     * @return CompletableFuture<ShowBackupResponse>
     */
    public CompletableFuture<ShowBackupResponse> showBackupAsync(ShowBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showBackup);
    }

    /**
     * 查询指定备份
     * 根据指定id查询单个副本。
     *
     * @param ShowBackupRequest 请求对象
     * @return AsyncInvoker<ShowBackupRequest, ShowBackupResponse>
     */
    public AsyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupAsyncInvoker(ShowBackupRequest request) {
        return new AsyncInvoker<ShowBackupRequest, ShowBackupResponse>(request, CbrMeta.showBackup, hcClient);
    }

    /**
     * 查询备份还原点
     * 根据还原点ID查询指定还原点
     *
     * @param ShowCheckpointRequest 请求对象
     * @return CompletableFuture<ShowCheckpointResponse>
     */
    public CompletableFuture<ShowCheckpointResponse> showCheckpointAsync(ShowCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    /**
     * 查询备份还原点
     * 根据还原点ID查询指定还原点
     *
     * @param ShowCheckpointRequest 请求对象
     * @return AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>
     */
    public AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointAsyncInvoker(ShowCheckpointRequest request) {
        return new AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, CbrMeta.showCheckpoint, hcClient);
    }

    /**
     * 获取备份成员详情
     * 获取备份成员的详情
     *
     * @param ShowMemberDetailRequest 请求对象
     * @return CompletableFuture<ShowMemberDetailResponse>
     */
    public CompletableFuture<ShowMemberDetailResponse> showMemberDetailAsync(ShowMemberDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    /**
     * 获取备份成员详情
     * 获取备份成员的详情
     *
     * @param ShowMemberDetailRequest 请求对象
     * @return AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>
     */
    public AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetailAsyncInvoker(ShowMemberDetailRequest request) {
        return new AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>(request, CbrMeta.showMemberDetail, hcClient);
    }

    /**
     * 获取备份成员列表
     * 获取备份共享成员的列表信息
     *
     * @param ShowMembersDetailRequest 请求对象
     * @return CompletableFuture<ShowMembersDetailResponse>
     */
    public CompletableFuture<ShowMembersDetailResponse> showMembersDetailAsync(ShowMembersDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    /**
     * 获取备份成员列表
     * 获取备份共享成员的列表信息
     *
     * @param ShowMembersDetailRequest 请求对象
     * @return AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>
     */
    public AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetailAsyncInvoker(ShowMembersDetailRequest request) {
        return new AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>(request, CbrMeta.showMembersDetail, hcClient);
    }

    /**
     * 查询单个任务
     * 根据指定任务ID查询任务
     *
     * @param ShowOpLogRequest 请求对象
     * @return CompletableFuture<ShowOpLogResponse>
     */
    public CompletableFuture<ShowOpLogResponse> showOpLogAsync(ShowOpLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showOpLog);
    }

    /**
     * 查询单个任务
     * 根据指定任务ID查询任务
     *
     * @param ShowOpLogRequest 请求对象
     * @return AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse>
     */
    public AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse> showOpLogAsyncInvoker(ShowOpLogRequest request) {
        return new AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse>(request, CbrMeta.showOpLog, hcClient);
    }

    /**
     * 查询单个策略
     * 查询单个策略
     *
     * @param ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showPolicy);
    }

    /**
     * 查询单个策略
     * 查询单个策略
     *
     * @param ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, CbrMeta.showPolicy, hcClient);
    }

    /**
     * 查询指定可保护资源
     * 根据ID查询可保护性资源
     *
     * @param ShowProtectableRequest 请求对象
     * @return CompletableFuture<ShowProtectableResponse>
     */
    public CompletableFuture<ShowProtectableResponse> showProtectableAsync(ShowProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showProtectable);
    }

    /**
     * 查询指定可保护资源
     * 根据ID查询可保护性资源
     *
     * @param ShowProtectableRequest 请求对象
     * @return AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse>
     */
    public AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse> showProtectableAsyncInvoker(ShowProtectableRequest request) {
        return new AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse>(request, CbrMeta.showProtectable, hcClient);
    }

    /**
     * 查询复制能力
     * 查询本区域的复制能力
     *
     * @param ShowReplicationCapabilitiesRequest 请求对象
     * @return CompletableFuture<ShowReplicationCapabilitiesResponse>
     */
    public CompletableFuture<ShowReplicationCapabilitiesResponse> showReplicationCapabilitiesAsync(ShowReplicationCapabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showReplicationCapabilities);
    }

    /**
     * 查询复制能力
     * 查询本区域的复制能力
     *
     * @param ShowReplicationCapabilitiesRequest 请求对象
     * @return AsyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse>
     */
    public AsyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> showReplicationCapabilitiesAsyncInvoker(ShowReplicationCapabilitiesRequest request) {
        return new AsyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse>(request, CbrMeta.showReplicationCapabilities, hcClient);
    }

    /**
     * 查询指定存储库
     * 根据ID查询指定存储库
     *
     * @param ShowVaultRequest 请求对象
     * @return CompletableFuture<ShowVaultResponse>
     */
    public CompletableFuture<ShowVaultResponse> showVaultAsync(ShowVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVault);
    }

    /**
     * 查询指定存储库
     * 根据ID查询指定存储库
     *
     * @param ShowVaultRequest 请求对象
     * @return AsyncInvoker<ShowVaultRequest, ShowVaultResponse>
     */
    public AsyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultAsyncInvoker(ShowVaultRequest request) {
        return new AsyncInvoker<ShowVaultRequest, ShowVaultResponse>(request, CbrMeta.showVault, hcClient);
    }

    /**
     * 查询存储库项目标签
     * 查询租户在指定Region和实例类型的所有标签集合 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     *
     * @param ShowVaultProjectTagRequest 请求对象
     * @return CompletableFuture<ShowVaultProjectTagResponse>
     */
    public CompletableFuture<ShowVaultProjectTagResponse> showVaultProjectTagAsync(ShowVaultProjectTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    /**
     * 查询存储库项目标签
     * 查询租户在指定Region和实例类型的所有标签集合 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     *
     * @param ShowVaultProjectTagRequest 请求对象
     * @return AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>
     */
    public AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTagAsyncInvoker(ShowVaultProjectTagRequest request) {
        return new AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>(request, CbrMeta.showVaultProjectTag, hcClient);
    }

    /**
     * 查询存储库资源实例
     * 使用标签过滤实例 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     *
     * @param ShowVaultResourceInstancesRequest 请求对象
     * @return CompletableFuture<ShowVaultResourceInstancesResponse>
     */
    public CompletableFuture<ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsync(ShowVaultResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    /**
     * 查询存储库资源实例
     * 使用标签过滤实例 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     *
     * @param ShowVaultResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>
     */
    public AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsyncInvoker(ShowVaultResourceInstancesRequest request) {
        return new AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>(request, CbrMeta.showVaultResourceInstances, hcClient);
    }

    /**
     * 查询存储库资源标签
     * 查询指定实例的标签信息 标签管理服务需要使用该接口查询指定实例的全部标签数据
     *
     * @param ShowVaultTagRequest 请求对象
     * @return CompletableFuture<ShowVaultTagResponse>
     */
    public CompletableFuture<ShowVaultTagResponse> showVaultTagAsync(ShowVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    /**
     * 查询存储库资源标签
     * 查询指定实例的标签信息 标签管理服务需要使用该接口查询指定实例的全部标签数据
     *
     * @param ShowVaultTagRequest 请求对象
     * @return AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>
     */
    public AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTagAsyncInvoker(ShowVaultTagRequest request) {
        return new AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>(request, CbrMeta.showVaultTag, hcClient);
    }

    /**
     * 更新备份成员状态
     * 更新备份共享成员的状态，需要接收方执行此API。
     *
     * @param UpdateMemberStatusRequest 请求对象
     * @return CompletableFuture<UpdateMemberStatusResponse>
     */
    public CompletableFuture<UpdateMemberStatusResponse> updateMemberStatusAsync(UpdateMemberStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    /**
     * 更新备份成员状态
     * 更新备份共享成员的状态，需要接收方执行此API。
     *
     * @param UpdateMemberStatusRequest 请求对象
     * @return AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>
     */
    public AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatusAsyncInvoker(UpdateMemberStatusRequest request) {
        return new AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>(request, CbrMeta.updateMemberStatus, hcClient);
    }

    /**
     * 修改策略
     * 修改策略
     *
     * @param UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    /**
     * 修改策略
     * 修改策略
     *
     * @param UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(UpdatePolicyRequest request) {
        return new AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, CbrMeta.updatePolicy, hcClient);
    }

    /**
     * 修改存储库
     * 根据存储库ID修改存储库
     *
     * @param UpdateVaultRequest 请求对象
     * @return CompletableFuture<UpdateVaultResponse>
     */
    public CompletableFuture<UpdateVaultResponse> updateVaultAsync(UpdateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateVault);
    }

    /**
     * 修改存储库
     * 根据存储库ID修改存储库
     *
     * @param UpdateVaultRequest 请求对象
     * @return AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse>
     */
    public AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse> updateVaultAsyncInvoker(UpdateVaultRequest request) {
        return new AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse>(request, CbrMeta.updateVault, hcClient);
    }

}
package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.cbr.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CbrClient {

    protected HcClient hcClient;

    public CbrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbrClient> newBuilder() {
        return new ClientBuilder<>(CbrClient::new);
    }

    /**
     * 添加备份成员
     *
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMemberRequest 请求对象
     * @return AddMemberResponse
     */
    public AddMemberResponse addMember(AddMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addMember);
    }

    /**
     * 添加备份成员
     *
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddMemberRequest 请求对象
     * @return SyncInvoker<AddMemberRequest, AddMemberResponse>
     */
    public SyncInvoker<AddMemberRequest, AddMemberResponse> addMemberInvoker(AddMemberRequest request) {
        return new SyncInvoker<AddMemberRequest, AddMemberResponse>(request, CbrMeta.addMember, hcClient);
    }

    /**
     * 添加资源
     *
     * 存储库添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVaultResourceRequest 请求对象
     * @return AddVaultResourceResponse
     */
    public AddVaultResourceResponse addVaultResource(AddVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    /**
     * 添加资源
     *
     * 存储库添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVaultResourceRequest 请求对象
     * @return SyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>
     */
    public SyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResourceInvoker(
        AddVaultResourceRequest request) {
        return new SyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>(request, CbrMeta.addVaultResource,
            hcClient);
    }

    /**
     * 设置存储库策略
     *
     * 存储库设置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateVaultPolicyRequest 请求对象
     * @return AssociateVaultPolicyResponse
     */
    public AssociateVaultPolicyResponse associateVaultPolicy(AssociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    /**
     * 设置存储库策略
     *
     * 存储库设置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateVaultPolicyRequest 请求对象
     * @return SyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>
     */
    public SyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicyInvoker(
        AssociateVaultPolicyRequest request) {
        return new SyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>(request,
            CbrMeta.associateVaultPolicy, hcClient);
    }

    /**
     * 批量添加删除存储库资源标签
     *
     * 为指定实例批量添加或删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：
     *     创建时如果请求体中存在重复key则报错。
     *     创建时，不允许重复key，如果数据库存在就覆盖。
     *     删除时，允许重复key。
     *     删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。key长度127个字符，value为255个字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return BatchCreateAndDeleteVaultTagsResponse
     */
    public BatchCreateAndDeleteVaultTagsResponse batchCreateAndDeleteVaultTags(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
    }

    /**
     * 批量添加删除存储库资源标签
     *
     * 为指定实例批量添加或删除标签
     * 标签管理服务需要使用该接口批量管理实例的标签。
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：
     *     创建时如果请求体中存在重复key则报错。
     *     创建时，不允许重复key，如果数据库存在就覆盖。
     *     删除时，允许重复key。
     *     删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。key长度127个字符，value为255个字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>
     */
    public SyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsInvoker(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return new SyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>(request,
            CbrMeta.batchCreateAndDeleteVaultTags, hcClient);
    }

    /**
     * 复制备份
     *
     * 跨区域复制备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyBackupRequest 请求对象
     * @return CopyBackupResponse
     */
    public CopyBackupResponse copyBackup(CopyBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.copyBackup);
    }

    /**
     * 复制备份
     *
     * 跨区域复制备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyBackupRequest 请求对象
     * @return SyncInvoker<CopyBackupRequest, CopyBackupResponse>
     */
    public SyncInvoker<CopyBackupRequest, CopyBackupResponse> copyBackupInvoker(CopyBackupRequest request) {
        return new SyncInvoker<CopyBackupRequest, CopyBackupResponse>(request, CbrMeta.copyBackup, hcClient);
    }

    /**
     * 复制备份还原点
     *
     * 执行复制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyCheckpointRequest 请求对象
     * @return CopyCheckpointResponse
     */
    public CopyCheckpointResponse copyCheckpoint(CopyCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.copyCheckpoint);
    }

    /**
     * 复制备份还原点
     *
     * 执行复制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyCheckpointRequest 请求对象
     * @return SyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse>
     */
    public SyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse> copyCheckpointInvoker(
        CopyCheckpointRequest request) {
        return new SyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse>(request, CbrMeta.copyCheckpoint,
            hcClient);
    }

    /**
     * 创建备份还原点
     *
     * 对存储库执行备份，生成备份还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCheckpointRequest 请求对象
     * @return CreateCheckpointResponse
     */
    public CreateCheckpointResponse createCheckpoint(CreateCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    /**
     * 创建备份还原点
     *
     * 对存储库执行备份，生成备份还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCheckpointRequest 请求对象
     * @return SyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>
     */
    public SyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpointInvoker(
        CreateCheckpointRequest request) {
        return new SyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>(request, CbrMeta.createCheckpoint,
            hcClient);
    }

    /**
     * 创建策略
     *
     * 创建策略，策略分为备份策略和复制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建策略，策略分为备份策略和复制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, CbrMeta.createPolicy, hcClient);
    }

    /**
     * 创建存储库
     *
     * 创建存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVaultRequest 请求对象
     * @return CreateVaultResponse
     */
    public CreateVaultResponse createVault(CreateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVault);
    }

    /**
     * 创建存储库
     *
     * 创建存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVaultRequest 请求对象
     * @return SyncInvoker<CreateVaultRequest, CreateVaultResponse>
     */
    public SyncInvoker<CreateVaultRequest, CreateVaultResponse> createVaultInvoker(CreateVaultRequest request) {
        return new SyncInvoker<CreateVaultRequest, CreateVaultResponse>(request, CbrMeta.createVault, hcClient);
    }

    /**
     * 添加存储库资源标签
     *
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVaultTagsRequest 请求对象
     * @return CreateVaultTagsResponse
     */
    public CreateVaultTagsResponse createVaultTags(CreateVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    /**
     * 添加存储库资源标签
     *
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVaultTagsRequest 请求对象
     * @return SyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>
     */
    public SyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTagsInvoker(
        CreateVaultTagsRequest request) {
        return new SyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>(request, CbrMeta.createVaultTags,
            hcClient);
    }

    /**
     * 删除备份
     *
     * 删除单个备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    /**
     * 删除备份
     *
     * 删除单个备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, CbrMeta.deleteBackup, hcClient);
    }

    /**
     * 删除指定备份成员
     *
     * 删除指定的备份共享成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteMember);
    }

    /**
     * 删除指定备份成员
     *
     * 删除指定的备份共享成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMemberRequest 请求对象
     * @return SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public SyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberInvoker(DeleteMemberRequest request) {
        return new SyncInvoker<DeleteMemberRequest, DeleteMemberResponse>(request, CbrMeta.deleteMember, hcClient);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, CbrMeta.deletePolicy, hcClient);
    }

    /**
     * 删除存储库
     *
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVaultRequest 请求对象
     * @return DeleteVaultResponse
     */
    public DeleteVaultResponse deleteVault(DeleteVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVault);
    }

    /**
     * 删除存储库
     *
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVaultRequest 请求对象
     * @return SyncInvoker<DeleteVaultRequest, DeleteVaultResponse>
     */
    public SyncInvoker<DeleteVaultRequest, DeleteVaultResponse> deleteVaultInvoker(DeleteVaultRequest request) {
        return new SyncInvoker<DeleteVaultRequest, DeleteVaultResponse>(request, CbrMeta.deleteVault, hcClient);
    }

    /**
     * 删除存储库资源标签
     *
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVaultTagRequest 请求对象
     * @return DeleteVaultTagResponse
     */
    public DeleteVaultTagResponse deleteVaultTag(DeleteVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    /**
     * 删除存储库资源标签
     *
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVaultTagRequest 请求对象
     * @return SyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>
     */
    public SyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTagInvoker(
        DeleteVaultTagRequest request) {
        return new SyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>(request, CbrMeta.deleteVaultTag,
            hcClient);
    }

    /**
     * 解除存储库策略
     *
     * 存储库解除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateVaultPolicyRequest 请求对象
     * @return DisassociateVaultPolicyResponse
     */
    public DisassociateVaultPolicyResponse disassociateVaultPolicy(DisassociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    /**
     * 解除存储库策略
     *
     * 存储库解除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateVaultPolicyRequest 请求对象
     * @return SyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>
     */
    public SyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicyInvoker(
        DisassociateVaultPolicyRequest request) {
        return new SyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>(request,
            CbrMeta.disassociateVaultPolicy, hcClient);
    }

    /**
     * 同步备份
     *
     * 同步线下混合云VMware备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBackupRequest 请求对象
     * @return ImportBackupResponse
     */
    public ImportBackupResponse importBackup(ImportBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.importBackup);
    }

    /**
     * 同步备份
     *
     * 同步线下混合云VMware备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportBackupRequest 请求对象
     * @return SyncInvoker<ImportBackupRequest, ImportBackupResponse>
     */
    public SyncInvoker<ImportBackupRequest, ImportBackupResponse> importBackupInvoker(ImportBackupRequest request) {
        return new SyncInvoker<ImportBackupRequest, ImportBackupResponse>(request, CbrMeta.importBackup, hcClient);
    }

    /**
     * 查询所有备份
     *
     * 查询所有副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listBackups);
    }

    /**
     * 查询所有备份
     *
     * 查询所有副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, CbrMeta.listBackups, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpLogsRequest 请求对象
     * @return ListOpLogsResponse
     */
    public ListOpLogsResponse listOpLogs(ListOpLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpLogsRequest 请求对象
     * @return SyncInvoker<ListOpLogsRequest, ListOpLogsResponse>
     */
    public SyncInvoker<ListOpLogsRequest, ListOpLogsResponse> listOpLogsInvoker(ListOpLogsRequest request) {
        return new SyncInvoker<ListOpLogsRequest, ListOpLogsResponse>(request, CbrMeta.listOpLogs, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listPolicies);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public SyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesInvoker(ListPoliciesRequest request) {
        return new SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, CbrMeta.listPolicies, hcClient);
    }

    /**
     * 查询可保护资源
     *
     * 查询可保护性资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectableRequest 请求对象
     * @return ListProtectableResponse
     */
    public ListProtectableResponse listProtectable(ListProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listProtectable);
    }

    /**
     * 查询可保护资源
     *
     * 查询可保护性资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectableRequest 请求对象
     * @return SyncInvoker<ListProtectableRequest, ListProtectableResponse>
     */
    public SyncInvoker<ListProtectableRequest, ListProtectableResponse> listProtectableInvoker(
        ListProtectableRequest request) {
        return new SyncInvoker<ListProtectableRequest, ListProtectableResponse>(request, CbrMeta.listProtectable,
            hcClient);
    }

    /**
     * 查询存储库列表
     *
     * 查询存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVaultRequest 请求对象
     * @return ListVaultResponse
     */
    public ListVaultResponse listVault(ListVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listVault);
    }

    /**
     * 查询存储库列表
     *
     * 查询存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVaultRequest 请求对象
     * @return SyncInvoker<ListVaultRequest, ListVaultResponse>
     */
    public SyncInvoker<ListVaultRequest, ListVaultResponse> listVaultInvoker(ListVaultRequest request) {
        return new SyncInvoker<ListVaultRequest, ListVaultResponse>(request, CbrMeta.listVault, hcClient);
    }

    /**
     * 迁移资源
     *
     * 支持资源迁移到另一个存储库，不删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateVaultResourceRequest 请求对象
     * @return MigrateVaultResourceResponse
     */
    public MigrateVaultResourceResponse migrateVaultResource(MigrateVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.migrateVaultResource);
    }

    /**
     * 迁移资源
     *
     * 支持资源迁移到另一个存储库，不删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateVaultResourceRequest 请求对象
     * @return SyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse>
     */
    public SyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse> migrateVaultResourceInvoker(
        MigrateVaultResourceRequest request) {
        return new SyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse>(request,
            CbrMeta.migrateVaultResource, hcClient);
    }

    /**
     * 移除资源
     *
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveVaultResourceRequest 请求对象
     * @return RemoveVaultResourceResponse
     */
    public RemoveVaultResourceResponse removeVaultResource(RemoveVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    /**
     * 移除资源
     *
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveVaultResourceRequest 请求对象
     * @return SyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>
     */
    public SyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResourceInvoker(
        RemoveVaultResourceRequest request) {
        return new SyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>(request,
            CbrMeta.removeVaultResource, hcClient);
    }

    /**
     * 备份恢复
     *
     * 恢复备份数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return RestoreBackupResponse
     */
    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    /**
     * 备份恢复
     *
     * 恢复备份数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreBackupRequest 请求对象
     * @return SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public SyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupInvoker(RestoreBackupRequest request) {
        return new SyncInvoker<RestoreBackupRequest, RestoreBackupResponse>(request, CbrMeta.restoreBackup, hcClient);
    }

    /**
     * 查询指定备份
     *
     * 根据指定id查询单个副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupRequest 请求对象
     * @return ShowBackupResponse
     */
    public ShowBackupResponse showBackup(ShowBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showBackup);
    }

    /**
     * 查询指定备份
     *
     * 根据指定id查询单个副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupRequest 请求对象
     * @return SyncInvoker<ShowBackupRequest, ShowBackupResponse>
     */
    public SyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupInvoker(ShowBackupRequest request) {
        return new SyncInvoker<ShowBackupRequest, ShowBackupResponse>(request, CbrMeta.showBackup, hcClient);
    }

    /**
     * 查询备份还原点
     *
     * 根据还原点ID查询指定还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckpointRequest 请求对象
     * @return ShowCheckpointResponse
     */
    public ShowCheckpointResponse showCheckpoint(ShowCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    /**
     * 查询备份还原点
     *
     * 根据还原点ID查询指定还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCheckpointRequest 请求对象
     * @return SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>
     */
    public SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointInvoker(
        ShowCheckpointRequest request) {
        return new SyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>(request, CbrMeta.showCheckpoint,
            hcClient);
    }

    /**
     * 获取备份成员详情
     *
     * 获取备份成员的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberDetailRequest 请求对象
     * @return ShowMemberDetailResponse
     */
    public ShowMemberDetailResponse showMemberDetail(ShowMemberDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    /**
     * 获取备份成员详情
     *
     * 获取备份成员的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMemberDetailRequest 请求对象
     * @return SyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>
     */
    public SyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetailInvoker(
        ShowMemberDetailRequest request) {
        return new SyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>(request, CbrMeta.showMemberDetail,
            hcClient);
    }

    /**
     * 获取备份成员列表
     *
     * 获取备份共享成员的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMembersDetailRequest 请求对象
     * @return ShowMembersDetailResponse
     */
    public ShowMembersDetailResponse showMembersDetail(ShowMembersDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    /**
     * 获取备份成员列表
     *
     * 获取备份共享成员的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMembersDetailRequest 请求对象
     * @return SyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>
     */
    public SyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetailInvoker(
        ShowMembersDetailRequest request) {
        return new SyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>(request, CbrMeta.showMembersDetail,
            hcClient);
    }

    /**
     * 查询单个任务
     *
     * 根据指定任务ID查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpLogRequest 请求对象
     * @return ShowOpLogResponse
     */
    public ShowOpLogResponse showOpLog(ShowOpLogRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showOpLog);
    }

    /**
     * 查询单个任务
     *
     * 根据指定任务ID查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpLogRequest 请求对象
     * @return SyncInvoker<ShowOpLogRequest, ShowOpLogResponse>
     */
    public SyncInvoker<ShowOpLogRequest, ShowOpLogResponse> showOpLogInvoker(ShowOpLogRequest request) {
        return new SyncInvoker<ShowOpLogRequest, ShowOpLogResponse>(request, CbrMeta.showOpLog, hcClient);
    }

    /**
     * 查询单个策略
     *
     * 查询单个策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showPolicy);
    }

    /**
     * 查询单个策略
     *
     * 查询单个策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, CbrMeta.showPolicy, hcClient);
    }

    /**
     * 查询指定可保护资源
     *
     * 根据ID查询可保护性资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectableRequest 请求对象
     * @return ShowProtectableResponse
     */
    public ShowProtectableResponse showProtectable(ShowProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showProtectable);
    }

    /**
     * 查询指定可保护资源
     *
     * 根据ID查询可保护性资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProtectableRequest 请求对象
     * @return SyncInvoker<ShowProtectableRequest, ShowProtectableResponse>
     */
    public SyncInvoker<ShowProtectableRequest, ShowProtectableResponse> showProtectableInvoker(
        ShowProtectableRequest request) {
        return new SyncInvoker<ShowProtectableRequest, ShowProtectableResponse>(request, CbrMeta.showProtectable,
            hcClient);
    }

    /**
     * 查询复制能力
     *
     * 查询本区域的复制能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationCapabilitiesRequest 请求对象
     * @return ShowReplicationCapabilitiesResponse
     */
    public ShowReplicationCapabilitiesResponse showReplicationCapabilities(ShowReplicationCapabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showReplicationCapabilities);
    }

    /**
     * 查询复制能力
     *
     * 查询本区域的复制能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplicationCapabilitiesRequest 请求对象
     * @return SyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse>
     */
    public SyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> showReplicationCapabilitiesInvoker(
        ShowReplicationCapabilitiesRequest request) {
        return new SyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse>(request,
            CbrMeta.showReplicationCapabilities, hcClient);
    }

    /**
     * 查询指定存储库
     *
     * 根据ID查询指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultRequest 请求对象
     * @return ShowVaultResponse
     */
    public ShowVaultResponse showVault(ShowVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVault);
    }

    /**
     * 查询指定存储库
     *
     * 根据ID查询指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultRequest 请求对象
     * @return SyncInvoker<ShowVaultRequest, ShowVaultResponse>
     */
    public SyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultInvoker(ShowVaultRequest request) {
        return new SyncInvoker<ShowVaultRequest, ShowVaultResponse>(request, CbrMeta.showVault, hcClient);
    }

    /**
     * 查询存储库项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultProjectTagRequest 请求对象
     * @return ShowVaultProjectTagResponse
     */
    public ShowVaultProjectTagResponse showVaultProjectTag(ShowVaultProjectTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    /**
     * 查询存储库项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultProjectTagRequest 请求对象
     * @return SyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>
     */
    public SyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTagInvoker(
        ShowVaultProjectTagRequest request) {
        return new SyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>(request,
            CbrMeta.showVaultProjectTag, hcClient);
    }

    /**
     * 查询存储库资源实例
     *
     * 使用标签过滤实例
     * 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultResourceInstancesRequest 请求对象
     * @return ShowVaultResourceInstancesResponse
     */
    public ShowVaultResourceInstancesResponse showVaultResourceInstances(ShowVaultResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    /**
     * 查询存储库资源实例
     *
     * 使用标签过滤实例
     * 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultResourceInstancesRequest 请求对象
     * @return SyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>
     */
    public SyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstancesInvoker(
        ShowVaultResourceInstancesRequest request) {
        return new SyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>(request,
            CbrMeta.showVaultResourceInstances, hcClient);
    }

    /**
     * 查询存储库资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultTagRequest 请求对象
     * @return ShowVaultTagResponse
     */
    public ShowVaultTagResponse showVaultTag(ShowVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    /**
     * 查询存储库资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVaultTagRequest 请求对象
     * @return SyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>
     */
    public SyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTagInvoker(ShowVaultTagRequest request) {
        return new SyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>(request, CbrMeta.showVaultTag, hcClient);
    }

    /**
     * 更新备份成员状态
     *
     * 更新备份共享成员的状态，需要接收方执行此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberStatusRequest 请求对象
     * @return UpdateMemberStatusResponse
     */
    public UpdateMemberStatusResponse updateMemberStatus(UpdateMemberStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    /**
     * 更新备份成员状态
     *
     * 更新备份共享成员的状态，需要接收方执行此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMemberStatusRequest 请求对象
     * @return SyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>
     */
    public SyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatusInvoker(
        UpdateMemberStatusRequest request) {
        return new SyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>(request,
            CbrMeta.updateMemberStatus, hcClient);
    }

    /**
     * 修改策略
     *
     * 修改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    /**
     * 修改策略
     *
     * 修改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, CbrMeta.updatePolicy, hcClient);
    }

    /**
     * 修改存储库
     *
     * 根据存储库ID修改存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVaultRequest 请求对象
     * @return UpdateVaultResponse
     */
    public UpdateVaultResponse updateVault(UpdateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateVault);
    }

    /**
     * 修改存储库
     *
     * 根据存储库ID修改存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVaultRequest 请求对象
     * @return SyncInvoker<UpdateVaultRequest, UpdateVaultResponse>
     */
    public SyncInvoker<UpdateVaultRequest, UpdateVaultResponse> updateVaultInvoker(UpdateVaultRequest request) {
        return new SyncInvoker<UpdateVaultRequest, UpdateVaultResponse>(request, CbrMeta.updateVault, hcClient);
    }

}

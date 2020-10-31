package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cbr.v1.model.*;

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
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     *
     * @param AddMemberRequest 请求对象
     * @return AddMemberResponse
     */
    public AddMemberResponse addMember(AddMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addMember);
    }

    /**
     * 添加资源
     * 存储库添加资源
     *
     * @param AddVaultResourceRequest 请求对象
     * @return AddVaultResourceResponse
     */
    public AddVaultResourceResponse addVaultResource(AddVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    /**
     * 设置存储库策略
     * 存储库设置策略
     *
     * @param AssociateVaultPolicyRequest 请求对象
     * @return AssociateVaultPolicyResponse
     */
    public AssociateVaultPolicyResponse associateVaultPolicy(AssociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    /**
     * 批量添加删除存储库资源标签
     * 为指定实例批量添加或删除标签 标签管理服务需要使用该接口批量管理实例的标签。 一个资源上最多有10个标签。 此接口为幂等接口：     创建时如果请求体中存在重复key则报错。     创建时，不允许重复key，如果数据库存在就覆盖。     删除时，允许重复key。     删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。key长度127个字符，value为255个字符。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     *
     * @param BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return BatchCreateAndDeleteVaultTagsResponse
     */
    public BatchCreateAndDeleteVaultTagsResponse batchCreateAndDeleteVaultTags(BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
    }

    /**
     * 复制备份
     * 跨区域复制备份。
     *
     * @param CopyBackupRequest 请求对象
     * @return CopyBackupResponse
     */
    public CopyBackupResponse copyBackup(CopyBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.copyBackup);
    }

    /**
     * 复制备份还原点
     * 执行复制
     *
     * @param CopyCheckpointRequest 请求对象
     * @return CopyCheckpointResponse
     */
    public CopyCheckpointResponse copyCheckpoint(CopyCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.copyCheckpoint);
    }

    /**
     * 创建备份还原点
     * 对存储库执行备份，生成备份还原点
     *
     * @param CreateCheckpointRequest 请求对象
     * @return CreateCheckpointResponse
     */
    public CreateCheckpointResponse createCheckpoint(CreateCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    /**
     * 创建策略
     * [创建策略，策略分为备份策略和复制策略。](tag:hws,hws_hk) [创建备份策略。](tag:dt,ocb,tlf,sbc,fcs_vm,ctc)
     *
     * @param CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createPolicy);
    }

    /**
     * 创建存储库
     * 创建存储库
     *
     * @param CreateVaultRequest 请求对象
     * @return CreateVaultResponse
     */
    public CreateVaultResponse createVault(CreateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVault);
    }

    /**
     * 添加存储库资源标签
     * 一个资源上最多有10个标签。 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateVaultTagsRequest 请求对象
     * @return CreateVaultTagsResponse
     */
    public CreateVaultTagsResponse createVaultTags(CreateVaultTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    /**
     * 删除备份
     * 删除单个备份。
     *
     * @param DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    /**
     * 删除指定备份成员
     * 删除指定的备份共享成员
     *
     * @param DeleteMemberRequest 请求对象
     * @return DeleteMemberResponse
     */
    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteMember);
    }

    /**
     * 删除策略
     * 删除策略
     *
     * @param DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    /**
     * 删除存储库
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     *
     * @param DeleteVaultRequest 请求对象
     * @return DeleteVaultResponse
     */
    public DeleteVaultResponse deleteVault(DeleteVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVault);
    }

    /**
     * 删除存储库资源标签
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     *
     * @param DeleteVaultTagRequest 请求对象
     * @return DeleteVaultTagResponse
     */
    public DeleteVaultTagResponse deleteVaultTag(DeleteVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    /**
     * 解除存储库策略
     * 存储库解除策略
     *
     * @param DisassociateVaultPolicyRequest 请求对象
     * @return DisassociateVaultPolicyResponse
     */
    public DisassociateVaultPolicyResponse disassociateVaultPolicy(DisassociateVaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    /**
     * 同步备份
     * 同步备份副本
     *
     * @param ImportBackupRequest 请求对象
     * @return ImportBackupResponse
     */
    public ImportBackupResponse importBackup(ImportBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.importBackup);
    }

    /**
     * 查询所有备份
     * 查询所有副本
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listBackups);
    }

    /**
     * 查询任务列表
     * 查询任务列表
     *
     * @param ListOpLogsRequest 请求对象
     * @return ListOpLogsResponse
     */
    public ListOpLogsResponse listOpLogs(ListOpLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    /**
     * 查询策略列表
     * 查询策略列表
     *
     * @param ListPoliciesRequest 请求对象
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listPolicies);
    }

    /**
     * 查询可保护资源
     * 查询可保护性资源列表
     *
     * @param ListProtectableRequest 请求对象
     * @return ListProtectableResponse
     */
    public ListProtectableResponse listProtectable(ListProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listProtectable);
    }

    /**
     * 查询存储库列表
     * 查询存储库列表
     *
     * @param ListVaultRequest 请求对象
     * @return ListVaultResponse
     */
    public ListVaultResponse listVault(ListVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.listVault);
    }

    /**
     * 移除资源
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     *
     * @param RemoveVaultResourceRequest 请求对象
     * @return RemoveVaultResourceResponse
     */
    public RemoveVaultResourceResponse removeVaultResource(RemoveVaultResourceRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    /**
     * 备份恢复
     * 恢复备份数据
     *
     * @param RestoreBackupRequest 请求对象
     * @return RestoreBackupResponse
     */
    public RestoreBackupResponse restoreBackup(RestoreBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    /**
     * 查询指定备份
     * 根据指定id查询单个副本。
     *
     * @param ShowBackupRequest 请求对象
     * @return ShowBackupResponse
     */
    public ShowBackupResponse showBackup(ShowBackupRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showBackup);
    }

    /**
     * 查询备份还原点
     * 根据还原点ID查询指定还原点
     *
     * @param ShowCheckpointRequest 请求对象
     * @return ShowCheckpointResponse
     */
    public ShowCheckpointResponse showCheckpoint(ShowCheckpointRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    /**
     * 获取备份成员详情
     * 获取备份成员的详情
     *
     * @param ShowMemberDetailRequest 请求对象
     * @return ShowMemberDetailResponse
     */
    public ShowMemberDetailResponse showMemberDetail(ShowMemberDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    /**
     * 获取备份成员列表
     * 获取备份共享成员的列表信息
     *
     * @param ShowMembersDetailRequest 请求对象
     * @return ShowMembersDetailResponse
     */
    public ShowMembersDetailResponse showMembersDetail(ShowMembersDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    /**
     * 查询单个任务
     * 根据指定任务ID查询任务
     *
     * @param ShowOpLogRequest 请求对象
     * @return ShowOpLogResponse
     */
    public ShowOpLogResponse showOpLog(ShowOpLogRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showOpLog);
    }

    /**
     * 查询单个策略
     * 查询单个策略
     *
     * @param ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showPolicy);
    }

    /**
     * 查询指定可保护资源
     * 根据ID查询可保护性资源
     *
     * @param ShowProtectableRequest 请求对象
     * @return ShowProtectableResponse
     */
    public ShowProtectableResponse showProtectable(ShowProtectableRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showProtectable);
    }

    /**
     * 查询复制能力
     * 查询本区域的复制能力
     *
     * @param ShowReplicationCapabilitiesRequest 请求对象
     * @return ShowReplicationCapabilitiesResponse
     */
    public ShowReplicationCapabilitiesResponse showReplicationCapabilities(ShowReplicationCapabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showReplicationCapabilities);
    }

    /**
     * 查询指定存储库
     * 根据ID查询指定存储库
     *
     * @param ShowVaultRequest 请求对象
     * @return ShowVaultResponse
     */
    public ShowVaultResponse showVault(ShowVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVault);
    }

    /**
     * 查询存储库项目标签
     * 查询租户在指定Region和实例类型的所有标签集合 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     *
     * @param ShowVaultProjectTagRequest 请求对象
     * @return ShowVaultProjectTagResponse
     */
    public ShowVaultProjectTagResponse showVaultProjectTag(ShowVaultProjectTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    /**
     * 查询存储库资源实例
     * 使用标签过滤实例 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     *
     * @param ShowVaultResourceInstancesRequest 请求对象
     * @return ShowVaultResourceInstancesResponse
     */
    public ShowVaultResourceInstancesResponse showVaultResourceInstances(ShowVaultResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    /**
     * 查询存储库资源标签
     * 查询指定实例的标签信息 标签管理服务需要使用该接口查询指定实例的全部标签数据
     *
     * @param ShowVaultTagRequest 请求对象
     * @return ShowVaultTagResponse
     */
    public ShowVaultTagResponse showVaultTag(ShowVaultTagRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    /**
     * 更新备份成员状态
     * 更新备份共享成员的状态，需要接收方执行此API。
     *
     * @param UpdateMemberStatusRequest 请求对象
     * @return UpdateMemberStatusResponse
     */
    public UpdateMemberStatusResponse updateMemberStatus(UpdateMemberStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    /**
     * 修改策略
     * 修改策略
     *
     * @param UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    /**
     * 修改存储库
     * 根据存储库ID修改存储库
     *
     * @param UpdateVaultRequest 请求对象
     * @return UpdateVaultResponse
     */
    public UpdateVaultResponse updateVault(UpdateVaultRequest request) {
        return hcClient.syncInvokeHttp(request, CbrMeta.updateVault);
    }

}
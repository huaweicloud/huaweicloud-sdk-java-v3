package com.huaweicloud.sdk.cbr.v1;

import com.huaweicloud.sdk.cbr.v1.model.AddAgentPathRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddAgentPathResponse;
import com.huaweicloud.sdk.cbr.v1.model.AddMemberRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddMemberResponse;
import com.huaweicloud.sdk.cbr.v1.model.AddVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.AddVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.AssociateVaultPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.AssociateVaultPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsRequest;
import com.huaweicloud.sdk.cbr.v1.model.BatchCreateAndDeleteVaultTagsResponse;
import com.huaweicloud.sdk.cbr.v1.model.BatchUpdateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.BatchUpdateVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.ChangeOrderRequest;
import com.huaweicloud.sdk.cbr.v1.model.ChangeOrderResponse;
import com.huaweicloud.sdk.cbr.v1.model.ChangeVaultChargeModeRequest;
import com.huaweicloud.sdk.cbr.v1.model.ChangeVaultChargeModeResponse;
import com.huaweicloud.sdk.cbr.v1.model.CheckAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.CheckAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.CopyBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.CopyBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.CopyCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.CopyCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateOrganizationPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateOrganizationPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreatePostPaidVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreatePostPaidVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultTagsRequest;
import com.huaweicloud.sdk.cbr.v1.model.CreateVaultTagsResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteMemberRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteMemberResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteOrganizationPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteOrganizationPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.DeleteVaultTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.DisassociateVaultPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.DisassociateVaultPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.ImportBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.ImportBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.ImportCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.ImportCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListBackupsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListBackupsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListDomainProjectsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListDomainProjectsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListExternalVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListExternalVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListFeaturesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListFeaturesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListOpLogsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListOpLogsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListOrganizationPoliciesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListOrganizationPoliciesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListOrganizationPolicyDetailRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListOrganizationPolicyDetailResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListProjectsRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListProjectsResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListProtectableRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListProtectableResponse;
import com.huaweicloud.sdk.cbr.v1.model.ListVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ListVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.MigrateDomainRequest;
import com.huaweicloud.sdk.cbr.v1.model.MigrateDomainResponse;
import com.huaweicloud.sdk.cbr.v1.model.MigrateVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.MigrateVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.RegisterAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.RegisterAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.RemoveAgentPathRequest;
import com.huaweicloud.sdk.cbr.v1.model.RemoveAgentPathResponse;
import com.huaweicloud.sdk.cbr.v1.model.RemoveVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.RemoveVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.RestoreBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.RestoreBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.SetVaultResourceRequest;
import com.huaweicloud.sdk.cbr.v1.model.SetVaultResourceResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowCheckpointRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowCheckpointResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowFeatureRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowFeatureResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMemberDetailRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMemberDetailResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMembersDetailRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMembersDetailResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMetadataRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMetadataResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowMigrateStatusRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowMigrateStatusResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowOpLogRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowOpLogResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowOrganizationPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowOrganizationPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowProtectableRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowProtectableResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowReplicationCapabilitiesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowReplicationCapabilitiesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowStorageUsageRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowStorageUsageResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowSummaryRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowSummaryResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultProjectTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultProjectTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResourceInstancesRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResourceInstancesResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultResponse;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultTagRequest;
import com.huaweicloud.sdk.cbr.v1.model.ShowVaultTagResponse;
import com.huaweicloud.sdk.cbr.v1.model.UnregisterAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.UnregisterAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateAgentRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateAgentResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateBackupRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateBackupResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateMemberStatusRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateMemberStatusResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrderRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrderResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrganizationPolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateOrganizationPolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.cbr.v1.model.UpdateVaultRequest;
import com.huaweicloud.sdk.cbr.v1.model.UpdateVaultResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CbrAsyncClient {

    protected HcClient hcClient;

    public CbrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbrAsyncClient> newBuilder() {
        ClientBuilder<CbrAsyncClient> clientBuilder = new ClientBuilder<>(CbrAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增备份路径
     *
     * 对客户端新增备份路径，新增的路径不会校验是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAgentPathRequest 请求对象
     * @return CompletableFuture<AddAgentPathResponse>
     */
    public CompletableFuture<AddAgentPathResponse> addAgentPathAsync(AddAgentPathRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addAgentPath);
    }

    /**
     * 新增备份路径
     *
     * 对客户端新增备份路径，新增的路径不会校验是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAgentPathRequest 请求对象
     * @return AsyncInvoker<AddAgentPathRequest, AddAgentPathResponse>
     */
    public AsyncInvoker<AddAgentPathRequest, AddAgentPathResponse> addAgentPathAsyncInvoker(
        AddAgentPathRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.addAgentPath, hcClient);
    }

    /**
     * 添加备份成员
     *
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberRequest 请求对象
     * @return CompletableFuture<AddMemberResponse>
     */
    public CompletableFuture<AddMemberResponse> addMemberAsync(AddMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addMember);
    }

    /**
     * 添加备份成员
     *
     * 添加备份可共享的成员，只有云服务器备份可以添加备份共享成员，且仅支持在同一区域的不同用户间共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMemberRequest 请求对象
     * @return AsyncInvoker<AddMemberRequest, AddMemberResponse>
     */
    public AsyncInvoker<AddMemberRequest, AddMemberResponse> addMemberAsyncInvoker(AddMemberRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.addMember, hcClient);
    }

    /**
     * 添加资源
     *
     * 存储库添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVaultResourceRequest 请求对象
     * @return CompletableFuture<AddVaultResourceResponse>
     */
    public CompletableFuture<AddVaultResourceResponse> addVaultResourceAsync(AddVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.addVaultResource);
    }

    /**
     * 添加资源
     *
     * 存储库添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVaultResourceRequest 请求对象
     * @return AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse>
     */
    public AsyncInvoker<AddVaultResourceRequest, AddVaultResourceResponse> addVaultResourceAsyncInvoker(
        AddVaultResourceRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.addVaultResource, hcClient);
    }

    /**
     * 设置存储库策略
     *
     * 存储库设置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVaultPolicyRequest 请求对象
     * @return CompletableFuture<AssociateVaultPolicyResponse>
     */
    public CompletableFuture<AssociateVaultPolicyResponse> associateVaultPolicyAsync(
        AssociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.associateVaultPolicy);
    }

    /**
     * 设置存储库策略
     *
     * 存储库设置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVaultPolicyRequest 请求对象
     * @return AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse>
     */
    public AsyncInvoker<AssociateVaultPolicyRequest, AssociateVaultPolicyResponse> associateVaultPolicyAsyncInvoker(
        AssociateVaultPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.associateVaultPolicy, hcClient);
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
     * @param request BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateAndDeleteVaultTagsResponse>
     */
    public CompletableFuture<BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsync(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.batchCreateAndDeleteVaultTags);
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
     * @param request BatchCreateAndDeleteVaultTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse>
     */
    public AsyncInvoker<BatchCreateAndDeleteVaultTagsRequest, BatchCreateAndDeleteVaultTagsResponse> batchCreateAndDeleteVaultTagsAsyncInvoker(
        BatchCreateAndDeleteVaultTagsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.batchCreateAndDeleteVaultTags, hcClient);
    }

    /**
     * 批量修改存储库
     *
     * 批量修改项目下所有存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVaultRequest 请求对象
     * @return CompletableFuture<BatchUpdateVaultResponse>
     */
    public CompletableFuture<BatchUpdateVaultResponse> batchUpdateVaultAsync(BatchUpdateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.batchUpdateVault);
    }

    /**
     * 批量修改存储库
     *
     * 批量修改项目下所有存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVaultRequest 请求对象
     * @return AsyncInvoker<BatchUpdateVaultRequest, BatchUpdateVaultResponse>
     */
    public AsyncInvoker<BatchUpdateVaultRequest, BatchUpdateVaultResponse> batchUpdateVaultAsyncInvoker(
        BatchUpdateVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.batchUpdateVault, hcClient);
    }

    /**
     * 变更
     *
     * 订单更新，调用该接口更新包周期产品订单信息,返回待支付订单信息。
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOrderRequest 请求对象
     * @return CompletableFuture<ChangeOrderResponse>
     */
    public CompletableFuture<ChangeOrderResponse> changeOrderAsync(ChangeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.changeOrder);
    }

    /**
     * 变更
     *
     * 订单更新，调用该接口更新包周期产品订单信息,返回待支付订单信息。
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOrderRequest 请求对象
     * @return AsyncInvoker<ChangeOrderRequest, ChangeOrderResponse>
     */
    public AsyncInvoker<ChangeOrderRequest, ChangeOrderResponse> changeOrderAsyncInvoker(ChangeOrderRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.changeOrder, hcClient);
    }

    /**
     * 修改付费模式
     *
     * 修改资源的付费模式，暂时只支持按需资源转包周期资源。
     * &gt; 该接口目前输入公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVaultChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeVaultChargeModeResponse>
     */
    public CompletableFuture<ChangeVaultChargeModeResponse> changeVaultChargeModeAsync(
        ChangeVaultChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.changeVaultChargeMode);
    }

    /**
     * 修改付费模式
     *
     * 修改资源的付费模式，暂时只支持按需资源转包周期资源。
     * &gt; 该接口目前输入公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVaultChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeVaultChargeModeRequest, ChangeVaultChargeModeResponse>
     */
    public AsyncInvoker<ChangeVaultChargeModeRequest, ChangeVaultChargeModeResponse> changeVaultChargeModeAsyncInvoker(
        ChangeVaultChargeModeRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.changeVaultChargeMode, hcClient);
    }

    /**
     * 查询agent状态
     *
     * 检查应用一致性Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgentRequest 请求对象
     * @return CompletableFuture<CheckAgentResponse>
     */
    public CompletableFuture<CheckAgentResponse> checkAgentAsync(CheckAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.checkAgent);
    }

    /**
     * 查询agent状态
     *
     * 检查应用一致性Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgentRequest 请求对象
     * @return AsyncInvoker<CheckAgentRequest, CheckAgentResponse>
     */
    public AsyncInvoker<CheckAgentRequest, CheckAgentResponse> checkAgentAsyncInvoker(CheckAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.checkAgent, hcClient);
    }

    /**
     * 复制备份
     *
     * 跨区域复制备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBackupRequest 请求对象
     * @return CompletableFuture<CopyBackupResponse>
     */
    public CompletableFuture<CopyBackupResponse> copyBackupAsync(CopyBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.copyBackup);
    }

    /**
     * 复制备份
     *
     * 跨区域复制备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBackupRequest 请求对象
     * @return AsyncInvoker<CopyBackupRequest, CopyBackupResponse>
     */
    public AsyncInvoker<CopyBackupRequest, CopyBackupResponse> copyBackupAsyncInvoker(CopyBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.copyBackup, hcClient);
    }

    /**
     * 复制备份还原点
     *
     * 执行复制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyCheckpointRequest 请求对象
     * @return CompletableFuture<CopyCheckpointResponse>
     */
    public CompletableFuture<CopyCheckpointResponse> copyCheckpointAsync(CopyCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.copyCheckpoint);
    }

    /**
     * 复制备份还原点
     *
     * 执行复制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyCheckpointRequest 请求对象
     * @return AsyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse>
     */
    public AsyncInvoker<CopyCheckpointRequest, CopyCheckpointResponse> copyCheckpointAsyncInvoker(
        CopyCheckpointRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.copyCheckpoint, hcClient);
    }

    /**
     * 创建备份还原点
     *
     * 对存储库执行备份，生成备份还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCheckpointRequest 请求对象
     * @return CompletableFuture<CreateCheckpointResponse>
     */
    public CompletableFuture<CreateCheckpointResponse> createCheckpointAsync(CreateCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createCheckpoint);
    }

    /**
     * 创建备份还原点
     *
     * 对存储库执行备份，生成备份还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCheckpointRequest 请求对象
     * @return AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse>
     */
    public AsyncInvoker<CreateCheckpointRequest, CreateCheckpointResponse> createCheckpointAsyncInvoker(
        CreateCheckpointRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createCheckpoint, hcClient);
    }

    /**
     * 创建组织策略
     *
     * 创建组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<CreateOrganizationPolicyResponse>
     */
    public CompletableFuture<CreateOrganizationPolicyResponse> createOrganizationPolicyAsync(
        CreateOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createOrganizationPolicy);
    }

    /**
     * 创建组织策略
     *
     * 创建组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<CreateOrganizationPolicyRequest, CreateOrganizationPolicyResponse>
     */
    public AsyncInvoker<CreateOrganizationPolicyRequest, CreateOrganizationPolicyResponse> createOrganizationPolicyAsyncInvoker(
        CreateOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createOrganizationPolicy, hcClient);
    }

    /**
     * 创建策略
     *
     * 创建策略，策略分为备份策略和复制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建策略，策略分为备份策略和复制策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createPolicy, hcClient);
    }

    /**
     * 创建包周期存储库
     *
     * 创建包周期存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidVaultRequest 请求对象
     * @return CompletableFuture<CreatePostPaidVaultResponse>
     */
    public CompletableFuture<CreatePostPaidVaultResponse> createPostPaidVaultAsync(CreatePostPaidVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createPostPaidVault);
    }

    /**
     * 创建包周期存储库
     *
     * 创建包周期存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidVaultRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidVaultRequest, CreatePostPaidVaultResponse>
     */
    public AsyncInvoker<CreatePostPaidVaultRequest, CreatePostPaidVaultResponse> createPostPaidVaultAsyncInvoker(
        CreatePostPaidVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createPostPaidVault, hcClient);
    }

    /**
     * 创建存储库
     *
     * 创建存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVaultRequest 请求对象
     * @return CompletableFuture<CreateVaultResponse>
     */
    public CompletableFuture<CreateVaultResponse> createVaultAsync(CreateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVault);
    }

    /**
     * 创建存储库
     *
     * 创建存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVaultRequest 请求对象
     * @return AsyncInvoker<CreateVaultRequest, CreateVaultResponse>
     */
    public AsyncInvoker<CreateVaultRequest, CreateVaultResponse> createVaultAsyncInvoker(CreateVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createVault, hcClient);
    }

    /**
     * 添加存储库资源标签
     *
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVaultTagsRequest 请求对象
     * @return CompletableFuture<CreateVaultTagsResponse>
     */
    public CompletableFuture<CreateVaultTagsResponse> createVaultTagsAsync(CreateVaultTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.createVaultTags);
    }

    /**
     * 添加存储库资源标签
     *
     * 一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVaultTagsRequest 请求对象
     * @return AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse>
     */
    public AsyncInvoker<CreateVaultTagsRequest, CreateVaultTagsResponse> createVaultTagsAsyncInvoker(
        CreateVaultTagsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.createVaultTags, hcClient);
    }

    /**
     * 删除备份
     *
     * 删除单个备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteBackup);
    }

    /**
     * 删除备份
     *
     * 删除单个备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(
        DeleteBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deleteBackup, hcClient);
    }

    /**
     * 删除指定备份成员
     *
     * 删除指定的备份共享成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteMember);
    }

    /**
     * 删除指定备份成员
     *
     * 删除指定的备份共享成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deleteMember, hcClient);
    }

    /**
     * 删除组织策略
     *
     * 删除组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<DeleteOrganizationPolicyResponse>
     */
    public CompletableFuture<DeleteOrganizationPolicyResponse> deleteOrganizationPolicyAsync(
        DeleteOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteOrganizationPolicy);
    }

    /**
     * 删除组织策略
     *
     * 删除组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteOrganizationPolicyRequest, DeleteOrganizationPolicyResponse>
     */
    public AsyncInvoker<DeleteOrganizationPolicyRequest, DeleteOrganizationPolicyResponse> deleteOrganizationPolicyAsyncInvoker(
        DeleteOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deleteOrganizationPolicy, hcClient);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deletePolicy, hcClient);
    }

    /**
     * 删除存储库
     *
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVaultRequest 请求对象
     * @return CompletableFuture<DeleteVaultResponse>
     */
    public CompletableFuture<DeleteVaultResponse> deleteVaultAsync(DeleteVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVault);
    }

    /**
     * 删除存储库
     *
     * 删除存储库。若删除储存库，将一并删除存储库中的所有备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVaultRequest 请求对象
     * @return AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse>
     */
    public AsyncInvoker<DeleteVaultRequest, DeleteVaultResponse> deleteVaultAsyncInvoker(DeleteVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deleteVault, hcClient);
    }

    /**
     * 删除存储库资源标签
     *
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVaultTagRequest 请求对象
     * @return CompletableFuture<DeleteVaultTagResponse>
     */
    public CompletableFuture<DeleteVaultTagResponse> deleteVaultTagAsync(DeleteVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.deleteVaultTag);
    }

    /**
     * 删除存储库资源标签
     *
     * 幂等接口：删除时，如果删除的标签不存在，返回404。Key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVaultTagRequest 请求对象
     * @return AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse>
     */
    public AsyncInvoker<DeleteVaultTagRequest, DeleteVaultTagResponse> deleteVaultTagAsyncInvoker(
        DeleteVaultTagRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.deleteVaultTag, hcClient);
    }

    /**
     * 解除存储库策略
     *
     * 存储库解除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVaultPolicyRequest 请求对象
     * @return CompletableFuture<DisassociateVaultPolicyResponse>
     */
    public CompletableFuture<DisassociateVaultPolicyResponse> disassociateVaultPolicyAsync(
        DisassociateVaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.disassociateVaultPolicy);
    }

    /**
     * 解除存储库策略
     *
     * 存储库解除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVaultPolicyRequest 请求对象
     * @return AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse>
     */
    public AsyncInvoker<DisassociateVaultPolicyRequest, DisassociateVaultPolicyResponse> disassociateVaultPolicyAsyncInvoker(
        DisassociateVaultPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.disassociateVaultPolicy, hcClient);
    }

    /**
     * 同步备份
     *
     * 同步线下混合云VMware备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackupRequest 请求对象
     * @return CompletableFuture<ImportBackupResponse>
     */
    public CompletableFuture<ImportBackupResponse> importBackupAsync(ImportBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.importBackup);
    }

    /**
     * 同步备份
     *
     * 同步线下混合云VMware备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportBackupRequest 请求对象
     * @return AsyncInvoker<ImportBackupRequest, ImportBackupResponse>
     */
    public AsyncInvoker<ImportBackupRequest, ImportBackupResponse> importBackupAsyncInvoker(
        ImportBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.importBackup, hcClient);
    }

    /**
     * 同步备份还原点
     *
     * 针对vault同步备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCheckpointRequest 请求对象
     * @return CompletableFuture<ImportCheckpointResponse>
     */
    public CompletableFuture<ImportCheckpointResponse> importCheckpointAsync(ImportCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.importCheckpoint);
    }

    /**
     * 同步备份还原点
     *
     * 针对vault同步备份副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCheckpointRequest 请求对象
     * @return AsyncInvoker<ImportCheckpointRequest, ImportCheckpointResponse>
     */
    public AsyncInvoker<ImportCheckpointRequest, ImportCheckpointResponse> importCheckpointAsyncInvoker(
        ImportCheckpointRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.importCheckpoint, hcClient);
    }

    /**
     * 查询客户端列表
     *
     * 查询客户端列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentRequest 请求对象
     * @return CompletableFuture<ListAgentResponse>
     */
    public CompletableFuture<ListAgentResponse> listAgentAsync(ListAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listAgent);
    }

    /**
     * 查询客户端列表
     *
     * 查询客户端列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentRequest 请求对象
     * @return AsyncInvoker<ListAgentRequest, ListAgentResponse>
     */
    public AsyncInvoker<ListAgentRequest, ListAgentResponse> listAgentAsyncInvoker(ListAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listAgent, hcClient);
    }

    /**
     * 查询所有备份
     *
     * 查询所有副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listBackups);
    }

    /**
     * 查询所有备份
     *
     * 查询所有副本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listBackups, hcClient);
    }

    /**
     * 查询租户项目列表
     *
     * 根据指定租户名称查询项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainProjectsRequest 请求对象
     * @return CompletableFuture<ListDomainProjectsResponse>
     */
    public CompletableFuture<ListDomainProjectsResponse> listDomainProjectsAsync(ListDomainProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listDomainProjects);
    }

    /**
     * 查询租户项目列表
     *
     * 根据指定租户名称查询项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainProjectsRequest 请求对象
     * @return AsyncInvoker<ListDomainProjectsRequest, ListDomainProjectsResponse>
     */
    public AsyncInvoker<ListDomainProjectsRequest, ListDomainProjectsResponse> listDomainProjectsAsyncInvoker(
        ListDomainProjectsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listDomainProjects, hcClient);
    }

    /**
     * 查询其他区域存储库列表
     *
     * 查询其他区域的存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalVaultRequest 请求对象
     * @return CompletableFuture<ListExternalVaultResponse>
     */
    public CompletableFuture<ListExternalVaultResponse> listExternalVaultAsync(ListExternalVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listExternalVault);
    }

    /**
     * 查询其他区域存储库列表
     *
     * 查询其他区域的存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExternalVaultRequest 请求对象
     * @return AsyncInvoker<ListExternalVaultRequest, ListExternalVaultResponse>
     */
    public AsyncInvoker<ListExternalVaultRequest, ListExternalVaultResponse> listExternalVaultAsyncInvoker(
        ListExternalVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listExternalVault, hcClient);
    }

    /**
     * 查询服务支持的特性列表
     *
     * 查询服务支持的特性列表
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return CompletableFuture<ListFeaturesResponse>
     */
    public CompletableFuture<ListFeaturesResponse> listFeaturesAsync(ListFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listFeatures);
    }

    /**
     * 查询服务支持的特性列表
     *
     * 查询服务支持的特性列表
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesAsyncInvoker(
        ListFeaturesRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listFeatures, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOpLogsRequest 请求对象
     * @return CompletableFuture<ListOpLogsResponse>
     */
    public CompletableFuture<ListOpLogsResponse> listOpLogsAsync(ListOpLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listOpLogs);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOpLogsRequest 请求对象
     * @return AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse>
     */
    public AsyncInvoker<ListOpLogsRequest, ListOpLogsResponse> listOpLogsAsyncInvoker(ListOpLogsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listOpLogs, hcClient);
    }

    /**
     * 查询组织策略列表
     *
     * 查询组织策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPoliciesRequest 请求对象
     * @return CompletableFuture<ListOrganizationPoliciesResponse>
     */
    public CompletableFuture<ListOrganizationPoliciesResponse> listOrganizationPoliciesAsync(
        ListOrganizationPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listOrganizationPolicies);
    }

    /**
     * 查询组织策略列表
     *
     * 查询组织策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPoliciesRequest 请求对象
     * @return AsyncInvoker<ListOrganizationPoliciesRequest, ListOrganizationPoliciesResponse>
     */
    public AsyncInvoker<ListOrganizationPoliciesRequest, ListOrganizationPoliciesResponse> listOrganizationPoliciesAsyncInvoker(
        ListOrganizationPoliciesRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listOrganizationPolicies, hcClient);
    }

    /**
     * 查询组织策略部署状态列表
     *
     * 查询组织策略每个账号下策略部署状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyDetailRequest 请求对象
     * @return CompletableFuture<ListOrganizationPolicyDetailResponse>
     */
    public CompletableFuture<ListOrganizationPolicyDetailResponse> listOrganizationPolicyDetailAsync(
        ListOrganizationPolicyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listOrganizationPolicyDetail);
    }

    /**
     * 查询组织策略部署状态列表
     *
     * 查询组织策略每个账号下策略部署状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationPolicyDetailRequest 请求对象
     * @return AsyncInvoker<ListOrganizationPolicyDetailRequest, ListOrganizationPolicyDetailResponse>
     */
    public AsyncInvoker<ListOrganizationPolicyDetailRequest, ListOrganizationPolicyDetailResponse> listOrganizationPolicyDetailAsyncInvoker(
        ListOrganizationPolicyDetailRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listOrganizationPolicyDetail, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listPolicies);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listPolicies, hcClient);
    }

    /**
     * 查询租户的项目信息
     *
     * 查询租户的企业项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsRequest 请求对象
     * @return CompletableFuture<ListProjectsResponse>
     */
    public CompletableFuture<ListProjectsResponse> listProjectsAsync(ListProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listProjects);
    }

    /**
     * 查询租户的项目信息
     *
     * 查询租户的企业项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectsRequest 请求对象
     * @return AsyncInvoker<ListProjectsRequest, ListProjectsResponse>
     */
    public AsyncInvoker<ListProjectsRequest, ListProjectsResponse> listProjectsAsyncInvoker(
        ListProjectsRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listProjects, hcClient);
    }

    /**
     * 查询可保护资源
     *
     * 查询可保护性资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableRequest 请求对象
     * @return CompletableFuture<ListProtectableResponse>
     */
    public CompletableFuture<ListProtectableResponse> listProtectableAsync(ListProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listProtectable);
    }

    /**
     * 查询可保护资源
     *
     * 查询可保护性资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableRequest 请求对象
     * @return AsyncInvoker<ListProtectableRequest, ListProtectableResponse>
     */
    public AsyncInvoker<ListProtectableRequest, ListProtectableResponse> listProtectableAsyncInvoker(
        ListProtectableRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listProtectable, hcClient);
    }

    /**
     * 查询存储库列表
     *
     * 查询存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return CompletableFuture<ListVaultResponse>
     */
    public CompletableFuture<ListVaultResponse> listVaultAsync(ListVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.listVault);
    }

    /**
     * 查询存储库列表
     *
     * 查询存储库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVaultRequest 请求对象
     * @return AsyncInvoker<ListVaultRequest, ListVaultResponse>
     */
    public AsyncInvoker<ListVaultRequest, ListVaultResponse> listVaultAsyncInvoker(ListVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.listVault, hcClient);
    }

    /**
     * 租户迁移
     *
     * 将CSBS/VBS资源迁移到CBR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateDomainRequest 请求对象
     * @return CompletableFuture<MigrateDomainResponse>
     */
    public CompletableFuture<MigrateDomainResponse> migrateDomainAsync(MigrateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.migrateDomain);
    }

    /**
     * 租户迁移
     *
     * 将CSBS/VBS资源迁移到CBR。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateDomainRequest 请求对象
     * @return AsyncInvoker<MigrateDomainRequest, MigrateDomainResponse>
     */
    public AsyncInvoker<MigrateDomainRequest, MigrateDomainResponse> migrateDomainAsyncInvoker(
        MigrateDomainRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.migrateDomain, hcClient);
    }

    /**
     * 迁移资源
     *
     * 支持资源迁移到另一个存储库，不删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateVaultResourceRequest 请求对象
     * @return CompletableFuture<MigrateVaultResourceResponse>
     */
    public CompletableFuture<MigrateVaultResourceResponse> migrateVaultResourceAsync(
        MigrateVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.migrateVaultResource);
    }

    /**
     * 迁移资源
     *
     * 支持资源迁移到另一个存储库，不删除备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateVaultResourceRequest 请求对象
     * @return AsyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse>
     */
    public AsyncInvoker<MigrateVaultResourceRequest, MigrateVaultResourceResponse> migrateVaultResourceAsyncInvoker(
        MigrateVaultResourceRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.migrateVaultResource, hcClient);
    }

    /**
     * 注册客户端
     *
     * 注册客户端，安装时候由Agent调用，无需手动注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterAgentRequest 请求对象
     * @return CompletableFuture<RegisterAgentResponse>
     */
    public CompletableFuture<RegisterAgentResponse> registerAgentAsync(RegisterAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.registerAgent);
    }

    /**
     * 注册客户端
     *
     * 注册客户端，安装时候由Agent调用，无需手动注册。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterAgentRequest 请求对象
     * @return AsyncInvoker<RegisterAgentRequest, RegisterAgentResponse>
     */
    public AsyncInvoker<RegisterAgentRequest, RegisterAgentResponse> registerAgentAsyncInvoker(
        RegisterAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.registerAgent, hcClient);
    }

    /**
     * 移除备份路径
     *
     * 移除已添加的文件备份路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAgentPathRequest 请求对象
     * @return CompletableFuture<RemoveAgentPathResponse>
     */
    public CompletableFuture<RemoveAgentPathResponse> removeAgentPathAsync(RemoveAgentPathRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.removeAgentPath);
    }

    /**
     * 移除备份路径
     *
     * 移除已添加的文件备份路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAgentPathRequest 请求对象
     * @return AsyncInvoker<RemoveAgentPathRequest, RemoveAgentPathResponse>
     */
    public AsyncInvoker<RemoveAgentPathRequest, RemoveAgentPathResponse> removeAgentPathAsyncInvoker(
        RemoveAgentPathRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.removeAgentPath, hcClient);
    }

    /**
     * 移除资源
     *
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVaultResourceRequest 请求对象
     * @return CompletableFuture<RemoveVaultResourceResponse>
     */
    public CompletableFuture<RemoveVaultResourceResponse> removeVaultResourceAsync(RemoveVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.removeVaultResource);
    }

    /**
     * 移除资源
     *
     * 移除存储库中的资源，若移除资源，将一并删除该资源在保管库中的备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVaultResourceRequest 请求对象
     * @return AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse>
     */
    public AsyncInvoker<RemoveVaultResourceRequest, RemoveVaultResourceResponse> removeVaultResourceAsyncInvoker(
        RemoveVaultResourceRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.removeVaultResource, hcClient);
    }

    /**
     * 备份恢复
     *
     * 恢复备份数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBackupRequest 请求对象
     * @return CompletableFuture<RestoreBackupResponse>
     */
    public CompletableFuture<RestoreBackupResponse> restoreBackupAsync(RestoreBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.restoreBackup);
    }

    /**
     * 备份恢复
     *
     * 恢复备份数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreBackupRequest 请求对象
     * @return AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse>
     */
    public AsyncInvoker<RestoreBackupRequest, RestoreBackupResponse> restoreBackupAsyncInvoker(
        RestoreBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.restoreBackup, hcClient);
    }

    /**
     * 设置存储库资源
     *
     * 设置存储库资源是否自动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetVaultResourceRequest 请求对象
     * @return CompletableFuture<SetVaultResourceResponse>
     */
    public CompletableFuture<SetVaultResourceResponse> setVaultResourceAsync(SetVaultResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.setVaultResource);
    }

    /**
     * 设置存储库资源
     *
     * 设置存储库资源是否自动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetVaultResourceRequest 请求对象
     * @return AsyncInvoker<SetVaultResourceRequest, SetVaultResourceResponse>
     */
    public AsyncInvoker<SetVaultResourceRequest, SetVaultResourceResponse> setVaultResourceAsyncInvoker(
        SetVaultResourceRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.setVaultResource, hcClient);
    }

    /**
     * 查询指定客户端
     *
     * 查询指定客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentRequest 请求对象
     * @return CompletableFuture<ShowAgentResponse>
     */
    public CompletableFuture<ShowAgentResponse> showAgentAsync(ShowAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showAgent);
    }

    /**
     * 查询指定客户端
     *
     * 查询指定客户端
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentRequest 请求对象
     * @return AsyncInvoker<ShowAgentRequest, ShowAgentResponse>
     */
    public AsyncInvoker<ShowAgentRequest, ShowAgentResponse> showAgentAsyncInvoker(ShowAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showAgent, hcClient);
    }

    /**
     * 查询指定备份
     *
     * 根据指定id查询单个副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRequest 请求对象
     * @return CompletableFuture<ShowBackupResponse>
     */
    public CompletableFuture<ShowBackupResponse> showBackupAsync(ShowBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showBackup);
    }

    /**
     * 查询指定备份
     *
     * 根据指定id查询单个副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRequest 请求对象
     * @return AsyncInvoker<ShowBackupRequest, ShowBackupResponse>
     */
    public AsyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupAsyncInvoker(ShowBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showBackup, hcClient);
    }

    /**
     * 查询备份还原点
     *
     * 根据还原点ID查询指定还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckpointRequest 请求对象
     * @return CompletableFuture<ShowCheckpointResponse>
     */
    public CompletableFuture<ShowCheckpointResponse> showCheckpointAsync(ShowCheckpointRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showCheckpoint);
    }

    /**
     * 查询备份还原点
     *
     * 根据还原点ID查询指定还原点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckpointRequest 请求对象
     * @return AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse>
     */
    public AsyncInvoker<ShowCheckpointRequest, ShowCheckpointResponse> showCheckpointAsyncInvoker(
        ShowCheckpointRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showCheckpoint, hcClient);
    }

    /**
     * 查询租户信息
     *
     * 由控制台调用的内部接口，用于仅在查询共享备份时获取源project_id的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return CompletableFuture<ShowDomainResponse>
     */
    public CompletableFuture<ShowDomainResponse> showDomainAsync(ShowDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showDomain);
    }

    /**
     * 查询租户信息
     *
     * 由控制台调用的内部接口，用于仅在查询共享备份时获取源project_id的域名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return AsyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public AsyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainAsyncInvoker(ShowDomainRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showDomain, hcClient);
    }

    /**
     * 查询指定特性
     *
     * 查询服务指定特性
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureRequest 请求对象
     * @return CompletableFuture<ShowFeatureResponse>
     */
    public CompletableFuture<ShowFeatureResponse> showFeatureAsync(ShowFeatureRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showFeature);
    }

    /**
     * 查询指定特性
     *
     * 查询服务指定特性
     * &gt; 该接口目前属于公测阶段，部分region暂时无法使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureRequest 请求对象
     * @return AsyncInvoker<ShowFeatureRequest, ShowFeatureResponse>
     */
    public AsyncInvoker<ShowFeatureRequest, ShowFeatureResponse> showFeatureAsyncInvoker(ShowFeatureRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showFeature, hcClient);
    }

    /**
     * 获取备份成员详情
     *
     * 获取备份成员的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberDetailRequest 请求对象
     * @return CompletableFuture<ShowMemberDetailResponse>
     */
    public CompletableFuture<ShowMemberDetailResponse> showMemberDetailAsync(ShowMemberDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMemberDetail);
    }

    /**
     * 获取备份成员详情
     *
     * 获取备份成员的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberDetailRequest 请求对象
     * @return AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse>
     */
    public AsyncInvoker<ShowMemberDetailRequest, ShowMemberDetailResponse> showMemberDetailAsyncInvoker(
        ShowMemberDetailRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showMemberDetail, hcClient);
    }

    /**
     * 获取备份成员列表
     *
     * 获取备份共享成员的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMembersDetailRequest 请求对象
     * @return CompletableFuture<ShowMembersDetailResponse>
     */
    public CompletableFuture<ShowMembersDetailResponse> showMembersDetailAsync(ShowMembersDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMembersDetail);
    }

    /**
     * 获取备份成员列表
     *
     * 获取备份共享成员的列表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMembersDetailRequest 请求对象
     * @return AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse>
     */
    public AsyncInvoker<ShowMembersDetailRequest, ShowMembersDetailResponse> showMembersDetailAsyncInvoker(
        ShowMembersDetailRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showMembersDetail, hcClient);
    }

    /**
     * 查询备份元数据
     *
     * 查询备份时资源的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataRequest 请求对象
     * @return CompletableFuture<ShowMetadataResponse>
     */
    public CompletableFuture<ShowMetadataResponse> showMetadataAsync(ShowMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMetadata);
    }

    /**
     * 查询备份元数据
     *
     * 查询备份时资源的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataRequest 请求对象
     * @return AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse>
     */
    public AsyncInvoker<ShowMetadataRequest, ShowMetadataResponse> showMetadataAsyncInvoker(
        ShowMetadataRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showMetadata, hcClient);
    }

    /**
     * 查询迁移
     *
     * 查询迁移结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrateStatusRequest 请求对象
     * @return CompletableFuture<ShowMigrateStatusResponse>
     */
    public CompletableFuture<ShowMigrateStatusResponse> showMigrateStatusAsync(ShowMigrateStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showMigrateStatus);
    }

    /**
     * 查询迁移
     *
     * 查询迁移结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrateStatusRequest 请求对象
     * @return AsyncInvoker<ShowMigrateStatusRequest, ShowMigrateStatusResponse>
     */
    public AsyncInvoker<ShowMigrateStatusRequest, ShowMigrateStatusResponse> showMigrateStatusAsyncInvoker(
        ShowMigrateStatusRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showMigrateStatus, hcClient);
    }

    /**
     * 查询单个任务
     *
     * 根据指定任务ID查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpLogRequest 请求对象
     * @return CompletableFuture<ShowOpLogResponse>
     */
    public CompletableFuture<ShowOpLogResponse> showOpLogAsync(ShowOpLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showOpLog);
    }

    /**
     * 查询单个任务
     *
     * 根据指定任务ID查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpLogRequest 请求对象
     * @return AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse>
     */
    public AsyncInvoker<ShowOpLogRequest, ShowOpLogResponse> showOpLogAsyncInvoker(ShowOpLogRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showOpLog, hcClient);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<ShowOrganizationPolicyResponse>
     */
    public CompletableFuture<ShowOrganizationPolicyResponse> showOrganizationPolicyAsync(
        ShowOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showOrganizationPolicy);
    }

    /**
     * 查询指定组织策略
     *
     * 查询指定组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse>
     */
    public AsyncInvoker<ShowOrganizationPolicyRequest, ShowOrganizationPolicyResponse> showOrganizationPolicyAsyncInvoker(
        ShowOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showOrganizationPolicy, hcClient);
    }

    /**
     * 查询单个策略
     *
     * 查询单个策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showPolicy);
    }

    /**
     * 查询单个策略
     *
     * 查询单个策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showPolicy, hcClient);
    }

    /**
     * 查询指定可保护资源
     *
     * 根据ID查询可保护性资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectableRequest 请求对象
     * @return CompletableFuture<ShowProtectableResponse>
     */
    public CompletableFuture<ShowProtectableResponse> showProtectableAsync(ShowProtectableRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showProtectable);
    }

    /**
     * 查询指定可保护资源
     *
     * 根据ID查询可保护性资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectableRequest 请求对象
     * @return AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse>
     */
    public AsyncInvoker<ShowProtectableRequest, ShowProtectableResponse> showProtectableAsyncInvoker(
        ShowProtectableRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showProtectable, hcClient);
    }

    /**
     * 查询复制能力
     *
     * 查询本区域的复制能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationCapabilitiesRequest 请求对象
     * @return CompletableFuture<ShowReplicationCapabilitiesResponse>
     */
    public CompletableFuture<ShowReplicationCapabilitiesResponse> showReplicationCapabilitiesAsync(
        ShowReplicationCapabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showReplicationCapabilities);
    }

    /**
     * 查询复制能力
     *
     * 查询本区域的复制能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationCapabilitiesRequest 请求对象
     * @return AsyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse>
     */
    public AsyncInvoker<ShowReplicationCapabilitiesRequest, ShowReplicationCapabilitiesResponse> showReplicationCapabilitiesAsyncInvoker(
        ShowReplicationCapabilitiesRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showReplicationCapabilities, hcClient);
    }

    /**
     * 查询容量统计
     *
     * 查询容量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageUsageRequest 请求对象
     * @return CompletableFuture<ShowStorageUsageResponse>
     */
    public CompletableFuture<ShowStorageUsageResponse> showStorageUsageAsync(ShowStorageUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showStorageUsage);
    }

    /**
     * 查询容量统计
     *
     * 查询容量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageUsageRequest 请求对象
     * @return AsyncInvoker<ShowStorageUsageRequest, ShowStorageUsageResponse>
     */
    public AsyncInvoker<ShowStorageUsageRequest, ShowStorageUsageResponse> showStorageUsageAsyncInvoker(
        ShowStorageUsageRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showStorageUsage, hcClient);
    }

    /**
     * 存储库容量总览
     *
     * 查询项目下所有存储库的总容量和总使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryRequest 请求对象
     * @return CompletableFuture<ShowSummaryResponse>
     */
    public CompletableFuture<ShowSummaryResponse> showSummaryAsync(ShowSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showSummary);
    }

    /**
     * 存储库容量总览
     *
     * 查询项目下所有存储库的总容量和总使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSummaryRequest 请求对象
     * @return AsyncInvoker<ShowSummaryRequest, ShowSummaryResponse>
     */
    public AsyncInvoker<ShowSummaryRequest, ShowSummaryResponse> showSummaryAsyncInvoker(ShowSummaryRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showSummary, hcClient);
    }

    /**
     * 查询指定存储库
     *
     * 根据ID查询指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return CompletableFuture<ShowVaultResponse>
     */
    public CompletableFuture<ShowVaultResponse> showVaultAsync(ShowVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVault);
    }

    /**
     * 查询指定存储库
     *
     * 根据ID查询指定存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultRequest 请求对象
     * @return AsyncInvoker<ShowVaultRequest, ShowVaultResponse>
     */
    public AsyncInvoker<ShowVaultRequest, ShowVaultResponse> showVaultAsyncInvoker(ShowVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showVault, hcClient);
    }

    /**
     * 查询存储库项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultProjectTagRequest 请求对象
     * @return CompletableFuture<ShowVaultProjectTagResponse>
     */
    public CompletableFuture<ShowVaultProjectTagResponse> showVaultProjectTagAsync(ShowVaultProjectTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultProjectTag);
    }

    /**
     * 查询存储库项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合
     * 标签管理服务需要能够列出当前租户全部已使用的标签集合，为各服务Console打标签和过滤实例时提供标签联想功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultProjectTagRequest 请求对象
     * @return AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse>
     */
    public AsyncInvoker<ShowVaultProjectTagRequest, ShowVaultProjectTagResponse> showVaultProjectTagAsyncInvoker(
        ShowVaultProjectTagRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showVaultProjectTag, hcClient);
    }

    /**
     * 查询存储库资源实例
     *
     * 使用标签过滤实例
     * 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultResourceInstancesRequest 请求对象
     * @return CompletableFuture<ShowVaultResourceInstancesResponse>
     */
    public CompletableFuture<ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsync(
        ShowVaultResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultResourceInstances);
    }

    /**
     * 查询存储库资源实例
     *
     * 使用标签过滤实例
     * 标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse>
     */
    public AsyncInvoker<ShowVaultResourceInstancesRequest, ShowVaultResourceInstancesResponse> showVaultResourceInstancesAsyncInvoker(
        ShowVaultResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showVaultResourceInstances, hcClient);
    }

    /**
     * 查询存储库资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultTagRequest 请求对象
     * @return CompletableFuture<ShowVaultTagResponse>
     */
    public CompletableFuture<ShowVaultTagResponse> showVaultTagAsync(ShowVaultTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.showVaultTag);
    }

    /**
     * 查询存储库资源标签
     *
     * 查询指定实例的标签信息
     * 标签管理服务需要使用该接口查询指定实例的全部标签数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVaultTagRequest 请求对象
     * @return AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse>
     */
    public AsyncInvoker<ShowVaultTagRequest, ShowVaultTagResponse> showVaultTagAsyncInvoker(
        ShowVaultTagRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.showVaultTag, hcClient);
    }

    /**
     * 移除客户端
     *
     * 移除客户端，移除客户端时将会删除该客户端所有备份，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnregisterAgentRequest 请求对象
     * @return CompletableFuture<UnregisterAgentResponse>
     */
    public CompletableFuture<UnregisterAgentResponse> unregisterAgentAsync(UnregisterAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.unregisterAgent);
    }

    /**
     * 移除客户端
     *
     * 移除客户端，移除客户端时将会删除该客户端所有备份，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnregisterAgentRequest 请求对象
     * @return AsyncInvoker<UnregisterAgentRequest, UnregisterAgentResponse>
     */
    public AsyncInvoker<UnregisterAgentRequest, UnregisterAgentResponse> unregisterAgentAsyncInvoker(
        UnregisterAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.unregisterAgent, hcClient);
    }

    /**
     * 修改客户端
     *
     * 修改客户端状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentRequest 请求对象
     * @return CompletableFuture<UpdateAgentResponse>
     */
    public CompletableFuture<UpdateAgentResponse> updateAgentAsync(UpdateAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateAgent);
    }

    /**
     * 修改客户端
     *
     * 修改客户端状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentRequest 请求对象
     * @return AsyncInvoker<UpdateAgentRequest, UpdateAgentResponse>
     */
    public AsyncInvoker<UpdateAgentRequest, UpdateAgentResponse> updateAgentAsyncInvoker(UpdateAgentRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateAgent, hcClient);
    }

    /**
     * 更新备份
     *
     * 根据备份id更改备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupRequest 请求对象
     * @return CompletableFuture<UpdateBackupResponse>
     */
    public CompletableFuture<UpdateBackupResponse> updateBackupAsync(UpdateBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateBackup);
    }

    /**
     * 更新备份
     *
     * 根据备份id更改备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupRequest 请求对象
     * @return AsyncInvoker<UpdateBackupRequest, UpdateBackupResponse>
     */
    public AsyncInvoker<UpdateBackupRequest, UpdateBackupResponse> updateBackupAsyncInvoker(
        UpdateBackupRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateBackup, hcClient);
    }

    /**
     * 更新备份成员状态
     *
     * 更新备份共享成员的状态，需要接收方执行此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberStatusRequest 请求对象
     * @return CompletableFuture<UpdateMemberStatusResponse>
     */
    public CompletableFuture<UpdateMemberStatusResponse> updateMemberStatusAsync(UpdateMemberStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateMemberStatus);
    }

    /**
     * 更新备份成员状态
     *
     * 更新备份共享成员的状态，需要接收方执行此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberStatusRequest 请求对象
     * @return AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse>
     */
    public AsyncInvoker<UpdateMemberStatusRequest, UpdateMemberStatusResponse> updateMemberStatusAsyncInvoker(
        UpdateMemberStatusRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateMemberStatus, hcClient);
    }

    /**
     * 变更（废弃）
     *
     * 订单更新，支付cbc订单后，调用该接口更新包周期产品订单信息。该接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrderRequest 请求对象
     * @return CompletableFuture<UpdateOrderResponse>
     */
    public CompletableFuture<UpdateOrderResponse> updateOrderAsync(UpdateOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateOrder);
    }

    /**
     * 变更（废弃）
     *
     * 订单更新，支付cbc订单后，调用该接口更新包周期产品订单信息。该接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrderRequest 请求对象
     * @return AsyncInvoker<UpdateOrderRequest, UpdateOrderResponse>
     */
    public AsyncInvoker<UpdateOrderRequest, UpdateOrderResponse> updateOrderAsyncInvoker(UpdateOrderRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateOrder, hcClient);
    }

    /**
     * 更新组织策略
     *
     * 更新组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationPolicyRequest 请求对象
     * @return CompletableFuture<UpdateOrganizationPolicyResponse>
     */
    public CompletableFuture<UpdateOrganizationPolicyResponse> updateOrganizationPolicyAsync(
        UpdateOrganizationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateOrganizationPolicy);
    }

    /**
     * 更新组织策略
     *
     * 更新组织策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateOrganizationPolicyRequest, UpdateOrganizationPolicyResponse>
     */
    public AsyncInvoker<UpdateOrganizationPolicyRequest, UpdateOrganizationPolicyResponse> updateOrganizationPolicyAsyncInvoker(
        UpdateOrganizationPolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateOrganizationPolicy, hcClient);
    }

    /**
     * 修改策略
     *
     * 修改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updatePolicy);
    }

    /**
     * 修改策略
     *
     * 修改策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updatePolicy, hcClient);
    }

    /**
     * 修改存储库
     *
     * 根据存储库ID修改存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVaultRequest 请求对象
     * @return CompletableFuture<UpdateVaultResponse>
     */
    public CompletableFuture<UpdateVaultResponse> updateVaultAsync(UpdateVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, CbrMeta.updateVault);
    }

    /**
     * 修改存储库
     *
     * 根据存储库ID修改存储库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVaultRequest 请求对象
     * @return AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse>
     */
    public AsyncInvoker<UpdateVaultRequest, UpdateVaultResponse> updateVaultAsyncInvoker(UpdateVaultRequest request) {
        return new AsyncInvoker<>(request, CbrMeta.updateVault, hcClient);
    }

}

package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpResponse;
import com.huaweicloud.sdk.dds.v3.model.BatchDeleteBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.BatchDeleteBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.dds.v3.model.BatchUpgradeDatabaseVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.BatchUpgradeDatabaseVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.CancelEipRequest;
import com.huaweicloud.sdk.dds.v3.model.CancelEipResponse;
import com.huaweicloud.sdk.dds.v3.model.CancelScheduledTaskRequest;
import com.huaweicloud.sdk.dds.v3.model.CancelScheduledTaskResponse;
import com.huaweicloud.sdk.dds.v3.model.ChangeOpsWindowRequest;
import com.huaweicloud.sdk.dds.v3.model.ChangeOpsWindowResponse;
import com.huaweicloud.sdk.dds.v3.model.CheckPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.CheckPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.CheckWeakPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.CheckWeakPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.CompareConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CompareConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseRoleRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseRoleResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseUserResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateIpRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateIpResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateKillOpRuleRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateKillOpRuleResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteAuditLogRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteAuditLogResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseRoleRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseRoleResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseUserRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseUserResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteKillOpRuleListRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteKillOpRuleListResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteLtsConfigRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteLtsConfigResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteReadonlyNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteReadonlyNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteSessionRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteSessionResponse;
import com.huaweicloud.sdk.dds.v3.model.DownloadErrorlogRequest;
import com.huaweicloud.sdk.dds.v3.model.DownloadErrorlogResponse;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.dds.v3.model.ExpandReplicasetNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.ExpandReplicasetNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAppliedInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAppliedInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogLinksRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogLinksResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAz2MigrateRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAz2MigrateResponse;
import com.huaweicloud.sdk.dds.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseRolesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseRolesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseUsersRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseUsersResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatastoreVersionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatastoreVersionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListErrorLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListErrorLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorInfosRequest;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorInfosResponse;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesByTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsConfigsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsConfigsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsErrorLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsErrorLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsSlowLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsSlowLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreCollectionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreCollectionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreDatabasesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreDatabasesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.dds.v3.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSessionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSessionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSslCertDownloadAddressRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSslCertDownloadAddressResponse;
import com.huaweicloud.sdk.dds.v3.model.ListStorageTypeRequest;
import com.huaweicloud.sdk.dds.v3.model.ListStorageTypeResponse;
import com.huaweicloud.sdk.dds.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.dds.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.dds.v3.model.MigrateAzRequest;
import com.huaweicloud.sdk.dds.v3.model.MigrateAzResponse;
import com.huaweicloud.sdk.dds.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceVolumeRequest;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceVolumeResponse;
import com.huaweicloud.sdk.dds.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceFromCollectionRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceFromCollectionResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreNewInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreNewInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.SetAuditlogPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetAuditlogPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.SetAutoEnlargePoliciesRequest;
import com.huaweicloud.sdk.dds.v3.model.SetAutoEnlargePoliciesResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerSwitchRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerSwitchResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerWindowRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerWindowResponse;
import com.huaweicloud.sdk.dds.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowAuditlogPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowAuditlogPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupDownloadLinkRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupDownloadLinkResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowClientNetworkRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowClientNetworkResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationAppliedHistoryRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationAppliedHistoryResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationModifyHistoryRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationModifyHistoryResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationParameterRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationParameterResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConnectionStatisticsRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConnectionStatisticsResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowDiskUsageRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowDiskUsageResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowEntityConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowEntityConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowInstanceConfigurationModifyHistoryRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowInstanceConfigurationModifyHistoryResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowKillOpRuleRuleListRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowKillOpRuleRuleListResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowReplSetNameRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowReplSetNameResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowSecondLevelMonitoringStatusRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowSecondLevelMonitoringStatusResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowShardingBalancerRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowShardingBalancerResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowSlowlogDesensitizationSwitchRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowSlowlogDesensitizationSwitchResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowUpgradeDurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowUpgradeDurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.dds.v3.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.dds.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchInstancePrimaryRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchInstancePrimaryResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSlowlogDesensitizationRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSlowlogDesensitizationResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchoverReplicaSetRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchoverReplicaSetResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateClientNetworkRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateClientNetworkResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateEntityConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateEntityConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstancePortRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstancePortResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceRemarkRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceRemarkResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateKillOpRuleRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateKillOpRuleResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateLtsConfigRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateLtsConfigResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateReplSetNameRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateReplSetNameResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.dds.v3.model.UpgradeDatabaseVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.UpgradeDatabaseVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.ValidateConfigurationNameRequest;
import com.huaweicloud.sdk.dds.v3.model.ValidateConfigurationNameResponse;

import java.util.concurrent.CompletableFuture;

public class DdsAsyncClient {

    protected HcClient hcClient;

    public DdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsAsyncClient> newBuilder() {
        ClientBuilder<DdsAsyncClient> clientBuilder = new ClientBuilder<>(DdsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddReadonlyNodeRequest 请求对象
     * @return CompletableFuture<AddReadonlyNodeResponse>
     */
    public CompletableFuture<AddReadonlyNodeResponse> addReadonlyNodeAsync(AddReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addReadonlyNode);
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>
     */
    public AsyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse> addReadonlyNodeAsyncInvoker(
        AddReadonlyNodeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.addReadonlyNode, hcClient);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddShardingNodeRequest 请求对象
     * @return CompletableFuture<AddShardingNodeResponse>
     */
    public CompletableFuture<AddShardingNodeResponse> addShardingNodeAsync(AddShardingNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddShardingNodeRequest 请求对象
     * @return AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>
     */
    public AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNodeAsyncInvoker(
        AddShardingNodeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.addShardingNode, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.attachEip, hcClient);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternalIpRequest 请求对象
     * @return CompletableFuture<AttachInternalIpResponse>
     */
    public CompletableFuture<AttachInternalIpResponse> attachInternalIpAsync(AttachInternalIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachInternalIp);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternalIpRequest 请求对象
     * @return AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>
     */
    public AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIpAsyncInvoker(
        AttachInternalIpRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.attachInternalIp, hcClient);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBackupRequest 请求对象
     * @return CompletableFuture<BatchDeleteBackupResponse>
     */
    public CompletableFuture<BatchDeleteBackupResponse> batchDeleteBackupAsync(BatchDeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchDeleteBackup);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBackupRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBackupRequest, BatchDeleteBackupResponse>
     */
    public AsyncInvoker<BatchDeleteBackupRequest, BatchDeleteBackupResponse> batchDeleteBackupAsyncInvoker(
        BatchDeleteBackupRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.batchDeleteBackup, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.batchTagAction, hcClient);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return CompletableFuture<BatchUpgradeDatabaseVersionResponse>
     */
    public CompletableFuture<BatchUpgradeDatabaseVersionResponse> batchUpgradeDatabaseVersionAsync(
        BatchUpgradeDatabaseVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchUpgradeDatabaseVersion);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return AsyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse>
     */
    public AsyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse> batchUpgradeDatabaseVersionAsyncInvoker(
        BatchUpgradeDatabaseVersionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.batchUpgradeDatabaseVersion, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelEipRequest 请求对象
     * @return CompletableFuture<CancelEipResponse>
     */
    public CompletableFuture<CancelEipResponse> cancelEipAsync(CancelEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.cancelEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelEipRequest 请求对象
     * @return AsyncInvoker<CancelEipRequest, CancelEipResponse>
     */
    public AsyncInvoker<CancelEipRequest, CancelEipResponse> cancelEipAsyncInvoker(CancelEipRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.cancelEip, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 根据任务ID取消定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduledTaskRequest 请求对象
     * @return CompletableFuture<CancelScheduledTaskResponse>
     */
    public CompletableFuture<CancelScheduledTaskResponse> cancelScheduledTaskAsync(CancelScheduledTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.cancelScheduledTask);
    }

    /**
     * 取消定时任务
     *
     * 根据任务ID取消定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduledTaskRequest 请求对象
     * @return AsyncInvoker<CancelScheduledTaskRequest, CancelScheduledTaskResponse>
     */
    public AsyncInvoker<CancelScheduledTaskRequest, CancelScheduledTaskResponse> cancelScheduledTaskAsyncInvoker(
        CancelScheduledTaskRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.cancelScheduledTask, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(
        ChangeOpsWindowRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.changeOpsWindow, hcClient);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPasswordRequest 请求对象
     * @return CompletableFuture<CheckPasswordResponse>
     */
    public CompletableFuture<CheckPasswordResponse> checkPasswordAsync(CheckPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.checkPassword);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPasswordRequest 请求对象
     * @return AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse>
     */
    public AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse> checkPasswordAsyncInvoker(
        CheckPasswordRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.checkPassword, hcClient);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeakPasswordRequest 请求对象
     * @return CompletableFuture<CheckWeakPasswordResponse>
     */
    public CompletableFuture<CheckWeakPasswordResponse> checkWeakPasswordAsync(CheckWeakPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.checkWeakPassword);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeakPasswordRequest 请求对象
     * @return AsyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>
     */
    public AsyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse> checkWeakPasswordAsyncInvoker(
        CheckWeakPasswordRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.checkWeakPassword, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return CompletableFuture<CompareConfigurationResponse>
     */
    public CompletableFuture<CompareConfigurationResponse> compareConfigurationAsync(
        CompareConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationAsyncInvoker(
        CompareConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createConfiguration, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRoleRequest 请求对象
     * @return CompletableFuture<CreateDatabaseRoleResponse>
     */
    public CompletableFuture<CreateDatabaseRoleResponse> createDatabaseRoleAsync(CreateDatabaseRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseRole);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRoleRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>
     */
    public AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRoleAsyncInvoker(
        CreateDatabaseRoleRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createDatabaseRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateDatabaseUserResponse>
     */
    public CompletableFuture<CreateDatabaseUserResponse> createDatabaseUserAsync(CreateDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserAsyncInvoker(
        CreateDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createInstance, hcClient);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpRequest 请求对象
     * @return CompletableFuture<CreateIpResponse>
     */
    public CompletableFuture<CreateIpResponse> createIpAsync(CreateIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createIp);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpRequest 请求对象
     * @return AsyncInvoker<CreateIpRequest, CreateIpResponse>
     */
    public AsyncInvoker<CreateIpRequest, CreateIpResponse> createIpAsyncInvoker(CreateIpRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createIp, hcClient);
    }

    /**
     * 创建killOp规则
     *
     * 创建killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKillOpRuleRequest 请求对象
     * @return CompletableFuture<CreateKillOpRuleResponse>
     */
    public CompletableFuture<CreateKillOpRuleResponse> createKillOpRuleAsync(CreateKillOpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createKillOpRule);
    }

    /**
     * 创建killOp规则
     *
     * 创建killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKillOpRuleRequest 请求对象
     * @return AsyncInvoker<CreateKillOpRuleRequest, CreateKillOpRuleResponse>
     */
    public AsyncInvoker<CreateKillOpRuleRequest, CreateKillOpRuleResponse> createKillOpRuleAsyncInvoker(
        CreateKillOpRuleRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createKillOpRule, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.createManualBackup, hcClient);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditLogRequest 请求对象
     * @return CompletableFuture<DeleteAuditLogResponse>
     */
    public CompletableFuture<DeleteAuditLogResponse> deleteAuditLogAsync(DeleteAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteAuditLog);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditLogRequest 请求对象
     * @return AsyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>
     */
    public AsyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse> deleteAuditLogAsyncInvoker(
        DeleteAuditLogRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteAuditLog, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRoleRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseRoleResponse>
     */
    public CompletableFuture<DeleteDatabaseRoleResponse> deleteDatabaseRoleAsync(DeleteDatabaseRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteDatabaseRole);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRoleRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>
     */
    public AsyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRoleAsyncInvoker(
        DeleteDatabaseRoleRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteDatabaseRole, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseUserResponse>
     */
    public CompletableFuture<DeleteDatabaseUserResponse> deleteDatabaseUserAsync(DeleteDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUserAsyncInvoker(
        DeleteDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除killOp规则
     *
     * 删除killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKillOpRuleListRequest 请求对象
     * @return CompletableFuture<DeleteKillOpRuleListResponse>
     */
    public CompletableFuture<DeleteKillOpRuleListResponse> deleteKillOpRuleListAsync(
        DeleteKillOpRuleListRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteKillOpRuleList);
    }

    /**
     * 删除killOp规则
     *
     * 删除killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKillOpRuleListRequest 请求对象
     * @return AsyncInvoker<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse>
     */
    public AsyncInvoker<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse> deleteKillOpRuleListAsyncInvoker(
        DeleteKillOpRuleListRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteKillOpRuleList, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigRequest 请求对象
     * @return CompletableFuture<DeleteLtsConfigResponse>
     */
    public CompletableFuture<DeleteLtsConfigResponse> deleteLtsConfigAsync(DeleteLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteLtsConfig);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigRequest 请求对象
     * @return AsyncInvoker<DeleteLtsConfigRequest, DeleteLtsConfigResponse>
     */
    public AsyncInvoker<DeleteLtsConfigRequest, DeleteLtsConfigResponse> deleteLtsConfigAsyncInvoker(
        DeleteLtsConfigRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteLtsConfig, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除只读节点
     *
     * 当副本集添加了只读节点后，需要删除对应的只读节点需要调用此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodeRequest 请求对象
     * @return CompletableFuture<DeleteReadonlyNodeResponse>
     */
    public CompletableFuture<DeleteReadonlyNodeResponse> deleteReadonlyNodeAsync(DeleteReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteReadonlyNode);
    }

    /**
     * 删除只读节点
     *
     * 当副本集添加了只读节点后，需要删除对应的只读节点需要调用此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse>
     */
    public AsyncInvoker<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse> deleteReadonlyNodeAsyncInvoker(
        DeleteReadonlyNodeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteReadonlyNode, hcClient);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return CompletableFuture<DeleteSessionResponse>
     */
    public CompletableFuture<DeleteSessionResponse> deleteSessionAsync(DeleteSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteSession);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public AsyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionAsyncInvoker(
        DeleteSessionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.deleteSession, hcClient);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadErrorlogRequest 请求对象
     * @return CompletableFuture<DownloadErrorlogResponse>
     */
    public CompletableFuture<DownloadErrorlogResponse> downloadErrorlogAsync(DownloadErrorlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.downloadErrorlog);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadErrorlogRequest 请求对象
     * @return AsyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>
     */
    public AsyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlogAsyncInvoker(
        DownloadErrorlogRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.downloadErrorlog, hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(
        DownloadSlowlogRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.downloadSlowlog, hcClient);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicasetNodeRequest 请求对象
     * @return CompletableFuture<ExpandReplicasetNodeResponse>
     */
    public CompletableFuture<ExpandReplicasetNodeResponse> expandReplicasetNodeAsync(
        ExpandReplicasetNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.expandReplicasetNode);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicasetNodeRequest 请求对象
     * @return AsyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>
     */
    public AsyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> expandReplicasetNodeAsyncInvoker(
        ExpandReplicasetNodeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.expandReplicasetNode, hcClient);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedInstancesRequest 请求对象
     * @return CompletableFuture<ListAppliedInstancesResponse>
     */
    public CompletableFuture<ListAppliedInstancesResponse> listAppliedInstancesAsync(
        ListAppliedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAppliedInstances);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedInstancesRequest 请求对象
     * @return AsyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>
     */
    public AsyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse> listAppliedInstancesAsyncInvoker(
        ListAppliedInstancesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listAppliedInstances, hcClient);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogLinksRequest 请求对象
     * @return CompletableFuture<ListAuditlogLinksResponse>
     */
    public CompletableFuture<ListAuditlogLinksResponse> listAuditlogLinksAsync(ListAuditlogLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogLinks);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogLinksRequest 请求对象
     * @return AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>
     */
    public AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinksAsyncInvoker(
        ListAuditlogLinksRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listAuditlogLinks, hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(
        ListAuditlogsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAz2MigrateRequest 请求对象
     * @return CompletableFuture<ListAz2MigrateResponse>
     */
    public CompletableFuture<ListAz2MigrateResponse> listAz2MigrateAsync(ListAz2MigrateRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAz2Migrate);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAz2MigrateRequest 请求对象
     * @return AsyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>
     */
    public AsyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2MigrateAsyncInvoker(
        ListAz2MigrateRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listAz2Migrate, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listBackups, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return CompletableFuture<ListDatabaseRolesResponse>
     */
    public CompletableFuture<ListDatabaseRolesResponse> listDatabaseRolesAsync(ListDatabaseRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesAsyncInvoker(
        ListDatabaseRolesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listDatabaseRoles, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(
        ListDatabaseUsersRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listDatabaseUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoreVersionsRequest 请求对象
     * @return CompletableFuture<ListDatastoreVersionsResponse>
     */
    public CompletableFuture<ListDatastoreVersionsResponse> listDatastoreVersionsAsync(
        ListDatastoreVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoreVersionsRequest 请求对象
     * @return AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>
     */
    public AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersionsAsyncInvoker(
        ListDatastoreVersionsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listDatastoreVersions, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(
        ListErrorLogsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListFlavorInfosResponse>
     */
    public CompletableFuture<ListFlavorInfosResponse> listFlavorInfosAsync(ListFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosAsyncInvoker(
        ListFlavorInfosRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 查询LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return CompletableFuture<ListLtsConfigsResponse>
     */
    public CompletableFuture<ListLtsConfigsResponse> listLtsConfigsAsync(ListLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listLtsConfigs);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 查询LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsAsyncInvoker(
        ListLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listLtsConfigs, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogsRequest 请求对象
     * @return CompletableFuture<ListLtsErrorLogsResponse>
     */
    public CompletableFuture<ListLtsErrorLogsResponse> listLtsErrorLogsAsync(ListLtsErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listLtsErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse>
     */
    public AsyncInvoker<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse> listLtsErrorLogsAsyncInvoker(
        ListLtsErrorLogsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listLtsErrorLogs, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowLogsRequest 请求对象
     * @return CompletableFuture<ListLtsSlowLogsResponse>
     */
    public CompletableFuture<ListLtsSlowLogsResponse> listLtsSlowLogsAsync(ListLtsSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listLtsSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>
     */
    public AsyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> listLtsSlowLogsAsyncInvoker(
        ListLtsSlowLogsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listLtsSlowLogs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listRecycleInstances, hcClient);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreCollectionsRequest 请求对象
     * @return CompletableFuture<ListRestoreCollectionsResponse>
     */
    public CompletableFuture<ListRestoreCollectionsResponse> listRestoreCollectionsAsync(
        ListRestoreCollectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreCollections);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreCollectionsRequest 请求对象
     * @return AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>
     */
    public AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollectionsAsyncInvoker(
        ListRestoreCollectionsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listRestoreCollections, hcClient);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return CompletableFuture<ListRestoreDatabasesResponse>
     */
    public CompletableFuture<ListRestoreDatabasesResponse> listRestoreDatabasesAsync(
        ListRestoreDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreDatabases);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesAsyncInvoker(
        ListRestoreDatabasesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询定时任务
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return CompletableFuture<ListScheduledTasksResponse>
     */
    public CompletableFuture<ListScheduledTasksResponse> listScheduledTasksAsync(ListScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listScheduledTasks);
    }

    /**
     * 查询定时任务
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksAsyncInvoker(
        ListScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return CompletableFuture<ListSessionsResponse>
     */
    public CompletableFuture<ListSessionsResponse> listSessionsAsync(ListSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSessions);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return AsyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public AsyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsAsyncInvoker(
        ListSessionsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listSessions, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadAddressRequest 请求对象
     * @return CompletableFuture<ListSslCertDownloadAddressResponse>
     */
    public CompletableFuture<ListSslCertDownloadAddressResponse> listSslCertDownloadAddressAsync(
        ListSslCertDownloadAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSslCertDownloadAddress);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadAddressRequest 请求对象
     * @return AsyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>
     */
    public AsyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> listSslCertDownloadAddressAsyncInvoker(
        ListSslCertDownloadAddressRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listSslCertDownloadAddress, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypeRequest 请求对象
     * @return CompletableFuture<ListStorageTypeResponse>
     */
    public CompletableFuture<ListStorageTypeResponse> listStorageTypeAsync(ListStorageTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listStorageType);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypeRequest 请求对象
     * @return AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>
     */
    public AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse> listStorageTypeAsyncInvoker(
        ListStorageTypeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listStorageType, hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listTasks);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listTasks, hcClient);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateAzRequest 请求对象
     * @return CompletableFuture<MigrateAzResponse>
     */
    public CompletableFuture<MigrateAzResponse> migrateAzAsync(MigrateAzRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.migrateAz);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateAzRequest 请求对象
     * @return AsyncInvoker<MigrateAzRequest, MigrateAzResponse>
     */
    public AsyncInvoker<MigrateAzRequest, MigrateAzResponse> migrateAzAsyncInvoker(MigrateAzRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.migrateAz, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return CompletableFuture<ResetConfigurationResponse>
     */
    public CompletableFuture<ResetConfigurationResponse> resetConfigurationAsync(ResetConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationAsyncInvoker(
        ResetConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.resetConfiguration, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resetPassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(
        ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(
        ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstance);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.restoreInstance, hcClient);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceFromCollectionRequest 请求对象
     * @return CompletableFuture<RestoreInstanceFromCollectionResponse>
     */
    public CompletableFuture<RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsync(
        RestoreInstanceFromCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstanceFromCollection);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceFromCollectionRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>
     */
    public AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsyncInvoker(
        RestoreInstanceFromCollectionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.restoreInstanceFromCollection, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreNewInstanceRequest 请求对象
     * @return CompletableFuture<RestoreNewInstanceResponse>
     */
    public CompletableFuture<RestoreNewInstanceResponse> restoreNewInstanceAsync(RestoreNewInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreNewInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreNewInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>
     */
    public AsyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstanceAsyncInvoker(
        RestoreNewInstanceRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.restoreNewInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(
        SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePoliciesRequest 请求对象
     * @return CompletableFuture<SetAutoEnlargePoliciesResponse>
     */
    public CompletableFuture<SetAutoEnlargePoliciesResponse> setAutoEnlargePoliciesAsync(
        SetAutoEnlargePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setAutoEnlargePolicies);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePoliciesRequest 请求对象
     * @return AsyncInvoker<SetAutoEnlargePoliciesRequest, SetAutoEnlargePoliciesResponse>
     */
    public AsyncInvoker<SetAutoEnlargePoliciesRequest, SetAutoEnlargePoliciesResponse> setAutoEnlargePoliciesAsyncInvoker(
        SetAutoEnlargePoliciesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setAutoEnlargePolicies, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerSwitchRequest 请求对象
     * @return CompletableFuture<SetBalancerSwitchResponse>
     */
    public CompletableFuture<SetBalancerSwitchResponse> setBalancerSwitchAsync(SetBalancerSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBalancerSwitch);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerSwitchRequest 请求对象
     * @return AsyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>
     */
    public AsyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitchAsyncInvoker(
        SetBalancerSwitchRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setBalancerSwitch, hcClient);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerWindowRequest 请求对象
     * @return CompletableFuture<SetBalancerWindowResponse>
     */
    public CompletableFuture<SetBalancerWindowResponse> setBalancerWindowAsync(SetBalancerWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBalancerWindow);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerWindowRequest 请求对象
     * @return AsyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>
     */
    public AsyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindowAsyncInvoker(
        SetBalancerWindowRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setBalancerWindow, hcClient);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setRecyclePolicy);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(
        ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoEnlargePolicyResponse>
     */
    public CompletableFuture<ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsync(
        ShowAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsyncInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(
        ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询副本集跨网段访问配置
     *
     * 查询副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientNetworkRequest 请求对象
     * @return CompletableFuture<ShowClientNetworkResponse>
     */
    public CompletableFuture<ShowClientNetworkResponse> showClientNetworkAsync(ShowClientNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showClientNetwork);
    }

    /**
     * 查询副本集跨网段访问配置
     *
     * 查询副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientNetworkRequest 请求对象
     * @return AsyncInvoker<ShowClientNetworkRequest, ShowClientNetworkResponse>
     */
    public AsyncInvoker<ShowClientNetworkRequest, ShowClientNetworkResponse> showClientNetworkAsyncInvoker(
        ShowClientNetworkRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showClientNetwork, hcClient);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAppliedHistoryRequest 请求对象
     * @return CompletableFuture<ShowConfigurationAppliedHistoryResponse>
     */
    public CompletableFuture<ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryAsync(
        ShowConfigurationAppliedHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationAppliedHistory);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAppliedHistoryRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>
     */
    public AsyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryAsyncInvoker(
        ShowConfigurationAppliedHistoryRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showConfigurationAppliedHistory, hcClient);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationModifyHistoryRequest 请求对象
     * @return CompletableFuture<ShowConfigurationModifyHistoryResponse>
     */
    public CompletableFuture<ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryAsync(
        ShowConfigurationModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationModifyHistory);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>
     */
    public AsyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryAsyncInvoker(
        ShowConfigurationModifyHistoryRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showConfigurationModifyHistory, hcClient);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationParameterRequest 请求对象
     * @return CompletableFuture<ShowConfigurationParameterResponse>
     */
    public CompletableFuture<ShowConfigurationParameterResponse> showConfigurationParameterAsync(
        ShowConfigurationParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConfigurationParameter);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationParameterRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>
     */
    public AsyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> showConfigurationParameterAsyncInvoker(
        ShowConfigurationParameterRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showConfigurationParameter, hcClient);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionStatisticsRequest 请求对象
     * @return CompletableFuture<ShowConnectionStatisticsResponse>
     */
    public CompletableFuture<ShowConnectionStatisticsResponse> showConnectionStatisticsAsync(
        ShowConnectionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showConnectionStatistics);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>
     */
    public AsyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatisticsAsyncInvoker(
        ShowConnectionStatisticsRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showConnectionStatistics, hcClient);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiskUsageRequest 请求对象
     * @return CompletableFuture<ShowDiskUsageResponse>
     */
    public CompletableFuture<ShowDiskUsageResponse> showDiskUsageAsync(ShowDiskUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showDiskUsage);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiskUsageRequest 请求对象
     * @return AsyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>
     */
    public AsyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse> showDiskUsageAsyncInvoker(
        ShowDiskUsageRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showDiskUsage, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityConfigurationRequest 请求对象
     * @return CompletableFuture<ShowEntityConfigurationResponse>
     */
    public CompletableFuture<ShowEntityConfigurationResponse> showEntityConfigurationAsync(
        ShowEntityConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showEntityConfiguration);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>
     */
    public AsyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> showEntityConfigurationAsyncInvoker(
        ShowEntityConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showEntityConfiguration, hcClient);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationModifyHistoryRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationModifyHistoryResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationModifyHistoryResponse> showInstanceConfigurationModifyHistoryAsync(
        ShowInstanceConfigurationModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showInstanceConfigurationModifyHistory);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationModifyHistoryRequest, ShowInstanceConfigurationModifyHistoryResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationModifyHistoryRequest, ShowInstanceConfigurationModifyHistoryResponse> showInstanceConfigurationModifyHistoryAsyncInvoker(
        ShowInstanceConfigurationModifyHistoryRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showInstanceConfigurationModifyHistory, hcClient);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showJobDetail);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取killOp规则列表
     *
     * 获取killOp规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillOpRuleRuleListRequest 请求对象
     * @return CompletableFuture<ShowKillOpRuleRuleListResponse>
     */
    public CompletableFuture<ShowKillOpRuleRuleListResponse> showKillOpRuleRuleListAsync(
        ShowKillOpRuleRuleListRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showKillOpRuleRuleList);
    }

    /**
     * 获取killOp规则列表
     *
     * 获取killOp规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillOpRuleRuleListRequest 请求对象
     * @return AsyncInvoker<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse>
     */
    public AsyncInvoker<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse> showKillOpRuleRuleListAsyncInvoker(
        ShowKillOpRuleRuleListRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showKillOpRuleRuleList, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showRecyclePolicy);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplSetNameRequest 请求对象
     * @return CompletableFuture<ShowReplSetNameResponse>
     */
    public CompletableFuture<ShowReplSetNameResponse> showReplSetNameAsync(ShowReplSetNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showReplSetName);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplSetNameRequest 请求对象
     * @return AsyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>
     */
    public AsyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse> showReplSetNameAsyncInvoker(
        ShowReplSetNameRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showReplSetName, hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return CompletableFuture<ShowSecondLevelMonitoringStatusResponse>
     */
    public CompletableFuture<ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsync(
        ShowSecondLevelMonitoringStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showSecondLevelMonitoringStatus);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsyncInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardingBalancerRequest 请求对象
     * @return CompletableFuture<ShowShardingBalancerResponse>
     */
    public CompletableFuture<ShowShardingBalancerResponse> showShardingBalancerAsync(
        ShowShardingBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showShardingBalancer);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardingBalancerRequest 请求对象
     * @return AsyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>
     */
    public AsyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancerAsyncInvoker(
        ShowShardingBalancerRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showShardingBalancer, hcClient);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return CompletableFuture<ShowSlowlogDesensitizationSwitchResponse>
     */
    public CompletableFuture<ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchAsync(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showSlowlogDesensitizationSwitch);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return AsyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>
     */
    public AsyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchAsyncInvoker(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showSlowlogDesensitizationSwitch, hcClient);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDurationRequest 请求对象
     * @return CompletableFuture<ShowUpgradeDurationResponse>
     */
    public CompletableFuture<ShowUpgradeDurationResponse> showUpgradeDurationAsync(ShowUpgradeDurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showUpgradeDuration);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDurationRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>
     */
    public AsyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> showUpgradeDurationAsyncInvoker(
        ShowUpgradeDurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showUpgradeDuration, hcClient);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodesResponse>
     */
    public CompletableFuture<ShrinkInstanceNodesResponse> shrinkInstanceNodesAsync(ShrinkInstanceNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.shrinkInstanceNodes);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesAsyncInvoker(
        ShrinkInstanceNodesRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return CompletableFuture<StopBackupResponse>
     */
    public CompletableFuture<StopBackupResponse> stopBackupAsync(StopBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return AsyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public AsyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupAsyncInvoker(StopBackupRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.stopBackup, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchConfigurationResponse>
     */
    public CompletableFuture<SwitchConfigurationResponse> switchConfigurationAsync(SwitchConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationAsyncInvoker(
        SwitchConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchConfiguration, hcClient);
    }

    /**
     * 强制备节点升主
     *
     * 支持副本集、shard和config备节点强制升主。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInstancePrimaryRequest 请求对象
     * @return CompletableFuture<SwitchInstancePrimaryResponse>
     */
    public CompletableFuture<SwitchInstancePrimaryResponse> switchInstancePrimaryAsync(
        SwitchInstancePrimaryRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchInstancePrimary);
    }

    /**
     * 强制备节点升主
     *
     * 支持副本集、shard和config备节点强制升主。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInstancePrimaryRequest 请求对象
     * @return AsyncInvoker<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse>
     */
    public AsyncInvoker<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse> switchInstancePrimaryAsyncInvoker(
        SwitchInstancePrimaryRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchInstancePrimary, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return CompletableFuture<SwitchSecondLevelMonitoringResponse>
     */
    public CompletableFuture<SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsync(
        SwitchSecondLevelMonitoringRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSecondLevelMonitoring);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsyncInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return CompletableFuture<SwitchSlowlogDesensitizationResponse>
     */
    public CompletableFuture<SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsync(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsyncInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSsl);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchSsl, hcClient);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverReplicaSetRequest 请求对象
     * @return CompletableFuture<SwitchoverReplicaSetResponse>
     */
    public CompletableFuture<SwitchoverReplicaSetResponse> switchoverReplicaSetAsync(
        SwitchoverReplicaSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchoverReplicaSet);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverReplicaSetRequest 请求对象
     * @return AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>
     */
    public AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSetAsyncInvoker(
        SwitchoverReplicaSetRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.switchoverReplicaSet, hcClient);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return CompletableFuture<UpdateClientNetworkResponse>
     */
    public CompletableFuture<UpdateClientNetworkResponse> updateClientNetworkAsync(UpdateClientNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateClientNetwork);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkAsyncInvoker(
        UpdateClientNetworkRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationParameterRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationParameterResponse>
     */
    public CompletableFuture<UpdateConfigurationParameterResponse> updateConfigurationParameterAsync(
        UpdateConfigurationParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateConfigurationParameter);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationParameterRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>
     */
    public AsyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> updateConfigurationParameterAsyncInvoker(
        UpdateConfigurationParameterRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateConfigurationParameter, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEntityConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateEntityConfigurationResponse>
     */
    public CompletableFuture<UpdateEntityConfigurationResponse> updateEntityConfigurationAsync(
        UpdateEntityConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateEntityConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEntityConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>
     */
    public AsyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> updateEntityConfigurationAsyncInvoker(
        UpdateEntityConfigurationRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateEntityConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return CompletableFuture<UpdateInstancePortResponse>
     */
    public CompletableFuture<UpdateInstancePortResponse> updateInstancePortAsync(UpdateInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstancePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortAsyncInvoker(
        UpdateInstancePortRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRemarkRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRemarkResponse>
     */
    public CompletableFuture<UpdateInstanceRemarkResponse> updateInstanceRemarkAsync(
        UpdateInstanceRemarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstanceRemark);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRemarkRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>
     */
    public AsyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> updateInstanceRemarkAsyncInvoker(
        UpdateInstanceRemarkRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateInstanceRemark, hcClient);
    }

    /**
     * 启用/禁用killOp规则
     *
     * 启用/禁用killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKillOpRuleRequest 请求对象
     * @return CompletableFuture<UpdateKillOpRuleResponse>
     */
    public CompletableFuture<UpdateKillOpRuleResponse> updateKillOpRuleAsync(UpdateKillOpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateKillOpRule);
    }

    /**
     * 启用/禁用killOp规则
     *
     * 启用/禁用killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKillOpRuleRequest 请求对象
     * @return AsyncInvoker<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse>
     */
    public AsyncInvoker<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse> updateKillOpRuleAsyncInvoker(
        UpdateKillOpRuleRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateKillOpRule, hcClient);
    }

    /**
     * 关联LTS日志流
     *
     * 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * 系统会为当前选择的日志流创建对应日志类型的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsConfigRequest 请求对象
     * @return CompletableFuture<UpdateLtsConfigResponse>
     */
    public CompletableFuture<UpdateLtsConfigResponse> updateLtsConfigAsync(UpdateLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateLtsConfig);
    }

    /**
     * 关联LTS日志流
     *
     * 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * 系统会为当前选择的日志流创建对应日志类型的结构化配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse>
     */
    public AsyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse> updateLtsConfigAsyncInvoker(
        UpdateLtsConfigRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateLtsConfig, hcClient);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplSetNameRequest 请求对象
     * @return CompletableFuture<UpdateReplSetNameResponse>
     */
    public CompletableFuture<UpdateReplSetNameResponse> updateReplSetNameAsync(UpdateReplSetNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateReplSetName);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplSetNameRequest 请求对象
     * @return AsyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>
     */
    public AsyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse> updateReplSetNameAsyncInvoker(
        UpdateReplSetNameRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateReplSetName, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDatabaseVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDatabaseVersionResponse>
     */
    public CompletableFuture<UpgradeDatabaseVersionResponse> upgradeDatabaseVersionAsync(
        UpgradeDatabaseVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.upgradeDatabaseVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDatabaseVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>
     */
    public AsyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> upgradeDatabaseVersionAsyncInvoker(
        UpgradeDatabaseVersionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.upgradeDatabaseVersion, hcClient);
    }

    /**
     * 校验参数模板名称是否存在
     *
     * 校验参数模板名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigurationNameRequest 请求对象
     * @return CompletableFuture<ValidateConfigurationNameResponse>
     */
    public CompletableFuture<ValidateConfigurationNameResponse> validateConfigurationNameAsync(
        ValidateConfigurationNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.validateConfigurationName);
    }

    /**
     * 校验参数模板名称是否存在
     *
     * 校验参数模板名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigurationNameRequest 请求对象
     * @return AsyncInvoker<ValidateConfigurationNameRequest, ValidateConfigurationNameResponse>
     */
    public AsyncInvoker<ValidateConfigurationNameRequest, ValidateConfigurationNameResponse> validateConfigurationNameAsyncInvoker(
        ValidateConfigurationNameRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.validateConfigurationName, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, DdsMeta.showApiVersion, hcClient);
    }

}

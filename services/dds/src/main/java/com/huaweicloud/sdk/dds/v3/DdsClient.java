package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpResponse;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.dds.v3.model.CancelEipRequest;
import com.huaweicloud.sdk.dds.v3.model.CancelEipResponse;
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

public class DdsClient {

    protected HcClient hcClient;

    public DdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsClient> newBuilder() {
        ClientBuilder<DdsClient> clientBuilder = new ClientBuilder<>(DdsClient::new);
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
     * @return AddReadonlyNodeResponse
     */
    public AddReadonlyNodeResponse addReadonlyNode(AddReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.addReadonlyNode);
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddReadonlyNodeRequest 请求对象
     * @return SyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>
     */
    public SyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse> addReadonlyNodeInvoker(
        AddReadonlyNodeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.addReadonlyNode, hcClient);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddShardingNodeRequest 请求对象
     * @return AddShardingNodeResponse
     */
    public AddShardingNodeResponse addShardingNode(AddShardingNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddShardingNodeRequest 请求对象
     * @return SyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>
     */
    public SyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNodeInvoker(
        AddShardingNodeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.addShardingNode, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.attachEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<>(request, DdsMeta.attachEip, hcClient);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternalIpRequest 请求对象
     * @return AttachInternalIpResponse
     */
    public AttachInternalIpResponse attachInternalIp(AttachInternalIpRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.attachInternalIp);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInternalIpRequest 请求对象
     * @return SyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>
     */
    public SyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIpInvoker(
        AttachInternalIpRequest request) {
        return new SyncInvoker<>(request, DdsMeta.attachInternalIp, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.batchTagAction, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelEipRequest 请求对象
     * @return CancelEipResponse
     */
    public CancelEipResponse cancelEip(CancelEipRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.cancelEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelEipRequest 请求对象
     * @return SyncInvoker<CancelEipRequest, CancelEipResponse>
     */
    public SyncInvoker<CancelEipRequest, CancelEipResponse> cancelEipInvoker(CancelEipRequest request) {
        return new SyncInvoker<>(request, DdsMeta.cancelEip, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return ChangeOpsWindowResponse
     */
    public ChangeOpsWindowResponse changeOpsWindow(ChangeOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(
        ChangeOpsWindowRequest request) {
        return new SyncInvoker<>(request, DdsMeta.changeOpsWindow, hcClient);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPasswordRequest 请求对象
     * @return CheckPasswordResponse
     */
    public CheckPasswordResponse checkPassword(CheckPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.checkPassword);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPasswordRequest 请求对象
     * @return SyncInvoker<CheckPasswordRequest, CheckPasswordResponse>
     */
    public SyncInvoker<CheckPasswordRequest, CheckPasswordResponse> checkPasswordInvoker(CheckPasswordRequest request) {
        return new SyncInvoker<>(request, DdsMeta.checkPassword, hcClient);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeakPasswordRequest 请求对象
     * @return CheckWeakPasswordResponse
     */
    public CheckWeakPasswordResponse checkWeakPassword(CheckWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.checkWeakPassword);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeakPasswordRequest 请求对象
     * @return SyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>
     */
    public SyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse> checkWeakPasswordInvoker(
        CheckWeakPasswordRequest request) {
        return new SyncInvoker<>(request, DdsMeta.checkWeakPassword, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return CompareConfigurationResponse
     */
    public CompareConfigurationResponse compareConfiguration(CompareConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationInvoker(
        CompareConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse
     */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createConfiguration, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRoleRequest 请求对象
     * @return CreateDatabaseRoleResponse
     */
    public CreateDatabaseRoleResponse createDatabaseRole(CreateDatabaseRoleRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createDatabaseRole);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRoleRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>
     */
    public SyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRoleInvoker(
        CreateDatabaseRoleRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createDatabaseRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return CreateDatabaseUserResponse
     */
    public CreateDatabaseUserResponse createDatabaseUser(CreateDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserInvoker(
        CreateDatabaseUserRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createInstance, hcClient);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpRequest 请求对象
     * @return CreateIpResponse
     */
    public CreateIpResponse createIp(CreateIpRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createIp);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpRequest 请求对象
     * @return SyncInvoker<CreateIpRequest, CreateIpResponse>
     */
    public SyncInvoker<CreateIpRequest, CreateIpResponse> createIpInvoker(CreateIpRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createIp, hcClient);
    }

    /**
     * 创建killOp规则
     *
     * 创建killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKillOpRuleRequest 请求对象
     * @return CreateKillOpRuleResponse
     */
    public CreateKillOpRuleResponse createKillOpRule(CreateKillOpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createKillOpRule);
    }

    /**
     * 创建killOp规则
     *
     * 创建killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKillOpRuleRequest 请求对象
     * @return SyncInvoker<CreateKillOpRuleRequest, CreateKillOpRuleResponse>
     */
    public SyncInvoker<CreateKillOpRuleRequest, CreateKillOpRuleResponse> createKillOpRuleInvoker(
        CreateKillOpRuleRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createKillOpRule, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<>(request, DdsMeta.createManualBackup, hcClient);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditLogRequest 请求对象
     * @return DeleteAuditLogResponse
     */
    public DeleteAuditLogResponse deleteAuditLog(DeleteAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteAuditLog);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAuditLogRequest 请求对象
     * @return SyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>
     */
    public SyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse> deleteAuditLogInvoker(
        DeleteAuditLogRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteAuditLog, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRoleRequest 请求对象
     * @return DeleteDatabaseRoleResponse
     */
    public DeleteDatabaseRoleResponse deleteDatabaseRole(DeleteDatabaseRoleRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteDatabaseRole);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRoleRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>
     */
    public SyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRoleInvoker(
        DeleteDatabaseRoleRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteDatabaseRole, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return DeleteDatabaseUserResponse
     */
    public DeleteDatabaseUserResponse deleteDatabaseUser(DeleteDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>
     */
    public SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUserInvoker(
        DeleteDatabaseUserRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除killOp规则
     *
     * 删除killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKillOpRuleListRequest 请求对象
     * @return DeleteKillOpRuleListResponse
     */
    public DeleteKillOpRuleListResponse deleteKillOpRuleList(DeleteKillOpRuleListRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteKillOpRuleList);
    }

    /**
     * 删除killOp规则
     *
     * 删除killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKillOpRuleListRequest 请求对象
     * @return SyncInvoker<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse>
     */
    public SyncInvoker<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse> deleteKillOpRuleListInvoker(
        DeleteKillOpRuleListRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteKillOpRuleList, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigRequest 请求对象
     * @return DeleteLtsConfigResponse
     */
    public DeleteLtsConfigResponse deleteLtsConfig(DeleteLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteLtsConfig);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigRequest 请求对象
     * @return SyncInvoker<DeleteLtsConfigRequest, DeleteLtsConfigResponse>
     */
    public SyncInvoker<DeleteLtsConfigRequest, DeleteLtsConfigResponse> deleteLtsConfigInvoker(
        DeleteLtsConfigRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteLtsConfig, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除只读节点
     *
     * 当副本集添加了只读节点后，需要删除对应的只读节点需要调用此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodeRequest 请求对象
     * @return DeleteReadonlyNodeResponse
     */
    public DeleteReadonlyNodeResponse deleteReadonlyNode(DeleteReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteReadonlyNode);
    }

    /**
     * 删除只读节点
     *
     * 当副本集添加了只读节点后，需要删除对应的只读节点需要调用此API。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodeRequest 请求对象
     * @return SyncInvoker<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse>
     */
    public SyncInvoker<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse> deleteReadonlyNodeInvoker(
        DeleteReadonlyNodeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteReadonlyNode, hcClient);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteSession);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSessionRequest 请求对象
     * @return SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public SyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionInvoker(DeleteSessionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.deleteSession, hcClient);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadErrorlogRequest 请求对象
     * @return DownloadErrorlogResponse
     */
    public DownloadErrorlogResponse downloadErrorlog(DownloadErrorlogRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.downloadErrorlog);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadErrorlogRequest 请求对象
     * @return SyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>
     */
    public SyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlogInvoker(
        DownloadErrorlogRequest request) {
        return new SyncInvoker<>(request, DdsMeta.downloadErrorlog, hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return DownloadSlowlogResponse
     */
    public DownloadSlowlogResponse downloadSlowlog(DownloadSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(
        DownloadSlowlogRequest request) {
        return new SyncInvoker<>(request, DdsMeta.downloadSlowlog, hcClient);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicasetNodeRequest 请求对象
     * @return ExpandReplicasetNodeResponse
     */
    public ExpandReplicasetNodeResponse expandReplicasetNode(ExpandReplicasetNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.expandReplicasetNode);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandReplicasetNodeRequest 请求对象
     * @return SyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>
     */
    public SyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> expandReplicasetNodeInvoker(
        ExpandReplicasetNodeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.expandReplicasetNode, hcClient);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedInstancesRequest 请求对象
     * @return ListAppliedInstancesResponse
     */
    public ListAppliedInstancesResponse listAppliedInstances(ListAppliedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listAppliedInstances);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedInstancesRequest 请求对象
     * @return SyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>
     */
    public SyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse> listAppliedInstancesInvoker(
        ListAppliedInstancesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listAppliedInstances, hcClient);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogLinksRequest 请求对象
     * @return ListAuditlogLinksResponse
     */
    public ListAuditlogLinksResponse listAuditlogLinks(ListAuditlogLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listAuditlogLinks);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogLinksRequest 请求对象
     * @return SyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>
     */
    public SyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinksInvoker(
        ListAuditlogLinksRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listAuditlogLinks, hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return ListAuditlogsResponse
     */
    public ListAuditlogsResponse listAuditlogs(ListAuditlogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAz2MigrateRequest 请求对象
     * @return ListAz2MigrateResponse
     */
    public ListAz2MigrateResponse listAz2Migrate(ListAz2MigrateRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listAz2Migrate);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAz2MigrateRequest 请求对象
     * @return SyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>
     */
    public SyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2MigrateInvoker(
        ListAz2MigrateRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listAz2Migrate, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listBackups, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return ListDatabaseRolesResponse
     */
    public ListDatabaseRolesResponse listDatabaseRoles(ListDatabaseRolesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesInvoker(
        ListDatabaseRolesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listDatabaseRoles, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return ListDatabaseUsersResponse
     */
    public ListDatabaseUsersResponse listDatabaseUsers(ListDatabaseUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatabaseUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUsersRequest 请求对象
     * @return SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersInvoker(
        ListDatabaseUsersRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listDatabaseUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoreVersionsRequest 请求对象
     * @return ListDatastoreVersionsResponse
     */
    public ListDatastoreVersionsResponse listDatastoreVersions(ListDatastoreVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoreVersionsRequest 请求对象
     * @return SyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>
     */
    public SyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersionsInvoker(
        ListDatastoreVersionsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listDatastoreVersions, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return ListErrorLogsResponse
     */
    public ListErrorLogsResponse listErrorLogs(ListErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return ListFlavorInfosResponse
     */
    public ListFlavorInfosResponse listFlavorInfos(ListFlavorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosInvoker(
        ListFlavorInfosRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return ListInstancesByTagsResponse
     */
    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsInvoker(
        ListInstancesByTagsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 查询LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return ListLtsConfigsResponse
     */
    public ListLtsConfigsResponse listLtsConfigs(ListLtsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listLtsConfigs);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 查询LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsInvoker(
        ListLtsConfigsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listLtsConfigs, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogsRequest 请求对象
     * @return ListLtsErrorLogsResponse
     */
    public ListLtsErrorLogsResponse listLtsErrorLogs(ListLtsErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listLtsErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogsRequest 请求对象
     * @return SyncInvoker<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse>
     */
    public SyncInvoker<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse> listLtsErrorLogsInvoker(
        ListLtsErrorLogsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listLtsErrorLogs, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowLogsRequest 请求对象
     * @return ListLtsSlowLogsResponse
     */
    public ListLtsSlowLogsResponse listLtsSlowLogs(ListLtsSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listLtsSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowLogsRequest 请求对象
     * @return SyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>
     */
    public SyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> listLtsSlowLogsInvoker(
        ListLtsSlowLogsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listLtsSlowLogs, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listRecycleInstances, hcClient);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreCollectionsRequest 请求对象
     * @return ListRestoreCollectionsResponse
     */
    public ListRestoreCollectionsResponse listRestoreCollections(ListRestoreCollectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listRestoreCollections);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreCollectionsRequest 请求对象
     * @return SyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>
     */
    public SyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollectionsInvoker(
        ListRestoreCollectionsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listRestoreCollections, hcClient);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return ListRestoreDatabasesResponse
     */
    public ListRestoreDatabasesResponse listRestoreDatabases(ListRestoreDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listRestoreDatabases);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesInvoker(
        ListRestoreDatabasesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return ListRestoreTimesResponse
     */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessions(ListSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listSessions);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return SyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public SyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsInvoker(ListSessionsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listSessions, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadAddressRequest 请求对象
     * @return ListSslCertDownloadAddressResponse
     */
    public ListSslCertDownloadAddressResponse listSslCertDownloadAddress(ListSslCertDownloadAddressRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listSslCertDownloadAddress);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadAddressRequest 请求对象
     * @return SyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>
     */
    public SyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> listSslCertDownloadAddressInvoker(
        ListSslCertDownloadAddressRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listSslCertDownloadAddress, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypeRequest 请求对象
     * @return ListStorageTypeResponse
     */
    public ListStorageTypeResponse listStorageType(ListStorageTypeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listStorageType);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypeRequest 请求对象
     * @return SyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>
     */
    public SyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse> listStorageTypeInvoker(
        ListStorageTypeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listStorageType, hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listTasks);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listTasks, hcClient);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateAzRequest 请求对象
     * @return MigrateAzResponse
     */
    public MigrateAzResponse migrateAz(MigrateAzRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.migrateAz);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateAzRequest 请求对象
     * @return SyncInvoker<MigrateAzRequest, MigrateAzResponse>
     */
    public SyncInvoker<MigrateAzRequest, MigrateAzResponse> migrateAzInvoker(MigrateAzRequest request) {
        return new SyncInvoker<>(request, DdsMeta.migrateAz, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return ResetConfigurationResponse
     */
    public ResetConfigurationResponse resetConfiguration(ResetConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationInvoker(
        ResetConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.resetConfiguration, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resetPassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, DdsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return ResizeInstanceVolumeResponse
     */
    public ResizeInstanceVolumeResponse resizeInstanceVolume(ResizeInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeInvoker(
        ResizeInstanceVolumeRequest request) {
        return new SyncInvoker<>(request, DdsMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restoreInstance);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(
        RestoreInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.restoreInstance, hcClient);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceFromCollectionRequest 请求对象
     * @return RestoreInstanceFromCollectionResponse
     */
    public RestoreInstanceFromCollectionResponse restoreInstanceFromCollection(
        RestoreInstanceFromCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restoreInstanceFromCollection);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceFromCollectionRequest 请求对象
     * @return SyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>
     */
    public SyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionInvoker(
        RestoreInstanceFromCollectionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.restoreInstanceFromCollection, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreNewInstanceRequest 请求对象
     * @return RestoreNewInstanceResponse
     */
    public RestoreNewInstanceResponse restoreNewInstance(RestoreNewInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restoreNewInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreNewInstanceRequest 请求对象
     * @return SyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>
     */
    public SyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstanceInvoker(
        RestoreNewInstanceRequest request) {
        return new SyncInvoker<>(request, DdsMeta.restoreNewInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return SetAuditlogPolicyResponse
     */
    public SetAuditlogPolicyResponse setAuditlogPolicy(SetAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(
        SetAuditlogPolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerSwitchRequest 请求对象
     * @return SetBalancerSwitchResponse
     */
    public SetBalancerSwitchResponse setBalancerSwitch(SetBalancerSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setBalancerSwitch);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerSwitchRequest 请求对象
     * @return SyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>
     */
    public SyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitchInvoker(
        SetBalancerSwitchRequest request) {
        return new SyncInvoker<>(request, DdsMeta.setBalancerSwitch, hcClient);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerWindowRequest 请求对象
     * @return SetBalancerWindowResponse
     */
    public SetBalancerWindowResponse setBalancerWindow(SetBalancerWindowRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setBalancerWindow);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBalancerWindowRequest 请求对象
     * @return SyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>
     */
    public SyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindowInvoker(
        SetBalancerWindowRequest request) {
        return new SyncInvoker<>(request, DdsMeta.setBalancerWindow, hcClient);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SetRecyclePolicyResponse
     */
    public SetRecyclePolicyResponse setRecyclePolicy(SetRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setRecyclePolicy);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return ShowAuditlogPolicyResponse
     */
    public ShowAuditlogPolicyResponse showAuditlogPolicy(ShowAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(
        ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return ShowBackupDownloadLinkResponse
     */
    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询副本集跨网段访问配置
     *
     * 查询副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientNetworkRequest 请求对象
     * @return ShowClientNetworkResponse
     */
    public ShowClientNetworkResponse showClientNetwork(ShowClientNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showClientNetwork);
    }

    /**
     * 查询副本集跨网段访问配置
     *
     * 查询副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClientNetworkRequest 请求对象
     * @return SyncInvoker<ShowClientNetworkRequest, ShowClientNetworkResponse>
     */
    public SyncInvoker<ShowClientNetworkRequest, ShowClientNetworkResponse> showClientNetworkInvoker(
        ShowClientNetworkRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showClientNetwork, hcClient);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAppliedHistoryRequest 请求对象
     * @return ShowConfigurationAppliedHistoryResponse
     */
    public ShowConfigurationAppliedHistoryResponse showConfigurationAppliedHistory(
        ShowConfigurationAppliedHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showConfigurationAppliedHistory);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationAppliedHistoryRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>
     */
    public SyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryInvoker(
        ShowConfigurationAppliedHistoryRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showConfigurationAppliedHistory, hcClient);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationModifyHistoryRequest 请求对象
     * @return ShowConfigurationModifyHistoryResponse
     */
    public ShowConfigurationModifyHistoryResponse showConfigurationModifyHistory(
        ShowConfigurationModifyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showConfigurationModifyHistory);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationModifyHistoryRequest 请求对象
     * @return SyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>
     */
    public SyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryInvoker(
        ShowConfigurationModifyHistoryRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showConfigurationModifyHistory, hcClient);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationParameterRequest 请求对象
     * @return ShowConfigurationParameterResponse
     */
    public ShowConfigurationParameterResponse showConfigurationParameter(ShowConfigurationParameterRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showConfigurationParameter);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationParameterRequest 请求对象
     * @return SyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>
     */
    public SyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> showConfigurationParameterInvoker(
        ShowConfigurationParameterRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showConfigurationParameter, hcClient);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionStatisticsRequest 请求对象
     * @return ShowConnectionStatisticsResponse
     */
    public ShowConnectionStatisticsResponse showConnectionStatistics(ShowConnectionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showConnectionStatistics);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionStatisticsRequest 请求对象
     * @return SyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>
     */
    public SyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatisticsInvoker(
        ShowConnectionStatisticsRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showConnectionStatistics, hcClient);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiskUsageRequest 请求对象
     * @return ShowDiskUsageResponse
     */
    public ShowDiskUsageResponse showDiskUsage(ShowDiskUsageRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showDiskUsage);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiskUsageRequest 请求对象
     * @return SyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>
     */
    public SyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse> showDiskUsageInvoker(ShowDiskUsageRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showDiskUsage, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityConfigurationRequest 请求对象
     * @return ShowEntityConfigurationResponse
     */
    public ShowEntityConfigurationResponse showEntityConfiguration(ShowEntityConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showEntityConfiguration);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEntityConfigurationRequest 请求对象
     * @return SyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>
     */
    public SyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> showEntityConfigurationInvoker(
        ShowEntityConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showEntityConfiguration, hcClient);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showJobDetail);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showJobDetail, hcClient);
    }

    /**
     * 获取killOp规则列表
     *
     * 获取killOp规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillOpRuleRuleListRequest 请求对象
     * @return ShowKillOpRuleRuleListResponse
     */
    public ShowKillOpRuleRuleListResponse showKillOpRuleRuleList(ShowKillOpRuleRuleListRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showKillOpRuleRuleList);
    }

    /**
     * 获取killOp规则列表
     *
     * 获取killOp规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillOpRuleRuleListRequest 请求对象
     * @return SyncInvoker<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse>
     */
    public SyncInvoker<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse> showKillOpRuleRuleListInvoker(
        ShowKillOpRuleRuleListRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showKillOpRuleRuleList, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showRecyclePolicy);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplSetNameRequest 请求对象
     * @return ShowReplSetNameResponse
     */
    public ShowReplSetNameResponse showReplSetName(ShowReplSetNameRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showReplSetName);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplSetNameRequest 请求对象
     * @return SyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>
     */
    public SyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse> showReplSetNameInvoker(
        ShowReplSetNameRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showReplSetName, hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return ShowSecondLevelMonitoringStatusResponse
     */
    public ShowSecondLevelMonitoringStatusResponse showSecondLevelMonitoringStatus(
        ShowSecondLevelMonitoringStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showSecondLevelMonitoringStatus);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardingBalancerRequest 请求对象
     * @return ShowShardingBalancerResponse
     */
    public ShowShardingBalancerResponse showShardingBalancer(ShowShardingBalancerRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showShardingBalancer);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardingBalancerRequest 请求对象
     * @return SyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>
     */
    public SyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancerInvoker(
        ShowShardingBalancerRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showShardingBalancer, hcClient);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return ShowSlowlogDesensitizationSwitchResponse
     */
    public ShowSlowlogDesensitizationSwitchResponse showSlowlogDesensitizationSwitch(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showSlowlogDesensitizationSwitch);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return SyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>
     */
    public SyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchInvoker(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showSlowlogDesensitizationSwitch, hcClient);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDurationRequest 请求对象
     * @return ShowUpgradeDurationResponse
     */
    public ShowUpgradeDurationResponse showUpgradeDuration(ShowUpgradeDurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showUpgradeDuration);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDurationRequest 请求对象
     * @return SyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>
     */
    public SyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> showUpgradeDurationInvoker(
        ShowUpgradeDurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showUpgradeDuration, hcClient);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return ShrinkInstanceNodesResponse
     */
    public ShrinkInstanceNodesResponse shrinkInstanceNodes(ShrinkInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.shrinkInstanceNodes);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesInvoker(
        ShrinkInstanceNodesRequest request) {
        return new SyncInvoker<>(request, DdsMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return StopBackupResponse
     */
    public StopBackupResponse stopBackup(StopBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return SyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public SyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupInvoker(StopBackupRequest request) {
        return new SyncInvoker<>(request, DdsMeta.stopBackup, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SwitchConfigurationResponse
     */
    public SwitchConfigurationResponse switchConfiguration(SwitchConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationInvoker(
        SwitchConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchConfiguration, hcClient);
    }

    /**
     * 强制备节点升主
     *
     * 支持副本集、shard和config备节点强制升主。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInstancePrimaryRequest 请求对象
     * @return SwitchInstancePrimaryResponse
     */
    public SwitchInstancePrimaryResponse switchInstancePrimary(SwitchInstancePrimaryRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchInstancePrimary);
    }

    /**
     * 强制备节点升主
     *
     * 支持副本集、shard和config备节点强制升主。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchInstancePrimaryRequest 请求对象
     * @return SyncInvoker<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse>
     */
    public SyncInvoker<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse> switchInstancePrimaryInvoker(
        SwitchInstancePrimaryRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchInstancePrimary, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return SwitchSecondLevelMonitoringResponse
     */
    public SwitchSecondLevelMonitoringResponse switchSecondLevelMonitoring(SwitchSecondLevelMonitoringRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchSecondLevelMonitoring);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return SwitchSlowlogDesensitizationResponse
     */
    public SwitchSlowlogDesensitizationResponse switchSlowlogDesensitization(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchSsl);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchSsl, hcClient);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverReplicaSetRequest 请求对象
     * @return SwitchoverReplicaSetResponse
     */
    public SwitchoverReplicaSetResponse switchoverReplicaSet(SwitchoverReplicaSetRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.switchoverReplicaSet);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchoverReplicaSetRequest 请求对象
     * @return SyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>
     */
    public SyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSetInvoker(
        SwitchoverReplicaSetRequest request) {
        return new SyncInvoker<>(request, DdsMeta.switchoverReplicaSet, hcClient);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return UpdateClientNetworkResponse
     */
    public UpdateClientNetworkResponse updateClientNetwork(UpdateClientNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateClientNetwork);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkInvoker(
        UpdateClientNetworkRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationParameterRequest 请求对象
     * @return UpdateConfigurationParameterResponse
     */
    public UpdateConfigurationParameterResponse updateConfigurationParameter(
        UpdateConfigurationParameterRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateConfigurationParameter);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationParameterRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>
     */
    public SyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> updateConfigurationParameterInvoker(
        UpdateConfigurationParameterRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateConfigurationParameter, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEntityConfigurationRequest 请求对象
     * @return UpdateEntityConfigurationResponse
     */
    public UpdateEntityConfigurationResponse updateEntityConfiguration(UpdateEntityConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateEntityConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEntityConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>
     */
    public SyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> updateEntityConfigurationInvoker(
        UpdateEntityConfigurationRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateEntityConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return UpdateInstancePortResponse
     */
    public UpdateInstancePortResponse updateInstancePort(UpdateInstancePortRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateInstancePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortInvoker(
        UpdateInstancePortRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRemarkRequest 请求对象
     * @return UpdateInstanceRemarkResponse
     */
    public UpdateInstanceRemarkResponse updateInstanceRemark(UpdateInstanceRemarkRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateInstanceRemark);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRemarkRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>
     */
    public SyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> updateInstanceRemarkInvoker(
        UpdateInstanceRemarkRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateInstanceRemark, hcClient);
    }

    /**
     * 启用/禁用killOp规则
     *
     * 启用/禁用killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKillOpRuleRequest 请求对象
     * @return UpdateKillOpRuleResponse
     */
    public UpdateKillOpRuleResponse updateKillOpRule(UpdateKillOpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateKillOpRule);
    }

    /**
     * 启用/禁用killOp规则
     *
     * 启用/禁用killOp规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKillOpRuleRequest 请求对象
     * @return SyncInvoker<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse>
     */
    public SyncInvoker<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse> updateKillOpRuleInvoker(
        UpdateKillOpRuleRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateKillOpRule, hcClient);
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
     * @return UpdateLtsConfigResponse
     */
    public UpdateLtsConfigResponse updateLtsConfig(UpdateLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateLtsConfig);
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
     * @return SyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse>
     */
    public SyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse> updateLtsConfigInvoker(
        UpdateLtsConfigRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateLtsConfig, hcClient);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplSetNameRequest 请求对象
     * @return UpdateReplSetNameResponse
     */
    public UpdateReplSetNameResponse updateReplSetName(UpdateReplSetNameRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateReplSetName);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReplSetNameRequest 请求对象
     * @return SyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>
     */
    public SyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse> updateReplSetNameInvoker(
        UpdateReplSetNameRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateReplSetName, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DdsMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDatabaseVersionRequest 请求对象
     * @return UpgradeDatabaseVersionResponse
     */
    public UpgradeDatabaseVersionResponse upgradeDatabaseVersion(UpgradeDatabaseVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.upgradeDatabaseVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDatabaseVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>
     */
    public SyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> upgradeDatabaseVersionInvoker(
        UpgradeDatabaseVersionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.upgradeDatabaseVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, DdsMeta.showApiVersion, hcClient);
    }

}

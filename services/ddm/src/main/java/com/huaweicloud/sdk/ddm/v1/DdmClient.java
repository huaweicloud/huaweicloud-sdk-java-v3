package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ddm.v1.model.BatchDeleteNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.BatchDeleteNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.BatchModifyReadWriteStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.BatchModifyReadWriteStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.BindEipRequest;
import com.huaweicloud.sdk.ddm.v1.model.BindEipResponse;
import com.huaweicloud.sdk.ddm.v1.model.CancelMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CancelMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.ChangeStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.ChangeStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.CheckDataNodeConnectionRequest;
import com.huaweicloud.sdk.ddm.v1.model.CheckDataNodeConnectionResponse;
import com.huaweicloud.sdk.ddm.v1.model.CheckMigrateLogicDbRequest;
import com.huaweicloud.sdk.ddm.v1.model.CheckMigrateLogicDbResponse;
import com.huaweicloud.sdk.ddm.v1.model.CheckPreliminaryResultsRequest;
import com.huaweicloud.sdk.ddm.v1.model.CheckPreliminaryResultsResponse;
import com.huaweicloud.sdk.ddm.v1.model.CleanMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CleanMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.CompareParameterGroupsRequest;
import com.huaweicloud.sdk.ddm.v1.model.CompareParameterGroupsResponse;
import com.huaweicloud.sdk.ddm.v1.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmConfigurationsRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmConfigurationsResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDdmInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteBackupRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteBackupResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.DownloadSchemaMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.DownloadSchemaMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExecuteKillPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExpandDdmInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExpandDdmInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ExpandInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListApiVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListApiVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsForMigrateRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsForMigrateResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListBackupsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListBackupsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListConfigurationApplyHistoriesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListConfigurationApplyHistoriesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmConfigurationsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmConfigurationsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesConfigurationsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesConfigurationsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogAnalysisRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogAnalysisResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSqlBlackRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSqlBlackResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.MigrateLogicDbRequest;
import com.huaweicloud.sdk.ddm.v1.model.MigrateLogicDbResponse;
import com.huaweicloud.sdk.ddm.v1.model.MigrateResultsRequest;
import com.huaweicloud.sdk.ddm.v1.model.MigrateResultsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ModifyConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.ModifyConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ModifyEipRequest;
import com.huaweicloud.sdk.ddm.v1.model.ModifyEipResponse;
import com.huaweicloud.sdk.ddm.v1.model.ModifySqlBlackListRequest;
import com.huaweicloud.sdk.ddm.v1.model.ModifySqlBlackListResponse;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigRequest;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetParameterGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetParameterGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestartDdmInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestartDdmInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestartNodeRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestartNodeResponse;
import com.huaweicloud.sdk.ddm.v1.model.Restore2ExistRequest;
import com.huaweicloud.sdk.ddm.v1.model.Restore2ExistResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestoreMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestoreMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.RetryMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.RetryMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.RollbackMigrationRequest;
import com.huaweicloud.sdk.ddm.v1.model.RollbackMigrationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleDdmsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleDdmsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleRdsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleRdsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleTimeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowAvalibleTimeResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowBackupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowBackupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmDetailRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmDetailResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmJobResultRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmJobResultResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmNodeDetailRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDdmNodeDetailResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowMigrationLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowMigrationLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowPublicIpRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowPublicIpResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowRelatedDnsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowRelatedDnsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowRiskInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowRiskInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.SwitchIpGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchIpGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.SwitchRouteRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchRouteResponse;
import com.huaweicloud.sdk.ddm.v1.model.SwitchSslRequest;
import com.huaweicloud.sdk.ddm.v1.model.SwitchSslResponse;
import com.huaweicloud.sdk.ddm.v1.model.SyncDnInformationRequest;
import com.huaweicloud.sdk.ddm.v1.model.SyncDnInformationResponse;
import com.huaweicloud.sdk.ddm.v1.model.UnbindEipRequest;
import com.huaweicloud.sdk.ddm.v1.model.UnbindEipResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstancePortRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstancePortResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.ddm.v1.model.UploadSchemaMetadataRequest;
import com.huaweicloud.sdk.ddm.v1.model.UploadSchemaMetadataResponse;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ValidateWeakPasswordResponse;

public class DdmClient {

    protected HcClient hcClient;

    public DdmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdmClient> newBuilder() {
        ClientBuilder<DdmClient> clientBuilder = new ClientBuilder<>(DdmClient::new);
        return clientBuilder;
    }

    /**
     * 变更内核版本
     *
     * 变更内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDatabaseVersionRequest 请求对象
     * @return ChangeDatabaseVersionResponse
     */
    public ChangeDatabaseVersionResponse changeDatabaseVersion(ChangeDatabaseVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.changeDatabaseVersion);
    }

    /**
     * 变更内核版本
     *
     * 变更内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDatabaseVersionRequest 请求对象
     * @return SyncInvoker<ChangeDatabaseVersionRequest, ChangeDatabaseVersionResponse>
     */
    public SyncInvoker<ChangeDatabaseVersionRequest, ChangeDatabaseVersionResponse> changeDatabaseVersionInvoker(
        ChangeDatabaseVersionRequest request) {
        return new SyncInvoker<>(request, DdmMeta.changeDatabaseVersion, hcClient);
    }

    /**
     * 创建参数组
     *
     * 创建参数组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmConfigurationsRequest 请求对象
     * @return CreateDdmConfigurationsResponse
     */
    public CreateDdmConfigurationsResponse createDdmConfigurations(CreateDdmConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createDdmConfigurations);
    }

    /**
     * 创建参数组
     *
     * 创建参数组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmConfigurationsRequest 请求对象
     * @return SyncInvoker<CreateDdmConfigurationsRequest, CreateDdmConfigurationsResponse>
     */
    public SyncInvoker<CreateDdmConfigurationsRequest, CreateDdmConfigurationsResponse> createDdmConfigurationsInvoker(
        CreateDdmConfigurationsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createDdmConfigurations, hcClient);
    }

    /**
     * 删除参数组
     *
     * 删除参数组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteConfiguration);
    }

    /**
     * 删除参数组
     *
     * 删除参数组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteConfiguration, hcClient);
    }

    /**
     * 查询可变更内核版本
     *
     * 查询可变更内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseAvailableVersionsRequest 请求对象
     * @return ListDatabaseAvailableVersionsResponse
     */
    public ListDatabaseAvailableVersionsResponse listDatabaseAvailableVersions(
        ListDatabaseAvailableVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDatabaseAvailableVersions);
    }

    /**
     * 查询可变更内核版本
     *
     * 查询可变更内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseAvailableVersionsRequest 请求对象
     * @return SyncInvoker<ListDatabaseAvailableVersionsRequest, ListDatabaseAvailableVersionsResponse>
     */
    public SyncInvoker<ListDatabaseAvailableVersionsRequest, ListDatabaseAvailableVersionsResponse> listDatabaseAvailableVersionsInvoker(
        ListDatabaseAvailableVersionsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDatabaseAvailableVersions, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有DDM的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmConfigurationsRequest 请求对象
     * @return ListDdmConfigurationsResponse
     */
    public ListDdmConfigurationsResponse listDdmConfigurations(ListDdmConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDdmConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有DDM的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmConfigurationsRequest 请求对象
     * @return SyncInvoker<ListDdmConfigurationsRequest, ListDdmConfigurationsResponse>
     */
    public SyncInvoker<ListDdmConfigurationsRequest, ListDdmConfigurationsResponse> listDdmConfigurationsInvoker(
        ListDdmConfigurationsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDdmConfigurations, hcClient);
    }

    /**
     * 修改实例参数
     *
     * 修改实例参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConfigurationRequest 请求对象
     * @return ModifyConfigurationResponse
     */
    public ModifyConfigurationResponse modifyConfiguration(ModifyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.modifyConfiguration);
    }

    /**
     * 修改实例参数
     *
     * 修改实例参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyConfigurationRequest 请求对象
     * @return SyncInvoker<ModifyConfigurationRequest, ModifyConfigurationResponse>
     */
    public SyncInvoker<ModifyConfigurationRequest, ModifyConfigurationResponse> modifyConfigurationInvoker(
        ModifyConfigurationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.modifyConfiguration, hcClient);
    }

    /**
     * 回滚内核版本
     *
     * 回滚内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollBackDatabaseVersionRequest 请求对象
     * @return RollBackDatabaseVersionResponse
     */
    public RollBackDatabaseVersionResponse rollBackDatabaseVersion(RollBackDatabaseVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.rollBackDatabaseVersion);
    }

    /**
     * 回滚内核版本
     *
     * 回滚内核版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollBackDatabaseVersionRequest 请求对象
     * @return SyncInvoker<RollBackDatabaseVersionRequest, RollBackDatabaseVersionResponse>
     */
    public SyncInvoker<RollBackDatabaseVersionRequest, RollBackDatabaseVersionResponse> rollBackDatabaseVersionInvoker(
        RollBackDatabaseVersionRequest request) {
        return new SyncInvoker<>(request, DdmMeta.rollBackDatabaseVersion, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return ShowConfigurationResponse
     */
    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(
        ShowConfigurationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showConfiguration, hcClient);
    }

    /**
     * 内核版本风险提醒
     *
     * 内核版本风险提醒
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskInfoRequest 请求对象
     * @return ShowRiskInfoResponse
     */
    public ShowRiskInfoResponse showRiskInfo(ShowRiskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showRiskInfo);
    }

    /**
     * 内核版本风险提醒
     *
     * 内核版本风险提醒
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskInfoRequest 请求对象
     * @return SyncInvoker<ShowRiskInfoRequest, ShowRiskInfoResponse>
     */
    public SyncInvoker<ShowRiskInfoRequest, ShowRiskInfoResponse> showRiskInfoInvoker(ShowRiskInfoRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showRiskInfo, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listApiVersion);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listApiVersion, hcClient);
    }

    /**
     * 批量删除实例的节点
     *
     * 批量删除实例的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNodesRequest 请求对象
     * @return BatchDeleteNodesResponse
     */
    public BatchDeleteNodesResponse batchDeleteNodes(BatchDeleteNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.batchDeleteNodes);
    }

    /**
     * 批量删除实例的节点
     *
     * 批量删除实例的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteNodesRequest 请求对象
     * @return SyncInvoker<BatchDeleteNodesRequest, BatchDeleteNodesResponse>
     */
    public SyncInvoker<BatchDeleteNodesRequest, BatchDeleteNodesResponse> batchDeleteNodesInvoker(
        BatchDeleteNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.batchDeleteNodes, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindEipRequest 请求对象
     * @return BindEipResponse
     */
    public BindEipResponse bindEip(BindEipRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.bindEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 绑定弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindEipRequest 请求对象
     * @return SyncInvoker<BindEipRequest, BindEipResponse>
     */
    public SyncInvoker<BindEipRequest, BindEipResponse> bindEipInvoker(BindEipRequest request) {
        return new SyncInvoker<>(request, DdmMeta.bindEip, hcClient);
    }

    /**
     * 取消分片变更
     *
     * 取消分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMigrationRequest 请求对象
     * @return CancelMigrationResponse
     */
    public CancelMigrationResponse cancelMigration(CancelMigrationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.cancelMigration);
    }

    /**
     * 取消分片变更
     *
     * 取消分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMigrationRequest 请求对象
     * @return SyncInvoker<CancelMigrationRequest, CancelMigrationResponse>
     */
    public SyncInvoker<CancelMigrationRequest, CancelMigrationResponse> cancelMigrationInvoker(
        CancelMigrationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.cancelMigration, hcClient);
    }

    /**
     * 修改切换路由策略
     *
     * 修改切换路由策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeStrategyRequest 请求对象
     * @return ChangeStrategyResponse
     */
    public ChangeStrategyResponse changeStrategy(ChangeStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.changeStrategy);
    }

    /**
     * 修改切换路由策略
     *
     * 修改切换路由策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeStrategyRequest 请求对象
     * @return SyncInvoker<ChangeStrategyRequest, ChangeStrategyResponse>
     */
    public SyncInvoker<ChangeStrategyRequest, ChangeStrategyResponse> changeStrategyInvoker(
        ChangeStrategyRequest request) {
        return new SyncInvoker<>(request, DdmMeta.changeStrategy, hcClient);
    }

    /**
     * 分片变更预校验
     *
     * 分片变更预校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMigrateLogicDbRequest 请求对象
     * @return CheckMigrateLogicDbResponse
     */
    public CheckMigrateLogicDbResponse checkMigrateLogicDb(CheckMigrateLogicDbRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.checkMigrateLogicDb);
    }

    /**
     * 分片变更预校验
     *
     * 分片变更预校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMigrateLogicDbRequest 请求对象
     * @return SyncInvoker<CheckMigrateLogicDbRequest, CheckMigrateLogicDbResponse>
     */
    public SyncInvoker<CheckMigrateLogicDbRequest, CheckMigrateLogicDbResponse> checkMigrateLogicDbInvoker(
        CheckMigrateLogicDbRequest request) {
        return new SyncInvoker<>(request, DdmMeta.checkMigrateLogicDb, hcClient);
    }

    /**
     * 查询分片变更预校验异步结果
     *
     * 查询分片变更预校验异步结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPreliminaryResultsRequest 请求对象
     * @return CheckPreliminaryResultsResponse
     */
    public CheckPreliminaryResultsResponse checkPreliminaryResults(CheckPreliminaryResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.checkPreliminaryResults);
    }

    /**
     * 查询分片变更预校验异步结果
     *
     * 查询分片变更预校验异步结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPreliminaryResultsRequest 请求对象
     * @return SyncInvoker<CheckPreliminaryResultsRequest, CheckPreliminaryResultsResponse>
     */
    public SyncInvoker<CheckPreliminaryResultsRequest, CheckPreliminaryResultsResponse> checkPreliminaryResultsInvoker(
        CheckPreliminaryResultsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.checkPreliminaryResults, hcClient);
    }

    /**
     * 清理分片变更
     *
     * 清理分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanMigrationRequest 请求对象
     * @return CleanMigrationResponse
     */
    public CleanMigrationResponse cleanMigration(CleanMigrationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.cleanMigration);
    }

    /**
     * 清理分片变更
     *
     * 清理分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanMigrationRequest 请求对象
     * @return SyncInvoker<CleanMigrationRequest, CleanMigrationResponse>
     */
    public SyncInvoker<CleanMigrationRequest, CleanMigrationResponse> cleanMigrationInvoker(
        CleanMigrationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.cleanMigration, hcClient);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createDatabase);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createDatabase, hcClient);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmDatabaseRequest 请求对象
     * @return CreateDdmDatabaseResponse
     */
    public CreateDdmDatabaseResponse createDdmDatabase(CreateDdmDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createDdmDatabase);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDdmDatabaseRequest, CreateDdmDatabaseResponse>
     */
    public SyncInvoker<CreateDdmDatabaseRequest, CreateDdmDatabaseResponse> createDdmDatabaseInvoker(
        CreateDdmDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createDdmDatabase, hcClient);
    }

    /**
     * 购买创建DDM实例
     *
     * 购买创建DDM实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmInstanceRequest 请求对象
     * @return CreateDdmInstanceResponse
     */
    public CreateDdmInstanceResponse createDdmInstance(CreateDdmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createDdmInstance);
    }

    /**
     * 购买创建DDM实例
     *
     * 购买创建DDM实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDdmInstanceRequest 请求对象
     * @return SyncInvoker<CreateDdmInstanceRequest, CreateDdmInstanceResponse>
     */
    public SyncInvoker<CreateDdmInstanceRequest, CreateDdmInstanceResponse> createDdmInstanceInvoker(
        CreateDdmInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createDdmInstance, hcClient);
    }

    /**
     * 创建组
     *
     * 创建组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createGroup);
    }

    /**
     * 创建组
     *
     * 创建组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createGroup, hcClient);
    }

    /**
     * 购买DDM实例
     *
     * 创建一个DDM实例。
     * 
     * DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createInstance);
    }

    /**
     * 购买DDM实例
     *
     * 创建一个DDM实例。
     * 
     * DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createInstance, hcClient);
    }

    /**
     * 创建DDM帐号
     *
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsersRequest 请求对象
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createUsers);
    }

    /**
     * 创建DDM帐号
     *
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsersRequest 请求对象
     * @return SyncInvoker<CreateUsersRequest, CreateUsersResponse>
     */
    public SyncInvoker<CreateUsersRequest, CreateUsersResponse> createUsersInvoker(CreateUsersRequest request) {
        return new SyncInvoker<>(request, DdmMeta.createUsers, hcClient);
    }

    /**
     * 删除备份
     *
     * 删除备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteBackup);
    }

    /**
     * 删除备份
     *
     * 删除备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteBackup, hcClient);
    }

    /**
     * 删除DDM逻辑库
     *
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteDatabase);
    }

    /**
     * 删除DDM逻辑库
     *
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除逻辑库
     *
     * 删除指定的逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDdmDatabaseRequest 请求对象
     * @return DeleteDdmDatabaseResponse
     */
    public DeleteDdmDatabaseResponse deleteDdmDatabase(DeleteDdmDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteDdmDatabase);
    }

    /**
     * 删除逻辑库
     *
     * 删除指定的逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDdmDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDdmDatabaseRequest, DeleteDdmDatabaseResponse>
     */
    public SyncInvoker<DeleteDdmDatabaseRequest, DeleteDdmDatabaseResponse> deleteDdmDatabaseInvoker(
        DeleteDdmDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteDdmDatabase, hcClient);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDdmInstanceRequest 请求对象
     * @return DeleteDdmInstanceResponse
     */
    public DeleteDdmInstanceResponse deleteDdmInstance(DeleteDdmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteDdmInstance);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDdmInstanceRequest 请求对象
     * @return SyncInvoker<DeleteDdmInstanceRequest, DeleteDdmInstanceResponse>
     */
    public SyncInvoker<DeleteDdmInstanceRequest, DeleteDdmInstanceResponse> deleteDdmInstanceInvoker(
        DeleteDdmInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteDdmInstance, hcClient);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteGroup);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteGroup, hcClient);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteInstance);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodesRequest 请求对象
     * @return DeleteNodesResponse
     */
    public DeleteNodesResponse deleteNodes(DeleteNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteNodes);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNodesRequest 请求对象
     * @return SyncInvoker<DeleteNodesRequest, DeleteNodesResponse>
     */
    public SyncInvoker<DeleteNodesRequest, DeleteNodesResponse> deleteNodesInvoker(DeleteNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteNodes, hcClient);
    }

    /**
     * 删除DDM帐号
     *
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteUser);
    }

    /**
     * 删除DDM帐号
     *
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, DdmMeta.deleteUser, hcClient);
    }

    /**
     * 导出逻辑库元数据
     *
     * 导出所有逻辑库物理分片在数据节点上的分布关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSchemaMetadataRequest 请求对象
     * @return DownloadSchemaMetadataResponse
     */
    public DownloadSchemaMetadataResponse downloadSchemaMetadata(DownloadSchemaMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.downloadSchemaMetadata);
    }

    /**
     * 导出逻辑库元数据
     *
     * 导出所有逻辑库物理分片在数据节点上的分布关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSchemaMetadataRequest 请求对象
     * @return SyncInvoker<DownloadSchemaMetadataRequest, DownloadSchemaMetadataResponse>
     */
    public SyncInvoker<DownloadSchemaMetadataRequest, DownloadSchemaMetadataResponse> downloadSchemaMetadataInvoker(
        DownloadSchemaMetadataRequest request) {
        return new SyncInvoker<>(request, DdmMeta.downloadSchemaMetadata, hcClient);
    }

    /**
     * kill逻辑会话
     *
     * kill逻辑会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteKillLogicalProcessesRequest 请求对象
     * @return ExecuteKillLogicalProcessesResponse
     */
    public ExecuteKillLogicalProcessesResponse executeKillLogicalProcesses(ExecuteKillLogicalProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.executeKillLogicalProcesses);
    }

    /**
     * kill逻辑会话
     *
     * kill逻辑会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteKillLogicalProcessesRequest 请求对象
     * @return SyncInvoker<ExecuteKillLogicalProcessesRequest, ExecuteKillLogicalProcessesResponse>
     */
    public SyncInvoker<ExecuteKillLogicalProcessesRequest, ExecuteKillLogicalProcessesResponse> executeKillLogicalProcessesInvoker(
        ExecuteKillLogicalProcessesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.executeKillLogicalProcesses, hcClient);
    }

    /**
     * kill物理会话
     *
     * kill物理会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteKillPhysicalProcessesRequest 请求对象
     * @return ExecuteKillPhysicalProcessesResponse
     */
    public ExecuteKillPhysicalProcessesResponse executeKillPhysicalProcesses(
        ExecuteKillPhysicalProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.executeKillPhysicalProcesses);
    }

    /**
     * kill物理会话
     *
     * kill物理会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteKillPhysicalProcessesRequest 请求对象
     * @return SyncInvoker<ExecuteKillPhysicalProcessesRequest, ExecuteKillPhysicalProcessesResponse>
     */
    public SyncInvoker<ExecuteKillPhysicalProcessesRequest, ExecuteKillPhysicalProcessesResponse> executeKillPhysicalProcessesInvoker(
        ExecuteKillPhysicalProcessesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.executeKillPhysicalProcesses, hcClient);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容，支持按需实例与包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDdmInstanceNodesRequest 请求对象
     * @return ExpandDdmInstanceNodesResponse
     */
    public ExpandDdmInstanceNodesResponse expandDdmInstanceNodes(ExpandDdmInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.expandDdmInstanceNodes);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容，支持按需实例与包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDdmInstanceNodesRequest 请求对象
     * @return SyncInvoker<ExpandDdmInstanceNodesRequest, ExpandDdmInstanceNodesResponse>
     */
    public SyncInvoker<ExpandDdmInstanceNodesRequest, ExpandDdmInstanceNodesResponse> expandDdmInstanceNodesInvoker(
        ExpandDdmInstanceNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.expandDdmInstanceNodes, hcClient);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容，支持按需实例与包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodesRequest 请求对象
     * @return ExpandInstanceNodesResponse
     */
    public ExpandInstanceNodesResponse expandInstanceNodes(ExpandInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.expandInstanceNodes);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容，支持按需实例与包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodesRequest 请求对象
     * @return SyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse>
     */
    public SyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> expandInstanceNodesInvoker(
        ExpandInstanceNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.expandInstanceNodes, hcClient);
    }

    /**
     * 查询创建逻辑库可选取的数据节点实例列表
     *
     * 查询创建逻辑库可选取的数据节点实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsRequest 请求对象
     * @return ListAvailableRdsResponse
     */
    public ListAvailableRdsResponse listAvailableRds(ListAvailableRdsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listAvailableRds);
    }

    /**
     * 查询创建逻辑库可选取的数据节点实例列表
     *
     * 查询创建逻辑库可选取的数据节点实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsRequest 请求对象
     * @return SyncInvoker<ListAvailableRdsRequest, ListAvailableRdsResponse>
     */
    public SyncInvoker<ListAvailableRdsRequest, ListAvailableRdsResponse> listAvailableRdsInvoker(
        ListAvailableRdsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listAvailableRds, hcClient);
    }

    /**
     * 查询分片变更可选取的数据节点实例列表
     *
     * 查询分片变更可选取的数据节点实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsForMigrateRequest 请求对象
     * @return ListAvailableRdsForMigrateResponse
     */
    public ListAvailableRdsForMigrateResponse listAvailableRdsForMigrate(ListAvailableRdsForMigrateRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listAvailableRdsForMigrate);
    }

    /**
     * 查询分片变更可选取的数据节点实例列表
     *
     * 查询分片变更可选取的数据节点实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsForMigrateRequest 请求对象
     * @return SyncInvoker<ListAvailableRdsForMigrateRequest, ListAvailableRdsForMigrateResponse>
     */
    public SyncInvoker<ListAvailableRdsForMigrateRequest, ListAvailableRdsForMigrateResponse> listAvailableRdsForMigrateInvoker(
        ListAvailableRdsForMigrateRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listAvailableRdsForMigrate, hcClient);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     *
     * 查询创建逻辑库可选取的数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsListRequest 请求对象
     * @return ListAvailableRdsListResponse
     */
    public ListAvailableRdsListResponse listAvailableRdsList(ListAvailableRdsListRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listAvailableRdsList);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     *
     * 查询创建逻辑库可选取的数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableRdsListRequest 请求对象
     * @return SyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse>
     */
    public SyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse> listAvailableRdsListInvoker(
        ListAvailableRdsListRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listAvailableRdsList, hcClient);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listBackups);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listBackups, hcClient);
    }

    /**
     * 查询DDM逻辑库列表
     *
     * 查询DDM逻辑库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDatabases);
    }

    /**
     * 查询DDM逻辑库列表
     *
     * 查询DDM逻辑库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDatabases, hcClient);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmEnginesRequest 请求对象
     * @return ListDdmEnginesResponse
     */
    public ListDdmEnginesResponse listDdmEngines(ListDdmEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDdmEngines);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmEnginesRequest 请求对象
     * @return SyncInvoker<ListDdmEnginesRequest, ListDdmEnginesResponse>
     */
    public SyncInvoker<ListDdmEnginesRequest, ListDdmEnginesResponse> listDdmEnginesInvoker(
        ListDdmEnginesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDdmEngines, hcClient);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmFlavorsRequest 请求对象
     * @return ListDdmFlavorsResponse
     */
    public ListDdmFlavorsResponse listDdmFlavors(ListDdmFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDdmFlavors);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmFlavorsRequest 请求对象
     * @return SyncInvoker<ListDdmFlavorsRequest, ListDdmFlavorsResponse>
     */
    public SyncInvoker<ListDdmFlavorsRequest, ListDdmFlavorsResponse> listDdmFlavorsInvoker(
        ListDdmFlavorsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDdmFlavors, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmsRequest 请求对象
     * @return ListDdmsResponse
     */
    public ListDdmsResponse listDdms(ListDdmsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDdms);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDdmsRequest 请求对象
     * @return SyncInvoker<ListDdmsRequest, ListDdmsResponse>
     */
    public SyncInvoker<ListDdmsRequest, ListDdmsResponse> listDdmsInvoker(ListDdmsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listDdms, hcClient);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return ListEnginesResponse
     */
    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listEngines);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnginesRequest 请求对象
     * @return SyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listEngines, hcClient);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listFlavors);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listFlavors, hcClient);
    }

    /**
     * 获取实例组信息列表
     *
     * 获取实例组信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRequest 请求对象
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroup(ListGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listGroup);
    }

    /**
     * 获取实例组信息列表
     *
     * 获取实例组信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRequest 请求对象
     * @return SyncInvoker<ListGroupRequest, ListGroupResponse>
     */
    public SyncInvoker<ListGroupRequest, ListGroupResponse> listGroupInvoker(ListGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listGroup, hcClient);
    }

    /**
     * 查询DDM实例列表
     *
     * 查询DDM实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listInstances);
    }

    /**
     * 查询DDM实例列表
     *
     * 查询DDM实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listInstances, hcClient);
    }

    /**
     * 查询DDM实例节点列表
     *
     * 查询DDM实例节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listNodes);
    }

    /**
     * 查询DDM实例节点列表
     *
     * 查询DDM实例节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listNodes, hcClient);
    }

    /**
     * 读写比例监控
     *
     * 查询指定时间段内在DDM实例的读写次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadWriteRatioRequest 请求对象
     * @return ListReadWriteRatioResponse
     */
    public ListReadWriteRatioResponse listReadWriteRatio(ListReadWriteRatioRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listReadWriteRatio);
    }

    /**
     * 读写比例监控
     *
     * 查询指定时间段内在DDM实例的读写次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadWriteRatioRequest 请求对象
     * @return SyncInvoker<ListReadWriteRatioRequest, ListReadWriteRatioResponse>
     */
    public SyncInvoker<ListReadWriteRatioRequest, ListReadWriteRatioResponse> listReadWriteRatioInvoker(
        ListReadWriteRatioRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listReadWriteRatio, hcClient);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogRequest 请求对象
     * @return ListSlowLogResponse
     */
    public ListSlowLogResponse listSlowLog(ListSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listSlowLog);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogRequest 请求对象
     * @return SyncInvoker<ListSlowLogRequest, ListSlowLogResponse>
     */
    public SyncInvoker<ListSlowLogRequest, ListSlowLogResponse> listSlowLogInvoker(ListSlowLogRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listSlowLog, hcClient);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogAnalysisRequest 请求对象
     * @return ListSlowLogAnalysisResponse
     */
    public ListSlowLogAnalysisResponse listSlowLogAnalysis(ListSlowLogAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listSlowLogAnalysis);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogAnalysisRequest 请求对象
     * @return SyncInvoker<ListSlowLogAnalysisRequest, ListSlowLogAnalysisResponse>
     */
    public SyncInvoker<ListSlowLogAnalysisRequest, ListSlowLogAnalysisResponse> listSlowLogAnalysisInvoker(
        ListSlowLogAnalysisRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listSlowLogAnalysis, hcClient);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listSlowLogs);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listSlowLogs, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listTasks, hcClient);
    }

    /**
     * 查询DDM帐号列表
     *
     * 查询DDM帐号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listUsers);
    }

    /**
     * 查询DDM帐号列表
     *
     * 查询DDM帐号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listUsers, hcClient);
    }

    /**
     * 分片变更
     *
     * 分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateLogicDbRequest 请求对象
     * @return MigrateLogicDbResponse
     */
    public MigrateLogicDbResponse migrateLogicDb(MigrateLogicDbRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.migrateLogicDb);
    }

    /**
     * 分片变更
     *
     * 分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateLogicDbRequest 请求对象
     * @return SyncInvoker<MigrateLogicDbRequest, MigrateLogicDbResponse>
     */
    public SyncInvoker<MigrateLogicDbRequest, MigrateLogicDbResponse> migrateLogicDbInvoker(
        MigrateLogicDbRequest request) {
        return new SyncInvoker<>(request, DdmMeta.migrateLogicDb, hcClient);
    }

    /**
     * 查询分片变更任务详情
     *
     * 查询分片变更任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResultsRequest 请求对象
     * @return MigrateResultsResponse
     */
    public MigrateResultsResponse migrateResults(MigrateResultsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.migrateResults);
    }

    /**
     * 查询分片变更任务详情
     *
     * 查询分片变更任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateResultsRequest 请求对象
     * @return SyncInvoker<MigrateResultsRequest, MigrateResultsResponse>
     */
    public SyncInvoker<MigrateResultsRequest, MigrateResultsResponse> migrateResultsInvoker(
        MigrateResultsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.migrateResults, hcClient);
    }

    /**
     * 修改实例的ELB IP
     *
     * 修改实例的ELB IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEipRequest 请求对象
     * @return ModifyEipResponse
     */
    public ModifyEipResponse modifyEip(ModifyEipRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.modifyEip);
    }

    /**
     * 修改实例的ELB IP
     *
     * 修改实例的ELB IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEipRequest 请求对象
     * @return SyncInvoker<ModifyEipRequest, ModifyEipResponse>
     */
    public SyncInvoker<ModifyEipRequest, ModifyEipResponse> modifyEipInvoker(ModifyEipRequest request) {
        return new SyncInvoker<>(request, DdmMeta.modifyEip, hcClient);
    }

    /**
     * DDM表数据重载
     *
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildConfigRequest 请求对象
     * @return RebuildConfigResponse
     */
    public RebuildConfigResponse rebuildConfig(RebuildConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.rebuildConfig);
    }

    /**
     * DDM表数据重载
     *
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildConfigRequest 请求对象
     * @return SyncInvoker<RebuildConfigRequest, RebuildConfigResponse>
     */
    public SyncInvoker<RebuildConfigRequest, RebuildConfigResponse> rebuildConfigInvoker(RebuildConfigRequest request) {
        return new SyncInvoker<>(request, DdmMeta.rebuildConfig, hcClient);
    }

    /**
     * DDM管理员账号密码管理
     *
     * 首次调用时新建DDM管理员帐号并设置密码。后续调用时仅更新管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAdministratorRequest 请求对象
     * @return ResetAdministratorResponse
     */
    public ResetAdministratorResponse resetAdministrator(ResetAdministratorRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.resetAdministrator);
    }

    /**
     * DDM管理员账号密码管理
     *
     * 首次调用时新建DDM管理员帐号并设置密码。后续调用时仅更新管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAdministratorRequest 请求对象
     * @return SyncInvoker<ResetAdministratorRequest, ResetAdministratorResponse>
     */
    public SyncInvoker<ResetAdministratorRequest, ResetAdministratorResponse> resetAdministratorInvoker(
        ResetAdministratorRequest request) {
        return new SyncInvoker<>(request, DdmMeta.resetAdministrator, hcClient);
    }

    /**
     * 重置DDM账号密码
     *
     * 重置现有DDM帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswordRequest 请求对象
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.resetUserPassword);
    }

    /**
     * 重置DDM账号密码
     *
     * 重置现有DDM帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordInvoker(
        ResetUserPasswordRequest request) {
        return new SyncInvoker<>(request, DdmMeta.resetUserPassword, hcClient);
    }

    /**
     * 变更DDM实例规格
     *
     * 变更DDM实例规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeFlavorRequest 请求对象
     * @return ResizeFlavorResponse
     */
    public ResizeFlavorResponse resizeFlavor(ResizeFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.resizeFlavor);
    }

    /**
     * 变更DDM实例规格
     *
     * 变更DDM实例规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeFlavorRequest 请求对象
     * @return SyncInvoker<ResizeFlavorRequest, ResizeFlavorResponse>
     */
    public SyncInvoker<ResizeFlavorRequest, ResizeFlavorResponse> resizeFlavorInvoker(ResizeFlavorRequest request) {
        return new SyncInvoker<>(request, DdmMeta.resizeFlavor, hcClient);
    }

    /**
     * 重启DDM实例
     *
     * 重启DDM实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartDdmInstanceRequest 请求对象
     * @return RestartDdmInstanceResponse
     */
    public RestartDdmInstanceResponse restartDdmInstance(RestartDdmInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restartDdmInstance);
    }

    /**
     * 重启DDM实例
     *
     * 重启DDM实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartDdmInstanceRequest 请求对象
     * @return SyncInvoker<RestartDdmInstanceRequest, RestartDdmInstanceResponse>
     */
    public SyncInvoker<RestartDdmInstanceRequest, RestartDdmInstanceResponse> restartDdmInstanceInvoker(
        RestartDdmInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.restartDdmInstance, hcClient);
    }

    /**
     * 重启DDM实例
     *
     * 重启指定的DDM实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restartInstance);
    }

    /**
     * 重启DDM实例
     *
     * 重启指定的DDM实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.restartInstance, hcClient);
    }

    /**
     * 重启DDM节点
     *
     * 重启DDM节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartNodeRequest 请求对象
     * @return RestartNodeResponse
     */
    public RestartNodeResponse restartNode(RestartNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restartNode);
    }

    /**
     * 重启DDM节点
     *
     * 重启DDM节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartNodeRequest 请求对象
     * @return SyncInvoker<RestartNodeRequest, RestartNodeResponse>
     */
    public SyncInvoker<RestartNodeRequest, RestartNodeResponse> restartNodeInvoker(RestartNodeRequest request) {
        return new SyncInvoker<>(request, DdmMeta.restartNode, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Restore2ExistRequest 请求对象
     * @return Restore2ExistResponse
     */
    public Restore2ExistResponse restore2Exist(Restore2ExistRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restore2Exist);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Restore2ExistRequest 请求对象
     * @return SyncInvoker<Restore2ExistRequest, Restore2ExistResponse>
     */
    public SyncInvoker<Restore2ExistRequest, Restore2ExistResponse> restore2ExistInvoker(Restore2ExistRequest request) {
        return new SyncInvoker<>(request, DdmMeta.restore2Exist, hcClient);
    }

    /**
     * 元数据恢复
     *
     * 元数据恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreMetadataRequest 请求对象
     * @return RestoreMetadataResponse
     */
    public RestoreMetadataResponse restoreMetadata(RestoreMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restoreMetadata);
    }

    /**
     * 元数据恢复
     *
     * 元数据恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreMetadataRequest 请求对象
     * @return SyncInvoker<RestoreMetadataRequest, RestoreMetadataResponse>
     */
    public SyncInvoker<RestoreMetadataRequest, RestoreMetadataResponse> restoreMetadataInvoker(
        RestoreMetadataRequest request) {
        return new SyncInvoker<>(request, DdmMeta.restoreMetadata, hcClient);
    }

    /**
     * 重试分片变更
     *
     * 重试分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryMigrationRequest 请求对象
     * @return RetryMigrationResponse
     */
    public RetryMigrationResponse retryMigration(RetryMigrationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.retryMigration);
    }

    /**
     * 重试分片变更
     *
     * 重试分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryMigrationRequest 请求对象
     * @return SyncInvoker<RetryMigrationRequest, RetryMigrationResponse>
     */
    public SyncInvoker<RetryMigrationRequest, RetryMigrationResponse> retryMigrationInvoker(
        RetryMigrationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.retryMigration, hcClient);
    }

    /**
     * 回滚分片变更
     *
     * 回滚分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackMigrationRequest 请求对象
     * @return RollbackMigrationResponse
     */
    public RollbackMigrationResponse rollbackMigration(RollbackMigrationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.rollbackMigration);
    }

    /**
     * 回滚分片变更
     *
     * 回滚分片变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollbackMigrationRequest 请求对象
     * @return SyncInvoker<RollbackMigrationRequest, RollbackMigrationResponse>
     */
    public SyncInvoker<RollbackMigrationRequest, RollbackMigrationResponse> rollbackMigrationInvoker(
        RollbackMigrationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.rollbackMigration, hcClient);
    }

    /**
     * 查询可用于恢复的实例列表
     *
     * 查询可用于恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleDdmsRequest 请求对象
     * @return ShowAvalibleDdmsResponse
     */
    public ShowAvalibleDdmsResponse showAvalibleDdms(ShowAvalibleDdmsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showAvalibleDdms);
    }

    /**
     * 查询可用于恢复的实例列表
     *
     * 查询可用于恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleDdmsRequest 请求对象
     * @return SyncInvoker<ShowAvalibleDdmsRequest, ShowAvalibleDdmsResponse>
     */
    public SyncInvoker<ShowAvalibleDdmsRequest, ShowAvalibleDdmsResponse> showAvalibleDdmsInvoker(
        ShowAvalibleDdmsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showAvalibleDdms, hcClient);
    }

    /**
     * 查询可用于时间点恢复的数据节点列表
     *
     * 查询可用于时间点恢复的数据节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleRdsRequest 请求对象
     * @return ShowAvalibleRdsResponse
     */
    public ShowAvalibleRdsResponse showAvalibleRds(ShowAvalibleRdsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showAvalibleRds);
    }

    /**
     * 查询可用于时间点恢复的数据节点列表
     *
     * 查询可用于时间点恢复的数据节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleRdsRequest 请求对象
     * @return SyncInvoker<ShowAvalibleRdsRequest, ShowAvalibleRdsResponse>
     */
    public SyncInvoker<ShowAvalibleRdsRequest, ShowAvalibleRdsResponse> showAvalibleRdsInvoker(
        ShowAvalibleRdsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showAvalibleRds, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleTimeRequest 请求对象
     * @return ShowAvalibleTimeResponse
     */
    public ShowAvalibleTimeResponse showAvalibleTime(ShowAvalibleTimeRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showAvalibleTime);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvalibleTimeRequest 请求对象
     * @return SyncInvoker<ShowAvalibleTimeRequest, ShowAvalibleTimeResponse>
     */
    public SyncInvoker<ShowAvalibleTimeRequest, ShowAvalibleTimeResponse> showAvalibleTimeInvoker(
        ShowAvalibleTimeRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showAvalibleTime, hcClient);
    }

    /**
     * 查询备份详情
     *
     * 查询备份详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRequest 请求对象
     * @return ShowBackupResponse
     */
    public ShowBackupResponse showBackup(ShowBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showBackup);
    }

    /**
     * 查询备份详情
     *
     * 查询备份详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRequest 请求对象
     * @return SyncInvoker<ShowBackupRequest, ShowBackupResponse>
     */
    public SyncInvoker<ShowBackupRequest, ShowBackupResponse> showBackupInvoker(ShowBackupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showBackup, hcClient);
    }

    /**
     * 查询DDM逻辑库详细信息
     *
     * 查询指定逻辑库的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseRequest 请求对象
     * @return ShowDatabaseResponse
     */
    public ShowDatabaseResponse showDatabase(ShowDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showDatabase);
    }

    /**
     * 查询DDM逻辑库详细信息
     *
     * 查询指定逻辑库的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDatabaseRequest 请求对象
     * @return SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseInvoker(ShowDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showDatabase, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmJobResultRequest 请求对象
     * @return ShowDdmJobResultResponse
     */
    public ShowDdmJobResultResponse showDdmJobResult(ShowDdmJobResultRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showDdmJobResult);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmJobResultRequest 请求对象
     * @return SyncInvoker<ShowDdmJobResultRequest, ShowDdmJobResultResponse>
     */
    public SyncInvoker<ShowDdmJobResultRequest, ShowDdmJobResultResponse> showDdmJobResultInvoker(
        ShowDdmJobResultRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showDdmJobResult, hcClient);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmNodeDetailRequest 请求对象
     * @return ShowDdmNodeDetailResponse
     */
    public ShowDdmNodeDetailResponse showDdmNodeDetail(ShowDdmNodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showDdmNodeDetail);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmNodeDetailRequest 请求对象
     * @return SyncInvoker<ShowDdmNodeDetailRequest, ShowDdmNodeDetailResponse>
     */
    public SyncInvoker<ShowDdmNodeDetailRequest, ShowDdmNodeDetailResponse> showDdmNodeDetailInvoker(
        ShowDdmNodeDetailRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showDdmNodeDetail, hcClient);
    }

    /**
     * 查询DDM实例详情
     *
     * 查询指定DDM实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showInstance);
    }

    /**
     * 查询DDM实例详情
     *
     * 查询指定DDM实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showInstance, hcClient);
    }

    /**
     * 查询逻辑库详情
     *
     * 查询逻辑库详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseRequest 请求对象
     * @return ShowInstanceDatabaseResponse
     */
    public ShowInstanceDatabaseResponse showInstanceDatabase(ShowInstanceDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showInstanceDatabase);
    }

    /**
     * 查询逻辑库详情
     *
     * 查询逻辑库详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseRequest 请求对象
     * @return SyncInvoker<ShowInstanceDatabaseRequest, ShowInstanceDatabaseResponse>
     */
    public SyncInvoker<ShowInstanceDatabaseRequest, ShowInstanceDatabaseResponse> showInstanceDatabaseInvoker(
        ShowInstanceDatabaseRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showInstanceDatabase, hcClient);
    }

    /**
     * 查询DDM指定实例的参数详情
     *
     * 查询DDM指定实例的参数详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamRequest 请求对象
     * @return ShowInstanceParamResponse
     */
    public ShowInstanceParamResponse showInstanceParam(ShowInstanceParamRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showInstanceParam);
    }

    /**
     * 查询DDM指定实例的参数详情
     *
     * 查询DDM指定实例的参数详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamRequest 请求对象
     * @return SyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse>
     */
    public SyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse> showInstanceParamInvoker(
        ShowInstanceParamRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showInstanceParam, hcClient);
    }

    /**
     * 查询访问控制组
     *
     * 查询访问控制组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return ShowIpGroupResponse
     */
    public ShowIpGroupResponse showIpGroup(ShowIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showIpGroup);
    }

    /**
     * 查询访问控制组
     *
     * 查询访问控制组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public SyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupInvoker(ShowIpGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showIpGroup, hcClient);
    }

    /**
     * 查询逻辑会话列表
     *
     * 查询逻辑会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalProcessesRequest 请求对象
     * @return ShowLogicalProcessesResponse
     */
    public ShowLogicalProcessesResponse showLogicalProcesses(ShowLogicalProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showLogicalProcesses);
    }

    /**
     * 查询逻辑会话列表
     *
     * 查询逻辑会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalProcessesRequest 请求对象
     * @return SyncInvoker<ShowLogicalProcessesRequest, ShowLogicalProcessesResponse>
     */
    public SyncInvoker<ShowLogicalProcessesRequest, ShowLogicalProcessesResponse> showLogicalProcessesInvoker(
        ShowLogicalProcessesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showLogicalProcesses, hcClient);
    }

    /**
     * 查询分片变更的日志
     *
     * 查询分片变更的日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationLogRequest 请求对象
     * @return ShowMigrationLogResponse
     */
    public ShowMigrationLogResponse showMigrationLog(ShowMigrationLogRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showMigrationLog);
    }

    /**
     * 查询分片变更的日志
     *
     * 查询分片变更的日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationLogRequest 请求对象
     * @return SyncInvoker<ShowMigrationLogRequest, ShowMigrationLogResponse>
     */
    public SyncInvoker<ShowMigrationLogRequest, ShowMigrationLogResponse> showMigrationLogInvoker(
        ShowMigrationLogRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showMigrationLog, hcClient);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeRequest 请求对象
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showNode);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodeRequest 请求对象
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showNode, hcClient);
    }

    /**
     * 查询物理会话列表
     *
     * 查询物理会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhysicalProcessesRequest 请求对象
     * @return ShowPhysicalProcessesResponse
     */
    public ShowPhysicalProcessesResponse showPhysicalProcesses(ShowPhysicalProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showPhysicalProcesses);
    }

    /**
     * 查询物理会话列表
     *
     * 查询物理会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhysicalProcessesRequest 请求对象
     * @return SyncInvoker<ShowPhysicalProcessesRequest, ShowPhysicalProcessesResponse>
     */
    public SyncInvoker<ShowPhysicalProcessesRequest, ShowPhysicalProcessesResponse> showPhysicalProcessesInvoker(
        ShowPhysicalProcessesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showPhysicalProcesses, hcClient);
    }

    /**
     * 查询kill会话审计日志
     *
     * 查询kill会话审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessesAuditLogRequest 请求对象
     * @return ShowProcessesAuditLogResponse
     */
    public ShowProcessesAuditLogResponse showProcessesAuditLog(ShowProcessesAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showProcessesAuditLog);
    }

    /**
     * 查询kill会话审计日志
     *
     * 查询kill会话审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessesAuditLogRequest 请求对象
     * @return SyncInvoker<ShowProcessesAuditLogRequest, ShowProcessesAuditLogResponse>
     */
    public SyncInvoker<ShowProcessesAuditLogRequest, ShowProcessesAuditLogResponse> showProcessesAuditLogInvoker(
        ShowProcessesAuditLogRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showProcessesAuditLog, hcClient);
    }

    /**
     * 获取DDM实例绑定的弹性公网IP信息
     *
     * 获取DDM实例绑定的弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicIpRequest 请求对象
     * @return ShowPublicIpResponse
     */
    public ShowPublicIpResponse showPublicIp(ShowPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showPublicIp);
    }

    /**
     * 获取DDM实例绑定的弹性公网IP信息
     *
     * 获取DDM实例绑定的弹性公网IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicIpRequest 请求对象
     * @return SyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse>
     */
    public SyncInvoker<ShowPublicIpRequest, ShowPublicIpResponse> showPublicIpInvoker(ShowPublicIpRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showPublicIp, hcClient);
    }

    /**
     * 查询实例在恢复时间点关联的数据节点
     *
     * 查询实例在恢复时间点关联的数据节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedDnsRequest 请求对象
     * @return ShowRelatedDnsResponse
     */
    public ShowRelatedDnsResponse showRelatedDns(ShowRelatedDnsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showRelatedDns);
    }

    /**
     * 查询实例在恢复时间点关联的数据节点
     *
     * 查询实例在恢复时间点关联的数据节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRelatedDnsRequest 请求对象
     * @return SyncInvoker<ShowRelatedDnsRequest, ShowRelatedDnsResponse>
     */
    public SyncInvoker<ShowRelatedDnsRequest, ShowRelatedDnsResponse> showRelatedDnsInvoker(
        ShowRelatedDnsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showRelatedDns, hcClient);
    }

    /**
     * DDM实例节点缩容
     *
     * 对指定的DDM实例的节点个数进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return ShrinkInstanceNodesResponse
     */
    public ShrinkInstanceNodesResponse shrinkInstanceNodes(ShrinkInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.shrinkInstanceNodes);
    }

    /**
     * DDM实例节点缩容
     *
     * 对指定的DDM实例的节点个数进行缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesInvoker(
        ShrinkInstanceNodesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 创建访问控制组
     *
     * 创建访问控制组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return SwitchIpGroupResponse
     */
    public SwitchIpGroupResponse switchIpGroup(SwitchIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.switchIpGroup);
    }

    /**
     * 创建访问控制组
     *
     * 创建访问控制组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return SyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse>
     */
    public SyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse> switchIpGroupInvoker(SwitchIpGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.switchIpGroup, hcClient);
    }

    /**
     * 切换路由
     *
     * 切换路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRouteRequest 请求对象
     * @return SwitchRouteResponse
     */
    public SwitchRouteResponse switchRoute(SwitchRouteRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.switchRoute);
    }

    /**
     * 切换路由
     *
     * 切换路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRouteRequest 请求对象
     * @return SyncInvoker<SwitchRouteRequest, SwitchRouteResponse>
     */
    public SyncInvoker<SwitchRouteRequest, SwitchRouteResponse> switchRouteInvoker(SwitchRouteRequest request) {
        return new SyncInvoker<>(request, DdmMeta.switchRoute, hcClient);
    }

    /**
     * 为实例设置SSL数据加密
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.switchSsl);
    }

    /**
     * 为实例设置SSL数据加密
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<>(request, DdmMeta.switchSsl, hcClient);
    }

    /**
     * 同步数据节点
     *
     * 同步数据节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDnInformationRequest 请求对象
     * @return SyncDnInformationResponse
     */
    public SyncDnInformationResponse syncDnInformation(SyncDnInformationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.syncDnInformation);
    }

    /**
     * 同步数据节点
     *
     * 同步数据节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDnInformationRequest 请求对象
     * @return SyncInvoker<SyncDnInformationRequest, SyncDnInformationResponse>
     */
    public SyncInvoker<SyncDnInformationRequest, SyncDnInformationResponse> syncDnInformationInvoker(
        SyncDnInformationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.syncDnInformation, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindEipRequest 请求对象
     * @return UnbindEipResponse
     */
    public UnbindEipResponse unbindEip(UnbindEipRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.unbindEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindEipRequest 请求对象
     * @return SyncInvoker<UnbindEipRequest, UnbindEipResponse>
     */
    public SyncInvoker<UnbindEipRequest, UnbindEipResponse> unbindEipInvoker(UnbindEipRequest request) {
        return new SyncInvoker<>(request, DdmMeta.unbindEip, hcClient);
    }

    /**
     * 同步DN信息
     *
     * 同步当前DDM实例已关联的所有DN实例配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseInfoRequest 请求对象
     * @return UpdateDatabaseInfoResponse
     */
    public UpdateDatabaseInfoResponse updateDatabaseInfo(UpdateDatabaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateDatabaseInfo);
    }

    /**
     * 同步DN信息
     *
     * 同步当前DDM实例已关联的所有DN实例配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseInfoRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse>
     */
    public SyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> updateDatabaseInfoInvoker(
        UpdateDatabaseInfoRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateDatabaseInfo, hcClient);
    }

    /**
     * 修改DDM实例名称
     *
     * 修改DDM实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceName);
    }

    /**
     * 修改DDM实例名称
     *
     * 修改DDM实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改DDM实例参数
     *
     * 修改DDM实例参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceParamRequest 请求对象
     * @return UpdateInstanceParamResponse
     */
    public UpdateInstanceParamResponse updateInstanceParam(UpdateInstanceParamRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceParam);
    }

    /**
     * 修改DDM实例参数
     *
     * 修改DDM实例参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceParamRequest 请求对象
     * @return SyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse>
     */
    public SyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse> updateInstanceParamInvoker(
        UpdateInstanceParamRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateInstanceParam, hcClient);
    }

    /**
     * 修改实例端口
     *
     * 修改实例端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return UpdateInstancePortResponse
     */
    public UpdateInstancePortResponse updateInstancePort(UpdateInstancePortRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstancePort);
    }

    /**
     * 修改实例端口
     *
     * 修改实例端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstancePortRequest 请求对象
     * @return SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortInvoker(
        UpdateInstancePortRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改DDM实例安全组
     *
     * 修改DDM实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSecurityGroupRequest 请求对象
     * @return UpdateInstanceSecurityGroupResponse
     */
    public UpdateInstanceSecurityGroupResponse updateInstanceSecurityGroup(UpdateInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改DDM实例安全组
     *
     * 修改DDM实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>
     */
    public SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupInvoker(
        UpdateInstanceSecurityGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     *
     * 修改DDM已关联的数据库实例的读策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReadAndWriteStrategyRequest 请求对象
     * @return UpdateReadAndWriteStrategyResponse
     */
    public UpdateReadAndWriteStrategyResponse updateReadAndWriteStrategy(UpdateReadAndWriteStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateReadAndWriteStrategy);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     *
     * 修改DDM已关联的数据库实例的读策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReadAndWriteStrategyRequest 请求对象
     * @return SyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse>
     */
    public SyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> updateReadAndWriteStrategyInvoker(
        UpdateReadAndWriteStrategyRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateReadAndWriteStrategy, hcClient);
    }

    /**
     * 修改DDM帐号
     *
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateUser);
    }

    /**
     * 修改DDM帐号
     *
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, DdmMeta.updateUser, hcClient);
    }

    /**
     * 导入逻辑库元数据
     *
     * 导入所有逻辑库物理分片分布关系，以此创建相同物理分片分布关系的逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadSchemaMetadataRequest 请求对象
     * @return UploadSchemaMetadataResponse
     */
    public UploadSchemaMetadataResponse uploadSchemaMetadata(UploadSchemaMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.uploadSchemaMetadata);
    }

    /**
     * 导入逻辑库元数据
     *
     * 导入所有逻辑库物理分片分布关系，以此创建相同物理分片分布关系的逻辑库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadSchemaMetadataRequest 请求对象
     * @return SyncInvoker<UploadSchemaMetadataRequest, UploadSchemaMetadataResponse>
     */
    public SyncInvoker<UploadSchemaMetadataRequest, UploadSchemaMetadataResponse> uploadSchemaMetadataInvoker(
        UploadSchemaMetadataRequest request) {
        return new SyncInvoker<>(request, DdmMeta.uploadSchemaMetadata, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 弱密码校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return ValidateWeakPasswordResponse
     */
    public ValidateWeakPasswordResponse validateWeakPassword(ValidateWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 弱密码校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordInvoker(
        ValidateWeakPasswordRequest request) {
        return new SyncInvoker<>(request, DdmMeta.validateWeakPassword, hcClient);
    }

    /**
     * rds连通性检查V3
     *
     * rds连通性检查V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataNodeConnectionRequest 请求对象
     * @return CheckDataNodeConnectionResponse
     */
    public CheckDataNodeConnectionResponse checkDataNodeConnection(CheckDataNodeConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.checkDataNodeConnection);
    }

    /**
     * rds连通性检查V3
     *
     * rds连通性检查V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataNodeConnectionRequest 请求对象
     * @return SyncInvoker<CheckDataNodeConnectionRequest, CheckDataNodeConnectionResponse>
     */
    public SyncInvoker<CheckDataNodeConnectionRequest, CheckDataNodeConnectionResponse> checkDataNodeConnectionInvoker(
        CheckDataNodeConnectionRequest request) {
        return new SyncInvoker<>(request, DdmMeta.checkDataNodeConnection, hcClient);
    }

    /**
     * 比较参数组V3
     *
     * 比较参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareParameterGroupsRequest 请求对象
     * @return CompareParameterGroupsResponse
     */
    public CompareParameterGroupsResponse compareParameterGroups(CompareParameterGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.compareParameterGroups);
    }

    /**
     * 比较参数组V3
     *
     * 比较参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareParameterGroupsRequest 请求对象
     * @return SyncInvoker<CompareParameterGroupsRequest, CompareParameterGroupsResponse>
     */
    public SyncInvoker<CompareParameterGroupsRequest, CompareParameterGroupsResponse> compareParameterGroupsInvoker(
        CompareParameterGroupsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.compareParameterGroups, hcClient);
    }

    /**
     * 复制参数组V3
     *
     * 复制参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.copyConfiguration);
    }

    /**
     * 复制参数组V3
     *
     * 复制参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<>(request, DdmMeta.copyConfiguration, hcClient);
    }

    /**
     * 参数组应用记录V3
     *
     * 参数组应用记录V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationApplyHistoriesRequest 请求对象
     * @return ListConfigurationApplyHistoriesResponse
     */
    public ListConfigurationApplyHistoriesResponse listConfigurationApplyHistories(
        ListConfigurationApplyHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listConfigurationApplyHistories);
    }

    /**
     * 参数组应用记录V3
     *
     * 参数组应用记录V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationApplyHistoriesRequest 请求对象
     * @return SyncInvoker<ListConfigurationApplyHistoriesRequest, ListConfigurationApplyHistoriesResponse>
     */
    public SyncInvoker<ListConfigurationApplyHistoriesRequest, ListConfigurationApplyHistoriesResponse> listConfigurationApplyHistoriesInvoker(
        ListConfigurationApplyHistoriesRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listConfigurationApplyHistories, hcClient);
    }

    /**
     * 查询可应用的实例列表V3
     *
     * 查询可应用的实例列表V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesConfigurationsRequest 请求对象
     * @return ListInstancesConfigurationsResponse
     */
    public ListInstancesConfigurationsResponse listInstancesConfigurations(ListInstancesConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listInstancesConfigurations);
    }

    /**
     * 查询可应用的实例列表V3
     *
     * 查询可应用的实例列表V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesConfigurationsRequest 请求对象
     * @return SyncInvoker<ListInstancesConfigurationsRequest, ListInstancesConfigurationsResponse>
     */
    public SyncInvoker<ListInstancesConfigurationsRequest, ListInstancesConfigurationsResponse> listInstancesConfigurationsInvoker(
        ListInstancesConfigurationsRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listInstancesConfigurations, hcClient);
    }

    /**
     * 更新参数组V3
     *
     * 更新参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParameterGroupRequest 请求对象
     * @return ResetParameterGroupResponse
     */
    public ResetParameterGroupResponse resetParameterGroup(ResetParameterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.resetParameterGroup);
    }

    /**
     * 更新参数组V3
     *
     * 更新参数组V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParameterGroupRequest 请求对象
     * @return SyncInvoker<ResetParameterGroupRequest, ResetParameterGroupResponse>
     */
    public SyncInvoker<ResetParameterGroupRequest, ResetParameterGroupResponse> resetParameterGroupInvoker(
        ResetParameterGroupRequest request) {
        return new SyncInvoker<>(request, DdmMeta.resetParameterGroup, hcClient);
    }

    /**
     * 查询实例详情V3
     *
     * 查询实例详情V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmDetailRequest 请求对象
     * @return ShowDdmDetailResponse
     */
    public ShowDdmDetailResponse showDdmDetail(ShowDdmDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showDdmDetail);
    }

    /**
     * 查询实例详情V3
     *
     * 查询实例详情V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdmDetailRequest 请求对象
     * @return SyncInvoker<ShowDdmDetailRequest, ShowDdmDetailResponse>
     */
    public SyncInvoker<ShowDdmDetailRequest, ShowDdmDetailResponse> showDdmDetailInvoker(ShowDdmDetailRequest request) {
        return new SyncInvoker<>(request, DdmMeta.showDdmDetail, hcClient);
    }

    /**
     * 批量设置读策略V3
     *
     * 批量设置读策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyReadWriteStrategyRequest 请求对象
     * @return BatchModifyReadWriteStrategyResponse
     */
    public BatchModifyReadWriteStrategyResponse batchModifyReadWriteStrategy(
        BatchModifyReadWriteStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.batchModifyReadWriteStrategy);
    }

    /**
     * 批量设置读策略V3
     *
     * 批量设置读策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyReadWriteStrategyRequest 请求对象
     * @return SyncInvoker<BatchModifyReadWriteStrategyRequest, BatchModifyReadWriteStrategyResponse>
     */
    public SyncInvoker<BatchModifyReadWriteStrategyRequest, BatchModifyReadWriteStrategyResponse> batchModifyReadWriteStrategyInvoker(
        BatchModifyReadWriteStrategyRequest request) {
        return new SyncInvoker<>(request, DdmMeta.batchModifyReadWriteStrategy, hcClient);
    }

    /**
     * 修改sql黑名单
     *
     * 修改sql黑名单V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySqlBlackListRequest 请求对象
     * @return ModifySqlBlackListResponse
     */
    public ModifySqlBlackListResponse modifySqlBlackList(ModifySqlBlackListRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.modifySqlBlackList);
    }

    /**
     * 修改sql黑名单
     *
     * 修改sql黑名单V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySqlBlackListRequest 请求对象
     * @return SyncInvoker<ModifySqlBlackListRequest, ModifySqlBlackListResponse>
     */
    public SyncInvoker<ModifySqlBlackListRequest, ModifySqlBlackListResponse> modifySqlBlackListInvoker(
        ModifySqlBlackListRequest request) {
        return new SyncInvoker<>(request, DdmMeta.modifySqlBlackList, hcClient);
    }

    /**
     * 查询sql黑名单V3
     *
     * 查询sql黑名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlBlackRequest 请求对象
     * @return ListSqlBlackResponse
     */
    public ListSqlBlackResponse listSqlBlack(ListSqlBlackRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listSqlBlack);
    }

    /**
     * 查询sql黑名单V3
     *
     * 查询sql黑名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlBlackRequest 请求对象
     * @return SyncInvoker<ListSqlBlackRequest, ListSqlBlackResponse>
     */
    public SyncInvoker<ListSqlBlackRequest, ListSqlBlackResponse> listSqlBlackInvoker(ListSqlBlackRequest request) {
        return new SyncInvoker<>(request, DdmMeta.listSqlBlack, hcClient);
    }

}

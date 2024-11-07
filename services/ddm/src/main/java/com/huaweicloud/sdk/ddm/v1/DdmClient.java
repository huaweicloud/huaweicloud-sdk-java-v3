package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.ChangeDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.CreateUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteDdmDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.DeleteUserResponse;
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
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListAvailableRdsListResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabaseAvailableVersionsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDatabasesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListDdmFlavorsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListReadWriteRatioResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListSlowLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.ddm.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigRequest;
import com.huaweicloud.sdk.ddm.v1.model.RebuildConfigResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetAdministratorResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorRequest;
import com.huaweicloud.sdk.ddm.v1.model.ResizeFlavorResponse;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.RestartInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionRequest;
import com.huaweicloud.sdk.ddm.v1.model.RollBackDatabaseVersionResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowDatabaseResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowLogicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowNodeResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowPhysicalProcessesResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShowProcessesAuditLogResponse;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.ddm.v1.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateDatabaseInfoResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceParamResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateReadAndWriteStrategyResponse;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.ddm.v1.model.UpdateUserResponse;
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

}

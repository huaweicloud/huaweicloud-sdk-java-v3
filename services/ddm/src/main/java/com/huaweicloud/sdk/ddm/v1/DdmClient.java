package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ddm.v1.model.*;

public class DdmClient {
    protected HcClient hcClient;

    public DdmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdmClient> newBuilder() {
        return new ClientBuilder<>(DdmClient::new);
    }


    /**
     * 创建DDM逻辑库
     * 创建DDM逻辑库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createDatabase);
    }

    /**
     * 创建DDM逻辑库
     * 创建DDM逻辑库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, DdmMeta.createDatabase, hcClient);
    }

    /**
     * 购买DDM实例
     * 创建一个DDM实例。  DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createInstance);
    }

    /**
     * 购买DDM实例
     * 创建一个DDM实例。  DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DdmMeta.createInstance, hcClient);
    }

    /**
     * 创建DDM帐号
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     *
     * @param CreateUsersRequest 请求对象
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.createUsers);
    }

    /**
     * 创建DDM帐号
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     *
     * @param CreateUsersRequest 请求对象
     * @return SyncInvoker<CreateUsersRequest, CreateUsersResponse>
     */
    public SyncInvoker<CreateUsersRequest, CreateUsersResponse> createUsersInvoker(CreateUsersRequest request) {
        return new SyncInvoker<CreateUsersRequest, CreateUsersResponse>(request, DdmMeta.createUsers, hcClient);
    }

    /**
     * 删除DDM逻辑库
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteDatabase);
    }

    /**
     * 删除DDM逻辑库
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, DdmMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除DDM实例
     * 删除指定的DDM实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteInstance);
    }

    /**
     * 删除DDM实例
     * 删除指定的DDM实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, DdmMeta.deleteInstance, hcClient);
    }

    /**
     * 删除DDM帐号
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     *
     * @param DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.deleteUser);
    }

    /**
     * 删除DDM帐号
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     *
     * @param DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, DdmMeta.deleteUser, hcClient);
    }

    /**
     * DDM实例节点扩容
     * 对指定的DDM实例的节点个数进行扩容。
     *
     * @param ExpandInstanceNodesRequest 请求对象
     * @return ExpandInstanceNodesResponse
     */
    public ExpandInstanceNodesResponse expandInstanceNodes(ExpandInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.expandInstanceNodes);
    }

    /**
     * DDM实例节点扩容
     * 对指定的DDM实例的节点个数进行扩容。
     *
     * @param ExpandInstanceNodesRequest 请求对象
     * @return SyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse>
     */
    public SyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> expandInstanceNodesInvoker(ExpandInstanceNodesRequest request) {
        return new SyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse>(request, DdmMeta.expandInstanceNodes, hcClient);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     * 查询创建逻辑库可选取的数据库实例列表。
     *
     * @param ListAvailableRdsListRequest 请求对象
     * @return ListAvailableRdsListResponse
     */
    public ListAvailableRdsListResponse listAvailableRdsList(ListAvailableRdsListRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listAvailableRdsList);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     * 查询创建逻辑库可选取的数据库实例列表。
     *
     * @param ListAvailableRdsListRequest 请求对象
     * @return SyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse>
     */
    public SyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse> listAvailableRdsListInvoker(ListAvailableRdsListRequest request) {
        return new SyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse>(request, DdmMeta.listAvailableRdsList, hcClient);
    }

    /**
     * 查询DDM逻辑库列表
     * 查询DDM逻辑库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listDatabases);
    }

    /**
     * 查询DDM逻辑库列表
     * 查询DDM逻辑库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DdmMeta.listDatabases, hcClient);
    }

    /**
     * 查询DDM引擎信息
     * 查询DDM引擎信息详情。
     *
     * @param ListEnginesRequest 请求对象
     * @return ListEnginesResponse
     */
    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listEngines);
    }

    /**
     * 查询DDM引擎信息
     * 查询DDM引擎信息详情。
     *
     * @param ListEnginesRequest 请求对象
     * @return SyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, DdmMeta.listEngines, hcClient);
    }

    /**
     * 查询DDM可用区规格信息
     * 查询DDM可用区规格信息详情。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listFlavors);
    }

    /**
     * 查询DDM可用区规格信息
     * 查询DDM可用区规格信息详情。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DdmMeta.listFlavors, hcClient);
    }

    /**
     * 查询DDM实例列表
     * 查询DDM实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listInstances);
    }

    /**
     * 查询DDM实例列表
     * 查询DDM实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DdmMeta.listInstances, hcClient);
    }

    /**
     * 查询DDM实例节点列表
     * 查询DDM实例节点列表。
     *
     * @param ListNodesRequest 请求对象
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listNodes);
    }

    /**
     * 查询DDM实例节点列表
     * 查询DDM实例节点列表。
     *
     * @param ListNodesRequest 请求对象
     * @return SyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<ListNodesRequest, ListNodesResponse>(request, DdmMeta.listNodes, hcClient);
    }

    /**
     * 查询DDM帐号列表
     * 查询DDM帐号列表。
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.listUsers);
    }

    /**
     * 查询DDM帐号列表
     * 查询DDM帐号列表。
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, DdmMeta.listUsers, hcClient);
    }

    /**
     * DDM表数据重载
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     *
     * @param RebuildConfigRequest 请求对象
     * @return RebuildConfigResponse
     */
    public RebuildConfigResponse rebuildConfig(RebuildConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.rebuildConfig);
    }

    /**
     * DDM表数据重载
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     *
     * @param RebuildConfigRequest 请求对象
     * @return SyncInvoker<RebuildConfigRequest, RebuildConfigResponse>
     */
    public SyncInvoker<RebuildConfigRequest, RebuildConfigResponse> rebuildConfigInvoker(RebuildConfigRequest request) {
        return new SyncInvoker<RebuildConfigRequest, RebuildConfigResponse>(request, DdmMeta.rebuildConfig, hcClient);
    }

    /**
     * 重置DDM账号密码
     * 重置现有DDM帐号的密码。
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.resetUserPassword);
    }

    /**
     * 重置DDM账号密码
     * 重置现有DDM帐号的密码。
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordInvoker(ResetUserPasswordRequest request) {
        return new SyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>(request, DdmMeta.resetUserPassword, hcClient);
    }

    /**
     * 重启DDM实例
     * 重启指定的DDM实例。
     *
     * @param RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.restartInstance);
    }

    /**
     * 重启DDM实例
     * 重启指定的DDM实例。
     *
     * @param RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(RestartInstanceRequest request) {
        return new SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request, DdmMeta.restartInstance, hcClient);
    }

    /**
     * 查询DDM逻辑库详细信息
     * 查询指定逻辑库的详细信息。
     *
     * @param ShowDatabaseRequest 请求对象
     * @return ShowDatabaseResponse
     */
    public ShowDatabaseResponse showDatabase(ShowDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showDatabase);
    }

    /**
     * 查询DDM逻辑库详细信息
     * 查询指定逻辑库的详细信息。
     *
     * @param ShowDatabaseRequest 请求对象
     * @return SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseInvoker(ShowDatabaseRequest request) {
        return new SyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, DdmMeta.showDatabase, hcClient);
    }

    /**
     * 查询DDM实例详情
     * 查询指定DDM实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showInstance);
    }

    /**
     * 查询DDM实例详情
     * 查询指定DDM实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, DdmMeta.showInstance, hcClient);
    }

    /**
     * 查询DDM指定实例的参数详情
     * 查询DDM指定实例的参数详情。
     *
     * @param ShowInstanceParamRequest 请求对象
     * @return ShowInstanceParamResponse
     */
    public ShowInstanceParamResponse showInstanceParam(ShowInstanceParamRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showInstanceParam);
    }

    /**
     * 查询DDM指定实例的参数详情
     * 查询DDM指定实例的参数详情。
     *
     * @param ShowInstanceParamRequest 请求对象
     * @return SyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse>
     */
    public SyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse> showInstanceParamInvoker(ShowInstanceParamRequest request) {
        return new SyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse>(request, DdmMeta.showInstanceParam, hcClient);
    }

    /**
     * 查询DDM实例节点详情
     * 查询DDM实例节点详情。
     *
     * @param ShowNodeRequest 请求对象
     * @return ShowNodeResponse
     */
    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.showNode);
    }

    /**
     * 查询DDM实例节点详情
     * 查询DDM实例节点详情。
     *
     * @param ShowNodeRequest 请求对象
     * @return SyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, DdmMeta.showNode, hcClient);
    }

    /**
     * DDM实例节点缩容
     * 对指定的DDM实例的节点个数进行缩容。
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return ShrinkInstanceNodesResponse
     */
    public ShrinkInstanceNodesResponse shrinkInstanceNodes(ShrinkInstanceNodesRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.shrinkInstanceNodes);
    }

    /**
     * DDM实例节点缩容
     * 对指定的DDM实例的节点个数进行缩容。
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesInvoker(ShrinkInstanceNodesRequest request) {
        return new SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>(request, DdmMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 同步数据库实例信息
     * 同步当前DDM实例已关的所有数据库实例配置信息。
     *
     * @param UpdateDatabaseInfoRequest 请求对象
     * @return UpdateDatabaseInfoResponse
     */
    public UpdateDatabaseInfoResponse updateDatabaseInfo(UpdateDatabaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateDatabaseInfo);
    }

    /**
     * 同步数据库实例信息
     * 同步当前DDM实例已关的所有数据库实例配置信息。
     *
     * @param UpdateDatabaseInfoRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse>
     */
    public SyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> updateDatabaseInfoInvoker(UpdateDatabaseInfoRequest request) {
        return new SyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse>(request, DdmMeta.updateDatabaseInfo, hcClient);
    }

    /**
     * 修改DDM实例名称
     * 修改DDM实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceName);
    }

    /**
     * 修改DDM实例名称
     * 修改DDM实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request, DdmMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改DDM实例参数
     * 修改DDM实例参数。
     *
     * @param UpdateInstanceParamRequest 请求对象
     * @return UpdateInstanceParamResponse
     */
    public UpdateInstanceParamResponse updateInstanceParam(UpdateInstanceParamRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceParam);
    }

    /**
     * 修改DDM实例参数
     * 修改DDM实例参数。
     *
     * @param UpdateInstanceParamRequest 请求对象
     * @return SyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse>
     */
    public SyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse> updateInstanceParamInvoker(UpdateInstanceParamRequest request) {
        return new SyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse>(request, DdmMeta.updateInstanceParam, hcClient);
    }

    /**
     * 修改DDM实例安全组
     * 修改DDM实例安全组。
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return UpdateInstanceSecurityGroupResponse
     */
    public UpdateInstanceSecurityGroupResponse updateInstanceSecurityGroup(UpdateInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改DDM实例安全组
     * 修改DDM实例安全组。
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>
     */
    public SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupInvoker(UpdateInstanceSecurityGroupRequest request) {
        return new SyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>(request, DdmMeta.updateInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     * 修改DDM已关联的数据库实例的读策略。
     *
     * @param UpdateReadAndWriteStrategyRequest 请求对象
     * @return UpdateReadAndWriteStrategyResponse
     */
    public UpdateReadAndWriteStrategyResponse updateReadAndWriteStrategy(UpdateReadAndWriteStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateReadAndWriteStrategy);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     * 修改DDM已关联的数据库实例的读策略。
     *
     * @param UpdateReadAndWriteStrategyRequest 请求对象
     * @return SyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse>
     */
    public SyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> updateReadAndWriteStrategyInvoker(UpdateReadAndWriteStrategyRequest request) {
        return new SyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse>(request, DdmMeta.updateReadAndWriteStrategy, hcClient);
    }

    /**
     * 修改DDM帐号
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, DdmMeta.updateUser);
    }

    /**
     * 修改DDM帐号
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     *
     * @param UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, DdmMeta.updateUser, hcClient);
    }

}
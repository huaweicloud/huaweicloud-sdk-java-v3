package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.ddm.v1.model.*;

public class DDMOpenAPIClient {
    protected HcClient hcClient;

    public DDMOpenAPIClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DDMOpenAPIClient> newBuilder() {
        return new ClientBuilder<>(DDMOpenAPIClient::new);
    }


    /**
     * 创建DDM逻辑库
     * 创建DDM逻辑库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.createDatabase);
    }

    /**
     * 创建DDM实例
     * 创建一个DDM实例。  DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.createInstance);
    }

    /**
     * 创建DDM账号
     * DDM账号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM账号，一个DDM账号可以关联多个逻辑库。
     *
     * @param CreateUsersRequest 请求对象
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.createUsers);
    }

    /**
     * 删除DDM逻辑库
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.deleteDatabase);
    }

    /**
     * 删除DDM实例
     * 删除指定的DDM实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.deleteInstance);
    }

    /**
     * 删除DDM账号
     * 删除指定的DDM实例账号，如果账号关联了逻辑库，则对应的关联关系也会删除。
     *
     * @param DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.deleteUser);
    }

    /**
     * 查询DDM逻辑库列表
     * 查询DDM逻辑库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.listDatabases);
    }

    /**
     * 查询DDM实例列表
     * 查询DDM实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.listInstances);
    }

    /**
     * 查询DDM账号列表
     * 查询DDM账号列表。
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.listUsers);
    }

    /**
     * DDM表数据重载
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     *
     * @param RebuildConfigRequest 请求对象
     * @return RebuildConfigResponse
     */
    public RebuildConfigResponse rebuildConfig(RebuildConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.rebuildConfig);
    }

    /**
     * 重启DDM实例
     * 重启指定的DDM实例。
     *
     * @param RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.restartInstance);
    }

    /**
     * 查询DDM逻辑库详细信息
     * 查询指定逻辑库的详细信息。
     *
     * @param ShowDatabaseRequest 请求对象
     * @return ShowDatabaseResponse
     */
    public ShowDatabaseResponse showDatabase(ShowDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.showDatabase);
    }

    /**
     * 查询DDM实例详情
     * 查询指定DDM实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.showInstance);
    }

    /**
     * 修改DDM实例名称
     * 修改DDM实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.updateInstanceName);
    }

    /**
     * 修改DDM实例安全组
     * 修改DDM实例安全组。
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return UpdateInstanceSecurityGroupResponse
     */
    public UpdateInstanceSecurityGroupResponse updateInstanceSecurityGroup(UpdateInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改DDM账号
     * 修改现有DDM账号的权限或者与逻辑库的管理关系。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, DDMOpenAPIMeta.updateUser);
    }

}
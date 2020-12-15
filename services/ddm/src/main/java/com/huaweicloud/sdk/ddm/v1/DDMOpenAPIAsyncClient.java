package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.ddm.v1.model.*;

public class DDMOpenAPIAsyncClient {
    protected HcClient hcClient;

    public DDMOpenAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DDMOpenAPIAsyncClient> newBuilder() {
        return new ClientBuilder<>(DDMOpenAPIAsyncClient::new);
    }


    /**
     * 创建DDM逻辑库
     * 创建DDM逻辑库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.createDatabase);
    }

    /**
     * 创建DDM实例
     * 创建一个DDM实例。  DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.createInstance);
    }

    /**
     * 创建DDM账号
     * DDM账号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM账号，一个DDM账号可以关联多个逻辑库。
     *
     * @param CreateUsersRequest 请求对象
     * @return CompletableFuture<CreateUsersResponse>
     */
    public CompletableFuture<CreateUsersResponse> createUsersAsync(CreateUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.createUsers);
    }

    /**
     * 删除DDM逻辑库
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.deleteDatabase);
    }

    /**
     * 删除DDM实例
     * 删除指定的DDM实例，释放该实例的所有资源。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.deleteInstance);
    }

    /**
     * 删除DDM账号
     * 删除指定的DDM实例账号，如果账号关联了逻辑库，则对应的关联关系也会删除。
     *
     * @param DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.deleteUser);
    }

    /**
     * 查询DDM逻辑库列表
     * 查询DDM逻辑库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.listDatabases);
    }

    /**
     * 查询DDM实例列表
     * 查询DDM实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.listInstances);
    }

    /**
     * 查询DDM账号列表
     * 查询DDM账号列表。
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.listUsers);
    }

    /**
     * DDM表数据重载
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     *
     * @param RebuildConfigRequest 请求对象
     * @return CompletableFuture<RebuildConfigResponse>
     */
    public CompletableFuture<RebuildConfigResponse> rebuildConfigAsync(RebuildConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.rebuildConfig);
    }

    /**
     * 重启DDM实例
     * 重启指定的DDM实例。
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.restartInstance);
    }

    /**
     * 查询DDM逻辑库详细信息
     * 查询指定逻辑库的详细信息。
     *
     * @param ShowDatabaseRequest 请求对象
     * @return CompletableFuture<ShowDatabaseResponse>
     */
    public CompletableFuture<ShowDatabaseResponse> showDatabaseAsync(ShowDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.showDatabase);
    }

    /**
     * 查询DDM实例详情
     * 查询指定DDM实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.showInstance);
    }

    /**
     * 修改DDM实例名称
     * 修改DDM实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.updateInstanceName);
    }

    /**
     * 修改DDM实例安全组
     * 修改DDM实例安全组。
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceSecurityGroupResponse>
     */
    public CompletableFuture<UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupAsync(UpdateInstanceSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改DDM账号
     * 修改现有DDM账号的权限或者与逻辑库的管理关系。
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DDMOpenAPIMeta.updateUser);
    }

}
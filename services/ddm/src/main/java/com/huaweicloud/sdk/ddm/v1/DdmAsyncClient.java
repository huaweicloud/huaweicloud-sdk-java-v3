package com.huaweicloud.sdk.ddm.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ddm.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class DdmAsyncClient {

    protected HcClient hcClient;

    public DdmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdmAsyncClient> newBuilder() {
        return new ClientBuilder<>(DdmAsyncClient::new);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.createDatabase);
    }

    /**
     * 创建DDM逻辑库
     *
     * 创建DDM逻辑库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, DdmMeta.createDatabase,
            hcClient);
    }

    /**
     * 购买DDM实例
     *
     * 创建一个DDM实例。
     * 
     * DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.createInstance);
    }

    /**
     * 购买DDM实例
     *
     * 创建一个DDM实例。
     * 
     * DDM运行于虚拟私有云。申请DDM实例前，需保证有可用的虚拟私有云，并且已配置好子网与安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DdmMeta.createInstance,
            hcClient);
    }

    /**
     * 创建DDM帐号
     *
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateUsersRequest 请求对象
     * @return CompletableFuture<CreateUsersResponse>
     */
    public CompletableFuture<CreateUsersResponse> createUsersAsync(CreateUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.createUsers);
    }

    /**
     * 创建DDM帐号
     *
     * DDM帐号用于连接和管理逻辑库。一个DDM实例最多能创建100个DDM帐号，一个DDM帐号可以关联多个逻辑库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateUsersRequest 请求对象
     * @return AsyncInvoker<CreateUsersRequest, CreateUsersResponse>
     */
    public AsyncInvoker<CreateUsersRequest, CreateUsersResponse> createUsersAsyncInvoker(CreateUsersRequest request) {
        return new AsyncInvoker<CreateUsersRequest, CreateUsersResponse>(request, DdmMeta.createUsers, hcClient);
    }

    /**
     * 删除DDM逻辑库
     *
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.deleteDatabase);
    }

    /**
     * 删除DDM逻辑库
     *
     * 删除指定的逻辑库，释放该逻辑库的所有资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, DdmMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.deleteInstance);
    }

    /**
     * 删除DDM实例
     *
     * 删除指定的DDM实例，释放该实例的所有资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, DdmMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除DDM帐号
     *
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.deleteUser);
    }

    /**
     * 删除DDM帐号
     *
     * 删除指定的DDM实例帐号，如果帐号关联了逻辑库，则对应的关联关系也会删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<DeleteUserRequest, DeleteUserResponse>(request, DdmMeta.deleteUser, hcClient);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandInstanceNodesRequest 请求对象
     * @return CompletableFuture<ExpandInstanceNodesResponse>
     */
    public CompletableFuture<ExpandInstanceNodesResponse> expandInstanceNodesAsync(ExpandInstanceNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.expandInstanceNodes);
    }

    /**
     * DDM实例节点扩容
     *
     * 对指定的DDM实例的节点个数进行扩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandInstanceNodesRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse>
     */
    public AsyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse> expandInstanceNodesAsyncInvoker(
        ExpandInstanceNodesRequest request) {
        return new AsyncInvoker<ExpandInstanceNodesRequest, ExpandInstanceNodesResponse>(request,
            DdmMeta.expandInstanceNodes, hcClient);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     *
     * 查询创建逻辑库可选取的数据库实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAvailableRdsListRequest 请求对象
     * @return CompletableFuture<ListAvailableRdsListResponse>
     */
    public CompletableFuture<ListAvailableRdsListResponse> listAvailableRdsListAsync(
        ListAvailableRdsListRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listAvailableRdsList);
    }

    /**
     * 查询创建逻辑库可选取的数据库实例列表
     *
     * 查询创建逻辑库可选取的数据库实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAvailableRdsListRequest 请求对象
     * @return AsyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse>
     */
    public AsyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse> listAvailableRdsListAsyncInvoker(
        ListAvailableRdsListRequest request) {
        return new AsyncInvoker<ListAvailableRdsListRequest, ListAvailableRdsListResponse>(request,
            DdmMeta.listAvailableRdsList, hcClient);
    }

    /**
     * 查询DDM逻辑库列表
     *
     * 查询DDM逻辑库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listDatabases);
    }

    /**
     * 查询DDM逻辑库列表
     *
     * 查询DDM逻辑库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, DdmMeta.listDatabases, hcClient);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return CompletableFuture<ListEnginesResponse>
     */
    public CompletableFuture<ListEnginesResponse> listEnginesAsync(ListEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listEngines);
    }

    /**
     * 查询DDM引擎信息
     *
     * 查询DDM引擎信息详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return AsyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public AsyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesAsyncInvoker(ListEnginesRequest request) {
        return new AsyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, DdmMeta.listEngines, hcClient);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listFlavors);
    }

    /**
     * 查询DDM可用区规格信息
     *
     * 查询DDM可用区规格信息详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DdmMeta.listFlavors, hcClient);
    }

    /**
     * 查询DDM实例列表
     *
     * 查询DDM实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listInstances);
    }

    /**
     * 查询DDM实例列表
     *
     * 查询DDM实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DdmMeta.listInstances, hcClient);
    }

    /**
     * 查询DDM实例节点列表
     *
     * 查询DDM实例节点列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return CompletableFuture<ListNodesResponse>
     */
    public CompletableFuture<ListNodesResponse> listNodesAsync(ListNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listNodes);
    }

    /**
     * 查询DDM实例节点列表
     *
     * 查询DDM实例节点列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNodesRequest 请求对象
     * @return AsyncInvoker<ListNodesRequest, ListNodesResponse>
     */
    public AsyncInvoker<ListNodesRequest, ListNodesResponse> listNodesAsyncInvoker(ListNodesRequest request) {
        return new AsyncInvoker<ListNodesRequest, ListNodesResponse>(request, DdmMeta.listNodes, hcClient);
    }

    /**
     * 读写比例监控
     *
     * 查询指定时间段内在DDM实例的读写次数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListReadWriteRatioRequest 请求对象
     * @return CompletableFuture<ListReadWriteRatioResponse>
     */
    public CompletableFuture<ListReadWriteRatioResponse> listReadWriteRatioAsync(ListReadWriteRatioRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listReadWriteRatio);
    }

    /**
     * 读写比例监控
     *
     * 查询指定时间段内在DDM实例的读写次数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListReadWriteRatioRequest 请求对象
     * @return AsyncInvoker<ListReadWriteRatioRequest, ListReadWriteRatioResponse>
     */
    public AsyncInvoker<ListReadWriteRatioRequest, ListReadWriteRatioResponse> listReadWriteRatioAsyncInvoker(
        ListReadWriteRatioRequest request) {
        return new AsyncInvoker<ListReadWriteRatioRequest, ListReadWriteRatioResponse>(request,
            DdmMeta.listReadWriteRatio, hcClient);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogRequest 请求对象
     * @return CompletableFuture<ListSlowLogResponse>
     */
    public CompletableFuture<ListSlowLogResponse> listSlowLogAsync(ListSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listSlowLog);
    }

    /**
     * 慢日志监控
     *
     * 查询指定时间段内在DDM实例上执行过的慢sql相关信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogRequest 请求对象
     * @return AsyncInvoker<ListSlowLogRequest, ListSlowLogResponse>
     */
    public AsyncInvoker<ListSlowLogRequest, ListSlowLogResponse> listSlowLogAsyncInvoker(ListSlowLogRequest request) {
        return new AsyncInvoker<ListSlowLogRequest, ListSlowLogResponse>(request, DdmMeta.listSlowLog, hcClient);
    }

    /**
     * 查询DDM帐号列表
     *
     * 查询DDM帐号列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.listUsers);
    }

    /**
     * 查询DDM帐号列表
     *
     * 查询DDM帐号列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<ListUsersRequest, ListUsersResponse>(request, DdmMeta.listUsers, hcClient);
    }

    /**
     * DDM表数据重载
     *
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RebuildConfigRequest 请求对象
     * @return CompletableFuture<RebuildConfigResponse>
     */
    public CompletableFuture<RebuildConfigResponse> rebuildConfigAsync(RebuildConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.rebuildConfig);
    }

    /**
     * DDM表数据重载
     *
     * DDM实例跨region容灾场景下，针对目标DDM实例实现表数据reload，使数据同步。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RebuildConfigRequest 请求对象
     * @return AsyncInvoker<RebuildConfigRequest, RebuildConfigResponse>
     */
    public AsyncInvoker<RebuildConfigRequest, RebuildConfigResponse> rebuildConfigAsyncInvoker(
        RebuildConfigRequest request) {
        return new AsyncInvoker<RebuildConfigRequest, RebuildConfigResponse>(request, DdmMeta.rebuildConfig, hcClient);
    }

    /**
     * DDM管理员账号密码管理
     *
     * 首次调用时新建DDM管理员帐号并设置密码。后续调用时仅更新管理员密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetAdministratorRequest 请求对象
     * @return CompletableFuture<ResetAdministratorResponse>
     */
    public CompletableFuture<ResetAdministratorResponse> resetAdministratorAsync(ResetAdministratorRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.resetAdministrator);
    }

    /**
     * DDM管理员账号密码管理
     *
     * 首次调用时新建DDM管理员帐号并设置密码。后续调用时仅更新管理员密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetAdministratorRequest 请求对象
     * @return AsyncInvoker<ResetAdministratorRequest, ResetAdministratorResponse>
     */
    public AsyncInvoker<ResetAdministratorRequest, ResetAdministratorResponse> resetAdministratorAsyncInvoker(
        ResetAdministratorRequest request) {
        return new AsyncInvoker<ResetAdministratorRequest, ResetAdministratorResponse>(request,
            DdmMeta.resetAdministrator, hcClient);
    }

    /**
     * 重置DDM账号密码
     *
     * 重置现有DDM帐号的密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return CompletableFuture<ResetUserPasswordResponse>
     */
    public CompletableFuture<ResetUserPasswordResponse> resetUserPasswordAsync(ResetUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.resetUserPassword);
    }

    /**
     * 重置DDM账号密码
     *
     * 重置现有DDM帐号的密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>
     */
    public AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPasswordAsyncInvoker(
        ResetUserPasswordRequest request) {
        return new AsyncInvoker<ResetUserPasswordRequest, ResetUserPasswordResponse>(request, DdmMeta.resetUserPassword,
            hcClient);
    }

    /**
     * 变更DDM实例规格
     *
     * 变更DDM实例规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResizeFlavorRequest 请求对象
     * @return CompletableFuture<ResizeFlavorResponse>
     */
    public CompletableFuture<ResizeFlavorResponse> resizeFlavorAsync(ResizeFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.resizeFlavor);
    }

    /**
     * 变更DDM实例规格
     *
     * 变更DDM实例规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResizeFlavorRequest 请求对象
     * @return AsyncInvoker<ResizeFlavorRequest, ResizeFlavorResponse>
     */
    public AsyncInvoker<ResizeFlavorRequest, ResizeFlavorResponse> resizeFlavorAsyncInvoker(
        ResizeFlavorRequest request) {
        return new AsyncInvoker<ResizeFlavorRequest, ResizeFlavorResponse>(request, DdmMeta.resizeFlavor, hcClient);
    }

    /**
     * 重启DDM实例
     *
     * 重启指定的DDM实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.restartInstance);
    }

    /**
     * 重启DDM实例
     *
     * 重启指定的DDM实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request, DdmMeta.restartInstance,
            hcClient);
    }

    /**
     * 查询DDM逻辑库详细信息
     *
     * 查询指定逻辑库的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return CompletableFuture<ShowDatabaseResponse>
     */
    public CompletableFuture<ShowDatabaseResponse> showDatabaseAsync(ShowDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.showDatabase);
    }

    /**
     * 查询DDM逻辑库详细信息
     *
     * 查询指定逻辑库的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseAsyncInvoker(
        ShowDatabaseRequest request) {
        return new AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, DdmMeta.showDatabase, hcClient);
    }

    /**
     * 查询DDM实例详情
     *
     * 查询指定DDM实例的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.showInstance);
    }

    /**
     * 查询DDM实例详情
     *
     * 查询指定DDM实例的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, DdmMeta.showInstance, hcClient);
    }

    /**
     * 查询DDM指定实例的参数详情
     *
     * 查询DDM指定实例的参数详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceParamRequest 请求对象
     * @return CompletableFuture<ShowInstanceParamResponse>
     */
    public CompletableFuture<ShowInstanceParamResponse> showInstanceParamAsync(ShowInstanceParamRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.showInstanceParam);
    }

    /**
     * 查询DDM指定实例的参数详情
     *
     * 查询DDM指定实例的参数详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceParamRequest 请求对象
     * @return AsyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse>
     */
    public AsyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse> showInstanceParamAsyncInvoker(
        ShowInstanceParamRequest request) {
        return new AsyncInvoker<ShowInstanceParamRequest, ShowInstanceParamResponse>(request, DdmMeta.showInstanceParam,
            hcClient);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return CompletableFuture<ShowNodeResponse>
     */
    public CompletableFuture<ShowNodeResponse> showNodeAsync(ShowNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.showNode);
    }

    /**
     * 查询DDM实例节点详情
     *
     * 查询DDM实例节点详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNodeRequest 请求对象
     * @return AsyncInvoker<ShowNodeRequest, ShowNodeResponse>
     */
    public AsyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeAsyncInvoker(ShowNodeRequest request) {
        return new AsyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, DdmMeta.showNode, hcClient);
    }

    /**
     * DDM实例节点缩容
     *
     * 对指定的DDM实例的节点个数进行缩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodesResponse>
     */
    public CompletableFuture<ShrinkInstanceNodesResponse> shrinkInstanceNodesAsync(ShrinkInstanceNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.shrinkInstanceNodes);
    }

    /**
     * DDM实例节点缩容
     *
     * 对指定的DDM实例的节点个数进行缩容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesAsyncInvoker(
        ShrinkInstanceNodesRequest request) {
        return new AsyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>(request,
            DdmMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 同步DN信息
     *
     * 同步当前DDM实例已关联的所有DN实例配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseInfoRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseInfoResponse>
     */
    public CompletableFuture<UpdateDatabaseInfoResponse> updateDatabaseInfoAsync(UpdateDatabaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateDatabaseInfo);
    }

    /**
     * 同步DN信息
     *
     * 同步当前DDM实例已关联的所有DN实例配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseInfoRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse>
     */
    public AsyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse> updateDatabaseInfoAsyncInvoker(
        UpdateDatabaseInfoRequest request) {
        return new AsyncInvoker<UpdateDatabaseInfoRequest, UpdateDatabaseInfoResponse>(request,
            DdmMeta.updateDatabaseInfo, hcClient);
    }

    /**
     * 修改DDM实例名称
     *
     * 修改DDM实例名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateInstanceName);
    }

    /**
     * 修改DDM实例名称
     *
     * 修改DDM实例名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            DdmMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改DDM实例参数
     *
     * 修改DDM实例参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceParamRequest 请求对象
     * @return CompletableFuture<UpdateInstanceParamResponse>
     */
    public CompletableFuture<UpdateInstanceParamResponse> updateInstanceParamAsync(UpdateInstanceParamRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateInstanceParam);
    }

    /**
     * 修改DDM实例参数
     *
     * 修改DDM实例参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceParamRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse>
     */
    public AsyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse> updateInstanceParamAsyncInvoker(
        UpdateInstanceParamRequest request) {
        return new AsyncInvoker<UpdateInstanceParamRequest, UpdateInstanceParamResponse>(request,
            DdmMeta.updateInstanceParam, hcClient);
    }

    /**
     * 修改DDM实例安全组
     *
     * 修改DDM实例安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceSecurityGroupResponse>
     */
    public CompletableFuture<UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupAsync(
        UpdateInstanceSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateInstanceSecurityGroup);
    }

    /**
     * 修改DDM实例安全组
     *
     * 修改DDM实例安全组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroupAsyncInvoker(
        UpdateInstanceSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse>(request,
            DdmMeta.updateInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     *
     * 修改DDM已关联的数据库实例的读策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReadAndWriteStrategyRequest 请求对象
     * @return CompletableFuture<UpdateReadAndWriteStrategyResponse>
     */
    public CompletableFuture<UpdateReadAndWriteStrategyResponse> updateReadAndWriteStrategyAsync(
        UpdateReadAndWriteStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateReadAndWriteStrategy);
    }

    /**
     * 修改DDM已关联的数据库实例的读策略
     *
     * 修改DDM已关联的数据库实例的读策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReadAndWriteStrategyRequest 请求对象
     * @return AsyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse>
     */
    public AsyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse> updateReadAndWriteStrategyAsyncInvoker(
        UpdateReadAndWriteStrategyRequest request) {
        return new AsyncInvoker<UpdateReadAndWriteStrategyRequest, UpdateReadAndWriteStrategyResponse>(request,
            DdmMeta.updateReadAndWriteStrategy, hcClient);
    }

    /**
     * 修改DDM帐号
     *
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.updateUser);
    }

    /**
     * 修改DDM帐号
     *
     * 修改现有DDM帐号的权限或者与逻辑库的管理关系。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<UpdateUserRequest, UpdateUserResponse>(request, DdmMeta.updateUser, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 弱密码校验
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ValidateWeakPasswordRequest 请求对象
     * @return CompletableFuture<ValidateWeakPasswordResponse>
     */
    public CompletableFuture<ValidateWeakPasswordResponse> validateWeakPasswordAsync(
        ValidateWeakPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdmMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 弱密码校验
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ValidateWeakPasswordRequest 请求对象
     * @return AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordAsyncInvoker(
        ValidateWeakPasswordRequest request) {
        return new AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>(request,
            DdmMeta.validateWeakPassword, hcClient);
    }

}

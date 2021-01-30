package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsAsyncClient {
    protected HcClient hcClient;

    public DdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DdsAsyncClient::new);
    }


    /**
     * 扩容指定集群实例的节点数量
     * 扩容指定集群实例的节点数量。
     *
     * @param AddShardingNodeRequest 请求对象
     * @return CompletableFuture<AddShardingNodeResponse>
     */
    public CompletableFuture<AddShardingNodeResponse> addShardingNodeAsync(AddShardingNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 扩容指定集群实例的节点数量
     * 扩容指定集群实例的节点数量。
     *
     * @param AddShardingNodeRequest 请求对象
     * @return AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>
     */
    public AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNodeAsyncInvoker(AddShardingNodeRequest request) {
        return new AsyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>(request, DdsMeta.addShardingNode, hcClient);
    }

    /**
     * 绑定节点的公网IP
     * 绑定节点的公网IP
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachEip);
    }

    /**
     * 绑定节点的公网IP
     * 绑定节点的公网IP
     *
     * @param AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, DdsMeta.attachEip, hcClient);
    }

    /**
     * 修改实例内网IP
     * 修改实例内网IP
     *
     * @param AttachInternalIpRequest 请求对象
     * @return CompletableFuture<AttachInternalIpResponse>
     */
    public CompletableFuture<AttachInternalIpResponse> attachInternalIpAsync(AttachInternalIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.attachInternalIp);
    }

    /**
     * 修改实例内网IP
     * 修改实例内网IP
     *
     * @param AttachInternalIpRequest 请求对象
     * @return AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>
     */
    public AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIpAsyncInvoker(AttachInternalIpRequest request) {
        return new AsyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>(request, DdsMeta.attachInternalIp, hcClient);
    }

    /**
     * 批量添加或删除指定实例的标签
     * 批量添加或删除指定实例的标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchTagAction);
    }

    /**
     * 批量添加或删除指定实例的标签
     * 批量添加或删除指定实例的标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, DdsMeta.batchTagAction, hcClient);
    }

    /**
     * 节点解绑公网IP
     * 节点解绑公网IP
     *
     * @param CancelEipRequest 请求对象
     * @return CompletableFuture<CancelEipResponse>
     */
    public CompletableFuture<CancelEipResponse> cancelEipAsync(CancelEipRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.cancelEip);
    }

    /**
     * 节点解绑公网IP
     * 节点解绑公网IP
     *
     * @param CancelEipRequest 请求对象
     * @return AsyncInvoker<CancelEipRequest, CancelEipResponse>
     */
    public AsyncInvoker<CancelEipRequest, CancelEipResponse> cancelEipAsyncInvoker(CancelEipRequest request) {
        return new AsyncInvoker<CancelEipRequest, CancelEipResponse>(request, DdsMeta.cancelEip, hcClient);
    }

    /**
     * 检查数据库用户密码
     * 检查数据库用户密码。
     *
     * @param CheckPasswordRequest 请求对象
     * @return CompletableFuture<CheckPasswordResponse>
     */
    public CompletableFuture<CheckPasswordResponse> checkPasswordAsync(CheckPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.checkPassword);
    }

    /**
     * 检查数据库用户密码
     * 检查数据库用户密码。
     *
     * @param CheckPasswordRequest 请求对象
     * @return AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse>
     */
    public AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse> checkPasswordAsyncInvoker(CheckPasswordRequest request) {
        return new AsyncInvoker<CheckPasswordRequest, CheckPasswordResponse>(request, DdsMeta.checkPassword, hcClient);
    }

    /**
     * 创建数据库角色
     * 创建数据库角色。
     *
     * @param CreateDatabaseRoleRequest 请求对象
     * @return CompletableFuture<CreateDatabaseRoleResponse>
     */
    public CompletableFuture<CreateDatabaseRoleResponse> createDatabaseRoleAsync(CreateDatabaseRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseRole);
    }

    /**
     * 创建数据库角色
     * 创建数据库角色。
     *
     * @param CreateDatabaseRoleRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>
     */
    public AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRoleAsyncInvoker(CreateDatabaseRoleRequest request) {
        return new AsyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>(request, DdsMeta.createDatabaseRole, hcClient);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateDatabaseUserResponse>
     */
    public CompletableFuture<CreateDatabaseUserResponse> createDatabaseUserAsync(CreateDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createDatabaseUser);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserAsyncInvoker(CreateDatabaseUserRequest request) {
        return new AsyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>(request, DdsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建文档数据库实例/恢复到新实例，包括集群实例、副本集实例、以及单节点实例。
     * 创建文档数据库实例/恢复到新实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建文档数据库实例/恢复到新实例，包括集群实例、副本集实例、以及单节点实例。
     * 创建文档数据库实例/恢复到新实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DdsMeta.createInstance, hcClient);
    }

    /**
     * 打开集群的Shard/Config IP开关
     * 打开集群的Shard/Config IP开关
     *
     * @param CreateIpRequest 请求对象
     * @return CompletableFuture<CreateIpResponse>
     */
    public CompletableFuture<CreateIpResponse> createIpAsync(CreateIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createIp);
    }

    /**
     * 打开集群的Shard/Config IP开关
     * 打开集群的Shard/Config IP开关
     *
     * @param CreateIpRequest 请求对象
     * @return AsyncInvoker<CreateIpRequest, CreateIpResponse>
     */
    public AsyncInvoker<CreateIpRequest, CreateIpResponse> createIpAsyncInvoker(CreateIpRequest request) {
        return new AsyncInvoker<CreateIpRequest, CreateIpResponse>(request, DdsMeta.createIp, hcClient);
    }

    /**
     * 创建数据库实例的手动备份
     * 创建数据库实例的手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 创建数据库实例的手动备份
     * 创建数据库实例的手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(CreateManualBackupRequest request) {
        return new AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request, DdsMeta.createManualBackup, hcClient);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, DdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除数据库实例的手动备份
     * 删除数据库实例的手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 删除数据库实例的手动备份
     * 删除数据库实例的手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(DeleteManualBackupRequest request) {
        return new AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request, DdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ListAuditlogLinksRequest 请求对象
     * @return CompletableFuture<ListAuditlogLinksResponse>
     */
    public CompletableFuture<ListAuditlogLinksResponse> listAuditlogLinksAsync(ListAuditlogLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogLinks);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ListAuditlogLinksRequest 请求对象
     * @return AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>
     */
    public AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinksAsyncInvoker(ListAuditlogLinksRequest request) {
        return new AsyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>(request, DdsMeta.listAuditlogLinks, hcClient);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(ListAuditlogsRequest request) {
        return new AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, DdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 根据指定条件查询备份列表
     * 根据指定条件查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 根据指定条件查询备份列表
     * 根据指定条件查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, DdsMeta.listBackups, hcClient);
    }

    /**
     * 查询数据库角色列表
     * 查询数据库角色列表。
     *
     * @param ListDatabaseRolesRequest 请求对象
     * @return CompletableFuture<ListDatabaseRolesResponse>
     */
    public CompletableFuture<ListDatabaseRolesResponse> listDatabaseRolesAsync(ListDatabaseRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     * 查询数据库角色列表。
     *
     * @param ListDatabaseRolesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesAsyncInvoker(ListDatabaseRolesRequest request) {
        return new AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>(request, DdsMeta.listDatabaseRoles, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return CompletableFuture<ListDatabaseUsersResponse>
     */
    public CompletableFuture<ListDatabaseUsersResponse> listDatabaseUsersAsync(ListDatabaseUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatabaseUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDatabaseUsersRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersAsyncInvoker(ListDatabaseUsersRequest request) {
        return new AsyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DdsMeta.listDatabaseUsers, hcClient);
    }

    /**
     * 查询数据库版本信息
     * 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return CompletableFuture<ListDatastoreVersionsResponse>
     */
    public CompletableFuture<ListDatastoreVersionsResponse> listDatastoreVersionsAsync(ListDatastoreVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询数据库版本信息
     * 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>
     */
    public AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersionsAsyncInvoker(ListDatastoreVersionsRequest request) {
        return new AsyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>(request, DdsMeta.listDatastoreVersions, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误信息。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误信息。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(ListErrorLogsRequest request) {
        return new AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, DdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     * 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     * 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     * 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 查询指定实例的标签信息
     * 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, DdsMeta.listInstanceTags, hcClient);
    }

    /**
     * 根据指定条件查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 根据指定条件查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DdsMeta.listInstances, hcClient);
    }

    /**
     * 根据标签查询指定的数据库实例
     * 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 根据标签查询指定的数据库实例
     * 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(ListInstancesByTagsRequest request) {
        return new AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request, DdsMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询指定project ID下实例的所有标签集合
     * 查询指定project ID下实例的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 查询指定project ID下实例的所有标签集合
     * 查询指定project ID下实例的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DdsMeta.listProjectTags, hcClient);
    }

    /**
     * 获取可恢复的数据库集合列表
     * 获取可恢复的数据库集合列表。
     *
     * @param ListRestoreCollectionsRequest 请求对象
     * @return CompletableFuture<ListRestoreCollectionsResponse>
     */
    public CompletableFuture<ListRestoreCollectionsResponse> listRestoreCollectionsAsync(ListRestoreCollectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreCollections);
    }

    /**
     * 获取可恢复的数据库集合列表
     * 获取可恢复的数据库集合列表。
     *
     * @param ListRestoreCollectionsRequest 请求对象
     * @return AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>
     */
    public AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollectionsAsyncInvoker(ListRestoreCollectionsRequest request) {
        return new AsyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>(request, DdsMeta.listRestoreCollections, hcClient);
    }

    /**
     * 获取可恢复的数据库列表
     * 获取可恢复的数据库列表。
     *
     * @param ListRestoreDatabasesRequest 请求对象
     * @return CompletableFuture<ListRestoreDatabasesResponse>
     */
    public CompletableFuture<ListRestoreDatabasesResponse> listRestoreDatabasesAsync(ListRestoreDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreDatabases);
    }

    /**
     * 获取可恢复的数据库列表
     * 获取可恢复的数据库列表。
     *
     * @param ListRestoreDatabasesRequest 请求对象
     * @return AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesAsyncInvoker(ListRestoreDatabasesRequest request) {
        return new AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>(request, DdsMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 查询可恢复的时间段
     * 查询实例的可恢复时间段。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复的时间段
     * 查询实例的可恢复时间段。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(ListRestoreTimesRequest request) {
        return new AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, DdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志信息。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志信息。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, DdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 查询当前区域下的数据库磁盘类型
     * 查询当前区域下的数据库磁盘类型。
     *
     * @param ListStorageTypeRequest 请求对象
     * @return CompletableFuture<ListStorageTypeResponse>
     */
    public CompletableFuture<ListStorageTypeResponse> listStorageTypeAsync(ListStorageTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listStorageType);
    }

    /**
     * 查询当前区域下的数据库磁盘类型
     * 查询当前区域下的数据库磁盘类型。
     *
     * @param ListStorageTypeRequest 请求对象
     * @return AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>
     */
    public AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse> listStorageTypeAsyncInvoker(ListStorageTypeRequest request) {
        return new AsyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>(request, DdsMeta.listStorageType, hcClient);
    }

    /**
     * 修改数据库用户密码
     * 修改数据库用户密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resetPassword);
    }

    /**
     * 修改数据库用户密码
     * 修改数据库用户密码。
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DdsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例的规格
     * 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 变更实例的规格
     * 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, DdsMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例相关的存储容量大小
     * 扩容实例相关的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例相关的存储容量大小
     * 扩容实例相关的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request, DdsMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例的数据库服务
     * 重启实例的数据库服务。
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 重启实例的数据库服务
     * 重启实例的数据库服务。
     *
     * @param RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(RestartInstanceRequest request) {
        return new AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request, DdsMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到当前实例
     * 恢复到当前实例。
     *
     * @param RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstance);
    }

    /**
     * 恢复到当前实例
     * 恢复到当前实例。
     *
     * @param RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(RestoreInstanceRequest request) {
        return new AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>(request, DdsMeta.restoreInstance, hcClient);
    }

    /**
     * 库表级时间点恢复
     * 库表级时间点恢复。
     *
     * @param RestoreInstanceFromCollectionRequest 请求对象
     * @return CompletableFuture<RestoreInstanceFromCollectionResponse>
     */
    public CompletableFuture<RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsync(RestoreInstanceFromCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restoreInstanceFromCollection);
    }

    /**
     * 库表级时间点恢复
     * 库表级时间点恢复。
     *
     * @param RestoreInstanceFromCollectionRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>
     */
    public AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionAsyncInvoker(RestoreInstanceFromCollectionRequest request) {
        return new AsyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>(request, DdsMeta.restoreInstanceFromCollection, hcClient);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, DdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, DdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request, DdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request, DdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, DdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 切换mongodb实例的SSL开关
     * 切换mongodb实例的SSL开关
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchSsl);
    }

    /**
     * 切换mongodb实例的SSL开关
     * 切换mongodb实例的SSL开关
     *
     * @param SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, DdsMeta.switchSsl, hcClient);
    }

    /**
     * 副本集主备倒换
     * 副本集主备倒换
     *
     * @param SwitchoverReplicaSetRequest 请求对象
     * @return CompletableFuture<SwitchoverReplicaSetResponse>
     */
    public CompletableFuture<SwitchoverReplicaSetResponse> switchoverReplicaSetAsync(SwitchoverReplicaSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.switchoverReplicaSet);
    }

    /**
     * 副本集主备倒换
     * 副本集主备倒换
     *
     * @param SwitchoverReplicaSetRequest 请求对象
     * @return AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>
     */
    public AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSetAsyncInvoker(SwitchoverReplicaSetRequest request) {
        return new AsyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>(request, DdsMeta.switchoverReplicaSet, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request, DdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改实例端口
     * 修改实例端口
     *
     * @param UpdateInstancePortRequest 请求对象
     * @return CompletableFuture<UpdateInstancePortResponse>
     */
    public CompletableFuture<UpdateInstancePortResponse> updateInstancePortAsync(UpdateInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateInstancePort);
    }

    /**
     * 修改实例端口
     * 修改实例端口
     *
     * @param UpdateInstancePortRequest 请求对象
     * @return AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortAsyncInvoker(UpdateInstancePortRequest request) {
        return new AsyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>(request, DdsMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改实例的安全组
     * 修改实例的安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateSecurityGroup);
    }

    /**
     * 修改实例的安全组
     * 修改实例的安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request, DdsMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     * 查询当前支持的API版本信息列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, DdsMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     * 查询指定API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DdsMeta.showApiVersion, hcClient);
    }

}
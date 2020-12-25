package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

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
     * 获取慢日志下载链接
     * 获取慢日志下载链接。
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.downloadSlowlog);
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
     * 修改实例的安全组
     * 修改实例的安全组
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.updateSecurityGroup);
    }

}
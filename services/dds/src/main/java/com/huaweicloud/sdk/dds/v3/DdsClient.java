package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsClient {

    protected HcClient hcClient;

    public DdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsClient> newBuilder() {
        return new ClientBuilder<>(DdsClient::new);
    }

    /**
     * 实例新增只读节点
     *
     * DDS副本集实例新增只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddReadonlyNodeRequest 请求对象
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
     * @param AddReadonlyNodeRequest 请求对象
     * @return SyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>
     */
    public SyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse> addReadonlyNodeInvoker(
        AddReadonlyNodeRequest request) {
        return new SyncInvoker<AddReadonlyNodeRequest, AddReadonlyNodeResponse>(request, DdsMeta.addReadonlyNode,
            hcClient);
    }

    /**
     * 扩容集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddShardingNodeRequest 请求对象
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
     * @param AddShardingNodeRequest 请求对象
     * @return SyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>
     */
    public SyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNodeInvoker(
        AddShardingNodeRequest request) {
        return new SyncInvoker<AddShardingNodeRequest, AddShardingNodeResponse>(request, DdsMeta.addShardingNode,
            hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 为实例下的节点绑定弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
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
     * @param AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, DdsMeta.attachEip, hcClient);
    }

    /**
     * 修改实例内网地址
     *
     * 修改实例的内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachInternalIpRequest 请求对象
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
     * @param AttachInternalIpRequest 请求对象
     * @return SyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>
     */
    public SyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIpInvoker(
        AttachInternalIpRequest request) {
        return new SyncInvoker<AttachInternalIpRequest, AttachInternalIpResponse>(request, DdsMeta.attachInternalIp,
            hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
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
     * @param BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, DdsMeta.batchTagAction,
            hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 解绑实例下节点已经绑定的弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelEipRequest 请求对象
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
     * @param CancelEipRequest 请求对象
     * @return SyncInvoker<CancelEipRequest, CancelEipResponse>
     */
    public SyncInvoker<CancelEipRequest, CancelEipResponse> cancelEipInvoker(CancelEipRequest request) {
        return new SyncInvoker<CancelEipRequest, CancelEipResponse>(request, DdsMeta.cancelEip, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 修改用户允许启动某项对数据库实例运行有影响的任务的时间范围，例如操作系统升级和数据库软件版本升级的时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
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
     * @param ChangeOpsWindowRequest 请求对象
     * @return SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(
        ChangeOpsWindowRequest request) {
        return new SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, DdsMeta.changeOpsWindow,
            hcClient);
    }

    /**
     * 检查数据库密码
     *
     * 检查数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPasswordRequest 请求对象
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
     * @param CheckPasswordRequest 请求对象
     * @return SyncInvoker<CheckPasswordRequest, CheckPasswordResponse>
     */
    public SyncInvoker<CheckPasswordRequest, CheckPasswordResponse> checkPasswordInvoker(CheckPasswordRequest request) {
        return new SyncInvoker<CheckPasswordRequest, CheckPasswordResponse>(request, DdsMeta.checkPassword, hcClient);
    }

    /**
     * 检查弱密码
     *
     * 检查弱密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeakPasswordRequest 请求对象
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
     * @param CheckWeakPasswordRequest 请求对象
     * @return SyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>
     */
    public SyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse> checkWeakPasswordInvoker(
        CheckWeakPasswordRequest request) {
        return new SyncInvoker<CheckWeakPasswordRequest, CheckWeakPasswordResponse>(request, DdsMeta.checkWeakPassword,
            hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
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
     * @param CompareConfigurationRequest 请求对象
     * @return SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationInvoker(
        CompareConfigurationRequest request) {
        return new SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>(request,
            DdsMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
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
     * @param CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>(request, DdsMeta.copyConfiguration,
            hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
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
     * @param CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            DdsMeta.createConfiguration, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRoleRequest 请求对象
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
     * @param CreateDatabaseRoleRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>
     */
    public SyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRoleInvoker(
        CreateDatabaseRoleRequest request) {
        return new SyncInvoker<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse>(request,
            DdsMeta.createDatabaseRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseUserRequest 请求对象
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
     * @param CreateDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>
     */
    public SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUserInvoker(
        CreateDatabaseUserRequest request) {
        return new SyncInvoker<CreateDatabaseUserRequest, CreateDatabaseUserResponse>(request,
            DdsMeta.createDatabaseUser, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
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
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DdsMeta.createInstance,
            hcClient);
    }

    /**
     * 创建集群的Shard/Config IP
     *
     * 创建集群的Shard/Config IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIpRequest 请求对象
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
     * @param CreateIpRequest 请求对象
     * @return SyncInvoker<CreateIpRequest, CreateIpResponse>
     */
    public SyncInvoker<CreateIpRequest, CreateIpResponse> createIpInvoker(CreateIpRequest request) {
        return new SyncInvoker<CreateIpRequest, CreateIpResponse>(request, DdsMeta.createIp, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
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
     * @param CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            DdsMeta.createManualBackup, hcClient);
    }

    /**
     * 删除审计日志
     *
     * 删除审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAuditLogRequest 请求对象
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
     * @param DeleteAuditLogRequest 请求对象
     * @return SyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>
     */
    public SyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse> deleteAuditLogInvoker(
        DeleteAuditLogRequest request) {
        return new SyncInvoker<DeleteAuditLogRequest, DeleteAuditLogResponse>(request, DdsMeta.deleteAuditLog,
            hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
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
     * @param DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            DdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库角色
     *
     * 删除数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRoleRequest 请求对象
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
     * @param DeleteDatabaseRoleRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>
     */
    public SyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRoleInvoker(
        DeleteDatabaseRoleRequest request) {
        return new SyncInvoker<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse>(request,
            DdsMeta.deleteDatabaseRole, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseUserRequest 请求对象
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
     * @param DeleteDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>
     */
    public SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUserInvoker(
        DeleteDatabaseUserRequest request) {
        return new SyncInvoker<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse>(request,
            DdsMeta.deleteDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
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
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, DdsMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
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
     * @param DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            DdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 终结实例节点会话
     *
     * 终结实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSessionRequest 请求对象
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
     * @param DeleteSessionRequest 请求对象
     * @return SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>
     */
    public SyncInvoker<DeleteSessionRequest, DeleteSessionResponse> deleteSessionInvoker(DeleteSessionRequest request) {
        return new SyncInvoker<DeleteSessionRequest, DeleteSessionResponse>(request, DdsMeta.deleteSession, hcClient);
    }

    /**
     * 获取错误日志下载链接
     *
     * 获取错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadErrorlogRequest 请求对象
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
     * @param DownloadErrorlogRequest 请求对象
     * @return SyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>
     */
    public SyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlogInvoker(
        DownloadErrorlogRequest request) {
        return new SyncInvoker<DownloadErrorlogRequest, DownloadErrorlogResponse>(request, DdsMeta.downloadErrorlog,
            hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
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
     * @param DownloadSlowlogRequest 请求对象
     * @return SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(
        DownloadSlowlogRequest request) {
        return new SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, DdsMeta.downloadSlowlog,
            hcClient);
    }

    /**
     * 扩容副本集实例的节点数量
     *
     * 扩容指定副本集实例的节点数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandReplicasetNodeRequest 请求对象
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
     * @param ExpandReplicasetNodeRequest 请求对象
     * @return SyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>
     */
    public SyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> expandReplicasetNodeInvoker(
        ExpandReplicasetNodeRequest request) {
        return new SyncInvoker<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse>(request,
            DdsMeta.expandReplicasetNode, hcClient);
    }

    /**
     * 查询可应用的实例
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppliedInstancesRequest 请求对象
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
     * @param ListAppliedInstancesRequest 请求对象
     * @return SyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>
     */
    public SyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse> listAppliedInstancesInvoker(
        ListAppliedInstancesRequest request) {
        return new SyncInvoker<ListAppliedInstancesRequest, ListAppliedInstancesResponse>(request,
            DdsMeta.listAppliedInstances, hcClient);
    }

    /**
     * 获取审计日志下载链接
     *
     * 获取审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogLinksRequest 请求对象
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
     * @param ListAuditlogLinksRequest 请求对象
     * @return SyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>
     */
    public SyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinksInvoker(
        ListAuditlogLinksRequest request) {
        return new SyncInvoker<ListAuditlogLinksRequest, ListAuditlogLinksResponse>(request, DdsMeta.listAuditlogLinks,
            hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
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
     * @param ListAuditlogsRequest 请求对象
     * @return SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, DdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 查询实例可迁移到的可用区
     *
     * 查询实例可迁移到的可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAz2MigrateRequest 请求对象
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
     * @param ListAz2MigrateRequest 请求对象
     * @return SyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>
     */
    public SyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2MigrateInvoker(
        ListAz2MigrateRequest request) {
        return new SyncInvoker<ListAz2MigrateRequest, ListAz2MigrateResponse>(request, DdsMeta.listAz2Migrate,
            hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
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
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, DdsMeta.listBackups, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括DDS数据库的所有默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
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
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            DdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseRolesRequest 请求对象
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
     * @param ListDatabaseRolesRequest 请求对象
     * @return SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesInvoker(
        ListDatabaseRolesRequest request) {
        return new SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>(request, DdsMeta.listDatabaseRoles,
            hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseUsersRequest 请求对象
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
     * @param ListDatabaseUsersRequest 请求对象
     * @return SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>
     */
    public SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsersInvoker(
        ListDatabaseUsersRequest request) {
        return new SyncInvoker<ListDatabaseUsersRequest, ListDatabaseUsersResponse>(request, DdsMeta.listDatabaseUsers,
            hcClient);
    }

    /**
     * 查询数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoreVersionsRequest 请求对象
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
     * @param ListDatastoreVersionsRequest 请求对象
     * @return SyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>
     */
    public SyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersionsInvoker(
        ListDatastoreVersionsRequest request) {
        return new SyncInvoker<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse>(request,
            DdsMeta.listDatastoreVersions, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
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
     * @param ListErrorLogsRequest 请求对象
     * @return SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, DdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
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
     * @param ListFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosInvoker(
        ListFlavorInfosRequest request) {
        return new SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>(request, DdsMeta.listFlavorInfos,
            hcClient);
    }

    /**
     * 查询所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
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
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
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
     * @param ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, DdsMeta.listInstanceTags,
            hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
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
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DdsMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
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
     * @param ListInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsInvoker(
        ListInstancesByTagsRequest request) {
        return new SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request,
            DdsMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowLogsRequest 请求对象
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
     * @param ListLtsSlowLogsRequest 请求对象
     * @return SyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>
     */
    public SyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> listLtsSlowLogsInvoker(
        ListLtsSlowLogsRequest request) {
        return new SyncInvoker<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse>(request, DdsMeta.listLtsSlowLogs,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
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
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, DdsMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
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
     * @param ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>(request,
            DdsMeta.listRecycleInstances, hcClient);
    }

    /**
     * 获取可恢复的数据库集合列表
     *
     * 获取可恢复的数据库集合列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreCollectionsRequest 请求对象
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
     * @param ListRestoreCollectionsRequest 请求对象
     * @return SyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>
     */
    public SyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollectionsInvoker(
        ListRestoreCollectionsRequest request) {
        return new SyncInvoker<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse>(request,
            DdsMeta.listRestoreCollections, hcClient);
    }

    /**
     * 获取可恢复的数据库列表
     *
     * 获取可恢复的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreDatabasesRequest 请求对象
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
     * @param ListRestoreDatabasesRequest 请求对象
     * @return SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesInvoker(
        ListRestoreDatabasesRequest request) {
        return new SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>(request,
            DdsMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 查询可恢复的时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
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
     * @param ListRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, DdsMeta.listRestoreTimes,
            hcClient);
    }

    /**
     * 查询实例节点会话
     *
     * 查询实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSessionsRequest 请求对象
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
     * @param ListSessionsRequest 请求对象
     * @return SyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public SyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsInvoker(ListSessionsRequest request) {
        return new SyncInvoker<ListSessionsRequest, ListSessionsResponse>(request, DdsMeta.listSessions, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
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
     * @param ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, DdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSslCertDownloadAddressRequest 请求对象
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
     * @param ListSslCertDownloadAddressRequest 请求对象
     * @return SyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>
     */
    public SyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> listSslCertDownloadAddressInvoker(
        ListSslCertDownloadAddressRequest request) {
        return new SyncInvoker<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse>(request,
            DdsMeta.listSslCertDownloadAddress, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询当前区域下的数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStorageTypeRequest 请求对象
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
     * @param ListStorageTypeRequest 请求对象
     * @return SyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>
     */
    public SyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse> listStorageTypeInvoker(
        ListStorageTypeRequest request) {
        return new SyncInvoker<ListStorageTypeRequest, ListStorageTypeResponse>(request, DdsMeta.listStorageType,
            hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 根据指定条件查询任务中心中的任务列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTasksRequest 请求对象
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
     * @param ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<ListTasksRequest, ListTasksResponse>(request, DdsMeta.listTasks, hcClient);
    }

    /**
     * 实例可用区迁移
     *
     * 实例可用区迁移。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MigrateAzRequest 请求对象
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
     * @param MigrateAzRequest 请求对象
     * @return SyncInvoker<MigrateAzRequest, MigrateAzResponse>
     */
    public SyncInvoker<MigrateAzRequest, MigrateAzResponse> migrateAzInvoker(MigrateAzRequest request) {
        return new SyncInvoker<MigrateAzRequest, MigrateAzResponse>(request, DdsMeta.migrateAz, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetConfigurationRequest 请求对象
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
     * @param ResetConfigurationRequest 请求对象
     * @return SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationInvoker(
        ResetConfigurationRequest request) {
        return new SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>(request,
            DdsMeta.resetConfiguration, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
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
     * @param ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, DdsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
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
     * @param ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, DdsMeta.resizeInstance,
            hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例相关的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
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
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeInvoker(
        ResizeInstanceVolumeRequest request) {
        return new SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request,
            DdsMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
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
     * @param RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request, DdsMeta.restartInstance,
            hcClient);
    }

    /**
     * 恢复到当前实例
     *
     * 恢复到当前实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceRequest 请求对象
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
     * @param RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(
        RestoreInstanceRequest request) {
        return new SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>(request, DdsMeta.restoreInstance,
            hcClient);
    }

    /**
     * 库表级时间点恢复
     *
     * 库表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceFromCollectionRequest 请求对象
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
     * @param RestoreInstanceFromCollectionRequest 请求对象
     * @return SyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>
     */
    public SyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollectionInvoker(
        RestoreInstanceFromCollectionRequest request) {
        return new SyncInvoker<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse>(request,
            DdsMeta.restoreInstanceFromCollection, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreNewInstanceRequest 请求对象
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
     * @param RestoreNewInstanceRequest 请求对象
     * @return SyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>
     */
    public SyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstanceInvoker(
        RestoreNewInstanceRequest request) {
        return new SyncInvoker<RestoreNewInstanceRequest, RestoreNewInstanceResponse>(request,
            DdsMeta.restoreNewInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
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
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(
        SetAuditlogPolicyRequest request) {
        return new SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, DdsMeta.setAuditlogPolicy,
            hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
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
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, DdsMeta.setBackupPolicy,
            hcClient);
    }

    /**
     * 设置集群均衡开关
     *
     * 设置集群均衡开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerSwitchRequest 请求对象
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
     * @param SetBalancerSwitchRequest 请求对象
     * @return SyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>
     */
    public SyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitchInvoker(
        SetBalancerSwitchRequest request) {
        return new SyncInvoker<SetBalancerSwitchRequest, SetBalancerSwitchResponse>(request, DdsMeta.setBalancerSwitch,
            hcClient);
    }

    /**
     * 设置集群均衡活动时间窗
     *
     * 设置集群均衡活动时间窗。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBalancerWindowRequest 请求对象
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
     * @param SetBalancerWindowRequest 请求对象
     * @return SyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>
     */
    public SyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindowInvoker(
        SetBalancerWindowRequest request) {
        return new SyncInvoker<SetBalancerWindowRequest, SetBalancerWindowResponse>(request, DdsMeta.setBalancerWindow,
            hcClient);
    }

    /**
     * 设置实例回收站策略
     *
     * 设置实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
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
     * @param SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>(request, DdsMeta.setRecyclePolicy,
            hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
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
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(
        ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            DdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
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
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            DdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
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
     * @param ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, DdsMeta.showBackupPolicy,
            hcClient);
    }

    /**
     * 查询参数模板被应用历史
     *
     * 查询参数模板应用历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationAppliedHistoryRequest 请求对象
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
     * @param ShowConfigurationAppliedHistoryRequest 请求对象
     * @return SyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>
     */
    public SyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistoryInvoker(
        ShowConfigurationAppliedHistoryRequest request) {
        return new SyncInvoker<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse>(request,
            DdsMeta.showConfigurationAppliedHistory, hcClient);
    }

    /**
     * 查询参数模板修改历史
     *
     * 查询参数模板修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationModifyHistoryRequest 请求对象
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
     * @param ShowConfigurationModifyHistoryRequest 请求对象
     * @return SyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>
     */
    public SyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistoryInvoker(
        ShowConfigurationModifyHistoryRequest request) {
        return new SyncInvoker<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse>(request,
            DdsMeta.showConfigurationModifyHistory, hcClient);
    }

    /**
     * 获取参数模板的详情
     *
     * 获取参数模板的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationParameterRequest 请求对象
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
     * @param ShowConfigurationParameterRequest 请求对象
     * @return SyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>
     */
    public SyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> showConfigurationParameterInvoker(
        ShowConfigurationParameterRequest request) {
        return new SyncInvoker<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse>(request,
            DdsMeta.showConfigurationParameter, hcClient);
    }

    /**
     * 查询实例连接数统计信息
     *
     * 查询客户端IP访问至DDS数据库实例的连接数统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectionStatisticsRequest 请求对象
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
     * @param ShowConnectionStatisticsRequest 请求对象
     * @return SyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>
     */
    public SyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatisticsInvoker(
        ShowConnectionStatisticsRequest request) {
        return new SyncInvoker<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse>(request,
            DdsMeta.showConnectionStatistics, hcClient);
    }

    /**
     * 查询实例磁盘信息
     *
     * 查询实例磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiskUsageRequest 请求对象
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
     * @param ShowDiskUsageRequest 请求对象
     * @return SyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>
     */
    public SyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse> showDiskUsageInvoker(ShowDiskUsageRequest request) {
        return new SyncInvoker<ShowDiskUsageRequest, ShowDiskUsageResponse>(request, DdsMeta.showDiskUsage, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEntityConfigurationRequest 请求对象
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
     * @param ShowEntityConfigurationRequest 请求对象
     * @return SyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>
     */
    public SyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> showEntityConfigurationInvoker(
        ShowEntityConfigurationRequest request) {
        return new SyncInvoker<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse>(request,
            DdsMeta.showEntityConfiguration, hcClient);
    }

    /**
     * 获取DDS任务中心指定ID的任务信息。
     *
     * 获取DDS任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobDetailRequest 请求对象
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
     * @param ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>(request, DdsMeta.showJobDetail, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在DDS服务下的资源配额，包括单节点实例配额、副本集实例配额、集群实例配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
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
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, DdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询实例回收站策略
     *
     * 查询实例回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
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
     * @param ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>(request, DdsMeta.showRecyclePolicy,
            hcClient);
    }

    /**
     * 查询数据库复制集名称
     *
     * 查询数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReplSetNameRequest 请求对象
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
     * @param ShowReplSetNameRequest 请求对象
     * @return SyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>
     */
    public SyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse> showReplSetNameInvoker(
        ShowReplSetNameRequest request) {
        return new SyncInvoker<ShowReplSetNameRequest, ShowReplSetNameResponse>(request, DdsMeta.showReplSetName,
            hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSecondLevelMonitoringStatusRequest 请求对象
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
     * @param ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>(request,
            DdsMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询集群均衡设置
     *
     * 查询集群均衡设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShardingBalancerRequest 请求对象
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
     * @param ShowShardingBalancerRequest 请求对象
     * @return SyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>
     */
    public SyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancerInvoker(
        ShowShardingBalancerRequest request) {
        return new SyncInvoker<ShowShardingBalancerRequest, ShowShardingBalancerResponse>(request,
            DdsMeta.showShardingBalancer, hcClient);
    }

    /**
     * 查询慢日志明文开关
     *
     * 查询慢日志明文开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowlogDesensitizationSwitchRequest 请求对象
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
     * @param ShowSlowlogDesensitizationSwitchRequest 请求对象
     * @return SyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>
     */
    public SyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitchInvoker(
        ShowSlowlogDesensitizationSwitchRequest request) {
        return new SyncInvoker<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse>(
            request, DdsMeta.showSlowlogDesensitizationSwitch, hcClient);
    }

    /**
     * 查询数据库补丁升级预估时长
     *
     * 查询数据库补丁升级预估时长
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUpgradeDurationRequest 请求对象
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
     * @param ShowUpgradeDurationRequest 请求对象
     * @return SyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>
     */
    public SyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> showUpgradeDurationInvoker(
        ShowUpgradeDurationRequest request) {
        return new SyncInvoker<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse>(request,
            DdsMeta.showUpgradeDuration, hcClient);
    }

    /**
     * 删除实例的节点
     *
     * 删除实例的节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodesRequest 请求对象
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
     * @param ShrinkInstanceNodesRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>
     */
    public SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodesInvoker(
        ShrinkInstanceNodesRequest request) {
        return new SyncInvoker<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse>(request,
            DdsMeta.shrinkInstanceNodes, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchConfigurationRequest 请求对象
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
     * @param SwitchConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationInvoker(
        SwitchConfigurationRequest request) {
        return new SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>(request,
            DdsMeta.switchConfiguration, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSecondLevelMonitoringRequest 请求对象
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
     * @param SwitchSecondLevelMonitoringRequest 请求对象
     * @return SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>(request,
            DdsMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志明文开关
     *
     * 设置实例的慢日志明文开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
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
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>(request,
            DdsMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换SSL开关
     *
     * 切换实例的SSL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
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
     * @param SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, DdsMeta.switchSsl, hcClient);
    }

    /**
     * 切换副本集实例的主备节点
     *
     * 切换副本集实例下的主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchoverReplicaSetRequest 请求对象
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
     * @param SwitchoverReplicaSetRequest 请求对象
     * @return SyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>
     */
    public SyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSetInvoker(
        SwitchoverReplicaSetRequest request) {
        return new SyncInvoker<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse>(request,
            DdsMeta.switchoverReplicaSet, hcClient);
    }

    /**
     * 副本集跨网段访问配置。
     *
     * 副本集跨网段访问配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
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
     * @param UpdateClientNetworkRequest 请求对象
     * @return SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkInvoker(
        UpdateClientNetworkRequest request) {
        return new SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>(request,
            DdsMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationParameterRequest 请求对象
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
     * @param UpdateConfigurationParameterRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>
     */
    public SyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> updateConfigurationParameterInvoker(
        UpdateConfigurationParameterRequest request) {
        return new SyncInvoker<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse>(request,
            DdsMeta.updateConfigurationParameter, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数，可以是实例，组，节点的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEntityConfigurationRequest 请求对象
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
     * @param UpdateEntityConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>
     */
    public SyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> updateEntityConfigurationInvoker(
        UpdateEntityConfigurationRequest request) {
        return new SyncInvoker<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse>(request,
            DdsMeta.updateEntityConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
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
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            DdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstancePortRequest 请求对象
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
     * @param UpdateInstancePortRequest 请求对象
     * @return SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>
     */
    public SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePortInvoker(
        UpdateInstancePortRequest request) {
        return new SyncInvoker<UpdateInstancePortRequest, UpdateInstancePortResponse>(request,
            DdsMeta.updateInstancePort, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRemarkRequest 请求对象
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
     * @param UpdateInstanceRemarkRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>
     */
    public SyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> updateInstanceRemarkInvoker(
        UpdateInstanceRemarkRequest request) {
        return new SyncInvoker<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse>(request,
            DdsMeta.updateInstanceRemark, hcClient);
    }

    /**
     * 修改数据库复制集名称
     *
     * 修改数据库复制集名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReplSetNameRequest 请求对象
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
     * @param UpdateReplSetNameRequest 请求对象
     * @return SyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>
     */
    public SyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse> updateReplSetNameInvoker(
        UpdateReplSetNameRequest request) {
        return new SyncInvoker<UpdateReplSetNameRequest, UpdateReplSetNameResponse>(request, DdsMeta.updateReplSetName,
            hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
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
     * @param UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            DdsMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDatabaseVersionRequest 请求对象
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
     * @param UpgradeDatabaseVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>
     */
    public SyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> upgradeDatabaseVersionInvoker(
        UpgradeDatabaseVersionRequest request) {
        return new SyncInvoker<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse>(request,
            DdsMeta.upgradeDatabaseVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
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
     * @param ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, DdsMeta.listApiVersion,
            hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
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
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, DdsMeta.showApiVersion,
            hcClient);
    }

}

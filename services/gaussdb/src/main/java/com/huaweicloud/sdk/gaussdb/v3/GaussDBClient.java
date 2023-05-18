package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

public class GaussDBClient {
    protected HcClient hcClient;

    public GaussDBClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBClient> newBuilder() {
        return new ClientBuilder<>(GaussDBClient::new);
    }


    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDatabasePermissionRequest 请求对象
     * @return AddDatabasePermissionResponse
     */
    public AddDatabasePermissionResponse addDatabasePermission(AddDatabasePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.addDatabasePermission);
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDatabasePermissionRequest 请求对象
     * @return SyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>
     */
    public SyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermissionInvoker(AddDatabasePermissionRequest request) {
        return new SyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>(request, GaussDBMeta.addDatabasePermission, hcClient);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.batchTagAction);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(BatchTagActionRequest request) {
        return new SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, GaussDBMeta.batchTagAction, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelGaussMySqlInstanceEipRequest 请求对象
     * @return CancelGaussMySqlInstanceEipResponse
     */
    public CancelGaussMySqlInstanceEipResponse cancelGaussMySqlInstanceEip(CancelGaussMySqlInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.cancelGaussMySqlInstanceEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelGaussMySqlInstanceEipRequest 请求对象
     * @return SyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>
     */
    public SyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipInvoker(CancelGaussMySqlInstanceEipRequest request) {
        return new SyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>(request, GaussDBMeta.cancelGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScheduleTaskRequest 请求对象
     * @return CancelScheduleTaskResponse
     */
    public CancelScheduleTaskResponse cancelScheduleTask(CancelScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.cancelScheduleTask);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScheduleTaskRequest 请求对象
     * @return SyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>
     */
    public SyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTaskInvoker(CancelScheduleTaskRequest request) {
        return new SyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>(request, GaussDBMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return ChangeGaussMySqlInstanceSpecificationResponse
     */
    public ChangeGaussMySqlInstanceSpecificationResponse changeGaussMySqlInstanceSpecification(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationInvoker(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>(request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return ChangeGaussMySqlProxySpecificationResponse
     */
    public ChangeGaussMySqlProxySpecificationResponse changeGaussMySqlProxySpecification(ChangeGaussMySqlProxySpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeGaussMySqlProxySpecification);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return SyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>
     */
    public SyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationInvoker(ChangeGaussMySqlProxySpecificationRequest request) {
        return new SyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>(request, GaussDBMeta.changeGaussMySqlProxySpecification, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return CreateGaussMySqlBackupResponse
     */
    public CreateGaussMySqlBackupResponse createGaussMySqlBackup(CreateGaussMySqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupInvoker(CreateGaussMySqlBackupRequest request) {
        return new SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>(request, GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlConfigurationRequest 请求对象
     * @return CreateGaussMySqlConfigurationResponse
     */
    public CreateGaussMySqlConfigurationResponse createGaussMySqlConfiguration(CreateGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationInvoker(CreateGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>(request, GaussDBMeta.createGaussMySqlConfiguration, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseRequest 请求对象
     * @return CreateGaussMySqlDatabaseResponse
     */
    public CreateGaussMySqlDatabaseResponse createGaussMySqlDatabase(CreateGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseInvoker(CreateGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>(request, GaussDBMeta.createGaussMySqlDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return CreateGaussMySqlDatabaseUserResponse
     */
    public CreateGaussMySqlDatabaseUserResponse createGaussMySqlDatabaseUser(CreateGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserInvoker(CreateGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>(request, GaussDBMeta.createGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return CreateGaussMySqlInstanceResponse
     */
    public CreateGaussMySqlInstanceResponse createGaussMySqlInstance(CreateGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceInvoker(CreateGaussMySqlInstanceRequest request) {
        return new SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>(request, GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return CreateGaussMySqlProxyResponse
     */
    public CreateGaussMySqlProxyResponse createGaussMySqlProxy(CreateGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyInvoker(CreateGaussMySqlProxyRequest request) {
        return new SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>(request, GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CreateGaussMySqlReadonlyNodeResponse
     */
    public CreateGaussMySqlReadonlyNodeResponse createGaussMySqlReadonlyNode(CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeInvoker(CreateGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabasePermissionRequest 请求对象
     * @return DeleteDatabasePermissionResponse
     */
    public DeleteDatabasePermissionResponse deleteDatabasePermission(DeleteDatabasePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteDatabasePermission);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabasePermissionRequest 请求对象
     * @return SyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>
     */
    public SyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermissionInvoker(DeleteDatabasePermissionRequest request) {
        return new SyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>(request, GaussDBMeta.deleteDatabasePermission, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlBackupRequest 请求对象
     * @return DeleteGaussMySqlBackupResponse
     */
    public DeleteGaussMySqlBackupResponse deleteGaussMySqlBackup(DeleteGaussMySqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlBackupRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>
     */
    public SyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupInvoker(DeleteGaussMySqlBackupRequest request) {
        return new SyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>(request, GaussDBMeta.deleteGaussMySqlBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlConfigurationRequest 请求对象
     * @return DeleteGaussMySqlConfigurationResponse
     */
    public DeleteGaussMySqlConfigurationResponse deleteGaussMySqlConfiguration(DeleteGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationInvoker(DeleteGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>(request, GaussDBMeta.deleteGaussMySqlConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseRequest 请求对象
     * @return DeleteGaussMySqlDatabaseResponse
     */
    public DeleteGaussMySqlDatabaseResponse deleteGaussMySqlDatabase(DeleteGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseInvoker(DeleteGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>(request, GaussDBMeta.deleteGaussMySqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return DeleteGaussMySqlDatabaseUserResponse
     */
    public DeleteGaussMySqlDatabaseUserResponse deleteGaussMySqlDatabaseUser(DeleteGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserInvoker(DeleteGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>(request, GaussDBMeta.deleteGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例，不支持删除包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return DeleteGaussMySqlInstanceResponse
     */
    public DeleteGaussMySqlInstanceResponse deleteGaussMySqlInstance(DeleteGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例，不支持删除包周期实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceInvoker(DeleteGaussMySqlInstanceRequest request) {
        return new SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>(request, GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return DeleteGaussMySqlProxyResponse
     */
    public DeleteGaussMySqlProxyResponse deleteGaussMySqlProxy(DeleteGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyInvoker(DeleteGaussMySqlProxyRequest request) {
        return new SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>(request, GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除只读节点
     *
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return DeleteGaussMySqlReadonlyNodeResponse
     */
    public DeleteGaussMySqlReadonlyNodeResponse deleteGaussMySqlReadonlyNode(DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除只读节点
     *
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeInvoker(DeleteGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRecordRequest 请求对象
     * @return DeleteTaskRecordResponse
     */
    public DeleteTaskRecordResponse deleteTaskRecord(DeleteTaskRecordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteTaskRecord);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRecordRequest 请求对象
     * @return SyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>
     */
    public SyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecordInvoker(DeleteTaskRecordRequest request) {
        return new SyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>(request, GaussDBMeta.deleteTaskRecord, hcClient);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return ExpandGaussMySqlInstanceVolumeResponse
     */
    public ExpandGaussMySqlInstanceVolumeResponse expandGaussMySqlInstanceVolume(ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeInvoker(ExpandGaussMySqlInstanceVolumeRequest request) {
        return new SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>(request, GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return ExpandGaussMySqlProxyResponse
     */
    public ExpandGaussMySqlProxyResponse expandGaussMySqlProxy(ExpandGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyInvoker(ExpandGaussMySqlProxyRequest request) {
        return new SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>(request, GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return InvokeGaussMySqlInstanceSwitchOverResponse
     */
    public InvokeGaussMySqlInstanceSwitchOverResponse invokeGaussMySqlInstanceSwitchOver(InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return SyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public SyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverInvoker(InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return new SyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver, hcClient);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return ListGaussMySqlConfigurationsResponse
     */
    public ListGaussMySqlConfigurationsResponse listGaussMySqlConfigurations(ListGaussMySqlConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsInvoker(ListGaussMySqlConfigurationsRequest request) {
        return new SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>(request, GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseRequest 请求对象
     * @return ListGaussMySqlDatabaseResponse
     */
    public ListGaussMySqlDatabaseResponse listGaussMySqlDatabase(ListGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabase);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseInvoker(ListGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>(request, GaussDBMeta.listGaussMySqlDatabase, hcClient);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return ListGaussMySqlDatabaseCharsetsResponse
     */
    public ListGaussMySqlDatabaseCharsetsResponse listGaussMySqlDatabaseCharsets(ListGaussMySqlDatabaseCharsetsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseCharsets);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsInvoker(ListGaussMySqlDatabaseCharsetsRequest request) {
        return new SyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>(request, GaussDBMeta.listGaussMySqlDatabaseCharsets, hcClient);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseUserRequest 请求对象
     * @return ListGaussMySqlDatabaseUserResponse
     */
    public ListGaussMySqlDatabaseUserResponse listGaussMySqlDatabaseUser(ListGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseUser);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserInvoker(ListGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>(request, GaussDBMeta.listGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return ListGaussMySqlDedicatedResourcesResponse
     */
    public ListGaussMySqlDedicatedResourcesResponse listGaussMySqlDedicatedResources(ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesInvoker(ListGaussMySqlDedicatedResourcesRequest request) {
        return new SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>(request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return ListGaussMySqlErrorLogResponse
     */
    public ListGaussMySqlErrorLogResponse listGaussMySqlErrorLog(ListGaussMySqlErrorLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlErrorLog);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>
     */
    public SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> listGaussMySqlErrorLogInvoker(ListGaussMySqlErrorLogRequest request) {
        return new SyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>(request, GaussDBMeta.listGaussMySqlErrorLog, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return ListGaussMySqlInstanceDetailInfoResponse
     */
    public ListGaussMySqlInstanceDetailInfoResponse listGaussMySqlInstanceDetailInfo(ListGaussMySqlInstanceDetailInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>
     */
    public SyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoInvoker(ListGaussMySqlInstanceDetailInfoRequest request) {
        return new SyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return ListGaussMySqlInstancesResponse
     */
    public ListGaussMySqlInstancesResponse listGaussMySqlInstances(ListGaussMySqlInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesInvoker(ListGaussMySqlInstancesRequest request) {
        return new SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>(request, GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return ListGaussMySqlSlowLogResponse
     */
    public ListGaussMySqlSlowLogResponse listGaussMySqlSlowLog(ListGaussMySqlSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlSlowLog);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>
     */
    public SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> listGaussMySqlSlowLogInvoker(ListGaussMySqlSlowLogRequest request) {
        return new SyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>(request, GaussDBMeta.listGaussMySqlSlowLog, hcClient);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImmediateJobsRequest 请求对象
     * @return ListImmediateJobsResponse
     */
    public ListImmediateJobsResponse listImmediateJobs(ListImmediateJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listImmediateJobs);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImmediateJobsRequest 请求对象
     * @return SyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>
     */
    public SyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobsInvoker(ListImmediateJobsRequest request) {
        return new SyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>(request, GaussDBMeta.listImmediateJobs, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listInstanceTags);
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
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(ListInstanceTagsRequest request) {
        return new SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, GaussDBMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsErrorLogDetailsRequest 请求对象
     * @return ListLtsErrorLogDetailsResponse
     */
    public ListLtsErrorLogDetailsResponse listLtsErrorLogDetails(ListLtsErrorLogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listLtsErrorLogDetails);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsErrorLogDetailsRequest 请求对象
     * @return SyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>
     */
    public SyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsInvoker(ListLtsErrorLogDetailsRequest request) {
        return new SyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>(request, GaussDBMeta.listLtsErrorLogDetails, hcClient);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowlogDetailsRequest 请求对象
     * @return ListLtsSlowlogDetailsResponse
     */
    public ListLtsSlowlogDetailsResponse listLtsSlowlogDetails(ListLtsSlowlogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listLtsSlowlogDetails);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowlogDetailsRequest 请求对象
     * @return SyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>
     */
    public SyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsInvoker(ListLtsSlowlogDetailsRequest request) {
        return new SyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>(request, GaussDBMeta.listLtsSlowlogDetails, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listProjectTags);
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
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, GaussDBMeta.listProjectTags, hcClient);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScheduleJobsRequest 请求对象
     * @return ListScheduleJobsResponse
     */
    public ListScheduleJobsResponse listScheduleJobs(ListScheduleJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listScheduleJobs);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScheduleJobsRequest 请求对象
     * @return SyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>
     */
    public SyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobsInvoker(ListScheduleJobsRequest request) {
        return new SyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>(request, GaussDBMeta.listScheduleJobs, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return ResetGaussMySqlDatabasePasswordResponse
     */
    public ResetGaussMySqlDatabasePasswordResponse resetGaussMySqlDatabasePassword(ResetGaussMySqlDatabasePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetGaussMySqlDatabasePassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return SyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>
     */
    public SyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordInvoker(ResetGaussMySqlDatabasePasswordRequest request) {
        return new SyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>(request, GaussDBMeta.resetGaussMySqlDatabasePassword, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return ResetGaussMySqlPasswordResponse
     */
    public ResetGaussMySqlPasswordResponse resetGaussMySqlPassword(ResetGaussMySqlPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordInvoker(ResetGaussMySqlPasswordRequest request) {
        return new SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>(request, GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlInstanceRequest 请求对象
     * @return RestartGaussMySqlInstanceResponse
     */
    public RestartGaussMySqlInstanceResponse restartGaussMySqlInstance(RestartGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartGaussMySqlInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>
     */
    public SyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceInvoker(RestartGaussMySqlInstanceRequest request) {
        return new SyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>(request, GaussDBMeta.restartGaussMySqlInstance, hcClient);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlNodeRequest 请求对象
     * @return RestartGaussMySqlNodeResponse
     */
    public RestartGaussMySqlNodeResponse restartGaussMySqlNode(RestartGaussMySqlNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartGaussMySqlNode);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlNodeRequest 请求对象
     * @return SyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>
     */
    public SyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNodeInvoker(RestartGaussMySqlNodeRequest request) {
        return new SyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>(request, GaussDBMeta.restartGaussMySqlNode, hcClient);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlProxyWeightRequest 请求对象
     * @return SetGaussMySqlProxyWeightResponse
     */
    public SetGaussMySqlProxyWeightResponse setGaussMySqlProxyWeight(SetGaussMySqlProxyWeightRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setGaussMySqlProxyWeight);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlProxyWeightRequest 请求对象
     * @return SyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>
     */
    public SyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightInvoker(SetGaussMySqlProxyWeightRequest request) {
        return new SyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>(request, GaussDBMeta.setGaussMySqlProxyWeight, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return SetGaussMySqlQuotasResponse
     */
    public SetGaussMySqlQuotasResponse setGaussMySqlQuotas(SetGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasInvoker(SetGaussMySqlQuotasRequest request) {
        return new SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>(request, GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return ShowAuditLogResponse
     */
    public ShowAuditLogResponse showAuditLog(ShowAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showAuditLog);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogInvoker(ShowAuditLogRequest request) {
        return new SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>(request, GaussDBMeta.showAuditLog, hcClient);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedResourceInfoRequest 请求对象
     * @return ShowDedicatedResourceInfoResponse
     */
    public ShowDedicatedResourceInfoResponse showDedicatedResourceInfo(ShowDedicatedResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showDedicatedResourceInfo);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedResourceInfoRequest 请求对象
     * @return SyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>
     */
    public SyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoInvoker(ShowDedicatedResourceInfoRequest request) {
        return new SyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>(request, GaussDBMeta.showDedicatedResourceInfo, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return ShowGaussMySqlBackupListResponse
     */
    public ShowGaussMySqlBackupListResponse showGaussMySqlBackupList(ShowGaussMySqlBackupListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListInvoker(ShowGaussMySqlBackupListRequest request) {
        return new SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>(request, GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return ShowGaussMySqlBackupPolicyResponse
     */
    public ShowGaussMySqlBackupPolicyResponse showGaussMySqlBackupPolicy(ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyInvoker(ShowGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlConfigurationRequest 请求对象
     * @return ShowGaussMySqlConfigurationResponse
     */
    public ShowGaussMySqlConfigurationResponse showGaussMySqlConfiguration(ShowGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlConfiguration);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationInvoker(ShowGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>(request, GaussDBMeta.showGaussMySqlConfiguration, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return ShowGaussMySqlEngineVersionResponse
     */
    public ShowGaussMySqlEngineVersionResponse showGaussMySqlEngineVersion(ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionInvoker(ShowGaussMySqlEngineVersionRequest request) {
        return new SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>(request, GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return ShowGaussMySqlFlavorsResponse
     */
    public ShowGaussMySqlFlavorsResponse showGaussMySqlFlavors(ShowGaussMySqlFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsInvoker(ShowGaussMySqlFlavorsRequest request) {
        return new SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>(request, GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return ShowGaussMySqlInstanceInfoResponse
     */
    public ShowGaussMySqlInstanceInfoResponse showGaussMySqlInstanceInfo(ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoInvoker(ShowGaussMySqlInstanceInfoRequest request) {
        return new SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>(request, GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return ShowGaussMySqlJobInfoResponse
     */
    public ShowGaussMySqlJobInfoResponse showGaussMySqlJobInfo(ShowGaussMySqlJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoInvoker(ShowGaussMySqlJobInfoRequest request) {
        return new SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>(request, GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return ShowGaussMySqlProjectQuotasResponse
     */
    public ShowGaussMySqlProjectQuotasResponse showGaussMySqlProjectQuotas(ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasInvoker(ShowGaussMySqlProjectQuotasRequest request) {
        return new SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>(request, GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return ShowGaussMySqlProxyFlavorsResponse
     */
    public ShowGaussMySqlProxyFlavorsResponse showGaussMySqlProxyFlavors(ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsInvoker(ShowGaussMySqlProxyFlavorsRequest request) {
        return new SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>(request, GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return ShowGaussMySqlProxyListResponse
     */
    public ShowGaussMySqlProxyListResponse showGaussMySqlProxyList(ShowGaussMySqlProxyListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyList);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListInvoker(ShowGaussMySqlProxyListRequest request) {
        return new SyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>(request, GaussDBMeta.showGaussMySqlProxyList, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return ShowGaussMySqlQuotasResponse
     */
    public ShowGaussMySqlQuotasResponse showGaussMySqlQuotas(ShowGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasInvoker(ShowGaussMySqlQuotasRequest request) {
        return new SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>(request, GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询实例秒级监控频率
     *
     * 查询实例秒级监控频率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return ShowInstanceMonitorExtendResponse
     */
    public ShowInstanceMonitorExtendResponse showInstanceMonitorExtend(ShowInstanceMonitorExtendRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showInstanceMonitorExtend);
    }

    /**
     * 查询实例秒级监控频率
     *
     * 查询实例秒级监控频率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return SyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>
     */
    public SyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendInvoker(ShowInstanceMonitorExtendRequest request) {
        return new SyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>(request, GaussDBMeta.showInstanceMonitorExtend, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlConfigurationRequest 请求对象
     * @return SwitchGaussMySqlConfigurationResponse
     */
    public SwitchGaussMySqlConfigurationResponse switchGaussMySqlConfiguration(SwitchGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchGaussMySqlConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationInvoker(SwitchGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>(request, GaussDBMeta.switchGaussMySqlConfiguration, hcClient);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return SwitchGaussMySqlInstanceSslResponse
     */
    public SwitchGaussMySqlInstanceSslResponse switchGaussMySqlInstanceSsl(SwitchGaussMySqlInstanceSslRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchGaussMySqlInstanceSsl);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return SyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>
     */
    public SyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslInvoker(SwitchGaussMySqlInstanceSslRequest request) {
        return new SyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>(request, GaussDBMeta.switchGaussMySqlInstanceSsl, hcClient);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return UpdateAuditLogResponse
     */
    public UpdateAuditLogResponse updateAuditLog(UpdateAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateAuditLog);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return SyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>
     */
    public SyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLogInvoker(UpdateAuditLogRequest request) {
        return new SyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>(request, GaussDBMeta.updateAuditLog, hcClient);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return UpdateGaussMySqlBackupPolicyResponse
     */
    public UpdateGaussMySqlBackupPolicyResponse updateGaussMySqlBackupPolicy(UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyInvoker(UpdateGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlConfigurationRequest 请求对象
     * @return UpdateGaussMySqlConfigurationResponse
     */
    public UpdateGaussMySqlConfigurationResponse updateGaussMySqlConfiguration(UpdateGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlConfiguration);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationInvoker(UpdateGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>(request, GaussDBMeta.updateGaussMySqlConfiguration, hcClient);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return UpdateGaussMySqlDatabaseCommentResponse
     */
    public UpdateGaussMySqlDatabaseCommentResponse updateGaussMySqlDatabaseComment(UpdateGaussMySqlDatabaseCommentRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseComment);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>
     */
    public SyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentInvoker(UpdateGaussMySqlDatabaseCommentRequest request) {
        return new SyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>(request, GaussDBMeta.updateGaussMySqlDatabaseComment, hcClient);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return UpdateGaussMySqlDatabaseUserCommentResponse
     */
    public UpdateGaussMySqlDatabaseUserCommentResponse updateGaussMySqlDatabaseUserComment(UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public SyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentInvoker(UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return new SyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return UpdateGaussMySqlInstanceAliasResponse
     */
    public UpdateGaussMySqlInstanceAliasResponse updateGaussMySqlInstanceAlias(UpdateGaussMySqlInstanceAliasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceAlias);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasInvoker(UpdateGaussMySqlInstanceAliasRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>(request, GaussDBMeta.updateGaussMySqlInstanceAlias, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return UpdateGaussMySqlInstanceEipResponse
     */
    public UpdateGaussMySqlInstanceEipResponse updateGaussMySqlInstanceEip(UpdateGaussMySqlInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipInvoker(UpdateGaussMySqlInstanceEipRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>(request, GaussDBMeta.updateGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return UpdateGaussMySqlInstanceInternalIpResponse
     */
    public UpdateGaussMySqlInstanceInternalIpResponse updateGaussMySqlInstanceInternalIp(UpdateGaussMySqlInstanceInternalIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpInvoker(UpdateGaussMySqlInstanceInternalIpRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return UpdateGaussMySqlInstanceNameResponse
     */
    public UpdateGaussMySqlInstanceNameResponse updateGaussMySqlInstanceName(UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameInvoker(UpdateGaussMySqlInstanceNameRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>(request, GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return UpdateGaussMySqlInstanceOpsWindowResponse
     */
    public UpdateGaussMySqlInstanceOpsWindowResponse updateGaussMySqlInstanceOpsWindow(UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowInvoker(UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow, hcClient);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstancePortRequest 请求对象
     * @return UpdateGaussMySqlInstancePortResponse
     */
    public UpdateGaussMySqlInstancePortResponse updateGaussMySqlInstancePort(UpdateGaussMySqlInstancePortRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstancePort);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstancePortRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortInvoker(UpdateGaussMySqlInstancePortRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>(request, GaussDBMeta.updateGaussMySqlInstancePort, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return UpdateGaussMySqlInstanceSecurityGroupResponse
     */
    public UpdateGaussMySqlInstanceSecurityGroupResponse updateGaussMySqlInstanceSecurityGroup(UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupInvoker(UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return new SyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return UpdateGaussMySqlQuotasResponse
     */
    public UpdateGaussMySqlQuotasResponse updateGaussMySqlQuotas(UpdateGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasInvoker(UpdateGaussMySqlQuotasRequest request) {
        return new SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>(request, GaussDBMeta.updateGaussMySqlQuotas, hcClient);
    }

    /**
     * 修改实例秒级监控频率
     *
     * 打开/关闭/修改实例秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return UpdateInstanceMonitorResponse
     */
    public UpdateInstanceMonitorResponse updateInstanceMonitor(UpdateInstanceMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateInstanceMonitor);
    }

    /**
     * 修改实例秒级监控频率
     *
     * 打开/关闭/修改实例秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return SyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>
     */
    public SyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitorInvoker(UpdateInstanceMonitorRequest request) {
        return new SyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>(request, GaussDBMeta.updateInstanceMonitor, hcClient);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxySessionConsistenceRequest 请求对象
     * @return UpdateProxySessionConsistenceResponse
     */
    public UpdateProxySessionConsistenceResponse updateProxySessionConsistence(UpdateProxySessionConsistenceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxySessionConsistence);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxySessionConsistenceRequest 请求对象
     * @return SyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>
     */
    public SyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceInvoker(UpdateProxySessionConsistenceRequest request) {
        return new SyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>(request, GaussDBMeta.updateProxySessionConsistence, hcClient);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransactionSplitStatusRequest 请求对象
     * @return UpdateTransactionSplitStatusResponse
     */
    public UpdateTransactionSplitStatusResponse updateTransactionSplitStatus(UpdateTransactionSplitStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateTransactionSplitStatus);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransactionSplitStatusRequest 请求对象
     * @return SyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>
     */
    public SyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusInvoker(UpdateTransactionSplitStatusRequest request) {
        return new SyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>(request, GaussDBMeta.updateTransactionSplitStatus, hcClient);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return UpgradeGaussMySqlInstanceDatabaseResponse
     */
    public UpgradeGaussMySqlInstanceDatabaseResponse upgradeGaussMySqlInstanceDatabase(UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return SyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public SyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseInvoker(UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return new SyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlFilterRuleRequest 请求对象
     * @return DeleteSqlFilterRuleResponse
     */
    public DeleteSqlFilterRuleResponse deleteSqlFilterRule(DeleteSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteSqlFilterRule);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>
     */
    public SyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRuleInvoker(DeleteSqlFilterRuleRequest request) {
        return new SyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>(request, GaussDBMeta.deleteSqlFilterRule, hcClient);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSqlFilterRuleRequest 请求对象
     * @return SetSqlFilterRuleResponse
     */
    public SetSqlFilterRuleResponse setSqlFilterRule(SetSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setSqlFilterRule);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>
     */
    public SyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRuleInvoker(SetSqlFilterRuleRequest request) {
        return new SyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>(request, GaussDBMeta.setSqlFilterRule, hcClient);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterControlRequest 请求对象
     * @return ShowSqlFilterControlResponse
     */
    public ShowSqlFilterControlResponse showSqlFilterControl(ShowSqlFilterControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showSqlFilterControl);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterControlRequest 请求对象
     * @return SyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>
     */
    public SyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControlInvoker(ShowSqlFilterControlRequest request) {
        return new SyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>(request, GaussDBMeta.showSqlFilterControl, hcClient);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterRuleRequest 请求对象
     * @return ShowSqlFilterRuleResponse
     */
    public ShowSqlFilterRuleResponse showSqlFilterRule(ShowSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showSqlFilterRule);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>
     */
    public SyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRuleInvoker(ShowSqlFilterRuleRequest request) {
        return new SyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>(request, GaussDBMeta.showSqlFilterRule, hcClient);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlFilterControlRequest 请求对象
     * @return UpdateSqlFilterControlResponse
     */
    public UpdateSqlFilterControlResponse updateSqlFilterControl(UpdateSqlFilterControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateSqlFilterControl);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlFilterControlRequest 请求对象
     * @return SyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>
     */
    public SyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControlInvoker(UpdateSqlFilterControlRequest request) {
        return new SyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>(request, GaussDBMeta.updateSqlFilterControl, hcClient);
    }

}
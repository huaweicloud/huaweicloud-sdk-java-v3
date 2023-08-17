package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseResponse;

import java.util.concurrent.CompletableFuture;

public class GaussDBAsyncClient {

    protected HcClient hcClient;

    public GaussDBAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBAsyncClient> newBuilder() {
        ClientBuilder<GaussDBAsyncClient> clientBuilder = new ClientBuilder<>(GaussDBAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDatabasePermissionRequest 请求对象
     * @return CompletableFuture<AddDatabasePermissionResponse>
     */
    public CompletableFuture<AddDatabasePermissionResponse> addDatabasePermissionAsync(
        AddDatabasePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.addDatabasePermission);
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDatabasePermissionRequest 请求对象
     * @return AsyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>
     */
    public AsyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermissionAsyncInvoker(
        AddDatabasePermissionRequest request) {
        return new AsyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>(request,
            GaussDBMeta.addDatabasePermission, hcClient);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.batchTagAction);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, GaussDBMeta.batchTagAction,
            hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelGaussMySqlInstanceEipRequest 请求对象
     * @return CompletableFuture<CancelGaussMySqlInstanceEipResponse>
     */
    public CompletableFuture<CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipAsync(
        CancelGaussMySqlInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.cancelGaussMySqlInstanceEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelGaussMySqlInstanceEipRequest 请求对象
     * @return AsyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>
     */
    public AsyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipAsyncInvoker(
        CancelGaussMySqlInstanceEipRequest request) {
        return new AsyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>(request,
            GaussDBMeta.cancelGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScheduleTaskRequest 请求对象
     * @return CompletableFuture<CancelScheduleTaskResponse>
     */
    public CompletableFuture<CancelScheduleTaskResponse> cancelScheduleTaskAsync(CancelScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.cancelScheduleTask);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelScheduleTaskRequest 请求对象
     * @return AsyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>
     */
    public AsyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTaskAsyncInvoker(
        CancelScheduleTaskRequest request) {
        return new AsyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>(request,
            GaussDBMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsync(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsyncInvoker(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>(
            request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return CompletableFuture<ChangeGaussMySqlProxySpecificationResponse>
     */
    public CompletableFuture<ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationAsync(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeGaussMySqlProxySpecification);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>
     */
    public AsyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationAsyncInvoker(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return new AsyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>(
            request, GaussDBMeta.changeGaussMySqlProxySpecification, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlBackupResponse>
     */
    public CompletableFuture<CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsync(
        CreateGaussMySqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsyncInvoker(
        CreateGaussMySqlBackupRequest request) {
        return new AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>(request,
            GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationAsync(
        CreateGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationAsyncInvoker(
        CreateGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>(request,
            GaussDBMeta.createGaussMySqlConfiguration, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseAsync(
        CreateGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseAsyncInvoker(
        CreateGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>(request,
            GaussDBMeta.createGaussMySqlDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserAsync(
        CreateGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserAsyncInvoker(
        CreateGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>(request,
            GaussDBMeta.createGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlInstanceResponse>
     */
    public CompletableFuture<CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsync(
        CreateGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsyncInvoker(
        CreateGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>(request,
            GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlProxyResponse>
     */
    public CompletableFuture<CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsync(
        CreateGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsyncInvoker(
        CreateGaussMySqlProxyRequest request) {
        return new AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>(request,
            GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsync(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsyncInvoker(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>(request,
            GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMysqlDnsRequest 请求对象
     * @return CompletableFuture<CreateGaussMysqlDnsResponse>
     */
    public CompletableFuture<CreateGaussMysqlDnsResponse> createGaussMysqlDnsAsync(CreateGaussMysqlDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMysqlDns);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateGaussMysqlDnsRequest 请求对象
     * @return AsyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse>
     */
    public AsyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> createGaussMysqlDnsAsyncInvoker(
        CreateGaussMysqlDnsRequest request) {
        return new AsyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse>(request,
            GaussDBMeta.createGaussMysqlDns, hcClient);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabasePermissionRequest 请求对象
     * @return CompletableFuture<DeleteDatabasePermissionResponse>
     */
    public CompletableFuture<DeleteDatabasePermissionResponse> deleteDatabasePermissionAsync(
        DeleteDatabasePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteDatabasePermission);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabasePermissionRequest 请求对象
     * @return AsyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>
     */
    public AsyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermissionAsyncInvoker(
        DeleteDatabasePermissionRequest request) {
        return new AsyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>(request,
            GaussDBMeta.deleteDatabasePermission, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlBackupRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlBackupResponse>
     */
    public CompletableFuture<DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupAsync(
        DeleteGaussMySqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlBackupRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupAsyncInvoker(
        DeleteGaussMySqlBackupRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>(request,
            GaussDBMeta.deleteGaussMySqlBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationAsync(
        DeleteGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationAsyncInvoker(
        DeleteGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>(request,
            GaussDBMeta.deleteGaussMySqlConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseAsync(
        DeleteGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseAsyncInvoker(
        DeleteGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>(request,
            GaussDBMeta.deleteGaussMySqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserAsync(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserAsyncInvoker(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>(request,
            GaussDBMeta.deleteGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlInstanceResponse>
     */
    public CompletableFuture<DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsync(
        DeleteGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsyncInvoker(
        DeleteGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>(request,
            GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlProxyResponse>
     */
    public CompletableFuture<DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsync(
        DeleteGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsyncInvoker(
        DeleteGaussMySqlProxyRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>(request,
            GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsync(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsyncInvoker(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>(request,
            GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRecordRequest 请求对象
     * @return CompletableFuture<DeleteTaskRecordResponse>
     */
    public CompletableFuture<DeleteTaskRecordResponse> deleteTaskRecordAsync(DeleteTaskRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteTaskRecord);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRecordRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>
     */
    public AsyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecordAsyncInvoker(
        DeleteTaskRecordRequest request) {
        return new AsyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>(request,
            GaussDBMeta.deleteTaskRecord, hcClient);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeBackupEncryptStatusRequest 请求对象
     * @return CompletableFuture<DescribeBackupEncryptStatusResponse>
     */
    public CompletableFuture<DescribeBackupEncryptStatusResponse> describeBackupEncryptStatusAsync(
        DescribeBackupEncryptStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.describeBackupEncryptStatus);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DescribeBackupEncryptStatusRequest 请求对象
     * @return AsyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse>
     */
    public AsyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> describeBackupEncryptStatusAsyncInvoker(
        DescribeBackupEncryptStatusRequest request) {
        return new AsyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse>(request,
            GaussDBMeta.describeBackupEncryptStatus, hcClient);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse>
     */
    public CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsync(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsyncInvoker(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return new AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>(request,
            GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
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
     * @return CompletableFuture<ExpandGaussMySqlProxyResponse>
     */
    public CompletableFuture<ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsync(
        ExpandGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
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
     * @return AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsyncInvoker(
        ExpandGaussMySqlProxyRequest request) {
        return new AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>(request,
            GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return CompletableFuture<InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public CompletableFuture<InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverAsync(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return AsyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public AsyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverAsyncInvoker(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return new AsyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>(
            request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver, hcClient);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlConfigurationsResponse>
     */
    public CompletableFuture<ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsync(
        ListGaussMySqlConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsyncInvoker(
        ListGaussMySqlConfigurationsRequest request) {
        return new AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>(request,
            GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseAsync(
        ListGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabase);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseAsyncInvoker(
        ListGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>(request,
            GaussDBMeta.listGaussMySqlDatabase, hcClient);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseCharsetsResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsAsync(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseCharsets);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsAsyncInvoker(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return new AsyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>(request,
            GaussDBMeta.listGaussMySqlDatabaseCharsets, hcClient);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserAsync(
        ListGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseUser);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserAsyncInvoker(
        ListGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>(request,
            GaussDBMeta.listGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDedicatedResourcesResponse>
     */
    public CompletableFuture<ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsync(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsyncInvoker(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return new AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>(
            request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstanceDetailInfoResponse>
     */
    public CompletableFuture<ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoAsync(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoAsyncInvoker(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return new AsyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>(
            request, GaussDBMeta.listGaussMySqlInstanceDetailInfo, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstancesResponse>
     */
    public CompletableFuture<ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsync(
        ListGaussMySqlInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsyncInvoker(
        ListGaussMySqlInstancesRequest request) {
        return new AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>(request,
            GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImmediateJobsRequest 请求对象
     * @return CompletableFuture<ListImmediateJobsResponse>
     */
    public CompletableFuture<ListImmediateJobsResponse> listImmediateJobsAsync(ListImmediateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listImmediateJobs);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListImmediateJobsRequest 请求对象
     * @return AsyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>
     */
    public AsyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobsAsyncInvoker(
        ListImmediateJobsRequest request) {
        return new AsyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>(request,
            GaussDBMeta.listImmediateJobs, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request,
            GaussDBMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsErrorLogDetailsRequest 请求对象
     * @return CompletableFuture<ListLtsErrorLogDetailsResponse>
     */
    public CompletableFuture<ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsAsync(
        ListLtsErrorLogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listLtsErrorLogDetails);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsErrorLogDetailsRequest 请求对象
     * @return AsyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>
     */
    public AsyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsAsyncInvoker(
        ListLtsErrorLogDetailsRequest request) {
        return new AsyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>(request,
            GaussDBMeta.listLtsErrorLogDetails, hcClient);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowlogDetailsRequest 请求对象
     * @return CompletableFuture<ListLtsSlowlogDetailsResponse>
     */
    public CompletableFuture<ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsAsync(
        ListLtsSlowlogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listLtsSlowlogDetails);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLtsSlowlogDetailsRequest 请求对象
     * @return AsyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>
     */
    public AsyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsAsyncInvoker(
        ListLtsSlowlogDetailsRequest request) {
        return new AsyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>(request,
            GaussDBMeta.listLtsSlowlogDetails, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, GaussDBMeta.listProjectTags,
            hcClient);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScheduleJobsRequest 请求对象
     * @return CompletableFuture<ListScheduleJobsResponse>
     */
    public CompletableFuture<ListScheduleJobsResponse> listScheduleJobsAsync(ListScheduleJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listScheduleJobs);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListScheduleJobsRequest 请求对象
     * @return AsyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>
     */
    public AsyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobsAsyncInvoker(
        ListScheduleJobsRequest request) {
        return new AsyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>(request,
            GaussDBMeta.listScheduleJobs, hcClient);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyBackupEncryptStatusRequest 请求对象
     * @return CompletableFuture<ModifyBackupEncryptStatusResponse>
     */
    public CompletableFuture<ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatusAsync(
        ModifyBackupEncryptStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyBackupEncryptStatus);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyBackupEncryptStatusRequest 请求对象
     * @return AsyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse>
     */
    public AsyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatusAsyncInvoker(
        ModifyBackupEncryptStatusRequest request) {
        return new AsyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse>(request,
            GaussDBMeta.modifyBackupEncryptStatus, hcClient);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return CompletableFuture<ModifyGaussMySqlProxyRouteModeResponse>
     */
    public CompletableFuture<ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteModeAsync(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyGaussMySqlProxyRouteMode);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return AsyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse>
     */
    public AsyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteModeAsyncInvoker(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return new AsyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse>(request,
            GaussDBMeta.modifyGaussMySqlProxyRouteMode, hcClient);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyGaussMysqlDnsRequest 请求对象
     * @return CompletableFuture<ModifyGaussMysqlDnsResponse>
     */
    public CompletableFuture<ModifyGaussMysqlDnsResponse> modifyGaussMysqlDnsAsync(ModifyGaussMysqlDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyGaussMysqlDns);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyGaussMysqlDnsRequest 请求对象
     * @return AsyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse>
     */
    public AsyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> modifyGaussMysqlDnsAsyncInvoker(
        ModifyGaussMysqlDnsRequest request) {
        return new AsyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse>(request,
            GaussDBMeta.modifyGaussMysqlDns, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return CompletableFuture<ResetGaussMySqlDatabasePasswordResponse>
     */
    public CompletableFuture<ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordAsync(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetGaussMySqlDatabasePassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return AsyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>
     */
    public AsyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordAsyncInvoker(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return new AsyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>(
            request, GaussDBMeta.resetGaussMySqlDatabasePassword, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return CompletableFuture<ResetGaussMySqlPasswordResponse>
     */
    public CompletableFuture<ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsync(
        ResetGaussMySqlPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsyncInvoker(
        ResetGaussMySqlPasswordRequest request) {
        return new AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>(request,
            GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<RestartGaussMySqlInstanceResponse>
     */
    public CompletableFuture<RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceAsync(
        RestartGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartGaussMySqlInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceAsyncInvoker(
        RestartGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>(request,
            GaussDBMeta.restartGaussMySqlInstance, hcClient);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlNodeRequest 请求对象
     * @return CompletableFuture<RestartGaussMySqlNodeResponse>
     */
    public CompletableFuture<RestartGaussMySqlNodeResponse> restartGaussMySqlNodeAsync(
        RestartGaussMySqlNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartGaussMySqlNode);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartGaussMySqlNodeRequest 请求对象
     * @return AsyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>
     */
    public AsyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNodeAsyncInvoker(
        RestartGaussMySqlNodeRequest request) {
        return new AsyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>(request,
            GaussDBMeta.restartGaussMySqlNode, hcClient);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreOldInstanceRequest 请求对象
     * @return CompletableFuture<RestoreOldInstanceResponse>
     */
    public CompletableFuture<RestoreOldInstanceResponse> restoreOldInstanceAsync(RestoreOldInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restoreOldInstance);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreOldInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse>
     */
    public AsyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstanceAsyncInvoker(
        RestoreOldInstanceRequest request) {
        return new AsyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse>(request,
            GaussDBMeta.restoreOldInstance, hcClient);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlProxyWeightRequest 请求对象
     * @return CompletableFuture<SetGaussMySqlProxyWeightResponse>
     */
    public CompletableFuture<SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightAsync(
        SetGaussMySqlProxyWeightRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setGaussMySqlProxyWeight);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlProxyWeightRequest 请求对象
     * @return AsyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>
     */
    public AsyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightAsyncInvoker(
        SetGaussMySqlProxyWeightRequest request) {
        return new AsyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>(request,
            GaussDBMeta.setGaussMySqlProxyWeight, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<SetGaussMySqlQuotasResponse>
     */
    public CompletableFuture<SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsync(SetGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsyncInvoker(
        SetGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>(request,
            GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return CompletableFuture<ShowAuditLogResponse>
     */
    public CompletableFuture<ShowAuditLogResponse> showAuditLogAsync(ShowAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showAuditLog);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogAsyncInvoker(
        ShowAuditLogRequest request) {
        return new AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>(request, GaussDBMeta.showAuditLog, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupRestoreTimeRequest 请求对象
     * @return CompletableFuture<ShowBackupRestoreTimeResponse>
     */
    public CompletableFuture<ShowBackupRestoreTimeResponse> showBackupRestoreTimeAsync(
        ShowBackupRestoreTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showBackupRestoreTime);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupRestoreTimeRequest 请求对象
     * @return AsyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse>
     */
    public AsyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTimeAsyncInvoker(
        ShowBackupRestoreTimeRequest request) {
        return new AsyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse>(request,
            GaussDBMeta.showBackupRestoreTime, hcClient);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowDedicatedResourceInfoResponse>
     */
    public CompletableFuture<ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoAsync(
        ShowDedicatedResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showDedicatedResourceInfo);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDedicatedResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>
     */
    public AsyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoAsyncInvoker(
        ShowDedicatedResourceInfoRequest request) {
        return new AsyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>(request,
            GaussDBMeta.showDedicatedResourceInfo, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupListResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsync(
        ShowGaussMySqlBackupListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsyncInvoker(
        ShowGaussMySqlBackupListRequest request) {
        return new AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>(request,
            GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsync(
        ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsyncInvoker(
        ShowGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>(request,
            GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationAsync(
        ShowGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlConfiguration);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationAsyncInvoker(
        ShowGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>(request,
            GaussDBMeta.showGaussMySqlConfiguration, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlEngineVersionResponse>
     */
    public CompletableFuture<ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsync(
        ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsyncInvoker(
        ShowGaussMySqlEngineVersionRequest request) {
        return new AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>(request,
            GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsync(
        ShowGaussMySqlFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsyncInvoker(
        ShowGaussMySqlFlavorsRequest request) {
        return new AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>(request,
            GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlInstanceInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsync(
        ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsyncInvoker(
        ShowGaussMySqlInstanceInfoRequest request) {
        return new AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>(request,
            GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlJobInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsync(
        ShowGaussMySqlJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsyncInvoker(
        ShowGaussMySqlJobInfoRequest request) {
        return new AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>(request,
            GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProjectQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsync(
        ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsyncInvoker(
        ShowGaussMySqlProjectQuotasRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>(request,
            GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsync(
        ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsyncInvoker(
        ShowGaussMySqlProxyFlavorsRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>(request,
            GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyListResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsync(
        ShowGaussMySqlProxyListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyList);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsyncInvoker(
        ShowGaussMySqlProxyListRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>(request,
            GaussDBMeta.showGaussMySqlProxyList, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsync(
        ShowGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsyncInvoker(
        ShowGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>(request,
            GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return CompletableFuture<ShowInstanceMonitorExtendResponse>
     */
    public CompletableFuture<ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsync(
        ShowInstanceMonitorExtendRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showInstanceMonitorExtend);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>
     */
    public AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsyncInvoker(
        ShowInstanceMonitorExtendRequest request) {
        return new AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>(request,
            GaussDBMeta.showInstanceMonitorExtend, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationAsync(
        SwitchGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchGaussMySqlConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationAsyncInvoker(
        SwitchGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>(request,
            GaussDBMeta.switchGaussMySqlConfiguration, hcClient);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return CompletableFuture<SwitchGaussMySqlInstanceSslResponse>
     */
    public CompletableFuture<SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslAsync(
        SwitchGaussMySqlInstanceSslRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchGaussMySqlInstanceSsl);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return AsyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>
     */
    public AsyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslAsyncInvoker(
        SwitchGaussMySqlInstanceSslRequest request) {
        return new AsyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>(request,
            GaussDBMeta.switchGaussMySqlInstanceSsl, hcClient);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return CompletableFuture<UpdateAuditLogResponse>
     */
    public CompletableFuture<UpdateAuditLogResponse> updateAuditLogAsync(UpdateAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateAuditLog);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>
     */
    public AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLogAsyncInvoker(
        UpdateAuditLogRequest request) {
        return new AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>(request, GaussDBMeta.updateAuditLog,
            hcClient);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsync(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsyncInvoker(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>(request,
            GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationAsync(
        UpdateGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlConfiguration);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationAsyncInvoker(
        UpdateGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>(request,
            GaussDBMeta.updateGaussMySqlConfiguration, hcClient);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlDatabaseCommentResponse>
     */
    public CompletableFuture<UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentAsync(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseComment);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentAsyncInvoker(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>(
            request, GaussDBMeta.updateGaussMySqlDatabaseComment, hcClient);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public CompletableFuture<UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentAsync(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentAsyncInvoker(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>(
            request, GaussDBMeta.updateGaussMySqlDatabaseUserComment, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceAliasResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasAsync(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceAlias);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasAsyncInvoker(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>(request,
            GaussDBMeta.updateGaussMySqlInstanceAlias, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceEipResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipAsync(
        UpdateGaussMySqlInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipAsyncInvoker(
        UpdateGaussMySqlInstanceEipRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>(request,
            GaussDBMeta.updateGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpAsync(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpAsyncInvoker(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>(
            request, GaussDBMeta.updateGaussMySqlInstanceInternalIp, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceNameResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsync(
        UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsyncInvoker(
        UpdateGaussMySqlInstanceNameRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>(request,
            GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowAsync(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowAsyncInvoker(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>(
            request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow, hcClient);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstancePortRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstancePortResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortAsync(
        UpdateGaussMySqlInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstancePort);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstancePortRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortAsyncInvoker(
        UpdateGaussMySqlInstancePortRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>(request,
            GaussDBMeta.updateGaussMySqlInstancePort, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupAsync(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupAsyncInvoker(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>(
            request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlQuotasResponse>
     */
    public CompletableFuture<UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsync(
        UpdateGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsyncInvoker(
        UpdateGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>(request,
            GaussDBMeta.updateGaussMySqlQuotas, hcClient);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return CompletableFuture<UpdateInstanceMonitorResponse>
     */
    public CompletableFuture<UpdateInstanceMonitorResponse> updateInstanceMonitorAsync(
        UpdateInstanceMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateInstanceMonitor);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>
     */
    public AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitorAsyncInvoker(
        UpdateInstanceMonitorRequest request) {
        return new AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>(request,
            GaussDBMeta.updateInstanceMonitor, hcClient);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return CompletableFuture<UpdateProxyConnectionPoolTypeResponse>
     */
    public CompletableFuture<UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolTypeAsync(
        UpdateProxyConnectionPoolTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyConnectionPoolType);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return AsyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse>
     */
    public AsyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolTypeAsyncInvoker(
        UpdateProxyConnectionPoolTypeRequest request) {
        return new AsyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse>(request,
            GaussDBMeta.updateProxyConnectionPoolType, hcClient);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxyPortRequest 请求对象
     * @return CompletableFuture<UpdateProxyPortResponse>
     */
    public CompletableFuture<UpdateProxyPortResponse> updateProxyPortAsync(UpdateProxyPortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyPort);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxyPortRequest 请求对象
     * @return AsyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse>
     */
    public AsyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse> updateProxyPortAsyncInvoker(
        UpdateProxyPortRequest request) {
        return new AsyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse>(request, GaussDBMeta.updateProxyPort,
            hcClient);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxySessionConsistenceRequest 请求对象
     * @return CompletableFuture<UpdateProxySessionConsistenceResponse>
     */
    public CompletableFuture<UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceAsync(
        UpdateProxySessionConsistenceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxySessionConsistence);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProxySessionConsistenceRequest 请求对象
     * @return AsyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>
     */
    public AsyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceAsyncInvoker(
        UpdateProxySessionConsistenceRequest request) {
        return new AsyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>(request,
            GaussDBMeta.updateProxySessionConsistence, hcClient);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransactionSplitStatusRequest 请求对象
     * @return CompletableFuture<UpdateTransactionSplitStatusResponse>
     */
    public CompletableFuture<UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusAsync(
        UpdateTransactionSplitStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateTransactionSplitStatus);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransactionSplitStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>
     */
    public AsyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusAsyncInvoker(
        UpdateTransactionSplitStatusRequest request) {
        return new AsyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>(request,
            GaussDBMeta.updateTransactionSplitStatus, hcClient);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return CompletableFuture<UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public CompletableFuture<UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseAsync(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return AsyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public AsyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseAsyncInvoker(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return new AsyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>(
            request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<DeleteSqlFilterRuleResponse>
     */
    public CompletableFuture<DeleteSqlFilterRuleResponse> deleteSqlFilterRuleAsync(DeleteSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteSqlFilterRule);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>
     */
    public AsyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRuleAsyncInvoker(
        DeleteSqlFilterRuleRequest request) {
        return new AsyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>(request,
            GaussDBMeta.deleteSqlFilterRule, hcClient);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<SetSqlFilterRuleResponse>
     */
    public CompletableFuture<SetSqlFilterRuleResponse> setSqlFilterRuleAsync(SetSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setSqlFilterRule);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>
     */
    public AsyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRuleAsyncInvoker(
        SetSqlFilterRuleRequest request) {
        return new AsyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>(request,
            GaussDBMeta.setSqlFilterRule, hcClient);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterControlRequest 请求对象
     * @return CompletableFuture<ShowSqlFilterControlResponse>
     */
    public CompletableFuture<ShowSqlFilterControlResponse> showSqlFilterControlAsync(
        ShowSqlFilterControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showSqlFilterControl);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterControlRequest 请求对象
     * @return AsyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>
     */
    public AsyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControlAsyncInvoker(
        ShowSqlFilterControlRequest request) {
        return new AsyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>(request,
            GaussDBMeta.showSqlFilterControl, hcClient);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<ShowSqlFilterRuleResponse>
     */
    public CompletableFuture<ShowSqlFilterRuleResponse> showSqlFilterRuleAsync(ShowSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showSqlFilterRule);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>
     */
    public AsyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRuleAsyncInvoker(
        ShowSqlFilterRuleRequest request) {
        return new AsyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>(request,
            GaussDBMeta.showSqlFilterRule, hcClient);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlFilterControlRequest 请求对象
     * @return CompletableFuture<UpdateSqlFilterControlResponse>
     */
    public CompletableFuture<UpdateSqlFilterControlResponse> updateSqlFilterControlAsync(
        UpdateSqlFilterControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateSqlFilterControl);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSqlFilterControlRequest 请求对象
     * @return AsyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>
     */
    public AsyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControlAsyncInvoker(
        UpdateSqlFilterControlRequest request) {
        return new AsyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>(request,
            GaussDBMeta.updateSqlFilterControl, hcClient);
    }

}

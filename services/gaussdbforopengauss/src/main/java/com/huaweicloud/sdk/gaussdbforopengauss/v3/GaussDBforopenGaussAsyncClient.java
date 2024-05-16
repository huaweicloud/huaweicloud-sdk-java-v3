package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopIoTrafficsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopIoTrafficsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordResponse;

import java.util.concurrent.CompletableFuture;

public class GaussDBforopenGaussAsyncClient {

    protected HcClient hcClient;

    public GaussDBforopenGaussAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforopenGaussAsyncClient> newBuilder() {
        ClientBuilder<GaussDBforopenGaussAsyncClient> clientBuilder =
            new ClientBuilder<>(GaussDBforopenGaussAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return CompletableFuture<AddInstanceTagsResponse>
     */
    public CompletableFuture<AddInstanceTagsResponse> addInstanceTagsAsync(AddInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.addInstanceTags);
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return AsyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse>
     */
    public AsyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTagsAsyncInvoker(
        AddInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.addInstanceTags, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return CompletableFuture<AllowDbPrivilegesResponse>
     */
    public CompletableFuture<AllowDbPrivilegesResponse> allowDbPrivilegesAsync(AllowDbPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbPrivileges);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return AsyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse>
     */
    public AsyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivilegesAsyncInvoker(
        AllowDbPrivilegesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbPrivileges, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.attachEip);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.attachEip, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return CompletableFuture<CreateConfigurationTemplateResponse>
     */
    public CompletableFuture<CreateConfigurationTemplateResponse> createConfigurationTemplateAsync(
        CreateConfigurationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createConfigurationTemplate);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse>
     */
    public AsyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplateAsyncInvoker(
        CreateConfigurationTemplateRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createConfigurationTemplate, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<CreateDatabaseSchemasResponse>
     */
    public CompletableFuture<CreateDatabaseSchemasResponse> createDatabaseSchemasAsync(
        CreateDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseSchemas);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse>
     */
    public AsyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemasAsyncInvoker(
        CreateDatabaseSchemasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseSchemas, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return CompletableFuture<CreateDbInstanceResponse>
     */
    public CompletableFuture<CreateDbInstanceResponse> createDbInstanceAsync(CreateDbInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return AsyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse>
     */
    public AsyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstanceAsyncInvoker(
        CreateDbInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDbInstance, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDbUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createInstance, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return CompletableFuture<CreateRestoreInstanceResponse>
     */
    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(
        CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(
        CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createRestoreInstance, hcClient);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return CompletableFuture<CreateSlowLogDownloadResponse>
     */
    public CompletableFuture<CreateSlowLogDownloadResponse> createSlowLogDownloadAsync(
        CreateSlowLogDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createSlowLogDownload);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return AsyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse>
     */
    public AsyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> createSlowLogDownloadAsyncInvoker(
        CreateSlowLogDownloadRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createSlowLogDownload, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteInstanceTagResponse>
     */
    public CompletableFuture<DeleteInstanceTagResponse> deleteInstanceTagAsync(DeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstanceTag);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagAsyncInvoker(
        DeleteInstanceTagRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteJob);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteJob, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteManualBackup, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return CompletableFuture<DownloadBackupResponse>
     */
    public CompletableFuture<DownloadBackupResponse> downloadBackupAsync(DownloadBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.downloadBackup);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return AsyncInvoker<DownloadBackupRequest, DownloadBackupResponse>
     */
    public AsyncInvoker<DownloadBackupRequest, DownloadBackupResponse> downloadBackupAsyncInvoker(
        DownloadBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.downloadBackup, hcClient);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return CompletableFuture<ListApplicableInstancesResponse>
     */
    public CompletableFuture<ListApplicableInstancesResponse> listApplicableInstancesAsync(
        ListApplicableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listApplicableInstances);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return AsyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse>
     */
    public AsyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstancesAsyncInvoker(
        ListApplicableInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return CompletableFuture<ListAppliedHistoriesResponse>
     */
    public CompletableFuture<ListAppliedHistoriesResponse> listAppliedHistoriesAsync(
        ListAppliedHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAppliedHistories);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse>
     */
    public AsyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistoriesAsyncInvoker(
        ListAppliedHistoriesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAppliedHistories, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return CompletableFuture<ListAvailableFlavorsResponse>
     */
    public CompletableFuture<ListAvailableFlavorsResponse> listAvailableFlavorsAsync(
        ListAvailableFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAvailableFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return AsyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse>
     */
    public AsyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavorsAsyncInvoker(
        ListAvailableFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAvailableFlavors, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listBackups, hcClient);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return CompletableFuture<ListBindedEipsResponse>
     */
    public CompletableFuture<ListBindedEipsResponse> listBindedEipsAsync(ListBindedEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listBindedEips);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return AsyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse>
     */
    public AsyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEipsAsyncInvoker(
        ListBindedEipsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listBindedEips, hcClient);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return CompletableFuture<ListCnInfosBeforeReduceResponse>
     */
    public CompletableFuture<ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceAsync(
        ListCnInfosBeforeReduceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return AsyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse>
     */
    public AsyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceAsyncInvoker(
        ListCnInfosBeforeReduceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce, hcClient);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return CompletableFuture<ListComponentInfosResponse>
     */
    public CompletableFuture<ListComponentInfosResponse> listComponentInfosAsync(ListComponentInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listComponentInfos);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return AsyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse>
     */
    public AsyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfosAsyncInvoker(
        ListComponentInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listComponentInfos, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurations, hcClient);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return CompletableFuture<ListConfigurationsDiffResponse>
     */
    public CompletableFuture<ListConfigurationsDiffResponse> listConfigurationsDiffAsync(
        ListConfigurationsDiffRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurationsDiff);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse>
     */
    public AsyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiffAsyncInvoker(
        ListConfigurationsDiffRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurationsDiff, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<ListDatabaseSchemasResponse>
     */
    public CompletableFuture<ListDatabaseSchemasResponse> listDatabaseSchemasAsync(ListDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse>
     */
    public AsyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemasAsyncInvoker(
        ListDatabaseSchemasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastores, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return CompletableFuture<ListDbBackupsResponse>
     */
    public CompletableFuture<ListDbBackupsResponse> listDbBackupsAsync(ListDbBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return AsyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse>
     */
    public AsyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackupsAsyncInvoker(
        ListDbBackupsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbBackups, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return CompletableFuture<ListDbFlavorsResponse>
     */
    public CompletableFuture<ListDbFlavorsResponse> listDbFlavorsAsync(ListDbFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return AsyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse>
     */
    public AsyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavorsAsyncInvoker(
        ListDbFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbFlavors, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbUsers, hcClient);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return CompletableFuture<ListEpsQuotasResponse>
     */
    public CompletableFuture<ListEpsQuotasResponse> listEpsQuotasAsync(ListEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasAsyncInvoker(
        ListEpsQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavors, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return CompletableFuture<ListGaussDbDatastoresResponse>
     */
    public CompletableFuture<ListGaussDbDatastoresResponse> listGaussDbDatastoresAsync(
        ListGaussDbDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listGaussDbDatastores);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return AsyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse>
     */
    public AsyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastoresAsyncInvoker(
        ListGaussDbDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listGaussDbDatastores, hcClient);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return CompletableFuture<ListHistoryOperationsResponse>
     */
    public CompletableFuture<ListHistoryOperationsResponse> listHistoryOperationsAsync(
        ListHistoryOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listHistoryOperations);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return AsyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse>
     */
    public AsyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperationsAsyncInvoker(
        ListHistoryOperationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listHistoryOperations, hcClient);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return CompletableFuture<ListInstanceErrorLogsResponse>
     */
    public CompletableFuture<ListInstanceErrorLogsResponse> listInstanceErrorLogsAsync(
        ListInstanceErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceErrorLogs);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse>
     */
    public AsyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> listInstanceErrorLogsAsyncInvoker(
        ListInstanceErrorLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceErrorLogs, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstances, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListInstancesDetailsResponse>
     */
    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(
        ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstancesDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsAsyncInvoker(
        ListInstancesDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstancesDetails, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return CompletableFuture<ListParamGroupTemplatesResponse>
     */
    public CompletableFuture<ListParamGroupTemplatesResponse> listParamGroupTemplatesAsync(
        ListParamGroupTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listParamGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return AsyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse>
     */
    public AsyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplatesAsyncInvoker(
        ListParamGroupTemplatesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listParamGroupTemplates, hcClient);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return CompletableFuture<ListPredefinedTagsResponse>
     */
    public CompletableFuture<ListPredefinedTagsResponse> listPredefinedTagsAsync(ListPredefinedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listPredefinedTags);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return AsyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse>
     */
    public AsyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTagsAsyncInvoker(
        ListPredefinedTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listPredefinedTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstances);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return CompletableFuture<ListRestorableInstancesResponse>
     */
    public CompletableFuture<ListRestorableInstancesResponse> listRestorableInstancesAsync(
        ListRestorableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstances);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return AsyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse>
     */
    public AsyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstancesAsyncInvoker(
        ListRestorableInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstances, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listStorageTypes, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTasks, hcClient);
    }

    /**
     * 查询Top IO列表
     *
     * 查询实例数据库进程下的Top IO流量数据，返回与会话信息相关联后的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIoTrafficsRequest 请求对象
     * @return CompletableFuture<ListTopIoTrafficsResponse>
     */
    public CompletableFuture<ListTopIoTrafficsResponse> listTopIoTrafficsAsync(ListTopIoTrafficsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTopIoTraffics);
    }

    /**
     * 查询Top IO列表
     *
     * 查询实例数据库进程下的Top IO流量数据，返回与会话信息相关联后的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIoTrafficsRequest 请求对象
     * @return AsyncInvoker<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse>
     */
    public AsyncInvoker<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse> listTopIoTrafficsAsyncInvoker(
        ListTopIoTrafficsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTopIoTraffics, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return CompletableFuture<ModifyEpsQuotaResponse>
     */
    public CompletableFuture<ModifyEpsQuotaResponse> modifyEpsQuotaAsync(ModifyEpsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyEpsQuota);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return AsyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse>
     */
    public AsyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuotaAsyncInvoker(
        ModifyEpsQuotaRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyEpsQuota, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return CompletableFuture<ResetConfigurationResponse>
     */
    public CompletableFuture<ResetConfigurationResponse> resetConfigurationAsync(ResetConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationAsyncInvoker(
        ResetConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resetConfiguration, hcClient);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resetPwd);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resetPwd, hcClient);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return CompletableFuture<ResizeInstanceFlavorResponse>
     */
    public CompletableFuture<ResizeInstanceFlavorResponse> resizeInstanceFlavorAsync(
        ResizeInstanceFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resizeInstanceFlavor);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse>
     */
    public AsyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavorAsyncInvoker(
        ResizeInstanceFlavorRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resizeInstanceFlavor, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.restartInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.restartInstance, hcClient);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.restoreInstance);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.restoreInstance, hcClient);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return CompletableFuture<RunInstanceActionResponse>
     */
    public CompletableFuture<RunInstanceActionResponse> runInstanceActionAsync(RunInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.runInstanceAction);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return AsyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>
     */
    public AsyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceActionAsyncInvoker(
        RunInstanceActionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.runInstanceAction, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<SearchAutoEnlargePolicyResponse>
     */
    public CompletableFuture<SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyAsync(
        SearchAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyAsyncInvoker(
        SearchAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setBackupPolicy, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(
        SetDbUserPwdRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setDbUserPwd, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return CompletableFuture<ShowBalanceStatusResponse>
     */
    public CompletableFuture<ShowBalanceStatusResponse> showBalanceStatusAsync(ShowBalanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showBalanceStatus);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse>
     */
    public AsyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatusAsyncInvoker(
        ShowBalanceStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showBalanceStatus, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigurationDetailResponse>
     */
    public CompletableFuture<ShowConfigurationDetailResponse> showConfigurationDetailAsync(
        ShowConfigurationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showConfigurationDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailAsyncInvoker(
        ShowConfigurationDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return CompletableFuture<ShowDeploymentFormResponse>
     */
    public CompletableFuture<ShowDeploymentFormResponse> showDeploymentFormAsync(ShowDeploymentFormRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showDeploymentForm);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse>
     */
    public AsyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentFormAsyncInvoker(
        ShowDeploymentFormRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showDeploymentForm, hcClient);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowErrorLogSwitchStatusResponse>
     */
    public CompletableFuture<ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusAsync(
        ShowErrorLogSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse>
     */
    public AsyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusAsyncInvoker(
        ShowErrorLogSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return CompletableFuture<ShowInstanceDiskResponse>
     */
    public CompletableFuture<ShowInstanceDiskResponse> showInstanceDiskAsync(ShowInstanceDiskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceDisk);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return AsyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse>
     */
    public AsyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDiskAsyncInvoker(
        ShowInstanceDiskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceDisk, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return CompletableFuture<ShowInstanceParamGroupResponse>
     */
    public CompletableFuture<ShowInstanceParamGroupResponse> showInstanceParamGroupAsync(
        ShowInstanceParamGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroup);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return AsyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse>
     */
    public AsyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroupAsyncInvoker(
        ShowInstanceParamGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroup, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return CompletableFuture<ShowInstanceSnapshotResponse>
     */
    public CompletableFuture<ShowInstanceSnapshotResponse> showInstanceSnapshotAsync(
        ShowInstanceSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceSnapshot);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse>
     */
    public AsyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshotAsyncInvoker(
        ShowInstanceSnapshotRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceSnapshot, hcClient);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showJobDetail);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showJobDetail, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowProjectQuotasResponse>
     */
    public CompletableFuture<ShowProjectQuotasResponse> showProjectQuotasAsync(ShowProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse>
     */
    public AsyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotasAsyncInvoker(
        ShowProjectQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showProjectQuotas, hcClient);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showRecyclePolicy);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return CompletableFuture<ShowSlowLogDownloadResponse>
     */
    public CompletableFuture<ShowSlowLogDownloadResponse> showSlowLogDownloadAsync(ShowSlowLogDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowLogDownload);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return AsyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse>
     */
    public AsyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> showSlowLogDownloadAsyncInvoker(
        ShowSlowLogDownloadRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowLogDownload, hcClient);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowSslCertDownloadLinkResponse>
     */
    public CompletableFuture<ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkAsync(
        ShowSslCertDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSslCertDownloadLink);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse>
     */
    public AsyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkAsyncInvoker(
        ShowSslCertDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSslCertDownloadLink, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return CompletableFuture<ShowUpgradeCandidateVersionsResponse>
     */
    public CompletableFuture<ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsAsync(
        ShowUpgradeCandidateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse>
     */
    public AsyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsAsyncInvoker(
        ShowUpgradeCandidateVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions, hcClient);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.startInstance);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return AsyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public AsyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceAsyncInvoker(
        StartInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.startInstance, hcClient);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return CompletableFuture<StopBackupResponse>
     */
    public CompletableFuture<StopBackupResponse> stopBackupAsync(StopBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return AsyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public AsyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupAsyncInvoker(StopBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopBackup, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchConfigurationResponse>
     */
    public CompletableFuture<SwitchConfigurationResponse> switchConfigurationAsync(SwitchConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationAsyncInvoker(
        SwitchConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchConfiguration, hcClient);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return CompletableFuture<SwitchShardResponse>
     */
    public CompletableFuture<SwitchShardResponse> switchShardAsync(SwitchShardRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchShard);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return AsyncInvoker<SwitchShardRequest, SwitchShardResponse>
     */
    public AsyncInvoker<SwitchShardRequest, SwitchShardResponse> switchShardAsyncInvoker(SwitchShardRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchShard, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceName, hcClient);
    }

    /**
     * 实例内核版本升级
     *
     * GaussDB(for openGauss)实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 升级回退：热补丁回退，无业务中断时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceVersionRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceVersionResponse>
     */
    public CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersionAsync(
        UpgradeInstanceVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstanceVersion);
    }

    /**
     * 实例内核版本升级
     *
     * GaussDB(for openGauss)实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 升级回退：热补丁回退，无业务中断时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse>
     */
    public AsyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> upgradeInstanceVersionAsyncInvoker(
        UpgradeInstanceVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstanceVersion, hcClient);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return CompletableFuture<ValidateParaGroupNameResponse>
     */
    public CompletableFuture<ValidateParaGroupNameResponse> validateParaGroupNameAsync(
        ValidateParaGroupNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.validateParaGroupName);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return AsyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse>
     */
    public AsyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupNameAsyncInvoker(
        ValidateParaGroupNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.validateParaGroupName, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return CompletableFuture<ValidateWeakPasswordResponse>
     */
    public CompletableFuture<ValidateWeakPasswordResponse> validateWeakPasswordAsync(
        ValidateWeakPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordAsyncInvoker(
        ValidateWeakPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.validateWeakPassword, hcClient);
    }

}

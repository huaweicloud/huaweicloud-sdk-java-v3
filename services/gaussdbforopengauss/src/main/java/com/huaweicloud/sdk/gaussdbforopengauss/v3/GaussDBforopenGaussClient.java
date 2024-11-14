package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordResponse;

public class GaussDBforopenGaussClient {

    protected HcClient hcClient;

    public GaussDBforopenGaussClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforopenGaussClient> newBuilder() {
        ClientBuilder<GaussDBforopenGaussClient> clientBuilder = new ClientBuilder<>(GaussDBforopenGaussClient::new);
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
     * @return AddInstanceTagsResponse
     */
    public AddInstanceTagsResponse addInstanceTags(AddInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.addInstanceTags);
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return SyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse>
     */
    public SyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTagsInvoker(
        AddInstanceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.addInstanceTags, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return AllowDbPrivilegesResponse
     */
    public AllowDbPrivilegesResponse allowDbPrivileges(AllowDbPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbPrivileges);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return SyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse>
     */
    public SyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivilegesInvoker(
        AllowDbPrivilegesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbPrivileges, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.attachEip);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.attachEip, hcClient);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return ConfirmRestoredDataResponse
     */
    public ConfirmRestoredDataResponse confirmRestoredData(ConfirmRestoredDataRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.confirmRestoredData);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return SyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse>
     */
    public SyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> confirmRestoredDataInvoker(
        ConfirmRestoredDataRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.confirmRestoredData, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return CreateConfigurationTemplateResponse
     */
    public CreateConfigurationTemplateResponse createConfigurationTemplate(CreateConfigurationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createConfigurationTemplate);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return SyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse>
     */
    public SyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplateInvoker(
        CreateConfigurationTemplateRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createConfigurationTemplate, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return CreateDatabaseSchemasResponse
     */
    public CreateDatabaseSchemasResponse createDatabaseSchemas(CreateDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseSchemas);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse>
     */
    public SyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemasInvoker(
        CreateDatabaseSchemasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseSchemas, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return CreateDbInstanceResponse
     */
    public CreateDbInstanceResponse createDbInstance(CreateDbInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return SyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse>
     */
    public SyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstanceInvoker(
        CreateDbInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDbInstance, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDbUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return CreateGaussDbInstanceResponse
     */
    public CreateGaussDbInstanceResponse createGaussDbInstance(CreateGaussDbInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createGaussDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return SyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse>
     */
    public SyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> createGaussDbInstanceInvoker(
        CreateGaussDbInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createGaussDbInstance, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createInstance, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return CreateRestoreInstanceResponse
     */
    public CreateRestoreInstanceResponse createRestoreInstance(CreateRestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceInvoker(
        CreateRestoreInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createRestoreInstance, hcClient);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return CreateSlowLogDownloadResponse
     */
    public CreateSlowLogDownloadResponse createSlowLogDownload(CreateSlowLogDownloadRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createSlowLogDownload);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return SyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse>
     */
    public SyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> createSlowLogDownloadInvoker(
        CreateSlowLogDownloadRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createSlowLogDownload, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return DeleteInstanceTagResponse
     */
    public DeleteInstanceTagResponse deleteInstanceTag(DeleteInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstanceTag);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagInvoker(
        DeleteInstanceTagRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteJob);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteJob, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteManualBackup, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return DownloadBackupResponse
     */
    public DownloadBackupResponse downloadBackup(DownloadBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.downloadBackup);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return SyncInvoker<DownloadBackupRequest, DownloadBackupResponse>
     */
    public SyncInvoker<DownloadBackupRequest, DownloadBackupResponse> downloadBackupInvoker(
        DownloadBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.downloadBackup, hcClient);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return InstallKernelPluginResponse
     */
    public InstallKernelPluginResponse installKernelPlugin(InstallKernelPluginRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.installKernelPlugin);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return SyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse>
     */
    public SyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse> installKernelPluginInvoker(
        InstallKernelPluginRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.installKernelPlugin, hcClient);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return ListApplicableInstancesResponse
     */
    public ListApplicableInstancesResponse listApplicableInstances(ListApplicableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listApplicableInstances);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return SyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse>
     */
    public SyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstancesInvoker(
        ListApplicableInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return ListAppliedHistoriesResponse
     */
    public ListAppliedHistoriesResponse listAppliedHistories(ListAppliedHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listAppliedHistories);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return SyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse>
     */
    public SyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistoriesInvoker(
        ListAppliedHistoriesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listAppliedHistories, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return ListAvailableFlavorsResponse
     */
    public ListAvailableFlavorsResponse listAvailableFlavors(ListAvailableFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listAvailableFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return SyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse>
     */
    public SyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavorsInvoker(
        ListAvailableFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listAvailableFlavors, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listBackups, hcClient);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return ListBindedEipsResponse
     */
    public ListBindedEipsResponse listBindedEips(ListBindedEipsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listBindedEips);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return SyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse>
     */
    public SyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEipsInvoker(
        ListBindedEipsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listBindedEips, hcClient);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return ListCnInfosBeforeReduceResponse
     */
    public ListCnInfosBeforeReduceResponse listCnInfosBeforeReduce(ListCnInfosBeforeReduceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return SyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse>
     */
    public SyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceInvoker(
        ListCnInfosBeforeReduceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce, hcClient);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return ListComponentInfosResponse
     */
    public ListComponentInfosResponse listComponentInfos(ListComponentInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listComponentInfos);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return SyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse>
     */
    public SyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfosInvoker(
        ListComponentInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listComponentInfos, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurations, hcClient);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return ListConfigurationsDiffResponse
     */
    public ListConfigurationsDiffResponse listConfigurationsDiff(ListConfigurationsDiffRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurationsDiff);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return SyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse>
     */
    public SyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiffInvoker(
        ListConfigurationsDiffRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurationsDiff, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return ListDatabaseSchemasResponse
     */
    public ListDatabaseSchemasResponse listDatabaseSchemas(ListDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse>
     */
    public SyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemasInvoker(
        ListDatabaseSchemasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastores, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return ListDbBackupsResponse
     */
    public ListDbBackupsResponse listDbBackups(ListDbBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return SyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse>
     */
    public SyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackupsInvoker(ListDbBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbBackups, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return ListDbFlavorsResponse
     */
    public ListDbFlavorsResponse listDbFlavors(ListDbFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return SyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse>
     */
    public SyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavorsInvoker(ListDbFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbFlavors, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbUsers, hcClient);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return ListEpsQuotasResponse
     */
    public ListEpsQuotasResponse listEpsQuotas(ListEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasInvoker(ListEpsQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavors, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return ListGaussDbDatastoresResponse
     */
    public ListGaussDbDatastoresResponse listGaussDbDatastores(ListGaussDbDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listGaussDbDatastores);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return SyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse>
     */
    public SyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastoresInvoker(
        ListGaussDbDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listGaussDbDatastores, hcClient);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return ListHistoryOperationsResponse
     */
    public ListHistoryOperationsResponse listHistoryOperations(ListHistoryOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listHistoryOperations);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return SyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse>
     */
    public SyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperationsInvoker(
        ListHistoryOperationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listHistoryOperations, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return ListInstanceDetailsResponse
     */
    public ListInstanceDetailsResponse listInstanceDetails(ListInstanceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return SyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse>
     */
    public SyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse> listInstanceDetailsInvoker(
        ListInstanceDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceDetails, hcClient);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return ListInstanceErrorLogsResponse
     */
    public ListInstanceErrorLogsResponse listInstanceErrorLogs(ListInstanceErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceErrorLogs);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return SyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse>
     */
    public SyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> listInstanceErrorLogsInvoker(
        ListInstanceErrorLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceErrorLogs, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstances, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return ListInstancesDetailsResponse
     */
    public ListInstancesDetailsResponse listInstancesDetails(ListInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstancesDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsInvoker(
        ListInstancesDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return ListKernelPluginsResponse
     */
    public ListKernelPluginsResponse listKernelPlugins(ListKernelPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listKernelPlugins);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return SyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse>
     */
    public SyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse> listKernelPluginsInvoker(
        ListKernelPluginsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listKernelPlugins, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return ListParamGroupTemplatesResponse
     */
    public ListParamGroupTemplatesResponse listParamGroupTemplates(ListParamGroupTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listParamGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return SyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse>
     */
    public SyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplatesInvoker(
        ListParamGroupTemplatesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listParamGroupTemplates, hcClient);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return ListPluginExtensionsResponse
     */
    public ListPluginExtensionsResponse listPluginExtensions(ListPluginExtensionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listPluginExtensions);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return SyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse>
     */
    public SyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse> listPluginExtensionsInvoker(
        ListPluginExtensionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listPluginExtensions, hcClient);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return ListPredefinedTagsResponse
     */
    public ListPredefinedTagsResponse listPredefinedTags(ListPredefinedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listPredefinedTags);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return SyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse>
     */
    public SyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTagsInvoker(
        ListPredefinedTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listPredefinedTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstances);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return ListRestorableInstancesResponse
     */
    public ListRestorableInstancesResponse listRestorableInstances(ListRestorableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstances);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return SyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse>
     */
    public SyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstancesInvoker(
        ListRestorableInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstances, hcClient);
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
     * @return ListRestoreTimesResponse
     */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRestoreTimes);
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
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse
     */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listStorageTypes, hcClient);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return ListSupportKernelPluginsResponse
     */
    public ListSupportKernelPluginsResponse listSupportKernelPlugins(ListSupportKernelPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSupportKernelPlugins);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return SyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse>
     */
    public SyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> listSupportKernelPluginsInvoker(
        ListSupportKernelPluginsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSupportKernelPlugins, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTasks, hcClient);
    }

    /**
     * 查询Top IO列表
     *
     * 查询实例数据库进程下的Top IO流量数据，返回与会话信息相关联后的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIoTrafficsRequest 请求对象
     * @return ListTopIoTrafficsResponse
     */
    public ListTopIoTrafficsResponse listTopIoTraffics(ListTopIoTrafficsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTopIoTraffics);
    }

    /**
     * 查询Top IO列表
     *
     * 查询实例数据库进程下的Top IO流量数据，返回与会话信息相关联后的结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIoTrafficsRequest 请求对象
     * @return SyncInvoker<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse>
     */
    public SyncInvoker<ListTopIoTrafficsRequest, ListTopIoTrafficsResponse> listTopIoTrafficsInvoker(
        ListTopIoTrafficsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTopIoTraffics, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return ModifyEpsQuotaResponse
     */
    public ModifyEpsQuotaResponse modifyEpsQuota(ModifyEpsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.modifyEpsQuota);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return SyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse>
     */
    public SyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuotaInvoker(
        ModifyEpsQuotaRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.modifyEpsQuota, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return ResetConfigurationResponse
     */
    public ResetConfigurationResponse resetConfiguration(ResetConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationInvoker(
        ResetConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resetConfiguration, hcClient);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetPwd);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resetPwd, hcClient);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return ResizeInstanceFlavorResponse
     */
    public ResizeInstanceFlavorResponse resizeInstanceFlavor(ResizeInstanceFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resizeInstanceFlavor);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return SyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse>
     */
    public SyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavorInvoker(
        ResizeInstanceFlavorRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resizeInstanceFlavor, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.restartInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.restartInstance, hcClient);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.restoreInstance);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(
        RestoreInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.restoreInstance, hcClient);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return ResumePluginExtensionsResponse
     */
    public ResumePluginExtensionsResponse resumePluginExtensions(ResumePluginExtensionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resumePluginExtensions);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return SyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse>
     */
    public SyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> resumePluginExtensionsInvoker(
        ResumePluginExtensionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resumePluginExtensions, hcClient);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return RunInstanceActionResponse
     */
    public RunInstanceActionResponse runInstanceAction(RunInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.runInstanceAction);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>
     */
    public SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceActionInvoker(
        RunInstanceActionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.runInstanceAction, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return SearchAutoEnlargePolicyResponse
     */
    public SearchAutoEnlargePolicyResponse searchAutoEnlargePolicy(SearchAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse>
     */
    public SyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyInvoker(
        SearchAutoEnlargePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setBackupPolicy, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse
     */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setDbUserPwd, hcClient);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return SetKernelPluginLicenseResponse
     */
    public SetKernelPluginLicenseResponse setKernelPluginLicense(SetKernelPluginLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setKernelPluginLicense);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return SyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse>
     */
    public SyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> setKernelPluginLicenseInvoker(
        SetKernelPluginLicenseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setKernelPluginLicense, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return SetNewBackupPolicyResponse
     */
    public SetNewBackupPolicyResponse setNewBackupPolicy(SetNewBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setNewBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse>
     */
    public SyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> setNewBackupPolicyInvoker(
        SetNewBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setNewBackupPolicy, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SetRecyclePolicyResponse
     */
    public SetRecyclePolicyResponse setRecyclePolicy(SetRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return ShowBalanceStatusResponse
     */
    public ShowBalanceStatusResponse showBalanceStatus(ShowBalanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBalanceStatus);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return SyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse>
     */
    public SyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatusInvoker(
        ShowBalanceStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBalanceStatus, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return ShowBatchUpgradeCandidateVersionsResponse
     */
    public ShowBatchUpgradeCandidateVersionsResponse showBatchUpgradeCandidateVersions(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return SyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse>
     */
    public SyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> showBatchUpgradeCandidateVersionsInvoker(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return ShowConfigurationDetailResponse
     */
    public ShowConfigurationDetailResponse showConfigurationDetail(ShowConfigurationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showConfigurationDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailInvoker(
        ShowConfigurationDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return ShowDeploymentFormResponse
     */
    public ShowDeploymentFormResponse showDeploymentForm(ShowDeploymentFormRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showDeploymentForm);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return SyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse>
     */
    public SyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentFormInvoker(
        ShowDeploymentFormRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showDeploymentForm, hcClient);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return ShowErrorLogSwitchStatusResponse
     */
    public ShowErrorLogSwitchStatusResponse showErrorLogSwitchStatus(ShowErrorLogSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse>
     */
    public SyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusInvoker(
        ShowErrorLogSwitchStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return ShowInstanceDiskResponse
     */
    public ShowInstanceDiskResponse showInstanceDisk(ShowInstanceDiskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceDisk);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return SyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse>
     */
    public SyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDiskInvoker(
        ShowInstanceDiskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceDisk, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return ShowInstanceParamGroupResponse
     */
    public ShowInstanceParamGroupResponse showInstanceParamGroup(ShowInstanceParamGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroup);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return SyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse>
     */
    public SyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroupInvoker(
        ShowInstanceParamGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroup, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return ShowInstanceSnapshotResponse
     */
    public ShowInstanceSnapshotResponse showInstanceSnapshot(ShowInstanceSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceSnapshot);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return SyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse>
     */
    public SyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshotInvoker(
        ShowInstanceSnapshotRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceSnapshot, hcClient);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showJobDetail);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showJobDetail, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return ShowProjectQuotasResponse
     */
    public ShowProjectQuotasResponse showProjectQuotas(ShowProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse>
     */
    public SyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotasInvoker(
        ShowProjectQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showProjectQuotas, hcClient);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showRecyclePolicy);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return ShowSlowLogDownloadResponse
     */
    public ShowSlowLogDownloadResponse showSlowLogDownload(ShowSlowLogDownloadRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowLogDownload);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return SyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse>
     */
    public SyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> showSlowLogDownloadInvoker(
        ShowSlowLogDownloadRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowLogDownload, hcClient);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return ShowSslCertDownloadLinkResponse
     */
    public ShowSslCertDownloadLinkResponse showSslCertDownloadLink(ShowSslCertDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSslCertDownloadLink);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse>
     */
    public SyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkInvoker(
        ShowSslCertDownloadLinkRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSslCertDownloadLink, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return ShowUpgradeCandidateVersionsResponse
     */
    public ShowUpgradeCandidateVersionsResponse showUpgradeCandidateVersions(
        ShowUpgradeCandidateVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return SyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse>
     */
    public SyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsInvoker(
        ShowUpgradeCandidateVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions, hcClient);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.startInstance);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return SyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public SyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceInvoker(StartInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.startInstance, hcClient);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return StartMysqlCompatibilityResponse
     */
    public StartMysqlCompatibilityResponse startMysqlCompatibility(StartMysqlCompatibilityRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.startMysqlCompatibility);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return SyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse>
     */
    public SyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> startMysqlCompatibilityInvoker(
        StartMysqlCompatibilityRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.startMysqlCompatibility, hcClient);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return StopBackupResponse
     */
    public StopBackupResponse stopBackup(StopBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return SyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public SyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupInvoker(StopBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopBackup, hcClient);
    }

    /**
     * 停止数据库
     *
     * 停止数据库,同时支持节点级别的停止操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopInstance);
    }

    /**
     * 停止数据库
     *
     * 停止数据库,同时支持节点级别的停止操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopInstance, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SwitchConfigurationResponse
     */
    public SwitchConfigurationResponse switchConfiguration(SwitchConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationInvoker(
        SwitchConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchConfiguration, hcClient);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return SwitchShardResponse
     */
    public SwitchShardResponse switchShard(SwitchShardRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchShard);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return SyncInvoker<SwitchShardRequest, SwitchShardResponse>
     */
    public SyncInvoker<SwitchShardRequest, SwitchShardResponse> switchShardInvoker(SwitchShardRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchShard, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceName, hcClient);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return UpdateMysqlCompatibilityResponse
     */
    public UpdateMysqlCompatibilityResponse updateMysqlCompatibility(UpdateMysqlCompatibilityRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateMysqlCompatibility);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return SyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse>
     */
    public SyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> updateMysqlCompatibilityInvoker(
        UpdateMysqlCompatibilityRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateMysqlCompatibility, hcClient);
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
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstanceVersion);
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
     * @return SyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse>
     */
    public SyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> upgradeInstanceVersionInvoker(
        UpgradeInstanceVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstanceVersion, hcClient);
    }

    /**
     * 批量实例内核版本升级
     *
     * GaussDB批量实例版本升级。包括灰度升级，就地升级、热补丁升级三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 批量实例可升级版本大于当前所有实例的引擎版本，且选择的所有实例，其升级方式和操作方式要保持一致。
     * 若批量实例升级方式是灰度升级，默认升级所有az和分片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstancesVersionRequest 请求对象
     * @return UpgradeInstancesVersionResponse
     */
    public UpgradeInstancesVersionResponse upgradeInstancesVersion(UpgradeInstancesVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstancesVersion);
    }

    /**
     * 批量实例内核版本升级
     *
     * GaussDB批量实例版本升级。包括灰度升级，就地升级、热补丁升级三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 批量实例可升级版本大于当前所有实例的引擎版本，且选择的所有实例，其升级方式和操作方式要保持一致。
     * 若批量实例升级方式是灰度升级，默认升级所有az和分片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstancesVersionRequest 请求对象
     * @return SyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse>
     */
    public SyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> upgradeInstancesVersionInvoker(
        UpgradeInstancesVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstancesVersion, hcClient);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return ValidateParaGroupNameResponse
     */
    public ValidateParaGroupNameResponse validateParaGroupName(ValidateParaGroupNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.validateParaGroupName);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return SyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse>
     */
    public SyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupNameInvoker(
        ValidateParaGroupNameRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.validateParaGroupName, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return ValidateWeakPasswordResponse
     */
    public ValidateWeakPasswordResponse validateWeakPassword(ValidateWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordInvoker(
        ValidateWeakPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.validateWeakPassword, hcClient);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return CreateLimitTaskResponse
     */
    public CreateLimitTaskResponse createLimitTask(CreateLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createLimitTask);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return SyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse>
     */
    public SyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse> createLimitTaskInvoker(
        CreateLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createLimitTask, hcClient);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return DeleteLimitTaskResponse
     */
    public DeleteLimitTaskResponse deleteLimitTask(DeleteLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteLimitTask);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return SyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse>
     */
    public SyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse> deleteLimitTaskInvoker(
        DeleteLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteLimitTask, hcClient);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return ListLimitTaskResponse
     */
    public ListLimitTaskResponse listLimitTask(ListLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listLimitTask);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return SyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse>
     */
    public SyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse> listLimitTaskInvoker(ListLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listLimitTask, hcClient);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return ListNodeLimitSqlModelResponse
     */
    public ListNodeLimitSqlModelResponse listNodeLimitSqlModel(ListNodeLimitSqlModelRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return SyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse>
     */
    public SyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> listNodeLimitSqlModelInvoker(
        ListNodeLimitSqlModelRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel, hcClient);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return ShowLimitTaskResponse
     */
    public ShowLimitTaskResponse showLimitTask(ShowLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showLimitTask);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return SyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse>
     */
    public SyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse> showLimitTaskInvoker(ShowLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showLimitTask, hcClient);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return UpdateLimitTaskResponse
     */
    public UpdateLimitTaskResponse updateLimitTask(UpdateLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateLimitTask);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return SyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse>
     */
    public SyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse> updateLimitTaskInvoker(
        UpdateLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateLimitTask, hcClient);
    }

}

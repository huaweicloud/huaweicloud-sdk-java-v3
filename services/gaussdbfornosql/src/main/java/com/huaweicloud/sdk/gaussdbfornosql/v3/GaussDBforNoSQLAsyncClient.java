package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationToInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationToInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchUpgradeDatabaseVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchUpgradeDatabaseVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CancelInstanceScheduleWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CancelInstanceScheduleWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheMappingRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheMappingResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheMappingRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheMappingResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheMappingsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheMappingsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheRulesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheRulesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDedicatedResourcesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDedicatedResourcesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorInfosRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorInfosResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceMaintenanceWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceMaintenanceWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionStatisticsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionStatisticsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListNosqlTaskListRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListNosqlTaskListResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyDbUserPrivilegeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyDbUserPrivilegeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyInstanceMaintenanceWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyInstanceMaintenanceWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetInstanceDataDumpRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetInstanceDataDumpResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsNewRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsNewResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplyHistoryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplyHistoryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPoliciesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPoliciesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowElbIpGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowElbIpGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowErrorLogRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowErrorLogResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowHighRiskCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceBiactiveRegionsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceBiactiveRegionsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceRoleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceRoleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowIpNumRequirementRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowIpNumRequirementResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowModifyHistoryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowModifyHistoryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPasswordlessConfigRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPasswordlessConfigResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisBigKeysRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisBigKeysResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSecondLevelMonitoringStatusRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSecondLevelMonitoringStatusResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdatePasswordlessConfigRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdatePasswordlessConfigResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionResponse;

import java.util.concurrent.CompletableFuture;

public class GaussDBforNoSQLAsyncClient {

    protected HcClient hcClient;

    public GaussDBforNoSQLAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforNoSQLAsyncClient> newBuilder() {
        ClientBuilder<GaussDBforNoSQLAsyncClient> clientBuilder = new ClientBuilder<>(GaussDBforNoSQLAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationResponse>
     */
    public CompletableFuture<ApplyConfigurationResponse> applyConfigurationAsync(ApplyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>
     */
    public AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.applyConfiguration, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationToInstancesRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationToInstancesResponse>
     */
    public CompletableFuture<ApplyConfigurationToInstancesResponse> applyConfigurationToInstancesAsync(
        ApplyConfigurationToInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfigurationToInstances);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationToInstancesRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationToInstancesRequest, ApplyConfigurationToInstancesResponse>
     */
    public AsyncInvoker<ApplyConfigurationToInstancesRequest, ApplyConfigurationToInstancesResponse> applyConfigurationToInstancesAsyncInvoker(
        ApplyConfigurationToInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.applyConfigurationToInstances, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.batchTagAction, hcClient);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return CompletableFuture<BatchUpgradeDatabaseVersionResponse>
     */
    public CompletableFuture<BatchUpgradeDatabaseVersionResponse> batchUpgradeDatabaseVersionAsync(
        BatchUpgradeDatabaseVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.batchUpgradeDatabaseVersion);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return AsyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse>
     */
    public AsyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse> batchUpgradeDatabaseVersionAsyncInvoker(
        BatchUpgradeDatabaseVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.batchUpgradeDatabaseVersion, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceScheduleWindowRequest 请求对象
     * @return CompletableFuture<CancelInstanceScheduleWindowResponse>
     */
    public CompletableFuture<CancelInstanceScheduleWindowResponse> cancelInstanceScheduleWindowAsync(
        CancelInstanceScheduleWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.cancelInstanceScheduleWindow);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceScheduleWindowRequest 请求对象
     * @return AsyncInvoker<CancelInstanceScheduleWindowRequest, CancelInstanceScheduleWindowResponse>
     */
    public AsyncInvoker<CancelInstanceScheduleWindowRequest, CancelInstanceScheduleWindowResponse> cancelInstanceScheduleWindowAsyncInvoker(
        CancelInstanceScheduleWindowRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.cancelInstanceScheduleWindow, hcClient);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterRecoveryOperationRequest 请求对象
     * @return CompletableFuture<CheckDisasterRecoveryOperationResponse>
     */
    public CompletableFuture<CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationAsync(
        CheckDisasterRecoveryOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterRecoveryOperationRequest 请求对象
     * @return AsyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>
     */
    public AsyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationAsyncInvoker(
        CheckDisasterRecoveryOperationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation, hcClient);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeekPasswordRequest 请求对象
     * @return CompletableFuture<CheckWeekPasswordResponse>
     */
    public CompletableFuture<CheckWeekPasswordResponse> checkWeekPasswordAsync(CheckWeekPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.checkWeekPassword);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeekPasswordRequest 请求对象
     * @return AsyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>
     */
    public AsyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPasswordAsyncInvoker(
        CheckWeekPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.checkWeekPassword, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return CompletableFuture<CompareConfigurationResponse>
     */
    public CompletableFuture<CompareConfigurationResponse> compareConfigurationAsync(
        CompareConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationAsyncInvoker(
        CompareConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackRequest 请求对象
     * @return CompletableFuture<CreateBackResponse>
     */
    public CompletableFuture<CreateBackResponse> createBackAsync(CreateBackRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createBack);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackRequest 请求对象
     * @return AsyncInvoker<CreateBackRequest, CreateBackResponse>
     */
    public AsyncInvoker<CreateBackRequest, CreateBackResponse> createBackAsyncInvoker(CreateBackRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createBack, hcClient);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateColdVolumeRequest 请求对象
     * @return CompletableFuture<CreateColdVolumeResponse>
     */
    public CompletableFuture<CreateColdVolumeResponse> createColdVolumeAsync(CreateColdVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createColdVolume);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateColdVolumeRequest 请求对象
     * @return AsyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>
     */
    public AsyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolumeAsyncInvoker(
        CreateColdVolumeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createColdVolume, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createConfiguration, hcClient);
    }

    /**
     * 创建内存加速映射
     *
     * 创建内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheMappingRequest 请求对象
     * @return CompletableFuture<CreateDbCacheMappingResponse>
     */
    public CompletableFuture<CreateDbCacheMappingResponse> createDbCacheMappingAsync(
        CreateDbCacheMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDbCacheMapping);
    }

    /**
     * 创建内存加速映射
     *
     * 创建内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheMappingRequest 请求对象
     * @return AsyncInvoker<CreateDbCacheMappingRequest, CreateDbCacheMappingResponse>
     */
    public AsyncInvoker<CreateDbCacheMappingRequest, CreateDbCacheMappingResponse> createDbCacheMappingAsyncInvoker(
        CreateDbCacheMappingRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createDbCacheMapping, hcClient);
    }

    /**
     * 创建内存加速规则
     *
     * 创建内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheRuleRequest 请求对象
     * @return CompletableFuture<CreateDbCacheRuleResponse>
     */
    public CompletableFuture<CreateDbCacheRuleResponse> createDbCacheRuleAsync(CreateDbCacheRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDbCacheRule);
    }

    /**
     * 创建内存加速规则
     *
     * 创建内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheRuleRequest 请求对象
     * @return AsyncInvoker<CreateDbCacheRuleRequest, CreateDbCacheRuleResponse>
     */
    public AsyncInvoker<CreateDbCacheRuleRequest, CreateDbCacheRuleResponse> createDbCacheRuleAsyncInvoker(
        CreateDbCacheRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createDbCacheRule, hcClient);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDbUser);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createDbUser, hcClient);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<CreateDisasterRecoveryResponse>
     */
    public CompletableFuture<CreateDisasterRecoveryResponse> createDisasterRecoveryAsync(
        CreateDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDisasterRecovery);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryAsyncInvoker(
        CreateDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.createInstance, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(
        DeleteBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteConfiguration, hcClient);
    }

    /**
     * 解除内存加速映射
     *
     * 解除指定内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheMappingRequest 请求对象
     * @return CompletableFuture<DeleteDbCacheMappingResponse>
     */
    public CompletableFuture<DeleteDbCacheMappingResponse> deleteDbCacheMappingAsync(
        DeleteDbCacheMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbCacheMapping);
    }

    /**
     * 解除内存加速映射
     *
     * 解除指定内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheMappingRequest 请求对象
     * @return AsyncInvoker<DeleteDbCacheMappingRequest, DeleteDbCacheMappingResponse>
     */
    public AsyncInvoker<DeleteDbCacheMappingRequest, DeleteDbCacheMappingResponse> deleteDbCacheMappingAsyncInvoker(
        DeleteDbCacheMappingRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbCacheMapping, hcClient);
    }

    /**
     * 删除内存加速规则
     *
     * 删除内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheRuleRequest 请求对象
     * @return CompletableFuture<DeleteDbCacheRuleResponse>
     */
    public CompletableFuture<DeleteDbCacheRuleResponse> deleteDbCacheRuleAsync(DeleteDbCacheRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbCacheRule);
    }

    /**
     * 删除内存加速规则
     *
     * 删除内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheRuleRequest 请求对象
     * @return AsyncInvoker<DeleteDbCacheRuleRequest, DeleteDbCacheRuleResponse>
     */
    public AsyncInvoker<DeleteDbCacheRuleRequest, DeleteDbCacheRuleResponse> deleteDbCacheRuleAsyncInvoker(
        DeleteDbCacheRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbCacheRule, hcClient);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbUser);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbUser, hcClient);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<DeleteDisasterRecoveryResponse>
     */
    public CompletableFuture<DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsync(
        DeleteDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDisasterRecovery);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsyncInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnlargeFailNodeRequest 请求对象
     * @return CompletableFuture<DeleteEnlargeFailNodeResponse>
     */
    public CompletableFuture<DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeAsync(
        DeleteEnlargeFailNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnlargeFailNodeRequest 请求对象
     * @return AsyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>
     */
    public AsyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeAsyncInvoker(
        DeleteEnlargeFailNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode, hcClient);
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
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstance);
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
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteInstance, hcClient);
    }

    /**
     * 关闭实例节点会话
     *
     * 关闭实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesSessionRequest 请求对象
     * @return CompletableFuture<DeleteInstancesSessionResponse>
     */
    public CompletableFuture<DeleteInstancesSessionResponse> deleteInstancesSessionAsync(
        DeleteInstancesSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstancesSession);
    }

    /**
     * 关闭实例节点会话
     *
     * 关闭实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesSessionRequest 请求对象
     * @return AsyncInvoker<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse>
     */
    public AsyncInvoker<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> deleteInstancesSessionAsyncInvoker(
        DeleteInstancesSessionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteInstancesSession, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return CompletableFuture<DeleteLtsConfigsResponse>
     */
    public CompletableFuture<DeleteLtsConfigsResponse> deleteLtsConfigsAsync(DeleteLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteLtsConfigs);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return AsyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse>
     */
    public AsyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigsAsyncInvoker(
        DeleteLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.deleteLtsConfigs, hcClient);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodeRequest 请求对象
     * @return CompletableFuture<ExpandInstanceNodeResponse>
     */
    public CompletableFuture<ExpandInstanceNodeResponse> expandInstanceNodeAsync(ExpandInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.expandInstanceNode);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>
     */
    public AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNodeAsyncInvoker(
        ExpandInstanceNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.expandInstanceNode, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListAvailableFlavorInfosResponse>
     */
    public CompletableFuture<ListAvailableFlavorInfosResponse> listAvailableFlavorInfosAsync(
        ListAvailableFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>
     */
    public AsyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfosAsyncInvoker(
        ListAvailableFlavorInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos, hcClient);
    }

    /**
     * 查询GeminiDB(for Cassandra)数据库慢日志
     *
     * 查询GeminiDB(for Cassandra)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCassandraSlowLogsRequest 请求对象
     * @return CompletableFuture<ListCassandraSlowLogsResponse>
     */
    public CompletableFuture<ListCassandraSlowLogsResponse> listCassandraSlowLogsAsync(
        ListCassandraSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listCassandraSlowLogs);
    }

    /**
     * 查询GeminiDB(for Cassandra)数据库慢日志
     *
     * 查询GeminiDB(for Cassandra)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCassandraSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse>
     */
    public AsyncInvoker<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> listCassandraSlowLogsAsyncInvoker(
        ListCassandraSlowLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listCassandraSlowLogs, hcClient);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDatastoresRequest 请求对象
     * @return CompletableFuture<ListConfigurationDatastoresResponse>
     */
    public CompletableFuture<ListConfigurationDatastoresResponse> listConfigurationDatastoresAsync(
        ListConfigurationDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationDatastores);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDatastoresRequest 请求对象
     * @return AsyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>
     */
    public AsyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastoresAsyncInvoker(
        ListConfigurationDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurationDatastores, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationTemplatesRequest 请求对象
     * @return CompletableFuture<ListConfigurationTemplatesResponse>
     */
    public CompletableFuture<ListConfigurationTemplatesResponse> listConfigurationTemplatesAsync(
        ListConfigurationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>
     */
    public AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplatesAsyncInvoker(
        ListConfigurationTemplatesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurationTemplates, hcClient);
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
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurations);
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
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurations, hcClient);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDatastores);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listDatastores, hcClient);
    }

    /**
     * 查询内存加速映射列表和详情
     *
     * 根据指定条件查询内存加速映射关系列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheMappingsRequest 请求对象
     * @return CompletableFuture<ListDbCacheMappingsResponse>
     */
    public CompletableFuture<ListDbCacheMappingsResponse> listDbCacheMappingsAsync(ListDbCacheMappingsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDbCacheMappings);
    }

    /**
     * 查询内存加速映射列表和详情
     *
     * 根据指定条件查询内存加速映射关系列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheMappingsRequest 请求对象
     * @return AsyncInvoker<ListDbCacheMappingsRequest, ListDbCacheMappingsResponse>
     */
    public AsyncInvoker<ListDbCacheMappingsRequest, ListDbCacheMappingsResponse> listDbCacheMappingsAsyncInvoker(
        ListDbCacheMappingsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listDbCacheMappings, hcClient);
    }

    /**
     * 查询内存加速规则列表和详情
     *
     * 查询内存加速规则列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheRulesRequest 请求对象
     * @return CompletableFuture<ListDbCacheRulesResponse>
     */
    public CompletableFuture<ListDbCacheRulesResponse> listDbCacheRulesAsync(ListDbCacheRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDbCacheRules);
    }

    /**
     * 查询内存加速规则列表和详情
     *
     * 查询内存加速规则列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheRulesRequest 请求对象
     * @return AsyncInvoker<ListDbCacheRulesRequest, ListDbCacheRulesResponse>
     */
    public AsyncInvoker<ListDbCacheRulesRequest, ListDbCacheRulesResponse> listDbCacheRulesAsyncInvoker(
        ListDbCacheRulesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listDbCacheRules, hcClient);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDbUsers);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listDbUsers, hcClient);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListDedicatedResourcesResponse>
     */
    public CompletableFuture<ListDedicatedResourcesResponse> listDedicatedResourcesAsync(
        ListDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesAsyncInvoker(
        ListDedicatedResourcesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return CompletableFuture<ListEpsQuotasResponse>
     */
    public CompletableFuture<ListEpsQuotasResponse> listEpsQuotasAsync(ListEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasAsyncInvoker(
        ListEpsQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListFlavorInfosResponse>
     */
    public CompletableFuture<ListFlavorInfosResponse> listFlavorInfosAsync(ListFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosAsyncInvoker(
        ListFlavorInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavors);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listFlavors, hcClient);
    }

    /**
     * 查询GeminiDB(for influxdb)数据库慢日志
     *
     * 查询GeminiDB(for influxdb)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInfluxdbSlowLogsRequest 请求对象
     * @return CompletableFuture<ListInfluxdbSlowLogsResponse>
     */
    public CompletableFuture<ListInfluxdbSlowLogsResponse> listInfluxdbSlowLogsAsync(
        ListInfluxdbSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInfluxdbSlowLogs);
    }

    /**
     * 查询GeminiDB(for influxdb)数据库慢日志
     *
     * 查询GeminiDB(for influxdb)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInfluxdbSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse>
     */
    public AsyncInvoker<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> listInfluxdbSlowLogsAsyncInvoker(
        ListInfluxdbSlowLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInfluxdbSlowLogs, hcClient);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDatabasesRequest 请求对象
     * @return CompletableFuture<ListInstanceDatabasesResponse>
     */
    public CompletableFuture<ListInstanceDatabasesResponse> listInstanceDatabasesAsync(
        ListInstanceDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceDatabases);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDatabasesRequest 请求对象
     * @return AsyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>
     */
    public AsyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabasesAsyncInvoker(
        ListInstanceDatabasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceDatabases, hcClient);
    }

    /**
     * 
     *
     * 查询实例可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMaintenanceWindowRequest 请求对象
     * @return CompletableFuture<ListInstanceMaintenanceWindowResponse>
     */
    public CompletableFuture<ListInstanceMaintenanceWindowResponse> listInstanceMaintenanceWindowAsync(
        ListInstanceMaintenanceWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceMaintenanceWindow);
    }

    /**
     * 
     *
     * 查询实例可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMaintenanceWindowRequest 请求对象
     * @return AsyncInvoker<ListInstanceMaintenanceWindowRequest, ListInstanceMaintenanceWindowResponse>
     */
    public AsyncInvoker<ListInstanceMaintenanceWindowRequest, ListInstanceMaintenanceWindowResponse> listInstanceMaintenanceWindowAsyncInvoker(
        ListInstanceMaintenanceWindowRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceMaintenanceWindow, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByResourceTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByResourceTagsResponse>
     */
    public CompletableFuture<ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsync(
        ListInstancesByResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByResourceTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>
     */
    public AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsyncInvoker(
        ListInstancesByResourceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesByResourceTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesByTags, hcClient);
    }

    /**
     * 获取节点会话列表
     *
     * 获取节点会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionRequest 请求对象
     * @return CompletableFuture<ListInstancesSessionResponse>
     */
    public CompletableFuture<ListInstancesSessionResponse> listInstancesSessionAsync(
        ListInstancesSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesSession);
    }

    /**
     * 获取节点会话列表
     *
     * 获取节点会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionRequest 请求对象
     * @return AsyncInvoker<ListInstancesSessionRequest, ListInstancesSessionResponse>
     */
    public AsyncInvoker<ListInstancesSessionRequest, ListInstancesSessionResponse> listInstancesSessionAsyncInvoker(
        ListInstancesSessionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesSession, hcClient);
    }

    /**
     * 查询实例节点会话统计信息
     *
     * 查询实例节点会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionStatisticsRequest 请求对象
     * @return CompletableFuture<ListInstancesSessionStatisticsResponse>
     */
    public CompletableFuture<ListInstancesSessionStatisticsResponse> listInstancesSessionStatisticsAsync(
        ListInstancesSessionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesSessionStatistics);
    }

    /**
     * 查询实例节点会话统计信息
     *
     * 查询实例节点会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionStatisticsRequest 请求对象
     * @return AsyncInvoker<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse>
     */
    public AsyncInvoker<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> listInstancesSessionStatisticsAsyncInvoker(
        ListInstancesSessionStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesSessionStatistics, hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 查询任务列表和详情，默认查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listJobs);
    }

    /**
     * 查询任务列表和详情
     *
     * 查询任务列表和详情，默认查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listJobs, hcClient);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 分页查询实例关联的LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return CompletableFuture<ListLtsConfigsResponse>
     */
    public CompletableFuture<ListLtsConfigsResponse> listLtsConfigsAsync(ListLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listLtsConfigs);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 分页查询实例关联的LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsAsyncInvoker(
        ListLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listLtsConfigs, hcClient);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库错误日志
     *
     * 查询GeminiDB(for Mongo)数据库错误日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbErrorLogsRequest 请求对象
     * @return CompletableFuture<ListMongodbErrorLogsResponse>
     */
    public CompletableFuture<ListMongodbErrorLogsResponse> listMongodbErrorLogsAsync(
        ListMongodbErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listMongodbErrorLogs);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库错误日志
     *
     * 查询GeminiDB(for Mongo)数据库错误日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse>
     */
    public AsyncInvoker<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> listMongodbErrorLogsAsyncInvoker(
        ListMongodbErrorLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listMongodbErrorLogs, hcClient);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库慢日志
     *
     * 查询GeminiDB(for Mongo)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbSlowLogsRequest 请求对象
     * @return CompletableFuture<ListMongodbSlowLogsResponse>
     */
    public CompletableFuture<ListMongodbSlowLogsResponse> listMongodbSlowLogsAsync(ListMongodbSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listMongodbSlowLogs);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库慢日志
     *
     * 查询GeminiDB(for Mongo)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse>
     */
    public AsyncInvoker<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> listMongodbSlowLogsAsyncInvoker(
        ListMongodbSlowLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listMongodbSlowLogs, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNosqlTaskListRequest 请求对象
     * @return CompletableFuture<ListNosqlTaskListResponse>
     */
    public CompletableFuture<ListNosqlTaskListResponse> listNosqlTaskListAsync(ListNosqlTaskListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listNosqlTaskList);
    }

    /**
     * 查询定时任务列表
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNosqlTaskListRequest 请求对象
     * @return AsyncInvoker<ListNosqlTaskListRequest, ListNosqlTaskListResponse>
     */
    public AsyncInvoker<ListNosqlTaskListRequest, ListNosqlTaskListResponse> listNosqlTaskListAsyncInvoker(
        ListNosqlTaskListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listNosqlTaskList, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询GeminiDB(for Redis)数据库慢日志
     *
     * 查询GeminiDB(for Redis)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisSlowLogsRequest 请求对象
     * @return CompletableFuture<ListRedisSlowLogsResponse>
     */
    public CompletableFuture<ListRedisSlowLogsResponse> listRedisSlowLogsAsync(ListRedisSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRedisSlowLogs);
    }

    /**
     * 查询GeminiDB(for Redis)数据库慢日志
     *
     * 查询GeminiDB(for Redis)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse>
     */
    public AsyncInvoker<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> listRedisSlowLogsAsyncInvoker(
        ListRedisSlowLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listRedisSlowLogs, hcClient);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return CompletableFuture<ListRestoreDatabasesResponse>
     */
    public CompletableFuture<ListRestoreDatabasesResponse> listRestoreDatabasesAsync(
        ListRestoreDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreDatabases);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public AsyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesAsyncInvoker(
        ListRestoreDatabasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTablesRequest 请求对象
     * @return CompletableFuture<ListRestoreTablesResponse>
     */
    public CompletableFuture<ListRestoreTablesResponse> listRestoreTablesAsync(ListRestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTables);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTablesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTablesRequest, ListRestoreTablesResponse>
     */
    public AsyncInvoker<ListRestoreTablesRequest, ListRestoreTablesResponse> listRestoreTablesAsyncInvoker(
        ListRestoreTablesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreTables, hcClient);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimeRequest 请求对象
     * @return CompletableFuture<ListRestoreTimeResponse>
     */
    public CompletableFuture<ListRestoreTimeResponse> listRestoreTimeAsync(ListRestoreTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTime);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimeRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>
     */
    public AsyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTimeAsyncInvoker(
        ListRestoreTimeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreTime, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listSlowLogs, hcClient);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<ModifyDbUserPrivilegeResponse>
     */
    public CompletableFuture<ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeAsync(
        ModifyDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>
     */
    public AsyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeAsyncInvoker(
        ModifyDbUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotasRequest 请求对象
     * @return CompletableFuture<ModifyEpsQuotasResponse>
     */
    public CompletableFuture<ModifyEpsQuotasResponse> modifyEpsQuotasAsync(ModifyEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyEpsQuotas);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>
     */
    public AsyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotasAsyncInvoker(
        ModifyEpsQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyEpsQuotas, hcClient);
    }

    /**
     * 查询实例可维护时间段
     *
     * 设置指定实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceMaintenanceWindowRequest 请求对象
     * @return CompletableFuture<ModifyInstanceMaintenanceWindowResponse>
     */
    public CompletableFuture<ModifyInstanceMaintenanceWindowResponse> modifyInstanceMaintenanceWindowAsync(
        ModifyInstanceMaintenanceWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyInstanceMaintenanceWindow);
    }

    /**
     * 查询实例可维护时间段
     *
     * 设置指定实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceMaintenanceWindowRequest 请求对象
     * @return AsyncInvoker<ModifyInstanceMaintenanceWindowRequest, ModifyInstanceMaintenanceWindowResponse>
     */
    public AsyncInvoker<ModifyInstanceMaintenanceWindowRequest, ModifyInstanceMaintenanceWindowResponse> modifyInstanceMaintenanceWindowAsyncInvoker(
        ModifyInstanceMaintenanceWindowRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyInstanceMaintenanceWindow, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPortRequest 请求对象
     * @return CompletableFuture<ModifyPortResponse>
     */
    public CompletableFuture<ModifyPortResponse> modifyPortAsync(ModifyPortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPortRequest 请求对象
     * @return AsyncInvoker<ModifyPortRequest, ModifyPortResponse>
     */
    public AsyncInvoker<ModifyPortRequest, ModifyPortResponse> modifyPortAsyncInvoker(ModifyPortRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyPort, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPublicIpRequest 请求对象
     * @return CompletableFuture<ModifyPublicIpResponse>
     */
    public CompletableFuture<ModifyPublicIpResponse> modifyPublicIpAsync(ModifyPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPublicIp);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPublicIpRequest 请求对象
     * @return AsyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>
     */
    public AsyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIpAsyncInvoker(
        ModifyPublicIpRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyPublicIp, hcClient);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeRequest 请求对象
     * @return CompletableFuture<ModifyVolumeResponse>
     */
    public CompletableFuture<ModifyVolumeResponse> modifyVolumeAsync(ModifyVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyVolume);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeRequest 请求对象
     * @return AsyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>
     */
    public AsyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolumeAsyncInvoker(
        ModifyVolumeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.modifyVolume, hcClient);
    }

    /**
     * 支持节点的开关机
     *
     * 当底层故障导致节点无法正常工作时，可以对该节点执行关机操作，关机后会由其他节点接管业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OfflineNodesRequest 请求对象
     * @return CompletableFuture<OfflineNodesResponse>
     */
    public CompletableFuture<OfflineNodesResponse> offlineNodesAsync(OfflineNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.offlineNodes);
    }

    /**
     * 支持节点的开关机
     *
     * 当底层故障导致节点无法正常工作时，可以对该节点执行关机操作，关机后会由其他节点接管业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OfflineNodesRequest 请求对象
     * @return AsyncInvoker<OfflineNodesRequest, OfflineNodesResponse>
     */
    public AsyncInvoker<OfflineNodesRequest, OfflineNodesResponse> offlineNodesAsyncInvoker(
        OfflineNodesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.offlineNodes, hcClient);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseResumeDataSynchronizationRequest 请求对象
     * @return CompletableFuture<PauseResumeDataSynchronizationResponse>
     */
    public CompletableFuture<PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationAsync(
        PauseResumeDataSynchronizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseResumeDataSynchronizationRequest 请求对象
     * @return AsyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>
     */
    public AsyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationAsyncInvoker(
        PauseResumeDataSynchronizationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization, hcClient);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbUserPasswordRequest 请求对象
     * @return CompletableFuture<ResetDbUserPasswordResponse>
     */
    public CompletableFuture<ResetDbUserPasswordResponse> resetDbUserPasswordAsync(ResetDbUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetDbUserPassword);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>
     */
    public AsyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPasswordAsyncInvoker(
        ResetDbUserPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resetDbUserPassword, hcClient);
    }

    /**
     * 重置自定义参数模板
     *
     * 重置自定义参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParamGroupTemplateRequest 请求对象
     * @return CompletableFuture<ResetParamGroupTemplateResponse>
     */
    public CompletableFuture<ResetParamGroupTemplateResponse> resetParamGroupTemplateAsync(
        ResetParamGroupTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetParamGroupTemplate);
    }

    /**
     * 重置自定义参数模板
     *
     * 重置自定义参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParamGroupTemplateRequest 请求对象
     * @return AsyncInvoker<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse>
     */
    public AsyncInvoker<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> resetParamGroupTemplateAsyncInvoker(
        ResetParamGroupTemplateRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resetParamGroupTemplate, hcClient);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetPassword);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resetPassword, hcClient);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeColdVolumeRequest 请求对象
     * @return CompletableFuture<ResizeColdVolumeResponse>
     */
    public CompletableFuture<ResizeColdVolumeResponse> resizeColdVolumeAsync(ResizeColdVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeColdVolume);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeColdVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>
     */
    public AsyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolumeAsyncInvoker(
        ResizeColdVolumeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resizeColdVolume, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(
        ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(
        ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.restartInstance);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreExistingInstanceResponse>
     */
    public CompletableFuture<RestoreExistingInstanceResponse> restoreExistingInstanceAsync(
        RestoreExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.restoreExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistingInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>
     */
    public AsyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstanceAsyncInvoker(
        RestoreExistingInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.restoreExistingInstance, hcClient);
    }

    /**
     * 关联LTS日志流
     *
     * - 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * - 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * - 系统会为当前选择的日志流创建对应日志类型的结构化配置，若该日志流已存在其他日志类型的结构化配置，系统会进行覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLtsConfigsRequest 请求对象
     * @return CompletableFuture<SaveLtsConfigsResponse>
     */
    public CompletableFuture<SaveLtsConfigsResponse> saveLtsConfigsAsync(SaveLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.saveLtsConfigs);
    }

    /**
     * 关联LTS日志流
     *
     * - 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * - 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * - 系统会为当前选择的日志流创建对应日志类型的结构化配置，若该日志流已存在其他日志类型的结构化配置，系统会进行覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLtsConfigsRequest 请求对象
     * @return AsyncInvoker<SaveLtsConfigsRequest, SaveLtsConfigsResponse>
     */
    public AsyncInvoker<SaveLtsConfigsRequest, SaveLtsConfigsResponse> saveLtsConfigsAsyncInvoker(
        SaveLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.saveLtsConfigs, hcClient);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<SetAutoEnlargePolicyResponse>
     */
    public CompletableFuture<SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsync(
        SetAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsyncInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
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
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.setBackupPolicy, hcClient);
    }

    /**
     * 开启/关闭实例数据导出
     *
     * 开启/关闭实例数据导出。
     * 当前支持将InfluxDB数据转为parquet格式文件然后上传到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstanceDataDumpRequest 请求对象
     * @return CompletableFuture<SetInstanceDataDumpResponse>
     */
    public CompletableFuture<SetInstanceDataDumpResponse> setInstanceDataDumpAsync(SetInstanceDataDumpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setInstanceDataDump);
    }

    /**
     * 开启/关闭实例数据导出
     *
     * 开启/关闭实例数据导出。
     * 当前支持将InfluxDB数据转为parquet格式文件然后上传到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstanceDataDumpRequest 请求对象
     * @return AsyncInvoker<SetInstanceDataDumpRequest, SetInstanceDataDumpResponse>
     */
    public AsyncInvoker<SetInstanceDataDumpRequest, SetInstanceDataDumpResponse> setInstanceDataDumpAsyncInvoker(
        SetInstanceDataDumpRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.setInstanceDataDump, hcClient);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setRecyclePolicy);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsRequest 请求对象
     * @return CompletableFuture<ShowAllInstancesBackupsResponse>
     */
    public CompletableFuture<ShowAllInstancesBackupsResponse> showAllInstancesBackupsAsync(
        ShowAllInstancesBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsRequest 请求对象
     * @return AsyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>
     */
    public AsyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackupsAsyncInvoker(
        ShowAllInstancesBackupsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showAllInstancesBackups, hcClient);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsNewRequest 请求对象
     * @return CompletableFuture<ShowAllInstancesBackupsNewResponse>
     */
    public CompletableFuture<ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewAsync(
        ShowAllInstancesBackupsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsNewRequest 请求对象
     * @return AsyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>
     */
    public AsyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewAsyncInvoker(
        ShowAllInstancesBackupsNewRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew, hcClient);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicableInstancesRequest 请求对象
     * @return CompletableFuture<ShowApplicableInstancesResponse>
     */
    public CompletableFuture<ShowApplicableInstancesResponse> showApplicableInstancesAsync(
        ShowApplicableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApplicableInstances);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicableInstancesRequest 请求对象
     * @return AsyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>
     */
    public AsyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstancesAsyncInvoker(
        ShowApplicableInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyHistoryRequest 请求对象
     * @return CompletableFuture<ShowApplyHistoryResponse>
     */
    public CompletableFuture<ShowApplyHistoryResponse> showApplyHistoryAsync(ShowApplyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApplyHistory);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>
     */
    public AsyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistoryAsyncInvoker(
        ShowApplyHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showApplyHistory, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoEnlargePolicyResponse>
     */
    public CompletableFuture<ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsync(
        ShowAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsyncInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPoliciesRequest 请求对象
     * @return CompletableFuture<ShowBackupPoliciesResponse>
     */
    public CompletableFuture<ShowBackupPoliciesResponse> showBackupPoliciesAsync(ShowBackupPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicies);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPoliciesRequest 请求对象
     * @return AsyncInvoker<ShowBackupPoliciesRequest, ShowBackupPoliciesResponse>
     */
    public AsyncInvoker<ShowBackupPoliciesRequest, ShowBackupPoliciesResponse> showBackupPoliciesAsyncInvoker(
        ShowBackupPoliciesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showBackupPolicies, hcClient);
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
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicy);
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
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigurationDetailResponse>
     */
    public CompletableFuture<ShowConfigurationDetailResponse> showConfigurationDetailAsync(
        ShowConfigurationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showConfigurationDetail);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailAsyncInvoker(
        ShowConfigurationDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询实例负载均衡的IP访问黑白名单
     *
     * 查询实例负载均衡的IP访问黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbIpGroupRequest 请求对象
     * @return CompletableFuture<ShowElbIpGroupResponse>
     */
    public CompletableFuture<ShowElbIpGroupResponse> showElbIpGroupAsync(ShowElbIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showElbIpGroup);
    }

    /**
     * 查询实例负载均衡的IP访问黑白名单
     *
     * 查询实例负载均衡的IP访问黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowElbIpGroupRequest, ShowElbIpGroupResponse>
     */
    public AsyncInvoker<ShowElbIpGroupRequest, ShowElbIpGroupResponse> showElbIpGroupAsyncInvoker(
        ShowElbIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showElbIpGroup, hcClient);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogRequest 请求对象
     * @return CompletableFuture<ShowErrorLogResponse>
     */
    public CompletableFuture<ShowErrorLogResponse> showErrorLogAsync(ShowErrorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showErrorLog);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogRequest 请求对象
     * @return AsyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>
     */
    public AsyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLogAsyncInvoker(
        ShowErrorLogRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showErrorLog, hcClient);
    }

    /**
     * 查询高危命令
     *
     * 查询Redis的高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHighRiskCommandsRequest 请求对象
     * @return CompletableFuture<ShowHighRiskCommandsResponse>
     */
    public CompletableFuture<ShowHighRiskCommandsResponse> showHighRiskCommandsAsync(
        ShowHighRiskCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showHighRiskCommands);
    }

    /**
     * 查询高危命令
     *
     * 查询Redis的高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHighRiskCommandsRequest 请求对象
     * @return AsyncInvoker<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse>
     */
    public AsyncInvoker<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> showHighRiskCommandsAsyncInvoker(
        ShowHighRiskCommandsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showHighRiskCommands, hcClient);
    }

    /**
     * 查询实例可搭建双活关系的Region
     *
     * 查询实例可搭建双活关系的Region。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBiactiveRegionsRequest 请求对象
     * @return CompletableFuture<ShowInstanceBiactiveRegionsResponse>
     */
    public CompletableFuture<ShowInstanceBiactiveRegionsResponse> showInstanceBiactiveRegionsAsync(
        ShowInstanceBiactiveRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceBiactiveRegions);
    }

    /**
     * 查询实例可搭建双活关系的Region
     *
     * 查询实例可搭建双活关系的Region。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBiactiveRegionsRequest 请求对象
     * @return AsyncInvoker<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse>
     */
    public AsyncInvoker<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> showInstanceBiactiveRegionsAsyncInvoker(
        ShowInstanceBiactiveRegionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceBiactiveRegions, hcClient);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRoleRequest 请求对象
     * @return CompletableFuture<ShowInstanceRoleResponse>
     */
    public CompletableFuture<ShowInstanceRoleResponse> showInstanceRoleAsync(ShowInstanceRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceRole);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRoleRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>
     */
    public AsyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRoleAsyncInvoker(
        ShowInstanceRoleRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceRole, hcClient);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpNumRequirementRequest 请求对象
     * @return CompletableFuture<ShowIpNumRequirementResponse>
     */
    public CompletableFuture<ShowIpNumRequirementResponse> showIpNumRequirementAsync(
        ShowIpNumRequirementRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showIpNumRequirement);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpNumRequirementRequest 请求对象
     * @return AsyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>
     */
    public AsyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirementAsyncInvoker(
        ShowIpNumRequirementRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showIpNumRequirement, hcClient);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModifyHistoryRequest 请求对象
     * @return CompletableFuture<ShowModifyHistoryResponse>
     */
    public CompletableFuture<ShowModifyHistoryResponse> showModifyHistoryAsync(ShowModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showModifyHistory);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>
     */
    public AsyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistoryAsyncInvoker(
        ShowModifyHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showModifyHistory, hcClient);
    }

    /**
     * 获取GeminiDB Redis的免密配置
     *
     * 获取GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordlessConfigRequest 请求对象
     * @return CompletableFuture<ShowPasswordlessConfigResponse>
     */
    public CompletableFuture<ShowPasswordlessConfigResponse> showPasswordlessConfigAsync(
        ShowPasswordlessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showPasswordlessConfig);
    }

    /**
     * 获取GeminiDB Redis的免密配置
     *
     * 获取GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordlessConfigRequest 请求对象
     * @return AsyncInvoker<ShowPasswordlessConfigRequest, ShowPasswordlessConfigResponse>
     */
    public AsyncInvoker<ShowPasswordlessConfigRequest, ShowPasswordlessConfigResponse> showPasswordlessConfigAsyncInvoker(
        ShowPasswordlessConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showPasswordlessConfig, hcClient);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPauseResumeStutusRequest 请求对象
     * @return CompletableFuture<ShowPauseResumeStutusResponse>
     */
    public CompletableFuture<ShowPauseResumeStutusResponse> showPauseResumeStutusAsync(
        ShowPauseResumeStutusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showPauseResumeStutus);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPauseResumeStutusRequest 请求对象
     * @return AsyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>
     */
    public AsyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutusAsyncInvoker(
        ShowPauseResumeStutusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showPauseResumeStutus, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GeminiDB服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GeminiDB服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showRecyclePolicy);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询Redis实例的大key
     *
     * 支持查询Redis实例的大key。value长度大于bigkeys-string-threshold参数的string类型的key或者元素数大于bigkeys-composite-threshold参数的hash/list/zset/set/stream类型key，会被判断为大key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisBigKeysRequest 请求对象
     * @return CompletableFuture<ShowRedisBigKeysResponse>
     */
    public CompletableFuture<ShowRedisBigKeysResponse> showRedisBigKeysAsync(ShowRedisBigKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisBigKeys);
    }

    /**
     * 查询Redis实例的大key
     *
     * 支持查询Redis实例的大key。value长度大于bigkeys-string-threshold参数的string类型的key或者元素数大于bigkeys-composite-threshold参数的hash/list/zset/set/stream类型key，会被判断为大key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisBigKeysRequest 请求对象
     * @return AsyncInvoker<ShowRedisBigKeysRequest, ShowRedisBigKeysResponse>
     */
    public AsyncInvoker<ShowRedisBigKeysRequest, ShowRedisBigKeysResponse> showRedisBigKeysAsyncInvoker(
        ShowRedisBigKeysRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisBigKeys, hcClient);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestorableListRequest 请求对象
     * @return CompletableFuture<ShowRestorableListResponse>
     */
    public CompletableFuture<ShowRestorableListResponse> showRestorableListAsync(ShowRestorableListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showRestorableList);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestorableListRequest 请求对象
     * @return AsyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>
     */
    public AsyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableListAsyncInvoker(
        ShowRestorableListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showRestorableList, hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return CompletableFuture<ShowSecondLevelMonitoringStatusResponse>
     */
    public CompletableFuture<ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsync(
        ShowSecondLevelMonitoringStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showSecondLevelMonitoringStatus);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public AsyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusAsyncInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDesensitizationRequest 请求对象
     * @return CompletableFuture<ShowSlowLogDesensitizationResponse>
     */
    public CompletableFuture<ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationAsync(
        ShowSlowLogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showSlowLogDesensitization);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDesensitizationRequest 请求对象
     * @return AsyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>
     */
    public AsyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationAsyncInvoker(
        ShowSlowLogDesensitizationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showSlowLogDesensitization, hcClient);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodeRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodeResponse>
     */
    public CompletableFuture<ShrinkInstanceNodeResponse> shrinkInstanceNodeAsync(ShrinkInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.shrinkInstanceNode);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>
     */
    public AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNodeAsyncInvoker(
        ShrinkInstanceNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.shrinkInstanceNode, hcClient);
    }

    /**
     * 设置实例负载均衡的IP访问黑白名单
     *
     * 设置实例负载均衡的IP访问黑白名单，黑名单、白名单只能选一种，每次调用此接口覆盖之前的设置。关闭后不限制连接的源IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return CompletableFuture<SwitchIpGroupResponse>
     */
    public CompletableFuture<SwitchIpGroupResponse> switchIpGroupAsync(SwitchIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchIpGroup);
    }

    /**
     * 设置实例负载均衡的IP访问黑白名单
     *
     * 设置实例负载均衡的IP访问黑白名单，黑名单、白名单只能选一种，每次调用此接口覆盖之前的设置。关闭后不限制连接的源IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return AsyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse>
     */
    public AsyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse> switchIpGroupAsyncInvoker(
        SwitchIpGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchIpGroup, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的5秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return CompletableFuture<SwitchSecondLevelMonitoringResponse>
     */
    public CompletableFuture<SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsync(
        SwitchSecondLevelMonitoringRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchSecondLevelMonitoring);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的5秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public AsyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringAsyncInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return CompletableFuture<SwitchSlowlogDesensitizationResponse>
     */
    public CompletableFuture<SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsync(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsyncInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchSsl);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchSsl, hcClient);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToMasterRequest 请求对象
     * @return CompletableFuture<SwitchToMasterResponse>
     */
    public CompletableFuture<SwitchToMasterResponse> switchToMasterAsync(SwitchToMasterRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchToMaster);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToMasterRequest 请求对象
     * @return AsyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>
     */
    public AsyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse> switchToMasterAsyncInvoker(
        SwitchToMasterRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchToMaster, hcClient);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToSlaveRequest 请求对象
     * @return CompletableFuture<SwitchToSlaveResponse>
     */
    public CompletableFuture<SwitchToSlaveResponse> switchToSlaveAsync(SwitchToSlaveRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchToSlave);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToSlaveRequest 请求对象
     * @return AsyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>
     */
    public AsyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlaveAsyncInvoker(
        SwitchToSlaveRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.switchToSlave, hcClient);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return CompletableFuture<UpdateClientNetworkResponse>
     */
    public CompletableFuture<UpdateClientNetworkResponse> updateClientNetworkAsync(UpdateClientNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateClientNetwork);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkAsyncInvoker(
        UpdateClientNetworkRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateConfiguration, hcClient);
    }

    /**
     * 操作GeminDB实例数据库
     *
     * 操作GeminDB实例数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabasesRequest 请求对象
     * @return CompletableFuture<UpdateDatabasesResponse>
     */
    public CompletableFuture<UpdateDatabasesResponse> updateDatabasesAsync(UpdateDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateDatabases);
    }

    /**
     * 操作GeminDB实例数据库
     *
     * 操作GeminDB实例数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabasesRequest 请求对象
     * @return AsyncInvoker<UpdateDatabasesRequest, UpdateDatabasesResponse>
     */
    public AsyncInvoker<UpdateDatabasesRequest, UpdateDatabasesResponse> updateDatabasesAsyncInvoker(
        UpdateDatabasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateDatabases, hcClient);
    }

    /**
     * 修改内存加速规则
     *
     * 修改指定内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbCacheRuleRequest 请求对象
     * @return CompletableFuture<UpdateDbCacheRuleResponse>
     */
    public CompletableFuture<UpdateDbCacheRuleResponse> updateDbCacheRuleAsync(UpdateDbCacheRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateDbCacheRule);
    }

    /**
     * 修改内存加速规则
     *
     * 修改指定内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbCacheRuleRequest 请求对象
     * @return AsyncInvoker<UpdateDbCacheRuleRequest, UpdateDbCacheRuleResponse>
     */
    public AsyncInvoker<UpdateDbCacheRuleRequest, UpdateDbCacheRuleResponse> updateDbCacheRuleAsyncInvoker(
        UpdateDbCacheRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateDbCacheRule, hcClient);
    }

    /**
     * 修改高危命令
     *
     * 批量修改高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHighRiskCommandsRequest 请求对象
     * @return CompletableFuture<UpdateHighRiskCommandsResponse>
     */
    public CompletableFuture<UpdateHighRiskCommandsResponse> updateHighRiskCommandsAsync(
        UpdateHighRiskCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateHighRiskCommands);
    }

    /**
     * 修改高危命令
     *
     * 批量修改高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHighRiskCommandsRequest 请求对象
     * @return AsyncInvoker<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse>
     */
    public AsyncInvoker<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> updateHighRiskCommandsAsyncInvoker(
        UpdateHighRiskCommandsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateHighRiskCommands, hcClient);
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
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfiguration);
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
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationsResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationsResponse> updateInstanceConfigurationsAsync(
        UpdateInstanceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfigurations);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> updateInstanceConfigurationsAsyncInvoker(
        UpdateInstanceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceConfigurations, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceName, hcClient);
    }

    /**
     * 支持修改GeminiDB Redis的免密配置
     *
     * 支持修改GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordlessConfigRequest 请求对象
     * @return CompletableFuture<UpdatePasswordlessConfigResponse>
     */
    public CompletableFuture<UpdatePasswordlessConfigResponse> updatePasswordlessConfigAsync(
        UpdatePasswordlessConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updatePasswordlessConfig);
    }

    /**
     * 支持修改GeminiDB Redis的免密配置
     *
     * 支持修改GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordlessConfigRequest 请求对象
     * @return AsyncInvoker<UpdatePasswordlessConfigRequest, UpdatePasswordlessConfigResponse>
     */
    public AsyncInvoker<UpdatePasswordlessConfigRequest, UpdatePasswordlessConfigResponse> updatePasswordlessConfigAsyncInvoker(
        UpdatePasswordlessConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updatePasswordlessConfig, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDbVersionResponse>
     */
    public CompletableFuture<UpgradeDbVersionResponse> upgradeDbVersionAsync(UpgradeDbVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.upgradeDbVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionAsyncInvoker(
        UpgradeDbVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.upgradeDbVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforNoSQLMeta.showApiVersion, hcClient);
    }

}

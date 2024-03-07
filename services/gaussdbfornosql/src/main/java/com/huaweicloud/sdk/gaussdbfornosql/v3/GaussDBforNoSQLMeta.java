package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ActionBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ConstructDisasterRecoveryBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresResponse;
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
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsRequestBody;
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
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsRequestBody;
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
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.NoSqlCreateBackupRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.NoSqlModiflyEpsQuotasRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PrecheckDisasterRecoveryOperationBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RecyclePolicyRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RedisCreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RedisDeleteDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RedisModifyDBUserPrivilegeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RedisResetDbUserPasswordRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RenameHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoPolicyRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyResponse;
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
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterDisasterRecoveryBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupRequestBody;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionResponse;

@SuppressWarnings("unchecked")
public class GaussDBforNoSQLMeta {

    public static final HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfiguration =
        genForApplyConfiguration();

    private static HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> genForApplyConfiguration() {
        // basic
        HttpRequestDef.Builder<ApplyConfigurationRequest, ApplyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ApplyConfigurationRequest.class, ApplyConfigurationResponse.class)
                .withName("ApplyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyConfigurationRequest::getConfigId, ApplyConfigurationRequest::setConfigId));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(ApplyConfigurationRequest::getBody, ApplyConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForBatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForBatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, BatchTagActionRequest::setInstanceId));
        builder.<BatchTagActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, BatchTagActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperation =
        genForCheckDisasterRecoveryOperation();

    private static HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> genForCheckDisasterRecoveryOperation() {
        // basic
        HttpRequestDef.Builder<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckDisasterRecoveryOperationRequest.class,
                    CheckDisasterRecoveryOperationResponse.class)
                .withName("CheckDisasterRecoveryOperation")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/precheck")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getInstanceId,
                CheckDisasterRecoveryOperationRequest::setInstanceId));
        builder.<PrecheckDisasterRecoveryOperationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrecheckDisasterRecoveryOperationBody.class),
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getBody,
                CheckDisasterRecoveryOperationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPassword =
        genForCheckWeekPassword();

    private static HttpRequestDef<CheckWeekPasswordRequest, CheckWeekPasswordResponse> genForCheckWeekPassword() {
        // basic
        HttpRequestDef.Builder<CheckWeekPasswordRequest, CheckWeekPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckWeekPasswordRequest.class, CheckWeekPasswordResponse.class)
                .withName("CheckWeekPassword")
                .withUri("/v3/{project_id}/weak-password-verification")
                .withContentType("application/json");

        // requests
        builder.<CheckWeekPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckWeekPasswordRequestBody.class),
            f -> f.withMarshaller(CheckWeekPasswordRequest::getBody, CheckWeekPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareConfigurationRequest, CompareConfigurationResponse> compareConfiguration =
        genForCompareConfiguration();

    private static HttpRequestDef<CompareConfigurationRequest, CompareConfigurationResponse> genForCompareConfiguration() {
        // basic
        HttpRequestDef.Builder<CompareConfigurationRequest, CompareConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CompareConfigurationRequest.class, CompareConfigurationResponse.class)
            .withName("CompareConfiguration")
            .withUri("/v3/{project_id}/configurations/comparison")
            .withContentType("application/json");

        // requests
        builder.<CompareConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompareConfigurationRequestBody.class),
            f -> f.withMarshaller(CompareConfigurationRequest::getBody, CompareConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration =
        genForCopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForCopyConfiguration() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationRequest, CopyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationRequest.class, CopyConfigurationResponse.class)
                .withName("CopyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/copy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, CopyConfigurationRequest::setConfigId));
        builder.<CopyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyConfigurationRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, CopyConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackRequest, CreateBackResponse> createBack = genForCreateBack();

    private static HttpRequestDef<CreateBackRequest, CreateBackResponse> genForCreateBack() {
        // basic
        HttpRequestDef.Builder<CreateBackRequest, CreateBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackRequest.class, CreateBackResponse.class)
                .withName("CreateBack")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackRequest::getInstanceId, CreateBackRequest::setInstanceId));
        builder.<NoSqlCreateBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NoSqlCreateBackupRequestBody.class),
            f -> f.withMarshaller(CreateBackRequest::getBody, CreateBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolume =
        genForCreateColdVolume();

    private static HttpRequestDef<CreateColdVolumeRequest, CreateColdVolumeResponse> genForCreateColdVolume() {
        // basic
        HttpRequestDef.Builder<CreateColdVolumeRequest, CreateColdVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateColdVolumeRequest.class, CreateColdVolumeResponse.class)
                .withName("CreateColdVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/cold-volume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateColdVolumeRequest::getInstanceId, CreateColdVolumeRequest::setInstanceId));
        builder.<CreateColdVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateColdVolumeRequestBody.class),
            f -> f.withMarshaller(CreateColdVolumeRequest::getBody, CreateColdVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration =
        genForCreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForCreateConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationRequest, CreateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationRequest.class, CreateConfigurationResponse.class)
                .withName("CreateConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<CreateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, CreateConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForCreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForCreateDbUser() {
        // basic
        HttpRequestDef.Builder<CreateDbUserRequest, CreateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbUserRequest.class, CreateDbUserResponse.class)
                .withName("CreateDbUser")
                .withUri("/v3/{project_id}/redis/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, CreateDbUserRequest::setInstanceId));
        builder.<RedisCreateDbUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisCreateDbUserRequest.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, CreateDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecovery =
        genForCreateDisasterRecovery();

    private static HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> genForCreateDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDisasterRecoveryRequest.class, CreateDisasterRecoveryResponse.class)
            .withName("CreateDisasterRecovery")
            .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/construction")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getInstanceId,
                CreateDisasterRecoveryRequest::setInstanceId));
        builder.<ConstructDisasterRecoveryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConstructDisasterRecoveryBody.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getBody, CreateDisasterRecoveryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genForDeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genForDeleteBackup() {
        // basic
        HttpRequestDef.Builder<DeleteBackupRequest, DeleteBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupRequest.class, DeleteBackupResponse.class)
                .withName("DeleteBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, DeleteBackupRequest::setBackupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genForDeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genForDeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
            .withName("DeleteConfiguration")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, DeleteConfigurationRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genForDeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genForDeleteDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteDbUserRequest, DeleteDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbUserRequest.class, DeleteDbUserResponse.class)
                .withName("DeleteDbUser")
                .withUri("/v3/{project_id}/redis/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, DeleteDbUserRequest::setInstanceId));
        builder.<RedisDeleteDbUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisDeleteDbUserRequest.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getBody, DeleteDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genForDeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genForDeleteDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteDisasterRecoveryRequest.class, DeleteDisasterRecoveryResponse.class)
            .withName("DeleteDisasterRecovery")
            .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/deconstruction")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getInstanceId,
                DeleteDisasterRecoveryRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNode =
        genForDeleteEnlargeFailNode();

    private static HttpRequestDef<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> genForDeleteEnlargeFailNode() {
        // basic
        HttpRequestDef.Builder<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnlargeFailNodeRequest.class, DeleteEnlargeFailNodeResponse.class)
            .withName("DeleteEnlargeFailNode")
            .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-failed-nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnlargeFailNodeRequest::getInstanceId,
                DeleteEnlargeFailNodeRequest::setInstanceId));
        builder.<DeleteEnlargeFailNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteEnlargeFailNodeRequestBody.class),
            f -> f.withMarshaller(DeleteEnlargeFailNodeRequest::getBody, DeleteEnlargeFailNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> deleteInstancesSession =
        genForDeleteInstancesSession();

    private static HttpRequestDef<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> genForDeleteInstancesSession() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstancesSessionRequest.class, DeleteInstancesSessionResponse.class)
            .withName("DeleteInstancesSession")
            .withUri("/v3/{project_id}/redis/nodes/{node_id}/sessions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstancesSessionRequest::getNodeId, DeleteInstancesSessionRequest::setNodeId));
        builder.<DeleteInstancesSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstancesSessionRequestBody.class),
            f -> f.withMarshaller(DeleteInstancesSessionRequest::getBody, DeleteInstancesSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigs =
        genForDeleteLtsConfigs();

    private static HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> genForDeleteLtsConfigs() {
        // basic
        HttpRequestDef.Builder<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLtsConfigsRequest.class, DeleteLtsConfigsResponse.class)
                .withName("DeleteLtsConfigs")
                .withUri("/v3/{project_id}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getXLanguage, DeleteLtsConfigsRequest::setXLanguage));
        builder.<DeleteLtsConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLtsConfigsRequestBody.class),
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getBody, DeleteLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNode =
        genForExpandInstanceNode();

    private static HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> genForExpandInstanceNode() {
        // basic
        HttpRequestDef.Builder<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandInstanceNodeRequest.class, ExpandInstanceNodeResponse.class)
                .withName("ExpandInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getInstanceId, ExpandInstanceNodeRequest::setInstanceId));
        builder.<ExpandInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getBody, ExpandInstanceNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfos =
        genForListAvailableFlavorInfos();

    private static HttpRequestDef<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> genForListAvailableFlavorInfos() {
        // basic
        HttpRequestDef.Builder<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAvailableFlavorInfosRequest.class, ListAvailableFlavorInfosResponse.class)
                .withName("ListAvailableFlavorInfos")
                .withUri("/v3/{project_id}/instances/{instance_id}/available-flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getInstanceId,
                ListAvailableFlavorInfosRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getOffset,
                ListAvailableFlavorInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getLimit,
                ListAvailableFlavorInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> listCassandraSlowLogs =
        genForListCassandraSlowLogs();

    private static HttpRequestDef<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> genForListCassandraSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCassandraSlowLogsRequest.class, ListCassandraSlowLogsResponse.class)
            .withName("ListCassandraSlowLogs")
            .withUri("/v3/{project_id}/cassandra/instances/{instance_id}/slow-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCassandraSlowLogsRequest::getInstanceId,
                ListCassandraSlowLogsRequest::setInstanceId));
        builder.<ListCassandraSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCassandraSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListCassandraSlowLogsRequest::getBody, ListCassandraSlowLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastores =
        genForListConfigurationDatastores();

    private static HttpRequestDef<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> genForListConfigurationDatastores() {
        // basic
        HttpRequestDef.Builder<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationDatastoresRequest.class,
                    ListConfigurationDatastoresResponse.class)
                .withName("ListConfigurationDatastores")
                .withUri("/v3/{project_id}/configurations/datastores")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplates =
        genForListConfigurationTemplates();

    private static HttpRequestDef<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> genForListConfigurationTemplates() {
        // basic
        HttpRequestDef.Builder<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationTemplatesRequest.class,
                    ListConfigurationTemplatesResponse.class)
                .withName("ListConfigurationTemplates")
                .withUri("/v3.1/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getOffset,
                ListConfigurationTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getLimit,
                ListConfigurationTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForListConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForListConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores =
        genForListDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForListDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastores/{datastore_name}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getDatastoreName, ListDatastoresRequest::setDatastoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForListDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForListDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/redis/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, ListDbUsersRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getName, ListDbUsersRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, ListDbUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, ListDbUsersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResources =
        genForListDedicatedResources();

    private static HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> genForListDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDedicatedResourcesRequest.class, ListDedicatedResourcesResponse.class)
            .withName("ListDedicatedResources")
            .withUri("/v3/{project_id}/dedicated-resources")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getOffset, ListDedicatedResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getLimit, ListDedicatedResourcesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotas =
        genForListEpsQuotas();

    private static HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> genForListEpsQuotas() {
        // basic
        HttpRequestDef.Builder<ListEpsQuotasRequest, ListEpsQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEpsQuotasRequest.class, ListEpsQuotasResponse.class)
                .withName("ListEpsQuotas")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getEnterpriseProjectName,
                ListEpsQuotasRequest::setEnterpriseProjectName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getOffset, ListEpsQuotasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getLimit, ListEpsQuotasRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfos =
        genForListFlavorInfos();

    private static HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> genForListFlavorInfos() {
        // basic
        HttpRequestDef.Builder<ListFlavorInfosRequest, ListFlavorInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorInfosRequest.class, ListFlavorInfosResponse.class)
                .withName("ListFlavorInfos")
                .withUri("/v3.1/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getEngineName, ListFlavorInfosRequest::setEngineName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getOffset, ListFlavorInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getLimit, ListFlavorInfosRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getRegion, ListFlavorsRequest::setRegion));
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, ListFlavorsRequest::setEngineName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> listInfluxdbSlowLogs =
        genForListInfluxdbSlowLogs();

    private static HttpRequestDef<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> genForListInfluxdbSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListInfluxdbSlowLogsRequest.class, ListInfluxdbSlowLogsResponse.class)
            .withName("ListInfluxdbSlowLogs")
            .withUri("/v3/{project_id}/influxdb/instances/{instance_id}/slow-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInfluxdbSlowLogsRequest::getInstanceId,
                ListInfluxdbSlowLogsRequest::setInstanceId));
        builder.<ListInfluxdbSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInfluxdbSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListInfluxdbSlowLogsRequest::getBody, ListInfluxdbSlowLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabases =
        genForListInstanceDatabases();

    private static HttpRequestDef<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> genForListInstanceDatabases() {
        // basic
        HttpRequestDef.Builder<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceDatabasesRequest.class, ListInstanceDatabasesResponse.class)
            .withName("ListInstanceDatabases")
            .withUri("/v3/{project_id}/redis/instances/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getInstanceId,
                ListInstanceDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getOffset, ListInstanceDatabasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getLimit, ListInstanceDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, ListInstanceTagsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, ListInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMode, ListInstancesRequest::setMode));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, ListInstancesRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, ListInstancesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, ListInstancesRequest::setSubnetId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTags =
        genForListInstancesByResourceTags();

    private static HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> genForListInstancesByResourceTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstancesByResourceTagsRequest.class,
                    ListInstancesByResourceTagsResponse.class)
                .withName("ListInstancesByResourceTags")
                .withUri("/v3/{project_id}/instances/resource-instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByResourceTagsRequest::getBody,
                ListInstancesByResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags =
        genForListInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForListInstancesByTags() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagsRequest, ListInstancesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagsRequest.class, ListInstancesByTagsResponse.class)
                .withName("ListInstancesByTags")
                .withUri("/v3/{project_id}/instances/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, ListInstancesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSessionRequest, ListInstancesSessionResponse> listInstancesSession =
        genForListInstancesSession();

    private static HttpRequestDef<ListInstancesSessionRequest, ListInstancesSessionResponse> genForListInstancesSession() {
        // basic
        HttpRequestDef.Builder<ListInstancesSessionRequest, ListInstancesSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstancesSessionRequest.class, ListInstancesSessionResponse.class)
            .withName("ListInstancesSession")
            .withUri("/v3/{project_id}/redis/nodes/{node_id}/sessions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getNodeId, ListInstancesSessionRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getOffset, ListInstancesSessionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getLimit, ListInstancesSessionRequest::setLimit));
        builder.<String>withRequestField("addr_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getAddrPrefix,
                ListInstancesSessionRequest::setAddrPrefix));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> listInstancesSessionStatistics =
        genForListInstancesSessionStatistics();

    private static HttpRequestDef<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> genForListInstancesSessionStatistics() {
        // basic
        HttpRequestDef.Builder<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstancesSessionStatisticsRequest.class,
                    ListInstancesSessionStatisticsResponse.class)
                .withName("ListInstancesSessionStatistics")
                .withUri("/v3/{project_id}/redis/nodes/{node_id}/session-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesSessionStatisticsRequest::getNodeId,
                ListInstancesSessionStatisticsRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getId, ListJobsRequest::setId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStartTime, ListJobsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getEndTime, ListJobsRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getStatus, ListJobsRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getName, ListJobsRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getOffset, ListJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobsRequest::getLimit, ListJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigs =
        genForListLtsConfigs();

    private static HttpRequestDef<ListLtsConfigsRequest, ListLtsConfigsResponse> genForListLtsConfigs() {
        // basic
        HttpRequestDef.Builder<ListLtsConfigsRequest, ListLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLtsConfigsRequest.class, ListLtsConfigsResponse.class)
                .withName("ListLtsConfigs")
                .withUri("/v3/{project_id}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getOffset, ListLtsConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getLimit, ListLtsConfigsRequest::setLimit));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getInstanceId, ListLtsConfigsRequest::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getInstanceName, ListLtsConfigsRequest::setInstanceName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getEnterpriseProjectId,
                ListLtsConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getXLanguage, ListLtsConfigsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> listMongodbErrorLogs =
        genForListMongodbErrorLogs();

    private static HttpRequestDef<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> genForListMongodbErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListMongodbErrorLogsRequest.class, ListMongodbErrorLogsResponse.class)
            .withName("ListMongodbErrorLogs")
            .withUri("/v3/{project_id}/mongodb/instances/{instance_id}/error-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMongodbErrorLogsRequest::getInstanceId,
                ListMongodbErrorLogsRequest::setInstanceId));
        builder.<ListMongodbErrorLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMongodbErrorLogsRequestBody.class),
            f -> f.withMarshaller(ListMongodbErrorLogsRequest::getBody, ListMongodbErrorLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> listMongodbSlowLogs =
        genForListMongodbSlowLogs();

    private static HttpRequestDef<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> genForListMongodbSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListMongodbSlowLogsRequest.class, ListMongodbSlowLogsResponse.class)
                .withName("ListMongodbSlowLogs")
                .withUri("/v3/{project_id}/mongodb/instances/{instance_id}/slow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMongodbSlowLogsRequest::getInstanceId,
                ListMongodbSlowLogsRequest::setInstanceId));
        builder.<ListMongodbSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMongodbSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListMongodbSlowLogsRequest::getBody, ListMongodbSlowLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, ListProjectTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, ListProjectTagsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances =
        genForListRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForListRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesRequest, ListRecycleInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecycleInstancesRequest.class, ListRecycleInstancesResponse.class)
            .withName("ListRecycleInstances")
            .withUri("/v3/{project_id}/recycle-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, ListRecycleInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, ListRecycleInstancesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage,
                ListRecycleInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> listRedisSlowLogs =
        genForListRedisSlowLogs();

    private static HttpRequestDef<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> genForListRedisSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRedisSlowLogsRequest.class, ListRedisSlowLogsResponse.class)
                .withName("ListRedisSlowLogs")
                .withUri("/v3/{project_id}/redis/instances/{instance_id}/slow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedisSlowLogsRequest::getInstanceId, ListRedisSlowLogsRequest::setInstanceId));
        builder.<ListRedisSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRedisSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListRedisSlowLogsRequest::getBody, ListRedisSlowLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabases =
        genForListRestoreDatabases();

    private static HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> genForListRestoreDatabases() {
        // basic
        HttpRequestDef.Builder<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRestoreDatabasesRequest.class, ListRestoreDatabasesResponse.class)
            .withName("ListRestoreDatabases")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getInstanceId,
                ListRestoreDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getOffset, ListRestoreDatabasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getLimit, ListRestoreDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTablesRequest, ListRestoreTablesResponse> listRestoreTables =
        genForListRestoreTables();

    private static HttpRequestDef<ListRestoreTablesRequest, ListRestoreTablesResponse> genForListRestoreTables() {
        // basic
        HttpRequestDef.Builder<ListRestoreTablesRequest, ListRestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTablesRequest.class, ListRestoreTablesResponse.class)
                .withName("ListRestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getInstanceId, ListRestoreTablesRequest::setInstanceId));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getDatabaseName,
                ListRestoreTablesRequest::setDatabaseName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getOffset, ListRestoreTablesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getLimit, ListRestoreTablesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTime =
        genForListRestoreTime();

    private static HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> genForListRestoreTime() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimeRequest, ListRestoreTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimeRequest.class, ListRestoreTimeResponse.class)
                .withName("ListRestoreTime")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restorable-time-periods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getInstanceId, ListRestoreTimeRequest::setInstanceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getStartTime, ListRestoreTimeRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getEndTime, ListRestoreTimeRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getOffset, ListRestoreTimeRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getLimit, ListRestoreTimeRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForListSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForListSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, ListSlowLogsRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, ListSlowLogsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, ListSlowLogsRequest::setEndDate));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getNodeId, ListSlowLogsRequest::setNodeId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getType, ListSlowLogsRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, ListSlowLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, ListSlowLogsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilege =
        genForModifyDbUserPrivilege();

    private static HttpRequestDef<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> genForModifyDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyDbUserPrivilegeRequest.class, ModifyDbUserPrivilegeResponse.class)
            .withName("ModifyDbUserPrivilege")
            .withUri("/v3/{project_id}/redis/instances/{instance_id}/db-users/privilege")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyDbUserPrivilegeRequest::getInstanceId,
                ModifyDbUserPrivilegeRequest::setInstanceId));
        builder.<RedisModifyDBUserPrivilegeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisModifyDBUserPrivilegeRequest.class),
            f -> f.withMarshaller(ModifyDbUserPrivilegeRequest::getBody, ModifyDbUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotas =
        genForModifyEpsQuotas();

    private static HttpRequestDef<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> genForModifyEpsQuotas() {
        // basic
        HttpRequestDef.Builder<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyEpsQuotasRequest.class, ModifyEpsQuotasResponse.class)
                .withName("ModifyEpsQuotas")
                .withUri("/v3/{project_id}/enterprise-projects/quotas")
                .withContentType("application/json");

        // requests
        builder.<NoSqlModiflyEpsQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NoSqlModiflyEpsQuotasRequestBody.class),
            f -> f.withMarshaller(ModifyEpsQuotasRequest::getBody, ModifyEpsQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPortRequest, ModifyPortResponse> modifyPort = genForModifyPort();

    private static HttpRequestDef<ModifyPortRequest, ModifyPortResponse> genForModifyPort() {
        // basic
        HttpRequestDef.Builder<ModifyPortRequest, ModifyPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyPortRequest.class, ModifyPortResponse.class)
                .withName("ModifyPort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPortRequest::getInstanceId, ModifyPortRequest::setInstanceId));
        builder.<ModifyPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPortRequestBody.class),
            f -> f.withMarshaller(ModifyPortRequest::getBody, ModifyPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIp =
        genForModifyPublicIp();

    private static HttpRequestDef<ModifyPublicIpRequest, ModifyPublicIpResponse> genForModifyPublicIp() {
        // basic
        HttpRequestDef.Builder<ModifyPublicIpRequest, ModifyPublicIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ModifyPublicIpRequest.class, ModifyPublicIpResponse.class)
                .withName("ModifyPublicIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/public-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPublicIpRequest::getInstanceId, ModifyPublicIpRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPublicIpRequest::getNodeId, ModifyPublicIpRequest::setNodeId));
        builder.<ModifyPublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPublicIpRequestBody.class),
            f -> f.withMarshaller(ModifyPublicIpRequest::getBody, ModifyPublicIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolume = genForModifyVolume();

    private static HttpRequestDef<ModifyVolumeRequest, ModifyVolumeResponse> genForModifyVolume() {
        // basic
        HttpRequestDef.Builder<ModifyVolumeRequest, ModifyVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyVolumeRequest.class, ModifyVolumeResponse.class)
                .withName("ModifyVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyVolumeRequest::getInstanceId, ModifyVolumeRequest::setInstanceId));
        builder.<ModifyVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVolumeRequestBody.class),
            f -> f.withMarshaller(ModifyVolumeRequest::getBody, ModifyVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OfflineNodesRequest, OfflineNodesResponse> offlineNodes = genForOfflineNodes();

    private static HttpRequestDef<OfflineNodesRequest, OfflineNodesResponse> genForOfflineNodes() {
        // basic
        HttpRequestDef.Builder<OfflineNodesRequest, OfflineNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, OfflineNodesRequest.class, OfflineNodesResponse.class)
                .withName("OfflineNodes")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OfflineNodesRequest::getInstanceId, OfflineNodesRequest::setInstanceId));
        builder.<OfflineNodesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OfflineNodesRequestBody.class),
            f -> f.withMarshaller(OfflineNodesRequest::getBody, OfflineNodesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(OfflineNodesResponse::getBody, OfflineNodesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronization =
        genForPauseResumeDataSynchronization();

    private static HttpRequestDef<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> genForPauseResumeDataSynchronization() {
        // basic
        HttpRequestDef.Builder<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    PauseResumeDataSynchronizationRequest.class,
                    PauseResumeDataSynchronizationResponse.class)
                .withName("PauseResumeDataSynchronization")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/data-synchronization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PauseResumeDataSynchronizationRequest::getInstanceId,
                PauseResumeDataSynchronizationRequest::setInstanceId));
        builder.<ActionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionBody.class),
            f -> f.withMarshaller(PauseResumeDataSynchronizationRequest::getBody,
                PauseResumeDataSynchronizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPassword =
        genForResetDbUserPassword();

    private static HttpRequestDef<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> genForResetDbUserPassword() {
        // basic
        HttpRequestDef.Builder<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetDbUserPasswordRequest.class, ResetDbUserPasswordResponse.class)
                .withName("ResetDbUserPassword")
                .withUri("/v3/{project_id}/redis/instances/{instance_id}/db-users/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDbUserPasswordRequest::getInstanceId,
                ResetDbUserPasswordRequest::setInstanceId));
        builder.<RedisResetDbUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisResetDbUserPasswordRequestBody.class),
            f -> f.withMarshaller(ResetDbUserPasswordRequest::getBody, ResetDbUserPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> resetParamGroupTemplate =
        genForResetParamGroupTemplate();

    private static HttpRequestDef<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> genForResetParamGroupTemplate() {
        // basic
        HttpRequestDef.Builder<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetParamGroupTemplateRequest.class, ResetParamGroupTemplateResponse.class)
            .withName("ResetParamGroupTemplate")
            .withUri("/v3/{project_id}/configurations/{config_id}/reset")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetParamGroupTemplateRequest::getConfigId,
                ResetParamGroupTemplateRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, ResetPasswordRequest::setInstanceId));
        builder.<ResetPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordRequestBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolume =
        genForResizeColdVolume();

    private static HttpRequestDef<ResizeColdVolumeRequest, ResizeColdVolumeResponse> genForResizeColdVolume() {
        // basic
        HttpRequestDef.Builder<ResizeColdVolumeRequest, ResizeColdVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeColdVolumeRequest.class, ResizeColdVolumeResponse.class)
                .withName("ResizeColdVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/cold-volume")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeColdVolumeRequest::getInstanceId, ResizeColdVolumeRequest::setInstanceId));
        builder.<ResizeColdVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeColdVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeColdVolumeRequest::getBody, ResizeColdVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolume =
        genForResizeInstanceVolume();

    private static HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> genForResizeInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResizeInstanceVolumeRequest.class, ResizeInstanceVolumeResponse.class)
            .withName("ResizeInstanceVolume")
            .withUri("/v3/{project_id}/instances/{instance_id}/extend-volume")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getInstanceId,
                ResizeInstanceVolumeRequest::setInstanceId));
        builder.<ResizeInstanceVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getBody, ResizeInstanceVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> restartInstance =
        genForRestartInstance();

    private static HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> genForRestartInstance() {
        // basic
        HttpRequestDef.Builder<RestartInstanceRequest, RestartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartInstanceRequest.class, RestartInstanceResponse.class)
                .withName("RestartInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, RestartInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstance =
        genForRestoreExistingInstance();

    private static HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> genForRestoreExistingInstance() {
        // basic
        HttpRequestDef.Builder<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreExistingInstanceRequest.class, RestoreExistingInstanceResponse.class)
            .withName("RestoreExistingInstance")
            .withUri("/v3/{project_id}/instances/{instance_id}/recovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getInstanceId,
                RestoreExistingInstanceRequest::setInstanceId));
        builder.<RestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreRequestBody.class),
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getBody, RestoreExistingInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveLtsConfigsRequest, SaveLtsConfigsResponse> saveLtsConfigs =
        genForSaveLtsConfigs();

    private static HttpRequestDef<SaveLtsConfigsRequest, SaveLtsConfigsResponse> genForSaveLtsConfigs() {
        // basic
        HttpRequestDef.Builder<SaveLtsConfigsRequest, SaveLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveLtsConfigsRequest.class, SaveLtsConfigsResponse.class)
                .withName("SaveLtsConfigs")
                .withUri("/v3/{project_id}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveLtsConfigsRequest::getXLanguage, SaveLtsConfigsRequest::setXLanguage));
        builder.<SaveLtsConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveLtsConfigsRequestBody.class),
            f -> f.withMarshaller(SaveLtsConfigsRequest::getBody, SaveLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicy =
        genForSetAutoEnlargePolicy();

    private static HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> genForSetAutoEnlargePolicy() {
        // basic
        HttpRequestDef.Builder<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetAutoEnlargePolicyRequest.class, SetAutoEnlargePolicyResponse.class)
            .withName("SetAutoEnlargePolicy")
            .withUri("/v3/{project_id}/instances/disk-auto-expansion")
            .withContentType("application/json");

        // requests
        builder.<SetAutoPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetAutoPolicyRequestBody.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getBody, SetAutoEnlargePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForSetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForSetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, SetBackupPolicyRequest::setInstanceId));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, SetBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicy =
        genForSetRecyclePolicy();

    private static HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> genForSetRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<SetRecyclePolicyRequest, SetRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecyclePolicyRequest.class, SetRecyclePolicyResponse.class)
                .withName("SetRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<RecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecyclePolicyRequestBody.class),
            f -> f.withMarshaller(SetRecyclePolicyRequest::getBody, SetRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackups =
        genForShowAllInstancesBackups();

    private static HttpRequestDef<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> genForShowAllInstancesBackups() {
        // basic
        HttpRequestDef.Builder<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAllInstancesBackupsRequest.class, ShowAllInstancesBackupsResponse.class)
            .withName("ShowAllInstancesBackups")
            .withUri("/v3/{project_id}/backups")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getOffset,
                ShowAllInstancesBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getLimit, ShowAllInstancesBackupsRequest::setLimit));
        builder.<ShowAllInstancesBackupsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAllInstancesBackupsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getDatastoreType,
                ShowAllInstancesBackupsRequest::setDatastoreType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getInstanceId,
                ShowAllInstancesBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBackupId,
                ShowAllInstancesBackupsRequest::setBackupId));
        builder.<ShowAllInstancesBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAllInstancesBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBackupType,
                ShowAllInstancesBackupsRequest::setBackupType));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBeginTime,
                ShowAllInstancesBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getEndTime,
                ShowAllInstancesBackupsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNew =
        genForShowAllInstancesBackupsNew();

    private static HttpRequestDef<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> genForShowAllInstancesBackupsNew() {
        // basic
        HttpRequestDef.Builder<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAllInstancesBackupsNewRequest.class,
                    ShowAllInstancesBackupsNewResponse.class)
                .withName("ShowAllInstancesBackupsNew")
                .withUri("/v3.1/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getInstanceId,
                ShowAllInstancesBackupsNewRequest::setInstanceId));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getDatastoreType,
                ShowAllInstancesBackupsNewRequest::setDatastoreType));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBackupId,
                ShowAllInstancesBackupsNewRequest::setBackupId));
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBackupType,
                ShowAllInstancesBackupsNewRequest::setBackupType));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getType,
                ShowAllInstancesBackupsNewRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getLimit,
                ShowAllInstancesBackupsNewRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getOffset,
                ShowAllInstancesBackupsNewRequest::setOffset));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBeginTime,
                ShowAllInstancesBackupsNewRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getEndTime,
                ShowAllInstancesBackupsNewRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstances =
        genForShowApplicableInstances();

    private static HttpRequestDef<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> genForShowApplicableInstances() {
        // basic
        HttpRequestDef.Builder<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowApplicableInstancesRequest.class, ShowApplicableInstancesResponse.class)
            .withName("ShowApplicableInstances")
            .withUri("/v3/{project_id}/configurations/{config_id}/applicable-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getConfigId,
                ShowApplicableInstancesRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getOffset,
                ShowApplicableInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getLimit, ShowApplicableInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistory =
        genForShowApplyHistory();

    private static HttpRequestDef<ShowApplyHistoryRequest, ShowApplyHistoryResponse> genForShowApplyHistory() {
        // basic
        HttpRequestDef.Builder<ShowApplyHistoryRequest, ShowApplyHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplyHistoryRequest.class, ShowApplyHistoryResponse.class)
                .withName("ShowApplyHistory")
                .withUri("/v3/{project_id}/configurations/{config_id}/applied-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplyHistoryRequest::getConfigId, ShowApplyHistoryRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplyHistoryRequest::getOffset, ShowApplyHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplyHistoryRequest::getLimit, ShowApplyHistoryRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicy =
        genForShowAutoEnlargePolicy();

    private static HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> genForShowAutoEnlargePolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoEnlargePolicyRequest.class, ShowAutoEnlargePolicyResponse.class)
            .withName("ShowAutoEnlargePolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/disk-auto-expansion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getInstanceId,
                ShowAutoEnlargePolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForShowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForShowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, ShowBackupPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail =
        genForShowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForShowConfigurationDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConfigurationDetailRequest.class, ShowConfigurationDetailResponse.class)
            .withName("ShowConfigurationDetail")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId,
                ShowConfigurationDetailRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowElbIpGroupRequest, ShowElbIpGroupResponse> showElbIpGroup =
        genForShowElbIpGroup();

    private static HttpRequestDef<ShowElbIpGroupRequest, ShowElbIpGroupResponse> genForShowElbIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowElbIpGroupRequest, ShowElbIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowElbIpGroupRequest.class, ShowElbIpGroupResponse.class)
                .withName("ShowElbIpGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/lb/access-control")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowElbIpGroupRequest::getInstanceId, ShowElbIpGroupRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLog = genForShowErrorLog();

    private static HttpRequestDef<ShowErrorLogRequest, ShowErrorLogResponse> genForShowErrorLog() {
        // basic
        HttpRequestDef.Builder<ShowErrorLogRequest, ShowErrorLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowErrorLogRequest.class, ShowErrorLogResponse.class)
                .withName("ShowErrorLog")
                .withUri("/v3/{project_id}/instances/{instance_id}/error-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getInstanceId, ShowErrorLogRequest::setInstanceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getStartTime, ShowErrorLogRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getEndTime, ShowErrorLogRequest::setEndTime));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getNodeId, ShowErrorLogRequest::setNodeId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getType, ShowErrorLogRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getOffset, ShowErrorLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getLimit, ShowErrorLogRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> showHighRiskCommands =
        genForShowHighRiskCommands();

    private static HttpRequestDef<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> genForShowHighRiskCommands() {
        // basic
        HttpRequestDef.Builder<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHighRiskCommandsRequest.class, ShowHighRiskCommandsResponse.class)
            .withName("ShowHighRiskCommands")
            .withUri("/v3/{project_id}/instances/{instance_id}/high-risk-commands")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHighRiskCommandsRequest::getInstanceId,
                ShowHighRiskCommandsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> showInstanceBiactiveRegions =
        genForShowInstanceBiactiveRegions();

    private static HttpRequestDef<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> genForShowInstanceBiactiveRegions() {
        // basic
        HttpRequestDef.Builder<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceBiactiveRegionsRequest.class,
                    ShowInstanceBiactiveRegionsResponse.class)
                .withName("ShowInstanceBiactiveRegions")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/regions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceBiactiveRegionsRequest::getInstanceId,
                ShowInstanceBiactiveRegionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForShowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForShowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceConfigurationRequest.class,
                    ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId,
                ShowInstanceConfigurationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRole =
        genForShowInstanceRole();

    private static HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> genForShowInstanceRole() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRoleRequest, ShowInstanceRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRoleRequest.class, ShowInstanceRoleResponse.class)
                .withName("ShowInstanceRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/instance-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRoleRequest::getInstanceId, ShowInstanceRoleRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirement =
        genForShowIpNumRequirement();

    private static HttpRequestDef<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> genForShowIpNumRequirement() {
        // basic
        HttpRequestDef.Builder<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIpNumRequirementRequest.class, ShowIpNumRequirementResponse.class)
            .withName("ShowIpNumRequirement")
            .withUri("/v3/{project_id}/ip-num-requirement")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("node_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getNodeNum, ShowIpNumRequirementRequest::setNodeNum));
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getEngineName,
                ShowIpNumRequirementRequest::setEngineName));
        builder.<String>withRequestField("instance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getInstanceMode,
                ShowIpNumRequirementRequest::setInstanceMode));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getInstanceId,
                ShowIpNumRequirementRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistory =
        genForShowModifyHistory();

    private static HttpRequestDef<ShowModifyHistoryRequest, ShowModifyHistoryResponse> genForShowModifyHistory() {
        // basic
        HttpRequestDef.Builder<ShowModifyHistoryRequest, ShowModifyHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowModifyHistoryRequest.class, ShowModifyHistoryResponse.class)
                .withName("ShowModifyHistory")
                .withUri("/v3/{project_id}/instances/{instance_id}/configuration-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModifyHistoryRequest::getInstanceId, ShowModifyHistoryRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModifyHistoryRequest::getOffset, ShowModifyHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModifyHistoryRequest::getLimit, ShowModifyHistoryRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutus =
        genForShowPauseResumeStutus();

    private static HttpRequestDef<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> genForShowPauseResumeStutus() {
        // basic
        HttpRequestDef.Builder<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPauseResumeStutusRequest.class, ShowPauseResumeStutusResponse.class)
            .withName("ShowPauseResumeStutus")
            .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery/data-synchronization")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPauseResumeStutusRequest::getInstanceId,
                ShowPauseResumeStutusRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotasRequest::getDatastoreType, ShowQuotasRequest::setDatastoreType));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotasRequest::getMode, ShowQuotasRequest::setMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForShowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForShowRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecyclePolicyRequest.class, ShowRecyclePolicyResponse.class)
                .withName("ShowRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, ShowRecyclePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableList =
        genForShowRestorableList();

    private static HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> genForShowRestorableList() {
        // basic
        HttpRequestDef.Builder<ShowRestorableListRequest, ShowRestorableListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRestorableListRequest.class, ShowRestorableListResponse.class)
                .withName("ShowRestorableList")
                .withUri("/v3/{project_id}/backups/{backup_id}/restorable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getBackupId, ShowRestorableListRequest::setBackupId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getOffset, ShowRestorableListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getLimit, ShowRestorableListRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitization =
        genForShowSlowLogDesensitization();

    private static HttpRequestDef<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> genForShowSlowLogDesensitization() {
        // basic
        HttpRequestDef.Builder<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSlowLogDesensitizationRequest.class,
                    ShowSlowLogDesensitizationResponse.class)
                .withName("ShowSlowLogDesensitization")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-desensitization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowLogDesensitizationRequest::getInstanceId,
                ShowSlowLogDesensitizationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNode =
        genForShrinkInstanceNode();

    private static HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> genForShrinkInstanceNode() {
        // basic
        HttpRequestDef.Builder<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShrinkInstanceNodeRequest.class, ShrinkInstanceNodeResponse.class)
                .withName("ShrinkInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/reduce-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getInstanceId, ShrinkInstanceNodeRequest::setInstanceId));
        builder.<ShrinkInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getBody, ShrinkInstanceNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchIpGroupRequest, SwitchIpGroupResponse> switchIpGroup =
        genForSwitchIpGroup();

    private static HttpRequestDef<SwitchIpGroupRequest, SwitchIpGroupResponse> genForSwitchIpGroup() {
        // basic
        HttpRequestDef.Builder<SwitchIpGroupRequest, SwitchIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchIpGroupRequest.class, SwitchIpGroupResponse.class)
                .withName("SwitchIpGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/lb/access-control")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchIpGroupRequest::getInstanceId, SwitchIpGroupRequest::setInstanceId));
        builder.<SwitchIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchIpGroupRequestBody.class),
            f -> f.withMarshaller(SwitchIpGroupRequest::getBody, SwitchIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitization =
        genForSwitchSlowlogDesensitization();

    private static HttpRequestDef<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> genForSwitchSlowlogDesensitization() {
        // basic
        HttpRequestDef.Builder<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchSlowlogDesensitizationRequest.class,
                    SwitchSlowlogDesensitizationResponse.class)
                .withName("SwitchSlowlogDesensitization")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-desensitization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getInstanceId,
                SwitchSlowlogDesensitizationRequest::setInstanceId));
        builder.<SwitchSlowlogDesensitizationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSlowlogDesensitizationRequestBody.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getBody,
                SwitchSlowlogDesensitizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForSwitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForSwitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-option")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, SwitchSslRequest::setInstanceId));
        builder.<SwitchSslRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSslRequestBody.class),
            f -> f.withMarshaller(SwitchSslRequest::getBody, SwitchSslRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> switchToMaster =
        genForSwitchToMaster();

    private static HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> genForSwitchToMaster() {
        // basic
        HttpRequestDef.Builder<SwitchToMasterRequest, SwitchToMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchToMasterRequest.class, SwitchToMasterResponse.class)
                .withName("SwitchToMaster")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover-master")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchToMasterRequest::getInstanceId, SwitchToMasterRequest::setInstanceId));
        builder.<SwitchToMasterDisasterRecoveryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchToMasterDisasterRecoveryBody.class),
            f -> f.withMarshaller(SwitchToMasterRequest::getBody, SwitchToMasterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlave =
        genForSwitchToSlave();

    private static HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> genForSwitchToSlave() {
        // basic
        HttpRequestDef.Builder<SwitchToSlaveRequest, SwitchToSlaveResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchToSlaveRequest.class, SwitchToSlaveResponse.class)
                .withName("SwitchToSlave")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover-slave")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchToSlaveRequest::getInstanceId, SwitchToSlaveRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetwork =
        genForUpdateClientNetwork();

    private static HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> genForUpdateClientNetwork() {
        // basic
        HttpRequestDef.Builder<UpdateClientNetworkRequest, UpdateClientNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateClientNetworkRequest.class, UpdateClientNetworkResponse.class)
                .withName("UpdateClientNetwork")
                .withUri("/v3/{project_id}/instances/{instance_id}/client-network")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClientNetworkRequest::getInstanceId,
                UpdateClientNetworkRequest::setInstanceId));
        builder.<UpdateClientNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClientNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateClientNetworkRequest::getBody, UpdateClientNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForUpdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForUpdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, UpdateConfigurationRequest::setConfigId));
        builder.<UpdateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, UpdateConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabasesRequest, UpdateDatabasesResponse> updateDatabases =
        genForUpdateDatabases();

    private static HttpRequestDef<UpdateDatabasesRequest, UpdateDatabasesResponse> genForUpdateDatabases() {
        // basic
        HttpRequestDef.Builder<UpdateDatabasesRequest, UpdateDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDatabasesRequest.class, UpdateDatabasesResponse.class)
                .withName("UpdateDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabasesRequest::getInstanceId, UpdateDatabasesRequest::setInstanceId));
        builder.<UpdateDatabasesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabasesRequestBody.class),
            f -> f.withMarshaller(UpdateDatabasesRequest::getBody, UpdateDatabasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> updateHighRiskCommands =
        genForUpdateHighRiskCommands();

    private static HttpRequestDef<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> genForUpdateHighRiskCommands() {
        // basic
        HttpRequestDef.Builder<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHighRiskCommandsRequest.class, UpdateHighRiskCommandsResponse.class)
            .withName("UpdateHighRiskCommands")
            .withUri("/v3/{project_id}/instances/{instance_id}/high-risk-commands")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHighRiskCommandsRequest::getInstanceId,
                UpdateHighRiskCommandsRequest::setInstanceId));
        builder.<RenameHighRiskCommandsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RenameHighRiskCommandsRequest.class),
            f -> f.withMarshaller(UpdateHighRiskCommandsRequest::getBody, UpdateHighRiskCommandsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForUpdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForUpdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationRequest.class,
                    UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId,
                UpdateInstanceConfigurationRequest::setInstanceId));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody,
                UpdateInstanceConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForUpdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForUpdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, UpdateInstanceNameRequest::setInstanceId));
        builder.<UpdateInstanceNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, UpdateInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForUpdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForUpdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getInstanceId,
                UpdateSecurityGroupRequest::setInstanceId));
        builder.<UpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, UpdateSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersion =
        genForUpgradeDbVersion();

    private static HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> genForUpgradeDbVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeDbVersionRequest, UpgradeDbVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeDbVersionRequest.class, UpgradeDbVersionResponse.class)
                .withName("UpgradeDbVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getInstanceId, UpgradeDbVersionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForListApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForListApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, ShowApiVersionRequest::setVersion));

        // response

        return builder.build();
    }

}

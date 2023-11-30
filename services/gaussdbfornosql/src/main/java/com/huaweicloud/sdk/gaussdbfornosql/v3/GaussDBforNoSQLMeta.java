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
        genForapplyConfiguration();

    private static HttpRequestDef<ApplyConfigurationRequest, ApplyConfigurationResponse> genForapplyConfiguration() {
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
            f -> f.withMarshaller(ApplyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(ApplyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForbatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForbatchTagAction() {
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
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BatchTagActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperation =
        genForcheckDisasterRecoveryOperation();

    private static HttpRequestDef<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> genForcheckDisasterRecoveryOperation() {
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
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<PrecheckDisasterRecoveryOperationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrecheckDisasterRecoveryOperationBody.class),
            f -> f.withMarshaller(CheckDisasterRecoveryOperationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPassword =
        genForcheckWeekPassword();

    private static HttpRequestDef<CheckWeekPasswordRequest, CheckWeekPasswordResponse> genForcheckWeekPassword() {
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
            f -> f.withMarshaller(CheckWeekPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompareConfigurationRequest, CompareConfigurationResponse> compareConfiguration =
        genForcompareConfiguration();

    private static HttpRequestDef<CompareConfigurationRequest, CompareConfigurationResponse> genForcompareConfiguration() {
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
            f -> f.withMarshaller(CompareConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration =
        genForcopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForcopyConfiguration() {
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
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<CopyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyConfigurationRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackRequest, CreateBackResponse> createBack = genForcreateBack();

    private static HttpRequestDef<CreateBackRequest, CreateBackResponse> genForcreateBack() {
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
            f -> f.withMarshaller(CreateBackRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<NoSqlCreateBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NoSqlCreateBackupRequestBody.class),
            f -> f.withMarshaller(CreateBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolume =
        genForcreateColdVolume();

    private static HttpRequestDef<CreateColdVolumeRequest, CreateColdVolumeResponse> genForcreateColdVolume() {
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
            f -> f.withMarshaller(CreateColdVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateColdVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateColdVolumeRequestBody.class),
            f -> f.withMarshaller(CreateColdVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration =
        genForcreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForcreateConfiguration() {
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
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForcreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForcreateDbUser() {
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
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RedisCreateDbUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisCreateDbUserRequest.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecovery =
        genForcreateDisasterRecovery();

    private static HttpRequestDef<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> genForcreateDisasterRecovery() {
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
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ConstructDisasterRecoveryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConstructDisasterRecoveryBody.class),
            f -> f.withMarshaller(CreateDisasterRecoveryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
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
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> deleteBackup = genFordeleteBackup();

    private static HttpRequestDef<DeleteBackupRequest, DeleteBackupResponse> genFordeleteBackup() {
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
            f -> f.withMarshaller(DeleteBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
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
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genFordeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genFordeleteDbUser() {
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
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RedisDeleteDbUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisDeleteDbUserRequest.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genFordeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genFordeleteDisasterRecovery() {
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
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNode =
        genFordeleteEnlargeFailNode();

    private static HttpRequestDef<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> genFordeleteEnlargeFailNode() {
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
            f -> f.withMarshaller(DeleteEnlargeFailNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteEnlargeFailNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteEnlargeFailNodeRequestBody.class),
            f -> f.withMarshaller(DeleteEnlargeFailNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
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
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> deleteInstancesSession =
        genFordeleteInstancesSession();

    private static HttpRequestDef<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> genFordeleteInstancesSession() {
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
            f -> f.withMarshaller(DeleteInstancesSessionRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<DeleteInstancesSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstancesSessionRequestBody.class),
            f -> f.withMarshaller(DeleteInstancesSessionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigs =
        genFordeleteLtsConfigs();

    private static HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> genFordeleteLtsConfigs() {
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
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteLtsConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLtsConfigsRequestBody.class),
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNode =
        genForexpandInstanceNode();

    private static HttpRequestDef<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> genForexpandInstanceNode() {
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
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExpandInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ExpandInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfos =
        genForlistAvailableFlavorInfos();

    private static HttpRequestDef<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> genForlistAvailableFlavorInfos() {
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
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAvailableFlavorInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> listCassandraSlowLogs =
        genForlistCassandraSlowLogs();

    private static HttpRequestDef<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> genForlistCassandraSlowLogs() {
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
            f -> f.withMarshaller(ListCassandraSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListCassandraSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCassandraSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListCassandraSlowLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastores =
        genForlistConfigurationDatastores();

    private static HttpRequestDef<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> genForlistConfigurationDatastores() {
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
        genForlistConfigurationTemplates();

    private static HttpRequestDef<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> genForlistConfigurationTemplates() {
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
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
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
        genForlistDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForlistDatastores() {
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
            f -> f.withMarshaller(ListDatastoresRequest::getDatastoreName, (req, v) -> {
                req.setDatastoreName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForlistDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForlistDbUsers() {
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
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResources =
        genForlistDedicatedResources();

    private static HttpRequestDef<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> genForlistDedicatedResources() {
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
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDedicatedResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotas =
        genForlistEpsQuotas();

    private static HttpRequestDef<ListEpsQuotasRequest, ListEpsQuotasResponse> genForlistEpsQuotas() {
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
            f -> f.withMarshaller(ListEpsQuotasRequest::getEnterpriseProjectName, (req, v) -> {
                req.setEnterpriseProjectName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEpsQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfos =
        genForlistFlavorInfos();

    private static HttpRequestDef<ListFlavorInfosRequest, ListFlavorInfosResponse> genForlistFlavorInfos() {
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
            f -> f.withMarshaller(ListFlavorInfosRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
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
            f -> f.withMarshaller(ListFlavorsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> listInfluxdbSlowLogs =
        genForlistInfluxdbSlowLogs();

    private static HttpRequestDef<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> genForlistInfluxdbSlowLogs() {
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
            f -> f.withMarshaller(ListInfluxdbSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListInfluxdbSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInfluxdbSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListInfluxdbSlowLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabases =
        genForlistInstanceDatabases();

    private static HttpRequestDef<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> genForlistInstanceDatabases() {
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
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
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
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
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
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTags =
        genForlistInstancesByResourceTags();

    private static HttpRequestDef<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> genForlistInstancesByResourceTags() {
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
            f -> f.withMarshaller(ListInstancesByResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTags =
        genForlistInstancesByTags();

    private static HttpRequestDef<ListInstancesByTagsRequest, ListInstancesByTagsResponse> genForlistInstancesByTags() {
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
            f -> f.withMarshaller(ListInstancesByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSessionRequest, ListInstancesSessionResponse> listInstancesSession =
        genForlistInstancesSession();

    private static HttpRequestDef<ListInstancesSessionRequest, ListInstancesSessionResponse> genForlistInstancesSession() {
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
            f -> f.withMarshaller(ListInstancesSessionRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("addr_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesSessionRequest::getAddrPrefix, (req, v) -> {
                req.setAddrPrefix(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> listInstancesSessionStatistics =
        genForlistInstancesSessionStatistics();

    private static HttpRequestDef<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> genForlistInstancesSessionStatistics() {
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
            f -> f.withMarshaller(ListInstancesSessionStatisticsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigs =
        genForlistLtsConfigs();

    private static HttpRequestDef<ListLtsConfigsRequest, ListLtsConfigsResponse> genForlistLtsConfigs() {
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
            f -> f.withMarshaller(ListLtsConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsConfigsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> listMongodbErrorLogs =
        genForlistMongodbErrorLogs();

    private static HttpRequestDef<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> genForlistMongodbErrorLogs() {
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
            f -> f.withMarshaller(ListMongodbErrorLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListMongodbErrorLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMongodbErrorLogsRequestBody.class),
            f -> f.withMarshaller(ListMongodbErrorLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> listMongodbSlowLogs =
        genForlistMongodbSlowLogs();

    private static HttpRequestDef<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> genForlistMongodbSlowLogs() {
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
            f -> f.withMarshaller(ListMongodbSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListMongodbSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMongodbSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListMongodbSlowLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
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
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances =
        genForlistRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForlistRecycleInstances() {
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
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> listRedisSlowLogs =
        genForlistRedisSlowLogs();

    private static HttpRequestDef<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> genForlistRedisSlowLogs() {
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
            f -> f.withMarshaller(ListRedisSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListRedisSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRedisSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListRedisSlowLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabases =
        genForlistRestoreDatabases();

    private static HttpRequestDef<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> genForlistRestoreDatabases() {
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
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTablesRequest, ListRestoreTablesResponse> listRestoreTables =
        genForlistRestoreTables();

    private static HttpRequestDef<ListRestoreTablesRequest, ListRestoreTablesResponse> genForlistRestoreTables() {
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
            f -> f.withMarshaller(ListRestoreTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTablesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTime =
        genForlistRestoreTime();

    private static HttpRequestDef<ListRestoreTimeRequest, ListRestoreTimeResponse> genForlistRestoreTime() {
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
            f -> f.withMarshaller(ListRestoreTimeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreTimeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForlistSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForlistSlowLogs() {
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
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilege =
        genFormodifyDbUserPrivilege();

    private static HttpRequestDef<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> genFormodifyDbUserPrivilege() {
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
            f -> f.withMarshaller(ModifyDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RedisModifyDBUserPrivilegeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisModifyDBUserPrivilegeRequest.class),
            f -> f.withMarshaller(ModifyDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotas =
        genFormodifyEpsQuotas();

    private static HttpRequestDef<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> genFormodifyEpsQuotas() {
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
            f -> f.withMarshaller(ModifyEpsQuotasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPortRequest, ModifyPortResponse> modifyPort = genFormodifyPort();

    private static HttpRequestDef<ModifyPortRequest, ModifyPortResponse> genFormodifyPort() {
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
            f -> f.withMarshaller(ModifyPortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPortRequestBody.class),
            f -> f.withMarshaller(ModifyPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIp =
        genFormodifyPublicIp();

    private static HttpRequestDef<ModifyPublicIpRequest, ModifyPublicIpResponse> genFormodifyPublicIp() {
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
            f -> f.withMarshaller(ModifyPublicIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPublicIpRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ModifyPublicIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPublicIpRequestBody.class),
            f -> f.withMarshaller(ModifyPublicIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolume = genFormodifyVolume();

    private static HttpRequestDef<ModifyVolumeRequest, ModifyVolumeResponse> genFormodifyVolume() {
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
            f -> f.withMarshaller(ModifyVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ModifyVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyVolumeRequestBody.class),
            f -> f.withMarshaller(ModifyVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronization =
        genForpauseResumeDataSynchronization();

    private static HttpRequestDef<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> genForpauseResumeDataSynchronization() {
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
            f -> f.withMarshaller(PauseResumeDataSynchronizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ActionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionBody.class),
            f -> f.withMarshaller(PauseResumeDataSynchronizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPassword =
        genForresetDbUserPassword();

    private static HttpRequestDef<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> genForresetDbUserPassword() {
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
            f -> f.withMarshaller(ResetDbUserPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RedisResetDbUserPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RedisResetDbUserPasswordRequestBody.class),
            f -> f.withMarshaller(ResetDbUserPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> resetParamGroupTemplate =
        genForresetParamGroupTemplate();

    private static HttpRequestDef<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> genForresetParamGroupTemplate() {
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
            f -> f.withMarshaller(ResetParamGroupTemplateRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
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
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPasswordRequestBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolume =
        genForresizeColdVolume();

    private static HttpRequestDef<ResizeColdVolumeRequest, ResizeColdVolumeResponse> genForresizeColdVolume() {
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
            f -> f.withMarshaller(ResizeColdVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeColdVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeColdVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeColdVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
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
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolume =
        genForresizeInstanceVolume();

    private static HttpRequestDef<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> genForresizeInstanceVolume() {
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
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResizeInstanceVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceVolumeRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceVolumeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> restartInstance =
        genForrestartInstance();

    private static HttpRequestDef<RestartInstanceRequest, RestartInstanceResponse> genForrestartInstance() {
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
            f -> f.withMarshaller(RestartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstance =
        genForrestoreExistingInstance();

    private static HttpRequestDef<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> genForrestoreExistingInstance() {
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
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreRequestBody.class),
            f -> f.withMarshaller(RestoreExistingInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveLtsConfigsRequest, SaveLtsConfigsResponse> saveLtsConfigs =
        genForsaveLtsConfigs();

    private static HttpRequestDef<SaveLtsConfigsRequest, SaveLtsConfigsResponse> genForsaveLtsConfigs() {
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
            f -> f.withMarshaller(SaveLtsConfigsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SaveLtsConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveLtsConfigsRequestBody.class),
            f -> f.withMarshaller(SaveLtsConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicy =
        genForsetAutoEnlargePolicy();

    private static HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> genForsetAutoEnlargePolicy() {
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
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
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
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicy =
        genForsetRecyclePolicy();

    private static HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> genForsetRecyclePolicy() {
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
            f -> f.withMarshaller(SetRecyclePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackups =
        genForshowAllInstancesBackups();

    private static HttpRequestDef<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> genForshowAllInstancesBackups() {
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
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowAllInstancesBackupsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAllInstancesBackupsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<ShowAllInstancesBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAllInstancesBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNew =
        genForshowAllInstancesBackupsNew();

    private static HttpRequestDef<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> genForshowAllInstancesBackupsNew() {
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
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllInstancesBackupsNewRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstances =
        genForshowApplicableInstances();

    private static HttpRequestDef<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> genForshowApplicableInstances() {
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
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplicableInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistory =
        genForshowApplyHistory();

    private static HttpRequestDef<ShowApplyHistoryRequest, ShowApplyHistoryResponse> genForshowApplyHistory() {
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
            f -> f.withMarshaller(ShowApplyHistoryRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplyHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApplyHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicy =
        genForshowAutoEnlargePolicy();

    private static HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> genForshowAutoEnlargePolicy() {
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
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
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
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetail =
        genForshowConfigurationDetail();

    private static HttpRequestDef<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> genForshowConfigurationDetail() {
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
            f -> f.withMarshaller(ShowConfigurationDetailRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowElbIpGroupRequest, ShowElbIpGroupResponse> showElbIpGroup =
        genForshowElbIpGroup();

    private static HttpRequestDef<ShowElbIpGroupRequest, ShowElbIpGroupResponse> genForshowElbIpGroup() {
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
            f -> f.withMarshaller(ShowElbIpGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLog = genForshowErrorLog();

    private static HttpRequestDef<ShowErrorLogRequest, ShowErrorLogResponse> genForshowErrorLog() {
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
            f -> f.withMarshaller(ShowErrorLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowErrorLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> showHighRiskCommands =
        genForshowHighRiskCommands();

    private static HttpRequestDef<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> genForshowHighRiskCommands() {
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
            f -> f.withMarshaller(ShowHighRiskCommandsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> showInstanceBiactiveRegions =
        genForshowInstanceBiactiveRegions();

    private static HttpRequestDef<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> genForshowInstanceBiactiveRegions() {
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
            f -> f.withMarshaller(ShowInstanceBiactiveRegionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForshowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForshowInstanceConfiguration() {
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
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRole =
        genForshowInstanceRole();

    private static HttpRequestDef<ShowInstanceRoleRequest, ShowInstanceRoleResponse> genForshowInstanceRole() {
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
            f -> f.withMarshaller(ShowInstanceRoleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirement =
        genForshowIpNumRequirement();

    private static HttpRequestDef<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> genForshowIpNumRequirement() {
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
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getNodeNum, (req, v) -> {
                req.setNodeNum(v);
            }));
        builder.<String>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getEngineName, (req, v) -> {
                req.setEngineName(v);
            }));
        builder.<String>withRequestField("instance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getInstanceMode, (req, v) -> {
                req.setInstanceMode(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpNumRequirementRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistory =
        genForshowModifyHistory();

    private static HttpRequestDef<ShowModifyHistoryRequest, ShowModifyHistoryResponse> genForshowModifyHistory() {
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
            f -> f.withMarshaller(ShowModifyHistoryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModifyHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModifyHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutus =
        genForshowPauseResumeStutus();

    private static HttpRequestDef<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> genForshowPauseResumeStutus() {
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
            f -> f.withMarshaller(ShowPauseResumeStutusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
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
            f -> f.withMarshaller(ShowQuotasRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotasRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForshowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForshowRecyclePolicy() {
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
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableList =
        genForshowRestorableList();

    private static HttpRequestDef<ShowRestorableListRequest, ShowRestorableListResponse> genForshowRestorableList() {
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
            f -> f.withMarshaller(ShowRestorableListRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRestorableListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitization =
        genForshowSlowLogDesensitization();

    private static HttpRequestDef<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> genForshowSlowLogDesensitization() {
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
            f -> f.withMarshaller(ShowSlowLogDesensitizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNode =
        genForshrinkInstanceNode();

    private static HttpRequestDef<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> genForshrinkInstanceNode() {
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
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShrinkInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ShrinkInstanceNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchIpGroupRequest, SwitchIpGroupResponse> switchIpGroup =
        genForswitchIpGroup();

    private static HttpRequestDef<SwitchIpGroupRequest, SwitchIpGroupResponse> genForswitchIpGroup() {
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
            f -> f.withMarshaller(SwitchIpGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SwitchIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchIpGroupRequestBody.class),
            f -> f.withMarshaller(SwitchIpGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitization =
        genForswitchSlowlogDesensitization();

    private static HttpRequestDef<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> genForswitchSlowlogDesensitization() {
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
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SwitchSlowlogDesensitizationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSlowlogDesensitizationRequestBody.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForswitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForswitchSsl() {
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
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SwitchSslRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSslRequestBody.class),
            f -> f.withMarshaller(SwitchSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> switchToMaster =
        genForswitchToMaster();

    private static HttpRequestDef<SwitchToMasterRequest, SwitchToMasterResponse> genForswitchToMaster() {
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
            f -> f.withMarshaller(SwitchToMasterRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SwitchToMasterDisasterRecoveryBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchToMasterDisasterRecoveryBody.class),
            f -> f.withMarshaller(SwitchToMasterRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlave =
        genForswitchToSlave();

    private static HttpRequestDef<SwitchToSlaveRequest, SwitchToSlaveResponse> genForswitchToSlave() {
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
            f -> f.withMarshaller(SwitchToSlaveRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetwork =
        genForupdateClientNetwork();

    private static HttpRequestDef<UpdateClientNetworkRequest, UpdateClientNetworkResponse> genForupdateClientNetwork() {
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
            f -> f.withMarshaller(UpdateClientNetworkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateClientNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClientNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateClientNetworkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
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
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<UpdateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> updateHighRiskCommands =
        genForupdateHighRiskCommands();

    private static HttpRequestDef<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> genForupdateHighRiskCommands() {
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
            f -> f.withMarshaller(UpdateHighRiskCommandsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RenameHighRiskCommandsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RenameHighRiskCommandsRequest.class),
            f -> f.withMarshaller(UpdateHighRiskCommandsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForupdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForupdateInstanceConfiguration() {
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
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForupdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForupdateInstanceName() {
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
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForupdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForupdateSecurityGroup() {
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
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateSecurityGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersion =
        genForupgradeDbVersion();

    private static HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> genForupgradeDbVersion() {
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
            f -> f.withMarshaller(UpgradeDbVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
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
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
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
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

}

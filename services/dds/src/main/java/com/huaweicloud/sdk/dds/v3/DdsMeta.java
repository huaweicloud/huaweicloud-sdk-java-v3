package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeRequestBody;
import com.huaweicloud.sdk.dds.v3.model.AddReadonlyNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.AddShardingNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.ApplyConfigurationRequestBody;
import com.huaweicloud.sdk.dds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachEipRequestBody;
import com.huaweicloud.sdk.dds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpRequest;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpRequestBody;
import com.huaweicloud.sdk.dds.v3.model.AttachInternalIpResponse;
import com.huaweicloud.sdk.dds.v3.model.BalancerActiveWindow;
import com.huaweicloud.sdk.dds.v3.model.BatchOperateInstanceTagRequestBody;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.dds.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.dds.v3.model.CancelEipRequest;
import com.huaweicloud.sdk.dds.v3.model.CancelEipResponse;
import com.huaweicloud.sdk.dds.v3.model.ChangeOpsWindowRequest;
import com.huaweicloud.sdk.dds.v3.model.ChangeOpsWindowResponse;
import com.huaweicloud.sdk.dds.v3.model.CheckPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.CheckPasswordRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CheckPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.CheckWeakPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.CheckWeakPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.ClientNetworkRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CompareConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CompareConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CopyConfigurationRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateConfigurationRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseRoleRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseRoleRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseRoleResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseUserRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateDatabaseUserResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateIpRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateIpRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateIpResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateKillOpRuleRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateKillOpRuleRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateKillOpRuleResponse;
import com.huaweicloud.sdk.dds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.CreateManualBackupRequestBody;
import com.huaweicloud.sdk.dds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteAuditLogRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteAuditLogRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteAuditLogResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseRoleRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseRoleRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseRoleResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseUserRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseUserRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteDatabaseUserResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteKillOpRuleListRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteKillOpRuleListRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteKillOpRuleListResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteLtsConfigRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteLtsConfigRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteLtsConfigResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteReadonlyNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteReadonlyNodeRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteReadonlyNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.DeleteSessionRequest;
import com.huaweicloud.sdk.dds.v3.model.DeleteSessionRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DeleteSessionResponse;
import com.huaweicloud.sdk.dds.v3.model.DiffConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.DownloadErrorlogRequest;
import com.huaweicloud.sdk.dds.v3.model.DownloadErrorlogRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DownloadErrorlogResponse;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogRequestBody;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.dds.v3.model.EnlargeInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.EnlargeReplicasetNodeRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ExpandReplicasetNodeRequest;
import com.huaweicloud.sdk.dds.v3.model.ExpandReplicasetNodeResponse;
import com.huaweicloud.sdk.dds.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAppliedInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAppliedInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogLinksRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogLinksResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAuditlogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListAz2MigrateRequest;
import com.huaweicloud.sdk.dds.v3.model.ListAz2MigrateResponse;
import com.huaweicloud.sdk.dds.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseRolesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseRolesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseUsersRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabaseUsersResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListDatastoreVersionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListDatastoreVersionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListErrorLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListErrorLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorInfosRequest;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorInfosResponse;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesByTagsRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesByTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsConfigsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsConfigsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsErrorLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsErrorLogsRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ListLtsErrorLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListLtsSlowLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListLtsSlowLogsRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ListLtsSlowLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreCollectionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreCollectionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreDatabasesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreDatabasesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.dds.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSessionsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSessionsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.dds.v3.model.ListSslCertDownloadAddressRequest;
import com.huaweicloud.sdk.dds.v3.model.ListSslCertDownloadAddressResponse;
import com.huaweicloud.sdk.dds.v3.model.ListStorageTypeRequest;
import com.huaweicloud.sdk.dds.v3.model.ListStorageTypeResponse;
import com.huaweicloud.sdk.dds.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.dds.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.dds.v3.model.MigrateAzRequest;
import com.huaweicloud.sdk.dds.v3.model.MigrateAzRequestBody;
import com.huaweicloud.sdk.dds.v3.model.MigrateAzResponse;
import com.huaweicloud.sdk.dds.v3.model.MongoUpdateReplSetV3RequestBody;
import com.huaweicloud.sdk.dds.v3.model.OpsWindowRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ProduceAuditlogLinksRequestBody;
import com.huaweicloud.sdk.dds.v3.model.RecyclePolicyRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ReduceInstanceNodeRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dds.v3.model.ResetPasswordRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceVolumeRequest;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceVolumeRequestBody;
import com.huaweicloud.sdk.dds.v3.model.ResizeInstanceVolumeResponse;
import com.huaweicloud.sdk.dds.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestartInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceFromCollectionRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceFromCollectionRequestBody;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceFromCollectionResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.RestoreNewInstanceRequest;
import com.huaweicloud.sdk.dds.v3.model.RestoreNewInstanceRequestBody;
import com.huaweicloud.sdk.dds.v3.model.RestoreNewInstanceResponse;
import com.huaweicloud.sdk.dds.v3.model.SetAuditlogPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetAuditlogPolicyRequestBody;
import com.huaweicloud.sdk.dds.v3.model.SetAuditlogPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyRequestBody;
import com.huaweicloud.sdk.dds.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerSwitchRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerSwitchResponse;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerWindowRequest;
import com.huaweicloud.sdk.dds.v3.model.SetBalancerWindowResponse;
import com.huaweicloud.sdk.dds.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowAuditlogPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowAuditlogPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupDownloadLinkRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupDownloadLinkResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowClientNetworkRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowClientNetworkResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationAppliedHistoryRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationAppliedHistoryResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationModifyHistoryRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationModifyHistoryResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationParameterRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConfigurationParameterResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowConnectionStatisticsRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowConnectionStatisticsResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowDiskUsageRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowDiskUsageResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowEntityConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowEntityConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowKillOpRuleRuleListRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowKillOpRuleRuleListResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowReplSetNameRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowReplSetNameResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowSecondLevelMonitoringStatusRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowSecondLevelMonitoringStatusResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowShardingBalancerRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowShardingBalancerResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowSlowlogDesensitizationSwitchRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowSlowlogDesensitizationSwitchResponse;
import com.huaweicloud.sdk.dds.v3.model.ShowUpgradeDurationRequest;
import com.huaweicloud.sdk.dds.v3.model.ShowUpgradeDurationResponse;
import com.huaweicloud.sdk.dds.v3.model.ShrinkInstanceNodesRequest;
import com.huaweicloud.sdk.dds.v3.model.ShrinkInstanceNodesResponse;
import com.huaweicloud.sdk.dds.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.dds.v3.model.StopBackupRequestBody;
import com.huaweicloud.sdk.dds.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchInstancePrimaryRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchInstancePrimaryResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSecondLevelMonitoringRequestBody;
import com.huaweicloud.sdk.dds.v3.model.SwitchSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSlowlogDesensitizationRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSlowlogDesensitizationResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchSslRequestBody;
import com.huaweicloud.sdk.dds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.dds.v3.model.SwitchoverReplicaSetRequest;
import com.huaweicloud.sdk.dds.v3.model.SwitchoverReplicaSetResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateClientNetworkRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateClientNetworkResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateConfigurationParameterResult;
import com.huaweicloud.sdk.dds.v3.model.UpdateEntityConfigurationRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateEntityConfigurationResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstancePortRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstancePortResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceRemarkRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceRemarkRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateInstanceRemarkResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateKillOpRuleRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateKillOpRuleRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateKillOpRuleResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateLtsConfigRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateLtsConfigRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateLtsConfigResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateNameRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdatePortRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateReplSetNameRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateReplSetNameResponse;
import com.huaweicloud.sdk.dds.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.dds.v3.model.UpdateSecurityGroupRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.dds.v3.model.UpgradeDatabaseVersionRequest;
import com.huaweicloud.sdk.dds.v3.model.UpgradeDatabaseVersionRequestBody;
import com.huaweicloud.sdk.dds.v3.model.UpgradeDatabaseVersionResponse;
import com.huaweicloud.sdk.dds.v3.model.WeakPasswordCheckRequestBody;

@SuppressWarnings("unchecked")
public class DdsMeta {

    public static final HttpRequestDef<AddReadonlyNodeRequest, AddReadonlyNodeResponse> addReadonlyNode =
        genForAddReadonlyNode();

    private static HttpRequestDef<AddReadonlyNodeRequest, AddReadonlyNodeResponse> genForAddReadonlyNode() {
        // basic
        HttpRequestDef.Builder<AddReadonlyNodeRequest, AddReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddReadonlyNodeRequest.class, AddReadonlyNodeResponse.class)
                .withName("AddReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/readonly-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddReadonlyNodeRequest::getInstanceId, AddReadonlyNodeRequest::setInstanceId));
        builder.<AddReadonlyNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddReadonlyNodeRequestBody.class),
            f -> f.withMarshaller(AddReadonlyNodeRequest::getBody, AddReadonlyNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> addShardingNode =
        genForAddShardingNode();

    private static HttpRequestDef<AddShardingNodeRequest, AddShardingNodeResponse> genForAddShardingNode() {
        // basic
        HttpRequestDef.Builder<AddShardingNodeRequest, AddShardingNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddShardingNodeRequest.class, AddShardingNodeResponse.class)
                .withName("AddShardingNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/enlarge")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddShardingNodeRequest::getInstanceId, AddShardingNodeRequest::setInstanceId));
        builder.<EnlargeInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeInstanceRequestBody.class),
            f -> f.withMarshaller(AddShardingNodeRequest::getBody, AddShardingNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForAttachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForAttachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/nodes/{node_id}/bind-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getNodeId, AttachEipRequest::setNodeId));
        builder.<AttachEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachEipRequestBody.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, AttachEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachInternalIpRequest, AttachInternalIpResponse> attachInternalIp =
        genForAttachInternalIp();

    private static HttpRequestDef<AttachInternalIpRequest, AttachInternalIpResponse> genForAttachInternalIp() {
        // basic
        HttpRequestDef.Builder<AttachInternalIpRequest, AttachInternalIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachInternalIpRequest.class, AttachInternalIpResponse.class)
                .withName("AttachInternalIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-internal-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachInternalIpRequest::getInstanceId, AttachInternalIpRequest::setInstanceId));
        builder.<AttachInternalIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachInternalIpRequestBody.class),
            f -> f.withMarshaller(AttachInternalIpRequest::getBody, AttachInternalIpRequest::setBody));

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
        builder.<BatchOperateInstanceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateInstanceTagRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, BatchTagActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelEipRequest, CancelEipResponse> cancelEip = genForCancelEip();

    private static HttpRequestDef<CancelEipRequest, CancelEipResponse> genForCancelEip() {
        // basic
        HttpRequestDef.Builder<CancelEipRequest, CancelEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelEipRequest.class, CancelEipResponse.class)
                .withName("CancelEip")
                .withUri("/v3/{project_id}/nodes/{node_id}/unbind-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelEipRequest::getNodeId, CancelEipRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindow =
        genForChangeOpsWindow();

    private static HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> genForChangeOpsWindow() {
        // basic
        HttpRequestDef.Builder<ChangeOpsWindowRequest, ChangeOpsWindowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeOpsWindowRequest.class, ChangeOpsWindowResponse.class)
                .withName("ChangeOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/maintenance-window")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getInstanceId, ChangeOpsWindowRequest::setInstanceId));
        builder.<OpsWindowRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpsWindowRequestBody.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getBody, ChangeOpsWindowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPasswordRequest, CheckPasswordResponse> checkPassword =
        genForCheckPassword();

    private static HttpRequestDef<CheckPasswordRequest, CheckPasswordResponse> genForCheckPassword() {
        // basic
        HttpRequestDef.Builder<CheckPasswordRequest, CheckPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPasswordRequest.class, CheckPasswordResponse.class)
                .withName("CheckPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/check-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPasswordRequest::getInstanceId, CheckPasswordRequest::setInstanceId));
        builder.<CheckPasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckPasswordRequestBody.class),
            f -> f.withMarshaller(CheckPasswordRequest::getBody, CheckPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckWeakPasswordRequest, CheckWeakPasswordResponse> checkWeakPassword =
        genForCheckWeakPassword();

    private static HttpRequestDef<CheckWeakPasswordRequest, CheckWeakPasswordResponse> genForCheckWeakPassword() {
        // basic
        HttpRequestDef.Builder<CheckWeakPasswordRequest, CheckWeakPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckWeakPasswordRequest.class, CheckWeakPasswordResponse.class)
                .withName("CheckWeakPassword")
                .withUri("/v3/{project_id}/weak-password-verification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckWeakPasswordRequest::getXLanguage, CheckWeakPasswordRequest::setXLanguage));
        builder.<WeakPasswordCheckRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WeakPasswordCheckRequestBody.class),
            f -> f.withMarshaller(CheckWeakPasswordRequest::getBody, CheckWeakPasswordRequest::setBody));

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
        builder.<DiffConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DiffConfigurationRequest.class),
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

    public static final HttpRequestDef<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> createDatabaseRole =
        genForCreateDatabaseRole();

    private static HttpRequestDef<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> genForCreateDatabaseRole() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRoleRequest, CreateDatabaseRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRoleRequest.class, CreateDatabaseRoleResponse.class)
                .withName("CreateDatabaseRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRoleRequest::getInstanceId, CreateDatabaseRoleRequest::setInstanceId));
        builder.<CreateDatabaseRoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseRoleRequestBody.class),
            f -> f.withMarshaller(CreateDatabaseRoleRequest::getBody, CreateDatabaseRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> createDatabaseUser =
        genForCreateDatabaseUser();

    private static HttpRequestDef<CreateDatabaseUserRequest, CreateDatabaseUserResponse> genForCreateDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseUserRequest, CreateDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseUserRequest.class, CreateDatabaseUserResponse.class)
                .withName("CreateDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseUserRequest::getInstanceId, CreateDatabaseUserRequest::setInstanceId));
        builder.<CreateDatabaseUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseUserRequestBody.class),
            f -> f.withMarshaller(CreateDatabaseUserRequest::getBody, CreateDatabaseUserRequest::setBody));

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

    public static final HttpRequestDef<CreateIpRequest, CreateIpResponse> createIp = genForCreateIp();

    private static HttpRequestDef<CreateIpRequest, CreateIpResponse> genForCreateIp() {
        // basic
        HttpRequestDef.Builder<CreateIpRequest, CreateIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpRequest.class, CreateIpResponse.class)
                .withName("CreateIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/create-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpRequest::getInstanceId, CreateIpRequest::setInstanceId));
        builder.<CreateIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpRequestBody.class),
            f -> f.withMarshaller(CreateIpRequest::getBody, CreateIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKillOpRuleRequest, CreateKillOpRuleResponse> createKillOpRule =
        genForCreateKillOpRule();

    private static HttpRequestDef<CreateKillOpRuleRequest, CreateKillOpRuleResponse> genForCreateKillOpRule() {
        // basic
        HttpRequestDef.Builder<CreateKillOpRuleRequest, CreateKillOpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKillOpRuleRequest.class, CreateKillOpRuleResponse.class)
                .withName("CreateKillOpRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/kill-op-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKillOpRuleRequest::getInstanceId, CreateKillOpRuleRequest::setInstanceId));
        builder.<CreateKillOpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKillOpRuleRequestBody.class),
            f -> f.withMarshaller(CreateKillOpRuleRequest::getBody, CreateKillOpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup =
        genForCreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForCreateManualBackup() {
        // basic
        HttpRequestDef.Builder<CreateManualBackupRequest, CreateManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualBackupRequest.class, CreateManualBackupResponse.class)
                .withName("CreateManualBackup")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<CreateManualBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualBackupRequestBody.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getBody, CreateManualBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuditLogRequest, DeleteAuditLogResponse> deleteAuditLog =
        genForDeleteAuditLog();

    private static HttpRequestDef<DeleteAuditLogRequest, DeleteAuditLogResponse> genForDeleteAuditLog() {
        // basic
        HttpRequestDef.Builder<DeleteAuditLogRequest, DeleteAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuditLogRequest.class, DeleteAuditLogResponse.class)
                .withName("DeleteAuditLog")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditLogRequest::getInstanceId, DeleteAuditLogRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuditLogRequest::getXLanguage, DeleteAuditLogRequest::setXLanguage));
        builder.<DeleteAuditLogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAuditLogRequestBody.class),
            f -> f.withMarshaller(DeleteAuditLogRequest::getBody, DeleteAuditLogRequest::setBody));

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

    public static final HttpRequestDef<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> deleteDatabaseRole =
        genForDeleteDatabaseRole();

    private static HttpRequestDef<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> genForDeleteDatabaseRole() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRoleRequest, DeleteDatabaseRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRoleRequest.class, DeleteDatabaseRoleResponse.class)
                .withName("DeleteDatabaseRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRoleRequest::getInstanceId, DeleteDatabaseRoleRequest::setInstanceId));
        builder.<DeleteDatabaseRoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseRoleRequestBody.class),
            f -> f.withMarshaller(DeleteDatabaseRoleRequest::getBody, DeleteDatabaseRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> deleteDatabaseUser =
        genForDeleteDatabaseUser();

    private static HttpRequestDef<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> genForDeleteDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseUserRequest, DeleteDatabaseUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseUserRequest.class, DeleteDatabaseUserResponse.class)
                .withName("DeleteDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getInstanceId, DeleteDatabaseUserRequest::setInstanceId));
        builder.<DeleteDatabaseUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseUserRequestBody.class),
            f -> f.withMarshaller(DeleteDatabaseUserRequest::getBody, DeleteDatabaseUserRequest::setBody));

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

    public static final HttpRequestDef<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse> deleteKillOpRuleList =
        genForDeleteKillOpRuleList();

    private static HttpRequestDef<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse> genForDeleteKillOpRuleList() {
        // basic
        HttpRequestDef.Builder<DeleteKillOpRuleListRequest, DeleteKillOpRuleListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteKillOpRuleListRequest.class, DeleteKillOpRuleListResponse.class)
            .withName("DeleteKillOpRuleList")
            .withUri("/v3/{project_id}/instances/{instance_id}/kill-op-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKillOpRuleListRequest::getInstanceId,
                DeleteKillOpRuleListRequest::setInstanceId));
        builder.<DeleteKillOpRuleListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteKillOpRuleListRequestBody.class),
            f -> f.withMarshaller(DeleteKillOpRuleListRequest::getBody, DeleteKillOpRuleListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLtsConfigRequest, DeleteLtsConfigResponse> deleteLtsConfig =
        genForDeleteLtsConfig();

    private static HttpRequestDef<DeleteLtsConfigRequest, DeleteLtsConfigResponse> genForDeleteLtsConfig() {
        // basic
        HttpRequestDef.Builder<DeleteLtsConfigRequest, DeleteLtsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLtsConfigRequest.class, DeleteLtsConfigResponse.class)
                .withName("DeleteLtsConfig")
                .withUri("/v3/{project_id}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<DeleteLtsConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLtsConfigRequestBody.class),
            f -> f.withMarshaller(DeleteLtsConfigRequest::getBody, DeleteLtsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackup =
        genForDeleteManualBackup();

    private static HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> genForDeleteManualBackup() {
        // basic
        HttpRequestDef.Builder<DeleteManualBackupRequest, DeleteManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteManualBackupRequest.class, DeleteManualBackupResponse.class)
                .withName("DeleteManualBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, DeleteManualBackupRequest::setBackupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse> deleteReadonlyNode =
        genForDeleteReadonlyNode();

    private static HttpRequestDef<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse> genForDeleteReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteReadonlyNodeRequest, DeleteReadonlyNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReadonlyNodeRequest.class, DeleteReadonlyNodeResponse.class)
                .withName("DeleteReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/readonly-node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReadonlyNodeRequest::getInstanceId, DeleteReadonlyNodeRequest::setInstanceId));
        builder.<DeleteReadonlyNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteReadonlyNodeRequestBody.class),
            f -> f.withMarshaller(DeleteReadonlyNodeRequest::getBody, DeleteReadonlyNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> deleteSession =
        genForDeleteSession();

    private static HttpRequestDef<DeleteSessionRequest, DeleteSessionResponse> genForDeleteSession() {
        // basic
        HttpRequestDef.Builder<DeleteSessionRequest, DeleteSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteSessionRequest.class, DeleteSessionResponse.class)
                .withName("DeleteSession")
                .withUri("/v3/{project_id}/nodes/{node_id}/session")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSessionRequest::getNodeId, DeleteSessionRequest::setNodeId));
        builder.<DeleteSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSessionRequestBody.class),
            f -> f.withMarshaller(DeleteSessionRequest::getBody, DeleteSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlog =
        genForDownloadErrorlog();

    private static HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> genForDownloadErrorlog() {
        // basic
        HttpRequestDef.Builder<DownloadErrorlogRequest, DownloadErrorlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadErrorlogRequest.class, DownloadErrorlogResponse.class)
                .withName("DownloadErrorlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog-download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadErrorlogRequest::getInstanceId, DownloadErrorlogRequest::setInstanceId));
        builder.<DownloadErrorlogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadErrorlogRequestBody.class),
            f -> f.withMarshaller(DownloadErrorlogRequest::getBody, DownloadErrorlogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlog =
        genForDownloadSlowlog();

    private static HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> genForDownloadSlowlog() {
        // basic
        HttpRequestDef.Builder<DownloadSlowlogRequest, DownloadSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadSlowlogRequest.class, DownloadSlowlogResponse.class)
                .withName("DownloadSlowlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getInstanceId, DownloadSlowlogRequest::setInstanceId));
        builder.<DownloadSlowlogRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadSlowlogRequestBody.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getBody, DownloadSlowlogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> expandReplicasetNode =
        genForExpandReplicasetNode();

    private static HttpRequestDef<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> genForExpandReplicasetNode() {
        // basic
        HttpRequestDef.Builder<ExpandReplicasetNodeRequest, ExpandReplicasetNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandReplicasetNodeRequest.class, ExpandReplicasetNodeResponse.class)
            .withName("ExpandReplicasetNode")
            .withUri("/v3/{project_id}/instances/{instance_id}/replicaset-node")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandReplicasetNodeRequest::getInstanceId,
                ExpandReplicasetNodeRequest::setInstanceId));
        builder.<EnlargeReplicasetNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeReplicasetNodeRequestBody.class),
            f -> f.withMarshaller(ExpandReplicasetNodeRequest::getBody, ExpandReplicasetNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppliedInstancesRequest, ListAppliedInstancesResponse> listAppliedInstances =
        genForListAppliedInstances();

    private static HttpRequestDef<ListAppliedInstancesRequest, ListAppliedInstancesResponse> genForListAppliedInstances() {
        // basic
        HttpRequestDef.Builder<ListAppliedInstancesRequest, ListAppliedInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppliedInstancesRequest.class, ListAppliedInstancesResponse.class)
            .withName("ListAppliedInstances")
            .withUri("/v3/{project_id}/configurations/{config_id}/applicable-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppliedInstancesRequest::getConfigId, ListAppliedInstancesRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedInstancesRequest::getOffset, ListAppliedInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppliedInstancesRequest::getLimit, ListAppliedInstancesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogLinksRequest, ListAuditlogLinksResponse> listAuditlogLinks =
        genForListAuditlogLinks();

    private static HttpRequestDef<ListAuditlogLinksRequest, ListAuditlogLinksResponse> genForListAuditlogLinks() {
        // basic
        HttpRequestDef.Builder<ListAuditlogLinksRequest, ListAuditlogLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAuditlogLinksRequest.class, ListAuditlogLinksResponse.class)
                .withName("ListAuditlogLinks")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogLinksRequest::getInstanceId, ListAuditlogLinksRequest::setInstanceId));
        builder.<ProduceAuditlogLinksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProduceAuditlogLinksRequestBody.class),
            f -> f.withMarshaller(ListAuditlogLinksRequest::getBody, ListAuditlogLinksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogs =
        genForListAuditlogs();

    private static HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> genForListAuditlogs() {
        // basic
        HttpRequestDef.Builder<ListAuditlogsRequest, ListAuditlogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditlogsRequest.class, ListAuditlogsResponse.class)
                .withName("ListAuditlogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getInstanceId, ListAuditlogsRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getNodeId, ListAuditlogsRequest::setNodeId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getStartTime, ListAuditlogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getEndTime, ListAuditlogsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getOffset, ListAuditlogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getLimit, ListAuditlogsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getXLanguage, ListAuditlogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAz2MigrateRequest, ListAz2MigrateResponse> listAz2Migrate =
        genForListAz2Migrate();

    private static HttpRequestDef<ListAz2MigrateRequest, ListAz2MigrateResponse> genForListAz2Migrate() {
        // basic
        HttpRequestDef.Builder<ListAz2MigrateRequest, ListAz2MigrateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAz2MigrateRequest.class, ListAz2MigrateResponse.class)
                .withName("ListAz2Migrate")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrate/az")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAz2MigrateRequest::getInstanceId, ListAz2MigrateRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForListBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForListBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, ListBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, ListBackupsRequest::setBackupId));
        builder.<ListBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, ListBackupsRequest::setBackupType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, ListBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, ListBackupsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, ListBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, ListBackupsRequest::setEndTime));
        builder.<ListBackupsRequest.ModeEnum>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.ModeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getMode, ListBackupsRequest::setMode));

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
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getOffset, ListConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getLimit, ListConfigurationsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRoles =
        genForListDatabaseRoles();

    private static HttpRequestDef<ListDatabaseRolesRequest, ListDatabaseRolesResponse> genForListDatabaseRoles() {
        // basic
        HttpRequestDef.Builder<ListDatabaseRolesRequest, ListDatabaseRolesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseRolesRequest.class, ListDatabaseRolesResponse.class)
                .withName("ListDatabaseRoles")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getInstanceId, ListDatabaseRolesRequest::setInstanceId));
        builder.<String>withRequestField("role_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getRoleName, ListDatabaseRolesRequest::setRoleName));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getDbName, ListDatabaseRolesRequest::setDbName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getOffset, ListDatabaseRolesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseRolesRequest::getLimit, ListDatabaseRolesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> listDatabaseUsers =
        genForListDatabaseUsers();

    private static HttpRequestDef<ListDatabaseUsersRequest, ListDatabaseUsersResponse> genForListDatabaseUsers() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUsersRequest, ListDatabaseUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseUsersRequest.class, ListDatabaseUsersResponse.class)
                .withName("ListDatabaseUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getInstanceId, ListDatabaseUsersRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getUserName, ListDatabaseUsersRequest::setUserName));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getDbName, ListDatabaseUsersRequest::setDbName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getOffset, ListDatabaseUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseUsersRequest::getLimit, ListDatabaseUsersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForListDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForListDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, ListDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getOffset, ListDatabasesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> listDatastoreVersions =
        genForListDatastoreVersions();

    private static HttpRequestDef<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> genForListDatastoreVersions() {
        // basic
        HttpRequestDef.Builder<ListDatastoreVersionsRequest, ListDatastoreVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatastoreVersionsRequest.class, ListDatastoreVersionsResponse.class)
            .withName("ListDatastoreVersions")
            .withUri("/v3/{project_id}/datastores/{datastore_name}/versions")
            .withContentType("application/json");

        // requests
        builder.<ListDatastoreVersionsRequest.DatastoreNameEnum>withRequestField("datastore_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDatastoreVersionsRequest.DatastoreNameEnum.class),
            f -> f.withMarshaller(ListDatastoreVersionsRequest::getDatastoreName,
                ListDatastoreVersionsRequest::setDatastoreName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogs =
        genForListErrorLogs();

    private static HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> genForListErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListErrorLogsRequest, ListErrorLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorLogsRequest.class, ListErrorLogsResponse.class)
                .withName("ListErrorLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getInstanceId, ListErrorLogsRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getStartDate, ListErrorLogsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getEndDate, ListErrorLogsRequest::setEndDate));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getNodeId, ListErrorLogsRequest::setNodeId));
        builder.<ListErrorLogsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorLogsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getType, ListErrorLogsRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getOffset, ListErrorLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getLimit, ListErrorLogsRequest::setLimit));

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
        builder.<ListFlavorInfosRequest.EngineNameEnum>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorInfosRequest.EngineNameEnum.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getEngineName, ListFlavorInfosRequest::setEngineName));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorInfosRequest::getEngineVersion, ListFlavorInfosRequest::setEngineVersion));
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
        builder.<ListFlavorsRequest.EngineNameEnum>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.EngineNameEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineName, ListFlavorsRequest::setEngineName));

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
        builder.<ListInstancesRequest.ModeEnum>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.ModeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getMode, ListInstancesRequest::setMode));
        builder.<ListInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.DatastoreTypeEnum.class),
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, ListInstancesRequest::setTags));

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
                .withUri("/v3/{project_id}/instances/action")
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

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse> listLtsErrorLogs =
        genForListLtsErrorLogs();

    private static HttpRequestDef<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse> genForListLtsErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListLtsErrorLogsRequest, ListLtsErrorLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLtsErrorLogsRequest.class, ListLtsErrorLogsResponse.class)
                .withName("ListLtsErrorLogs")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/error-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogsRequest::getInstanceId, ListLtsErrorLogsRequest::setInstanceId));
        builder.<ListLtsErrorLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLtsErrorLogsRequestBody.class),
            f -> f.withMarshaller(ListLtsErrorLogsRequest::getBody, ListLtsErrorLogsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> listLtsSlowLogs =
        genForListLtsSlowLogs();

    private static HttpRequestDef<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> genForListLtsSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListLtsSlowLogsRequest, ListLtsSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLtsSlowLogsRequest.class, ListLtsSlowLogsResponse.class)
                .withName("ListLtsSlowLogs")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/slow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowLogsRequest::getInstanceId, ListLtsSlowLogsRequest::setInstanceId));
        builder.<ListLtsSlowLogsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLtsSlowLogsRequestBody.class),
            f -> f.withMarshaller(ListLtsSlowLogsRequest::getBody, ListLtsSlowLogsRequest::setBody));

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

    public static final HttpRequestDef<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> listRestoreCollections =
        genForListRestoreCollections();

    private static HttpRequestDef<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> genForListRestoreCollections() {
        // basic
        HttpRequestDef.Builder<ListRestoreCollectionsRequest, ListRestoreCollectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRestoreCollectionsRequest.class, ListRestoreCollectionsResponse.class)
            .withName("ListRestoreCollections")
            .withUri("/v3/{project_id}/instances/{instance_id}/restore-collection")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getInstanceId,
                ListRestoreCollectionsRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getDbName, ListRestoreCollectionsRequest::setDbName));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getRestoreTime,
                ListRestoreCollectionsRequest::setRestoreTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getOffset, ListRestoreCollectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getLimit, ListRestoreCollectionsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreCollectionsRequest::getXLanguage,
                ListRestoreCollectionsRequest::setXLanguage));

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
            .withUri("/v3/{project_id}/instances/{instance_id}/restore-database")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getInstanceId,
                ListRestoreDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getRestoreTime,
                ListRestoreDatabasesRequest::setRestoreTime));
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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreDatabasesRequest::getXLanguage,
                ListRestoreDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimes =
        genForListRestoreTimes();

    private static HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> genForListRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimesRequest, ListRestoreTimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimesRequest.class, ListRestoreTimesResponse.class)
                .withName("ListRestoreTimes")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, ListRestoreTimesRequest::setInstanceId));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, ListRestoreTimesRequest::setDate));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, ListRestoreTimesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionsRequest, ListSessionsResponse> listSessions = genForListSessions();

    private static HttpRequestDef<ListSessionsRequest, ListSessionsResponse> genForListSessions() {
        // basic
        HttpRequestDef.Builder<ListSessionsRequest, ListSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionsRequest.class, ListSessionsResponse.class)
                .withName("ListSessions")
                .withUri("/v3/{project_id}/nodes/{node_id}/sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getNodeId, ListSessionsRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getOffset, ListSessionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getLimit, ListSessionsRequest::setLimit));
        builder.<String>withRequestField("plan_summary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getPlanSummary, ListSessionsRequest::setPlanSummary));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getType, ListSessionsRequest::setType));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getNamespace, ListSessionsRequest::setNamespace));
        builder.<Integer>withRequestField("cost_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getCostTime, ListSessionsRequest::setCostTime));

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
        builder.<ListSlowLogsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogsRequest.TypeEnum.class),
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

    public static final HttpRequestDef<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> listSslCertDownloadAddress =
        genForListSslCertDownloadAddress();

    private static HttpRequestDef<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> genForListSslCertDownloadAddress() {
        // basic
        HttpRequestDef.Builder<ListSslCertDownloadAddressRequest, ListSslCertDownloadAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSslCertDownloadAddressRequest.class,
                    ListSslCertDownloadAddressResponse.class)
                .withName("ListSslCertDownloadAddress")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-cert/download-link")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSslCertDownloadAddressRequest::getInstanceId,
                ListSslCertDownloadAddressRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSslCertDownloadAddressRequest::getXLanguage,
                ListSslCertDownloadAddressRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypeRequest, ListStorageTypeResponse> listStorageType =
        genForListStorageType();

    private static HttpRequestDef<ListStorageTypeRequest, ListStorageTypeResponse> genForListStorageType() {
        // basic
        HttpRequestDef.Builder<ListStorageTypeRequest, ListStorageTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypeRequest.class, ListStorageTypeResponse.class)
                .withName("ListStorageType")
                .withUri("/v3/{project_id}/storage-type")
                .withContentType("application/json");

        // requests
        builder.<ListStorageTypeRequest.EngineNameEnum>withRequestField("engine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStorageTypeRequest.EngineNameEnum.class),
            f -> f.withMarshaller(ListStorageTypeRequest::getEngineName, ListStorageTypeRequest::setEngineName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3.1/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getStartTime, ListTasksRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEndTime, ListTasksRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, ListTasksRequest::setStatus));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getName, ListTasksRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateAzRequest, MigrateAzResponse> migrateAz = genForMigrateAz();

    private static HttpRequestDef<MigrateAzRequest, MigrateAzResponse> genForMigrateAz() {
        // basic
        HttpRequestDef.Builder<MigrateAzRequest, MigrateAzResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateAzRequest.class, MigrateAzResponse.class)
                .withName("MigrateAz")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateAzRequest::getInstanceId, MigrateAzRequest::setInstanceId));
        builder.<MigrateAzRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrateAzRequestBody.class),
            f -> f.withMarshaller(MigrateAzRequest::getBody, MigrateAzRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> resetConfiguration =
        genForResetConfiguration();

    private static HttpRequestDef<ResetConfigurationRequest, ResetConfigurationResponse> genForResetConfiguration() {
        // basic
        HttpRequestDef.Builder<ResetConfigurationRequest, ResetConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetConfigurationRequest.class, ResetConfigurationResponse.class)
                .withName("ResetConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetConfigurationRequest::getConfigId, ResetConfigurationRequest::setConfigId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetConfigurationResponse::getBody, ResetConfigurationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/reset-password")
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

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
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
            .withUri("/v3/{project_id}/instances/{instance_id}/enlarge-volume")
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
        builder.<RestartInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartInstanceRequestBody.class),
            f -> f.withMarshaller(RestartInstanceRequest::getBody, RestartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstance =
        genForRestoreInstance();

    private static HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> genForRestoreInstance() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceRequest, RestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceRequest.class, RestoreInstanceResponse.class)
                .withName("RestoreInstance")
                .withUri("/v3/{project_id}/instances/recovery")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getXLanguage, RestoreInstanceRequest::setXLanguage));
        builder.<RestoreInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, RestoreInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> restoreInstanceFromCollection =
        genForRestoreInstanceFromCollection();

    private static HttpRequestDef<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> genForRestoreInstanceFromCollection() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceFromCollectionRequest, RestoreInstanceFromCollectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestoreInstanceFromCollectionRequest.class,
                    RestoreInstanceFromCollectionResponse.class)
                .withName("RestoreInstanceFromCollection")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore/collections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getInstanceId,
                RestoreInstanceFromCollectionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getXLanguage,
                RestoreInstanceFromCollectionRequest::setXLanguage));
        builder.<RestoreInstanceFromCollectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreInstanceFromCollectionRequestBody.class),
            f -> f.withMarshaller(RestoreInstanceFromCollectionRequest::getBody,
                RestoreInstanceFromCollectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreNewInstanceRequest, RestoreNewInstanceResponse> restoreNewInstance =
        genForRestoreNewInstance();

    private static HttpRequestDef<RestoreNewInstanceRequest, RestoreNewInstanceResponse> genForRestoreNewInstance() {
        // basic
        HttpRequestDef.Builder<RestoreNewInstanceRequest, RestoreNewInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreNewInstanceRequest.class, RestoreNewInstanceResponse.class)
                .withName("RestoreNewInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<RestoreNewInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreNewInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreNewInstanceRequest::getBody, RestoreNewInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicy =
        genForSetAuditlogPolicy();

    private static HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> genForSetAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetAuditlogPolicyRequest.class, SetAuditlogPolicyResponse.class)
                .withName("SetAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getInstanceId, SetAuditlogPolicyRequest::setInstanceId));
        builder.<SetAuditlogPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetAuditlogPolicyRequestBody.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getBody, SetAuditlogPolicyRequest::setBody));

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

    public static final HttpRequestDef<SetBalancerSwitchRequest, SetBalancerSwitchResponse> setBalancerSwitch =
        genForSetBalancerSwitch();

    private static HttpRequestDef<SetBalancerSwitchRequest, SetBalancerSwitchResponse> genForSetBalancerSwitch() {
        // basic
        HttpRequestDef.Builder<SetBalancerSwitchRequest, SetBalancerSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBalancerSwitchRequest.class, SetBalancerSwitchResponse.class)
                .withName("SetBalancerSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/balancer/{action}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBalancerSwitchRequest::getInstanceId, SetBalancerSwitchRequest::setInstanceId));
        builder.<SetBalancerSwitchRequest.ActionEnum>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBalancerSwitchRequest.ActionEnum.class),
            f -> f.withMarshaller(SetBalancerSwitchRequest::getAction, SetBalancerSwitchRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBalancerWindowRequest, SetBalancerWindowResponse> setBalancerWindow =
        genForSetBalancerWindow();

    private static HttpRequestDef<SetBalancerWindowRequest, SetBalancerWindowResponse> genForSetBalancerWindow() {
        // basic
        HttpRequestDef.Builder<SetBalancerWindowRequest, SetBalancerWindowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBalancerWindowRequest.class, SetBalancerWindowResponse.class)
                .withName("SetBalancerWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/balancer/active-window")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBalancerWindowRequest::getInstanceId, SetBalancerWindowRequest::setInstanceId));
        builder.<BalancerActiveWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BalancerActiveWindow.class),
            f -> f.withMarshaller(SetBalancerWindowRequest::getBody, SetBalancerWindowRequest::setBody));

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

    public static final HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicy =
        genForShowAuditlogPolicy();

    private static HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> genForShowAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditlogPolicyRequest.class, ShowAuditlogPolicyResponse.class)
                .withName("ShowAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getInstanceId, ShowAuditlogPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getXLanguage, ShowAuditlogPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLink =
        genForShowBackupDownloadLink();

    private static HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> genForShowBackupDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupDownloadLinkRequest.class, ShowBackupDownloadLinkResponse.class)
            .withName("ShowBackupDownloadLink")
            .withUri("/v3/{project_id}/backups/download-file")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getInstanceId,
                ShowBackupDownloadLinkRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getBackupId,
                ShowBackupDownloadLinkRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getXLanguage,
                ShowBackupDownloadLinkRequest::setXLanguage));

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

    public static final HttpRequestDef<ShowClientNetworkRequest, ShowClientNetworkResponse> showClientNetwork =
        genForShowClientNetwork();

    private static HttpRequestDef<ShowClientNetworkRequest, ShowClientNetworkResponse> genForShowClientNetwork() {
        // basic
        HttpRequestDef.Builder<ShowClientNetworkRequest, ShowClientNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClientNetworkRequest.class, ShowClientNetworkResponse.class)
                .withName("ShowClientNetwork")
                .withUri("/v3/{project_id}/instances/{instance_id}/client-network")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClientNetworkRequest::getInstanceId, ShowClientNetworkRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> showConfigurationAppliedHistory =
        genForShowConfigurationAppliedHistory();

    private static HttpRequestDef<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> genForShowConfigurationAppliedHistory() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationAppliedHistoryRequest, ShowConfigurationAppliedHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConfigurationAppliedHistoryRequest.class,
                    ShowConfigurationAppliedHistoryResponse.class)
                .withName("ShowConfigurationAppliedHistory")
                .withUri("/v3/{project_id}/configurations/{config_id}/applied-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationAppliedHistoryRequest::getConfigId,
                ShowConfigurationAppliedHistoryRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationAppliedHistoryRequest::getOffset,
                ShowConfigurationAppliedHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationAppliedHistoryRequest::getLimit,
                ShowConfigurationAppliedHistoryRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> showConfigurationModifyHistory =
        genForShowConfigurationModifyHistory();

    private static HttpRequestDef<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> genForShowConfigurationModifyHistory() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationModifyHistoryRequest, ShowConfigurationModifyHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConfigurationModifyHistoryRequest.class,
                    ShowConfigurationModifyHistoryResponse.class)
                .withName("ShowConfigurationModifyHistory")
                .withUri("/v3/{project_id}/configurations/{config_id}/histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationModifyHistoryRequest::getConfigId,
                ShowConfigurationModifyHistoryRequest::setConfigId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationModifyHistoryRequest::getOffset,
                ShowConfigurationModifyHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowConfigurationModifyHistoryRequest::getLimit,
                ShowConfigurationModifyHistoryRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> showConfigurationParameter =
        genForShowConfigurationParameter();

    private static HttpRequestDef<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> genForShowConfigurationParameter() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationParameterRequest, ShowConfigurationParameterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConfigurationParameterRequest.class,
                    ShowConfigurationParameterResponse.class)
                .withName("ShowConfigurationParameter")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationParameterRequest::getConfigId,
                ShowConfigurationParameterRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> showConnectionStatistics =
        genForShowConnectionStatistics();

    private static HttpRequestDef<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> genForShowConnectionStatistics() {
        // basic
        HttpRequestDef.Builder<ShowConnectionStatisticsRequest, ShowConnectionStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowConnectionStatisticsRequest.class, ShowConnectionStatisticsResponse.class)
                .withName("ShowConnectionStatistics")
                .withUri("/v3/{project_id}/instances/{instance_id}/conn-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionStatisticsRequest::getInstanceId,
                ShowConnectionStatisticsRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConnectionStatisticsRequest::getNodeId,
                ShowConnectionStatisticsRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiskUsageRequest, ShowDiskUsageResponse> showDiskUsage =
        genForShowDiskUsage();

    private static HttpRequestDef<ShowDiskUsageRequest, ShowDiskUsageResponse> genForShowDiskUsage() {
        // basic
        HttpRequestDef.Builder<ShowDiskUsageRequest, ShowDiskUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiskUsageRequest.class, ShowDiskUsageResponse.class)
                .withName("ShowDiskUsage")
                .withUri("/v3/{project_id}/instances/{instance_id}/disk-usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiskUsageRequest::getInstanceId, ShowDiskUsageRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiskUsageRequest::getXLanguage, ShowDiskUsageRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> showEntityConfiguration =
        genForShowEntityConfiguration();

    private static HttpRequestDef<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> genForShowEntityConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowEntityConfigurationRequest, ShowEntityConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEntityConfigurationRequest.class, ShowEntityConfigurationResponse.class)
            .withName("ShowEntityConfiguration")
            .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntityConfigurationRequest::getInstanceId,
                ShowEntityConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("entity_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEntityConfigurationRequest::getEntityId,
                ShowEntityConfigurationRequest::setEntityId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForShowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForShowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getId, ShowJobDetailRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse> showKillOpRuleRuleList =
        genForShowKillOpRuleRuleList();

    private static HttpRequestDef<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse> genForShowKillOpRuleRuleList() {
        // basic
        HttpRequestDef.Builder<ShowKillOpRuleRuleListRequest, ShowKillOpRuleRuleListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowKillOpRuleRuleListRequest.class, ShowKillOpRuleRuleListResponse.class)
            .withName("ShowKillOpRuleRuleList")
            .withUri("/v3/{project_id}/instances/{instance_id}/kill-op-rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getInstanceId,
                ShowKillOpRuleRuleListRequest::setInstanceId));
        builder.<String>withRequestField("operation_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getOperationTypes,
                ShowKillOpRuleRuleListRequest::setOperationTypes));
        builder.<String>withRequestField("namespaces",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getNamespaces,
                ShowKillOpRuleRuleListRequest::setNamespaces));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getStatus, ShowKillOpRuleRuleListRequest::setStatus));
        builder.<String>withRequestField("plan_summary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getPlanSummary,
                ShowKillOpRuleRuleListRequest::setPlanSummary));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getOffset, ShowKillOpRuleRuleListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKillOpRuleRuleListRequest::getLimit, ShowKillOpRuleRuleListRequest::setLimit));

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

    public static final HttpRequestDef<ShowReplSetNameRequest, ShowReplSetNameResponse> showReplSetName =
        genForShowReplSetName();

    private static HttpRequestDef<ShowReplSetNameRequest, ShowReplSetNameResponse> genForShowReplSetName() {
        // basic
        HttpRequestDef.Builder<ShowReplSetNameRequest, ShowReplSetNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReplSetNameRequest.class, ShowReplSetNameResponse.class)
                .withName("ShowReplSetName")
                .withUri("/v3/{project_id}/instances/{instance_id}/replica-set/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplSetNameRequest::getInstanceId, ShowReplSetNameRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatus =
        genForShowSecondLevelMonitoringStatus();

    private static HttpRequestDef<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> genForShowSecondLevelMonitoringStatus() {
        // basic
        HttpRequestDef.Builder<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecondLevelMonitoringStatusRequest.class,
                    ShowSecondLevelMonitoringStatusResponse.class)
                .withName("ShowSecondLevelMonitoringStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitoring-by-seconds/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecondLevelMonitoringStatusRequest::getInstanceId,
                ShowSecondLevelMonitoringStatusRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShardingBalancerRequest, ShowShardingBalancerResponse> showShardingBalancer =
        genForShowShardingBalancer();

    private static HttpRequestDef<ShowShardingBalancerRequest, ShowShardingBalancerResponse> genForShowShardingBalancer() {
        // basic
        HttpRequestDef.Builder<ShowShardingBalancerRequest, ShowShardingBalancerResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowShardingBalancerRequest.class, ShowShardingBalancerResponse.class)
            .withName("ShowShardingBalancer")
            .withUri("/v3/{project_id}/instances/{instance_id}/balancer")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShardingBalancerRequest::getInstanceId,
                ShowShardingBalancerRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> showSlowlogDesensitizationSwitch =
        genForShowSlowlogDesensitizationSwitch();

    private static HttpRequestDef<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> genForShowSlowlogDesensitizationSwitch() {
        // basic
        HttpRequestDef.Builder<ShowSlowlogDesensitizationSwitchRequest, ShowSlowlogDesensitizationSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSlowlogDesensitizationSwitchRequest.class,
                    ShowSlowlogDesensitizationSwitchResponse.class)
                .withName("ShowSlowlogDesensitizationSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-desensitization/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowlogDesensitizationSwitchRequest::getInstanceId,
                ShowSlowlogDesensitizationSwitchRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowlogDesensitizationSwitchRequest::getXLanguage,
                ShowSlowlogDesensitizationSwitchRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> showUpgradeDuration =
        genForShowUpgradeDuration();

    private static HttpRequestDef<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> genForShowUpgradeDuration() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeDurationRequest, ShowUpgradeDurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUpgradeDurationRequest.class, ShowUpgradeDurationResponse.class)
                .withName("ShowUpgradeDuration")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade-duration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDurationRequest::getInstanceId,
                ShowUpgradeDurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDurationRequest::getXLanguage, ShowUpgradeDurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> shrinkInstanceNodes =
        genForShrinkInstanceNodes();

    private static HttpRequestDef<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> genForShrinkInstanceNodes() {
        // basic
        HttpRequestDef.Builder<ShrinkInstanceNodesRequest, ShrinkInstanceNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, ShrinkInstanceNodesRequest.class, ShrinkInstanceNodesResponse.class)
            .withName("ShrinkInstanceNodes")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkInstanceNodesRequest::getInstanceId,
                ShrinkInstanceNodesRequest::setInstanceId));
        builder.<ReduceInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReduceInstanceNodeRequestBody.class),
            f -> f.withMarshaller(ShrinkInstanceNodesRequest::getBody, ShrinkInstanceNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBackupRequest, StopBackupResponse> stopBackup = genForStopBackup();

    private static HttpRequestDef<StopBackupRequest, StopBackupResponse> genForStopBackup() {
        // basic
        HttpRequestDef.Builder<StopBackupRequest, StopBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopBackupRequest.class, StopBackupResponse.class)
                .withName("StopBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBackupRequest::getBackupId, StopBackupRequest::setBackupId));
        builder.<StopBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopBackupRequestBody.class),
            f -> f.withMarshaller(StopBackupRequest::getBody, StopBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfiguration =
        genForSwitchConfiguration();

    private static HttpRequestDef<SwitchConfigurationRequest, SwitchConfigurationResponse> genForSwitchConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchConfigurationRequest, SwitchConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchConfigurationRequest.class, SwitchConfigurationResponse.class)
                .withName("SwitchConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getConfigId, SwitchConfigurationRequest::setConfigId));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchConfigurationRequest::getBody, SwitchConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse> switchInstancePrimary =
        genForSwitchInstancePrimary();

    private static HttpRequestDef<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse> genForSwitchInstancePrimary() {
        // basic
        HttpRequestDef.Builder<SwitchInstancePrimaryRequest, SwitchInstancePrimaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchInstancePrimaryRequest.class, SwitchInstancePrimaryResponse.class)
            .withName("SwitchInstancePrimary")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/primary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchInstancePrimaryRequest::getInstanceId,
                SwitchInstancePrimaryRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchInstancePrimaryRequest::getNodeId, SwitchInstancePrimaryRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoring =
        genForSwitchSecondLevelMonitoring();

    private static HttpRequestDef<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> genForSwitchSecondLevelMonitoring() {
        // basic
        HttpRequestDef.Builder<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchSecondLevelMonitoringRequest.class,
                    SwitchSecondLevelMonitoringResponse.class)
                .withName("SwitchSecondLevelMonitoring")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitoring-by-seconds/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSecondLevelMonitoringRequest::getInstanceId,
                SwitchSecondLevelMonitoringRequest::setInstanceId));
        builder.<SwitchSecondLevelMonitoringRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSecondLevelMonitoringRequestBody.class),
            f -> f.withMarshaller(SwitchSecondLevelMonitoringRequest::getBody,
                SwitchSecondLevelMonitoringRequest::setBody));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-desensitization/{status}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getInstanceId,
                SwitchSlowlogDesensitizationRequest::setInstanceId));
        builder.<String>withRequestField("status",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getStatus,
                SwitchSlowlogDesensitizationRequest::setStatus));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSlowlogDesensitizationRequest::getXLanguage,
                SwitchSlowlogDesensitizationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForSwitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForSwitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/switch-ssl")
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

    public static final HttpRequestDef<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> switchoverReplicaSet =
        genForSwitchoverReplicaSet();

    private static HttpRequestDef<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> genForSwitchoverReplicaSet() {
        // basic
        HttpRequestDef.Builder<SwitchoverReplicaSetRequest, SwitchoverReplicaSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchoverReplicaSetRequest.class, SwitchoverReplicaSetResponse.class)
            .withName("SwitchoverReplicaSet")
            .withUri("/v3/{project_id}/instances/{instance_id}/switchover")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchoverReplicaSetRequest::getInstanceId,
                SwitchoverReplicaSetRequest::setInstanceId));

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
        builder.<ClientNetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClientNetworkRequestBody.class),
            f -> f.withMarshaller(UpdateClientNetworkRequest::getBody, UpdateClientNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> updateConfigurationParameter =
        genForUpdateConfigurationParameter();

    private static HttpRequestDef<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> genForUpdateConfigurationParameter() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationParameterRequest, UpdateConfigurationParameterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateConfigurationParameterRequest.class,
                    UpdateConfigurationParameterResponse.class)
                .withName("UpdateConfigurationParameter")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationParameterRequest::getConfigId,
                UpdateConfigurationParameterRequest::setConfigId));
        builder.<UpdateConfigurationParameterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationParameterRequestBody.class),
            f -> f.withMarshaller(UpdateConfigurationParameterRequest::getBody,
                UpdateConfigurationParameterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> updateEntityConfiguration =
        genForUpdateEntityConfiguration();

    private static HttpRequestDef<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> genForUpdateEntityConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateEntityConfigurationRequest, UpdateEntityConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEntityConfigurationRequest.class,
                    UpdateEntityConfigurationResponse.class)
                .withName("UpdateEntityConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEntityConfigurationRequest::getInstanceId,
                UpdateEntityConfigurationRequest::setInstanceId));
        builder.<UpdateConfigurationParameterResult>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationParameterResult.class),
            f -> f.withMarshaller(UpdateEntityConfigurationRequest::getBody,
                UpdateEntityConfigurationRequest::setBody));

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
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, UpdateInstanceNameRequest::setInstanceId));
        builder.<UpdateNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNameRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, UpdateInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> updateInstancePort =
        genForUpdateInstancePort();

    private static HttpRequestDef<UpdateInstancePortRequest, UpdateInstancePortResponse> genForUpdateInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateInstancePortRequest, UpdateInstancePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateInstancePortRequest.class, UpdateInstancePortResponse.class)
                .withName("UpdateInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-port")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstancePortRequest::getInstanceId, UpdateInstancePortRequest::setInstanceId));
        builder.<UpdatePortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortRequestBody.class),
            f -> f.withMarshaller(UpdateInstancePortRequest::getBody, UpdateInstancePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> updateInstanceRemark =
        genForUpdateInstanceRemark();

    private static HttpRequestDef<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> genForUpdateInstanceRemark() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRemarkRequest, UpdateInstanceRemarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceRemarkRequest.class, UpdateInstanceRemarkResponse.class)
            .withName("UpdateInstanceRemark")
            .withUri("/v3/{project_id}/instances/{instance_id}/remark")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRemarkRequest::getInstanceId,
                UpdateInstanceRemarkRequest::setInstanceId));
        builder.<UpdateInstanceRemarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceRemarkRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceRemarkRequest::getBody, UpdateInstanceRemarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse> updateKillOpRule =
        genForUpdateKillOpRule();

    private static HttpRequestDef<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse> genForUpdateKillOpRule() {
        // basic
        HttpRequestDef.Builder<UpdateKillOpRuleRequest, UpdateKillOpRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateKillOpRuleRequest.class, UpdateKillOpRuleResponse.class)
                .withName("UpdateKillOpRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/kill-op-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKillOpRuleRequest::getInstanceId, UpdateKillOpRuleRequest::setInstanceId));
        builder.<UpdateKillOpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKillOpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateKillOpRuleRequest::getBody, UpdateKillOpRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLtsConfigRequest, UpdateLtsConfigResponse> updateLtsConfig =
        genForUpdateLtsConfig();

    private static HttpRequestDef<UpdateLtsConfigRequest, UpdateLtsConfigResponse> genForUpdateLtsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLtsConfigRequest, UpdateLtsConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateLtsConfigRequest.class, UpdateLtsConfigResponse.class)
                .withName("UpdateLtsConfig")
                .withUri("/v3/{project_id}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<UpdateLtsConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLtsConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLtsConfigRequest::getBody, UpdateLtsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReplSetNameRequest, UpdateReplSetNameResponse> updateReplSetName =
        genForUpdateReplSetName();

    private static HttpRequestDef<UpdateReplSetNameRequest, UpdateReplSetNameResponse> genForUpdateReplSetName() {
        // basic
        HttpRequestDef.Builder<UpdateReplSetNameRequest, UpdateReplSetNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReplSetNameRequest.class, UpdateReplSetNameResponse.class)
                .withName("UpdateReplSetName")
                .withUri("/v3/{project_id}/instances/{instance_id}/replica-set/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReplSetNameRequest::getInstanceId, UpdateReplSetNameRequest::setInstanceId));
        builder.<MongoUpdateReplSetV3RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MongoUpdateReplSetV3RequestBody.class),
            f -> f.withMarshaller(UpdateReplSetNameRequest::getBody, UpdateReplSetNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroup =
        genForUpdateSecurityGroup();

    private static HttpRequestDef<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> genForUpdateSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSecurityGroupRequest.class, UpdateSecurityGroupResponse.class)
                .withName("UpdateSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-security-group")
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

    public static final HttpRequestDef<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> upgradeDatabaseVersion =
        genForUpgradeDatabaseVersion();

    private static HttpRequestDef<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> genForUpgradeDatabaseVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeDatabaseVersionRequest, UpgradeDatabaseVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpgradeDatabaseVersionRequest.class, UpgradeDatabaseVersionResponse.class)
            .withName("UpgradeDatabaseVersion")
            .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDatabaseVersionRequest::getInstanceId,
                UpgradeDatabaseVersionRequest::setInstanceId));
        builder.<UpgradeDatabaseVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeDatabaseVersionRequestBody.class),
            f -> f.withMarshaller(UpgradeDatabaseVersionRequest::getBody, UpgradeDatabaseVersionRequest::setBody));

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

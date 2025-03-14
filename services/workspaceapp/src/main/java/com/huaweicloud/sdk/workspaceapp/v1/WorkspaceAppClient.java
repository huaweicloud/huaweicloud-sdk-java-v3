package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerMaintainModeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerMaintainModeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchCreateServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchCreateServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDisableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDisableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchEnableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchEnableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpgradeHdaVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpgradeHdaVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateBucketOrAclRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateBucketOrAclResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateScalingPolicyRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateScalingPolicyResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteScalingPolicyRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteScalingPolicyResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DisassociateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DisassociateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.InitializeTenantRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.InitializeTenantResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAccessAgentLatestVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAccessAgentLatestVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAuthorizationMailRecordRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAuthorizationMailRecordResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAzRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAzResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCorpConfigInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCorpConfigInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFutureExecutionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFutureExecutionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupDetailInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupDetailInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProductResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListPublishedAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListScheduleTasksRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListScheduleTasksResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupTagRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupTagResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerHdaDetailsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerHdaDetailsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerHdaUpgradeRecordsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerHdaUpgradeRecordsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServerMetricDataResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionByUserNameResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSessionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSfs3StorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSfs3StorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStorageAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTargetsOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTaskExecuteDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTaskExecuteDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTaskExecuteHistoryRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTaskExecuteHistoryResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTenantProfileRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTenantProfileResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTenantServerGroupsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListTenantServerGroupsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizationMailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizationMailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizedMailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizedMailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAccessAgentLatestVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAccessAgentLatestVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppGroupDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppGroupDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowJobResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowPublishableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowScalingPolicyRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowScalingPolicyResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupRestrictRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupRestrictResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupStateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupStateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupTagRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerGroupTagResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerMetricDataRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerMetricDataResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowServerVncResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowSessionTypesRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowSessionTypesResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconResponse;

public class WorkspaceAppClient {

    protected HcClient hcClient;

    public WorkspaceAppClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAppClient> newBuilder() {
        ClientBuilder<WorkspaceAppClient> clientBuilder = new ClientBuilder<>(WorkspaceAppClient::new);
        return clientBuilder;
    }

    /**
     * 获取上传至OBS桶的临时ak/sk
     *
     * 获取上传至OBS桶的临时ak/sk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeObsRequest 请求对象
     * @return AuthorizeObsResponse
     */
    public AuthorizeObsResponse authorizeObs(AuthorizeObsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.authorizeObs);
    }

    /**
     * 获取上传至OBS桶的临时ak/sk
     *
     * 获取上传至OBS桶的临时ak/sk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeObsRequest 请求对象
     * @return SyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse>
     */
    public SyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse> authorizeObsInvoker(AuthorizeObsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.authorizeObs, hcClient);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return BatchDeleteWarehouseAppResponse
     */
    public BatchDeleteWarehouseAppResponse batchDeleteWarehouseApp(BatchDeleteWarehouseAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteWarehouseApp);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return SyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse>
     */
    public SyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> batchDeleteWarehouseAppInvoker(
        BatchDeleteWarehouseAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteWarehouseApp, hcClient);
    }

    /**
     * 添加桶或者桶授权
     *
     * 添加桶或者桶授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketOrAclRequest 请求对象
     * @return CreateBucketOrAclResponse
     */
    public CreateBucketOrAclResponse createBucketOrAcl(CreateBucketOrAclRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createBucketOrAcl);
    }

    /**
     * 添加桶或者桶授权
     *
     * 添加桶或者桶授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketOrAclRequest 请求对象
     * @return SyncInvoker<CreateBucketOrAclRequest, CreateBucketOrAclResponse>
     */
    public SyncInvoker<CreateBucketOrAclRequest, CreateBucketOrAclResponse> createBucketOrAclInvoker(
        CreateBucketOrAclRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createBucketOrAcl, hcClient);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return CreateWarehouseAppResponse
     */
    public CreateWarehouseAppResponse createWarehouseApp(CreateWarehouseAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createWarehouseApp);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return SyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse>
     */
    public SyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse> createWarehouseAppInvoker(
        CreateWarehouseAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createWarehouseApp, hcClient);
    }

    /**
     * 删除应用仓库中的指定应用
     *
     * 删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWarehouseAppRequest 请求对象
     * @return DeleteWarehouseAppResponse
     */
    public DeleteWarehouseAppResponse deleteWarehouseApp(DeleteWarehouseAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteWarehouseApp);
    }

    /**
     * 删除应用仓库中的指定应用
     *
     * 删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWarehouseAppRequest 请求对象
     * @return SyncInvoker<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse>
     */
    public SyncInvoker<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse> deleteWarehouseAppInvoker(
        DeleteWarehouseAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteWarehouseApp, hcClient);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return ListWarehouseAppsResponse
     */
    public ListWarehouseAppsResponse listWarehouseApps(ListWarehouseAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listWarehouseApps);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return SyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse>
     */
    public SyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse> listWarehouseAppsInvoker(
        ListWarehouseAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listWarehouseApps, hcClient);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return UpdateWarehouseAppResponse
     */
    public UpdateWarehouseAppResponse updateWarehouseApp(UpdateWarehouseAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateWarehouseApp);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return SyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse>
     */
    public SyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> updateWarehouseAppInvoker(
        UpdateWarehouseAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateWarehouseApp, hcClient);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return UploadWarehouseAppIconResponse
     */
    public UploadWarehouseAppIconResponse uploadWarehouseAppIcon(UploadWarehouseAppIconRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.uploadWarehouseAppIcon);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return SyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse>
     */
    public SyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> uploadWarehouseAppIconInvoker(
        UploadWarehouseAppIconRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.uploadWarehouseAppIcon, hcClient);
    }

    /**
     * 批量禁用应用
     *
     * 批量禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppRequest 请求对象
     * @return BatchDisableAppResponse
     */
    public BatchDisableAppResponse batchDisableApp(BatchDisableAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDisableApp);
    }

    /**
     * 批量禁用应用
     *
     * 批量禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppRequest 请求对象
     * @return SyncInvoker<BatchDisableAppRequest, BatchDisableAppResponse>
     */
    public SyncInvoker<BatchDisableAppRequest, BatchDisableAppResponse> batchDisableAppInvoker(
        BatchDisableAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDisableApp, hcClient);
    }

    /**
     * 批量启用应用
     *
     * 批量启用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppRequest 请求对象
     * @return BatchEnableAppResponse
     */
    public BatchEnableAppResponse batchEnableApp(BatchEnableAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchEnableApp);
    }

    /**
     * 批量启用应用
     *
     * 批量启用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppRequest 请求对象
     * @return SyncInvoker<BatchEnableAppRequest, BatchEnableAppResponse>
     */
    public SyncInvoker<BatchEnableAppRequest, BatchEnableAppResponse> batchEnableAppInvoker(
        BatchEnableAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchEnableApp, hcClient);
    }

    /**
     * 删除自定义应用图标
     *
     * 删除自定义应用应用图标，恢复使用默认应用图标，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIconRequest 请求对象
     * @return DeleteAppIconResponse
     */
    public DeleteAppIconResponse deleteAppIcon(DeleteAppIconRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteAppIcon);
    }

    /**
     * 删除自定义应用图标
     *
     * 删除自定义应用应用图标，恢复使用默认应用图标，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIconRequest 请求对象
     * @return SyncInvoker<DeleteAppIconRequest, DeleteAppIconResponse>
     */
    public SyncInvoker<DeleteAppIconRequest, DeleteAppIconResponse> deleteAppIconInvoker(DeleteAppIconRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteAppIcon, hcClient);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return ListPublishedAppResponse
     */
    public ListPublishedAppResponse listPublishedApp(ListPublishedAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPublishedApp);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return SyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse>
     */
    public SyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedAppInvoker(
        ListPublishedAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPublishedApp, hcClient);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return PublishAppResponse
     */
    public PublishAppResponse publishApp(PublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return SyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public SyncInvoker<PublishAppRequest, PublishAppResponse> publishAppInvoker(PublishAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.publishApp, hcClient);
    }

    /**
     * 查询应用详细信息
     *
     * 查询应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return ShowAppDetailResponse
     */
    public ShowAppDetailResponse showAppDetail(ShowAppDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showAppDetail);
    }

    /**
     * 查询应用详细信息
     *
     * 查询应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>
     */
    public SyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetailInvoker(ShowAppDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showAppDetail, hcClient);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return ShowPublishableAppResponse
     */
    public ShowPublishableAppResponse showPublishableApp(ShowPublishableAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showPublishableApp);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return SyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse>
     */
    public SyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableAppInvoker(
        ShowPublishableAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showPublishableApp, hcClient);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAppRequest 请求对象
     * @return UnpublishAppResponse
     */
    public UnpublishAppResponse unpublishApp(UnpublishAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.unpublishApp);
    }

    /**
     * 批量取消应用发布
     *
     * 批量取消应用发布。
     * &gt; - 批量取消应用组下已经发布的应用，应用对应的授权会一起删除，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAppRequest 请求对象
     * @return SyncInvoker<UnpublishAppRequest, UnpublishAppResponse>
     */
    public SyncInvoker<UnpublishAppRequest, UnpublishAppResponse> unpublishAppInvoker(UnpublishAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.unpublishApp, hcClient);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateApp);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateApp, hcClient);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return UploadAppIconResponse
     */
    public UploadAppIconResponse uploadAppIcon(UploadAppIconRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.uploadAppIcon);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return SyncInvoker<UploadAppIconRequest, UploadAppIconResponse>
     */
    public SyncInvoker<UploadAppIconRequest, UploadAppIconResponse> uploadAppIconInvoker(UploadAppIconRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.uploadAppIcon, hcClient);
    }

    /**
     * 租户服务激活、初始化
     *
     * 租户服务激活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeTenantRequest 请求对象
     * @return InitializeTenantResponse
     */
    public InitializeTenantResponse initializeTenant(InitializeTenantRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.initializeTenant);
    }

    /**
     * 租户服务激活、初始化
     *
     * 租户服务激活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeTenantRequest 请求对象
     * @return SyncInvoker<InitializeTenantRequest, InitializeTenantResponse>
     */
    public SyncInvoker<InitializeTenantRequest, InitializeTenantResponse> initializeTenantInvoker(
        InitializeTenantRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.initializeTenant, hcClient);
    }

    /**
     * 查询企业系统配置
     *
     * 配置加载顺序： 查询企业级配置--&gt; 查不到则赋默认阿波罗配置--&gt; 阿波罗没有则不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCorpConfigInfoRequest 请求对象
     * @return ListCorpConfigInfoResponse
     */
    public ListCorpConfigInfoResponse listCorpConfigInfo(ListCorpConfigInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listCorpConfigInfo);
    }

    /**
     * 查询企业系统配置
     *
     * 配置加载顺序： 查询企业级配置--&gt; 查不到则赋默认阿波罗配置--&gt; 阿波罗没有则不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCorpConfigInfoRequest 请求对象
     * @return SyncInvoker<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse>
     */
    public SyncInvoker<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse> listCorpConfigInfoInvoker(
        ListCorpConfigInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listCorpConfigInfo, hcClient);
    }

    /**
     * 查询租户信息
     *
     * 查询租户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfileRequest 请求对象
     * @return ListTenantProfileResponse
     */
    public ListTenantProfileResponse listTenantProfile(ListTenantProfileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTenantProfile);
    }

    /**
     * 查询租户信息
     *
     * 查询租户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfileRequest 请求对象
     * @return SyncInvoker<ListTenantProfileRequest, ListTenantProfileResponse>
     */
    public SyncInvoker<ListTenantProfileRequest, ListTenantProfileResponse> listTenantProfileInvoker(
        ListTenantProfileRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listTenantProfile, hcClient);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return BatchDeleteAppGroupResponse
     */
    public BatchDeleteAppGroupResponse batchDeleteAppGroup(BatchDeleteAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroup);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse>
     */
    public SyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroupInvoker(
        BatchDeleteAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroup, hcClient);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupRequest 请求对象
     * @return CreateAppGroupResponse
     */
    public CreateAppGroupResponse createAppGroup(CreateAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createAppGroup);
    }

    /**
     * 创建应用组
     *
     * 该API用于创建应用组。
     * &gt; - 应用服务器中安装了不同的应用，这些应用可以组成不同的应用组，进行集中的管理和维护，向用户(组)发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppGroupRequest 请求对象
     * @return SyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse>
     */
    public SyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroupInvoker(
        CreateAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createAppGroup, hcClient);
    }

    /**
     * 应用组删除
     *
     * 删除指定的应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupRequest 请求对象
     * @return DeleteAppGroupResponse
     */
    public DeleteAppGroupResponse deleteAppGroup(DeleteAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteAppGroup);
    }

    /**
     * 应用组删除
     *
     * 删除指定的应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupRequest 请求对象
     * @return SyncInvoker<DeleteAppGroupRequest, DeleteAppGroupResponse>
     */
    public SyncInvoker<DeleteAppGroupRequest, DeleteAppGroupResponse> deleteAppGroupInvoker(
        DeleteAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteAppGroup, hcClient);
    }

    /**
     * 解除服务组关联的所有应用组
     *
     * 解除服务组关联的所有应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppGroupRequest 请求对象
     * @return DisassociateAppGroupResponse
     */
    public DisassociateAppGroupResponse disassociateAppGroup(DisassociateAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.disassociateAppGroup);
    }

    /**
     * 解除服务组关联的所有应用组
     *
     * 解除服务组关联的所有应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppGroupRequest 请求对象
     * @return SyncInvoker<DisassociateAppGroupRequest, DisassociateAppGroupResponse>
     */
    public SyncInvoker<DisassociateAppGroupRequest, DisassociateAppGroupResponse> disassociateAppGroupInvoker(
        DisassociateAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.disassociateAppGroup, hcClient);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return ListAppGroupResponse
     */
    public ListAppGroupResponse listAppGroup(ListAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppGroup);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return SyncInvoker<ListAppGroupRequest, ListAppGroupResponse>
     */
    public SyncInvoker<ListAppGroupRequest, ListAppGroupResponse> listAppGroupInvoker(ListAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAppGroup, hcClient);
    }

    /**
     * 查询应用组详情
     *
     * 查询应用组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppGroupDetailRequest 请求对象
     * @return ShowAppGroupDetailResponse
     */
    public ShowAppGroupDetailResponse showAppGroupDetail(ShowAppGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showAppGroupDetail);
    }

    /**
     * 查询应用组详情
     *
     * 查询应用组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse>
     */
    public SyncInvoker<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse> showAppGroupDetailInvoker(
        ShowAppGroupDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showAppGroupDetail, hcClient);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return UpdateAppGroupResponse
     */
    public UpdateAppGroupResponse updateAppGroup(UpdateAppGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateAppGroup);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return SyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse>
     */
    public SyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroupInvoker(
        UpdateAppGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateAppGroup, hcClient);
    }

    /**
     * 创建订单
     *
     * 创建订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createOrder);
    }

    /**
     * 创建订单
     *
     * 创建订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return SyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public SyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderInvoker(CreateOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createOrder, hcClient);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return ListProductResponse
     */
    public ListProductResponse listProduct(ListProductRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listProduct);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return SyncInvoker<ListProductRequest, ListProductResponse>
     */
    public SyncInvoker<ListProductRequest, ListProductResponse> listProductInvoker(ListProductRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listProduct, hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return ListSessionTypeResponse
     */
    public ListSessionTypeResponse listSessionType(ListSessionTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSessionType);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return SyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse>
     */
    public SyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse> listSessionTypeInvoker(
        ListSessionTypeRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listSessionType, hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionTypesRequest 请求对象
     * @return ShowSessionTypesResponse
     */
    public ShowSessionTypesResponse showSessionTypes(ShowSessionTypesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showSessionTypes);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionTypesRequest 请求对象
     * @return SyncInvoker<ShowSessionTypesRequest, ShowSessionTypesResponse>
     */
    public SyncInvoker<ShowSessionTypesRequest, ShowSessionTypesResponse> showSessionTypesInvoker(
        ShowSessionTypesRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showSessionTypes, hcClient);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return AddAppGroupAuthorizationResponse
     */
    public AddAppGroupAuthorizationResponse addAppGroupAuthorization(AddAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.addAppGroupAuthorization);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse>
     */
    public SyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorizationInvoker(
        AddAppGroupAuthorizationRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.addAppGroupAuthorization, hcClient);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return BatchDeleteAppGroupAuthorizationResponse
     */
    public BatchDeleteAppGroupAuthorizationResponse batchDeleteAppGroupAuthorization(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse>
     */
    public SyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationInvoker(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization, hcClient);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return ListAppGroupAuthorizationResponse
     */
    public ListAppGroupAuthorizationResponse listAppGroupAuthorization(ListAppGroupAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppGroupAuthorization);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return SyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse>
     */
    public SyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorizationInvoker(
        ListAppGroupAuthorizationRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAppGroupAuthorization, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return ListAvailabilityZoneResponse
     */
    public ListAvailabilityZoneResponse listAvailabilityZone(ListAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAvailabilityZone);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneInvoker(
        ListAvailabilityZoneRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAvailabilityZone, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表，按站点分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzRequest 请求对象
     * @return ListAzResponse
     */
    public ListAzResponse listAz(ListAzRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAz);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表，按站点分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzRequest 请求对象
     * @return SyncInvoker<ListAzRequest, ListAzResponse>
     */
    public SyncInvoker<ListAzRequest, ListAzResponse> listAzInvoker(ListAzRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAz, hcClient);
    }

    /**
     * 分发软件信息至镜像实例
     *
     * 分发应用软件信息至镜像实例，管理员可以按需下载并安装应用软件。
     * * 目前只支持来自云应用仓库的软件信息。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例分发软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachImageServerAppRequest 请求对象
     * @return AttachImageServerAppResponse
     */
    public AttachImageServerAppResponse attachImageServerApp(AttachImageServerAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.attachImageServerApp);
    }

    /**
     * 分发软件信息至镜像实例
     *
     * 分发应用软件信息至镜像实例，管理员可以按需下载并安装应用软件。
     * * 目前只支持来自云应用仓库的软件信息。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例分发软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachImageServerAppRequest 请求对象
     * @return SyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse>
     */
    public SyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse> attachImageServerAppInvoker(
        AttachImageServerAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.attachImageServerApp, hcClient);
    }

    /**
     * 批量删除镜像实例
     *
     * 批量删除镜像实例。
     * * 忽略不存在的镜像实例，响应正常。
     * * 不允许操作状态为 &#x60;创建中&#x60;、&#x60;镜像创建中&#x60;的实例，响应异常。
     * * 不支持资源关联发生变化后，请求删除镜像实例关联资源，任务响应异常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageServerRequest 请求对象
     * @return BatchDeleteImageServerResponse
     */
    public BatchDeleteImageServerResponse batchDeleteImageServer(BatchDeleteImageServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteImageServer);
    }

    /**
     * 批量删除镜像实例
     *
     * 批量删除镜像实例。
     * * 忽略不存在的镜像实例，响应正常。
     * * 不允许操作状态为 &#x60;创建中&#x60;、&#x60;镜像创建中&#x60;的实例，响应异常。
     * * 不支持资源关联发生变化后，请求删除镜像实例关联资源，任务响应异常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageServerRequest 请求对象
     * @return SyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse>
     */
    public SyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> batchDeleteImageServerInvoker(
        BatchDeleteImageServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteImageServer, hcClient);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return CreateImageServerResponse
     */
    public CreateImageServerResponse createImageServer(CreateImageServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createImageServer);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return SyncInvoker<CreateImageServerRequest, CreateImageServerResponse>
     */
    public SyncInvoker<CreateImageServerRequest, CreateImageServerResponse> createImageServerInvoker(
        CreateImageServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createImageServer, hcClient);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return ListImageServersResponse
     */
    public ListImageServersResponse listImageServers(ListImageServersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listImageServers);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return SyncInvoker<ListImageServersRequest, ListImageServersResponse>
     */
    public SyncInvoker<ListImageServersRequest, ListImageServersResponse> listImageServersInvoker(
        ListImageServersRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listImageServers, hcClient);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return ListLatestAttachedServerAppResponse
     */
    public ListLatestAttachedServerAppResponse listLatestAttachedServerApp(ListLatestAttachedServerAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listLatestAttachedServerApp);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return SyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse>
     */
    public SyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> listLatestAttachedServerAppInvoker(
        ListLatestAttachedServerAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listLatestAttachedServerApp, hcClient);
    }

    /**
     * 构建云应用镜像
     *
     * 构建云应用镜像。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例构建云应用镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateServerImageRequest 请求对象
     * @return RecreateServerImageResponse
     */
    public RecreateServerImageResponse recreateServerImage(RecreateServerImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.recreateServerImage);
    }

    /**
     * 构建云应用镜像
     *
     * 构建云应用镜像。
     * * 只允许对状态为 &#x60;实例正常运行&#x60;、&#x60;镜像任务结束&#x60; 的实例构建云应用镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateServerImageRequest 请求对象
     * @return SyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse>
     */
    public SyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse> recreateServerImageInvoker(
        RecreateServerImageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.recreateServerImage, hcClient);
    }

    /**
     * 查询指定镜像实例
     *
     * 查询指定的镜像实例当前这个接口的查询数据和list查询的一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageServerRequest 请求对象
     * @return ShowImageServerResponse
     */
    public ShowImageServerResponse showImageServer(ShowImageServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showImageServer);
    }

    /**
     * 查询指定镜像实例
     *
     * 查询指定的镜像实例当前这个接口的查询数据和list查询的一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageServerRequest 请求对象
     * @return SyncInvoker<ShowImageServerRequest, ShowImageServerResponse>
     */
    public SyncInvoker<ShowImageServerRequest, ShowImageServerResponse> showImageServerInvoker(
        ShowImageServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showImageServer, hcClient);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return UpdateImageServerResponse
     */
    public UpdateImageServerResponse updateImageServer(UpdateImageServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateImageServer);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return SyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse>
     */
    public SyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse> updateImageServerInvoker(
        UpdateImageServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateImageServer, hcClient);
    }

    /**
     * 批量删除子任务
     *
     * 批量删除子任务，忽略不存在的服务器并且返回成功响应。
     * 只能删除以下的两种状态：
     * - SUCCESS：成功。
     * - FAILED：失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppSubJobsRequest 请求对象
     * @return BatchDeleteAppSubJobsResponse
     */
    public BatchDeleteAppSubJobsResponse batchDeleteAppSubJobs(BatchDeleteAppSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppSubJobs);
    }

    /**
     * 批量删除子任务
     *
     * 批量删除子任务，忽略不存在的服务器并且返回成功响应。
     * 只能删除以下的两种状态：
     * - SUCCESS：成功。
     * - FAILED：失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppSubJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse>
     */
    public SyncInvoker<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse> batchDeleteAppSubJobsInvoker(
        BatchDeleteAppSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppSubJobs, hcClient);
    }

    /**
     * 批量删除镜像子任务
     *
     * 批量删除子任务，忽略不存在的服务器并且返回成功响应。
     * 只能删除以下的两种状态 SUCCESS：成功。 FAILED：失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageSubJobsRequest 请求对象
     * @return BatchDeleteImageSubJobsResponse
     */
    public BatchDeleteImageSubJobsResponse batchDeleteImageSubJobs(BatchDeleteImageSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteImageSubJobs);
    }

    /**
     * 批量删除镜像子任务
     *
     * 批量删除子任务，忽略不存在的服务器并且返回成功响应。
     * 只能删除以下的两种状态 SUCCESS：成功。 FAILED：失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteImageSubJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse>
     */
    public SyncInvoker<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse> batchDeleteImageSubJobsInvoker(
        BatchDeleteImageSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteImageSubJobs, hcClient);
    }

    /**
     * 子任务数量查询
     *
     * 该接口用于查询异步子任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSubJobsRequest 请求对象
     * @return CountSubJobsResponse
     */
    public CountSubJobsResponse countSubJobs(CountSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.countSubJobs);
    }

    /**
     * 子任务数量查询
     *
     * 该接口用于查询异步子任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSubJobsRequest 请求对象
     * @return SyncInvoker<CountSubJobsRequest, CountSubJobsResponse>
     */
    public SyncInvoker<CountSubJobsRequest, CountSubJobsResponse> countSubJobsInvoker(CountSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.countSubJobs, hcClient);
    }

    /**
     * 查询租户的镜像任务列表
     *
     * 该接口用于查询租户的异步任务执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageJobsRequest 请求对象
     * @return ListImageJobsResponse
     */
    public ListImageJobsResponse listImageJobs(ListImageJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listImageJobs);
    }

    /**
     * 查询租户的镜像任务列表
     *
     * 该接口用于查询租户的异步任务执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageJobsRequest 请求对象
     * @return SyncInvoker<ListImageJobsRequest, ListImageJobsResponse>
     */
    public SyncInvoker<ListImageJobsRequest, ListImageJobsResponse> listImageJobsInvoker(ListImageJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listImageJobs, hcClient);
    }

    /**
     * 镜像子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSubJobsRequest 请求对象
     * @return ListImageSubJobsResponse
     */
    public ListImageSubJobsResponse listImageSubJobs(ListImageSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listImageSubJobs);
    }

    /**
     * 镜像子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSubJobsRequest 请求对象
     * @return SyncInvoker<ListImageSubJobsRequest, ListImageSubJobsResponse>
     */
    public SyncInvoker<ListImageSubJobsRequest, ListImageSubJobsResponse> listImageSubJobsInvoker(
        ListImageSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listImageSubJobs, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubJobsRequest 请求对象
     * @return ListSubJobsResponse
     */
    public ListSubJobsResponse listSubJobs(ListSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubJobsRequest 请求对象
     * @return SyncInvoker<ListSubJobsRequest, ListSubJobsResponse>
     */
    public SyncInvoker<ListSubJobsRequest, ListSubJobsResponse> listSubJobsInvoker(ListSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listSubJobs, hcClient);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return ShowImageJobResponse
     */
    public ShowImageJobResponse showImageJob(ShowImageJobRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showImageJob);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return SyncInvoker<ShowImageJobRequest, ShowImageJobResponse>
     */
    public SyncInvoker<ShowImageJobRequest, ShowImageJobResponse> showImageJobInvoker(ShowImageJobRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showImageJob, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云应用服务器命令下发后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showJob, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、重建镜像等异步API，下发命令后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showJobDetail);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、重建镜像等异步API，下发命令后会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showJobDetail, hcClient);
    }

    /**
     * 查询应用组授权邮件发送记录
     *
     * 查询应用组授权邮件发送记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationMailRecordRequest 请求对象
     * @return ListAuthorizationMailRecordResponse
     */
    public ListAuthorizationMailRecordResponse listAuthorizationMailRecord(ListAuthorizationMailRecordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAuthorizationMailRecord);
    }

    /**
     * 查询应用组授权邮件发送记录
     *
     * 查询应用组授权邮件发送记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationMailRecordRequest 请求对象
     * @return SyncInvoker<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse>
     */
    public SyncInvoker<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse> listAuthorizationMailRecordInvoker(
        ListAuthorizationMailRecordRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAuthorizationMailRecord, hcClient);
    }

    /**
     * 重发应用组授权邮件（根据授权邮件记录）
     *
     * 重发应用组授权邮件（根据授权邮件记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizationMailRequest 请求对象
     * @return SendAuthorizationMailResponse
     */
    public SendAuthorizationMailResponse sendAuthorizationMail(SendAuthorizationMailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.sendAuthorizationMail);
    }

    /**
     * 重发应用组授权邮件（根据授权邮件记录）
     *
     * 重发应用组授权邮件（根据授权邮件记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizationMailRequest 请求对象
     * @return SyncInvoker<SendAuthorizationMailRequest, SendAuthorizationMailResponse>
     */
    public SyncInvoker<SendAuthorizationMailRequest, SendAuthorizationMailResponse> sendAuthorizationMailInvoker(
        SendAuthorizationMailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.sendAuthorizationMail, hcClient);
    }

    /**
     * 重发应用组授权邮件（根据授权记录）
     *
     * 重发应用组授权邮件（根据授权记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizedMailRequest 请求对象
     * @return SendAuthorizedMailResponse
     */
    public SendAuthorizedMailResponse sendAuthorizedMail(SendAuthorizedMailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.sendAuthorizedMail);
    }

    /**
     * 重发应用组授权邮件（根据授权记录）
     *
     * 重发应用组授权邮件（根据授权记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizedMailRequest 请求对象
     * @return SyncInvoker<SendAuthorizedMailRequest, SendAuthorizedMailResponse>
     */
    public SyncInvoker<SendAuthorizedMailRequest, SendAuthorizedMailResponse> sendAuthorizedMailInvoker(
        SendAuthorizedMailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.sendAuthorizedMail, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePersistentStorageRequest 请求对象
     * @return BatchDeletePersistentStorageResponse
     */
    public BatchDeletePersistentStorageResponse batchDeletePersistentStorage(
        BatchDeletePersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePersistentStorageRequest 请求对象
     * @return SyncInvoker<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse>
     */
    public SyncInvoker<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse> batchDeletePersistentStorageInvoker(
        BatchDeletePersistentStorageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeletePersistentStorage, hcClient);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return CreateOrUpdateStoragePolicyStatementResponse
     */
    public CreateOrUpdateStoragePolicyStatementResponse createOrUpdateStoragePolicyStatement(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse>
     */
    public SyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementInvoker(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement, hcClient);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return CreatePersistentStorageResponse
     */
    public CreatePersistentStorageResponse createPersistentStorage(CreatePersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPersistentStorage);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return SyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse>
     */
    public SyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorageInvoker(
        CreatePersistentStorageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createPersistentStorage, hcClient);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return CreateShareFolderResponse
     */
    public CreateShareFolderResponse createShareFolder(CreateShareFolderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createShareFolder);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return SyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse>
     */
    public SyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolderInvoker(
        CreateShareFolderRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createShareFolder, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return DeletePersistentStorageResponse
     */
    public DeletePersistentStorageResponse deletePersistentStorage(DeletePersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return SyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse>
     */
    public SyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorageInvoker(
        DeletePersistentStorageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deletePersistentStorage, hcClient);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStorageClaimRequest 请求对象
     * @return DeleteStorageClaimResponse
     */
    public DeleteStorageClaimResponse deleteStorageClaim(DeleteStorageClaimRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteStorageClaim);
    }

    /**
     * 删除共享目录
     *
     * 删除共享存储目录。
     * &gt; 需要删除绑定的用户及用户组，才能删除共享文目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStorageClaimRequest 请求对象
     * @return SyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse>
     */
    public SyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaimInvoker(
        DeleteStorageClaimRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteStorageClaim, hcClient);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return DeleteUserStorageAttachmentResponse
     */
    public DeleteUserStorageAttachmentResponse deleteUserStorageAttachment(DeleteUserStorageAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteUserStorageAttachment);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return SyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse>
     */
    public SyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentInvoker(
        DeleteUserStorageAttachmentRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteUserStorageAttachment, hcClient);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return ListPersistentStorageResponse
     */
    public ListPersistentStorageResponse listPersistentStorage(ListPersistentStorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPersistentStorage);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return SyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse>
     */
    public SyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorageInvoker(
        ListPersistentStorageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPersistentStorage, hcClient);
    }

    /**
     * 查询SFS3.0存储
     *
     * 查询SFS3.0存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfs3StorageRequest 请求对象
     * @return ListSfs3StorageResponse
     */
    public ListSfs3StorageResponse listSfs3Storage(ListSfs3StorageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSfs3Storage);
    }

    /**
     * 查询SFS3.0存储
     *
     * 查询SFS3.0存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfs3StorageRequest 请求对象
     * @return SyncInvoker<ListSfs3StorageRequest, ListSfs3StorageResponse>
     */
    public SyncInvoker<ListSfs3StorageRequest, ListSfs3StorageResponse> listSfs3StorageInvoker(
        ListSfs3StorageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listSfs3Storage, hcClient);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return ListShareFolderResponse
     */
    public ListShareFolderResponse listShareFolder(ListShareFolderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listShareFolder);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return SyncInvoker<ListShareFolderRequest, ListShareFolderResponse>
     */
    public SyncInvoker<ListShareFolderRequest, ListShareFolderResponse> listShareFolderInvoker(
        ListShareFolderRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listShareFolder, hcClient);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return ListStorageAssignmentResponse
     */
    public ListStorageAssignmentResponse listStorageAssignment(ListStorageAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listStorageAssignment);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return SyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse>
     */
    public SyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignmentInvoker(
        ListStorageAssignmentRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listStorageAssignment, hcClient);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return ListStoragePolicyStatementResponse
     */
    public ListStoragePolicyStatementResponse listStoragePolicyStatement(ListStoragePolicyStatementRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listStoragePolicyStatement);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return SyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse>
     */
    public SyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatementInvoker(
        ListStoragePolicyStatementRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listStoragePolicyStatement, hcClient);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return UpdateShareFolderAssignmentResponse
     */
    public UpdateShareFolderAssignmentResponse updateShareFolderAssignment(UpdateShareFolderAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateShareFolderAssignment);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return SyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse>
     */
    public SyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentInvoker(
        UpdateShareFolderAssignmentRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateShareFolderAssignment, hcClient);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return UpdateUserFolderAssignmentResponse
     */
    public UpdateUserFolderAssignmentResponse updateUserFolderAssignment(UpdateUserFolderAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateUserFolderAssignment);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return SyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse>
     */
    public SyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentInvoker(
        UpdateUserFolderAssignmentRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateUserFolderAssignment, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupInvoker(
        CreatePolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createPolicyGroup, hcClient);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return CreatePolicyTemplateResponse
     */
    public CreatePolicyTemplateResponse createPolicyTemplate(CreatePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createPolicyTemplate);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateInvoker(
        CreatePolicyTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createPolicyTemplate, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroup(DeletePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupInvoker(
        DeletePolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return DeletePolicyTemplateResponse
     */
    public DeletePolicyTemplateResponse deletePolicyTemplate(DeletePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deletePolicyTemplate);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return SyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse>
     */
    public SyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplateInvoker(
        DeletePolicyTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deletePolicyTemplate, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return ListPolicyGroupResponse
     */
    public ListPolicyGroupResponse listPolicyGroup(ListPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupInvoker(
        ListPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupDetailInfoRequest 请求对象
     * @return ListPolicyGroupDetailInfoResponse
     */
    public ListPolicyGroupDetailInfoResponse listPolicyGroupDetailInfo(ListPolicyGroupDetailInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroupDetailInfo);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupDetailInfoRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse>
     */
    public SyncInvoker<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse> listPolicyGroupDetailInfoInvoker(
        ListPolicyGroupDetailInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPolicyGroupDetailInfo, hcClient);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyOfPolicyGroupRequest 请求对象
     * @return ListPolicyOfPolicyGroupResponse
     */
    public ListPolicyOfPolicyGroupResponse listPolicyOfPolicyGroup(ListPolicyOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyOfPolicyGroup);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse> listPolicyOfPolicyGroupInvoker(
        ListPolicyOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPolicyOfPolicyGroup, hcClient);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return ListPolicyTemplateResponse
     */
    public ListPolicyTemplateResponse listPolicyTemplate(ListPolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listPolicyTemplate);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return SyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse>
     */
    public SyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplateInvoker(
        ListPolicyTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listPolicyTemplate, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return ListTargetsOfPolicyGroupResponse
     */
    public ListTargetsOfPolicyGroupResponse listTargetsOfPolicyGroup(ListTargetsOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTargetsOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse>
     */
    public SyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupInvoker(
        ListTargetsOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listTargetsOfPolicyGroup, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return ShowOriginalPolicyInfoResponse
     */
    public ShowOriginalPolicyInfoResponse showOriginalPolicyInfo(ShowOriginalPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return SyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse>
     */
    public SyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoInvoker(
        ShowOriginalPolicyInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showOriginalPolicyInfo, hcClient);
    }

    /**
     * 查询策略组详情
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGroupRequest 请求对象
     * @return ShowPolicyGroupResponse
     */
    public ShowPolicyGroupResponse showPolicyGroup(ShowPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showPolicyGroup);
    }

    /**
     * 查询策略组详情
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGroupRequest 请求对象
     * @return SyncInvoker<ShowPolicyGroupRequest, ShowPolicyGroupResponse>
     */
    public SyncInvoker<ShowPolicyGroupRequest, ShowPolicyGroupResponse> showPolicyGroupInvoker(
        ShowPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showPolicyGroup, hcClient);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return UpdatePolicyGroupResponse
     */
    public UpdatePolicyGroupResponse updatePolicyGroup(UpdatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updatePolicyGroup);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return SyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse>
     */
    public SyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroupInvoker(
        UpdatePolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return UpdatePolicyTemplateResponse
     */
    public UpdatePolicyTemplateResponse updatePolicyTemplate(UpdatePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updatePolicyTemplate);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return SyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse>
     */
    public SyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplateInvoker(
        UpdatePolicyTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updatePolicyTemplate, hcClient);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return CheckQuotaResponse
     */
    public CheckQuotaResponse checkQuota(CheckQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.checkQuota);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return SyncInvoker<CheckQuotaRequest, CheckQuotaResponse>
     */
    public SyncInvoker<CheckQuotaRequest, CheckQuotaResponse> checkQuotaInvoker(CheckQuotaRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.checkQuota, hcClient);
    }

    /**
     * 新增/修改弹性伸缩策略
     *
     * 新增/修改弹性伸缩策略,仅按需的服务器支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateScalingPolicyRequest 请求对象
     * @return CreateOrUpdateScalingPolicyResponse
     */
    public CreateOrUpdateScalingPolicyResponse createOrUpdateScalingPolicy(CreateOrUpdateScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateScalingPolicy);
    }

    /**
     * 新增/修改弹性伸缩策略
     *
     * 新增/修改弹性伸缩策略,仅按需的服务器支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateScalingPolicyRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse>
     */
    public SyncInvoker<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse> createOrUpdateScalingPolicyInvoker(
        CreateOrUpdateScalingPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createOrUpdateScalingPolicy, hcClient);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return DeleteScalingPolicyResponse
     */
    public DeleteScalingPolicyResponse deleteScalingPolicy(DeleteScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteScalingPolicy);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return SyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse>
     */
    public SyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicyInvoker(
        DeleteScalingPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteScalingPolicy, hcClient);
    }

    /**
     * 查询服务器组弹性伸缩策略
     *
     * 查询服务器组弹性伸缩策略,如果服务器未配置策略时响应默认策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return ShowScalingPolicyResponse
     */
    public ShowScalingPolicyResponse showScalingPolicy(ShowScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showScalingPolicy);
    }

    /**
     * 查询服务器组弹性伸缩策略
     *
     * 查询服务器组弹性伸缩策略,如果服务器未配置策略时响应默认策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return SyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse>
     */
    public SyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicyInvoker(
        ShowScalingPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showScalingPolicy, hcClient);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务，忽略不存在的服务器组并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduleTaskRequest 请求对象
     * @return BatchDeleteScheduleTaskResponse
     */
    public BatchDeleteScheduleTaskResponse batchDeleteScheduleTask(BatchDeleteScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteScheduleTask);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务，忽略不存在的服务器组并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduleTaskRequest 请求对象
     * @return SyncInvoker<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse>
     */
    public SyncInvoker<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse> batchDeleteScheduleTaskInvoker(
        BatchDeleteScheduleTaskRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteScheduleTask, hcClient);
    }

    /**
     * 新增定时任务
     *
     * 新增定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return CreateScheduleTaskResponse
     */
    public CreateScheduleTaskResponse createScheduleTask(CreateScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createScheduleTask);
    }

    /**
     * 新增定时任务
     *
     * 新增定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return SyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse>
     */
    public SyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTaskInvoker(
        CreateScheduleTaskRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createScheduleTask, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务，忽略不存在的任务并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return DeleteScheduleTaskResponse
     */
    public DeleteScheduleTaskResponse deleteScheduleTask(DeleteScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteScheduleTask);
    }

    /**
     * 删除任务
     *
     * 删除任务，忽略不存在的任务并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse>
     */
    public SyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTaskInvoker(
        DeleteScheduleTaskRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteScheduleTask, hcClient);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return ListFutureExecutionsResponse
     */
    public ListFutureExecutionsResponse listFutureExecutions(ListFutureExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listFutureExecutions);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return SyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse>
     */
    public SyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse> listFutureExecutionsInvoker(
        ListFutureExecutionsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listFutureExecutions, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTasksRequest 请求对象
     * @return ListScheduleTasksResponse
     */
    public ListScheduleTasksResponse listScheduleTasks(ListScheduleTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listScheduleTasks);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTasksRequest 请求对象
     * @return SyncInvoker<ListScheduleTasksRequest, ListScheduleTasksResponse>
     */
    public SyncInvoker<ListScheduleTasksRequest, ListScheduleTasksResponse> listScheduleTasksInvoker(
        ListScheduleTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listScheduleTasks, hcClient);
    }

    /**
     * 查询定时任务执行子任务列表
     *
     * 查询定时任务执行子任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteDetailRequest 请求对象
     * @return ListTaskExecuteDetailResponse
     */
    public ListTaskExecuteDetailResponse listTaskExecuteDetail(ListTaskExecuteDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTaskExecuteDetail);
    }

    /**
     * 查询定时任务执行子任务列表
     *
     * 查询定时任务执行子任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteDetailRequest 请求对象
     * @return SyncInvoker<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse>
     */
    public SyncInvoker<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse> listTaskExecuteDetailInvoker(
        ListTaskExecuteDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listTaskExecuteDetail, hcClient);
    }

    /**
     * 查询定时任务执行列表
     *
     * 查询定时任务执行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteHistoryRequest 请求对象
     * @return ListTaskExecuteHistoryResponse
     */
    public ListTaskExecuteHistoryResponse listTaskExecuteHistory(ListTaskExecuteHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTaskExecuteHistory);
    }

    /**
     * 查询定时任务执行列表
     *
     * 查询定时任务执行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteHistoryRequest 请求对象
     * @return SyncInvoker<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse>
     */
    public SyncInvoker<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse> listTaskExecuteHistoryInvoker(
        ListTaskExecuteHistoryRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listTaskExecuteHistory, hcClient);
    }

    /**
     * 查询指定定时任务详情
     *
     * 查询指定定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleTaskRequest 请求对象
     * @return ShowScheduleTaskResponse
     */
    public ShowScheduleTaskResponse showScheduleTask(ShowScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showScheduleTask);
    }

    /**
     * 查询指定定时任务详情
     *
     * 查询指定定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleTaskRequest 请求对象
     * @return SyncInvoker<ShowScheduleTaskRequest, ShowScheduleTaskResponse>
     */
    public SyncInvoker<ShowScheduleTaskRequest, ShowScheduleTaskResponse> showScheduleTaskInvoker(
        ShowScheduleTaskRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showScheduleTask, hcClient);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleTaskRequest 请求对象
     * @return UpdateScheduleTaskResponse
     */
    public UpdateScheduleTaskResponse updateScheduleTask(UpdateScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateScheduleTask);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleTaskRequest 请求对象
     * @return SyncInvoker<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse>
     */
    public SyncInvoker<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse> updateScheduleTaskInvoker(
        UpdateScheduleTaskRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateScheduleTask, hcClient);
    }

    /**
     * 批量修改服务器的镜像
     *
     * 批量修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerImageRequest 请求对象
     * @return BatchChangeServerImageResponse
     */
    public BatchChangeServerImageResponse batchChangeServerImage(BatchChangeServerImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchChangeServerImage);
    }

    /**
     * 批量修改服务器的镜像
     *
     * 批量修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerImageRequest 请求对象
     * @return SyncInvoker<BatchChangeServerImageRequest, BatchChangeServerImageResponse>
     */
    public SyncInvoker<BatchChangeServerImageRequest, BatchChangeServerImageResponse> batchChangeServerImageInvoker(
        BatchChangeServerImageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchChangeServerImage, hcClient);
    }

    /**
     * 标记服务器维护状态
     *
     * 标记服务器维护状态，处于维护状态中的服务器不再分配流量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerMaintainModeRequest 请求对象
     * @return BatchChangeServerMaintainModeResponse
     */
    public BatchChangeServerMaintainModeResponse batchChangeServerMaintainMode(
        BatchChangeServerMaintainModeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchChangeServerMaintainMode);
    }

    /**
     * 标记服务器维护状态
     *
     * 标记服务器维护状态，处于维护状态中的服务器不再分配流量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerMaintainModeRequest 请求对象
     * @return SyncInvoker<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse>
     */
    public SyncInvoker<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse> batchChangeServerMaintainModeInvoker(
        BatchChangeServerMaintainModeRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchChangeServerMaintainMode, hcClient);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器。
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerRequest 请求对象
     * @return BatchDeleteServerResponse
     */
    public BatchDeleteServerResponse batchDeleteServer(BatchDeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServer);
    }

    /**
     * 批量删除服务器
     *
     * 批量删除服务器。
     * &gt; - 仅支持删除按需订购的服务器，包周期订购的服务器需要到Console界面进行退订，订单退订成功后服务器将会自动删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerRequest 请求对象
     * @return SyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse>
     */
    public SyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServerInvoker(
        BatchDeleteServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteServer, hcClient);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return BatchMigrateHostsServerResponse
     */
    public BatchMigrateHostsServerResponse batchMigrateHostsServer(BatchMigrateHostsServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchMigrateHostsServer);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return SyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse>
     */
    public SyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServerInvoker(
        BatchMigrateHostsServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchMigrateHostsServer, hcClient);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return BatchRebootServerResponse
     */
    public BatchRebootServerResponse batchRebootServer(BatchRebootServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchRebootServer);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return SyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse>
     */
    public SyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServerInvoker(
        BatchRebootServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchRebootServer, hcClient);
    }

    /**
     * 批量重装服务器
     *
     * 批量重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchReinstallServerRequest 请求对象
     * @return BatchReinstallServerResponse
     */
    public BatchReinstallServerResponse batchReinstallServer(BatchReinstallServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchReinstallServer);
    }

    /**
     * 批量重装服务器
     *
     * 批量重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchReinstallServerRequest 请求对象
     * @return SyncInvoker<BatchReinstallServerRequest, BatchReinstallServerResponse>
     */
    public SyncInvoker<BatchReinstallServerRequest, BatchReinstallServerResponse> batchReinstallServerInvoker(
        BatchReinstallServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchReinstallServer, hcClient);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return BatchRejoinDomainResponse
     */
    public BatchRejoinDomainResponse batchRejoinDomain(BatchRejoinDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchRejoinDomain);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return SyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse>
     */
    public SyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomainInvoker(
        BatchRejoinDomainRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchRejoinDomain, hcClient);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return BatchStartServerResponse
     */
    public BatchStartServerResponse batchStartServer(BatchStartServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchStartServer);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return SyncInvoker<BatchStartServerRequest, BatchStartServerResponse>
     */
    public SyncInvoker<BatchStartServerRequest, BatchStartServerResponse> batchStartServerInvoker(
        BatchStartServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchStartServer, hcClient);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return BatchStopServerResponse
     */
    public BatchStopServerResponse batchStopServer(BatchStopServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchStopServer);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return SyncInvoker<BatchStopServerRequest, BatchStopServerResponse>
     */
    public SyncInvoker<BatchStopServerRequest, BatchStopServerResponse> batchStopServerInvoker(
        BatchStopServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchStopServer, hcClient);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return BatchUpdateTsviResponse
     */
    public BatchUpdateTsviResponse batchUpdateTsvi(BatchUpdateTsviRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchUpdateTsvi);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return SyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse>
     */
    public SyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsviInvoker(
        BatchUpdateTsviRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchUpdateTsvi, hcClient);
    }

    /**
     * 批量升级服务器HDA版本
     *
     * 批量升级服务器HDA版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeHdaVersionRequest 请求对象
     * @return BatchUpgradeHdaVersionResponse
     */
    public BatchUpgradeHdaVersionResponse batchUpgradeHdaVersion(BatchUpgradeHdaVersionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchUpgradeHdaVersion);
    }

    /**
     * 批量升级服务器HDA版本
     *
     * 批量升级服务器HDA版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeHdaVersionRequest 请求对象
     * @return SyncInvoker<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse>
     */
    public SyncInvoker<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse> batchUpgradeHdaVersionInvoker(
        BatchUpgradeHdaVersionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchUpgradeHdaVersion, hcClient);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerImageRequest 请求对象
     * @return ChangeServerImageResponse
     */
    public ChangeServerImageResponse changeServerImage(ChangeServerImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.changeServerImage);
    }

    /**
     * 修改服务器的镜像
     *
     * 修改服务器的镜像。
     * &gt; - 服务器的镜像和服务器组的镜像不一样时，支持服务器的镜像切换为服务器组的镜像，并且仅允许同等镜像进行切换，例如：同操作系统，免费镜像切换，同源同价的付费镜像切换。如果服务器组的镜像和服务器的镜像为非同等镜像，建议您直接购买新的服务器，删除或者退订老的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerImageRequest 请求对象
     * @return SyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse>
     */
    public SyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImageInvoker(
        ChangeServerImageRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.changeServerImage, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return CreateAppServersResponse
     */
    public CreateAppServersResponse createAppServers(CreateAppServersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createAppServers);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return SyncInvoker<CreateAppServersRequest, CreateAppServersResponse>
     */
    public SyncInvoker<CreateAppServersRequest, CreateAppServersResponse> createAppServersInvoker(
        CreateAppServersRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createAppServers, hcClient);
    }

    /**
     * 删除服务器
     *
     * 删除服务器，忽略不存在的服务器并且返回成功响应。订单退订成功后调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerRequest 请求对象
     * @return DeleteServerResponse
     */
    public DeleteServerResponse deleteServer(DeleteServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteServer);
    }

    /**
     * 删除服务器
     *
     * 删除服务器，忽略不存在的服务器并且返回成功响应。订单退订成功后调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerRequest 请求对象
     * @return SyncInvoker<DeleteServerRequest, DeleteServerResponse>
     */
    public SyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerInvoker(DeleteServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteServer, hcClient);
    }

    /**
     * 查询租户的所有HDA最新版本
     *
     * 查询租户的所有HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAgentLatestVersionRequest 请求对象
     * @return ListAccessAgentLatestVersionResponse
     */
    public ListAccessAgentLatestVersionResponse listAccessAgentLatestVersion(
        ListAccessAgentLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAccessAgentLatestVersion);
    }

    /**
     * 查询租户的所有HDA最新版本
     *
     * 查询租户的所有HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAgentLatestVersionRequest 请求对象
     * @return SyncInvoker<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse>
     */
    public SyncInvoker<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse> listAccessAgentLatestVersionInvoker(
        ListAccessAgentLatestVersionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAccessAgentLatestVersion, hcClient);
    }

    /**
     * 查询服务器的HDA相关信息
     *
     * 查询服务器的HDA相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaDetailsRequest 请求对象
     * @return ListServerHdaDetailsResponse
     */
    public ListServerHdaDetailsResponse listServerHdaDetails(ListServerHdaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerHdaDetails);
    }

    /**
     * 查询服务器的HDA相关信息
     *
     * 查询服务器的HDA相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaDetailsRequest 请求对象
     * @return SyncInvoker<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse>
     */
    public SyncInvoker<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse> listServerHdaDetailsInvoker(
        ListServerHdaDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServerHdaDetails, hcClient);
    }

    /**
     * 查询服务器的HDA升级跟踪记录
     *
     * 查询服务器的HDA升级跟踪记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaUpgradeRecordsRequest 请求对象
     * @return ListServerHdaUpgradeRecordsResponse
     */
    public ListServerHdaUpgradeRecordsResponse listServerHdaUpgradeRecords(ListServerHdaUpgradeRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerHdaUpgradeRecords);
    }

    /**
     * 查询服务器的HDA升级跟踪记录
     *
     * 查询服务器的HDA升级跟踪记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaUpgradeRecordsRequest 请求对象
     * @return SyncInvoker<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse>
     */
    public SyncInvoker<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse> listServerHdaUpgradeRecordsInvoker(
        ListServerHdaUpgradeRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServerHdaUpgradeRecords, hcClient);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return ListServerMetricDataResponse
     */
    public ListServerMetricDataResponse listServerMetricData(ListServerMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerMetricData);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return SyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse>
     */
    public SyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse> listServerMetricDataInvoker(
        ListServerMetricDataRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServerMetricData, hcClient);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return ListServersResponse
     */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServers);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return SyncInvoker<ListServersRequest, ListServersResponse>
     */
    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServers, hcClient);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerRequest 请求对象
     * @return ReinstallServerResponse
     */
    public ReinstallServerResponse reinstallServer(ReinstallServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.reinstallServer);
    }

    /**
     * 重装服务器
     *
     * 重装服务器。
     * &gt; - 使用服务器原有的镜像进行重装，当服务器异常无法恢复时或者服务器运行时间久了，性能下降时，可选择重建服务器。注意：重装时系统盘的数据将会被清理掉。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerRequest 请求对象
     * @return SyncInvoker<ReinstallServerRequest, ReinstallServerResponse>
     */
    public SyncInvoker<ReinstallServerRequest, ReinstallServerResponse> reinstallServerInvoker(
        ReinstallServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.reinstallServer, hcClient);
    }

    /**
     * 查询租户的HDA最新版本
     *
     * 查询租户的HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessAgentLatestVersionRequest 请求对象
     * @return ShowAccessAgentLatestVersionResponse
     */
    public ShowAccessAgentLatestVersionResponse showAccessAgentLatestVersion(
        ShowAccessAgentLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showAccessAgentLatestVersion);
    }

    /**
     * 查询租户的HDA最新版本
     *
     * 查询租户的HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessAgentLatestVersionRequest 请求对象
     * @return SyncInvoker<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse>
     */
    public SyncInvoker<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse> showAccessAgentLatestVersionInvoker(
        ShowAccessAgentLatestVersionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showAccessAgentLatestVersion, hcClient);
    }

    /**
     * 查询指定服务器
     *
     * 查询指定的服务器当前这个接口的查询数据和list查询的一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return ShowServerResponse
     */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServer);
    }

    /**
     * 查询指定服务器
     *
     * 查询指定的服务器当前这个接口的查询数据和list查询的一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return SyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServer, hcClient);
    }

    /**
     * 查询云应用服务器监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerMetricDataRequest 请求对象
     * @return ShowServerMetricDataResponse
     */
    public ShowServerMetricDataResponse showServerMetricData(ShowServerMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerMetricData);
    }

    /**
     * 查询云应用服务器监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerMetricDataRequest 请求对象
     * @return SyncInvoker<ShowServerMetricDataRequest, ShowServerMetricDataResponse>
     */
    public SyncInvoker<ShowServerMetricDataRequest, ShowServerMetricDataResponse> showServerMetricDataInvoker(
        ShowServerMetricDataRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerMetricData, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return ShowServerVncResponse
     */
    public ShowServerVncResponse showServerVnc(ShowServerVncRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerVnc);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return SyncInvoker<ShowServerVncRequest, ShowServerVncResponse>
     */
    public SyncInvoker<ShowServerVncRequest, ShowServerVncResponse> showServerVncInvoker(ShowServerVncRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerVnc, hcClient);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return UpdateServerResponse
     */
    public UpdateServerResponse updateServer(UpdateServerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateServer);
    }

    /**
     * 修改服务器
     *
     * 修改服务器。
     * &gt; - 服务器的状态修改为维护模式后，用户打开应用，选择可用的服务器进行接入的时候，会过滤掉处于维护模式的服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return SyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public SyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerInvoker(UpdateServerRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateServer, hcClient);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createServerGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * &gt; - 服务器组是一组相同配置的服务器集合，服务器组内的服务器使用同一镜像创建，配置相同，运行相同的应用程序。用户在打开云应用时，会根据调度规则选取组内的一台可用服务器进行连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public SyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupInvoker(
        CreateServerGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createServerGroup, hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupsRequest 请求对象
     * @return DeleteServerGroupsResponse
     */
    public DeleteServerGroupsResponse deleteServerGroups(DeleteServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroups);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * - &gt; 删除服务器组之前，需要先删除服务器组内的所有服务器。如果传服务器组已被删除，重复执行删除，则返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupsRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse>
     */
    public SyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroupsInvoker(
        DeleteServerGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteServerGroups, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public SyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsInvoker(
        ListServerGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServerGroups, hcClient);
    }

    /**
     * 查询租户服务器组基础信息列表
     *
     * 查询租户服务器组基础信息列表(用于创建应用组时绑定服务器组)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantServerGroupsRequest 请求对象
     * @return ListTenantServerGroupsResponse
     */
    public ListTenantServerGroupsResponse listTenantServerGroups(ListTenantServerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listTenantServerGroups);
    }

    /**
     * 查询租户服务器组基础信息列表
     *
     * 查询租户服务器组基础信息列表(用于创建应用组时绑定服务器组)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantServerGroupsRequest 请求对象
     * @return SyncInvoker<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse>
     */
    public SyncInvoker<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse> listTenantServerGroupsInvoker(
        ListTenantServerGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listTenantServerGroups, hcClient);
    }

    /**
     * 查询指定服务器组
     *
     * 查询指定的服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return ShowServerGroupResponse
     */
    public ShowServerGroupResponse showServerGroup(ShowServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerGroup);
    }

    /**
     * 查询指定服务器组
     *
     * 查询指定的服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>
     */
    public SyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupInvoker(
        ShowServerGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerGroup, hcClient);
    }

    /**
     * 指定租户服务器组限制查询
     *
     * 指定租户服务器组限制查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRestrictRequest 请求对象
     * @return ShowServerGroupRestrictResponse
     */
    public ShowServerGroupRestrictResponse showServerGroupRestrict(ShowServerGroupRestrictRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerGroupRestrict);
    }

    /**
     * 指定租户服务器组限制查询
     *
     * 指定租户服务器组限制查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRestrictRequest 请求对象
     * @return SyncInvoker<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse>
     */
    public SyncInvoker<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse> showServerGroupRestrictInvoker(
        ShowServerGroupRestrictRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerGroupRestrict, hcClient);
    }

    /**
     * 查询指定服务器组内服务器状态
     *
     * 查询指定的服务器组内服务器状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupStateRequest 请求对象
     * @return ShowServerGroupStateResponse
     */
    public ShowServerGroupStateResponse showServerGroupState(ShowServerGroupStateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerGroupState);
    }

    /**
     * 查询指定服务器组内服务器状态
     *
     * 查询指定的服务器组内服务器状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupStateRequest 请求对象
     * @return SyncInvoker<ShowServerGroupStateRequest, ShowServerGroupStateResponse>
     */
    public SyncInvoker<ShowServerGroupStateRequest, ShowServerGroupStateResponse> showServerGroupStateInvoker(
        ShowServerGroupStateRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerGroupState, hcClient);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerGroupRequest 请求对象
     * @return UpdateServerGroupResponse
     */
    public UpdateServerGroupResponse updateServerGroup(UpdateServerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.updateServerGroup);
    }

    /**
     * 修改服务器组
     *
     * 修改服务器组。
     * - &gt; 修改服务器组的镜像，系统盘大小，OU信息后，已创建的服务器配置不变，新添加的服务器会使用新的配置创建。修改最大会话数后，用户接入服务器组时，会按照最新的配置进行路由计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerGroupRequest 请求对象
     * @return SyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse>
     */
    public SyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroupInvoker(
        UpdateServerGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.updateServerGroup, hcClient);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return ListAppConnectionResponse
     */
    public ListAppConnectionResponse listAppConnection(ListAppConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listAppConnection);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return SyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse>
     */
    public SyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnectionInvoker(
        ListAppConnectionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listAppConnection, hcClient);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return ListSessionByUserNameResponse
     */
    public ListSessionByUserNameResponse listSessionByUserName(ListSessionByUserNameRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSessionByUserName);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return SyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse>
     */
    public SyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserNameInvoker(
        ListSessionByUserNameRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listSessionByUserName, hcClient);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessions(ListSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listSessions);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return SyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public SyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsInvoker(ListSessionsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listSessions, hcClient);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return ListUserConnectionResponse
     */
    public ListUserConnectionResponse listUserConnection(ListUserConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listUserConnection);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return SyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse>
     */
    public SyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnectionInvoker(
        ListUserConnectionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listUserConnection, hcClient);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return LogoffUserSessionResponse
     */
    public LogoffUserSessionResponse logoffUserSession(LogoffUserSessionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.logoffUserSession);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return SyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse>
     */
    public SyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSessionInvoker(
        LogoffUserSessionRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.logoffUserSession, hcClient);
    }

    /**
     * 批量添加服务器组标签
     *
     * 此接口为幂等接口：
     * 同时对多个服务器组批量添加标签，最大支持100个服务器组，每个服务器组最大20个标签
     * 创建时如果请求体中存在重复key则报错。        
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateServerGroupTagsRequest 请求对象
     * @return BatchCreateServerGroupTagsResponse
     */
    public BatchCreateServerGroupTagsResponse batchCreateServerGroupTags(BatchCreateServerGroupTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchCreateServerGroupTags);
    }

    /**
     * 批量添加服务器组标签
     *
     * 此接口为幂等接口：
     * 同时对多个服务器组批量添加标签，最大支持100个服务器组，每个服务器组最大20个标签
     * 创建时如果请求体中存在重复key则报错。        
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateServerGroupTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse>
     */
    public SyncInvoker<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse> batchCreateServerGroupTagsInvoker(
        BatchCreateServerGroupTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchCreateServerGroupTags, hcClient);
    }

    /**
     * 批量删除服务器组标签
     *
     * 此接口为幂等接口：
     * 同时对多个服务器组批量删除标签，最大支持100个服务器组，每个服务器组最大20个标签。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     * 删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerGroupTagsRequest 请求对象
     * @return BatchDeleteServerGroupTagsResponse
     */
    public BatchDeleteServerGroupTagsResponse batchDeleteServerGroupTags(BatchDeleteServerGroupTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServerGroupTags);
    }

    /**
     * 批量删除服务器组标签
     *
     * 此接口为幂等接口：
     * 同时对多个服务器组批量删除标签，最大支持100个服务器组，每个服务器组最大20个标签。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     * 删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerGroupTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse>
     */
    public SyncInvoker<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse> batchDeleteServerGroupTagsInvoker(
        BatchDeleteServerGroupTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.batchDeleteServerGroupTags, hcClient);
    }

    /**
     * 添加服务器组标签
     *
     * 此接口为幂等接口：
     * 创建时如果请求体中存在重复key则报错。
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 一个服务器组上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupTagsRequest 请求对象
     * @return CreateServerGroupTagsResponse
     */
    public CreateServerGroupTagsResponse createServerGroupTags(CreateServerGroupTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.createServerGroupTags);
    }

    /**
     * 添加服务器组标签
     *
     * 此接口为幂等接口：
     * 创建时如果请求体中存在重复key则报错。
     * 创建时，不允许设置重复key数据,如果数据库已存在该key，就覆盖value的值。
     * 一个服务器组上最多有20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupTagsRequest 请求对象
     * @return SyncInvoker<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse>
     */
    public SyncInvoker<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse> createServerGroupTagsInvoker(
        CreateServerGroupTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.createServerGroupTags, hcClient);
    }

    /**
     * 删除服务器组标签
     *
     * 此接口为幂等接口：
     * 删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。
     * 删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 支持最多每次删除20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupTagsRequest 请求对象
     * @return DeleteServerGroupTagsResponse
     */
    public DeleteServerGroupTagsResponse deleteServerGroupTags(DeleteServerGroupTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroupTags);
    }

    /**
     * 删除服务器组标签
     *
     * 此接口为幂等接口：
     * 删除时，如果删除的标签不存在，默认处理成功,删除时不对标签字符集范围做校验。
     * 删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 支持最多每次删除20个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupTagsRequest 请求对象
     * @return SyncInvoker<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse>
     */
    public SyncInvoker<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse> deleteServerGroupTagsInvoker(
        DeleteServerGroupTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.deleteServerGroupTags, hcClient);
    }

    /**
     * 查询租户在所有服务器组上的标签
     *
     * 查询租户在所有服务器组上的资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupTagRequest 请求对象
     * @return ListServerGroupTagResponse
     */
    public ListServerGroupTagResponse listServerGroupTag(ListServerGroupTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listServerGroupTag);
    }

    /**
     * 查询租户在所有服务器组上的标签
     *
     * 查询租户在所有服务器组上的资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupTagRequest 请求对象
     * @return SyncInvoker<ListServerGroupTagRequest, ListServerGroupTagResponse>
     */
    public SyncInvoker<ListServerGroupTagRequest, ListServerGroupTagResponse> listServerGroupTagInvoker(
        ListServerGroupTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listServerGroupTag, hcClient);
    }

    /**
     * 查询服务器组的标签
     *
     * 查询指定服务器组的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupTagRequest 请求对象
     * @return ShowServerGroupTagResponse
     */
    public ShowServerGroupTagResponse showServerGroupTag(ShowServerGroupTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.showServerGroupTag);
    }

    /**
     * 查询服务器组的标签
     *
     * 查询指定服务器组的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupTagRequest 请求对象
     * @return SyncInvoker<ShowServerGroupTagRequest, ShowServerGroupTagResponse>
     */
    public SyncInvoker<ShowServerGroupTagRequest, ShowServerGroupTagResponse> showServerGroupTagInvoker(
        ShowServerGroupTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.showServerGroupTag, hcClient);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return ListVolumeTypeResponse
     */
    public ListVolumeTypeResponse listVolumeType(ListVolumeTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceAppMeta.listVolumeType);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return SyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse>
     */
    public SyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeTypeInvoker(
        ListVolumeTypeRequest request) {
        return new SyncInvoker<>(request, WorkspaceAppMeta.listVolumeType, hcClient);
    }

}

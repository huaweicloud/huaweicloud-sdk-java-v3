package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class WorkspaceAppAsyncClient {

    protected HcClient hcClient;

    public WorkspaceAppAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAppAsyncClient> newBuilder() {
        ClientBuilder<WorkspaceAppAsyncClient> clientBuilder = new ClientBuilder<>(WorkspaceAppAsyncClient::new);
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
     * @return CompletableFuture<AuthorizeObsResponse>
     */
    public CompletableFuture<AuthorizeObsResponse> authorizeObsAsync(AuthorizeObsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.authorizeObs);
    }

    /**
     * 获取上传至OBS桶的临时ak/sk
     *
     * 获取上传至OBS桶的临时ak/sk。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeObsRequest 请求对象
     * @return AsyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse>
     */
    public AsyncInvoker<AuthorizeObsRequest, AuthorizeObsResponse> authorizeObsAsyncInvoker(
        AuthorizeObsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.authorizeObs, hcClient);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return CompletableFuture<BatchDeleteWarehouseAppResponse>
     */
    public CompletableFuture<BatchDeleteWarehouseAppResponse> batchDeleteWarehouseAppAsync(
        BatchDeleteWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteWarehouseApp);
    }

    /**
     * 批量删除应用仓库中的指定应用
     *
     * 批量删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWarehouseAppRequest 请求对象
     * @return AsyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse>
     */
    public AsyncInvoker<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> batchDeleteWarehouseAppAsyncInvoker(
        BatchDeleteWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteWarehouseApp, hcClient);
    }

    /**
     * 添加桶或者桶授权
     *
     * 添加桶或者桶授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketOrAclRequest 请求对象
     * @return CompletableFuture<CreateBucketOrAclResponse>
     */
    public CompletableFuture<CreateBucketOrAclResponse> createBucketOrAclAsync(CreateBucketOrAclRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createBucketOrAcl);
    }

    /**
     * 添加桶或者桶授权
     *
     * 添加桶或者桶授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketOrAclRequest 请求对象
     * @return AsyncInvoker<CreateBucketOrAclRequest, CreateBucketOrAclResponse>
     */
    public AsyncInvoker<CreateBucketOrAclRequest, CreateBucketOrAclResponse> createBucketOrAclAsyncInvoker(
        CreateBucketOrAclRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createBucketOrAcl, hcClient);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return CompletableFuture<CreateWarehouseAppResponse>
     */
    public CompletableFuture<CreateWarehouseAppResponse> createWarehouseAppAsync(CreateWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createWarehouseApp);
    }

    /**
     * 在应用仓库中新增应用
     *
     * 在应用仓库中新增应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWarehouseAppRequest 请求对象
     * @return AsyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse>
     */
    public AsyncInvoker<CreateWarehouseAppRequest, CreateWarehouseAppResponse> createWarehouseAppAsyncInvoker(
        CreateWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createWarehouseApp, hcClient);
    }

    /**
     * 删除应用仓库中的指定应用
     *
     * 删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWarehouseAppRequest 请求对象
     * @return CompletableFuture<DeleteWarehouseAppResponse>
     */
    public CompletableFuture<DeleteWarehouseAppResponse> deleteWarehouseAppAsync(DeleteWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteWarehouseApp);
    }

    /**
     * 删除应用仓库中的指定应用
     *
     * 删除应用仓库中的指定应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWarehouseAppRequest 请求对象
     * @return AsyncInvoker<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse>
     */
    public AsyncInvoker<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse> deleteWarehouseAppAsyncInvoker(
        DeleteWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteWarehouseApp, hcClient);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return CompletableFuture<ListWarehouseAppsResponse>
     */
    public CompletableFuture<ListWarehouseAppsResponse> listWarehouseAppsAsync(ListWarehouseAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listWarehouseApps);
    }

    /**
     * 查询租户应用仓库中的应用列表
     *
     * 查询租户应用仓库中的应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWarehouseAppsRequest 请求对象
     * @return AsyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse>
     */
    public AsyncInvoker<ListWarehouseAppsRequest, ListWarehouseAppsResponse> listWarehouseAppsAsyncInvoker(
        ListWarehouseAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listWarehouseApps, hcClient);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return CompletableFuture<UpdateWarehouseAppResponse>
     */
    public CompletableFuture<UpdateWarehouseAppResponse> updateWarehouseAppAsync(UpdateWarehouseAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateWarehouseApp);
    }

    /**
     * 修改应用仓库中的指定应用信息
     *
     * 修改应用仓库中的指定应用信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWarehouseAppRequest 请求对象
     * @return AsyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse>
     */
    public AsyncInvoker<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> updateWarehouseAppAsyncInvoker(
        UpdateWarehouseAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateWarehouseApp, hcClient);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return CompletableFuture<UploadWarehouseAppIconResponse>
     */
    public CompletableFuture<UploadWarehouseAppIconResponse> uploadWarehouseAppIconAsync(
        UploadWarehouseAppIconRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.uploadWarehouseAppIcon);
    }

    /**
     * 在应用仓库中上传图标文件
     *
     * 在应用仓库中上传图标文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadWarehouseAppIconRequest 请求对象
     * @return AsyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse>
     */
    public AsyncInvoker<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> uploadWarehouseAppIconAsyncInvoker(
        UploadWarehouseAppIconRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.uploadWarehouseAppIcon, hcClient);
    }

    /**
     * 批量禁用应用
     *
     * 批量禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppRequest 请求对象
     * @return CompletableFuture<BatchDisableAppResponse>
     */
    public CompletableFuture<BatchDisableAppResponse> batchDisableAppAsync(BatchDisableAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDisableApp);
    }

    /**
     * 批量禁用应用
     *
     * 批量禁用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppRequest 请求对象
     * @return AsyncInvoker<BatchDisableAppRequest, BatchDisableAppResponse>
     */
    public AsyncInvoker<BatchDisableAppRequest, BatchDisableAppResponse> batchDisableAppAsyncInvoker(
        BatchDisableAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDisableApp, hcClient);
    }

    /**
     * 批量启用应用
     *
     * 批量启用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppRequest 请求对象
     * @return CompletableFuture<BatchEnableAppResponse>
     */
    public CompletableFuture<BatchEnableAppResponse> batchEnableAppAsync(BatchEnableAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchEnableApp);
    }

    /**
     * 批量启用应用
     *
     * 批量启用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppRequest 请求对象
     * @return AsyncInvoker<BatchEnableAppRequest, BatchEnableAppResponse>
     */
    public AsyncInvoker<BatchEnableAppRequest, BatchEnableAppResponse> batchEnableAppAsyncInvoker(
        BatchEnableAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchEnableApp, hcClient);
    }

    /**
     * 删除自定义应用图标
     *
     * 删除自定义应用应用图标，恢复使用默认应用图标，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIconRequest 请求对象
     * @return CompletableFuture<DeleteAppIconResponse>
     */
    public CompletableFuture<DeleteAppIconResponse> deleteAppIconAsync(DeleteAppIconRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteAppIcon);
    }

    /**
     * 删除自定义应用图标
     *
     * 删除自定义应用应用图标，恢复使用默认应用图标，重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIconRequest 请求对象
     * @return AsyncInvoker<DeleteAppIconRequest, DeleteAppIconResponse>
     */
    public AsyncInvoker<DeleteAppIconRequest, DeleteAppIconResponse> deleteAppIconAsyncInvoker(
        DeleteAppIconRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteAppIcon, hcClient);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return CompletableFuture<ListPublishedAppResponse>
     */
    public CompletableFuture<ListPublishedAppResponse> listPublishedAppAsync(ListPublishedAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPublishedApp);
    }

    /**
     * 查询已发布应用
     *
     * 查询已发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishedAppRequest 请求对象
     * @return AsyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse>
     */
    public AsyncInvoker<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedAppAsyncInvoker(
        ListPublishedAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPublishedApp, hcClient);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return CompletableFuture<PublishAppResponse>
     */
    public CompletableFuture<PublishAppResponse> publishAppAsync(PublishAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.publishApp);
    }

    /**
     * 发布应用
     *
     * 批量发布应用，不允许发布同名的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppRequest 请求对象
     * @return AsyncInvoker<PublishAppRequest, PublishAppResponse>
     */
    public AsyncInvoker<PublishAppRequest, PublishAppResponse> publishAppAsyncInvoker(PublishAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.publishApp, hcClient);
    }

    /**
     * 查询应用详细信息
     *
     * 查询应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return CompletableFuture<ShowAppDetailResponse>
     */
    public CompletableFuture<ShowAppDetailResponse> showAppDetailAsync(ShowAppDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showAppDetail);
    }

    /**
     * 查询应用详细信息
     *
     * 查询应用详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppDetailRequest 请求对象
     * @return AsyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse>
     */
    public AsyncInvoker<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetailAsyncInvoker(
        ShowAppDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showAppDetail, hcClient);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return CompletableFuture<ShowPublishableAppResponse>
     */
    public CompletableFuture<ShowPublishableAppResponse> showPublishableAppAsync(ShowPublishableAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showPublishableApp);
    }

    /**
     * 可发布应用列表
     *
     * 查询应用组下可发布的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublishableAppRequest 请求对象
     * @return AsyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse>
     */
    public AsyncInvoker<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableAppAsyncInvoker(
        ShowPublishableAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showPublishableApp, hcClient);
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
     * @return CompletableFuture<UnpublishAppResponse>
     */
    public CompletableFuture<UnpublishAppResponse> unpublishAppAsync(UnpublishAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.unpublishApp);
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
     * @return AsyncInvoker<UnpublishAppRequest, UnpublishAppResponse>
     */
    public AsyncInvoker<UnpublishAppRequest, UnpublishAppResponse> unpublishAppAsyncInvoker(
        UnpublishAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.unpublishApp, hcClient);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateApp);
    }

    /**
     * 修改应用信息
     *
     * 编辑修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateApp, hcClient);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return CompletableFuture<UploadAppIconResponse>
     */
    public CompletableFuture<UploadAppIconResponse> uploadAppIconAsync(UploadAppIconRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.uploadAppIcon);
    }

    /**
     * 修改自定义应用图标
     *
     * 修改自定义应用图标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppIconRequest 请求对象
     * @return AsyncInvoker<UploadAppIconRequest, UploadAppIconResponse>
     */
    public AsyncInvoker<UploadAppIconRequest, UploadAppIconResponse> uploadAppIconAsyncInvoker(
        UploadAppIconRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.uploadAppIcon, hcClient);
    }

    /**
     * 租户服务激活、初始化
     *
     * 租户服务激活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeTenantRequest 请求对象
     * @return CompletableFuture<InitializeTenantResponse>
     */
    public CompletableFuture<InitializeTenantResponse> initializeTenantAsync(InitializeTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.initializeTenant);
    }

    /**
     * 租户服务激活、初始化
     *
     * 租户服务激活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InitializeTenantRequest 请求对象
     * @return AsyncInvoker<InitializeTenantRequest, InitializeTenantResponse>
     */
    public AsyncInvoker<InitializeTenantRequest, InitializeTenantResponse> initializeTenantAsyncInvoker(
        InitializeTenantRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.initializeTenant, hcClient);
    }

    /**
     * 查询企业系统配置
     *
     * 配置加载顺序： 查询企业级配置--&gt; 查不到则赋默认阿波罗配置--&gt; 阿波罗没有则不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCorpConfigInfoRequest 请求对象
     * @return CompletableFuture<ListCorpConfigInfoResponse>
     */
    public CompletableFuture<ListCorpConfigInfoResponse> listCorpConfigInfoAsync(ListCorpConfigInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listCorpConfigInfo);
    }

    /**
     * 查询企业系统配置
     *
     * 配置加载顺序： 查询企业级配置--&gt; 查不到则赋默认阿波罗配置--&gt; 阿波罗没有则不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCorpConfigInfoRequest 请求对象
     * @return AsyncInvoker<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse>
     */
    public AsyncInvoker<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse> listCorpConfigInfoAsyncInvoker(
        ListCorpConfigInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listCorpConfigInfo, hcClient);
    }

    /**
     * 查询租户信息
     *
     * 查询租户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfileRequest 请求对象
     * @return CompletableFuture<ListTenantProfileResponse>
     */
    public CompletableFuture<ListTenantProfileResponse> listTenantProfileAsync(ListTenantProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTenantProfile);
    }

    /**
     * 查询租户信息
     *
     * 查询租户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfileRequest 请求对象
     * @return AsyncInvoker<ListTenantProfileRequest, ListTenantProfileResponse>
     */
    public AsyncInvoker<ListTenantProfileRequest, ListTenantProfileResponse> listTenantProfileAsyncInvoker(
        ListTenantProfileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTenantProfile, hcClient);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppGroupResponse>
     */
    public CompletableFuture<BatchDeleteAppGroupResponse> batchDeleteAppGroupAsync(BatchDeleteAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroup);
    }

    /**
     * 批量删除应用组
     *
     * 批量删除应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse>
     */
    public AsyncInvoker<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroupAsyncInvoker(
        BatchDeleteAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroup, hcClient);
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
     * @return CompletableFuture<CreateAppGroupResponse>
     */
    public CompletableFuture<CreateAppGroupResponse> createAppGroupAsync(CreateAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createAppGroup);
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
     * @return AsyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse>
     */
    public AsyncInvoker<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroupAsyncInvoker(
        CreateAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createAppGroup, hcClient);
    }

    /**
     * 应用组删除
     *
     * 删除指定的应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupRequest 请求对象
     * @return CompletableFuture<DeleteAppGroupResponse>
     */
    public CompletableFuture<DeleteAppGroupResponse> deleteAppGroupAsync(DeleteAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteAppGroup);
    }

    /**
     * 应用组删除
     *
     * 删除指定的应用组,重复执行会按照成功处理(响应200)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppGroupRequest 请求对象
     * @return AsyncInvoker<DeleteAppGroupRequest, DeleteAppGroupResponse>
     */
    public AsyncInvoker<DeleteAppGroupRequest, DeleteAppGroupResponse> deleteAppGroupAsyncInvoker(
        DeleteAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteAppGroup, hcClient);
    }

    /**
     * 解除服务组关联的所有应用组
     *
     * 解除服务组关联的所有应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppGroupRequest 请求对象
     * @return CompletableFuture<DisassociateAppGroupResponse>
     */
    public CompletableFuture<DisassociateAppGroupResponse> disassociateAppGroupAsync(
        DisassociateAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.disassociateAppGroup);
    }

    /**
     * 解除服务组关联的所有应用组
     *
     * 解除服务组关联的所有应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateAppGroupRequest 请求对象
     * @return AsyncInvoker<DisassociateAppGroupRequest, DisassociateAppGroupResponse>
     */
    public AsyncInvoker<DisassociateAppGroupRequest, DisassociateAppGroupResponse> disassociateAppGroupAsyncInvoker(
        DisassociateAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.disassociateAppGroup, hcClient);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return CompletableFuture<ListAppGroupResponse>
     */
    public CompletableFuture<ListAppGroupResponse> listAppGroupAsync(ListAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppGroup);
    }

    /**
     * 查询应用组
     *
     * 查询用户创建的应用组，按照名称、授权类型分页查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupRequest 请求对象
     * @return AsyncInvoker<ListAppGroupRequest, ListAppGroupResponse>
     */
    public AsyncInvoker<ListAppGroupRequest, ListAppGroupResponse> listAppGroupAsyncInvoker(
        ListAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppGroup, hcClient);
    }

    /**
     * 查询应用组详情
     *
     * 查询应用组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowAppGroupDetailResponse>
     */
    public CompletableFuture<ShowAppGroupDetailResponse> showAppGroupDetailAsync(ShowAppGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showAppGroupDetail);
    }

    /**
     * 查询应用组详情
     *
     * 查询应用组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse>
     */
    public AsyncInvoker<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse> showAppGroupDetailAsyncInvoker(
        ShowAppGroupDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showAppGroupDetail, hcClient);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return CompletableFuture<UpdateAppGroupResponse>
     */
    public CompletableFuture<UpdateAppGroupResponse> updateAppGroupAsync(UpdateAppGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateAppGroup);
    }

    /**
     * 修改应用组
     *
     * 修改应用组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse>
     */
    public AsyncInvoker<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroupAsyncInvoker(
        UpdateAppGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateAppGroup, hcClient);
    }

    /**
     * 创建订单
     *
     * 创建订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CompletableFuture<CreateOrderResponse>
     */
    public CompletableFuture<CreateOrderResponse> createOrderAsync(CreateOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createOrder);
    }

    /**
     * 创建订单
     *
     * 创建订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return AsyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public AsyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderAsyncInvoker(CreateOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createOrder, hcClient);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return CompletableFuture<ListProductResponse>
     */
    public CompletableFuture<ListProductResponse> listProductAsync(ListProductRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listProduct);
    }

    /**
     * 查询云应用套餐
     *
     * 查询云应用套餐，按照条件过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductRequest 请求对象
     * @return AsyncInvoker<ListProductRequest, ListProductResponse>
     */
    public AsyncInvoker<ListProductRequest, ListProductResponse> listProductAsyncInvoker(ListProductRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listProduct, hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return CompletableFuture<ListSessionTypeResponse>
     */
    public CompletableFuture<ListSessionTypeResponse> listSessionTypeAsync(ListSessionTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessionType);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTypeRequest 请求对象
     * @return AsyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse>
     */
    public AsyncInvoker<ListSessionTypeRequest, ListSessionTypeResponse> listSessionTypeAsyncInvoker(
        ListSessionTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessionType, hcClient);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionTypesRequest 请求对象
     * @return CompletableFuture<ShowSessionTypesResponse>
     */
    public CompletableFuture<ShowSessionTypesResponse> showSessionTypesAsync(ShowSessionTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showSessionTypes);
    }

    /**
     * 查询会话套餐列表
     *
     * 该接口用于查询会话套餐列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionTypesRequest 请求对象
     * @return AsyncInvoker<ShowSessionTypesRequest, ShowSessionTypesResponse>
     */
    public AsyncInvoker<ShowSessionTypesRequest, ShowSessionTypesResponse> showSessionTypesAsyncInvoker(
        ShowSessionTypesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showSessionTypes, hcClient);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<AddAppGroupAuthorizationResponse>
     */
    public CompletableFuture<AddAppGroupAuthorizationResponse> addAppGroupAuthorizationAsync(
        AddAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.addAppGroupAuthorization);
    }

    /**
     * 增加应用组授权
     *
     * 应用组添加用户授权，授权后用户就获得应用组下所有已发布应用的权限访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorizationAsyncInvoker(
        AddAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.addAppGroupAuthorization, hcClient);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppGroupAuthorizationResponse>
     */
    public CompletableFuture<BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationAsync(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization);
    }

    /**
     * 移除应用组授权
     *
     * 移除应用组内的指定用户的授权，用户授权删除后，用户将没有权限访问应用组内的任何应用。注意：重复执行会按照操作成功处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorizationAsyncInvoker(
        BatchDeleteAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppGroupAuthorization, hcClient);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return CompletableFuture<ListAppGroupAuthorizationResponse>
     */
    public CompletableFuture<ListAppGroupAuthorizationResponse> listAppGroupAuthorizationAsync(
        ListAppGroupAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppGroupAuthorization);
    }

    /**
     * 查询应用组授权记录
     *
     * 查询应用内已授权的用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppGroupAuthorizationRequest 请求对象
     * @return AsyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse>
     */
    public AsyncInvoker<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorizationAsyncInvoker(
        ListAppGroupAuthorizationRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppGroupAuthorization, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneResponse>
     */
    public CompletableFuture<ListAvailabilityZoneResponse> listAvailabilityZoneAsync(
        ListAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAvailabilityZone);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZoneRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneAsyncInvoker(
        ListAvailabilityZoneRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAvailabilityZone, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表，按站点分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzRequest 请求对象
     * @return CompletableFuture<ListAzResponse>
     */
    public CompletableFuture<ListAzResponse> listAzAsync(ListAzRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAz);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询支持的可用分区列表，按站点分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzRequest 请求对象
     * @return AsyncInvoker<ListAzRequest, ListAzResponse>
     */
    public AsyncInvoker<ListAzRequest, ListAzResponse> listAzAsyncInvoker(ListAzRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAz, hcClient);
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
     * @return CompletableFuture<AttachImageServerAppResponse>
     */
    public CompletableFuture<AttachImageServerAppResponse> attachImageServerAppAsync(
        AttachImageServerAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.attachImageServerApp);
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
     * @return AsyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse>
     */
    public AsyncInvoker<AttachImageServerAppRequest, AttachImageServerAppResponse> attachImageServerAppAsyncInvoker(
        AttachImageServerAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.attachImageServerApp, hcClient);
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
     * @return CompletableFuture<BatchDeleteImageServerResponse>
     */
    public CompletableFuture<BatchDeleteImageServerResponse> batchDeleteImageServerAsync(
        BatchDeleteImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteImageServer);
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
     * @return AsyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse>
     */
    public AsyncInvoker<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> batchDeleteImageServerAsyncInvoker(
        BatchDeleteImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteImageServer, hcClient);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return CompletableFuture<CreateImageServerResponse>
     */
    public CompletableFuture<CreateImageServerResponse> createImageServerAsync(CreateImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createImageServer);
    }

    /**
     * 创建镜像实例
     *
     * 创建镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageServerRequest 请求对象
     * @return AsyncInvoker<CreateImageServerRequest, CreateImageServerResponse>
     */
    public AsyncInvoker<CreateImageServerRequest, CreateImageServerResponse> createImageServerAsyncInvoker(
        CreateImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createImageServer, hcClient);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return CompletableFuture<ListImageServersResponse>
     */
    public CompletableFuture<ListImageServersResponse> listImageServersAsync(ListImageServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listImageServers);
    }

    /**
     * 查询镜像实例列表
     *
     * 查询镜像实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageServersRequest 请求对象
     * @return AsyncInvoker<ListImageServersRequest, ListImageServersResponse>
     */
    public AsyncInvoker<ListImageServersRequest, ListImageServersResponse> listImageServersAsyncInvoker(
        ListImageServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listImageServers, hcClient);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return CompletableFuture<ListLatestAttachedServerAppResponse>
     */
    public CompletableFuture<ListLatestAttachedServerAppResponse> listLatestAttachedServerAppAsync(
        ListLatestAttachedServerAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listLatestAttachedServerApp);
    }

    /**
     * 查询最近一次分发软件信息列表
     *
     * 查询最近一次分发软件信息列表，返回ID列表，不包含具体信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestAttachedServerAppRequest 请求对象
     * @return AsyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse>
     */
    public AsyncInvoker<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> listLatestAttachedServerAppAsyncInvoker(
        ListLatestAttachedServerAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listLatestAttachedServerApp, hcClient);
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
     * @return CompletableFuture<RecreateServerImageResponse>
     */
    public CompletableFuture<RecreateServerImageResponse> recreateServerImageAsync(RecreateServerImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.recreateServerImage);
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
     * @return AsyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse>
     */
    public AsyncInvoker<RecreateServerImageRequest, RecreateServerImageResponse> recreateServerImageAsyncInvoker(
        RecreateServerImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.recreateServerImage, hcClient);
    }

    /**
     * 查询指定镜像实例
     *
     * 查询指定的镜像实例当前这个接口的查询数据和list查询的一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageServerRequest 请求对象
     * @return CompletableFuture<ShowImageServerResponse>
     */
    public CompletableFuture<ShowImageServerResponse> showImageServerAsync(ShowImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showImageServer);
    }

    /**
     * 查询指定镜像实例
     *
     * 查询指定的镜像实例当前这个接口的查询数据和list查询的一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageServerRequest 请求对象
     * @return AsyncInvoker<ShowImageServerRequest, ShowImageServerResponse>
     */
    public AsyncInvoker<ShowImageServerRequest, ShowImageServerResponse> showImageServerAsyncInvoker(
        ShowImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showImageServer, hcClient);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return CompletableFuture<UpdateImageServerResponse>
     */
    public CompletableFuture<UpdateImageServerResponse> updateImageServerAsync(UpdateImageServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateImageServer);
    }

    /**
     * 修改镜像实例
     *
     * 修改镜像实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageServerRequest 请求对象
     * @return AsyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse>
     */
    public AsyncInvoker<UpdateImageServerRequest, UpdateImageServerResponse> updateImageServerAsyncInvoker(
        UpdateImageServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateImageServer, hcClient);
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
     * @return CompletableFuture<BatchDeleteAppSubJobsResponse>
     */
    public CompletableFuture<BatchDeleteAppSubJobsResponse> batchDeleteAppSubJobsAsync(
        BatchDeleteAppSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteAppSubJobs);
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
     * @return AsyncInvoker<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse>
     */
    public AsyncInvoker<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse> batchDeleteAppSubJobsAsyncInvoker(
        BatchDeleteAppSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteAppSubJobs, hcClient);
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
     * @return CompletableFuture<BatchDeleteImageSubJobsResponse>
     */
    public CompletableFuture<BatchDeleteImageSubJobsResponse> batchDeleteImageSubJobsAsync(
        BatchDeleteImageSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteImageSubJobs);
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
     * @return AsyncInvoker<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse>
     */
    public AsyncInvoker<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse> batchDeleteImageSubJobsAsyncInvoker(
        BatchDeleteImageSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteImageSubJobs, hcClient);
    }

    /**
     * 子任务数量查询
     *
     * 该接口用于查询异步子任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSubJobsRequest 请求对象
     * @return CompletableFuture<CountSubJobsResponse>
     */
    public CompletableFuture<CountSubJobsResponse> countSubJobsAsync(CountSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.countSubJobs);
    }

    /**
     * 子任务数量查询
     *
     * 该接口用于查询异步子任务数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountSubJobsRequest 请求对象
     * @return AsyncInvoker<CountSubJobsRequest, CountSubJobsResponse>
     */
    public AsyncInvoker<CountSubJobsRequest, CountSubJobsResponse> countSubJobsAsyncInvoker(
        CountSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.countSubJobs, hcClient);
    }

    /**
     * 查询租户的镜像任务列表
     *
     * 该接口用于查询租户的异步任务执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageJobsRequest 请求对象
     * @return CompletableFuture<ListImageJobsResponse>
     */
    public CompletableFuture<ListImageJobsResponse> listImageJobsAsync(ListImageJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listImageJobs);
    }

    /**
     * 查询租户的镜像任务列表
     *
     * 该接口用于查询租户的异步任务执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageJobsRequest 请求对象
     * @return AsyncInvoker<ListImageJobsRequest, ListImageJobsResponse>
     */
    public AsyncInvoker<ListImageJobsRequest, ListImageJobsResponse> listImageJobsAsyncInvoker(
        ListImageJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listImageJobs, hcClient);
    }

    /**
     * 镜像子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSubJobsRequest 请求对象
     * @return CompletableFuture<ListImageSubJobsResponse>
     */
    public CompletableFuture<ListImageSubJobsResponse> listImageSubJobsAsync(ListImageSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listImageSubJobs);
    }

    /**
     * 镜像子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSubJobsRequest 请求对象
     * @return AsyncInvoker<ListImageSubJobsRequest, ListImageSubJobsResponse>
     */
    public AsyncInvoker<ListImageSubJobsRequest, ListImageSubJobsResponse> listImageSubJobsAsyncInvoker(
        ListImageSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listImageSubJobs, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubJobsRequest 请求对象
     * @return CompletableFuture<ListSubJobsResponse>
     */
    public CompletableFuture<ListSubJobsResponse> listSubJobsAsync(ListSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步子任务执行情况,sub_job_ids非空时offset和limit不会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubJobsRequest 请求对象
     * @return AsyncInvoker<ListSubJobsRequest, ListSubJobsResponse>
     */
    public AsyncInvoker<ListSubJobsRequest, ListSubJobsResponse> listSubJobsAsyncInvoker(ListSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSubJobs, hcClient);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return CompletableFuture<ShowImageJobResponse>
     */
    public CompletableFuture<ShowImageJobResponse> showImageJobAsync(ShowImageJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showImageJob);
    }

    /**
     * 查询镜像任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建镜像实例任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageJobRequest 请求对象
     * @return AsyncInvoker<ShowImageJobRequest, ShowImageJobResponse>
     */
    public AsyncInvoker<ShowImageJobRequest, ShowImageJobResponse> showImageJobAsyncInvoker(
        ShowImageJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showImageJob, hcClient);
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
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showJob);
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
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showJob, hcClient);
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
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showJobDetail);
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
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showJobDetail, hcClient);
    }

    /**
     * 查询应用组授权邮件发送记录
     *
     * 查询应用组授权邮件发送记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationMailRecordRequest 请求对象
     * @return CompletableFuture<ListAuthorizationMailRecordResponse>
     */
    public CompletableFuture<ListAuthorizationMailRecordResponse> listAuthorizationMailRecordAsync(
        ListAuthorizationMailRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAuthorizationMailRecord);
    }

    /**
     * 查询应用组授权邮件发送记录
     *
     * 查询应用组授权邮件发送记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizationMailRecordRequest 请求对象
     * @return AsyncInvoker<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse>
     */
    public AsyncInvoker<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse> listAuthorizationMailRecordAsyncInvoker(
        ListAuthorizationMailRecordRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAuthorizationMailRecord, hcClient);
    }

    /**
     * 重发应用组授权邮件（根据授权邮件记录）
     *
     * 重发应用组授权邮件（根据授权邮件记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizationMailRequest 请求对象
     * @return CompletableFuture<SendAuthorizationMailResponse>
     */
    public CompletableFuture<SendAuthorizationMailResponse> sendAuthorizationMailAsync(
        SendAuthorizationMailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.sendAuthorizationMail);
    }

    /**
     * 重发应用组授权邮件（根据授权邮件记录）
     *
     * 重发应用组授权邮件（根据授权邮件记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizationMailRequest 请求对象
     * @return AsyncInvoker<SendAuthorizationMailRequest, SendAuthorizationMailResponse>
     */
    public AsyncInvoker<SendAuthorizationMailRequest, SendAuthorizationMailResponse> sendAuthorizationMailAsyncInvoker(
        SendAuthorizationMailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.sendAuthorizationMail, hcClient);
    }

    /**
     * 重发应用组授权邮件（根据授权记录）
     *
     * 重发应用组授权邮件（根据授权记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizedMailRequest 请求对象
     * @return CompletableFuture<SendAuthorizedMailResponse>
     */
    public CompletableFuture<SendAuthorizedMailResponse> sendAuthorizedMailAsync(SendAuthorizedMailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.sendAuthorizedMail);
    }

    /**
     * 重发应用组授权邮件（根据授权记录）
     *
     * 重发应用组授权邮件（根据授权记录）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendAuthorizedMailRequest 请求对象
     * @return AsyncInvoker<SendAuthorizedMailRequest, SendAuthorizedMailResponse>
     */
    public AsyncInvoker<SendAuthorizedMailRequest, SendAuthorizedMailResponse> sendAuthorizedMailAsyncInvoker(
        SendAuthorizedMailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.sendAuthorizedMail, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePersistentStorageRequest 请求对象
     * @return CompletableFuture<BatchDeletePersistentStorageResponse>
     */
    public CompletableFuture<BatchDeletePersistentStorageResponse> batchDeletePersistentStorageAsync(
        BatchDeletePersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePersistentStorageRequest 请求对象
     * @return AsyncInvoker<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse>
     */
    public AsyncInvoker<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse> batchDeletePersistentStorageAsyncInvoker(
        BatchDeletePersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeletePersistentStorage, hcClient);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateStoragePolicyStatementResponse>
     */
    public CompletableFuture<CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementAsync(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement);
    }

    /**
     * 新增或更新存储目录访问权限自定义策略
     *
     * 新增或更新存储目录访问权限自定义策略(已存在自定义策略时会对已有策略更新)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateStoragePolicyStatementRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse>
     */
    public AsyncInvoker<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatementAsyncInvoker(
        CreateOrUpdateStoragePolicyStatementRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createOrUpdateStoragePolicyStatement, hcClient);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return CompletableFuture<CreatePersistentStorageResponse>
     */
    public CompletableFuture<CreatePersistentStorageResponse> createPersistentStorageAsync(
        CreatePersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPersistentStorage);
    }

    /**
     * 创建WKS存储
     *
     * 创建WKS存储，目前仅支持创建 SFS3.0 容量型文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePersistentStorageRequest 请求对象
     * @return AsyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse>
     */
    public AsyncInvoker<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorageAsyncInvoker(
        CreatePersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPersistentStorage, hcClient);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return CompletableFuture<CreateShareFolderResponse>
     */
    public CompletableFuture<CreateShareFolderResponse> createShareFolderAsync(CreateShareFolderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createShareFolder);
    }

    /**
     * 创建共享存储目录
     *
     * 创建共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareFolderRequest 请求对象
     * @return AsyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse>
     */
    public AsyncInvoker<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolderAsyncInvoker(
        CreateShareFolderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createShareFolder, hcClient);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return CompletableFuture<DeletePersistentStorageResponse>
     */
    public CompletableFuture<DeletePersistentStorageResponse> deletePersistentStorageAsync(
        DeletePersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePersistentStorage);
    }

    /**
     * 删除WKS存储
     *
     * 删除共享存储，只会解除NAS与文件系统之间的关联关系，不会删除文件系统和文件系统中的数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePersistentStorageRequest 请求对象
     * @return AsyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse>
     */
    public AsyncInvoker<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorageAsyncInvoker(
        DeletePersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePersistentStorage, hcClient);
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
     * @return CompletableFuture<DeleteStorageClaimResponse>
     */
    public CompletableFuture<DeleteStorageClaimResponse> deleteStorageClaimAsync(DeleteStorageClaimRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteStorageClaim);
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
     * @return AsyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse>
     */
    public AsyncInvoker<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaimAsyncInvoker(
        DeleteStorageClaimRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteStorageClaim, hcClient);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return CompletableFuture<DeleteUserStorageAttachmentResponse>
     */
    public CompletableFuture<DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentAsync(
        DeleteUserStorageAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteUserStorageAttachment);
    }

    /**
     * 删除个人存储目录
     *
     * 删除个人存储目录，个人目录中的数据也将永久删除且无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserStorageAttachmentRequest 请求对象
     * @return AsyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse>
     */
    public AsyncInvoker<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachmentAsyncInvoker(
        DeleteUserStorageAttachmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteUserStorageAttachment, hcClient);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return CompletableFuture<ListPersistentStorageResponse>
     */
    public CompletableFuture<ListPersistentStorageResponse> listPersistentStorageAsync(
        ListPersistentStorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPersistentStorage);
    }

    /**
     * 查询WKS存储
     *
     * 查询WKS存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersistentStorageRequest 请求对象
     * @return AsyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse>
     */
    public AsyncInvoker<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorageAsyncInvoker(
        ListPersistentStorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPersistentStorage, hcClient);
    }

    /**
     * 查询SFS3.0存储
     *
     * 查询SFS3.0存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfs3StorageRequest 请求对象
     * @return CompletableFuture<ListSfs3StorageResponse>
     */
    public CompletableFuture<ListSfs3StorageResponse> listSfs3StorageAsync(ListSfs3StorageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSfs3Storage);
    }

    /**
     * 查询SFS3.0存储
     *
     * 查询SFS3.0存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSfs3StorageRequest 请求对象
     * @return AsyncInvoker<ListSfs3StorageRequest, ListSfs3StorageResponse>
     */
    public AsyncInvoker<ListSfs3StorageRequest, ListSfs3StorageResponse> listSfs3StorageAsyncInvoker(
        ListSfs3StorageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSfs3Storage, hcClient);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return CompletableFuture<ListShareFolderResponse>
     */
    public CompletableFuture<ListShareFolderResponse> listShareFolderAsync(ListShareFolderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listShareFolder);
    }

    /**
     * 查询共享存储目录
     *
     * 查询共享存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareFolderRequest 请求对象
     * @return AsyncInvoker<ListShareFolderRequest, ListShareFolderResponse>
     */
    public AsyncInvoker<ListShareFolderRequest, ListShareFolderResponse> listShareFolderAsyncInvoker(
        ListShareFolderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listShareFolder, hcClient);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return CompletableFuture<ListStorageAssignmentResponse>
     */
    public CompletableFuture<ListStorageAssignmentResponse> listStorageAssignmentAsync(
        ListStorageAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listStorageAssignment);
    }

    /**
     * 查询个人存储目录
     *
     * 查询个人存储目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageAssignmentRequest 请求对象
     * @return AsyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse>
     */
    public AsyncInvoker<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignmentAsyncInvoker(
        ListStorageAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listStorageAssignment, hcClient);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return CompletableFuture<ListStoragePolicyStatementResponse>
     */
    public CompletableFuture<ListStoragePolicyStatementResponse> listStoragePolicyStatementAsync(
        ListStoragePolicyStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listStoragePolicyStatement);
    }

    /**
     * 查询存储目录访问权限策略
     *
     * 查询存储目录访问权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePolicyStatementRequest 请求对象
     * @return AsyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse>
     */
    public AsyncInvoker<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatementAsyncInvoker(
        ListStoragePolicyStatementRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listStoragePolicyStatement, hcClient);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return CompletableFuture<UpdateShareFolderAssignmentResponse>
     */
    public CompletableFuture<UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentAsync(
        UpdateShareFolderAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateShareFolderAssignment);
    }

    /**
     * 修改共享目录成员
     *
     * 批量添加或者移除共享目录成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareFolderAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse>
     */
    public AsyncInvoker<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignmentAsyncInvoker(
        UpdateShareFolderAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateShareFolderAssignment, hcClient);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return CompletableFuture<UpdateUserFolderAssignmentResponse>
     */
    public CompletableFuture<UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentAsync(
        UpdateUserFolderAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateUserFolderAssignment);
    }

    /**
     * 创建个人存储目录
     *
     * 创建个人存储目录，已存在对应目录时，仅更新策略不会重复创建目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserFolderAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse>
     */
    public AsyncInvoker<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignmentAsyncInvoker(
        UpdateUserFolderAssignmentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateUserFolderAssignment, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return CompletableFuture<CreatePolicyGroupResponse>
     */
    public CompletableFuture<CreatePolicyGroupResponse> createPolicyGroupAsync(CreatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组，通过策略组能灵活的控制客户端访问与接入策略，如：文件、剪切板、会话等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupAsyncInvoker(
        CreatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPolicyGroup, hcClient);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return CompletableFuture<CreatePolicyTemplateResponse>
     */
    public CompletableFuture<CreatePolicyTemplateResponse> createPolicyTemplateAsync(
        CreatePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createPolicyTemplate);
    }

    /**
     * 新增策略模板
     *
     * 新增策略模板。策略模板创建好后，用户在创建策略组的时候，就可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateAsyncInvoker(
        CreatePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createPolicyTemplate, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return CompletableFuture<DeletePolicyGroupResponse>
     */
    public CompletableFuture<DeletePolicyGroupResponse> deletePolicyGroupAsync(DeletePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除指定策略组，包含策略组对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupAsyncInvoker(
        DeletePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return CompletableFuture<DeletePolicyTemplateResponse>
     */
    public CompletableFuture<DeletePolicyTemplateResponse> deletePolicyTemplateAsync(
        DeletePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deletePolicyTemplate);
    }

    /**
     * 删除策略模板
     *
     * 删除指定策略模板，包含策略模板对应的策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse>
     */
    public AsyncInvoker<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplateAsyncInvoker(
        DeletePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deletePolicyTemplate, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyGroupResponse> listPolicyGroupAsync(ListPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表,包括应用对象和详细策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupAsyncInvoker(
        ListPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupDetailInfoRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupDetailInfoResponse>
     */
    public CompletableFuture<ListPolicyGroupDetailInfoResponse> listPolicyGroupDetailInfoAsync(
        ListPolicyGroupDetailInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyGroupDetailInfo);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupDetailInfoRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse>
     */
    public AsyncInvoker<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse> listPolicyGroupDetailInfoAsyncInvoker(
        ListPolicyGroupDetailInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyGroupDetailInfo, hcClient);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyOfPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyOfPolicyGroupResponse> listPolicyOfPolicyGroupAsync(
        ListPolicyOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyOfPolicyGroup);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse> listPolicyOfPolicyGroupAsyncInvoker(
        ListPolicyOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyOfPolicyGroup, hcClient);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return CompletableFuture<ListPolicyTemplateResponse>
     */
    public CompletableFuture<ListPolicyTemplateResponse> listPolicyTemplateAsync(ListPolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listPolicyTemplate);
    }

    /**
     * 查询策略模板列表
     *
     * 查询策略模板概要信息列表，包含策略信息以及应用对象信息。用户在创建策略组的时候，可以根据已有策略模板按需调整配置，快速完成策略组的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyTemplateRequest 请求对象
     * @return AsyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse>
     */
    public AsyncInvoker<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplateAsyncInvoker(
        ListPolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listPolicyTemplate, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListTargetsOfPolicyGroupResponse>
     */
    public CompletableFuture<ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupAsync(
        ListTargetsOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTargetsOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetsOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse>
     */
    public AsyncInvoker<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroupAsyncInvoker(
        ListTargetsOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTargetsOfPolicyGroup, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return CompletableFuture<ShowOriginalPolicyInfoResponse>
     */
    public CompletableFuture<ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoAsync(
        ShowOriginalPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项，初始策略项是所有协议策略配置项的默认配置，用户可以在初始策略项的基础上根据需求修改指定的配置，创建新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginalPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse>
     */
    public AsyncInvoker<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfoAsyncInvoker(
        ShowOriginalPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showOriginalPolicyInfo, hcClient);
    }

    /**
     * 查询策略组详情
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGroupRequest 请求对象
     * @return CompletableFuture<ShowPolicyGroupResponse>
     */
    public CompletableFuture<ShowPolicyGroupResponse> showPolicyGroupAsync(ShowPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showPolicyGroup);
    }

    /**
     * 查询策略组详情
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ShowPolicyGroupRequest, ShowPolicyGroupResponse>
     */
    public AsyncInvoker<ShowPolicyGroupRequest, ShowPolicyGroupResponse> showPolicyGroupAsyncInvoker(
        ShowPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showPolicyGroup, hcClient);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return CompletableFuture<UpdatePolicyGroupResponse>
     */
    public CompletableFuture<UpdatePolicyGroupResponse> updatePolicyGroupAsync(UpdatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updatePolicyGroup);
    }

    /**
     * 修改策略组
     *
     * 修改指定策略组的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse>
     */
    public AsyncInvoker<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroupAsyncInvoker(
        UpdatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return CompletableFuture<UpdatePolicyTemplateResponse>
     */
    public CompletableFuture<UpdatePolicyTemplateResponse> updatePolicyTemplateAsync(
        UpdatePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updatePolicyTemplate);
    }

    /**
     * 修改策略模板
     *
     * 修改指定策略模板的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse>
     */
    public AsyncInvoker<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplateAsyncInvoker(
        UpdatePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updatePolicyTemplate, hcClient);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return CompletableFuture<CheckQuotaResponse>
     */
    public CompletableFuture<CheckQuotaResponse> checkQuotaAsync(CheckQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.checkQuota);
    }

    /**
     * 配额校验
     *
     * 配额校验，购买服务器前可用调用该接口，校验本次创建服务器资源是否足够。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckQuotaRequest 请求对象
     * @return AsyncInvoker<CheckQuotaRequest, CheckQuotaResponse>
     */
    public AsyncInvoker<CheckQuotaRequest, CheckQuotaResponse> checkQuotaAsyncInvoker(CheckQuotaRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.checkQuota, hcClient);
    }

    /**
     * 新增/修改弹性伸缩策略
     *
     * 新增/修改弹性伸缩策略,仅按需的服务器支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateScalingPolicyRequest 请求对象
     * @return CompletableFuture<CreateOrUpdateScalingPolicyResponse>
     */
    public CompletableFuture<CreateOrUpdateScalingPolicyResponse> createOrUpdateScalingPolicyAsync(
        CreateOrUpdateScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createOrUpdateScalingPolicy);
    }

    /**
     * 新增/修改弹性伸缩策略
     *
     * 新增/修改弹性伸缩策略,仅按需的服务器支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateScalingPolicyRequest 请求对象
     * @return AsyncInvoker<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse>
     */
    public AsyncInvoker<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse> createOrUpdateScalingPolicyAsyncInvoker(
        CreateOrUpdateScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createOrUpdateScalingPolicy, hcClient);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return CompletableFuture<DeleteScalingPolicyResponse>
     */
    public CompletableFuture<DeleteScalingPolicyResponse> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteScalingPolicy);
    }

    /**
     * 删除弹性伸缩策略
     *
     * 删除弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScalingPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse>
     */
    public AsyncInvoker<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicyAsyncInvoker(
        DeleteScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteScalingPolicy, hcClient);
    }

    /**
     * 查询服务器组弹性伸缩策略
     *
     * 查询服务器组弹性伸缩策略,如果服务器未配置策略时响应默认策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowScalingPolicyResponse>
     */
    public CompletableFuture<ShowScalingPolicyResponse> showScalingPolicyAsync(ShowScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showScalingPolicy);
    }

    /**
     * 查询服务器组弹性伸缩策略
     *
     * 查询服务器组弹性伸缩策略,如果服务器未配置策略时响应默认策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse>
     */
    public AsyncInvoker<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicyAsyncInvoker(
        ShowScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showScalingPolicy, hcClient);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务，忽略不存在的服务器组并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduleTaskRequest 请求对象
     * @return CompletableFuture<BatchDeleteScheduleTaskResponse>
     */
    public CompletableFuture<BatchDeleteScheduleTaskResponse> batchDeleteScheduleTaskAsync(
        BatchDeleteScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteScheduleTask);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务，忽略不存在的服务器组并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduleTaskRequest 请求对象
     * @return AsyncInvoker<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse>
     */
    public AsyncInvoker<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse> batchDeleteScheduleTaskAsyncInvoker(
        BatchDeleteScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteScheduleTask, hcClient);
    }

    /**
     * 新增定时任务
     *
     * 新增定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return CompletableFuture<CreateScheduleTaskResponse>
     */
    public CompletableFuture<CreateScheduleTaskResponse> createScheduleTaskAsync(CreateScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createScheduleTask);
    }

    /**
     * 新增定时任务
     *
     * 新增定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return AsyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse>
     */
    public AsyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTaskAsyncInvoker(
        CreateScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createScheduleTask, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务，忽略不存在的任务并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduleTaskResponse>
     */
    public CompletableFuture<DeleteScheduleTaskResponse> deleteScheduleTaskAsync(DeleteScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteScheduleTask);
    }

    /**
     * 删除任务
     *
     * 删除任务，忽略不存在的任务并且返回成功响应。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse>
     */
    public AsyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTaskAsyncInvoker(
        DeleteScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteScheduleTask, hcClient);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return CompletableFuture<ListFutureExecutionsResponse>
     */
    public CompletableFuture<ListFutureExecutionsResponse> listFutureExecutionsAsync(
        ListFutureExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listFutureExecutions);
    }

    /**
     * 未来执行的具体时间列表
     *
     * 未来执行的具体时间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFutureExecutionsRequest 请求对象
     * @return AsyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse>
     */
    public AsyncInvoker<ListFutureExecutionsRequest, ListFutureExecutionsResponse> listFutureExecutionsAsyncInvoker(
        ListFutureExecutionsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listFutureExecutions, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTasksRequest 请求对象
     * @return CompletableFuture<ListScheduleTasksResponse>
     */
    public CompletableFuture<ListScheduleTasksResponse> listScheduleTasksAsync(ListScheduleTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listScheduleTasks);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTasksRequest 请求对象
     * @return AsyncInvoker<ListScheduleTasksRequest, ListScheduleTasksResponse>
     */
    public AsyncInvoker<ListScheduleTasksRequest, ListScheduleTasksResponse> listScheduleTasksAsyncInvoker(
        ListScheduleTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listScheduleTasks, hcClient);
    }

    /**
     * 查询定时任务执行子任务列表
     *
     * 查询定时任务执行子任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteDetailRequest 请求对象
     * @return CompletableFuture<ListTaskExecuteDetailResponse>
     */
    public CompletableFuture<ListTaskExecuteDetailResponse> listTaskExecuteDetailAsync(
        ListTaskExecuteDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTaskExecuteDetail);
    }

    /**
     * 查询定时任务执行子任务列表
     *
     * 查询定时任务执行子任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteDetailRequest 请求对象
     * @return AsyncInvoker<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse>
     */
    public AsyncInvoker<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse> listTaskExecuteDetailAsyncInvoker(
        ListTaskExecuteDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTaskExecuteDetail, hcClient);
    }

    /**
     * 查询定时任务执行列表
     *
     * 查询定时任务执行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteHistoryRequest 请求对象
     * @return CompletableFuture<ListTaskExecuteHistoryResponse>
     */
    public CompletableFuture<ListTaskExecuteHistoryResponse> listTaskExecuteHistoryAsync(
        ListTaskExecuteHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTaskExecuteHistory);
    }

    /**
     * 查询定时任务执行列表
     *
     * 查询定时任务执行列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskExecuteHistoryRequest 请求对象
     * @return AsyncInvoker<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse>
     */
    public AsyncInvoker<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse> listTaskExecuteHistoryAsyncInvoker(
        ListTaskExecuteHistoryRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTaskExecuteHistory, hcClient);
    }

    /**
     * 查询指定定时任务详情
     *
     * 查询指定定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleTaskRequest 请求对象
     * @return CompletableFuture<ShowScheduleTaskResponse>
     */
    public CompletableFuture<ShowScheduleTaskResponse> showScheduleTaskAsync(ShowScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showScheduleTask);
    }

    /**
     * 查询指定定时任务详情
     *
     * 查询指定定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduleTaskRequest 请求对象
     * @return AsyncInvoker<ShowScheduleTaskRequest, ShowScheduleTaskResponse>
     */
    public AsyncInvoker<ShowScheduleTaskRequest, ShowScheduleTaskResponse> showScheduleTaskAsyncInvoker(
        ShowScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showScheduleTask, hcClient);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleTaskRequest 请求对象
     * @return CompletableFuture<UpdateScheduleTaskResponse>
     */
    public CompletableFuture<UpdateScheduleTaskResponse> updateScheduleTaskAsync(UpdateScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateScheduleTask);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduleTaskRequest 请求对象
     * @return AsyncInvoker<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse>
     */
    public AsyncInvoker<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse> updateScheduleTaskAsyncInvoker(
        UpdateScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateScheduleTask, hcClient);
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
     * @return CompletableFuture<BatchChangeServerImageResponse>
     */
    public CompletableFuture<BatchChangeServerImageResponse> batchChangeServerImageAsync(
        BatchChangeServerImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchChangeServerImage);
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
     * @return AsyncInvoker<BatchChangeServerImageRequest, BatchChangeServerImageResponse>
     */
    public AsyncInvoker<BatchChangeServerImageRequest, BatchChangeServerImageResponse> batchChangeServerImageAsyncInvoker(
        BatchChangeServerImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchChangeServerImage, hcClient);
    }

    /**
     * 标记服务器维护状态
     *
     * 标记服务器维护状态，处于维护状态中的服务器不再分配流量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerMaintainModeRequest 请求对象
     * @return CompletableFuture<BatchChangeServerMaintainModeResponse>
     */
    public CompletableFuture<BatchChangeServerMaintainModeResponse> batchChangeServerMaintainModeAsync(
        BatchChangeServerMaintainModeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchChangeServerMaintainMode);
    }

    /**
     * 标记服务器维护状态
     *
     * 标记服务器维护状态，处于维护状态中的服务器不再分配流量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeServerMaintainModeRequest 请求对象
     * @return AsyncInvoker<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse>
     */
    public AsyncInvoker<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse> batchChangeServerMaintainModeAsyncInvoker(
        BatchChangeServerMaintainModeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchChangeServerMaintainMode, hcClient);
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
     * @return CompletableFuture<BatchDeleteServerResponse>
     */
    public CompletableFuture<BatchDeleteServerResponse> batchDeleteServerAsync(BatchDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServer);
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
     * @return AsyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse>
     */
    public AsyncInvoker<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServerAsyncInvoker(
        BatchDeleteServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteServer, hcClient);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return CompletableFuture<BatchMigrateHostsServerResponse>
     */
    public CompletableFuture<BatchMigrateHostsServerResponse> batchMigrateHostsServerAsync(
        BatchMigrateHostsServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchMigrateHostsServer);
    }

    /**
     * 迁移云办公主机下面的服务器到目标云办公主机
     *
     * 迁移云办公主机下面的服务器到目标云办公主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchMigrateHostsServerRequest 请求对象
     * @return AsyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse>
     */
    public AsyncInvoker<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServerAsyncInvoker(
        BatchMigrateHostsServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchMigrateHostsServer, hcClient);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return CompletableFuture<BatchRebootServerResponse>
     */
    public CompletableFuture<BatchRebootServerResponse> batchRebootServerAsync(BatchRebootServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchRebootServer);
    }

    /**
     * 重启服务器
     *
     * 重启服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServerRequest 请求对象
     * @return AsyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse>
     */
    public AsyncInvoker<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServerAsyncInvoker(
        BatchRebootServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchRebootServer, hcClient);
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
     * @return CompletableFuture<BatchReinstallServerResponse>
     */
    public CompletableFuture<BatchReinstallServerResponse> batchReinstallServerAsync(
        BatchReinstallServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchReinstallServer);
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
     * @return AsyncInvoker<BatchReinstallServerRequest, BatchReinstallServerResponse>
     */
    public AsyncInvoker<BatchReinstallServerRequest, BatchReinstallServerResponse> batchReinstallServerAsyncInvoker(
        BatchReinstallServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchReinstallServer, hcClient);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return CompletableFuture<BatchRejoinDomainResponse>
     */
    public CompletableFuture<BatchRejoinDomainResponse> batchRejoinDomainAsync(BatchRejoinDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchRejoinDomain);
    }

    /**
     * 批量服务器重新加域
     *
     * 批量服务器重新加入AD域，一般用于解决服务器脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRejoinDomainRequest 请求对象
     * @return AsyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse>
     */
    public AsyncInvoker<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomainAsyncInvoker(
        BatchRejoinDomainRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchRejoinDomain, hcClient);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return CompletableFuture<BatchStartServerResponse>
     */
    public CompletableFuture<BatchStartServerResponse> batchStartServerAsync(BatchStartServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchStartServer);
    }

    /**
     * 启动服务器
     *
     * 启动服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServerRequest 请求对象
     * @return AsyncInvoker<BatchStartServerRequest, BatchStartServerResponse>
     */
    public AsyncInvoker<BatchStartServerRequest, BatchStartServerResponse> batchStartServerAsyncInvoker(
        BatchStartServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchStartServer, hcClient);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return CompletableFuture<BatchStopServerResponse>
     */
    public CompletableFuture<BatchStopServerResponse> batchStopServerAsync(BatchStopServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchStopServer);
    }

    /**
     * 关闭服务器
     *
     * 关闭服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServerRequest 请求对象
     * @return AsyncInvoker<BatchStopServerRequest, BatchStopServerResponse>
     */
    public AsyncInvoker<BatchStopServerRequest, BatchStopServerResponse> batchStopServerAsyncInvoker(
        BatchStopServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchStopServer, hcClient);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return CompletableFuture<BatchUpdateTsviResponse>
     */
    public CompletableFuture<BatchUpdateTsviResponse> batchUpdateTsviAsync(BatchUpdateTsviRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchUpdateTsvi);
    }

    /**
     * 批量更新服务器虚拟会话IP配置
     *
     * 批量更新服务器虚拟会话IP配置，按需重启机器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTsviRequest 请求对象
     * @return AsyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse>
     */
    public AsyncInvoker<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsviAsyncInvoker(
        BatchUpdateTsviRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchUpdateTsvi, hcClient);
    }

    /**
     * 批量升级服务器HDA版本
     *
     * 批量升级服务器HDA版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeHdaVersionRequest 请求对象
     * @return CompletableFuture<BatchUpgradeHdaVersionResponse>
     */
    public CompletableFuture<BatchUpgradeHdaVersionResponse> batchUpgradeHdaVersionAsync(
        BatchUpgradeHdaVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchUpgradeHdaVersion);
    }

    /**
     * 批量升级服务器HDA版本
     *
     * 批量升级服务器HDA版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeHdaVersionRequest 请求对象
     * @return AsyncInvoker<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse>
     */
    public AsyncInvoker<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse> batchUpgradeHdaVersionAsyncInvoker(
        BatchUpgradeHdaVersionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchUpgradeHdaVersion, hcClient);
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
     * @return CompletableFuture<ChangeServerImageResponse>
     */
    public CompletableFuture<ChangeServerImageResponse> changeServerImageAsync(ChangeServerImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.changeServerImage);
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
     * @return AsyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse>
     */
    public AsyncInvoker<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImageAsyncInvoker(
        ChangeServerImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.changeServerImage, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return CompletableFuture<CreateAppServersResponse>
     */
    public CompletableFuture<CreateAppServersResponse> createAppServersAsync(CreateAppServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createAppServers);
    }

    /**
     * 创建云服务器
     *
     * 创建云服务器接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppServersRequest 请求对象
     * @return AsyncInvoker<CreateAppServersRequest, CreateAppServersResponse>
     */
    public AsyncInvoker<CreateAppServersRequest, CreateAppServersResponse> createAppServersAsyncInvoker(
        CreateAppServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createAppServers, hcClient);
    }

    /**
     * 删除服务器
     *
     * 删除服务器，忽略不存在的服务器并且返回成功响应。订单退订成功后调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerRequest 请求对象
     * @return CompletableFuture<DeleteServerResponse>
     */
    public CompletableFuture<DeleteServerResponse> deleteServerAsync(DeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteServer);
    }

    /**
     * 删除服务器
     *
     * 删除服务器，忽略不存在的服务器并且返回成功响应。订单退订成功后调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerRequest 请求对象
     * @return AsyncInvoker<DeleteServerRequest, DeleteServerResponse>
     */
    public AsyncInvoker<DeleteServerRequest, DeleteServerResponse> deleteServerAsyncInvoker(
        DeleteServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteServer, hcClient);
    }

    /**
     * 查询租户的所有HDA最新版本
     *
     * 查询租户的所有HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAgentLatestVersionRequest 请求对象
     * @return CompletableFuture<ListAccessAgentLatestVersionResponse>
     */
    public CompletableFuture<ListAccessAgentLatestVersionResponse> listAccessAgentLatestVersionAsync(
        ListAccessAgentLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAccessAgentLatestVersion);
    }

    /**
     * 查询租户的所有HDA最新版本
     *
     * 查询租户的所有HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAgentLatestVersionRequest 请求对象
     * @return AsyncInvoker<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse>
     */
    public AsyncInvoker<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse> listAccessAgentLatestVersionAsyncInvoker(
        ListAccessAgentLatestVersionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAccessAgentLatestVersion, hcClient);
    }

    /**
     * 查询服务器的HDA相关信息
     *
     * 查询服务器的HDA相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaDetailsRequest 请求对象
     * @return CompletableFuture<ListServerHdaDetailsResponse>
     */
    public CompletableFuture<ListServerHdaDetailsResponse> listServerHdaDetailsAsync(
        ListServerHdaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerHdaDetails);
    }

    /**
     * 查询服务器的HDA相关信息
     *
     * 查询服务器的HDA相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaDetailsRequest 请求对象
     * @return AsyncInvoker<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse>
     */
    public AsyncInvoker<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse> listServerHdaDetailsAsyncInvoker(
        ListServerHdaDetailsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerHdaDetails, hcClient);
    }

    /**
     * 查询服务器的HDA升级跟踪记录
     *
     * 查询服务器的HDA升级跟踪记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaUpgradeRecordsRequest 请求对象
     * @return CompletableFuture<ListServerHdaUpgradeRecordsResponse>
     */
    public CompletableFuture<ListServerHdaUpgradeRecordsResponse> listServerHdaUpgradeRecordsAsync(
        ListServerHdaUpgradeRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerHdaUpgradeRecords);
    }

    /**
     * 查询服务器的HDA升级跟踪记录
     *
     * 查询服务器的HDA升级跟踪记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerHdaUpgradeRecordsRequest 请求对象
     * @return AsyncInvoker<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse>
     */
    public AsyncInvoker<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse> listServerHdaUpgradeRecordsAsyncInvoker(
        ListServerHdaUpgradeRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerHdaUpgradeRecords, hcClient);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return CompletableFuture<ListServerMetricDataResponse>
     */
    public CompletableFuture<ListServerMetricDataResponse> listServerMetricDataAsync(
        ListServerMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerMetricData);
    }

    /**
     * 查询指定时间范围指定指标的指定粒度的监控数据
     *
     * 查询指定时间范围指定指标的指定粒度的监控数据，可以通过参数指定需要查询的数据维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerMetricDataRequest 请求对象
     * @return AsyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse>
     */
    public AsyncInvoker<ListServerMetricDataRequest, ListServerMetricDataResponse> listServerMetricDataAsyncInvoker(
        ListServerMetricDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerMetricData, hcClient);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return CompletableFuture<ListServersResponse>
     */
    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServers);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return AsyncInvoker<ListServersRequest, ListServersResponse>
     */
    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServers, hcClient);
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
     * @return CompletableFuture<ReinstallServerResponse>
     */
    public CompletableFuture<ReinstallServerResponse> reinstallServerAsync(ReinstallServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.reinstallServer);
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
     * @return AsyncInvoker<ReinstallServerRequest, ReinstallServerResponse>
     */
    public AsyncInvoker<ReinstallServerRequest, ReinstallServerResponse> reinstallServerAsyncInvoker(
        ReinstallServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.reinstallServer, hcClient);
    }

    /**
     * 查询租户的HDA最新版本
     *
     * 查询租户的HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessAgentLatestVersionRequest 请求对象
     * @return CompletableFuture<ShowAccessAgentLatestVersionResponse>
     */
    public CompletableFuture<ShowAccessAgentLatestVersionResponse> showAccessAgentLatestVersionAsync(
        ShowAccessAgentLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showAccessAgentLatestVersion);
    }

    /**
     * 查询租户的HDA最新版本
     *
     * 查询租户的HDA最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessAgentLatestVersionRequest 请求对象
     * @return AsyncInvoker<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse>
     */
    public AsyncInvoker<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse> showAccessAgentLatestVersionAsyncInvoker(
        ShowAccessAgentLatestVersionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showAccessAgentLatestVersion, hcClient);
    }

    /**
     * 查询指定服务器
     *
     * 查询指定的服务器当前这个接口的查询数据和list查询的一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServer);
    }

    /**
     * 查询指定服务器
     *
     * 查询指定的服务器当前这个接口的查询数据和list查询的一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServer, hcClient);
    }

    /**
     * 查询云应用服务器监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerMetricDataRequest 请求对象
     * @return CompletableFuture<ShowServerMetricDataResponse>
     */
    public CompletableFuture<ShowServerMetricDataResponse> showServerMetricDataAsync(
        ShowServerMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerMetricData);
    }

    /**
     * 查询云应用服务器监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowServerMetricDataRequest, ShowServerMetricDataResponse>
     */
    public AsyncInvoker<ShowServerMetricDataRequest, ShowServerMetricDataResponse> showServerMetricDataAsyncInvoker(
        ShowServerMetricDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerMetricData, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return CompletableFuture<ShowServerVncResponse>
     */
    public CompletableFuture<ShowServerVncResponse> showServerVncAsync(ShowServerVncRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerVnc);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerVncRequest 请求对象
     * @return AsyncInvoker<ShowServerVncRequest, ShowServerVncResponse>
     */
    public AsyncInvoker<ShowServerVncRequest, ShowServerVncResponse> showServerVncAsyncInvoker(
        ShowServerVncRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerVnc, hcClient);
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
     * @return CompletableFuture<UpdateServerResponse>
     */
    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateServer);
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
     * @return AsyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(
        UpdateServerRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateServer, hcClient);
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
     * @return CompletableFuture<CreateServerGroupResponse>
     */
    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createServerGroup);
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
     * @return AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(
        CreateServerGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createServerGroup, hcClient);
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
     * @return CompletableFuture<DeleteServerGroupsResponse>
     */
    public CompletableFuture<DeleteServerGroupsResponse> deleteServerGroupsAsync(DeleteServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroups);
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
     * @return AsyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse>
     */
    public AsyncInvoker<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroupsAsyncInvoker(
        DeleteServerGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteServerGroups, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return CompletableFuture<ListServerGroupsResponse>
     */
    public CompletableFuture<ListServerGroupsResponse> listServerGroupsAsync(ListServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsAsyncInvoker(
        ListServerGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerGroups, hcClient);
    }

    /**
     * 查询租户服务器组基础信息列表
     *
     * 查询租户服务器组基础信息列表(用于创建应用组时绑定服务器组)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantServerGroupsRequest 请求对象
     * @return CompletableFuture<ListTenantServerGroupsResponse>
     */
    public CompletableFuture<ListTenantServerGroupsResponse> listTenantServerGroupsAsync(
        ListTenantServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listTenantServerGroups);
    }

    /**
     * 查询租户服务器组基础信息列表
     *
     * 查询租户服务器组基础信息列表(用于创建应用组时绑定服务器组)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantServerGroupsRequest 请求对象
     * @return AsyncInvoker<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse>
     */
    public AsyncInvoker<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse> listTenantServerGroupsAsyncInvoker(
        ListTenantServerGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listTenantServerGroups, hcClient);
    }

    /**
     * 查询指定服务器组
     *
     * 查询指定的服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return CompletableFuture<ShowServerGroupResponse>
     */
    public CompletableFuture<ShowServerGroupResponse> showServerGroupAsync(ShowServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerGroup);
    }

    /**
     * 查询指定服务器组
     *
     * 查询指定的服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>
     */
    public AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupAsyncInvoker(
        ShowServerGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerGroup, hcClient);
    }

    /**
     * 指定租户服务器组限制查询
     *
     * 指定租户服务器组限制查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRestrictRequest 请求对象
     * @return CompletableFuture<ShowServerGroupRestrictResponse>
     */
    public CompletableFuture<ShowServerGroupRestrictResponse> showServerGroupRestrictAsync(
        ShowServerGroupRestrictRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerGroupRestrict);
    }

    /**
     * 指定租户服务器组限制查询
     *
     * 指定租户服务器组限制查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRestrictRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse>
     */
    public AsyncInvoker<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse> showServerGroupRestrictAsyncInvoker(
        ShowServerGroupRestrictRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerGroupRestrict, hcClient);
    }

    /**
     * 查询指定服务器组内服务器状态
     *
     * 查询指定的服务器组内服务器状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupStateRequest 请求对象
     * @return CompletableFuture<ShowServerGroupStateResponse>
     */
    public CompletableFuture<ShowServerGroupStateResponse> showServerGroupStateAsync(
        ShowServerGroupStateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerGroupState);
    }

    /**
     * 查询指定服务器组内服务器状态
     *
     * 查询指定的服务器组内服务器状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupStateRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupStateRequest, ShowServerGroupStateResponse>
     */
    public AsyncInvoker<ShowServerGroupStateRequest, ShowServerGroupStateResponse> showServerGroupStateAsyncInvoker(
        ShowServerGroupStateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerGroupState, hcClient);
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
     * @return CompletableFuture<UpdateServerGroupResponse>
     */
    public CompletableFuture<UpdateServerGroupResponse> updateServerGroupAsync(UpdateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.updateServerGroup);
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
     * @return AsyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse>
     */
    public AsyncInvoker<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroupAsyncInvoker(
        UpdateServerGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.updateServerGroup, hcClient);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return CompletableFuture<ListAppConnectionResponse>
     */
    public CompletableFuture<ListAppConnectionResponse> listAppConnectionAsync(ListAppConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listAppConnection);
    }

    /**
     * 查询应用使用记录
     *
     * 查询应用使用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppConnectionRequest 请求对象
     * @return AsyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse>
     */
    public AsyncInvoker<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnectionAsyncInvoker(
        ListAppConnectionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listAppConnection, hcClient);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return CompletableFuture<ListSessionByUserNameResponse>
     */
    public CompletableFuture<ListSessionByUserNameResponse> listSessionByUserNameAsync(
        ListSessionByUserNameRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessionByUserName);
    }

    /**
     * 根据用户名查询当前会话
     *
     * 根据用户名查询当前会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionByUserNameRequest 请求对象
     * @return AsyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse>
     */
    public AsyncInvoker<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserNameAsyncInvoker(
        ListSessionByUserNameRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessionByUserName, hcClient);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return CompletableFuture<ListSessionsResponse>
     */
    public CompletableFuture<ListSessionsResponse> listSessionsAsync(ListSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listSessions);
    }

    /**
     * 查询用户会话列表
     *
     * 查询用户会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionsRequest 请求对象
     * @return AsyncInvoker<ListSessionsRequest, ListSessionsResponse>
     */
    public AsyncInvoker<ListSessionsRequest, ListSessionsResponse> listSessionsAsyncInvoker(
        ListSessionsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listSessions, hcClient);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return CompletableFuture<ListUserConnectionResponse>
     */
    public CompletableFuture<ListUserConnectionResponse> listUserConnectionAsync(ListUserConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listUserConnection);
    }

    /**
     * 查询用户登录记录
     *
     * 查询用户登录记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserConnectionRequest 请求对象
     * @return AsyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse>
     */
    public AsyncInvoker<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnectionAsyncInvoker(
        ListUserConnectionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listUserConnection, hcClient);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return CompletableFuture<LogoffUserSessionResponse>
     */
    public CompletableFuture<LogoffUserSessionResponse> logoffUserSessionAsync(LogoffUserSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.logoffUserSession);
    }

    /**
     * 用户会话注销
     *
     * 用户会话注销。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffUserSessionRequest 请求对象
     * @return AsyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse>
     */
    public AsyncInvoker<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSessionAsyncInvoker(
        LogoffUserSessionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.logoffUserSession, hcClient);
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
     * @return CompletableFuture<BatchCreateServerGroupTagsResponse>
     */
    public CompletableFuture<BatchCreateServerGroupTagsResponse> batchCreateServerGroupTagsAsync(
        BatchCreateServerGroupTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchCreateServerGroupTags);
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
     * @return AsyncInvoker<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse>
     */
    public AsyncInvoker<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse> batchCreateServerGroupTagsAsyncInvoker(
        BatchCreateServerGroupTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchCreateServerGroupTags, hcClient);
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
     * @return CompletableFuture<BatchDeleteServerGroupTagsResponse>
     */
    public CompletableFuture<BatchDeleteServerGroupTagsResponse> batchDeleteServerGroupTagsAsync(
        BatchDeleteServerGroupTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.batchDeleteServerGroupTags);
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
     * @return AsyncInvoker<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse>
     */
    public AsyncInvoker<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse> batchDeleteServerGroupTagsAsyncInvoker(
        BatchDeleteServerGroupTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.batchDeleteServerGroupTags, hcClient);
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
     * @return CompletableFuture<CreateServerGroupTagsResponse>
     */
    public CompletableFuture<CreateServerGroupTagsResponse> createServerGroupTagsAsync(
        CreateServerGroupTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.createServerGroupTags);
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
     * @return AsyncInvoker<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse>
     */
    public AsyncInvoker<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse> createServerGroupTagsAsyncInvoker(
        CreateServerGroupTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.createServerGroupTags, hcClient);
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
     * @return CompletableFuture<DeleteServerGroupTagsResponse>
     */
    public CompletableFuture<DeleteServerGroupTagsResponse> deleteServerGroupTagsAsync(
        DeleteServerGroupTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.deleteServerGroupTags);
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
     * @return AsyncInvoker<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse>
     */
    public AsyncInvoker<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse> deleteServerGroupTagsAsyncInvoker(
        DeleteServerGroupTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.deleteServerGroupTags, hcClient);
    }

    /**
     * 查询租户在所有服务器组上的标签
     *
     * 查询租户在所有服务器组上的资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupTagRequest 请求对象
     * @return CompletableFuture<ListServerGroupTagResponse>
     */
    public CompletableFuture<ListServerGroupTagResponse> listServerGroupTagAsync(ListServerGroupTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listServerGroupTag);
    }

    /**
     * 查询租户在所有服务器组上的标签
     *
     * 查询租户在所有服务器组上的资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupTagRequest 请求对象
     * @return AsyncInvoker<ListServerGroupTagRequest, ListServerGroupTagResponse>
     */
    public AsyncInvoker<ListServerGroupTagRequest, ListServerGroupTagResponse> listServerGroupTagAsyncInvoker(
        ListServerGroupTagRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listServerGroupTag, hcClient);
    }

    /**
     * 查询服务器组的标签
     *
     * 查询指定服务器组的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupTagRequest 请求对象
     * @return CompletableFuture<ShowServerGroupTagResponse>
     */
    public CompletableFuture<ShowServerGroupTagResponse> showServerGroupTagAsync(ShowServerGroupTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.showServerGroupTag);
    }

    /**
     * 查询服务器组的标签
     *
     * 查询指定服务器组的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupTagRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupTagRequest, ShowServerGroupTagResponse>
     */
    public AsyncInvoker<ShowServerGroupTagRequest, ShowServerGroupTagResponse> showServerGroupTagAsyncInvoker(
        ShowServerGroupTagRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.showServerGroupTag, hcClient);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return CompletableFuture<ListVolumeTypeResponse>
     */
    public CompletableFuture<ListVolumeTypeResponse> listVolumeTypeAsync(ListVolumeTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceAppMeta.listVolumeType);
    }

    /**
     * 查询可用磁盘类型
     *
     * 该接口用于查询可用磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeTypeRequest 请求对象
     * @return AsyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse>
     */
    public AsyncInvoker<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeTypeAsyncInvoker(
        ListVolumeTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceAppMeta.listVolumeType, hcClient);
    }

}

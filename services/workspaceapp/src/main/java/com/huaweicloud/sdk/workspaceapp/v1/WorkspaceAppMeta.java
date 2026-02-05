package com.huaweicloud.sdk.workspaceapp.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AddAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AppGroupAuthorizeReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AssignShareFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AssignUserFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachImageServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.AttachServerAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.AuthorizeObsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeMaintainServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerImageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerMaintainModeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchChangeServerMaintainModeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchCreateServerGroupTagsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchCreateServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchCreateServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupAuthorizationResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteAppSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteCloudStorageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteCloudStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteCloudStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteImageSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeletePersistentStorageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteScheduleTaskReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerGroupTagsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteSubJobsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDisableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchDisableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchEnableAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchEnableAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateHostsServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchMigrateServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRebootServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchReinstallServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchRejoinDomainResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStartServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchStopServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpdateTsviResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpgradeHdaVersionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpgradeHdaVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BatchUpgradeHdaVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BindAppWarehouseBucketRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.BindAppWarehouseBucketResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.BucketNameReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeClusterReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeClusterRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeClusterResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ChangeServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckPublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckPublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckPublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CheckQuotaResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountImageSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountImageSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CountSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateAppServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateBucketOrAclRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateBucketOrAclResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateCloudStorageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateCloudStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateCloudStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateHotspotSessionConfigReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateHotspotSessionConfigRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateHotspotSessionConfigResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateScalingPolicyReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateScalingPolicyRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateScalingPolicyResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrUpdateStoragePolicyStatementResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateOrderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateResourceTagReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateScheduleTaskReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupTagsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerGroupTagsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateServerImageReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateShareFolderResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateUserFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.CreateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteCloudStorageAttachmentReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteCloudStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteCloudStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteCloudStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteCloudStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePersistentStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeletePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteResourceTagReq;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteStorageClaimResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteUserStorageAttachmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DeleteWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.DisassociateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.DisassociateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportAppConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportAppConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportSessionsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportSessionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportSessionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ExportUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.InitializeTenantReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.InitializeTenantRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.InitializeTenantResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAccessAgentLatestVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAccessAgentLatestVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListAppConnectionReq;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCloudStorageAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCloudStorageAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCloudStorageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCloudStorageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListConfigInfoReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCorpConfigInfoRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListCorpConfigInfoResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFoldersAndFilesRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFoldersAndFilesResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFutureExecutionsReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFutureExecutionsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListFutureExecutionsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListHotspotSessionConfigRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListHotspotSessionConfigResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageServersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageSubJobsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListImageSubJobsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListLatestAttachedServerAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListNonMigrationUsersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListNonMigrationUsersResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProjectConfigsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListProjectConfigsResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListUserConnectionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListVolumeTypeResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ListWarehouseAppsResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.LogoffUserSessionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.PublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.QuerySessionTypesReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.RecreateServerImageResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ReinstallServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ResendAuthorizationMailReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ResendAuthorizedMailReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ResetUserProfileReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ResetUserProfileRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ResetUserProfileResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizationMailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizationMailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizedMailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.SendAuthorizedMailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ServerHaltReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAccessAgentLatestVersionRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAccessAgentLatestVersionResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppGroupDetailRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppGroupDetailResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppWarehouseBucketRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowAppWarehouseBucketResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowHdaUpgradeFlagRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowHdaUpgradeFlagResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowProjectConfigRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ShowProjectConfigResponse;
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
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFilePreReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFilePreRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFilePreResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFileReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFileRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.TransferFileResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UnpublishAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateCloudUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateCloudUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateHotspotSessionConfigReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateHotspotSessionConfigRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateHotspotSessionConfigResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateImageServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateNonMigrationUsersReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateNonMigrationUsersRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateNonMigrationUsersResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePreBootPolicyReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePreBootPolicyRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdatePreBootPolicyResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateScheduleTaskReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateScheduleTaskRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateScheduleTaskResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateServerResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateShareFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateTsviReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderAssignmentResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateUserFolderReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppReq;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UpdateWarehouseAppResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconRequestBody;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconRequestBody;
import com.huaweicloud.sdk.workspaceapp.v1.model.UploadWarehouseAppIconResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ValidateServerGroupRequest;
import com.huaweicloud.sdk.workspaceapp.v1.model.ValidateServerGroupResponse;
import com.huaweicloud.sdk.workspaceapp.v1.model.ValidateSeverGroupReq;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class WorkspaceAppMeta {

    public static final HttpRequestDef<AuthorizeObsRequest, AuthorizeObsResponse> authorizeObs = genForAuthorizeObs();

    private static HttpRequestDef<AuthorizeObsRequest, AuthorizeObsResponse> genForAuthorizeObs() {
        // basic
        HttpRequestDef.Builder<AuthorizeObsRequest, AuthorizeObsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AuthorizeObsRequest.class, AuthorizeObsResponse.class)
                .withName("AuthorizeObs")
                .withUri("/v1/{project_id}/app-warehouse/action/authorize")
                .withContentType("application/json");

        // requests
        builder.<AuthorizeObsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeObsReq.class),
            f -> f.withMarshaller(AuthorizeObsRequest::getBody, AuthorizeObsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> batchDeleteWarehouseApp =
        genForBatchDeleteWarehouseApp();

    private static HttpRequestDef<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> genForBatchDeleteWarehouseApp() {
        // basic
        HttpRequestDef.Builder<BatchDeleteWarehouseAppRequest, BatchDeleteWarehouseAppResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteWarehouseAppRequest.class, BatchDeleteWarehouseAppResponse.class)
            .withName("BatchDeleteWarehouseApp")
            .withUri("/v1/{project_id}/app-warehouse/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteWarehouseAppReq.class),
            f -> f.withMarshaller(BatchDeleteWarehouseAppRequest::getBody, BatchDeleteWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BindAppWarehouseBucketRequest, BindAppWarehouseBucketResponse> bindAppWarehouseBucket =
        genForBindAppWarehouseBucket();

    private static HttpRequestDef<BindAppWarehouseBucketRequest, BindAppWarehouseBucketResponse> genForBindAppWarehouseBucket() {
        // basic
        HttpRequestDef.Builder<BindAppWarehouseBucketRequest, BindAppWarehouseBucketResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BindAppWarehouseBucketRequest.class, BindAppWarehouseBucketResponse.class)
            .withName("BindAppWarehouseBucket")
            .withUri("/v1/{project_id}/app-warehouse/bucket")
            .withContentType("application/json");

        // requests
        builder.<BucketNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BucketNameReq.class),
            f -> f.withMarshaller(BindAppWarehouseBucketRequest::getBody, BindAppWarehouseBucketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBucketOrAclRequest, CreateBucketOrAclResponse> createBucketOrAcl =
        genForCreateBucketOrAcl();

    private static HttpRequestDef<CreateBucketOrAclRequest, CreateBucketOrAclResponse> genForCreateBucketOrAcl() {
        // basic
        HttpRequestDef.Builder<CreateBucketOrAclRequest, CreateBucketOrAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBucketOrAclRequest.class, CreateBucketOrAclResponse.class)
                .withName("CreateBucketOrAcl")
                .withUri("/v1/{project_id}/app-warehouse/bucket-and-acl/create")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWarehouseAppRequest, CreateWarehouseAppResponse> createWarehouseApp =
        genForCreateWarehouseApp();

    private static HttpRequestDef<CreateWarehouseAppRequest, CreateWarehouseAppResponse> genForCreateWarehouseApp() {
        // basic
        HttpRequestDef.Builder<CreateWarehouseAppRequest, CreateWarehouseAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWarehouseAppRequest.class, CreateWarehouseAppResponse.class)
                .withName("CreateWarehouseApp")
                .withUri("/v1/{project_id}/app-warehouse/apps")
                .withContentType("application/json");

        // requests
        builder.<CreateWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWarehouseAppReq.class),
            f -> f.withMarshaller(CreateWarehouseAppRequest::getBody, CreateWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse> deleteWarehouseApp =
        genForDeleteWarehouseApp();

    private static HttpRequestDef<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse> genForDeleteWarehouseApp() {
        // basic
        HttpRequestDef.Builder<DeleteWarehouseAppRequest, DeleteWarehouseAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWarehouseAppRequest.class, DeleteWarehouseAppResponse.class)
                .withName("DeleteWarehouseApp")
                .withUri("/v1/{project_id}/app-warehouse/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWarehouseAppRequest::getId, DeleteWarehouseAppRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWarehouseAppsRequest, ListWarehouseAppsResponse> listWarehouseApps =
        genForListWarehouseApps();

    private static HttpRequestDef<ListWarehouseAppsRequest, ListWarehouseAppsResponse> genForListWarehouseApps() {
        // basic
        HttpRequestDef.Builder<ListWarehouseAppsRequest, ListWarehouseAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWarehouseAppsRequest.class, ListWarehouseAppsResponse.class)
                .withName("ListWarehouseApps")
                .withUri("/v1/{project_id}/app-warehouse/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getLimit, ListWarehouseAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getOffset, ListWarehouseAppsRequest::setOffset));
        builder.<String>withRequestField("verify_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getVerifyStatus,
                ListWarehouseAppsRequest::setVerifyStatus));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppId, ListWarehouseAppsRequest::setAppId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppName, ListWarehouseAppsRequest::setAppName));
        builder.<String>withRequestField("app_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWarehouseAppsRequest::getAppCategory, ListWarehouseAppsRequest::setAppCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppWarehouseBucketRequest, ShowAppWarehouseBucketResponse> showAppWarehouseBucket =
        genForShowAppWarehouseBucket();

    private static HttpRequestDef<ShowAppWarehouseBucketRequest, ShowAppWarehouseBucketResponse> genForShowAppWarehouseBucket() {
        // basic
        HttpRequestDef.Builder<ShowAppWarehouseBucketRequest, ShowAppWarehouseBucketResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppWarehouseBucketRequest.class, ShowAppWarehouseBucketResponse.class)
            .withName("ShowAppWarehouseBucket")
            .withUri("/v1/{project_id}/app-warehouse/bucket")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> updateWarehouseApp =
        genForUpdateWarehouseApp();

    private static HttpRequestDef<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> genForUpdateWarehouseApp() {
        // basic
        HttpRequestDef.Builder<UpdateWarehouseAppRequest, UpdateWarehouseAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateWarehouseAppRequest.class, UpdateWarehouseAppResponse.class)
                .withName("UpdateWarehouseApp")
                .withUri("/v1/{project_id}/app-warehouse/apps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWarehouseAppRequest::getId, UpdateWarehouseAppRequest::setId));
        builder.<UpdateWarehouseAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWarehouseAppReq.class),
            f -> f.withMarshaller(UpdateWarehouseAppRequest::getBody, UpdateWarehouseAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> uploadWarehouseAppIcon =
        genForUploadWarehouseAppIcon();

    private static HttpRequestDef<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> genForUploadWarehouseAppIcon() {
        // basic
        HttpRequestDef.Builder<UploadWarehouseAppIconRequest, UploadWarehouseAppIconResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UploadWarehouseAppIconRequest.class, UploadWarehouseAppIconResponse.class)
            .withName("UploadWarehouseAppIcon")
            .withUri("/v1/{project_id}/app-warehouse/apps/icon")
            .withContentType("multipart/form-data");

        // requests
        builder.<UploadWarehouseAppIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadWarehouseAppIconRequestBody.class),
            f -> f.withMarshaller(UploadWarehouseAppIconRequest::getBody, UploadWarehouseAppIconRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisableAppRequest, BatchDisableAppResponse> batchDisableApp =
        genForBatchDisableApp();

    private static HttpRequestDef<BatchDisableAppRequest, BatchDisableAppResponse> genForBatchDisableApp() {
        // basic
        HttpRequestDef.Builder<BatchDisableAppRequest, BatchDisableAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDisableAppRequest.class, BatchDisableAppResponse.class)
                .withName("BatchDisableApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/actions/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableAppRequest::getAppGroupId, BatchDisableAppRequest::setAppGroupId));
        builder.<BatchUpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateAppReq.class),
            f -> f.withMarshaller(BatchDisableAppRequest::getBody, BatchDisableAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableAppRequest, BatchEnableAppResponse> batchEnableApp =
        genForBatchEnableApp();

    private static HttpRequestDef<BatchEnableAppRequest, BatchEnableAppResponse> genForBatchEnableApp() {
        // basic
        HttpRequestDef.Builder<BatchEnableAppRequest, BatchEnableAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchEnableAppRequest.class, BatchEnableAppResponse.class)
                .withName("BatchEnableApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/actions/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableAppRequest::getAppGroupId, BatchEnableAppRequest::setAppGroupId));
        builder.<BatchUpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateAppReq.class),
            f -> f.withMarshaller(BatchEnableAppRequest::getBody, BatchEnableAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPublishAppRequest, CheckPublishAppResponse> checkPublishApp =
        genForCheckPublishApp();

    private static HttpRequestDef<CheckPublishAppRequest, CheckPublishAppResponse> genForCheckPublishApp() {
        // basic
        HttpRequestDef.Builder<CheckPublishAppRequest, CheckPublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPublishAppRequest.class, CheckPublishAppResponse.class)
                .withName("CheckPublishApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/actions/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPublishAppRequest::getAppGroupId, CheckPublishAppRequest::setAppGroupId));
        builder.<CheckPublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckPublishAppReq.class),
            f -> f.withMarshaller(CheckPublishAppRequest::getBody, CheckPublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppIconRequest, DeleteAppIconResponse> deleteAppIcon =
        genForDeleteAppIcon();

    private static HttpRequestDef<DeleteAppIconRequest, DeleteAppIconResponse> genForDeleteAppIcon() {
        // basic
        HttpRequestDef.Builder<DeleteAppIconRequest, DeleteAppIconResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppIconRequest.class, DeleteAppIconResponse.class)
                .withName("DeleteAppIcon")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}/icon")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppIconRequest::getAppGroupId, DeleteAppIconRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppIconRequest::getAppId, DeleteAppIconRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> listPublishedApp =
        genForListPublishedApp();

    private static HttpRequestDef<ListPublishedAppRequest, ListPublishedAppResponse> genForListPublishedApp() {
        // basic
        HttpRequestDef.Builder<ListPublishedAppRequest, ListPublishedAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublishedAppRequest.class, ListPublishedAppResponse.class)
                .withName("ListPublishedApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getAppGroupId, ListPublishedAppRequest::setAppGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getLimit, ListPublishedAppRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getOffset, ListPublishedAppRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getName, ListPublishedAppRequest::setName));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getState, ListPublishedAppRequest::setState));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublishedAppRequest::getAppId, ListPublishedAppRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppRequest, PublishAppResponse> publishApp = genForPublishApp();

    private static HttpRequestDef<PublishAppRequest, PublishAppResponse> genForPublishApp() {
        // basic
        HttpRequestDef.Builder<PublishAppRequest, PublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAppRequest.class, PublishAppResponse.class)
                .withName("PublishApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppRequest::getAppGroupId, PublishAppRequest::setAppGroupId));
        builder.<PublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishAppReq.class),
            f -> f.withMarshaller(PublishAppRequest::getBody, PublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetail =
        genForShowAppDetail();

    private static HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> genForShowAppDetail() {
        // basic
        HttpRequestDef.Builder<ShowAppDetailRequest, ShowAppDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppDetailRequest.class, ShowAppDetailResponse.class)
                .withName("ShowAppDetail")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailRequest::getAppGroupId, ShowAppDetailRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailRequest::getAppId, ShowAppDetailRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> showPublishableApp =
        genForShowPublishableApp();

    private static HttpRequestDef<ShowPublishableAppRequest, ShowPublishableAppResponse> genForShowPublishableApp() {
        // basic
        HttpRequestDef.Builder<ShowPublishableAppRequest, ShowPublishableAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublishableAppRequest.class, ShowPublishableAppResponse.class)
                .withName("ShowPublishableApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/publishable-app")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublishableAppRequest::getAppGroupId, ShowPublishableAppRequest::setAppGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> unpublishApp = genForUnpublishApp();

    private static HttpRequestDef<UnpublishAppRequest, UnpublishAppResponse> genForUnpublishApp() {
        // basic
        HttpRequestDef.Builder<UnpublishAppRequest, UnpublishAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnpublishAppRequest.class, UnpublishAppResponse.class)
                .withName("UnpublishApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/batch-unpublish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnpublishAppRequest::getAppGroupId, UnpublishAppRequest::setAppGroupId));
        builder.<UnpublishAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnpublishAppReq.class),
            f -> f.withMarshaller(UnpublishAppRequest::getBody, UnpublishAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppGroupId, UpdateAppRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, UpdateAppRequest::setAppId));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePreBootPolicyRequest, UpdatePreBootPolicyResponse> updatePreBootPolicy =
        genForUpdatePreBootPolicy();

    private static HttpRequestDef<UpdatePreBootPolicyRequest, UpdatePreBootPolicyResponse> genForUpdatePreBootPolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePreBootPolicyRequest, UpdatePreBootPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePreBootPolicyRequest.class, UpdatePreBootPolicyResponse.class)
                .withName("UpdatePreBootPolicy")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/pre-boot-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePreBootPolicyRequest::getAppGroupId,
                UpdatePreBootPolicyRequest::setAppGroupId));
        builder.<UpdatePreBootPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePreBootPolicyReq.class),
            f -> f.withMarshaller(UpdatePreBootPolicyRequest::getBody, UpdatePreBootPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> uploadAppIcon =
        genForUploadAppIcon();

    private static HttpRequestDef<UploadAppIconRequest, UploadAppIconResponse> genForUploadAppIcon() {
        // basic
        HttpRequestDef.Builder<UploadAppIconRequest, UploadAppIconResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAppIconRequest.class, UploadAppIconResponse.class)
                .withName("UploadAppIcon")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}/apps/{app_id}/icon")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAppIconRequest::getAppGroupId, UploadAppIconRequest::setAppGroupId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAppIconRequest::getAppId, UploadAppIconRequest::setAppId));
        builder.<UploadAppIconRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UploadAppIconRequestBody.class),
            f -> f.withMarshaller(UploadAppIconRequest::getBody, UploadAppIconRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InitializeTenantRequest, InitializeTenantResponse> initializeTenant =
        genForInitializeTenant();

    private static HttpRequestDef<InitializeTenantRequest, InitializeTenantResponse> genForInitializeTenant() {
        // basic
        HttpRequestDef.Builder<InitializeTenantRequest, InitializeTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InitializeTenantRequest.class, InitializeTenantResponse.class)
                .withName("InitializeTenant")
                .withUri("/v1/{project_id}/tenant/action/active")
                .withContentType("application/json");

        // requests
        builder.<InitializeTenantReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InitializeTenantReq.class),
            f -> f.withMarshaller(InitializeTenantRequest::getBody, InitializeTenantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse> listCorpConfigInfo =
        genForListCorpConfigInfo();

    private static HttpRequestDef<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse> genForListCorpConfigInfo() {
        // basic
        HttpRequestDef.Builder<ListCorpConfigInfoRequest, ListCorpConfigInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCorpConfigInfoRequest.class, ListCorpConfigInfoResponse.class)
                .withName("ListCorpConfigInfo")
                .withUri("/v1/{project_id}/bundles/batch-query-config-info")
                .withContentType("application/json");

        // requests
        builder.<ListConfigInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConfigInfoReq.class),
            f -> f.withMarshaller(ListCorpConfigInfoRequest::getBody, ListCorpConfigInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantProfileRequest, ListTenantProfileResponse> listTenantProfile =
        genForListTenantProfile();

    private static HttpRequestDef<ListTenantProfileRequest, ListTenantProfileResponse> genForListTenantProfile() {
        // basic
        HttpRequestDef.Builder<ListTenantProfileRequest, ListTenantProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantProfileRequest.class, ListTenantProfileResponse.class)
                .withName("ListTenantProfile")
                .withUri("/v1/{project_id}/tenant/profile")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> batchDeleteAppGroup =
        genForBatchDeleteAppGroup();

    private static HttpRequestDef<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> genForBatchDeleteAppGroup() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppGroupRequest, BatchDeleteAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteAppGroupRequest.class, BatchDeleteAppGroupResponse.class)
                .withName("BatchDeleteAppGroup")
                .withUri("/v1/{project_id}/app-groups/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAppGroupReq.class),
            f -> f.withMarshaller(BatchDeleteAppGroupRequest::getBody, BatchDeleteAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAppGroupRequest, CheckAppGroupResponse> checkAppGroup =
        genForCheckAppGroup();

    private static HttpRequestDef<CheckAppGroupRequest, CheckAppGroupResponse> genForCheckAppGroup() {
        // basic
        HttpRequestDef.Builder<CheckAppGroupRequest, CheckAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckAppGroupRequest.class, CheckAppGroupResponse.class)
                .withName("CheckAppGroup")
                .withUri("/v1/{project_id}/app-groups/rules/validate")
                .withContentType("application/json");

        // requests
        builder.<CheckAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckAppGroupReq.class),
            f -> f.withMarshaller(CheckAppGroupRequest::getBody, CheckAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> createAppGroup =
        genForCreateAppGroup();

    private static HttpRequestDef<CreateAppGroupRequest, CreateAppGroupResponse> genForCreateAppGroup() {
        // basic
        HttpRequestDef.Builder<CreateAppGroupRequest, CreateAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppGroupRequest.class, CreateAppGroupResponse.class)
                .withName("CreateAppGroup")
                .withUri("/v1/{project_id}/app-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppGroupReq.class),
            f -> f.withMarshaller(CreateAppGroupRequest::getBody, CreateAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppGroupRequest, DeleteAppGroupResponse> deleteAppGroup =
        genForDeleteAppGroup();

    private static HttpRequestDef<DeleteAppGroupRequest, DeleteAppGroupResponse> genForDeleteAppGroup() {
        // basic
        HttpRequestDef.Builder<DeleteAppGroupRequest, DeleteAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppGroupRequest.class, DeleteAppGroupResponse.class)
                .withName("DeleteAppGroup")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppGroupRequest::getAppGroupId, DeleteAppGroupRequest::setAppGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateAppGroupRequest, DisassociateAppGroupResponse> disassociateAppGroup =
        genForDisassociateAppGroup();

    private static HttpRequestDef<DisassociateAppGroupRequest, DisassociateAppGroupResponse> genForDisassociateAppGroup() {
        // basic
        HttpRequestDef.Builder<DisassociateAppGroupRequest, DisassociateAppGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisassociateAppGroupRequest.class, DisassociateAppGroupResponse.class)
            .withName("DisassociateAppGroup")
            .withUri("/v1/{project_id}/app-groups/actions/disassociate-app-group")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateAppGroupRequest::getServerGroupId,
                DisassociateAppGroupRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> listAppGroup = genForListAppGroup();

    private static HttpRequestDef<ListAppGroupRequest, ListAppGroupResponse> genForListAppGroup() {
        // basic
        HttpRequestDef.Builder<ListAppGroupRequest, ListAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppGroupRequest.class, ListAppGroupResponse.class)
                .withName("ListAppGroup")
                .withUri("/v1/{project_id}/app-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupRequest::getLimit, ListAppGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupRequest::getOffset, ListAppGroupRequest::setOffset));
        builder.<String>withRequestField("app_server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppServerGroupId, ListAppGroupRequest::setAppServerGroupId));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppGroupId, ListAppGroupRequest::setAppGroupId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getName, ListAppGroupRequest::setName));
        builder.<String>withRequestField("authorization_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAuthorizationType,
                ListAppGroupRequest::setAuthorizationType));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupRequest::getAppType, ListAppGroupRequest::setAppType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse> showAppGroupDetail =
        genForShowAppGroupDetail();

    private static HttpRequestDef<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse> genForShowAppGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowAppGroupDetailRequest, ShowAppGroupDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppGroupDetailRequest.class, ShowAppGroupDetailResponse.class)
                .withName("ShowAppGroupDetail")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppGroupDetailRequest::getAppGroupId, ShowAppGroupDetailRequest::setAppGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> updateAppGroup =
        genForUpdateAppGroup();

    private static HttpRequestDef<UpdateAppGroupRequest, UpdateAppGroupResponse> genForUpdateAppGroup() {
        // basic
        HttpRequestDef.Builder<UpdateAppGroupRequest, UpdateAppGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAppGroupRequest.class, UpdateAppGroupResponse.class)
                .withName("UpdateAppGroup")
                .withUri("/v1/{project_id}/app-groups/{app_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppGroupRequest::getAppGroupId, UpdateAppGroupRequest::setAppGroupId));
        builder.<UpdateAppGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppGroupReq.class),
            f -> f.withMarshaller(UpdateAppGroupRequest::getBody, UpdateAppGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderRequest, CreateOrderResponse> createOrder = genForCreateOrder();

    private static HttpRequestDef<CreateOrderRequest, CreateOrderResponse> genForCreateOrder() {
        // basic
        HttpRequestDef.Builder<CreateOrderRequest, CreateOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrderRequest.class, CreateOrderResponse.class)
                .withName("CreateOrder")
                .withUri("/v1/{project_id}/bundles/subscribe/order")
                .withContentType("application/json");

        // requests
        builder.<CreateOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrderReq.class),
            f -> f.withMarshaller(CreateOrderRequest::getBody, CreateOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductRequest, ListProductResponse> listProduct = genForListProduct();

    private static HttpRequestDef<ListProductRequest, ListProductResponse> genForListProduct() {
        // basic
        HttpRequestDef.Builder<ListProductRequest, ListProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductRequest.class, ListProductResponse.class)
                .withName("ListProduct")
                .withUri("/v1/{project_id}/product")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getProductId, ListProductRequest::setProductId));
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getFlavorId, ListProductRequest::setFlavorId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getAvailabilityZone, ListProductRequest::setAvailabilityZone));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getOsType, ListProductRequest::setOsType));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getChargeMode, ListProductRequest::setChargeMode));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getArchitecture, ListProductRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductRequest::getPackageType, ListProductRequest::setPackageType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> listSessionType =
        genForListSessionType();

    private static HttpRequestDef<ListSessionTypeRequest, ListSessionTypeResponse> genForListSessionType() {
        // basic
        HttpRequestDef.Builder<ListSessionTypeRequest, ListSessionTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionTypeRequest.class, ListSessionTypeResponse.class)
                .withName("ListSessionType")
                .withUri("/v1/{project_id}/session-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSessionTypesRequest, ShowSessionTypesResponse> showSessionTypes =
        genForShowSessionTypes();

    private static HttpRequestDef<ShowSessionTypesRequest, ShowSessionTypesResponse> genForShowSessionTypes() {
        // basic
        HttpRequestDef.Builder<ShowSessionTypesRequest, ShowSessionTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSessionTypesRequest.class, ShowSessionTypesResponse.class)
                .withName("ShowSessionTypes")
                .withUri("/v1/{project_id}/session-type")
                .withContentType("application/json");

        // requests
        builder.<QuerySessionTypesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySessionTypesReq.class),
            f -> f.withMarshaller(ShowSessionTypesRequest::getBody, ShowSessionTypesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> addAppGroupAuthorization =
        genForAddAppGroupAuthorization();

    private static HttpRequestDef<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> genForAddAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<AddAppGroupAuthorizationRequest, AddAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddAppGroupAuthorizationRequest.class, AddAppGroupAuthorizationResponse.class)
                .withName("AddAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/authorizations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getXLanguage,
                AddAppGroupAuthorizationRequest::setXLanguage));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(AddAppGroupAuthorizationRequest::getBody, AddAppGroupAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> batchDeleteAppGroupAuthorization =
        genForBatchDeleteAppGroupAuthorization();

    private static HttpRequestDef<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> genForBatchDeleteAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppGroupAuthorizationRequest, BatchDeleteAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteAppGroupAuthorizationRequest.class,
                    BatchDeleteAppGroupAuthorizationResponse.class)
                .withName("BatchDeleteAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/actions/batch-delete-authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getXLanguage,
                BatchDeleteAppGroupAuthorizationRequest::setXLanguage));
        builder.<AppGroupAuthorizeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppGroupAuthorizeReq.class),
            f -> f.withMarshaller(BatchDeleteAppGroupAuthorizationRequest::getBody,
                BatchDeleteAppGroupAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> listAppGroupAuthorization =
        genForListAppGroupAuthorization();

    private static HttpRequestDef<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> genForListAppGroupAuthorization() {
        // basic
        HttpRequestDef.Builder<ListAppGroupAuthorizationRequest, ListAppGroupAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppGroupAuthorizationRequest.class,
                    ListAppGroupAuthorizationResponse.class)
                .withName("ListAppGroupAuthorization")
                .withUri("/v1/{project_id}/app-groups/actions/list-authorizations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getLimit,
                ListAppGroupAuthorizationRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getOffset,
                ListAppGroupAuthorizationRequest::setOffset));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAppGroupId,
                ListAppGroupAuthorizationRequest::setAppGroupId));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccountId,
                ListAppGroupAuthorizationRequest::setAccountId));
        builder.<String>withRequestField("account",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccount,
                ListAppGroupAuthorizationRequest::setAccount));
        builder.<String>withRequestField("account_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppGroupAuthorizationRequest::getAccountType,
                ListAppGroupAuthorizationRequest::setAccountType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZone =
        genForListAvailabilityZone();

    private static HttpRequestDef<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> genForListAvailabilityZone() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZoneRequest.class, ListAvailabilityZoneResponse.class)
            .withName("ListAvailabilityZone")
            .withUri("/v1/{project_id}/availability-zone")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAzRequest, ListAzResponse> listAz = genForListAz();

    private static HttpRequestDef<ListAzRequest, ListAzResponse> genForListAz() {
        // basic
        HttpRequestDef.Builder<ListAzRequest, ListAzResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAzRequest.class, ListAzResponse.class)
                .withName("ListAz")
                .withUri("/v1/{project_id}/availability-zone/summary")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCloudStorageRequest, BatchDeleteCloudStorageResponse> batchDeleteCloudStorage =
        genForBatchDeleteCloudStorage();

    private static HttpRequestDef<BatchDeleteCloudStorageRequest, BatchDeleteCloudStorageResponse> genForBatchDeleteCloudStorage() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCloudStorageRequest, BatchDeleteCloudStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteCloudStorageRequest.class, BatchDeleteCloudStorageResponse.class)
            .withName("BatchDeleteCloudStorage")
            .withUri("/v1/{project_id}/cloud-storages/actions/batch-delete-cloud-storages")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteCloudStorageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteCloudStorageReq.class),
            f -> f.withMarshaller(BatchDeleteCloudStorageRequest::getBody, BatchDeleteCloudStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeClusterRequest, ChangeClusterResponse> changeCluster =
        genForChangeCluster();

    private static HttpRequestDef<ChangeClusterRequest, ChangeClusterResponse> genForChangeCluster() {
        // basic
        HttpRequestDef.Builder<ChangeClusterRequest, ChangeClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeClusterRequest.class, ChangeClusterResponse.class)
                .withName("ChangeCluster")
                .withUri("/v1/{project_id}/cloud-storages/{storage_id}/actions/change-cluster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeClusterRequest::getStorageId, ChangeClusterRequest::setStorageId));
        builder.<ChangeClusterReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeClusterReq.class),
            f -> f.withMarshaller(ChangeClusterRequest::getBody, ChangeClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudStorageRequest, CreateCloudStorageResponse> createCloudStorage =
        genForCreateCloudStorage();

    private static HttpRequestDef<CreateCloudStorageRequest, CreateCloudStorageResponse> genForCreateCloudStorage() {
        // basic
        HttpRequestDef.Builder<CreateCloudStorageRequest, CreateCloudStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCloudStorageRequest.class, CreateCloudStorageResponse.class)
                .withName("CreateCloudStorage")
                .withUri("/v1/{project_id}/cloud-storages")
                .withContentType("application/json");

        // requests
        builder.<CreateCloudStorageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudStorageReq.class),
            f -> f.withMarshaller(CreateCloudStorageRequest::getBody, CreateCloudStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserFolderAssignmentRequest, CreateUserFolderAssignmentResponse> createUserFolderAssignment =
        genForCreateUserFolderAssignment();

    private static HttpRequestDef<CreateUserFolderAssignmentRequest, CreateUserFolderAssignmentResponse> genForCreateUserFolderAssignment() {
        // basic
        HttpRequestDef.Builder<CreateUserFolderAssignmentRequest, CreateUserFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateUserFolderAssignmentRequest.class,
                    CreateUserFolderAssignmentResponse.class)
                .withName("CreateUserFolderAssignment")
                .withUri("/v1/{project_id}/cloud-storages/{storage_id}/actions/create-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserFolderAssignmentRequest::getStorageId,
                CreateUserFolderAssignmentRequest::setStorageId));
        builder.<CreateUserFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserFolderReq.class),
            f -> f.withMarshaller(CreateUserFolderAssignmentRequest::getBody,
                CreateUserFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudStorageRequest, DeleteCloudStorageResponse> deleteCloudStorage =
        genForDeleteCloudStorage();

    private static HttpRequestDef<DeleteCloudStorageRequest, DeleteCloudStorageResponse> genForDeleteCloudStorage() {
        // basic
        HttpRequestDef.Builder<DeleteCloudStorageRequest, DeleteCloudStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCloudStorageRequest.class, DeleteCloudStorageResponse.class)
                .withName("DeleteCloudStorage")
                .withUri("/v1/{project_id}/cloud-storages/{storage_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudStorageRequest::getStorageId, DeleteCloudStorageRequest::setStorageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudStorageAttachmentRequest, DeleteCloudStorageAttachmentResponse> deleteCloudStorageAttachment =
        genForDeleteCloudStorageAttachment();

    private static HttpRequestDef<DeleteCloudStorageAttachmentRequest, DeleteCloudStorageAttachmentResponse> genForDeleteCloudStorageAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteCloudStorageAttachmentRequest, DeleteCloudStorageAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteCloudStorageAttachmentRequest.class,
                    DeleteCloudStorageAttachmentResponse.class)
                .withName("DeleteCloudStorageAttachment")
                .withUri("/v1/{project_id}/cloud-storages/{storage_id}/actions/delete-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudStorageAttachmentRequest::getStorageId,
                DeleteCloudStorageAttachmentRequest::setStorageId));
        builder.<DeleteCloudStorageAttachmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCloudStorageAttachmentReq.class),
            f -> f.withMarshaller(DeleteCloudStorageAttachmentRequest::getBody,
                DeleteCloudStorageAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudStorageRequest, ListCloudStorageResponse> listCloudStorage =
        genForListCloudStorage();

    private static HttpRequestDef<ListCloudStorageRequest, ListCloudStorageResponse> genForListCloudStorage() {
        // basic
        HttpRequestDef.Builder<ListCloudStorageRequest, ListCloudStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCloudStorageRequest.class, ListCloudStorageResponse.class)
                .withName("ListCloudStorage")
                .withUri("/v1/{project_id}/cloud-storages")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudStorageRequest::getOffset, ListCloudStorageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudStorageRequest::getLimit, ListCloudStorageRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageRequest::getStorageId, ListCloudStorageRequest::setStorageId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageRequest::getName, ListCloudStorageRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudStorageAssignmentRequest, ListCloudStorageAssignmentResponse> listCloudStorageAssignment =
        genForListCloudStorageAssignment();

    private static HttpRequestDef<ListCloudStorageAssignmentRequest, ListCloudStorageAssignmentResponse> genForListCloudStorageAssignment() {
        // basic
        HttpRequestDef.Builder<ListCloudStorageAssignmentRequest, ListCloudStorageAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCloudStorageAssignmentRequest.class,
                    ListCloudStorageAssignmentResponse.class)
                .withName("ListCloudStorageAssignment")
                .withUri("/v1/{project_id}/cloud-storages/actions/list-folders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getOffset,
                ListCloudStorageAssignmentRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getLimit,
                ListCloudStorageAssignmentRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getStorageId,
                ListCloudStorageAssignmentRequest::setStorageId));
        builder.<String>withRequestField("claim_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getClaimMode,
                ListCloudStorageAssignmentRequest::setClaimMode));
        builder.<String>withRequestField("attach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getAttach,
                ListCloudStorageAssignmentRequest::setAttach));
        builder.<List<String>>withRequestField("attach_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getAttachNames,
                ListCloudStorageAssignmentRequest::setAttachNames));
        builder.<String>withRequestField("capacity_filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudStorageAssignmentRequest::getCapacityFilter,
                ListCloudStorageAssignmentRequest::setCapacityFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFoldersAndFilesRequest, ListFoldersAndFilesResponse> listFoldersAndFiles =
        genForListFoldersAndFiles();

    private static HttpRequestDef<ListFoldersAndFilesRequest, ListFoldersAndFilesResponse> genForListFoldersAndFiles() {
        // basic
        HttpRequestDef.Builder<ListFoldersAndFilesRequest, ListFoldersAndFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFoldersAndFilesRequest.class, ListFoldersAndFilesResponse.class)
                .withName("ListFoldersAndFiles")
                .withUri("/v1/{project_id}/cloud-storages/actions/list-folder-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFoldersAndFilesRequest::getUserName, ListFoldersAndFilesRequest::setUserName));
        builder.<String>withRequestField("cloud_storage_assignment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFoldersAndFilesRequest::getCloudStorageAssignmentId,
                ListFoldersAndFilesRequest::setCloudStorageAssignmentId));
        builder.<String>withRequestField("folder_url",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFoldersAndFilesRequest::getFolderUrl, ListFoldersAndFilesRequest::setFolderUrl));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFoldersAndFilesRequest::getMarker, ListFoldersAndFilesRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFoldersAndFilesRequest::getLimit, ListFoldersAndFilesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectConfigsRequest, ListProjectConfigsResponse> listProjectConfigs =
        genForListProjectConfigs();

    private static HttpRequestDef<ListProjectConfigsRequest, ListProjectConfigsResponse> genForListProjectConfigs() {
        // basic
        HttpRequestDef.Builder<ListProjectConfigsRequest, ListProjectConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectConfigsRequest.class, ListProjectConfigsResponse.class)
                .withName("ListProjectConfigs")
                .withUri("/v1/{project_id}/cloud-storages/actions/list-project-configs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectConfigsRequest::getOffset, ListProjectConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectConfigsRequest::getLimit, ListProjectConfigsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectConfigsRequest::getName, ListProjectConfigsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserProfileRequest, ResetUserProfileResponse> resetUserProfile =
        genForResetUserProfile();

    private static HttpRequestDef<ResetUserProfileRequest, ResetUserProfileResponse> genForResetUserProfile() {
        // basic
        HttpRequestDef.Builder<ResetUserProfileRequest, ResetUserProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetUserProfileRequest.class, ResetUserProfileResponse.class)
                .withName("ResetUserProfile")
                .withUri("/v1/{project_id}/cloud-storages/actions/reset-userprofile")
                .withContentType("application/json");

        // requests
        builder.<ResetUserProfileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetUserProfileReq.class),
            f -> f.withMarshaller(ResetUserProfileRequest::getBody, ResetUserProfileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectConfigRequest, ShowProjectConfigResponse> showProjectConfig =
        genForShowProjectConfig();

    private static HttpRequestDef<ShowProjectConfigRequest, ShowProjectConfigResponse> genForShowProjectConfig() {
        // basic
        HttpRequestDef.Builder<ShowProjectConfigRequest, ShowProjectConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectConfigRequest.class, ShowProjectConfigResponse.class)
                .withName("ShowProjectConfig")
                .withUri("/v1/{project_id}/cloud-storages/actions/project-config/{cloud_storage_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cloud_storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectConfigRequest::getCloudStorageId,
                ShowProjectConfigRequest::setCloudStorageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferFileRequest, TransferFileResponse> transferFile = genForTransferFile();

    private static HttpRequestDef<TransferFileRequest, TransferFileResponse> genForTransferFile() {
        // basic
        HttpRequestDef.Builder<TransferFileRequest, TransferFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TransferFileRequest.class, TransferFileResponse.class)
                .withName("TransferFile")
                .withUri("/v1/{project_id}/cloud-storages/actions/transfer-file")
                .withContentType("application/json");

        // requests
        builder.<TransferFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferFileReq.class),
            f -> f.withMarshaller(TransferFileRequest::getBody, TransferFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TransferFilePreRequest, TransferFilePreResponse> transferFilePre =
        genForTransferFilePre();

    private static HttpRequestDef<TransferFilePreRequest, TransferFilePreResponse> genForTransferFilePre() {
        // basic
        HttpRequestDef.Builder<TransferFilePreRequest, TransferFilePreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TransferFilePreRequest.class, TransferFilePreResponse.class)
                .withName("TransferFilePre")
                .withUri("/v1/{project_id}/cloud-storages/actions/pre-transfer-file")
                .withContentType("application/json");

        // requests
        builder.<TransferFilePreReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransferFilePreReq.class),
            f -> f.withMarshaller(TransferFilePreRequest::getBody, TransferFilePreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCloudUserFolderAssignmentRequest, UpdateCloudUserFolderAssignmentResponse> updateCloudUserFolderAssignment =
        genForUpdateCloudUserFolderAssignment();

    private static HttpRequestDef<UpdateCloudUserFolderAssignmentRequest, UpdateCloudUserFolderAssignmentResponse> genForUpdateCloudUserFolderAssignment() {
        // basic
        HttpRequestDef.Builder<UpdateCloudUserFolderAssignmentRequest, UpdateCloudUserFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateCloudUserFolderAssignmentRequest.class,
                    UpdateCloudUserFolderAssignmentResponse.class)
                .withName("UpdateCloudUserFolderAssignment")
                .withUri("/v1/{project_id}/cloud-storages/{storage_id}/actions/update-folder/{cloud_assignment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudUserFolderAssignmentRequest::getStorageId,
                UpdateCloudUserFolderAssignmentRequest::setStorageId));
        builder.<String>withRequestField("cloud_assignment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCloudUserFolderAssignmentRequest::getCloudAssignmentId,
                UpdateCloudUserFolderAssignmentRequest::setCloudAssignmentId));
        builder.<UpdateUserFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserFolderReq.class),
            f -> f.withMarshaller(UpdateCloudUserFolderAssignmentRequest::getBody,
                UpdateCloudUserFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHotspotSessionConfigRequest, CreateHotspotSessionConfigResponse> createHotspotSessionConfig =
        genForCreateHotspotSessionConfig();

    private static HttpRequestDef<CreateHotspotSessionConfigRequest, CreateHotspotSessionConfigResponse> genForCreateHotspotSessionConfig() {
        // basic
        HttpRequestDef.Builder<CreateHotspotSessionConfigRequest, CreateHotspotSessionConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHotspotSessionConfigRequest.class,
                    CreateHotspotSessionConfigResponse.class)
                .withName("CreateHotspotSessionConfig")
                .withUri("/v1/{project_id}/hotspot-session-config")
                .withContentType("application/json");

        // requests
        builder.<CreateHotspotSessionConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHotspotSessionConfigReq.class),
            f -> f.withMarshaller(CreateHotspotSessionConfigRequest::getBody,
                CreateHotspotSessionConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHotspotSessionConfigRequest, ListHotspotSessionConfigResponse> listHotspotSessionConfig =
        genForListHotspotSessionConfig();

    private static HttpRequestDef<ListHotspotSessionConfigRequest, ListHotspotSessionConfigResponse> genForListHotspotSessionConfig() {
        // basic
        HttpRequestDef.Builder<ListHotspotSessionConfigRequest, ListHotspotSessionConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHotspotSessionConfigRequest.class, ListHotspotSessionConfigResponse.class)
                .withName("ListHotspotSessionConfig")
                .withUri("/v1/{project_id}/hotspot-session-config")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotspotSessionConfigRequest::getOffset,
                ListHotspotSessionConfigRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotspotSessionConfigRequest::getLimit,
                ListHotspotSessionConfigRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNonMigrationUsersRequest, ListNonMigrationUsersResponse> listNonMigrationUsers =
        genForListNonMigrationUsers();

    private static HttpRequestDef<ListNonMigrationUsersRequest, ListNonMigrationUsersResponse> genForListNonMigrationUsers() {
        // basic
        HttpRequestDef.Builder<ListNonMigrationUsersRequest, ListNonMigrationUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNonMigrationUsersRequest.class, ListNonMigrationUsersResponse.class)
            .withName("ListNonMigrationUsers")
            .withUri("/v1/{project_id}/hotspot-session-config/{config_id}/non-migration-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNonMigrationUsersRequest::getConfigId,
                ListNonMigrationUsersRequest::setConfigId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNonMigrationUsersRequest::getUserName,
                ListNonMigrationUsersRequest::setUserName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNonMigrationUsersRequest::getOffset, ListNonMigrationUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNonMigrationUsersRequest::getLimit, ListNonMigrationUsersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotspotSessionConfigRequest, UpdateHotspotSessionConfigResponse> updateHotspotSessionConfig =
        genForUpdateHotspotSessionConfig();

    private static HttpRequestDef<UpdateHotspotSessionConfigRequest, UpdateHotspotSessionConfigResponse> genForUpdateHotspotSessionConfig() {
        // basic
        HttpRequestDef.Builder<UpdateHotspotSessionConfigRequest, UpdateHotspotSessionConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateHotspotSessionConfigRequest.class,
                    UpdateHotspotSessionConfigResponse.class)
                .withName("UpdateHotspotSessionConfig")
                .withUri("/v1/{project_id}/hotspot-session-config/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotspotSessionConfigRequest::getConfigId,
                UpdateHotspotSessionConfigRequest::setConfigId));
        builder.<UpdateHotspotSessionConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHotspotSessionConfigReq.class),
            f -> f.withMarshaller(UpdateHotspotSessionConfigRequest::getBody,
                UpdateHotspotSessionConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNonMigrationUsersRequest, UpdateNonMigrationUsersResponse> updateNonMigrationUsers =
        genForUpdateNonMigrationUsers();

    private static HttpRequestDef<UpdateNonMigrationUsersRequest, UpdateNonMigrationUsersResponse> genForUpdateNonMigrationUsers() {
        // basic
        HttpRequestDef.Builder<UpdateNonMigrationUsersRequest, UpdateNonMigrationUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateNonMigrationUsersRequest.class, UpdateNonMigrationUsersResponse.class)
            .withName("UpdateNonMigrationUsers")
            .withUri("/v1/{project_id}/hotspot-session-config/{config_id}/non-migration-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNonMigrationUsersRequest::getConfigId,
                UpdateNonMigrationUsersRequest::setConfigId));
        builder.<UpdateNonMigrationUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNonMigrationUsersReq.class),
            f -> f.withMarshaller(UpdateNonMigrationUsersRequest::getBody, UpdateNonMigrationUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachImageServerAppRequest, AttachImageServerAppResponse> attachImageServerApp =
        genForAttachImageServerApp();

    private static HttpRequestDef<AttachImageServerAppRequest, AttachImageServerAppResponse> genForAttachImageServerApp() {
        // basic
        HttpRequestDef.Builder<AttachImageServerAppRequest, AttachImageServerAppResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachImageServerAppRequest.class, AttachImageServerAppResponse.class)
            .withName("AttachImageServerApp")
            .withUri("/v1/{project_id}/image-servers/{server_id}/actions/attach-app")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachImageServerAppRequest::getServerId, AttachImageServerAppRequest::setServerId));
        builder.<AttachServerAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachServerAppReq.class),
            f -> f.withMarshaller(AttachImageServerAppRequest::getBody, AttachImageServerAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> batchDeleteImageServer =
        genForBatchDeleteImageServer();

    private static HttpRequestDef<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> genForBatchDeleteImageServer() {
        // basic
        HttpRequestDef.Builder<BatchDeleteImageServerRequest, BatchDeleteImageServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchDeleteImageServerRequest.class, BatchDeleteImageServerResponse.class)
            .withName("BatchDeleteImageServer")
            .withUri("/v1/{project_id}/image-servers/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteImageServerReq.class),
            f -> f.withMarshaller(BatchDeleteImageServerRequest::getBody, BatchDeleteImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateImageServerRequest, CreateImageServerResponse> createImageServer =
        genForCreateImageServer();

    private static HttpRequestDef<CreateImageServerRequest, CreateImageServerResponse> genForCreateImageServer() {
        // basic
        HttpRequestDef.Builder<CreateImageServerRequest, CreateImageServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageServerRequest.class, CreateImageServerResponse.class)
                .withName("CreateImageServer")
                .withUri("/v1/{project_id}/image-servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Service-Transaction-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageServerRequest::getServiceTransactionId,
                CreateImageServerRequest::setServiceTransactionId));
        builder.<String>withRequestField("X-Linked-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageServerRequest::getXLinkedId, CreateImageServerRequest::setXLinkedId));
        builder.<CreateImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageServerReq.class),
            f -> f.withMarshaller(CreateImageServerRequest::getBody, CreateImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageServersRequest, ListImageServersResponse> listImageServers =
        genForListImageServers();

    private static HttpRequestDef<ListImageServersRequest, ListImageServersResponse> genForListImageServers() {
        // basic
        HttpRequestDef.Builder<ListImageServersRequest, ListImageServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageServersRequest.class, ListImageServersResponse.class)
                .withName("ListImageServers")
                .withUri("/v1/{project_id}/image-servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageServersRequest::getOffset, ListImageServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageServersRequest::getLimit, ListImageServersRequest::setLimit));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getServerName, ListImageServersRequest::setServerName));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getServerId, ListImageServersRequest::setServerId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageServersRequest::getEnterpriseProjectId,
                ListImageServersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> listLatestAttachedServerApp =
        genForListLatestAttachedServerApp();

    private static HttpRequestDef<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> genForListLatestAttachedServerApp() {
        // basic
        HttpRequestDef.Builder<ListLatestAttachedServerAppRequest, ListLatestAttachedServerAppResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatestAttachedServerAppRequest.class,
                    ListLatestAttachedServerAppResponse.class)
                .withName("ListLatestAttachedServerApp")
                .withUri("/v1/{project_id}/image-servers/{server_id}/actions/latest-attached-app")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestAttachedServerAppRequest::getServerId,
                ListLatestAttachedServerAppRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecreateServerImageRequest, RecreateServerImageResponse> recreateServerImage =
        genForRecreateServerImage();

    private static HttpRequestDef<RecreateServerImageRequest, RecreateServerImageResponse> genForRecreateServerImage() {
        // basic
        HttpRequestDef.Builder<RecreateServerImageRequest, RecreateServerImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecreateServerImageRequest.class, RecreateServerImageResponse.class)
                .withName("RecreateServerImage")
                .withUri("/v1/{project_id}/image-servers/{server_id}/actions/recreate-image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecreateServerImageRequest::getServerId, RecreateServerImageRequest::setServerId));
        builder.<CreateServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerImageReq.class),
            f -> f.withMarshaller(RecreateServerImageRequest::getBody, RecreateServerImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageServerRequest, ShowImageServerResponse> showImageServer =
        genForShowImageServer();

    private static HttpRequestDef<ShowImageServerRequest, ShowImageServerResponse> genForShowImageServer() {
        // basic
        HttpRequestDef.Builder<ShowImageServerRequest, ShowImageServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageServerRequest.class, ShowImageServerResponse.class)
                .withName("ShowImageServer")
                .withUri("/v1/{project_id}/image-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageServerRequest::getServerId, ShowImageServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateImageServerRequest, UpdateImageServerResponse> updateImageServer =
        genForUpdateImageServer();

    private static HttpRequestDef<UpdateImageServerRequest, UpdateImageServerResponse> genForUpdateImageServer() {
        // basic
        HttpRequestDef.Builder<UpdateImageServerRequest, UpdateImageServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateImageServerRequest.class, UpdateImageServerResponse.class)
                .withName("UpdateImageServer")
                .withUri("/v1/{project_id}/image-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateImageServerRequest::getServerId, UpdateImageServerRequest::setServerId));
        builder.<UpdateImageServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateImageServerReq.class),
            f -> f.withMarshaller(UpdateImageServerRequest::getBody, UpdateImageServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse> batchDeleteAppSubJobs =
        genForBatchDeleteAppSubJobs();

    private static HttpRequestDef<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse> genForBatchDeleteAppSubJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppSubJobsRequest, BatchDeleteAppSubJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteAppSubJobsRequest.class, BatchDeleteAppSubJobsResponse.class)
            .withName("BatchDeleteAppSubJobs")
            .withUri("/v1/{project_id}/app-server-sub-jobs/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteSubJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSubJobsReq.class),
            f -> f.withMarshaller(BatchDeleteAppSubJobsRequest::getBody, BatchDeleteAppSubJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse> batchDeleteImageSubJobs =
        genForBatchDeleteImageSubJobs();

    private static HttpRequestDef<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse> genForBatchDeleteImageSubJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteImageSubJobsRequest, BatchDeleteImageSubJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchDeleteImageSubJobsRequest.class, BatchDeleteImageSubJobsResponse.class)
            .withName("BatchDeleteImageSubJobs")
            .withUri("/v1/{project_id}/image-server-sub-jobs/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteSubJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSubJobsReq.class),
            f -> f.withMarshaller(BatchDeleteImageSubJobsRequest::getBody, BatchDeleteImageSubJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountImageSubJobsRequest, CountImageSubJobsResponse> countImageSubJobs =
        genForCountImageSubJobs();

    private static HttpRequestDef<CountImageSubJobsRequest, CountImageSubJobsResponse> genForCountImageSubJobs() {
        // basic
        HttpRequestDef.Builder<CountImageSubJobsRequest, CountImageSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountImageSubJobsRequest.class, CountImageSubJobsResponse.class)
                .withName("CountImageSubJobs")
                .withUri("/v1/{project_id}/image-server-sub-jobs/actions/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountImageSubJobsRequest::getStatus, CountImageSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountImageSubJobsRequest::getJobType, CountImageSubJobsRequest::setJobType));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountImageSubJobsRequest::getJobId, CountImageSubJobsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountSubJobsRequest, CountSubJobsResponse> countSubJobs = genForCountSubJobs();

    private static HttpRequestDef<CountSubJobsRequest, CountSubJobsResponse> genForCountSubJobs() {
        // basic
        HttpRequestDef.Builder<CountSubJobsRequest, CountSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountSubJobsRequest.class, CountSubJobsResponse.class)
                .withName("CountSubJobs")
                .withUri("/v1/{project_id}/app-server-sub-jobs/actions/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSubJobsRequest::getStatus, CountSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSubJobsRequest::getJobType, CountSubJobsRequest::setJobType));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountSubJobsRequest::getJobId, CountSubJobsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageJobsRequest, ListImageJobsResponse> listImageJobs =
        genForListImageJobs();

    private static HttpRequestDef<ListImageJobsRequest, ListImageJobsResponse> genForListImageJobs() {
        // basic
        HttpRequestDef.Builder<ListImageJobsRequest, ListImageJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageJobsRequest.class, ListImageJobsResponse.class)
                .withName("ListImageJobs")
                .withUri("/v1/{project_id}/image-server-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageJobsRequest::getStatus, ListImageJobsRequest::setStatus));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageJobsRequest::getJobType, ListImageJobsRequest::setJobType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageJobsRequest::getOffset, ListImageJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageJobsRequest::getLimit, ListImageJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageSubJobsRequest, ListImageSubJobsResponse> listImageSubJobs =
        genForListImageSubJobs();

    private static HttpRequestDef<ListImageSubJobsRequest, ListImageSubJobsResponse> genForListImageSubJobs() {
        // basic
        HttpRequestDef.Builder<ListImageSubJobsRequest, ListImageSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageSubJobsRequest.class, ListImageSubJobsResponse.class)
                .withName("ListImageSubJobs")
                .withUri("/v1/{project_id}/image-server-sub-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageSubJobsRequest::getStatus, ListImageSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageSubJobsRequest::getJobType, ListImageSubJobsRequest::setJobType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageSubJobsRequest::getOffset, ListImageSubJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageSubJobsRequest::getLimit, ListImageSubJobsRequest::setLimit));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageSubJobsRequest::getJobId, ListImageSubJobsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubJobsRequest, ListSubJobsResponse> listSubJobs = genForListSubJobs();

    private static HttpRequestDef<ListSubJobsRequest, ListSubJobsResponse> genForListSubJobs() {
        // basic
        HttpRequestDef.Builder<ListSubJobsRequest, ListSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubJobsRequest.class, ListSubJobsResponse.class)
                .withName("ListSubJobs")
                .withUri("/v1/{project_id}/app-server-sub-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubJobsRequest::getStatus, ListSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubJobsRequest::getJobType, ListSubJobsRequest::setJobType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubJobsRequest::getOffset, ListSubJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubJobsRequest::getLimit, ListSubJobsRequest::setLimit));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubJobsRequest::getJobId, ListSubJobsRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageJobRequest, ShowImageJobResponse> showImageJob = genForShowImageJob();

    private static HttpRequestDef<ShowImageJobRequest, ShowImageJobResponse> genForShowImageJob() {
        // basic
        HttpRequestDef.Builder<ShowImageJobRequest, ShowImageJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageJobRequest.class, ShowImageJobResponse.class)
                .withName("ShowImageJob")
                .withUri("/v1/{project_id}/image-server-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageJobRequest::getJobId, ShowImageJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v1/{project_id}/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRequest::getJobId, ShowJobRequest::setJobId));

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
                .withUri("/v2/{project_id}/job/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, ShowJobDetailRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse> listAuthorizationMailRecord =
        genForListAuthorizationMailRecord();

    private static HttpRequestDef<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse> genForListAuthorizationMailRecord() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationMailRecordRequest, ListAuthorizationMailRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuthorizationMailRecordRequest.class,
                    ListAuthorizationMailRecordResponse.class)
                .withName("ListAuthorizationMailRecord")
                .withUri("/v1/{project_id}/mails")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getLimit,
                ListAuthorizationMailRecordRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getOffset,
                ListAuthorizationMailRecordRequest::setOffset));
        builder.<String>withRequestField("app_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getAppGroupId,
                ListAuthorizationMailRecordRequest::setAppGroupId));
        builder.<String>withRequestField("account",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getAccount,
                ListAuthorizationMailRecordRequest::setAccount));
        builder.<String>withRequestField("mail_send_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getMailSendType,
                ListAuthorizationMailRecordRequest::setMailSendType));
        builder.<String>withRequestField("mail_send_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizationMailRecordRequest::getMailSendResult,
                ListAuthorizationMailRecordRequest::setMailSendResult));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAuthorizationMailRequest, SendAuthorizationMailResponse> sendAuthorizationMail =
        genForSendAuthorizationMail();

    private static HttpRequestDef<SendAuthorizationMailRequest, SendAuthorizationMailResponse> genForSendAuthorizationMail() {
        // basic
        HttpRequestDef.Builder<SendAuthorizationMailRequest, SendAuthorizationMailResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SendAuthorizationMailRequest.class, SendAuthorizationMailResponse.class)
            .withName("SendAuthorizationMail")
            .withUri("/v1/{project_id}/mails/actions/send")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendAuthorizationMailRequest::getXLanguage,
                SendAuthorizationMailRequest::setXLanguage));
        builder.<ResendAuthorizationMailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResendAuthorizationMailReq.class),
            f -> f.withMarshaller(SendAuthorizationMailRequest::getBody, SendAuthorizationMailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAuthorizedMailRequest, SendAuthorizedMailResponse> sendAuthorizedMail =
        genForSendAuthorizedMail();

    private static HttpRequestDef<SendAuthorizedMailRequest, SendAuthorizedMailResponse> genForSendAuthorizedMail() {
        // basic
        HttpRequestDef.Builder<SendAuthorizedMailRequest, SendAuthorizedMailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendAuthorizedMailRequest.class, SendAuthorizedMailResponse.class)
                .withName("SendAuthorizedMail")
                .withUri("/v1/{project_id}/mails/actions/send-by-authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendAuthorizedMailRequest::getXLanguage, SendAuthorizedMailRequest::setXLanguage));
        builder.<ResendAuthorizedMailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResendAuthorizedMailReq.class),
            f -> f.withMarshaller(SendAuthorizedMailRequest::getBody, SendAuthorizedMailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse> batchDeletePersistentStorage =
        genForBatchDeletePersistentStorage();

    private static HttpRequestDef<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse> genForBatchDeletePersistentStorage() {
        // basic
        HttpRequestDef.Builder<BatchDeletePersistentStorageRequest, BatchDeletePersistentStorageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeletePersistentStorageRequest.class,
                    BatchDeletePersistentStorageResponse.class)
                .withName("BatchDeletePersistentStorage")
                .withUri("/v1/{project_id}/persistent-storages/actions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeletePersistentStorageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePersistentStorageReq.class),
            f -> f.withMarshaller(BatchDeletePersistentStorageRequest::getBody,
                BatchDeletePersistentStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> createOrUpdateStoragePolicyStatement =
        genForCreateOrUpdateStoragePolicyStatement();

    private static HttpRequestDef<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> genForCreateOrUpdateStoragePolicyStatement() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateStoragePolicyStatementRequest, CreateOrUpdateStoragePolicyStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateOrUpdateStoragePolicyStatementRequest.class,
                    CreateOrUpdateStoragePolicyStatementResponse.class)
                .withName("CreateOrUpdateStoragePolicyStatement")
                .withUri("/v1/{project_id}/storages-policy/actions/create-statements")
                .withContentType("application/json");

        // requests
        builder.<CreateOrUpdateStoragePolicyStatementReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrUpdateStoragePolicyStatementReq.class),
            f -> f.withMarshaller(CreateOrUpdateStoragePolicyStatementRequest::getBody,
                CreateOrUpdateStoragePolicyStatementRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> createPersistentStorage =
        genForCreatePersistentStorage();

    private static HttpRequestDef<CreatePersistentStorageRequest, CreatePersistentStorageResponse> genForCreatePersistentStorage() {
        // basic
        HttpRequestDef.Builder<CreatePersistentStorageRequest, CreatePersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePersistentStorageRequest.class, CreatePersistentStorageResponse.class)
            .withName("CreatePersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages")
            .withContentType("application/json");

        // requests
        builder.<CreatePersistentStorageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePersistentStorageReq.class),
            f -> f.withMarshaller(CreatePersistentStorageRequest::getBody, CreatePersistentStorageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> createShareFolder =
        genForCreateShareFolder();

    private static HttpRequestDef<CreateShareFolderRequest, CreateShareFolderResponse> genForCreateShareFolder() {
        // basic
        HttpRequestDef.Builder<CreateShareFolderRequest, CreateShareFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateShareFolderRequest.class, CreateShareFolderResponse.class)
                .withName("CreateShareFolder")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/create-share-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShareFolderRequest::getStorageId, CreateShareFolderRequest::setStorageId));
        builder.<CreateShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShareFolderReq.class),
            f -> f.withMarshaller(CreateShareFolderRequest::getBody, CreateShareFolderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> deletePersistentStorage =
        genForDeletePersistentStorage();

    private static HttpRequestDef<DeletePersistentStorageRequest, DeletePersistentStorageResponse> genForDeletePersistentStorage() {
        // basic
        HttpRequestDef.Builder<DeletePersistentStorageRequest, DeletePersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePersistentStorageRequest.class, DeletePersistentStorageResponse.class)
            .withName("DeletePersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages/{storage_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePersistentStorageRequest::getStorageId,
                DeletePersistentStorageRequest::setStorageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> deleteStorageClaim =
        genForDeleteStorageClaim();

    private static HttpRequestDef<DeleteStorageClaimRequest, DeleteStorageClaimResponse> genForDeleteStorageClaim() {
        // basic
        HttpRequestDef.Builder<DeleteStorageClaimRequest, DeleteStorageClaimResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteStorageClaimRequest.class, DeleteStorageClaimResponse.class)
                .withName("DeleteStorageClaim")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/delete-storage-claim")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStorageClaimRequest::getStorageId, DeleteStorageClaimRequest::setStorageId));
        builder.<DeleteStorageClaimReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStorageClaimReq.class),
            f -> f.withMarshaller(DeleteStorageClaimRequest::getBody, DeleteStorageClaimRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> deleteUserStorageAttachment =
        genForDeleteUserStorageAttachment();

    private static HttpRequestDef<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> genForDeleteUserStorageAttachment() {
        // basic
        HttpRequestDef.Builder<DeleteUserStorageAttachmentRequest, DeleteUserStorageAttachmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteUserStorageAttachmentRequest.class,
                    DeleteUserStorageAttachmentResponse.class)
                .withName("DeleteUserStorageAttachment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/delete-user-attachment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getStorageId,
                DeleteUserStorageAttachmentRequest::setStorageId));
        builder.<DeleteUserStorageAttachmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteUserStorageAttachmentReq.class),
            f -> f.withMarshaller(DeleteUserStorageAttachmentRequest::getBody,
                DeleteUserStorageAttachmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> listPersistentStorage =
        genForListPersistentStorage();

    private static HttpRequestDef<ListPersistentStorageRequest, ListPersistentStorageResponse> genForListPersistentStorage() {
        // basic
        HttpRequestDef.Builder<ListPersistentStorageRequest, ListPersistentStorageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPersistentStorageRequest.class, ListPersistentStorageResponse.class)
            .withName("ListPersistentStorage")
            .withUri("/v1/{project_id}/persistent-storages")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getOffset, ListPersistentStorageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getLimit, ListPersistentStorageRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getStorageId,
                ListPersistentStorageRequest::setStorageId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPersistentStorageRequest::getName, ListPersistentStorageRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSfs3StorageRequest, ListSfs3StorageResponse> listSfs3Storage =
        genForListSfs3Storage();

    private static HttpRequestDef<ListSfs3StorageRequest, ListSfs3StorageResponse> genForListSfs3Storage() {
        // basic
        HttpRequestDef.Builder<ListSfs3StorageRequest, ListSfs3StorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSfs3StorageRequest.class, ListSfs3StorageResponse.class)
                .withName("ListSfs3Storage")
                .withUri("/v1/persistent-storages/actions/list-sfs-storages")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSfs3StorageRequest::getOffset, ListSfs3StorageRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSfs3StorageRequest::getLimit, ListSfs3StorageRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSfs3StorageRequest::getName, ListSfs3StorageRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> listShareFolder =
        genForListShareFolder();

    private static HttpRequestDef<ListShareFolderRequest, ListShareFolderResponse> genForListShareFolder() {
        // basic
        HttpRequestDef.Builder<ListShareFolderRequest, ListShareFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShareFolderRequest.class, ListShareFolderResponse.class)
                .withName("ListShareFolder")
                .withUri("/v1/{project_id}/persistent-storages/actions/list-share-folders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFolderRequest::getOffset, ListShareFolderRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListShareFolderRequest::getLimit, ListShareFolderRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageId, ListShareFolderRequest::setStorageId));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getStorageClaimId,
                ListShareFolderRequest::setStorageClaimId));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareFolderRequest::getPath, ListShareFolderRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> listStorageAssignment =
        genForListStorageAssignment();

    private static HttpRequestDef<ListStorageAssignmentRequest, ListStorageAssignmentResponse> genForListStorageAssignment() {
        // basic
        HttpRequestDef.Builder<ListStorageAssignmentRequest, ListStorageAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStorageAssignmentRequest.class, ListStorageAssignmentResponse.class)
            .withName("ListStorageAssignment")
            .withUri("/v1/{project_id}/persistent-storages/actions/list-attachments")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getOffset, ListStorageAssignmentRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getLimit, ListStorageAssignmentRequest::setLimit));
        builder.<String>withRequestField("storage_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageId,
                ListStorageAssignmentRequest::setStorageId));
        builder.<String>withRequestField("claim_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getClaimMode,
                ListStorageAssignmentRequest::setClaimMode));
        builder.<String>withRequestField("storage_claim_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getStorageClaimId,
                ListStorageAssignmentRequest::setStorageClaimId));
        builder.<String>withRequestField("attach",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttach, ListStorageAssignmentRequest::setAttach));
        builder.<String>withRequestField("attach_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageAssignmentRequest::getAttachType,
                ListStorageAssignmentRequest::setAttachType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> listStoragePolicyStatement =
        genForListStoragePolicyStatement();

    private static HttpRequestDef<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> genForListStoragePolicyStatement() {
        // basic
        HttpRequestDef.Builder<ListStoragePolicyStatementRequest, ListStoragePolicyStatementResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStoragePolicyStatementRequest.class,
                    ListStoragePolicyStatementResponse.class)
                .withName("ListStoragePolicyStatement")
                .withUri("/v1/{project_id}/storages-policy/actions/list-statements")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getOffset,
                ListStoragePolicyStatementRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStoragePolicyStatementRequest::getLimit,
                ListStoragePolicyStatementRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> updateShareFolderAssignment =
        genForUpdateShareFolderAssignment();

    private static HttpRequestDef<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> genForUpdateShareFolderAssignment() {
        // basic
        HttpRequestDef.Builder<UpdateShareFolderAssignmentRequest, UpdateShareFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateShareFolderAssignmentRequest.class,
                    UpdateShareFolderAssignmentResponse.class)
                .withName("UpdateShareFolderAssignment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/assign-share-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getStorageId,
                UpdateShareFolderAssignmentRequest::setStorageId));
        builder.<AssignShareFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignShareFolderReq.class),
            f -> f.withMarshaller(UpdateShareFolderAssignmentRequest::getBody,
                UpdateShareFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> updateUserFolderAssignment =
        genForUpdateUserFolderAssignment();

    private static HttpRequestDef<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> genForUpdateUserFolderAssignment() {
        // basic
        HttpRequestDef.Builder<UpdateUserFolderAssignmentRequest, UpdateUserFolderAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateUserFolderAssignmentRequest.class,
                    UpdateUserFolderAssignmentResponse.class)
                .withName("UpdateUserFolderAssignment")
                .withUri("/v1/{project_id}/persistent-storages/{storage_id}/actions/assign-folder")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("storage_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getStorageId,
                UpdateUserFolderAssignmentRequest::setStorageId));
        builder.<AssignUserFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignUserFolderReq.class),
            f -> f.withMarshaller(UpdateUserFolderAssignmentRequest::getBody,
                UpdateUserFolderAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroup =
        genForCreatePolicyGroup();

    private static HttpRequestDef<CreatePolicyGroupRequest, CreatePolicyGroupResponse> genForCreatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<CreatePolicyGroupRequest, CreatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyGroupRequest.class, CreatePolicyGroupResponse.class)
                .withName("CreatePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyGroupReq.class),
            f -> f.withMarshaller(CreatePolicyGroupRequest::getBody, CreatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplate =
        genForCreatePolicyTemplate();

    private static HttpRequestDef<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> genForCreatePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePolicyTemplateRequest.class, CreatePolicyTemplateResponse.class)
            .withName("CreatePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates")
            .withContentType("application/json");

        // requests
        builder.<CreatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyTemplateReq.class),
            f -> f.withMarshaller(CreatePolicyTemplateRequest::getBody, CreatePolicyTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroup =
        genForDeletePolicyGroup();

    private static HttpRequestDef<DeletePolicyGroupRequest, DeletePolicyGroupResponse> genForDeletePolicyGroup() {
        // basic
        HttpRequestDef.Builder<DeletePolicyGroupRequest, DeletePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyGroupRequest.class, DeletePolicyGroupResponse.class)
                .withName("DeletePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyGroupRequest::getPolicyGroupId,
                DeletePolicyGroupRequest::setPolicyGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> deletePolicyTemplate =
        genForDeletePolicyTemplate();

    private static HttpRequestDef<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> genForDeletePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<DeletePolicyTemplateRequest, DeletePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePolicyTemplateRequest.class, DeletePolicyTemplateResponse.class)
            .withName("DeletePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates/{policy_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyTemplateRequest::getPolicyTemplateId,
                DeletePolicyTemplateRequest::setPolicyTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroup =
        genForListPolicyGroup();

    private static HttpRequestDef<ListPolicyGroupRequest, ListPolicyGroupResponse> genForListPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListPolicyGroupRequest, ListPolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyGroupRequest.class, ListPolicyGroupResponse.class)
                .withName("ListPolicyGroup")
                .withUri("/v1/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, ListPolicyGroupRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, ListPolicyGroupRequest::setLimit));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupName,
                ListPolicyGroupRequest::setPolicyGroupName));
        builder.<Integer>withRequestField("policy_group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupType,
                ListPolicyGroupRequest::setPolicyGroupType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse> listPolicyGroupDetailInfo =
        genForListPolicyGroupDetailInfo();

    private static HttpRequestDef<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse> genForListPolicyGroupDetailInfo() {
        // basic
        HttpRequestDef.Builder<ListPolicyGroupDetailInfoRequest, ListPolicyGroupDetailInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPolicyGroupDetailInfoRequest.class,
                    ListPolicyGroupDetailInfoResponse.class)
                .withName("ListPolicyGroupDetailInfo")
                .withUri("/v1/{project_id}/policy-groups/show/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupDetailInfoRequest::getOffset,
                ListPolicyGroupDetailInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupDetailInfoRequest::getLimit,
                ListPolicyGroupDetailInfoRequest::setLimit));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupDetailInfoRequest::getPolicyGroupName,
                ListPolicyGroupDetailInfoRequest::setPolicyGroupName));
        builder.<Integer>withRequestField("policy_group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupDetailInfoRequest::getPolicyGroupType,
                ListPolicyGroupDetailInfoRequest::setPolicyGroupType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse> listPolicyOfPolicyGroup =
        genForListPolicyOfPolicyGroup();

    private static HttpRequestDef<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse> genForListPolicyOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListPolicyOfPolicyGroupRequest, ListPolicyOfPolicyGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPolicyOfPolicyGroupRequest.class, ListPolicyOfPolicyGroupResponse.class)
            .withName("ListPolicyOfPolicyGroup")
            .withUri("/v1/{project_id}/policy-groups/{policy_group_id}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyOfPolicyGroupRequest::getPolicyGroupId,
                ListPolicyOfPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyOfPolicyGroupRequest::getPolicyType,
                ListPolicyOfPolicyGroupRequest::setPolicyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> listPolicyTemplate =
        genForListPolicyTemplate();

    private static HttpRequestDef<ListPolicyTemplateRequest, ListPolicyTemplateResponse> genForListPolicyTemplate() {
        // basic
        HttpRequestDef.Builder<ListPolicyTemplateRequest, ListPolicyTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyTemplateRequest.class, ListPolicyTemplateResponse.class)
                .withName("ListPolicyTemplate")
                .withUri("/v1/{project_id}/policy-templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getOffset, ListPolicyTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getLimit, ListPolicyTemplateRequest::setLimit));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyTemplateRequest::getPolicyGroupName,
                ListPolicyTemplateRequest::setPolicyGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> listTargetsOfPolicyGroup =
        genForListTargetsOfPolicyGroup();

    private static HttpRequestDef<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> genForListTargetsOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListTargetsOfPolicyGroupRequest, ListTargetsOfPolicyGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListTargetsOfPolicyGroupRequest.class, ListTargetsOfPolicyGroupResponse.class)
                .withName("ListTargetsOfPolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}/target")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getPolicyGroupId,
                ListTargetsOfPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetsOfPolicyGroupRequest::getTargetType,
                ListTargetsOfPolicyGroupRequest::setTargetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> showOriginalPolicyInfo =
        genForShowOriginalPolicyInfo();

    private static HttpRequestDef<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> genForShowOriginalPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ShowOriginalPolicyInfoRequest, ShowOriginalPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOriginalPolicyInfoRequest.class, ShowOriginalPolicyInfoResponse.class)
            .withName("ShowOriginalPolicyInfo")
            .withUri("/v1/{project_id}/policy-groups/actions/list-original-policy")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyGroupRequest, ShowPolicyGroupResponse> showPolicyGroup =
        genForShowPolicyGroup();

    private static HttpRequestDef<ShowPolicyGroupRequest, ShowPolicyGroupResponse> genForShowPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ShowPolicyGroupRequest, ShowPolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyGroupRequest.class, ShowPolicyGroupResponse.class)
                .withName("ShowPolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyGroupRequest::getPolicyGroupId, ShowPolicyGroupRequest::setPolicyGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroup =
        genForUpdatePolicyGroup();

    private static HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> genForUpdatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyGroupRequest.class, UpdatePolicyGroupResponse.class)
                .withName("UpdatePolicyGroup")
                .withUri("/v1/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getPolicyGroupId,
                UpdatePolicyGroupRequest::setPolicyGroupId));
        builder.<UpdatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyGroupReq.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getBody, UpdatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> updatePolicyTemplate =
        genForUpdatePolicyTemplate();

    private static HttpRequestDef<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> genForUpdatePolicyTemplate() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdatePolicyTemplateRequest.class, UpdatePolicyTemplateResponse.class)
            .withName("UpdatePolicyTemplate")
            .withUri("/v1/{project_id}/policy-templates/{policy_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getPolicyTemplateId,
                UpdatePolicyTemplateRequest::setPolicyTemplateId));
        builder.<UpdatePolicyTemplateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyTemplateReq.class),
            f -> f.withMarshaller(UpdatePolicyTemplateRequest::getBody, UpdatePolicyTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> checkQuota = genForCheckQuota();

    private static HttpRequestDef<CheckQuotaRequest, CheckQuotaResponse> genForCheckQuota() {
        // basic
        HttpRequestDef.Builder<CheckQuotaRequest, CheckQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckQuotaRequest.class, CheckQuotaResponse.class)
                .withName("CheckQuota")
                .withUri("/v1/{project_id}/check/quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getProductId, CheckQuotaRequest::setProductId));
        builder.<String>withRequestField("flavor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getFlavorId, CheckQuotaRequest::setFlavorId));
        builder.<Integer>withRequestField("subscription_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getSubscriptionNum, CheckQuotaRequest::setSubscriptionNum));
        builder.<Integer>withRequestField("disk_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskSize, CheckQuotaRequest::setDiskSize));
        builder.<Integer>withRequestField("disk_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDiskNum, CheckQuotaRequest::setDiskNum));
        builder.<Boolean>withRequestField("is_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CheckQuotaRequest::getIsPeriod, CheckQuotaRequest::setIsPeriod));
        builder.<String>withRequestField("deh_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getDehId, CheckQuotaRequest::setDehId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckQuotaRequest::getClusterId, CheckQuotaRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse> createOrUpdateScalingPolicy =
        genForCreateOrUpdateScalingPolicy();

    private static HttpRequestDef<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse> genForCreateOrUpdateScalingPolicy() {
        // basic
        HttpRequestDef.Builder<CreateOrUpdateScalingPolicyRequest, CreateOrUpdateScalingPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateOrUpdateScalingPolicyRequest.class,
                    CreateOrUpdateScalingPolicyResponse.class)
                .withName("CreateOrUpdateScalingPolicy")
                .withUri("/v1/{project_id}/scaling-policy")
                .withContentType("application/json");

        // requests
        builder.<CreateOrUpdateScalingPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrUpdateScalingPolicyReq.class),
            f -> f.withMarshaller(CreateOrUpdateScalingPolicyRequest::getBody,
                CreateOrUpdateScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> deleteScalingPolicy =
        genForDeleteScalingPolicy();

    private static HttpRequestDef<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> genForDeleteScalingPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteScalingPolicyRequest, DeleteScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScalingPolicyRequest.class, DeleteScalingPolicyResponse.class)
            .withName("DeleteScalingPolicy")
            .withUri("/v1/{project_id}/scaling-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScalingPolicyRequest::getServerGroupId,
                DeleteScalingPolicyRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> showScalingPolicy =
        genForShowScalingPolicy();

    private static HttpRequestDef<ShowScalingPolicyRequest, ShowScalingPolicyResponse> genForShowScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowScalingPolicyRequest, ShowScalingPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScalingPolicyRequest.class, ShowScalingPolicyResponse.class)
                .withName("ShowScalingPolicy")
                .withUri("/v1/{project_id}/scaling-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScalingPolicyRequest::getServerGroupId,
                ShowScalingPolicyRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse> batchDeleteScheduleTask =
        genForBatchDeleteScheduleTask();

    private static HttpRequestDef<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse> genForBatchDeleteScheduleTask() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScheduleTaskRequest, BatchDeleteScheduleTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteScheduleTaskRequest.class, BatchDeleteScheduleTaskResponse.class)
            .withName("BatchDeleteScheduleTask")
            .withUri("/v1/{project_id}/schedule-task/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteScheduleTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteScheduleTaskReq.class),
            f -> f.withMarshaller(BatchDeleteScheduleTaskRequest::getBody, BatchDeleteScheduleTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTask =
        genForCreateScheduleTask();

    private static HttpRequestDef<CreateScheduleTaskRequest, CreateScheduleTaskResponse> genForCreateScheduleTask() {
        // basic
        HttpRequestDef.Builder<CreateScheduleTaskRequest, CreateScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScheduleTaskRequest.class, CreateScheduleTaskResponse.class)
                .withName("CreateScheduleTask")
                .withUri("/v1/{project_id}/schedule-task")
                .withContentType("application/json");

        // requests
        builder.<CreateScheduleTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScheduleTaskReq.class),
            f -> f.withMarshaller(CreateScheduleTaskRequest::getBody, CreateScheduleTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTask =
        genForDeleteScheduleTask();

    private static HttpRequestDef<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> genForDeleteScheduleTask() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScheduleTaskRequest.class, DeleteScheduleTaskResponse.class)
                .withName("DeleteScheduleTask")
                .withUri("/v1/{project_id}/schedule-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTaskRequest::getTaskId, DeleteScheduleTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFutureExecutionsRequest, ListFutureExecutionsResponse> listFutureExecutions =
        genForListFutureExecutions();

    private static HttpRequestDef<ListFutureExecutionsRequest, ListFutureExecutionsResponse> genForListFutureExecutions() {
        // basic
        HttpRequestDef.Builder<ListFutureExecutionsRequest, ListFutureExecutionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListFutureExecutionsRequest.class, ListFutureExecutionsResponse.class)
            .withName("ListFutureExecutions")
            .withUri("/v1/{project_id}/schedule-task/future-executions")
            .withContentType("application/json");

        // requests
        builder.<ListFutureExecutionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFutureExecutionsReq.class),
            f -> f.withMarshaller(ListFutureExecutionsRequest::getBody, ListFutureExecutionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleTasksRequest, ListScheduleTasksResponse> listScheduleTasks =
        genForListScheduleTasks();

    private static HttpRequestDef<ListScheduleTasksRequest, ListScheduleTasksResponse> genForListScheduleTasks() {
        // basic
        HttpRequestDef.Builder<ListScheduleTasksRequest, ListScheduleTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduleTasksRequest.class, ListScheduleTasksResponse.class)
                .withName("ListScheduleTasks")
                .withUri("/v1/{project_id}/schedule-task")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleTasksRequest::getOffset, ListScheduleTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduleTasksRequest::getLimit, ListScheduleTasksRequest::setLimit));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleTasksRequest::getTaskName, ListScheduleTasksRequest::setTaskName));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleTasksRequest::getTaskType, ListScheduleTasksRequest::setTaskType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse> listTaskExecuteDetail =
        genForListTaskExecuteDetail();

    private static HttpRequestDef<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse> genForListTaskExecuteDetail() {
        // basic
        HttpRequestDef.Builder<ListTaskExecuteDetailRequest, ListTaskExecuteDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTaskExecuteDetailRequest.class, ListTaskExecuteDetailResponse.class)
            .withName("ListTaskExecuteDetail")
            .withUri("/v1/{project_id}/schedule-task/{execute_history_id}/execute-detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_history_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskExecuteDetailRequest::getExecuteHistoryId,
                ListTaskExecuteDetailRequest::setExecuteHistoryId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskExecuteDetailRequest::getOffset, ListTaskExecuteDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskExecuteDetailRequest::getLimit, ListTaskExecuteDetailRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse> listTaskExecuteHistory =
        genForListTaskExecuteHistory();

    private static HttpRequestDef<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse> genForListTaskExecuteHistory() {
        // basic
        HttpRequestDef.Builder<ListTaskExecuteHistoryRequest, ListTaskExecuteHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTaskExecuteHistoryRequest.class, ListTaskExecuteHistoryResponse.class)
            .withName("ListTaskExecuteHistory")
            .withUri("/v1/{project_id}/schedule-task/{task_id}/execute-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskExecuteHistoryRequest::getTaskId, ListTaskExecuteHistoryRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskExecuteHistoryRequest::getOffset, ListTaskExecuteHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskExecuteHistoryRequest::getLimit, ListTaskExecuteHistoryRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduleTaskRequest, ShowScheduleTaskResponse> showScheduleTask =
        genForShowScheduleTask();

    private static HttpRequestDef<ShowScheduleTaskRequest, ShowScheduleTaskResponse> genForShowScheduleTask() {
        // basic
        HttpRequestDef.Builder<ShowScheduleTaskRequest, ShowScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScheduleTaskRequest.class, ShowScheduleTaskResponse.class)
                .withName("ShowScheduleTask")
                .withUri("/v1/{project_id}/schedule-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScheduleTaskRequest::getTaskId, ShowScheduleTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse> updateScheduleTask =
        genForUpdateScheduleTask();

    private static HttpRequestDef<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse> genForUpdateScheduleTask() {
        // basic
        HttpRequestDef.Builder<UpdateScheduleTaskRequest, UpdateScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateScheduleTaskRequest.class, UpdateScheduleTaskResponse.class)
                .withName("UpdateScheduleTask")
                .withUri("/v1/{project_id}/schedule-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduleTaskRequest::getTaskId, UpdateScheduleTaskRequest::setTaskId));
        builder.<UpdateScheduleTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduleTaskReq.class),
            f -> f.withMarshaller(UpdateScheduleTaskRequest::getBody, UpdateScheduleTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeServerImageRequest, BatchChangeServerImageResponse> batchChangeServerImage =
        genForBatchChangeServerImage();

    private static HttpRequestDef<BatchChangeServerImageRequest, BatchChangeServerImageResponse> genForBatchChangeServerImage() {
        // basic
        HttpRequestDef.Builder<BatchChangeServerImageRequest, BatchChangeServerImageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchChangeServerImageRequest.class, BatchChangeServerImageResponse.class)
            .withName("BatchChangeServerImage")
            .withUri("/v1/{project_id}/app-servers/actions/batch-change-image")
            .withContentType("application/json");

        // requests
        builder.<BatchChangeServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchChangeServerImageReq.class),
            f -> f.withMarshaller(BatchChangeServerImageRequest::getBody, BatchChangeServerImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse> batchChangeServerMaintainMode =
        genForBatchChangeServerMaintainMode();

    private static HttpRequestDef<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse> genForBatchChangeServerMaintainMode() {
        // basic
        HttpRequestDef.Builder<BatchChangeServerMaintainModeRequest, BatchChangeServerMaintainModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    BatchChangeServerMaintainModeRequest.class,
                    BatchChangeServerMaintainModeResponse.class)
                .withName("BatchChangeServerMaintainMode")
                .withUri("/v1/{project_id}/app-servers/actions/batch-maint")
                .withContentType("application/json");

        // requests
        builder.<BatchChangeMaintainServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchChangeMaintainServerReq.class),
            f -> f.withMarshaller(BatchChangeServerMaintainModeRequest::getBody,
                BatchChangeServerMaintainModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> batchDeleteServer =
        genForBatchDeleteServer();

    private static HttpRequestDef<BatchDeleteServerRequest, BatchDeleteServerResponse> genForBatchDeleteServer() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerRequest, BatchDeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteServerRequest.class, BatchDeleteServerResponse.class)
                .withName("BatchDeleteServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerReq.class),
            f -> f.withMarshaller(BatchDeleteServerRequest::getBody, BatchDeleteServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> batchMigrateHostsServer =
        genForBatchMigrateHostsServer();

    private static HttpRequestDef<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> genForBatchMigrateHostsServer() {
        // basic
        HttpRequestDef.Builder<BatchMigrateHostsServerRequest, BatchMigrateHostsServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchMigrateHostsServerRequest.class, BatchMigrateHostsServerResponse.class)
            .withName("BatchMigrateHostsServer")
            .withUri("/v1/{project_id}/app-servers/hosts/batch-migrate")
            .withContentType("application/json");

        // requests
        builder.<BatchMigrateServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchMigrateServerReq.class),
            f -> f.withMarshaller(BatchMigrateHostsServerRequest::getBody, BatchMigrateHostsServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> batchRebootServer =
        genForBatchRebootServer();

    private static HttpRequestDef<BatchRebootServerRequest, BatchRebootServerResponse> genForBatchRebootServer() {
        // basic
        HttpRequestDef.Builder<BatchRebootServerRequest, BatchRebootServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchRebootServerRequest.class, BatchRebootServerResponse.class)
                .withName("BatchRebootServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-reboot")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchRebootServerRequest::getBody, BatchRebootServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchReinstallServerRequest, BatchReinstallServerResponse> batchReinstallServer =
        genForBatchReinstallServer();

    private static HttpRequestDef<BatchReinstallServerRequest, BatchReinstallServerResponse> genForBatchReinstallServer() {
        // basic
        HttpRequestDef.Builder<BatchReinstallServerRequest, BatchReinstallServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchReinstallServerRequest.class, BatchReinstallServerResponse.class)
            .withName("BatchReinstallServer")
            .withUri("/v1/{project_id}/app-servers/actions/batch-reinstall")
            .withContentType("application/json");

        // requests
        builder.<BatchReinstallServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchReinstallServerReq.class),
            f -> f.withMarshaller(BatchReinstallServerRequest::getBody, BatchReinstallServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> batchRejoinDomain =
        genForBatchRejoinDomain();

    private static HttpRequestDef<BatchRejoinDomainRequest, BatchRejoinDomainResponse> genForBatchRejoinDomain() {
        // basic
        HttpRequestDef.Builder<BatchRejoinDomainRequest, BatchRejoinDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchRejoinDomainRequest.class, BatchRejoinDomainResponse.class)
                .withName("BatchRejoinDomain")
                .withUri("/v1/{project_id}/app-servers/actions/batch-rejoin-domain")
                .withContentType("application/json");

        // requests
        builder.<BatchRejoinDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRejoinDomainReq.class),
            f -> f.withMarshaller(BatchRejoinDomainRequest::getBody, BatchRejoinDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> batchStartServer =
        genForBatchStartServer();

    private static HttpRequestDef<BatchStartServerRequest, BatchStartServerResponse> genForBatchStartServer() {
        // basic
        HttpRequestDef.Builder<BatchStartServerRequest, BatchStartServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchStartServerRequest.class, BatchStartServerResponse.class)
                .withName("BatchStartServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-start")
                .withContentType("application/json");

        // requests
        builder.<BatchStartServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartServerReq.class),
            f -> f.withMarshaller(BatchStartServerRequest::getBody, BatchStartServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> batchStopServer =
        genForBatchStopServer();

    private static HttpRequestDef<BatchStopServerRequest, BatchStopServerResponse> genForBatchStopServer() {
        // basic
        HttpRequestDef.Builder<BatchStopServerRequest, BatchStopServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchStopServerRequest.class, BatchStopServerResponse.class)
                .withName("BatchStopServer")
                .withUri("/v1/{project_id}/app-servers/actions/batch-stop")
                .withContentType("application/json");

        // requests
        builder.<ServerHaltReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServerHaltReq.class),
            f -> f.withMarshaller(BatchStopServerRequest::getBody, BatchStopServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> batchUpdateTsvi =
        genForBatchUpdateTsvi();

    private static HttpRequestDef<BatchUpdateTsviRequest, BatchUpdateTsviResponse> genForBatchUpdateTsvi() {
        // basic
        HttpRequestDef.Builder<BatchUpdateTsviRequest, BatchUpdateTsviResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, BatchUpdateTsviRequest.class, BatchUpdateTsviResponse.class)
                .withName("BatchUpdateTsvi")
                .withUri("/v1/{project_id}/app-servers/actions/batch-update-tsvi")
                .withContentType("application/json");

        // requests
        builder.<UpdateTsviReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTsviReq.class),
            f -> f.withMarshaller(BatchUpdateTsviRequest::getBody, BatchUpdateTsviRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse> batchUpgradeHdaVersion =
        genForBatchUpgradeHdaVersion();

    private static HttpRequestDef<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse> genForBatchUpgradeHdaVersion() {
        // basic
        HttpRequestDef.Builder<BatchUpgradeHdaVersionRequest, BatchUpgradeHdaVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, BatchUpgradeHdaVersionRequest.class, BatchUpgradeHdaVersionResponse.class)
            .withName("BatchUpgradeHdaVersion")
            .withUri("/v1/{project_id}/app-servers/access-agent/actions/upgrade")
            .withContentType("application/json");

        // requests
        builder.<BatchUpgradeHdaVersionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpgradeHdaVersionReq.class),
            f -> f.withMarshaller(BatchUpgradeHdaVersionRequest::getBody, BatchUpgradeHdaVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> changeServerImage =
        genForChangeServerImage();

    private static HttpRequestDef<ChangeServerImageRequest, ChangeServerImageResponse> genForChangeServerImage() {
        // basic
        HttpRequestDef.Builder<ChangeServerImageRequest, ChangeServerImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeServerImageRequest.class, ChangeServerImageResponse.class)
                .withName("ChangeServerImage")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/change-image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeServerImageRequest::getServerId, ChangeServerImageRequest::setServerId));
        builder.<ChangeServerImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeServerImageReq.class),
            f -> f.withMarshaller(ChangeServerImageRequest::getBody, ChangeServerImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> createAppServers =
        genForCreateAppServers();

    private static HttpRequestDef<CreateAppServersRequest, CreateAppServersResponse> genForCreateAppServers() {
        // basic
        HttpRequestDef.Builder<CreateAppServersRequest, CreateAppServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppServersRequest.class, CreateAppServersResponse.class)
                .withName("CreateAppServers")
                .withUri("/v1/{project_id}/app-servers/actions/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Linked-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppServersRequest::getXLinkedId, CreateAppServersRequest::setXLinkedId));
        builder.<String>withRequestField("Service-Transaction-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppServersRequest::getServiceTransactionId,
                CreateAppServersRequest::setServiceTransactionId));
        builder.<CreateAppServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppServerReq.class),
            f -> f.withMarshaller(CreateAppServersRequest::getBody, CreateAppServersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerRequest, DeleteServerResponse> deleteServer = genForDeleteServer();

    private static HttpRequestDef<DeleteServerRequest, DeleteServerResponse> genForDeleteServer() {
        // basic
        HttpRequestDef.Builder<DeleteServerRequest, DeleteServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerRequest.class, DeleteServerResponse.class)
                .withName("DeleteServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerRequest::getServerId, DeleteServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse> listAccessAgentLatestVersion =
        genForListAccessAgentLatestVersion();

    private static HttpRequestDef<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse> genForListAccessAgentLatestVersion() {
        // basic
        HttpRequestDef.Builder<ListAccessAgentLatestVersionRequest, ListAccessAgentLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccessAgentLatestVersionRequest.class,
                    ListAccessAgentLatestVersionResponse.class)
                .withName("ListAccessAgentLatestVersion")
                .withUri("/v1/{project_id}/app-servers/access-agent/actions/show-latest-version")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse> listServerHdaDetails =
        genForListServerHdaDetails();

    private static HttpRequestDef<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse> genForListServerHdaDetails() {
        // basic
        HttpRequestDef.Builder<ListServerHdaDetailsRequest, ListServerHdaDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServerHdaDetailsRequest.class, ListServerHdaDetailsResponse.class)
            .withName("ListServerHdaDetails")
            .withUri("/v1/{project_id}/app-servers/access-agent/list")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerHdaDetailsRequest::getOffset, ListServerHdaDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerHdaDetailsRequest::getLimit, ListServerHdaDetailsRequest::setLimit));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerHdaDetailsRequest::getServerGroupId,
                ListServerHdaDetailsRequest::setServerGroupId));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerHdaDetailsRequest::getServerName,
                ListServerHdaDetailsRequest::setServerName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse> listServerHdaUpgradeRecords =
        genForListServerHdaUpgradeRecords();

    private static HttpRequestDef<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse> genForListServerHdaUpgradeRecords() {
        // basic
        HttpRequestDef.Builder<ListServerHdaUpgradeRecordsRequest, ListServerHdaUpgradeRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListServerHdaUpgradeRecordsRequest.class,
                    ListServerHdaUpgradeRecordsResponse.class)
                .withName("ListServerHdaUpgradeRecords")
                .withUri("/v1/{project_id}/app-servers/access-agent/upgrade-record")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerHdaUpgradeRecordsRequest::getOffset,
                ListServerHdaUpgradeRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerHdaUpgradeRecordsRequest::getLimit,
                ListServerHdaUpgradeRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerMetricDataRequest, ListServerMetricDataResponse> listServerMetricData =
        genForListServerMetricData();

    private static HttpRequestDef<ListServerMetricDataRequest, ListServerMetricDataResponse> genForListServerMetricData() {
        // basic
        HttpRequestDef.Builder<ListServerMetricDataRequest, ListServerMetricDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServerMetricDataRequest.class, ListServerMetricDataResponse.class)
            .withName("ListServerMetricData")
            .withUri("/v1/{project_id}/app-servers/server-metric-data/{server_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getServerId, ListServerMetricDataRequest::setServerId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getNamespace,
                ListServerMetricDataRequest::setNamespace));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getMetricName,
                ListServerMetricDataRequest::setMetricName));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getFrom, ListServerMetricDataRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getTo, ListServerMetricDataRequest::setTo));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getPeriod, ListServerMetricDataRequest::setPeriod));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerMetricDataRequest::getFilter, ListServerMetricDataRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersRequest, ListServersResponse> listServers = genForListServers();

    private static HttpRequestDef<ListServersRequest, ListServersResponse> genForListServers() {
        // basic
        HttpRequestDef.Builder<ListServersRequest, ListServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersRequest.class, ListServersResponse.class)
                .withName("ListServers")
                .withUri("/v1/{project_id}/app-servers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getOffset, ListServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServersRequest::getLimit, ListServersRequest::setLimit));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerGroupId, ListServersRequest::setServerGroupId));
        builder.<String>withRequestField("server_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerName, ListServersRequest::setServerName));
        builder.<String>withRequestField("machine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMachineName, ListServersRequest::setMachineName));
        builder.<String>withRequestField("ip_addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getIpAddr, ListServersRequest::setIpAddr));
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getServerId, ListServersRequest::setServerId));
        builder.<String>withRequestField("maintain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getMaintainStatus, ListServersRequest::setMaintainStatus));
        builder.<String>withRequestField("scaling_auto_create",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersRequest::getScalingAutoCreate, ListServersRequest::setScalingAutoCreate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> reinstallServer =
        genForReinstallServer();

    private static HttpRequestDef<ReinstallServerRequest, ReinstallServerResponse> genForReinstallServer() {
        // basic
        HttpRequestDef.Builder<ReinstallServerRequest, ReinstallServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ReinstallServerRequest.class, ReinstallServerResponse.class)
                .withName("ReinstallServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/reinstall")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReinstallServerRequest::getServerId, ReinstallServerRequest::setServerId));
        builder.<ReinstallServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReinstallServerReq.class),
            f -> f.withMarshaller(ReinstallServerRequest::getBody, ReinstallServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse> showAccessAgentLatestVersion =
        genForShowAccessAgentLatestVersion();

    private static HttpRequestDef<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse> genForShowAccessAgentLatestVersion() {
        // basic
        HttpRequestDef.Builder<ShowAccessAgentLatestVersionRequest, ShowAccessAgentLatestVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAccessAgentLatestVersionRequest.class,
                    ShowAccessAgentLatestVersionResponse.class)
                .withName("ShowAccessAgentLatestVersion")
                .withUri("/v1/{project_id}/app-servers/access-agent/latest-version")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHdaUpgradeFlagRequest, ShowHdaUpgradeFlagResponse> showHdaUpgradeFlag =
        genForShowHdaUpgradeFlag();

    private static HttpRequestDef<ShowHdaUpgradeFlagRequest, ShowHdaUpgradeFlagResponse> genForShowHdaUpgradeFlag() {
        // basic
        HttpRequestDef.Builder<ShowHdaUpgradeFlagRequest, ShowHdaUpgradeFlagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHdaUpgradeFlagRequest.class, ShowHdaUpgradeFlagResponse.class)
                .withName("ShowHdaUpgradeFlag")
                .withUri("/v1/{project_id}/app-servers/access-agent/upgrade-flag")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerRequest, ShowServerResponse> showServer = genForShowServer();

    private static HttpRequestDef<ShowServerRequest, ShowServerResponse> genForShowServer() {
        // basic
        HttpRequestDef.Builder<ShowServerRequest, ShowServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerRequest.class, ShowServerResponse.class)
                .withName("ShowServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerRequest::getServerId, ShowServerRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerMetricDataRequest, ShowServerMetricDataResponse> showServerMetricData =
        genForShowServerMetricData();

    private static HttpRequestDef<ShowServerMetricDataRequest, ShowServerMetricDataResponse> genForShowServerMetricData() {
        // basic
        HttpRequestDef.Builder<ShowServerMetricDataRequest, ShowServerMetricDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowServerMetricDataRequest.class, ShowServerMetricDataResponse.class)
            .withName("ShowServerMetricData")
            .withUri("/v1/{project_id}/app-servers/metric-data/{server_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerMetricDataRequest::getServerId, ShowServerMetricDataRequest::setServerId));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ShowServerMetricDataRequest::getStartTime,
                ShowServerMetricDataRequest::setStartTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ShowServerMetricDataRequest::getEndTime, ShowServerMetricDataRequest::setEndTime));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerMetricDataRequest::getMetricName,
                ShowServerMetricDataRequest::setMetricName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerVncRequest, ShowServerVncResponse> showServerVnc =
        genForShowServerVnc();

    private static HttpRequestDef<ShowServerVncRequest, ShowServerVncResponse> genForShowServerVnc() {
        // basic
        HttpRequestDef.Builder<ShowServerVncRequest, ShowServerVncResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerVncRequest.class, ShowServerVncResponse.class)
                .withName("ShowServerVnc")
                .withUri("/v1/{project_id}/app-servers/{server_id}/actions/vnc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerVncRequest::getServerId, ShowServerVncRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerRequest, UpdateServerResponse> updateServer = genForUpdateServer();

    private static HttpRequestDef<UpdateServerRequest, UpdateServerResponse> genForUpdateServer() {
        // basic
        HttpRequestDef.Builder<UpdateServerRequest, UpdateServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateServerRequest.class, UpdateServerResponse.class)
                .withName("UpdateServer")
                .withUri("/v1/{project_id}/app-servers/{server_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerRequest::getServerId, UpdateServerRequest::setServerId));
        builder.<UpdateServerReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerReq.class),
            f -> f.withMarshaller(UpdateServerRequest::getBody, UpdateServerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroup =
        genForCreateServerGroup();

    private static HttpRequestDef<CreateServerGroupRequest, CreateServerGroupResponse> genForCreateServerGroup() {
        // basic
        HttpRequestDef.Builder<CreateServerGroupRequest, CreateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServerGroupRequest.class, CreateServerGroupResponse.class)
                .withName("CreateServerGroup")
                .withUri("/v1/{project_id}/app-server-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateServerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServerGroupReq.class),
            f -> f.withMarshaller(CreateServerGroupRequest::getBody, CreateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> deleteServerGroups =
        genForDeleteServerGroups();

    private static HttpRequestDef<DeleteServerGroupsRequest, DeleteServerGroupsResponse> genForDeleteServerGroups() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupsRequest, DeleteServerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServerGroupsRequest.class, DeleteServerGroupsResponse.class)
                .withName("DeleteServerGroups")
                .withUri("/v1/{project_id}/app-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupsRequest::getServerGroupId,
                DeleteServerGroupsRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroups =
        genForListServerGroups();

    private static HttpRequestDef<ListServerGroupsRequest, ListServerGroupsResponse> genForListServerGroups() {
        // basic
        HttpRequestDef.Builder<ListServerGroupsRequest, ListServerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerGroupsRequest.class, ListServerGroupsResponse.class)
                .withName("ListServerGroups")
                .withUri("/v1/{project_id}/app-server-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getOffset, ListServerGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getLimit, ListServerGroupsRequest::setLimit));
        builder.<String>withRequestField("server_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupName,
                ListServerGroupsRequest::setServerGroupName));
        builder.<String>withRequestField("server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getServerGroupId,
                ListServerGroupsRequest::setServerGroupId));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getAppType, ListServerGroupsRequest::setAppType));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getTags, ListServerGroupsRequest::setTags));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getEnterpriseProjectId,
                ListServerGroupsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("is_secondary_server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServerGroupsRequest::getIsSecondaryServerGroup,
                ListServerGroupsRequest::setIsSecondaryServerGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse> listTenantServerGroups =
        genForListTenantServerGroups();

    private static HttpRequestDef<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse> genForListTenantServerGroups() {
        // basic
        HttpRequestDef.Builder<ListTenantServerGroupsRequest, ListTenantServerGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTenantServerGroupsRequest.class, ListTenantServerGroupsResponse.class)
            .withName("ListTenantServerGroups")
            .withUri("/v1/{project_id}/app-server-groups/actions/list")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantServerGroupsRequest::getOffset, ListTenantServerGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantServerGroupsRequest::getLimit, ListTenantServerGroupsRequest::setLimit));
        builder.<String>withRequestField("sever_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantServerGroupsRequest::getSeverGroupName,
                ListTenantServerGroupsRequest::setSeverGroupName));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantServerGroupsRequest::getAppType,
                ListTenantServerGroupsRequest::setAppType));
        builder.<String>withRequestField("is_secondary_server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantServerGroupsRequest::getIsSecondaryServerGroup,
                ListTenantServerGroupsRequest::setIsSecondaryServerGroup));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroup =
        genForShowServerGroup();

    private static HttpRequestDef<ShowServerGroupRequest, ShowServerGroupResponse> genForShowServerGroup() {
        // basic
        HttpRequestDef.Builder<ShowServerGroupRequest, ShowServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerGroupRequest.class, ShowServerGroupResponse.class)
                .withName("ShowServerGroup")
                .withUri("/v1/{project_id}/app-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerGroupRequest::getServerGroupId, ShowServerGroupRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse> showServerGroupRestrict =
        genForShowServerGroupRestrict();

    private static HttpRequestDef<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse> genForShowServerGroupRestrict() {
        // basic
        HttpRequestDef.Builder<ShowServerGroupRestrictRequest, ShowServerGroupRestrictResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowServerGroupRestrictRequest.class, ShowServerGroupRestrictResponse.class)
            .withName("ShowServerGroupRestrict")
            .withUri("/v1/{project_id}/app-server-groups/resources/restrict")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupStateRequest, ShowServerGroupStateResponse> showServerGroupState =
        genForShowServerGroupState();

    private static HttpRequestDef<ShowServerGroupStateRequest, ShowServerGroupStateResponse> genForShowServerGroupState() {
        // basic
        HttpRequestDef.Builder<ShowServerGroupStateRequest, ShowServerGroupStateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowServerGroupStateRequest.class, ShowServerGroupStateResponse.class)
            .withName("ShowServerGroupState")
            .withUri("/v1/{project_id}/app-server-groups/{server_group_id}/state")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerGroupStateRequest::getServerGroupId,
                ShowServerGroupStateRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> updateServerGroup =
        genForUpdateServerGroup();

    private static HttpRequestDef<UpdateServerGroupRequest, UpdateServerGroupResponse> genForUpdateServerGroup() {
        // basic
        HttpRequestDef.Builder<UpdateServerGroupRequest, UpdateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateServerGroupRequest.class, UpdateServerGroupResponse.class)
                .withName("UpdateServerGroup")
                .withUri("/v1/{project_id}/app-server-groups/{server_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerGroupRequest::getServerGroupId,
                UpdateServerGroupRequest::setServerGroupId));
        builder.<UpdateServerGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerGroupReq.class),
            f -> f.withMarshaller(UpdateServerGroupRequest::getBody, UpdateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateServerGroupRequest, ValidateServerGroupResponse> validateServerGroup =
        genForValidateServerGroup();

    private static HttpRequestDef<ValidateServerGroupRequest, ValidateServerGroupResponse> genForValidateServerGroup() {
        // basic
        HttpRequestDef.Builder<ValidateServerGroupRequest, ValidateServerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateServerGroupRequest.class, ValidateServerGroupResponse.class)
                .withName("ValidateServerGroup")
                .withUri("/v1/{project_id}/app-server-groups/rules/validate")
                .withContentType("application/json");

        // requests
        builder.<ValidateSeverGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateSeverGroupReq.class),
            f -> f.withMarshaller(ValidateServerGroupRequest::getBody, ValidateServerGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAppConnectionRequest, ExportAppConnectionResponse> exportAppConnection =
        genForExportAppConnection();

    private static HttpRequestDef<ExportAppConnectionRequest, ExportAppConnectionResponse> genForExportAppConnection() {
        // basic
        HttpRequestDef.Builder<ExportAppConnectionRequest, ExportAppConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportAppConnectionRequest.class, ExportAppConnectionResponse.class)
                .withName("ExportAppConnection")
                .withUri("/v1/{project_id}/session/app-connection/export")
                .withContentType("application/json");

        // requests
        builder.<ListAppConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppConnectionReq.class),
            f -> f.withMarshaller(ExportAppConnectionRequest::getBody, ExportAppConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSessionsRequest, ExportSessionsResponse> exportSessions =
        genForExportSessions();

    private static HttpRequestDef<ExportSessionsRequest, ExportSessionsResponse> genForExportSessions() {
        // basic
        HttpRequestDef.Builder<ExportSessionsRequest, ExportSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportSessionsRequest.class, ExportSessionsResponse.class)
                .withName("ExportSessions")
                .withUri("/v1/{project_id}/session/list-sessions/export")
                .withContentType("application/json");

        // requests
        builder.<ExportSessionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportSessionsReq.class),
            f -> f.withMarshaller(ExportSessionsRequest::getBody, ExportSessionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserConnectionRequest, ExportUserConnectionResponse> exportUserConnection =
        genForExportUserConnection();

    private static HttpRequestDef<ExportUserConnectionRequest, ExportUserConnectionResponse> genForExportUserConnection() {
        // basic
        HttpRequestDef.Builder<ExportUserConnectionRequest, ExportUserConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportUserConnectionRequest.class, ExportUserConnectionResponse.class)
            .withName("ExportUserConnection")
            .withUri("/v1/{project_id}/session/user-connection/export")
            .withContentType("application/json");

        // requests
        builder.<ListUserConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserConnectionReq.class),
            f -> f.withMarshaller(ExportUserConnectionRequest::getBody, ExportUserConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> listAppConnection =
        genForListAppConnection();

    private static HttpRequestDef<ListAppConnectionRequest, ListAppConnectionResponse> genForListAppConnection() {
        // basic
        HttpRequestDef.Builder<ListAppConnectionRequest, ListAppConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAppConnectionRequest.class, ListAppConnectionResponse.class)
                .withName("ListAppConnection")
                .withUri("/v1/{project_id}/session/app-connection")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getLimit, ListAppConnectionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getOffset, ListAppConnectionRequest::setOffset));
        builder.<ListAppConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAppConnectionReq.class),
            f -> f.withMarshaller(ListAppConnectionRequest::getBody, ListAppConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> listSessionByUserName =
        genForListSessionByUserName();

    private static HttpRequestDef<ListSessionByUserNameRequest, ListSessionByUserNameResponse> genForListSessionByUserName() {
        // basic
        HttpRequestDef.Builder<ListSessionByUserNameRequest, ListSessionByUserNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSessionByUserNameRequest.class, ListSessionByUserNameResponse.class)
            .withName("ListSessionByUserName")
            .withUri("/v1/{project_id}/session/user-session-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionByUserNameRequest::getUserName,
                ListSessionByUserNameRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSessionsRequest, ListSessionsResponse> listSessions = genForListSessions();

    private static HttpRequestDef<ListSessionsRequest, ListSessionsResponse> genForListSessions() {
        // basic
        HttpRequestDef.Builder<ListSessionsRequest, ListSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSessionsRequest.class, ListSessionsResponse.class)
                .withName("ListSessions")
                .withUri("/v1/{project_id}/session/list-sessions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getLimit, ListSessionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSessionsRequest::getOffset, ListSessionsRequest::setOffset));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getUserName, ListSessionsRequest::setUserName));
        builder.<String>withRequestField("query_begin_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getQueryBeginTime, ListSessionsRequest::setQueryBeginTime));
        builder.<String>withRequestField("query_end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getQueryEndTime, ListSessionsRequest::setQueryEndTime));
        builder.<String>withRequestField("app_server_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getAppServerGroupId, ListSessionsRequest::setAppServerGroupId));
        builder.<String>withRequestField("vm_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getVmIp, ListSessionsRequest::setVmIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getPublicIp, ListSessionsRequest::setPublicIp));
        builder.<String>withRequestField("machine_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getMachineName, ListSessionsRequest::setMachineName));
        builder.<String>withRequestField("session_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getSessionState, ListSessionsRequest::setSessionState));
        builder.<String>withRequestField("is_success",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSessionsRequest::getIsSuccess, ListSessionsRequest::setIsSuccess));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> listUserConnection =
        genForListUserConnection();

    private static HttpRequestDef<ListUserConnectionRequest, ListUserConnectionResponse> genForListUserConnection() {
        // basic
        HttpRequestDef.Builder<ListUserConnectionRequest, ListUserConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUserConnectionRequest.class, ListUserConnectionResponse.class)
                .withName("ListUserConnection")
                .withUri("/v1/{project_id}/session/user-connection")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getLimit, ListUserConnectionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getOffset, ListUserConnectionRequest::setOffset));
        builder.<ListUserConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserConnectionReq.class),
            f -> f.withMarshaller(ListUserConnectionRequest::getBody, ListUserConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> logoffUserSession =
        genForLogoffUserSession();

    private static HttpRequestDef<LogoffUserSessionRequest, LogoffUserSessionResponse> genForLogoffUserSession() {
        // basic
        HttpRequestDef.Builder<LogoffUserSessionRequest, LogoffUserSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LogoffUserSessionRequest.class, LogoffUserSessionResponse.class)
                .withName("LogoffUserSession")
                .withUri("/v1/{project_id}/session/logoff")
                .withContentType("application/json");

        // requests
        builder.<LogoffUserSessionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoffUserSessionReq.class),
            f -> f.withMarshaller(LogoffUserSessionRequest::getBody, LogoffUserSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse> batchCreateServerGroupTags =
        genForBatchCreateServerGroupTags();

    private static HttpRequestDef<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse> genForBatchCreateServerGroupTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateServerGroupTagsRequest, BatchCreateServerGroupTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateServerGroupTagsRequest.class,
                    BatchCreateServerGroupTagsResponse.class)
                .withName("BatchCreateServerGroupTags")
                .withUri("/v1/{project_id}/server-group/tags/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateServerGroupTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateServerGroupTagsReq.class),
            f -> f.withMarshaller(BatchCreateServerGroupTagsRequest::getBody,
                BatchCreateServerGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse> batchDeleteServerGroupTags =
        genForBatchDeleteServerGroupTags();

    private static HttpRequestDef<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse> genForBatchDeleteServerGroupTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteServerGroupTagsRequest, BatchDeleteServerGroupTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteServerGroupTagsRequest.class,
                    BatchDeleteServerGroupTagsResponse.class)
                .withName("BatchDeleteServerGroupTags")
                .withUri("/v1/{project_id}/server-group/tags/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteServerGroupTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteServerGroupTagsReq.class),
            f -> f.withMarshaller(BatchDeleteServerGroupTagsRequest::getBody,
                BatchDeleteServerGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse> createServerGroupTags =
        genForCreateServerGroupTags();

    private static HttpRequestDef<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse> genForCreateServerGroupTags() {
        // basic
        HttpRequestDef.Builder<CreateServerGroupTagsRequest, CreateServerGroupTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateServerGroupTagsRequest.class, CreateServerGroupTagsResponse.class)
            .withName("CreateServerGroupTags")
            .withUri("/v1/{project_id}/server-group/{server_group_id}/tags/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServerGroupTagsRequest::getServerGroupId,
                CreateServerGroupTagsRequest::setServerGroupId));
        builder.<CreateResourceTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagReq.class),
            f -> f.withMarshaller(CreateServerGroupTagsRequest::getBody, CreateServerGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse> deleteServerGroupTags =
        genForDeleteServerGroupTags();

    private static HttpRequestDef<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse> genForDeleteServerGroupTags() {
        // basic
        HttpRequestDef.Builder<DeleteServerGroupTagsRequest, DeleteServerGroupTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteServerGroupTagsRequest.class, DeleteServerGroupTagsResponse.class)
            .withName("DeleteServerGroupTags")
            .withUri("/v1/{project_id}/server-group/{server_group_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServerGroupTagsRequest::getServerGroupId,
                DeleteServerGroupTagsRequest::setServerGroupId));
        builder.<DeleteResourceTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagReq.class),
            f -> f.withMarshaller(DeleteServerGroupTagsRequest::getBody, DeleteServerGroupTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerGroupTagRequest, ListServerGroupTagResponse> listServerGroupTag =
        genForListServerGroupTag();

    private static HttpRequestDef<ListServerGroupTagRequest, ListServerGroupTagResponse> genForListServerGroupTag() {
        // basic
        HttpRequestDef.Builder<ListServerGroupTagRequest, ListServerGroupTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerGroupTagRequest.class, ListServerGroupTagResponse.class)
                .withName("ListServerGroupTag")
                .withUri("/v1/{project_id}/server-group/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServerGroupTagRequest, ShowServerGroupTagResponse> showServerGroupTag =
        genForShowServerGroupTag();

    private static HttpRequestDef<ShowServerGroupTagRequest, ShowServerGroupTagResponse> genForShowServerGroupTag() {
        // basic
        HttpRequestDef.Builder<ShowServerGroupTagRequest, ShowServerGroupTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServerGroupTagRequest.class, ShowServerGroupTagResponse.class)
                .withName("ShowServerGroupTag")
                .withUri("/v1/{project_id}/server-group/{server_group_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServerGroupTagRequest::getServerGroupId,
                ShowServerGroupTagRequest::setServerGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> listVolumeType =
        genForListVolumeType();

    private static HttpRequestDef<ListVolumeTypeRequest, ListVolumeTypeResponse> genForListVolumeType() {
        // basic
        HttpRequestDef.Builder<ListVolumeTypeRequest, ListVolumeTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVolumeTypeRequest.class, ListVolumeTypeResponse.class)
                .withName("ListVolumeType")
                .withUri("/v1/{project_id}/volume-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}

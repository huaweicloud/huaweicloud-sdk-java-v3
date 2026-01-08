package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.workspace.v2.model.ActionsOfUsersInGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopPoolVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopSubResourcesReq;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopSubResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopSubResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopsVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleReq;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddOuNameInfoV2Req;
import com.huaweicloud.sdk.workspace.v2.model.AddOuRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddOuResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddRestrictedRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddRestrictedRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddSiteReq;
import com.huaweicloud.sdk.workspace.v2.model.AddSiteRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddSiteResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyInternetReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplyInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplySubnetBandwidthReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplySubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplySubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceReq;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.AssignAppAuthorizationsReq;
import com.huaweicloud.sdk.workspace.v2.model.AssistAuthApplyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipReq;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesReq;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.AutoInstallAppReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchActionDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAssignAppAuthorizationsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAssociateInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAssociateInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAttachInstancesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchAttachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAttachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAutoInstallAppsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeDesktopNetworkReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateDesktopSnapshotReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppRulesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppRulesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopSnapshotReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScreenRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScreenRecordsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScreenRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteSubJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteSubJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDetachInstancesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDetachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDetachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisableAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisableAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchEnableAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchEnableAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAgentReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAgentRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAgentResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchModifyQosVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchModifyQosVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchModifyQosVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchOperateAppRulesReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchOperateAppsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchOperateJobsReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRestoreDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRestoreDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRestoreSnapshotReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchSetMaintenanceModeReq;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateAppAuthorizationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateAppAuthorizationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateTargetOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateTargetOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CancelRemoteAssistanceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CancelRemoteAssistanceResponse;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkReq;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopToImageRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopToImageResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserPrivilegeGroupReq;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserPrivilegeGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserPrivilegeGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckDesktopImagesReq;
import com.huaweicloud.sdk.workspace.v2.model.CheckDesktopImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckDesktopImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckEdgeSiteResourcesReq;
import com.huaweicloud.sdk.workspace.v2.model.CheckEdgeSiteResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckEdgeSiteResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckEnterpriseIdReq;
import com.huaweicloud.sdk.workspace.v2.model.CheckEnterpriseIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckEnterpriseIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckSysprepInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckSysprepInfoRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CheckSysprepInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAndAuthorizeBucketRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAndAuthorizeBucketResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAppRuleReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateBatchChangeOrderRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateBucketCredentialReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateBucketCredentialRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateBucketCredentialResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertSignatureReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertificateReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateChangeOrderReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopBatchOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopBatchOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopOrderRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolAuthorizedObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolAuthorizedObjectsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolAuthorizedObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateOrderReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyGroupReq;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyTemplateReq;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateRemoteAssistanceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateRemoteAssistanceResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateResourcePackageOrderReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateResourcePackagesOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateResourcePackagesOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateScriptReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateSubnetBandwidthChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateSubnetBandwidthChangeOrderRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateSubnetBandwidthChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupReq;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DelOtpDevicesReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopSubResourcesReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopSubResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopSubResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteExportTaskRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.DeleteExportTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteExportTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteOuRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteOuResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteRestrictedRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteRestrictedRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSiteRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSiteResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSubJobsReq;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.DesktopPoolActionReq;
import com.huaweicloud.sdk.workspace.v2.model.DesktopToImageReq;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesReq;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DisableRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.DisableRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.DownloadExportFileRequest;
import com.huaweicloud.sdk.workspace.v2.model.DownloadExportFileResponse;
import com.huaweicloud.sdk.workspace.v2.model.DownloadMetadataRequest;
import com.huaweicloud.sdk.workspace.v2.model.DownloadMetadataResponse;
import com.huaweicloud.sdk.workspace.v2.model.EditUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.EditUserReq;
import com.huaweicloud.sdk.workspace.v2.model.EnableRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.EnableRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddSubResourcesRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddVolumeRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.EstimateChangeImageRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.EstimateChangeImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateChangeImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolAddVolumeRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolAddVolumeResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolChangeImageRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolChangeImageResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolExtendVolumeRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolExtendVolumeResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolResizeRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateDesktopPoolResizeResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateExtendVolumeRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.EstimateResizeRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolActionRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolActionResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolScriptsReq;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptByDesktopTagReq;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptByDesktopTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptByDesktopTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptOrCommandReq;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptOrCommandRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptOrCommandResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopVolumeRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopVolumeResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopsVolumesReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumeReq;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportAppUserAccessDataRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportAppUserAccessDataRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ExportAppUserAccessDataResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertCrlFileRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertCrlFileResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertCsrFileRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertCsrFileResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertPemFileRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportCertPemFileResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportDesktopListNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportDesktopListNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportDesktopUsageMetricNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportDesktopUsageMetricNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportIpTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportIpTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportPolicyGroupsReq;
import com.huaweicloud.sdk.workspace.v2.model.ExportPolicyGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportPolicyGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportScheduledTasksRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportScheduledTasksRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportTerminalsBindingDesktopsInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportTerminalsBindingDesktopsInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportTerminalsBindingDesktopsTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportTerminalsBindingDesktopsTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserConnectionNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserConnectionNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserGroupUsersNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserGroupUsersNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserListTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserListTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserLoginInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserUsageMetricNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUserUsageMetricNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUsersNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUsersNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUsersTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExportUsersTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportUsersV3Req;
import com.huaweicloud.sdk.workspace.v2.model.ImportCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportCertificatePemReq;
import com.huaweicloud.sdk.workspace.v2.model.ImportIpRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportIpRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ImportIpResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportPolicyGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportPolicyGroupsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ImportPolicyGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportUserListRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportUserListRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ImportUserListResponse;
import com.huaweicloud.sdk.workspace.v2.model.InstallAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.InstallAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.JobActionsReq;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessAddressBackupConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessAddressBackupConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAdOuUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAdOuUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAdOusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAdOusResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAgenciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAgenciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAgentsInstallConditionRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAgentsInstallConditionResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAlarmStatisticsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAlarmStatisticsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAlarmsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAlarmsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAppAuthorizationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAppAuthorizationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAppCatalogsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAppCatalogsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAppUserAccessDataRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAppUserAccessDataResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListAzsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListAzsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListCertsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListCertsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopActionsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopActionsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopByTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopDetachInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopDetachInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopOperationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopOperationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolAuthorizedObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolAuthorizedObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolsByUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolsByUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopPoolsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopUsageMetricRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopUsageMetricResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsConnectStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsConnectStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsEipsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsStatisticsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsStatisticsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListDownloadAddressRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDownloadAddressRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.ListDownloadAddressResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListExportTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListExportTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListFutureExecutionsReq;
import com.huaweicloud.sdk.workspace.v2.model.ListFutureExecutionsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListFutureExecutionsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListHistoryOnlineInfoNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListHostsDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListHostsDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListHourPackagesTypeRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListHourPackagesTypeResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListInconsistentStaticsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListInconsistentStaticsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListInstancesStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListInstancesStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListItaSubJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginRecordsNewResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginStateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListLoginStateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMarketImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMarketImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRecordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRecordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricsTrendRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListMetricsTrendResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListNatGatewaysRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListNatGatewaysResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListNatMappingConfigsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListNatMappingConfigsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListOriginalPolicyInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListOriginalPolicyInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListOtpDevicesByUserIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListOuDetailsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListOuDetailsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPoliciesOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPoliciesOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyDetailInfoByIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyDetailInfoByIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyGroupInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyGroupInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPoolDesktopsDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPoolDesktopsDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListPortsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListPortsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProductsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListResourcePackagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListResourcePackagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListRestrictedRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListRestrictedRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListRunStateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListRunStateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsDetailsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsDetailsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScreenRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScreenRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListScriptsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListServersByHostIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListServersByHostIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListSharerProductsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListSharerProductsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListSiteConfigsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListSiteConfigsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListSubnetBandwidthsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListSubnetBandwidthsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListSubnetsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListSubnetsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTargetOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTargetOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTenantConfigsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTenantConfigsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTenantProfilesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTenantProfilesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListTimeZonesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListTimeZonesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUnusedDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUnusedDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoReq;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsedDesktopInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserEventsLtsConfigurationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserEventsLtsConfigurationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserEventsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserEventsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUserUsageMetricRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUserUsageMetricResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersOfGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersOfGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListVolumeProductInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListVolumeProductInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListVpcInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListVpcInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListWksEdgeSitesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListWksEdgeSitesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.workspace.v2.model.LogoffDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.Metric;
import com.huaweicloud.sdk.workspace.v2.model.MetricsWithTime;
import com.huaweicloud.sdk.workspace.v2.model.ModifyDesktopAttributesReq;
import com.huaweicloud.sdk.workspace.v2.model.ModifyEnterpriseIdReq;
import com.huaweicloud.sdk.workspace.v2.model.ModifyOuNameInfoV2Req;
import com.huaweicloud.sdk.workspace.v2.model.ModifyPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ModifyPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.ModifyPolicyTargetReq;
import com.huaweicloud.sdk.workspace.v2.model.ModifyWorkspaceAttributesReq;
import com.huaweicloud.sdk.workspace.v2.model.OperateUserReq;
import com.huaweicloud.sdk.workspace.v2.model.PreBatchAttachInstancesReq;
import com.huaweicloud.sdk.workspace.v2.model.QueryDesktopByTagReq;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopPoolReq;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopsReq;
import com.huaweicloud.sdk.workspace.v2.model.RegisterDomainRequest;
import com.huaweicloud.sdk.workspace.v2.model.RegisterDomainResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResendEmailReq;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopPoolReq;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopReq;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.RetryJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.RetryJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.RetryScriptExecutionReq;
import com.huaweicloud.sdk.workspace.v2.model.RetryScriptExecutionRequest;
import com.huaweicloud.sdk.workspace.v2.model.RetryScriptExecutionResponse;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnWorkspaceJobRequest;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnWorkspaceJobResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendDesktopPoolNotificationsReq;
import com.huaweicloud.sdk.workspace.v2.model.SendDesktopPoolNotificationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendDesktopPoolNotificationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendEmailRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendEmailResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendNotificationsReq;
import com.huaweicloud.sdk.workspace.v2.model.SendNotificationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendNotificationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetCertStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetCertStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetMaintenanceModeRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetMaintenanceModeResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetRuleRestrictionReq;
import com.huaweicloud.sdk.workspace.v2.model.SetRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetUserEventsLtsConfigurationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetUserEventsLtsConfigurationsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.SetUserEventsLtsConfigurationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigApplyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigApplyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAssistAuthConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAuthConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAuthConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAvailableIpRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAvailableIpResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowAzDetailsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowAzDetailsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowCertDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowCertDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopMonitorDataRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopMonitorDataResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopNetworksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopPoolDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopPoolDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopPoolsScriptExecTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopPoolsScriptExecTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopRemoteAssistanceInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowDesktopRemoteAssistanceInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowGrowthRateRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowGrowthRateResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowHibernateTypeRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowHibernateTypeResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotaDetailsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotaDetailsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotasRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowQuotasResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowRemoteConsoleAddressRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowRemoteConsoleAddressResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowScreenRecordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowScreenRecordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowScriptDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowScriptDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowScriptRecordDetailRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowScriptRecordDetailResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowShareSpaceConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowShareSpaceConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowSubnetBandwidthControlListRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowSubnetBandwidthControlListResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowSysprepInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowSysprepInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowTagByDesktopIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowTagByDesktopIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowUserAccessStagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowUserAccessStagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowUsingSubnetsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowUsingSubnetsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ShowWorkspaceLockRequest;
import com.huaweicloud.sdk.workspace.v2.model.ShowWorkspaceLockResponse;
import com.huaweicloud.sdk.workspace.v2.model.StopScriptExecutionReq;
import com.huaweicloud.sdk.workspace.v2.model.StopScriptExecutionRequest;
import com.huaweicloud.sdk.workspace.v2.model.StopScriptExecutionResponse;
import com.huaweicloud.sdk.workspace.v2.model.TagsReq;
import com.huaweicloud.sdk.workspace.v2.model.TerminalsBindingDesktopsConfig;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessAddressBackupConfigReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessAddressBackupConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessAddressBackupConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessModeReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessModeRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessModeResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppAuthorizationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppAuthorizationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppRuleReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthConfigApplyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthConfigApplyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopPoolAttributesReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopSidReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopSidsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopSidsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopUsernameReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopUsernameRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopUsernameResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateEnterpriseIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateEnterpriseIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateHostsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateHostsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UpdateHostsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateNatMappingConfigsReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateNatMappingConfigsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateNatMappingConfigsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateOuInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateOuInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePoliciesOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePoliciesOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScriptReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateShareSpaceConfigReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateShareSpaceConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateShareSpaceConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthControlListReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthControlListRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthControlListResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetIdsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetIdsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetIdsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantConfigReq;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantProfileRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantProfileResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequestBody;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUploadedAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUploadedAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UploadAppReq;
import com.huaweicloud.sdk.workspace.v2.model.UploadAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.UploadAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.ValidateConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ValidateConfigResponse;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class WorkspaceMeta {

    public static final HttpRequestDef<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse> listAccessAddressBackupConfig =
        genForListAccessAddressBackupConfig();

    private static HttpRequestDef<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse> genForListAccessAddressBackupConfig() {
        // basic
        HttpRequestDef.Builder<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccessAddressBackupConfigRequest.class,
                    ListAccessAddressBackupConfigResponse.class)
                .withName("ListAccessAddressBackupConfig")
                .withUri("/v2/{project_id}/access-config/address-backup")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse> updateAccessAddressBackupConfig =
        genForUpdateAccessAddressBackupConfig();

    private static HttpRequestDef<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse> genForUpdateAccessAddressBackupConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAccessAddressBackupConfigRequest.class,
                    UpdateAccessAddressBackupConfigResponse.class)
                .withName("UpdateAccessAddressBackupConfig")
                .withUri("/v2/{project_id}/access-config/address-backup")
                .withContentType("application/json");

        // requests
        builder.<UpdateAccessAddressBackupConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessAddressBackupConfigReq.class),
            f -> f.withMarshaller(UpdateAccessAddressBackupConfigRequest::getBody,
                UpdateAccessAddressBackupConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPolicies =
        genForBatchDeleteAccessPolicies();

    private static HttpRequestDef<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> genForBatchDeleteAccessPolicies() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteAccessPoliciesRequest.class,
                    BatchDeleteAccessPoliciesResponse.class)
                .withName("BatchDeleteAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteAccessPoliciesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAccessPoliciesReq.class),
            f -> f.withMarshaller(BatchDeleteAccessPoliciesRequest::getBody,
                BatchDeleteAccessPoliciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicy =
        genForCreateAccessPolicy();

    private static HttpRequestDef<CreateAccessPolicyRequest, CreateAccessPolicyResponse> genForCreateAccessPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAccessPolicyRequest, CreateAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessPolicyRequest.class, CreateAccessPolicyResponse.class)
                .withName("CreateAccessPolicy")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<CreateAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessPolicyReq.class),
            f -> f.withMarshaller(CreateAccessPolicyRequest::getBody, CreateAccessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportIpTemplateRequest, ExportIpTemplateResponse> exportIpTemplate =
        genForExportIpTemplate();

    private static HttpRequestDef<ExportIpTemplateRequest, ExportIpTemplateResponse> genForExportIpTemplate() {
        // basic
        HttpRequestDef.Builder<ExportIpTemplateRequest, ExportIpTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportIpTemplateRequest.class, ExportIpTemplateResponse.class)
                .withName("ExportIpTemplate")
                .withUri("/v2/{project_id}/ip/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportIpTemplateRequest::getLanguage, ExportIpTemplateRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportIpRequest, ImportIpResponse> importIp = genForImportIp();

    private static HttpRequestDef<ImportIpRequest, ImportIpResponse> genForImportIp() {
        // basic
        HttpRequestDef.Builder<ImportIpRequest, ImportIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportIpRequest.class, ImportIpResponse.class)
                .withName("ImportIp")
                .withUri("/v2/{project_id}/ip/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<ImportIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportIpRequestBody.class),
            f -> f.withMarshaller(ImportIpRequest::getBody, ImportIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPolicies =
        genForListAccessPolicies();

    private static HttpRequestDef<ListAccessPoliciesRequest, ListAccessPoliciesResponse> genForListAccessPolicies() {
        // basic
        HttpRequestDef.Builder<ListAccessPoliciesRequest, ListAccessPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessPoliciesRequest.class, ListAccessPoliciesResponse.class)
                .withName("ListAccessPolicies")
                .withUri("/v2/{project_id}/access-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_control_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getAccessControlType,
                ListAccessPoliciesRequest::setAccessControlType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getLimit, ListAccessPoliciesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPoliciesRequest::getOffset, ListAccessPoliciesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjects =
        genForListAccessPolicyObjects();

    private static HttpRequestDef<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> genForListAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccessPolicyObjectsRequest.class, ListAccessPolicyObjectsResponse.class)
            .withName("ListAccessPolicyObjects")
            .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getAccessPolicyId,
                ListAccessPolicyObjectsRequest::setAccessPolicyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getLimit, ListAccessPolicyObjectsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessPolicyObjectsRequest::getOffset,
                ListAccessPolicyObjectsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse> updateAccessPolicy =
        genForUpdateAccessPolicy();

    private static HttpRequestDef<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse> genForUpdateAccessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessPolicyRequest.class, UpdateAccessPolicyResponse.class)
                .withName("UpdateAccessPolicy")
                .withUri("/v2/{project_id}/access-policy/{access_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessPolicyRequest::getAccessPolicyId,
                UpdateAccessPolicyRequest::setAccessPolicyId));
        builder.<UpdateAccessPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPolicyReq.class),
            f -> f.withMarshaller(UpdateAccessPolicyRequest::getBody, UpdateAccessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjects =
        genForUpdateAccessPolicyObjects();

    private static HttpRequestDef<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> genForUpdateAccessPolicyObjects() {
        // basic
        HttpRequestDef.Builder<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAccessPolicyObjectsRequest.class,
                    UpdateAccessPolicyObjectsResponse.class)
                .withName("UpdateAccessPolicyObjects")
                .withUri("/v2/{project_id}/access-policy/{access_policy_id}/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("access_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getAccessPolicyId,
                UpdateAccessPolicyObjectsRequest::setAccessPolicyId));
        builder.<UpdateAccessPolicyObjectsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPolicyObjectsReq.class),
            f -> f.withMarshaller(UpdateAccessPolicyObjectsRequest::getBody,
                UpdateAccessPolicyObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> createAgencies =
        genForCreateAgencies();

    private static HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> genForCreateAgencies() {
        // basic
        HttpRequestDef.Builder<CreateAgenciesRequest, CreateAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgenciesRequest.class, CreateAgenciesResponse.class)
                .withName("CreateAgencies")
                .withUri("/v2/{project_id}/agencies")
                .withContentType("application/json");

        // requests
        builder.<CreateAgenciesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAgenciesReq.class),
            f -> f.withMarshaller(CreateAgenciesRequest::getBody, CreateAgenciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForListAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForListAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withName("ListAgencies")
                .withUri("/v2/{project_id}/agencies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getScene, ListAgenciesRequest::setScene));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesRequest::getAction, ListAgenciesRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse> listAlarmStatistics =
        genForListAlarmStatistics();

    private static HttpRequestDef<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse> genForListAlarmStatistics() {
        // basic
        HttpRequestDef.Builder<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmStatisticsRequest.class, ListAlarmStatisticsResponse.class)
                .withName("ListAlarmStatistics")
                .withUri("/v2/{project_id}/statistics/alarms")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForListAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForListAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLevel, ListAlarmsRequest::setLevel));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getOffset, ListAlarmsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, ListAlarmsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppsRequest, BatchDeleteAppsResponse> batchDeleteApps =
        genForBatchDeleteApps();

    private static HttpRequestDef<BatchDeleteAppsRequest, BatchDeleteAppsResponse> genForBatchDeleteApps() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppsRequest, BatchDeleteAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteAppsRequest.class, BatchDeleteAppsResponse.class)
                .withName("BatchDeleteApps")
                .withUri("/v1/{project_id}/app-center/apps/actions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteAppsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteAppsReq.class),
            f -> f.withMarshaller(BatchDeleteAppsRequest::getBody, BatchDeleteAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobs =
        genForBatchDeleteJobs();

    private static HttpRequestDef<BatchDeleteJobsRequest, BatchDeleteJobsResponse> genForBatchDeleteJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteJobsRequest, BatchDeleteJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteJobsRequest.class, BatchDeleteJobsResponse.class)
                .withName("BatchDeleteJobs")
                .withUri("/v1/{project_id}/app-center/jobs/actions/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobsReq.class),
            f -> f.withMarshaller(BatchDeleteJobsRequest::getBody, BatchDeleteJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisableAppsRequest, BatchDisableAppsResponse> batchDisableApps =
        genForBatchDisableApps();

    private static HttpRequestDef<BatchDisableAppsRequest, BatchDisableAppsResponse> genForBatchDisableApps() {
        // basic
        HttpRequestDef.Builder<BatchDisableAppsRequest, BatchDisableAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDisableAppsRequest.class, BatchDisableAppsResponse.class)
                .withName("BatchDisableApps")
                .withUri("/v1/{project_id}/app-center/apps/actions/batch-disable")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateAppsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateAppsReq.class),
            f -> f.withMarshaller(BatchDisableAppsRequest::getBody, BatchDisableAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableAppsRequest, BatchEnableAppsResponse> batchEnableApps =
        genForBatchEnableApps();

    private static HttpRequestDef<BatchEnableAppsRequest, BatchEnableAppsResponse> genForBatchEnableApps() {
        // basic
        HttpRequestDef.Builder<BatchEnableAppsRequest, BatchEnableAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchEnableAppsRequest.class, BatchEnableAppsResponse.class)
                .withName("BatchEnableApps")
                .withUri("/v1/{project_id}/app-center/apps/actions/batch-enable")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateAppsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateAppsReq.class),
            f -> f.withMarshaller(BatchEnableAppsRequest::getBody, BatchEnableAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchInstallAppsRequest, BatchInstallAppsResponse> batchInstallApps =
        genForBatchInstallApps();

    private static HttpRequestDef<BatchInstallAppsRequest, BatchInstallAppsResponse> genForBatchInstallApps() {
        // basic
        HttpRequestDef.Builder<BatchInstallAppsRequest, BatchInstallAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchInstallAppsRequest.class, BatchInstallAppsResponse.class)
                .withName("BatchInstallApps")
                .withUri("/v1/{project_id}/app-center/apps/actions/batch-auto-install")
                .withContentType("application/json");

        // requests
        builder.<BatchAutoInstallAppsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAutoInstallAppsReq.class),
            f -> f.withMarshaller(BatchInstallAppsRequest::getBody, BatchInstallAppsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse> batchUpdateAppAuthorizations =
        genForBatchUpdateAppAuthorizations();

    private static HttpRequestDef<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse> genForBatchUpdateAppAuthorizations() {
        // basic
        HttpRequestDef.Builder<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdateAppAuthorizationsRequest.class,
                    BatchUpdateAppAuthorizationsResponse.class)
                .withName("BatchUpdateAppAuthorizations")
                .withUri("/v1/{project_id}/app-center/apps/actions/batch-assign-authorization")
                .withContentType("application/json");

        // requests
        builder.<BatchAssignAppAuthorizationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAssignAppAuthorizationsReq.class),
            f -> f.withMarshaller(BatchUpdateAppAuthorizationsRequest::getBody,
                BatchUpdateAppAuthorizationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse> createAndAuthorizeBucket =
        genForCreateAndAuthorizeBucket();

    private static HttpRequestDef<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse> genForCreateAndAuthorizeBucket() {
        // basic
        HttpRequestDef.Builder<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAndAuthorizeBucketRequest.class, CreateAndAuthorizeBucketResponse.class)
                .withName("CreateAndAuthorizeBucket")
                .withUri("/v1/{project_id}/app-center/buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBucketCredentialRequest, CreateBucketCredentialResponse> createBucketCredential =
        genForCreateBucketCredential();

    private static HttpRequestDef<CreateBucketCredentialRequest, CreateBucketCredentialResponse> genForCreateBucketCredential() {
        // basic
        HttpRequestDef.Builder<CreateBucketCredentialRequest, CreateBucketCredentialResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBucketCredentialRequest.class, CreateBucketCredentialResponse.class)
            .withName("CreateBucketCredential")
            .withUri("/v1/{project_id}/app-center/buckets/actions/create-credential")
            .withContentType("application/json");

        // requests
        builder.<CreateBucketCredentialReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBucketCredentialReq.class),
            f -> f.withMarshaller(CreateBucketCredentialRequest::getBody, CreateBucketCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/{project_id}/app-center/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));
        builder.<String>withRequestField("reserve_obs_file",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getReserveObsFile, DeleteAppRequest::setReserveObsFile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallAppRequest, InstallAppResponse> installApp = genForInstallApp();

    private static HttpRequestDef<InstallAppRequest, InstallAppResponse> genForInstallApp() {
        // basic
        HttpRequestDef.Builder<InstallAppRequest, InstallAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallAppRequest.class, InstallAppResponse.class)
                .withName("InstallApp")
                .withUri("/v1/{project_id}/app-center/apps/{app_id}/actions/auto-install")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InstallAppRequest::getAppId, InstallAppRequest::setAppId));
        builder.<AutoInstallAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoInstallAppReq.class),
            f -> f.withMarshaller(InstallAppRequest::getBody, InstallAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse> listAppAuthorizations =
        genForListAppAuthorizations();

    private static HttpRequestDef<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse> genForListAppAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppAuthorizationsRequest.class, ListAppAuthorizationsResponse.class)
            .withName("ListAppAuthorizations")
            .withUri("/v1/{project_id}/app-center/apps/{app_id}/authorizations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppAuthorizationsRequest::getAppId, ListAppAuthorizationsRequest::setAppId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppAuthorizationsRequest::getOffset, ListAppAuthorizationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppAuthorizationsRequest::getLimit, ListAppAuthorizationsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppAuthorizationsRequest::getName, ListAppAuthorizationsRequest::setName));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppAuthorizationsRequest::getTargetType,
                ListAppAuthorizationsRequest::setTargetType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppCatalogsRequest, ListAppCatalogsResponse> listAppCatalogs =
        genForListAppCatalogs();

    private static HttpRequestDef<ListAppCatalogsRequest, ListAppCatalogsResponse> genForListAppCatalogs() {
        // basic
        HttpRequestDef.Builder<ListAppCatalogsRequest, ListAppCatalogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppCatalogsRequest.class, ListAppCatalogsResponse.class)
                .withName("ListAppCatalogs")
                .withUri("/v1/{project_id}/app-center/app-catalogs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v1/{project_id}/app-center/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getName, ListAppsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobsRequest, ListJobsResponse> listJobs = genForListJobs();

    private static HttpRequestDef<ListJobsRequest, ListJobsResponse> genForListJobs() {
        // basic
        HttpRequestDef.Builder<ListJobsRequest, ListJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobsRequest.class, ListJobsResponse.class)
                .withName("ListJobs")
                .withUri("/v1/{project_id}/app-center/jobs")
                .withContentType("application/json");

        // requests
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
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getInstanceId, ListJobsRequest::setInstanceId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getAppId, ListJobsRequest::setAppId));
        builder.<String>withRequestField("target",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getTarget, ListJobsRequest::setTarget));
        builder.<String>withRequestField("job_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobsRequest::getJobStatus, ListJobsRequest::setJobStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryJobsRequest, RetryJobsResponse> retryJobs = genForRetryJobs();

    private static HttpRequestDef<RetryJobsRequest, RetryJobsResponse> genForRetryJobs() {
        // basic
        HttpRequestDef.Builder<RetryJobsRequest, RetryJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryJobsRequest.class, RetryJobsResponse.class)
                .withName("RetryJobs")
                .withUri("/v1/{project_id}/app-center/jobs/actions/retry")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateJobsReq.class),
            f -> f.withMarshaller(RetryJobsRequest::getBody, RetryJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse> updateAppAuthorizations =
        genForUpdateAppAuthorizations();

    private static HttpRequestDef<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse> genForUpdateAppAuthorizations() {
        // basic
        HttpRequestDef.Builder<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateAppAuthorizationsRequest.class, UpdateAppAuthorizationsResponse.class)
            .withName("UpdateAppAuthorizations")
            .withUri("/v1/{project_id}/app-center/apps/{app_id}/actions/assign-authorizations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppAuthorizationsRequest::getAppId, UpdateAppAuthorizationsRequest::setAppId));
        builder.<AssignAppAuthorizationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssignAppAuthorizationsReq.class),
            f -> f.withMarshaller(UpdateAppAuthorizationsRequest::getBody, UpdateAppAuthorizationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUploadedAppRequest, UpdateUploadedAppResponse> updateUploadedApp =
        genForUpdateUploadedApp();

    private static HttpRequestDef<UpdateUploadedAppRequest, UpdateUploadedAppResponse> genForUpdateUploadedApp() {
        // basic
        HttpRequestDef.Builder<UpdateUploadedAppRequest, UpdateUploadedAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateUploadedAppRequest.class, UpdateUploadedAppResponse.class)
                .withName("UpdateUploadedApp")
                .withUri("/v1/{project_id}/app-center/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUploadedAppRequest::getAppId, UpdateUploadedAppRequest::setAppId));
        builder.<UpdateAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppReq.class),
            f -> f.withMarshaller(UpdateUploadedAppRequest::getBody, UpdateUploadedAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAppRequest, UploadAppResponse> uploadApp = genForUploadApp();

    private static HttpRequestDef<UploadAppRequest, UploadAppResponse> genForUploadApp() {
        // basic
        HttpRequestDef.Builder<UploadAppRequest, UploadAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadAppRequest.class, UploadAppResponse.class)
                .withName("UploadApp")
                .withUri("/v1/{project_id}/app-center/apps")
                .withContentType("application/json");

        // requests
        builder.<UploadAppReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAppReq.class),
            f -> f.withMarshaller(UploadAppRequest::getBody, UploadAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRestrictedRuleRequest, AddRestrictedRuleResponse> addRestrictedRule =
        genForAddRestrictedRule();

    private static HttpRequestDef<AddRestrictedRuleRequest, AddRestrictedRuleResponse> genForAddRestrictedRule() {
        // basic
        HttpRequestDef.Builder<AddRestrictedRuleRequest, AddRestrictedRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRestrictedRuleRequest.class, AddRestrictedRuleResponse.class)
                .withName("AddRestrictedRule")
                .withUri("/v1/{project_id}/app-center/app-restricted-rules")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateAppRulesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateAppRulesReq.class),
            f -> f.withMarshaller(AddRestrictedRuleRequest::getBody, AddRestrictedRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse> batchDeleteAppRules =
        genForBatchDeleteAppRules();

    private static HttpRequestDef<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse> genForBatchDeleteAppRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteAppRulesRequest.class, BatchDeleteAppRulesResponse.class)
                .withName("BatchDeleteAppRules")
                .withUri("/v1/{project_id}/app-center/app-rules/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchOperateAppRulesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateAppRulesReq.class),
            f -> f.withMarshaller(BatchDeleteAppRulesRequest::getBody, BatchDeleteAppRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRuleRequest, CreateAppRuleResponse> createAppRule =
        genForCreateAppRule();

    private static HttpRequestDef<CreateAppRuleRequest, CreateAppRuleResponse> genForCreateAppRule() {
        // basic
        HttpRequestDef.Builder<CreateAppRuleRequest, CreateAppRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRuleRequest.class, CreateAppRuleResponse.class)
                .withName("CreateAppRule")
                .withUri("/v1/{project_id}/app-center/app-rules")
                .withContentType("application/json");

        // requests
        builder.<CreateAppRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppRuleReq.class),
            f -> f.withMarshaller(CreateAppRuleRequest::getBody, CreateAppRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRuleRequest, DeleteAppRuleResponse> deleteAppRule =
        genForDeleteAppRule();

    private static HttpRequestDef<DeleteAppRuleRequest, DeleteAppRuleResponse> genForDeleteAppRule() {
        // basic
        HttpRequestDef.Builder<DeleteAppRuleRequest, DeleteAppRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRuleRequest.class, DeleteAppRuleResponse.class)
                .withName("DeleteAppRule")
                .withUri("/v1/{project_id}/app-center/app-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRuleRequest::getRuleId, DeleteAppRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse> deleteRestrictedRule =
        genForDeleteRestrictedRule();

    private static HttpRequestDef<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse> genForDeleteRestrictedRule() {
        // basic
        HttpRequestDef.Builder<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteRestrictedRuleRequest.class, DeleteRestrictedRuleResponse.class)
            .withName("DeleteRestrictedRule")
            .withUri("/v1/{project_id}/app-center/app-restricted-rules/actions/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchOperateAppRulesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateAppRulesReq.class),
            f -> f.withMarshaller(DeleteRestrictedRuleRequest::getBody, DeleteRestrictedRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse> disableRuleRestriction =
        genForDisableRuleRestriction();

    private static HttpRequestDef<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse> genForDisableRuleRestriction() {
        // basic
        HttpRequestDef.Builder<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DisableRuleRestrictionRequest.class, DisableRuleRestrictionResponse.class)
            .withName("DisableRuleRestriction")
            .withUri("/v1/{project_id}/app-center/app-rules/actions/disable-rule-restriction")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse> enableRuleRestriction =
        genForEnableRuleRestriction();

    private static HttpRequestDef<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse> genForEnableRuleRestriction() {
        // basic
        HttpRequestDef.Builder<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableRuleRestrictionRequest.class, EnableRuleRestrictionResponse.class)
            .withName("EnableRuleRestriction")
            .withUri("/v1/{project_id}/app-center/app-rules/actions/enable-rule-restriction")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppRuleRequest, ListAppRuleResponse> listAppRule = genForListAppRule();

    private static HttpRequestDef<ListAppRuleRequest, ListAppRuleResponse> genForListAppRule() {
        // basic
        HttpRequestDef.Builder<ListAppRuleRequest, ListAppRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppRuleRequest.class, ListAppRuleResponse.class)
                .withName("ListAppRule")
                .withUri("/v1/{project_id}/app-center/app-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppRuleRequest::getOffset, ListAppRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppRuleRequest::getLimit, ListAppRuleRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppRuleRequest::getName, ListAppRuleRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestrictedRuleRequest, ListRestrictedRuleResponse> listRestrictedRule =
        genForListRestrictedRule();

    private static HttpRequestDef<ListRestrictedRuleRequest, ListRestrictedRuleResponse> genForListRestrictedRule() {
        // basic
        HttpRequestDef.Builder<ListRestrictedRuleRequest, ListRestrictedRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestrictedRuleRequest.class, ListRestrictedRuleResponse.class)
                .withName("ListRestrictedRule")
                .withUri("/v1/{project_id}/app-center/app-restricted-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestrictedRuleRequest::getOffset, ListRestrictedRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestrictedRuleRequest::getLimit, ListRestrictedRuleRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestrictedRuleRequest::getName, ListRestrictedRuleRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRuleRestrictionRequest, SetRuleRestrictionResponse> setRuleRestriction =
        genForSetRuleRestriction();

    private static HttpRequestDef<SetRuleRestrictionRequest, SetRuleRestrictionResponse> genForSetRuleRestriction() {
        // basic
        HttpRequestDef.Builder<SetRuleRestrictionRequest, SetRuleRestrictionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetRuleRestrictionRequest.class, SetRuleRestrictionResponse.class)
                .withName("SetRuleRestriction")
                .withUri("/v1/{project_id}/app-center/app-rules/actions/set-rule-restriction")
                .withContentType("application/json");

        // requests
        builder.<SetRuleRestrictionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRuleRestrictionReq.class),
            f -> f.withMarshaller(SetRuleRestrictionRequest::getBody, SetRuleRestrictionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse> showRuleRestriction =
        genForShowRuleRestriction();

    private static HttpRequestDef<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse> genForShowRuleRestriction() {
        // basic
        HttpRequestDef.Builder<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRestrictionRequest.class, ShowRuleRestrictionResponse.class)
                .withName("ShowRuleRestriction")
                .withUri("/v1/{project_id}/app-center/app-rules/actions/get-rule-restriction")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRuleRequest, UpdateAppRuleResponse> updateAppRule =
        genForUpdateAppRule();

    private static HttpRequestDef<UpdateAppRuleRequest, UpdateAppRuleResponse> genForUpdateAppRule() {
        // basic
        HttpRequestDef.Builder<UpdateAppRuleRequest, UpdateAppRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAppRuleRequest.class, UpdateAppRuleResponse.class)
                .withName("UpdateAppRule")
                .withUri("/v1/{project_id}/app-center/app-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRuleRequest::getRuleId, UpdateAppRuleRequest::setRuleId));
        builder.<UpdateAppRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppRuleReq.class),
            f -> f.withMarshaller(UpdateAppRuleRequest::getBody, UpdateAppRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadMetadataRequest, DownloadMetadataResponse> downloadMetadata =
        genForDownloadMetadata();

    private static HttpRequestDef<DownloadMetadataRequest, DownloadMetadataResponse> genForDownloadMetadata() {
        // basic
        HttpRequestDef.Builder<DownloadMetadataRequest, DownloadMetadataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadMetadataRequest.class, DownloadMetadataResponse.class)
                .withName("DownloadMetadata")
                .withUri("/v2/{project_id}/auth-config/saml2/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_config_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadMetadataRequest::getAuthConfigId, DownloadMetadataRequest::setAuthConfigId));
        builder.<DownloadMetadataRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadMetadataRequest.TypeEnum.class),
            f -> f.withMarshaller(DownloadMetadataRequest::getType, DownloadMetadataRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfig =
        genForShowAssistAuthConfig();

    private static HttpRequestDef<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> genForShowAssistAuthConfig() {
        // basic
        HttpRequestDef.Builder<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAssistAuthConfigRequest.class, ShowAssistAuthConfigResponse.class)
            .withName("ShowAssistAuthConfig")
            .withUri("/v2/{project_id}/assist-auth-config/method-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse> showAssistAuthConfigApplyObjects =
        genForShowAssistAuthConfigApplyObjects();

    private static HttpRequestDef<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse> genForShowAssistAuthConfigApplyObjects() {
        // basic
        HttpRequestDef.Builder<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAssistAuthConfigApplyObjectsRequest.class,
                    ShowAssistAuthConfigApplyObjectsResponse.class)
                .withName("ShowAssistAuthConfigApplyObjects")
                .withUri("/v2/{project_id}/assist-auth-config/apply-objects")
                .withContentType("application/json");

        // requests
        builder.<ShowAssistAuthConfigApplyObjectsRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAssistAuthConfigApplyObjectsRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ShowAssistAuthConfigApplyObjectsRequest::getObjectType,
                ShowAssistAuthConfigApplyObjectsRequest::setObjectType));
        builder.<String>withRequestField("object_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssistAuthConfigApplyObjectsRequest::getObjectName,
                ShowAssistAuthConfigApplyObjectsRequest::setObjectName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssistAuthConfigApplyObjectsRequest::getOffset,
                ShowAssistAuthConfigApplyObjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAssistAuthConfigApplyObjectsRequest::getLimit,
                ShowAssistAuthConfigApplyObjectsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthConfigRequest, ShowAuthConfigResponse> showAuthConfig =
        genForShowAuthConfig();

    private static HttpRequestDef<ShowAuthConfigRequest, ShowAuthConfigResponse> genForShowAuthConfig() {
        // basic
        HttpRequestDef.Builder<ShowAuthConfigRequest, ShowAuthConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthConfigRequest.class, ShowAuthConfigResponse.class)
                .withName("ShowAuthConfig")
                .withUri("/v2/{project_id}/auth-config/method-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthConfigRequest::getAuthType, ShowAuthConfigRequest::setAuthType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse> updateAssistAuthConfigApplyObjects =
        genForUpdateAssistAuthConfigApplyObjects();

    private static HttpRequestDef<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse> genForUpdateAssistAuthConfigApplyObjects() {
        // basic
        HttpRequestDef.Builder<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAssistAuthConfigApplyObjectsRequest.class,
                    UpdateAssistAuthConfigApplyObjectsResponse.class)
                .withName("UpdateAssistAuthConfigApplyObjects")
                .withUri("/v2/{project_id}/assist-auth-config/apply-objects")
                .withContentType("application/json");

        // requests
        builder.<AssistAuthApplyObjectsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssistAuthApplyObjectsRequest.class),
            f -> f.withMarshaller(UpdateAssistAuthConfigApplyObjectsRequest::getBody,
                UpdateAssistAuthConfigApplyObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfig =
        genForUpdateAssistAuthMethodConfig();

    private static HttpRequestDef<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> genForUpdateAssistAuthMethodConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAssistAuthMethodConfigRequest.class,
                    UpdateAssistAuthMethodConfigResponse.class)
                .withName("UpdateAssistAuthMethodConfig")
                .withUri("/v2/{project_id}/assist-auth-config/method-config")
                .withContentType("application/json");

        // requests
        builder.<AssistAuthMethodConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssistAuthMethodConfigRequest.class),
            f -> f.withMarshaller(UpdateAssistAuthMethodConfigRequest::getBody,
                UpdateAssistAuthMethodConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse> updateAuthMethodConfig =
        genForUpdateAuthMethodConfig();

    private static HttpRequestDef<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse> genForUpdateAuthMethodConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAuthMethodConfigRequest.class, UpdateAuthMethodConfigResponse.class)
            .withName("UpdateAuthMethodConfig")
            .withUri("/v2/{project_id}/auth-config/method-config")
            .withContentType("application/json");

        // requests
        builder.<AuthMethodConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthMethodConfigRequest.class),
            f -> f.withMarshaller(UpdateAuthMethodConfigRequest::getBody, UpdateAuthMethodConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateConfigRequest, ValidateConfigResponse> validateConfig =
        genForValidateConfig();

    private static HttpRequestDef<ValidateConfigRequest, ValidateConfigResponse> genForValidateConfig() {
        // basic
        HttpRequestDef.Builder<ValidateConfigRequest, ValidateConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateConfigRequest.class, ValidateConfigResponse.class)
                .withName("ValidateConfig")
                .withUri("/v2/{project_id}/auth-config/validate-config")
                .withContentType("application/json");

        // requests
        builder.<AuthMethodConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthMethodConfigRequest.class),
            f -> f.withMarshaller(ValidateConfigRequest::getBody, ValidateConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZones =
        genForListAvailabilityZones();

    private static HttpRequestDef<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> genForListAvailabilityZones() {
        // basic
        HttpRequestDef.Builder<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailabilityZonesRequest.class, ListAvailabilityZonesResponse.class)
            .withName("ListAvailabilityZones")
            .withUri("/v2/{project_id}/availability-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAzsRequest, ListAzsResponse> listAzs = genForListAzs();

    private static HttpRequestDef<ListAzsRequest, ListAzsResponse> genForListAzs() {
        // basic
        HttpRequestDef.Builder<ListAzsRequest, ListAzsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAzsRequest.class, ListAzsResponse.class)
                .withName("ListAzs")
                .withUri("/v2/{project_id}/availability-zones/summary")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAzDetailsRequest, ShowAzDetailsResponse> showAzDetails =
        genForShowAzDetails();

    private static HttpRequestDef<ShowAzDetailsRequest, ShowAzDetailsResponse> genForShowAzDetails() {
        // basic
        HttpRequestDef.Builder<ShowAzDetailsRequest, ShowAzDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAzDetailsRequest.class, ShowAzDetailsResponse.class)
                .withName("ShowAzDetails")
                .withUri("/v2/{project_id}/availability-zones/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAzDetailsRequest::getAvailabilityZoneId,
                ShowAzDetailsRequest::setAvailabilityZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertRequest, CreateCertResponse> createCert = genForCreateCert();

    private static HttpRequestDef<CreateCertRequest, CreateCertResponse> genForCreateCert() {
        // basic
        HttpRequestDef.Builder<CreateCertRequest, CreateCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertRequest.class, CreateCertResponse.class)
                .withName("CreateCert")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateReq.class),
            f -> f.withMarshaller(CreateCertRequest::getBody, CreateCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertRequest, DeleteCertResponse> deleteCert = genForDeleteCert();

    private static HttpRequestDef<DeleteCertRequest, DeleteCertResponse> genForDeleteCert() {
        // basic
        HttpRequestDef.Builder<DeleteCertRequest, DeleteCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertRequest.class, DeleteCertResponse.class)
                .withName("DeleteCert")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/{cert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertRequest::getCertId, DeleteCertRequest::setCertId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertCrlFileRequest, ExportCertCrlFileResponse> exportCertCrlFile =
        genForExportCertCrlFile();

    private static HttpRequestDef<ExportCertCrlFileRequest, ExportCertCrlFileResponse> genForExportCertCrlFile() {
        // basic
        HttpRequestDef.Builder<ExportCertCrlFileRequest, ExportCertCrlFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportCertCrlFileRequest.class, ExportCertCrlFileResponse.class)
                .withName("ExportCertCrlFile")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/{cert_id}/crl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertCrlFileRequest::getCertId, ExportCertCrlFileRequest::setCertId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertCsrFileRequest, ExportCertCsrFileResponse> exportCertCsrFile =
        genForExportCertCsrFile();

    private static HttpRequestDef<ExportCertCsrFileRequest, ExportCertCsrFileResponse> genForExportCertCsrFile() {
        // basic
        HttpRequestDef.Builder<ExportCertCsrFileRequest, ExportCertCsrFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportCertCsrFileRequest.class, ExportCertCsrFileResponse.class)
                .withName("ExportCertCsrFile")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/csr")
                .withContentType("application/json");

        // requests
        builder.<CreateCertSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertSignatureReq.class),
            f -> f.withMarshaller(ExportCertCsrFileRequest::getBody, ExportCertCsrFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportCertPemFileRequest, ExportCertPemFileResponse> exportCertPemFile =
        genForExportCertPemFile();

    private static HttpRequestDef<ExportCertPemFileRequest, ExportCertPemFileResponse> genForExportCertPemFile() {
        // basic
        HttpRequestDef.Builder<ExportCertPemFileRequest, ExportCertPemFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportCertPemFileRequest.class, ExportCertPemFileResponse.class)
                .withName("ExportCertPemFile")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/{cert_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportCertPemFileRequest::getCertId, ExportCertPemFileRequest::setCertId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportCertRequest, ImportCertResponse> importCert = genForImportCert();

    private static HttpRequestDef<ImportCertRequest, ImportCertResponse> genForImportCert() {
        // basic
        HttpRequestDef.Builder<ImportCertRequest, ImportCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportCertRequest.class, ImportCertResponse.class)
                .withName("ImportCert")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/import")
                .withContentType("application/json");

        // requests
        builder.<ImportCertificatePemReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportCertificatePemReq.class),
            f -> f.withMarshaller(ImportCertRequest::getBody, ImportCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertsRequest, ListCertsResponse> listCerts = genForListCerts();

    private static HttpRequestDef<ListCertsRequest, ListCertsResponse> genForListCerts() {
        // basic
        HttpRequestDef.Builder<ListCertsRequest, ListCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertsRequest.class, ListCertsResponse.class)
                .withName("ListCerts")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCertStatusRequest, SetCertStatusResponse> setCertStatus =
        genForSetCertStatus();

    private static HttpRequestDef<SetCertStatusRequest, SetCertStatusResponse> genForSetCertStatus() {
        // basic
        HttpRequestDef.Builder<SetCertStatusRequest, SetCertStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetCertStatusRequest.class, SetCertStatusResponse.class)
                .withName("SetCertStatus")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/{cert_id}/status/{status}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCertStatusRequest::getCertId, SetCertStatusRequest::setCertId));
        builder.<String>withRequestField("status",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCertStatusRequest::getStatus, SetCertStatusRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertDetailRequest, ShowCertDetailResponse> showCertDetail =
        genForShowCertDetail();

    private static HttpRequestDef<ShowCertDetailRequest, ShowCertDetailResponse> genForShowCertDetail() {
        // basic
        HttpRequestDef.Builder<ShowCertDetailRequest, ShowCertDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertDetailRequest.class, ShowCertDetailResponse.class)
                .withName("ShowCertDetail")
                .withUri("/v2/{project_id}/certmanager/private-certificate-authorities/{cert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertDetailRequest::getCertId, ShowCertDetailRequest::setCertId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDesktopImagesRequest, CheckDesktopImagesResponse> checkDesktopImages =
        genForCheckDesktopImages();

    private static HttpRequestDef<CheckDesktopImagesRequest, CheckDesktopImagesResponse> genForCheckDesktopImages() {
        // basic
        HttpRequestDef.Builder<CheckDesktopImagesRequest, CheckDesktopImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckDesktopImagesRequest.class, CheckDesktopImagesResponse.class)
                .withName("CheckDesktopImages")
                .withUri("/v2/{project_id}/desktops/check-images")
                .withContentType("application/json");

        // requests
        builder.<CheckDesktopImagesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckDesktopImagesReq.class),
            f -> f.withMarshaller(CheckDesktopImagesRequest::getBody, CheckDesktopImagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSysprepInfoRequest, CheckSysprepInfoResponse> checkSysprepInfo =
        genForCheckSysprepInfo();

    private static HttpRequestDef<CheckSysprepInfoRequest, CheckSysprepInfoResponse> genForCheckSysprepInfo() {
        // basic
        HttpRequestDef.Builder<CheckSysprepInfoRequest, CheckSysprepInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckSysprepInfoRequest.class, CheckSysprepInfoResponse.class)
                .withName("CheckSysprepInfo")
                .withUri("/v2/{project_id}/sysprep")
                .withContentType("application/json");

        // requests
        builder.<CheckSysprepInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckSysprepInfoRequestBody.class),
            f -> f.withMarshaller(CheckSysprepInfoRequest::getBody, CheckSysprepInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNew =
        genForExportUserLoginInfoNew();

    private static HttpRequestDef<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> genForExportUserLoginInfoNew() {
        // basic
        HttpRequestDef.Builder<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserLoginInfoNewRequest.class, ExportUserLoginInfoNewResponse.class)
            .withName("ExportUserLoginInfoNew")
            .withUri("/v2/{project_id}/connections/desktops/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getStartTime,
                ExportUserLoginInfoNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getEndTime,
                ExportUserLoginInfoNewRequest::setEndTime));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getUserName,
                ExportUserLoginInfoNewRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getComputerName,
                ExportUserLoginInfoNewRequest::setComputerName));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getTerminalType,
                ExportUserLoginInfoNewRequest::setTerminalType));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserLoginInfoNewRequest::getLanguage,
                ExportUserLoginInfoNewRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNew =
        genForListHistoryOnlineInfoNew();

    private static HttpRequestDef<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> genForListHistoryOnlineInfoNew() {
        // basic
        HttpRequestDef.Builder<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListHistoryOnlineInfoNewRequest.class, ListHistoryOnlineInfoNewResponse.class)
                .withName("ListHistoryOnlineInfoNew")
                .withUri("/v2/{project_id}/connections/online-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getStartTime,
                ListHistoryOnlineInfoNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getEndTime,
                ListHistoryOnlineInfoNewRequest::setEndTime));
        builder.<String>withRequestField("query_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryOnlineInfoNewRequest::getQueryType,
                ListHistoryOnlineInfoNewRequest::setQueryType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesStatusRequest, ListInstancesStatusResponse> listInstancesStatus =
        genForListInstancesStatus();

    private static HttpRequestDef<ListInstancesStatusRequest, ListInstancesStatusResponse> genForListInstancesStatus() {
        // basic
        HttpRequestDef.Builder<ListInstancesStatusRequest, ListInstancesStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesStatusRequest.class, ListInstancesStatusResponse.class)
                .withName("ListInstancesStatus")
                .withUri("/v2/{project_id}/connections/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNew =
        genForListLoginRecordsNew();

    private static HttpRequestDef<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> genForListLoginRecordsNew() {
        // basic
        HttpRequestDef.Builder<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginRecordsNewRequest.class, ListLoginRecordsNewResponse.class)
                .withName("ListLoginRecordsNew")
                .withUri("/v2/{project_id}/connections/desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getStartTime, ListLoginRecordsNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getEndTime, ListLoginRecordsNewRequest::setEndTime));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getUserName, ListLoginRecordsNewRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getComputerName,
                ListLoginRecordsNewRequest::setComputerName));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getTerminalType,
                ListLoginRecordsNewRequest::setTerminalType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getOffset, ListLoginRecordsNewRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getLimit, ListLoginRecordsNewRequest::setLimit));
        builder.<Integer>withRequestField("min_network_rtt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getMinNetworkRtt,
                ListLoginRecordsNewRequest::setMinNetworkRtt));
        builder.<Integer>withRequestField("max_network_rtt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getMaxNetworkRtt,
                ListLoginRecordsNewRequest::setMaxNetworkRtt));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginRecordsNewRequest::getEnterpriseProjectId,
                ListLoginRecordsNewRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse> exportUserConnectionNew =
        genForExportUserConnectionNew();

    private static HttpRequestDef<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse> genForExportUserConnectionNew() {
        // basic
        HttpRequestDef.Builder<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserConnectionNewRequest.class, ExportUserConnectionNewResponse.class)
            .withName("ExportUserConnectionNew")
            .withUri("/v3/{project_id}/desktops/connections/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getStartTime,
                ExportUserConnectionNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getEndTime,
                ExportUserConnectionNewRequest::setEndTime));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getUserName,
                ExportUserConnectionNewRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getComputerName,
                ExportUserConnectionNewRequest::setComputerName));
        builder.<String>withRequestField("terminal_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getTerminalType,
                ExportUserConnectionNewRequest::setTerminalType));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getLanguage,
                ExportUserConnectionNewRequest::setLanguage));
        builder.<Integer>withRequestField("min_e2e_rtt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getMinE2eRtt,
                ExportUserConnectionNewRequest::setMinE2eRtt));
        builder.<Integer>withRequestField("max_e2e_rtt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getMaxE2eRtt,
                ExportUserConnectionNewRequest::setMaxE2eRtt));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserConnectionNewRequest::getEnterpriseProjectId,
                ExportUserConnectionNewRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachInstancesRequest, AttachInstancesResponse> attachInstances =
        genForAttachInstances();

    private static HttpRequestDef<AttachInstancesRequest, AttachInstancesResponse> genForAttachInstances() {
        // basic
        HttpRequestDef.Builder<AttachInstancesRequest, AttachInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachInstancesRequest.class, AttachInstancesResponse.class)
                .withName("AttachInstances")
                .withUri("/v2/{project_id}/desktops/attach")
                .withContentType("application/json");

        // requests
        builder.<AttachInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachInstancesReq.class),
            f -> f.withMarshaller(AttachInstancesRequest::getBody, AttachInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse> batchAssociateInstances =
        genForBatchAssociateInstances();

    private static HttpRequestDef<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse> genForBatchAssociateInstances() {
        // basic
        HttpRequestDef.Builder<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateInstancesRequest.class, BatchAssociateInstancesResponse.class)
            .withName("BatchAssociateInstances")
            .withUri("/v2/{project_id}/desktops/pre-batch-attach")
            .withContentType("application/json");

        // requests
        builder.<PreBatchAttachInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreBatchAttachInstancesReq.class),
            f -> f.withMarshaller(BatchAssociateInstancesRequest::getBody, BatchAssociateInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAttachInstancesRequest, BatchAttachInstancesResponse> batchAttachInstances =
        genForBatchAttachInstances();

    private static HttpRequestDef<BatchAttachInstancesRequest, BatchAttachInstancesResponse> genForBatchAttachInstances() {
        // basic
        HttpRequestDef.Builder<BatchAttachInstancesRequest, BatchAttachInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAttachInstancesRequest.class, BatchAttachInstancesResponse.class)
            .withName("BatchAttachInstances")
            .withUri("/v2/{project_id}/desktops/batch-attach")
            .withContentType("application/json");

        // requests
        builder.<BatchAttachInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAttachInstancesReq.class),
            f -> f.withMarshaller(BatchAttachInstancesRequest::getBody, BatchAttachInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse> batchChangeDesktopNetwork =
        genForBatchChangeDesktopNetwork();

    private static HttpRequestDef<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse> genForBatchChangeDesktopNetwork() {
        // basic
        HttpRequestDef.Builder<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchChangeDesktopNetworkRequest.class,
                    BatchChangeDesktopNetworkResponse.class)
                .withName("BatchChangeDesktopNetwork")
                .withUri("/v2/{project_id}/desktops/networks/batch-change")
                .withContentType("application/json");

        // requests
        builder.<BatchChangeDesktopNetworkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchChangeDesktopNetworkReq.class),
            f -> f.withMarshaller(BatchChangeDesktopNetworkRequest::getBody,
                BatchChangeDesktopNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktops =
        genForBatchDeleteDesktops();

    private static HttpRequestDef<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> genForBatchDeleteDesktops() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDesktopsRequest.class, BatchDeleteDesktopsResponse.class)
                .withName("BatchDeleteDesktops")
                .withUri("/v2/{project_id}/desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDesktopsReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopsRequest::getBody, BatchDeleteDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDetachInstancesRequest, BatchDetachInstancesResponse> batchDetachInstances =
        genForBatchDetachInstances();

    private static HttpRequestDef<BatchDetachInstancesRequest, BatchDetachInstancesResponse> genForBatchDetachInstances() {
        // basic
        HttpRequestDef.Builder<BatchDetachInstancesRequest, BatchDetachInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDetachInstancesRequest.class, BatchDetachInstancesResponse.class)
            .withName("BatchDetachInstances")
            .withUri("/v2/{project_id}/desktops/batch-detach")
            .withContentType("application/json");

        // requests
        builder.<BatchDetachInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDetachInstancesReq.class),
            f -> f.withMarshaller(BatchDetachInstancesRequest::getBody, BatchDetachInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchInstallAgentRequest, BatchInstallAgentResponse> batchInstallAgent =
        genForBatchInstallAgent();

    private static HttpRequestDef<BatchInstallAgentRequest, BatchInstallAgentResponse> genForBatchInstallAgent() {
        // basic
        HttpRequestDef.Builder<BatchInstallAgentRequest, BatchInstallAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchInstallAgentRequest.class, BatchInstallAgentResponse.class)
                .withName("BatchInstallAgent")
                .withUri("/v2/{project_id}/desktops/agents")
                .withContentType("application/json");

        // requests
        builder.<BatchInstallAgentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchInstallAgentReq.class),
            f -> f.withMarshaller(BatchInstallAgentRequest::getBody, BatchInstallAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktops =
        genForBatchLogoffDesktops();

    private static HttpRequestDef<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> genForBatchLogoffDesktops() {
        // basic
        HttpRequestDef.Builder<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchLogoffDesktopsRequest.class, BatchLogoffDesktopsResponse.class)
                .withName("BatchLogoffDesktops")
                .withUri("/v2/{project_id}/desktops/logoff")
                .withContentType("application/json");

        // requests
        builder.<LogoffDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoffDesktopsReq.class),
            f -> f.withMarshaller(BatchLogoffDesktopsRequest::getBody, BatchLogoffDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDisk =
        genForBatchRebuildDesktopsSystemDisk();

    private static HttpRequestDef<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> genForBatchRebuildDesktopsSystemDisk() {
        // basic
        HttpRequestDef.Builder<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRebuildDesktopsSystemDiskRequest.class,
                    BatchRebuildDesktopsSystemDiskResponse.class)
                .withName("BatchRebuildDesktopsSystemDisk")
                .withUri("/v2/{project_id}/desktops/rebuild")
                .withContentType("application/json");

        // requests
        builder.<RebuildDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebuildDesktopsReq.class),
            f -> f.withMarshaller(BatchRebuildDesktopsSystemDiskRequest::getBody,
                BatchRebuildDesktopsSystemDiskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktops =
        genForBatchRunDesktops();

    private static HttpRequestDef<BatchRunDesktopsRequest, BatchRunDesktopsResponse> genForBatchRunDesktops() {
        // basic
        HttpRequestDef.Builder<BatchRunDesktopsRequest, BatchRunDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchRunDesktopsRequest.class, BatchRunDesktopsResponse.class)
                .withName("BatchRunDesktops")
                .withUri("/v2/{project_id}/desktops/action")
                .withContentType("application/json");

        // requests
        builder.<BatchActionDesktopsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchActionDesktopsReq.class),
            f -> f.withMarshaller(BatchRunDesktopsRequest::getBody, BatchRunDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse> cancelRemoteAssistance =
        genForCancelRemoteAssistance();

    private static HttpRequestDef<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse> genForCancelRemoteAssistance() {
        // basic
        HttpRequestDef.Builder<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CancelRemoteAssistanceRequest.class, CancelRemoteAssistanceResponse.class)
            .withName("CancelRemoteAssistance")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/remote-assistance")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRemoteAssistanceRequest::getDesktopId,
                CancelRemoteAssistanceRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetwork =
        genForChangeDesktopNetwork();

    private static HttpRequestDef<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> genForChangeDesktopNetwork() {
        // basic
        HttpRequestDef.Builder<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeDesktopNetworkRequest.class, ChangeDesktopNetworkResponse.class)
            .withName("ChangeDesktopNetwork")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/networks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getDesktopId,
                ChangeDesktopNetworkRequest::setDesktopId));
        builder.<ChangeDesktopNetworkReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeDesktopNetworkReq.class),
            f -> f.withMarshaller(ChangeDesktopNetworkRequest::getBody, ChangeDesktopNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse> changeDesktopToImage =
        genForChangeDesktopToImage();

    private static HttpRequestDef<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse> genForChangeDesktopToImage() {
        // basic
        HttpRequestDef.Builder<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeDesktopToImageRequest.class, ChangeDesktopToImageResponse.class)
            .withName("ChangeDesktopToImage")
            .withUri("/v2/{project_id}/desktops/desktop-to-image")
            .withContentType("application/json");

        // requests
        builder.<DesktopToImageReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DesktopToImageReq.class),
            f -> f.withMarshaller(ChangeDesktopToImageRequest::getBody, ChangeDesktopToImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse> changeUserPrivilegeGroup =
        genForChangeUserPrivilegeGroup();

    private static HttpRequestDef<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse> genForChangeUserPrivilegeGroup() {
        // basic
        HttpRequestDef.Builder<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ChangeUserPrivilegeGroupRequest.class, ChangeUserPrivilegeGroupResponse.class)
                .withName("ChangeUserPrivilegeGroup")
                .withUri("/v2/{project_id}/desktops/change-user-privilege-group")
                .withContentType("application/json");

        // requests
        builder.<ChangeUserPrivilegeGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeUserPrivilegeGroupReq.class),
            f -> f.withMarshaller(ChangeUserPrivilegeGroupRequest::getBody, ChangeUserPrivilegeGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> createDesktop =
        genForCreateDesktop();

    private static HttpRequestDef<CreateDesktopRequest, CreateDesktopResponse> genForCreateDesktop() {
        // basic
        HttpRequestDef.Builder<CreateDesktopRequest, CreateDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopRequest.class, CreateDesktopResponse.class)
                .withName("CreateDesktop")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopReq.class),
            f -> f.withMarshaller(CreateDesktopRequest::getBody, CreateDesktopRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse> createRemoteAssistance =
        genForCreateRemoteAssistance();

    private static HttpRequestDef<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse> genForCreateRemoteAssistance() {
        // basic
        HttpRequestDef.Builder<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRemoteAssistanceRequest.class, CreateRemoteAssistanceResponse.class)
            .withName("CreateRemoteAssistance")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/remote-assistance")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRemoteAssistanceRequest::getDesktopId,
                CreateRemoteAssistanceRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktop =
        genForDeleteDesktop();

    private static HttpRequestDef<DeleteDesktopRequest, DeleteDesktopResponse> genForDeleteDesktop() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopRequest, DeleteDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDesktopRequest.class, DeleteDesktopResponse.class)
                .withName("DeleteDesktop")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDesktopId, DeleteDesktopRequest::setDesktopId));
        builder.<Boolean>withRequestField("delete_users",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getDeleteUsers, DeleteDesktopRequest::setDeleteUsers));
        builder.<Boolean>withRequestField("email_notification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getEmailNotification,
                DeleteDesktopRequest::setEmailNotification));
        builder.<Boolean>withRequestField("is_force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDesktopRequest::getIsForceDelete, DeleteDesktopRequest::setIsForceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachInstancesRequest, DetachInstancesResponse> detachInstances =
        genForDetachInstances();

    private static HttpRequestDef<DetachInstancesRequest, DetachInstancesResponse> genForDetachInstances() {
        // basic
        HttpRequestDef.Builder<DetachInstancesRequest, DetachInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachInstancesRequest.class, DetachInstancesResponse.class)
                .withName("DetachInstances")
                .withUri("/v2/{project_id}/desktops/detach")
                .withContentType("application/json");

        // requests
        builder.<DetachInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachInstancesReq.class),
            f -> f.withMarshaller(DetachInstancesRequest::getBody, DetachInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse> listAgentsInstallCondition =
        genForListAgentsInstallCondition();

    private static HttpRequestDef<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse> genForListAgentsInstallCondition() {
        // basic
        HttpRequestDef.Builder<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAgentsInstallConditionRequest.class,
                    ListAgentsInstallConditionResponse.class)
                .withName("ListAgentsInstallCondition")
                .withUri("/v2/{project_id}/desktops/agents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getEnterpriseProjectId,
                ListAgentsInstallConditionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getDesktopId,
                ListAgentsInstallConditionRequest::setDesktopId));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getDesktopName,
                ListAgentsInstallConditionRequest::setDesktopName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getStatus,
                ListAgentsInstallConditionRequest::setStatus));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getIpAddress,
                ListAgentsInstallConditionRequest::setIpAddress));
        builder.<Boolean>withRequestField("is_installed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getIsInstalled,
                ListAgentsInstallConditionRequest::setIsInstalled));
        builder.<String>withRequestField("desktop_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getDesktopPoolId,
                ListAgentsInstallConditionRequest::setDesktopPoolId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getLimit,
                ListAgentsInstallConditionRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgentsInstallConditionRequest::getOffset,
                ListAgentsInstallConditionRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopActionsRequest, ListDesktopActionsResponse> listDesktopActions =
        genForListDesktopActions();

    private static HttpRequestDef<ListDesktopActionsRequest, ListDesktopActionsResponse> genForListDesktopActions() {
        // basic
        HttpRequestDef.Builder<ListDesktopActionsRequest, ListDesktopActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopActionsRequest.class, ListDesktopActionsResponse.class)
                .withName("ListDesktopActions")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopActionsRequest::getDesktopId, ListDesktopActionsRequest::setDesktopId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopActionsRequest::getOffset, ListDesktopActionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopActionsRequest::getLimit, ListDesktopActionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse> listDesktopDetachInfo =
        genForListDesktopDetachInfo();

    private static HttpRequestDef<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse> genForListDesktopDetachInfo() {
        // basic
        HttpRequestDef.Builder<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopDetachInfoRequest.class, ListDesktopDetachInfoResponse.class)
            .withName("ListDesktopDetachInfo")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/detach-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopDetachInfoRequest::getDesktopId,
                ListDesktopDetachInfoRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> listDesktops = genForListDesktops();

    private static HttpRequestDef<ListDesktopsRequest, ListDesktopsResponse> genForListDesktops() {
        // basic
        HttpRequestDef.Builder<ListDesktopsRequest, ListDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsRequest.class, ListDesktopsResponse.class)
                .withName("ListDesktops")
                .withUri("/v2/{project_id}/desktops")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsRequest::getUserName, ListDesktopsRequest::setUserName));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getComputerName, ListDesktopsRequest::setComputerName));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopIp, ListDesktopsRequest::setDesktopIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getOffset, ListDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsRequest::getLimit, ListDesktopsRequest::setLimit));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getPoolId, ListDesktopsRequest::setPoolId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getEnterpriseProjectId,
                ListDesktopsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopType, ListDesktopsRequest::setDesktopType));
        builder.<Boolean>withRequestField("is_share_desktop",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsRequest::getIsShareDesktop, ListDesktopsRequest::setIsShareDesktop));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getSubnetId, ListDesktopsRequest::setSubnetId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getStatus, ListDesktopsRequest::setStatus));
        builder.<List<String>>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsRequest::getDesktopId, ListDesktopsRequest::setDesktopId));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsRequest::getTag, ListDesktopsRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse> listDesktopsConnectStatus =
        genForListDesktopsConnectStatus();

    private static HttpRequestDef<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse> genForListDesktopsConnectStatus() {
        // basic
        HttpRequestDef.Builder<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDesktopsConnectStatusRequest.class,
                    ListDesktopsConnectStatusResponse.class)
                .withName("ListDesktopsConnectStatus")
                .withUri("/v2/{project_id}/connect-desktops")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsConnectStatusRequest::getUserNames,
                ListDesktopsConnectStatusRequest::setUserNames));
        builder.<String>withRequestField("connect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsConnectStatusRequest::getConnectStatus,
                ListDesktopsConnectStatusRequest::setConnectStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsConnectStatusRequest::getOffset,
                ListDesktopsConnectStatusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsConnectStatusRequest::getLimit,
                ListDesktopsConnectStatusRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetail =
        genForListDesktopsDetail();

    private static HttpRequestDef<ListDesktopsDetailRequest, ListDesktopsDetailResponse> genForListDesktopsDetail() {
        // basic
        HttpRequestDef.Builder<ListDesktopsDetailRequest, ListDesktopsDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsDetailRequest.class, ListDesktopsDetailResponse.class)
                .withName("ListDesktopsDetail")
                .withUri("/v2/{project_id}/desktops/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getStatus, ListDesktopsDetailRequest::setStatus));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserName, ListDesktopsDetailRequest::setUserName));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserNames, ListDesktopsDetailRequest::setUserNames));
        builder.<ListDesktopsDetailRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortField, ListDesktopsDetailRequest::setSortField));
        builder.<ListDesktopsDetailRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopsDetailRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSortType, ListDesktopsDetailRequest::setSortType));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getComputerName,
                ListDesktopsDetailRequest::setComputerName));
        builder.<List<String>>withRequestField("computer_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getComputerNames,
                ListDesktopsDetailRequest::setComputerNames));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopIp, ListDesktopsDetailRequest::setDesktopIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getOffset, ListDesktopsDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getLimit, ListDesktopsDetailRequest::setLimit));
        builder.<List<String>>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopId, ListDesktopsDetailRequest::setDesktopId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getDesktopType,
                ListDesktopsDetailRequest::setDesktopType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getTag, ListDesktopsDetailRequest::setTag));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getPoolId, ListDesktopsDetailRequest::setPoolId));
        builder.<Boolean>withRequestField("user_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getUserAttached,
                ListDesktopsDetailRequest::setUserAttached));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getEnterpriseProjectId,
                ListDesktopsDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getImageId, ListDesktopsDetailRequest::setImageId));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getChargeMode, ListDesktopsDetailRequest::setChargeMode));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getInMaintenanceMode,
                ListDesktopsDetailRequest::setInMaintenanceMode));
        builder.<Boolean>withRequestField("is_share_desktop",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getIsShareDesktop,
                ListDesktopsDetailRequest::setIsShareDesktop));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getSubnetId, ListDesktopsDetailRequest::setSubnetId));
        builder.<Boolean>withRequestField("is_support_internet",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getIsSupportInternet,
                ListDesktopsDetailRequest::setIsSupportInternet));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsDetailRequest::getAvailabilityZone,
                ListDesktopsDetailRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDomainRequest, RegisterDomainResponse> registerDomain =
        genForRegisterDomain();

    private static HttpRequestDef<RegisterDomainRequest, RegisterDomainResponse> genForRegisterDomain() {
        // basic
        HttpRequestDef.Builder<RegisterDomainRequest, RegisterDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterDomainRequest.class, RegisterDomainResponse.class)
                .withName("RegisterDomain")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/rejoin-domain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterDomainRequest::getDesktopId, RegisterDomainRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktop =
        genForResizeDesktop();

    private static HttpRequestDef<ResizeDesktopRequest, ResizeDesktopResponse> genForResizeDesktop() {
        // basic
        HttpRequestDef.Builder<ResizeDesktopRequest, ResizeDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeDesktopRequest.class, ResizeDesktopResponse.class)
                .withName("ResizeDesktop")
                .withUri("/v2/{project_id}/desktops/resize")
                .withContentType("application/json");

        // requests
        builder.<ResizeDesktopReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeDesktopReq.class),
            f -> f.withMarshaller(ResizeDesktopRequest::getBody, ResizeDesktopRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendNotificationsRequest, SendNotificationsResponse> sendNotifications =
        genForSendNotifications();

    private static HttpRequestDef<SendNotificationsRequest, SendNotificationsResponse> genForSendNotifications() {
        // basic
        HttpRequestDef.Builder<SendNotificationsRequest, SendNotificationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendNotificationsRequest.class, SendNotificationsResponse.class)
                .withName("SendNotifications")
                .withUri("/v2/{project_id}/desktops/notifications")
                .withContentType("application/json");

        // requests
        builder.<SendNotificationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendNotificationsReq.class),
            f -> f.withMarshaller(SendNotificationsRequest::getBody, SendNotificationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetMaintenanceModeRequest, SetMaintenanceModeResponse> setMaintenanceMode =
        genForSetMaintenanceMode();

    private static HttpRequestDef<SetMaintenanceModeRequest, SetMaintenanceModeResponse> genForSetMaintenanceMode() {
        // basic
        HttpRequestDef.Builder<SetMaintenanceModeRequest, SetMaintenanceModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetMaintenanceModeRequest.class, SetMaintenanceModeResponse.class)
                .withName("SetMaintenanceMode")
                .withUri("/v2/{project_id}/desktops/maintenance-mode")
                .withContentType("application/json");

        // requests
        builder.<BatchSetMaintenanceModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSetMaintenanceModeReq.class),
            f -> f.withMarshaller(SetMaintenanceModeRequest::getBody, SetMaintenanceModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetail =
        genForShowDesktopDetail();

    private static HttpRequestDef<ShowDesktopDetailRequest, ShowDesktopDetailResponse> genForShowDesktopDetail() {
        // basic
        HttpRequestDef.Builder<ShowDesktopDetailRequest, ShowDesktopDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopDetailRequest.class, ShowDesktopDetailResponse.class)
                .withName("ShowDesktopDetail")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopDetailRequest::getDesktopId, ShowDesktopDetailRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse> showDesktopMonitorData =
        genForShowDesktopMonitorData();

    private static HttpRequestDef<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse> genForShowDesktopMonitorData() {
        // basic
        HttpRequestDef.Builder<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDesktopMonitorDataRequest.class, ShowDesktopMonitorDataResponse.class)
            .withName("ShowDesktopMonitorData")
            .withUri("/v2/{project_id}/desktop-monitor/{desktop_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopMonitorDataRequest::getDesktopId,
                ShowDesktopMonitorDataRequest::setDesktopId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopMonitorDataRequest::getStartTime,
                ShowDesktopMonitorDataRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopMonitorDataRequest::getEndTime,
                ShowDesktopMonitorDataRequest::setEndTime));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopMonitorDataRequest::getMetricName,
                ShowDesktopMonitorDataRequest::setMetricName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetwork =
        genForShowDesktopNetwork();

    private static HttpRequestDef<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> genForShowDesktopNetwork() {
        // basic
        HttpRequestDef.Builder<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopNetworkRequest.class, ShowDesktopNetworkResponse.class)
                .withName("ShowDesktopNetwork")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/networks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopNetworkRequest::getDesktopId, ShowDesktopNetworkRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse> showDesktopNetworks =
        genForShowDesktopNetworks();

    private static HttpRequestDef<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse> genForShowDesktopNetworks() {
        // basic
        HttpRequestDef.Builder<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDesktopNetworksRequest.class, ShowDesktopNetworksResponse.class)
                .withName("ShowDesktopNetworks")
                .withUri("/v2/{project_id}/desktops/networks")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("desktop_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDesktopNetworksRequest::getDesktopIds,
                ShowDesktopNetworksRequest::setDesktopIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse> showDesktopRemoteAssistanceInfo =
        genForShowDesktopRemoteAssistanceInfo();

    private static HttpRequestDef<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse> genForShowDesktopRemoteAssistanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDesktopRemoteAssistanceInfoRequest.class,
                    ShowDesktopRemoteAssistanceInfoResponse.class)
                .withName("ShowDesktopRemoteAssistanceInfo")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/remote-assistance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopRemoteAssistanceInfoRequest::getDesktopId,
                ShowDesktopRemoteAssistanceInfoRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse> showRemoteConsoleAddress =
        genForShowRemoteConsoleAddress();

    private static HttpRequestDef<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse> genForShowRemoteConsoleAddress() {
        // basic
        HttpRequestDef.Builder<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRemoteConsoleAddressRequest.class, ShowRemoteConsoleAddressResponse.class)
                .withName("ShowRemoteConsoleAddress")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/remote-consoles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRemoteConsoleAddressRequest::getDesktopId,
                ShowRemoteConsoleAddressRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSysprepInfoRequest, ShowSysprepInfoResponse> showSysprepInfo =
        genForShowSysprepInfo();

    private static HttpRequestDef<ShowSysprepInfoRequest, ShowSysprepInfoResponse> genForShowSysprepInfo() {
        // basic
        HttpRequestDef.Builder<ShowSysprepInfoRequest, ShowSysprepInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSysprepInfoRequest.class, ShowSysprepInfoResponse.class)
                .withName("ShowSysprepInfo")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/sysprep")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSysprepInfoRequest::getDesktopId, ShowSysprepInfoRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopRequest, UpdateDesktopResponse> updateDesktop =
        genForUpdateDesktop();

    private static HttpRequestDef<UpdateDesktopRequest, UpdateDesktopResponse> genForUpdateDesktop() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopRequest, UpdateDesktopResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDesktopRequest.class, UpdateDesktopResponse.class)
                .withName("UpdateDesktop")
                .withUri("/v2/{project_id}/desktops/{desktop_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDesktopRequest::getDesktopId, UpdateDesktopRequest::setDesktopId));
        builder.<ModifyDesktopAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDesktopAttributesReq.class),
            f -> f.withMarshaller(UpdateDesktopRequest::getBody, UpdateDesktopRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse> updateDesktopSids =
        genForUpdateDesktopSids();

    private static HttpRequestDef<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse> genForUpdateDesktopSids() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDesktopSidsRequest.class, UpdateDesktopSidsResponse.class)
                .withName("UpdateDesktopSids")
                .withUri("/v2/{project_id}/desktops/sids")
                .withContentType("application/json");

        // requests
        builder.<UpdateDesktopSidReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesktopSidReq.class),
            f -> f.withMarshaller(UpdateDesktopSidsRequest::getBody, UpdateDesktopSidsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse> updateDesktopUsername =
        genForUpdateDesktopUsername();

    private static HttpRequestDef<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse> genForUpdateDesktopUsername() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDesktopUsernameRequest.class, UpdateDesktopUsernameResponse.class)
            .withName("UpdateDesktopUsername")
            .withUri("/v2/{project_id}/desktops/change-username")
            .withContentType("application/json");

        // requests
        builder.<UpdateDesktopUsernameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesktopUsernameReq.class),
            f -> f.withMarshaller(UpdateDesktopUsernameRequest::getBody, UpdateDesktopUsernameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicy =
        genForBatchDeleteDesktopNamePolicy();

    private static HttpRequestDef<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> genForBatchDeleteDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDesktopNamePolicyRequest.class,
                    BatchDeleteDesktopNamePolicyResponse.class)
                .withName("BatchDeleteDesktopNamePolicy")
                .withUri("/v2/{project_id}/desktop-name-policies/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDesktopNamePolicyReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopNamePolicyRequest::getBody,
                BatchDeleteDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> createDesktopNamePolicy =
        genForCreateDesktopNamePolicy();

    private static HttpRequestDef<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> genForCreateDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDesktopNamePolicyRequest.class, CreateDesktopNamePolicyResponse.class)
            .withName("CreateDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies")
            .withContentType("application/json");

        // requests
        builder.<CreateDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopNamePolicyReq.class),
            f -> f.withMarshaller(CreateDesktopNamePolicyRequest::getBody, CreateDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> listDesktopNamePolicy =
        genForListDesktopNamePolicy();

    private static HttpRequestDef<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> genForListDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopNamePolicyRequest.class, ListDesktopNamePolicyResponse.class)
            .withName("ListDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_contain_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getIsContainUser,
                ListDesktopNamePolicyRequest::setIsContainUser));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getPolicyName,
                ListDesktopNamePolicyRequest::setPolicyName));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getPolicyId,
                ListDesktopNamePolicyRequest::setPolicyId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getOffset, ListDesktopNamePolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopNamePolicyRequest::getLimit, ListDesktopNamePolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> updateDesktopNamePolicy =
        genForUpdateDesktopNamePolicy();

    private static HttpRequestDef<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> genForUpdateDesktopNamePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDesktopNamePolicyRequest.class, UpdateDesktopNamePolicyResponse.class)
            .withName("UpdateDesktopNamePolicy")
            .withUri("/v2/{project_id}/desktop-name-policies/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDesktopNamePolicyRequest::getPolicyId,
                UpdateDesktopNamePolicyRequest::setPolicyId));
        builder.<UpdateDesktopNamePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesktopNamePolicyReq.class),
            f -> f.withMarshaller(UpdateDesktopNamePolicyRequest::getBody, UpdateDesktopNamePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse> addDesktopPoolVolumes =
        genForAddDesktopPoolVolumes();

    private static HttpRequestDef<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse> genForAddDesktopPoolVolumes() {
        // basic
        HttpRequestDef.Builder<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddDesktopPoolVolumesRequest.class, AddDesktopPoolVolumesResponse.class)
            .withName("AddDesktopPoolVolumes")
            .withUri("/v2/{project_id}/desktop-pools/{pool_id}/volumes/batch-add")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDesktopPoolVolumesRequest::getPoolId, AddDesktopPoolVolumesRequest::setPoolId));
        builder.<AddDesktopPoolVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDesktopPoolVolumesReq.class),
            f -> f.withMarshaller(AddDesktopPoolVolumesRequest::getBody, AddDesktopPoolVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopPoolRequest, CreateDesktopPoolResponse> createDesktopPool =
        genForCreateDesktopPool();

    private static HttpRequestDef<CreateDesktopPoolRequest, CreateDesktopPoolResponse> genForCreateDesktopPool() {
        // basic
        HttpRequestDef.Builder<CreateDesktopPoolRequest, CreateDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopPoolRequest.class, CreateDesktopPoolResponse.class)
                .withName("CreateDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools")
                .withContentType("application/json");

        // requests
        builder.<CreateDesktopPoolReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopPoolReq.class),
            f -> f.withMarshaller(CreateDesktopPoolRequest::getBody, CreateDesktopPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse> createDesktopPoolAuthorizedObjects =
        genForCreateDesktopPoolAuthorizedObjects();

    private static HttpRequestDef<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse> genForCreateDesktopPoolAuthorizedObjects() {
        // basic
        HttpRequestDef.Builder<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDesktopPoolAuthorizedObjectsRequest.class,
                    CreateDesktopPoolAuthorizedObjectsResponse.class)
                .withName("CreateDesktopPoolAuthorizedObjects")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDesktopPoolAuthorizedObjectsRequest::getPoolId,
                CreateDesktopPoolAuthorizedObjectsRequest::setPoolId));
        builder.<CreateDesktopPoolAuthorizedObjectsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopPoolAuthorizedObjectsRequestBody.class),
            f -> f.withMarshaller(CreateDesktopPoolAuthorizedObjectsRequest::getBody,
                CreateDesktopPoolAuthorizedObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse> deleteDesktopPool =
        genForDeleteDesktopPool();

    private static HttpRequestDef<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse> genForDeleteDesktopPool() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDesktopPoolRequest.class, DeleteDesktopPoolResponse.class)
                .withName("DeleteDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopPoolRequest::getPoolId, DeleteDesktopPoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse> deleteDesktopPoolVolumes =
        genForDeleteDesktopPoolVolumes();

    private static HttpRequestDef<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse> genForDeleteDesktopPoolVolumes() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DeleteDesktopPoolVolumesRequest.class, DeleteDesktopPoolVolumesResponse.class)
                .withName("DeleteDesktopPoolVolumes")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/volumes/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopPoolVolumesRequest::getPoolId,
                DeleteDesktopPoolVolumesRequest::setPoolId));
        builder.<DeleteDesktopPoolVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDesktopPoolVolumesReq.class),
            f -> f.withMarshaller(DeleteDesktopPoolVolumesRequest::getBody, DeleteDesktopPoolVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse> executeDesktopPoolAction =
        genForExecuteDesktopPoolAction();

    private static HttpRequestDef<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse> genForExecuteDesktopPoolAction() {
        // basic
        HttpRequestDef.Builder<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteDesktopPoolActionRequest.class, ExecuteDesktopPoolActionResponse.class)
                .withName("ExecuteDesktopPoolAction")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDesktopPoolActionRequest::getPoolId,
                ExecuteDesktopPoolActionRequest::setPoolId));
        builder.<DesktopPoolActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DesktopPoolActionReq.class),
            f -> f.withMarshaller(ExecuteDesktopPoolActionRequest::getBody, ExecuteDesktopPoolActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse> executeDesktopPoolScript =
        genForExecuteDesktopPoolScript();

    private static HttpRequestDef<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse> genForExecuteDesktopPoolScript() {
        // basic
        HttpRequestDef.Builder<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteDesktopPoolScriptRequest.class, ExecuteDesktopPoolScriptResponse.class)
                .withName("ExecuteDesktopPoolScript")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/script-executions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDesktopPoolScriptRequest::getPoolId,
                ExecuteDesktopPoolScriptRequest::setPoolId));
        builder.<ExecuteDesktopPoolScriptsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteDesktopPoolScriptsReq.class),
            f -> f.withMarshaller(ExecuteDesktopPoolScriptRequest::getBody, ExecuteDesktopPoolScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse> expandDesktopPool =
        genForExpandDesktopPool();

    private static HttpRequestDef<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse> genForExpandDesktopPool() {
        // basic
        HttpRequestDef.Builder<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandDesktopPoolRequest.class, ExpandDesktopPoolResponse.class)
                .withName("ExpandDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandDesktopPoolRequest::getPoolId, ExpandDesktopPoolRequest::setPoolId));
        builder.<ExpandDesktopPoolReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDesktopPoolReq.class),
            f -> f.withMarshaller(ExpandDesktopPoolRequest::getBody, ExpandDesktopPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse> expandDesktopPoolVolumes =
        genForExpandDesktopPoolVolumes();

    private static HttpRequestDef<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse> genForExpandDesktopPoolVolumes() {
        // basic
        HttpRequestDef.Builder<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExpandDesktopPoolVolumesRequest.class, ExpandDesktopPoolVolumesResponse.class)
                .withName("ExpandDesktopPoolVolumes")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/volumes/batch-expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandDesktopPoolVolumesRequest::getPoolId,
                ExpandDesktopPoolVolumesRequest::setPoolId));
        builder.<ExpandDesktopPoolVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDesktopPoolVolumesReq.class),
            f -> f.withMarshaller(ExpandDesktopPoolVolumesRequest::getBody, ExpandDesktopPoolVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse> listDesktopPoolAuthorizedObjects =
        genForListDesktopPoolAuthorizedObjects();

    private static HttpRequestDef<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse> genForListDesktopPoolAuthorizedObjects() {
        // basic
        HttpRequestDef.Builder<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDesktopPoolAuthorizedObjectsRequest.class,
                    ListDesktopPoolAuthorizedObjectsResponse.class)
                .withName("ListDesktopPoolAuthorizedObjects")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopPoolAuthorizedObjectsRequest::getPoolId,
                ListDesktopPoolAuthorizedObjectsRequest::setPoolId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolAuthorizedObjectsRequest::getOffset,
                ListDesktopPoolAuthorizedObjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolAuthorizedObjectsRequest::getLimit,
                ListDesktopPoolAuthorizedObjectsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopPoolsRequest, ListDesktopPoolsResponse> listDesktopPools =
        genForListDesktopPools();

    private static HttpRequestDef<ListDesktopPoolsRequest, ListDesktopPoolsResponse> genForListDesktopPools() {
        // basic
        HttpRequestDef.Builder<ListDesktopPoolsRequest, ListDesktopPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopPoolsRequest.class, ListDesktopPoolsResponse.class)
                .withName("ListDesktopPools")
                .withUri("/v2/{project_id}/desktop-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getName, ListDesktopPoolsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getType, ListDesktopPoolsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getEnterpriseProjectId,
                ListDesktopPoolsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getOffset, ListDesktopPoolsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getLimit, ListDesktopPoolsRequest::setLimit));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDesktopPoolsRequest::getInMaintenanceMode,
                ListDesktopPoolsRequest::setInMaintenanceMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse> listDesktopPoolsByUsers =
        genForListDesktopPoolsByUsers();

    private static HttpRequestDef<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse> genForListDesktopPoolsByUsers() {
        // basic
        HttpRequestDef.Builder<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopPoolsByUsersRequest.class, ListDesktopPoolsByUsersResponse.class)
            .withName("ListDesktopPoolsByUsers")
            .withUri("/v2/{project_id}/desktop-pools/statistics/by-users")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("user_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopPoolsByUsersRequest::getUserIds,
                ListDesktopPoolsByUsersRequest::setUserIds));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolsByUsersRequest::getOffset,
                ListDesktopPoolsByUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopPoolsByUsersRequest::getLimit, ListDesktopPoolsByUsersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse> listInconsistentStatics =
        genForListInconsistentStatics();

    private static HttpRequestDef<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse> genForListInconsistentStatics() {
        // basic
        HttpRequestDef.Builder<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInconsistentStaticsRequest.class, ListInconsistentStaticsResponse.class)
            .withName("ListInconsistentStatics")
            .withUri("/v2/{project_id}/desktop-pools/{pool_id}/inconsistent-statics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInconsistentStaticsRequest::getPoolId,
                ListInconsistentStaticsRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse> listPoolDesktopsDetail =
        genForListPoolDesktopsDetail();

    private static HttpRequestDef<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse> genForListPoolDesktopsDetail() {
        // basic
        HttpRequestDef.Builder<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPoolDesktopsDetailRequest.class, ListPoolDesktopsDetailResponse.class)
            .withName("ListPoolDesktopsDetail")
            .withUri("/v2/{project_id}/desktop-pools/{pool_id}/desktops")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getPoolId, ListPoolDesktopsDetailRequest::setPoolId));
        builder.<ListPoolDesktopsDetailRequest.InconsistentTypeEnum>withRequestField("inconsistent_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoolDesktopsDetailRequest.InconsistentTypeEnum.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getInconsistentType,
                ListPoolDesktopsDetailRequest::setInconsistentType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getOffset, ListPoolDesktopsDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getLimit, ListPoolDesktopsDetailRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getStatus, ListPoolDesktopsDetailRequest::setStatus));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getUserName,
                ListPoolDesktopsDetailRequest::setUserName));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getUserNames,
                ListPoolDesktopsDetailRequest::setUserNames));
        builder.<ListPoolDesktopsDetailRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoolDesktopsDetailRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getSortField,
                ListPoolDesktopsDetailRequest::setSortField));
        builder.<ListPoolDesktopsDetailRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoolDesktopsDetailRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getSortType,
                ListPoolDesktopsDetailRequest::setSortType));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getComputerName,
                ListPoolDesktopsDetailRequest::setComputerName));
        builder.<List<String>>withRequestField("computer_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getComputerNames,
                ListPoolDesktopsDetailRequest::setComputerNames));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getDesktopIp,
                ListPoolDesktopsDetailRequest::setDesktopIp));
        builder.<List<String>>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getDesktopId,
                ListPoolDesktopsDetailRequest::setDesktopId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getDesktopType,
                ListPoolDesktopsDetailRequest::setDesktopType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getTag, ListPoolDesktopsDetailRequest::setTag));
        builder.<Boolean>withRequestField("user_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getUserAttached,
                ListPoolDesktopsDetailRequest::setUserAttached));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getEnterpriseProjectId,
                ListPoolDesktopsDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getImageId,
                ListPoolDesktopsDetailRequest::setImageId));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getChargeMode,
                ListPoolDesktopsDetailRequest::setChargeMode));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getInMaintenanceMode,
                ListPoolDesktopsDetailRequest::setInMaintenanceMode));
        builder.<Boolean>withRequestField("is_share_desktop",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getIsShareDesktop,
                ListPoolDesktopsDetailRequest::setIsShareDesktop));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getSubnetId,
                ListPoolDesktopsDetailRequest::setSubnetId));
        builder.<Boolean>withRequestField("is_support_internet",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getIsSupportInternet,
                ListPoolDesktopsDetailRequest::setIsSupportInternet));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolDesktopsDetailRequest::getAvailabilityZone,
                ListPoolDesktopsDetailRequest::setAvailabilityZone));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse> rebuildDesktopPool =
        genForRebuildDesktopPool();

    private static HttpRequestDef<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse> genForRebuildDesktopPool() {
        // basic
        HttpRequestDef.Builder<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebuildDesktopPoolRequest.class, RebuildDesktopPoolResponse.class)
                .withName("RebuildDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/rebuild")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebuildDesktopPoolRequest::getPoolId, RebuildDesktopPoolRequest::setPoolId));
        builder.<RebuildDesktopPoolReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebuildDesktopPoolReq.class),
            f -> f.withMarshaller(RebuildDesktopPoolRequest::getBody, RebuildDesktopPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse> resizeDesktopPool =
        genForResizeDesktopPool();

    private static HttpRequestDef<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse> genForResizeDesktopPool() {
        // basic
        HttpRequestDef.Builder<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeDesktopPoolRequest.class, ResizeDesktopPoolResponse.class)
                .withName("ResizeDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeDesktopPoolRequest::getPoolId, ResizeDesktopPoolRequest::setPoolId));
        builder.<ResizeDesktopPoolReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeDesktopPoolReq.class),
            f -> f.withMarshaller(ResizeDesktopPoolRequest::getBody, ResizeDesktopPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse> sendDesktopPoolNotifications =
        genForSendDesktopPoolNotifications();

    private static HttpRequestDef<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse> genForSendDesktopPoolNotifications() {
        // basic
        HttpRequestDef.Builder<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SendDesktopPoolNotificationsRequest.class,
                    SendDesktopPoolNotificationsResponse.class)
                .withName("SendDesktopPoolNotifications")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}/notifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendDesktopPoolNotificationsRequest::getPoolId,
                SendDesktopPoolNotificationsRequest::setPoolId));
        builder.<SendDesktopPoolNotificationsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SendDesktopPoolNotificationsReq.class),
            f -> f.withMarshaller(SendDesktopPoolNotificationsRequest::getBody,
                SendDesktopPoolNotificationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse> showDesktopPoolDetail =
        genForShowDesktopPoolDetail();

    private static HttpRequestDef<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse> genForShowDesktopPoolDetail() {
        // basic
        HttpRequestDef.Builder<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDesktopPoolDetailRequest.class, ShowDesktopPoolDetailResponse.class)
            .withName("ShowDesktopPoolDetail")
            .withUri("/v2/{project_id}/desktop-pools/{pool_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolDetailRequest::getPoolId, ShowDesktopPoolDetailRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse> showDesktopPoolsScriptExecTasks =
        genForShowDesktopPoolsScriptExecTasks();

    private static HttpRequestDef<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse> genForShowDesktopPoolsScriptExecTasks() {
        // basic
        HttpRequestDef.Builder<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDesktopPoolsScriptExecTasksRequest.class,
                    ShowDesktopPoolsScriptExecTasksResponse.class)
                .withName("ShowDesktopPoolsScriptExecTasks")
                .withUri("/v2/{project_id}/desktop-pools/script-execution-tasks/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getDesktopPoolId,
                ShowDesktopPoolsScriptExecTasksRequest::setDesktopPoolId));
        builder.<String>withRequestField("script_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getScriptId,
                ShowDesktopPoolsScriptExecTasksRequest::setScriptId));
        builder.<String>withRequestField("script_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getScriptName,
                ShowDesktopPoolsScriptExecTasksRequest::setScriptName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getStatus,
                ShowDesktopPoolsScriptExecTasksRequest::setStatus));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getTaskType,
                ShowDesktopPoolsScriptExecTasksRequest::setTaskType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getOffset,
                ShowDesktopPoolsScriptExecTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getLimit,
                ShowDesktopPoolsScriptExecTasksRequest::setLimit));
        builder.<String>withRequestField("execute_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getExecuteTimeStart,
                ShowDesktopPoolsScriptExecTasksRequest::setExecuteTimeStart));
        builder.<String>withRequestField("execute_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getExecuteTimeEnd,
                ShowDesktopPoolsScriptExecTasksRequest::setExecuteTimeEnd));
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDesktopPoolsScriptExecTasksRequest::getTaskId,
                ShowDesktopPoolsScriptExecTasksRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse> updateDesktopPool =
        genForUpdateDesktopPool();

    private static HttpRequestDef<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse> genForUpdateDesktopPool() {
        // basic
        HttpRequestDef.Builder<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDesktopPoolRequest.class, UpdateDesktopPoolResponse.class)
                .withName("UpdateDesktopPool")
                .withUri("/v2/{project_id}/desktop-pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDesktopPoolRequest::getPoolId, UpdateDesktopPoolRequest::setPoolId));
        builder.<UpdateDesktopPoolAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesktopPoolAttributesReq.class),
            f -> f.withMarshaller(UpdateDesktopPoolRequest::getBody, UpdateDesktopPoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTags =
        genForBatchAddDesktopsTags();

    private static HttpRequestDef<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> genForBatchAddDesktopsTags() {
        // basic
        HttpRequestDef.Builder<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddDesktopsTagsRequest.class, BatchAddDesktopsTagsResponse.class)
            .withName("BatchAddDesktopsTags")
            .withUri("/v2/{project_id}/desktops/batch-tags")
            .withContentType("application/json");

        // requests
        builder.<BatchAddDesktopsTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddDesktopsTagsReq.class),
            f -> f.withMarshaller(BatchAddDesktopsTagsRequest::getBody, BatchAddDesktopsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTags =
        genForBatchChangeTags();

    private static HttpRequestDef<BatchChangeTagsRequest, BatchChangeTagsResponse> genForBatchChangeTags() {
        // basic
        HttpRequestDef.Builder<BatchChangeTagsRequest, BatchChangeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchChangeTagsRequest.class, BatchChangeTagsResponse.class)
                .withName("BatchChangeTags")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchChangeTagsRequest::getDesktopId, BatchChangeTagsRequest::setDesktopId));
        builder.<TagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagsReq.class),
            f -> f.withMarshaller(BatchChangeTagsRequest::getBody, BatchChangeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTags =
        genForBatchDeleteDesktopsTags();

    private static HttpRequestDef<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> genForBatchDeleteDesktopsTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteDesktopsTagsRequest.class, BatchDeleteDesktopsTagsResponse.class)
            .withName("BatchDeleteDesktopsTags")
            .withUri("/v2/{project_id}/desktops/batch-tags")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteDesktopsTagsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDesktopsTagsReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopsTagsRequest::getBody, BatchDeleteDesktopsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getDesktopId, CreateTagRequest::setDesktopId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getDesktopId, DeleteTagRequest::setDesktopId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTags =
        genForListDesktopByTags();

    private static HttpRequestDef<ListDesktopByTagsRequest, ListDesktopByTagsResponse> genForListDesktopByTags() {
        // basic
        HttpRequestDef.Builder<ListDesktopByTagsRequest, ListDesktopByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDesktopByTagsRequest.class, ListDesktopByTagsResponse.class)
                .withName("ListDesktopByTags")
                .withUri("/v2/{project_id}/desktops/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<QueryDesktopByTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryDesktopByTagReq.class),
            f -> f.withMarshaller(ListDesktopByTagsRequest::getBody, ListDesktopByTagsRequest::setBody));

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
                .withUri("/v2/{project_id}/desktops/tags")
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
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getKey, ListProjectTagsRequest::setKey));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getValue, ListProjectTagsRequest::setValue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopId =
        genForShowTagByDesktopId();

    private static HttpRequestDef<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> genForShowTagByDesktopId() {
        // basic
        HttpRequestDef.Builder<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagByDesktopIdRequest.class, ShowTagByDesktopIdResponse.class)
                .withName("ShowTagByDesktopId")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagByDesktopIdRequest::getDesktopId, ShowTagByDesktopIdRequest::setDesktopId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDesktopListNewRequest, ExportDesktopListNewResponse> exportDesktopListNew =
        genForExportDesktopListNew();

    private static HttpRequestDef<ExportDesktopListNewRequest, ExportDesktopListNewResponse> genForExportDesktopListNew() {
        // basic
        HttpRequestDef.Builder<ExportDesktopListNewRequest, ExportDesktopListNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportDesktopListNewRequest.class, ExportDesktopListNewResponse.class)
            .withName("ExportDesktopListNew")
            .withUri("/v3/{project_id}/desktops/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getComputerName,
                ExportDesktopListNewRequest::setComputerName));
        builder.<String>withRequestField("desktop_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getDesktopIp,
                ExportDesktopListNewRequest::setDesktopIp));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getDesktopId,
                ExportDesktopListNewRequest::setDesktopId));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getTag, ExportDesktopListNewRequest::setTag));
        builder.<ExportDesktopListNewRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportDesktopListNewRequest.LanguageEnum.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getLanguage, ExportDesktopListNewRequest::setLanguage));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getEnterpriseProjectId,
                ExportDesktopListNewRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getDesktopType,
                ExportDesktopListNewRequest::setDesktopType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getStatus, ExportDesktopListNewRequest::setStatus));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getUserNames,
                ExportDesktopListNewRequest::setUserNames));
        builder.<ExportDesktopListNewRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportDesktopListNewRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getSortField,
                ExportDesktopListNewRequest::setSortField));
        builder.<ExportDesktopListNewRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportDesktopListNewRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getSortType, ExportDesktopListNewRequest::setSortType));
        builder.<String>withRequestField("pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getPoolId, ExportDesktopListNewRequest::setPoolId));
        builder.<Boolean>withRequestField("user_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getUserAttached,
                ExportDesktopListNewRequest::setUserAttached));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getImageId, ExportDesktopListNewRequest::setImageId));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getChargeMode,
                ExportDesktopListNewRequest::setChargeMode));
        builder.<Boolean>withRequestField("in_maintenance_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getInMaintenanceMode,
                ExportDesktopListNewRequest::setInMaintenanceMode));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getSubnetId, ExportDesktopListNewRequest::setSubnetId));
        builder.<String>withRequestField("connection_status_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopListNewRequest::getConnectionStatusVersion,
                ExportDesktopListNewRequest::setConnectionStatusVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHibernateTypeRequest, ShowHibernateTypeResponse> showHibernateType =
        genForShowHibernateType();

    private static HttpRequestDef<ShowHibernateTypeRequest, ShowHibernateTypeResponse> genForShowHibernateType() {
        // basic
        HttpRequestDef.Builder<ShowHibernateTypeRequest, ShowHibernateTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHibernateTypeRequest.class, ShowHibernateTypeResponse.class)
                .withName("ShowHibernateType")
                .withUri("/v2/{project_id}/hibernate-type")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExportTasksRequest, DeleteExportTasksResponse> deleteExportTasks =
        genForDeleteExportTasks();

    private static HttpRequestDef<DeleteExportTasksRequest, DeleteExportTasksResponse> genForDeleteExportTasks() {
        // basic
        HttpRequestDef.Builder<DeleteExportTasksRequest, DeleteExportTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteExportTasksRequest.class, DeleteExportTasksResponse.class)
                .withName("DeleteExportTasks")
                .withUri("/v2/{project_id}/export-tasks/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteExportTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteExportTaskRequestBody.class),
            f -> f.withMarshaller(DeleteExportTasksRequest::getBody, DeleteExportTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadExportFileRequest, DownloadExportFileResponse> downloadExportFile =
        genForDownloadExportFile();

    private static HttpRequestDef<DownloadExportFileRequest, DownloadExportFileResponse> genForDownloadExportFile() {
        // basic
        HttpRequestDef.Builder<DownloadExportFileRequest, DownloadExportFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadExportFileRequest.class, DownloadExportFileResponse.class)
                .withName("DownloadExportFile")
                .withUri("/v2/{project_id}/export-tasks/{task_id}/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadExportFileRequest::getTaskId, DownloadExportFileRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExportTasksRequest, ListExportTasksResponse> listExportTasks =
        genForListExportTasks();

    private static HttpRequestDef<ListExportTasksRequest, ListExportTasksResponse> genForListExportTasks() {
        // basic
        HttpRequestDef.Builder<ListExportTasksRequest, ListExportTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExportTasksRequest.class, ListExportTasksResponse.class)
                .withName("ListExportTasks")
                .withUri("/v2/{project_id}/export-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExportTasksRequest::getFileName, ListExportTasksRequest::setFileName));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExportTasksRequest::getTaskId, ListExportTasksRequest::setTaskId));
        builder.<ListExportTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExportTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListExportTasksRequest::getStatus, ListExportTasksRequest::setStatus));
        builder.<Boolean>withRequestField("is_download",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListExportTasksRequest::getIsDownload, ListExportTasksRequest::setIsDownload));
        builder.<ListExportTasksRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExportTasksRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListExportTasksRequest::getSortField, ListExportTasksRequest::setSortField));
        builder.<ListExportTasksRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListExportTasksRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListExportTasksRequest::getSortType, ListExportTasksRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExportTasksRequest::getOffset, ListExportTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExportTasksRequest::getLimit, ListExportTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroups =
        genForBatchDeleteUserGroups();

    private static HttpRequestDef<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> genForBatchDeleteUserGroups() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUserGroupsRequest.class, BatchDeleteUserGroupsResponse.class)
            .withName("BatchDeleteUserGroups")
            .withUri("/v2/{project_id}/groups/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteUserGroupsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteUserGroupsReq.class),
            f -> f.withMarshaller(BatchDeleteUserGroupsRequest::getBody, BatchDeleteUserGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroup =
        genForCreateUserGroup();

    private static HttpRequestDef<CreateUserGroupRequest, CreateUserGroupResponse> genForCreateUserGroup() {
        // basic
        HttpRequestDef.Builder<CreateUserGroupRequest, CreateUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserGroupRequest.class, CreateUserGroupResponse.class)
                .withName("CreateUserGroup")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateUserGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserGroupReq.class),
            f -> f.withMarshaller(CreateUserGroupRequest::getBody, CreateUserGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroup =
        genForDeleteUserGroup();

    private static HttpRequestDef<DeleteUserGroupRequest, DeleteUserGroupResponse> genForDeleteUserGroup() {
        // basic
        HttpRequestDef.Builder<DeleteUserGroupRequest, DeleteUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserGroupRequest.class, DeleteUserGroupResponse.class)
                .withName("DeleteUserGroup")
                .withUri("/v2/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserGroupRequest::getGroupId, DeleteUserGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserGroupsRequest, ExportUserGroupsResponse> exportUserGroups =
        genForExportUserGroups();

    private static HttpRequestDef<ExportUserGroupsRequest, ExportUserGroupsResponse> genForExportUserGroups() {
        // basic
        HttpRequestDef.Builder<ExportUserGroupsRequest, ExportUserGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportUserGroupsRequest.class, ExportUserGroupsResponse.class)
                .withName("ExportUserGroups")
                .withUri("/v2/{project_id}/groups/export")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserGroupsRequest::getLimit, ExportUserGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserGroupsRequest::getOffset, ExportUserGroupsRequest::setOffset));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupsRequest::getKeyword, ExportUserGroupsRequest::setKeyword));
        builder.<ExportUserGroupsRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportUserGroupsRequest.LanguageEnum.class),
            f -> f.withMarshaller(ExportUserGroupsRequest::getLanguage, ExportUserGroupsRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroups =
        genForListUserGroups();

    private static HttpRequestDef<ListUserGroupsRequest, ListUserGroupsResponse> genForListUserGroups() {
        // basic
        HttpRequestDef.Builder<ListUserGroupsRequest, ListUserGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserGroupsRequest.class, ListUserGroupsResponse.class)
                .withName("ListUserGroups")
                .withUri("/v2/{project_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getLimit, ListUserGroupsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getOffset, ListUserGroupsRequest::setOffset));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserGroupsRequest::getKeyword, ListUserGroupsRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroup =
        genForListUsersOfGroup();

    private static HttpRequestDef<ListUsersOfGroupRequest, ListUsersOfGroupResponse> genForListUsersOfGroup() {
        // basic
        HttpRequestDef.Builder<ListUsersOfGroupRequest, ListUsersOfGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersOfGroupRequest.class, ListUsersOfGroupResponse.class)
                .withName("ListUsersOfGroup")
                .withUri("/v2/{project_id}/groups/{group_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getGroupId, ListUsersOfGroupRequest::setGroupId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getUserName, ListUsersOfGroupRequest::setUserName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getDescription, ListUsersOfGroupRequest::setDescription));
        builder.<ListUsersOfGroupRequest.ActiveTypeEnum>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfGroupRequest.ActiveTypeEnum.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getActiveType, ListUsersOfGroupRequest::setActiveType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getEnterpriseProjectId,
                ListUsersOfGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getLimit, ListUsersOfGroupRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfGroupRequest::getOffset, ListUsersOfGroupRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroup =
        genForRunActionsOnGroup();

    private static HttpRequestDef<RunActionsOnGroupRequest, RunActionsOnGroupResponse> genForRunActionsOnGroup() {
        // basic
        HttpRequestDef.Builder<RunActionsOnGroupRequest, RunActionsOnGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunActionsOnGroupRequest.class, RunActionsOnGroupResponse.class)
                .withName("RunActionsOnGroup")
                .withUri("/v2/{project_id}/groups/{group_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunActionsOnGroupRequest::getGroupId, RunActionsOnGroupRequest::setGroupId));
        builder.<ActionsOfUsersInGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActionsOfUsersInGroupRequest.class),
            f -> f.withMarshaller(RunActionsOnGroupRequest::getBody, RunActionsOnGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroup =
        genForUpdateUserGroup();

    private static HttpRequestDef<UpdateUserGroupRequest, UpdateUserGroupResponse> genForUpdateUserGroup() {
        // basic
        HttpRequestDef.Builder<UpdateUserGroupRequest, UpdateUserGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserGroupRequest.class, UpdateUserGroupResponse.class)
                .withName("UpdateUserGroup")
                .withUri("/v2/{project_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserGroupRequest::getGroupId, UpdateUserGroupRequest::setGroupId));
        builder.<EditUserGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserGroupRequest.class),
            f -> f.withMarshaller(UpdateUserGroupRequest::getBody, UpdateUserGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse> exportUserGroupUsersNew =
        genForExportUserGroupUsersNew();

    private static HttpRequestDef<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse> genForExportUserGroupUsersNew() {
        // basic
        HttpRequestDef.Builder<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserGroupUsersNewRequest.class, ExportUserGroupUsersNewResponse.class)
            .withName("ExportUserGroupUsersNew")
            .withUri("/v3/{project_id}/groups/{group_id}/users/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getGroupId,
                ExportUserGroupUsersNewRequest::setGroupId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getUserName,
                ExportUserGroupUsersNewRequest::setUserName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getDescription,
                ExportUserGroupUsersNewRequest::setDescription));
        builder.<ExportUserGroupUsersNewRequest.ActiveTypeEnum>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportUserGroupUsersNewRequest.ActiveTypeEnum.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getActiveType,
                ExportUserGroupUsersNewRequest::setActiveType));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getGroupName,
                ExportUserGroupUsersNewRequest::setGroupName));
        builder.<ExportUserGroupUsersNewRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportUserGroupUsersNewRequest.LanguageEnum.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getLanguage,
                ExportUserGroupUsersNewRequest::setLanguage));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserGroupUsersNewRequest::getEnterpriseProjectId,
                ExportUserGroupUsersNewRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostsDetailRequest, ListHostsDetailResponse> listHostsDetail =
        genForListHostsDetail();

    private static HttpRequestDef<ListHostsDetailRequest, ListHostsDetailResponse> genForListHostsDetail() {
        // basic
        HttpRequestDef.Builder<ListHostsDetailRequest, ListHostsDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostsDetailRequest.class, ListHostsDetailResponse.class)
                .withName("ListHostsDetail")
                .withUri("/v2/{project_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getName, ListHostsDetailRequest::setName));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getAvailabilityZone,
                ListHostsDetailRequest::setAvailabilityZone));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getHostId, ListHostsDetailRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getEnterpriseProjectId,
                ListHostsDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getHostType, ListHostsDetailRequest::setHostType));
        builder.<String>withRequestField("host_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getHostTypeName, ListHostsDetailRequest::setHostTypeName));
        builder.<ListHostsDetailRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHostsDetailRequest.StateEnum.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getState, ListHostsDetailRequest::setState));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getLimit, ListHostsDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getOffset, ListHostsDetailRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getMarker, ListHostsDetailRequest::setMarker));
        builder.<String>withRequestField("changes_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostsDetailRequest::getChangesSince, ListHostsDetailRequest::setChangesSince));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServersByHostIdRequest, ListServersByHostIdResponse> listServersByHostId =
        genForListServersByHostId();

    private static HttpRequestDef<ListServersByHostIdRequest, ListServersByHostIdResponse> genForListServersByHostId() {
        // basic
        HttpRequestDef.Builder<ListServersByHostIdRequest, ListServersByHostIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServersByHostIdRequest.class, ListServersByHostIdResponse.class)
                .withName("ListServersByHostId")
                .withUri("/v2/{project_id}/hosts/{host_id}/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServersByHostIdRequest::getHostId, ListServersByHostIdRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostsRequest, UpdateHostsResponse> updateHosts = genForUpdateHosts();

    private static HttpRequestDef<UpdateHostsRequest, UpdateHostsResponse> genForUpdateHosts() {
        // basic
        HttpRequestDef.Builder<UpdateHostsRequest, UpdateHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostsRequest.class, UpdateHostsResponse.class)
                .withName("UpdateHosts")
                .withUri("/v2/{project_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<UpdateHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHostsRequestBody.class),
            f -> f.withMarshaller(UpdateHostsRequest::getBody, UpdateHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImagesRequest, ListImagesResponse> listImages = genForListImages();

    private static HttpRequestDef<ListImagesRequest, ListImagesResponse> genForListImages() {
        // basic
        HttpRequestDef.Builder<ListImagesRequest, ListImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImagesRequest.class, ListImagesResponse.class)
                .withName("ListImages")
                .withUri("/v2/{project_id}/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getOsType, ListImagesRequest::setOsType));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageType, ListImagesRequest::setImageType));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPlatform, ListImagesRequest::setPlatform));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getArchitecture, ListImagesRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getPackageType, ListImagesRequest::setPackageType));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getImageId, ListImagesRequest::setImageId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getLimit, ListImagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImagesRequest::getOffset, ListImagesRequest::setOffset));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSortField, ListImagesRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImagesRequest::getSortType, ListImagesRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMarketImagesRequest, ListMarketImagesResponse> listMarketImages =
        genForListMarketImages();

    private static HttpRequestDef<ListMarketImagesRequest, ListMarketImagesResponse> genForListMarketImages() {
        // basic
        HttpRequestDef.Builder<ListMarketImagesRequest, ListMarketImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMarketImagesRequest.class, ListMarketImagesResponse.class)
                .withName("ListMarketImages")
                .withUri("/v2/{project_id}/market-images")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("image_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMarketImagesRequest::getImageIds, ListMarketImagesRequest::setImageIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateAddResourcesRequest, EstimateAddResourcesResponse> estimateAddResources =
        genForEstimateAddResources();

    private static HttpRequestDef<EstimateAddResourcesRequest, EstimateAddResourcesResponse> genForEstimateAddResources() {
        // basic
        HttpRequestDef.Builder<EstimateAddResourcesRequest, EstimateAddResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EstimateAddResourcesRequest.class, EstimateAddResourcesResponse.class)
            .withName("EstimateAddResources")
            .withUri("/v2/{project_id}/periodic/inquiry/add-resources")
            .withContentType("application/json");

        // requests
        builder.<EstimateAddSubResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateAddSubResourcesRequestBody.class),
            f -> f.withMarshaller(EstimateAddResourcesRequest::getBody, EstimateAddResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateChangeImagesRequest, EstimateChangeImagesResponse> estimateChangeImages =
        genForEstimateChangeImages();

    private static HttpRequestDef<EstimateChangeImagesRequest, EstimateChangeImagesResponse> genForEstimateChangeImages() {
        // basic
        HttpRequestDef.Builder<EstimateChangeImagesRequest, EstimateChangeImagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EstimateChangeImagesRequest.class, EstimateChangeImagesResponse.class)
            .withName("EstimateChangeImages")
            .withUri("/v2/{project_id}/periodic/inquiry/change-image")
            .withContentType("application/json");

        // requests
        builder.<EstimateChangeImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateChangeImageRequestBody.class),
            f -> f.withMarshaller(EstimateChangeImagesRequest::getBody, EstimateChangeImagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse> estimateDesktopPoolAddVolume =
        genForEstimateDesktopPoolAddVolume();

    private static HttpRequestDef<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse> genForEstimateDesktopPoolAddVolume() {
        // basic
        HttpRequestDef.Builder<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EstimateDesktopPoolAddVolumeRequest.class,
                    EstimateDesktopPoolAddVolumeResponse.class)
                .withName("EstimateDesktopPoolAddVolume")
                .withUri("/v2/{project_id}/desktop-pool/periodic/inquiry/add-volume")
                .withContentType("application/json");

        // requests
        builder.<EstimateAddVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateAddVolumeRequestBody.class),
            f -> f.withMarshaller(EstimateDesktopPoolAddVolumeRequest::getBody,
                EstimateDesktopPoolAddVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse> estimateDesktopPoolChangeImage =
        genForEstimateDesktopPoolChangeImage();

    private static HttpRequestDef<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse> genForEstimateDesktopPoolChangeImage() {
        // basic
        HttpRequestDef.Builder<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EstimateDesktopPoolChangeImageRequest.class,
                    EstimateDesktopPoolChangeImageResponse.class)
                .withName("EstimateDesktopPoolChangeImage")
                .withUri("/v2/{project_id}/desktop-pool/periodic/inquiry/change-image")
                .withContentType("application/json");

        // requests
        builder.<EstimateChangeImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateChangeImageRequestBody.class),
            f -> f.withMarshaller(EstimateDesktopPoolChangeImageRequest::getBody,
                EstimateDesktopPoolChangeImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse> estimateDesktopPoolExtendVolume =
        genForEstimateDesktopPoolExtendVolume();

    private static HttpRequestDef<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse> genForEstimateDesktopPoolExtendVolume() {
        // basic
        HttpRequestDef.Builder<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EstimateDesktopPoolExtendVolumeRequest.class,
                    EstimateDesktopPoolExtendVolumeResponse.class)
                .withName("EstimateDesktopPoolExtendVolume")
                .withUri("/v2/{project_id}/desktop-pool/periodic/inquiry/extend-volume")
                .withContentType("application/json");

        // requests
        builder.<EstimateExtendVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateExtendVolumeRequestBody.class),
            f -> f.withMarshaller(EstimateDesktopPoolExtendVolumeRequest::getBody,
                EstimateDesktopPoolExtendVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse> estimateDesktopPoolResize =
        genForEstimateDesktopPoolResize();

    private static HttpRequestDef<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse> genForEstimateDesktopPoolResize() {
        // basic
        HttpRequestDef.Builder<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    EstimateDesktopPoolResizeRequest.class,
                    EstimateDesktopPoolResizeResponse.class)
                .withName("EstimateDesktopPoolResize")
                .withUri("/v2/{project_id}/desktop-pool/periodic/inquiry/resize")
                .withContentType("application/json");

        // requests
        builder.<EstimateResizeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EstimateResizeRequestBody.class),
            f -> f.withMarshaller(EstimateDesktopPoolResizeRequest::getBody,
                EstimateDesktopPoolResizeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse> runActionsOnWorkspaceJob =
        genForRunActionsOnWorkspaceJob();

    private static HttpRequestDef<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse> genForRunActionsOnWorkspaceJob() {
        // basic
        HttpRequestDef.Builder<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RunActionsOnWorkspaceJobRequest.class, RunActionsOnWorkspaceJobResponse.class)
                .withName("RunActionsOnWorkspaceJob")
                .withUri("/v2/{project_id}/workspace-jobs/{job_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunActionsOnWorkspaceJobRequest::getJobId,
                RunActionsOnWorkspaceJobRequest::setJobId));
        builder.<JobActionsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(JobActionsReq.class),
            f -> f.withMarshaller(RunActionsOnWorkspaceJobRequest::getBody, RunActionsOnWorkspaceJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse> batchDeleteSubJobs =
        genForBatchDeleteSubJobs();

    private static HttpRequestDef<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse> genForBatchDeleteSubJobs() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteSubJobsRequest.class, BatchDeleteSubJobsResponse.class)
                .withName("BatchDeleteSubJobs")
                .withUri("/v2/{project_id}/workspace-sub-jobs/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteSubJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSubJobsReq.class),
            f -> f.withMarshaller(BatchDeleteSubJobsRequest::getBody, BatchDeleteSubJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobs =
        genForListItaSubJobs();

    private static HttpRequestDef<ListItaSubJobsRequest, ListItaSubJobsResponse> genForListItaSubJobs() {
        // basic
        HttpRequestDef.Builder<ListItaSubJobsRequest, ListItaSubJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListItaSubJobsRequest.class, ListItaSubJobsResponse.class)
                .withName("ListItaSubJobs")
                .withUri("/v2/{project_id}/workspace-sub-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getStatus, ListItaSubJobsRequest::setStatus));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobId, ListItaSubJobsRequest::setJobId));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getJobType, ListItaSubJobsRequest::setJobType));
        builder.<String>withRequestField("desktop_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getDesktopPoolId, ListItaSubJobsRequest::setDesktopPoolId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getLimit, ListItaSubJobsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListItaSubJobsRequest::getOffset, ListItaSubJobsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRequest, ShowJobResponse> showJob = genForShowJob();

    private static HttpRequestDef<ShowJobRequest, ShowJobResponse> genForShowJob() {
        // basic
        HttpRequestDef.Builder<ShowJobRequest, ShowJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobRequest.class, ShowJobResponse.class)
                .withName("ShowJob")
                .withUri("/v2/{project_id}/workspace-jobs/{job_id}")
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

    public static final HttpRequestDef<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse> listNatMappingConfigs =
        genForListNatMappingConfigs();

    private static HttpRequestDef<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse> genForListNatMappingConfigs() {
        // basic
        HttpRequestDef.Builder<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNatMappingConfigsRequest.class, ListNatMappingConfigsResponse.class)
            .withName("ListNatMappingConfigs")
            .withUri("/v2/{project_id}/nat-mapping-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatMappingConfigsRequest::getSiteId, ListNatMappingConfigsRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse> updateNatMappingConfigs =
        genForUpdateNatMappingConfigs();

    private static HttpRequestDef<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse> genForUpdateNatMappingConfigs() {
        // basic
        HttpRequestDef.Builder<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNatMappingConfigsRequest.class, UpdateNatMappingConfigsResponse.class)
            .withName("UpdateNatMappingConfigs")
            .withUri("/v2/{project_id}/nat-mapping-configs")
            .withContentType("application/json");

        // requests
        builder.<UpdateNatMappingConfigsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatMappingConfigsReq.class),
            f -> f.withMarshaller(UpdateNatMappingConfigsRequest::getBody, UpdateNatMappingConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternet =
        genForApplyDesktopsInternet();

    private static HttpRequestDef<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> genForApplyDesktopsInternet() {
        // basic
        HttpRequestDef.Builder<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyDesktopsInternetRequest.class, ApplyDesktopsInternetResponse.class)
            .withName("ApplyDesktopsInternet")
            .withUri("/v2/{project_id}/eips")
            .withContentType("application/json");

        // requests
        builder.<ApplyDesktopsInternetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyDesktopsInternetReq.class),
            f -> f.withMarshaller(ApplyDesktopsInternetRequest::getBody, ApplyDesktopsInternetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyInternetRequest, ApplyInternetResponse> applyInternet =
        genForApplyInternet();

    private static HttpRequestDef<ApplyInternetRequest, ApplyInternetResponse> genForApplyInternet() {
        // basic
        HttpRequestDef.Builder<ApplyInternetRequest, ApplyInternetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyInternetRequest.class, ApplyInternetResponse.class)
                .withName("ApplyInternet")
                .withUri("/v2/{project_id}/internet")
                .withContentType("application/json");

        // requests
        builder.<ApplyInternetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyInternetReq.class),
            f -> f.withMarshaller(ApplyInternetRequest::getBody, ApplyInternetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse> applySubnetBandwidth =
        genForApplySubnetBandwidth();

    private static HttpRequestDef<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse> genForApplySubnetBandwidth() {
        // basic
        HttpRequestDef.Builder<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplySubnetBandwidthRequest.class, ApplySubnetBandwidthResponse.class)
            .withName("ApplySubnetBandwidth")
            .withUri("/v2/{project_id}/bandwidths")
            .withContentType("application/json");

        // requests
        builder.<ApplySubnetBandwidthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplySubnetBandwidthReq.class),
            f -> f.withMarshaller(ApplySubnetBandwidthRequest::getBody, ApplySubnetBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEip =
        genForAssociateDesktopsEip();

    private static HttpRequestDef<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> genForAssociateDesktopsEip() {
        // basic
        HttpRequestDef.Builder<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateDesktopsEipRequest.class, AssociateDesktopsEipResponse.class)
            .withName("AssociateDesktopsEip")
            .withUri("/v2/{project_id}/eips/binding")
            .withContentType("application/json");

        // requests
        builder.<AssociateDesktopsEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateDesktopsEipReq.class),
            f -> f.withMarshaller(AssociateDesktopsEipRequest::getBody, AssociateDesktopsEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEip =
        genForBatchDisassociateDesktopsEip();

    private static HttpRequestDef<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> genForBatchDisassociateDesktopsEip() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDisassociateDesktopsEipRequest.class,
                    BatchDisassociateDesktopsEipResponse.class)
                .withName("BatchDisassociateDesktopsEip")
                .withUri("/v2/{project_id}/eips/unbinding")
                .withContentType("application/json");

        // requests
        builder.<BatchDisassociateDesktopsEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDisassociateDesktopsEipReq.class),
            f -> f.withMarshaller(BatchDisassociateDesktopsEipRequest::getBody,
                BatchDisassociateDesktopsEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse> deleteSubnetBandwidth =
        genForDeleteSubnetBandwidth();

    private static HttpRequestDef<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse> genForDeleteSubnetBandwidth() {
        // basic
        HttpRequestDef.Builder<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSubnetBandwidthRequest.class, DeleteSubnetBandwidthResponse.class)
            .withName("DeleteSubnetBandwidth")
            .withUri("/v2/{project_id}/bandwidths/{bandwidth_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubnetBandwidthRequest::getBandwidthId,
                DeleteSubnetBandwidthRequest::setBandwidthId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEips =
        genForListDesktopsEips();

    private static HttpRequestDef<ListDesktopsEipsRequest, ListDesktopsEipsResponse> genForListDesktopsEips() {
        // basic
        HttpRequestDef.Builder<ListDesktopsEipsRequest, ListDesktopsEipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopsEipsRequest.class, ListDesktopsEipsResponse.class)
                .withName("ListDesktopsEips")
                .withUri("/v2/{project_id}/eips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getEnterpriseProjectId,
                ListDesktopsEipsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopId, ListDesktopsEipsRequest::setDesktopId));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getDesktopName, ListDesktopsEipsRequest::setDesktopName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getUserName, ListDesktopsEipsRequest::setUserName));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getAddress, ListDesktopsEipsRequest::setAddress));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getOffset, ListDesktopsEipsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getLimit, ListDesktopsEipsRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopsEipsRequest::getState, ListDesktopsEipsRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInternetRequest, ListInternetResponse> listInternet = genForListInternet();

    private static HttpRequestDef<ListInternetRequest, ListInternetResponse> genForListInternet() {
        // basic
        HttpRequestDef.Builder<ListInternetRequest, ListInternetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInternetRequest.class, ListInternetResponse.class)
                .withName("ListInternet")
                .withUri("/v2/{project_id}/internet")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetRequest::getEnterpriseProjectId,
                ListInternetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("nat_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetRequest::getNatName, ListInternetRequest::setNatName));
        builder.<String>withRequestField("eip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInternetRequest::getEip, ListInternetRequest::setEip));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGateways =
        genForListNatGateways();

    private static HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> genForListNatGateways() {
        // basic
        HttpRequestDef.Builder<ListNatGatewaysRequest, ListNatGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNatGatewaysRequest.class, ListNatGatewaysResponse.class)
                .withName("ListNatGateways")
                .withUri("/v2/{project_id}/nat-gateways")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getId, ListNatGatewaysRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getEnterpriseProjectId,
                ListNatGatewaysRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getDescription, ListNatGatewaysRequest::setDescription));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getCreatedAt, ListNatGatewaysRequest::setCreatedAt));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getName, ListNatGatewaysRequest::setName));
        builder.<List<ListNatGatewaysRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getStatus, ListNatGatewaysRequest::setStatus));
        builder.<List<String>>withRequestField("spec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getSpec, ListNatGatewaysRequest::setSpec));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getRouterId, ListNatGatewaysRequest::setRouterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getLimit, ListNatGatewaysRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForListPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForListPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v2/{project_id}/ports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getMarker, ListPortsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, ListPortsRequest::setLimit));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getIpAddress, ListPortsRequest::setIpAddress));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getSubnetId, ListPortsRequest::setSubnetId));
        builder.<Boolean>withRequestField("is_used",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPortsRequest::getIsUsed, ListPortsRequest::setIsUsed));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroups =
        genForListSecurityGroups();

    private static HttpRequestDef<ListSecurityGroupsRequest, ListSecurityGroupsResponse> genForListSecurityGroups() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupsRequest, ListSecurityGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityGroupsRequest.class, ListSecurityGroupsResponse.class)
                .withName("ListSecurityGroups")
                .withUri("/v2/{project_id}/security-groups")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse> listSubnetBandwidths =
        genForListSubnetBandwidths();

    private static HttpRequestDef<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse> genForListSubnetBandwidths() {
        // basic
        HttpRequestDef.Builder<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSubnetBandwidthsRequest.class, ListSubnetBandwidthsResponse.class)
            .withName("ListSubnetBandwidths")
            .withUri("/v2/{project_id}/bandwidths")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getEnterpriseProjectId,
                ListSubnetBandwidthsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getOffset, ListSubnetBandwidthsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getLimit, ListSubnetBandwidthsRequest::setLimit));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getVpcId, ListSubnetBandwidthsRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getSubnetId, ListSubnetBandwidthsRequest::setSubnetId));
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getBandwidthId,
                ListSubnetBandwidthsRequest::setBandwidthId));
        builder.<String>withRequestField("bandwidth_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetBandwidthsRequest::getBandwidthName,
                ListSubnetBandwidthsRequest::setBandwidthName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> listSubnets = genForListSubnets();

    private static HttpRequestDef<ListSubnetsRequest, ListSubnetsResponse> genForListSubnets() {
        // basic
        HttpRequestDef.Builder<ListSubnetsRequest, ListSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubnetsRequest.class, ListSubnetsResponse.class)
                .withName("ListSubnets")
                .withUri("/v2/{project_id}/subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getVpcId, ListSubnetsRequest::setVpcId));
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubnetsRequest::getAvailabilityZoneId,
                ListSubnetsRequest::setAvailabilityZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcInfoRequest, ListVpcInfoResponse> listVpcInfo = genForListVpcInfo();

    private static HttpRequestDef<ListVpcInfoRequest, ListVpcInfoResponse> genForListVpcInfo() {
        // basic
        HttpRequestDef.Builder<ListVpcInfoRequest, ListVpcInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcInfoRequest.class, ListVpcInfoResponse.class)
                .withName("ListVpcInfo")
                .withUri("/v2/{project_id}/vpcs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse> showSubnetBandwidthControlList =
        genForShowSubnetBandwidthControlList();

    private static HttpRequestDef<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse> genForShowSubnetBandwidthControlList() {
        // basic
        HttpRequestDef.Builder<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSubnetBandwidthControlListRequest.class,
                    ShowSubnetBandwidthControlListResponse.class)
                .withName("ShowSubnetBandwidthControlList")
                .withUri("/v2/{project_id}/bandwidths/{bandwidth_id}/control-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getBandwidthId,
                ShowSubnetBandwidthControlListRequest::setBandwidthId));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getDesktopId,
                ShowSubnetBandwidthControlListRequest::setDesktopId));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getDesktopName,
                ShowSubnetBandwidthControlListRequest::setDesktopName));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getUserName,
                ShowSubnetBandwidthControlListRequest::setUserName));
        builder.<ShowSubnetBandwidthControlListRequest.ControlModeEnum>withRequestField("control_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSubnetBandwidthControlListRequest.ControlModeEnum.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getControlMode,
                ShowSubnetBandwidthControlListRequest::setControlMode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getOffset,
                ShowSubnetBandwidthControlListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSubnetBandwidthControlListRequest::getLimit,
                ShowSubnetBandwidthControlListRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse> showUsingSubnets =
        genForShowUsingSubnets();

    private static HttpRequestDef<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse> genForShowUsingSubnets() {
        // basic
        HttpRequestDef.Builder<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUsingSubnetsRequest.class, ShowUsingSubnetsResponse.class)
                .withName("ShowUsingSubnets")
                .withUri("/v2/{project_id}/subnets/using-subnets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUsingSubnetsRequest::getSubnetIds, ShowUsingSubnetsRequest::setSubnetIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse> updateSubnetBandwidth =
        genForUpdateSubnetBandwidth();

    private static HttpRequestDef<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse> genForUpdateSubnetBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSubnetBandwidthRequest.class, UpdateSubnetBandwidthResponse.class)
            .withName("UpdateSubnetBandwidth")
            .withUri("/v2/{project_id}/bandwidths/{bandwidth_id}/update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetBandwidthRequest::getBandwidthId,
                UpdateSubnetBandwidthRequest::setBandwidthId));
        builder.<UpdateSubnetBandwidthReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetBandwidthReq.class),
            f -> f.withMarshaller(UpdateSubnetBandwidthRequest::getBody, UpdateSubnetBandwidthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse> updateSubnetBandwidthControlList =
        genForUpdateSubnetBandwidthControlList();

    private static HttpRequestDef<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse> genForUpdateSubnetBandwidthControlList() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSubnetBandwidthControlListRequest.class,
                    UpdateSubnetBandwidthControlListResponse.class)
                .withName("UpdateSubnetBandwidthControlList")
                .withUri("/v2/{project_id}/bandwidths/{bandwidth_id}/control-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetBandwidthControlListRequest::getBandwidthId,
                UpdateSubnetBandwidthControlListRequest::setBandwidthId));
        builder.<UpdateSubnetBandwidthControlListReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetBandwidthControlListReq.class),
            f -> f.withMarshaller(UpdateSubnetBandwidthControlListRequest::getBody,
                UpdateSubnetBandwidthControlListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateChangeOrderRequest, CreateChangeOrderResponse> createChangeOrder =
        genForCreateChangeOrder();

    private static HttpRequestDef<CreateChangeOrderRequest, CreateChangeOrderResponse> genForCreateChangeOrder() {
        // basic
        HttpRequestDef.Builder<CreateChangeOrderRequest, CreateChangeOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateChangeOrderRequest.class, CreateChangeOrderResponse.class)
                .withName("CreateChangeOrder")
                .withUri("/v2/{project_id}/periodic/{desktop_id}/change/order")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateChangeOrderRequest::getDesktopId, CreateChangeOrderRequest::setDesktopId));
        builder.<CreateChangeOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateChangeOrderReq.class),
            f -> f.withMarshaller(CreateChangeOrderRequest::getBody, CreateChangeOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse> createDesktopBatchOrder =
        genForCreateDesktopBatchOrder();

    private static HttpRequestDef<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse> genForCreateDesktopBatchOrder() {
        // basic
        HttpRequestDef.Builder<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDesktopBatchOrderRequest.class, CreateDesktopBatchOrderResponse.class)
            .withName("CreateDesktopBatchOrder")
            .withUri("/v2/{project_id}/periodic/change/batch-order")
            .withContentType("application/json");

        // requests
        builder.<CreateBatchChangeOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchChangeOrderRequestBody.class),
            f -> f.withMarshaller(CreateDesktopBatchOrderRequest::getBody, CreateDesktopBatchOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopOrderRequest, CreateDesktopOrderResponse> createDesktopOrder =
        genForCreateDesktopOrder();

    private static HttpRequestDef<CreateDesktopOrderRequest, CreateDesktopOrderResponse> genForCreateDesktopOrder() {
        // basic
        HttpRequestDef.Builder<CreateDesktopOrderRequest, CreateDesktopOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopOrderRequest.class, CreateDesktopOrderResponse.class)
                .withName("CreateDesktopOrder")
                .withUri("/v2/{project_id}/desktops/orders/subscribe")
                .withContentType("application/json");

        // requests
        builder.<CreateDesktopOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDesktopOrderRequestBody.class),
            f -> f.withMarshaller(CreateDesktopOrderRequest::getBody, CreateDesktopOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse> createDesktopPoolChangeOrder =
        genForCreateDesktopPoolChangeOrder();

    private static HttpRequestDef<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse> genForCreateDesktopPoolChangeOrder() {
        // basic
        HttpRequestDef.Builder<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDesktopPoolChangeOrderRequest.class,
                    CreateDesktopPoolChangeOrderResponse.class)
                .withName("CreateDesktopPoolChangeOrder")
                .withUri("/v2/{project_id}/desktop-pool/periodic/change/order")
                .withContentType("application/json");

        // requests
        builder.<CreateBatchChangeOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchChangeOrderRequestBody.class),
            f -> f.withMarshaller(CreateDesktopPoolChangeOrderRequest::getBody,
                CreateDesktopPoolChangeOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderRequest, CreateOrderResponse> createOrder = genForCreateOrder();

    private static HttpRequestDef<CreateOrderRequest, CreateOrderResponse> genForCreateOrder() {
        // basic
        HttpRequestDef.Builder<CreateOrderRequest, CreateOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrderRequest.class, CreateOrderResponse.class)
                .withName("CreateOrder")
                .withUri("/v2/{project_id}/periodic/subscribe/order")
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

    public static final HttpRequestDef<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse> createResourcePackagesOrder =
        genForCreateResourcePackagesOrder();

    private static HttpRequestDef<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse> genForCreateResourcePackagesOrder() {
        // basic
        HttpRequestDef.Builder<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateResourcePackagesOrderRequest.class,
                    CreateResourcePackagesOrderResponse.class)
                .withName("CreateResourcePackagesOrder")
                .withUri("/v2/{project_id}/resource-packages/order")
                .withContentType("application/json");

        // requests
        builder.<CreateResourcePackageOrderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourcePackageOrderReq.class),
            f -> f.withMarshaller(CreateResourcePackagesOrderRequest::getBody,
                CreateResourcePackagesOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse> createSubnetBandwidthChangeOrder =
        genForCreateSubnetBandwidthChangeOrder();

    private static HttpRequestDef<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse> genForCreateSubnetBandwidthChangeOrder() {
        // basic
        HttpRequestDef.Builder<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSubnetBandwidthChangeOrderRequest.class,
                    CreateSubnetBandwidthChangeOrderResponse.class)
                .withName("CreateSubnetBandwidthChangeOrder")
                .withUri("/v2/{project_id}/bandwidths/{bandwidth_id}/periodic/change/order")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bandwidth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubnetBandwidthChangeOrderRequest::getBandwidthId,
                CreateSubnetBandwidthChangeOrderRequest::setBandwidthId));
        builder.<CreateSubnetBandwidthChangeOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubnetBandwidthChangeOrderRequestBody.class),
            f -> f.withMarshaller(CreateSubnetBandwidthChangeOrderRequest::getBody,
                CreateSubnetBandwidthChangeOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddOuRequest, AddOuResponse> addOu = genForAddOu();

    private static HttpRequestDef<AddOuRequest, AddOuResponse> genForAddOu() {
        // basic
        HttpRequestDef.Builder<AddOuRequest, AddOuResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddOuRequest.class, AddOuResponse.class)
                .withName("AddOu")
                .withUri("/v2/{project_id}/ous")
                .withContentType("application/json");

        // requests
        builder.<AddOuNameInfoV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddOuNameInfoV2Req.class),
            f -> f.withMarshaller(AddOuRequest::getBody, AddOuRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOuRequest, DeleteOuResponse> deleteOu = genForDeleteOu();

    private static HttpRequestDef<DeleteOuRequest, DeleteOuResponse> genForDeleteOu() {
        // basic
        HttpRequestDef.Builder<DeleteOuRequest, DeleteOuResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOuRequest.class, DeleteOuResponse.class)
                .withName("DeleteOu")
                .withUri("/v2/{project_id}/ous/{ou_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ou_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOuRequest::getOuId, DeleteOuRequest::setOuId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAdOuUsersRequest, ListAdOuUsersResponse> listAdOuUsers =
        genForListAdOuUsers();

    private static HttpRequestDef<ListAdOuUsersRequest, ListAdOuUsersResponse> genForListAdOuUsers() {
        // basic
        HttpRequestDef.Builder<ListAdOuUsersRequest, ListAdOuUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAdOuUsersRequest.class, ListAdOuUsersResponse.class)
                .withName("ListAdOuUsers")
                .withUri("/v2/{project_id}/ou-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ou_dn",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAdOuUsersRequest::getOuDn, ListAdOuUsersRequest::setOuDn));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAdOuUsersRequest::getUserName, ListAdOuUsersRequest::setUserName));
        builder.<Boolean>withRequestField("has_existed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAdOuUsersRequest::getHasExisted, ListAdOuUsersRequest::setHasExisted));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAdOuUsersRequest::getLimit, ListAdOuUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAdOuUsersRequest::getOffset, ListAdOuUsersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAdOusRequest, ListAdOusResponse> listAdOus = genForListAdOus();

    private static HttpRequestDef<ListAdOusRequest, ListAdOusResponse> genForListAdOus() {
        // basic
        HttpRequestDef.Builder<ListAdOusRequest, ListAdOusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAdOusRequest.class, ListAdOusResponse.class)
                .withName("ListAdOus")
                .withUri("/v2/{project_id}/ad-ous")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAdOusRequest::getDomain, ListAdOusRequest::setDomain));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAdOusRequest::getLimit, ListAdOusRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAdOusRequest::getOffset, ListAdOusRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOuDetailsRequest, ListOuDetailsResponse> listOuDetails =
        genForListOuDetails();

    private static HttpRequestDef<ListOuDetailsRequest, ListOuDetailsResponse> genForListOuDetails() {
        // basic
        HttpRequestDef.Builder<ListOuDetailsRequest, ListOuDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOuDetailsRequest.class, ListOuDetailsResponse.class)
                .withName("ListOuDetails")
                .withUri("/v2/{project_id}/ous")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ou_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOuDetailsRequest::getOuName, ListOuDetailsRequest::setOuName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOuDetailsRequest::getLimit, ListOuDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOuDetailsRequest::getOffset, ListOuDetailsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOuInfoRequest, UpdateOuInfoResponse> updateOuInfo = genForUpdateOuInfo();

    private static HttpRequestDef<UpdateOuInfoRequest, UpdateOuInfoResponse> genForUpdateOuInfo() {
        // basic
        HttpRequestDef.Builder<UpdateOuInfoRequest, UpdateOuInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateOuInfoRequest.class, UpdateOuInfoResponse.class)
                .withName("UpdateOuInfo")
                .withUri("/v2/{project_id}/ous/{ou_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ou_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOuInfoRequest::getOuId, UpdateOuInfoRequest::setOuId));
        builder.<ModifyOuNameInfoV2Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOuNameInfoV2Req.class),
            f -> f.withMarshaller(UpdateOuInfoRequest::getBody, UpdateOuInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse> batchUpdateTargetOfPolicyGroup =
        genForBatchUpdateTargetOfPolicyGroup();

    private static HttpRequestDef<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse> genForBatchUpdateTargetOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateTargetOfPolicyGroupRequest.class,
                    BatchUpdateTargetOfPolicyGroupResponse.class)
                .withName("BatchUpdateTargetOfPolicyGroup")
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}/targets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateTargetOfPolicyGroupRequest::getPolicyGroupId,
                BatchUpdateTargetOfPolicyGroupRequest::setPolicyGroupId));
        builder.<ModifyPolicyTargetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPolicyTargetReq.class),
            f -> f.withMarshaller(BatchUpdateTargetOfPolicyGroupRequest::getBody,
                BatchUpdateTargetOfPolicyGroupRequest::setBody));

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
                .withUri("/v2/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
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
            .withUri("/v2/{project_id}/policy-groups/policy-template")
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
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}")
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

    public static final HttpRequestDef<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse> exportPolicyGroups =
        genForExportPolicyGroups();

    private static HttpRequestDef<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse> genForExportPolicyGroups() {
        // basic
        HttpRequestDef.Builder<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportPolicyGroupsRequest.class, ExportPolicyGroupsResponse.class)
                .withName("ExportPolicyGroups")
                .withUri("/v2/{project_id}/policy-groups/export")
                .withContentType("application/json");

        // requests
        builder.<ExportPolicyGroupsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportPolicyGroupsReq.class),
            f -> f.withMarshaller(ExportPolicyGroupsRequest::getBody, ExportPolicyGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse> importPolicyGroups =
        genForImportPolicyGroups();

    private static HttpRequestDef<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse> genForImportPolicyGroups() {
        // basic
        HttpRequestDef.Builder<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportPolicyGroupsRequest.class, ImportPolicyGroupsResponse.class)
                .withName("ImportPolicyGroups")
                .withUri("/v2/{project_id}/policy-groups/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<ImportPolicyGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportPolicyGroupsRequestBody.class),
            f -> f.withMarshaller(ImportPolicyGroupsRequest::getBody, ImportPolicyGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse> listOriginalPolicyInfo =
        genForListOriginalPolicyInfo();

    private static HttpRequestDef<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse> genForListOriginalPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOriginalPolicyInfoRequest.class, ListOriginalPolicyInfoResponse.class)
            .withName("ListOriginalPolicyInfo")
            .withUri("/v2/{project_id}/policy-groups/original-policies")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse> listPoliciesOfPolicyGroup =
        genForListPoliciesOfPolicyGroup();

    private static HttpRequestDef<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse> genForListPoliciesOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPoliciesOfPolicyGroupRequest.class,
                    ListPoliciesOfPolicyGroupResponse.class)
                .withName("ListPoliciesOfPolicyGroup")
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesOfPolicyGroupRequest::getPolicyGroupId,
                ListPoliciesOfPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesOfPolicyGroupRequest::getPolicyType,
                ListPoliciesOfPolicyGroupRequest::setPolicyType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse> listPolicyDetailInfoById =
        genForListPolicyDetailInfoById();

    private static HttpRequestDef<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse> genForListPolicyDetailInfoById() {
        // basic
        HttpRequestDef.Builder<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListPolicyDetailInfoByIdRequest.class, ListPolicyDetailInfoByIdResponse.class)
                .withName("ListPolicyDetailInfoById")
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyDetailInfoByIdRequest::getPolicyGroupId,
                ListPolicyDetailInfoByIdRequest::setPolicyGroupId));

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
                .withUri("/v2/{project_id}/policy-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getLimit, ListPolicyGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getOffset, ListPolicyGroupRequest::setOffset));
        builder.<String>withRequestField("policy_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupId, ListPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPolicyGroupName,
                ListPolicyGroupRequest::setPolicyGroupName));
        builder.<Integer>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getPriority, ListPolicyGroupRequest::setPriority));
        builder.<String>withRequestField("update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getUpdateTime, ListPolicyGroupRequest::setUpdateTime));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getDescription, ListPolicyGroupRequest::setDescription));
        builder.<Boolean>withRequestField("is_group_name_accurate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getIsGroupNameAccurate,
                ListPolicyGroupRequest::setIsGroupNameAccurate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse> listPolicyGroupInfo =
        genForListPolicyGroupInfo();

    private static HttpRequestDef<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse> genForListPolicyGroupInfo() {
        // basic
        HttpRequestDef.Builder<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyGroupInfoRequest.class, ListPolicyGroupInfoResponse.class)
                .withName("ListPolicyGroupInfo")
                .withUri("/v2/{project_id}/policy-groups/detail")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getLimit, ListPolicyGroupInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getOffset, ListPolicyGroupInfoRequest::setOffset));
        builder.<String>withRequestField("policy_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getPolicyGroupId,
                ListPolicyGroupInfoRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getPolicyGroupName,
                ListPolicyGroupInfoRequest::setPolicyGroupName));
        builder.<List<String>>withRequestField("policy_group_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getPolicyGroupNames,
                ListPolicyGroupInfoRequest::setPolicyGroupNames));
        builder.<Integer>withRequestField("priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getPriority, ListPolicyGroupInfoRequest::setPriority));
        builder.<String>withRequestField("update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getUpdateTime,
                ListPolicyGroupInfoRequest::setUpdateTime));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupInfoRequest::getDescription,
                ListPolicyGroupInfoRequest::setDescription));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse> listTargetOfPolicyGroup =
        genForListTargetOfPolicyGroup();

    private static HttpRequestDef<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse> genForListTargetOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTargetOfPolicyGroupRequest.class, ListTargetOfPolicyGroupResponse.class)
            .withName("ListTargetOfPolicyGroup")
            .withUri("/v2/{project_id}/policy-groups/{policy_group_id}/targets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetOfPolicyGroupRequest::getPolicyGroupId,
                ListTargetOfPolicyGroupRequest::setPolicyGroupId));
        builder.<String>withRequestField("target_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetOfPolicyGroupRequest::getTargetType,
                ListTargetOfPolicyGroupRequest::setTargetType));
        builder.<String>withRequestField("target_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetOfPolicyGroupRequest::getTargetName,
                ListTargetOfPolicyGroupRequest::setTargetName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTargetOfPolicyGroupRequest::getLimit, ListTargetOfPolicyGroupRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTargetOfPolicyGroupRequest::getOffset,
                ListTargetOfPolicyGroupRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse> updatePoliciesOfPolicyGroup =
        genForUpdatePoliciesOfPolicyGroup();

    private static HttpRequestDef<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse> genForUpdatePoliciesOfPolicyGroup() {
        // basic
        HttpRequestDef.Builder<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePoliciesOfPolicyGroupRequest.class,
                    UpdatePoliciesOfPolicyGroupResponse.class)
                .withName("UpdatePoliciesOfPolicyGroup")
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePoliciesOfPolicyGroupRequest::getPolicyGroupId,
                UpdatePoliciesOfPolicyGroupRequest::setPolicyGroupId));
        builder.<ModifyPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPolicyRequest.class),
            f -> f.withMarshaller(UpdatePoliciesOfPolicyGroupRequest::getBody,
                UpdatePoliciesOfPolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> updatePolicyGroup =
        genForUpdatePolicyGroup();

    private static HttpRequestDef<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> genForUpdatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyGroupRequest, UpdatePolicyGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyGroupRequest.class, UpdatePolicyGroupResponse.class)
                .withName("UpdatePolicyGroup")
                .withUri("/v2/{project_id}/policy-groups/{policy_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getPolicyGroupId,
                UpdatePolicyGroupRequest::setPolicyGroupId));
        builder.<ModifyPolicyGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPolicyGroupRequest.class),
            f -> f.withMarshaller(UpdatePolicyGroupRequest::getBody, UpdatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse> listHourPackagesType =
        genForListHourPackagesType();

    private static HttpRequestDef<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse> genForListHourPackagesType() {
        // basic
        HttpRequestDef.Builder<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHourPackagesTypeRequest.class, ListHourPackagesTypeResponse.class)
            .withName("ListHourPackagesType")
            .withUri("/v2/{project_id}/products/hour-packages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_resource_spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHourPackagesTypeRequest::getDesktopResourceSpecCode,
                ListHourPackagesTypeRequest::setDesktopResourceSpecCode));
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHourPackagesTypeRequest::getResourceSpecCode,
                ListHourPackagesTypeRequest::setResourceSpecCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getProductId, ListProductsRequest::setProductId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAvailabilityZone, ListProductsRequest::setAvailabilityZone));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getOsType, ListProductsRequest::setOsType));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getChargeMode, ListProductsRequest::setChargeMode));
        builder.<String>withRequestField("architecture",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getArchitecture, ListProductsRequest::setArchitecture));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getPackageType, ListProductsRequest::setPackageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcePackagesRequest, ListResourcePackagesResponse> listResourcePackages =
        genForListResourcePackages();

    private static HttpRequestDef<ListResourcePackagesRequest, ListResourcePackagesResponse> genForListResourcePackages() {
        // basic
        HttpRequestDef.Builder<ListResourcePackagesRequest, ListResourcePackagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListResourcePackagesRequest.class, ListResourcePackagesResponse.class)
            .withName("ListResourcePackages")
            .withUri("/v2/{project_id}/products/resource-packages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcePackagesRequest::getResourceSpecCode,
                ListResourcePackagesRequest::setResourceSpecCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharerProductsRequest, ListSharerProductsResponse> listSharerProducts =
        genForListSharerProducts();

    private static HttpRequestDef<ListSharerProductsRequest, ListSharerProductsResponse> genForListSharerProducts() {
        // basic
        HttpRequestDef.Builder<ListSharerProductsRequest, ListSharerProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSharerProductsRequest.class, ListSharerProductsResponse.class)
                .withName("ListSharerProducts")
                .withUri("/v2/{project_id}/products/sharer")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getProductId, ListSharerProductsRequest::setProductId));
        builder.<String>withRequestField("share_space_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getShareSpaceSize,
                ListSharerProductsRequest::setShareSpaceSize));
        builder.<String>withRequestField("charge_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getChargeMode, ListSharerProductsRequest::setChargeMode));
        builder.<Integer>withRequestField("is_gpu",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getIsGpu, ListSharerProductsRequest::setIsGpu));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getPackageType,
                ListSharerProductsRequest::setPackageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getLimit, ListSharerProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSharerProductsRequest::getOffset, ListSharerProductsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantProfilesRequest, ListTenantProfilesResponse> listTenantProfiles =
        genForListTenantProfiles();

    private static HttpRequestDef<ListTenantProfilesRequest, ListTenantProfilesResponse> genForListTenantProfiles() {
        // basic
        HttpRequestDef.Builder<ListTenantProfilesRequest, ListTenantProfilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantProfilesRequest.class, ListTenantProfilesResponse.class)
                .withName("ListTenantProfiles")
                .withUri("/v1/{project_id}/app-center/profiles")
                .withContentType("application/json");

        // requests

        // response
        builder.<Map<String, Boolean>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListTenantProfilesResponse::getBody, ListTenantProfilesResponse::setBody)
                .withInnerContainerType(Boolean.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantProfileRequest, UpdateTenantProfileResponse> updateTenantProfile =
        genForUpdateTenantProfile();

    private static HttpRequestDef<UpdateTenantProfileRequest, UpdateTenantProfileResponse> genForUpdateTenantProfile() {
        // basic
        HttpRequestDef.Builder<UpdateTenantProfileRequest, UpdateTenantProfileResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateTenantProfileRequest.class, UpdateTenantProfileResponse.class)
            .withName("UpdateTenantProfile")
            .withUri("/v1/{project_id}/app-center/profiles")
            .withContentType("application/json");

        // requests
        builder.<Map<String, Boolean>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdateTenantProfileRequest::getBody, UpdateTenantProfileRequest::setBody)
                .withInnerContainerType(Boolean.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse> showQuotaDetails =
        genForShowQuotaDetails();

    private static HttpRequestDef<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse> genForShowQuotaDetails() {
        // basic
        HttpRequestDef.Builder<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaDetailsRequest.class, ShowQuotaDetailsResponse.class)
                .withName("ShowQuotaDetails")
                .withUri("/v2/{project_id}/quotas/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaDetailsRequest::getSiteId, ShowQuotaDetailsRequest::setSiteId));
        builder.<String>withRequestField("az_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaDetailsRequest::getAzCode, ShowQuotaDetailsRequest::setAzCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> batchDeleteScheduledTasks =
        genForBatchDeleteScheduledTasks();

    private static HttpRequestDef<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> genForBatchDeleteScheduledTasks() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteScheduledTasksRequest.class,
                    BatchDeleteScheduledTasksResponse.class)
                .withName("BatchDeleteScheduledTasks")
                .withUri("/v2/{project_id}/scheduled-tasks/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteScheduledTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteScheduledTasksReq.class),
            f -> f.withMarshaller(BatchDeleteScheduledTasksRequest::getBody,
                BatchDeleteScheduledTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduledTasksRequest, CreateScheduledTasksResponse> createScheduledTasks =
        genForCreateScheduledTasks();

    private static HttpRequestDef<CreateScheduledTasksRequest, CreateScheduledTasksResponse> genForCreateScheduledTasks() {
        // basic
        HttpRequestDef.Builder<CreateScheduledTasksRequest, CreateScheduledTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateScheduledTasksRequest.class, CreateScheduledTasksResponse.class)
            .withName("CreateScheduledTasks")
            .withUri("/v2/{project_id}/scheduled-tasks")
            .withContentType("application/json");

        // requests
        builder.<CreateScheduledTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScheduledTasksReq.class),
            f -> f.withMarshaller(CreateScheduledTasksRequest::getBody, CreateScheduledTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> deleteScheduledTasks =
        genForDeleteScheduledTasks();

    private static HttpRequestDef<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> genForDeleteScheduledTasks() {
        // basic
        HttpRequestDef.Builder<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteScheduledTasksRequest.class, DeleteScheduledTasksResponse.class)
            .withName("DeleteScheduledTasks")
            .withUri("/v2/{project_id}/scheduled-tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduledTasksRequest::getTaskId, DeleteScheduledTasksRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse> exportScheduledTasksRecords =
        genForExportScheduledTasksRecords();

    private static HttpRequestDef<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse> genForExportScheduledTasksRecords() {
        // basic
        HttpRequestDef.Builder<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportScheduledTasksRecordsRequest.class,
                    ExportScheduledTasksRecordsResponse.class)
                .withName("ExportScheduledTasksRecords")
                .withUri("/v2/{project_id}/scheduled-tasks/{task_id}/records/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportScheduledTasksRecordsRequest::getTaskId,
                ExportScheduledTasksRecordsRequest::setTaskId));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportScheduledTasksRecordsRequest::getLanguage,
                ExportScheduledTasksRecordsRequest::setLanguage));
        builder.<String>withRequestField("time_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportScheduledTasksRecordsRequest::getTimeZone,
                ExportScheduledTasksRecordsRequest::setTimeZone));

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
            .withUri("/v2/{project_id}/scheduled-tasks/future-executions")
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

    public static final HttpRequestDef<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasks =
        genForListScheduledTasks();

    private static HttpRequestDef<ListScheduledTasksRequest, ListScheduledTasksResponse> genForListScheduledTasks() {
        // basic
        HttpRequestDef.Builder<ListScheduledTasksRequest, ListScheduledTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledTasksRequest.class, ListScheduledTasksResponse.class)
                .withName("ListScheduledTasks")
                .withUri("/v2/{project_id}/scheduled-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getOffset, ListScheduledTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getLimit, ListScheduledTasksRequest::setLimit));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getTaskName, ListScheduledTasksRequest::setTaskName));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getTaskType, ListScheduledTasksRequest::setTaskType));
        builder.<String>withRequestField("scheduled_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getScheduledType,
                ListScheduledTasksRequest::setScheduledType));
        builder.<String>withRequestField("life_cycle_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getLifeCycleType,
                ListScheduledTasksRequest::setLifeCycleType));
        builder.<String>withRequestField("last_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRequest::getLastStatus, ListScheduledTasksRequest::setLastStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> listScheduledTasksRecords =
        genForListScheduledTasksRecords();

    private static HttpRequestDef<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> genForListScheduledTasksRecords() {
        // basic
        HttpRequestDef.Builder<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScheduledTasksRecordsRequest.class,
                    ListScheduledTasksRecordsResponse.class)
                .withName("ListScheduledTasksRecords")
                .withUri("/v2/{project_id}/scheduled-tasks/{task_id}/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsRequest::getTaskId,
                ListScheduledTasksRecordsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsRequest::getOffset,
                ListScheduledTasksRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsRequest::getLimit,
                ListScheduledTasksRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> listScheduledTasksRecordsDetails =
        genForListScheduledTasksRecordsDetails();

    private static HttpRequestDef<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> genForListScheduledTasksRecordsDetails() {
        // basic
        HttpRequestDef.Builder<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListScheduledTasksRecordsDetailsRequest.class,
                    ListScheduledTasksRecordsDetailsResponse.class)
                .withName("ListScheduledTasksRecordsDetails")
                .withUri("/v2/{project_id}/scheduled-tasks/{task_id}/records/{record_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsDetailsRequest::getTaskId,
                ListScheduledTasksRecordsDetailsRequest::setTaskId));
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsDetailsRequest::getRecordId,
                ListScheduledTasksRecordsDetailsRequest::setRecordId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsDetailsRequest::getOffset,
                ListScheduledTasksRecordsDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScheduledTasksRecordsDetailsRequest::getLimit,
                ListScheduledTasksRecordsDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTimeZonesRequest, ListTimeZonesResponse> listTimeZones =
        genForListTimeZones();

    private static HttpRequestDef<ListTimeZonesRequest, ListTimeZonesResponse> genForListTimeZones() {
        // basic
        HttpRequestDef.Builder<ListTimeZonesRequest, ListTimeZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTimeZonesRequest.class, ListTimeZonesResponse.class)
                .withName("ListTimeZones")
                .withUri("/v2/{project_id}/common/timezones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("time_zone_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTimeZonesRequest::getTimeZoneName, ListTimeZonesRequest::setTimeZoneName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScheduledTasksRequest, ShowScheduledTasksResponse> showScheduledTasks =
        genForShowScheduledTasks();

    private static HttpRequestDef<ShowScheduledTasksRequest, ShowScheduledTasksResponse> genForShowScheduledTasks() {
        // basic
        HttpRequestDef.Builder<ShowScheduledTasksRequest, ShowScheduledTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScheduledTasksRequest.class, ShowScheduledTasksResponse.class)
                .withName("ShowScheduledTasks")
                .withUri("/v2/{project_id}/scheduled-tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScheduledTasksRequest::getTaskId, ShowScheduledTasksRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> updateScheduledTasks =
        genForUpdateScheduledTasks();

    private static HttpRequestDef<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> genForUpdateScheduledTasks() {
        // basic
        HttpRequestDef.Builder<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateScheduledTasksRequest.class, UpdateScheduledTasksResponse.class)
            .withName("UpdateScheduledTasks")
            .withUri("/v2/{project_id}/scheduled-tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduledTasksRequest::getTaskId, UpdateScheduledTasksRequest::setTaskId));
        builder.<UpdateScheduledTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduledTasksReq.class),
            f -> f.withMarshaller(UpdateScheduledTasksRequest::getBody, UpdateScheduledTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse> batchDeleteScreenRecords =
        genForBatchDeleteScreenRecords();

    private static HttpRequestDef<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse> genForBatchDeleteScreenRecords() {
        // basic
        HttpRequestDef.Builder<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDeleteScreenRecordsRequest.class, BatchDeleteScreenRecordsResponse.class)
                .withName("BatchDeleteScreenRecords")
                .withUri("/v2/{project_id}/screen-records/batch-delete")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<BatchDeleteScreenRecordsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteScreenRecordsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteScreenRecordsRequest::getBody, BatchDeleteScreenRecordsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopOperationsRequest, ListDesktopOperationsResponse> listDesktopOperations =
        genForListDesktopOperations();

    private static HttpRequestDef<ListDesktopOperationsRequest, ListDesktopOperationsResponse> genForListDesktopOperations() {
        // basic
        HttpRequestDef.Builder<ListDesktopOperationsRequest, ListDesktopOperationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopOperationsRequest.class, ListDesktopOperationsResponse.class)
            .withName("ListDesktopOperations")
            .withUri("/v2/{project_id}/screen-records/{record_id}/os-operations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getRecordId,
                ListDesktopOperationsRequest::setRecordId));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getEventType,
                ListDesktopOperationsRequest::setEventType));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getEventId, ListDesktopOperationsRequest::setEventId));
        builder.<String>withRequestField("event_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getEventLevel,
                ListDesktopOperationsRequest::setEventLevel));
        builder.<String>withRequestField("event_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getEventData,
                ListDesktopOperationsRequest::setEventData));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getLimit, ListDesktopOperationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopOperationsRequest::getOffset, ListDesktopOperationsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDownloadAddressRequest, ListDownloadAddressResponse> listDownloadAddress =
        genForListDownloadAddress();

    private static HttpRequestDef<ListDownloadAddressRequest, ListDownloadAddressResponse> genForListDownloadAddress() {
        // basic
        HttpRequestDef.Builder<ListDownloadAddressRequest, ListDownloadAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListDownloadAddressRequest.class, ListDownloadAddressResponse.class)
                .withName("ListDownloadAddress")
                .withUri("/v2/{project_id}/screen-records/download-address")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<ListDownloadAddressRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDownloadAddressRequestBody.class),
            f -> f.withMarshaller(ListDownloadAddressRequest::getBody, ListDownloadAddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScreenRecordsRequest, ListScreenRecordsResponse> listScreenRecords =
        genForListScreenRecords();

    private static HttpRequestDef<ListScreenRecordsRequest, ListScreenRecordsResponse> genForListScreenRecords() {
        // basic
        HttpRequestDef.Builder<ListScreenRecordsRequest, ListScreenRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScreenRecordsRequest.class, ListScreenRecordsResponse.class)
                .withName("ListScreenRecords")
                .withUri("/v2/{project_id}/screen-records")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getLimit, ListScreenRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getOffset, ListScreenRecordsRequest::setOffset));
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getDesktopId, ListScreenRecordsRequest::setDesktopId));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getUsername, ListScreenRecordsRequest::setUsername));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getStatus, ListScreenRecordsRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getType, ListScreenRecordsRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getStartTime, ListScreenRecordsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getEndTime, ListScreenRecordsRequest::setEndTime));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getSortField, ListScreenRecordsRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScreenRecordsRequest::getSortType, ListScreenRecordsRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScreenRecordRequest, ShowScreenRecordResponse> showScreenRecord =
        genForShowScreenRecord();

    private static HttpRequestDef<ShowScreenRecordRequest, ShowScreenRecordResponse> genForShowScreenRecord() {
        // basic
        HttpRequestDef.Builder<ShowScreenRecordRequest, ShowScreenRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScreenRecordRequest.class, ShowScreenRecordResponse.class)
                .withName("ShowScreenRecord")
                .withUri("/v2/{project_id}/screen-records/{record_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScreenRecordRequest::getRecordId, ShowScreenRecordRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForCreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForCreateScript() {
        // basic
        HttpRequestDef.Builder<CreateScriptRequest, CreateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScriptRequest.class, CreateScriptResponse.class)
                .withName("CreateScript")
                .withUri("/v2/{project_id}/scripts")
                .withContentType("application/json");

        // requests
        builder.<CreateScriptReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScriptReq.class),
            f -> f.withMarshaller(CreateScriptRequest::getBody, CreateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genForDeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genForDeleteScript() {
        // basic
        HttpRequestDef.Builder<DeleteScriptRequest, DeleteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScriptRequest.class, DeleteScriptResponse.class)
                .withName("DeleteScript")
                .withUri("/v2/{project_id}/scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getScriptId, DeleteScriptRequest::setScriptId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse> executeScriptByDesktopTag =
        genForExecuteScriptByDesktopTag();

    private static HttpRequestDef<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse> genForExecuteScriptByDesktopTag() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteScriptByDesktopTagRequest.class,
                    ExecuteScriptByDesktopTagResponse.class)
                .withName("ExecuteScriptByDesktopTag")
                .withUri("/v2/{project_id}/script-executions/by-desktop-tag")
                .withContentType("application/json");

        // requests
        builder.<ExecuteScriptByDesktopTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteScriptByDesktopTagReq.class),
            f -> f.withMarshaller(ExecuteScriptByDesktopTagRequest::getBody,
                ExecuteScriptByDesktopTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse> executeScriptOrCommand =
        genForExecuteScriptOrCommand();

    private static HttpRequestDef<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse> genForExecuteScriptOrCommand() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteScriptOrCommandRequest.class, ExecuteScriptOrCommandResponse.class)
            .withName("ExecuteScriptOrCommand")
            .withUri("/v2/{project_id}/script-executions")
            .withContentType("application/json");

        // requests
        builder.<ExecuteScriptOrCommandReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteScriptOrCommandReq.class),
            f -> f.withMarshaller(ExecuteScriptOrCommandRequest::getBody, ExecuteScriptOrCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptRecordsRequest, ListScriptRecordsResponse> listScriptRecords =
        genForListScriptRecords();

    private static HttpRequestDef<ListScriptRecordsRequest, ListScriptRecordsResponse> genForListScriptRecords() {
        // basic
        HttpRequestDef.Builder<ListScriptRecordsRequest, ListScriptRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptRecordsRequest.class, ListScriptRecordsResponse.class)
                .withName("ListScriptRecords")
                .withUri("/v2/{project_id}/script-execution-records")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getOffset, ListScriptRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getLimit, ListScriptRecordsRequest::setLimit));
        builder.<List<String>>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getResourceId, ListScriptRecordsRequest::setResourceId));
        builder.<List<String>>withRequestField("resource_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getResourceGroupId,
                ListScriptRecordsRequest::setResourceGroupId));
        builder.<List<String>>withRequestField("script_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getScriptId, ListScriptRecordsRequest::setScriptId));
        builder.<List<String>>withRequestField("script_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getScriptName, ListScriptRecordsRequest::setScriptName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getStatus, ListScriptRecordsRequest::setStatus));
        builder.<Boolean>withRequestField("is_first_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getIsFirstOrder,
                ListScriptRecordsRequest::setIsFirstOrder));
        builder.<String>withRequestField("script_task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getScriptTaskId,
                ListScriptRecordsRequest::setScriptTaskId));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getTaskType, ListScriptRecordsRequest::setTaskType));
        builder.<Boolean>withRequestField("show_history",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getShowHistory, ListScriptRecordsRequest::setShowHistory));
        builder.<String>withRequestField("execute_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getExecuteTimeStart,
                ListScriptRecordsRequest::setExecuteTimeStart));
        builder.<String>withRequestField("execute_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptRecordsRequest::getExecuteTimeEnd,
                ListScriptRecordsRequest::setExecuteTimeEnd));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptTasksRequest, ListScriptTasksResponse> listScriptTasks =
        genForListScriptTasks();

    private static HttpRequestDef<ListScriptTasksRequest, ListScriptTasksResponse> genForListScriptTasks() {
        // basic
        HttpRequestDef.Builder<ListScriptTasksRequest, ListScriptTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptTasksRequest.class, ListScriptTasksResponse.class)
                .withName("ListScriptTasks")
                .withUri("/v2/{project_id}/script-execution-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getOffset, ListScriptTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getLimit, ListScriptTasksRequest::setLimit));
        builder.<List<String>>withRequestField("resource_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getResourceGroupId,
                ListScriptTasksRequest::setResourceGroupId));
        builder.<String>withRequestField("script_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getScriptId, ListScriptTasksRequest::setScriptId));
        builder.<String>withRequestField("script_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getScriptName, ListScriptTasksRequest::setScriptName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getStatus, ListScriptTasksRequest::setStatus));
        builder.<String>withRequestField("resource_group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getResourceGroupType,
                ListScriptTasksRequest::setResourceGroupType));
        builder.<List<String>>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getTaskId, ListScriptTasksRequest::setTaskId));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getTaskType, ListScriptTasksRequest::setTaskType));
        builder.<String>withRequestField("execute_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getExecuteTimeStart,
                ListScriptTasksRequest::setExecuteTimeStart));
        builder.<String>withRequestField("execute_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptTasksRequest::getExecuteTimeEnd,
                ListScriptTasksRequest::setExecuteTimeEnd));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForListScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForListScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withName("ListScripts")
                .withUri("/v2/{project_id}/scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getOffset, ListScriptsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getLimit, ListScriptsRequest::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getId, ListScriptsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getName, ListScriptsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getType, ListScriptsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryScriptExecutionRequest, RetryScriptExecutionResponse> retryScriptExecution =
        genForRetryScriptExecution();

    private static HttpRequestDef<RetryScriptExecutionRequest, RetryScriptExecutionResponse> genForRetryScriptExecution() {
        // basic
        HttpRequestDef.Builder<RetryScriptExecutionRequest, RetryScriptExecutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RetryScriptExecutionRequest.class, RetryScriptExecutionResponse.class)
            .withName("RetryScriptExecution")
            .withUri("/v2/{project_id}/script-executions/retry")
            .withContentType("application/json");

        // requests
        builder.<RetryScriptExecutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetryScriptExecutionReq.class),
            f -> f.withMarshaller(RetryScriptExecutionRequest::getBody, RetryScriptExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScriptDetailRequest, ShowScriptDetailResponse> showScriptDetail =
        genForShowScriptDetail();

    private static HttpRequestDef<ShowScriptDetailRequest, ShowScriptDetailResponse> genForShowScriptDetail() {
        // basic
        HttpRequestDef.Builder<ShowScriptDetailRequest, ShowScriptDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowScriptDetailRequest.class, ShowScriptDetailResponse.class)
                .withName("ShowScriptDetail")
                .withUri("/v2/{project_id}/scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptDetailRequest::getScriptId, ShowScriptDetailRequest::setScriptId));
        builder.<String>withRequestField("script_task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptDetailRequest::getScriptTaskId, ShowScriptDetailRequest::setScriptTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse> showScriptRecordDetail =
        genForShowScriptRecordDetail();

    private static HttpRequestDef<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse> genForShowScriptRecordDetail() {
        // basic
        HttpRequestDef.Builder<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowScriptRecordDetailRequest.class, ShowScriptRecordDetailResponse.class)
            .withName("ShowScriptRecordDetail")
            .withUri("/v2/{project_id}/script-execution-records/{record_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowScriptRecordDetailRequest::getRecordId,
                ShowScriptRecordDetailRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopScriptExecutionRequest, StopScriptExecutionResponse> stopScriptExecution =
        genForStopScriptExecution();

    private static HttpRequestDef<StopScriptExecutionRequest, StopScriptExecutionResponse> genForStopScriptExecution() {
        // basic
        HttpRequestDef.Builder<StopScriptExecutionRequest, StopScriptExecutionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopScriptExecutionRequest.class, StopScriptExecutionResponse.class)
                .withName("StopScriptExecution")
                .withUri("/v2/{project_id}/script-executions/stop")
                .withContentType("application/json");

        // requests
        builder.<StopScriptExecutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopScriptExecutionReq.class),
            f -> f.withMarshaller(StopScriptExecutionRequest::getBody, StopScriptExecutionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> updateScript = genForUpdateScript();

    private static HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> genForUpdateScript() {
        // basic
        HttpRequestDef.Builder<UpdateScriptRequest, UpdateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScriptRequest.class, UpdateScriptResponse.class)
                .withName("UpdateScript")
                .withUri("/v2/{project_id}/scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getScriptId, UpdateScriptRequest::setScriptId));
        builder.<UpdateScriptReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScriptReq.class),
            f -> f.withMarshaller(UpdateScriptRequest::getBody, UpdateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse> addDesktopSubResources =
        genForAddDesktopSubResources();

    private static HttpRequestDef<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse> genForAddDesktopSubResources() {
        // basic
        HttpRequestDef.Builder<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddDesktopSubResourcesRequest.class, AddDesktopSubResourcesResponse.class)
            .withName("AddDesktopSubResources")
            .withUri("/v2/{project_id}/desktop/sub-resources")
            .withContentType("application/json");

        // requests
        builder.<AddDesktopSubResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDesktopSubResourcesReq.class),
            f -> f.withMarshaller(AddDesktopSubResourcesRequest::getBody, AddDesktopSubResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse> deleteDesktopSubResources =
        genForDeleteDesktopSubResources();

    private static HttpRequestDef<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse> genForDeleteDesktopSubResources() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteDesktopSubResourcesRequest.class,
                    DeleteDesktopSubResourcesResponse.class)
                .withName("DeleteDesktopSubResources")
                .withUri("/v2/{project_id}/desktop/delete-sub-resources")
                .withContentType("application/json");

        // requests
        builder.<DeleteDesktopSubResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDesktopSubResourcesReq.class),
            f -> f.withMarshaller(DeleteDesktopSubResourcesRequest::getBody,
                DeleteDesktopSubResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse> showShareSpaceConfig =
        genForShowShareSpaceConfig();

    private static HttpRequestDef<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse> genForShowShareSpaceConfig() {
        // basic
        HttpRequestDef.Builder<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowShareSpaceConfigRequest.class, ShowShareSpaceConfigResponse.class)
            .withName("ShowShareSpaceConfig")
            .withUri("/v2/{project_id}/share-space/configuration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowShareSpaceConfigRequest::getName, ShowShareSpaceConfigRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse> updateShareSpaceConfig =
        genForUpdateShareSpaceConfig();

    private static HttpRequestDef<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse> genForUpdateShareSpaceConfig() {
        // basic
        HttpRequestDef.Builder<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateShareSpaceConfigRequest.class, UpdateShareSpaceConfigResponse.class)
            .withName("UpdateShareSpaceConfig")
            .withUri("/v2/{project_id}/share-space/configuration")
            .withContentType("application/json");

        // requests
        builder.<UpdateShareSpaceConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateShareSpaceConfigReq.class),
            f -> f.withMarshaller(UpdateShareSpaceConfigRequest::getBody, UpdateShareSpaceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSiteRequest, AddSiteResponse> addSite = genForAddSite();

    private static HttpRequestDef<AddSiteRequest, AddSiteResponse> genForAddSite() {
        // basic
        HttpRequestDef.Builder<AddSiteRequest, AddSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSiteRequest.class, AddSiteResponse.class)
                .withName("AddSite")
                .withUri("/v2/{project_id}/sites")
                .withContentType("application/json");

        // requests
        builder.<AddSiteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSiteReq.class),
            f -> f.withMarshaller(AddSiteRequest::getBody, AddSiteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse> checkEdgeSiteResources =
        genForCheckEdgeSiteResources();

    private static HttpRequestDef<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse> genForCheckEdgeSiteResources() {
        // basic
        HttpRequestDef.Builder<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckEdgeSiteResourcesRequest.class, CheckEdgeSiteResourcesResponse.class)
            .withName("CheckEdgeSiteResources")
            .withUri("/v2/{project_id}/check-edge-site-resources")
            .withContentType("application/json");

        // requests
        builder.<CheckEdgeSiteResourcesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckEdgeSiteResourcesReq.class),
            f -> f.withMarshaller(CheckEdgeSiteResourcesRequest::getBody, CheckEdgeSiteResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSiteRequest, DeleteSiteResponse> deleteSite = genForDeleteSite();

    private static HttpRequestDef<DeleteSiteRequest, DeleteSiteResponse> genForDeleteSite() {
        // basic
        HttpRequestDef.Builder<DeleteSiteRequest, DeleteSiteResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSiteRequest.class, DeleteSiteResponse.class)
                .withName("DeleteSite")
                .withUri("/v2/{project_id}/sites/{site_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSiteRequest::getSiteId, DeleteSiteRequest::setSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSiteConfigsRequest, ListSiteConfigsResponse> listSiteConfigs =
        genForListSiteConfigs();

    private static HttpRequestDef<ListSiteConfigsRequest, ListSiteConfigsResponse> genForListSiteConfigs() {
        // basic
        HttpRequestDef.Builder<ListSiteConfigsRequest, ListSiteConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSiteConfigsRequest.class, ListSiteConfigsResponse.class)
                .withName("ListSiteConfigs")
                .withUri("/v2/{project_id}/sites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteConfigsRequest::getAvailabilityZoneId,
                ListSiteConfigsRequest::setAvailabilityZoneId));
        builder.<String>withRequestField("site_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSiteConfigsRequest::getSiteType, ListSiteConfigsRequest::setSiteType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse> listWksEdgeSites =
        genForListWksEdgeSites();

    private static HttpRequestDef<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse> genForListWksEdgeSites() {
        // basic
        HttpRequestDef.Builder<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWksEdgeSitesRequest.class, ListWksEdgeSitesResponse.class)
                .withName("ListWksEdgeSites")
                .withUri("/v2/{project_id}/wks-edge-sites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWksEdgeSitesRequest::getName, ListWksEdgeSitesRequest::setName));
        builder.<String>withRequestField("availability_zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWksEdgeSitesRequest::getAvailabilityZoneId,
                ListWksEdgeSitesRequest::setAvailabilityZoneId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWksEdgeSitesRequest::getStatus, ListWksEdgeSitesRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessModeRequest, UpdateAccessModeResponse> updateAccessMode =
        genForUpdateAccessMode();

    private static HttpRequestDef<UpdateAccessModeRequest, UpdateAccessModeResponse> genForUpdateAccessMode() {
        // basic
        HttpRequestDef.Builder<UpdateAccessModeRequest, UpdateAccessModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessModeRequest.class, UpdateAccessModeResponse.class)
                .withName("UpdateAccessMode")
                .withUri("/v2/{project_id}/sites/{site_id}/access-mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessModeRequest::getSiteId, UpdateAccessModeRequest::setSiteId));
        builder.<UpdateAccessModeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessModeReq.class),
            f -> f.withMarshaller(UpdateAccessModeRequest::getBody, UpdateAccessModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse> updateSubnetIds =
        genForUpdateSubnetIds();

    private static HttpRequestDef<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse> genForUpdateSubnetIds() {
        // basic
        HttpRequestDef.Builder<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubnetIdsRequest.class, UpdateSubnetIdsResponse.class)
                .withName("UpdateSubnetIds")
                .withUri("/v2/{project_id}/sites/{site_id}/subnet-ids")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("site_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubnetIdsRequest::getSiteId, UpdateSubnetIdsRequest::setSiteId));
        builder.<UpdateSubnetIdsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubnetIdsRequestBody.class),
            f -> f.withMarshaller(UpdateSubnetIdsRequest::getBody, UpdateSubnetIdsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse> batchCreateDesktopSnapshot =
        genForBatchCreateDesktopSnapshot();

    private static HttpRequestDef<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse> genForBatchCreateDesktopSnapshot() {
        // basic
        HttpRequestDef.Builder<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDesktopSnapshotRequest.class,
                    BatchCreateDesktopSnapshotResponse.class)
                .withName("BatchCreateDesktopSnapshot")
                .withUri("/v2/{project_id}/snapshots/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateDesktopSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateDesktopSnapshotReq.class),
            f -> f.withMarshaller(BatchCreateDesktopSnapshotRequest::getBody,
                BatchCreateDesktopSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse> batchDeleteDesktopSnapshot =
        genForBatchDeleteDesktopSnapshot();

    private static HttpRequestDef<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse> genForBatchDeleteDesktopSnapshot() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteDesktopSnapshotRequest.class,
                    BatchDeleteDesktopSnapshotResponse.class)
                .withName("BatchDeleteDesktopSnapshot")
                .withUri("/v2/{project_id}/snapshots/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteDesktopSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDesktopSnapshotReq.class),
            f -> f.withMarshaller(BatchDeleteDesktopSnapshotRequest::getBody,
                BatchDeleteDesktopSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse> batchRestoreDesktopSnapshot =
        genForBatchRestoreDesktopSnapshot();

    private static HttpRequestDef<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse> genForBatchRestoreDesktopSnapshot() {
        // basic
        HttpRequestDef.Builder<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRestoreDesktopSnapshotRequest.class,
                    BatchRestoreDesktopSnapshotResponse.class)
                .withName("BatchRestoreDesktopSnapshot")
                .withUri("/v2/{project_id}/snapshots/batch-restore")
                .withContentType("application/json");

        // requests
        builder.<BatchRestoreSnapshotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRestoreSnapshotReq.class),
            f -> f.withMarshaller(BatchRestoreDesktopSnapshotRequest::getBody,
                BatchRestoreDesktopSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse> listDesktopSnapshot =
        genForListDesktopSnapshot();

    private static HttpRequestDef<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse> genForListDesktopSnapshot() {
        // basic
        HttpRequestDef.Builder<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDesktopSnapshotRequest.class, ListDesktopSnapshotResponse.class)
                .withName("ListDesktopSnapshot")
                .withUri("/v2/{project_id}/snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getDesktopId, ListDesktopSnapshotRequest::setDesktopId));
        builder.<List<String>>withRequestField("desktop_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getDesktopIds,
                ListDesktopSnapshotRequest::setDesktopIds));
        builder.<String>withRequestField("desktop_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getDesktopName,
                ListDesktopSnapshotRequest::setDesktopName));
        builder.<List<String>>withRequestField("desktop_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getDesktopNames,
                ListDesktopSnapshotRequest::setDesktopNames));
        builder.<String>withRequestField("snapshot_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getSnapshotName,
                ListDesktopSnapshotRequest::setSnapshotName));
        builder.<List<String>>withRequestField("snapshot_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getSnapshotNames,
                ListDesktopSnapshotRequest::setSnapshotNames));
        builder.<ListDesktopSnapshotRequest.DiskTypeEnum>withRequestField("disk_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopSnapshotRequest.DiskTypeEnum.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getDiskType, ListDesktopSnapshotRequest::setDiskType));
        builder.<ListDesktopSnapshotRequest.CreateTypeEnum>withRequestField("create_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopSnapshotRequest.CreateTypeEnum.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getCreateType,
                ListDesktopSnapshotRequest::setCreateType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getStatus, ListDesktopSnapshotRequest::setStatus));
        builder.<ListDesktopSnapshotRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopSnapshotRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getSortField, ListDesktopSnapshotRequest::setSortField));
        builder.<ListDesktopSnapshotRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDesktopSnapshotRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getSortType, ListDesktopSnapshotRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getOffset, ListDesktopSnapshotRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopSnapshotRequest::getLimit, ListDesktopSnapshotRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> addMetricNotifyRule =
        genForAddMetricNotifyRule();

    private static HttpRequestDef<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> genForAddMetricNotifyRule() {
        // basic
        HttpRequestDef.Builder<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMetricNotifyRuleRequest.class, AddMetricNotifyRuleResponse.class)
                .withName("AddMetricNotifyRule")
                .withUri("/v2/{project_id}/statistics/notify-rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<AddMetricNotifyRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMetricNotifyRuleReq.class),
            f -> f.withMarshaller(AddMetricNotifyRuleRequest::getBody, AddMetricNotifyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> deleteMetricNotifyRule =
        genForDeleteMetricNotifyRule();

    private static HttpRequestDef<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> genForDeleteMetricNotifyRule() {
        // basic
        HttpRequestDef.Builder<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMetricNotifyRuleRequest.class, DeleteMetricNotifyRuleResponse.class)
            .withName("DeleteMetricNotifyRule")
            .withUri("/v2/{project_id}/statistics/notify-rules/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMetricNotifyRuleRequest::getRuleId, DeleteMetricNotifyRuleRequest::setRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse> exportAppUserAccessData =
        genForExportAppUserAccessData();

    private static HttpRequestDef<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse> genForExportAppUserAccessData() {
        // basic
        HttpRequestDef.Builder<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportAppUserAccessDataRequest.class, ExportAppUserAccessDataResponse.class)
            .withName("ExportAppUserAccessData")
            .withUri("/v2/{project_id}/statistics/metrics/app-user-access/export")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ExportAppUserAccessDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportAppUserAccessDataRequestBody.class),
            f -> f.withMarshaller(ExportAppUserAccessDataRequest::getBody, ExportAppUserAccessDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse> listAppUserAccessData =
        genForListAppUserAccessData();

    private static HttpRequestDef<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse> genForListAppUserAccessData() {
        // basic
        HttpRequestDef.Builder<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppUserAccessDataRequest.class, ListAppUserAccessDataResponse.class)
            .withName("ListAppUserAccessData")
            .withUri("/v2/{project_id}/statistics/metrics/app-user-access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getStartTime,
                ListAppUserAccessDataRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getEndTime, ListAppUserAccessDataRequest::setEndTime));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getUsername,
                ListAppUserAccessDataRequest::setUsername));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getSortField,
                ListAppUserAccessDataRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getSortType,
                ListAppUserAccessDataRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getOffset, ListAppUserAccessDataRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppUserAccessDataRequest::getLimit, ListAppUserAccessDataRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> listDesktopUsageMetric =
        genForListDesktopUsageMetric();

    private static HttpRequestDef<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> genForListDesktopUsageMetric() {
        // basic
        HttpRequestDef.Builder<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopUsageMetricRequest.class, ListDesktopUsageMetricResponse.class)
            .withName("ListDesktopUsageMetric")
            .withUri("/v2/{project_id}/statistics/metrics/desktops")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getStartTime,
                ListDesktopUsageMetricRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getEndTime,
                ListDesktopUsageMetricRequest::setEndTime));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getResourceName,
                ListDesktopUsageMetricRequest::setResourceName));
        builder.<Integer>withRequestField("min_idle_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getMinIdleDays,
                ListDesktopUsageMetricRequest::setMinIdleDays));
        builder.<Integer>withRequestField("max_idle_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getMaxIdleDays,
                ListDesktopUsageMetricRequest::setMaxIdleDays));
        builder.<Integer>withRequestField("usage_min_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getUsageMinHours,
                ListDesktopUsageMetricRequest::setUsageMinHours));
        builder.<Integer>withRequestField("usage_max_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getUsageMaxHours,
                ListDesktopUsageMetricRequest::setUsageMaxHours));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getEnterpriseProjectId,
                ListDesktopUsageMetricRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getSortField,
                ListDesktopUsageMetricRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getSortType,
                ListDesktopUsageMetricRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getOffset, ListDesktopUsageMetricRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDesktopUsageMetricRequest::getLimit, ListDesktopUsageMetricRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse> listDesktopsStatistics =
        genForListDesktopsStatistics();

    private static HttpRequestDef<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse> genForListDesktopsStatistics() {
        // basic
        HttpRequestDef.Builder<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDesktopsStatisticsRequest.class, ListDesktopsStatisticsResponse.class)
            .withName("ListDesktopsStatistics")
            .withUri("/v2/{project_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("desktop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsStatisticsRequest::getDesktopType,
                ListDesktopsStatisticsRequest::setDesktopType));
        builder.<List<ListDesktopsStatisticsRequest.StatisticsTypeEnum>>withRequestField("statistics_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsStatisticsRequest::getStatisticsType,
                ListDesktopsStatisticsRequest::setStatisticsType));
        builder.<List<String>>withRequestField("desktop_pool_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDesktopsStatisticsRequest::getDesktopPoolIds,
                ListDesktopsStatisticsRequest::setDesktopPoolIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginStateRequest, ListLoginStateResponse> listLoginState =
        genForListLoginState();

    private static HttpRequestDef<ListLoginStateRequest, ListLoginStateResponse> genForListLoginState() {
        // basic
        HttpRequestDef.Builder<ListLoginStateRequest, ListLoginStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginStateRequest.class, ListLoginStateResponse.class)
                .withName("ListLoginState")
                .withUri("/v2/{project_id}/desktops/statistics/login-state")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> listMetricNotifyRecord =
        genForListMetricNotifyRecord();

    private static HttpRequestDef<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> genForListMetricNotifyRecord() {
        // basic
        HttpRequestDef.Builder<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMetricNotifyRecordRequest.class, ListMetricNotifyRecordResponse.class)
            .withName("ListMetricNotifyRecord")
            .withUri("/v2/{project_id}/statistics/notification-records")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricNotifyRecordRequest::getMetricName,
                ListMetricNotifyRecordRequest::setMetricName));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricNotifyRecordRequest::getRuleId, ListMetricNotifyRecordRequest::setRuleId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricNotifyRecordRequest::getOffset, ListMetricNotifyRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricNotifyRecordRequest::getLimit, ListMetricNotifyRecordRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> listMetricNotifyRule =
        genForListMetricNotifyRule();

    private static HttpRequestDef<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> genForListMetricNotifyRule() {
        // basic
        HttpRequestDef.Builder<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMetricNotifyRuleRequest.class, ListMetricNotifyRuleResponse.class)
            .withName("ListMetricNotifyRule")
            .withUri("/v2/{project_id}/statistics/notify-rules")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricNotifyRuleRequest::getMetricName,
                ListMetricNotifyRuleRequest::setMetricName));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricNotifyRuleRequest::getRuleId, ListMetricNotifyRuleRequest::setRuleId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricNotifyRuleRequest::getOffset, ListMetricNotifyRuleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricNotifyRuleRequest::getLimit, ListMetricNotifyRuleRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/v2/{project_id}/statistics/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getStartTime, ListMetricsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getEndTime, ListMetricsRequest::setEndTime));
        builder.<String>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDim, ListMetricsRequest::setDim));
        builder.<List<String>>withRequestField("metric_names",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMetricsRequest::getMetricNames, ListMetricsRequest::setMetricNames));
        builder.<ListMetricsRequest.PeriodEnum>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetricsRequest.PeriodEnum.class),
            f -> f.withMarshaller(ListMetricsRequest::getPeriod, ListMetricsRequest::setPeriod));

        // response
        builder.<List<Metric>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMetricsResponse::getBody, ListMetricsResponse::setBody)
                .withInnerContainerType(Metric.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsTrendRequest, ListMetricsTrendResponse> listMetricsTrend =
        genForListMetricsTrend();

    private static HttpRequestDef<ListMetricsTrendRequest, ListMetricsTrendResponse> genForListMetricsTrend() {
        // basic
        HttpRequestDef.Builder<ListMetricsTrendRequest, ListMetricsTrendResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsTrendRequest.class, ListMetricsTrendResponse.class)
                .withName("ListMetricsTrend")
                .withUri("/v2/{project_id}/statistics/metrics/trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsTrendRequest::getStartTime, ListMetricsTrendRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsTrendRequest::getEndTime, ListMetricsTrendRequest::setEndTime));
        builder.<String>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsTrendRequest::getDim, ListMetricsTrendRequest::setDim));
        builder.<List<String>>withRequestField("metric_names",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMetricsTrendRequest::getMetricNames, ListMetricsTrendRequest::setMetricNames));
        builder.<ListMetricsTrendRequest.PeriodEnum>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetricsTrendRequest.PeriodEnum.class),
            f -> f.withMarshaller(ListMetricsTrendRequest::getPeriod, ListMetricsTrendRequest::setPeriod));

        // response
        builder.<List<MetricsWithTime>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMetricsTrendResponse::getBody, ListMetricsTrendResponse::setBody)
                .withInnerContainerType(MetricsWithTime.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRunStateRequest, ListRunStateResponse> listRunState = genForListRunState();

    private static HttpRequestDef<ListRunStateRequest, ListRunStateResponse> genForListRunState() {
        // basic
        HttpRequestDef.Builder<ListRunStateRequest, ListRunStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRunStateRequest.class, ListRunStateResponse.class)
                .withName("ListRunState")
                .withUri("/v2/{project_id}/desktops/statistics/run-state")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktops =
        genForListUnusedDesktops();

    private static HttpRequestDef<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> genForListUnusedDesktops() {
        // basic
        HttpRequestDef.Builder<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUnusedDesktopsRequest.class, ListUnusedDesktopsResponse.class)
                .withName("ListUnusedDesktops")
                .withUri("/v2/{project_id}/desktops/statistics/unused")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getOffset, ListUnusedDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getLimit, ListUnusedDesktopsRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getStartTime, ListUnusedDesktopsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUnusedDesktopsRequest::getEndTime, ListUnusedDesktopsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfo =
        genForListUsedDesktopInfo();

    private static HttpRequestDef<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> genForListUsedDesktopInfo() {
        // basic
        HttpRequestDef.Builder<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsedDesktopInfoRequest.class, ListUsedDesktopInfoResponse.class)
                .withName("ListUsedDesktopInfo")
                .withUri("/v2/{project_id}/desktops/statistics/used")
                .withContentType("application/json");

        // requests
        builder.<ListUsedDesktopInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsedDesktopInfoReq.class),
            f -> f.withMarshaller(ListUsedDesktopInfoRequest::getBody, ListUsedDesktopInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserUsageMetricRequest, ListUserUsageMetricResponse> listUserUsageMetric =
        genForListUserUsageMetric();

    private static HttpRequestDef<ListUserUsageMetricRequest, ListUserUsageMetricResponse> genForListUserUsageMetric() {
        // basic
        HttpRequestDef.Builder<ListUserUsageMetricRequest, ListUserUsageMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserUsageMetricRequest.class, ListUserUsageMetricResponse.class)
                .withName("ListUserUsageMetric")
                .withUri("/v2/{project_id}/statistics/metrics/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getStartTime, ListUserUsageMetricRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getEndTime, ListUserUsageMetricRequest::setEndTime));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getUsername, ListUserUsageMetricRequest::setUsername));
        builder.<Integer>withRequestField("usage_min_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getUsageMinHours,
                ListUserUsageMetricRequest::setUsageMinHours));
        builder.<Integer>withRequestField("usage_max_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getUsageMaxHours,
                ListUserUsageMetricRequest::setUsageMaxHours));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getEnterpriseProjectId,
                ListUserUsageMetricRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getSortField, ListUserUsageMetricRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getSortType, ListUserUsageMetricRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getOffset, ListUserUsageMetricRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserUsageMetricRequest::getLimit, ListUserUsageMetricRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGrowthRateRequest, ShowGrowthRateResponse> showGrowthRate =
        genForShowGrowthRate();

    private static HttpRequestDef<ShowGrowthRateRequest, ShowGrowthRateResponse> genForShowGrowthRate() {
        // basic
        HttpRequestDef.Builder<ShowGrowthRateRequest, ShowGrowthRateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGrowthRateRequest.class, ShowGrowthRateResponse.class)
                .withName("ShowGrowthRate")
                .withUri("/v2/{project_id}/statistics/growth-rate")
                .withContentType("application/json");

        // requests
        builder.<ShowGrowthRateRequest.GrowPeriodEnum>withRequestField("grow_period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowGrowthRateRequest.GrowPeriodEnum.class),
            f -> f.withMarshaller(ShowGrowthRateRequest::getGrowPeriod, ShowGrowthRateRequest::setGrowPeriod));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGrowthRateRequest::getMetricName, ShowGrowthRateRequest::setMetricName));
        builder.<String>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGrowthRateRequest::getDim, ShowGrowthRateRequest::setDim));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse> showUserAccessStages =
        genForShowUserAccessStages();

    private static HttpRequestDef<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse> genForShowUserAccessStages() {
        // basic
        HttpRequestDef.Builder<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserAccessStagesRequest.class, ShowUserAccessStagesResponse.class)
            .withName("ShowUserAccessStages")
            .withUri("/v2/{project_id}/statistics/metrics/access-stages")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transaction_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserAccessStagesRequest::getTransactionId,
                ShowUserAccessStagesRequest::setTransactionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> updateMetricNotifyRule =
        genForUpdateMetricNotifyRule();

    private static HttpRequestDef<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> genForUpdateMetricNotifyRule() {
        // basic
        HttpRequestDef.Builder<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMetricNotifyRuleRequest.class, UpdateMetricNotifyRuleResponse.class)
            .withName("UpdateMetricNotifyRule")
            .withUri("/v2/{project_id}/statistics/notify-rules/{rule_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMetricNotifyRuleRequest::getRuleId, UpdateMetricNotifyRuleRequest::setRuleId));
        builder.<UpdateMetricNotifyRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMetricNotifyRuleReq.class),
            f -> f.withMarshaller(UpdateMetricNotifyRuleRequest::getBody, UpdateMetricNotifyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse> exportDesktopUsageMetricNew =
        genForExportDesktopUsageMetricNew();

    private static HttpRequestDef<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse> genForExportDesktopUsageMetricNew() {
        // basic
        HttpRequestDef.Builder<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportDesktopUsageMetricNewRequest.class,
                    ExportDesktopUsageMetricNewResponse.class)
                .withName("ExportDesktopUsageMetricNew")
                .withUri("/v3/{project_id}/statistics/metrics/desktops/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getStartTime,
                ExportDesktopUsageMetricNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getEndTime,
                ExportDesktopUsageMetricNewRequest::setEndTime));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getResourceName,
                ExportDesktopUsageMetricNewRequest::setResourceName));
        builder.<Integer>withRequestField("min_idle_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getMinIdleDays,
                ExportDesktopUsageMetricNewRequest::setMinIdleDays));
        builder.<Integer>withRequestField("max_idle_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getMaxIdleDays,
                ExportDesktopUsageMetricNewRequest::setMaxIdleDays));
        builder.<Integer>withRequestField("usage_min_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getUsageMinHours,
                ExportDesktopUsageMetricNewRequest::setUsageMinHours));
        builder.<Integer>withRequestField("usage_max_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getUsageMaxHours,
                ExportDesktopUsageMetricNewRequest::setUsageMaxHours));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getEnterpriseProjectId,
                ExportDesktopUsageMetricNewRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getSortField,
                ExportDesktopUsageMetricNewRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportDesktopUsageMetricNewRequest::getSortType,
                ExportDesktopUsageMetricNewRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse> exportUserUsageMetricNew =
        genForExportUserUsageMetricNew();

    private static HttpRequestDef<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse> genForExportUserUsageMetricNew() {
        // basic
        HttpRequestDef.Builder<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ExportUserUsageMetricNewRequest.class, ExportUserUsageMetricNewResponse.class)
                .withName("ExportUserUsageMetricNew")
                .withUri("/v3/{project_id}/statistics/metrics/users/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getStartTime,
                ExportUserUsageMetricNewRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getEndTime,
                ExportUserUsageMetricNewRequest::setEndTime));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getUsername,
                ExportUserUsageMetricNewRequest::setUsername));
        builder.<Integer>withRequestField("usage_min_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getUsageMinHours,
                ExportUserUsageMetricNewRequest::setUsageMinHours));
        builder.<Integer>withRequestField("usage_max_hours",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getUsageMaxHours,
                ExportUserUsageMetricNewRequest::setUsageMaxHours));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getEnterpriseProjectId,
                ExportUserUsageMetricNewRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getSortField,
                ExportUserUsageMetricNewRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserUsageMetricNewRequest::getSortType,
                ExportUserUsageMetricNewRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableIpRequest, ShowAvailableIpResponse> showAvailableIp =
        genForShowAvailableIp();

    private static HttpRequestDef<ShowAvailableIpRequest, ShowAvailableIpResponse> genForShowAvailableIp() {
        // basic
        HttpRequestDef.Builder<ShowAvailableIpRequest, ShowAvailableIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAvailableIpRequest.class, ShowAvailableIpResponse.class)
                .withName("ShowAvailableIp")
                .withUri("/v2/{project_id}/subnets/{subnet_id}/available-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subnet_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableIpRequest::getSubnetId, ShowAvailableIpRequest::setSubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTenantConfigsRequest, ListTenantConfigsResponse> listTenantConfigs =
        genForListTenantConfigs();

    private static HttpRequestDef<ListTenantConfigsRequest, ListTenantConfigsResponse> genForListTenantConfigs() {
        // basic
        HttpRequestDef.Builder<ListTenantConfigsRequest, ListTenantConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantConfigsRequest.class, ListTenantConfigsResponse.class)
                .withName("ListTenantConfigs")
                .withUri("/v2/{project_id}/tenant-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantConfigsRequest::getName, ListTenantConfigsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTenantConfigRequest, UpdateTenantConfigResponse> updateTenantConfig =
        genForUpdateTenantConfig();

    private static HttpRequestDef<UpdateTenantConfigRequest, UpdateTenantConfigResponse> genForUpdateTenantConfig() {
        // basic
        HttpRequestDef.Builder<UpdateTenantConfigRequest, UpdateTenantConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTenantConfigRequest.class, UpdateTenantConfigResponse.class)
                .withName("UpdateTenantConfig")
                .withUri("/v2/{project_id}/tenant-configs")
                .withContentType("application/json");

        // requests
        builder.<UpdateTenantConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTenantConfigReq.class),
            f -> f.withMarshaller(UpdateTenantConfigRequest::getBody, UpdateTenantConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktops =
        genForCreateTerminalsBindingDesktops();

    private static HttpRequestDef<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> genForCreateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTerminalsBindingDesktopsRequest.class,
                    CreateTerminalsBindingDesktopsResponse.class)
                .withName("CreateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<CreateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(CreateTerminalsBindingDesktopsRequest::getBody,
                CreateTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktops =
        genForDeleteTerminalsBindingDesktops();

    private static HttpRequestDef<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> genForDeleteTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteTerminalsBindingDesktopsRequest.class,
                    DeleteTerminalsBindingDesktopsResponse.class)
                .withName("DeleteTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(DeleteTerminalsBindingDesktopsRequest::getBody,
                DeleteTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse> exportTerminalsBindingDesktopsTemplate =
        genForExportTerminalsBindingDesktopsTemplate();

    private static HttpRequestDef<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse> genForExportTerminalsBindingDesktopsTemplate() {
        // basic
        HttpRequestDef.Builder<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportTerminalsBindingDesktopsTemplateRequest.class,
                    ExportTerminalsBindingDesktopsTemplateResponse.class)
                .withName("ExportTerminalsBindingDesktopsTemplate")
                .withUri("/v2/{project_id}/terminals/binding-desktops/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTerminalsBindingDesktopsTemplateRequest::getLanguage,
                ExportTerminalsBindingDesktopsTemplateRequest::setLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktops =
        genForListTerminalsBindingDesktops();

    private static HttpRequestDef<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> genForListTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsRequest.class,
                    ListTerminalsBindingDesktopsResponse.class)
                .withName("ListTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getComputerName,
                ListTerminalsBindingDesktopsRequest::setComputerName));
        builder.<List<String>>withRequestField("computer_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getComputerNames,
                ListTerminalsBindingDesktopsRequest::setComputerNames));
        builder.<String>withRequestField("mac",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getMac,
                ListTerminalsBindingDesktopsRequest::setMac));
        builder.<List<String>>withRequestField("mac_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getMacList,
                ListTerminalsBindingDesktopsRequest::setMacList));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getOffset,
                ListTerminalsBindingDesktopsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getLimit,
                ListTerminalsBindingDesktopsRequest::setLimit));
        builder.<Boolean>withRequestField("count_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTerminalsBindingDesktopsRequest::getCountOnly,
                ListTerminalsBindingDesktopsRequest::setCountOnly));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfig =
        genForListTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> genForListTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTerminalsBindingDesktopsConfigRequest.class,
                    ListTerminalsBindingDesktopsConfigResponse.class)
                .withName("ListTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktops =
        genForUpdateTerminalsBindingDesktops();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> genForUpdateTerminalsBindingDesktops() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateTerminalsBindingDesktopsRequest.class,
                    UpdateTerminalsBindingDesktopsResponse.class)
                .withName("UpdateTerminalsBindingDesktops")
                .withUri("/v2/{project_id}/terminals/binding-desktops")
                .withContentType("application/json");

        // requests
        builder.<UpdateTerminalsBindingDesktopsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTerminalsBindingDesktopsRequestBody.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsRequest::getBody,
                UpdateTerminalsBindingDesktopsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfig =
        genForUpdateTerminalsBindingDesktopsConfig();

    private static HttpRequestDef<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> genForUpdateTerminalsBindingDesktopsConfig() {
        // basic
        HttpRequestDef.Builder<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTerminalsBindingDesktopsConfigRequest.class,
                    UpdateTerminalsBindingDesktopsConfigResponse.class)
                .withName("UpdateTerminalsBindingDesktopsConfig")
                .withUri("/v2/{project_id}/terminals/binding-desktops/config")
                .withContentType("application/json");

        // requests
        builder.<TerminalsBindingDesktopsConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TerminalsBindingDesktopsConfig.class),
            f -> f.withMarshaller(UpdateTerminalsBindingDesktopsConfigRequest::getBody,
                UpdateTerminalsBindingDesktopsConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse> exportTerminalsBindingDesktopsInfoNew =
        genForExportTerminalsBindingDesktopsInfoNew();

    private static HttpRequestDef<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse> genForExportTerminalsBindingDesktopsInfoNew() {
        // basic
        HttpRequestDef.Builder<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportTerminalsBindingDesktopsInfoNewRequest.class,
                    ExportTerminalsBindingDesktopsInfoNewResponse.class)
                .withName("ExportTerminalsBindingDesktopsInfoNew")
                .withUri("/v3/{project_id}/terminals/binding-desktops/template/export")
                .withContentType("application/json");

        // requests
        builder.<ExportTerminalsBindingDesktopsInfoNewRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportTerminalsBindingDesktopsInfoNewRequest.LanguageEnum.class),
            f -> f.withMarshaller(ExportTerminalsBindingDesktopsInfoNewRequest::getLanguage,
                ExportTerminalsBindingDesktopsInfoNewRequest::setLanguage));
        builder.<String>withRequestField("computer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTerminalsBindingDesktopsInfoNewRequest::getComputerName,
                ExportTerminalsBindingDesktopsInfoNewRequest::setComputerName));
        builder.<String>withRequestField("mac",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTerminalsBindingDesktopsInfoNewRequest::getMac,
                ExportTerminalsBindingDesktopsInfoNewRequest::setMac));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsers =
        genForBatchCreateUsers();

    private static HttpRequestDef<BatchCreateUsersRequest, BatchCreateUsersResponse> genForBatchCreateUsers() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsersRequest, BatchCreateUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateUsersRequest.class, BatchCreateUsersResponse.class)
                .withName("BatchCreateUsers")
                .withUri("/v2/{project_id}/users/batch-create")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateUsersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateUsersReq.class),
            f -> f.withMarshaller(BatchCreateUsersRequest::getBody, BatchCreateUsersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevices =
        genForBatchDeleteOtpDevices();

    private static HttpRequestDef<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> genForBatchDeleteOtpDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteOtpDevicesRequest.class, BatchDeleteOtpDevicesResponse.class)
            .withName("BatchDeleteOtpDevices")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getUserId, BatchDeleteOtpDevicesRequest::setUserId));
        builder.<DelOtpDevicesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DelOtpDevicesReq.class),
            f -> f.withMarshaller(BatchDeleteOtpDevicesRequest::getBody, BatchDeleteOtpDevicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUserRequest, BatchDeleteUserResponse> batchDeleteUser =
        genForBatchDeleteUser();

    private static HttpRequestDef<BatchDeleteUserRequest, BatchDeleteUserResponse> genForBatchDeleteUser() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUserRequest, BatchDeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteUserRequest.class, BatchDeleteUserResponse.class)
                .withName("BatchDeleteUser")
                .withUri("/v2/{project_id}/users/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteUserReq.class),
            f -> f.withMarshaller(BatchDeleteUserRequest::getBody, BatchDeleteUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatus =
        genForChangeUserStatus();

    private static HttpRequestDef<ChangeUserStatusRequest, ChangeUserStatusResponse> genForChangeUserStatus() {
        // basic
        HttpRequestDef.Builder<ChangeUserStatusRequest, ChangeUserStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeUserStatusRequest.class, ChangeUserStatusResponse.class)
                .withName("ChangeUserStatus")
                .withUri("/v2/{project_id}/users/{user_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getUserId, ChangeUserStatusRequest::setUserId));
        builder.<OperateUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateUserReq.class),
            f -> f.withMarshaller(ChangeUserStatusRequest::getBody, ChangeUserStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUser =
        genForCreateDesktopUser();

    private static HttpRequestDef<CreateDesktopUserRequest, CreateDesktopUserResponse> genForCreateDesktopUser() {
        // basic
        HttpRequestDef.Builder<CreateDesktopUserRequest, CreateDesktopUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDesktopUserRequest.class, CreateDesktopUserResponse.class)
                .withName("CreateDesktopUser")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserRequest.class),
            f -> f.withMarshaller(CreateDesktopUserRequest::getBody, CreateDesktopUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRequest, DeleteUserResponse> deleteUser = genForDeleteUser();

    private static HttpRequestDef<DeleteUserRequest, DeleteUserResponse> genForDeleteUser() {
        // basic
        HttpRequestDef.Builder<DeleteUserRequest, DeleteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRequest.class, DeleteUserResponse.class)
                .withName("DeleteUser")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRequest::getUserId, DeleteUserRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUserListTemplateRequest, ExportUserListTemplateResponse> exportUserListTemplate =
        genForExportUserListTemplate();

    private static HttpRequestDef<ExportUserListTemplateRequest, ExportUserListTemplateResponse> genForExportUserListTemplate() {
        // basic
        HttpRequestDef.Builder<ExportUserListTemplateRequest, ExportUserListTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportUserListTemplateRequest.class, ExportUserListTemplateResponse.class)
            .withName("ExportUserListTemplate")
            .withUri("/v2/{project_id}/users/desktop-users/template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserListTemplateRequest::getLanguage,
                ExportUserListTemplateRequest::setLanguage));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUserListTemplateRequest::getOsType, ExportUserListTemplateRequest::setOsType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUsersTemplateRequest, ExportUsersTemplateResponse> exportUsersTemplate =
        genForExportUsersTemplate();

    private static HttpRequestDef<ExportUsersTemplateRequest, ExportUsersTemplateResponse> genForExportUsersTemplate() {
        // basic
        HttpRequestDef.Builder<ExportUsersTemplateRequest, ExportUsersTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportUsersTemplateRequest.class, ExportUsersTemplateResponse.class)
                .withName("ExportUsersTemplate")
                .withUri("/v2/{project_id}/users/template/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUsersTemplateRequest::getLanguage, ExportUsersTemplateRequest::setLanguage));
        builder.<String>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportUsersTemplateRequest::getActiveType,
                ExportUsersTemplateRequest::setActiveType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportUserListRequest, ImportUserListResponse> importUserList =
        genForImportUserList();

    private static HttpRequestDef<ImportUserListRequest, ImportUserListResponse> genForImportUserList() {
        // basic
        HttpRequestDef.Builder<ImportUserListRequest, ImportUserListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportUserListRequest.class, ImportUserListResponse.class)
                .withName("ImportUserList")
                .withUri("/v2/{project_id}/users/desktop-users/action/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportUserListRequest::getVpcId, ImportUserListRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportUserListRequest::getSubnetId, ImportUserListRequest::setSubnetId));
        builder.<ImportUserListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ImportUserListRequestBody.class),
            f -> f.withMarshaller(ImportUserListRequest::getBody, ImportUserListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserId =
        genForListOtpDevicesByUserId();

    private static HttpRequestDef<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> genForListOtpDevicesByUserId() {
        // basic
        HttpRequestDef.Builder<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOtpDevicesByUserIdRequest.class, ListOtpDevicesByUserIdResponse.class)
            .withName("ListOtpDevicesByUserId")
            .withUri("/v2/{project_id}/users/{user_id}/otp-devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtpDevicesByUserIdRequest::getUserId, ListOtpDevicesByUserIdRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> listUserDetail =
        genForListUserDetail();

    private static HttpRequestDef<ListUserDetailRequest, ListUserDetailResponse> genForListUserDetail() {
        // basic
        HttpRequestDef.Builder<ListUserDetailRequest, ListUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDetailRequest.class, ListUserDetailResponse.class)
                .withName("ListUserDetail")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDetailRequest::getUserId, ListUserDetailRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v2/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, ListUsersRequest::setUserName));
        builder.<List<String>>withRequestField("user_names",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUsersRequest::getUserNames, ListUsersRequest::setUserNames));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getDescription, ListUsersRequest::setDescription));
        builder.<String>withRequestField("active_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getActiveType, ListUsersRequest::setActiveType));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getGroupName, ListUsersRequest::setGroupName));
        builder.<Boolean>withRequestField("share_space_subscription",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getShareSpaceSubscription,
                ListUsersRequest::setShareSpaceSubscription));
        builder.<Boolean>withRequestField("share_space_desktops",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getShareSpaceDesktops, ListUsersRequest::setShareSpaceDesktops));
        builder.<Boolean>withRequestField("is_query_total_desktops",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getIsQueryTotalDesktops,
                ListUsersRequest::setIsQueryTotalDesktops));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getEnterpriseProjectId, ListUsersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getDomain, ListUsersRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPassword =
        genForResetRandomPassword();

    private static HttpRequestDef<ResetRandomPasswordRequest, ResetRandomPasswordResponse> genForResetRandomPassword() {
        // basic
        HttpRequestDef.Builder<ResetRandomPasswordRequest, ResetRandomPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ResetRandomPasswordRequest.class, ResetRandomPasswordResponse.class)
                .withName("ResetRandomPassword")
                .withUri("/v2/{project_id}/users/{user_id}/random-password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRandomPasswordRequest::getUserId, ResetRandomPasswordRequest::setUserId));
        builder.<String>withRequestField("notification_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetRandomPasswordRequest::getNotificationType,
                ResetRandomPasswordRequest::setNotificationType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendEmailRequest, SendEmailResponse> sendEmail = genForSendEmail();

    private static HttpRequestDef<SendEmailRequest, SendEmailResponse> genForSendEmail() {
        // basic
        HttpRequestDef.Builder<SendEmailRequest, SendEmailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendEmailRequest.class, SendEmailResponse.class)
                .withName("SendEmail")
                .withUri("/v2/{project_id}/users/{user_id}/resend-email")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendEmailRequest::getUserId, SendEmailRequest::setUserId));
        builder.<ResendEmailReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResendEmailReq.class),
            f -> f.withMarshaller(SendEmailRequest::getBody, SendEmailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfo =
        genForUpdateUserInfo();

    private static HttpRequestDef<UpdateUserInfoRequest, UpdateUserInfoResponse> genForUpdateUserInfo() {
        // basic
        HttpRequestDef.Builder<UpdateUserInfoRequest, UpdateUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserInfoRequest.class, UpdateUserInfoResponse.class)
                .withName("UpdateUserInfo")
                .withUri("/v2/{project_id}/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getUserId, UpdateUserInfoRequest::setUserId));
        builder.<EditUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditUserReq.class),
            f -> f.withMarshaller(UpdateUserInfoRequest::getBody, UpdateUserInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserEventsRequest, ListUserEventsResponse> listUserEvents =
        genForListUserEvents();

    private static HttpRequestDef<ListUserEventsRequest, ListUserEventsResponse> genForListUserEvents() {
        // basic
        HttpRequestDef.Builder<ListUserEventsRequest, ListUserEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserEventsRequest.class, ListUserEventsResponse.class)
                .withName("ListUserEvents")
                .withUri("/v2/{project_id}/user-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getStartTime, ListUserEventsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getEndTime, ListUserEventsRequest::setEndTime));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getUsername, ListUserEventsRequest::setUsername));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getEventType, ListUserEventsRequest::setEventType));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getResourceId, ListUserEventsRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserEventsRequest::getResourceName, ListUserEventsRequest::setResourceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserEventsRequest::getOffset, ListUserEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserEventsRequest::getLimit, ListUserEventsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse> listUserEventsLtsConfigurations =
        genForListUserEventsLtsConfigurations();

    private static HttpRequestDef<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse> genForListUserEventsLtsConfigurations() {
        // basic
        HttpRequestDef.Builder<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListUserEventsLtsConfigurationsRequest.class,
                    ListUserEventsLtsConfigurationsResponse.class)
                .withName("ListUserEventsLtsConfigurations")
                .withUri("/v2/{project_id}/user-events/lts-configurations")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse> setUserEventsLtsConfigurations =
        genForSetUserEventsLtsConfigurations();

    private static HttpRequestDef<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse> genForSetUserEventsLtsConfigurations() {
        // basic
        HttpRequestDef.Builder<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetUserEventsLtsConfigurationsRequest.class,
                    SetUserEventsLtsConfigurationsResponse.class)
                .withName("SetUserEventsLtsConfigurations")
                .withUri("/v2/{project_id}/user-events/lts-configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SetUserEventsLtsConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetUserEventsLtsConfigurationsRequestBody.class),
            f -> f.withMarshaller(SetUserEventsLtsConfigurationsRequest::getBody,
                SetUserEventsLtsConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportUsersNewRequest, ExportUsersNewResponse> exportUsersNew =
        genForExportUsersNew();

    private static HttpRequestDef<ExportUsersNewRequest, ExportUsersNewResponse> genForExportUsersNew() {
        // basic
        HttpRequestDef.Builder<ExportUsersNewRequest, ExportUsersNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportUsersNewRequest.class, ExportUsersNewResponse.class)
                .withName("ExportUsersNew")
                .withUri("/v3/{project_id}/users/export")
                .withContentType("application/json");

        // requests
        builder.<ExportUsersV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportUsersV3Req.class),
            f -> f.withMarshaller(ExportUsersNewRequest::getBody, ExportUsersNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDesktopVolumesRequest, AddDesktopVolumesResponse> addDesktopVolumes =
        genForAddDesktopVolumes();

    private static HttpRequestDef<AddDesktopVolumesRequest, AddDesktopVolumesResponse> genForAddDesktopVolumes() {
        // basic
        HttpRequestDef.Builder<AddDesktopVolumesRequest, AddDesktopVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDesktopVolumesRequest.class, AddDesktopVolumesResponse.class)
                .withName("AddDesktopVolumes")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/volumes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDesktopVolumesRequest::getDesktopId, AddDesktopVolumesRequest::setDesktopId));
        builder.<AddVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVolumesReq.class),
            f -> f.withMarshaller(AddDesktopVolumesRequest::getBody, AddDesktopVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVolumesRequest, AddVolumesResponse> addVolumes = genForAddVolumes();

    private static HttpRequestDef<AddVolumesRequest, AddVolumesResponse> genForAddVolumes() {
        // basic
        HttpRequestDef.Builder<AddVolumesRequest, AddVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVolumesRequest.class, AddVolumesResponse.class)
                .withName("AddVolumes")
                .withUri("/v2/{project_id}/volumes")
                .withContentType("application/json");

        // requests
        builder.<AddDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDesktopsVolumesReq.class),
            f -> f.withMarshaller(AddVolumesRequest::getBody, AddVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse> batchModifyQosVolumes =
        genForBatchModifyQosVolumes();

    private static HttpRequestDef<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse> genForBatchModifyQosVolumes() {
        // basic
        HttpRequestDef.Builder<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, BatchModifyQosVolumesRequest.class, BatchModifyQosVolumesResponse.class)
            .withName("BatchModifyQosVolumes")
            .withUri("/v2/{project_id}/volumes/batch-modify-qos")
            .withContentType("application/json");

        // requests
        builder.<BatchModifyQosVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchModifyQosVolumesReq.class),
            f -> f.withMarshaller(BatchModifyQosVolumesRequest::getBody, BatchModifyQosVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumes =
        genForDeleteDesktopVolumes();

    private static HttpRequestDef<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> genForDeleteDesktopVolumes() {
        // basic
        HttpRequestDef.Builder<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteDesktopVolumesRequest.class, DeleteDesktopVolumesResponse.class)
            .withName("DeleteDesktopVolumes")
            .withUri("/v2/{project_id}/desktops/{desktop_id}/volumes/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getDesktopId,
                DeleteDesktopVolumesRequest::setDesktopId));
        builder.<DeleteVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteVolumesReq.class),
            f -> f.withMarshaller(DeleteDesktopVolumesRequest::getBody, DeleteDesktopVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse> expandDesktopVolume =
        genForExpandDesktopVolume();

    private static HttpRequestDef<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse> genForExpandDesktopVolume() {
        // basic
        HttpRequestDef.Builder<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandDesktopVolumeRequest.class, ExpandDesktopVolumeResponse.class)
                .withName("ExpandDesktopVolume")
                .withUri("/v2/{project_id}/desktops/{desktop_id}/volumes/{volume_id}/expand")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("desktop_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandDesktopVolumeRequest::getDesktopId, ExpandDesktopVolumeRequest::setDesktopId));
        builder.<String>withRequestField("volume_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandDesktopVolumeRequest::getVolumeId, ExpandDesktopVolumeRequest::setVolumeId));
        builder.<ExpandVolumeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandVolumeReq.class),
            f -> f.withMarshaller(ExpandDesktopVolumeRequest::getBody, ExpandDesktopVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumes =
        genForExpandVolumes();

    private static HttpRequestDef<ExpandVolumesRequest, ExpandVolumesResponse> genForExpandVolumes() {
        // basic
        HttpRequestDef.Builder<ExpandVolumesRequest, ExpandVolumesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExpandVolumesRequest.class, ExpandVolumesResponse.class)
                .withName("ExpandVolumes")
                .withUri("/v2/{project_id}/volumes/expand")
                .withContentType("application/json");

        // requests
        builder.<ExpandDesktopsVolumesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExpandDesktopsVolumesReq.class),
            f -> f.withMarshaller(ExpandVolumesRequest::getBody, ExpandVolumesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse> listVolumeProductInfo =
        genForListVolumeProductInfo();

    private static HttpRequestDef<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse> genForListVolumeProductInfo() {
        // basic
        HttpRequestDef.Builder<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVolumeProductInfoRequest.class, ListVolumeProductInfoResponse.class)
            .withName("ListVolumeProductInfo")
            .withUri("/v2/{project_id}/volume/products")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumeProductInfoRequest::getAvailabilityZone,
                ListVolumeProductInfoRequest::setAvailabilityZone));
        builder.<String>withRequestField("volume_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVolumeProductInfoRequest::getVolumeType,
                ListVolumeProductInfoRequest::setVolumeType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspace =
        genForApplyWorkspace();

    private static HttpRequestDef<ApplyWorkspaceRequest, ApplyWorkspaceResponse> genForApplyWorkspace() {
        // basic
        HttpRequestDef.Builder<ApplyWorkspaceRequest, ApplyWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ApplyWorkspaceRequest.class, ApplyWorkspaceResponse.class)
                .withName("ApplyWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ApplyWorkspaceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyWorkspaceReq.class),
            f -> f.withMarshaller(ApplyWorkspaceRequest::getBody, ApplyWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspace =
        genForCancelWorkspace();

    private static HttpRequestDef<CancelWorkspaceRequest, CancelWorkspaceResponse> genForCancelWorkspace() {
        // basic
        HttpRequestDef.Builder<CancelWorkspaceRequest, CancelWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelWorkspaceRequest.class, CancelWorkspaceResponse.class)
                .withName("CancelWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse> checkEnterpriseId =
        genForCheckEnterpriseId();

    private static HttpRequestDef<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse> genForCheckEnterpriseId() {
        // basic
        HttpRequestDef.Builder<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckEnterpriseIdRequest.class, CheckEnterpriseIdResponse.class)
                .withName("CheckEnterpriseId")
                .withUri("/v2/{project_id}/workspaces/enterprise-ids/check")
                .withContentType("application/json");

        // requests
        builder.<CheckEnterpriseIdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckEnterpriseIdReq.class),
            f -> f.withMarshaller(CheckEnterpriseIdRequest::getBody, CheckEnterpriseIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLock =
        genForShowWorkspaceLock();

    private static HttpRequestDef<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> genForShowWorkspaceLock() {
        // basic
        HttpRequestDef.Builder<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkspaceLockRequest.class, ShowWorkspaceLockResponse.class)
                .withName("ShowWorkspaceLock")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspace =
        genForUnlockWorkspace();

    private static HttpRequestDef<UnlockWorkspaceRequest, UnlockWorkspaceResponse> genForUnlockWorkspace() {
        // basic
        HttpRequestDef.Builder<UnlockWorkspaceRequest, UnlockWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UnlockWorkspaceRequest.class, UnlockWorkspaceResponse.class)
                .withName("UnlockWorkspace")
                .withUri("/v2/{project_id}/workspaces/lock-status")
                .withContentType("application/json");

        // requests
        builder.<UnlockWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockWorkspaceRequestBody.class),
            f -> f.withMarshaller(UnlockWorkspaceRequest::getBody, UnlockWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse> updateEnterpriseId =
        genForUpdateEnterpriseId();

    private static HttpRequestDef<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse> genForUpdateEnterpriseId() {
        // basic
        HttpRequestDef.Builder<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnterpriseIdRequest.class, UpdateEnterpriseIdResponse.class)
                .withName("UpdateEnterpriseId")
                .withUri("/v2/{project_id}/workspaces/enterprise-id")
                .withContentType("application/json");

        // requests
        builder.<ModifyEnterpriseIdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyEnterpriseIdReq.class),
            f -> f.withMarshaller(UpdateEnterpriseIdRequest::getBody, UpdateEnterpriseIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v2/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<ModifyWorkspaceAttributesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyWorkspaceAttributesReq.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

}

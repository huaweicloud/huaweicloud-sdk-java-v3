package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopSubResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopSubResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddDesktopVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddOuRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddOuResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddRestrictedRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddRestrictedRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddSiteRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddSiteResponse;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AddVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyDesktopsInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyInternetRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyInternetResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplySubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplySubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.ApplyWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.AssociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.AttachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAddDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAssociateInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAssociateInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchAttachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchAttachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchChangeTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchCreateUsersResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAccessPoliciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppRulesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppRulesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteDesktopsTagsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteOtpDevicesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScreenRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteScreenRecordsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteSubJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteSubJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDetachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDetachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisableAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisableAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchDisassociateDesktopsEipResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchEnableAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchEnableAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAgentRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAgentResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAppsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchInstallAppsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchLogoffDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchModifyQosVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchModifyQosVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRebuildDesktopsSystemDiskResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRestoreDesktopSnapshotRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRestoreDesktopSnapshotResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchRunDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateAppAuthorizationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateAppAuthorizationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateTargetOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.BatchUpdateTargetOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CancelRemoteAssistanceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CancelRemoteAssistanceResponse;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CancelWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopNetworkResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopToImageRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeDesktopToImageResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserPrivilegeGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserPrivilegeGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.ChangeUserStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckCidrRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckCidrResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckDesktopImagesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckDesktopImagesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckEdgeSiteResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckEdgeSiteResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckEnterpriseIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckEnterpriseIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.CheckSysprepInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.CheckSysprepInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAgenciesResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAndAuthorizeBucketRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAndAuthorizeBucketResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateBucketCredentialRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateBucketCredentialResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopBatchOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopBatchOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolAuthorizedObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolAuthorizedObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateDesktopUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyTemplateRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreatePolicyTemplateResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateRemoteAssistanceRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateRemoteAssistanceResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateResourcePackagesOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateResourcePackagesOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateSubnetBandwidthChangeOrderRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateSubnetBandwidthChangeOrderResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.CreateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopSubResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopSubResourcesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteDesktopVolumesResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSiteRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSiteResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteSubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserRequest;
import com.huaweicloud.sdk.workspace.v2.model.DeleteUserResponse;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesRequest;
import com.huaweicloud.sdk.workspace.v2.model.DetachInstancesResponse;
import com.huaweicloud.sdk.workspace.v2.model.DisableRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.DisableRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.DownloadExportFileRequest;
import com.huaweicloud.sdk.workspace.v2.model.DownloadExportFileResponse;
import com.huaweicloud.sdk.workspace.v2.model.DownloadMetadataRequest;
import com.huaweicloud.sdk.workspace.v2.model.DownloadMetadataResponse;
import com.huaweicloud.sdk.workspace.v2.model.EnableRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.EnableRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddResourcesRequest;
import com.huaweicloud.sdk.workspace.v2.model.EstimateAddResourcesResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolActionRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolActionResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteDesktopPoolScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptByDesktopTagRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptByDesktopTagResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptOrCommandRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExecuteScriptOrCommandResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopPoolVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopVolumeRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandDesktopVolumeResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesRequest;
import com.huaweicloud.sdk.workspace.v2.model.ExpandVolumesResponse;
import com.huaweicloud.sdk.workspace.v2.model.ExportAppUserAccessDataRequest;
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
import com.huaweicloud.sdk.workspace.v2.model.ImportCertRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportCertResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportIpRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportIpResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportPolicyGroupsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportPolicyGroupsResponse;
import com.huaweicloud.sdk.workspace.v2.model.ImportUserListRequest;
import com.huaweicloud.sdk.workspace.v2.model.ImportUserListResponse;
import com.huaweicloud.sdk.workspace.v2.model.InstallAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.InstallAppResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsByTagsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListDesktopsByTagsResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ListDownloadAddressResponse;
import com.huaweicloud.sdk.workspace.v2.model.ListExportTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListExportTasksResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.ListNotificationRecordsRequest;
import com.huaweicloud.sdk.workspace.v2.model.ListNotificationRecordsResponse;
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
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.RebuildDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.RegisterDomainRequest;
import com.huaweicloud.sdk.workspace.v2.model.RegisterDomainResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResetRandomPasswordResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.ResizeDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.RetryJobsRequest;
import com.huaweicloud.sdk.workspace.v2.model.RetryJobsResponse;
import com.huaweicloud.sdk.workspace.v2.model.RetryScriptExecutionRequest;
import com.huaweicloud.sdk.workspace.v2.model.RetryScriptExecutionResponse;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnWorkspaceJobRequest;
import com.huaweicloud.sdk.workspace.v2.model.RunActionsOnWorkspaceJobResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendDesktopPoolNotificationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendDesktopPoolNotificationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendEmailRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendEmailResponse;
import com.huaweicloud.sdk.workspace.v2.model.SendNotificationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.SendNotificationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetCertStatusRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetCertStatusResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetMaintenanceModeRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetMaintenanceModeResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetRuleRestrictionRequest;
import com.huaweicloud.sdk.workspace.v2.model.SetRuleRestrictionResponse;
import com.huaweicloud.sdk.workspace.v2.model.SetUserEventsLtsConfigurationsRequest;
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
import com.huaweicloud.sdk.workspace.v2.model.StopScriptExecutionRequest;
import com.huaweicloud.sdk.workspace.v2.model.StopScriptExecutionResponse;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UnlockWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessAddressBackupConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessAddressBackupConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessModeRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessModeResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAccessPolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppAuthorizationsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppAuthorizationsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAppRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthConfigApplyObjectsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthConfigApplyObjectsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAssistAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAuthMethodConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateAuthMethodConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopNamePolicyResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopPoolRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopPoolResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopSidsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopSidsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopUsernameRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateDesktopUsernameResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateEnterpriseIdRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateEnterpriseIdResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateHostsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateHostsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateMetricNotifyRuleResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateNatMappingConfigsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateNatMappingConfigsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateOuInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateOuInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePoliciesOfPolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePoliciesOfPolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePolicyGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdatePolicyGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScheduledTasksResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScriptRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateScriptResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateShareSpaceConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateShareSpaceConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthControlListRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthControlListResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetBandwidthResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetIdsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateSubnetIdsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantProfileRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTenantProfileResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateTerminalsBindingDesktopsResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUploadedAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUploadedAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserGroupResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateUserInfoResponse;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.workspace.v2.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.workspace.v2.model.UploadAppRequest;
import com.huaweicloud.sdk.workspace.v2.model.UploadAppResponse;
import com.huaweicloud.sdk.workspace.v2.model.ValidateConfigRequest;
import com.huaweicloud.sdk.workspace.v2.model.ValidateConfigResponse;
import com.huaweicloud.sdk.workspace.v2.model.ValidateDomainControllerRequest;
import com.huaweicloud.sdk.workspace.v2.model.ValidateDomainControllerResponse;

public class WorkspaceClient {

    protected HcClient hcClient;

    public WorkspaceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceClient> newBuilder() {
        ClientBuilder<WorkspaceClient> clientBuilder = new ClientBuilder<>(WorkspaceClient::new);
        return clientBuilder;
    }

    /**
     * 获取云办公服务接入地址备份配置
     *
     * 该接口用于获取云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAddressBackupConfigRequest 请求对象
     * @return ListAccessAddressBackupConfigResponse
     */
    public ListAccessAddressBackupConfigResponse listAccessAddressBackupConfig(
        ListAccessAddressBackupConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessAddressBackupConfig);
    }

    /**
     * 获取云办公服务接入地址备份配置
     *
     * 该接口用于获取云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAddressBackupConfigRequest 请求对象
     * @return SyncInvoker<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse>
     */
    public SyncInvoker<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse> listAccessAddressBackupConfigInvoker(
        ListAccessAddressBackupConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAccessAddressBackupConfig, hcClient);
    }

    /**
     * 修改云办公服务接入地址备份配置
     *
     * 该接口用于修改云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessAddressBackupConfigRequest 请求对象
     * @return UpdateAccessAddressBackupConfigResponse
     */
    public UpdateAccessAddressBackupConfigResponse updateAccessAddressBackupConfig(
        UpdateAccessAddressBackupConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessAddressBackupConfig);
    }

    /**
     * 修改云办公服务接入地址备份配置
     *
     * 该接口用于修改云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessAddressBackupConfigRequest 请求对象
     * @return SyncInvoker<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse>
     */
    public SyncInvoker<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse> updateAccessAddressBackupConfigInvoker(
        UpdateAccessAddressBackupConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAccessAddressBackupConfig, hcClient);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
     * @return BatchDeleteAccessPoliciesResponse
     */
    public BatchDeleteAccessPoliciesResponse batchDeleteAccessPolicies(BatchDeleteAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteAccessPolicies);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public SyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteAccessPolicies, hcClient);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPolicyRequest 请求对象
     * @return CreateAccessPolicyResponse
     */
    public CreateAccessPolicyResponse createAccessPolicy(CreateAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAccessPolicy);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPolicyRequest 请求对象
     * @return SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public SyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyInvoker(
        CreateAccessPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAccessPolicy, hcClient);
    }

    /**
     * 导入ip模板下载
     *
     * 该接口用于导入Ip模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpTemplateRequest 请求对象
     * @return ExportIpTemplateResponse
     */
    public ExportIpTemplateResponse exportIpTemplate(ExportIpTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportIpTemplate);
    }

    /**
     * 导入ip模板下载
     *
     * 该接口用于导入Ip模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpTemplateRequest 请求对象
     * @return SyncInvoker<ExportIpTemplateRequest, ExportIpTemplateResponse>
     */
    public SyncInvoker<ExportIpTemplateRequest, ExportIpTemplateResponse> exportIpTemplateInvoker(
        ExportIpTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportIpTemplate, hcClient);
    }

    /**
     * 导入ip列表
     *
     * 以excel文件形式导入ip列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpRequest 请求对象
     * @return ImportIpResponse
     */
    public ImportIpResponse importIp(ImportIpRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.importIp);
    }

    /**
     * 导入ip列表
     *
     * 以excel文件形式导入ip列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpRequest 请求对象
     * @return SyncInvoker<ImportIpRequest, ImportIpResponse>
     */
    public SyncInvoker<ImportIpRequest, ImportIpResponse> importIpInvoker(ImportIpRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.importIp, hcClient);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPoliciesRequest 请求对象
     * @return ListAccessPoliciesResponse
     */
    public ListAccessPoliciesResponse listAccessPolicies(ListAccessPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicies);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPoliciesRequest 请求对象
     * @return SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public SyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesInvoker(
        ListAccessPoliciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAccessPolicies, hcClient);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPolicyObjectsRequest 请求对象
     * @return ListAccessPolicyObjectsResponse
     */
    public ListAccessPolicyObjectsResponse listAccessPolicyObjects(ListAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAccessPolicyObjects);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public SyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAccessPolicyObjects, hcClient);
    }

    /**
     * 更新指定接入策略
     *
     * 该接口用于更新指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyRequest 请求对象
     * @return UpdateAccessPolicyResponse
     */
    public UpdateAccessPolicyResponse updateAccessPolicy(UpdateAccessPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessPolicy);
    }

    /**
     * 更新指定接入策略
     *
     * 该接口用于更新指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
     */
    public SyncInvoker<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse> updateAccessPolicyInvoker(
        UpdateAccessPolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAccessPolicy, hcClient);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
     * @return UpdateAccessPolicyObjectsResponse
     */
    public UpdateAccessPolicyObjectsResponse updateAccessPolicyObjects(UpdateAccessPolicyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessPolicyObjects);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
     * @return SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public SyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAccessPolicyObjects, hcClient);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return CreateAgenciesResponse
     */
    public CreateAgenciesResponse createAgencies(CreateAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAgencies);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesInvoker(
        CreateAgenciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAgencies, hcClient);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAgencies);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAgencies, hcClient);
    }

    /**
     * 查询告警统计
     *
     * 返回各级别告警数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsRequest 请求对象
     * @return ListAlarmStatisticsResponse
     */
    public ListAlarmStatisticsResponse listAlarmStatistics(ListAlarmStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAlarmStatistics);
    }

    /**
     * 查询告警统计
     *
     * 返回各级别告警数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsRequest 请求对象
     * @return SyncInvoker<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse>
     */
    public SyncInvoker<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse> listAlarmStatisticsInvoker(
        ListAlarmStatisticsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAlarmStatistics, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 从ces查询告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAlarms);
    }

    /**
     * 查询告警列表
     *
     * 从ces查询告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAlarms, hcClient);
    }

    /**
     * 批量删除应用
     *
     * 批量删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppsRequest 请求对象
     * @return BatchDeleteAppsResponse
     */
    public BatchDeleteAppsResponse batchDeleteApps(BatchDeleteAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteApps);
    }

    /**
     * 批量删除应用
     *
     * 批量删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppsRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppsRequest, BatchDeleteAppsResponse>
     */
    public SyncInvoker<BatchDeleteAppsRequest, BatchDeleteAppsResponse> batchDeleteAppsInvoker(
        BatchDeleteAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteApps, hcClient);
    }

    /**
     * 批量删除job
     *
     * 批量删除job。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return BatchDeleteJobsResponse
     */
    public BatchDeleteJobsResponse batchDeleteJobs(BatchDeleteJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteJobs);
    }

    /**
     * 批量删除job
     *
     * 批量删除job。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public SyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsInvoker(
        BatchDeleteJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量设置不可见
     *
     * 批量设置不可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppsRequest 请求对象
     * @return BatchDisableAppsResponse
     */
    public BatchDisableAppsResponse batchDisableApps(BatchDisableAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDisableApps);
    }

    /**
     * 批量设置不可见
     *
     * 批量设置不可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppsRequest 请求对象
     * @return SyncInvoker<BatchDisableAppsRequest, BatchDisableAppsResponse>
     */
    public SyncInvoker<BatchDisableAppsRequest, BatchDisableAppsResponse> batchDisableAppsInvoker(
        BatchDisableAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDisableApps, hcClient);
    }

    /**
     * 批量设置可见
     *
     * 批量设置可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppsRequest 请求对象
     * @return BatchEnableAppsResponse
     */
    public BatchEnableAppsResponse batchEnableApps(BatchEnableAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchEnableApps);
    }

    /**
     * 批量设置可见
     *
     * 批量设置可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppsRequest 请求对象
     * @return SyncInvoker<BatchEnableAppsRequest, BatchEnableAppsResponse>
     */
    public SyncInvoker<BatchEnableAppsRequest, BatchEnableAppsResponse> batchEnableAppsInvoker(
        BatchEnableAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchEnableApps, hcClient);
    }

    /**
     * 批量自动安装安装应用
     *
     * 批量自动安装安装应用 (应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAppsRequest 请求对象
     * @return BatchInstallAppsResponse
     */
    public BatchInstallAppsResponse batchInstallApps(BatchInstallAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchInstallApps);
    }

    /**
     * 批量自动安装安装应用
     *
     * 批量自动安装安装应用 (应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAppsRequest 请求对象
     * @return SyncInvoker<BatchInstallAppsRequest, BatchInstallAppsResponse>
     */
    public SyncInvoker<BatchInstallAppsRequest, BatchInstallAppsResponse> batchInstallAppsInvoker(
        BatchInstallAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchInstallApps, hcClient);
    }

    /**
     * 批量设置应用授权
     *
     * 批量设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAppAuthorizationsRequest 请求对象
     * @return BatchUpdateAppAuthorizationsResponse
     */
    public BatchUpdateAppAuthorizationsResponse batchUpdateAppAuthorizations(
        BatchUpdateAppAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchUpdateAppAuthorizations);
    }

    /**
     * 批量设置应用授权
     *
     * 批量设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAppAuthorizationsRequest 请求对象
     * @return SyncInvoker<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse>
     */
    public SyncInvoker<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse> batchUpdateAppAuthorizationsInvoker(
        BatchUpdateAppAuthorizationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchUpdateAppAuthorizations, hcClient);
    }

    /**
     * 添加并授权默认桶
     *
     * 添加并授权默认桶,桶不存在时会自动创建OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndAuthorizeBucketRequest 请求对象
     * @return CreateAndAuthorizeBucketResponse
     */
    public CreateAndAuthorizeBucketResponse createAndAuthorizeBucket(CreateAndAuthorizeBucketRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAndAuthorizeBucket);
    }

    /**
     * 添加并授权默认桶
     *
     * 添加并授权默认桶,桶不存在时会自动创建OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndAuthorizeBucketRequest 请求对象
     * @return SyncInvoker<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse>
     */
    public SyncInvoker<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse> createAndAuthorizeBucketInvoker(
        CreateAndAuthorizeBucketRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAndAuthorizeBucket, hcClient);
    }

    /**
     * 生成访问凭证信息
     *
     * 生成桶凭证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketCredentialRequest 请求对象
     * @return CreateBucketCredentialResponse
     */
    public CreateBucketCredentialResponse createBucketCredential(CreateBucketCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createBucketCredential);
    }

    /**
     * 生成访问凭证信息
     *
     * 生成桶凭证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketCredentialRequest 请求对象
     * @return SyncInvoker<CreateBucketCredentialRequest, CreateBucketCredentialResponse>
     */
    public SyncInvoker<CreateBucketCredentialRequest, CreateBucketCredentialResponse> createBucketCredentialInvoker(
        CreateBucketCredentialRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createBucketCredential, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteApp, hcClient);
    }

    /**
     * 自动安装应用
     *
     * 自动安装应用(应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallAppRequest 请求对象
     * @return InstallAppResponse
     */
    public InstallAppResponse installApp(InstallAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.installApp);
    }

    /**
     * 自动安装应用
     *
     * 自动安装应用(应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallAppRequest 请求对象
     * @return SyncInvoker<InstallAppRequest, InstallAppResponse>
     */
    public SyncInvoker<InstallAppRequest, InstallAppResponse> installAppInvoker(InstallAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.installApp, hcClient);
    }

    /**
     * 查询应用授权信息
     *
     * 查询应用授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppAuthorizationsRequest 请求对象
     * @return ListAppAuthorizationsResponse
     */
    public ListAppAuthorizationsResponse listAppAuthorizations(ListAppAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAppAuthorizations);
    }

    /**
     * 查询应用授权信息
     *
     * 查询应用授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppAuthorizationsRequest 请求对象
     * @return SyncInvoker<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse>
     */
    public SyncInvoker<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse> listAppAuthorizationsInvoker(
        ListAppAuthorizationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAppAuthorizations, hcClient);
    }

    /**
     * 查询应用分类信息
     *
     * 查询应用分类信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCatalogsRequest 请求对象
     * @return ListAppCatalogsResponse
     */
    public ListAppCatalogsResponse listAppCatalogs(ListAppCatalogsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAppCatalogs);
    }

    /**
     * 查询应用分类信息
     *
     * 查询应用分类信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCatalogsRequest 请求对象
     * @return SyncInvoker<ListAppCatalogsRequest, ListAppCatalogsResponse>
     */
    public SyncInvoker<ListAppCatalogsRequest, ListAppCatalogsResponse> listAppCatalogsInvoker(
        ListAppCatalogsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAppCatalogs, hcClient);
    }

    /**
     * 按照名称分页查询应用
     *
     * 按照名称分页查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listApps);
    }

    /**
     * 按照名称分页查询应用
     *
     * 按照名称分页查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listApps, hcClient);
    }

    /**
     * 查询应用安装job信息
     *
     * 查询应用安装job信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listJobs);
    }

    /**
     * 查询应用安装job信息
     *
     * 查询应用安装job信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listJobs, hcClient);
    }

    /**
     * 重试失败job
     *
     * 重试指定失败job(仅支持失败job重试，其他类型job重试会响应错误)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobsRequest 请求对象
     * @return RetryJobsResponse
     */
    public RetryJobsResponse retryJobs(RetryJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.retryJobs);
    }

    /**
     * 重试失败job
     *
     * 重试指定失败job(仅支持失败job重试，其他类型job重试会响应错误)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobsRequest 请求对象
     * @return SyncInvoker<RetryJobsRequest, RetryJobsResponse>
     */
    public SyncInvoker<RetryJobsRequest, RetryJobsResponse> retryJobsInvoker(RetryJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.retryJobs, hcClient);
    }

    /**
     * 设置应用授权
     *
     * 设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAuthorizationsRequest 请求对象
     * @return UpdateAppAuthorizationsResponse
     */
    public UpdateAppAuthorizationsResponse updateAppAuthorizations(UpdateAppAuthorizationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAppAuthorizations);
    }

    /**
     * 设置应用授权
     *
     * 设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAuthorizationsRequest 请求对象
     * @return SyncInvoker<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse>
     */
    public SyncInvoker<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse> updateAppAuthorizationsInvoker(
        UpdateAppAuthorizationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAppAuthorizations, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUploadedAppRequest 请求对象
     * @return UpdateUploadedAppResponse
     */
    public UpdateUploadedAppResponse updateUploadedApp(UpdateUploadedAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUploadedApp);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUploadedAppRequest 请求对象
     * @return SyncInvoker<UpdateUploadedAppRequest, UpdateUploadedAppResponse>
     */
    public SyncInvoker<UpdateUploadedAppRequest, UpdateUploadedAppResponse> updateUploadedAppInvoker(
        UpdateUploadedAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateUploadedApp, hcClient);
    }

    /**
     * 添加应用
     *
     * 添加应用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppRequest 请求对象
     * @return UploadAppResponse
     */
    public UploadAppResponse uploadApp(UploadAppRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.uploadApp);
    }

    /**
     * 添加应用
     *
     * 添加应用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppRequest 请求对象
     * @return SyncInvoker<UploadAppRequest, UploadAppResponse>
     */
    public SyncInvoker<UploadAppRequest, UploadAppResponse> uploadAppInvoker(UploadAppRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.uploadApp, hcClient);
    }

    /**
     * 增加管控规则
     *
     * 增加管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRestrictedRuleRequest 请求对象
     * @return AddRestrictedRuleResponse
     */
    public AddRestrictedRuleResponse addRestrictedRule(AddRestrictedRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addRestrictedRule);
    }

    /**
     * 增加管控规则
     *
     * 增加管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRestrictedRuleRequest 请求对象
     * @return SyncInvoker<AddRestrictedRuleRequest, AddRestrictedRuleResponse>
     */
    public SyncInvoker<AddRestrictedRuleRequest, AddRestrictedRuleResponse> addRestrictedRuleInvoker(
        AddRestrictedRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addRestrictedRule, hcClient);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRulesRequest 请求对象
     * @return BatchDeleteAppRulesResponse
     */
    public BatchDeleteAppRulesResponse batchDeleteAppRules(BatchDeleteAppRulesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteAppRules);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRulesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse>
     */
    public SyncInvoker<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse> batchDeleteAppRulesInvoker(
        BatchDeleteAppRulesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteAppRules, hcClient);
    }

    /**
     * 创建应用规则
     *
     * 创建应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRuleRequest 请求对象
     * @return CreateAppRuleResponse
     */
    public CreateAppRuleResponse createAppRule(CreateAppRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createAppRule);
    }

    /**
     * 创建应用规则
     *
     * 创建应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRuleRequest 请求对象
     * @return SyncInvoker<CreateAppRuleRequest, CreateAppRuleResponse>
     */
    public SyncInvoker<CreateAppRuleRequest, CreateAppRuleResponse> createAppRuleInvoker(CreateAppRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createAppRule, hcClient);
    }

    /**
     * 删除应用规则
     *
     * 删除应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRuleRequest 请求对象
     * @return DeleteAppRuleResponse
     */
    public DeleteAppRuleResponse deleteAppRule(DeleteAppRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteAppRule);
    }

    /**
     * 删除应用规则
     *
     * 删除应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRuleRequest 请求对象
     * @return SyncInvoker<DeleteAppRuleRequest, DeleteAppRuleResponse>
     */
    public SyncInvoker<DeleteAppRuleRequest, DeleteAppRuleResponse> deleteAppRuleInvoker(DeleteAppRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteAppRule, hcClient);
    }

    /**
     * 批量删除管控规则
     *
     * 批量删除管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRestrictedRuleRequest 请求对象
     * @return DeleteRestrictedRuleResponse
     */
    public DeleteRestrictedRuleResponse deleteRestrictedRule(DeleteRestrictedRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteRestrictedRule);
    }

    /**
     * 批量删除管控规则
     *
     * 批量删除管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRestrictedRuleRequest 请求对象
     * @return SyncInvoker<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse>
     */
    public SyncInvoker<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse> deleteRestrictedRuleInvoker(
        DeleteRestrictedRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteRestrictedRule, hcClient);
    }

    /**
     * 禁用规则管控
     *
     * 禁用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableRuleRestrictionRequest 请求对象
     * @return DisableRuleRestrictionResponse
     */
    public DisableRuleRestrictionResponse disableRuleRestriction(DisableRuleRestrictionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.disableRuleRestriction);
    }

    /**
     * 禁用规则管控
     *
     * 禁用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableRuleRestrictionRequest 请求对象
     * @return SyncInvoker<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse>
     */
    public SyncInvoker<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse> disableRuleRestrictionInvoker(
        DisableRuleRestrictionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.disableRuleRestriction, hcClient);
    }

    /**
     * 启用规则管控
     *
     * 启用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableRuleRestrictionRequest 请求对象
     * @return EnableRuleRestrictionResponse
     */
    public EnableRuleRestrictionResponse enableRuleRestriction(EnableRuleRestrictionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.enableRuleRestriction);
    }

    /**
     * 启用规则管控
     *
     * 启用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableRuleRestrictionRequest 请求对象
     * @return SyncInvoker<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse>
     */
    public SyncInvoker<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse> enableRuleRestrictionInvoker(
        EnableRuleRestrictionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.enableRuleRestriction, hcClient);
    }

    /**
     * 查询应用规则
     *
     * 查询应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRuleRequest 请求对象
     * @return ListAppRuleResponse
     */
    public ListAppRuleResponse listAppRule(ListAppRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAppRule);
    }

    /**
     * 查询应用规则
     *
     * 查询应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRuleRequest 请求对象
     * @return SyncInvoker<ListAppRuleRequest, ListAppRuleResponse>
     */
    public SyncInvoker<ListAppRuleRequest, ListAppRuleResponse> listAppRuleInvoker(ListAppRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAppRule, hcClient);
    }

    /**
     * 查询管控规则列表
     *
     * 查询管控规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestrictedRuleRequest 请求对象
     * @return ListRestrictedRuleResponse
     */
    public ListRestrictedRuleResponse listRestrictedRule(ListRestrictedRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listRestrictedRule);
    }

    /**
     * 查询管控规则列表
     *
     * 查询管控规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestrictedRuleRequest 请求对象
     * @return SyncInvoker<ListRestrictedRuleRequest, ListRestrictedRuleResponse>
     */
    public SyncInvoker<ListRestrictedRuleRequest, ListRestrictedRuleResponse> listRestrictedRuleInvoker(
        ListRestrictedRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listRestrictedRule, hcClient);
    }

    /**
     * 设置管控规则
     *
     * 设置管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRuleRestrictionRequest 请求对象
     * @return SetRuleRestrictionResponse
     */
    public SetRuleRestrictionResponse setRuleRestriction(SetRuleRestrictionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.setRuleRestriction);
    }

    /**
     * 设置管控规则
     *
     * 设置管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRuleRestrictionRequest 请求对象
     * @return SyncInvoker<SetRuleRestrictionRequest, SetRuleRestrictionResponse>
     */
    public SyncInvoker<SetRuleRestrictionRequest, SetRuleRestrictionResponse> setRuleRestrictionInvoker(
        SetRuleRestrictionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.setRuleRestriction, hcClient);
    }

    /**
     * 查询管控规则
     *
     * 查询管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRestrictionRequest 请求对象
     * @return ShowRuleRestrictionResponse
     */
    public ShowRuleRestrictionResponse showRuleRestriction(ShowRuleRestrictionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showRuleRestriction);
    }

    /**
     * 查询管控规则
     *
     * 查询管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRestrictionRequest 请求对象
     * @return SyncInvoker<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse>
     */
    public SyncInvoker<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse> showRuleRestrictionInvoker(
        ShowRuleRestrictionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showRuleRestriction, hcClient);
    }

    /**
     * 修改应用规则
     *
     * 修改应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRuleRequest 请求对象
     * @return UpdateAppRuleResponse
     */
    public UpdateAppRuleResponse updateAppRule(UpdateAppRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAppRule);
    }

    /**
     * 修改应用规则
     *
     * 修改应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRuleRequest 请求对象
     * @return SyncInvoker<UpdateAppRuleRequest, UpdateAppRuleResponse>
     */
    public SyncInvoker<UpdateAppRuleRequest, UpdateAppRuleResponse> updateAppRuleInvoker(UpdateAppRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAppRule, hcClient);
    }

    /**
     * 下载SAML 2.0元数据信息
     *
     * 下载SAML 2.0元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadMetadataRequest 请求对象
     * @return DownloadMetadataResponse
     */
    public DownloadMetadataResponse downloadMetadata(DownloadMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.downloadMetadata);
    }

    /**
     * 下载SAML 2.0元数据信息
     *
     * 下载SAML 2.0元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadMetadataRequest 请求对象
     * @return SyncInvoker<DownloadMetadataRequest, DownloadMetadataResponse>
     */
    public SyncInvoker<DownloadMetadataRequest, DownloadMetadataResponse> downloadMetadataInvoker(
        DownloadMetadataRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.downloadMetadata, hcClient);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigRequest 请求对象
     * @return ShowAssistAuthConfigResponse
     */
    public ShowAssistAuthConfigResponse showAssistAuthConfig(ShowAssistAuthConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfig);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigRequest 请求对象
     * @return SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public SyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigInvoker(
        ShowAssistAuthConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAssistAuthConfig, hcClient);
    }

    /**
     * 查询辅助认证应用对象列表
     *
     * 查询辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigApplyObjectsRequest 请求对象
     * @return ShowAssistAuthConfigApplyObjectsResponse
     */
    public ShowAssistAuthConfigApplyObjectsResponse showAssistAuthConfigApplyObjects(
        ShowAssistAuthConfigApplyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfigApplyObjects);
    }

    /**
     * 查询辅助认证应用对象列表
     *
     * 查询辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigApplyObjectsRequest 请求对象
     * @return SyncInvoker<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse>
     */
    public SyncInvoker<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse> showAssistAuthConfigApplyObjectsInvoker(
        ShowAssistAuthConfigApplyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAssistAuthConfigApplyObjects, hcClient);
    }

    /**
     * 查询认证登录方式
     *
     * 查询认证登录方式配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthConfigRequest 请求对象
     * @return ShowAuthConfigResponse
     */
    public ShowAuthConfigResponse showAuthConfig(ShowAuthConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAuthConfig);
    }

    /**
     * 查询认证登录方式
     *
     * 查询认证登录方式配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthConfigRequest 请求对象
     * @return SyncInvoker<ShowAuthConfigRequest, ShowAuthConfigResponse>
     */
    public SyncInvoker<ShowAuthConfigRequest, ShowAuthConfigResponse> showAuthConfigInvoker(
        ShowAuthConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAuthConfig, hcClient);
    }

    /**
     * 更新辅助认证应用对象列表
     *
     * 更新辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthConfigApplyObjectsRequest 请求对象
     * @return UpdateAssistAuthConfigApplyObjectsResponse
     */
    public UpdateAssistAuthConfigApplyObjectsResponse updateAssistAuthConfigApplyObjects(
        UpdateAssistAuthConfigApplyObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAssistAuthConfigApplyObjects);
    }

    /**
     * 更新辅助认证应用对象列表
     *
     * 更新辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthConfigApplyObjectsRequest 请求对象
     * @return SyncInvoker<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse>
     */
    public SyncInvoker<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse> updateAssistAuthConfigApplyObjectsInvoker(
        UpdateAssistAuthConfigApplyObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAssistAuthConfigApplyObjects, hcClient);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
     * @return UpdateAssistAuthMethodConfigResponse
     */
    public UpdateAssistAuthMethodConfigResponse updateAssistAuthMethodConfig(
        UpdateAssistAuthMethodConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAssistAuthMethodConfig);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
     * @return SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public SyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAssistAuthMethodConfig, hcClient);
    }

    /**
     * 更新认证策略配置
     *
     * 更新认证策略配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthMethodConfigRequest 请求对象
     * @return UpdateAuthMethodConfigResponse
     */
    public UpdateAuthMethodConfigResponse updateAuthMethodConfig(UpdateAuthMethodConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAuthMethodConfig);
    }

    /**
     * 更新认证策略配置
     *
     * 更新认证策略配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthMethodConfigRequest 请求对象
     * @return SyncInvoker<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse>
     */
    public SyncInvoker<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse> updateAuthMethodConfigInvoker(
        UpdateAuthMethodConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAuthMethodConfig, hcClient);
    }

    /**
     * 校验配置是否合法（当前仅支持SAML2配置校验）
     *
     * 校验配置是否合法（当前仅支持SAML2配置校验）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigRequest 请求对象
     * @return ValidateConfigResponse
     */
    public ValidateConfigResponse validateConfig(ValidateConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.validateConfig);
    }

    /**
     * 校验配置是否合法（当前仅支持SAML2配置校验）
     *
     * 校验配置是否合法（当前仅支持SAML2配置校验）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigRequest 请求对象
     * @return SyncInvoker<ValidateConfigRequest, ValidateConfigResponse>
     */
    public SyncInvoker<ValidateConfigRequest, ValidateConfigResponse> validateConfigInvoker(
        ValidateConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.validateConfig, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询可用分区列表概要
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzsRequest 请求对象
     * @return ListAzsResponse
     */
    public ListAzsResponse listAzs(ListAzsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAzs);
    }

    /**
     * 查询可用分区列表概要
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzsRequest 请求对象
     * @return SyncInvoker<ListAzsRequest, ListAzsResponse>
     */
    public SyncInvoker<ListAzsRequest, ListAzsResponse> listAzsInvoker(ListAzsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAzs, hcClient);
    }

    /**
     * 查询可用分区详情
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAzDetailsRequest 请求对象
     * @return ShowAzDetailsResponse
     */
    public ShowAzDetailsResponse showAzDetails(ShowAzDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAzDetails);
    }

    /**
     * 查询可用分区详情
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAzDetailsRequest 请求对象
     * @return SyncInvoker<ShowAzDetailsRequest, ShowAzDetailsResponse>
     */
    public SyncInvoker<ShowAzDetailsRequest, ShowAzDetailsResponse> showAzDetailsInvoker(ShowAzDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAzDetails, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertRequest 请求对象
     * @return CreateCertResponse
     */
    public CreateCertResponse createCert(CreateCertRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createCert);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertRequest 请求对象
     * @return SyncInvoker<CreateCertRequest, CreateCertResponse>
     */
    public SyncInvoker<CreateCertRequest, CreateCertResponse> createCertInvoker(CreateCertRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createCert, hcClient);
    }

    /**
     * 删除ca证书
     *
     * 删除ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertRequest 请求对象
     * @return DeleteCertResponse
     */
    public DeleteCertResponse deleteCert(DeleteCertRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteCert);
    }

    /**
     * 删除ca证书
     *
     * 删除ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertRequest 请求对象
     * @return SyncInvoker<DeleteCertRequest, DeleteCertResponse>
     */
    public SyncInvoker<DeleteCertRequest, DeleteCertResponse> deleteCertInvoker(DeleteCertRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteCert, hcClient);
    }

    /**
     * 导出ca证书crl文件
     *
     * 导出ca证书crl文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCrlFileRequest 请求对象
     * @return ExportCertCrlFileResponse
     */
    public ExportCertCrlFileResponse exportCertCrlFile(ExportCertCrlFileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportCertCrlFile);
    }

    /**
     * 导出ca证书crl文件
     *
     * 导出ca证书crl文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCrlFileRequest 请求对象
     * @return SyncInvoker<ExportCertCrlFileRequest, ExportCertCrlFileResponse>
     */
    public SyncInvoker<ExportCertCrlFileRequest, ExportCertCrlFileResponse> exportCertCrlFileInvoker(
        ExportCertCrlFileRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportCertCrlFile, hcClient);
    }

    /**
     * 导出ca证书签名请求
     *
     * 导出ca证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCsrFileRequest 请求对象
     * @return ExportCertCsrFileResponse
     */
    public ExportCertCsrFileResponse exportCertCsrFile(ExportCertCsrFileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportCertCsrFile);
    }

    /**
     * 导出ca证书签名请求
     *
     * 导出ca证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCsrFileRequest 请求对象
     * @return SyncInvoker<ExportCertCsrFileRequest, ExportCertCsrFileResponse>
     */
    public SyncInvoker<ExportCertCsrFileRequest, ExportCertCsrFileResponse> exportCertCsrFileInvoker(
        ExportCertCsrFileRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportCertCsrFile, hcClient);
    }

    /**
     * 导出ca证书pem文件
     *
     * 导出ca证书pem文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertPemFileRequest 请求对象
     * @return ExportCertPemFileResponse
     */
    public ExportCertPemFileResponse exportCertPemFile(ExportCertPemFileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportCertPemFile);
    }

    /**
     * 导出ca证书pem文件
     *
     * 导出ca证书pem文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertPemFileRequest 请求对象
     * @return SyncInvoker<ExportCertPemFileRequest, ExportCertPemFileResponse>
     */
    public SyncInvoker<ExportCertPemFileRequest, ExportCertPemFileResponse> exportCertPemFileInvoker(
        ExportCertPemFileRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportCertPemFile, hcClient);
    }

    /**
     * 导入ca子证书
     *
     * 导入ca子证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertRequest 请求对象
     * @return ImportCertResponse
     */
    public ImportCertResponse importCert(ImportCertRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.importCert);
    }

    /**
     * 导入ca子证书
     *
     * 导入ca子证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertRequest 请求对象
     * @return SyncInvoker<ImportCertRequest, ImportCertResponse>
     */
    public SyncInvoker<ImportCertRequest, ImportCertResponse> importCertInvoker(ImportCertRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.importCert, hcClient);
    }

    /**
     * 查询CA证书列表
     *
     * 查询CA证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return ListCertsResponse
     */
    public ListCertsResponse listCerts(ListCertsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listCerts);
    }

    /**
     * 查询CA证书列表
     *
     * 查询CA证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return SyncInvoker<ListCertsRequest, ListCertsResponse>
     */
    public SyncInvoker<ListCertsRequest, ListCertsResponse> listCertsInvoker(ListCertsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listCerts, hcClient);
    }

    /**
     * 启用或禁用ca证书
     *
     * 启用或禁用ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertStatusRequest 请求对象
     * @return SetCertStatusResponse
     */
    public SetCertStatusResponse setCertStatus(SetCertStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.setCertStatus);
    }

    /**
     * 启用或禁用ca证书
     *
     * 启用或禁用ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertStatusRequest 请求对象
     * @return SyncInvoker<SetCertStatusRequest, SetCertStatusResponse>
     */
    public SyncInvoker<SetCertStatusRequest, SetCertStatusResponse> setCertStatusInvoker(SetCertStatusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.setCertStatus, hcClient);
    }

    /**
     * 查询ca证书详情
     *
     * 查询ca证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertDetailRequest 请求对象
     * @return ShowCertDetailResponse
     */
    public ShowCertDetailResponse showCertDetail(ShowCertDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showCertDetail);
    }

    /**
     * 查询ca证书详情
     *
     * 查询ca证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertDetailRequest 请求对象
     * @return SyncInvoker<ShowCertDetailRequest, ShowCertDetailResponse>
     */
    public SyncInvoker<ShowCertDetailRequest, ShowCertDetailResponse> showCertDetailInvoker(
        ShowCertDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showCertDetail, hcClient);
    }

    /**
     * 检查桌面镜像是否存在
     *
     * 用于校验指定桌面列表的桌面镜像，当前是否存在，如果存在返回对应的imageId，不存在就不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDesktopImagesRequest 请求对象
     * @return CheckDesktopImagesResponse
     */
    public CheckDesktopImagesResponse checkDesktopImages(CheckDesktopImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.checkDesktopImages);
    }

    /**
     * 检查桌面镜像是否存在
     *
     * 用于校验指定桌面列表的桌面镜像，当前是否存在，如果存在返回对应的imageId，不存在就不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDesktopImagesRequest 请求对象
     * @return SyncInvoker<CheckDesktopImagesRequest, CheckDesktopImagesResponse>
     */
    public SyncInvoker<CheckDesktopImagesRequest, CheckDesktopImagesResponse> checkDesktopImagesInvoker(
        CheckDesktopImagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.checkDesktopImages, hcClient);
    }

    /**
     * sysprep版本信息检查
     *
     * 检查sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSysprepInfoRequest 请求对象
     * @return CheckSysprepInfoResponse
     */
    public CheckSysprepInfoResponse checkSysprepInfo(CheckSysprepInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.checkSysprepInfo);
    }

    /**
     * sysprep版本信息检查
     *
     * 检查sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSysprepInfoRequest 请求对象
     * @return SyncInvoker<CheckSysprepInfoRequest, CheckSysprepInfoResponse>
     */
    public SyncInvoker<CheckSysprepInfoRequest, CheckSysprepInfoResponse> checkSysprepInfoInvoker(
        CheckSysprepInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.checkSysprepInfo, hcClient);
    }

    /**
     * 导出连接记录(待废弃)
     *
     * 该接口用于导出连接记录，待废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserLoginInfoNewRequest 请求对象
     * @return ExportUserLoginInfoNewResponse
     */
    public ExportUserLoginInfoNewResponse exportUserLoginInfoNew(ExportUserLoginInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录(待废弃)
     *
     * 该接口用于导出连接记录，待废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserLoginInfoNewRequest 请求对象
     * @return SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public SyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
     * @return ListHistoryOnlineInfoNewResponse
     */
    public ListHistoryOnlineInfoNewResponse listHistoryOnlineInfoNew(ListHistoryOnlineInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
     * @return SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public SyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询桌面登录状态
     *
     * 该接口用于查询桌面登录状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesStatusRequest 请求对象
     * @return ListInstancesStatusResponse
     */
    public ListInstancesStatusResponse listInstancesStatus(ListInstancesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listInstancesStatus);
    }

    /**
     * 查询桌面登录状态
     *
     * 该接口用于查询桌面登录状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesStatusRequest 请求对象
     * @return SyncInvoker<ListInstancesStatusRequest, ListInstancesStatusResponse>
     */
    public SyncInvoker<ListInstancesStatusRequest, ListInstancesStatusResponse> listInstancesStatusInvoker(
        ListInstancesStatusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listInstancesStatus, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginRecordsNewRequest 请求对象
     * @return ListLoginRecordsNewResponse
     */
    public ListLoginRecordsNewResponse listLoginRecordsNew(ListLoginRecordsNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginRecordsNewRequest 请求对象
     * @return SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public SyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewInvoker(
        ListLoginRecordsNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listLoginRecordsNew, hcClient);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录;
     * 最多导出30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserConnectionNewRequest 请求对象
     * @return ExportUserConnectionNewResponse
     */
    public ExportUserConnectionNewResponse exportUserConnectionNew(ExportUserConnectionNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserConnectionNew);
    }

    /**
     * 导出连接记录
     *
     * 该接口用于导出连接记录;
     * 最多导出30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserConnectionNewRequest 请求对象
     * @return SyncInvoker<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse>
     */
    public SyncInvoker<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse> exportUserConnectionNewInvoker(
        ExportUserConnectionNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserConnectionNew, hcClient);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.attachInstances);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return SyncInvoker<AttachInstancesRequest, AttachInstancesResponse>
     */
    public SyncInvoker<AttachInstancesRequest, AttachInstancesResponse> attachInstancesInvoker(
        AttachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.attachInstances, hcClient);
    }

    /**
     * 预批量分配用户
     *
     * 预批量将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateInstancesRequest 请求对象
     * @return BatchAssociateInstancesResponse
     */
    public BatchAssociateInstancesResponse batchAssociateInstances(BatchAssociateInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchAssociateInstances);
    }

    /**
     * 预批量分配用户
     *
     * 预批量将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateInstancesRequest 请求对象
     * @return SyncInvoker<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse>
     */
    public SyncInvoker<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse> batchAssociateInstancesInvoker(
        BatchAssociateInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchAssociateInstances, hcClient);
    }

    /**
     * 批量分配用户
     *
     * 批量分配桌面给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInstancesRequest 请求对象
     * @return BatchAttachInstancesResponse
     */
    public BatchAttachInstancesResponse batchAttachInstances(BatchAttachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchAttachInstances);
    }

    /**
     * 批量分配用户
     *
     * 批量分配桌面给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInstancesRequest 请求对象
     * @return SyncInvoker<BatchAttachInstancesRequest, BatchAttachInstancesResponse>
     */
    public SyncInvoker<BatchAttachInstancesRequest, BatchAttachInstancesResponse> batchAttachInstancesInvoker(
        BatchAttachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchAttachInstances, hcClient);
    }

    /**
     * 批量切换桌面网络
     *
     * 批量切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDesktopNetworkRequest 请求对象
     * @return BatchChangeDesktopNetworkResponse
     */
    public BatchChangeDesktopNetworkResponse batchChangeDesktopNetwork(BatchChangeDesktopNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchChangeDesktopNetwork);
    }

    /**
     * 批量切换桌面网络
     *
     * 批量切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDesktopNetworkRequest 请求对象
     * @return SyncInvoker<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse>
     */
    public SyncInvoker<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse> batchChangeDesktopNetworkInvoker(
        BatchChangeDesktopNetworkRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchChangeDesktopNetwork, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsRequest 请求对象
     * @return BatchDeleteDesktopsResponse
     */
    public BatchDeleteDesktopsResponse batchDeleteDesktops(BatchDeleteDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsInvoker(
        BatchDeleteDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 批量解绑用户
     *
     * 批量将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInstancesRequest 请求对象
     * @return BatchDetachInstancesResponse
     */
    public BatchDetachInstancesResponse batchDetachInstances(BatchDetachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDetachInstances);
    }

    /**
     * 批量解绑用户
     *
     * 批量将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInstancesRequest 请求对象
     * @return SyncInvoker<BatchDetachInstancesRequest, BatchDetachInstancesResponse>
     */
    public SyncInvoker<BatchDetachInstancesRequest, BatchDetachInstancesResponse> batchDetachInstancesInvoker(
        BatchDetachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDetachInstances, hcClient);
    }

    /**
     * 安装监控插件
     *
     * 批量为桌面安装监控插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAgentRequest 请求对象
     * @return BatchInstallAgentResponse
     */
    public BatchInstallAgentResponse batchInstallAgent(BatchInstallAgentRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchInstallAgent);
    }

    /**
     * 安装监控插件
     *
     * 批量为桌面安装监控插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAgentRequest 请求对象
     * @return SyncInvoker<BatchInstallAgentRequest, BatchInstallAgentResponse>
     */
    public SyncInvoker<BatchInstallAgentRequest, BatchInstallAgentResponse> batchInstallAgentInvoker(
        BatchInstallAgentRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchInstallAgent, hcClient);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLogoffDesktopsRequest 请求对象
     * @return BatchLogoffDesktopsResponse
     */
    public BatchLogoffDesktopsResponse batchLogoffDesktops(BatchLogoffDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchLogoffDesktops);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLogoffDesktopsRequest 请求对象
     * @return SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>
     */
    public SyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktopsInvoker(
        BatchLogoffDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchLogoffDesktops, hcClient);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return BatchRebuildDesktopsSystemDiskResponse
     */
    public BatchRebuildDesktopsSystemDiskResponse batchRebuildDesktopsSystemDisk(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>
     */
    public SyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskInvoker(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机、休眠和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRunDesktopsRequest 请求对象
     * @return BatchRunDesktopsResponse
     */
    public BatchRunDesktopsResponse batchRunDesktops(BatchRunDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机、休眠和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRunDesktopsRequest 请求对象
     * @return SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public SyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsInvoker(
        BatchRunDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 取消远程协助
     *
     * 取消远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemoteAssistanceRequest 请求对象
     * @return CancelRemoteAssistanceResponse
     */
    public CancelRemoteAssistanceResponse cancelRemoteAssistance(CancelRemoteAssistanceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.cancelRemoteAssistance);
    }

    /**
     * 取消远程协助
     *
     * 取消远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemoteAssistanceRequest 请求对象
     * @return SyncInvoker<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse>
     */
    public SyncInvoker<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse> cancelRemoteAssistanceInvoker(
        CancelRemoteAssistanceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.cancelRemoteAssistance, hcClient);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopNetworkRequest 请求对象
     * @return ChangeDesktopNetworkResponse
     */
    public ChangeDesktopNetworkResponse changeDesktopNetwork(ChangeDesktopNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeDesktopNetwork);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>
     */
    public SyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetworkInvoker(
        ChangeDesktopNetworkRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeDesktopNetwork, hcClient);
    }

    /**
     * 桌面转镜像
     *
     * 桌面转镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopToImageRequest 请求对象
     * @return ChangeDesktopToImageResponse
     */
    public ChangeDesktopToImageResponse changeDesktopToImage(ChangeDesktopToImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeDesktopToImage);
    }

    /**
     * 桌面转镜像
     *
     * 桌面转镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopToImageRequest 请求对象
     * @return SyncInvoker<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse>
     */
    public SyncInvoker<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse> changeDesktopToImageInvoker(
        ChangeDesktopToImageRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeDesktopToImage, hcClient);
    }

    /**
     * 批量修改用户权限组
     *
     * 批量修改用户权限组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserPrivilegeGroupRequest 请求对象
     * @return ChangeUserPrivilegeGroupResponse
     */
    public ChangeUserPrivilegeGroupResponse changeUserPrivilegeGroup(ChangeUserPrivilegeGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeUserPrivilegeGroup);
    }

    /**
     * 批量修改用户权限组
     *
     * 批量修改用户权限组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserPrivilegeGroupRequest 请求对象
     * @return SyncInvoker<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse>
     */
    public SyncInvoker<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse> changeUserPrivilegeGroupInvoker(
        ChangeUserPrivilegeGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeUserPrivilegeGroup, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopRequest 请求对象
     * @return CreateDesktopResponse
     */
    public CreateDesktopResponse createDesktop(CreateDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopRequest 请求对象
     * @return SyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public SyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopInvoker(CreateDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktop, hcClient);
    }

    /**
     * 创建远程协助
     *
     * 创建远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemoteAssistanceRequest 请求对象
     * @return CreateRemoteAssistanceResponse
     */
    public CreateRemoteAssistanceResponse createRemoteAssistance(CreateRemoteAssistanceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createRemoteAssistance);
    }

    /**
     * 创建远程协助
     *
     * 创建远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemoteAssistanceRequest 请求对象
     * @return SyncInvoker<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse>
     */
    public SyncInvoker<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse> createRemoteAssistanceInvoker(
        CreateRemoteAssistanceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createRemoteAssistance, hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopRequest 请求对象
     * @return DeleteDesktopResponse
     */
    public DeleteDesktopResponse deleteDesktop(DeleteDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopRequest 请求对象
     * @return SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public SyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopInvoker(DeleteDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktop, hcClient);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.detachInstances);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return SyncInvoker<DetachInstancesRequest, DetachInstancesResponse>
     */
    public SyncInvoker<DetachInstancesRequest, DetachInstancesResponse> detachInstancesInvoker(
        DetachInstancesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.detachInstances, hcClient);
    }

    /**
     * 查询桌面安装监控插件详情
     *
     * 展示桌面安装监控插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsInstallConditionRequest 请求对象
     * @return ListAgentsInstallConditionResponse
     */
    public ListAgentsInstallConditionResponse listAgentsInstallCondition(ListAgentsInstallConditionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAgentsInstallCondition);
    }

    /**
     * 查询桌面安装监控插件详情
     *
     * 展示桌面安装监控插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsInstallConditionRequest 请求对象
     * @return SyncInvoker<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse>
     */
    public SyncInvoker<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse> listAgentsInstallConditionInvoker(
        ListAgentsInstallConditionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAgentsInstallCondition, hcClient);
    }

    /**
     * 查询桌面开关机信息
     *
     * 获取桌面开关机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopActionsRequest 请求对象
     * @return ListDesktopActionsResponse
     */
    public ListDesktopActionsResponse listDesktopActions(ListDesktopActionsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopActions);
    }

    /**
     * 查询桌面开关机信息
     *
     * 获取桌面开关机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopActionsRequest 请求对象
     * @return SyncInvoker<ListDesktopActionsRequest, ListDesktopActionsResponse>
     */
    public SyncInvoker<ListDesktopActionsRequest, ListDesktopActionsResponse> listDesktopActionsInvoker(
        ListDesktopActionsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopActions, hcClient);
    }

    /**
     * 查询桌面解绑信息
     *
     * 查询桌面解绑信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopDetachInfoRequest 请求对象
     * @return ListDesktopDetachInfoResponse
     */
    public ListDesktopDetachInfoResponse listDesktopDetachInfo(ListDesktopDetachInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopDetachInfo);
    }

    /**
     * 查询桌面解绑信息
     *
     * 查询桌面解绑信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopDetachInfoRequest 请求对象
     * @return SyncInvoker<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse>
     */
    public SyncInvoker<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse> listDesktopDetachInfoInvoker(
        ListDesktopDetachInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopDetachInfo, hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsRequest 请求对象
     * @return ListDesktopsResponse
     */
    public ListDesktopsResponse listDesktops(ListDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsRequest 请求对象
     * @return SyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public SyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsInvoker(ListDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktops, hcClient);
    }

    /**
     * 查询桌面连接状态列表
     *
     * 查询桌面连接状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsConnectStatusRequest 请求对象
     * @return ListDesktopsConnectStatusResponse
     */
    public ListDesktopsConnectStatusResponse listDesktopsConnectStatus(ListDesktopsConnectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsConnectStatus);
    }

    /**
     * 查询桌面连接状态列表
     *
     * 查询桌面连接状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsConnectStatusRequest 请求对象
     * @return SyncInvoker<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse>
     */
    public SyncInvoker<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse> listDesktopsConnectStatusInvoker(
        ListDesktopsConnectStatusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsConnectStatus, hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsDetailRequest 请求对象
     * @return ListDesktopsDetailResponse
     */
    public ListDesktopsDetailResponse listDesktopsDetail(ListDesktopsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsDetailRequest 请求对象
     * @return SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public SyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailInvoker(
        ListDesktopsDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 重新加入AD域
     *
     * 该接口用于Windows桌面重新加入AD域，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDomainRequest 请求对象
     * @return RegisterDomainResponse
     */
    public RegisterDomainResponse registerDomain(RegisterDomainRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.registerDomain);
    }

    /**
     * 重新加入AD域
     *
     * 该接口用于Windows桌面重新加入AD域，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDomainRequest 请求对象
     * @return SyncInvoker<RegisterDomainRequest, RegisterDomainResponse>
     */
    public SyncInvoker<RegisterDomainRequest, RegisterDomainResponse> registerDomainInvoker(
        RegisterDomainRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.registerDomain, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopRequest 请求对象
     * @return ResizeDesktopResponse
     */
    public ResizeDesktopResponse resizeDesktop(ResizeDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopRequest 请求对象
     * @return SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public SyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopInvoker(ResizeDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.resizeDesktop, hcClient);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendNotificationsRequest 请求对象
     * @return SendNotificationsResponse
     */
    public SendNotificationsResponse sendNotifications(SendNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.sendNotifications);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendNotificationsRequest 请求对象
     * @return SyncInvoker<SendNotificationsRequest, SendNotificationsResponse>
     */
    public SyncInvoker<SendNotificationsRequest, SendNotificationsResponse> sendNotificationsInvoker(
        SendNotificationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.sendNotifications, hcClient);
    }

    /**
     * 批量设置桌面维护模式
     *
     * 批量设置桌面管理员维护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMaintenanceModeRequest 请求对象
     * @return SetMaintenanceModeResponse
     */
    public SetMaintenanceModeResponse setMaintenanceMode(SetMaintenanceModeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.setMaintenanceMode);
    }

    /**
     * 批量设置桌面维护模式
     *
     * 批量设置桌面管理员维护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMaintenanceModeRequest 请求对象
     * @return SyncInvoker<SetMaintenanceModeRequest, SetMaintenanceModeResponse>
     */
    public SyncInvoker<SetMaintenanceModeRequest, SetMaintenanceModeResponse> setMaintenanceModeInvoker(
        SetMaintenanceModeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.setMaintenanceMode, hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopDetailRequest 请求对象
     * @return ShowDesktopDetailResponse
     */
    public ShowDesktopDetailResponse showDesktopDetail(ShowDesktopDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopDetailRequest 请求对象
     * @return SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public SyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailInvoker(
        ShowDesktopDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询桌面监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopMonitorDataRequest 请求对象
     * @return ShowDesktopMonitorDataResponse
     */
    public ShowDesktopMonitorDataResponse showDesktopMonitorData(ShowDesktopMonitorDataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopMonitorData);
    }

    /**
     * 查询桌面监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopMonitorDataRequest 请求对象
     * @return SyncInvoker<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse>
     */
    public SyncInvoker<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse> showDesktopMonitorDataInvoker(
        ShowDesktopMonitorDataRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopMonitorData, hcClient);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworkRequest 请求对象
     * @return ShowDesktopNetworkResponse
     */
    public ShowDesktopNetworkResponse showDesktopNetwork(ShowDesktopNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopNetwork);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworkRequest 请求对象
     * @return SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>
     */
    public SyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetworkInvoker(
        ShowDesktopNetworkRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopNetwork, hcClient);
    }

    /**
     * 批量查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworksRequest 请求对象
     * @return ShowDesktopNetworksResponse
     */
    public ShowDesktopNetworksResponse showDesktopNetworks(ShowDesktopNetworksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopNetworks);
    }

    /**
     * 批量查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworksRequest 请求对象
     * @return SyncInvoker<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse>
     */
    public SyncInvoker<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse> showDesktopNetworksInvoker(
        ShowDesktopNetworksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopNetworks, hcClient);
    }

    /**
     * 根据桌面id查询远程协助信息
     *
     * 根据桌面id查询远程协助信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopRemoteAssistanceInfoRequest 请求对象
     * @return ShowDesktopRemoteAssistanceInfoResponse
     */
    public ShowDesktopRemoteAssistanceInfoResponse showDesktopRemoteAssistanceInfo(
        ShowDesktopRemoteAssistanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopRemoteAssistanceInfo);
    }

    /**
     * 根据桌面id查询远程协助信息
     *
     * 根据桌面id查询远程协助信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopRemoteAssistanceInfoRequest 请求对象
     * @return SyncInvoker<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse>
     */
    public SyncInvoker<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse> showDesktopRemoteAssistanceInfoInvoker(
        ShowDesktopRemoteAssistanceInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopRemoteAssistanceInfo, hcClient);
    }

    /**
     * 远程登录控制台
     *
     * 用于直接获取远程登录控制台地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleAddressRequest 请求对象
     * @return ShowRemoteConsoleAddressResponse
     */
    public ShowRemoteConsoleAddressResponse showRemoteConsoleAddress(ShowRemoteConsoleAddressRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showRemoteConsoleAddress);
    }

    /**
     * 远程登录控制台
     *
     * 用于直接获取远程登录控制台地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleAddressRequest 请求对象
     * @return SyncInvoker<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse>
     */
    public SyncInvoker<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse> showRemoteConsoleAddressInvoker(
        ShowRemoteConsoleAddressRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showRemoteConsoleAddress, hcClient);
    }

    /**
     * 查询sysprep版本信息
     *
     * 查询sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSysprepInfoRequest 请求对象
     * @return ShowSysprepInfoResponse
     */
    public ShowSysprepInfoResponse showSysprepInfo(ShowSysprepInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showSysprepInfo);
    }

    /**
     * 查询sysprep版本信息
     *
     * 查询sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSysprepInfoRequest 请求对象
     * @return SyncInvoker<ShowSysprepInfoRequest, ShowSysprepInfoResponse>
     */
    public SyncInvoker<ShowSysprepInfoRequest, ShowSysprepInfoResponse> showSysprepInfoInvoker(
        ShowSysprepInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showSysprepInfo, hcClient);
    }

    /**
     * 修改桌面属性
     *
     * 修改桌面属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopRequest 请求对象
     * @return UpdateDesktopResponse
     */
    public UpdateDesktopResponse updateDesktop(UpdateDesktopRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktop);
    }

    /**
     * 修改桌面属性
     *
     * 修改桌面属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopRequest 请求对象
     * @return SyncInvoker<UpdateDesktopRequest, UpdateDesktopResponse>
     */
    public SyncInvoker<UpdateDesktopRequest, UpdateDesktopResponse> updateDesktopInvoker(UpdateDesktopRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktop, hcClient);
    }

    /**
     * 更新桌面SID
     *
     * 该接口用于桌面sid和WindowsAD中的SID不同时，更新桌面SID使其与AD中的SID保持一致，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopSidsRequest 请求对象
     * @return UpdateDesktopSidsResponse
     */
    public UpdateDesktopSidsResponse updateDesktopSids(UpdateDesktopSidsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktopSids);
    }

    /**
     * 更新桌面SID
     *
     * 该接口用于桌面sid和WindowsAD中的SID不同时，更新桌面SID使其与AD中的SID保持一致，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopSidsRequest 请求对象
     * @return SyncInvoker<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse>
     */
    public SyncInvoker<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse> updateDesktopSidsInvoker(
        UpdateDesktopSidsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktopSids, hcClient);
    }

    /**
     * AD场景支持桌面更换关联用户名
     *
     * AD场景支持桌面更换关联用户名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopUsernameRequest 请求对象
     * @return UpdateDesktopUsernameResponse
     */
    public UpdateDesktopUsernameResponse updateDesktopUsername(UpdateDesktopUsernameRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktopUsername);
    }

    /**
     * AD场景支持桌面更换关联用户名
     *
     * AD场景支持桌面更换关联用户名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopUsernameRequest 请求对象
     * @return SyncInvoker<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse>
     */
    public SyncInvoker<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse> updateDesktopUsernameInvoker(
        UpdateDesktopUsernameRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktopUsername, hcClient);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return BatchDeleteDesktopNamePolicyResponse
     */
    public BatchDeleteDesktopNamePolicyResponse batchDeleteDesktopNamePolicy(
        BatchDeleteDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopNamePolicy);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse>
     */
    public SyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicyInvoker(
        BatchDeleteDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopNamePolicy, hcClient);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return CreateDesktopNamePolicyResponse
     */
    public CreateDesktopNamePolicyResponse createDesktopNamePolicy(CreateDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopNamePolicy);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse>
     */
    public SyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> createDesktopNamePolicyInvoker(
        CreateDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopNamePolicy, hcClient);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return ListDesktopNamePolicyResponse
     */
    public ListDesktopNamePolicyResponse listDesktopNamePolicy(ListDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopNamePolicy);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse>
     */
    public SyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> listDesktopNamePolicyInvoker(
        ListDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopNamePolicy, hcClient);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return UpdateDesktopNamePolicyResponse
     */
    public UpdateDesktopNamePolicyResponse updateDesktopNamePolicy(UpdateDesktopNamePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktopNamePolicy);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return SyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse>
     */
    public SyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> updateDesktopNamePolicyInvoker(
        UpdateDesktopNamePolicyRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktopNamePolicy, hcClient);
    }

    /**
     * 桌面池批量添加磁盘
     *
     * 桌面池批量添加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopPoolVolumesRequest 请求对象
     * @return AddDesktopPoolVolumesResponse
     */
    public AddDesktopPoolVolumesResponse addDesktopPoolVolumes(AddDesktopPoolVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addDesktopPoolVolumes);
    }

    /**
     * 桌面池批量添加磁盘
     *
     * 桌面池批量添加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopPoolVolumesRequest 请求对象
     * @return SyncInvoker<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse>
     */
    public SyncInvoker<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse> addDesktopPoolVolumesInvoker(
        AddDesktopPoolVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addDesktopPoolVolumes, hcClient);
    }

    /**
     * 创建桌面池
     *
     * 创建桌面池，可将此桌面池分配给用户、用户组，用户登录时会绑定其中一个桌面。
     * 注:需通过开通委托功能接口先对云服务进行授权才可以使用该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolRequest 请求对象
     * @return CreateDesktopPoolResponse
     */
    public CreateDesktopPoolResponse createDesktopPool(CreateDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopPool);
    }

    /**
     * 创建桌面池
     *
     * 创建桌面池，可将此桌面池分配给用户、用户组，用户登录时会绑定其中一个桌面。
     * 注:需通过开通委托功能接口先对云服务进行授权才可以使用该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolRequest 请求对象
     * @return SyncInvoker<CreateDesktopPoolRequest, CreateDesktopPoolResponse>
     */
    public SyncInvoker<CreateDesktopPoolRequest, CreateDesktopPoolResponse> createDesktopPoolInvoker(
        CreateDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopPool, hcClient);
    }

    /**
     * 桌面池授权用户、用户组
     *
     * 该接口用于桌面池授权用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return CreateDesktopPoolAuthorizedObjectsResponse
     */
    public CreateDesktopPoolAuthorizedObjectsResponse createDesktopPoolAuthorizedObjects(
        CreateDesktopPoolAuthorizedObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopPoolAuthorizedObjects);
    }

    /**
     * 桌面池授权用户、用户组
     *
     * 该接口用于桌面池授权用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return SyncInvoker<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse>
     */
    public SyncInvoker<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse> createDesktopPoolAuthorizedObjectsInvoker(
        CreateDesktopPoolAuthorizedObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopPoolAuthorizedObjects, hcClient);
    }

    /**
     * 删除桌面池
     *
     * 当桌面池内无桌面时可删除桌面池，桌面池删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolRequest 请求对象
     * @return DeleteDesktopPoolResponse
     */
    public DeleteDesktopPoolResponse deleteDesktopPool(DeleteDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopPool);
    }

    /**
     * 删除桌面池
     *
     * 当桌面池内无桌面时可删除桌面池，桌面池删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolRequest 请求对象
     * @return SyncInvoker<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse>
     */
    public SyncInvoker<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse> deleteDesktopPoolInvoker(
        DeleteDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktopPool, hcClient);
    }

    /**
     * 桌面池批量删除磁盘
     *
     * 桌面池批量删除磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolVolumesRequest 请求对象
     * @return DeleteDesktopPoolVolumesResponse
     */
    public DeleteDesktopPoolVolumesResponse deleteDesktopPoolVolumes(DeleteDesktopPoolVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopPoolVolumes);
    }

    /**
     * 桌面池批量删除磁盘
     *
     * 桌面池批量删除磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolVolumesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse>
     */
    public SyncInvoker<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse> deleteDesktopPoolVolumesInvoker(
        DeleteDesktopPoolVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktopPoolVolumes, hcClient);
    }

    /**
     * 操作桌面池
     *
     * 操作桌面池，用于桌面池里面的桌面批量开机、关机、重启和休眠。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolActionRequest 请求对象
     * @return ExecuteDesktopPoolActionResponse
     */
    public ExecuteDesktopPoolActionResponse executeDesktopPoolAction(ExecuteDesktopPoolActionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.executeDesktopPoolAction);
    }

    /**
     * 操作桌面池
     *
     * 操作桌面池，用于桌面池里面的桌面批量开机、关机、重启和休眠。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolActionRequest 请求对象
     * @return SyncInvoker<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse>
     */
    public SyncInvoker<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse> executeDesktopPoolActionInvoker(
        ExecuteDesktopPoolActionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.executeDesktopPoolAction, hcClient);
    }

    /**
     * 桌面池批量执行脚本
     *
     * 桌面池批量执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolScriptRequest 请求对象
     * @return ExecuteDesktopPoolScriptResponse
     */
    public ExecuteDesktopPoolScriptResponse executeDesktopPoolScript(ExecuteDesktopPoolScriptRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.executeDesktopPoolScript);
    }

    /**
     * 桌面池批量执行脚本
     *
     * 桌面池批量执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolScriptRequest 请求对象
     * @return SyncInvoker<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse>
     */
    public SyncInvoker<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse> executeDesktopPoolScriptInvoker(
        ExecuteDesktopPoolScriptRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.executeDesktopPoolScript, hcClient);
    }

    /**
     * 扩容桌面池
     *
     * 扩容桌面池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolRequest 请求对象
     * @return ExpandDesktopPoolResponse
     */
    public ExpandDesktopPoolResponse expandDesktopPool(ExpandDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandDesktopPool);
    }

    /**
     * 扩容桌面池
     *
     * 扩容桌面池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolRequest 请求对象
     * @return SyncInvoker<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse>
     */
    public SyncInvoker<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse> expandDesktopPoolInvoker(
        ExpandDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.expandDesktopPool, hcClient);
    }

    /**
     * 桌面池批量扩容磁盘
     *
     * 桌面池批量扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolVolumesRequest 请求对象
     * @return ExpandDesktopPoolVolumesResponse
     */
    public ExpandDesktopPoolVolumesResponse expandDesktopPoolVolumes(ExpandDesktopPoolVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandDesktopPoolVolumes);
    }

    /**
     * 桌面池批量扩容磁盘
     *
     * 桌面池批量扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolVolumesRequest 请求对象
     * @return SyncInvoker<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse>
     */
    public SyncInvoker<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse> expandDesktopPoolVolumesInvoker(
        ExpandDesktopPoolVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.expandDesktopPoolVolumes, hcClient);
    }

    /**
     * 查询桌面池授权的用户、用户组
     *
     * 该接口用于查询指定桌面池授权的用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return ListDesktopPoolAuthorizedObjectsResponse
     */
    public ListDesktopPoolAuthorizedObjectsResponse listDesktopPoolAuthorizedObjects(
        ListDesktopPoolAuthorizedObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopPoolAuthorizedObjects);
    }

    /**
     * 查询桌面池授权的用户、用户组
     *
     * 该接口用于查询指定桌面池授权的用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return SyncInvoker<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse>
     */
    public SyncInvoker<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse> listDesktopPoolAuthorizedObjectsInvoker(
        ListDesktopPoolAuthorizedObjectsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopPoolAuthorizedObjects, hcClient);
    }

    /**
     * 查询桌面池列表
     *
     * 该接口用于查询桌面池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsRequest 请求对象
     * @return ListDesktopPoolsResponse
     */
    public ListDesktopPoolsResponse listDesktopPools(ListDesktopPoolsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopPools);
    }

    /**
     * 查询桌面池列表
     *
     * 该接口用于查询桌面池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsRequest 请求对象
     * @return SyncInvoker<ListDesktopPoolsRequest, ListDesktopPoolsResponse>
     */
    public SyncInvoker<ListDesktopPoolsRequest, ListDesktopPoolsResponse> listDesktopPoolsInvoker(
        ListDesktopPoolsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopPools, hcClient);
    }

    /**
     * 查询用户所关联的桌面池列表
     *
     * 该接口用于查询用户所关联的桌面池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsByUsersRequest 请求对象
     * @return ListDesktopPoolsByUsersResponse
     */
    public ListDesktopPoolsByUsersResponse listDesktopPoolsByUsers(ListDesktopPoolsByUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopPoolsByUsers);
    }

    /**
     * 查询用户所关联的桌面池列表
     *
     * 该接口用于查询用户所关联的桌面池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsByUsersRequest 请求对象
     * @return SyncInvoker<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse>
     */
    public SyncInvoker<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse> listDesktopPoolsByUsersInvoker(
        ListDesktopPoolsByUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopPoolsByUsers, hcClient);
    }

    /**
     * 查询桌面池中差异统计
     *
     * 该接口用于查询桌面池中差异统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInconsistentStaticsRequest 请求对象
     * @return ListInconsistentStaticsResponse
     */
    public ListInconsistentStaticsResponse listInconsistentStatics(ListInconsistentStaticsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listInconsistentStatics);
    }

    /**
     * 查询桌面池中差异统计
     *
     * 该接口用于查询桌面池中差异统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInconsistentStaticsRequest 请求对象
     * @return SyncInvoker<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse>
     */
    public SyncInvoker<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse> listInconsistentStaticsInvoker(
        ListInconsistentStaticsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listInconsistentStatics, hcClient);
    }

    /**
     * 查询桌面池下的桌面信息
     *
     * 该接口用于查询桌面池下的桌面信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolDesktopsDetailRequest 请求对象
     * @return ListPoolDesktopsDetailResponse
     */
    public ListPoolDesktopsDetailResponse listPoolDesktopsDetail(ListPoolDesktopsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPoolDesktopsDetail);
    }

    /**
     * 查询桌面池下的桌面信息
     *
     * 该接口用于查询桌面池下的桌面信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolDesktopsDetailRequest 请求对象
     * @return SyncInvoker<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse>
     */
    public SyncInvoker<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse> listPoolDesktopsDetailInvoker(
        ListPoolDesktopsDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPoolDesktopsDetail, hcClient);
    }

    /**
     * 桌面池重建系统盘
     *
     * 桌面池重建系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildDesktopPoolRequest 请求对象
     * @return RebuildDesktopPoolResponse
     */
    public RebuildDesktopPoolResponse rebuildDesktopPool(RebuildDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.rebuildDesktopPool);
    }

    /**
     * 桌面池重建系统盘
     *
     * 桌面池重建系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildDesktopPoolRequest 请求对象
     * @return SyncInvoker<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse>
     */
    public SyncInvoker<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse> rebuildDesktopPoolInvoker(
        RebuildDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.rebuildDesktopPool, hcClient);
    }

    /**
     * 桌面池变更规格
     *
     * 桌面池变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopPoolRequest 请求对象
     * @return ResizeDesktopPoolResponse
     */
    public ResizeDesktopPoolResponse resizeDesktopPool(ResizeDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resizeDesktopPool);
    }

    /**
     * 桌面池变更规格
     *
     * 桌面池变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopPoolRequest 请求对象
     * @return SyncInvoker<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse>
     */
    public SyncInvoker<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse> resizeDesktopPoolInvoker(
        ResizeDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.resizeDesktopPool, hcClient);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDesktopPoolNotificationsRequest 请求对象
     * @return SendDesktopPoolNotificationsResponse
     */
    public SendDesktopPoolNotificationsResponse sendDesktopPoolNotifications(
        SendDesktopPoolNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.sendDesktopPoolNotifications);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDesktopPoolNotificationsRequest 请求对象
     * @return SyncInvoker<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse>
     */
    public SyncInvoker<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse> sendDesktopPoolNotificationsInvoker(
        SendDesktopPoolNotificationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.sendDesktopPoolNotifications, hcClient);
    }

    /**
     * 查询桌面池详情
     *
     * 指定桌面池Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolDetailRequest 请求对象
     * @return ShowDesktopPoolDetailResponse
     */
    public ShowDesktopPoolDetailResponse showDesktopPoolDetail(ShowDesktopPoolDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopPoolDetail);
    }

    /**
     * 查询桌面池详情
     *
     * 指定桌面池Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolDetailRequest 请求对象
     * @return SyncInvoker<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse>
     */
    public SyncInvoker<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse> showDesktopPoolDetailInvoker(
        ShowDesktopPoolDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopPoolDetail, hcClient);
    }

    /**
     * 查询桌面池的脚本执行任务列表
     *
     * 桌面池的脚本执行任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolsScriptExecTasksRequest 请求对象
     * @return ShowDesktopPoolsScriptExecTasksResponse
     */
    public ShowDesktopPoolsScriptExecTasksResponse showDesktopPoolsScriptExecTasks(
        ShowDesktopPoolsScriptExecTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showDesktopPoolsScriptExecTasks);
    }

    /**
     * 查询桌面池的脚本执行任务列表
     *
     * 桌面池的脚本执行任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolsScriptExecTasksRequest 请求对象
     * @return SyncInvoker<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse>
     */
    public SyncInvoker<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse> showDesktopPoolsScriptExecTasksInvoker(
        ShowDesktopPoolsScriptExecTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showDesktopPoolsScriptExecTasks, hcClient);
    }

    /**
     * 修改桌面池属性
     *
     * 修改桌面池属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopPoolRequest 请求对象
     * @return UpdateDesktopPoolResponse
     */
    public UpdateDesktopPoolResponse updateDesktopPool(UpdateDesktopPoolRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateDesktopPool);
    }

    /**
     * 修改桌面池属性
     *
     * 修改桌面池属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopPoolRequest 请求对象
     * @return SyncInvoker<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse>
     */
    public SyncInvoker<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse> updateDesktopPoolInvoker(
        UpdateDesktopPoolRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateDesktopPool, hcClient);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return BatchAddDesktopsTagsResponse
     */
    public BatchAddDesktopsTagsResponse batchAddDesktopsTags(BatchAddDesktopsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchAddDesktopsTags);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return SyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse>
     */
    public SyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTagsInvoker(
        BatchAddDesktopsTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchAddDesktopsTags, hcClient);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeTagsRequest 请求对象
     * @return BatchChangeTagsResponse
     */
    public BatchChangeTagsResponse batchChangeTags(BatchChangeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchChangeTags);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeTagsRequest 请求对象
     * @return SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>
     */
    public SyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTagsInvoker(
        BatchChangeTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchChangeTags, hcClient);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return BatchDeleteDesktopsTagsResponse
     */
    public BatchDeleteDesktopsTagsResponse batchDeleteDesktopsTags(BatchDeleteDesktopsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopsTags);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse>
     */
    public SyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTagsInvoker(
        BatchDeleteDesktopsTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopsTags, hcClient);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createTag);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createTag, hcClient);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteTag);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签过滤桌面（已废弃）
     *
     * 使用标签过滤桌面。该接口已废弃，请使用post /v2/{project_id}/desktops/resource-instances/action
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopByTagsRequest 请求对象
     * @return ListDesktopByTagsResponse
     */
    public ListDesktopByTagsResponse listDesktopByTags(ListDesktopByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopByTags);
    }

    /**
     * 使用标签过滤桌面（已废弃）
     *
     * 使用标签过滤桌面。该接口已废弃，请使用post /v2/{project_id}/desktops/resource-instances/action
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopByTagsRequest 请求对象
     * @return SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>
     */
    public SyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTagsInvoker(
        ListDesktopByTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopByTags, hcClient);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsByTagsRequest 请求对象
     * @return ListDesktopsByTagsResponse
     */
    public ListDesktopsByTagsResponse listDesktopsByTags(ListDesktopsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsByTags);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsByTagsRequest 请求对象
     * @return SyncInvoker<ListDesktopsByTagsRequest, ListDesktopsByTagsResponse>
     */
    public SyncInvoker<ListDesktopsByTagsRequest, ListDesktopsByTagsResponse> listDesktopsByTagsInvoker(
        ListDesktopsByTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listProjectTags, hcClient);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagByDesktopIdRequest 请求对象
     * @return ShowTagByDesktopIdResponse
     */
    public ShowTagByDesktopIdResponse showTagByDesktopId(ShowTagByDesktopIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showTagByDesktopId);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagByDesktopIdRequest 请求对象
     * @return SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>
     */
    public SyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopIdInvoker(
        ShowTagByDesktopIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showTagByDesktopId, hcClient);
    }

    /**
     * 导出桌面列表
     *
     * 导出桌面列表的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopListNewRequest 请求对象
     * @return ExportDesktopListNewResponse
     */
    public ExportDesktopListNewResponse exportDesktopListNew(ExportDesktopListNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportDesktopListNew);
    }

    /**
     * 导出桌面列表
     *
     * 导出桌面列表的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopListNewRequest 请求对象
     * @return SyncInvoker<ExportDesktopListNewRequest, ExportDesktopListNewResponse>
     */
    public SyncInvoker<ExportDesktopListNewRequest, ExportDesktopListNewResponse> exportDesktopListNewInvoker(
        ExportDesktopListNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportDesktopListNew, hcClient);
    }

    /**
     * 查询休眠类型
     *
     * 查询休眠类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHibernateTypeRequest 请求对象
     * @return ShowHibernateTypeResponse
     */
    public ShowHibernateTypeResponse showHibernateType(ShowHibernateTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showHibernateType);
    }

    /**
     * 查询休眠类型
     *
     * 查询休眠类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHibernateTypeRequest 请求对象
     * @return SyncInvoker<ShowHibernateTypeRequest, ShowHibernateTypeResponse>
     */
    public SyncInvoker<ShowHibernateTypeRequest, ShowHibernateTypeResponse> showHibernateTypeInvoker(
        ShowHibernateTypeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showHibernateType, hcClient);
    }

    /**
     * 批量删除导出任务记录
     *
     * 批量删除导出任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTasksRequest 请求对象
     * @return DeleteExportTasksResponse
     */
    public DeleteExportTasksResponse deleteExportTasks(DeleteExportTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteExportTasks);
    }

    /**
     * 批量删除导出任务记录
     *
     * 批量删除导出任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTasksRequest 请求对象
     * @return SyncInvoker<DeleteExportTasksRequest, DeleteExportTasksResponse>
     */
    public SyncInvoker<DeleteExportTasksRequest, DeleteExportTasksResponse> deleteExportTasksInvoker(
        DeleteExportTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteExportTasks, hcClient);
    }

    /**
     * 下载导出的文件
     *
     * 下载导出的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportFileRequest 请求对象
     * @return DownloadExportFileResponse
     */
    public DownloadExportFileResponse downloadExportFile(DownloadExportFileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.downloadExportFile);
    }

    /**
     * 下载导出的文件
     *
     * 下载导出的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportFileRequest 请求对象
     * @return SyncInvoker<DownloadExportFileRequest, DownloadExportFileResponse>
     */
    public SyncInvoker<DownloadExportFileRequest, DownloadExportFileResponse> downloadExportFileInvoker(
        DownloadExportFileRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.downloadExportFile, hcClient);
    }

    /**
     * 查询导出任务列表
     *
     * 查询导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return ListExportTasksResponse
     */
    public ListExportTasksResponse listExportTasks(ListExportTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listExportTasks);
    }

    /**
     * 查询导出任务列表
     *
     * 查询导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return SyncInvoker<ListExportTasksRequest, ListExportTasksResponse>
     */
    public SyncInvoker<ListExportTasksRequest, ListExportTasksResponse> listExportTasksInvoker(
        ListExportTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listExportTasks, hcClient);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserGroupsRequest 请求对象
     * @return BatchDeleteUserGroupsResponse
     */
    public BatchDeleteUserGroupsResponse batchDeleteUserGroups(BatchDeleteUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteUserGroups);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserGroupsRequest 请求对象
     * @return SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>
     */
    public SyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroupsInvoker(
        BatchDeleteUserGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteUserGroups, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserGroupRequest 请求对象
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createUserGroup);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserGroupRequest 请求对象
     * @return SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>
     */
    public SyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroupInvoker(
        CreateUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createUserGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserGroupRequest 请求对象
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteUserGroup);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserGroupRequest 请求对象
     * @return SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>
     */
    public SyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroupInvoker(
        DeleteUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteUserGroup, hcClient);
    }

    /**
     * 导出用户组
     *
     * 以excel文件形式导出用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupsRequest 请求对象
     * @return ExportUserGroupsResponse
     */
    public ExportUserGroupsResponse exportUserGroups(ExportUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserGroups);
    }

    /**
     * 导出用户组
     *
     * 以excel文件形式导出用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupsRequest 请求对象
     * @return SyncInvoker<ExportUserGroupsRequest, ExportUserGroupsResponse>
     */
    public SyncInvoker<ExportUserGroupsRequest, ExportUserGroupsResponse> exportUserGroupsInvoker(
        ExportUserGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserGroups, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGroupsRequest 请求对象
     * @return ListUserGroupsResponse
     */
    public ListUserGroupsResponse listUserGroups(ListUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserGroups);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGroupsRequest 请求对象
     * @return SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>
     */
    public SyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroupsInvoker(
        ListUserGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserGroups, hcClient);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfGroupRequest 请求对象
     * @return ListUsersOfGroupResponse
     */
    public ListUsersOfGroupResponse listUsersOfGroup(ListUsersOfGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsersOfGroup);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfGroupRequest 请求对象
     * @return SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>
     */
    public SyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroupInvoker(
        ListUsersOfGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsersOfGroup, hcClient);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnGroupRequest 请求对象
     * @return RunActionsOnGroupResponse
     */
    public RunActionsOnGroupResponse runActionsOnGroup(RunActionsOnGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.runActionsOnGroup);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnGroupRequest 请求对象
     * @return SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>
     */
    public SyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroupInvoker(
        RunActionsOnGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.runActionsOnGroup, hcClient);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserGroupRequest 请求对象
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUserGroup);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserGroupRequest 请求对象
     * @return SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>
     */
    public SyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroupInvoker(
        UpdateUserGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateUserGroup, hcClient);
    }

    /**
     * 导出用户组的用户
     *
     * 以excel文件形式导出用户组用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupUsersNewRequest 请求对象
     * @return ExportUserGroupUsersNewResponse
     */
    public ExportUserGroupUsersNewResponse exportUserGroupUsersNew(ExportUserGroupUsersNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserGroupUsersNew);
    }

    /**
     * 导出用户组的用户
     *
     * 以excel文件形式导出用户组用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupUsersNewRequest 请求对象
     * @return SyncInvoker<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse>
     */
    public SyncInvoker<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse> exportUserGroupUsersNewInvoker(
        ExportUserGroupUsersNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserGroupUsersNew, hcClient);
    }

    /**
     * 查询云办公主机列表
     *
     * 展示云办公主机列表的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsDetailRequest 请求对象
     * @return ListHostsDetailResponse
     */
    public ListHostsDetailResponse listHostsDetail(ListHostsDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listHostsDetail);
    }

    /**
     * 查询云办公主机列表
     *
     * 展示云办公主机列表的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsDetailRequest 请求对象
     * @return SyncInvoker<ListHostsDetailRequest, ListHostsDetailResponse>
     */
    public SyncInvoker<ListHostsDetailRequest, ListHostsDetailResponse> listHostsDetailInvoker(
        ListHostsDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listHostsDetail, hcClient);
    }

    /**
     * 查询云办公主机包含桌面信息
     *
     * 查询云办公主机包含桌面信息，提供给console使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByHostIdRequest 请求对象
     * @return ListServersByHostIdResponse
     */
    public ListServersByHostIdResponse listServersByHostId(ListServersByHostIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listServersByHostId);
    }

    /**
     * 查询云办公主机包含桌面信息
     *
     * 查询云办公主机包含桌面信息，提供给console使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByHostIdRequest 请求对象
     * @return SyncInvoker<ListServersByHostIdRequest, ListServersByHostIdResponse>
     */
    public SyncInvoker<ListServersByHostIdRequest, ListServersByHostIdResponse> listServersByHostIdInvoker(
        ListServersByHostIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listServersByHostId, hcClient);
    }

    /**
     * 更新云办公主机信息
     *
     * 通过云办公主机的id更新云办公主机的信息，提供给console、赞齐使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostsRequest 请求对象
     * @return UpdateHostsResponse
     */
    public UpdateHostsResponse updateHosts(UpdateHostsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateHosts);
    }

    /**
     * 更新云办公主机信息
     *
     * 通过云办公主机的id更新云办公主机的信息，提供给console、赞齐使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostsRequest 请求对象
     * @return SyncInvoker<UpdateHostsRequest, UpdateHostsResponse>
     */
    public SyncInvoker<UpdateHostsRequest, UpdateHostsResponse> updateHostsInvoker(UpdateHostsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateHosts, hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 获取云市场镜像列表
     *
     * 获取云市场镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMarketImagesRequest 请求对象
     * @return ListMarketImagesResponse
     */
    public ListMarketImagesResponse listMarketImages(ListMarketImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMarketImages);
    }

    /**
     * 获取云市场镜像列表
     *
     * 获取云市场镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMarketImagesRequest 请求对象
     * @return SyncInvoker<ListMarketImagesRequest, ListMarketImagesResponse>
     */
    public SyncInvoker<ListMarketImagesRequest, ListMarketImagesResponse> listMarketImagesInvoker(
        ListMarketImagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMarketImages, hcClient);
    }

    /**
     * 包周期桌面增配变更批量询价
     *
     * 包周期桌面增配变更批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateAddResourcesRequest 请求对象
     * @return EstimateAddResourcesResponse
     */
    public EstimateAddResourcesResponse estimateAddResources(EstimateAddResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateAddResources);
    }

    /**
     * 包周期桌面增配变更批量询价
     *
     * 包周期桌面增配变更批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateAddResourcesRequest 请求对象
     * @return SyncInvoker<EstimateAddResourcesRequest, EstimateAddResourcesResponse>
     */
    public SyncInvoker<EstimateAddResourcesRequest, EstimateAddResourcesResponse> estimateAddResourcesInvoker(
        EstimateAddResourcesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateAddResources, hcClient);
    }

    /**
     * 批量包周期桌面切换镜像询价
     *
     * 批量包周期桌面切换镜像(由不收费镜像变更至收费镜像)询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateChangeImagesRequest 请求对象
     * @return EstimateChangeImagesResponse
     */
    public EstimateChangeImagesResponse estimateChangeImages(EstimateChangeImagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateChangeImages);
    }

    /**
     * 批量包周期桌面切换镜像询价
     *
     * 批量包周期桌面切换镜像(由不收费镜像变更至收费镜像)询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateChangeImagesRequest 请求对象
     * @return SyncInvoker<EstimateChangeImagesRequest, EstimateChangeImagesResponse>
     */
    public SyncInvoker<EstimateChangeImagesRequest, EstimateChangeImagesResponse> estimateChangeImagesInvoker(
        EstimateChangeImagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateChangeImages, hcClient);
    }

    /**
     * 包周期桌面池添加单个磁盘批量询价
     *
     * 包周期桌面池添加单个磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolAddVolumeRequest 请求对象
     * @return EstimateDesktopPoolAddVolumeResponse
     */
    public EstimateDesktopPoolAddVolumeResponse estimateDesktopPoolAddVolume(
        EstimateDesktopPoolAddVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolAddVolume);
    }

    /**
     * 包周期桌面池添加单个磁盘批量询价
     *
     * 包周期桌面池添加单个磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolAddVolumeRequest 请求对象
     * @return SyncInvoker<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse>
     */
    public SyncInvoker<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse> estimateDesktopPoolAddVolumeInvoker(
        EstimateDesktopPoolAddVolumeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolAddVolume, hcClient);
    }

    /**
     * 包周期桌面池切换镜像批量询价
     *
     * 包周期桌面池切换镜像(由不收费镜像变更至收费镜像)批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolChangeImageRequest 请求对象
     * @return EstimateDesktopPoolChangeImageResponse
     */
    public EstimateDesktopPoolChangeImageResponse estimateDesktopPoolChangeImage(
        EstimateDesktopPoolChangeImageRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolChangeImage);
    }

    /**
     * 包周期桌面池切换镜像批量询价
     *
     * 包周期桌面池切换镜像(由不收费镜像变更至收费镜像)批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolChangeImageRequest 请求对象
     * @return SyncInvoker<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse>
     */
    public SyncInvoker<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse> estimateDesktopPoolChangeImageInvoker(
        EstimateDesktopPoolChangeImageRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolChangeImage, hcClient);
    }

    /**
     * 包周期桌面池扩容磁盘批量询价
     *
     * 包周期桌面池扩容磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolExtendVolumeRequest 请求对象
     * @return EstimateDesktopPoolExtendVolumeResponse
     */
    public EstimateDesktopPoolExtendVolumeResponse estimateDesktopPoolExtendVolume(
        EstimateDesktopPoolExtendVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolExtendVolume);
    }

    /**
     * 包周期桌面池扩容磁盘批量询价
     *
     * 包周期桌面池扩容磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolExtendVolumeRequest 请求对象
     * @return SyncInvoker<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse>
     */
    public SyncInvoker<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse> estimateDesktopPoolExtendVolumeInvoker(
        EstimateDesktopPoolExtendVolumeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolExtendVolume, hcClient);
    }

    /**
     * 包周期桌面池变更规格批量询价
     *
     * 包周期桌面池变更规格批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolResizeRequest 请求对象
     * @return EstimateDesktopPoolResizeResponse
     */
    public EstimateDesktopPoolResizeResponse estimateDesktopPoolResize(EstimateDesktopPoolResizeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolResize);
    }

    /**
     * 包周期桌面池变更规格批量询价
     *
     * 包周期桌面池变更规格批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolResizeRequest 请求对象
     * @return SyncInvoker<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse>
     */
    public SyncInvoker<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse> estimateDesktopPoolResizeInvoker(
        EstimateDesktopPoolResizeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolResize, hcClient);
    }

    /**
     * 重试任务
     *
     * 该接口用来对失败的任务进行重试，当前仅支持开户和销户的任务重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnWorkspaceJobRequest 请求对象
     * @return RunActionsOnWorkspaceJobResponse
     */
    public RunActionsOnWorkspaceJobResponse runActionsOnWorkspaceJob(RunActionsOnWorkspaceJobRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.runActionsOnWorkspaceJob);
    }

    /**
     * 重试任务
     *
     * 该接口用来对失败的任务进行重试，当前仅支持开户和销户的任务重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnWorkspaceJobRequest 请求对象
     * @return SyncInvoker<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse>
     */
    public SyncInvoker<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse> runActionsOnWorkspaceJobInvoker(
        RunActionsOnWorkspaceJobRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.runActionsOnWorkspaceJob, hcClient);
    }

    /**
     * 删除子任务
     *
     * 该接口用于删除子任务，changeAccessVpc，cancelWorkspace，applyWorkspace类型任务不支持删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubJobsRequest 请求对象
     * @return BatchDeleteSubJobsResponse
     */
    public BatchDeleteSubJobsResponse batchDeleteSubJobs(BatchDeleteSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteSubJobs);
    }

    /**
     * 删除子任务
     *
     * 该接口用于删除子任务，changeAccessVpc，cancelWorkspace，applyWorkspace类型任务不支持删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubJobsRequest 请求对象
     * @return SyncInvoker<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse>
     */
    public SyncInvoker<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse> batchDeleteSubJobsInvoker(
        BatchDeleteSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteSubJobs, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItaSubJobsRequest 请求对象
     * @return ListItaSubJobsResponse
     */
    public ListItaSubJobsResponse listItaSubJobs(ListItaSubJobsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItaSubJobsRequest 请求对象
     * @return SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public SyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsInvoker(
        ListItaSubJobsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listItaSubJobs, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建桌面任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showJob);
    }

    /**
     * 查询任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建桌面任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showJob, hcClient);
    }

    /**
     * 查询租户的NAT映射配置项
     *
     * 查询租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatMappingConfigsRequest 请求对象
     * @return ListNatMappingConfigsResponse
     */
    public ListNatMappingConfigsResponse listNatMappingConfigs(ListNatMappingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listNatMappingConfigs);
    }

    /**
     * 查询租户的NAT映射配置项
     *
     * 查询租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatMappingConfigsRequest 请求对象
     * @return SyncInvoker<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse>
     */
    public SyncInvoker<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse> listNatMappingConfigsInvoker(
        ListNatMappingConfigsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listNatMappingConfigs, hcClient);
    }

    /**
     * 修改租户的NAT映射配置项
     *
     * 修改租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNatMappingConfigsRequest 请求对象
     * @return UpdateNatMappingConfigsResponse
     */
    public UpdateNatMappingConfigsResponse updateNatMappingConfigs(UpdateNatMappingConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateNatMappingConfigs);
    }

    /**
     * 修改租户的NAT映射配置项
     *
     * 修改租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNatMappingConfigsRequest 请求对象
     * @return SyncInvoker<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse>
     */
    public SyncInvoker<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse> updateNatMappingConfigsInvoker(
        UpdateNatMappingConfigsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateNatMappingConfigs, hcClient);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDesktopsInternetRequest 请求对象
     * @return ApplyDesktopsInternetResponse
     */
    public ApplyDesktopsInternetResponse applyDesktopsInternet(ApplyDesktopsInternetRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyDesktopsInternet);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDesktopsInternetRequest 请求对象
     * @return SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>
     */
    public SyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternetInvoker(
        ApplyDesktopsInternetRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applyDesktopsInternet, hcClient);
    }

    /**
     * 开通上网功能
     *
     * 开通上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyInternetRequest 请求对象
     * @return ApplyInternetResponse
     */
    public ApplyInternetResponse applyInternet(ApplyInternetRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyInternet);
    }

    /**
     * 开通上网功能
     *
     * 开通上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyInternetRequest 请求对象
     * @return SyncInvoker<ApplyInternetRequest, ApplyInternetResponse>
     */
    public SyncInvoker<ApplyInternetRequest, ApplyInternetResponse> applyInternetInvoker(ApplyInternetRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applyInternet, hcClient);
    }

    /**
     * 创建云办公带宽
     *
     * 创建按需云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySubnetBandwidthRequest 请求对象
     * @return ApplySubnetBandwidthResponse
     */
    public ApplySubnetBandwidthResponse applySubnetBandwidth(ApplySubnetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applySubnetBandwidth);
    }

    /**
     * 创建云办公带宽
     *
     * 创建按需云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySubnetBandwidthRequest 请求对象
     * @return SyncInvoker<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse>
     */
    public SyncInvoker<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse> applySubnetBandwidthInvoker(
        ApplySubnetBandwidthRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applySubnetBandwidth, hcClient);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDesktopsEipRequest 请求对象
     * @return AssociateDesktopsEipResponse
     */
    public AssociateDesktopsEipResponse associateDesktopsEip(AssociateDesktopsEipRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.associateDesktopsEip);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>
     */
    public SyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEipInvoker(
        AssociateDesktopsEipRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.associateDesktopsEip, hcClient);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
     * @return BatchDisassociateDesktopsEipResponse
     */
    public BatchDisassociateDesktopsEipResponse batchDisassociateDesktopsEip(
        BatchDisassociateDesktopsEipRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDisassociateDesktopsEip);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
     * @return SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>
     */
    public SyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipInvoker(
        BatchDisassociateDesktopsEipRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDisassociateDesktopsEip, hcClient);
    }

    /**
     * 校验租户冲突网段
     *
     * 该接口用于校验租户网段是否冲突,返回冲突网段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCidrRequest 请求对象
     * @return CheckCidrResponse
     */
    public CheckCidrResponse checkCidr(CheckCidrRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.checkCidr);
    }

    /**
     * 校验租户冲突网段
     *
     * 该接口用于校验租户网段是否冲突,返回冲突网段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCidrRequest 请求对象
     * @return SyncInvoker<CheckCidrRequest, CheckCidrResponse>
     */
    public SyncInvoker<CheckCidrRequest, CheckCidrResponse> checkCidrInvoker(CheckCidrRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.checkCidr, hcClient);
    }

    /**
     * 删除云办公带宽
     *
     * 删除云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetBandwidthRequest 请求对象
     * @return DeleteSubnetBandwidthResponse
     */
    public DeleteSubnetBandwidthResponse deleteSubnetBandwidth(DeleteSubnetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteSubnetBandwidth);
    }

    /**
     * 删除云办公带宽
     *
     * 删除云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetBandwidthRequest 请求对象
     * @return SyncInvoker<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse>
     */
    public SyncInvoker<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse> deleteSubnetBandwidthInvoker(
        DeleteSubnetBandwidthRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteSubnetBandwidth, hcClient);
    }

    /**
     * 查询已绑定桌面和未绑定的EIP
     *
     * 查询已绑定桌面和未绑定的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsEipsRequest 请求对象
     * @return ListDesktopsEipsResponse
     */
    public ListDesktopsEipsResponse listDesktopsEips(ListDesktopsEipsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsEips);
    }

    /**
     * 查询已绑定桌面和未绑定的EIP
     *
     * 查询已绑定桌面和未绑定的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsEipsRequest 请求对象
     * @return SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>
     */
    public SyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEipsInvoker(
        ListDesktopsEipsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsEips, hcClient);
    }

    /**
     * 查询上网功能
     *
     * 查询上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetRequest 请求对象
     * @return ListInternetResponse
     */
    public ListInternetResponse listInternet(ListInternetRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listInternet);
    }

    /**
     * 查询上网功能
     *
     * 查询上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetRequest 请求对象
     * @return SyncInvoker<ListInternetRequest, ListInternetResponse>
     */
    public SyncInvoker<ListInternetRequest, ListInternetResponse> listInternetInvoker(ListInternetRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listInternet, hcClient);
    }

    /**
     * 查询NAT网关列表
     *
     * 查询NAT网关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatGatewaysRequest 请求对象
     * @return ListNatGatewaysResponse
     */
    public ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listNatGateways);
    }

    /**
     * 查询NAT网关列表
     *
     * 查询NAT网关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatGatewaysRequest 请求对象
     * @return SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>
     */
    public SyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGatewaysInvoker(
        ListNatGatewaysRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listNatGateways, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPorts, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 该接口查询安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 该接口查询安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询云办公带宽列表
     *
     * 查询云办公带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetBandwidthsRequest 请求对象
     * @return ListSubnetBandwidthsResponse
     */
    public ListSubnetBandwidthsResponse listSubnetBandwidths(ListSubnetBandwidthsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listSubnetBandwidths);
    }

    /**
     * 查询云办公带宽列表
     *
     * 查询云办公带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetBandwidthsRequest 请求对象
     * @return SyncInvoker<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse>
     */
    public SyncInvoker<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse> listSubnetBandwidthsInvoker(
        ListSubnetBandwidthsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listSubnetBandwidths, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listSubnets, hcClient);
    }

    /**
     * 查询vpc
     *
     * 查询vpc。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcInfoRequest 请求对象
     * @return ListVpcInfoResponse
     */
    public ListVpcInfoResponse listVpcInfo(ListVpcInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listVpcInfo);
    }

    /**
     * 查询vpc
     *
     * 查询vpc。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcInfoRequest 请求对象
     * @return SyncInvoker<ListVpcInfoRequest, ListVpcInfoResponse>
     */
    public SyncInvoker<ListVpcInfoRequest, ListVpcInfoResponse> listVpcInfoInvoker(ListVpcInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listVpcInfo, hcClient);
    }

    /**
     * 查询云办公带宽的控制配置
     *
     * 查询云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetBandwidthControlListRequest 请求对象
     * @return ShowSubnetBandwidthControlListResponse
     */
    public ShowSubnetBandwidthControlListResponse showSubnetBandwidthControlList(
        ShowSubnetBandwidthControlListRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showSubnetBandwidthControlList);
    }

    /**
     * 查询云办公带宽的控制配置
     *
     * 查询云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetBandwidthControlListRequest 请求对象
     * @return SyncInvoker<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse>
     */
    public SyncInvoker<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse> showSubnetBandwidthControlListInvoker(
        ShowSubnetBandwidthControlListRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showSubnetBandwidthControlList, hcClient);
    }

    /**
     * 查询正在被使用的子网id列表
     *
     * 根据子网id列表查询正在被桌面使用的子网id，并且返回subnetId列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUsingSubnetsRequest 请求对象
     * @return ShowUsingSubnetsResponse
     */
    public ShowUsingSubnetsResponse showUsingSubnets(ShowUsingSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showUsingSubnets);
    }

    /**
     * 查询正在被使用的子网id列表
     *
     * 根据子网id列表查询正在被桌面使用的子网id，并且返回subnetId列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUsingSubnetsRequest 请求对象
     * @return SyncInvoker<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse>
     */
    public SyncInvoker<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse> showUsingSubnetsInvoker(
        ShowUsingSubnetsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showUsingSubnets, hcClient);
    }

    /**
     * 修改云办公带宽
     *
     * 修改云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthRequest 请求对象
     * @return UpdateSubnetBandwidthResponse
     */
    public UpdateSubnetBandwidthResponse updateSubnetBandwidth(UpdateSubnetBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateSubnetBandwidth);
    }

    /**
     * 修改云办公带宽
     *
     * 修改云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse>
     */
    public SyncInvoker<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse> updateSubnetBandwidthInvoker(
        UpdateSubnetBandwidthRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateSubnetBandwidth, hcClient);
    }

    /**
     * 修改云办公带宽的控制配置
     *
     * 修改云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthControlListRequest 请求对象
     * @return UpdateSubnetBandwidthControlListResponse
     */
    public UpdateSubnetBandwidthControlListResponse updateSubnetBandwidthControlList(
        UpdateSubnetBandwidthControlListRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateSubnetBandwidthControlList);
    }

    /**
     * 修改云办公带宽的控制配置
     *
     * 修改云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthControlListRequest 请求对象
     * @return SyncInvoker<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse>
     */
    public SyncInvoker<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse> updateSubnetBandwidthControlListInvoker(
        UpdateSubnetBandwidthControlListRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateSubnetBandwidthControlList, hcClient);
    }

    /**
     * 创建变更订单
     *
     * 变更规格、扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChangeOrderRequest 请求对象
     * @return CreateChangeOrderResponse
     */
    public CreateChangeOrderResponse createChangeOrder(CreateChangeOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createChangeOrder);
    }

    /**
     * 创建变更订单
     *
     * 变更规格、扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChangeOrderRequest 请求对象
     * @return SyncInvoker<CreateChangeOrderRequest, CreateChangeOrderResponse>
     */
    public SyncInvoker<CreateChangeOrderRequest, CreateChangeOrderResponse> createChangeOrderInvoker(
        CreateChangeOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createChangeOrder, hcClient);
    }

    /**
     * 包周期桌面批量变更下单
     *
     * 包周期桌面批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopBatchOrderRequest 请求对象
     * @return CreateDesktopBatchOrderResponse
     */
    public CreateDesktopBatchOrderResponse createDesktopBatchOrder(CreateDesktopBatchOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopBatchOrder);
    }

    /**
     * 包周期桌面批量变更下单
     *
     * 包周期桌面批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopBatchOrderRequest 请求对象
     * @return SyncInvoker<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse>
     */
    public SyncInvoker<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse> createDesktopBatchOrderInvoker(
        CreateDesktopBatchOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopBatchOrder, hcClient);
    }

    /**
     * 创建桌面订单
     *
     * 创建桌面订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopOrderRequest 请求对象
     * @return CreateDesktopOrderResponse
     */
    public CreateDesktopOrderResponse createDesktopOrder(CreateDesktopOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopOrder);
    }

    /**
     * 创建桌面订单
     *
     * 创建桌面订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopOrderRequest 请求对象
     * @return SyncInvoker<CreateDesktopOrderRequest, CreateDesktopOrderResponse>
     */
    public SyncInvoker<CreateDesktopOrderRequest, CreateDesktopOrderResponse> createDesktopOrderInvoker(
        CreateDesktopOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopOrder, hcClient);
    }

    /**
     * 包周期桌面池批量变更下单
     *
     * 包周期桌面池批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolChangeOrderRequest 请求对象
     * @return CreateDesktopPoolChangeOrderResponse
     */
    public CreateDesktopPoolChangeOrderResponse createDesktopPoolChangeOrder(
        CreateDesktopPoolChangeOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopPoolChangeOrder);
    }

    /**
     * 包周期桌面池批量变更下单
     *
     * 包周期桌面池批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolChangeOrderRequest 请求对象
     * @return SyncInvoker<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse>
     */
    public SyncInvoker<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse> createDesktopPoolChangeOrderInvoker(
        CreateDesktopPoolChangeOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopPoolChangeOrder, hcClient);
    }

    /**
     * 包周期下单
     *
     * 包周期资源（桌面、磁盘）下订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createOrder);
    }

    /**
     * 包周期下单
     *
     * 包周期资源（桌面、磁盘）下订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return SyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public SyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderInvoker(CreateOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createOrder, hcClient);
    }

    /**
     * 创建资源包订单
     *
     * 创建资源包订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcePackagesOrderRequest 请求对象
     * @return CreateResourcePackagesOrderResponse
     */
    public CreateResourcePackagesOrderResponse createResourcePackagesOrder(CreateResourcePackagesOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createResourcePackagesOrder);
    }

    /**
     * 创建资源包订单
     *
     * 创建资源包订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcePackagesOrderRequest 请求对象
     * @return SyncInvoker<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse>
     */
    public SyncInvoker<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse> createResourcePackagesOrderInvoker(
        CreateResourcePackagesOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createResourcePackagesOrder, hcClient);
    }

    /**
     * 包周期云办公带宽变更下单
     *
     * 包周期云办公带宽变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetBandwidthChangeOrderRequest 请求对象
     * @return CreateSubnetBandwidthChangeOrderResponse
     */
    public CreateSubnetBandwidthChangeOrderResponse createSubnetBandwidthChangeOrder(
        CreateSubnetBandwidthChangeOrderRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createSubnetBandwidthChangeOrder);
    }

    /**
     * 包周期云办公带宽变更下单
     *
     * 包周期云办公带宽变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetBandwidthChangeOrderRequest 请求对象
     * @return SyncInvoker<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse>
     */
    public SyncInvoker<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse> createSubnetBandwidthChangeOrderInvoker(
        CreateSubnetBandwidthChangeOrderRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createSubnetBandwidthChangeOrder, hcClient);
    }

    /**
     * 新增OU信息
     *
     * 该接口用于创建OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOuRequest 请求对象
     * @return AddOuResponse
     */
    public AddOuResponse addOu(AddOuRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addOu);
    }

    /**
     * 新增OU信息
     *
     * 该接口用于创建OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOuRequest 请求对象
     * @return SyncInvoker<AddOuRequest, AddOuResponse>
     */
    public SyncInvoker<AddOuRequest, AddOuResponse> addOuInvoker(AddOuRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addOu, hcClient);
    }

    /**
     * 删除OU信息
     *
     * 该接口用于删除OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOuRequest 请求对象
     * @return DeleteOuResponse
     */
    public DeleteOuResponse deleteOu(DeleteOuRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteOu);
    }

    /**
     * 删除OU信息
     *
     * 该接口用于删除OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOuRequest 请求对象
     * @return SyncInvoker<DeleteOuRequest, DeleteOuResponse>
     */
    public SyncInvoker<DeleteOuRequest, DeleteOuResponse> deleteOuInvoker(DeleteOuRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteOu, hcClient);
    }

    /**
     * 查询OU下用户信息
     *
     * 查询OU下用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOuUsersRequest 请求对象
     * @return ListAdOuUsersResponse
     */
    public ListAdOuUsersResponse listAdOuUsers(ListAdOuUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAdOuUsers);
    }

    /**
     * 查询OU下用户信息
     *
     * 查询OU下用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOuUsersRequest 请求对象
     * @return SyncInvoker<ListAdOuUsersRequest, ListAdOuUsersResponse>
     */
    public SyncInvoker<ListAdOuUsersRequest, ListAdOuUsersResponse> listAdOuUsersInvoker(ListAdOuUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAdOuUsers, hcClient);
    }

    /**
     * 查询AD里的OU列表
     *
     * 查询AD里的OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOusRequest 请求对象
     * @return ListAdOusResponse
     */
    public ListAdOusResponse listAdOus(ListAdOusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAdOus);
    }

    /**
     * 查询AD里的OU列表
     *
     * 查询AD里的OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOusRequest 请求对象
     * @return SyncInvoker<ListAdOusRequest, ListAdOusResponse>
     */
    public SyncInvoker<ListAdOusRequest, ListAdOusResponse> listAdOusInvoker(ListAdOusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAdOus, hcClient);
    }

    /**
     * 查询OU列表
     *
     * 查询OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOuDetailsRequest 请求对象
     * @return ListOuDetailsResponse
     */
    public ListOuDetailsResponse listOuDetails(ListOuDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listOuDetails);
    }

    /**
     * 查询OU列表
     *
     * 查询OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOuDetailsRequest 请求对象
     * @return SyncInvoker<ListOuDetailsRequest, ListOuDetailsResponse>
     */
    public SyncInvoker<ListOuDetailsRequest, ListOuDetailsResponse> listOuDetailsInvoker(ListOuDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listOuDetails, hcClient);
    }

    /**
     * 更新OU信息
     *
     * 更新OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOuInfoRequest 请求对象
     * @return UpdateOuInfoResponse
     */
    public UpdateOuInfoResponse updateOuInfo(UpdateOuInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateOuInfo);
    }

    /**
     * 更新OU信息
     *
     * 更新OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOuInfoRequest 请求对象
     * @return SyncInvoker<UpdateOuInfoRequest, UpdateOuInfoResponse>
     */
    public SyncInvoker<UpdateOuInfoRequest, UpdateOuInfoResponse> updateOuInfoInvoker(UpdateOuInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateOuInfo, hcClient);
    }

    /**
     * 修改策略组应用对象
     *
     * 批量增加、删除应用对象到指定策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTargetOfPolicyGroupRequest 请求对象
     * @return BatchUpdateTargetOfPolicyGroupResponse
     */
    public BatchUpdateTargetOfPolicyGroupResponse batchUpdateTargetOfPolicyGroup(
        BatchUpdateTargetOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchUpdateTargetOfPolicyGroup);
    }

    /**
     * 修改策略组应用对象
     *
     * 批量增加、删除应用对象到指定策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTargetOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse>
     */
    public SyncInvoker<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse> batchUpdateTargetOfPolicyGroupInvoker(
        BatchUpdateTargetOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchUpdateTargetOfPolicyGroup, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public SyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupInvoker(
        CreatePolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createPolicyGroup, hcClient);
    }

    /**
     * 创建策略模板
     *
     * 创建策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return CreatePolicyTemplateResponse
     */
    public CreatePolicyTemplateResponse createPolicyTemplate(CreatePolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createPolicyTemplate);
    }

    /**
     * 创建策略模板
     *
     * 创建策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public SyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateInvoker(
        CreatePolicyTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createPolicyTemplate, hcClient);
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
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deletePolicyGroup);
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
        return new SyncInvoker<>(request, WorkspaceMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 导出策略组
     *
     * 导出xml文件形式的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPolicyGroupsRequest 请求对象
     * @return ExportPolicyGroupsResponse
     */
    public ExportPolicyGroupsResponse exportPolicyGroups(ExportPolicyGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportPolicyGroups);
    }

    /**
     * 导出策略组
     *
     * 导出xml文件形式的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPolicyGroupsRequest 请求对象
     * @return SyncInvoker<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse>
     */
    public SyncInvoker<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse> exportPolicyGroupsInvoker(
        ExportPolicyGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportPolicyGroups, hcClient);
    }

    /**
     * 导入策略组
     *
     * 以xml文件形式导入策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPolicyGroupsRequest 请求对象
     * @return ImportPolicyGroupsResponse
     */
    public ImportPolicyGroupsResponse importPolicyGroups(ImportPolicyGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.importPolicyGroups);
    }

    /**
     * 导入策略组
     *
     * 以xml文件形式导入策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPolicyGroupsRequest 请求对象
     * @return SyncInvoker<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse>
     */
    public SyncInvoker<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse> importPolicyGroupsInvoker(
        ImportPolicyGroupsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.importPolicyGroups, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOriginalPolicyInfoRequest 请求对象
     * @return ListOriginalPolicyInfoResponse
     */
    public ListOriginalPolicyInfoResponse listOriginalPolicyInfo(ListOriginalPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOriginalPolicyInfoRequest 请求对象
     * @return SyncInvoker<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse>
     */
    public SyncInvoker<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse> listOriginalPolicyInfoInvoker(
        ListOriginalPolicyInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listOriginalPolicyInfo, hcClient);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesOfPolicyGroupRequest 请求对象
     * @return ListPoliciesOfPolicyGroupResponse
     */
    public ListPoliciesOfPolicyGroupResponse listPoliciesOfPolicyGroup(ListPoliciesOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPoliciesOfPolicyGroup);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse>
     */
    public SyncInvoker<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse> listPoliciesOfPolicyGroupInvoker(
        ListPoliciesOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPoliciesOfPolicyGroup, hcClient);
    }

    /**
     * 查询策略组
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDetailInfoByIdRequest 请求对象
     * @return ListPolicyDetailInfoByIdResponse
     */
    public ListPolicyDetailInfoByIdResponse listPolicyDetailInfoById(ListPolicyDetailInfoByIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPolicyDetailInfoById);
    }

    /**
     * 查询策略组
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDetailInfoByIdRequest 请求对象
     * @return SyncInvoker<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse>
     */
    public SyncInvoker<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse> listPolicyDetailInfoByIdInvoker(
        ListPolicyDetailInfoByIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPolicyDetailInfoById, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表，不包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return ListPolicyGroupResponse
     */
    public ListPolicyGroupResponse listPolicyGroup(ListPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表，不包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupInvoker(
        ListPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupInfoRequest 请求对象
     * @return ListPolicyGroupInfoResponse
     */
    public ListPolicyGroupInfoResponse listPolicyGroupInfo(ListPolicyGroupInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listPolicyGroupInfo);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupInfoRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse>
     */
    public SyncInvoker<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse> listPolicyGroupInfoInvoker(
        ListPolicyGroupInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listPolicyGroupInfo, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetOfPolicyGroupRequest 请求对象
     * @return ListTargetOfPolicyGroupResponse
     */
    public ListTargetOfPolicyGroupResponse listTargetOfPolicyGroup(ListTargetOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTargetOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse>
     */
    public SyncInvoker<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse> listTargetOfPolicyGroupInvoker(
        ListTargetOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTargetOfPolicyGroup, hcClient);
    }

    /**
     * 修改策略组中的策略项
     *
     * 修改一个策略组的部分或者所有策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoliciesOfPolicyGroupRequest 请求对象
     * @return UpdatePoliciesOfPolicyGroupResponse
     */
    public UpdatePoliciesOfPolicyGroupResponse updatePoliciesOfPolicyGroup(UpdatePoliciesOfPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updatePoliciesOfPolicyGroup);
    }

    /**
     * 修改策略组中的策略项
     *
     * 修改一个策略组的部分或者所有策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoliciesOfPolicyGroupRequest 请求对象
     * @return SyncInvoker<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse>
     */
    public SyncInvoker<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse> updatePoliciesOfPolicyGroupInvoker(
        UpdatePoliciesOfPolicyGroupRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updatePoliciesOfPolicyGroup, hcClient);
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
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updatePolicyGroup);
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
        return new SyncInvoker<>(request, WorkspaceMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 查询可订购小时包类型
     *
     * 该接口用于查询可订购小时包类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHourPackagesTypeRequest 请求对象
     * @return ListHourPackagesTypeResponse
     */
    public ListHourPackagesTypeResponse listHourPackagesType(ListHourPackagesTypeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listHourPackagesType);
    }

    /**
     * 查询可订购小时包类型
     *
     * 该接口用于查询可订购小时包类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHourPackagesTypeRequest 请求对象
     * @return SyncInvoker<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse>
     */
    public SyncInvoker<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse> listHourPackagesTypeInvoker(
        ListHourPackagesTypeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listHourPackagesType, hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listProducts, hcClient);
    }

    /**
     * 查询按需资源包列表
     *
     * 该接口用于查询按需资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePackagesRequest 请求对象
     * @return ListResourcePackagesResponse
     */
    public ListResourcePackagesResponse listResourcePackages(ListResourcePackagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listResourcePackages);
    }

    /**
     * 查询按需资源包列表
     *
     * 该接口用于查询按需资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePackagesRequest 请求对象
     * @return SyncInvoker<ListResourcePackagesRequest, ListResourcePackagesResponse>
     */
    public SyncInvoker<ListResourcePackagesRequest, ListResourcePackagesResponse> listResourcePackagesInvoker(
        ListResourcePackagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listResourcePackages, hcClient);
    }

    /**
     * 查询协同套餐列表
     *
     * 该接口用于查询协同套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharerProductsRequest 请求对象
     * @return ListSharerProductsResponse
     */
    public ListSharerProductsResponse listSharerProducts(ListSharerProductsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listSharerProducts);
    }

    /**
     * 查询协同套餐列表
     *
     * 该接口用于查询协同套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharerProductsRequest 请求对象
     * @return SyncInvoker<ListSharerProductsRequest, ListSharerProductsResponse>
     */
    public SyncInvoker<ListSharerProductsRequest, ListSharerProductsResponse> listSharerProductsInvoker(
        ListSharerProductsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listSharerProducts, hcClient);
    }

    /**
     * 查询租户功能状态
     *
     * 查询租户功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfilesRequest 请求对象
     * @return ListTenantProfilesResponse
     */
    public ListTenantProfilesResponse listTenantProfiles(ListTenantProfilesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTenantProfiles);
    }

    /**
     * 查询租户功能状态
     *
     * 查询租户功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfilesRequest 请求对象
     * @return SyncInvoker<ListTenantProfilesRequest, ListTenantProfilesResponse>
     */
    public SyncInvoker<ListTenantProfilesRequest, ListTenantProfilesResponse> listTenantProfilesInvoker(
        ListTenantProfilesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTenantProfiles, hcClient);
    }

    /**
     * 启禁用租户功能
     *
     * 启禁用租户功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantProfileRequest 请求对象
     * @return UpdateTenantProfileResponse
     */
    public UpdateTenantProfileResponse updateTenantProfile(UpdateTenantProfileRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTenantProfile);
    }

    /**
     * 启禁用租户功能
     *
     * 启禁用租户功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantProfileRequest 请求对象
     * @return SyncInvoker<UpdateTenantProfileRequest, UpdateTenantProfileResponse>
     */
    public SyncInvoker<UpdateTenantProfileRequest, UpdateTenantProfileResponse> updateTenantProfileInvoker(
        UpdateTenantProfileRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTenantProfile, hcClient);
    }

    /**
     * 查询租户单个站点配额详情
     *
     * 查询租户单个站点配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaDetailsRequest 请求对象
     * @return ShowQuotaDetailsResponse
     */
    public ShowQuotaDetailsResponse showQuotaDetails(ShowQuotaDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showQuotaDetails);
    }

    /**
     * 查询租户单个站点配额详情
     *
     * 查询租户单个站点配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaDetailsRequest 请求对象
     * @return SyncInvoker<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse>
     */
    public SyncInvoker<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse> showQuotaDetailsInvoker(
        ShowQuotaDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showQuotaDetails, hcClient);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showQuotas);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return BatchDeleteScheduledTasksResponse
     */
    public BatchDeleteScheduledTasksResponse batchDeleteScheduledTasks(BatchDeleteScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteScheduledTasks);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return SyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse>
     */
    public SyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> batchDeleteScheduledTasksInvoker(
        BatchDeleteScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteScheduledTasks, hcClient);
    }

    /**
     * 创建定时任务
     *
     * 创建定时任务。
     * 注:需通过开通委托功能接口先对云服务进行授权才可以使用该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTasksRequest 请求对象
     * @return CreateScheduledTasksResponse
     */
    public CreateScheduledTasksResponse createScheduledTasks(CreateScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createScheduledTasks);
    }

    /**
     * 创建定时任务
     *
     * 创建定时任务。
     * 注:需通过开通委托功能接口先对云服务进行授权才可以使用该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduledTasksRequest 请求对象
     * @return SyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse>
     */
    public SyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse> createScheduledTasksInvoker(
        CreateScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createScheduledTasks, hcClient);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return DeleteScheduledTasksResponse
     */
    public DeleteScheduledTasksResponse deleteScheduledTasks(DeleteScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteScheduledTasks);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return SyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse>
     */
    public SyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> deleteScheduledTasksInvoker(
        DeleteScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteScheduledTasks, hcClient);
    }

    /**
     * 导出定时任务记录及执行详情
     *
     * 导出定时任务记录及执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportScheduledTasksRecordsRequest 请求对象
     * @return ExportScheduledTasksRecordsResponse
     */
    public ExportScheduledTasksRecordsResponse exportScheduledTasksRecords(ExportScheduledTasksRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportScheduledTasksRecords);
    }

    /**
     * 导出定时任务记录及执行详情
     *
     * 导出定时任务记录及执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportScheduledTasksRecordsRequest 请求对象
     * @return SyncInvoker<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse>
     */
    public SyncInvoker<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse> exportScheduledTasksRecordsInvoker(
        ExportScheduledTasksRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportScheduledTasksRecords, hcClient);
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
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listFutureExecutions);
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
        return new SyncInvoker<>(request, WorkspaceMeta.listFutureExecutions, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasks);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public SyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksInvoker(
        ListScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return ListScheduledTasksRecordsResponse
     */
    public ListScheduledTasksRecordsResponse listScheduledTasksRecords(ListScheduledTasksRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecords);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse>
     */
    public SyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> listScheduledTasksRecordsInvoker(
        ListScheduledTasksRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecords, hcClient);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return ListScheduledTasksRecordsDetailsResponse
     */
    public ListScheduledTasksRecordsDetailsResponse listScheduledTasksRecordsDetails(
        ListScheduledTasksRecordsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecordsDetails);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return SyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse>
     */
    public SyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> listScheduledTasksRecordsDetailsInvoker(
        ListScheduledTasksRecordsDetailsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecordsDetails, hcClient);
    }

    /**
     * 获取时区配置
     *
     * 获取时区配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeZonesRequest 请求对象
     * @return ListTimeZonesResponse
     */
    public ListTimeZonesResponse listTimeZones(ListTimeZonesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTimeZones);
    }

    /**
     * 获取时区配置
     *
     * 获取时区配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeZonesRequest 请求对象
     * @return SyncInvoker<ListTimeZonesRequest, ListTimeZonesResponse>
     */
    public SyncInvoker<ListTimeZonesRequest, ListTimeZonesResponse> listTimeZonesInvoker(ListTimeZonesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTimeZones, hcClient);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return ShowScheduledTasksResponse
     */
    public ShowScheduledTasksResponse showScheduledTasks(ShowScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showScheduledTasks);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return SyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse>
     */
    public SyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse> showScheduledTasksInvoker(
        ShowScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showScheduledTasks, hcClient);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return UpdateScheduledTasksResponse
     */
    public UpdateScheduledTasksResponse updateScheduledTasks(UpdateScheduledTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateScheduledTasks);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return SyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse>
     */
    public SyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> updateScheduledTasksInvoker(
        UpdateScheduledTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateScheduledTasks, hcClient);
    }

    /**
     * 批量删除录屏记录
     *
     * 批量删除录屏记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScreenRecordsRequest 请求对象
     * @return BatchDeleteScreenRecordsResponse
     */
    public BatchDeleteScreenRecordsResponse batchDeleteScreenRecords(BatchDeleteScreenRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteScreenRecords);
    }

    /**
     * 批量删除录屏记录
     *
     * 批量删除录屏记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScreenRecordsRequest 请求对象
     * @return SyncInvoker<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse>
     */
    public SyncInvoker<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse> batchDeleteScreenRecordsInvoker(
        BatchDeleteScreenRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteScreenRecords, hcClient);
    }

    /**
     * 查询桌面关键事件列表
     *
     * 查询桌面关键事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopOperationsRequest 请求对象
     * @return ListDesktopOperationsResponse
     */
    public ListDesktopOperationsResponse listDesktopOperations(ListDesktopOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopOperations);
    }

    /**
     * 查询桌面关键事件列表
     *
     * 查询桌面关键事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopOperationsRequest 请求对象
     * @return SyncInvoker<ListDesktopOperationsRequest, ListDesktopOperationsResponse>
     */
    public SyncInvoker<ListDesktopOperationsRequest, ListDesktopOperationsResponse> listDesktopOperationsInvoker(
        ListDesktopOperationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopOperations, hcClient);
    }

    /**
     * 查询下载地址列表
     *
     * 查询下载地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadAddressRequest 请求对象
     * @return ListDownloadAddressResponse
     */
    public ListDownloadAddressResponse listDownloadAddress(ListDownloadAddressRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDownloadAddress);
    }

    /**
     * 查询下载地址列表
     *
     * 查询下载地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadAddressRequest 请求对象
     * @return SyncInvoker<ListDownloadAddressRequest, ListDownloadAddressResponse>
     */
    public SyncInvoker<ListDownloadAddressRequest, ListDownloadAddressResponse> listDownloadAddressInvoker(
        ListDownloadAddressRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDownloadAddress, hcClient);
    }

    /**
     * 查询录屏记录列表
     *
     * 查询录屏记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScreenRecordsRequest 请求对象
     * @return ListScreenRecordsResponse
     */
    public ListScreenRecordsResponse listScreenRecords(ListScreenRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScreenRecords);
    }

    /**
     * 查询录屏记录列表
     *
     * 查询录屏记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScreenRecordsRequest 请求对象
     * @return SyncInvoker<ListScreenRecordsRequest, ListScreenRecordsResponse>
     */
    public SyncInvoker<ListScreenRecordsRequest, ListScreenRecordsResponse> listScreenRecordsInvoker(
        ListScreenRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScreenRecords, hcClient);
    }

    /**
     * 查询录屏详情
     *
     * 查询录屏详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScreenRecordRequest 请求对象
     * @return ShowScreenRecordResponse
     */
    public ShowScreenRecordResponse showScreenRecord(ShowScreenRecordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showScreenRecord);
    }

    /**
     * 查询录屏详情
     *
     * 查询录屏详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScreenRecordRequest 请求对象
     * @return SyncInvoker<ShowScreenRecordRequest, ShowScreenRecordResponse>
     */
    public SyncInvoker<ShowScreenRecordRequest, ShowScreenRecordResponse> showScreenRecordInvoker(
        ShowScreenRecordRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showScreenRecord, hcClient);
    }

    /**
     * 新增脚本
     *
     * 新增脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createScript);
    }

    /**
     * 新增脚本
     *
     * 新增脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return SyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public SyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptInvoker(CreateScriptRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createScript, hcClient);
    }

    /**
     * 删除脚本
     *
     * 删除脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 删除脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return SyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public SyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptInvoker(DeleteScriptRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteScript, hcClient);
    }

    /**
     * 按桌面标签下发执行脚本或命令
     *
     * 按桌面标签下发执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptByDesktopTagRequest 请求对象
     * @return ExecuteScriptByDesktopTagResponse
     */
    public ExecuteScriptByDesktopTagResponse executeScriptByDesktopTag(ExecuteScriptByDesktopTagRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.executeScriptByDesktopTag);
    }

    /**
     * 按桌面标签下发执行脚本或命令
     *
     * 按桌面标签下发执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptByDesktopTagRequest 请求对象
     * @return SyncInvoker<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse>
     */
    public SyncInvoker<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse> executeScriptByDesktopTagInvoker(
        ExecuteScriptByDesktopTagRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.executeScriptByDesktopTag, hcClient);
    }

    /**
     * 批量执行脚本或命令
     *
     * 批量执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptOrCommandRequest 请求对象
     * @return ExecuteScriptOrCommandResponse
     */
    public ExecuteScriptOrCommandResponse executeScriptOrCommand(ExecuteScriptOrCommandRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.executeScriptOrCommand);
    }

    /**
     * 批量执行脚本或命令
     *
     * 批量执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptOrCommandRequest 请求对象
     * @return SyncInvoker<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse>
     */
    public SyncInvoker<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse> executeScriptOrCommandInvoker(
        ExecuteScriptOrCommandRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.executeScriptOrCommand, hcClient);
    }

    /**
     * 查询脚本执行记录列表
     *
     * 查询脚本执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptRecordsRequest 请求对象
     * @return ListScriptRecordsResponse
     */
    public ListScriptRecordsResponse listScriptRecords(ListScriptRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScriptRecords);
    }

    /**
     * 查询脚本执行记录列表
     *
     * 查询脚本执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptRecordsRequest 请求对象
     * @return SyncInvoker<ListScriptRecordsRequest, ListScriptRecordsResponse>
     */
    public SyncInvoker<ListScriptRecordsRequest, ListScriptRecordsResponse> listScriptRecordsInvoker(
        ListScriptRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScriptRecords, hcClient);
    }

    /**
     * 查询脚本任务列表
     *
     * 查询脚本任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptTasksRequest 请求对象
     * @return ListScriptTasksResponse
     */
    public ListScriptTasksResponse listScriptTasks(ListScriptTasksRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScriptTasks);
    }

    /**
     * 查询脚本任务列表
     *
     * 查询脚本任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptTasksRequest 请求对象
     * @return SyncInvoker<ListScriptTasksRequest, ListScriptTasksResponse>
     */
    public SyncInvoker<ListScriptTasksRequest, ListScriptTasksResponse> listScriptTasksInvoker(
        ListScriptTasksRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScriptTasks, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return SyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public SyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsInvoker(ListScriptsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listScripts, hcClient);
    }

    /**
     * 重试脚本或执行脚本失败的任务
     *
     * 重试脚本或执行脚本失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryScriptExecutionRequest 请求对象
     * @return RetryScriptExecutionResponse
     */
    public RetryScriptExecutionResponse retryScriptExecution(RetryScriptExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.retryScriptExecution);
    }

    /**
     * 重试脚本或执行脚本失败的任务
     *
     * 重试脚本或执行脚本失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryScriptExecutionRequest 请求对象
     * @return SyncInvoker<RetryScriptExecutionRequest, RetryScriptExecutionResponse>
     */
    public SyncInvoker<RetryScriptExecutionRequest, RetryScriptExecutionResponse> retryScriptExecutionInvoker(
        RetryScriptExecutionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.retryScriptExecution, hcClient);
    }

    /**
     * 查询脚本详情
     *
     * 查询脚本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptDetailRequest 请求对象
     * @return ShowScriptDetailResponse
     */
    public ShowScriptDetailResponse showScriptDetail(ShowScriptDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showScriptDetail);
    }

    /**
     * 查询脚本详情
     *
     * 查询脚本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptDetailRequest 请求对象
     * @return SyncInvoker<ShowScriptDetailRequest, ShowScriptDetailResponse>
     */
    public SyncInvoker<ShowScriptDetailRequest, ShowScriptDetailResponse> showScriptDetailInvoker(
        ShowScriptDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showScriptDetail, hcClient);
    }

    /**
     * 查询脚本执行记录详情
     *
     * 查询脚本执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRecordDetailRequest 请求对象
     * @return ShowScriptRecordDetailResponse
     */
    public ShowScriptRecordDetailResponse showScriptRecordDetail(ShowScriptRecordDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showScriptRecordDetail);
    }

    /**
     * 查询脚本执行记录详情
     *
     * 查询脚本执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRecordDetailRequest 请求对象
     * @return SyncInvoker<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse>
     */
    public SyncInvoker<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse> showScriptRecordDetailInvoker(
        ShowScriptRecordDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showScriptRecordDetail, hcClient);
    }

    /**
     * 停止脚本或者命令执行任务
     *
     * 停止脚本或者命令执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScriptExecutionRequest 请求对象
     * @return StopScriptExecutionResponse
     */
    public StopScriptExecutionResponse stopScriptExecution(StopScriptExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.stopScriptExecution);
    }

    /**
     * 停止脚本或者命令执行任务
     *
     * 停止脚本或者命令执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScriptExecutionRequest 请求对象
     * @return SyncInvoker<StopScriptExecutionRequest, StopScriptExecutionResponse>
     */
    public SyncInvoker<StopScriptExecutionRequest, StopScriptExecutionResponse> stopScriptExecutionInvoker(
        StopScriptExecutionRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.stopScriptExecution, hcClient);
    }

    /**
     * 更新脚本
     *
     * 更新脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateScript);
    }

    /**
     * 更新脚本
     *
     * 更新脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return SyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public SyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptInvoker(UpdateScriptRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateScript, hcClient);
    }

    /**
     * 桌面购买附属资源
     *
     * 存量桌面购买附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopSubResourcesRequest 请求对象
     * @return AddDesktopSubResourcesResponse
     */
    public AddDesktopSubResourcesResponse addDesktopSubResources(AddDesktopSubResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addDesktopSubResources);
    }

    /**
     * 桌面购买附属资源
     *
     * 存量桌面购买附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopSubResourcesRequest 请求对象
     * @return SyncInvoker<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse>
     */
    public SyncInvoker<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse> addDesktopSubResourcesInvoker(
        AddDesktopSubResourcesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addDesktopSubResources, hcClient);
    }

    /**
     * 桌面删除附属资源
     *
     * 桌面删除附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopSubResourcesRequest 请求对象
     * @return DeleteDesktopSubResourcesResponse
     */
    public DeleteDesktopSubResourcesResponse deleteDesktopSubResources(DeleteDesktopSubResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopSubResources);
    }

    /**
     * 桌面删除附属资源
     *
     * 桌面删除附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopSubResourcesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse>
     */
    public SyncInvoker<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse> deleteDesktopSubResourcesInvoker(
        DeleteDesktopSubResourcesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktopSubResources, hcClient);
    }

    /**
     * 查询协同桌面默认用户配置
     *
     * 查询协同桌面默认用户配置（当前功能公测中,需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareSpaceConfigRequest 请求对象
     * @return ShowShareSpaceConfigResponse
     */
    public ShowShareSpaceConfigResponse showShareSpaceConfig(ShowShareSpaceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showShareSpaceConfig);
    }

    /**
     * 查询协同桌面默认用户配置
     *
     * 查询协同桌面默认用户配置（当前功能公测中,需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareSpaceConfigRequest 请求对象
     * @return SyncInvoker<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse>
     */
    public SyncInvoker<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse> showShareSpaceConfigInvoker(
        ShowShareSpaceConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showShareSpaceConfig, hcClient);
    }

    /**
     * 设置协同桌面默认用户配置
     *
     * 设置协同桌面默认用户配置（当前功能公测中，需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareSpaceConfigRequest 请求对象
     * @return UpdateShareSpaceConfigResponse
     */
    public UpdateShareSpaceConfigResponse updateShareSpaceConfig(UpdateShareSpaceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateShareSpaceConfig);
    }

    /**
     * 设置协同桌面默认用户配置
     *
     * 设置协同桌面默认用户配置（当前功能公测中，需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareSpaceConfigRequest 请求对象
     * @return SyncInvoker<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse>
     */
    public SyncInvoker<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse> updateShareSpaceConfigInvoker(
        UpdateShareSpaceConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateShareSpaceConfig, hcClient);
    }

    /**
     * 新增站点
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSiteRequest 请求对象
     * @return AddSiteResponse
     */
    public AddSiteResponse addSite(AddSiteRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addSite);
    }

    /**
     * 新增站点
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSiteRequest 请求对象
     * @return SyncInvoker<AddSiteRequest, AddSiteResponse>
     */
    public SyncInvoker<AddSiteRequest, AddSiteResponse> addSiteInvoker(AddSiteRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addSite, hcClient);
    }

    /**
     * 校验边缘站点资源
     *
     * 校验边缘站点资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEdgeSiteResourcesRequest 请求对象
     * @return CheckEdgeSiteResourcesResponse
     */
    public CheckEdgeSiteResourcesResponse checkEdgeSiteResources(CheckEdgeSiteResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.checkEdgeSiteResources);
    }

    /**
     * 校验边缘站点资源
     *
     * 校验边缘站点资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEdgeSiteResourcesRequest 请求对象
     * @return SyncInvoker<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse>
     */
    public SyncInvoker<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse> checkEdgeSiteResourcesInvoker(
        CheckEdgeSiteResourcesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.checkEdgeSiteResources, hcClient);
    }

    /**
     * 删除站点
     *
     * 用于删除站点的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteRequest 请求对象
     * @return DeleteSiteResponse
     */
    public DeleteSiteResponse deleteSite(DeleteSiteRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteSite);
    }

    /**
     * 删除站点
     *
     * 用于删除站点的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteRequest 请求对象
     * @return SyncInvoker<DeleteSiteRequest, DeleteSiteResponse>
     */
    public SyncInvoker<DeleteSiteRequest, DeleteSiteResponse> deleteSiteInvoker(DeleteSiteRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteSite, hcClient);
    }

    /**
     * 查询站点信息
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteConfigsRequest 请求对象
     * @return ListSiteConfigsResponse
     */
    public ListSiteConfigsResponse listSiteConfigs(ListSiteConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listSiteConfigs);
    }

    /**
     * 查询站点信息
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteConfigsRequest 请求对象
     * @return SyncInvoker<ListSiteConfigsRequest, ListSiteConfigsResponse>
     */
    public SyncInvoker<ListSiteConfigsRequest, ListSiteConfigsResponse> listSiteConfigsInvoker(
        ListSiteConfigsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listSiteConfigs, hcClient);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWksEdgeSitesRequest 请求对象
     * @return ListWksEdgeSitesResponse
     */
    public ListWksEdgeSitesResponse listWksEdgeSites(ListWksEdgeSitesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listWksEdgeSites);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWksEdgeSitesRequest 请求对象
     * @return SyncInvoker<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse>
     */
    public SyncInvoker<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse> listWksEdgeSitesInvoker(
        ListWksEdgeSitesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listWksEdgeSites, hcClient);
    }

    /**
     * 修改站点接入方式
     *
     * 用于修改站点接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessModeRequest 请求对象
     * @return UpdateAccessModeResponse
     */
    public UpdateAccessModeResponse updateAccessMode(UpdateAccessModeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateAccessMode);
    }

    /**
     * 修改站点接入方式
     *
     * 用于修改站点接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessModeRequest 请求对象
     * @return SyncInvoker<UpdateAccessModeRequest, UpdateAccessModeResponse>
     */
    public SyncInvoker<UpdateAccessModeRequest, UpdateAccessModeResponse> updateAccessModeInvoker(
        UpdateAccessModeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateAccessMode, hcClient);
    }

    /**
     * 修改站点业务子网
     *
     * 用于修改站点业务子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetIdsRequest 请求对象
     * @return UpdateSubnetIdsResponse
     */
    public UpdateSubnetIdsResponse updateSubnetIds(UpdateSubnetIdsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateSubnetIds);
    }

    /**
     * 修改站点业务子网
     *
     * 用于修改站点业务子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetIdsRequest 请求对象
     * @return SyncInvoker<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse>
     */
    public SyncInvoker<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse> updateSubnetIdsInvoker(
        UpdateSubnetIdsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateSubnetIds, hcClient);
    }

    /**
     * 批量创建快照
     *
     * 批量创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesktopSnapshotRequest 请求对象
     * @return BatchCreateDesktopSnapshotResponse
     */
    public BatchCreateDesktopSnapshotResponse batchCreateDesktopSnapshot(BatchCreateDesktopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchCreateDesktopSnapshot);
    }

    /**
     * 批量创建快照
     *
     * 批量创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesktopSnapshotRequest 请求对象
     * @return SyncInvoker<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse>
     */
    public SyncInvoker<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse> batchCreateDesktopSnapshotInvoker(
        BatchCreateDesktopSnapshotRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchCreateDesktopSnapshot, hcClient);
    }

    /**
     * 批量删除快照
     *
     * 批量删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopSnapshotRequest 请求对象
     * @return BatchDeleteDesktopSnapshotResponse
     */
    public BatchDeleteDesktopSnapshotResponse batchDeleteDesktopSnapshot(BatchDeleteDesktopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopSnapshot);
    }

    /**
     * 批量删除快照
     *
     * 批量删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopSnapshotRequest 请求对象
     * @return SyncInvoker<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse>
     */
    public SyncInvoker<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse> batchDeleteDesktopSnapshotInvoker(
        BatchDeleteDesktopSnapshotRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopSnapshot, hcClient);
    }

    /**
     * 批量恢复快照
     *
     * 批量恢快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDesktopSnapshotRequest 请求对象
     * @return BatchRestoreDesktopSnapshotResponse
     */
    public BatchRestoreDesktopSnapshotResponse batchRestoreDesktopSnapshot(BatchRestoreDesktopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchRestoreDesktopSnapshot);
    }

    /**
     * 批量恢复快照
     *
     * 批量恢快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDesktopSnapshotRequest 请求对象
     * @return SyncInvoker<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse>
     */
    public SyncInvoker<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse> batchRestoreDesktopSnapshotInvoker(
        BatchRestoreDesktopSnapshotRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchRestoreDesktopSnapshot, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopSnapshotRequest 请求对象
     * @return ListDesktopSnapshotResponse
     */
    public ListDesktopSnapshotResponse listDesktopSnapshot(ListDesktopSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopSnapshot);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopSnapshotRequest 请求对象
     * @return SyncInvoker<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse>
     */
    public SyncInvoker<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse> listDesktopSnapshotInvoker(
        ListDesktopSnapshotRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopSnapshot, hcClient);
    }

    /**
     * 新增通知规则
     *
     * 新增对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 同一指标的规则不允许重复;
     * 统计指标名称，目前仅支持固定值：desktop_idle_duration
     *   * &#x60;desktop_idle_duration&#x60; -  桌面空闲时长, 仅允许设置 &#39;&gt;&#x3D;&#39; 阈值
     * 注：需先为云服务添加委托授权，否则无法正常发送通知到SMN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricNotifyRuleRequest 请求对象
     * @return AddMetricNotifyRuleResponse
     */
    public AddMetricNotifyRuleResponse addMetricNotifyRule(AddMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addMetricNotifyRule);
    }

    /**
     * 新增通知规则
     *
     * 新增对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 同一指标的规则不允许重复;
     * 统计指标名称，目前仅支持固定值：desktop_idle_duration
     *   * &#x60;desktop_idle_duration&#x60; -  桌面空闲时长, 仅允许设置 &#39;&gt;&#x3D;&#39; 阈值
     * 注：需先为云服务添加委托授权，否则无法正常发送通知到SMN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse>
     */
    public SyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> addMetricNotifyRuleInvoker(
        AddMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addMetricNotifyRule, hcClient);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return DeleteMetricNotifyRuleResponse
     */
    public DeleteMetricNotifyRuleResponse deleteMetricNotifyRule(DeleteMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteMetricNotifyRule);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse>
     */
    public SyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> deleteMetricNotifyRuleInvoker(
        DeleteMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteMetricNotifyRule, hcClient);
    }

    /**
     * 导出云应用接入统计数据
     *
     * 创建云应用接入统计导出任务，仅能导出最近30天的数据。创建后根据taskId调用ListExportTasks查询任务状态，调用DownloadExportFile下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAppUserAccessDataRequest 请求对象
     * @return ExportAppUserAccessDataResponse
     */
    public ExportAppUserAccessDataResponse exportAppUserAccessData(ExportAppUserAccessDataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportAppUserAccessData);
    }

    /**
     * 导出云应用接入统计数据
     *
     * 创建云应用接入统计导出任务，仅能导出最近30天的数据。创建后根据taskId调用ListExportTasks查询任务状态，调用DownloadExportFile下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAppUserAccessDataRequest 请求对象
     * @return SyncInvoker<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse>
     */
    public SyncInvoker<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse> exportAppUserAccessDataInvoker(
        ExportAppUserAccessDataRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportAppUserAccessData, hcClient);
    }

    /**
     * 查询云应用接入统计数据
     *
     * 查询云应用接入统计数据，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppUserAccessDataRequest 请求对象
     * @return ListAppUserAccessDataResponse
     */
    public ListAppUserAccessDataResponse listAppUserAccessData(ListAppUserAccessDataRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listAppUserAccessData);
    }

    /**
     * 查询云应用接入统计数据
     *
     * 查询云应用接入统计数据，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppUserAccessDataRequest 请求对象
     * @return SyncInvoker<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse>
     */
    public SyncInvoker<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse> listAppUserAccessDataInvoker(
        ListAppUserAccessDataRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listAppUserAccessData, hcClient);
    }

    /**
     * 查询桌面使用情况统计数据
     *
     * 查询桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能查询最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopUsageMetricRequest 请求对象
     * @return ListDesktopUsageMetricResponse
     */
    public ListDesktopUsageMetricResponse listDesktopUsageMetric(ListDesktopUsageMetricRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopUsageMetric);
    }

    /**
     * 查询桌面使用情况统计数据
     *
     * 查询桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能查询最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopUsageMetricRequest 请求对象
     * @return SyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse>
     */
    public SyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> listDesktopUsageMetricInvoker(
        ListDesktopUsageMetricRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopUsageMetric, hcClient);
    }

    /**
     * 桌面统计
     *
     * 统计租户下的普通桌面、桌面池状态，默认仅统计总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsStatisticsRequest 请求对象
     * @return ListDesktopsStatisticsResponse
     */
    public ListDesktopsStatisticsResponse listDesktopsStatistics(ListDesktopsStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listDesktopsStatistics);
    }

    /**
     * 桌面统计
     *
     * 统计租户下的普通桌面、桌面池状态，默认仅统计总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsStatisticsRequest 请求对象
     * @return SyncInvoker<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse>
     */
    public SyncInvoker<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse> listDesktopsStatisticsInvoker(
        ListDesktopsStatisticsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listDesktopsStatistics, hcClient);
    }

    /**
     * 登录状态统计
     *
     * 查询租户桌面登录状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginStateRequest 请求对象
     * @return ListLoginStateResponse
     */
    public ListLoginStateResponse listLoginState(ListLoginStateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listLoginState);
    }

    /**
     * 登录状态统计
     *
     * 查询租户桌面登录状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginStateRequest 请求对象
     * @return SyncInvoker<ListLoginStateRequest, ListLoginStateResponse>
     */
    public SyncInvoker<ListLoginStateRequest, ListLoginStateResponse> listLoginStateInvoker(
        ListLoginStateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listLoginState, hcClient);
    }

    /**
     * 查询对应指标维度是否存在满足通知规则的记录
     *
     * 查询对应指标维度是否存在满足通知规则的记录;
     * 查询结果仅表示满足相应指标维度下对应通知规则可产生的通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRecordRequest 请求对象
     * @return ListMetricNotifyRecordResponse
     */
    public ListMetricNotifyRecordResponse listMetricNotifyRecord(ListMetricNotifyRecordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRecord);
    }

    /**
     * 查询对应指标维度是否存在满足通知规则的记录
     *
     * 查询对应指标维度是否存在满足通知规则的记录;
     * 查询结果仅表示满足相应指标维度下对应通知规则可产生的通知记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRecordRequest 请求对象
     * @return SyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse>
     */
    public SyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> listMetricNotifyRecordInvoker(
        ListMetricNotifyRecordRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRecord, hcClient);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return ListMetricNotifyRuleResponse
     */
    public ListMetricNotifyRuleResponse listMetricNotifyRule(ListMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRule);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse>
     */
    public SyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> listMetricNotifyRuleInvoker(
        ListMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRule, hcClient);
    }

    /**
     * 查询指标
     *
     * 查询指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return ListMetricsResponse
     */
    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetrics);
    }

    /**
     * 查询指标
     *
     * 查询指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return SyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetrics, hcClient);
    }

    /**
     * 查询指标趋势
     *
     * 查询指标趋势。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsTrendRequest 请求对象
     * @return ListMetricsTrendResponse
     */
    public ListMetricsTrendResponse listMetricsTrend(ListMetricsTrendRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listMetricsTrend);
    }

    /**
     * 查询指标趋势
     *
     * 查询指标趋势。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsTrendRequest 请求对象
     * @return SyncInvoker<ListMetricsTrendRequest, ListMetricsTrendResponse>
     */
    public SyncInvoker<ListMetricsTrendRequest, ListMetricsTrendResponse> listMetricsTrendInvoker(
        ListMetricsTrendRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listMetricsTrend, hcClient);
    }

    /**
     * 运行状态统计
     *
     * 租户桌面运行状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunStateRequest 请求对象
     * @return ListRunStateResponse
     */
    public ListRunStateResponse listRunState(ListRunStateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listRunState);
    }

    /**
     * 运行状态统计
     *
     * 租户桌面运行状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunStateRequest 请求对象
     * @return SyncInvoker<ListRunStateRequest, ListRunStateResponse>
     */
    public SyncInvoker<ListRunStateRequest, ListRunStateResponse> listRunStateInvoker(ListRunStateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listRunState, hcClient);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnusedDesktopsRequest 请求对象
     * @return ListUnusedDesktopsResponse
     */
    public ListUnusedDesktopsResponse listUnusedDesktops(ListUnusedDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUnusedDesktops);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnusedDesktopsRequest 请求对象
     * @return SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>
     */
    public SyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktopsInvoker(
        ListUnusedDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUnusedDesktops, hcClient);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsedDesktopInfoRequest 请求对象
     * @return ListUsedDesktopInfoResponse
     */
    public ListUsedDesktopInfoResponse listUsedDesktopInfo(ListUsedDesktopInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsedDesktopInfo);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsedDesktopInfoRequest 请求对象
     * @return SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>
     */
    public SyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfoInvoker(
        ListUsedDesktopInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsedDesktopInfo, hcClient);
    }

    /**
     * 查询用户使用统计数据
     *
     * 查询用户使用统计信息;
     * 最多查询30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserUsageMetricRequest 请求对象
     * @return ListUserUsageMetricResponse
     */
    public ListUserUsageMetricResponse listUserUsageMetric(ListUserUsageMetricRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserUsageMetric);
    }

    /**
     * 查询用户使用统计数据
     *
     * 查询用户使用统计信息;
     * 最多查询30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserUsageMetricRequest 请求对象
     * @return SyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse>
     */
    public SyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse> listUserUsageMetricInvoker(
        ListUserUsageMetricRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserUsageMetric, hcClient);
    }

    /**
     * 查询指标环比值
     *
     * 查询指标环比值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGrowthRateRequest 请求对象
     * @return ShowGrowthRateResponse
     */
    public ShowGrowthRateResponse showGrowthRate(ShowGrowthRateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showGrowthRate);
    }

    /**
     * 查询指标环比值
     *
     * 查询指标环比值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGrowthRateRequest 请求对象
     * @return SyncInvoker<ShowGrowthRateRequest, ShowGrowthRateResponse>
     */
    public SyncInvoker<ShowGrowthRateRequest, ShowGrowthRateResponse> showGrowthRateInvoker(
        ShowGrowthRateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showGrowthRate, hcClient);
    }

    /**
     * 查询接入云桌面或云应用各阶段时长数据
     *
     * 查询接入云桌面或云应用各阶段时长数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessStagesRequest 请求对象
     * @return ShowUserAccessStagesResponse
     */
    public ShowUserAccessStagesResponse showUserAccessStages(ShowUserAccessStagesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showUserAccessStages);
    }

    /**
     * 查询接入云桌面或云应用各阶段时长数据
     *
     * 查询接入云桌面或云应用各阶段时长数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessStagesRequest 请求对象
     * @return SyncInvoker<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse>
     */
    public SyncInvoker<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse> showUserAccessStagesInvoker(
        ShowUserAccessStagesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showUserAccessStages, hcClient);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return UpdateMetricNotifyRuleResponse
     */
    public UpdateMetricNotifyRuleResponse updateMetricNotifyRule(UpdateMetricNotifyRuleRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateMetricNotifyRule);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return SyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse>
     */
    public SyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> updateMetricNotifyRuleInvoker(
        UpdateMetricNotifyRuleRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateMetricNotifyRule, hcClient);
    }

    /**
     * 导出桌面使用统计数据
     *
     * 导出桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能导出最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopUsageMetricNewRequest 请求对象
     * @return ExportDesktopUsageMetricNewResponse
     */
    public ExportDesktopUsageMetricNewResponse exportDesktopUsageMetricNew(ExportDesktopUsageMetricNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportDesktopUsageMetricNew);
    }

    /**
     * 导出桌面使用统计数据
     *
     * 导出桌面使用统计信息;
     * 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上
     * 跨天的记录会按照统计周期进行计算
     * 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日):
     * 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00)
     * 仅能导出最近180天已进行汇聚计算的数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopUsageMetricNewRequest 请求对象
     * @return SyncInvoker<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse>
     */
    public SyncInvoker<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse> exportDesktopUsageMetricNewInvoker(
        ExportDesktopUsageMetricNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportDesktopUsageMetricNew, hcClient);
    }

    /**
     * 导出用户使用统计数据
     *
     * 导出用户使用统计信息;
     * 最多导出30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserUsageMetricNewRequest 请求对象
     * @return ExportUserUsageMetricNewResponse
     */
    public ExportUserUsageMetricNewResponse exportUserUsageMetricNew(ExportUserUsageMetricNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserUsageMetricNew);
    }

    /**
     * 导出用户使用统计数据
     *
     * 导出用户使用统计信息;
     * 最多导出30天内的数据;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserUsageMetricNewRequest 请求对象
     * @return SyncInvoker<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse>
     */
    public SyncInvoker<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse> exportUserUsageMetricNewInvoker(
        ExportUserUsageMetricNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserUsageMetricNew, hcClient);
    }

    /**
     * 根据子网id查询该子网下可用的ip
     *
     * 根据子网id查询该子网下可用的ip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableIpRequest 请求对象
     * @return ShowAvailableIpResponse
     */
    public ShowAvailableIpResponse showAvailableIp(ShowAvailableIpRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showAvailableIp);
    }

    /**
     * 根据子网id查询该子网下可用的ip
     *
     * 根据子网id查询该子网下可用的ip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableIpRequest 请求对象
     * @return SyncInvoker<ShowAvailableIpRequest, ShowAvailableIpResponse>
     */
    public SyncInvoker<ShowAvailableIpRequest, ShowAvailableIpResponse> showAvailableIpInvoker(
        ShowAvailableIpRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showAvailableIp, hcClient);
    }

    /**
     * 查询租户个性配置列表
     *
     * 查询租户个性配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantConfigsRequest 请求对象
     * @return ListTenantConfigsResponse
     */
    public ListTenantConfigsResponse listTenantConfigs(ListTenantConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTenantConfigs);
    }

    /**
     * 查询租户个性配置列表
     *
     * 查询租户个性配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantConfigsRequest 请求对象
     * @return SyncInvoker<ListTenantConfigsRequest, ListTenantConfigsResponse>
     */
    public SyncInvoker<ListTenantConfigsRequest, ListTenantConfigsResponse> listTenantConfigsInvoker(
        ListTenantConfigsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTenantConfigs, hcClient);
    }

    /**
     * 修改租户个性配置
     *
     * 租户个性配置修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantConfigRequest 请求对象
     * @return UpdateTenantConfigResponse
     */
    public UpdateTenantConfigResponse updateTenantConfig(UpdateTenantConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTenantConfig);
    }

    /**
     * 修改租户个性配置
     *
     * 租户个性配置修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantConfigRequest 请求对象
     * @return SyncInvoker<UpdateTenantConfigRequest, UpdateTenantConfigResponse>
     */
    public SyncInvoker<UpdateTenantConfigRequest, UpdateTenantConfigResponse> updateTenantConfigInvoker(
        UpdateTenantConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTenantConfig, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
     * @return CreateTerminalsBindingDesktopsResponse
     */
    public CreateTerminalsBindingDesktopsResponse createTerminalsBindingDesktops(
        CreateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createTerminalsBindingDesktops);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createTerminalsBindingDesktops, hcClient);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return DeleteTerminalsBindingDesktopsResponse
     */
    public DeleteTerminalsBindingDesktopsResponse deleteTerminalsBindingDesktops(
        DeleteTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteTerminalsBindingDesktops);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteTerminalsBindingDesktops, hcClient);
    }

    /**
     * 下载终端与桌面绑定模板
     *
     * 下载终端与桌面绑定模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsTemplateRequest 请求对象
     * @return ExportTerminalsBindingDesktopsTemplateResponse
     */
    public ExportTerminalsBindingDesktopsTemplateResponse exportTerminalsBindingDesktopsTemplate(
        ExportTerminalsBindingDesktopsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportTerminalsBindingDesktopsTemplate);
    }

    /**
     * 下载终端与桌面绑定模板
     *
     * 下载终端与桌面绑定模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsTemplateRequest 请求对象
     * @return SyncInvoker<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse>
     */
    public SyncInvoker<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse> exportTerminalsBindingDesktopsTemplateInvoker(
        ExportTerminalsBindingDesktopsTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportTerminalsBindingDesktopsTemplate, hcClient);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
     * @return ListTerminalsBindingDesktopsResponse
     */
    public ListTerminalsBindingDesktopsResponse listTerminalsBindingDesktops(
        ListTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktops);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return ListTerminalsBindingDesktopsConfigResponse
     */
    public ListTerminalsBindingDesktopsConfigResponse listTerminalsBindingDesktopsConfig(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsResponse
     */
    public UpdateTerminalsBindingDesktopsResponse updateTerminalsBindingDesktops(
        UpdateTerminalsBindingDesktopsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktops);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktops, hcClient);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return UpdateTerminalsBindingDesktopsConfigResponse
     */
    public UpdateTerminalsBindingDesktopsConfigResponse updateTerminalsBindingDesktopsConfig(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public SyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 导出终端与桌面绑定配置excel
     *
     * 导出终端与桌面绑定配置excel。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsInfoNewRequest 请求对象
     * @return ExportTerminalsBindingDesktopsInfoNewResponse
     */
    public ExportTerminalsBindingDesktopsInfoNewResponse exportTerminalsBindingDesktopsInfoNew(
        ExportTerminalsBindingDesktopsInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportTerminalsBindingDesktopsInfoNew);
    }

    /**
     * 导出终端与桌面绑定配置excel
     *
     * 导出终端与桌面绑定配置excel。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsInfoNewRequest 请求对象
     * @return SyncInvoker<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse>
     */
    public SyncInvoker<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse> exportTerminalsBindingDesktopsInfoNewInvoker(
        ExportTerminalsBindingDesktopsInfoNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportTerminalsBindingDesktopsInfoNew, hcClient);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsersRequest 请求对象
     * @return BatchCreateUsersResponse
     */
    public BatchCreateUsersResponse batchCreateUsers(BatchCreateUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchCreateUsers);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsersRequest 请求对象
     * @return SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>
     */
    public SyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsersInvoker(
        BatchCreateUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchCreateUsers, hcClient);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOtpDevicesRequest 请求对象
     * @return BatchDeleteOtpDevicesResponse
     */
    public BatchDeleteOtpDevicesResponse batchDeleteOtpDevices(BatchDeleteOtpDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteOtpDevices);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOtpDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public SyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteOtpDevices, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 该接口用于批量删除桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserRequest 请求对象
     * @return BatchDeleteUserResponse
     */
    public BatchDeleteUserResponse batchDeleteUser(BatchDeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchDeleteUser);
    }

    /**
     * 批量删除用户
     *
     * 该接口用于批量删除桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserRequest 请求对象
     * @return SyncInvoker<BatchDeleteUserRequest, BatchDeleteUserResponse>
     */
    public SyncInvoker<BatchDeleteUserRequest, BatchDeleteUserResponse> batchDeleteUserInvoker(
        BatchDeleteUserRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchDeleteUser, hcClient);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserStatusRequest 请求对象
     * @return ChangeUserStatusResponse
     */
    public ChangeUserStatusResponse changeUserStatus(ChangeUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.changeUserStatus);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserStatusRequest 请求对象
     * @return SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public SyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusInvoker(
        ChangeUserStatusRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.changeUserStatus, hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopUserRequest 请求对象
     * @return CreateDesktopUserResponse
     */
    public CreateDesktopUserResponse createDesktopUser(CreateDesktopUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopUserRequest 请求对象
     * @return SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public SyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserInvoker(
        CreateDesktopUserRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return SyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public SyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserInvoker(DeleteUserRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 用户模板下载
     *
     * 该接口用于用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserListTemplateRequest 请求对象
     * @return ExportUserListTemplateResponse
     */
    public ExportUserListTemplateResponse exportUserListTemplate(ExportUserListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUserListTemplate);
    }

    /**
     * 用户模板下载
     *
     * 该接口用于用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserListTemplateRequest 请求对象
     * @return SyncInvoker<ExportUserListTemplateRequest, ExportUserListTemplateResponse>
     */
    public SyncInvoker<ExportUserListTemplateRequest, ExportUserListTemplateResponse> exportUserListTemplateInvoker(
        ExportUserListTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUserListTemplate, hcClient);
    }

    /**
     * 创建用户模板下载
     *
     * 该接口用于创建用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersTemplateRequest 请求对象
     * @return ExportUsersTemplateResponse
     */
    public ExportUsersTemplateResponse exportUsersTemplate(ExportUsersTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUsersTemplate);
    }

    /**
     * 创建用户模板下载
     *
     * 该接口用于创建用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersTemplateRequest 请求对象
     * @return SyncInvoker<ExportUsersTemplateRequest, ExportUsersTemplateResponse>
     */
    public SyncInvoker<ExportUsersTemplateRequest, ExportUsersTemplateResponse> exportUsersTemplateInvoker(
        ExportUsersTemplateRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUsersTemplate, hcClient);
    }

    /**
     * 导入用户列表
     *
     * 该接口用于导入用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserListRequest 请求对象
     * @return ImportUserListResponse
     */
    public ImportUserListResponse importUserList(ImportUserListRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.importUserList);
    }

    /**
     * 导入用户列表
     *
     * 该接口用于导入用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserListRequest 请求对象
     * @return SyncInvoker<ImportUserListRequest, ImportUserListResponse>
     */
    public SyncInvoker<ImportUserListRequest, ImportUserListResponse> importUserListInvoker(
        ImportUserListRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.importUserList, hcClient);
    }

    /**
     * 查询通知拦截记录
     *
     * 查询通知拦截记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRecordsRequest 请求对象
     * @return ListNotificationRecordsResponse
     */
    public ListNotificationRecordsResponse listNotificationRecords(ListNotificationRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listNotificationRecords);
    }

    /**
     * 查询通知拦截记录
     *
     * 查询通知拦截记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationRecordsRequest 请求对象
     * @return SyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse>
     */
    public SyncInvoker<ListNotificationRecordsRequest, ListNotificationRecordsResponse> listNotificationRecordsInvoker(
        ListNotificationRecordsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listNotificationRecords, hcClient);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtpDevicesByUserIdRequest 请求对象
     * @return ListOtpDevicesByUserIdResponse
     */
    public ListOtpDevicesByUserIdResponse listOtpDevicesByUserId(ListOtpDevicesByUserIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listOtpDevicesByUserId);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtpDevicesByUserIdRequest 请求对象
     * @return SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public SyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listOtpDevicesByUserId, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDetailRequest 请求对象
     * @return ListUserDetailResponse
     */
    public ListUserDetailResponse listUserDetail(ListUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDetailRequest 请求对象
     * @return SyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public SyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailInvoker(
        ListUserDetailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserDetail, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRandomPasswordRequest 请求对象
     * @return ResetRandomPasswordResponse
     */
    public ResetRandomPasswordResponse resetRandomPassword(ResetRandomPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.resetRandomPassword);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRandomPasswordRequest 请求对象
     * @return SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>
     */
    public SyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPasswordInvoker(
        ResetRandomPasswordRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.resetRandomPassword, hcClient);
    }

    /**
     * 重新发送邮件
     *
     * 该接口用于重新发送邮件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendEmailRequest 请求对象
     * @return SendEmailResponse
     */
    public SendEmailResponse sendEmail(SendEmailRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.sendEmail);
    }

    /**
     * 重新发送邮件
     *
     * 该接口用于重新发送邮件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendEmailRequest 请求对象
     * @return SyncInvoker<SendEmailRequest, SendEmailResponse>
     */
    public SyncInvoker<SendEmailRequest, SendEmailResponse> sendEmailInvoker(SendEmailRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.sendEmail, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInfoRequest 请求对象
     * @return UpdateUserInfoResponse
     */
    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInfoRequest 请求对象
     * @return SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public SyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoInvoker(
        UpdateUserInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateUserInfo, hcClient);
    }

    /**
     * 查询用户事件
     *
     * 查询用户事件，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsRequest 请求对象
     * @return ListUserEventsResponse
     */
    public ListUserEventsResponse listUserEvents(ListUserEventsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserEvents);
    }

    /**
     * 查询用户事件
     *
     * 查询用户事件，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsRequest 请求对象
     * @return SyncInvoker<ListUserEventsRequest, ListUserEventsResponse>
     */
    public SyncInvoker<ListUserEventsRequest, ListUserEventsResponse> listUserEventsInvoker(
        ListUserEventsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserEvents, hcClient);
    }

    /**
     * 查询用户事件LTS配置
     *
     * 查询用户事件LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsLtsConfigurationsRequest 请求对象
     * @return ListUserEventsLtsConfigurationsResponse
     */
    public ListUserEventsLtsConfigurationsResponse listUserEventsLtsConfigurations(
        ListUserEventsLtsConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listUserEventsLtsConfigurations);
    }

    /**
     * 查询用户事件LTS配置
     *
     * 查询用户事件LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsLtsConfigurationsRequest 请求对象
     * @return SyncInvoker<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse>
     */
    public SyncInvoker<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse> listUserEventsLtsConfigurationsInvoker(
        ListUserEventsLtsConfigurationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listUserEventsLtsConfigurations, hcClient);
    }

    /**
     * 配置用户事件LTS
     *
     * 配置用户事件LTS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserEventsLtsConfigurationsRequest 请求对象
     * @return SetUserEventsLtsConfigurationsResponse
     */
    public SetUserEventsLtsConfigurationsResponse setUserEventsLtsConfigurations(
        SetUserEventsLtsConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.setUserEventsLtsConfigurations);
    }

    /**
     * 配置用户事件LTS
     *
     * 配置用户事件LTS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserEventsLtsConfigurationsRequest 请求对象
     * @return SyncInvoker<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse>
     */
    public SyncInvoker<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse> setUserEventsLtsConfigurationsInvoker(
        SetUserEventsLtsConfigurationsRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.setUserEventsLtsConfigurations, hcClient);
    }

    /**
     * 导出用户
     *
     * 以excel文件形式导出用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersNewRequest 请求对象
     * @return ExportUsersNewResponse
     */
    public ExportUsersNewResponse exportUsersNew(ExportUsersNewRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.exportUsersNew);
    }

    /**
     * 导出用户
     *
     * 以excel文件形式导出用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersNewRequest 请求对象
     * @return SyncInvoker<ExportUsersNewRequest, ExportUsersNewResponse>
     */
    public SyncInvoker<ExportUsersNewRequest, ExportUsersNewResponse> exportUsersNewInvoker(
        ExportUsersNewRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.exportUsersNew, hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 给单个桌面增加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopVolumesRequest 请求对象
     * @return AddDesktopVolumesResponse
     */
    public AddDesktopVolumesResponse addDesktopVolumes(AddDesktopVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addDesktopVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 给单个桌面增加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopVolumesRequest 请求对象
     * @return SyncInvoker<AddDesktopVolumesRequest, AddDesktopVolumesResponse>
     */
    public SyncInvoker<AddDesktopVolumesRequest, AddDesktopVolumesResponse> addDesktopVolumesInvoker(
        AddDesktopVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addDesktopVolumes, hcClient);
    }

    /**
     * 批量增加桌面磁盘
     *
     * 批量增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVolumesRequest 请求对象
     * @return AddVolumesResponse
     */
    public AddVolumesResponse addVolumes(AddVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 批量增加桌面磁盘
     *
     * 批量增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVolumesRequest 请求对象
     * @return SyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public SyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesInvoker(AddVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 批量修改磁盘QOS
     *
     * 批量修改磁盘QOS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyQosVolumesRequest 请求对象
     * @return BatchModifyQosVolumesResponse
     */
    public BatchModifyQosVolumesResponse batchModifyQosVolumes(BatchModifyQosVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.batchModifyQosVolumes);
    }

    /**
     * 批量修改磁盘QOS
     *
     * 批量修改磁盘QOS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyQosVolumesRequest 请求对象
     * @return SyncInvoker<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse>
     */
    public SyncInvoker<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse> batchModifyQosVolumesInvoker(
        BatchModifyQosVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.batchModifyQosVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopVolumesRequest 请求对象
     * @return DeleteDesktopVolumesResponse
     */
    public DeleteDesktopVolumesResponse deleteDesktopVolumes(DeleteDesktopVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.deleteDesktopVolumes);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopVolumesRequest 请求对象
     * @return SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public SyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesInvoker(
        DeleteDesktopVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.deleteDesktopVolumes, hcClient);
    }

    /**
     * 扩容磁盘
     *
     * 扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopVolumeRequest 请求对象
     * @return ExpandDesktopVolumeResponse
     */
    public ExpandDesktopVolumeResponse expandDesktopVolume(ExpandDesktopVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandDesktopVolume);
    }

    /**
     * 扩容磁盘
     *
     * 扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopVolumeRequest 请求对象
     * @return SyncInvoker<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse>
     */
    public SyncInvoker<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse> expandDesktopVolumeInvoker(
        ExpandDesktopVolumeRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.expandDesktopVolume, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandVolumesRequest 请求对象
     * @return ExpandVolumesResponse
     */
    public ExpandVolumesResponse expandVolumes(ExpandVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandVolumesRequest 请求对象
     * @return SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public SyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesInvoker(ExpandVolumesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.expandVolumes, hcClient);
    }

    /**
     * 查询磁盘产品信息
     *
     * 查询磁盘产品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeProductInfoRequest 请求对象
     * @return ListVolumeProductInfoResponse
     */
    public ListVolumeProductInfoResponse listVolumeProductInfo(ListVolumeProductInfoRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listVolumeProductInfo);
    }

    /**
     * 查询磁盘产品信息
     *
     * 查询磁盘产品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeProductInfoRequest 请求对象
     * @return SyncInvoker<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse>
     */
    public SyncInvoker<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse> listVolumeProductInfoInvoker(
        ListVolumeProductInfoRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listVolumeProductInfo, hcClient);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyWorkspaceRequest 请求对象
     * @return ApplyWorkspaceResponse
     */
    public ApplyWorkspaceResponse applyWorkspace(ApplyWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
    }

    /**
     * 开通云办公服务
     *
     * 该接口用于开通云办公服务。
     * 
     * 作为异步接口，调用成功说明云办公服务后台收到了开通请求，但服务是否开通成功需要通过任务查询接口(GET /v2/{project_id}/workspace-sub-jobs)查询该任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyWorkspaceRequest 请求对象
     * @return SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public SyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceInvoker(
        ApplyWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.applyWorkspace, hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelWorkspaceRequest 请求对象
     * @return CancelWorkspaceResponse
     */
    public CancelWorkspaceResponse cancelWorkspace(CancelWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelWorkspaceRequest 请求对象
     * @return SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public SyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceInvoker(
        CancelWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.cancelWorkspace, hcClient);
    }

    /**
     * 检查企业ID是否已被使用
     *
     * 检查企业ID是否已被使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEnterpriseIdRequest 请求对象
     * @return CheckEnterpriseIdResponse
     */
    public CheckEnterpriseIdResponse checkEnterpriseId(CheckEnterpriseIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.checkEnterpriseId);
    }

    /**
     * 检查企业ID是否已被使用
     *
     * 检查企业ID是否已被使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEnterpriseIdRequest 请求对象
     * @return SyncInvoker<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse>
     */
    public SyncInvoker<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse> checkEnterpriseIdInvoker(
        CheckEnterpriseIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.checkEnterpriseId, hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.listWorkspaces, hcClient);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceLockRequest 请求对象
     * @return ShowWorkspaceLockResponse
     */
    public ShowWorkspaceLockResponse showWorkspaceLock(ShowWorkspaceLockRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.showWorkspaceLock);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceLockRequest 请求对象
     * @return SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public SyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockInvoker(
        ShowWorkspaceLockRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.showWorkspaceLock, hcClient);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockWorkspaceRequest 请求对象
     * @return UnlockWorkspaceResponse
     */
    public UnlockWorkspaceResponse unlockWorkspace(UnlockWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.unlockWorkspace);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockWorkspaceRequest 请求对象
     * @return SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public SyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceInvoker(
        UnlockWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.unlockWorkspace, hcClient);
    }

    /**
     * 修改企业ID
     *
     * 修改租户的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseIdRequest 请求对象
     * @return UpdateEnterpriseIdResponse
     */
    public UpdateEnterpriseIdResponse updateEnterpriseId(UpdateEnterpriseIdRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateEnterpriseId);
    }

    /**
     * 修改企业ID
     *
     * 修改租户的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseIdRequest 请求对象
     * @return SyncInvoker<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse>
     */
    public SyncInvoker<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse> updateEnterpriseIdInvoker(
        UpdateEnterpriseIdRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateEnterpriseId, hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.updateWorkspace, hcClient);
    }

    /**
     * 校验域控有效性
     *
     * 校验域控有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDomainControllerRequest 请求对象
     * @return ValidateDomainControllerResponse
     */
    public ValidateDomainControllerResponse validateDomainController(ValidateDomainControllerRequest request) {
        return hcClient.syncInvokeHttp(request, WorkspaceMeta.validateDomainController);
    }

    /**
     * 校验域控有效性
     *
     * 校验域控有效性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDomainControllerRequest 请求对象
     * @return SyncInvoker<ValidateDomainControllerRequest, ValidateDomainControllerResponse>
     */
    public SyncInvoker<ValidateDomainControllerRequest, ValidateDomainControllerResponse> validateDomainControllerInvoker(
        ValidateDomainControllerRequest request) {
        return new SyncInvoker<>(request, WorkspaceMeta.validateDomainController, hcClient);
    }

}

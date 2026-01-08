package com.huaweicloud.sdk.workspace.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class WorkspaceAsyncClient {

    protected HcClient hcClient;

    public WorkspaceAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WorkspaceAsyncClient> newBuilder() {
        ClientBuilder<WorkspaceAsyncClient> clientBuilder = new ClientBuilder<>(WorkspaceAsyncClient::new);
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
     * @return CompletableFuture<ListAccessAddressBackupConfigResponse>
     */
    public CompletableFuture<ListAccessAddressBackupConfigResponse> listAccessAddressBackupConfigAsync(
        ListAccessAddressBackupConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAccessAddressBackupConfig);
    }

    /**
     * 获取云办公服务接入地址备份配置
     *
     * 该接口用于获取云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessAddressBackupConfigRequest 请求对象
     * @return AsyncInvoker<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse>
     */
    public AsyncInvoker<ListAccessAddressBackupConfigRequest, ListAccessAddressBackupConfigResponse> listAccessAddressBackupConfigAsyncInvoker(
        ListAccessAddressBackupConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAccessAddressBackupConfig, hcClient);
    }

    /**
     * 修改云办公服务接入地址备份配置
     *
     * 该接口用于修改云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessAddressBackupConfigRequest 请求对象
     * @return CompletableFuture<UpdateAccessAddressBackupConfigResponse>
     */
    public CompletableFuture<UpdateAccessAddressBackupConfigResponse> updateAccessAddressBackupConfigAsync(
        UpdateAccessAddressBackupConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAccessAddressBackupConfig);
    }

    /**
     * 修改云办公服务接入地址备份配置
     *
     * 该接口用于修改云办公服务接入地址备份配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessAddressBackupConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse>
     */
    public AsyncInvoker<UpdateAccessAddressBackupConfigRequest, UpdateAccessAddressBackupConfigResponse> updateAccessAddressBackupConfigAsyncInvoker(
        UpdateAccessAddressBackupConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAccessAddressBackupConfig, hcClient);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAccessPoliciesResponse>
     */
    public CompletableFuture<BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesAsync(
        BatchDeleteAccessPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteAccessPolicies);
    }

    /**
     * 删除接入策略
     *
     * 该接口用于删除指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAccessPoliciesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse>
     */
    public AsyncInvoker<BatchDeleteAccessPoliciesRequest, BatchDeleteAccessPoliciesResponse> batchDeleteAccessPoliciesAsyncInvoker(
        BatchDeleteAccessPoliciesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteAccessPolicies, hcClient);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPolicyRequest 请求对象
     * @return CompletableFuture<CreateAccessPolicyResponse>
     */
    public CompletableFuture<CreateAccessPolicyResponse> createAccessPolicyAsync(CreateAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createAccessPolicy);
    }

    /**
     * 创建接入策略
     *
     * 该接口用于创建接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse>
     */
    public AsyncInvoker<CreateAccessPolicyRequest, CreateAccessPolicyResponse> createAccessPolicyAsyncInvoker(
        CreateAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createAccessPolicy, hcClient);
    }

    /**
     * 导入ip模板下载
     *
     * 该接口用于导入Ip模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpTemplateRequest 请求对象
     * @return CompletableFuture<ExportIpTemplateResponse>
     */
    public CompletableFuture<ExportIpTemplateResponse> exportIpTemplateAsync(ExportIpTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportIpTemplate);
    }

    /**
     * 导入ip模板下载
     *
     * 该接口用于导入Ip模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportIpTemplateRequest 请求对象
     * @return AsyncInvoker<ExportIpTemplateRequest, ExportIpTemplateResponse>
     */
    public AsyncInvoker<ExportIpTemplateRequest, ExportIpTemplateResponse> exportIpTemplateAsyncInvoker(
        ExportIpTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportIpTemplate, hcClient);
    }

    /**
     * 导入ip列表
     *
     * 以excel文件形式导入ip列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpRequest 请求对象
     * @return CompletableFuture<ImportIpResponse>
     */
    public CompletableFuture<ImportIpResponse> importIpAsync(ImportIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.importIp);
    }

    /**
     * 导入ip列表
     *
     * 以excel文件形式导入ip列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportIpRequest 请求对象
     * @return AsyncInvoker<ImportIpRequest, ImportIpResponse>
     */
    public AsyncInvoker<ImportIpRequest, ImportIpResponse> importIpAsyncInvoker(ImportIpRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.importIp, hcClient);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPoliciesRequest 请求对象
     * @return CompletableFuture<ListAccessPoliciesResponse>
     */
    public CompletableFuture<ListAccessPoliciesResponse> listAccessPoliciesAsync(ListAccessPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAccessPolicies);
    }

    /**
     * 查询接入策略
     *
     * 该接口用于查询接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPoliciesRequest 请求对象
     * @return AsyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse>
     */
    public AsyncInvoker<ListAccessPoliciesRequest, ListAccessPoliciesResponse> listAccessPoliciesAsyncInvoker(
        ListAccessPoliciesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAccessPolicies, hcClient);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPolicyObjectsRequest 请求对象
     * @return CompletableFuture<ListAccessPolicyObjectsResponse>
     */
    public CompletableFuture<ListAccessPolicyObjectsResponse> listAccessPolicyObjectsAsync(
        ListAccessPolicyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAccessPolicyObjects);
    }

    /**
     * 查询指定接入策略的应用对象
     *
     * 该接口用于查询指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPolicyObjectsRequest 请求对象
     * @return AsyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse>
     */
    public AsyncInvoker<ListAccessPolicyObjectsRequest, ListAccessPolicyObjectsResponse> listAccessPolicyObjectsAsyncInvoker(
        ListAccessPolicyObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAccessPolicyObjects, hcClient);
    }

    /**
     * 更新指定接入策略
     *
     * 该接口用于更新指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAccessPolicyResponse>
     */
    public CompletableFuture<UpdateAccessPolicyResponse> updateAccessPolicyAsync(UpdateAccessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAccessPolicy);
    }

    /**
     * 更新指定接入策略
     *
     * 该接口用于更新指定接入策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse>
     */
    public AsyncInvoker<UpdateAccessPolicyRequest, UpdateAccessPolicyResponse> updateAccessPolicyAsyncInvoker(
        UpdateAccessPolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAccessPolicy, hcClient);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
     * @return CompletableFuture<UpdateAccessPolicyObjectsResponse>
     */
    public CompletableFuture<UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsAsync(
        UpdateAccessPolicyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAccessPolicyObjects);
    }

    /**
     * 更新指定接入策略的应用对象
     *
     * 该接口用于更新指定接入策略的应用对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessPolicyObjectsRequest 请求对象
     * @return AsyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse>
     */
    public AsyncInvoker<UpdateAccessPolicyObjectsRequest, UpdateAccessPolicyObjectsResponse> updateAccessPolicyObjectsAsyncInvoker(
        UpdateAccessPolicyObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAccessPolicyObjects, hcClient);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return CompletableFuture<CreateAgenciesResponse>
     */
    public CompletableFuture<CreateAgenciesResponse> createAgenciesAsync(CreateAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createAgencies);
    }

    /**
     * 开通委托功能
     *
     * 开通委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesAsyncInvoker(
        CreateAgenciesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createAgencies, hcClient);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAgencies);
    }

    /**
     * 查询委托功能
     *
     * 查询委托功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAgencies, hcClient);
    }

    /**
     * 查询告警统计
     *
     * 返回各级别告警数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsRequest 请求对象
     * @return CompletableFuture<ListAlarmStatisticsResponse>
     */
    public CompletableFuture<ListAlarmStatisticsResponse> listAlarmStatisticsAsync(ListAlarmStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAlarmStatistics);
    }

    /**
     * 查询告警统计
     *
     * 返回各级别告警数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsRequest 请求对象
     * @return AsyncInvoker<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse>
     */
    public AsyncInvoker<ListAlarmStatisticsRequest, ListAlarmStatisticsResponse> listAlarmStatisticsAsyncInvoker(
        ListAlarmStatisticsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAlarmStatistics, hcClient);
    }

    /**
     * 查询告警列表
     *
     * 从ces查询告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmsResponse>
     */
    public CompletableFuture<ListAlarmsResponse> listAlarmsAsync(ListAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAlarms);
    }

    /**
     * 查询告警列表
     *
     * 从ces查询告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsAsyncInvoker(ListAlarmsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAlarms, hcClient);
    }

    /**
     * 批量删除应用
     *
     * 批量删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppsRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppsResponse>
     */
    public CompletableFuture<BatchDeleteAppsResponse> batchDeleteAppsAsync(BatchDeleteAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteApps);
    }

    /**
     * 批量删除应用
     *
     * 批量删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppsRequest, BatchDeleteAppsResponse>
     */
    public AsyncInvoker<BatchDeleteAppsRequest, BatchDeleteAppsResponse> batchDeleteAppsAsyncInvoker(
        BatchDeleteAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteApps, hcClient);
    }

    /**
     * 批量删除job
     *
     * 批量删除job。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteJobsResponse>
     */
    public CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobsAsync(BatchDeleteJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteJobs);
    }

    /**
     * 批量删除job
     *
     * 批量删除job。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse>
     */
    public AsyncInvoker<BatchDeleteJobsRequest, BatchDeleteJobsResponse> batchDeleteJobsAsyncInvoker(
        BatchDeleteJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteJobs, hcClient);
    }

    /**
     * 批量设置不可见
     *
     * 批量设置不可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppsRequest 请求对象
     * @return CompletableFuture<BatchDisableAppsResponse>
     */
    public CompletableFuture<BatchDisableAppsResponse> batchDisableAppsAsync(BatchDisableAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDisableApps);
    }

    /**
     * 批量设置不可见
     *
     * 批量设置不可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisableAppsRequest 请求对象
     * @return AsyncInvoker<BatchDisableAppsRequest, BatchDisableAppsResponse>
     */
    public AsyncInvoker<BatchDisableAppsRequest, BatchDisableAppsResponse> batchDisableAppsAsyncInvoker(
        BatchDisableAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDisableApps, hcClient);
    }

    /**
     * 批量设置可见
     *
     * 批量设置可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppsRequest 请求对象
     * @return CompletableFuture<BatchEnableAppsResponse>
     */
    public CompletableFuture<BatchEnableAppsResponse> batchEnableAppsAsync(BatchEnableAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchEnableApps);
    }

    /**
     * 批量设置可见
     *
     * 批量设置可见。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchEnableAppsRequest 请求对象
     * @return AsyncInvoker<BatchEnableAppsRequest, BatchEnableAppsResponse>
     */
    public AsyncInvoker<BatchEnableAppsRequest, BatchEnableAppsResponse> batchEnableAppsAsyncInvoker(
        BatchEnableAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchEnableApps, hcClient);
    }

    /**
     * 批量自动安装安装应用
     *
     * 批量自动安装安装应用 (应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAppsRequest 请求对象
     * @return CompletableFuture<BatchInstallAppsResponse>
     */
    public CompletableFuture<BatchInstallAppsResponse> batchInstallAppsAsync(BatchInstallAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchInstallApps);
    }

    /**
     * 批量自动安装安装应用
     *
     * 批量自动安装安装应用 (应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAppsRequest 请求对象
     * @return AsyncInvoker<BatchInstallAppsRequest, BatchInstallAppsResponse>
     */
    public AsyncInvoker<BatchInstallAppsRequest, BatchInstallAppsResponse> batchInstallAppsAsyncInvoker(
        BatchInstallAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchInstallApps, hcClient);
    }

    /**
     * 批量设置应用授权
     *
     * 批量设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAppAuthorizationsRequest 请求对象
     * @return CompletableFuture<BatchUpdateAppAuthorizationsResponse>
     */
    public CompletableFuture<BatchUpdateAppAuthorizationsResponse> batchUpdateAppAuthorizationsAsync(
        BatchUpdateAppAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchUpdateAppAuthorizations);
    }

    /**
     * 批量设置应用授权
     *
     * 批量设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAppAuthorizationsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse>
     */
    public AsyncInvoker<BatchUpdateAppAuthorizationsRequest, BatchUpdateAppAuthorizationsResponse> batchUpdateAppAuthorizationsAsyncInvoker(
        BatchUpdateAppAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchUpdateAppAuthorizations, hcClient);
    }

    /**
     * 添加并授权默认桶
     *
     * 添加并授权默认桶,桶不存在时会自动创建OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndAuthorizeBucketRequest 请求对象
     * @return CompletableFuture<CreateAndAuthorizeBucketResponse>
     */
    public CompletableFuture<CreateAndAuthorizeBucketResponse> createAndAuthorizeBucketAsync(
        CreateAndAuthorizeBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createAndAuthorizeBucket);
    }

    /**
     * 添加并授权默认桶
     *
     * 添加并授权默认桶,桶不存在时会自动创建OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAndAuthorizeBucketRequest 请求对象
     * @return AsyncInvoker<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse>
     */
    public AsyncInvoker<CreateAndAuthorizeBucketRequest, CreateAndAuthorizeBucketResponse> createAndAuthorizeBucketAsyncInvoker(
        CreateAndAuthorizeBucketRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createAndAuthorizeBucket, hcClient);
    }

    /**
     * 生成访问凭证信息
     *
     * 生成桶凭证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketCredentialRequest 请求对象
     * @return CompletableFuture<CreateBucketCredentialResponse>
     */
    public CompletableFuture<CreateBucketCredentialResponse> createBucketCredentialAsync(
        CreateBucketCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createBucketCredential);
    }

    /**
     * 生成访问凭证信息
     *
     * 生成桶凭证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBucketCredentialRequest 请求对象
     * @return AsyncInvoker<CreateBucketCredentialRequest, CreateBucketCredentialResponse>
     */
    public AsyncInvoker<CreateBucketCredentialRequest, CreateBucketCredentialResponse> createBucketCredentialAsyncInvoker(
        CreateBucketCredentialRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createBucketCredential, hcClient);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteApp, hcClient);
    }

    /**
     * 自动安装应用
     *
     * 自动安装应用(应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallAppRequest 请求对象
     * @return CompletableFuture<InstallAppResponse>
     */
    public CompletableFuture<InstallAppResponse> installAppAsync(InstallAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.installApp);
    }

    /**
     * 自动安装应用
     *
     * 自动安装应用(应用需支持静默安装或者解压安装)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallAppRequest 请求对象
     * @return AsyncInvoker<InstallAppRequest, InstallAppResponse>
     */
    public AsyncInvoker<InstallAppRequest, InstallAppResponse> installAppAsyncInvoker(InstallAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.installApp, hcClient);
    }

    /**
     * 查询应用授权信息
     *
     * 查询应用授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppAuthorizationsRequest 请求对象
     * @return CompletableFuture<ListAppAuthorizationsResponse>
     */
    public CompletableFuture<ListAppAuthorizationsResponse> listAppAuthorizationsAsync(
        ListAppAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAppAuthorizations);
    }

    /**
     * 查询应用授权信息
     *
     * 查询应用授权信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppAuthorizationsRequest 请求对象
     * @return AsyncInvoker<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse>
     */
    public AsyncInvoker<ListAppAuthorizationsRequest, ListAppAuthorizationsResponse> listAppAuthorizationsAsyncInvoker(
        ListAppAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAppAuthorizations, hcClient);
    }

    /**
     * 查询应用分类信息
     *
     * 查询应用分类信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCatalogsRequest 请求对象
     * @return CompletableFuture<ListAppCatalogsResponse>
     */
    public CompletableFuture<ListAppCatalogsResponse> listAppCatalogsAsync(ListAppCatalogsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAppCatalogs);
    }

    /**
     * 查询应用分类信息
     *
     * 查询应用分类信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppCatalogsRequest 请求对象
     * @return AsyncInvoker<ListAppCatalogsRequest, ListAppCatalogsResponse>
     */
    public AsyncInvoker<ListAppCatalogsRequest, ListAppCatalogsResponse> listAppCatalogsAsyncInvoker(
        ListAppCatalogsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAppCatalogs, hcClient);
    }

    /**
     * 按照名称分页查询应用
     *
     * 按照名称分页查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listApps);
    }

    /**
     * 按照名称分页查询应用
     *
     * 按照名称分页查询应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listApps, hcClient);
    }

    /**
     * 查询应用安装job信息
     *
     * 查询应用安装job信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return CompletableFuture<ListJobsResponse>
     */
    public CompletableFuture<ListJobsResponse> listJobsAsync(ListJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listJobs);
    }

    /**
     * 查询应用安装job信息
     *
     * 查询应用安装job信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return AsyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public AsyncInvoker<ListJobsRequest, ListJobsResponse> listJobsAsyncInvoker(ListJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listJobs, hcClient);
    }

    /**
     * 重试失败job
     *
     * 重试指定失败job(仅支持失败job重试，其他类型job重试会响应错误)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobsRequest 请求对象
     * @return CompletableFuture<RetryJobsResponse>
     */
    public CompletableFuture<RetryJobsResponse> retryJobsAsync(RetryJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.retryJobs);
    }

    /**
     * 重试失败job
     *
     * 重试指定失败job(仅支持失败job重试，其他类型job重试会响应错误)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryJobsRequest 请求对象
     * @return AsyncInvoker<RetryJobsRequest, RetryJobsResponse>
     */
    public AsyncInvoker<RetryJobsRequest, RetryJobsResponse> retryJobsAsyncInvoker(RetryJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.retryJobs, hcClient);
    }

    /**
     * 设置应用授权
     *
     * 设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAuthorizationsRequest 请求对象
     * @return CompletableFuture<UpdateAppAuthorizationsResponse>
     */
    public CompletableFuture<UpdateAppAuthorizationsResponse> updateAppAuthorizationsAsync(
        UpdateAppAuthorizationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAppAuthorizations);
    }

    /**
     * 设置应用授权
     *
     * 设置应用授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppAuthorizationsRequest 请求对象
     * @return AsyncInvoker<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse>
     */
    public AsyncInvoker<UpdateAppAuthorizationsRequest, UpdateAppAuthorizationsResponse> updateAppAuthorizationsAsyncInvoker(
        UpdateAppAuthorizationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAppAuthorizations, hcClient);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUploadedAppRequest 请求对象
     * @return CompletableFuture<UpdateUploadedAppResponse>
     */
    public CompletableFuture<UpdateUploadedAppResponse> updateUploadedAppAsync(UpdateUploadedAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUploadedApp);
    }

    /**
     * 修改应用
     *
     * 修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUploadedAppRequest 请求对象
     * @return AsyncInvoker<UpdateUploadedAppRequest, UpdateUploadedAppResponse>
     */
    public AsyncInvoker<UpdateUploadedAppRequest, UpdateUploadedAppResponse> updateUploadedAppAsyncInvoker(
        UpdateUploadedAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateUploadedApp, hcClient);
    }

    /**
     * 添加应用
     *
     * 添加应用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppRequest 请求对象
     * @return CompletableFuture<UploadAppResponse>
     */
    public CompletableFuture<UploadAppResponse> uploadAppAsync(UploadAppRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.uploadApp);
    }

    /**
     * 添加应用
     *
     * 添加应用应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAppRequest 请求对象
     * @return AsyncInvoker<UploadAppRequest, UploadAppResponse>
     */
    public AsyncInvoker<UploadAppRequest, UploadAppResponse> uploadAppAsyncInvoker(UploadAppRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.uploadApp, hcClient);
    }

    /**
     * 增加管控规则
     *
     * 增加管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRestrictedRuleRequest 请求对象
     * @return CompletableFuture<AddRestrictedRuleResponse>
     */
    public CompletableFuture<AddRestrictedRuleResponse> addRestrictedRuleAsync(AddRestrictedRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addRestrictedRule);
    }

    /**
     * 增加管控规则
     *
     * 增加管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRestrictedRuleRequest 请求对象
     * @return AsyncInvoker<AddRestrictedRuleRequest, AddRestrictedRuleResponse>
     */
    public AsyncInvoker<AddRestrictedRuleRequest, AddRestrictedRuleResponse> addRestrictedRuleAsyncInvoker(
        AddRestrictedRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addRestrictedRule, hcClient);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAppRulesResponse>
     */
    public CompletableFuture<BatchDeleteAppRulesResponse> batchDeleteAppRulesAsync(BatchDeleteAppRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteAppRules);
    }

    /**
     * 批量删除规则
     *
     * 批量删除规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAppRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAppRulesRequest, BatchDeleteAppRulesResponse> batchDeleteAppRulesAsyncInvoker(
        BatchDeleteAppRulesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteAppRules, hcClient);
    }

    /**
     * 创建应用规则
     *
     * 创建应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRuleRequest 请求对象
     * @return CompletableFuture<CreateAppRuleResponse>
     */
    public CompletableFuture<CreateAppRuleResponse> createAppRuleAsync(CreateAppRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createAppRule);
    }

    /**
     * 创建应用规则
     *
     * 创建应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRuleRequest 请求对象
     * @return AsyncInvoker<CreateAppRuleRequest, CreateAppRuleResponse>
     */
    public AsyncInvoker<CreateAppRuleRequest, CreateAppRuleResponse> createAppRuleAsyncInvoker(
        CreateAppRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createAppRule, hcClient);
    }

    /**
     * 删除应用规则
     *
     * 删除应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRuleRequest 请求对象
     * @return CompletableFuture<DeleteAppRuleResponse>
     */
    public CompletableFuture<DeleteAppRuleResponse> deleteAppRuleAsync(DeleteAppRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteAppRule);
    }

    /**
     * 删除应用规则
     *
     * 删除应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAppRuleRequest, DeleteAppRuleResponse>
     */
    public AsyncInvoker<DeleteAppRuleRequest, DeleteAppRuleResponse> deleteAppRuleAsyncInvoker(
        DeleteAppRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteAppRule, hcClient);
    }

    /**
     * 批量删除管控规则
     *
     * 批量删除管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRestrictedRuleRequest 请求对象
     * @return CompletableFuture<DeleteRestrictedRuleResponse>
     */
    public CompletableFuture<DeleteRestrictedRuleResponse> deleteRestrictedRuleAsync(
        DeleteRestrictedRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteRestrictedRule);
    }

    /**
     * 批量删除管控规则
     *
     * 批量删除管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRestrictedRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse>
     */
    public AsyncInvoker<DeleteRestrictedRuleRequest, DeleteRestrictedRuleResponse> deleteRestrictedRuleAsyncInvoker(
        DeleteRestrictedRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteRestrictedRule, hcClient);
    }

    /**
     * 禁用规则管控
     *
     * 禁用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableRuleRestrictionRequest 请求对象
     * @return CompletableFuture<DisableRuleRestrictionResponse>
     */
    public CompletableFuture<DisableRuleRestrictionResponse> disableRuleRestrictionAsync(
        DisableRuleRestrictionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.disableRuleRestriction);
    }

    /**
     * 禁用规则管控
     *
     * 禁用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableRuleRestrictionRequest 请求对象
     * @return AsyncInvoker<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse>
     */
    public AsyncInvoker<DisableRuleRestrictionRequest, DisableRuleRestrictionResponse> disableRuleRestrictionAsyncInvoker(
        DisableRuleRestrictionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.disableRuleRestriction, hcClient);
    }

    /**
     * 启用规则管控
     *
     * 启用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableRuleRestrictionRequest 请求对象
     * @return CompletableFuture<EnableRuleRestrictionResponse>
     */
    public CompletableFuture<EnableRuleRestrictionResponse> enableRuleRestrictionAsync(
        EnableRuleRestrictionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.enableRuleRestriction);
    }

    /**
     * 启用规则管控
     *
     * 启用规则管控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableRuleRestrictionRequest 请求对象
     * @return AsyncInvoker<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse>
     */
    public AsyncInvoker<EnableRuleRestrictionRequest, EnableRuleRestrictionResponse> enableRuleRestrictionAsyncInvoker(
        EnableRuleRestrictionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.enableRuleRestriction, hcClient);
    }

    /**
     * 查询应用规则
     *
     * 查询应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRuleRequest 请求对象
     * @return CompletableFuture<ListAppRuleResponse>
     */
    public CompletableFuture<ListAppRuleResponse> listAppRuleAsync(ListAppRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAppRule);
    }

    /**
     * 查询应用规则
     *
     * 查询应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppRuleRequest 请求对象
     * @return AsyncInvoker<ListAppRuleRequest, ListAppRuleResponse>
     */
    public AsyncInvoker<ListAppRuleRequest, ListAppRuleResponse> listAppRuleAsyncInvoker(ListAppRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAppRule, hcClient);
    }

    /**
     * 查询管控规则列表
     *
     * 查询管控规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestrictedRuleRequest 请求对象
     * @return CompletableFuture<ListRestrictedRuleResponse>
     */
    public CompletableFuture<ListRestrictedRuleResponse> listRestrictedRuleAsync(ListRestrictedRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listRestrictedRule);
    }

    /**
     * 查询管控规则列表
     *
     * 查询管控规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestrictedRuleRequest 请求对象
     * @return AsyncInvoker<ListRestrictedRuleRequest, ListRestrictedRuleResponse>
     */
    public AsyncInvoker<ListRestrictedRuleRequest, ListRestrictedRuleResponse> listRestrictedRuleAsyncInvoker(
        ListRestrictedRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listRestrictedRule, hcClient);
    }

    /**
     * 设置管控规则
     *
     * 设置管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRuleRestrictionRequest 请求对象
     * @return CompletableFuture<SetRuleRestrictionResponse>
     */
    public CompletableFuture<SetRuleRestrictionResponse> setRuleRestrictionAsync(SetRuleRestrictionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.setRuleRestriction);
    }

    /**
     * 设置管控规则
     *
     * 设置管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRuleRestrictionRequest 请求对象
     * @return AsyncInvoker<SetRuleRestrictionRequest, SetRuleRestrictionResponse>
     */
    public AsyncInvoker<SetRuleRestrictionRequest, SetRuleRestrictionResponse> setRuleRestrictionAsyncInvoker(
        SetRuleRestrictionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.setRuleRestriction, hcClient);
    }

    /**
     * 查询管控规则
     *
     * 查询管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRestrictionRequest 请求对象
     * @return CompletableFuture<ShowRuleRestrictionResponse>
     */
    public CompletableFuture<ShowRuleRestrictionResponse> showRuleRestrictionAsync(ShowRuleRestrictionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showRuleRestriction);
    }

    /**
     * 查询管控规则
     *
     * 查询管控规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRestrictionRequest 请求对象
     * @return AsyncInvoker<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse>
     */
    public AsyncInvoker<ShowRuleRestrictionRequest, ShowRuleRestrictionResponse> showRuleRestrictionAsyncInvoker(
        ShowRuleRestrictionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showRuleRestriction, hcClient);
    }

    /**
     * 修改应用规则
     *
     * 修改应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRuleRequest 请求对象
     * @return CompletableFuture<UpdateAppRuleResponse>
     */
    public CompletableFuture<UpdateAppRuleResponse> updateAppRuleAsync(UpdateAppRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAppRule);
    }

    /**
     * 修改应用规则
     *
     * 修改应用规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAppRuleRequest, UpdateAppRuleResponse>
     */
    public AsyncInvoker<UpdateAppRuleRequest, UpdateAppRuleResponse> updateAppRuleAsyncInvoker(
        UpdateAppRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAppRule, hcClient);
    }

    /**
     * 下载SAML 2.0元数据信息
     *
     * 下载SAML 2.0元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadMetadataRequest 请求对象
     * @return CompletableFuture<DownloadMetadataResponse>
     */
    public CompletableFuture<DownloadMetadataResponse> downloadMetadataAsync(DownloadMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.downloadMetadata);
    }

    /**
     * 下载SAML 2.0元数据信息
     *
     * 下载SAML 2.0元数据信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadMetadataRequest 请求对象
     * @return AsyncInvoker<DownloadMetadataRequest, DownloadMetadataResponse>
     */
    public AsyncInvoker<DownloadMetadataRequest, DownloadMetadataResponse> downloadMetadataAsyncInvoker(
        DownloadMetadataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.downloadMetadata, hcClient);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigRequest 请求对象
     * @return CompletableFuture<ShowAssistAuthConfigResponse>
     */
    public CompletableFuture<ShowAssistAuthConfigResponse> showAssistAuthConfigAsync(
        ShowAssistAuthConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfig);
    }

    /**
     * 查询辅助认证配置
     *
     * 查询辅助认证的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigRequest 请求对象
     * @return AsyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse>
     */
    public AsyncInvoker<ShowAssistAuthConfigRequest, ShowAssistAuthConfigResponse> showAssistAuthConfigAsyncInvoker(
        ShowAssistAuthConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showAssistAuthConfig, hcClient);
    }

    /**
     * 查询辅助认证应用对象列表
     *
     * 查询辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigApplyObjectsRequest 请求对象
     * @return CompletableFuture<ShowAssistAuthConfigApplyObjectsResponse>
     */
    public CompletableFuture<ShowAssistAuthConfigApplyObjectsResponse> showAssistAuthConfigApplyObjectsAsync(
        ShowAssistAuthConfigApplyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAssistAuthConfigApplyObjects);
    }

    /**
     * 查询辅助认证应用对象列表
     *
     * 查询辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssistAuthConfigApplyObjectsRequest 请求对象
     * @return AsyncInvoker<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse>
     */
    public AsyncInvoker<ShowAssistAuthConfigApplyObjectsRequest, ShowAssistAuthConfigApplyObjectsResponse> showAssistAuthConfigApplyObjectsAsyncInvoker(
        ShowAssistAuthConfigApplyObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showAssistAuthConfigApplyObjects, hcClient);
    }

    /**
     * 查询认证登录方式
     *
     * 查询认证登录方式配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthConfigRequest 请求对象
     * @return CompletableFuture<ShowAuthConfigResponse>
     */
    public CompletableFuture<ShowAuthConfigResponse> showAuthConfigAsync(ShowAuthConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAuthConfig);
    }

    /**
     * 查询认证登录方式
     *
     * 查询认证登录方式配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthConfigRequest 请求对象
     * @return AsyncInvoker<ShowAuthConfigRequest, ShowAuthConfigResponse>
     */
    public AsyncInvoker<ShowAuthConfigRequest, ShowAuthConfigResponse> showAuthConfigAsyncInvoker(
        ShowAuthConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showAuthConfig, hcClient);
    }

    /**
     * 更新辅助认证应用对象列表
     *
     * 更新辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthConfigApplyObjectsRequest 请求对象
     * @return CompletableFuture<UpdateAssistAuthConfigApplyObjectsResponse>
     */
    public CompletableFuture<UpdateAssistAuthConfigApplyObjectsResponse> updateAssistAuthConfigApplyObjectsAsync(
        UpdateAssistAuthConfigApplyObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAssistAuthConfigApplyObjects);
    }

    /**
     * 更新辅助认证应用对象列表
     *
     * 更新辅助认证应用对象列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthConfigApplyObjectsRequest 请求对象
     * @return AsyncInvoker<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse>
     */
    public AsyncInvoker<UpdateAssistAuthConfigApplyObjectsRequest, UpdateAssistAuthConfigApplyObjectsResponse> updateAssistAuthConfigApplyObjectsAsyncInvoker(
        UpdateAssistAuthConfigApplyObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAssistAuthConfigApplyObjects, hcClient);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
     * @return CompletableFuture<UpdateAssistAuthMethodConfigResponse>
     */
    public CompletableFuture<UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigAsync(
        UpdateAssistAuthMethodConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAssistAuthMethodConfig);
    }

    /**
     * 更新辅助认证策略配置
     *
     * 更新辅助认证策略配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssistAuthMethodConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse>
     */
    public AsyncInvoker<UpdateAssistAuthMethodConfigRequest, UpdateAssistAuthMethodConfigResponse> updateAssistAuthMethodConfigAsyncInvoker(
        UpdateAssistAuthMethodConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAssistAuthMethodConfig, hcClient);
    }

    /**
     * 更新认证策略配置
     *
     * 更新认证策略配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthMethodConfigRequest 请求对象
     * @return CompletableFuture<UpdateAuthMethodConfigResponse>
     */
    public CompletableFuture<UpdateAuthMethodConfigResponse> updateAuthMethodConfigAsync(
        UpdateAuthMethodConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAuthMethodConfig);
    }

    /**
     * 更新认证策略配置
     *
     * 更新认证策略配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuthMethodConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse>
     */
    public AsyncInvoker<UpdateAuthMethodConfigRequest, UpdateAuthMethodConfigResponse> updateAuthMethodConfigAsyncInvoker(
        UpdateAuthMethodConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAuthMethodConfig, hcClient);
    }

    /**
     * 校验配置是否合法（当前仅支持SAML2配置校验）
     *
     * 校验配置是否合法（当前仅支持SAML2配置校验）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigRequest 请求对象
     * @return CompletableFuture<ValidateConfigResponse>
     */
    public CompletableFuture<ValidateConfigResponse> validateConfigAsync(ValidateConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.validateConfig);
    }

    /**
     * 校验配置是否合法（当前仅支持SAML2配置校验）
     *
     * 校验配置是否合法（当前仅支持SAML2配置校验）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateConfigRequest 请求对象
     * @return AsyncInvoker<ValidateConfigRequest, ValidateConfigResponse>
     */
    public AsyncInvoker<ValidateConfigRequest, ValidateConfigResponse> validateConfigAsyncInvoker(
        ValidateConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.validateConfig, hcClient);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAvailabilityZones);
    }

    /**
     * 查询可用分区列表
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询可用分区列表概要
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzsRequest 请求对象
     * @return CompletableFuture<ListAzsResponse>
     */
    public CompletableFuture<ListAzsResponse> listAzsAsync(ListAzsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAzs);
    }

    /**
     * 查询可用分区列表概要
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAzsRequest 请求对象
     * @return AsyncInvoker<ListAzsRequest, ListAzsResponse>
     */
    public AsyncInvoker<ListAzsRequest, ListAzsResponse> listAzsAsyncInvoker(ListAzsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAzs, hcClient);
    }

    /**
     * 查询可用分区详情
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAzDetailsRequest 请求对象
     * @return CompletableFuture<ShowAzDetailsResponse>
     */
    public CompletableFuture<ShowAzDetailsResponse> showAzDetailsAsync(ShowAzDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAzDetails);
    }

    /**
     * 查询可用分区详情
     *
     * 该接口用于查询云桌面支持的可用分区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAzDetailsRequest 请求对象
     * @return AsyncInvoker<ShowAzDetailsRequest, ShowAzDetailsResponse>
     */
    public AsyncInvoker<ShowAzDetailsRequest, ShowAzDetailsResponse> showAzDetailsAsyncInvoker(
        ShowAzDetailsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showAzDetails, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertRequest 请求对象
     * @return CompletableFuture<CreateCertResponse>
     */
    public CompletableFuture<CreateCertResponse> createCertAsync(CreateCertRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createCert);
    }

    /**
     * 创建证书
     *
     * 创建证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertRequest 请求对象
     * @return AsyncInvoker<CreateCertRequest, CreateCertResponse>
     */
    public AsyncInvoker<CreateCertRequest, CreateCertResponse> createCertAsyncInvoker(CreateCertRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createCert, hcClient);
    }

    /**
     * 删除ca证书
     *
     * 删除ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertRequest 请求对象
     * @return CompletableFuture<DeleteCertResponse>
     */
    public CompletableFuture<DeleteCertResponse> deleteCertAsync(DeleteCertRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteCert);
    }

    /**
     * 删除ca证书
     *
     * 删除ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertRequest 请求对象
     * @return AsyncInvoker<DeleteCertRequest, DeleteCertResponse>
     */
    public AsyncInvoker<DeleteCertRequest, DeleteCertResponse> deleteCertAsyncInvoker(DeleteCertRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteCert, hcClient);
    }

    /**
     * 导出ca证书crl文件
     *
     * 导出ca证书crl文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCrlFileRequest 请求对象
     * @return CompletableFuture<ExportCertCrlFileResponse>
     */
    public CompletableFuture<ExportCertCrlFileResponse> exportCertCrlFileAsync(ExportCertCrlFileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportCertCrlFile);
    }

    /**
     * 导出ca证书crl文件
     *
     * 导出ca证书crl文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCrlFileRequest 请求对象
     * @return AsyncInvoker<ExportCertCrlFileRequest, ExportCertCrlFileResponse>
     */
    public AsyncInvoker<ExportCertCrlFileRequest, ExportCertCrlFileResponse> exportCertCrlFileAsyncInvoker(
        ExportCertCrlFileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportCertCrlFile, hcClient);
    }

    /**
     * 导出ca证书签名请求
     *
     * 导出ca证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCsrFileRequest 请求对象
     * @return CompletableFuture<ExportCertCsrFileResponse>
     */
    public CompletableFuture<ExportCertCsrFileResponse> exportCertCsrFileAsync(ExportCertCsrFileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportCertCsrFile);
    }

    /**
     * 导出ca证书签名请求
     *
     * 导出ca证书签名请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertCsrFileRequest 请求对象
     * @return AsyncInvoker<ExportCertCsrFileRequest, ExportCertCsrFileResponse>
     */
    public AsyncInvoker<ExportCertCsrFileRequest, ExportCertCsrFileResponse> exportCertCsrFileAsyncInvoker(
        ExportCertCsrFileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportCertCsrFile, hcClient);
    }

    /**
     * 导出ca证书pem文件
     *
     * 导出ca证书pem文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertPemFileRequest 请求对象
     * @return CompletableFuture<ExportCertPemFileResponse>
     */
    public CompletableFuture<ExportCertPemFileResponse> exportCertPemFileAsync(ExportCertPemFileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportCertPemFile);
    }

    /**
     * 导出ca证书pem文件
     *
     * 导出ca证书pem文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportCertPemFileRequest 请求对象
     * @return AsyncInvoker<ExportCertPemFileRequest, ExportCertPemFileResponse>
     */
    public AsyncInvoker<ExportCertPemFileRequest, ExportCertPemFileResponse> exportCertPemFileAsyncInvoker(
        ExportCertPemFileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportCertPemFile, hcClient);
    }

    /**
     * 导入ca子证书
     *
     * 导入ca子证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertRequest 请求对象
     * @return CompletableFuture<ImportCertResponse>
     */
    public CompletableFuture<ImportCertResponse> importCertAsync(ImportCertRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.importCert);
    }

    /**
     * 导入ca子证书
     *
     * 导入ca子证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportCertRequest 请求对象
     * @return AsyncInvoker<ImportCertRequest, ImportCertResponse>
     */
    public AsyncInvoker<ImportCertRequest, ImportCertResponse> importCertAsyncInvoker(ImportCertRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.importCert, hcClient);
    }

    /**
     * 查询CA证书列表
     *
     * 查询CA证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return CompletableFuture<ListCertsResponse>
     */
    public CompletableFuture<ListCertsResponse> listCertsAsync(ListCertsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listCerts);
    }

    /**
     * 查询CA证书列表
     *
     * 查询CA证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertsRequest 请求对象
     * @return AsyncInvoker<ListCertsRequest, ListCertsResponse>
     */
    public AsyncInvoker<ListCertsRequest, ListCertsResponse> listCertsAsyncInvoker(ListCertsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listCerts, hcClient);
    }

    /**
     * 启用或禁用ca证书
     *
     * 启用或禁用ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertStatusRequest 请求对象
     * @return CompletableFuture<SetCertStatusResponse>
     */
    public CompletableFuture<SetCertStatusResponse> setCertStatusAsync(SetCertStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.setCertStatus);
    }

    /**
     * 启用或禁用ca证书
     *
     * 启用或禁用ca证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertStatusRequest 请求对象
     * @return AsyncInvoker<SetCertStatusRequest, SetCertStatusResponse>
     */
    public AsyncInvoker<SetCertStatusRequest, SetCertStatusResponse> setCertStatusAsyncInvoker(
        SetCertStatusRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.setCertStatus, hcClient);
    }

    /**
     * 查询ca证书详情
     *
     * 查询ca证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertDetailRequest 请求对象
     * @return CompletableFuture<ShowCertDetailResponse>
     */
    public CompletableFuture<ShowCertDetailResponse> showCertDetailAsync(ShowCertDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showCertDetail);
    }

    /**
     * 查询ca证书详情
     *
     * 查询ca证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertDetailRequest 请求对象
     * @return AsyncInvoker<ShowCertDetailRequest, ShowCertDetailResponse>
     */
    public AsyncInvoker<ShowCertDetailRequest, ShowCertDetailResponse> showCertDetailAsyncInvoker(
        ShowCertDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showCertDetail, hcClient);
    }

    /**
     * 检查桌面镜像是否存在
     *
     * 用于校验指定桌面列表的桌面镜像，当前是否存在，如果存在返回对应的imageId，不存在就不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDesktopImagesRequest 请求对象
     * @return CompletableFuture<CheckDesktopImagesResponse>
     */
    public CompletableFuture<CheckDesktopImagesResponse> checkDesktopImagesAsync(CheckDesktopImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.checkDesktopImages);
    }

    /**
     * 检查桌面镜像是否存在
     *
     * 用于校验指定桌面列表的桌面镜像，当前是否存在，如果存在返回对应的imageId，不存在就不返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDesktopImagesRequest 请求对象
     * @return AsyncInvoker<CheckDesktopImagesRequest, CheckDesktopImagesResponse>
     */
    public AsyncInvoker<CheckDesktopImagesRequest, CheckDesktopImagesResponse> checkDesktopImagesAsyncInvoker(
        CheckDesktopImagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.checkDesktopImages, hcClient);
    }

    /**
     * sysprep版本信息检查
     *
     * 检查sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSysprepInfoRequest 请求对象
     * @return CompletableFuture<CheckSysprepInfoResponse>
     */
    public CompletableFuture<CheckSysprepInfoResponse> checkSysprepInfoAsync(CheckSysprepInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.checkSysprepInfo);
    }

    /**
     * sysprep版本信息检查
     *
     * 检查sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSysprepInfoRequest 请求对象
     * @return AsyncInvoker<CheckSysprepInfoRequest, CheckSysprepInfoResponse>
     */
    public AsyncInvoker<CheckSysprepInfoRequest, CheckSysprepInfoResponse> checkSysprepInfoAsyncInvoker(
        CheckSysprepInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.checkSysprepInfo, hcClient);
    }

    /**
     * 导出连接记录(待废弃)
     *
     * 该接口用于导出连接记录，待废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserLoginInfoNewRequest 请求对象
     * @return CompletableFuture<ExportUserLoginInfoNewResponse>
     */
    public CompletableFuture<ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsync(
        ExportUserLoginInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserLoginInfoNew);
    }

    /**
     * 导出连接记录(待废弃)
     *
     * 该接口用于导出连接记录，待废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserLoginInfoNewRequest 请求对象
     * @return AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse>
     */
    public AsyncInvoker<ExportUserLoginInfoNewRequest, ExportUserLoginInfoNewResponse> exportUserLoginInfoNewAsyncInvoker(
        ExportUserLoginInfoNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserLoginInfoNew, hcClient);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
     * @return CompletableFuture<ListHistoryOnlineInfoNewResponse>
     */
    public CompletableFuture<ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsync(
        ListHistoryOnlineInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listHistoryOnlineInfoNew);
    }

    /**
     * 查询登录人数
     *
     * 该接口用于查询登录人数，注意查询参数不可全空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOnlineInfoNewRequest 请求对象
     * @return AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse>
     */
    public AsyncInvoker<ListHistoryOnlineInfoNewRequest, ListHistoryOnlineInfoNewResponse> listHistoryOnlineInfoNewAsyncInvoker(
        ListHistoryOnlineInfoNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listHistoryOnlineInfoNew, hcClient);
    }

    /**
     * 查询桌面登录状态
     *
     * 该接口用于查询桌面登录状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesStatusRequest 请求对象
     * @return CompletableFuture<ListInstancesStatusResponse>
     */
    public CompletableFuture<ListInstancesStatusResponse> listInstancesStatusAsync(ListInstancesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listInstancesStatus);
    }

    /**
     * 查询桌面登录状态
     *
     * 该接口用于查询桌面登录状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesStatusRequest 请求对象
     * @return AsyncInvoker<ListInstancesStatusRequest, ListInstancesStatusResponse>
     */
    public AsyncInvoker<ListInstancesStatusRequest, ListInstancesStatusResponse> listInstancesStatusAsyncInvoker(
        ListInstancesStatusRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listInstancesStatus, hcClient);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginRecordsNewRequest 请求对象
     * @return CompletableFuture<ListLoginRecordsNewResponse>
     */
    public CompletableFuture<ListLoginRecordsNewResponse> listLoginRecordsNewAsync(ListLoginRecordsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listLoginRecordsNew);
    }

    /**
     * 查询登录信息
     *
     * 该接口用于查询登录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginRecordsNewRequest 请求对象
     * @return AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse>
     */
    public AsyncInvoker<ListLoginRecordsNewRequest, ListLoginRecordsNewResponse> listLoginRecordsNewAsyncInvoker(
        ListLoginRecordsNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listLoginRecordsNew, hcClient);
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
     * @return CompletableFuture<ExportUserConnectionNewResponse>
     */
    public CompletableFuture<ExportUserConnectionNewResponse> exportUserConnectionNewAsync(
        ExportUserConnectionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserConnectionNew);
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
     * @return AsyncInvoker<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse>
     */
    public AsyncInvoker<ExportUserConnectionNewRequest, ExportUserConnectionNewResponse> exportUserConnectionNewAsyncInvoker(
        ExportUserConnectionNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserConnectionNew, hcClient);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return CompletableFuture<AttachInstancesResponse>
     */
    public CompletableFuture<AttachInstancesResponse> attachInstancesAsync(AttachInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.attachInstances);
    }

    /**
     * 分配用户
     *
     * 将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachInstancesRequest 请求对象
     * @return AsyncInvoker<AttachInstancesRequest, AttachInstancesResponse>
     */
    public AsyncInvoker<AttachInstancesRequest, AttachInstancesResponse> attachInstancesAsyncInvoker(
        AttachInstancesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.attachInstances, hcClient);
    }

    /**
     * 预批量分配用户
     *
     * 预批量将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateInstancesRequest 请求对象
     * @return CompletableFuture<BatchAssociateInstancesResponse>
     */
    public CompletableFuture<BatchAssociateInstancesResponse> batchAssociateInstancesAsync(
        BatchAssociateInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchAssociateInstances);
    }

    /**
     * 预批量分配用户
     *
     * 预批量将桌面分配给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAssociateInstancesRequest 请求对象
     * @return AsyncInvoker<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse>
     */
    public AsyncInvoker<BatchAssociateInstancesRequest, BatchAssociateInstancesResponse> batchAssociateInstancesAsyncInvoker(
        BatchAssociateInstancesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchAssociateInstances, hcClient);
    }

    /**
     * 批量分配用户
     *
     * 批量分配桌面给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInstancesRequest 请求对象
     * @return CompletableFuture<BatchAttachInstancesResponse>
     */
    public CompletableFuture<BatchAttachInstancesResponse> batchAttachInstancesAsync(
        BatchAttachInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchAttachInstances);
    }

    /**
     * 批量分配用户
     *
     * 批量分配桌面给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachInstancesRequest 请求对象
     * @return AsyncInvoker<BatchAttachInstancesRequest, BatchAttachInstancesResponse>
     */
    public AsyncInvoker<BatchAttachInstancesRequest, BatchAttachInstancesResponse> batchAttachInstancesAsyncInvoker(
        BatchAttachInstancesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchAttachInstances, hcClient);
    }

    /**
     * 批量切换桌面网络
     *
     * 批量切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDesktopNetworkRequest 请求对象
     * @return CompletableFuture<BatchChangeDesktopNetworkResponse>
     */
    public CompletableFuture<BatchChangeDesktopNetworkResponse> batchChangeDesktopNetworkAsync(
        BatchChangeDesktopNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchChangeDesktopNetwork);
    }

    /**
     * 批量切换桌面网络
     *
     * 批量切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeDesktopNetworkRequest 请求对象
     * @return AsyncInvoker<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse>
     */
    public AsyncInvoker<BatchChangeDesktopNetworkRequest, BatchChangeDesktopNetworkResponse> batchChangeDesktopNetworkAsyncInvoker(
        BatchChangeDesktopNetworkRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchChangeDesktopNetwork, hcClient);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsRequest 请求对象
     * @return CompletableFuture<BatchDeleteDesktopsResponse>
     */
    public CompletableFuture<BatchDeleteDesktopsResponse> batchDeleteDesktopsAsync(BatchDeleteDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktops);
    }

    /**
     * 批量删除桌面
     *
     * 批量删除桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopsRequest, BatchDeleteDesktopsResponse> batchDeleteDesktopsAsyncInvoker(
        BatchDeleteDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktops, hcClient);
    }

    /**
     * 批量解绑用户
     *
     * 批量将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInstancesRequest 请求对象
     * @return CompletableFuture<BatchDetachInstancesResponse>
     */
    public CompletableFuture<BatchDetachInstancesResponse> batchDetachInstancesAsync(
        BatchDetachInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDetachInstances);
    }

    /**
     * 批量解绑用户
     *
     * 批量将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDetachInstancesRequest, BatchDetachInstancesResponse>
     */
    public AsyncInvoker<BatchDetachInstancesRequest, BatchDetachInstancesResponse> batchDetachInstancesAsyncInvoker(
        BatchDetachInstancesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDetachInstances, hcClient);
    }

    /**
     * 安装监控插件
     *
     * 批量为桌面安装监控插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAgentRequest 请求对象
     * @return CompletableFuture<BatchInstallAgentResponse>
     */
    public CompletableFuture<BatchInstallAgentResponse> batchInstallAgentAsync(BatchInstallAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchInstallAgent);
    }

    /**
     * 安装监控插件
     *
     * 批量为桌面安装监控插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchInstallAgentRequest 请求对象
     * @return AsyncInvoker<BatchInstallAgentRequest, BatchInstallAgentResponse>
     */
    public AsyncInvoker<BatchInstallAgentRequest, BatchInstallAgentResponse> batchInstallAgentAsyncInvoker(
        BatchInstallAgentRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchInstallAgent, hcClient);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLogoffDesktopsRequest 请求对象
     * @return CompletableFuture<BatchLogoffDesktopsResponse>
     */
    public CompletableFuture<BatchLogoffDesktopsResponse> batchLogoffDesktopsAsync(BatchLogoffDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchLogoffDesktops);
    }

    /**
     * 批量注销桌面
     *
     * 批量注销桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchLogoffDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse>
     */
    public AsyncInvoker<BatchLogoffDesktopsRequest, BatchLogoffDesktopsResponse> batchLogoffDesktopsAsyncInvoker(
        BatchLogoffDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchLogoffDesktops, hcClient);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return CompletableFuture<BatchRebuildDesktopsSystemDiskResponse>
     */
    public CompletableFuture<BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskAsync(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk);
    }

    /**
     * 重建桌面
     *
     * 批量重建桌面系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebuildDesktopsSystemDiskRequest 请求对象
     * @return AsyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse>
     */
    public AsyncInvoker<BatchRebuildDesktopsSystemDiskRequest, BatchRebuildDesktopsSystemDiskResponse> batchRebuildDesktopsSystemDiskAsyncInvoker(
        BatchRebuildDesktopsSystemDiskRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchRebuildDesktopsSystemDisk, hcClient);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机、休眠和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRunDesktopsRequest 请求对象
     * @return CompletableFuture<BatchRunDesktopsResponse>
     */
    public CompletableFuture<BatchRunDesktopsResponse> batchRunDesktopsAsync(BatchRunDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRunDesktops);
    }

    /**
     * 操作桌面
     *
     * 批量操作桌面，用于批量开机、关机、休眠和重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRunDesktopsRequest 请求对象
     * @return AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse>
     */
    public AsyncInvoker<BatchRunDesktopsRequest, BatchRunDesktopsResponse> batchRunDesktopsAsyncInvoker(
        BatchRunDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchRunDesktops, hcClient);
    }

    /**
     * 取消远程协助
     *
     * 取消远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemoteAssistanceRequest 请求对象
     * @return CompletableFuture<CancelRemoteAssistanceResponse>
     */
    public CompletableFuture<CancelRemoteAssistanceResponse> cancelRemoteAssistanceAsync(
        CancelRemoteAssistanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.cancelRemoteAssistance);
    }

    /**
     * 取消远程协助
     *
     * 取消远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemoteAssistanceRequest 请求对象
     * @return AsyncInvoker<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse>
     */
    public AsyncInvoker<CancelRemoteAssistanceRequest, CancelRemoteAssistanceResponse> cancelRemoteAssistanceAsyncInvoker(
        CancelRemoteAssistanceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.cancelRemoteAssistance, hcClient);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopNetworkRequest 请求对象
     * @return CompletableFuture<ChangeDesktopNetworkResponse>
     */
    public CompletableFuture<ChangeDesktopNetworkResponse> changeDesktopNetworkAsync(
        ChangeDesktopNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeDesktopNetwork);
    }

    /**
     * 切换桌面网络
     *
     * 切换桌面vpc、子网、ip、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopNetworkRequest 请求对象
     * @return AsyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse>
     */
    public AsyncInvoker<ChangeDesktopNetworkRequest, ChangeDesktopNetworkResponse> changeDesktopNetworkAsyncInvoker(
        ChangeDesktopNetworkRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.changeDesktopNetwork, hcClient);
    }

    /**
     * 桌面转镜像
     *
     * 桌面转镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopToImageRequest 请求对象
     * @return CompletableFuture<ChangeDesktopToImageResponse>
     */
    public CompletableFuture<ChangeDesktopToImageResponse> changeDesktopToImageAsync(
        ChangeDesktopToImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeDesktopToImage);
    }

    /**
     * 桌面转镜像
     *
     * 桌面转镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDesktopToImageRequest 请求对象
     * @return AsyncInvoker<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse>
     */
    public AsyncInvoker<ChangeDesktopToImageRequest, ChangeDesktopToImageResponse> changeDesktopToImageAsyncInvoker(
        ChangeDesktopToImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.changeDesktopToImage, hcClient);
    }

    /**
     * 批量修改用户权限组
     *
     * 批量修改用户权限组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserPrivilegeGroupRequest 请求对象
     * @return CompletableFuture<ChangeUserPrivilegeGroupResponse>
     */
    public CompletableFuture<ChangeUserPrivilegeGroupResponse> changeUserPrivilegeGroupAsync(
        ChangeUserPrivilegeGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeUserPrivilegeGroup);
    }

    /**
     * 批量修改用户权限组
     *
     * 批量修改用户权限组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserPrivilegeGroupRequest 请求对象
     * @return AsyncInvoker<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse>
     */
    public AsyncInvoker<ChangeUserPrivilegeGroupRequest, ChangeUserPrivilegeGroupResponse> changeUserPrivilegeGroupAsyncInvoker(
        ChangeUserPrivilegeGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.changeUserPrivilegeGroup, hcClient);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopRequest 请求对象
     * @return CompletableFuture<CreateDesktopResponse>
     */
    public CompletableFuture<CreateDesktopResponse> createDesktopAsync(CreateDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktop);
    }

    /**
     * 创建桌面
     *
     * 创建桌面，并将此桌面分配给用户，当桌面创建成功后用户可以登录使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopRequest 请求对象
     * @return AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse>
     */
    public AsyncInvoker<CreateDesktopRequest, CreateDesktopResponse> createDesktopAsyncInvoker(
        CreateDesktopRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktop, hcClient);
    }

    /**
     * 创建远程协助
     *
     * 创建远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemoteAssistanceRequest 请求对象
     * @return CompletableFuture<CreateRemoteAssistanceResponse>
     */
    public CompletableFuture<CreateRemoteAssistanceResponse> createRemoteAssistanceAsync(
        CreateRemoteAssistanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createRemoteAssistance);
    }

    /**
     * 创建远程协助
     *
     * 创建远程协助。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemoteAssistanceRequest 请求对象
     * @return AsyncInvoker<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse>
     */
    public AsyncInvoker<CreateRemoteAssistanceRequest, CreateRemoteAssistanceResponse> createRemoteAssistanceAsyncInvoker(
        CreateRemoteAssistanceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createRemoteAssistance, hcClient);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopRequest 请求对象
     * @return CompletableFuture<DeleteDesktopResponse>
     */
    public CompletableFuture<DeleteDesktopResponse> deleteDesktopAsync(DeleteDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktop);
    }

    /**
     * 删除单个桌面
     *
     * 删除单个桌面，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse>
     */
    public AsyncInvoker<DeleteDesktopRequest, DeleteDesktopResponse> deleteDesktopAsyncInvoker(
        DeleteDesktopRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteDesktop, hcClient);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return CompletableFuture<DetachInstancesResponse>
     */
    public CompletableFuture<DetachInstancesResponse> detachInstancesAsync(DetachInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.detachInstances);
    }

    /**
     * 解绑用户
     *
     * 将桌面和用户解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachInstancesRequest 请求对象
     * @return AsyncInvoker<DetachInstancesRequest, DetachInstancesResponse>
     */
    public AsyncInvoker<DetachInstancesRequest, DetachInstancesResponse> detachInstancesAsyncInvoker(
        DetachInstancesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.detachInstances, hcClient);
    }

    /**
     * 查询桌面安装监控插件详情
     *
     * 展示桌面安装监控插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsInstallConditionRequest 请求对象
     * @return CompletableFuture<ListAgentsInstallConditionResponse>
     */
    public CompletableFuture<ListAgentsInstallConditionResponse> listAgentsInstallConditionAsync(
        ListAgentsInstallConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAgentsInstallCondition);
    }

    /**
     * 查询桌面安装监控插件详情
     *
     * 展示桌面安装监控插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentsInstallConditionRequest 请求对象
     * @return AsyncInvoker<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse>
     */
    public AsyncInvoker<ListAgentsInstallConditionRequest, ListAgentsInstallConditionResponse> listAgentsInstallConditionAsyncInvoker(
        ListAgentsInstallConditionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAgentsInstallCondition, hcClient);
    }

    /**
     * 查询桌面开关机信息
     *
     * 获取桌面开关机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopActionsRequest 请求对象
     * @return CompletableFuture<ListDesktopActionsResponse>
     */
    public CompletableFuture<ListDesktopActionsResponse> listDesktopActionsAsync(ListDesktopActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopActions);
    }

    /**
     * 查询桌面开关机信息
     *
     * 获取桌面开关机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopActionsRequest 请求对象
     * @return AsyncInvoker<ListDesktopActionsRequest, ListDesktopActionsResponse>
     */
    public AsyncInvoker<ListDesktopActionsRequest, ListDesktopActionsResponse> listDesktopActionsAsyncInvoker(
        ListDesktopActionsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopActions, hcClient);
    }

    /**
     * 查询桌面解绑信息
     *
     * 查询桌面解绑信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopDetachInfoRequest 请求对象
     * @return CompletableFuture<ListDesktopDetachInfoResponse>
     */
    public CompletableFuture<ListDesktopDetachInfoResponse> listDesktopDetachInfoAsync(
        ListDesktopDetachInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopDetachInfo);
    }

    /**
     * 查询桌面解绑信息
     *
     * 查询桌面解绑信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopDetachInfoRequest 请求对象
     * @return AsyncInvoker<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse>
     */
    public AsyncInvoker<ListDesktopDetachInfoRequest, ListDesktopDetachInfoResponse> listDesktopDetachInfoAsyncInvoker(
        ListDesktopDetachInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopDetachInfo, hcClient);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsRequest 请求对象
     * @return CompletableFuture<ListDesktopsResponse>
     */
    public CompletableFuture<ListDesktopsResponse> listDesktopsAsync(ListDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktops);
    }

    /**
     * 查询桌面列表
     *
     * 该接口用于查询桌面虚拟机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse>
     */
    public AsyncInvoker<ListDesktopsRequest, ListDesktopsResponse> listDesktopsAsyncInvoker(
        ListDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktops, hcClient);
    }

    /**
     * 查询桌面连接状态列表
     *
     * 查询桌面连接状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsConnectStatusRequest 请求对象
     * @return CompletableFuture<ListDesktopsConnectStatusResponse>
     */
    public CompletableFuture<ListDesktopsConnectStatusResponse> listDesktopsConnectStatusAsync(
        ListDesktopsConnectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsConnectStatus);
    }

    /**
     * 查询桌面连接状态列表
     *
     * 查询桌面连接状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsConnectStatusRequest 请求对象
     * @return AsyncInvoker<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse>
     */
    public AsyncInvoker<ListDesktopsConnectStatusRequest, ListDesktopsConnectStatusResponse> listDesktopsConnectStatusAsyncInvoker(
        ListDesktopsConnectStatusRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopsConnectStatus, hcClient);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsDetailRequest 请求对象
     * @return CompletableFuture<ListDesktopsDetailResponse>
     */
    public CompletableFuture<ListDesktopsDetailResponse> listDesktopsDetailAsync(ListDesktopsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsDetail);
    }

    /**
     * 查询桌面详情列表
     *
     * 查询桌面详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsDetailRequest 请求对象
     * @return AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse>
     */
    public AsyncInvoker<ListDesktopsDetailRequest, ListDesktopsDetailResponse> listDesktopsDetailAsyncInvoker(
        ListDesktopsDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopsDetail, hcClient);
    }

    /**
     * 重新加入AD域
     *
     * 该接口用于Windows桌面重新加入AD域，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDomainRequest 请求对象
     * @return CompletableFuture<RegisterDomainResponse>
     */
    public CompletableFuture<RegisterDomainResponse> registerDomainAsync(RegisterDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.registerDomain);
    }

    /**
     * 重新加入AD域
     *
     * 该接口用于Windows桌面重新加入AD域，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDomainRequest 请求对象
     * @return AsyncInvoker<RegisterDomainRequest, RegisterDomainResponse>
     */
    public AsyncInvoker<RegisterDomainRequest, RegisterDomainResponse> registerDomainAsyncInvoker(
        RegisterDomainRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.registerDomain, hcClient);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopRequest 请求对象
     * @return CompletableFuture<ResizeDesktopResponse>
     */
    public CompletableFuture<ResizeDesktopResponse> resizeDesktopAsync(ResizeDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resizeDesktop);
    }

    /**
     * 变更规格
     *
     * 变更云桌面规格，只支持变更CPU和内存，不支持变更磁盘，不支持同规格互相变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopRequest 请求对象
     * @return AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse>
     */
    public AsyncInvoker<ResizeDesktopRequest, ResizeDesktopResponse> resizeDesktopAsyncInvoker(
        ResizeDesktopRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.resizeDesktop, hcClient);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendNotificationsRequest 请求对象
     * @return CompletableFuture<SendNotificationsResponse>
     */
    public CompletableFuture<SendNotificationsResponse> sendNotificationsAsync(SendNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.sendNotifications);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendNotificationsRequest 请求对象
     * @return AsyncInvoker<SendNotificationsRequest, SendNotificationsResponse>
     */
    public AsyncInvoker<SendNotificationsRequest, SendNotificationsResponse> sendNotificationsAsyncInvoker(
        SendNotificationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.sendNotifications, hcClient);
    }

    /**
     * 批量设置桌面维护模式
     *
     * 批量设置桌面管理员维护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMaintenanceModeRequest 请求对象
     * @return CompletableFuture<SetMaintenanceModeResponse>
     */
    public CompletableFuture<SetMaintenanceModeResponse> setMaintenanceModeAsync(SetMaintenanceModeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.setMaintenanceMode);
    }

    /**
     * 批量设置桌面维护模式
     *
     * 批量设置桌面管理员维护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMaintenanceModeRequest 请求对象
     * @return AsyncInvoker<SetMaintenanceModeRequest, SetMaintenanceModeResponse>
     */
    public AsyncInvoker<SetMaintenanceModeRequest, SetMaintenanceModeResponse> setMaintenanceModeAsyncInvoker(
        SetMaintenanceModeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.setMaintenanceMode, hcClient);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopDetailRequest 请求对象
     * @return CompletableFuture<ShowDesktopDetailResponse>
     */
    public CompletableFuture<ShowDesktopDetailResponse> showDesktopDetailAsync(ShowDesktopDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopDetail);
    }

    /**
     * 查询单个桌面详情
     *
     * 指定桌面Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopDetailRequest 请求对象
     * @return AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse>
     */
    public AsyncInvoker<ShowDesktopDetailRequest, ShowDesktopDetailResponse> showDesktopDetailAsyncInvoker(
        ShowDesktopDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopDetail, hcClient);
    }

    /**
     * 查询桌面监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopMonitorDataRequest 请求对象
     * @return CompletableFuture<ShowDesktopMonitorDataResponse>
     */
    public CompletableFuture<ShowDesktopMonitorDataResponse> showDesktopMonitorDataAsync(
        ShowDesktopMonitorDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopMonitorData);
    }

    /**
     * 查询桌面监控信息
     *
     * 该接口可获取某一计算机在一段时间段(范围：1小时到30天)的数据信息（例如CPU占用率、内存占用率、用户的在线时间段等），最长数据保存时间不能超过180天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopMonitorDataRequest 请求对象
     * @return AsyncInvoker<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse>
     */
    public AsyncInvoker<ShowDesktopMonitorDataRequest, ShowDesktopMonitorDataResponse> showDesktopMonitorDataAsyncInvoker(
        ShowDesktopMonitorDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopMonitorData, hcClient);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworkRequest 请求对象
     * @return CompletableFuture<ShowDesktopNetworkResponse>
     */
    public CompletableFuture<ShowDesktopNetworkResponse> showDesktopNetworkAsync(ShowDesktopNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopNetwork);
    }

    /**
     * 查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworkRequest 请求对象
     * @return AsyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse>
     */
    public AsyncInvoker<ShowDesktopNetworkRequest, ShowDesktopNetworkResponse> showDesktopNetworkAsyncInvoker(
        ShowDesktopNetworkRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopNetwork, hcClient);
    }

    /**
     * 批量查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworksRequest 请求对象
     * @return CompletableFuture<ShowDesktopNetworksResponse>
     */
    public CompletableFuture<ShowDesktopNetworksResponse> showDesktopNetworksAsync(ShowDesktopNetworksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopNetworks);
    }

    /**
     * 批量查询桌面网络
     *
     * 查询桌面vpc、子网、privateIp、EIP、安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopNetworksRequest 请求对象
     * @return AsyncInvoker<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse>
     */
    public AsyncInvoker<ShowDesktopNetworksRequest, ShowDesktopNetworksResponse> showDesktopNetworksAsyncInvoker(
        ShowDesktopNetworksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopNetworks, hcClient);
    }

    /**
     * 根据桌面id查询远程协助信息
     *
     * 根据桌面id查询远程协助信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopRemoteAssistanceInfoRequest 请求对象
     * @return CompletableFuture<ShowDesktopRemoteAssistanceInfoResponse>
     */
    public CompletableFuture<ShowDesktopRemoteAssistanceInfoResponse> showDesktopRemoteAssistanceInfoAsync(
        ShowDesktopRemoteAssistanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopRemoteAssistanceInfo);
    }

    /**
     * 根据桌面id查询远程协助信息
     *
     * 根据桌面id查询远程协助信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopRemoteAssistanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse>
     */
    public AsyncInvoker<ShowDesktopRemoteAssistanceInfoRequest, ShowDesktopRemoteAssistanceInfoResponse> showDesktopRemoteAssistanceInfoAsyncInvoker(
        ShowDesktopRemoteAssistanceInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopRemoteAssistanceInfo, hcClient);
    }

    /**
     * 远程登录控制台
     *
     * 用于直接获取远程登录控制台地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleAddressRequest 请求对象
     * @return CompletableFuture<ShowRemoteConsoleAddressResponse>
     */
    public CompletableFuture<ShowRemoteConsoleAddressResponse> showRemoteConsoleAddressAsync(
        ShowRemoteConsoleAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showRemoteConsoleAddress);
    }

    /**
     * 远程登录控制台
     *
     * 用于直接获取远程登录控制台地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteConsoleAddressRequest 请求对象
     * @return AsyncInvoker<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse>
     */
    public AsyncInvoker<ShowRemoteConsoleAddressRequest, ShowRemoteConsoleAddressResponse> showRemoteConsoleAddressAsyncInvoker(
        ShowRemoteConsoleAddressRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showRemoteConsoleAddress, hcClient);
    }

    /**
     * 查询sysprep版本信息
     *
     * 查询sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSysprepInfoRequest 请求对象
     * @return CompletableFuture<ShowSysprepInfoResponse>
     */
    public CompletableFuture<ShowSysprepInfoResponse> showSysprepInfoAsync(ShowSysprepInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showSysprepInfo);
    }

    /**
     * 查询sysprep版本信息
     *
     * 查询sysprep版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSysprepInfoRequest 请求对象
     * @return AsyncInvoker<ShowSysprepInfoRequest, ShowSysprepInfoResponse>
     */
    public AsyncInvoker<ShowSysprepInfoRequest, ShowSysprepInfoResponse> showSysprepInfoAsyncInvoker(
        ShowSysprepInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showSysprepInfo, hcClient);
    }

    /**
     * 修改桌面属性
     *
     * 修改桌面属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopRequest 请求对象
     * @return CompletableFuture<UpdateDesktopResponse>
     */
    public CompletableFuture<UpdateDesktopResponse> updateDesktopAsync(UpdateDesktopRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateDesktop);
    }

    /**
     * 修改桌面属性
     *
     * 修改桌面属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopRequest 请求对象
     * @return AsyncInvoker<UpdateDesktopRequest, UpdateDesktopResponse>
     */
    public AsyncInvoker<UpdateDesktopRequest, UpdateDesktopResponse> updateDesktopAsyncInvoker(
        UpdateDesktopRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateDesktop, hcClient);
    }

    /**
     * 更新桌面SID
     *
     * 该接口用于桌面sid和WindowsAD中的SID不同时，更新桌面SID使其与AD中的SID保持一致，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopSidsRequest 请求对象
     * @return CompletableFuture<UpdateDesktopSidsResponse>
     */
    public CompletableFuture<UpdateDesktopSidsResponse> updateDesktopSidsAsync(UpdateDesktopSidsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateDesktopSids);
    }

    /**
     * 更新桌面SID
     *
     * 该接口用于桌面sid和WindowsAD中的SID不同时，更新桌面SID使其与AD中的SID保持一致，一般用于解决桌面脱域的情况使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopSidsRequest 请求对象
     * @return AsyncInvoker<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse>
     */
    public AsyncInvoker<UpdateDesktopSidsRequest, UpdateDesktopSidsResponse> updateDesktopSidsAsyncInvoker(
        UpdateDesktopSidsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateDesktopSids, hcClient);
    }

    /**
     * AD场景支持桌面更换关联用户名
     *
     * AD场景支持桌面更换关联用户名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopUsernameRequest 请求对象
     * @return CompletableFuture<UpdateDesktopUsernameResponse>
     */
    public CompletableFuture<UpdateDesktopUsernameResponse> updateDesktopUsernameAsync(
        UpdateDesktopUsernameRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateDesktopUsername);
    }

    /**
     * AD场景支持桌面更换关联用户名
     *
     * AD场景支持桌面更换关联用户名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopUsernameRequest 请求对象
     * @return AsyncInvoker<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse>
     */
    public AsyncInvoker<UpdateDesktopUsernameRequest, UpdateDesktopUsernameResponse> updateDesktopUsernameAsyncInvoker(
        UpdateDesktopUsernameRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateDesktopUsername, hcClient);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return CompletableFuture<BatchDeleteDesktopNamePolicyResponse>
     */
    public CompletableFuture<BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicyAsync(
        BatchDeleteDesktopNamePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopNamePolicy);
    }

    /**
     * 批量删除桌面名称策略
     *
     * 批量删除桌面名称策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopNamePolicyRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopNamePolicyRequest, BatchDeleteDesktopNamePolicyResponse> batchDeleteDesktopNamePolicyAsyncInvoker(
        BatchDeleteDesktopNamePolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopNamePolicy, hcClient);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return CompletableFuture<CreateDesktopNamePolicyResponse>
     */
    public CompletableFuture<CreateDesktopNamePolicyResponse> createDesktopNamePolicyAsync(
        CreateDesktopNamePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopNamePolicy);
    }

    /**
     * 创建桌面名称策略
     *
     * 创建桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopNamePolicyRequest 请求对象
     * @return AsyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse>
     */
    public AsyncInvoker<CreateDesktopNamePolicyRequest, CreateDesktopNamePolicyResponse> createDesktopNamePolicyAsyncInvoker(
        CreateDesktopNamePolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopNamePolicy, hcClient);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return CompletableFuture<ListDesktopNamePolicyResponse>
     */
    public CompletableFuture<ListDesktopNamePolicyResponse> listDesktopNamePolicyAsync(
        ListDesktopNamePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopNamePolicy);
    }

    /**
     * 获取桌面名称策略
     *
     * 获取桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopNamePolicyRequest 请求对象
     * @return AsyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse>
     */
    public AsyncInvoker<ListDesktopNamePolicyRequest, ListDesktopNamePolicyResponse> listDesktopNamePolicyAsyncInvoker(
        ListDesktopNamePolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopNamePolicy, hcClient);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return CompletableFuture<UpdateDesktopNamePolicyResponse>
     */
    public CompletableFuture<UpdateDesktopNamePolicyResponse> updateDesktopNamePolicyAsync(
        UpdateDesktopNamePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateDesktopNamePolicy);
    }

    /**
     * 更新桌面名称策略
     *
     * 更新桌面名称策略，用于自动生成桌面名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopNamePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse>
     */
    public AsyncInvoker<UpdateDesktopNamePolicyRequest, UpdateDesktopNamePolicyResponse> updateDesktopNamePolicyAsyncInvoker(
        UpdateDesktopNamePolicyRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateDesktopNamePolicy, hcClient);
    }

    /**
     * 桌面池批量添加磁盘
     *
     * 桌面池批量添加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopPoolVolumesRequest 请求对象
     * @return CompletableFuture<AddDesktopPoolVolumesResponse>
     */
    public CompletableFuture<AddDesktopPoolVolumesResponse> addDesktopPoolVolumesAsync(
        AddDesktopPoolVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addDesktopPoolVolumes);
    }

    /**
     * 桌面池批量添加磁盘
     *
     * 桌面池批量添加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopPoolVolumesRequest 请求对象
     * @return AsyncInvoker<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse>
     */
    public AsyncInvoker<AddDesktopPoolVolumesRequest, AddDesktopPoolVolumesResponse> addDesktopPoolVolumesAsyncInvoker(
        AddDesktopPoolVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addDesktopPoolVolumes, hcClient);
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
     * @return CompletableFuture<CreateDesktopPoolResponse>
     */
    public CompletableFuture<CreateDesktopPoolResponse> createDesktopPoolAsync(CreateDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopPool);
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
     * @return AsyncInvoker<CreateDesktopPoolRequest, CreateDesktopPoolResponse>
     */
    public AsyncInvoker<CreateDesktopPoolRequest, CreateDesktopPoolResponse> createDesktopPoolAsyncInvoker(
        CreateDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopPool, hcClient);
    }

    /**
     * 桌面池授权用户、用户组
     *
     * 该接口用于桌面池授权用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return CompletableFuture<CreateDesktopPoolAuthorizedObjectsResponse>
     */
    public CompletableFuture<CreateDesktopPoolAuthorizedObjectsResponse> createDesktopPoolAuthorizedObjectsAsync(
        CreateDesktopPoolAuthorizedObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopPoolAuthorizedObjects);
    }

    /**
     * 桌面池授权用户、用户组
     *
     * 该接口用于桌面池授权用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return AsyncInvoker<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse>
     */
    public AsyncInvoker<CreateDesktopPoolAuthorizedObjectsRequest, CreateDesktopPoolAuthorizedObjectsResponse> createDesktopPoolAuthorizedObjectsAsyncInvoker(
        CreateDesktopPoolAuthorizedObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopPoolAuthorizedObjects, hcClient);
    }

    /**
     * 删除桌面池
     *
     * 当桌面池内无桌面时可删除桌面池，桌面池删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolRequest 请求对象
     * @return CompletableFuture<DeleteDesktopPoolResponse>
     */
    public CompletableFuture<DeleteDesktopPoolResponse> deleteDesktopPoolAsync(DeleteDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktopPool);
    }

    /**
     * 删除桌面池
     *
     * 当桌面池内无桌面时可删除桌面池，桌面池删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse>
     */
    public AsyncInvoker<DeleteDesktopPoolRequest, DeleteDesktopPoolResponse> deleteDesktopPoolAsyncInvoker(
        DeleteDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteDesktopPool, hcClient);
    }

    /**
     * 桌面池批量删除磁盘
     *
     * 桌面池批量删除磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolVolumesRequest 请求对象
     * @return CompletableFuture<DeleteDesktopPoolVolumesResponse>
     */
    public CompletableFuture<DeleteDesktopPoolVolumesResponse> deleteDesktopPoolVolumesAsync(
        DeleteDesktopPoolVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktopPoolVolumes);
    }

    /**
     * 桌面池批量删除磁盘
     *
     * 桌面池批量删除磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopPoolVolumesRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse>
     */
    public AsyncInvoker<DeleteDesktopPoolVolumesRequest, DeleteDesktopPoolVolumesResponse> deleteDesktopPoolVolumesAsyncInvoker(
        DeleteDesktopPoolVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteDesktopPoolVolumes, hcClient);
    }

    /**
     * 操作桌面池
     *
     * 操作桌面池，用于桌面池里面的桌面批量开机、关机、重启和休眠。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolActionRequest 请求对象
     * @return CompletableFuture<ExecuteDesktopPoolActionResponse>
     */
    public CompletableFuture<ExecuteDesktopPoolActionResponse> executeDesktopPoolActionAsync(
        ExecuteDesktopPoolActionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.executeDesktopPoolAction);
    }

    /**
     * 操作桌面池
     *
     * 操作桌面池，用于桌面池里面的桌面批量开机、关机、重启和休眠。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolActionRequest 请求对象
     * @return AsyncInvoker<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse>
     */
    public AsyncInvoker<ExecuteDesktopPoolActionRequest, ExecuteDesktopPoolActionResponse> executeDesktopPoolActionAsyncInvoker(
        ExecuteDesktopPoolActionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.executeDesktopPoolAction, hcClient);
    }

    /**
     * 桌面池批量执行脚本
     *
     * 桌面池批量执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolScriptRequest 请求对象
     * @return CompletableFuture<ExecuteDesktopPoolScriptResponse>
     */
    public CompletableFuture<ExecuteDesktopPoolScriptResponse> executeDesktopPoolScriptAsync(
        ExecuteDesktopPoolScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.executeDesktopPoolScript);
    }

    /**
     * 桌面池批量执行脚本
     *
     * 桌面池批量执行脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteDesktopPoolScriptRequest 请求对象
     * @return AsyncInvoker<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse>
     */
    public AsyncInvoker<ExecuteDesktopPoolScriptRequest, ExecuteDesktopPoolScriptResponse> executeDesktopPoolScriptAsyncInvoker(
        ExecuteDesktopPoolScriptRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.executeDesktopPoolScript, hcClient);
    }

    /**
     * 扩容桌面池
     *
     * 扩容桌面池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolRequest 请求对象
     * @return CompletableFuture<ExpandDesktopPoolResponse>
     */
    public CompletableFuture<ExpandDesktopPoolResponse> expandDesktopPoolAsync(ExpandDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandDesktopPool);
    }

    /**
     * 扩容桌面池
     *
     * 扩容桌面池。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolRequest 请求对象
     * @return AsyncInvoker<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse>
     */
    public AsyncInvoker<ExpandDesktopPoolRequest, ExpandDesktopPoolResponse> expandDesktopPoolAsyncInvoker(
        ExpandDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.expandDesktopPool, hcClient);
    }

    /**
     * 桌面池批量扩容磁盘
     *
     * 桌面池批量扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolVolumesRequest 请求对象
     * @return CompletableFuture<ExpandDesktopPoolVolumesResponse>
     */
    public CompletableFuture<ExpandDesktopPoolVolumesResponse> expandDesktopPoolVolumesAsync(
        ExpandDesktopPoolVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandDesktopPoolVolumes);
    }

    /**
     * 桌面池批量扩容磁盘
     *
     * 桌面池批量扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopPoolVolumesRequest 请求对象
     * @return AsyncInvoker<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse>
     */
    public AsyncInvoker<ExpandDesktopPoolVolumesRequest, ExpandDesktopPoolVolumesResponse> expandDesktopPoolVolumesAsyncInvoker(
        ExpandDesktopPoolVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.expandDesktopPoolVolumes, hcClient);
    }

    /**
     * 查询桌面池授权的用户、用户组
     *
     * 该接口用于查询指定桌面池授权的用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return CompletableFuture<ListDesktopPoolAuthorizedObjectsResponse>
     */
    public CompletableFuture<ListDesktopPoolAuthorizedObjectsResponse> listDesktopPoolAuthorizedObjectsAsync(
        ListDesktopPoolAuthorizedObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopPoolAuthorizedObjects);
    }

    /**
     * 查询桌面池授权的用户、用户组
     *
     * 该接口用于查询指定桌面池授权的用户、用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolAuthorizedObjectsRequest 请求对象
     * @return AsyncInvoker<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse>
     */
    public AsyncInvoker<ListDesktopPoolAuthorizedObjectsRequest, ListDesktopPoolAuthorizedObjectsResponse> listDesktopPoolAuthorizedObjectsAsyncInvoker(
        ListDesktopPoolAuthorizedObjectsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopPoolAuthorizedObjects, hcClient);
    }

    /**
     * 查询桌面池列表
     *
     * 该接口用于查询桌面池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsRequest 请求对象
     * @return CompletableFuture<ListDesktopPoolsResponse>
     */
    public CompletableFuture<ListDesktopPoolsResponse> listDesktopPoolsAsync(ListDesktopPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopPools);
    }

    /**
     * 查询桌面池列表
     *
     * 该接口用于查询桌面池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsRequest 请求对象
     * @return AsyncInvoker<ListDesktopPoolsRequest, ListDesktopPoolsResponse>
     */
    public AsyncInvoker<ListDesktopPoolsRequest, ListDesktopPoolsResponse> listDesktopPoolsAsyncInvoker(
        ListDesktopPoolsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopPools, hcClient);
    }

    /**
     * 查询用户所关联的桌面池列表
     *
     * 该接口用于查询用户所关联的桌面池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsByUsersRequest 请求对象
     * @return CompletableFuture<ListDesktopPoolsByUsersResponse>
     */
    public CompletableFuture<ListDesktopPoolsByUsersResponse> listDesktopPoolsByUsersAsync(
        ListDesktopPoolsByUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopPoolsByUsers);
    }

    /**
     * 查询用户所关联的桌面池列表
     *
     * 该接口用于查询用户所关联的桌面池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopPoolsByUsersRequest 请求对象
     * @return AsyncInvoker<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse>
     */
    public AsyncInvoker<ListDesktopPoolsByUsersRequest, ListDesktopPoolsByUsersResponse> listDesktopPoolsByUsersAsyncInvoker(
        ListDesktopPoolsByUsersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopPoolsByUsers, hcClient);
    }

    /**
     * 查询桌面池中差异统计
     *
     * 该接口用于查询桌面池中差异统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInconsistentStaticsRequest 请求对象
     * @return CompletableFuture<ListInconsistentStaticsResponse>
     */
    public CompletableFuture<ListInconsistentStaticsResponse> listInconsistentStaticsAsync(
        ListInconsistentStaticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listInconsistentStatics);
    }

    /**
     * 查询桌面池中差异统计
     *
     * 该接口用于查询桌面池中差异统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInconsistentStaticsRequest 请求对象
     * @return AsyncInvoker<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse>
     */
    public AsyncInvoker<ListInconsistentStaticsRequest, ListInconsistentStaticsResponse> listInconsistentStaticsAsyncInvoker(
        ListInconsistentStaticsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listInconsistentStatics, hcClient);
    }

    /**
     * 查询桌面池下的桌面信息
     *
     * 该接口用于查询桌面池下的桌面信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolDesktopsDetailRequest 请求对象
     * @return CompletableFuture<ListPoolDesktopsDetailResponse>
     */
    public CompletableFuture<ListPoolDesktopsDetailResponse> listPoolDesktopsDetailAsync(
        ListPoolDesktopsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPoolDesktopsDetail);
    }

    /**
     * 查询桌面池下的桌面信息
     *
     * 该接口用于查询桌面池下的桌面信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolDesktopsDetailRequest 请求对象
     * @return AsyncInvoker<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse>
     */
    public AsyncInvoker<ListPoolDesktopsDetailRequest, ListPoolDesktopsDetailResponse> listPoolDesktopsDetailAsyncInvoker(
        ListPoolDesktopsDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPoolDesktopsDetail, hcClient);
    }

    /**
     * 桌面池重建系统盘
     *
     * 桌面池重建系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildDesktopPoolRequest 请求对象
     * @return CompletableFuture<RebuildDesktopPoolResponse>
     */
    public CompletableFuture<RebuildDesktopPoolResponse> rebuildDesktopPoolAsync(RebuildDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.rebuildDesktopPool);
    }

    /**
     * 桌面池重建系统盘
     *
     * 桌面池重建系统盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebuildDesktopPoolRequest 请求对象
     * @return AsyncInvoker<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse>
     */
    public AsyncInvoker<RebuildDesktopPoolRequest, RebuildDesktopPoolResponse> rebuildDesktopPoolAsyncInvoker(
        RebuildDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.rebuildDesktopPool, hcClient);
    }

    /**
     * 桌面池变更规格
     *
     * 桌面池变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopPoolRequest 请求对象
     * @return CompletableFuture<ResizeDesktopPoolResponse>
     */
    public CompletableFuture<ResizeDesktopPoolResponse> resizeDesktopPoolAsync(ResizeDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resizeDesktopPool);
    }

    /**
     * 桌面池变更规格
     *
     * 桌面池变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeDesktopPoolRequest 请求对象
     * @return AsyncInvoker<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse>
     */
    public AsyncInvoker<ResizeDesktopPoolRequest, ResizeDesktopPoolResponse> resizeDesktopPoolAsyncInvoker(
        ResizeDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.resizeDesktopPool, hcClient);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDesktopPoolNotificationsRequest 请求对象
     * @return CompletableFuture<SendDesktopPoolNotificationsResponse>
     */
    public CompletableFuture<SendDesktopPoolNotificationsResponse> sendDesktopPoolNotificationsAsync(
        SendDesktopPoolNotificationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.sendDesktopPoolNotifications);
    }

    /**
     * 发送消息通知
     *
     * 用于管理员向桌面发送消息通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendDesktopPoolNotificationsRequest 请求对象
     * @return AsyncInvoker<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse>
     */
    public AsyncInvoker<SendDesktopPoolNotificationsRequest, SendDesktopPoolNotificationsResponse> sendDesktopPoolNotificationsAsyncInvoker(
        SendDesktopPoolNotificationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.sendDesktopPoolNotifications, hcClient);
    }

    /**
     * 查询桌面池详情
     *
     * 指定桌面池Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolDetailRequest 请求对象
     * @return CompletableFuture<ShowDesktopPoolDetailResponse>
     */
    public CompletableFuture<ShowDesktopPoolDetailResponse> showDesktopPoolDetailAsync(
        ShowDesktopPoolDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopPoolDetail);
    }

    /**
     * 查询桌面池详情
     *
     * 指定桌面池Id查询详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolDetailRequest 请求对象
     * @return AsyncInvoker<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse>
     */
    public AsyncInvoker<ShowDesktopPoolDetailRequest, ShowDesktopPoolDetailResponse> showDesktopPoolDetailAsyncInvoker(
        ShowDesktopPoolDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopPoolDetail, hcClient);
    }

    /**
     * 查询桌面池的脚本执行任务列表
     *
     * 桌面池的脚本执行任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolsScriptExecTasksRequest 请求对象
     * @return CompletableFuture<ShowDesktopPoolsScriptExecTasksResponse>
     */
    public CompletableFuture<ShowDesktopPoolsScriptExecTasksResponse> showDesktopPoolsScriptExecTasksAsync(
        ShowDesktopPoolsScriptExecTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showDesktopPoolsScriptExecTasks);
    }

    /**
     * 查询桌面池的脚本执行任务列表
     *
     * 桌面池的脚本执行任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDesktopPoolsScriptExecTasksRequest 请求对象
     * @return AsyncInvoker<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse>
     */
    public AsyncInvoker<ShowDesktopPoolsScriptExecTasksRequest, ShowDesktopPoolsScriptExecTasksResponse> showDesktopPoolsScriptExecTasksAsyncInvoker(
        ShowDesktopPoolsScriptExecTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showDesktopPoolsScriptExecTasks, hcClient);
    }

    /**
     * 修改桌面池属性
     *
     * 修改桌面池属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopPoolRequest 请求对象
     * @return CompletableFuture<UpdateDesktopPoolResponse>
     */
    public CompletableFuture<UpdateDesktopPoolResponse> updateDesktopPoolAsync(UpdateDesktopPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateDesktopPool);
    }

    /**
     * 修改桌面池属性
     *
     * 修改桌面池属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDesktopPoolRequest 请求对象
     * @return AsyncInvoker<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse>
     */
    public AsyncInvoker<UpdateDesktopPoolRequest, UpdateDesktopPoolResponse> updateDesktopPoolAsyncInvoker(
        UpdateDesktopPoolRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateDesktopPool, hcClient);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return CompletableFuture<BatchAddDesktopsTagsResponse>
     */
    public CompletableFuture<BatchAddDesktopsTagsResponse> batchAddDesktopsTagsAsync(
        BatchAddDesktopsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchAddDesktopsTags);
    }

    /**
     * 批量添加多个桌面标签
     *
     * 同时对多个桌面批量添加标签，如果创建的标签已经存在（key相同）则覆，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddDesktopsTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse>
     */
    public AsyncInvoker<BatchAddDesktopsTagsRequest, BatchAddDesktopsTagsResponse> batchAddDesktopsTagsAsyncInvoker(
        BatchAddDesktopsTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchAddDesktopsTags, hcClient);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeTagsRequest 请求对象
     * @return CompletableFuture<BatchChangeTagsResponse>
     */
    public CompletableFuture<BatchChangeTagsResponse> batchChangeTagsAsync(BatchChangeTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchChangeTags);
    }

    /**
     * 批量添加删除标签
     *
     * 为指定桌面批量添加或删除标签。创建时，如果创建的标签已经存在（key相同），则覆盖。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeTagsRequest 请求对象
     * @return AsyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse>
     */
    public AsyncInvoker<BatchChangeTagsRequest, BatchChangeTagsResponse> batchChangeTagsAsyncInvoker(
        BatchChangeTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchChangeTags, hcClient);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteDesktopsTagsResponse>
     */
    public CompletableFuture<BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTagsAsync(
        BatchDeleteDesktopsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopsTags);
    }

    /**
     * 批量删除多个桌面标签
     *
     * 同时对多个桌面批量添加标签，删除时，如果删除的标签不存在默认处理成功，最大支持100个桌面，每个桌面最大20个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopsTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopsTagsRequest, BatchDeleteDesktopsTagsResponse> batchDeleteDesktopsTagsAsyncInvoker(
        BatchDeleteDesktopsTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopsTags, hcClient);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createTag);
    }

    /**
     * 创建桌面标签
     *
     * 该接口用于为桌面创建标签，一个桌面上最多有10个标签。创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createTag, hcClient);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteTag);
    }

    /**
     * 删除桌面标签
     *
     * 该接口用于删除桌面标签。删除时，如果删除的标签不存在，默认处理成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopByTagsRequest 请求对象
     * @return CompletableFuture<ListDesktopByTagsResponse>
     */
    public CompletableFuture<ListDesktopByTagsResponse> listDesktopByTagsAsync(ListDesktopByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopByTags);
    }

    /**
     * 使用标签过滤桌面
     *
     * 使用标签过滤桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopByTagsRequest 请求对象
     * @return AsyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse>
     */
    public AsyncInvoker<ListDesktopByTagsRequest, ListDesktopByTagsResponse> listDesktopByTagsAsyncInvoker(
        ListDesktopByTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listProjectTags, hcClient);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagByDesktopIdRequest 请求对象
     * @return CompletableFuture<ShowTagByDesktopIdResponse>
     */
    public CompletableFuture<ShowTagByDesktopIdResponse> showTagByDesktopIdAsync(ShowTagByDesktopIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showTagByDesktopId);
    }

    /**
     * 查询桌面标签
     *
     * 查询指定桌面的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagByDesktopIdRequest 请求对象
     * @return AsyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse>
     */
    public AsyncInvoker<ShowTagByDesktopIdRequest, ShowTagByDesktopIdResponse> showTagByDesktopIdAsyncInvoker(
        ShowTagByDesktopIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showTagByDesktopId, hcClient);
    }

    /**
     * 导出桌面列表
     *
     * 导出桌面列表的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopListNewRequest 请求对象
     * @return CompletableFuture<ExportDesktopListNewResponse>
     */
    public CompletableFuture<ExportDesktopListNewResponse> exportDesktopListNewAsync(
        ExportDesktopListNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportDesktopListNew);
    }

    /**
     * 导出桌面列表
     *
     * 导出桌面列表的excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportDesktopListNewRequest 请求对象
     * @return AsyncInvoker<ExportDesktopListNewRequest, ExportDesktopListNewResponse>
     */
    public AsyncInvoker<ExportDesktopListNewRequest, ExportDesktopListNewResponse> exportDesktopListNewAsyncInvoker(
        ExportDesktopListNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportDesktopListNew, hcClient);
    }

    /**
     * 查询休眠类型
     *
     * 查询休眠类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHibernateTypeRequest 请求对象
     * @return CompletableFuture<ShowHibernateTypeResponse>
     */
    public CompletableFuture<ShowHibernateTypeResponse> showHibernateTypeAsync(ShowHibernateTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showHibernateType);
    }

    /**
     * 查询休眠类型
     *
     * 查询休眠类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHibernateTypeRequest 请求对象
     * @return AsyncInvoker<ShowHibernateTypeRequest, ShowHibernateTypeResponse>
     */
    public AsyncInvoker<ShowHibernateTypeRequest, ShowHibernateTypeResponse> showHibernateTypeAsyncInvoker(
        ShowHibernateTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showHibernateType, hcClient);
    }

    /**
     * 批量删除导出任务记录
     *
     * 批量删除导出任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTasksRequest 请求对象
     * @return CompletableFuture<DeleteExportTasksResponse>
     */
    public CompletableFuture<DeleteExportTasksResponse> deleteExportTasksAsync(DeleteExportTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteExportTasks);
    }

    /**
     * 批量删除导出任务记录
     *
     * 批量删除导出任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTasksRequest 请求对象
     * @return AsyncInvoker<DeleteExportTasksRequest, DeleteExportTasksResponse>
     */
    public AsyncInvoker<DeleteExportTasksRequest, DeleteExportTasksResponse> deleteExportTasksAsyncInvoker(
        DeleteExportTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteExportTasks, hcClient);
    }

    /**
     * 下载导出的文件
     *
     * 下载导出的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportFileRequest 请求对象
     * @return CompletableFuture<DownloadExportFileResponse>
     */
    public CompletableFuture<DownloadExportFileResponse> downloadExportFileAsync(DownloadExportFileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.downloadExportFile);
    }

    /**
     * 下载导出的文件
     *
     * 下载导出的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadExportFileRequest 请求对象
     * @return AsyncInvoker<DownloadExportFileRequest, DownloadExportFileResponse>
     */
    public AsyncInvoker<DownloadExportFileRequest, DownloadExportFileResponse> downloadExportFileAsyncInvoker(
        DownloadExportFileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.downloadExportFile, hcClient);
    }

    /**
     * 查询导出任务列表
     *
     * 查询导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return CompletableFuture<ListExportTasksResponse>
     */
    public CompletableFuture<ListExportTasksResponse> listExportTasksAsync(ListExportTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listExportTasks);
    }

    /**
     * 查询导出任务列表
     *
     * 查询导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return AsyncInvoker<ListExportTasksRequest, ListExportTasksResponse>
     */
    public AsyncInvoker<ListExportTasksRequest, ListExportTasksResponse> listExportTasksAsyncInvoker(
        ListExportTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listExportTasks, hcClient);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserGroupsRequest 请求对象
     * @return CompletableFuture<BatchDeleteUserGroupsResponse>
     */
    public CompletableFuture<BatchDeleteUserGroupsResponse> batchDeleteUserGroupsAsync(
        BatchDeleteUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteUserGroups);
    }

    /**
     * 批量删除用户组
     *
     * 该接口用于批量删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserGroupsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse>
     */
    public AsyncInvoker<BatchDeleteUserGroupsRequest, BatchDeleteUserGroupsResponse> batchDeleteUserGroupsAsyncInvoker(
        BatchDeleteUserGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteUserGroups, hcClient);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserGroupRequest 请求对象
     * @return CompletableFuture<CreateUserGroupResponse>
     */
    public CompletableFuture<CreateUserGroupResponse> createUserGroupAsync(CreateUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createUserGroup);
    }

    /**
     * 创建用户组
     *
     * 该接口用于创建用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserGroupRequest 请求对象
     * @return AsyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse>
     */
    public AsyncInvoker<CreateUserGroupRequest, CreateUserGroupResponse> createUserGroupAsyncInvoker(
        CreateUserGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createUserGroup, hcClient);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserGroupRequest 请求对象
     * @return CompletableFuture<DeleteUserGroupResponse>
     */
    public CompletableFuture<DeleteUserGroupResponse> deleteUserGroupAsync(DeleteUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteUserGroup);
    }

    /**
     * 删除用户组
     *
     * 删除用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserGroupRequest 请求对象
     * @return AsyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse>
     */
    public AsyncInvoker<DeleteUserGroupRequest, DeleteUserGroupResponse> deleteUserGroupAsyncInvoker(
        DeleteUserGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteUserGroup, hcClient);
    }

    /**
     * 导出用户组
     *
     * 以excel文件形式导出用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupsRequest 请求对象
     * @return CompletableFuture<ExportUserGroupsResponse>
     */
    public CompletableFuture<ExportUserGroupsResponse> exportUserGroupsAsync(ExportUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserGroups);
    }

    /**
     * 导出用户组
     *
     * 以excel文件形式导出用户组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupsRequest 请求对象
     * @return AsyncInvoker<ExportUserGroupsRequest, ExportUserGroupsResponse>
     */
    public AsyncInvoker<ExportUserGroupsRequest, ExportUserGroupsResponse> exportUserGroupsAsyncInvoker(
        ExportUserGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserGroups, hcClient);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGroupsRequest 请求对象
     * @return CompletableFuture<ListUserGroupsResponse>
     */
    public CompletableFuture<ListUserGroupsResponse> listUserGroupsAsync(ListUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserGroups);
    }

    /**
     * 查询用户组列表
     *
     * 查询用户组列表，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse>
     */
    public AsyncInvoker<ListUserGroupsRequest, ListUserGroupsResponse> listUserGroupsAsyncInvoker(
        ListUserGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUserGroups, hcClient);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfGroupRequest 请求对象
     * @return CompletableFuture<ListUsersOfGroupResponse>
     */
    public CompletableFuture<ListUsersOfGroupResponse> listUsersOfGroupAsync(ListUsersOfGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsersOfGroup);
    }

    /**
     * 查询用户组中的用户
     *
     * 该接口用于查询用户组中的用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersOfGroupRequest 请求对象
     * @return AsyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse>
     */
    public AsyncInvoker<ListUsersOfGroupRequest, ListUsersOfGroupResponse> listUsersOfGroupAsyncInvoker(
        ListUsersOfGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUsersOfGroup, hcClient);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnGroupRequest 请求对象
     * @return CompletableFuture<RunActionsOnGroupResponse>
     */
    public CompletableFuture<RunActionsOnGroupResponse> runActionsOnGroupAsync(RunActionsOnGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.runActionsOnGroup);
    }

    /**
     * 操作用户组
     *
     * 操作用户组，如添加用户、删除用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnGroupRequest 请求对象
     * @return AsyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse>
     */
    public AsyncInvoker<RunActionsOnGroupRequest, RunActionsOnGroupResponse> runActionsOnGroupAsyncInvoker(
        RunActionsOnGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.runActionsOnGroup, hcClient);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserGroupRequest 请求对象
     * @return CompletableFuture<UpdateUserGroupResponse>
     */
    public CompletableFuture<UpdateUserGroupResponse> updateUserGroupAsync(UpdateUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUserGroup);
    }

    /**
     * 修改用户组信息
     *
     * 该接口用于修改用户组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserGroupRequest 请求对象
     * @return AsyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse>
     */
    public AsyncInvoker<UpdateUserGroupRequest, UpdateUserGroupResponse> updateUserGroupAsyncInvoker(
        UpdateUserGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateUserGroup, hcClient);
    }

    /**
     * 导出用户组的用户
     *
     * 以excel文件形式导出用户组用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupUsersNewRequest 请求对象
     * @return CompletableFuture<ExportUserGroupUsersNewResponse>
     */
    public CompletableFuture<ExportUserGroupUsersNewResponse> exportUserGroupUsersNewAsync(
        ExportUserGroupUsersNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserGroupUsersNew);
    }

    /**
     * 导出用户组的用户
     *
     * 以excel文件形式导出用户组用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserGroupUsersNewRequest 请求对象
     * @return AsyncInvoker<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse>
     */
    public AsyncInvoker<ExportUserGroupUsersNewRequest, ExportUserGroupUsersNewResponse> exportUserGroupUsersNewAsyncInvoker(
        ExportUserGroupUsersNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserGroupUsersNew, hcClient);
    }

    /**
     * 查询云办公主机列表
     *
     * 展示云办公主机列表的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsDetailRequest 请求对象
     * @return CompletableFuture<ListHostsDetailResponse>
     */
    public CompletableFuture<ListHostsDetailResponse> listHostsDetailAsync(ListHostsDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listHostsDetail);
    }

    /**
     * 查询云办公主机列表
     *
     * 展示云办公主机列表的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsDetailRequest 请求对象
     * @return AsyncInvoker<ListHostsDetailRequest, ListHostsDetailResponse>
     */
    public AsyncInvoker<ListHostsDetailRequest, ListHostsDetailResponse> listHostsDetailAsyncInvoker(
        ListHostsDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listHostsDetail, hcClient);
    }

    /**
     * 查询云办公主机包含桌面信息
     *
     * 查询云办公主机包含桌面信息，提供给console使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByHostIdRequest 请求对象
     * @return CompletableFuture<ListServersByHostIdResponse>
     */
    public CompletableFuture<ListServersByHostIdResponse> listServersByHostIdAsync(ListServersByHostIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listServersByHostId);
    }

    /**
     * 查询云办公主机包含桌面信息
     *
     * 查询云办公主机包含桌面信息，提供给console使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByHostIdRequest 请求对象
     * @return AsyncInvoker<ListServersByHostIdRequest, ListServersByHostIdResponse>
     */
    public AsyncInvoker<ListServersByHostIdRequest, ListServersByHostIdResponse> listServersByHostIdAsyncInvoker(
        ListServersByHostIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listServersByHostId, hcClient);
    }

    /**
     * 更新云办公主机信息
     *
     * 通过云办公主机的id更新云办公主机的信息，提供给console、赞齐使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostsRequest 请求对象
     * @return CompletableFuture<UpdateHostsResponse>
     */
    public CompletableFuture<UpdateHostsResponse> updateHostsAsync(UpdateHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateHosts);
    }

    /**
     * 更新云办公主机信息
     *
     * 通过云办公主机的id更新云办公主机的信息，提供给console、赞齐使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostsRequest 请求对象
     * @return AsyncInvoker<UpdateHostsRequest, UpdateHostsResponse>
     */
    public AsyncInvoker<UpdateHostsRequest, UpdateHostsResponse> updateHostsAsyncInvoker(UpdateHostsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateHosts, hcClient);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return CompletableFuture<ListImagesResponse>
     */
    public CompletableFuture<ListImagesResponse> listImagesAsync(ListImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listImages);
    }

    /**
     * 查询产品镜像列表
     *
     * 该接口用于查询云桌面支持的产品镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return AsyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public AsyncInvoker<ListImagesRequest, ListImagesResponse> listImagesAsyncInvoker(ListImagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listImages, hcClient);
    }

    /**
     * 获取云市场镜像列表
     *
     * 获取云市场镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMarketImagesRequest 请求对象
     * @return CompletableFuture<ListMarketImagesResponse>
     */
    public CompletableFuture<ListMarketImagesResponse> listMarketImagesAsync(ListMarketImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listMarketImages);
    }

    /**
     * 获取云市场镜像列表
     *
     * 获取云市场镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMarketImagesRequest 请求对象
     * @return AsyncInvoker<ListMarketImagesRequest, ListMarketImagesResponse>
     */
    public AsyncInvoker<ListMarketImagesRequest, ListMarketImagesResponse> listMarketImagesAsyncInvoker(
        ListMarketImagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listMarketImages, hcClient);
    }

    /**
     * 包周期桌面增配变更批量询价
     *
     * 包周期桌面增配变更批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateAddResourcesRequest 请求对象
     * @return CompletableFuture<EstimateAddResourcesResponse>
     */
    public CompletableFuture<EstimateAddResourcesResponse> estimateAddResourcesAsync(
        EstimateAddResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateAddResources);
    }

    /**
     * 包周期桌面增配变更批量询价
     *
     * 包周期桌面增配变更批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateAddResourcesRequest 请求对象
     * @return AsyncInvoker<EstimateAddResourcesRequest, EstimateAddResourcesResponse>
     */
    public AsyncInvoker<EstimateAddResourcesRequest, EstimateAddResourcesResponse> estimateAddResourcesAsyncInvoker(
        EstimateAddResourcesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateAddResources, hcClient);
    }

    /**
     * 批量包周期桌面切换镜像询价
     *
     * 批量包周期桌面切换镜像(由不收费镜像变更至收费镜像)询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateChangeImagesRequest 请求对象
     * @return CompletableFuture<EstimateChangeImagesResponse>
     */
    public CompletableFuture<EstimateChangeImagesResponse> estimateChangeImagesAsync(
        EstimateChangeImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateChangeImages);
    }

    /**
     * 批量包周期桌面切换镜像询价
     *
     * 批量包周期桌面切换镜像(由不收费镜像变更至收费镜像)询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateChangeImagesRequest 请求对象
     * @return AsyncInvoker<EstimateChangeImagesRequest, EstimateChangeImagesResponse>
     */
    public AsyncInvoker<EstimateChangeImagesRequest, EstimateChangeImagesResponse> estimateChangeImagesAsyncInvoker(
        EstimateChangeImagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateChangeImages, hcClient);
    }

    /**
     * 包周期桌面池添加单个磁盘批量询价
     *
     * 包周期桌面池添加单个磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolAddVolumeRequest 请求对象
     * @return CompletableFuture<EstimateDesktopPoolAddVolumeResponse>
     */
    public CompletableFuture<EstimateDesktopPoolAddVolumeResponse> estimateDesktopPoolAddVolumeAsync(
        EstimateDesktopPoolAddVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolAddVolume);
    }

    /**
     * 包周期桌面池添加单个磁盘批量询价
     *
     * 包周期桌面池添加单个磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolAddVolumeRequest 请求对象
     * @return AsyncInvoker<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse>
     */
    public AsyncInvoker<EstimateDesktopPoolAddVolumeRequest, EstimateDesktopPoolAddVolumeResponse> estimateDesktopPoolAddVolumeAsyncInvoker(
        EstimateDesktopPoolAddVolumeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolAddVolume, hcClient);
    }

    /**
     * 包周期桌面池切换镜像批量询价
     *
     * 包周期桌面池切换镜像(由不收费镜像变更至收费镜像)批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolChangeImageRequest 请求对象
     * @return CompletableFuture<EstimateDesktopPoolChangeImageResponse>
     */
    public CompletableFuture<EstimateDesktopPoolChangeImageResponse> estimateDesktopPoolChangeImageAsync(
        EstimateDesktopPoolChangeImageRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolChangeImage);
    }

    /**
     * 包周期桌面池切换镜像批量询价
     *
     * 包周期桌面池切换镜像(由不收费镜像变更至收费镜像)批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolChangeImageRequest 请求对象
     * @return AsyncInvoker<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse>
     */
    public AsyncInvoker<EstimateDesktopPoolChangeImageRequest, EstimateDesktopPoolChangeImageResponse> estimateDesktopPoolChangeImageAsyncInvoker(
        EstimateDesktopPoolChangeImageRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolChangeImage, hcClient);
    }

    /**
     * 包周期桌面池扩容磁盘批量询价
     *
     * 包周期桌面池扩容磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolExtendVolumeRequest 请求对象
     * @return CompletableFuture<EstimateDesktopPoolExtendVolumeResponse>
     */
    public CompletableFuture<EstimateDesktopPoolExtendVolumeResponse> estimateDesktopPoolExtendVolumeAsync(
        EstimateDesktopPoolExtendVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolExtendVolume);
    }

    /**
     * 包周期桌面池扩容磁盘批量询价
     *
     * 包周期桌面池扩容磁盘批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolExtendVolumeRequest 请求对象
     * @return AsyncInvoker<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse>
     */
    public AsyncInvoker<EstimateDesktopPoolExtendVolumeRequest, EstimateDesktopPoolExtendVolumeResponse> estimateDesktopPoolExtendVolumeAsyncInvoker(
        EstimateDesktopPoolExtendVolumeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolExtendVolume, hcClient);
    }

    /**
     * 包周期桌面池变更规格批量询价
     *
     * 包周期桌面池变更规格批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolResizeRequest 请求对象
     * @return CompletableFuture<EstimateDesktopPoolResizeResponse>
     */
    public CompletableFuture<EstimateDesktopPoolResizeResponse> estimateDesktopPoolResizeAsync(
        EstimateDesktopPoolResizeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.estimateDesktopPoolResize);
    }

    /**
     * 包周期桌面池变更规格批量询价
     *
     * 包周期桌面池变更规格批量询价。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateDesktopPoolResizeRequest 请求对象
     * @return AsyncInvoker<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse>
     */
    public AsyncInvoker<EstimateDesktopPoolResizeRequest, EstimateDesktopPoolResizeResponse> estimateDesktopPoolResizeAsyncInvoker(
        EstimateDesktopPoolResizeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.estimateDesktopPoolResize, hcClient);
    }

    /**
     * 重试任务
     *
     * 该接口用来对失败的任务进行重试，当前仅支持开户和销户的任务重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnWorkspaceJobRequest 请求对象
     * @return CompletableFuture<RunActionsOnWorkspaceJobResponse>
     */
    public CompletableFuture<RunActionsOnWorkspaceJobResponse> runActionsOnWorkspaceJobAsync(
        RunActionsOnWorkspaceJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.runActionsOnWorkspaceJob);
    }

    /**
     * 重试任务
     *
     * 该接口用来对失败的任务进行重试，当前仅支持开户和销户的任务重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunActionsOnWorkspaceJobRequest 请求对象
     * @return AsyncInvoker<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse>
     */
    public AsyncInvoker<RunActionsOnWorkspaceJobRequest, RunActionsOnWorkspaceJobResponse> runActionsOnWorkspaceJobAsyncInvoker(
        RunActionsOnWorkspaceJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.runActionsOnWorkspaceJob, hcClient);
    }

    /**
     * 删除子任务
     *
     * 该接口用于删除子任务，changeAccessVpc，cancelWorkspace，applyWorkspace类型任务不支持删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubJobsRequest 请求对象
     * @return CompletableFuture<BatchDeleteSubJobsResponse>
     */
    public CompletableFuture<BatchDeleteSubJobsResponse> batchDeleteSubJobsAsync(BatchDeleteSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteSubJobs);
    }

    /**
     * 删除子任务
     *
     * 该接口用于删除子任务，changeAccessVpc，cancelWorkspace，applyWorkspace类型任务不支持删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubJobsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse>
     */
    public AsyncInvoker<BatchDeleteSubJobsRequest, BatchDeleteSubJobsResponse> batchDeleteSubJobsAsyncInvoker(
        BatchDeleteSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteSubJobs, hcClient);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItaSubJobsRequest 请求对象
     * @return CompletableFuture<ListItaSubJobsResponse>
     */
    public CompletableFuture<ListItaSubJobsResponse> listItaSubJobsAsync(ListItaSubJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listItaSubJobs);
    }

    /**
     * 子任务查询
     *
     * 该接口用于查询异步任务执行情况，比如查询创建桌面的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItaSubJobsRequest 请求对象
     * @return AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse>
     */
    public AsyncInvoker<ListItaSubJobsRequest, ListItaSubJobsResponse> listItaSubJobsAsyncInvoker(
        ListItaSubJobsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listItaSubJobs, hcClient);
    }

    /**
     * 查询任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建桌面任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showJob);
    }

    /**
     * 查询任务详情
     *
     * 该接口用于查询异步任务的执行情况，比如查询创建桌面任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showJob, hcClient);
    }

    /**
     * 查询租户的NAT映射配置项
     *
     * 查询租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatMappingConfigsRequest 请求对象
     * @return CompletableFuture<ListNatMappingConfigsResponse>
     */
    public CompletableFuture<ListNatMappingConfigsResponse> listNatMappingConfigsAsync(
        ListNatMappingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listNatMappingConfigs);
    }

    /**
     * 查询租户的NAT映射配置项
     *
     * 查询租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatMappingConfigsRequest 请求对象
     * @return AsyncInvoker<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse>
     */
    public AsyncInvoker<ListNatMappingConfigsRequest, ListNatMappingConfigsResponse> listNatMappingConfigsAsyncInvoker(
        ListNatMappingConfigsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listNatMappingConfigs, hcClient);
    }

    /**
     * 修改租户的NAT映射配置项
     *
     * 修改租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNatMappingConfigsRequest 请求对象
     * @return CompletableFuture<UpdateNatMappingConfigsResponse>
     */
    public CompletableFuture<UpdateNatMappingConfigsResponse> updateNatMappingConfigsAsync(
        UpdateNatMappingConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateNatMappingConfigs);
    }

    /**
     * 修改租户的NAT映射配置项
     *
     * 修改租户的NAT映射配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNatMappingConfigsRequest 请求对象
     * @return AsyncInvoker<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse>
     */
    public AsyncInvoker<UpdateNatMappingConfigsRequest, UpdateNatMappingConfigsResponse> updateNatMappingConfigsAsyncInvoker(
        UpdateNatMappingConfigsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateNatMappingConfigs, hcClient);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDesktopsInternetRequest 请求对象
     * @return CompletableFuture<ApplyDesktopsInternetResponse>
     */
    public CompletableFuture<ApplyDesktopsInternetResponse> applyDesktopsInternetAsync(
        ApplyDesktopsInternetRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyDesktopsInternet);
    }

    /**
     * 开通桌面上网功能
     *
     * 开通桌面上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDesktopsInternetRequest 请求对象
     * @return AsyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse>
     */
    public AsyncInvoker<ApplyDesktopsInternetRequest, ApplyDesktopsInternetResponse> applyDesktopsInternetAsyncInvoker(
        ApplyDesktopsInternetRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.applyDesktopsInternet, hcClient);
    }

    /**
     * 开通上网功能
     *
     * 开通上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyInternetRequest 请求对象
     * @return CompletableFuture<ApplyInternetResponse>
     */
    public CompletableFuture<ApplyInternetResponse> applyInternetAsync(ApplyInternetRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyInternet);
    }

    /**
     * 开通上网功能
     *
     * 开通上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyInternetRequest 请求对象
     * @return AsyncInvoker<ApplyInternetRequest, ApplyInternetResponse>
     */
    public AsyncInvoker<ApplyInternetRequest, ApplyInternetResponse> applyInternetAsyncInvoker(
        ApplyInternetRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.applyInternet, hcClient);
    }

    /**
     * 创建云办公带宽
     *
     * 创建按需云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySubnetBandwidthRequest 请求对象
     * @return CompletableFuture<ApplySubnetBandwidthResponse>
     */
    public CompletableFuture<ApplySubnetBandwidthResponse> applySubnetBandwidthAsync(
        ApplySubnetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applySubnetBandwidth);
    }

    /**
     * 创建云办公带宽
     *
     * 创建按需云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplySubnetBandwidthRequest 请求对象
     * @return AsyncInvoker<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse>
     */
    public AsyncInvoker<ApplySubnetBandwidthRequest, ApplySubnetBandwidthResponse> applySubnetBandwidthAsyncInvoker(
        ApplySubnetBandwidthRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.applySubnetBandwidth, hcClient);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDesktopsEipRequest 请求对象
     * @return CompletableFuture<AssociateDesktopsEipResponse>
     */
    public CompletableFuture<AssociateDesktopsEipResponse> associateDesktopsEipAsync(
        AssociateDesktopsEipRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.associateDesktopsEip);
    }

    /**
     * 桌面绑定EIP
     *
     * 桌面绑定EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateDesktopsEipRequest 请求对象
     * @return AsyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse>
     */
    public AsyncInvoker<AssociateDesktopsEipRequest, AssociateDesktopsEipResponse> associateDesktopsEipAsyncInvoker(
        AssociateDesktopsEipRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.associateDesktopsEip, hcClient);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
     * @return CompletableFuture<BatchDisassociateDesktopsEipResponse>
     */
    public CompletableFuture<BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipAsync(
        BatchDisassociateDesktopsEipRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDisassociateDesktopsEip);
    }

    /**
     * 批量桌面解绑EIP
     *
     * 批量桌面解绑EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDisassociateDesktopsEipRequest 请求对象
     * @return AsyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse>
     */
    public AsyncInvoker<BatchDisassociateDesktopsEipRequest, BatchDisassociateDesktopsEipResponse> batchDisassociateDesktopsEipAsyncInvoker(
        BatchDisassociateDesktopsEipRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDisassociateDesktopsEip, hcClient);
    }

    /**
     * 删除云办公带宽
     *
     * 删除云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteSubnetBandwidthResponse>
     */
    public CompletableFuture<DeleteSubnetBandwidthResponse> deleteSubnetBandwidthAsync(
        DeleteSubnetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteSubnetBandwidth);
    }

    /**
     * 删除云办公带宽
     *
     * 删除云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubnetBandwidthRequest 请求对象
     * @return AsyncInvoker<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse>
     */
    public AsyncInvoker<DeleteSubnetBandwidthRequest, DeleteSubnetBandwidthResponse> deleteSubnetBandwidthAsyncInvoker(
        DeleteSubnetBandwidthRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteSubnetBandwidth, hcClient);
    }

    /**
     * 查询已绑定桌面和未绑定的EIP
     *
     * 查询已绑定桌面和未绑定的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsEipsRequest 请求对象
     * @return CompletableFuture<ListDesktopsEipsResponse>
     */
    public CompletableFuture<ListDesktopsEipsResponse> listDesktopsEipsAsync(ListDesktopsEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsEips);
    }

    /**
     * 查询已绑定桌面和未绑定的EIP
     *
     * 查询已绑定桌面和未绑定的EIP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsEipsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse>
     */
    public AsyncInvoker<ListDesktopsEipsRequest, ListDesktopsEipsResponse> listDesktopsEipsAsyncInvoker(
        ListDesktopsEipsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopsEips, hcClient);
    }

    /**
     * 查询上网功能
     *
     * 查询上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetRequest 请求对象
     * @return CompletableFuture<ListInternetResponse>
     */
    public CompletableFuture<ListInternetResponse> listInternetAsync(ListInternetRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listInternet);
    }

    /**
     * 查询上网功能
     *
     * 查询上网功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInternetRequest 请求对象
     * @return AsyncInvoker<ListInternetRequest, ListInternetResponse>
     */
    public AsyncInvoker<ListInternetRequest, ListInternetResponse> listInternetAsyncInvoker(
        ListInternetRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listInternet, hcClient);
    }

    /**
     * 查询NAT网关列表
     *
     * 查询NAT网关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatGatewaysRequest 请求对象
     * @return CompletableFuture<ListNatGatewaysResponse>
     */
    public CompletableFuture<ListNatGatewaysResponse> listNatGatewaysAsync(ListNatGatewaysRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listNatGateways);
    }

    /**
     * 查询NAT网关列表
     *
     * 查询NAT网关列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNatGatewaysRequest 请求对象
     * @return AsyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse>
     */
    public AsyncInvoker<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGatewaysAsyncInvoker(
        ListNatGatewaysRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listNatGateways, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 查询端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 查询端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPorts, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 该接口查询安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 该接口查询安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询云办公带宽列表
     *
     * 查询云办公带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetBandwidthsRequest 请求对象
     * @return CompletableFuture<ListSubnetBandwidthsResponse>
     */
    public CompletableFuture<ListSubnetBandwidthsResponse> listSubnetBandwidthsAsync(
        ListSubnetBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listSubnetBandwidths);
    }

    /**
     * 查询云办公带宽列表
     *
     * 查询云办公带宽列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetBandwidthsRequest 请求对象
     * @return AsyncInvoker<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse>
     */
    public AsyncInvoker<ListSubnetBandwidthsRequest, ListSubnetBandwidthsResponse> listSubnetBandwidthsAsyncInvoker(
        ListSubnetBandwidthsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listSubnetBandwidths, hcClient);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return CompletableFuture<ListSubnetsResponse>
     */
    public CompletableFuture<ListSubnetsResponse> listSubnetsAsync(ListSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listSubnets);
    }

    /**
     * 查询子网列表
     *
     * 查询子网列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubnetsRequest 请求对象
     * @return AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse>
     */
    public AsyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsAsyncInvoker(ListSubnetsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listSubnets, hcClient);
    }

    /**
     * 查询vpc
     *
     * 查询vpc。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcInfoRequest 请求对象
     * @return CompletableFuture<ListVpcInfoResponse>
     */
    public CompletableFuture<ListVpcInfoResponse> listVpcInfoAsync(ListVpcInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listVpcInfo);
    }

    /**
     * 查询vpc
     *
     * 查询vpc。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcInfoRequest 请求对象
     * @return AsyncInvoker<ListVpcInfoRequest, ListVpcInfoResponse>
     */
    public AsyncInvoker<ListVpcInfoRequest, ListVpcInfoResponse> listVpcInfoAsyncInvoker(ListVpcInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listVpcInfo, hcClient);
    }

    /**
     * 查询云办公带宽的控制配置
     *
     * 查询云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetBandwidthControlListRequest 请求对象
     * @return CompletableFuture<ShowSubnetBandwidthControlListResponse>
     */
    public CompletableFuture<ShowSubnetBandwidthControlListResponse> showSubnetBandwidthControlListAsync(
        ShowSubnetBandwidthControlListRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showSubnetBandwidthControlList);
    }

    /**
     * 查询云办公带宽的控制配置
     *
     * 查询云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubnetBandwidthControlListRequest 请求对象
     * @return AsyncInvoker<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse>
     */
    public AsyncInvoker<ShowSubnetBandwidthControlListRequest, ShowSubnetBandwidthControlListResponse> showSubnetBandwidthControlListAsyncInvoker(
        ShowSubnetBandwidthControlListRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showSubnetBandwidthControlList, hcClient);
    }

    /**
     * 查询正在被使用的子网id列表
     *
     * 根据子网id列表查询正在被桌面使用的子网id，并且返回subnetId列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUsingSubnetsRequest 请求对象
     * @return CompletableFuture<ShowUsingSubnetsResponse>
     */
    public CompletableFuture<ShowUsingSubnetsResponse> showUsingSubnetsAsync(ShowUsingSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showUsingSubnets);
    }

    /**
     * 查询正在被使用的子网id列表
     *
     * 根据子网id列表查询正在被桌面使用的子网id，并且返回subnetId列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUsingSubnetsRequest 请求对象
     * @return AsyncInvoker<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse>
     */
    public AsyncInvoker<ShowUsingSubnetsRequest, ShowUsingSubnetsResponse> showUsingSubnetsAsyncInvoker(
        ShowUsingSubnetsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showUsingSubnets, hcClient);
    }

    /**
     * 修改云办公带宽
     *
     * 修改云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateSubnetBandwidthResponse>
     */
    public CompletableFuture<UpdateSubnetBandwidthResponse> updateSubnetBandwidthAsync(
        UpdateSubnetBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateSubnetBandwidth);
    }

    /**
     * 修改云办公带宽
     *
     * 修改云办公带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse>
     */
    public AsyncInvoker<UpdateSubnetBandwidthRequest, UpdateSubnetBandwidthResponse> updateSubnetBandwidthAsyncInvoker(
        UpdateSubnetBandwidthRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateSubnetBandwidth, hcClient);
    }

    /**
     * 修改云办公带宽的控制配置
     *
     * 修改云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthControlListRequest 请求对象
     * @return CompletableFuture<UpdateSubnetBandwidthControlListResponse>
     */
    public CompletableFuture<UpdateSubnetBandwidthControlListResponse> updateSubnetBandwidthControlListAsync(
        UpdateSubnetBandwidthControlListRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateSubnetBandwidthControlList);
    }

    /**
     * 修改云办公带宽的控制配置
     *
     * 修改云办公带宽的控制配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetBandwidthControlListRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse>
     */
    public AsyncInvoker<UpdateSubnetBandwidthControlListRequest, UpdateSubnetBandwidthControlListResponse> updateSubnetBandwidthControlListAsyncInvoker(
        UpdateSubnetBandwidthControlListRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateSubnetBandwidthControlList, hcClient);
    }

    /**
     * 创建变更订单
     *
     * 变更规格、扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChangeOrderRequest 请求对象
     * @return CompletableFuture<CreateChangeOrderResponse>
     */
    public CompletableFuture<CreateChangeOrderResponse> createChangeOrderAsync(CreateChangeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createChangeOrder);
    }

    /**
     * 创建变更订单
     *
     * 变更规格、扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChangeOrderRequest 请求对象
     * @return AsyncInvoker<CreateChangeOrderRequest, CreateChangeOrderResponse>
     */
    public AsyncInvoker<CreateChangeOrderRequest, CreateChangeOrderResponse> createChangeOrderAsyncInvoker(
        CreateChangeOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createChangeOrder, hcClient);
    }

    /**
     * 包周期桌面批量变更下单
     *
     * 包周期桌面批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopBatchOrderRequest 请求对象
     * @return CompletableFuture<CreateDesktopBatchOrderResponse>
     */
    public CompletableFuture<CreateDesktopBatchOrderResponse> createDesktopBatchOrderAsync(
        CreateDesktopBatchOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopBatchOrder);
    }

    /**
     * 包周期桌面批量变更下单
     *
     * 包周期桌面批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopBatchOrderRequest 请求对象
     * @return AsyncInvoker<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse>
     */
    public AsyncInvoker<CreateDesktopBatchOrderRequest, CreateDesktopBatchOrderResponse> createDesktopBatchOrderAsyncInvoker(
        CreateDesktopBatchOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopBatchOrder, hcClient);
    }

    /**
     * 创建桌面订单
     *
     * 创建桌面订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopOrderRequest 请求对象
     * @return CompletableFuture<CreateDesktopOrderResponse>
     */
    public CompletableFuture<CreateDesktopOrderResponse> createDesktopOrderAsync(CreateDesktopOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopOrder);
    }

    /**
     * 创建桌面订单
     *
     * 创建桌面订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopOrderRequest 请求对象
     * @return AsyncInvoker<CreateDesktopOrderRequest, CreateDesktopOrderResponse>
     */
    public AsyncInvoker<CreateDesktopOrderRequest, CreateDesktopOrderResponse> createDesktopOrderAsyncInvoker(
        CreateDesktopOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopOrder, hcClient);
    }

    /**
     * 包周期桌面池批量变更下单
     *
     * 包周期桌面池批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolChangeOrderRequest 请求对象
     * @return CompletableFuture<CreateDesktopPoolChangeOrderResponse>
     */
    public CompletableFuture<CreateDesktopPoolChangeOrderResponse> createDesktopPoolChangeOrderAsync(
        CreateDesktopPoolChangeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopPoolChangeOrder);
    }

    /**
     * 包周期桌面池批量变更下单
     *
     * 包周期桌面池批量变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopPoolChangeOrderRequest 请求对象
     * @return AsyncInvoker<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse>
     */
    public AsyncInvoker<CreateDesktopPoolChangeOrderRequest, CreateDesktopPoolChangeOrderResponse> createDesktopPoolChangeOrderAsyncInvoker(
        CreateDesktopPoolChangeOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopPoolChangeOrder, hcClient);
    }

    /**
     * 包周期下单
     *
     * 包周期资源（桌面、磁盘）下订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return CompletableFuture<CreateOrderResponse>
     */
    public CompletableFuture<CreateOrderResponse> createOrderAsync(CreateOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createOrder);
    }

    /**
     * 包周期下单
     *
     * 包周期资源（桌面、磁盘）下订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrderRequest 请求对象
     * @return AsyncInvoker<CreateOrderRequest, CreateOrderResponse>
     */
    public AsyncInvoker<CreateOrderRequest, CreateOrderResponse> createOrderAsyncInvoker(CreateOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createOrder, hcClient);
    }

    /**
     * 创建资源包订单
     *
     * 创建资源包订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcePackagesOrderRequest 请求对象
     * @return CompletableFuture<CreateResourcePackagesOrderResponse>
     */
    public CompletableFuture<CreateResourcePackagesOrderResponse> createResourcePackagesOrderAsync(
        CreateResourcePackagesOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createResourcePackagesOrder);
    }

    /**
     * 创建资源包订单
     *
     * 创建资源包订单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourcePackagesOrderRequest 请求对象
     * @return AsyncInvoker<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse>
     */
    public AsyncInvoker<CreateResourcePackagesOrderRequest, CreateResourcePackagesOrderResponse> createResourcePackagesOrderAsyncInvoker(
        CreateResourcePackagesOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createResourcePackagesOrder, hcClient);
    }

    /**
     * 包周期云办公带宽变更下单
     *
     * 包周期云办公带宽变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetBandwidthChangeOrderRequest 请求对象
     * @return CompletableFuture<CreateSubnetBandwidthChangeOrderResponse>
     */
    public CompletableFuture<CreateSubnetBandwidthChangeOrderResponse> createSubnetBandwidthChangeOrderAsync(
        CreateSubnetBandwidthChangeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createSubnetBandwidthChangeOrder);
    }

    /**
     * 包周期云办公带宽变更下单
     *
     * 包周期云办公带宽变更下单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubnetBandwidthChangeOrderRequest 请求对象
     * @return AsyncInvoker<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse>
     */
    public AsyncInvoker<CreateSubnetBandwidthChangeOrderRequest, CreateSubnetBandwidthChangeOrderResponse> createSubnetBandwidthChangeOrderAsyncInvoker(
        CreateSubnetBandwidthChangeOrderRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createSubnetBandwidthChangeOrder, hcClient);
    }

    /**
     * 新增OU信息
     *
     * 该接口用于创建OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOuRequest 请求对象
     * @return CompletableFuture<AddOuResponse>
     */
    public CompletableFuture<AddOuResponse> addOuAsync(AddOuRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addOu);
    }

    /**
     * 新增OU信息
     *
     * 该接口用于创建OU。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddOuRequest 请求对象
     * @return AsyncInvoker<AddOuRequest, AddOuResponse>
     */
    public AsyncInvoker<AddOuRequest, AddOuResponse> addOuAsyncInvoker(AddOuRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addOu, hcClient);
    }

    /**
     * 删除OU信息
     *
     * 该接口用于删除OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOuRequest 请求对象
     * @return CompletableFuture<DeleteOuResponse>
     */
    public CompletableFuture<DeleteOuResponse> deleteOuAsync(DeleteOuRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteOu);
    }

    /**
     * 删除OU信息
     *
     * 该接口用于删除OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOuRequest 请求对象
     * @return AsyncInvoker<DeleteOuRequest, DeleteOuResponse>
     */
    public AsyncInvoker<DeleteOuRequest, DeleteOuResponse> deleteOuAsyncInvoker(DeleteOuRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteOu, hcClient);
    }

    /**
     * 查询OU下用户信息
     *
     * 查询OU下用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOuUsersRequest 请求对象
     * @return CompletableFuture<ListAdOuUsersResponse>
     */
    public CompletableFuture<ListAdOuUsersResponse> listAdOuUsersAsync(ListAdOuUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAdOuUsers);
    }

    /**
     * 查询OU下用户信息
     *
     * 查询OU下用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOuUsersRequest 请求对象
     * @return AsyncInvoker<ListAdOuUsersRequest, ListAdOuUsersResponse>
     */
    public AsyncInvoker<ListAdOuUsersRequest, ListAdOuUsersResponse> listAdOuUsersAsyncInvoker(
        ListAdOuUsersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAdOuUsers, hcClient);
    }

    /**
     * 查询AD里的OU列表
     *
     * 查询AD里的OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOusRequest 请求对象
     * @return CompletableFuture<ListAdOusResponse>
     */
    public CompletableFuture<ListAdOusResponse> listAdOusAsync(ListAdOusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAdOus);
    }

    /**
     * 查询AD里的OU列表
     *
     * 查询AD里的OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAdOusRequest 请求对象
     * @return AsyncInvoker<ListAdOusRequest, ListAdOusResponse>
     */
    public AsyncInvoker<ListAdOusRequest, ListAdOusResponse> listAdOusAsyncInvoker(ListAdOusRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAdOus, hcClient);
    }

    /**
     * 查询OU列表
     *
     * 查询OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOuDetailsRequest 请求对象
     * @return CompletableFuture<ListOuDetailsResponse>
     */
    public CompletableFuture<ListOuDetailsResponse> listOuDetailsAsync(ListOuDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listOuDetails);
    }

    /**
     * 查询OU列表
     *
     * 查询OU列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOuDetailsRequest 请求对象
     * @return AsyncInvoker<ListOuDetailsRequest, ListOuDetailsResponse>
     */
    public AsyncInvoker<ListOuDetailsRequest, ListOuDetailsResponse> listOuDetailsAsyncInvoker(
        ListOuDetailsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listOuDetails, hcClient);
    }

    /**
     * 更新OU信息
     *
     * 更新OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOuInfoRequest 请求对象
     * @return CompletableFuture<UpdateOuInfoResponse>
     */
    public CompletableFuture<UpdateOuInfoResponse> updateOuInfoAsync(UpdateOuInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateOuInfo);
    }

    /**
     * 更新OU信息
     *
     * 更新OU信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOuInfoRequest 请求对象
     * @return AsyncInvoker<UpdateOuInfoRequest, UpdateOuInfoResponse>
     */
    public AsyncInvoker<UpdateOuInfoRequest, UpdateOuInfoResponse> updateOuInfoAsyncInvoker(
        UpdateOuInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateOuInfo, hcClient);
    }

    /**
     * 修改策略组应用对象
     *
     * 批量增加、删除应用对象到指定策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTargetOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<BatchUpdateTargetOfPolicyGroupResponse>
     */
    public CompletableFuture<BatchUpdateTargetOfPolicyGroupResponse> batchUpdateTargetOfPolicyGroupAsync(
        BatchUpdateTargetOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchUpdateTargetOfPolicyGroup);
    }

    /**
     * 修改策略组应用对象
     *
     * 批量增加、删除应用对象到指定策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTargetOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse>
     */
    public AsyncInvoker<BatchUpdateTargetOfPolicyGroupRequest, BatchUpdateTargetOfPolicyGroupResponse> batchUpdateTargetOfPolicyGroupAsyncInvoker(
        BatchUpdateTargetOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchUpdateTargetOfPolicyGroup, hcClient);
    }

    /**
     * 新增策略组
     *
     * 新增策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return CompletableFuture<CreatePolicyGroupResponse>
     */
    public CompletableFuture<CreatePolicyGroupResponse> createPolicyGroupAsync(CreatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createPolicyGroup);
    }

    /**
     * 新增策略组
     *
     * 新增策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse>
     */
    public AsyncInvoker<CreatePolicyGroupRequest, CreatePolicyGroupResponse> createPolicyGroupAsyncInvoker(
        CreatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createPolicyGroup, hcClient);
    }

    /**
     * 创建策略模板
     *
     * 创建策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return CompletableFuture<CreatePolicyTemplateResponse>
     */
    public CompletableFuture<CreatePolicyTemplateResponse> createPolicyTemplateAsync(
        CreatePolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createPolicyTemplate);
    }

    /**
     * 创建策略模板
     *
     * 创建策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse>
     */
    public AsyncInvoker<CreatePolicyTemplateRequest, CreatePolicyTemplateResponse> createPolicyTemplateAsyncInvoker(
        CreatePolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createPolicyTemplate, hcClient);
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
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deletePolicyGroup);
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
        return new AsyncInvoker<>(request, WorkspaceMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 导出策略组
     *
     * 导出xml文件形式的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPolicyGroupsRequest 请求对象
     * @return CompletableFuture<ExportPolicyGroupsResponse>
     */
    public CompletableFuture<ExportPolicyGroupsResponse> exportPolicyGroupsAsync(ExportPolicyGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportPolicyGroups);
    }

    /**
     * 导出策略组
     *
     * 导出xml文件形式的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportPolicyGroupsRequest 请求对象
     * @return AsyncInvoker<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse>
     */
    public AsyncInvoker<ExportPolicyGroupsRequest, ExportPolicyGroupsResponse> exportPolicyGroupsAsyncInvoker(
        ExportPolicyGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportPolicyGroups, hcClient);
    }

    /**
     * 导入策略组
     *
     * 以xml文件形式导入策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPolicyGroupsRequest 请求对象
     * @return CompletableFuture<ImportPolicyGroupsResponse>
     */
    public CompletableFuture<ImportPolicyGroupsResponse> importPolicyGroupsAsync(ImportPolicyGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.importPolicyGroups);
    }

    /**
     * 导入策略组
     *
     * 以xml文件形式导入策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportPolicyGroupsRequest 请求对象
     * @return AsyncInvoker<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse>
     */
    public AsyncInvoker<ImportPolicyGroupsRequest, ImportPolicyGroupsResponse> importPolicyGroupsAsyncInvoker(
        ImportPolicyGroupsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.importPolicyGroups, hcClient);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOriginalPolicyInfoRequest 请求对象
     * @return CompletableFuture<ListOriginalPolicyInfoResponse>
     */
    public CompletableFuture<ListOriginalPolicyInfoResponse> listOriginalPolicyInfoAsync(
        ListOriginalPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listOriginalPolicyInfo);
    }

    /**
     * 查询初始策略项
     *
     * 查询初始策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOriginalPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse>
     */
    public AsyncInvoker<ListOriginalPolicyInfoRequest, ListOriginalPolicyInfoResponse> listOriginalPolicyInfoAsyncInvoker(
        ListOriginalPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listOriginalPolicyInfo, hcClient);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPoliciesOfPolicyGroupResponse>
     */
    public CompletableFuture<ListPoliciesOfPolicyGroupResponse> listPoliciesOfPolicyGroupAsync(
        ListPoliciesOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPoliciesOfPolicyGroup);
    }

    /**
     * 查询策略组中的策略项
     *
     * 查询指定策略组内的策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse>
     */
    public AsyncInvoker<ListPoliciesOfPolicyGroupRequest, ListPoliciesOfPolicyGroupResponse> listPoliciesOfPolicyGroupAsyncInvoker(
        ListPoliciesOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPoliciesOfPolicyGroup, hcClient);
    }

    /**
     * 查询策略组
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDetailInfoByIdRequest 请求对象
     * @return CompletableFuture<ListPolicyDetailInfoByIdResponse>
     */
    public CompletableFuture<ListPolicyDetailInfoByIdResponse> listPolicyDetailInfoByIdAsync(
        ListPolicyDetailInfoByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPolicyDetailInfoById);
    }

    /**
     * 查询策略组
     *
     * 根据策略组ID查询策略组详细信息，包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyDetailInfoByIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse>
     */
    public AsyncInvoker<ListPolicyDetailInfoByIdRequest, ListPolicyDetailInfoByIdResponse> listPolicyDetailInfoByIdAsyncInvoker(
        ListPolicyDetailInfoByIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPolicyDetailInfoById, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表，不包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyGroupResponse> listPolicyGroupAsync(ListPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组概要信息列表，不包含策略信息以及应用对象信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupAsyncInvoker(
        ListPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPolicyGroup, hcClient);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupInfoRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupInfoResponse>
     */
    public CompletableFuture<ListPolicyGroupInfoResponse> listPolicyGroupInfoAsync(ListPolicyGroupInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listPolicyGroupInfo);
    }

    /**
     * 查询策略组详情列表
     *
     * 包含策略信息以及应用对象的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupInfoRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse>
     */
    public AsyncInvoker<ListPolicyGroupInfoRequest, ListPolicyGroupInfoResponse> listPolicyGroupInfoAsyncInvoker(
        ListPolicyGroupInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listPolicyGroupInfo, hcClient);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListTargetOfPolicyGroupResponse>
     */
    public CompletableFuture<ListTargetOfPolicyGroupResponse> listTargetOfPolicyGroupAsync(
        ListTargetOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTargetOfPolicyGroup);
    }

    /**
     * 查询策略组应用对象
     *
     * 查询指定策略组所应用的对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTargetOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse>
     */
    public AsyncInvoker<ListTargetOfPolicyGroupRequest, ListTargetOfPolicyGroupResponse> listTargetOfPolicyGroupAsyncInvoker(
        ListTargetOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTargetOfPolicyGroup, hcClient);
    }

    /**
     * 修改策略组中的策略项
     *
     * 修改一个策略组的部分或者所有策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoliciesOfPolicyGroupRequest 请求对象
     * @return CompletableFuture<UpdatePoliciesOfPolicyGroupResponse>
     */
    public CompletableFuture<UpdatePoliciesOfPolicyGroupResponse> updatePoliciesOfPolicyGroupAsync(
        UpdatePoliciesOfPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updatePoliciesOfPolicyGroup);
    }

    /**
     * 修改策略组中的策略项
     *
     * 修改一个策略组的部分或者所有策略项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoliciesOfPolicyGroupRequest 请求对象
     * @return AsyncInvoker<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse>
     */
    public AsyncInvoker<UpdatePoliciesOfPolicyGroupRequest, UpdatePoliciesOfPolicyGroupResponse> updatePoliciesOfPolicyGroupAsyncInvoker(
        UpdatePoliciesOfPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updatePoliciesOfPolicyGroup, hcClient);
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
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updatePolicyGroup);
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
        return new AsyncInvoker<>(request, WorkspaceMeta.updatePolicyGroup, hcClient);
    }

    /**
     * 查询可订购小时包类型
     *
     * 该接口用于查询可订购小时包类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHourPackagesTypeRequest 请求对象
     * @return CompletableFuture<ListHourPackagesTypeResponse>
     */
    public CompletableFuture<ListHourPackagesTypeResponse> listHourPackagesTypeAsync(
        ListHourPackagesTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listHourPackagesType);
    }

    /**
     * 查询可订购小时包类型
     *
     * 该接口用于查询可订购小时包类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHourPackagesTypeRequest 请求对象
     * @return AsyncInvoker<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse>
     */
    public AsyncInvoker<ListHourPackagesTypeRequest, ListHourPackagesTypeResponse> listHourPackagesTypeAsyncInvoker(
        ListHourPackagesTypeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listHourPackagesType, hcClient);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listProducts);
    }

    /**
     * 查询产品套餐列表
     *
     * 该接口用于查询云桌面支持的产品套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listProducts, hcClient);
    }

    /**
     * 查询按需资源包列表
     *
     * 该接口用于查询按需资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePackagesRequest 请求对象
     * @return CompletableFuture<ListResourcePackagesResponse>
     */
    public CompletableFuture<ListResourcePackagesResponse> listResourcePackagesAsync(
        ListResourcePackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listResourcePackages);
    }

    /**
     * 查询按需资源包列表
     *
     * 该接口用于查询按需资源包列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePackagesRequest 请求对象
     * @return AsyncInvoker<ListResourcePackagesRequest, ListResourcePackagesResponse>
     */
    public AsyncInvoker<ListResourcePackagesRequest, ListResourcePackagesResponse> listResourcePackagesAsyncInvoker(
        ListResourcePackagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listResourcePackages, hcClient);
    }

    /**
     * 查询协同套餐列表
     *
     * 该接口用于查询协同套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharerProductsRequest 请求对象
     * @return CompletableFuture<ListSharerProductsResponse>
     */
    public CompletableFuture<ListSharerProductsResponse> listSharerProductsAsync(ListSharerProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listSharerProducts);
    }

    /**
     * 查询协同套餐列表
     *
     * 该接口用于查询协同套餐列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharerProductsRequest 请求对象
     * @return AsyncInvoker<ListSharerProductsRequest, ListSharerProductsResponse>
     */
    public AsyncInvoker<ListSharerProductsRequest, ListSharerProductsResponse> listSharerProductsAsyncInvoker(
        ListSharerProductsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listSharerProducts, hcClient);
    }

    /**
     * 查询租户功能状态
     *
     * 查询租户功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfilesRequest 请求对象
     * @return CompletableFuture<ListTenantProfilesResponse>
     */
    public CompletableFuture<ListTenantProfilesResponse> listTenantProfilesAsync(ListTenantProfilesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTenantProfiles);
    }

    /**
     * 查询租户功能状态
     *
     * 查询租户功能状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantProfilesRequest 请求对象
     * @return AsyncInvoker<ListTenantProfilesRequest, ListTenantProfilesResponse>
     */
    public AsyncInvoker<ListTenantProfilesRequest, ListTenantProfilesResponse> listTenantProfilesAsyncInvoker(
        ListTenantProfilesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTenantProfiles, hcClient);
    }

    /**
     * 启禁用租户功能
     *
     * 启禁用租户功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantProfileRequest 请求对象
     * @return CompletableFuture<UpdateTenantProfileResponse>
     */
    public CompletableFuture<UpdateTenantProfileResponse> updateTenantProfileAsync(UpdateTenantProfileRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTenantProfile);
    }

    /**
     * 启禁用租户功能
     *
     * 启禁用租户功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantProfileRequest 请求对象
     * @return AsyncInvoker<UpdateTenantProfileRequest, UpdateTenantProfileResponse>
     */
    public AsyncInvoker<UpdateTenantProfileRequest, UpdateTenantProfileResponse> updateTenantProfileAsyncInvoker(
        UpdateTenantProfileRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateTenantProfile, hcClient);
    }

    /**
     * 查询租户单个站点配额详情
     *
     * 查询租户单个站点配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaDetailsRequest 请求对象
     * @return CompletableFuture<ShowQuotaDetailsResponse>
     */
    public CompletableFuture<ShowQuotaDetailsResponse> showQuotaDetailsAsync(ShowQuotaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showQuotaDetails);
    }

    /**
     * 查询租户单个站点配额详情
     *
     * 查询租户单个站点配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaDetailsRequest 请求对象
     * @return AsyncInvoker<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse>
     */
    public AsyncInvoker<ShowQuotaDetailsRequest, ShowQuotaDetailsResponse> showQuotaDetailsAsyncInvoker(
        ShowQuotaDetailsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showQuotaDetails, hcClient);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showQuotas);
    }

    /**
     * 查询租户配额
     *
     * Console Framework和WKSDesktopManager调用该接口查询租户配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showQuotas, hcClient);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return CompletableFuture<BatchDeleteScheduledTasksResponse>
     */
    public CompletableFuture<BatchDeleteScheduledTasksResponse> batchDeleteScheduledTasksAsync(
        BatchDeleteScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteScheduledTasks);
    }

    /**
     * 批量删除定时任务
     *
     * 批量删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScheduledTasksRequest 请求对象
     * @return AsyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse>
     */
    public AsyncInvoker<BatchDeleteScheduledTasksRequest, BatchDeleteScheduledTasksResponse> batchDeleteScheduledTasksAsyncInvoker(
        BatchDeleteScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteScheduledTasks, hcClient);
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
     * @return CompletableFuture<CreateScheduledTasksResponse>
     */
    public CompletableFuture<CreateScheduledTasksResponse> createScheduledTasksAsync(
        CreateScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createScheduledTasks);
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
     * @return AsyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse>
     */
    public AsyncInvoker<CreateScheduledTasksRequest, CreateScheduledTasksResponse> createScheduledTasksAsyncInvoker(
        CreateScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createScheduledTasks, hcClient);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return CompletableFuture<DeleteScheduledTasksResponse>
     */
    public CompletableFuture<DeleteScheduledTasksResponse> deleteScheduledTasksAsync(
        DeleteScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteScheduledTasks);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduledTasksRequest 请求对象
     * @return AsyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse>
     */
    public AsyncInvoker<DeleteScheduledTasksRequest, DeleteScheduledTasksResponse> deleteScheduledTasksAsyncInvoker(
        DeleteScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteScheduledTasks, hcClient);
    }

    /**
     * 导出定时任务记录及执行详情
     *
     * 导出定时任务记录及执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportScheduledTasksRecordsRequest 请求对象
     * @return CompletableFuture<ExportScheduledTasksRecordsResponse>
     */
    public CompletableFuture<ExportScheduledTasksRecordsResponse> exportScheduledTasksRecordsAsync(
        ExportScheduledTasksRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportScheduledTasksRecords);
    }

    /**
     * 导出定时任务记录及执行详情
     *
     * 导出定时任务记录及执行详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportScheduledTasksRecordsRequest 请求对象
     * @return AsyncInvoker<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse>
     */
    public AsyncInvoker<ExportScheduledTasksRecordsRequest, ExportScheduledTasksRecordsResponse> exportScheduledTasksRecordsAsyncInvoker(
        ExportScheduledTasksRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportScheduledTasksRecords, hcClient);
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
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listFutureExecutions);
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
        return new AsyncInvoker<>(request, WorkspaceMeta.listFutureExecutions, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return CompletableFuture<ListScheduledTasksResponse>
     */
    public CompletableFuture<ListScheduledTasksResponse> listScheduledTasksAsync(ListScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScheduledTasks);
    }

    /**
     * 查询定时任务列表
     *
     * 查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRequest 请求对象
     * @return AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse>
     */
    public AsyncInvoker<ListScheduledTasksRequest, ListScheduledTasksResponse> listScheduledTasksAsyncInvoker(
        ListScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScheduledTasks, hcClient);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return CompletableFuture<ListScheduledTasksRecordsResponse>
     */
    public CompletableFuture<ListScheduledTasksRecordsResponse> listScheduledTasksRecordsAsync(
        ListScheduledTasksRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecords);
    }

    /**
     * 查询定时任务执行记录
     *
     * 查询定时任务执行记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsRequest 请求对象
     * @return AsyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse>
     */
    public AsyncInvoker<ListScheduledTasksRecordsRequest, ListScheduledTasksRecordsResponse> listScheduledTasksRecordsAsyncInvoker(
        ListScheduledTasksRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecords, hcClient);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return CompletableFuture<ListScheduledTasksRecordsDetailsResponse>
     */
    public CompletableFuture<ListScheduledTasksRecordsDetailsResponse> listScheduledTasksRecordsDetailsAsync(
        ListScheduledTasksRecordsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScheduledTasksRecordsDetails);
    }

    /**
     * 查询定时任务执行记录详情
     *
     * 查询定时任务执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledTasksRecordsDetailsRequest 请求对象
     * @return AsyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse>
     */
    public AsyncInvoker<ListScheduledTasksRecordsDetailsRequest, ListScheduledTasksRecordsDetailsResponse> listScheduledTasksRecordsDetailsAsyncInvoker(
        ListScheduledTasksRecordsDetailsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScheduledTasksRecordsDetails, hcClient);
    }

    /**
     * 获取时区配置
     *
     * 获取时区配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeZonesRequest 请求对象
     * @return CompletableFuture<ListTimeZonesResponse>
     */
    public CompletableFuture<ListTimeZonesResponse> listTimeZonesAsync(ListTimeZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTimeZones);
    }

    /**
     * 获取时区配置
     *
     * 获取时区配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTimeZonesRequest 请求对象
     * @return AsyncInvoker<ListTimeZonesRequest, ListTimeZonesResponse>
     */
    public AsyncInvoker<ListTimeZonesRequest, ListTimeZonesResponse> listTimeZonesAsyncInvoker(
        ListTimeZonesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTimeZones, hcClient);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return CompletableFuture<ShowScheduledTasksResponse>
     */
    public CompletableFuture<ShowScheduledTasksResponse> showScheduledTasksAsync(ShowScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showScheduledTasks);
    }

    /**
     * 查询定时任务详情
     *
     * 查询定时任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScheduledTasksRequest 请求对象
     * @return AsyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse>
     */
    public AsyncInvoker<ShowScheduledTasksRequest, ShowScheduledTasksResponse> showScheduledTasksAsyncInvoker(
        ShowScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showScheduledTasks, hcClient);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return CompletableFuture<UpdateScheduledTasksResponse>
     */
    public CompletableFuture<UpdateScheduledTasksResponse> updateScheduledTasksAsync(
        UpdateScheduledTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateScheduledTasks);
    }

    /**
     * 修改定时任务
     *
     * 修改定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledTasksRequest 请求对象
     * @return AsyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse>
     */
    public AsyncInvoker<UpdateScheduledTasksRequest, UpdateScheduledTasksResponse> updateScheduledTasksAsyncInvoker(
        UpdateScheduledTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateScheduledTasks, hcClient);
    }

    /**
     * 批量删除录屏记录
     *
     * 批量删除录屏记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScreenRecordsRequest 请求对象
     * @return CompletableFuture<BatchDeleteScreenRecordsResponse>
     */
    public CompletableFuture<BatchDeleteScreenRecordsResponse> batchDeleteScreenRecordsAsync(
        BatchDeleteScreenRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteScreenRecords);
    }

    /**
     * 批量删除录屏记录
     *
     * 批量删除录屏记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteScreenRecordsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse>
     */
    public AsyncInvoker<BatchDeleteScreenRecordsRequest, BatchDeleteScreenRecordsResponse> batchDeleteScreenRecordsAsyncInvoker(
        BatchDeleteScreenRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteScreenRecords, hcClient);
    }

    /**
     * 查询桌面关键事件列表
     *
     * 查询桌面关键事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopOperationsRequest 请求对象
     * @return CompletableFuture<ListDesktopOperationsResponse>
     */
    public CompletableFuture<ListDesktopOperationsResponse> listDesktopOperationsAsync(
        ListDesktopOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopOperations);
    }

    /**
     * 查询桌面关键事件列表
     *
     * 查询桌面关键事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopOperationsRequest 请求对象
     * @return AsyncInvoker<ListDesktopOperationsRequest, ListDesktopOperationsResponse>
     */
    public AsyncInvoker<ListDesktopOperationsRequest, ListDesktopOperationsResponse> listDesktopOperationsAsyncInvoker(
        ListDesktopOperationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopOperations, hcClient);
    }

    /**
     * 查询下载地址列表
     *
     * 查询下载地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadAddressRequest 请求对象
     * @return CompletableFuture<ListDownloadAddressResponse>
     */
    public CompletableFuture<ListDownloadAddressResponse> listDownloadAddressAsync(ListDownloadAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDownloadAddress);
    }

    /**
     * 查询下载地址列表
     *
     * 查询下载地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadAddressRequest 请求对象
     * @return AsyncInvoker<ListDownloadAddressRequest, ListDownloadAddressResponse>
     */
    public AsyncInvoker<ListDownloadAddressRequest, ListDownloadAddressResponse> listDownloadAddressAsyncInvoker(
        ListDownloadAddressRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDownloadAddress, hcClient);
    }

    /**
     * 查询录屏记录列表
     *
     * 查询录屏记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScreenRecordsRequest 请求对象
     * @return CompletableFuture<ListScreenRecordsResponse>
     */
    public CompletableFuture<ListScreenRecordsResponse> listScreenRecordsAsync(ListScreenRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScreenRecords);
    }

    /**
     * 查询录屏记录列表
     *
     * 查询录屏记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScreenRecordsRequest 请求对象
     * @return AsyncInvoker<ListScreenRecordsRequest, ListScreenRecordsResponse>
     */
    public AsyncInvoker<ListScreenRecordsRequest, ListScreenRecordsResponse> listScreenRecordsAsyncInvoker(
        ListScreenRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScreenRecords, hcClient);
    }

    /**
     * 查询录屏详情
     *
     * 查询录屏详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScreenRecordRequest 请求对象
     * @return CompletableFuture<ShowScreenRecordResponse>
     */
    public CompletableFuture<ShowScreenRecordResponse> showScreenRecordAsync(ShowScreenRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showScreenRecord);
    }

    /**
     * 查询录屏详情
     *
     * 查询录屏详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScreenRecordRequest 请求对象
     * @return AsyncInvoker<ShowScreenRecordRequest, ShowScreenRecordResponse>
     */
    public AsyncInvoker<ShowScreenRecordRequest, ShowScreenRecordResponse> showScreenRecordAsyncInvoker(
        ShowScreenRecordRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showScreenRecord, hcClient);
    }

    /**
     * 新增脚本
     *
     * 新增脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return CompletableFuture<CreateScriptResponse>
     */
    public CompletableFuture<CreateScriptResponse> createScriptAsync(CreateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createScript);
    }

    /**
     * 新增脚本
     *
     * 新增脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScriptRequest 请求对象
     * @return AsyncInvoker<CreateScriptRequest, CreateScriptResponse>
     */
    public AsyncInvoker<CreateScriptRequest, CreateScriptResponse> createScriptAsyncInvoker(
        CreateScriptRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createScript, hcClient);
    }

    /**
     * 删除脚本
     *
     * 删除脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return CompletableFuture<DeleteScriptResponse>
     */
    public CompletableFuture<DeleteScriptResponse> deleteScriptAsync(DeleteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteScript);
    }

    /**
     * 删除脚本
     *
     * 删除脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScriptRequest 请求对象
     * @return AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse>
     */
    public AsyncInvoker<DeleteScriptRequest, DeleteScriptResponse> deleteScriptAsyncInvoker(
        DeleteScriptRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteScript, hcClient);
    }

    /**
     * 按桌面标签下发执行脚本或命令
     *
     * 按桌面标签下发执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptByDesktopTagRequest 请求对象
     * @return CompletableFuture<ExecuteScriptByDesktopTagResponse>
     */
    public CompletableFuture<ExecuteScriptByDesktopTagResponse> executeScriptByDesktopTagAsync(
        ExecuteScriptByDesktopTagRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.executeScriptByDesktopTag);
    }

    /**
     * 按桌面标签下发执行脚本或命令
     *
     * 按桌面标签下发执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptByDesktopTagRequest 请求对象
     * @return AsyncInvoker<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse>
     */
    public AsyncInvoker<ExecuteScriptByDesktopTagRequest, ExecuteScriptByDesktopTagResponse> executeScriptByDesktopTagAsyncInvoker(
        ExecuteScriptByDesktopTagRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.executeScriptByDesktopTag, hcClient);
    }

    /**
     * 批量执行脚本或命令
     *
     * 批量执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptOrCommandRequest 请求对象
     * @return CompletableFuture<ExecuteScriptOrCommandResponse>
     */
    public CompletableFuture<ExecuteScriptOrCommandResponse> executeScriptOrCommandAsync(
        ExecuteScriptOrCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.executeScriptOrCommand);
    }

    /**
     * 批量执行脚本或命令
     *
     * 批量执行脚本或命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteScriptOrCommandRequest 请求对象
     * @return AsyncInvoker<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse>
     */
    public AsyncInvoker<ExecuteScriptOrCommandRequest, ExecuteScriptOrCommandResponse> executeScriptOrCommandAsyncInvoker(
        ExecuteScriptOrCommandRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.executeScriptOrCommand, hcClient);
    }

    /**
     * 查询脚本执行记录列表
     *
     * 查询脚本执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptRecordsRequest 请求对象
     * @return CompletableFuture<ListScriptRecordsResponse>
     */
    public CompletableFuture<ListScriptRecordsResponse> listScriptRecordsAsync(ListScriptRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScriptRecords);
    }

    /**
     * 查询脚本执行记录列表
     *
     * 查询脚本执行记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptRecordsRequest 请求对象
     * @return AsyncInvoker<ListScriptRecordsRequest, ListScriptRecordsResponse>
     */
    public AsyncInvoker<ListScriptRecordsRequest, ListScriptRecordsResponse> listScriptRecordsAsyncInvoker(
        ListScriptRecordsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScriptRecords, hcClient);
    }

    /**
     * 查询脚本任务列表
     *
     * 查询脚本任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptTasksRequest 请求对象
     * @return CompletableFuture<ListScriptTasksResponse>
     */
    public CompletableFuture<ListScriptTasksResponse> listScriptTasksAsync(ListScriptTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScriptTasks);
    }

    /**
     * 查询脚本任务列表
     *
     * 查询脚本任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptTasksRequest 请求对象
     * @return AsyncInvoker<ListScriptTasksRequest, ListScriptTasksResponse>
     */
    public AsyncInvoker<ListScriptTasksRequest, ListScriptTasksResponse> listScriptTasksAsyncInvoker(
        ListScriptTasksRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScriptTasks, hcClient);
    }

    /**
     * 查询脚本列表
     *
     * 查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return CompletableFuture<ListScriptsResponse>
     */
    public CompletableFuture<ListScriptsResponse> listScriptsAsync(ListScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listScripts);
    }

    /**
     * 查询脚本列表
     *
     * 查询脚本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScriptsRequest 请求对象
     * @return AsyncInvoker<ListScriptsRequest, ListScriptsResponse>
     */
    public AsyncInvoker<ListScriptsRequest, ListScriptsResponse> listScriptsAsyncInvoker(ListScriptsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listScripts, hcClient);
    }

    /**
     * 重试脚本或执行脚本失败的任务
     *
     * 重试脚本或执行脚本失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryScriptExecutionRequest 请求对象
     * @return CompletableFuture<RetryScriptExecutionResponse>
     */
    public CompletableFuture<RetryScriptExecutionResponse> retryScriptExecutionAsync(
        RetryScriptExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.retryScriptExecution);
    }

    /**
     * 重试脚本或执行脚本失败的任务
     *
     * 重试脚本或执行脚本失败的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryScriptExecutionRequest 请求对象
     * @return AsyncInvoker<RetryScriptExecutionRequest, RetryScriptExecutionResponse>
     */
    public AsyncInvoker<RetryScriptExecutionRequest, RetryScriptExecutionResponse> retryScriptExecutionAsyncInvoker(
        RetryScriptExecutionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.retryScriptExecution, hcClient);
    }

    /**
     * 查询脚本详情
     *
     * 查询脚本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptDetailRequest 请求对象
     * @return CompletableFuture<ShowScriptDetailResponse>
     */
    public CompletableFuture<ShowScriptDetailResponse> showScriptDetailAsync(ShowScriptDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showScriptDetail);
    }

    /**
     * 查询脚本详情
     *
     * 查询脚本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptDetailRequest 请求对象
     * @return AsyncInvoker<ShowScriptDetailRequest, ShowScriptDetailResponse>
     */
    public AsyncInvoker<ShowScriptDetailRequest, ShowScriptDetailResponse> showScriptDetailAsyncInvoker(
        ShowScriptDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showScriptDetail, hcClient);
    }

    /**
     * 查询脚本执行记录详情
     *
     * 查询脚本执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRecordDetailRequest 请求对象
     * @return CompletableFuture<ShowScriptRecordDetailResponse>
     */
    public CompletableFuture<ShowScriptRecordDetailResponse> showScriptRecordDetailAsync(
        ShowScriptRecordDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showScriptRecordDetail);
    }

    /**
     * 查询脚本执行记录详情
     *
     * 查询脚本执行记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptRecordDetailRequest 请求对象
     * @return AsyncInvoker<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse>
     */
    public AsyncInvoker<ShowScriptRecordDetailRequest, ShowScriptRecordDetailResponse> showScriptRecordDetailAsyncInvoker(
        ShowScriptRecordDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showScriptRecordDetail, hcClient);
    }

    /**
     * 停止脚本或者命令执行任务
     *
     * 停止脚本或者命令执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScriptExecutionRequest 请求对象
     * @return CompletableFuture<StopScriptExecutionResponse>
     */
    public CompletableFuture<StopScriptExecutionResponse> stopScriptExecutionAsync(StopScriptExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.stopScriptExecution);
    }

    /**
     * 停止脚本或者命令执行任务
     *
     * 停止脚本或者命令执行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopScriptExecutionRequest 请求对象
     * @return AsyncInvoker<StopScriptExecutionRequest, StopScriptExecutionResponse>
     */
    public AsyncInvoker<StopScriptExecutionRequest, StopScriptExecutionResponse> stopScriptExecutionAsyncInvoker(
        StopScriptExecutionRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.stopScriptExecution, hcClient);
    }

    /**
     * 更新脚本
     *
     * 更新脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return CompletableFuture<UpdateScriptResponse>
     */
    public CompletableFuture<UpdateScriptResponse> updateScriptAsync(UpdateScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateScript);
    }

    /**
     * 更新脚本
     *
     * 更新脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScriptRequest 请求对象
     * @return AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse>
     */
    public AsyncInvoker<UpdateScriptRequest, UpdateScriptResponse> updateScriptAsyncInvoker(
        UpdateScriptRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateScript, hcClient);
    }

    /**
     * 桌面购买附属资源
     *
     * 存量桌面购买附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopSubResourcesRequest 请求对象
     * @return CompletableFuture<AddDesktopSubResourcesResponse>
     */
    public CompletableFuture<AddDesktopSubResourcesResponse> addDesktopSubResourcesAsync(
        AddDesktopSubResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addDesktopSubResources);
    }

    /**
     * 桌面购买附属资源
     *
     * 存量桌面购买附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopSubResourcesRequest 请求对象
     * @return AsyncInvoker<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse>
     */
    public AsyncInvoker<AddDesktopSubResourcesRequest, AddDesktopSubResourcesResponse> addDesktopSubResourcesAsyncInvoker(
        AddDesktopSubResourcesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addDesktopSubResources, hcClient);
    }

    /**
     * 桌面删除附属资源
     *
     * 桌面删除附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopSubResourcesRequest 请求对象
     * @return CompletableFuture<DeleteDesktopSubResourcesResponse>
     */
    public CompletableFuture<DeleteDesktopSubResourcesResponse> deleteDesktopSubResourcesAsync(
        DeleteDesktopSubResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktopSubResources);
    }

    /**
     * 桌面删除附属资源
     *
     * 桌面删除附属资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopSubResourcesRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse>
     */
    public AsyncInvoker<DeleteDesktopSubResourcesRequest, DeleteDesktopSubResourcesResponse> deleteDesktopSubResourcesAsyncInvoker(
        DeleteDesktopSubResourcesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteDesktopSubResources, hcClient);
    }

    /**
     * 查询协同桌面默认用户配置
     *
     * 查询协同桌面默认用户配置（当前功能公测中,需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareSpaceConfigRequest 请求对象
     * @return CompletableFuture<ShowShareSpaceConfigResponse>
     */
    public CompletableFuture<ShowShareSpaceConfigResponse> showShareSpaceConfigAsync(
        ShowShareSpaceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showShareSpaceConfig);
    }

    /**
     * 查询协同桌面默认用户配置
     *
     * 查询协同桌面默认用户配置（当前功能公测中,需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShareSpaceConfigRequest 请求对象
     * @return AsyncInvoker<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse>
     */
    public AsyncInvoker<ShowShareSpaceConfigRequest, ShowShareSpaceConfigResponse> showShareSpaceConfigAsyncInvoker(
        ShowShareSpaceConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showShareSpaceConfig, hcClient);
    }

    /**
     * 设置协同桌面默认用户配置
     *
     * 设置协同桌面默认用户配置（当前功能公测中，需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareSpaceConfigRequest 请求对象
     * @return CompletableFuture<UpdateShareSpaceConfigResponse>
     */
    public CompletableFuture<UpdateShareSpaceConfigResponse> updateShareSpaceConfigAsync(
        UpdateShareSpaceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateShareSpaceConfig);
    }

    /**
     * 设置协同桌面默认用户配置
     *
     * 设置协同桌面默认用户配置（当前功能公测中，需要使用请联系管理员申请使用）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareSpaceConfigRequest 请求对象
     * @return AsyncInvoker<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse>
     */
    public AsyncInvoker<UpdateShareSpaceConfigRequest, UpdateShareSpaceConfigResponse> updateShareSpaceConfigAsyncInvoker(
        UpdateShareSpaceConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateShareSpaceConfig, hcClient);
    }

    /**
     * 新增站点
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSiteRequest 请求对象
     * @return CompletableFuture<AddSiteResponse>
     */
    public CompletableFuture<AddSiteResponse> addSiteAsync(AddSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addSite);
    }

    /**
     * 新增站点
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSiteRequest 请求对象
     * @return AsyncInvoker<AddSiteRequest, AddSiteResponse>
     */
    public AsyncInvoker<AddSiteRequest, AddSiteResponse> addSiteAsyncInvoker(AddSiteRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addSite, hcClient);
    }

    /**
     * 校验边缘站点资源
     *
     * 校验边缘站点资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEdgeSiteResourcesRequest 请求对象
     * @return CompletableFuture<CheckEdgeSiteResourcesResponse>
     */
    public CompletableFuture<CheckEdgeSiteResourcesResponse> checkEdgeSiteResourcesAsync(
        CheckEdgeSiteResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.checkEdgeSiteResources);
    }

    /**
     * 校验边缘站点资源
     *
     * 校验边缘站点资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEdgeSiteResourcesRequest 请求对象
     * @return AsyncInvoker<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse>
     */
    public AsyncInvoker<CheckEdgeSiteResourcesRequest, CheckEdgeSiteResourcesResponse> checkEdgeSiteResourcesAsyncInvoker(
        CheckEdgeSiteResourcesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.checkEdgeSiteResources, hcClient);
    }

    /**
     * 删除站点
     *
     * 用于删除站点的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteRequest 请求对象
     * @return CompletableFuture<DeleteSiteResponse>
     */
    public CompletableFuture<DeleteSiteResponse> deleteSiteAsync(DeleteSiteRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteSite);
    }

    /**
     * 删除站点
     *
     * 用于删除站点的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSiteRequest 请求对象
     * @return AsyncInvoker<DeleteSiteRequest, DeleteSiteResponse>
     */
    public AsyncInvoker<DeleteSiteRequest, DeleteSiteResponse> deleteSiteAsyncInvoker(DeleteSiteRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteSite, hcClient);
    }

    /**
     * 查询站点信息
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteConfigsRequest 请求对象
     * @return CompletableFuture<ListSiteConfigsResponse>
     */
    public CompletableFuture<ListSiteConfigsResponse> listSiteConfigsAsync(ListSiteConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listSiteConfigs);
    }

    /**
     * 查询站点信息
     *
     * 用于查询站点信息的接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSiteConfigsRequest 请求对象
     * @return AsyncInvoker<ListSiteConfigsRequest, ListSiteConfigsResponse>
     */
    public AsyncInvoker<ListSiteConfigsRequest, ListSiteConfigsResponse> listSiteConfigsAsyncInvoker(
        ListSiteConfigsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listSiteConfigs, hcClient);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWksEdgeSitesRequest 请求对象
     * @return CompletableFuture<ListWksEdgeSitesResponse>
     */
    public CompletableFuture<ListWksEdgeSitesResponse> listWksEdgeSitesAsync(ListWksEdgeSitesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listWksEdgeSites);
    }

    /**
     * 查询边缘小站列表
     *
     * 查询边缘小站列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWksEdgeSitesRequest 请求对象
     * @return AsyncInvoker<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse>
     */
    public AsyncInvoker<ListWksEdgeSitesRequest, ListWksEdgeSitesResponse> listWksEdgeSitesAsyncInvoker(
        ListWksEdgeSitesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listWksEdgeSites, hcClient);
    }

    /**
     * 修改站点接入方式
     *
     * 用于修改站点接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessModeRequest 请求对象
     * @return CompletableFuture<UpdateAccessModeResponse>
     */
    public CompletableFuture<UpdateAccessModeResponse> updateAccessModeAsync(UpdateAccessModeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateAccessMode);
    }

    /**
     * 修改站点接入方式
     *
     * 用于修改站点接入方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessModeRequest 请求对象
     * @return AsyncInvoker<UpdateAccessModeRequest, UpdateAccessModeResponse>
     */
    public AsyncInvoker<UpdateAccessModeRequest, UpdateAccessModeResponse> updateAccessModeAsyncInvoker(
        UpdateAccessModeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateAccessMode, hcClient);
    }

    /**
     * 修改站点业务子网
     *
     * 用于修改站点业务子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetIdsRequest 请求对象
     * @return CompletableFuture<UpdateSubnetIdsResponse>
     */
    public CompletableFuture<UpdateSubnetIdsResponse> updateSubnetIdsAsync(UpdateSubnetIdsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateSubnetIds);
    }

    /**
     * 修改站点业务子网
     *
     * 用于修改站点业务子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubnetIdsRequest 请求对象
     * @return AsyncInvoker<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse>
     */
    public AsyncInvoker<UpdateSubnetIdsRequest, UpdateSubnetIdsResponse> updateSubnetIdsAsyncInvoker(
        UpdateSubnetIdsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateSubnetIds, hcClient);
    }

    /**
     * 批量创建快照
     *
     * 批量创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesktopSnapshotRequest 请求对象
     * @return CompletableFuture<BatchCreateDesktopSnapshotResponse>
     */
    public CompletableFuture<BatchCreateDesktopSnapshotResponse> batchCreateDesktopSnapshotAsync(
        BatchCreateDesktopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchCreateDesktopSnapshot);
    }

    /**
     * 批量创建快照
     *
     * 批量创建快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateDesktopSnapshotRequest 请求对象
     * @return AsyncInvoker<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse>
     */
    public AsyncInvoker<BatchCreateDesktopSnapshotRequest, BatchCreateDesktopSnapshotResponse> batchCreateDesktopSnapshotAsyncInvoker(
        BatchCreateDesktopSnapshotRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchCreateDesktopSnapshot, hcClient);
    }

    /**
     * 批量删除快照
     *
     * 批量删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopSnapshotRequest 请求对象
     * @return CompletableFuture<BatchDeleteDesktopSnapshotResponse>
     */
    public CompletableFuture<BatchDeleteDesktopSnapshotResponse> batchDeleteDesktopSnapshotAsync(
        BatchDeleteDesktopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteDesktopSnapshot);
    }

    /**
     * 批量删除快照
     *
     * 批量删除快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDesktopSnapshotRequest 请求对象
     * @return AsyncInvoker<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse>
     */
    public AsyncInvoker<BatchDeleteDesktopSnapshotRequest, BatchDeleteDesktopSnapshotResponse> batchDeleteDesktopSnapshotAsyncInvoker(
        BatchDeleteDesktopSnapshotRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteDesktopSnapshot, hcClient);
    }

    /**
     * 批量恢复快照
     *
     * 批量恢快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDesktopSnapshotRequest 请求对象
     * @return CompletableFuture<BatchRestoreDesktopSnapshotResponse>
     */
    public CompletableFuture<BatchRestoreDesktopSnapshotResponse> batchRestoreDesktopSnapshotAsync(
        BatchRestoreDesktopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchRestoreDesktopSnapshot);
    }

    /**
     * 批量恢复快照
     *
     * 批量恢快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDesktopSnapshotRequest 请求对象
     * @return AsyncInvoker<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse>
     */
    public AsyncInvoker<BatchRestoreDesktopSnapshotRequest, BatchRestoreDesktopSnapshotResponse> batchRestoreDesktopSnapshotAsyncInvoker(
        BatchRestoreDesktopSnapshotRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchRestoreDesktopSnapshot, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopSnapshotRequest 请求对象
     * @return CompletableFuture<ListDesktopSnapshotResponse>
     */
    public CompletableFuture<ListDesktopSnapshotResponse> listDesktopSnapshotAsync(ListDesktopSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopSnapshot);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopSnapshotRequest 请求对象
     * @return AsyncInvoker<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse>
     */
    public AsyncInvoker<ListDesktopSnapshotRequest, ListDesktopSnapshotResponse> listDesktopSnapshotAsyncInvoker(
        ListDesktopSnapshotRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopSnapshot, hcClient);
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
     * @return CompletableFuture<AddMetricNotifyRuleResponse>
     */
    public CompletableFuture<AddMetricNotifyRuleResponse> addMetricNotifyRuleAsync(AddMetricNotifyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addMetricNotifyRule);
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
     * @return AsyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse>
     */
    public AsyncInvoker<AddMetricNotifyRuleRequest, AddMetricNotifyRuleResponse> addMetricNotifyRuleAsyncInvoker(
        AddMetricNotifyRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addMetricNotifyRule, hcClient);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return CompletableFuture<DeleteMetricNotifyRuleResponse>
     */
    public CompletableFuture<DeleteMetricNotifyRuleResponse> deleteMetricNotifyRuleAsync(
        DeleteMetricNotifyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteMetricNotifyRule);
    }

    /**
     * 删除通知规则
     *
     * 删除对应指标的通知规则;对应指标满足相应的规则条件时发送通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMetricNotifyRuleRequest 请求对象
     * @return AsyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse>
     */
    public AsyncInvoker<DeleteMetricNotifyRuleRequest, DeleteMetricNotifyRuleResponse> deleteMetricNotifyRuleAsyncInvoker(
        DeleteMetricNotifyRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteMetricNotifyRule, hcClient);
    }

    /**
     * 导出云应用接入统计数据
     *
     * 创建云应用接入统计导出任务，仅能导出最近30天的数据。创建后根据taskId调用ListExportTasks查询任务状态，调用DownloadExportFile下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAppUserAccessDataRequest 请求对象
     * @return CompletableFuture<ExportAppUserAccessDataResponse>
     */
    public CompletableFuture<ExportAppUserAccessDataResponse> exportAppUserAccessDataAsync(
        ExportAppUserAccessDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportAppUserAccessData);
    }

    /**
     * 导出云应用接入统计数据
     *
     * 创建云应用接入统计导出任务，仅能导出最近30天的数据。创建后根据taskId调用ListExportTasks查询任务状态，调用DownloadExportFile下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAppUserAccessDataRequest 请求对象
     * @return AsyncInvoker<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse>
     */
    public AsyncInvoker<ExportAppUserAccessDataRequest, ExportAppUserAccessDataResponse> exportAppUserAccessDataAsyncInvoker(
        ExportAppUserAccessDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportAppUserAccessData, hcClient);
    }

    /**
     * 查询云应用接入统计数据
     *
     * 查询云应用接入统计数据，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppUserAccessDataRequest 请求对象
     * @return CompletableFuture<ListAppUserAccessDataResponse>
     */
    public CompletableFuture<ListAppUserAccessDataResponse> listAppUserAccessDataAsync(
        ListAppUserAccessDataRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listAppUserAccessData);
    }

    /**
     * 查询云应用接入统计数据
     *
     * 查询云应用接入统计数据，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppUserAccessDataRequest 请求对象
     * @return AsyncInvoker<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse>
     */
    public AsyncInvoker<ListAppUserAccessDataRequest, ListAppUserAccessDataResponse> listAppUserAccessDataAsyncInvoker(
        ListAppUserAccessDataRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listAppUserAccessData, hcClient);
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
     * @return CompletableFuture<ListDesktopUsageMetricResponse>
     */
    public CompletableFuture<ListDesktopUsageMetricResponse> listDesktopUsageMetricAsync(
        ListDesktopUsageMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopUsageMetric);
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
     * @return AsyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse>
     */
    public AsyncInvoker<ListDesktopUsageMetricRequest, ListDesktopUsageMetricResponse> listDesktopUsageMetricAsyncInvoker(
        ListDesktopUsageMetricRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopUsageMetric, hcClient);
    }

    /**
     * 桌面统计
     *
     * 统计租户下的普通桌面、桌面池状态，默认仅统计总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsStatisticsRequest 请求对象
     * @return CompletableFuture<ListDesktopsStatisticsResponse>
     */
    public CompletableFuture<ListDesktopsStatisticsResponse> listDesktopsStatisticsAsync(
        ListDesktopsStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listDesktopsStatistics);
    }

    /**
     * 桌面统计
     *
     * 统计租户下的普通桌面、桌面池状态，默认仅统计总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDesktopsStatisticsRequest 请求对象
     * @return AsyncInvoker<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse>
     */
    public AsyncInvoker<ListDesktopsStatisticsRequest, ListDesktopsStatisticsResponse> listDesktopsStatisticsAsyncInvoker(
        ListDesktopsStatisticsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listDesktopsStatistics, hcClient);
    }

    /**
     * 登录状态统计
     *
     * 查询租户桌面登录状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginStateRequest 请求对象
     * @return CompletableFuture<ListLoginStateResponse>
     */
    public CompletableFuture<ListLoginStateResponse> listLoginStateAsync(ListLoginStateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listLoginState);
    }

    /**
     * 登录状态统计
     *
     * 查询租户桌面登录状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginStateRequest 请求对象
     * @return AsyncInvoker<ListLoginStateRequest, ListLoginStateResponse>
     */
    public AsyncInvoker<ListLoginStateRequest, ListLoginStateResponse> listLoginStateAsyncInvoker(
        ListLoginStateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listLoginState, hcClient);
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
     * @return CompletableFuture<ListMetricNotifyRecordResponse>
     */
    public CompletableFuture<ListMetricNotifyRecordResponse> listMetricNotifyRecordAsync(
        ListMetricNotifyRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRecord);
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
     * @return AsyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse>
     */
    public AsyncInvoker<ListMetricNotifyRecordRequest, ListMetricNotifyRecordResponse> listMetricNotifyRecordAsyncInvoker(
        ListMetricNotifyRecordRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRecord, hcClient);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return CompletableFuture<ListMetricNotifyRuleResponse>
     */
    public CompletableFuture<ListMetricNotifyRuleResponse> listMetricNotifyRuleAsync(
        ListMetricNotifyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listMetricNotifyRule);
    }

    /**
     * 查询通知规则
     *
     * 查询对应指标的通知规则;。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricNotifyRuleRequest 请求对象
     * @return AsyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse>
     */
    public AsyncInvoker<ListMetricNotifyRuleRequest, ListMetricNotifyRuleResponse> listMetricNotifyRuleAsyncInvoker(
        ListMetricNotifyRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listMetricNotifyRule, hcClient);
    }

    /**
     * 查询指标
     *
     * 查询指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return CompletableFuture<ListMetricsResponse>
     */
    public CompletableFuture<ListMetricsResponse> listMetricsAsync(ListMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listMetrics);
    }

    /**
     * 查询指标
     *
     * 查询指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsRequest 请求对象
     * @return AsyncInvoker<ListMetricsRequest, ListMetricsResponse>
     */
    public AsyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsAsyncInvoker(ListMetricsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listMetrics, hcClient);
    }

    /**
     * 查询指标趋势
     *
     * 查询指标趋势。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsTrendRequest 请求对象
     * @return CompletableFuture<ListMetricsTrendResponse>
     */
    public CompletableFuture<ListMetricsTrendResponse> listMetricsTrendAsync(ListMetricsTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listMetricsTrend);
    }

    /**
     * 查询指标趋势
     *
     * 查询指标趋势。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricsTrendRequest 请求对象
     * @return AsyncInvoker<ListMetricsTrendRequest, ListMetricsTrendResponse>
     */
    public AsyncInvoker<ListMetricsTrendRequest, ListMetricsTrendResponse> listMetricsTrendAsyncInvoker(
        ListMetricsTrendRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listMetricsTrend, hcClient);
    }

    /**
     * 运行状态统计
     *
     * 租户桌面运行状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunStateRequest 请求对象
     * @return CompletableFuture<ListRunStateResponse>
     */
    public CompletableFuture<ListRunStateResponse> listRunStateAsync(ListRunStateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listRunState);
    }

    /**
     * 运行状态统计
     *
     * 租户桌面运行状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRunStateRequest 请求对象
     * @return AsyncInvoker<ListRunStateRequest, ListRunStateResponse>
     */
    public AsyncInvoker<ListRunStateRequest, ListRunStateResponse> listRunStateAsyncInvoker(
        ListRunStateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listRunState, hcClient);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnusedDesktopsRequest 请求对象
     * @return CompletableFuture<ListUnusedDesktopsResponse>
     */
    public CompletableFuture<ListUnusedDesktopsResponse> listUnusedDesktopsAsync(ListUnusedDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUnusedDesktops);
    }

    /**
     * 查询在指定时间段未使用的桌面
     *
     * 查询在指定时间段未使用的桌面。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnusedDesktopsRequest 请求对象
     * @return AsyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse>
     */
    public AsyncInvoker<ListUnusedDesktopsRequest, ListUnusedDesktopsResponse> listUnusedDesktopsAsyncInvoker(
        ListUnusedDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUnusedDesktops, hcClient);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsedDesktopInfoRequest 请求对象
     * @return CompletableFuture<ListUsedDesktopInfoResponse>
     */
    public CompletableFuture<ListUsedDesktopInfoResponse> listUsedDesktopInfoAsync(ListUsedDesktopInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsedDesktopInfo);
    }

    /**
     * 查询使用桌面的时长
     *
     * 查询使用桌面的时长。已废弃，不推荐使用。统计数据推荐使用[查询桌面使用情况统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListDesktopUsageMetric)和[查询用户使用统计数据接口](https://console.huaweicloud.com/apiexplorer/#/openapi/Workspace/doc?api&#x3D;ListUserUsageMetric)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsedDesktopInfoRequest 请求对象
     * @return AsyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse>
     */
    public AsyncInvoker<ListUsedDesktopInfoRequest, ListUsedDesktopInfoResponse> listUsedDesktopInfoAsyncInvoker(
        ListUsedDesktopInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUsedDesktopInfo, hcClient);
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
     * @return CompletableFuture<ListUserUsageMetricResponse>
     */
    public CompletableFuture<ListUserUsageMetricResponse> listUserUsageMetricAsync(ListUserUsageMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserUsageMetric);
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
     * @return AsyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse>
     */
    public AsyncInvoker<ListUserUsageMetricRequest, ListUserUsageMetricResponse> listUserUsageMetricAsyncInvoker(
        ListUserUsageMetricRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUserUsageMetric, hcClient);
    }

    /**
     * 查询指标环比值
     *
     * 查询指标环比值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGrowthRateRequest 请求对象
     * @return CompletableFuture<ShowGrowthRateResponse>
     */
    public CompletableFuture<ShowGrowthRateResponse> showGrowthRateAsync(ShowGrowthRateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showGrowthRate);
    }

    /**
     * 查询指标环比值
     *
     * 查询指标环比值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGrowthRateRequest 请求对象
     * @return AsyncInvoker<ShowGrowthRateRequest, ShowGrowthRateResponse>
     */
    public AsyncInvoker<ShowGrowthRateRequest, ShowGrowthRateResponse> showGrowthRateAsyncInvoker(
        ShowGrowthRateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showGrowthRate, hcClient);
    }

    /**
     * 查询接入云桌面或云应用各阶段时长数据
     *
     * 查询接入云桌面或云应用各阶段时长数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessStagesRequest 请求对象
     * @return CompletableFuture<ShowUserAccessStagesResponse>
     */
    public CompletableFuture<ShowUserAccessStagesResponse> showUserAccessStagesAsync(
        ShowUserAccessStagesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showUserAccessStages);
    }

    /**
     * 查询接入云桌面或云应用各阶段时长数据
     *
     * 查询接入云桌面或云应用各阶段时长数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessStagesRequest 请求对象
     * @return AsyncInvoker<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse>
     */
    public AsyncInvoker<ShowUserAccessStagesRequest, ShowUserAccessStagesResponse> showUserAccessStagesAsyncInvoker(
        ShowUserAccessStagesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showUserAccessStages, hcClient);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return CompletableFuture<UpdateMetricNotifyRuleResponse>
     */
    public CompletableFuture<UpdateMetricNotifyRuleResponse> updateMetricNotifyRuleAsync(
        UpdateMetricNotifyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateMetricNotifyRule);
    }

    /**
     * 更新通知规则
     *
     * 更新对应指标的通知规则;对应指标满足相应的规则条件时发送通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricNotifyRuleRequest 请求对象
     * @return AsyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse>
     */
    public AsyncInvoker<UpdateMetricNotifyRuleRequest, UpdateMetricNotifyRuleResponse> updateMetricNotifyRuleAsyncInvoker(
        UpdateMetricNotifyRuleRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateMetricNotifyRule, hcClient);
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
     * @return CompletableFuture<ExportDesktopUsageMetricNewResponse>
     */
    public CompletableFuture<ExportDesktopUsageMetricNewResponse> exportDesktopUsageMetricNewAsync(
        ExportDesktopUsageMetricNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportDesktopUsageMetricNew);
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
     * @return AsyncInvoker<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse>
     */
    public AsyncInvoker<ExportDesktopUsageMetricNewRequest, ExportDesktopUsageMetricNewResponse> exportDesktopUsageMetricNewAsyncInvoker(
        ExportDesktopUsageMetricNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportDesktopUsageMetricNew, hcClient);
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
     * @return CompletableFuture<ExportUserUsageMetricNewResponse>
     */
    public CompletableFuture<ExportUserUsageMetricNewResponse> exportUserUsageMetricNewAsync(
        ExportUserUsageMetricNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserUsageMetricNew);
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
     * @return AsyncInvoker<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse>
     */
    public AsyncInvoker<ExportUserUsageMetricNewRequest, ExportUserUsageMetricNewResponse> exportUserUsageMetricNewAsyncInvoker(
        ExportUserUsageMetricNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserUsageMetricNew, hcClient);
    }

    /**
     * 根据子网id查询该子网下可用的ip
     *
     * 根据子网id查询该子网下可用的ip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableIpRequest 请求对象
     * @return CompletableFuture<ShowAvailableIpResponse>
     */
    public CompletableFuture<ShowAvailableIpResponse> showAvailableIpAsync(ShowAvailableIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showAvailableIp);
    }

    /**
     * 根据子网id查询该子网下可用的ip
     *
     * 根据子网id查询该子网下可用的ip。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableIpRequest 请求对象
     * @return AsyncInvoker<ShowAvailableIpRequest, ShowAvailableIpResponse>
     */
    public AsyncInvoker<ShowAvailableIpRequest, ShowAvailableIpResponse> showAvailableIpAsyncInvoker(
        ShowAvailableIpRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showAvailableIp, hcClient);
    }

    /**
     * 查询租户个性配置列表
     *
     * 查询租户个性配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantConfigsRequest 请求对象
     * @return CompletableFuture<ListTenantConfigsResponse>
     */
    public CompletableFuture<ListTenantConfigsResponse> listTenantConfigsAsync(ListTenantConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTenantConfigs);
    }

    /**
     * 查询租户个性配置列表
     *
     * 查询租户个性配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantConfigsRequest 请求对象
     * @return AsyncInvoker<ListTenantConfigsRequest, ListTenantConfigsResponse>
     */
    public AsyncInvoker<ListTenantConfigsRequest, ListTenantConfigsResponse> listTenantConfigsAsyncInvoker(
        ListTenantConfigsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTenantConfigs, hcClient);
    }

    /**
     * 修改租户个性配置
     *
     * 租户个性配置修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantConfigRequest 请求对象
     * @return CompletableFuture<UpdateTenantConfigResponse>
     */
    public CompletableFuture<UpdateTenantConfigResponse> updateTenantConfigAsync(UpdateTenantConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTenantConfig);
    }

    /**
     * 修改租户个性配置
     *
     * 租户个性配置修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantConfigRequest 请求对象
     * @return AsyncInvoker<UpdateTenantConfigRequest, UpdateTenantConfigResponse>
     */
    public AsyncInvoker<UpdateTenantConfigRequest, UpdateTenantConfigResponse> updateTenantConfigAsyncInvoker(
        UpdateTenantConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateTenantConfig, hcClient);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
     * @return CompletableFuture<CreateTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsAsync(
        CreateTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createTerminalsBindingDesktops);
    }

    /**
     * 增加终端与桌面绑定配置
     *
     * 增加终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<CreateTerminalsBindingDesktopsRequest, CreateTerminalsBindingDesktopsResponse> createTerminalsBindingDesktopsAsyncInvoker(
        CreateTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createTerminalsBindingDesktops, hcClient);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return CompletableFuture<DeleteTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsAsync(
        DeleteTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteTerminalsBindingDesktops);
    }

    /**
     * 删除终端与桌面绑定配置
     *
     * 删除终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<DeleteTerminalsBindingDesktopsRequest, DeleteTerminalsBindingDesktopsResponse> deleteTerminalsBindingDesktopsAsyncInvoker(
        DeleteTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteTerminalsBindingDesktops, hcClient);
    }

    /**
     * 下载终端与桌面绑定模板
     *
     * 下载终端与桌面绑定模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsTemplateRequest 请求对象
     * @return CompletableFuture<ExportTerminalsBindingDesktopsTemplateResponse>
     */
    public CompletableFuture<ExportTerminalsBindingDesktopsTemplateResponse> exportTerminalsBindingDesktopsTemplateAsync(
        ExportTerminalsBindingDesktopsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportTerminalsBindingDesktopsTemplate);
    }

    /**
     * 下载终端与桌面绑定模板
     *
     * 下载终端与桌面绑定模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsTemplateRequest 请求对象
     * @return AsyncInvoker<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse>
     */
    public AsyncInvoker<ExportTerminalsBindingDesktopsTemplateRequest, ExportTerminalsBindingDesktopsTemplateResponse> exportTerminalsBindingDesktopsTemplateAsyncInvoker(
        ExportTerminalsBindingDesktopsTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportTerminalsBindingDesktopsTemplate, hcClient);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
     * @return CompletableFuture<ListTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsAsync(
        ListTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktops);
    }

    /**
     * 查询终端与桌面绑定配置列表
     *
     * 查询终端与桌面绑定配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<ListTerminalsBindingDesktopsRequest, ListTerminalsBindingDesktopsResponse> listTerminalsBindingDesktopsAsyncInvoker(
        ListTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktops, hcClient);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return CompletableFuture<ListTerminalsBindingDesktopsConfigResponse>
     */
    public CompletableFuture<ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigAsync(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig);
    }

    /**
     * 查询终端与桌面绑定的开关配置信息
     *
     * 查询终端与桌面绑定的开关配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTerminalsBindingDesktopsConfigRequest 请求对象
     * @return AsyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse>
     */
    public AsyncInvoker<ListTerminalsBindingDesktopsConfigRequest, ListTerminalsBindingDesktopsConfigResponse> listTerminalsBindingDesktopsConfigAsyncInvoker(
        ListTerminalsBindingDesktopsConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return CompletableFuture<UpdateTerminalsBindingDesktopsResponse>
     */
    public CompletableFuture<UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsAsync(
        UpdateTerminalsBindingDesktopsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktops);
    }

    /**
     * 修改终端与桌面绑定配置
     *
     * 修改终端与桌面绑定配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsRequest 请求对象
     * @return AsyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse>
     */
    public AsyncInvoker<UpdateTerminalsBindingDesktopsRequest, UpdateTerminalsBindingDesktopsResponse> updateTerminalsBindingDesktopsAsyncInvoker(
        UpdateTerminalsBindingDesktopsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktops, hcClient);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return CompletableFuture<UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public CompletableFuture<UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigAsync(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig);
    }

    /**
     * 设置终端与桌面绑定的开关配置
     *
     * 设置终端与桌面绑定的开关配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTerminalsBindingDesktopsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse>
     */
    public AsyncInvoker<UpdateTerminalsBindingDesktopsConfigRequest, UpdateTerminalsBindingDesktopsConfigResponse> updateTerminalsBindingDesktopsConfigAsyncInvoker(
        UpdateTerminalsBindingDesktopsConfigRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateTerminalsBindingDesktopsConfig, hcClient);
    }

    /**
     * 导出终端与桌面绑定配置excel
     *
     * 导出终端与桌面绑定配置excel。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsInfoNewRequest 请求对象
     * @return CompletableFuture<ExportTerminalsBindingDesktopsInfoNewResponse>
     */
    public CompletableFuture<ExportTerminalsBindingDesktopsInfoNewResponse> exportTerminalsBindingDesktopsInfoNewAsync(
        ExportTerminalsBindingDesktopsInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportTerminalsBindingDesktopsInfoNew);
    }

    /**
     * 导出终端与桌面绑定配置excel
     *
     * 导出终端与桌面绑定配置excel。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTerminalsBindingDesktopsInfoNewRequest 请求对象
     * @return AsyncInvoker<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse>
     */
    public AsyncInvoker<ExportTerminalsBindingDesktopsInfoNewRequest, ExportTerminalsBindingDesktopsInfoNewResponse> exportTerminalsBindingDesktopsInfoNewAsyncInvoker(
        ExportTerminalsBindingDesktopsInfoNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportTerminalsBindingDesktopsInfoNew, hcClient);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsersRequest 请求对象
     * @return CompletableFuture<BatchCreateUsersResponse>
     */
    public CompletableFuture<BatchCreateUsersResponse> batchCreateUsersAsync(BatchCreateUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchCreateUsers);
    }

    /**
     * 批量创建用户
     *
     * 该接口用于批量创建用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsersRequest 请求对象
     * @return AsyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse>
     */
    public AsyncInvoker<BatchCreateUsersRequest, BatchCreateUsersResponse> batchCreateUsersAsyncInvoker(
        BatchCreateUsersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchCreateUsers, hcClient);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOtpDevicesRequest 请求对象
     * @return CompletableFuture<BatchDeleteOtpDevicesResponse>
     */
    public CompletableFuture<BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesAsync(
        BatchDeleteOtpDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteOtpDevices);
    }

    /**
     * 解绑OTP设备
     *
     * 该接口用于解绑用户的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteOtpDevicesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse>
     */
    public AsyncInvoker<BatchDeleteOtpDevicesRequest, BatchDeleteOtpDevicesResponse> batchDeleteOtpDevicesAsyncInvoker(
        BatchDeleteOtpDevicesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteOtpDevices, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 该接口用于批量删除桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserRequest 请求对象
     * @return CompletableFuture<BatchDeleteUserResponse>
     */
    public CompletableFuture<BatchDeleteUserResponse> batchDeleteUserAsync(BatchDeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchDeleteUser);
    }

    /**
     * 批量删除用户
     *
     * 该接口用于批量删除桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUserRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUserRequest, BatchDeleteUserResponse>
     */
    public AsyncInvoker<BatchDeleteUserRequest, BatchDeleteUserResponse> batchDeleteUserAsyncInvoker(
        BatchDeleteUserRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchDeleteUser, hcClient);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserStatusRequest 请求对象
     * @return CompletableFuture<ChangeUserStatusResponse>
     */
    public CompletableFuture<ChangeUserStatusResponse> changeUserStatusAsync(ChangeUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.changeUserStatus);
    }

    /**
     * 操作用户
     *
     * 该接口用于操作用户，包含三种操作：锁定、解锁和重置密码（重置密码建议使用/v2/{project_id}/users/{user_id}/random-password接口，在没有通知方式的情况下必须使用/v2/{project_id}/users/{user_id}/random-password接口）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeUserStatusRequest 请求对象
     * @return AsyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse>
     */
    public AsyncInvoker<ChangeUserStatusRequest, ChangeUserStatusResponse> changeUserStatusAsyncInvoker(
        ChangeUserStatusRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.changeUserStatus, hcClient);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopUserRequest 请求对象
     * @return CompletableFuture<CreateDesktopUserResponse>
     */
    public CompletableFuture<CreateDesktopUserResponse> createDesktopUserAsync(CreateDesktopUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.createDesktopUser);
    }

    /**
     * 创建用户
     *
     * 该接口用于创建桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDesktopUserRequest 请求对象
     * @return AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse>
     */
    public AsyncInvoker<CreateDesktopUserRequest, CreateDesktopUserResponse> createDesktopUserAsyncInvoker(
        CreateDesktopUserRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.createDesktopUser, hcClient);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return CompletableFuture<DeleteUserResponse>
     */
    public CompletableFuture<DeleteUserResponse> deleteUserAsync(DeleteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteUser);
    }

    /**
     * 删除指定用户
     *
     * 删除指定的桌面用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteUserRequest 请求对象
     * @return AsyncInvoker<DeleteUserRequest, DeleteUserResponse>
     */
    public AsyncInvoker<DeleteUserRequest, DeleteUserResponse> deleteUserAsyncInvoker(DeleteUserRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteUser, hcClient);
    }

    /**
     * 用户模板下载
     *
     * 该接口用于用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserListTemplateRequest 请求对象
     * @return CompletableFuture<ExportUserListTemplateResponse>
     */
    public CompletableFuture<ExportUserListTemplateResponse> exportUserListTemplateAsync(
        ExportUserListTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUserListTemplate);
    }

    /**
     * 用户模板下载
     *
     * 该接口用于用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUserListTemplateRequest 请求对象
     * @return AsyncInvoker<ExportUserListTemplateRequest, ExportUserListTemplateResponse>
     */
    public AsyncInvoker<ExportUserListTemplateRequest, ExportUserListTemplateResponse> exportUserListTemplateAsyncInvoker(
        ExportUserListTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUserListTemplate, hcClient);
    }

    /**
     * 创建用户模板下载
     *
     * 该接口用于创建用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersTemplateRequest 请求对象
     * @return CompletableFuture<ExportUsersTemplateResponse>
     */
    public CompletableFuture<ExportUsersTemplateResponse> exportUsersTemplateAsync(ExportUsersTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUsersTemplate);
    }

    /**
     * 创建用户模板下载
     *
     * 该接口用于创建用户模板下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersTemplateRequest 请求对象
     * @return AsyncInvoker<ExportUsersTemplateRequest, ExportUsersTemplateResponse>
     */
    public AsyncInvoker<ExportUsersTemplateRequest, ExportUsersTemplateResponse> exportUsersTemplateAsyncInvoker(
        ExportUsersTemplateRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUsersTemplate, hcClient);
    }

    /**
     * 导入用户列表
     *
     * 该接口用于导入用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserListRequest 请求对象
     * @return CompletableFuture<ImportUserListResponse>
     */
    public CompletableFuture<ImportUserListResponse> importUserListAsync(ImportUserListRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.importUserList);
    }

    /**
     * 导入用户列表
     *
     * 该接口用于导入用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportUserListRequest 请求对象
     * @return AsyncInvoker<ImportUserListRequest, ImportUserListResponse>
     */
    public AsyncInvoker<ImportUserListRequest, ImportUserListResponse> importUserListAsyncInvoker(
        ImportUserListRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.importUserList, hcClient);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtpDevicesByUserIdRequest 请求对象
     * @return CompletableFuture<ListOtpDevicesByUserIdResponse>
     */
    public CompletableFuture<ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdAsync(
        ListOtpDevicesByUserIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listOtpDevicesByUserId);
    }

    /**
     * 查询OTP设备
     *
     * 该接口用于查询相应用户下面的OTP设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtpDevicesByUserIdRequest 请求对象
     * @return AsyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse>
     */
    public AsyncInvoker<ListOtpDevicesByUserIdRequest, ListOtpDevicesByUserIdResponse> listOtpDevicesByUserIdAsyncInvoker(
        ListOtpDevicesByUserIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listOtpDevicesByUserId, hcClient);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDetailRequest 请求对象
     * @return CompletableFuture<ListUserDetailResponse>
     */
    public CompletableFuture<ListUserDetailResponse> listUserDetailAsync(ListUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserDetail);
    }

    /**
     * 查询用户详情信息
     *
     * 该接口用于查询指定的桌面用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDetailRequest 请求对象
     * @return AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse>
     */
    public AsyncInvoker<ListUserDetailRequest, ListUserDetailResponse> listUserDetailAsyncInvoker(
        ListUserDetailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUserDetail, hcClient);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUsers);
    }

    /**
     * 查询用户列表
     *
     * 该接口用于查询桌面用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUsers, hcClient);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRandomPasswordRequest 请求对象
     * @return CompletableFuture<ResetRandomPasswordResponse>
     */
    public CompletableFuture<ResetRandomPasswordResponse> resetRandomPasswordAsync(ResetRandomPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.resetRandomPassword);
    }

    /**
     * 给用户重置随机密码
     *
     * 该接口用于给用户重置一个密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetRandomPasswordRequest 请求对象
     * @return AsyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse>
     */
    public AsyncInvoker<ResetRandomPasswordRequest, ResetRandomPasswordResponse> resetRandomPasswordAsyncInvoker(
        ResetRandomPasswordRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.resetRandomPassword, hcClient);
    }

    /**
     * 重新发送邮件
     *
     * 该接口用于重新发送邮件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendEmailRequest 请求对象
     * @return CompletableFuture<SendEmailResponse>
     */
    public CompletableFuture<SendEmailResponse> sendEmailAsync(SendEmailRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.sendEmail);
    }

    /**
     * 重新发送邮件
     *
     * 该接口用于重新发送邮件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendEmailRequest 请求对象
     * @return AsyncInvoker<SendEmailRequest, SendEmailResponse>
     */
    public AsyncInvoker<SendEmailRequest, SendEmailResponse> sendEmailAsyncInvoker(SendEmailRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.sendEmail, hcClient);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInfoRequest 请求对象
     * @return CompletableFuture<UpdateUserInfoResponse>
     */
    public CompletableFuture<UpdateUserInfoResponse> updateUserInfoAsync(UpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateUserInfo);
    }

    /**
     * 修改用户信息
     *
     * 该接口用于修改桌面用户信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse>
     */
    public AsyncInvoker<UpdateUserInfoRequest, UpdateUserInfoResponse> updateUserInfoAsyncInvoker(
        UpdateUserInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateUserInfo, hcClient);
    }

    /**
     * 查询用户事件
     *
     * 查询用户事件，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsRequest 请求对象
     * @return CompletableFuture<ListUserEventsResponse>
     */
    public CompletableFuture<ListUserEventsResponse> listUserEventsAsync(ListUserEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserEvents);
    }

    /**
     * 查询用户事件
     *
     * 查询用户事件，一次最多查询30天，支持最近30天的数据查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsRequest 请求对象
     * @return AsyncInvoker<ListUserEventsRequest, ListUserEventsResponse>
     */
    public AsyncInvoker<ListUserEventsRequest, ListUserEventsResponse> listUserEventsAsyncInvoker(
        ListUserEventsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUserEvents, hcClient);
    }

    /**
     * 查询用户事件LTS配置
     *
     * 查询用户事件LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsLtsConfigurationsRequest 请求对象
     * @return CompletableFuture<ListUserEventsLtsConfigurationsResponse>
     */
    public CompletableFuture<ListUserEventsLtsConfigurationsResponse> listUserEventsLtsConfigurationsAsync(
        ListUserEventsLtsConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listUserEventsLtsConfigurations);
    }

    /**
     * 查询用户事件LTS配置
     *
     * 查询用户事件LTS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserEventsLtsConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse>
     */
    public AsyncInvoker<ListUserEventsLtsConfigurationsRequest, ListUserEventsLtsConfigurationsResponse> listUserEventsLtsConfigurationsAsyncInvoker(
        ListUserEventsLtsConfigurationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listUserEventsLtsConfigurations, hcClient);
    }

    /**
     * 配置用户事件LTS
     *
     * 配置用户事件LTS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserEventsLtsConfigurationsRequest 请求对象
     * @return CompletableFuture<SetUserEventsLtsConfigurationsResponse>
     */
    public CompletableFuture<SetUserEventsLtsConfigurationsResponse> setUserEventsLtsConfigurationsAsync(
        SetUserEventsLtsConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.setUserEventsLtsConfigurations);
    }

    /**
     * 配置用户事件LTS
     *
     * 配置用户事件LTS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserEventsLtsConfigurationsRequest 请求对象
     * @return AsyncInvoker<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse>
     */
    public AsyncInvoker<SetUserEventsLtsConfigurationsRequest, SetUserEventsLtsConfigurationsResponse> setUserEventsLtsConfigurationsAsyncInvoker(
        SetUserEventsLtsConfigurationsRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.setUserEventsLtsConfigurations, hcClient);
    }

    /**
     * 导出用户
     *
     * 以excel文件形式导出用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersNewRequest 请求对象
     * @return CompletableFuture<ExportUsersNewResponse>
     */
    public CompletableFuture<ExportUsersNewResponse> exportUsersNewAsync(ExportUsersNewRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.exportUsersNew);
    }

    /**
     * 导出用户
     *
     * 以excel文件形式导出用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportUsersNewRequest 请求对象
     * @return AsyncInvoker<ExportUsersNewRequest, ExportUsersNewResponse>
     */
    public AsyncInvoker<ExportUsersNewRequest, ExportUsersNewResponse> exportUsersNewAsyncInvoker(
        ExportUsersNewRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.exportUsersNew, hcClient);
    }

    /**
     * 增加桌面磁盘
     *
     * 给单个桌面增加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopVolumesRequest 请求对象
     * @return CompletableFuture<AddDesktopVolumesResponse>
     */
    public CompletableFuture<AddDesktopVolumesResponse> addDesktopVolumesAsync(AddDesktopVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addDesktopVolumes);
    }

    /**
     * 增加桌面磁盘
     *
     * 给单个桌面增加磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDesktopVolumesRequest 请求对象
     * @return AsyncInvoker<AddDesktopVolumesRequest, AddDesktopVolumesResponse>
     */
    public AsyncInvoker<AddDesktopVolumesRequest, AddDesktopVolumesResponse> addDesktopVolumesAsyncInvoker(
        AddDesktopVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addDesktopVolumes, hcClient);
    }

    /**
     * 批量增加桌面磁盘
     *
     * 批量增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVolumesRequest 请求对象
     * @return CompletableFuture<AddVolumesResponse>
     */
    public CompletableFuture<AddVolumesResponse> addVolumesAsync(AddVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.addVolumes);
    }

    /**
     * 批量增加桌面磁盘
     *
     * 批量增加桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVolumesRequest 请求对象
     * @return AsyncInvoker<AddVolumesRequest, AddVolumesResponse>
     */
    public AsyncInvoker<AddVolumesRequest, AddVolumesResponse> addVolumesAsyncInvoker(AddVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.addVolumes, hcClient);
    }

    /**
     * 批量修改磁盘QOS
     *
     * 批量修改磁盘QOS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyQosVolumesRequest 请求对象
     * @return CompletableFuture<BatchModifyQosVolumesResponse>
     */
    public CompletableFuture<BatchModifyQosVolumesResponse> batchModifyQosVolumesAsync(
        BatchModifyQosVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.batchModifyQosVolumes);
    }

    /**
     * 批量修改磁盘QOS
     *
     * 批量修改磁盘QOS。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyQosVolumesRequest 请求对象
     * @return AsyncInvoker<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse>
     */
    public AsyncInvoker<BatchModifyQosVolumesRequest, BatchModifyQosVolumesResponse> batchModifyQosVolumesAsyncInvoker(
        BatchModifyQosVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.batchModifyQosVolumes, hcClient);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopVolumesRequest 请求对象
     * @return CompletableFuture<DeleteDesktopVolumesResponse>
     */
    public CompletableFuture<DeleteDesktopVolumesResponse> deleteDesktopVolumesAsync(
        DeleteDesktopVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.deleteDesktopVolumes);
    }

    /**
     * 删除桌面数据盘
     *
     * 删除桌面数据盘，删除后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDesktopVolumesRequest 请求对象
     * @return AsyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse>
     */
    public AsyncInvoker<DeleteDesktopVolumesRequest, DeleteDesktopVolumesResponse> deleteDesktopVolumesAsyncInvoker(
        DeleteDesktopVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.deleteDesktopVolumes, hcClient);
    }

    /**
     * 扩容磁盘
     *
     * 扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopVolumeRequest 请求对象
     * @return CompletableFuture<ExpandDesktopVolumeResponse>
     */
    public CompletableFuture<ExpandDesktopVolumeResponse> expandDesktopVolumeAsync(ExpandDesktopVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandDesktopVolume);
    }

    /**
     * 扩容磁盘
     *
     * 扩容磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandDesktopVolumeRequest 请求对象
     * @return AsyncInvoker<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse>
     */
    public AsyncInvoker<ExpandDesktopVolumeRequest, ExpandDesktopVolumeResponse> expandDesktopVolumeAsyncInvoker(
        ExpandDesktopVolumeRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.expandDesktopVolume, hcClient);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandVolumesRequest 请求对象
     * @return CompletableFuture<ExpandVolumesResponse>
     */
    public CompletableFuture<ExpandVolumesResponse> expandVolumesAsync(ExpandVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.expandVolumes);
    }

    /**
     * 扩容桌面磁盘
     *
     * 扩容桌面磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandVolumesRequest 请求对象
     * @return AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse>
     */
    public AsyncInvoker<ExpandVolumesRequest, ExpandVolumesResponse> expandVolumesAsyncInvoker(
        ExpandVolumesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.expandVolumes, hcClient);
    }

    /**
     * 查询磁盘产品信息
     *
     * 查询磁盘产品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeProductInfoRequest 请求对象
     * @return CompletableFuture<ListVolumeProductInfoResponse>
     */
    public CompletableFuture<ListVolumeProductInfoResponse> listVolumeProductInfoAsync(
        ListVolumeProductInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listVolumeProductInfo);
    }

    /**
     * 查询磁盘产品信息
     *
     * 查询磁盘产品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVolumeProductInfoRequest 请求对象
     * @return AsyncInvoker<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse>
     */
    public AsyncInvoker<ListVolumeProductInfoRequest, ListVolumeProductInfoResponse> listVolumeProductInfoAsyncInvoker(
        ListVolumeProductInfoRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listVolumeProductInfo, hcClient);
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
     * @return CompletableFuture<ApplyWorkspaceResponse>
     */
    public CompletableFuture<ApplyWorkspaceResponse> applyWorkspaceAsync(ApplyWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.applyWorkspace);
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
     * @return AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse>
     */
    public AsyncInvoker<ApplyWorkspaceRequest, ApplyWorkspaceResponse> applyWorkspaceAsyncInvoker(
        ApplyWorkspaceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.applyWorkspace, hcClient);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelWorkspaceRequest 请求对象
     * @return CompletableFuture<CancelWorkspaceResponse>
     */
    public CompletableFuture<CancelWorkspaceResponse> cancelWorkspaceAsync(CancelWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.cancelWorkspace);
    }

    /**
     * 注销云办公服务
     *
     * 该接口用于注销云办公服务。注销前请确保当前用户下的云桌面已经删除，注销后无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelWorkspaceRequest 请求对象
     * @return AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse>
     */
    public AsyncInvoker<CancelWorkspaceRequest, CancelWorkspaceResponse> cancelWorkspaceAsyncInvoker(
        CancelWorkspaceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.cancelWorkspace, hcClient);
    }

    /**
     * 检查企业ID是否已被使用
     *
     * 检查企业ID是否已被使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEnterpriseIdRequest 请求对象
     * @return CompletableFuture<CheckEnterpriseIdResponse>
     */
    public CompletableFuture<CheckEnterpriseIdResponse> checkEnterpriseIdAsync(CheckEnterpriseIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.checkEnterpriseId);
    }

    /**
     * 检查企业ID是否已被使用
     *
     * 检查企业ID是否已被使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckEnterpriseIdRequest 请求对象
     * @return AsyncInvoker<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse>
     */
    public AsyncInvoker<CheckEnterpriseIdRequest, CheckEnterpriseIdResponse> checkEnterpriseIdAsyncInvoker(
        CheckEnterpriseIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.checkEnterpriseId, hcClient);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.listWorkspaces);
    }

    /**
     * 查询云办公服务详情
     *
     * 该接口用于查询云办公服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.listWorkspaces, hcClient);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceLockRequest 请求对象
     * @return CompletableFuture<ShowWorkspaceLockResponse>
     */
    public CompletableFuture<ShowWorkspaceLockResponse> showWorkspaceLockAsync(ShowWorkspaceLockRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.showWorkspaceLock);
    }

    /**
     * 查询云办公服务是否被锁定
     *
     * 查询云办公服务是否被锁定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkspaceLockRequest 请求对象
     * @return AsyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse>
     */
    public AsyncInvoker<ShowWorkspaceLockRequest, ShowWorkspaceLockResponse> showWorkspaceLockAsyncInvoker(
        ShowWorkspaceLockRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.showWorkspaceLock, hcClient);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockWorkspaceRequest 请求对象
     * @return CompletableFuture<UnlockWorkspaceResponse>
     */
    public CompletableFuture<UnlockWorkspaceResponse> unlockWorkspaceAsync(UnlockWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.unlockWorkspace);
    }

    /**
     * 解除云办公服务锁定状态
     *
     * 该接口目前支持解除云办公服务锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockWorkspaceRequest 请求对象
     * @return AsyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse>
     */
    public AsyncInvoker<UnlockWorkspaceRequest, UnlockWorkspaceResponse> unlockWorkspaceAsyncInvoker(
        UnlockWorkspaceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.unlockWorkspace, hcClient);
    }

    /**
     * 修改企业ID
     *
     * 修改租户的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseIdRequest 请求对象
     * @return CompletableFuture<UpdateEnterpriseIdResponse>
     */
    public CompletableFuture<UpdateEnterpriseIdResponse> updateEnterpriseIdAsync(UpdateEnterpriseIdRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateEnterpriseId);
    }

    /**
     * 修改企业ID
     *
     * 修改租户的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEnterpriseIdRequest 请求对象
     * @return AsyncInvoker<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse>
     */
    public AsyncInvoker<UpdateEnterpriseIdRequest, UpdateEnterpriseIdResponse> updateEnterpriseIdAsyncInvoker(
        UpdateEnterpriseIdRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateEnterpriseId, hcClient);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, WorkspaceMeta.updateWorkspace);
    }

    /**
     * 修改云办公服务属性
     *
     * 该接口目前支持修改云办公服务属性。单次请求仅支持修改一种属性类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, WorkspaceMeta.updateWorkspace, hcClient);
    }

}

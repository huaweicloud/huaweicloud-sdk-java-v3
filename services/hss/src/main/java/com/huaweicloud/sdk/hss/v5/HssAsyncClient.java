package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyProcessRequest;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyProcessResponse;
import com.huaweicloud.sdk.hss.v5.model.AddBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.AddCicdConfigurationRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCicdConfigurationResponse;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AddImageWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.AddImageWhiteListsResponse;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AddRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.AddRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociateProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchStartWebTamperProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchStartWebTamperProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchUpgradeAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchUpgradeAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.CancelHostsQuotaRequest;
import com.huaweicloud.sdk.hss.v5.model.CancelHostsQuotaResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAgentAutoUpgradeStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAgentAutoUpgradeStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPayPerScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPayPerScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyProcessStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyProcessStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAutoOpenQuotaStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAutoOpenQuotaStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeImageWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeImageWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeMalwareCollectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeMalwareCollectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeMonthlyOperationReportTipStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeMonthlyOperationReportTipStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangePasswordComplexityStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangePasswordComplexityStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangePolicySwitchStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangePolicySwitchStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeSwitchesStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeSwitchesStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.CopyBaselinePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.CopyBaselinePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPaidTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPaidTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateCicdConfigurationCommandRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateCicdConfigurationCommandResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateClustersInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateClustersInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateGlobalAssetScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateGlobalAssetScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateImageSynchronizeTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateImageSynchronizeTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateManualImageScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateManualImageScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteBackupHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteBackupHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteCicdConfigurationsRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteCicdConfigurationsResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteImageWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteImageWhiteListsResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DownloadAssetFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DownloadAssetFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportBaselineSecurityCheckReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportBaselineSecurityCheckReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportSecurityCheckReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportSecurityCheckReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportWebTamperHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportWebTamperHostResponse;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.HandleImageVulnerabilityRequest;
import com.huaweicloud.sdk.hss.v5.model.HandleImageVulnerabilityResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentAutoUpgradeStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentAutoUpgradeStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentVersionRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentVersionResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusPaidHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusPaidHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntivirusHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntivirusHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistHostStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistHostStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyProcessExtendRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyProcessExtendResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyProcessRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyProcessResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAssociateRegistriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAssociateRegistriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoKillVirusStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoKillVirusStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoOpenQuotaStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoOpenQuotaStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBackupHostsInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackupHostsInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBackupVaultsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackupVaultsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBaselineWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBaselineWhiteListsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterDetectRiskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterDetectRiskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCceNodesLabelRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceNodesLabelResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCicdConfigurationsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCicdConfigurationsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCicdImagesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCicdImagesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterAuditLogsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterAuditLogsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterEventLogsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterEventLogsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectOverviewRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectOverviewResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectPolicyTemplatesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectPolicyTemplatesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionDefaultPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionDefaultPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionItemRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionItemResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionPolicyDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionPolicyDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterRiskAffectResourcesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterRiskAffectResourcesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListClusterRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListClusterRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCommonTipsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCommonTipsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerCmdLogsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerCmdLogsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerImageLogsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerImageLogsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerImagesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerImagesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerLogsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerLogsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkNodeListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkNodeListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDictionariesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDictionariesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventAttCkRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventAttCkResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostEventDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostEventDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGeneralImageVulOperationsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGeneralImageVulOperationsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGeneralImageVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGeneralImageVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalAssetScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalAssetScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHandleVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHandleVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostGroupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostGroupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostProtectHistoryInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostProtectHistoryInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostRaspProtectHistoryInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostRaspProtectHistoryInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostsRiskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostsRiskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRiskPathsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRiskPathsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIacFilesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFilesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageBasicImageRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageBasicImageResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageFilesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageFilesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageHandleAffectVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageHandleAffectVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageWhiteListsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sCronJobsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sCronJobsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sDaemonSetsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sDaemonSetsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sDeploymentsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sDeploymentsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sJobsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sJobsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sPodsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sPodsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListK8sStatefulSetsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListK8sStatefulSetsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesClusterDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesClusterDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesEndpointDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesEndpointDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesServiceDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesServiceDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLockedStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLockedStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListMalwareCollectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListMalwareCollectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListMonthlyOperationReportsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListMonthlyOperationReportsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListNamespacesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListNamespacesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListOperationLogsByVaultNameRequest;
import com.huaweicloud.sdk.hss.v5.model.ListOperationLogsByVaultNameResponse;
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeRequest;
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPluginInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPluginInstallScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPluginsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPluginsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPortsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPortsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProcessStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProcessesHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProcessesHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProjectConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProjectConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServerResponse;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListProtectionServersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRansomwareProtectionNodesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRansomwareProtectionNodesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRaspEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRaspEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRaspPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRaspPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryImagesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryImagesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRegistryStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListResourceIdsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListResourceIdsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.ListResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckClusterReportsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckClusterReportsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityRiskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityRiskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSystemConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSystemConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTaskResourcesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTaskResourcesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTasksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTasksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImageAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImageAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImageContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImageContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImagesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulAffectImagesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainerAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainerAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostBackupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostBackupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostProcessRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostProcessResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVaultsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVaultsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulnerabilityCveResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWeakPasswordUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebAppAndServiceStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebAppAndServiceStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebAppAndServicesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebAppAndServicesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWorkLoadsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWorkLoadsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyCicdConfigurationRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyCicdConfigurationResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyImageScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyImageScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginCommonIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginCommonIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginCommonLocationRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginCommonLocationResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RestoreVulHostBackupRequest;
import com.huaweicloud.sdk.hss.v5.model.RestoreVulHostBackupResponse;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectRequest;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectResponse;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.SetMalwareRemindersRequest;
import com.huaweicloud.sdk.hss.v5.model.SetMalwareRemindersResponse;
import com.huaweicloud.sdk.hss.v5.model.SetProtectDirSwitchInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetProtectDirSwitchInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchResponse;
import com.huaweicloud.sdk.hss.v5.model.SetRemoteBackupInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRemoteBackupInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAccountTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAccountTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDeployTemplateRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDeployTemplateResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentStatisticsStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentStatisticsStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusFreeQuotaRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusFreeQuotaResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusPayPerScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusPayPerScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAppRaspSwitchStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAppRaspSwitchStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAppWhitelistAgentStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAppWhitelistAgentStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAutoLaunchTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAutoLaunchTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineDirectoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineDirectoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCicdConfigurationRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCicdConfigurationResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterAssetStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterAssetStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterProtectPolicyTemplateRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterProtectPolicyTemplateResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterScanStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterScanStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCommonPortRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCommonPortResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerNetworkInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerNetworkInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerNodeStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerNodeStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerProtectionStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowContainerProtectionStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortAutoBindRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortAutoBindResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortHostListRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortHostListResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowEventAttackTagRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowEventAttackTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowFileStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowFileStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHostAssetManualCollectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHostAssetManualCollectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHostProtectionStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHostProtectionStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHostsStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHostsStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHotInformationRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHotInformationResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageAssetStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageAssetStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageFilesStatRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageFilesStatResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageUploadCommandRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageUploadCommandResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageWhiteListDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageWhiteListDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowJarPackageTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowJarPackageTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sContainerDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sContainerDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sPodDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sPodDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowKernelModuleTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowKernelModuleTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesEndpointInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesEndpointInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesServiceInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesServiceInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowLatestExportTaskByTypeRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowLatestExportTaskByTypeResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMalwareRemindersRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMalwareRemindersResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowManualSecurityCheckStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowManualSecurityCheckStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMonthlyOperaReportNotifyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMonthlyOperaReportNotifyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMonthlyOperationReportDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMonthlyOperationReportDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterAuthRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterAuthResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterImageCommandRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterImageCommandResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterProxyScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowMultiCloudClusterProxyScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowNetworkStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowNetworkStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowOsStatisticsInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowOsStatisticsInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowPageNoticesRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowPageNoticesResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowPolicySwitchStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowPolicySwitchStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowPorcessTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowPorcessTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowPortTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowPortTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowQuotaStatisticsInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowQuotaStatisticsInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspPolicyDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspPolicyDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspServerDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspServerDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRemoteBackupHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRemoteBackupHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskScoreRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskScoreResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowScriptFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowScriptFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckClusterReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckClusterReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckHostReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSecurityCheckHostReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSingleBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSingleBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSoftwareTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSoftwareTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSwitchesStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSwitchesStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowTaskStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowTaskStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVersionRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVersionResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulBackupStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulBackupStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulReportDataRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulReportDataResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebAppAndServiceTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebAppAndServiceTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebFrameworkTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebFrameworkTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebSiteTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebSiteTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperRaspPathRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperRaspPathResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWelfareAreaInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWelfareAreaInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWtpProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWtpProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.StartAutoKillVirusStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.StartAutoKillVirusStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.StartManualSecurityCheckRequest;
import com.huaweicloud.sdk.hss.v5.model.StartManualSecurityCheckResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopManualSecurityCheckRequest;
import com.huaweicloud.sdk.hss.v5.model.StopManualSecurityCheckResponse;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAntivirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAntivirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyLearnStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyLearnStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchClusterProtectionModeRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchClusterProtectionModeResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchContainerProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchContainerProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortAutoBindRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortAutoBindResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncClusterListRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncClusterListResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncClusterProtectionEventRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncClusterProtectionEventResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncContainerNetworkNodeRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncContainerNetworkNodeResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncContainerNetworkPolicyListRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncContainerNetworkPolicyListResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncMultiCloudClusterStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncMultiCloudClusterStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SyncSecurityGroupPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.SyncSecurityGroupPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateAlarmConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateAlarmConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityCheckConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityCheckConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathResponse;
import com.huaweicloud.sdk.hss.v5.model.UploadReportLogoRequest;
import com.huaweicloud.sdk.hss.v5.model.UploadReportLogoResponse;

import java.util.concurrent.CompletableFuture;

public class HssAsyncClient {

    protected HcClient hcClient;

    public HssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssAsyncClient> newBuilder() {
        ClientBuilder<HssAsyncClient> clientBuilder = new ClientBuilder<>(HssAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增基线白名单
     *
     * 新增基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBaselineWhiteListRequest 请求对象
     * @return CompletableFuture<AddBaselineWhiteListResponse>
     */
    public CompletableFuture<AddBaselineWhiteListResponse> addBaselineWhiteListAsync(
        AddBaselineWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addBaselineWhiteList);
    }

    /**
     * 新增基线白名单
     *
     * 新增基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBaselineWhiteListRequest 请求对象
     * @return AsyncInvoker<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse>
     */
    public AsyncInvoker<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse> addBaselineWhiteListAsyncInvoker(
        AddBaselineWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addBaselineWhiteList, hcClient);
    }

    /**
     * 新建cce集成防护配置
     *
     * 新建cce集成防护配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCceIntegrationProtectionRequest 请求对象
     * @return CompletableFuture<AddCceIntegrationProtectionResponse>
     */
    public CompletableFuture<AddCceIntegrationProtectionResponse> addCceIntegrationProtectionAsync(
        AddCceIntegrationProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addCceIntegrationProtection);
    }

    /**
     * 新建cce集成防护配置
     *
     * 新建cce集成防护配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCceIntegrationProtectionRequest 请求对象
     * @return AsyncInvoker<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse>
     */
    public AsyncInvoker<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> addCceIntegrationProtectionAsyncInvoker(
        AddCceIntegrationProtectionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addCceIntegrationProtection, hcClient);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHostsGroupRequest 请求对象
     * @return CompletableFuture<AddHostsGroupResponse>
     */
    public CompletableFuture<AddHostsGroupResponse> addHostsGroupAsync(AddHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addHostsGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHostsGroupRequest 请求对象
     * @return AsyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>
     */
    public AsyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroupAsyncInvoker(
        AddHostsGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addHostsGroup, hcClient);
    }

    /**
     * 添加登录白名单
     *
     * 添加登录白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLoginWhiteListRequest 请求对象
     * @return CompletableFuture<AddLoginWhiteListResponse>
     */
    public CompletableFuture<AddLoginWhiteListResponse> addLoginWhiteListAsync(AddLoginWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addLoginWhiteList);
    }

    /**
     * 添加登录白名单
     *
     * 添加登录白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLoginWhiteListRequest 请求对象
     * @return AsyncInvoker<AddLoginWhiteListRequest, AddLoginWhiteListResponse>
     */
    public AsyncInvoker<AddLoginWhiteListRequest, AddLoginWhiteListResponse> addLoginWhiteListAsyncInvoker(
        AddLoginWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addLoginWhiteList, hcClient);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略：创建防护策略，包含策略名称、相关规则开启状态、防护动作以及检测规则配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyRequest 请求对象
     * @return CompletableFuture<AddPolicyResponse>
     */
    public CompletableFuture<AddPolicyResponse> addPolicyAsync(AddPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addPolicy);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略：创建防护策略，包含策略名称、相关规则开启状态、防护动作以及检测规则配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyRequest 请求对象
     * @return AsyncInvoker<AddPolicyRequest, AddPolicyResponse>
     */
    public AsyncInvoker<AddPolicyRequest, AddPolicyResponse> addPolicyAsyncInvoker(AddPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addPolicy, hcClient);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectionPolicyRequest 请求对象
     * @return CompletableFuture<AddProtectionPolicyResponse>
     */
    public CompletableFuture<AddProtectionPolicyResponse> addProtectionPolicyAsync(AddProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addProtectionPolicy);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<AddProtectionPolicyRequest, AddProtectionPolicyResponse>
     */
    public AsyncInvoker<AddProtectionPolicyRequest, AddProtectionPolicyResponse> addProtectionPolicyAsyncInvoker(
        AddProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addProtectionPolicy, hcClient);
    }

    /**
     * 添加系统用户白名单
     *
     * 添加系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSystemUserWhiteListRequest 请求对象
     * @return CompletableFuture<AddSystemUserWhiteListResponse>
     */
    public CompletableFuture<AddSystemUserWhiteListResponse> addSystemUserWhiteListAsync(
        AddSystemUserWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addSystemUserWhiteList);
    }

    /**
     * 添加系统用户白名单
     *
     * 添加系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSystemUserWhiteListRequest 请求对象
     * @return AsyncInvoker<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse>
     */
    public AsyncInvoker<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse> addSystemUserWhiteListAsyncInvoker(
        AddSystemUserWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addSystemUserWhiteList, hcClient);
    }

    /**
     * 切换勒索防护策略
     *
     * 切换勒索防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateProtectionPolicyRequest 请求对象
     * @return CompletableFuture<AssociateProtectionPolicyResponse>
     */
    public CompletableFuture<AssociateProtectionPolicyResponse> associateProtectionPolicyAsync(
        AssociateProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.associateProtectionPolicy);
    }

    /**
     * 切换勒索防护策略
     *
     * 切换勒索防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<AssociateProtectionPolicyRequest, AssociateProtectionPolicyResponse>
     */
    public AsyncInvoker<AssociateProtectionPolicyRequest, AssociateProtectionPolicyResponse> associateProtectionPolicyAsyncInvoker(
        AssociateProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.associateProtectionPolicy, hcClient);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return CompletableFuture<BatchAddAccountsResponse>
     */
    public CompletableFuture<BatchAddAccountsResponse> batchAddAccountsAsync(BatchAddAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchAddAccounts);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return AsyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse>
     */
    public AsyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse> batchAddAccountsAsyncInvoker(
        BatchAddAccountsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchAddAccounts, hcClient);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateTagsResponse>
     */
    public CompletableFuture<BatchCreateTagsResponse> batchCreateTagsAsync(BatchCreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchCreateTags);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public AsyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsAsyncInvoker(
        BatchCreateTagsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchDeleteTags);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量开启勒索病毒防护2.0
     *
     * 批量开启勒索病毒防护，若开启备份防护，请保证该region有cbr云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartProtectionRequest 请求对象
     * @return CompletableFuture<BatchStartProtectionResponse>
     */
    public CompletableFuture<BatchStartProtectionResponse> batchStartProtectionAsync(
        BatchStartProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchStartProtection);
    }

    /**
     * 批量开启勒索病毒防护2.0
     *
     * 批量开启勒索病毒防护，若开启备份防护，请保证该region有cbr云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartProtectionRequest 请求对象
     * @return AsyncInvoker<BatchStartProtectionRequest, BatchStartProtectionResponse>
     */
    public AsyncInvoker<BatchStartProtectionRequest, BatchStartProtectionResponse> batchStartProtectionAsyncInvoker(
        BatchStartProtectionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchStartProtection, hcClient);
    }

    /**
     * 开启或关闭“Agent自动升级”配置开关
     *
     * 开启或关闭“Agent自动升级”配置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentAutoUpgradeStatusRequest 请求对象
     * @return CompletableFuture<ChangeAgentAutoUpgradeStatusResponse>
     */
    public CompletableFuture<ChangeAgentAutoUpgradeStatusResponse> changeAgentAutoUpgradeStatusAsync(
        ChangeAgentAutoUpgradeStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAgentAutoUpgradeStatus);
    }

    /**
     * 开启或关闭“Agent自动升级”配置开关
     *
     * 开启或关闭“Agent自动升级”配置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentAutoUpgradeStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAgentAutoUpgradeStatusRequest, ChangeAgentAutoUpgradeStatusResponse>
     */
    public AsyncInvoker<ChangeAgentAutoUpgradeStatusRequest, ChangeAgentAutoUpgradeStatusResponse> changeAgentAutoUpgradeStatusAsyncInvoker(
        ChangeAgentAutoUpgradeStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAgentAutoUpgradeStatus, hcClient);
    }

    /**
     * 开启或关闭“自动绑定配额”配置开关
     *
     * 开启或关闭“自动绑定配额”配置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAutoOpenQuotaStatusRequest 请求对象
     * @return CompletableFuture<ChangeAutoOpenQuotaStatusResponse>
     */
    public CompletableFuture<ChangeAutoOpenQuotaStatusResponse> changeAutoOpenQuotaStatusAsync(
        ChangeAutoOpenQuotaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAutoOpenQuotaStatus);
    }

    /**
     * 开启或关闭“自动绑定配额”配置开关
     *
     * 开启或关闭“自动绑定配额”配置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAutoOpenQuotaStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAutoOpenQuotaStatusRequest, ChangeAutoOpenQuotaStatusResponse>
     */
    public AsyncInvoker<ChangeAutoOpenQuotaStatusRequest, ChangeAutoOpenQuotaStatusResponse> changeAutoOpenQuotaStatusAsyncInvoker(
        ChangeAutoOpenQuotaStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAutoOpenQuotaStatus, hcClient);
    }

    /**
     * 修改基线白名单
     *
     * 修改基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaselineWhiteListRequest 请求对象
     * @return CompletableFuture<ChangeBaselineWhiteListResponse>
     */
    public CompletableFuture<ChangeBaselineWhiteListResponse> changeBaselineWhiteListAsync(
        ChangeBaselineWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeBaselineWhiteList);
    }

    /**
     * 修改基线白名单
     *
     * 修改基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaselineWhiteListRequest 请求对象
     * @return AsyncInvoker<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse>
     */
    public AsyncInvoker<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse> changeBaselineWhiteListAsyncInvoker(
        ChangeBaselineWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeBaselineWhiteList, hcClient);
    }

    /**
     * 解除已拦截IP
     *
     * 解除已拦截IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBlockedIpRequest 请求对象
     * @return CompletableFuture<ChangeBlockedIpResponse>
     */
    public CompletableFuture<ChangeBlockedIpResponse> changeBlockedIpAsync(ChangeBlockedIpRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeBlockedIp);
    }

    /**
     * 解除已拦截IP
     *
     * 解除已拦截IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBlockedIpRequest 请求对象
     * @return AsyncInvoker<ChangeBlockedIpRequest, ChangeBlockedIpResponse>
     */
    public AsyncInvoker<ChangeBlockedIpRequest, ChangeBlockedIpResponse> changeBlockedIpAsyncInvoker(
        ChangeBlockedIpRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeBlockedIp, hcClient);
    }

    /**
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     *
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCheckRuleActionRequest 请求对象
     * @return CompletableFuture<ChangeCheckRuleActionResponse>
     */
    public CompletableFuture<ChangeCheckRuleActionResponse> changeCheckRuleActionAsync(
        ChangeCheckRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeCheckRuleAction);
    }

    /**
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     *
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCheckRuleActionRequest 请求对象
     * @return AsyncInvoker<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse>
     */
    public AsyncInvoker<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> changeCheckRuleActionAsyncInvoker(
        ChangeCheckRuleActionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeCheckRuleAction, hcClient);
    }

    /**
     * 修改告警状态
     *
     * 修改告警状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterEventsRequest 请求对象
     * @return CompletableFuture<ChangeClusterEventsResponse>
     */
    public CompletableFuture<ChangeClusterEventsResponse> changeClusterEventsAsync(ChangeClusterEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeClusterEvents);
    }

    /**
     * 修改告警状态
     *
     * 修改告警状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterEventsRequest 请求对象
     * @return AsyncInvoker<ChangeClusterEventsRequest, ChangeClusterEventsResponse>
     */
    public AsyncInvoker<ChangeClusterEventsRequest, ChangeClusterEventsResponse> changeClusterEventsAsyncInvoker(
        ChangeClusterEventsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeClusterEvents, hcClient);
    }

    /**
     * 修改集群防护策略
     *
     * 修改集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterProtectionPolicyRequest 请求对象
     * @return CompletableFuture<ChangeClusterProtectionPolicyResponse>
     */
    public CompletableFuture<ChangeClusterProtectionPolicyResponse> changeClusterProtectionPolicyAsync(
        ChangeClusterProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeClusterProtectionPolicy);
    }

    /**
     * 修改集群防护策略
     *
     * 修改集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse>
     */
    public AsyncInvoker<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse> changeClusterProtectionPolicyAsyncInvoker(
        ChangeClusterProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeClusterProtectionPolicy, hcClient);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEventRequest 请求对象
     * @return CompletableFuture<ChangeEventResponse>
     */
    public CompletableFuture<ChangeEventResponse> changeEventAsync(ChangeEventRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeEvent);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEventRequest 请求对象
     * @return AsyncInvoker<ChangeEventRequest, ChangeEventResponse>
     */
    public AsyncInvoker<ChangeEventRequest, ChangeEventResponse> changeEventAsyncInvoker(ChangeEventRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeEvent, hcClient);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostsGroupRequest 请求对象
     * @return CompletableFuture<ChangeHostsGroupResponse>
     */
    public CompletableFuture<ChangeHostsGroupResponse> changeHostsGroupAsync(ChangeHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeHostsGroup);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostsGroupRequest 请求对象
     * @return AsyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>
     */
    public AsyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroupAsyncInvoker(
        ChangeHostsGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeHostsGroup, hcClient);
    }

    /**
     * 恢复已隔离文件
     *
     * 恢复已隔离文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIsolatedFileRequest 请求对象
     * @return CompletableFuture<ChangeIsolatedFileResponse>
     */
    public CompletableFuture<ChangeIsolatedFileResponse> changeIsolatedFileAsync(ChangeIsolatedFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeIsolatedFile);
    }

    /**
     * 恢复已隔离文件
     *
     * 恢复已隔离文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIsolatedFileRequest 请求对象
     * @return AsyncInvoker<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse>
     */
    public AsyncInvoker<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> changeIsolatedFileAsyncInvoker(
        ChangeIsolatedFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeIsolatedFile, hcClient);
    }

    /**
     * 开启或关闭恶意软件云查样本收集配置
     *
     * 开启或关闭恶意软件云查样本收集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMalwareCollectStatusRequest 请求对象
     * @return CompletableFuture<ChangeMalwareCollectStatusResponse>
     */
    public CompletableFuture<ChangeMalwareCollectStatusResponse> changeMalwareCollectStatusAsync(
        ChangeMalwareCollectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeMalwareCollectStatus);
    }

    /**
     * 开启或关闭恶意软件云查样本收集配置
     *
     * 开启或关闭恶意软件云查样本收集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMalwareCollectStatusRequest 请求对象
     * @return AsyncInvoker<ChangeMalwareCollectStatusRequest, ChangeMalwareCollectStatusResponse>
     */
    public AsyncInvoker<ChangeMalwareCollectStatusRequest, ChangeMalwareCollectStatusResponse> changeMalwareCollectStatusAsyncInvoker(
        ChangeMalwareCollectStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeMalwareCollectStatus, hcClient);
    }

    /**
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     *
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordComplexityStatusRequest 请求对象
     * @return CompletableFuture<ChangePasswordComplexityStatusResponse>
     */
    public CompletableFuture<ChangePasswordComplexityStatusResponse> changePasswordComplexityStatusAsync(
        ChangePasswordComplexityStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changePasswordComplexityStatus);
    }

    /**
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     *
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordComplexityStatusRequest 请求对象
     * @return AsyncInvoker<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse>
     */
    public AsyncInvoker<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse> changePasswordComplexityStatusAsyncInvoker(
        ChangePasswordComplexityStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changePasswordComplexityStatus, hcClient);
    }

    /**
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     *
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicySwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangePolicySwitchStatusResponse>
     */
    public CompletableFuture<ChangePolicySwitchStatusResponse> changePolicySwitchStatusAsync(
        ChangePolicySwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changePolicySwitchStatus);
    }

    /**
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     *
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicySwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangePolicySwitchStatusRequest, ChangePolicySwitchStatusResponse>
     */
    public AsyncInvoker<ChangePolicySwitchStatusRequest, ChangePolicySwitchStatusResponse> changePolicySwitchStatusAsyncInvoker(
        ChangePolicySwitchStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changePolicySwitchStatus, hcClient);
    }

    /**
     * 新建集群防护策略
     *
     * 新建集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterProtectionPolicyRequest 请求对象
     * @return CompletableFuture<CreateClusterProtectionPolicyResponse>
     */
    public CompletableFuture<CreateClusterProtectionPolicyResponse> createClusterProtectionPolicyAsync(
        CreateClusterProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createClusterProtectionPolicy);
    }

    /**
     * 新建集群防护策略
     *
     * 新建集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse>
     */
    public AsyncInvoker<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse> createClusterProtectionPolicyAsyncInvoker(
        CreateClusterProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createClusterProtectionPolicy, hcClient);
    }

    /**
     * 同步集群信息
     *
     * 同步集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersInfoRequest 请求对象
     * @return CompletableFuture<CreateClustersInfoResponse>
     */
    public CompletableFuture<CreateClustersInfoResponse> createClustersInfoAsync(CreateClustersInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createClustersInfo);
    }

    /**
     * 同步集群信息
     *
     * 同步集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersInfoRequest 请求对象
     * @return AsyncInvoker<CreateClustersInfoRequest, CreateClustersInfoResponse>
     */
    public AsyncInvoker<CreateClustersInfoRequest, CreateClustersInfoResponse> createClustersInfoAsyncInvoker(
        CreateClustersInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createClustersInfo, hcClient);
    }

    /**
     * 容器集群网络添加配置策略
     *
     * 容器集群网络添加配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateContainerNetworkPolicyRequest 请求对象
     * @return CompletableFuture<CreateContainerNetworkPolicyResponse>
     */
    public CompletableFuture<CreateContainerNetworkPolicyResponse> createContainerNetworkPolicyAsync(
        CreateContainerNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createContainerNetworkPolicy);
    }

    /**
     * 容器集群网络添加配置策略
     *
     * 容器集群网络添加配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateContainerNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse>
     */
    public AsyncInvoker<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse> createContainerNetworkPolicyAsyncInvoker(
        CreateContainerNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createContainerNetworkPolicy, hcClient);
    }

    /**
     * 新增动态端口蜜罐策略
     *
     * 新增动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDecoyPortPolicyRequest 请求对象
     * @return CompletableFuture<CreateDecoyPortPolicyResponse>
     */
    public CompletableFuture<CreateDecoyPortPolicyResponse> createDecoyPortPolicyAsync(
        CreateDecoyPortPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createDecoyPortPolicy);
    }

    /**
     * 新增动态端口蜜罐策略
     *
     * 新增动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDecoyPortPolicyRequest 请求对象
     * @return AsyncInvoker<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse>
     */
    public AsyncInvoker<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse> createDecoyPortPolicyAsyncInvoker(
        CreateDecoyPortPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createDecoyPortPolicy, hcClient);
    }

    /**
     * 创建全局资产扫描任务
     *
     * 创建全局资产扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalAssetScanTaskRequest 请求对象
     * @return CompletableFuture<CreateGlobalAssetScanTaskResponse>
     */
    public CompletableFuture<CreateGlobalAssetScanTaskResponse> createGlobalAssetScanTaskAsync(
        CreateGlobalAssetScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createGlobalAssetScanTask);
    }

    /**
     * 创建全局资产扫描任务
     *
     * 创建全局资产扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalAssetScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse>
     */
    public AsyncInvoker<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse> createGlobalAssetScanTaskAsyncInvoker(
        CreateGlobalAssetScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createGlobalAssetScanTask, hcClient);
    }

    /**
     * 创建安全组策略
     *
     * 创建安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupPolicyRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupPolicyResponse>
     */
    public CompletableFuture<CreateSecurityGroupPolicyResponse> createSecurityGroupPolicyAsync(
        CreateSecurityGroupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createSecurityGroupPolicy);
    }

    /**
     * 创建安全组策略
     *
     * 创建安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupPolicyRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse>
     */
    public AsyncInvoker<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse> createSecurityGroupPolicyAsyncInvoker(
        CreateSecurityGroupPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createSecurityGroupPolicy, hcClient);
    }

    /**
     * 删除账号
     *
     * 删除账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountRequest 请求对象
     * @return CompletableFuture<DeleteAccountResponse>
     */
    public CompletableFuture<DeleteAccountResponse> deleteAccountAsync(DeleteAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteAccount);
    }

    /**
     * 删除账号
     *
     * 删除账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountRequest 请求对象
     * @return AsyncInvoker<DeleteAccountRequest, DeleteAccountResponse>
     */
    public AsyncInvoker<DeleteAccountRequest, DeleteAccountResponse> deleteAccountAsyncInvoker(
        DeleteAccountRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteAccount, hcClient);
    }

    /**
     * 删除基线白名单
     *
     * 删除基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaselineWhiteListRequest 请求对象
     * @return CompletableFuture<DeleteBaselineWhiteListResponse>
     */
    public CompletableFuture<DeleteBaselineWhiteListResponse> deleteBaselineWhiteListAsync(
        DeleteBaselineWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteBaselineWhiteList);
    }

    /**
     * 删除基线白名单
     *
     * 删除基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaselineWhiteListRequest 请求对象
     * @return AsyncInvoker<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse>
     */
    public AsyncInvoker<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse> deleteBaselineWhiteListAsyncInvoker(
        DeleteBaselineWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteBaselineWhiteList, hcClient);
    }

    /**
     * 删除集群防护策略
     *
     * 删除集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterProtectionPolicyRequest 请求对象
     * @return CompletableFuture<DeleteClusterProtectionPolicyResponse>
     */
    public CompletableFuture<DeleteClusterProtectionPolicyResponse> deleteClusterProtectionPolicyAsync(
        DeleteClusterProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteClusterProtectionPolicy);
    }

    /**
     * 删除集群防护策略
     *
     * 删除集群防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse>
     */
    public AsyncInvoker<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse> deleteClusterProtectionPolicyAsyncInvoker(
        DeleteClusterProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteClusterProtectionPolicy, hcClient);
    }

    /**
     * 容器集群网络删除配置策略
     *
     * 容器集群网络删除配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteContainerNetworkPolicyRequest 请求对象
     * @return CompletableFuture<DeleteContainerNetworkPolicyResponse>
     */
    public CompletableFuture<DeleteContainerNetworkPolicyResponse> deleteContainerNetworkPolicyAsync(
        DeleteContainerNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteContainerNetworkPolicy);
    }

    /**
     * 容器集群网络删除配置策略
     *
     * 容器集群网络删除配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteContainerNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse>
     */
    public AsyncInvoker<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse> deleteContainerNetworkPolicyAsyncInvoker(
        DeleteContainerNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteContainerNetworkPolicy, hcClient);
    }

    /**
     * 关闭主机动态端口蜜罐策略
     *
     * 关闭主机动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortHostPolicyRequest 请求对象
     * @return CompletableFuture<DeleteDecoyPortHostPolicyResponse>
     */
    public CompletableFuture<DeleteDecoyPortHostPolicyResponse> deleteDecoyPortHostPolicyAsync(
        DeleteDecoyPortHostPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteDecoyPortHostPolicy);
    }

    /**
     * 关闭主机动态端口蜜罐策略
     *
     * 关闭主机动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortHostPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse>
     */
    public AsyncInvoker<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse> deleteDecoyPortHostPolicyAsyncInvoker(
        DeleteDecoyPortHostPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteDecoyPortHostPolicy, hcClient);
    }

    /**
     * 删除动态端口蜜罐策略
     *
     * 删除动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortPolicyRequest 请求对象
     * @return CompletableFuture<DeleteDecoyPortPolicyResponse>
     */
    public CompletableFuture<DeleteDecoyPortPolicyResponse> deleteDecoyPortPolicyAsync(
        DeleteDecoyPortPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteDecoyPortPolicy);
    }

    /**
     * 删除动态端口蜜罐策略
     *
     * 删除动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse>
     */
    public AsyncInvoker<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse> deleteDecoyPortPolicyAsyncInvoker(
        DeleteDecoyPortPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteDecoyPortPolicy, hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostsGroupRequest 请求对象
     * @return CompletableFuture<DeleteHostsGroupResponse>
     */
    public CompletableFuture<DeleteHostsGroupResponse> deleteHostsGroupAsync(DeleteHostsGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteHostsGroup);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostsGroupRequest 请求对象
     * @return AsyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>
     */
    public AsyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroupAsyncInvoker(
        DeleteHostsGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteHostsGroup, hcClient);
    }

    /**
     * 删除已隔离文件
     *
     * 删除已隔离文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIsolatedFileRequest 请求对象
     * @return CompletableFuture<DeleteIsolatedFileResponse>
     */
    public CompletableFuture<DeleteIsolatedFileResponse> deleteIsolatedFileAsync(DeleteIsolatedFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteIsolatedFile);
    }

    /**
     * 删除已隔离文件
     *
     * 删除已隔离文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIsolatedFileRequest 请求对象
     * @return AsyncInvoker<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse>
     */
    public AsyncInvoker<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse> deleteIsolatedFileAsyncInvoker(
        DeleteIsolatedFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteIsolatedFile, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略：删除策略，已经在使用的防护策略不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略：删除策略，已经在使用的防护策略不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deletePolicy, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionPolicyRequest 请求对象
     * @return CompletableFuture<DeleteProtectionPolicyResponse>
     */
    public CompletableFuture<DeleteProtectionPolicyResponse> deleteProtectionPolicyAsync(
        DeleteProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteProtectionPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse>
     */
    public AsyncInvoker<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse> deleteProtectionPolicyAsyncInvoker(
        DeleteProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteProtectionPolicy, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceInstanceTagResponse>
     */
    public CompletableFuture<DeleteResourceInstanceTagResponse> deleteResourceInstanceTagAsync(
        DeleteResourceInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteResourceInstanceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>
     */
    public AsyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTagAsyncInvoker(
        DeleteResourceInstanceTagRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteResourceInstanceTag, hcClient);
    }

    /**
     * 删除安全组策略
     *
     * 删除安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupPolicyRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupPolicyResponse>
     */
    public CompletableFuture<DeleteSecurityGroupPolicyResponse> deleteSecurityGroupPolicyAsync(
        DeleteSecurityGroupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteSecurityGroupPolicy);
    }

    /**
     * 删除安全组策略
     *
     * 删除安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse> deleteSecurityGroupPolicyAsyncInvoker(
        DeleteSecurityGroupPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteSecurityGroupPolicy, hcClient);
    }

    /**
     * 导出资产指纹信息
     *
     * 导出资产指纹信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetFileRequest 请求对象
     * @return CompletableFuture<DownloadAssetFileResponse>
     */
    public CompletableFuture<DownloadAssetFileResponse> downloadAssetFileAsync(DownloadAssetFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.downloadAssetFile);
    }

    /**
     * 导出资产指纹信息
     *
     * 导出资产指纹信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetFileRequest 请求对象
     * @return AsyncInvoker<DownloadAssetFileRequest, DownloadAssetFileResponse>
     */
    public AsyncInvoker<DownloadAssetFileRequest, DownloadAssetFileResponse> downloadAssetFileAsyncInvoker(
        DownloadAssetFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.downloadAssetFile, hcClient);
    }

    /**
     * 创建容器导出任务
     *
     * 创建容器导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportContainerListRequest 请求对象
     * @return CompletableFuture<ExportContainerListResponse>
     */
    public CompletableFuture<ExportContainerListResponse> exportContainerListAsync(ExportContainerListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportContainerList);
    }

    /**
     * 创建容器导出任务
     *
     * 创建容器导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportContainerListRequest 请求对象
     * @return AsyncInvoker<ExportContainerListRequest, ExportContainerListResponse>
     */
    public AsyncInvoker<ExportContainerListRequest, ExportContainerListResponse> exportContainerListAsyncInvoker(
        ExportContainerListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportContainerList, hcClient);
    }

    /**
     * 按查询结果导出配置检测报告
     *
     * 按查询结果导出配置检测报告，生成Excel文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSecurityCheckReportRequest 请求对象
     * @return CompletableFuture<ExportSecurityCheckReportResponse>
     */
    public CompletableFuture<ExportSecurityCheckReportResponse> exportSecurityCheckReportAsync(
        ExportSecurityCheckReportRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportSecurityCheckReport);
    }

    /**
     * 按查询结果导出配置检测报告
     *
     * 按查询结果导出配置检测报告，生成Excel文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSecurityCheckReportRequest 请求对象
     * @return AsyncInvoker<ExportSecurityCheckReportRequest, ExportSecurityCheckReportResponse>
     */
    public AsyncInvoker<ExportSecurityCheckReportRequest, ExportSecurityCheckReportResponse> exportSecurityCheckReportAsyncInvoker(
        ExportSecurityCheckReportRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportSecurityCheckReport, hcClient);
    }

    /**
     * 查询多账号列表
     *
     * 查询多账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return CompletableFuture<ListAccountsResponse>
     */
    public CompletableFuture<ListAccountsResponse> listAccountsAsync(ListAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAccounts);
    }

    /**
     * 查询多账号列表
     *
     * 查询多账号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return AsyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public AsyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsAsyncInvoker(
        ListAccountsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAccounts, hcClient);
    }

    /**
     * 查询“Agent自动升级”配置开关状态
     *
     * 查询“Agent自动升级”配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentAutoUpgradeStatusRequest 请求对象
     * @return CompletableFuture<ListAgentAutoUpgradeStatusResponse>
     */
    public CompletableFuture<ListAgentAutoUpgradeStatusResponse> listAgentAutoUpgradeStatusAsync(
        ListAgentAutoUpgradeStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAgentAutoUpgradeStatus);
    }

    /**
     * 查询“Agent自动升级”配置开关状态
     *
     * 查询“Agent自动升级”配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentAutoUpgradeStatusRequest 请求对象
     * @return AsyncInvoker<ListAgentAutoUpgradeStatusRequest, ListAgentAutoUpgradeStatusResponse>
     */
    public AsyncInvoker<ListAgentAutoUpgradeStatusRequest, ListAgentAutoUpgradeStatusResponse> listAgentAutoUpgradeStatusAsyncInvoker(
        ListAgentAutoUpgradeStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAgentAutoUpgradeStatus, hcClient);
    }

    /**
     * 查询agent安装脚本
     *
     * 查询agent安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInstallScriptRequest 请求对象
     * @return CompletableFuture<ListAgentInstallScriptResponse>
     */
    public CompletableFuture<ListAgentInstallScriptResponse> listAgentInstallScriptAsync(
        ListAgentInstallScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAgentInstallScript);
    }

    /**
     * 查询agent安装脚本
     *
     * 查询agent安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInstallScriptRequest 请求对象
     * @return AsyncInvoker<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse>
     */
    public AsyncInvoker<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> listAgentInstallScriptAsyncInvoker(
        ListAgentInstallScriptRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAgentInstallScript, hcClient);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhiteListRequest 请求对象
     * @return CompletableFuture<ListAlarmWhiteListResponse>
     */
    public CompletableFuture<ListAlarmWhiteListResponse> listAlarmWhiteListAsync(ListAlarmWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAlarmWhiteList);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhiteListRequest 请求对象
     * @return AsyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>
     */
    public AsyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteListAsyncInvoker(
        ListAlarmWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAlarmWhiteList, hcClient);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListAppChangeHistoriesResponse>
     */
    public CompletableFuture<ListAppChangeHistoriesResponse> listAppChangeHistoriesAsync(
        ListAppChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppChangeHistories);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>
     */
    public AsyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistoriesAsyncInvoker(
        ListAppChangeHistoriesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppChangeHistories, hcClient);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppStatisticsRequest 请求对象
     * @return CompletableFuture<ListAppStatisticsResponse>
     */
    public CompletableFuture<ListAppStatisticsResponse> listAppStatisticsAsync(ListAppStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppStatistics);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppStatisticsRequest 请求对象
     * @return AsyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>
     */
    public AsyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatisticsAsyncInvoker(
        ListAppStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppStatistics, hcClient);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listApps);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listApps, hcClient);
    }

    /**
     * 查询程序自动隔离查杀状态
     *
     * 查询程序自动隔离查杀状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoKillVirusStatusRequest 请求对象
     * @return CompletableFuture<ListAutoKillVirusStatusResponse>
     */
    public CompletableFuture<ListAutoKillVirusStatusResponse> listAutoKillVirusStatusAsync(
        ListAutoKillVirusStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoKillVirusStatus);
    }

    /**
     * 查询程序自动隔离查杀状态
     *
     * 查询程序自动隔离查杀状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoKillVirusStatusRequest 请求对象
     * @return AsyncInvoker<ListAutoKillVirusStatusRequest, ListAutoKillVirusStatusResponse>
     */
    public AsyncInvoker<ListAutoKillVirusStatusRequest, ListAutoKillVirusStatusResponse> listAutoKillVirusStatusAsyncInvoker(
        ListAutoKillVirusStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAutoKillVirusStatus, hcClient);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchChangeHistoriesResponse>
     */
    public CompletableFuture<ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesAsync(
        ListAutoLaunchChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchChangeHistories);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>
     */
    public AsyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesAsyncInvoker(
        ListAutoLaunchChangeHistoriesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAutoLaunchChangeHistories, hcClient);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchStatisticsRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchStatisticsResponse>
     */
    public CompletableFuture<ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsAsync(
        ListAutoLaunchStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchStatistics);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchStatisticsRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>
     */
    public AsyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsAsyncInvoker(
        ListAutoLaunchStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAutoLaunchStatistics, hcClient);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchsRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchsResponse>
     */
    public CompletableFuture<ListAutoLaunchsResponse> listAutoLaunchsAsync(ListAutoLaunchsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoLaunchs);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchsRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>
     */
    public AsyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchsAsyncInvoker(
        ListAutoLaunchsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAutoLaunchs, hcClient);
    }

    /**
     * 查询“自动绑定配额”配置开关状态
     *
     * 查询“自动绑定配额”配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoOpenQuotaStatusRequest 请求对象
     * @return CompletableFuture<ListAutoOpenQuotaStatusResponse>
     */
    public CompletableFuture<ListAutoOpenQuotaStatusResponse> listAutoOpenQuotaStatusAsync(
        ListAutoOpenQuotaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAutoOpenQuotaStatus);
    }

    /**
     * 查询“自动绑定配额”配置开关状态
     *
     * 查询“自动绑定配额”配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoOpenQuotaStatusRequest 请求对象
     * @return AsyncInvoker<ListAutoOpenQuotaStatusRequest, ListAutoOpenQuotaStatusResponse>
     */
    public AsyncInvoker<ListAutoOpenQuotaStatusRequest, ListAutoOpenQuotaStatusResponse> listAutoOpenQuotaStatusAsyncInvoker(
        ListAutoOpenQuotaStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAutoOpenQuotaStatus, hcClient);
    }

    /**
     * 查询备份存储库列表
     *
     * 查询备份存储库列表，若进行绑定主机，则需要额外判断，同时满足以下条件：1、存储库状态为“可用”状态；2、备份策略状态为“已启用”；3、存储库有剩余可用备份容量；4、存储库绑定的服务器数量少于256。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupVaultsRequest 请求对象
     * @return CompletableFuture<ListBackupVaultsResponse>
     */
    public CompletableFuture<ListBackupVaultsResponse> listBackupVaultsAsync(ListBackupVaultsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listBackupVaults);
    }

    /**
     * 查询备份存储库列表
     *
     * 查询备份存储库列表，若进行绑定主机，则需要额外判断，同时满足以下条件：1、存储库状态为“可用”状态；2、备份策略状态为“已启用”；3、存储库有剩余可用备份容量；4、存储库绑定的服务器数量少于256。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupVaultsRequest 请求对象
     * @return AsyncInvoker<ListBackupVaultsRequest, ListBackupVaultsResponse>
     */
    public AsyncInvoker<ListBackupVaultsRequest, ListBackupVaultsResponse> listBackupVaultsAsyncInvoker(
        ListBackupVaultsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listBackupVaults, hcClient);
    }

    /**
     * 查询基线白名单列表
     *
     * 查询基线白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaselineWhiteListsRequest 请求对象
     * @return CompletableFuture<ListBaselineWhiteListsResponse>
     */
    public CompletableFuture<ListBaselineWhiteListsResponse> listBaselineWhiteListsAsync(
        ListBaselineWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listBaselineWhiteLists);
    }

    /**
     * 查询基线白名单列表
     *
     * 查询基线白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaselineWhiteListsRequest 请求对象
     * @return AsyncInvoker<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse>
     */
    public AsyncInvoker<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse> listBaselineWhiteListsAsyncInvoker(
        ListBaselineWhiteListsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listBaselineWhiteLists, hcClient);
    }

    /**
     * 查询已拦截IP列表
     *
     * 查询已拦截IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockedIpRequest 请求对象
     * @return CompletableFuture<ListBlockedIpResponse>
     */
    public CompletableFuture<ListBlockedIpResponse> listBlockedIpAsync(ListBlockedIpRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listBlockedIp);
    }

    /**
     * 查询已拦截IP列表
     *
     * 查询已拦截IP列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockedIpRequest 请求对象
     * @return AsyncInvoker<ListBlockedIpRequest, ListBlockedIpResponse>
     */
    public AsyncInvoker<ListBlockedIpRequest, ListBlockedIpResponse> listBlockedIpAsyncInvoker(
        ListBlockedIpRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listBlockedIp, hcClient);
    }

    /**
     * 获取集群配置
     *
     * 获取集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterConfigRequest 请求对象
     * @return CompletableFuture<ListCceClusterConfigResponse>
     */
    public CompletableFuture<ListCceClusterConfigResponse> listCceClusterConfigAsync(
        ListCceClusterConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCceClusterConfig);
    }

    /**
     * 获取集群配置
     *
     * 获取集群配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterConfigRequest 请求对象
     * @return AsyncInvoker<ListCceClusterConfigRequest, ListCceClusterConfigResponse>
     */
    public AsyncInvoker<ListCceClusterConfigRequest, ListCceClusterConfigResponse> listCceClusterConfigAsyncInvoker(
        ListCceClusterConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCceClusterConfig, hcClient);
    }

    /**
     * 批量获取容器集群风险信息
     *
     * 批量获取容器集群风险信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterDetectRiskRequest 请求对象
     * @return CompletableFuture<ListCceClusterDetectRiskResponse>
     */
    public CompletableFuture<ListCceClusterDetectRiskResponse> listCceClusterDetectRiskAsync(
        ListCceClusterDetectRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCceClusterDetectRisk);
    }

    /**
     * 批量获取容器集群风险信息
     *
     * 批量获取容器集群风险信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterDetectRiskRequest 请求对象
     * @return AsyncInvoker<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse>
     */
    public AsyncInvoker<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse> listCceClusterDetectRiskAsyncInvoker(
        ListCceClusterDetectRiskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCceClusterDetectRisk, hcClient);
    }

    /**
     * 查询检测规则列表
     *
     * 查询检测规则列表：查询默认检测规则信息，包含14种检测规则，默认都不开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckFeatureRuleRequest 请求对象
     * @return CompletableFuture<ListCheckFeatureRuleResponse>
     */
    public CompletableFuture<ListCheckFeatureRuleResponse> listCheckFeatureRuleAsync(
        ListCheckFeatureRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCheckFeatureRule);
    }

    /**
     * 查询检测规则列表
     *
     * 查询检测规则列表：查询默认检测规则信息，包含14种检测规则，默认都不开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckFeatureRuleRequest 请求对象
     * @return AsyncInvoker<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse>
     */
    public AsyncInvoker<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse> listCheckFeatureRuleAsyncInvoker(
        ListCheckFeatureRuleRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCheckFeatureRule, hcClient);
    }

    /**
     * 查询k8s集群审计日志列表
     *
     * 查询k8s集群审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAuditLogsRequest 请求对象
     * @return CompletableFuture<ListClusterAuditLogsResponse>
     */
    public CompletableFuture<ListClusterAuditLogsResponse> listClusterAuditLogsAsync(
        ListClusterAuditLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterAuditLogs);
    }

    /**
     * 查询k8s集群审计日志列表
     *
     * 查询k8s集群审计日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse>
     */
    public AsyncInvoker<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse> listClusterAuditLogsAsyncInvoker(
        ListClusterAuditLogsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterAuditLogs, hcClient);
    }

    /**
     * 查询k8s集群事件列表
     *
     * 查询k8s集群事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventLogsRequest 请求对象
     * @return CompletableFuture<ListClusterEventLogsResponse>
     */
    public CompletableFuture<ListClusterEventLogsResponse> listClusterEventLogsAsync(
        ListClusterEventLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterEventLogs);
    }

    /**
     * 查询k8s集群事件列表
     *
     * 查询k8s集群事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventLogsRequest 请求对象
     * @return AsyncInvoker<ListClusterEventLogsRequest, ListClusterEventLogsResponse>
     */
    public AsyncInvoker<ListClusterEventLogsRequest, ListClusterEventLogsResponse> listClusterEventLogsAsyncInvoker(
        ListClusterEventLogsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterEventLogs, hcClient);
    }

    /**
     * 获取所有集群中告警事件
     *
     * 获取所有集群中告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventsRequest 请求对象
     * @return CompletableFuture<ListClusterEventsResponse>
     */
    public CompletableFuture<ListClusterEventsResponse> listClusterEventsAsync(ListClusterEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterEvents);
    }

    /**
     * 获取所有集群中告警事件
     *
     * 获取所有集群中告警事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventsRequest 请求对象
     * @return AsyncInvoker<ListClusterEventsRequest, ListClusterEventsResponse>
     */
    public AsyncInvoker<ListClusterEventsRequest, ListClusterEventsResponse> listClusterEventsAsyncInvoker(
        ListClusterEventsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterEvents, hcClient);
    }

    /**
     * 集群防护概览
     *
     * 集群防护概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectOverviewRequest 请求对象
     * @return CompletableFuture<ListClusterProtectOverviewResponse>
     */
    public CompletableFuture<ListClusterProtectOverviewResponse> listClusterProtectOverviewAsync(
        ListClusterProtectOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectOverview);
    }

    /**
     * 集群防护概览
     *
     * 集群防护概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectOverviewRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse>
     */
    public AsyncInvoker<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse> listClusterProtectOverviewAsyncInvoker(
        ListClusterProtectOverviewRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectOverview, hcClient);
    }

    /**
     * 查询集群组件防护策略模板列表
     *
     * 查询集群防护策略模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectPolicyTemplatesRequest 请求对象
     * @return CompletableFuture<ListClusterProtectPolicyTemplatesResponse>
     */
    public CompletableFuture<ListClusterProtectPolicyTemplatesResponse> listClusterProtectPolicyTemplatesAsync(
        ListClusterProtectPolicyTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectPolicyTemplates);
    }

    /**
     * 查询集群组件防护策略模板列表
     *
     * 查询集群防护策略模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectPolicyTemplatesRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse>
     */
    public AsyncInvoker<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse> listClusterProtectPolicyTemplatesAsyncInvoker(
        ListClusterProtectPolicyTemplatesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectPolicyTemplates, hcClient);
    }

    /**
     * 获取集群防护默认策略列表
     *
     * 获取集群防护默认策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionDefaultPolicyRequest 请求对象
     * @return CompletableFuture<ListClusterProtectionDefaultPolicyResponse>
     */
    public CompletableFuture<ListClusterProtectionDefaultPolicyResponse> listClusterProtectionDefaultPolicyAsync(
        ListClusterProtectionDefaultPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectionDefaultPolicy);
    }

    /**
     * 获取集群防护默认策略列表
     *
     * 获取集群防护默认策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionDefaultPolicyRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse>
     */
    public AsyncInvoker<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse> listClusterProtectionDefaultPolicyAsyncInvoker(
        ListClusterProtectionDefaultPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectionDefaultPolicy, hcClient);
    }

    /**
     * 查询集群防护信息
     *
     * 查询集群防护信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionInfoRequest 请求对象
     * @return CompletableFuture<ListClusterProtectionInfoResponse>
     */
    public CompletableFuture<ListClusterProtectionInfoResponse> listClusterProtectionInfoAsync(
        ListClusterProtectionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectionInfo);
    }

    /**
     * 查询集群防护信息
     *
     * 查询集群防护信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionInfoRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse>
     */
    public AsyncInvoker<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse> listClusterProtectionInfoAsyncInvoker(
        ListClusterProtectionInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectionInfo, hcClient);
    }

    /**
     * 获取集群所有防护项
     *
     * 获取集群所有防护项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionItemRequest 请求对象
     * @return CompletableFuture<ListClusterProtectionItemResponse>
     */
    public CompletableFuture<ListClusterProtectionItemResponse> listClusterProtectionItemAsync(
        ListClusterProtectionItemRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectionItem);
    }

    /**
     * 获取集群所有防护项
     *
     * 获取集群所有防护项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionItemRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse>
     */
    public AsyncInvoker<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse> listClusterProtectionItemAsyncInvoker(
        ListClusterProtectionItemRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectionItem, hcClient);
    }

    /**
     * 获取集群防护策略列表
     *
     * 获取集群防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyRequest 请求对象
     * @return CompletableFuture<ListClusterProtectionPolicyResponse>
     */
    public CompletableFuture<ListClusterProtectionPolicyResponse> listClusterProtectionPolicyAsync(
        ListClusterProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectionPolicy);
    }

    /**
     * 获取集群防护策略列表
     *
     * 获取集群防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse>
     */
    public AsyncInvoker<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse> listClusterProtectionPolicyAsyncInvoker(
        ListClusterProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectionPolicy, hcClient);
    }

    /**
     * 查看指定策略的详情
     *
     * 查看指定策略的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyDetailRequest 请求对象
     * @return CompletableFuture<ListClusterProtectionPolicyDetailResponse>
     */
    public CompletableFuture<ListClusterProtectionPolicyDetailResponse> listClusterProtectionPolicyDetailAsync(
        ListClusterProtectionPolicyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterProtectionPolicyDetail);
    }

    /**
     * 查看指定策略的详情
     *
     * 查看指定策略的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyDetailRequest 请求对象
     * @return AsyncInvoker<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse>
     */
    public AsyncInvoker<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse> listClusterProtectionPolicyDetailAsyncInvoker(
        ListClusterProtectionPolicyDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterProtectionPolicyDetail, hcClient);
    }

    /**
     * 获取部分提示信息
     *
     * 获取部分提示信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonTipsRequest 请求对象
     * @return CompletableFuture<ListCommonTipsResponse>
     */
    public CompletableFuture<ListCommonTipsResponse> listCommonTipsAsync(ListCommonTipsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCommonTips);
    }

    /**
     * 获取部分提示信息
     *
     * 获取部分提示信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonTipsRequest 请求对象
     * @return AsyncInvoker<ListCommonTipsRequest, ListCommonTipsResponse>
     */
    public AsyncInvoker<ListCommonTipsRequest, ListCommonTipsResponse> listCommonTipsAsyncInvoker(
        ListCommonTipsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCommonTips, hcClient);
    }

    /**
     * 查询容器内运行的命令列表
     *
     * 查询容器内运行的命令列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerCmdLogsRequest 请求对象
     * @return CompletableFuture<ListContainerCmdLogsResponse>
     */
    public CompletableFuture<ListContainerCmdLogsResponse> listContainerCmdLogsAsync(
        ListContainerCmdLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerCmdLogs);
    }

    /**
     * 查询容器内运行的命令列表
     *
     * 查询容器内运行的命令列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerCmdLogsRequest 请求对象
     * @return AsyncInvoker<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse>
     */
    public AsyncInvoker<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse> listContainerCmdLogsAsyncInvoker(
        ListContainerCmdLogsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerCmdLogs, hcClient);
    }

    /**
     * 查询容器日志列表
     *
     * 查询容器日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerLogsRequest 请求对象
     * @return CompletableFuture<ListContainerLogsResponse>
     */
    public CompletableFuture<ListContainerLogsResponse> listContainerLogsAsync(ListContainerLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerLogs);
    }

    /**
     * 查询容器日志列表
     *
     * 查询容器日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerLogsRequest 请求对象
     * @return AsyncInvoker<ListContainerLogsRequest, ListContainerLogsResponse>
     */
    public AsyncInvoker<ListContainerLogsRequest, ListContainerLogsResponse> listContainerLogsAsyncInvoker(
        ListContainerLogsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerLogs, hcClient);
    }

    /**
     * 查询容器防护的集群信息
     *
     * 查询容器防护的集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkClustersRequest 请求对象
     * @return CompletableFuture<ListContainerNetworkClustersResponse>
     */
    public CompletableFuture<ListContainerNetworkClustersResponse> listContainerNetworkClustersAsync(
        ListContainerNetworkClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerNetworkClusters);
    }

    /**
     * 查询容器防护的集群信息
     *
     * 查询容器防护的集群信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkClustersRequest 请求对象
     * @return AsyncInvoker<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse>
     */
    public AsyncInvoker<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse> listContainerNetworkClustersAsyncInvoker(
        ListContainerNetworkClustersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerNetworkClusters, hcClient);
    }

    /**
     * 查询容器集群VPC网络的节点列表
     *
     * 查询容器集群网络的策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkNodeListRequest 请求对象
     * @return CompletableFuture<ListContainerNetworkNodeListResponse>
     */
    public CompletableFuture<ListContainerNetworkNodeListResponse> listContainerNetworkNodeListAsync(
        ListContainerNetworkNodeListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerNetworkNodeList);
    }

    /**
     * 查询容器集群VPC网络的节点列表
     *
     * 查询容器集群网络的策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkNodeListRequest 请求对象
     * @return AsyncInvoker<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse>
     */
    public AsyncInvoker<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse> listContainerNetworkNodeListAsyncInvoker(
        ListContainerNetworkNodeListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerNetworkNodeList, hcClient);
    }

    /**
     * 查询容器集群网络的策略列表
     *
     * 查询容器集群网络的策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkPolicyRequest 请求对象
     * @return CompletableFuture<ListContainerNetworkPolicyResponse>
     */
    public CompletableFuture<ListContainerNetworkPolicyResponse> listContainerNetworkPolicyAsync(
        ListContainerNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerNetworkPolicy);
    }

    /**
     * 查询容器集群网络的策略列表
     *
     * 查询容器集群网络的策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse>
     */
    public AsyncInvoker<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse> listContainerNetworkPolicyAsyncInvoker(
        ListContainerNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerNetworkPolicy, hcClient);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return CompletableFuture<ListContainerNodesResponse>
     */
    public CompletableFuture<ListContainerNodesResponse> listContainerNodesAsync(ListContainerNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerNodes);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>
     */
    public AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodesAsyncInvoker(
        ListContainerNodesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerNodes, hcClient);
    }

    /**
     * 查询容器基本信息列表
     *
     * 查询容器基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainersRequest 请求对象
     * @return CompletableFuture<ListContainersResponse>
     */
    public CompletableFuture<ListContainersResponse> listContainersAsync(ListContainersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainers);
    }

    /**
     * 查询容器基本信息列表
     *
     * 查询容器基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainersRequest 请求对象
     * @return AsyncInvoker<ListContainersRequest, ListContainersResponse>
     */
    public AsyncInvoker<ListContainersRequest, ListContainersResponse> listContainersAsyncInvoker(
        ListContainersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainers, hcClient);
    }

    /**
     * 查看动态端口蜜罐策略
     *
     * 查看动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortPolicyRequest 请求对象
     * @return CompletableFuture<ListDecoyPortPolicyResponse>
     */
    public CompletableFuture<ListDecoyPortPolicyResponse> listDecoyPortPolicyAsync(ListDecoyPortPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listDecoyPortPolicy);
    }

    /**
     * 查看动态端口蜜罐策略
     *
     * 查看动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortPolicyRequest 请求对象
     * @return AsyncInvoker<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse>
     */
    public AsyncInvoker<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse> listDecoyPortPolicyAsyncInvoker(
        ListDecoyPortPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listDecoyPortPolicy, hcClient);
    }

    /**
     * 获取字典列表
     *
     * 获取字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionariesRequest 请求对象
     * @return CompletableFuture<ListDictionariesResponse>
     */
    public CompletableFuture<ListDictionariesResponse> listDictionariesAsync(ListDictionariesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listDictionaries);
    }

    /**
     * 获取字典列表
     *
     * 获取字典列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionariesRequest 请求对象
     * @return AsyncInvoker<ListDictionariesRequest, ListDictionariesResponse>
     */
    public AsyncInvoker<ListDictionariesRequest, ListDictionariesResponse> listDictionariesAsyncInvoker(
        ListDictionariesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listDictionaries, hcClient);
    }

    /**
     * 下载导出文件
     *
     * 下载导出文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadExportedFileRequest 请求对象
     * @return CompletableFuture<ListDownloadExportedFileResponse>
     */
    public CompletableFuture<ListDownloadExportedFileResponse> listDownloadExportedFileAsync(
        ListDownloadExportedFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listDownloadExportedFile);
    }

    /**
     * 下载导出文件
     *
     * 下载导出文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadExportedFileRequest 请求对象
     * @return AsyncInvoker<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse>
     */
    public AsyncInvoker<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> listDownloadExportedFileAsyncInvoker(
        ListDownloadExportedFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listDownloadExportedFile, hcClient);
    }

    /**
     * 查询ATT&amp;CK攻击阶段统计列表
     *
     * 查询ATT&amp;CK攻击阶段统计列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventAttCkRequest 请求对象
     * @return CompletableFuture<ListEventAttCkResponse>
     */
    public CompletableFuture<ListEventAttCkResponse> listEventAttCkAsync(ListEventAttCkRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listEventAttCk);
    }

    /**
     * 查询ATT&amp;CK攻击阶段统计列表
     *
     * 查询ATT&amp;CK攻击阶段统计列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventAttCkRequest 请求对象
     * @return AsyncInvoker<ListEventAttCkRequest, ListEventAttCkResponse>
     */
    public AsyncInvoker<ListEventAttCkRequest, ListEventAttCkResponse> listEventAttCkAsyncInvoker(
        ListEventAttCkRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listEventAttCk, hcClient);
    }

    /**
     * 查看镜像漏洞的历史处置记录
     *
     * 查看镜像漏洞的历史处置记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulOperationsRequest 请求对象
     * @return CompletableFuture<ListGeneralImageVulOperationsResponse>
     */
    public CompletableFuture<ListGeneralImageVulOperationsResponse> listGeneralImageVulOperationsAsync(
        ListGeneralImageVulOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listGeneralImageVulOperations);
    }

    /**
     * 查看镜像漏洞的历史处置记录
     *
     * 查看镜像漏洞的历史处置记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulOperationsRequest 请求对象
     * @return AsyncInvoker<ListGeneralImageVulOperationsRequest, ListGeneralImageVulOperationsResponse>
     */
    public AsyncInvoker<ListGeneralImageVulOperationsRequest, ListGeneralImageVulOperationsResponse> listGeneralImageVulOperationsAsyncInvoker(
        ListGeneralImageVulOperationsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listGeneralImageVulOperations, hcClient);
    }

    /**
     * 查看所有类型镜像的漏洞
     *
     * 查看所有类型镜像的漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulsRequest 请求对象
     * @return CompletableFuture<ListGeneralImageVulsResponse>
     */
    public CompletableFuture<ListGeneralImageVulsResponse> listGeneralImageVulsAsync(
        ListGeneralImageVulsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listGeneralImageVuls);
    }

    /**
     * 查看所有类型镜像的漏洞
     *
     * 查看所有类型镜像的漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulsRequest 请求对象
     * @return AsyncInvoker<ListGeneralImageVulsRequest, ListGeneralImageVulsResponse>
     */
    public AsyncInvoker<ListGeneralImageVulsRequest, ListGeneralImageVulsResponse> listGeneralImageVulsAsyncInvoker(
        ListGeneralImageVulsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listGeneralImageVuls, hcClient);
    }

    /**
     * 查询资产全局扫描任务状态
     *
     * 查询资产全局扫描任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalAssetScanTaskRequest 请求对象
     * @return CompletableFuture<ListGlobalAssetScanTaskResponse>
     */
    public CompletableFuture<ListGlobalAssetScanTaskResponse> listGlobalAssetScanTaskAsync(
        ListGlobalAssetScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listGlobalAssetScanTask);
    }

    /**
     * 查询资产全局扫描任务状态
     *
     * 查询资产全局扫描任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalAssetScanTaskRequest 请求对象
     * @return AsyncInvoker<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse>
     */
    public AsyncInvoker<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse> listGlobalAssetScanTaskAsyncInvoker(
        ListGlobalAssetScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listGlobalAssetScanTask, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return CompletableFuture<ListHostGroupsResponse>
     */
    public CompletableFuture<ListHostGroupsResponse> listHostGroupsAsync(ListHostGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostGroups, hcClient);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostStatusRequest 请求对象
     * @return CompletableFuture<ListHostStatusResponse>
     */
    public CompletableFuture<ListHostStatusResponse> listHostStatusAsync(ListHostStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostStatus);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostStatusRequest 请求对象
     * @return AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public AsyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusAsyncInvoker(
        ListHostStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostStatus, hcClient);
    }

    /**
     * ECS风险状况
     *
     * ECS风险状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRiskRequest 请求对象
     * @return CompletableFuture<ListHostsRiskResponse>
     */
    public CompletableFuture<ListHostsRiskResponse> listHostsRiskAsync(ListHostsRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostsRisk);
    }

    /**
     * ECS风险状况
     *
     * ECS风险状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRiskRequest 请求对象
     * @return AsyncInvoker<ListHostsRiskRequest, ListHostsRiskResponse>
     */
    public AsyncInvoker<ListHostsRiskRequest, ListHostsRiskResponse> listHostsRiskAsyncInvoker(
        ListHostsRiskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostsRisk, hcClient);
    }

    /**
     * 查询镜像的基础镜像信息
     *
     * 查询镜像的基础镜像信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBasicImageRequest 请求对象
     * @return CompletableFuture<ListImageBasicImageResponse>
     */
    public CompletableFuture<ListImageBasicImageResponse> listImageBasicImageAsync(ListImageBasicImageRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageBasicImage);
    }

    /**
     * 查询镜像的基础镜像信息
     *
     * 查询镜像的基础镜像信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBasicImageRequest 请求对象
     * @return AsyncInvoker<ListImageBasicImageRequest, ListImageBasicImageResponse>
     */
    public AsyncInvoker<ListImageBasicImageRequest, ListImageBasicImageResponse> listImageBasicImageAsyncInvoker(
        ListImageBasicImageRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageBasicImage, hcClient);
    }

    /**
     * 查询镜像文件列表
     *
     * 查询镜像文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageFilesRequest 请求对象
     * @return CompletableFuture<ListImageFilesResponse>
     */
    public CompletableFuture<ListImageFilesResponse> listImageFilesAsync(ListImageFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageFiles);
    }

    /**
     * 查询镜像文件列表
     *
     * 查询镜像文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageFilesRequest 请求对象
     * @return AsyncInvoker<ListImageFilesRequest, ListImageFilesResponse>
     */
    public AsyncInvoker<ListImageFilesRequest, ListImageFilesResponse> listImageFilesAsyncInvoker(
        ListImageFilesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageFiles, hcClient);
    }

    /**
     * 查询已隔离文件列表
     *
     * 查询已隔离文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsolatedFileRequest 请求对象
     * @return CompletableFuture<ListIsolatedFileResponse>
     */
    public CompletableFuture<ListIsolatedFileResponse> listIsolatedFileAsync(ListIsolatedFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listIsolatedFile);
    }

    /**
     * 查询已隔离文件列表
     *
     * 查询已隔离文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsolatedFileRequest 请求对象
     * @return AsyncInvoker<ListIsolatedFileRequest, ListIsolatedFileResponse>
     */
    public AsyncInvoker<ListIsolatedFileRequest, ListIsolatedFileResponse> listIsolatedFileAsyncInvoker(
        ListIsolatedFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listIsolatedFile, hcClient);
    }

    /**
     * 查询指定中间件的服务器列表
     *
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageHostInfoRequest 请求对象
     * @return CompletableFuture<ListJarPackageHostInfoResponse>
     */
    public CompletableFuture<ListJarPackageHostInfoResponse> listJarPackageHostInfoAsync(
        ListJarPackageHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listJarPackageHostInfo);
    }

    /**
     * 查询指定中间件的服务器列表
     *
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageHostInfoRequest 请求对象
     * @return AsyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse>
     */
    public AsyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfoAsyncInvoker(
        ListJarPackageHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listJarPackageHostInfo, hcClient);
    }

    /**
     * 查询指定主机的中间件信息
     *
     * 查询指定主机的中间件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageInfoRequest 请求对象
     * @return CompletableFuture<ListJarPackageInfoResponse>
     */
    public CompletableFuture<ListJarPackageInfoResponse> listJarPackageInfoAsync(ListJarPackageInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listJarPackageInfo);
    }

    /**
     * 查询指定主机的中间件信息
     *
     * 查询指定主机的中间件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageInfoRequest 请求对象
     * @return AsyncInvoker<ListJarPackageInfoRequest, ListJarPackageInfoResponse>
     */
    public AsyncInvoker<ListJarPackageInfoRequest, ListJarPackageInfoResponse> listJarPackageInfoAsyncInvoker(
        ListJarPackageInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listJarPackageInfo, hcClient);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageStatisticsRequest 请求对象
     * @return CompletableFuture<ListJarPackageStatisticsResponse>
     */
    public CompletableFuture<ListJarPackageStatisticsResponse> listJarPackageStatisticsAsync(
        ListJarPackageStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listJarPackageStatistics);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageStatisticsRequest 请求对象
     * @return AsyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse>
     */
    public AsyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatisticsAsyncInvoker(
        ListJarPackageStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listJarPackageStatistics, hcClient);
    }

    /**
     * 查询cronjobs基本信息列表
     *
     * 查询cronjobs基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sCronJobsRequest 请求对象
     * @return CompletableFuture<ListK8sCronJobsResponse>
     */
    public CompletableFuture<ListK8sCronJobsResponse> listK8sCronJobsAsync(ListK8sCronJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sCronJobs);
    }

    /**
     * 查询cronjobs基本信息列表
     *
     * 查询cronjobs基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sCronJobsRequest 请求对象
     * @return AsyncInvoker<ListK8sCronJobsRequest, ListK8sCronJobsResponse>
     */
    public AsyncInvoker<ListK8sCronJobsRequest, ListK8sCronJobsResponse> listK8sCronJobsAsyncInvoker(
        ListK8sCronJobsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sCronJobs, hcClient);
    }

    /**
     * 查询daemonsets基本信息列表
     *
     * 查询daemonsets基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDaemonSetsRequest 请求对象
     * @return CompletableFuture<ListK8sDaemonSetsResponse>
     */
    public CompletableFuture<ListK8sDaemonSetsResponse> listK8sDaemonSetsAsync(ListK8sDaemonSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sDaemonSets);
    }

    /**
     * 查询daemonsets基本信息列表
     *
     * 查询daemonsets基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDaemonSetsRequest 请求对象
     * @return AsyncInvoker<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse>
     */
    public AsyncInvoker<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse> listK8sDaemonSetsAsyncInvoker(
        ListK8sDaemonSetsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sDaemonSets, hcClient);
    }

    /**
     * 查询deployment基本信息列表
     *
     * 查询deployment基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDeploymentsRequest 请求对象
     * @return CompletableFuture<ListK8sDeploymentsResponse>
     */
    public CompletableFuture<ListK8sDeploymentsResponse> listK8sDeploymentsAsync(ListK8sDeploymentsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sDeployments);
    }

    /**
     * 查询deployment基本信息列表
     *
     * 查询deployment基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDeploymentsRequest 请求对象
     * @return AsyncInvoker<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse>
     */
    public AsyncInvoker<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse> listK8sDeploymentsAsyncInvoker(
        ListK8sDeploymentsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sDeployments, hcClient);
    }

    /**
     * 查询jobs基本信息列表
     *
     * 查询jobs基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sJobsRequest 请求对象
     * @return CompletableFuture<ListK8sJobsResponse>
     */
    public CompletableFuture<ListK8sJobsResponse> listK8sJobsAsync(ListK8sJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sJobs);
    }

    /**
     * 查询jobs基本信息列表
     *
     * 查询jobs基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sJobsRequest 请求对象
     * @return AsyncInvoker<ListK8sJobsRequest, ListK8sJobsResponse>
     */
    public AsyncInvoker<ListK8sJobsRequest, ListK8sJobsResponse> listK8sJobsAsyncInvoker(ListK8sJobsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sJobs, hcClient);
    }

    /**
     * 查询pod基本信息列表
     *
     * 查询pod基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sPodsRequest 请求对象
     * @return CompletableFuture<ListK8sPodsResponse>
     */
    public CompletableFuture<ListK8sPodsResponse> listK8sPodsAsync(ListK8sPodsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sPods);
    }

    /**
     * 查询pod基本信息列表
     *
     * 查询pod基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sPodsRequest 请求对象
     * @return AsyncInvoker<ListK8sPodsRequest, ListK8sPodsResponse>
     */
    public AsyncInvoker<ListK8sPodsRequest, ListK8sPodsResponse> listK8sPodsAsyncInvoker(ListK8sPodsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sPods, hcClient);
    }

    /**
     * 查询statefulset基本信息列表
     *
     * 查询statefulset基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sStatefulSetsRequest 请求对象
     * @return CompletableFuture<ListK8sStatefulSetsResponse>
     */
    public CompletableFuture<ListK8sStatefulSetsResponse> listK8sStatefulSetsAsync(ListK8sStatefulSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listK8sStatefulSets);
    }

    /**
     * 查询statefulset基本信息列表
     *
     * 查询statefulset基本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sStatefulSetsRequest 请求对象
     * @return AsyncInvoker<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse>
     */
    public AsyncInvoker<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse> listK8sStatefulSetsAsyncInvoker(
        ListK8sStatefulSetsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listK8sStatefulSets, hcClient);
    }

    /**
     * 查询指定内核模块的服务器列表
     *
     * 查询指定内核模块的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleHostInfoRequest 请求对象
     * @return CompletableFuture<ListKernelModuleHostInfoResponse>
     */
    public CompletableFuture<ListKernelModuleHostInfoResponse> listKernelModuleHostInfoAsync(
        ListKernelModuleHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKernelModuleHostInfo);
    }

    /**
     * 查询指定内核模块的服务器列表
     *
     * 查询指定内核模块的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleHostInfoRequest 请求对象
     * @return AsyncInvoker<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse>
     */
    public AsyncInvoker<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse> listKernelModuleHostInfoAsyncInvoker(
        ListKernelModuleHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKernelModuleHostInfo, hcClient);
    }

    /**
     * 查询指定主机的内核模块信息
     *
     * 查询指定主机的内核模块信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleInfoRequest 请求对象
     * @return CompletableFuture<ListKernelModuleInfoResponse>
     */
    public CompletableFuture<ListKernelModuleInfoResponse> listKernelModuleInfoAsync(
        ListKernelModuleInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKernelModuleInfo);
    }

    /**
     * 查询指定主机的内核模块信息
     *
     * 查询指定主机的内核模块信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleInfoRequest 请求对象
     * @return AsyncInvoker<ListKernelModuleInfoRequest, ListKernelModuleInfoResponse>
     */
    public AsyncInvoker<ListKernelModuleInfoRequest, ListKernelModuleInfoResponse> listKernelModuleInfoAsyncInvoker(
        ListKernelModuleInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKernelModuleInfo, hcClient);
    }

    /**
     * 查询内核模块的统计信息
     *
     * 查询内核模块的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleStatisticsRequest 请求对象
     * @return CompletableFuture<ListKernelModuleStatisticsResponse>
     */
    public CompletableFuture<ListKernelModuleStatisticsResponse> listKernelModuleStatisticsAsync(
        ListKernelModuleStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKernelModuleStatistics);
    }

    /**
     * 查询内核模块的统计信息
     *
     * 查询内核模块的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleStatisticsRequest 请求对象
     * @return AsyncInvoker<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse>
     */
    public AsyncInvoker<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse> listKernelModuleStatisticsAsyncInvoker(
        ListKernelModuleStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKernelModuleStatistics, hcClient);
    }

    /**
     * 查询容器Kubernetes集群列表
     *
     * 查询容器Kubernetes集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesClusterDetailsRequest 请求对象
     * @return CompletableFuture<ListKubernetesClusterDetailsResponse>
     */
    public CompletableFuture<ListKubernetesClusterDetailsResponse> listKubernetesClusterDetailsAsync(
        ListKubernetesClusterDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKubernetesClusterDetails);
    }

    /**
     * 查询容器Kubernetes集群列表
     *
     * 查询容器Kubernetes集群列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesClusterDetailsRequest 请求对象
     * @return AsyncInvoker<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse>
     */
    public AsyncInvoker<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse> listKubernetesClusterDetailsAsyncInvoker(
        ListKubernetesClusterDetailsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKubernetesClusterDetails, hcClient);
    }

    /**
     * 查询容器Kubernetes端点列表
     *
     * 查询容器Kubernetes端点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesEndpointDetailsRequest 请求对象
     * @return CompletableFuture<ListKubernetesEndpointDetailsResponse>
     */
    public CompletableFuture<ListKubernetesEndpointDetailsResponse> listKubernetesEndpointDetailsAsync(
        ListKubernetesEndpointDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKubernetesEndpointDetails);
    }

    /**
     * 查询容器Kubernetes端点列表
     *
     * 查询容器Kubernetes端点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesEndpointDetailsRequest 请求对象
     * @return AsyncInvoker<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse>
     */
    public AsyncInvoker<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse> listKubernetesEndpointDetailsAsyncInvoker(
        ListKubernetesEndpointDetailsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKubernetesEndpointDetails, hcClient);
    }

    /**
     * 查询容器Kubernetes服务列表
     *
     * 查询容器Kubernetes服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesServiceDetailsRequest 请求对象
     * @return CompletableFuture<ListKubernetesServiceDetailsResponse>
     */
    public CompletableFuture<ListKubernetesServiceDetailsResponse> listKubernetesServiceDetailsAsync(
        ListKubernetesServiceDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listKubernetesServiceDetails);
    }

    /**
     * 查询容器Kubernetes服务列表
     *
     * 查询容器Kubernetes服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesServiceDetailsRequest 请求对象
     * @return AsyncInvoker<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse>
     */
    public AsyncInvoker<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse> listKubernetesServiceDetailsAsyncInvoker(
        ListKubernetesServiceDetailsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listKubernetesServiceDetails, hcClient);
    }

    /**
     * 查询常用登录IP信息
     *
     * 查询常用登录IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonIpRequest 请求对象
     * @return CompletableFuture<ListLoginCommonIpResponse>
     */
    public CompletableFuture<ListLoginCommonIpResponse> listLoginCommonIpAsync(ListLoginCommonIpRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listLoginCommonIp);
    }

    /**
     * 查询常用登录IP信息
     *
     * 查询常用登录IP信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonIpRequest 请求对象
     * @return AsyncInvoker<ListLoginCommonIpRequest, ListLoginCommonIpResponse>
     */
    public AsyncInvoker<ListLoginCommonIpRequest, ListLoginCommonIpResponse> listLoginCommonIpAsyncInvoker(
        ListLoginCommonIpRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listLoginCommonIp, hcClient);
    }

    /**
     * 查询常用登录地信息
     *
     * 查询常用登录地信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonLocationRequest 请求对象
     * @return CompletableFuture<ListLoginCommonLocationResponse>
     */
    public CompletableFuture<ListLoginCommonLocationResponse> listLoginCommonLocationAsync(
        ListLoginCommonLocationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listLoginCommonLocation);
    }

    /**
     * 查询常用登录地信息
     *
     * 查询常用登录地信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonLocationRequest 请求对象
     * @return AsyncInvoker<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse>
     */
    public AsyncInvoker<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse> listLoginCommonLocationAsyncInvoker(
        ListLoginCommonLocationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listLoginCommonLocation, hcClient);
    }

    /**
     * 查询SSH登录IP白名单列表
     *
     * 查询SSH登录IP白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteIpRequest 请求对象
     * @return CompletableFuture<ListLoginWhiteIpResponse>
     */
    public CompletableFuture<ListLoginWhiteIpResponse> listLoginWhiteIpAsync(ListLoginWhiteIpRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listLoginWhiteIp);
    }

    /**
     * 查询SSH登录IP白名单列表
     *
     * 查询SSH登录IP白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteIpRequest 请求对象
     * @return AsyncInvoker<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse>
     */
    public AsyncInvoker<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse> listLoginWhiteIpAsyncInvoker(
        ListLoginWhiteIpRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listLoginWhiteIp, hcClient);
    }

    /**
     * 查询登录白名单列表
     *
     * 查询登录白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteListRequest 请求对象
     * @return CompletableFuture<ListLoginWhiteListResponse>
     */
    public CompletableFuture<ListLoginWhiteListResponse> listLoginWhiteListAsync(ListLoginWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listLoginWhiteList);
    }

    /**
     * 查询登录白名单列表
     *
     * 查询登录白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteListRequest 请求对象
     * @return AsyncInvoker<ListLoginWhiteListRequest, ListLoginWhiteListResponse>
     */
    public AsyncInvoker<ListLoginWhiteListRequest, ListLoginWhiteListResponse> listLoginWhiteListAsyncInvoker(
        ListLoginWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listLoginWhiteList, hcClient);
    }

    /**
     * 查询恶意软件云查样本收集配置开关状态
     *
     * 查询恶意软件云查样本收集配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMalwareCollectStatusRequest 请求对象
     * @return CompletableFuture<ListMalwareCollectStatusResponse>
     */
    public CompletableFuture<ListMalwareCollectStatusResponse> listMalwareCollectStatusAsync(
        ListMalwareCollectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listMalwareCollectStatus);
    }

    /**
     * 查询恶意软件云查样本收集配置开关状态
     *
     * 查询恶意软件云查样本收集配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMalwareCollectStatusRequest 请求对象
     * @return AsyncInvoker<ListMalwareCollectStatusRequest, ListMalwareCollectStatusResponse>
     */
    public AsyncInvoker<ListMalwareCollectStatusRequest, ListMalwareCollectStatusResponse> listMalwareCollectStatusAsyncInvoker(
        ListMalwareCollectStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listMalwareCollectStatus, hcClient);
    }

    /**
     * 获取集群下的namespace
     *
     * 获取集群下的namespace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return CompletableFuture<ListNamespacesResponse>
     */
    public CompletableFuture<ListNamespacesResponse> listNamespacesAsync(ListNamespacesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listNamespaces);
    }

    /**
     * 获取集群下的namespace
     *
     * 获取集群下的namespace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public AsyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesAsyncInvoker(
        ListNamespacesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listNamespaces, hcClient);
    }

    /**
     * 查询备份恢复任务列表
     *
     * 查询备份恢复任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationLogsByVaultNameRequest 请求对象
     * @return CompletableFuture<ListOperationLogsByVaultNameResponse>
     */
    public CompletableFuture<ListOperationLogsByVaultNameResponse> listOperationLogsByVaultNameAsync(
        ListOperationLogsByVaultNameRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listOperationLogsByVaultName);
    }

    /**
     * 查询备份恢复任务列表
     *
     * 查询备份恢复任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationLogsByVaultNameRequest 请求对象
     * @return AsyncInvoker<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse>
     */
    public AsyncInvoker<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse> listOperationLogsByVaultNameAsyncInvoker(
        ListOperationLogsByVaultNameRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listOperationLogsByVaultName, hcClient);
    }

    /**
     * 查询账号组织
     *
     * 查询账号组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return CompletableFuture<ListOrganizationTreeResponse>
     */
    public CompletableFuture<ListOrganizationTreeResponse> listOrganizationTreeAsync(
        ListOrganizationTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listOrganizationTree);
    }

    /**
     * 查询账号组织
     *
     * 查询账号组织
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return AsyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse>
     */
    public AsyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTreeAsyncInvoker(
        ListOrganizationTreeRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listOrganizationTree, hcClient);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPasswordComplexityRequest 请求对象
     * @return CompletableFuture<ListPasswordComplexityResponse>
     */
    public CompletableFuture<ListPasswordComplexityResponse> listPasswordComplexityAsync(
        ListPasswordComplexityRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPasswordComplexity);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPasswordComplexityRequest 请求对象
     * @return AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public AsyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityAsyncInvoker(
        ListPasswordComplexityRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPasswordComplexity, hcClient);
    }

    /**
     * 获取docker插件安装脚本
     *
     * 获取docker插件安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInstallScriptRequest 请求对象
     * @return CompletableFuture<ListPluginInstallScriptResponse>
     */
    public CompletableFuture<ListPluginInstallScriptResponse> listPluginInstallScriptAsync(
        ListPluginInstallScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPluginInstallScript);
    }

    /**
     * 获取docker插件安装脚本
     *
     * 获取docker插件安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInstallScriptRequest 请求对象
     * @return AsyncInvoker<ListPluginInstallScriptRequest, ListPluginInstallScriptResponse>
     */
    public AsyncInvoker<ListPluginInstallScriptRequest, ListPluginInstallScriptResponse> listPluginInstallScriptAsyncInvoker(
        ListPluginInstallScriptRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPluginInstallScript, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse>
     */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return AsyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public AsyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsAsyncInvoker(ListPluginsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPlugins, hcClient);
    }

    /**
     * 查询主机策略列表
     *
     * 查询主机策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPolicies);
    }

    /**
     * 查询主机策略列表
     *
     * 查询主机策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPolicies, hcClient);
    }

    /**
     * 查询指定开放端口的服务器列表
     *
     * 查询具备该端口的主机/容器的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortHostRequest 请求对象
     * @return CompletableFuture<ListPortHostResponse>
     */
    public CompletableFuture<ListPortHostResponse> listPortHostAsync(ListPortHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPortHost);
    }

    /**
     * 查询指定开放端口的服务器列表
     *
     * 查询具备该端口的主机/容器的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortHostRequest 请求对象
     * @return AsyncInvoker<ListPortHostRequest, ListPortHostResponse>
     */
    public AsyncInvoker<ListPortHostRequest, ListPortHostResponse> listPortHostAsyncInvoker(
        ListPortHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPortHost, hcClient);
    }

    /**
     * 查询开放端口统计信息
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortStatisticsRequest 请求对象
     * @return CompletableFuture<ListPortStatisticsResponse>
     */
    public CompletableFuture<ListPortStatisticsResponse> listPortStatisticsAsync(ListPortStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPortStatistics);
    }

    /**
     * 查询开放端口统计信息
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortStatisticsRequest 请求对象
     * @return AsyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>
     */
    public AsyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatisticsAsyncInvoker(
        ListPortStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPortStatistics, hcClient);
    }

    /**
     * 查询单服务器的开放端口列表
     *
     * 查询单服务器的开放端口列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return CompletableFuture<ListPortsResponse>
     */
    public CompletableFuture<ListPortsResponse> listPortsAsync(ListPortsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPorts);
    }

    /**
     * 查询单服务器的开放端口列表
     *
     * 查询单服务器的开放端口列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return AsyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public AsyncInvoker<ListPortsRequest, ListPortsResponse> listPortsAsyncInvoker(ListPortsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPorts, hcClient);
    }

    /**
     * 查询进程统计信息
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessStatisticsRequest 请求对象
     * @return CompletableFuture<ListProcessStatisticsResponse>
     */
    public CompletableFuture<ListProcessStatisticsResponse> listProcessStatisticsAsync(
        ListProcessStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProcessStatistics);
    }

    /**
     * 查询进程统计信息
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessStatisticsRequest 请求对象
     * @return AsyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>
     */
    public AsyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatisticsAsyncInvoker(
        ListProcessStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProcessStatistics, hcClient);
    }

    /**
     * 查询指定进程的服务器列表
     *
     * 具备该进程的主机/容器的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesHostRequest 请求对象
     * @return CompletableFuture<ListProcessesHostResponse>
     */
    public CompletableFuture<ListProcessesHostResponse> listProcessesHostAsync(ListProcessesHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProcessesHost);
    }

    /**
     * 查询指定进程的服务器列表
     *
     * 具备该进程的主机/容器的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesHostRequest 请求对象
     * @return AsyncInvoker<ListProcessesHostRequest, ListProcessesHostResponse>
     */
    public AsyncInvoker<ListProcessesHostRequest, ListProcessesHostResponse> listProcessesHostAsyncInvoker(
        ListProcessesHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProcessesHost, hcClient);
    }

    /**
     * 查询租户当前项目下所有用过的标签
     *
     * 查询租户当前项目下所有用过的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProjectTags);
    }

    /**
     * 查询租户当前项目下所有用过的标签
     *
     * 查询租户当前项目下所有用过的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProjectTags, hcClient);
    }

    /**
     * 查询勒索病毒的防护策略列表
     *
     * 查询勒索病毒的防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionPolicyRequest 请求对象
     * @return CompletableFuture<ListProtectionPolicyResponse>
     */
    public CompletableFuture<ListProtectionPolicyResponse> listProtectionPolicyAsync(
        ListProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProtectionPolicy);
    }

    /**
     * 查询勒索病毒的防护策略列表
     *
     * 查询勒索病毒的防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>
     */
    public AsyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicyAsyncInvoker(
        ListProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProtectionPolicy, hcClient);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServerRequest 请求对象
     * @return CompletableFuture<ListProtectionServerResponse>
     */
    public CompletableFuture<ListProtectionServerResponse> listProtectionServerAsync(
        ListProtectionServerRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProtectionServer);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServerRequest 请求对象
     * @return AsyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>
     */
    public AsyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServerAsyncInvoker(
        ListProtectionServerRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProtectionServer, hcClient);
    }

    /**
     * 查询防护服务器列表
     *
     * 查询防护服务器列表：查询防护服务器相关数据，包含服务器名称、ip地址、操作系统、服务器组名称、防护策略、防护状态、微服务防护状态、RASP防护状态、RASP攻击数量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServersRequest 请求对象
     * @return CompletableFuture<ListProtectionServersResponse>
     */
    public CompletableFuture<ListProtectionServersResponse> listProtectionServersAsync(
        ListProtectionServersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProtectionServers);
    }

    /**
     * 查询防护服务器列表
     *
     * 查询防护服务器列表：查询防护服务器相关数据，包含服务器名称、ip地址、操作系统、服务器组名称、防护策略、防护状态、微服务防护状态、RASP防护状态、RASP攻击数量信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServersRequest 请求对象
     * @return AsyncInvoker<ListProtectionServersRequest, ListProtectionServersResponse>
     */
    public AsyncInvoker<ListProtectionServersRequest, ListProtectionServersResponse> listProtectionServersAsyncInvoker(
        ListProtectionServersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProtectionServers, hcClient);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryExportTaskRequest 请求对象
     * @return CompletableFuture<ListQueryExportTaskResponse>
     */
    public CompletableFuture<ListQueryExportTaskResponse> listQueryExportTaskAsync(ListQueryExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listQueryExportTask);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryExportTaskRequest 请求对象
     * @return AsyncInvoker<ListQueryExportTaskRequest, ListQueryExportTaskResponse>
     */
    public AsyncInvoker<ListQueryExportTaskRequest, ListQueryExportTaskResponse> listQueryExportTaskAsyncInvoker(
        ListQueryExportTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listQueryExportTask, hcClient);
    }

    /**
     * 查询勒索防护服务器列表2.0
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRansomwareProtectionNodesRequest 请求对象
     * @return CompletableFuture<ListRansomwareProtectionNodesResponse>
     */
    public CompletableFuture<ListRansomwareProtectionNodesResponse> listRansomwareProtectionNodesAsync(
        ListRansomwareProtectionNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRansomwareProtectionNodes);
    }

    /**
     * 查询勒索防护服务器列表2.0
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRansomwareProtectionNodesRequest 请求对象
     * @return AsyncInvoker<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse>
     */
    public AsyncInvoker<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse> listRansomwareProtectionNodesAsyncInvoker(
        ListRansomwareProtectionNodesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRansomwareProtectionNodes, hcClient);
    }

    /**
     * 查询应用防护事件列表
     *
     * 查询应用防护事件列表：展示防护事件相关信息，包含告警级别、服务器名称、告警名称、告警时间、攻击源ip、攻击源url数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspEventsRequest 请求对象
     * @return CompletableFuture<ListRaspEventsResponse>
     */
    public CompletableFuture<ListRaspEventsResponse> listRaspEventsAsync(ListRaspEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRaspEvents);
    }

    /**
     * 查询应用防护事件列表
     *
     * 查询应用防护事件列表：展示防护事件相关信息，包含告警级别、服务器名称、告警名称、告警时间、攻击源ip、攻击源url数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspEventsRequest 请求对象
     * @return AsyncInvoker<ListRaspEventsRequest, ListRaspEventsResponse>
     */
    public AsyncInvoker<ListRaspEventsRequest, ListRaspEventsResponse> listRaspEventsAsyncInvoker(
        ListRaspEventsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRaspEvents, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表：查询创建的防护策略信息，包含防护策略名称、检测规则、关联服务器数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspPoliciesRequest 请求对象
     * @return CompletableFuture<ListRaspPoliciesResponse>
     */
    public CompletableFuture<ListRaspPoliciesResponse> listRaspPoliciesAsync(ListRaspPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRaspPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表：查询创建的防护策略信息，包含防护策略名称、检测规则、关联服务器数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspPoliciesRequest 请求对象
     * @return AsyncInvoker<ListRaspPoliciesRequest, ListRaspPoliciesResponse>
     */
    public AsyncInvoker<ListRaspPoliciesRequest, ListRaspPoliciesResponse> listRaspPoliciesAsyncInvoker(
        ListRaspPoliciesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRaspPolicies, hcClient);
    }

    /**
     * 查询单个资源的资源标签
     *
     * 查询单个资源的资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceTagRequest 请求对象
     * @return CompletableFuture<ListResourceInstanceTagResponse>
     */
    public CompletableFuture<ListResourceInstanceTagResponse> listResourceInstanceTagAsync(
        ListResourceInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listResourceInstanceTag);
    }

    /**
     * 查询单个资源的资源标签
     *
     * 查询单个资源的资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceTagRequest 请求对象
     * @return AsyncInvoker<ListResourceInstanceTagRequest, ListResourceInstanceTagResponse>
     */
    public AsyncInvoker<ListResourceInstanceTagRequest, ListResourceInstanceTagResponse> listResourceInstanceTagAsyncInvoker(
        ListResourceInstanceTagRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listResourceInstanceTag, hcClient);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigCheckRulesRequest 请求对象
     * @return CompletableFuture<ListRiskConfigCheckRulesResponse>
     */
    public CompletableFuture<ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsync(
        ListRiskConfigCheckRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigCheckRulesRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public AsyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesAsyncInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRiskConfigCheckRules, hcClient);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigHostsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigHostsResponse>
     */
    public CompletableFuture<ListRiskConfigHostsResponse> listRiskConfigHostsAsync(ListRiskConfigHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigHosts);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigHostsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public AsyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsAsyncInvoker(
        ListRiskConfigHostsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRiskConfigHosts, hcClient);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigsRequest 请求对象
     * @return CompletableFuture<ListRiskConfigsResponse>
     */
    public CompletableFuture<ListRiskConfigsResponse> listRiskConfigsAsync(ListRiskConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRiskConfigs);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigsRequest 请求对象
     * @return AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public AsyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsAsyncInvoker(
        ListRiskConfigsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRiskConfigs, hcClient);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityEventsRequest 请求对象
     * @return CompletableFuture<ListSecurityEventsResponse>
     */
    public CompletableFuture<ListSecurityEventsResponse> listSecurityEventsAsync(ListSecurityEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityEventsRequest 请求对象
     * @return AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public AsyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsAsyncInvoker(
        ListSecurityEventsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSecurityEvents, hcClient);
    }

    /**
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     *
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupPoliciesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupPoliciesResponse>
     */
    public CompletableFuture<ListSecurityGroupPoliciesResponse> listSecurityGroupPoliciesAsync(
        ListSecurityGroupPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityGroupPolicies);
    }

    /**
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     *
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupPoliciesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse>
     */
    public AsyncInvoker<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse> listSecurityGroupPoliciesAsyncInvoker(
        ListSecurityGroupPoliciesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSecurityGroupPolicies, hcClient);
    }

    /**
     * 查询企业项目下所有的安全组列表
     *
     * 查询企业项目下所有的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityGroups);
    }

    /**
     * 查询企业项目下所有的安全组列表
     *
     * 查询企业项目下所有的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询系统用户白名单列表
     *
     * 查询系统用户白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemUserWhiteListRequest 请求对象
     * @return CompletableFuture<ListSystemUserWhiteListResponse>
     */
    public CompletableFuture<ListSystemUserWhiteListResponse> listSystemUserWhiteListAsync(
        ListSystemUserWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSystemUserWhiteList);
    }

    /**
     * 查询系统用户白名单列表
     *
     * 查询系统用户白名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemUserWhiteListRequest 请求对象
     * @return AsyncInvoker<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse>
     */
    public AsyncInvoker<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse> listSystemUserWhiteListAsyncInvoker(
        ListSystemUserWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSystemUserWhiteList, hcClient);
    }

    /**
     * 查询双因子主机列表
     *
     * 查询双因子主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoFactorLoginHostRequest 请求对象
     * @return CompletableFuture<ListTwoFactorLoginHostResponse>
     */
    public CompletableFuture<ListTwoFactorLoginHostResponse> listTwoFactorLoginHostAsync(
        ListTwoFactorLoginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listTwoFactorLoginHost);
    }

    /**
     * 查询双因子主机列表
     *
     * 查询双因子主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoFactorLoginHostRequest 请求对象
     * @return AsyncInvoker<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse>
     */
    public AsyncInvoker<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse> listTwoFactorLoginHostAsyncInvoker(
        ListTwoFactorLoginHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listTwoFactorLoginHost, hcClient);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserChangeHistoriesRequest 请求对象
     * @return CompletableFuture<ListUserChangeHistoriesResponse>
     */
    public CompletableFuture<ListUserChangeHistoriesResponse> listUserChangeHistoriesAsync(
        ListUserChangeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUserChangeHistories);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserChangeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>
     */
    public AsyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistoriesAsyncInvoker(
        ListUserChangeHistoriesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listUserChangeHistories, hcClient);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserStatisticsRequest 请求对象
     * @return CompletableFuture<ListUserStatisticsResponse>
     */
    public CompletableFuture<ListUserStatisticsResponse> listUserStatisticsAsync(ListUserStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUserStatistics);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserStatisticsRequest 请求对象
     * @return AsyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>
     */
    public AsyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatisticsAsyncInvoker(
        ListUserStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listUserStatistics, hcClient);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return CompletableFuture<ListUsersResponse>
     */
    public CompletableFuture<ListUsersResponse> listUsersAsync(ListUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listUsers);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return AsyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public AsyncInvoker<ListUsersRequest, ListUsersResponse> listUsersAsyncInvoker(ListUsersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listUsers, hcClient);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeakPasswordUsersRequest 请求对象
     * @return CompletableFuture<ListWeakPasswordUsersResponse>
     */
    public CompletableFuture<ListWeakPasswordUsersResponse> listWeakPasswordUsersAsync(
        ListWeakPasswordUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeakPasswordUsersRequest 请求对象
     * @return AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public AsyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersAsyncInvoker(
        ListWeakPasswordUsersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWeakPasswordUsers, hcClient);
    }

    /**
     * 查询Web服务、Web应用、数据库的统计信息
     *
     * 查询Web服务、Web应用、数据库的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServiceStatisticsRequest 请求对象
     * @return CompletableFuture<ListWebAppAndServiceStatisticsResponse>
     */
    public CompletableFuture<ListWebAppAndServiceStatisticsResponse> listWebAppAndServiceStatisticsAsync(
        ListWebAppAndServiceStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebAppAndServiceStatistics);
    }

    /**
     * 查询Web服务、Web应用、数据库的统计信息
     *
     * 查询Web服务、Web应用、数据库的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServiceStatisticsRequest 请求对象
     * @return AsyncInvoker<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse>
     */
    public AsyncInvoker<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse> listWebAppAndServiceStatisticsAsyncInvoker(
        ListWebAppAndServiceStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebAppAndServiceStatistics, hcClient);
    }

    /**
     * 查询指定Web服务、Web应用、数据库的服务器列表
     *
     * 查询指定Web服务、Web应用、数据库的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServicesRequest 请求对象
     * @return CompletableFuture<ListWebAppAndServicesResponse>
     */
    public CompletableFuture<ListWebAppAndServicesResponse> listWebAppAndServicesAsync(
        ListWebAppAndServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebAppAndServices);
    }

    /**
     * 查询指定Web服务、Web应用、数据库的服务器列表
     *
     * 查询指定Web服务、Web应用、数据库的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServicesRequest 请求对象
     * @return AsyncInvoker<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse>
     */
    public AsyncInvoker<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse> listWebAppAndServicesAsyncInvoker(
        ListWebAppAndServicesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebAppAndServices, hcClient);
    }

    /**
     * 查询指定Web框架的服务器列表
     *
     * 查询指定Web框架的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkHostInfoRequest 请求对象
     * @return CompletableFuture<ListWebFrameworkHostInfoResponse>
     */
    public CompletableFuture<ListWebFrameworkHostInfoResponse> listWebFrameworkHostInfoAsync(
        ListWebFrameworkHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebFrameworkHostInfo);
    }

    /**
     * 查询指定Web框架的服务器列表
     *
     * 查询指定Web框架的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkHostInfoRequest 请求对象
     * @return AsyncInvoker<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse>
     */
    public AsyncInvoker<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse> listWebFrameworkHostInfoAsyncInvoker(
        ListWebFrameworkHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebFrameworkHostInfo, hcClient);
    }

    /**
     * 查询指定主机的Web框架信息
     *
     * 查询指定主机的Web框架信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkInfoRequest 请求对象
     * @return CompletableFuture<ListWebFrameworkInfoResponse>
     */
    public CompletableFuture<ListWebFrameworkInfoResponse> listWebFrameworkInfoAsync(
        ListWebFrameworkInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebFrameworkInfo);
    }

    /**
     * 查询指定主机的Web框架信息
     *
     * 查询指定主机的Web框架信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkInfoRequest 请求对象
     * @return AsyncInvoker<ListWebFrameworkInfoRequest, ListWebFrameworkInfoResponse>
     */
    public AsyncInvoker<ListWebFrameworkInfoRequest, ListWebFrameworkInfoResponse> listWebFrameworkInfoAsyncInvoker(
        ListWebFrameworkInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebFrameworkInfo, hcClient);
    }

    /**
     * 查询Web框架的统计信息
     *
     * 查询Web框架的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkStatisticsRequest 请求对象
     * @return CompletableFuture<ListWebFrameworkStatisticsResponse>
     */
    public CompletableFuture<ListWebFrameworkStatisticsResponse> listWebFrameworkStatisticsAsync(
        ListWebFrameworkStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebFrameworkStatistics);
    }

    /**
     * 查询Web框架的统计信息
     *
     * 查询Web框架的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkStatisticsRequest 请求对象
     * @return AsyncInvoker<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse>
     */
    public AsyncInvoker<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse> listWebFrameworkStatisticsAsyncInvoker(
        ListWebFrameworkStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebFrameworkStatistics, hcClient);
    }

    /**
     * 查询指定Web站点的服务器列表
     *
     * 查询指定Web站点的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteHostInfoRequest 请求对象
     * @return CompletableFuture<ListWebSiteHostInfoResponse>
     */
    public CompletableFuture<ListWebSiteHostInfoResponse> listWebSiteHostInfoAsync(ListWebSiteHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebSiteHostInfo);
    }

    /**
     * 查询指定Web站点的服务器列表
     *
     * 查询指定Web站点的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteHostInfoRequest 请求对象
     * @return AsyncInvoker<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse>
     */
    public AsyncInvoker<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse> listWebSiteHostInfoAsyncInvoker(
        ListWebSiteHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebSiteHostInfo, hcClient);
    }

    /**
     * 查询指定主机的Web站点信息
     *
     * 查询指定主机的Web站点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteInfoRequest 请求对象
     * @return CompletableFuture<ListWebSiteInfoResponse>
     */
    public CompletableFuture<ListWebSiteInfoResponse> listWebSiteInfoAsync(ListWebSiteInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebSiteInfo);
    }

    /**
     * 查询指定主机的Web站点信息
     *
     * 查询指定主机的Web站点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteInfoRequest 请求对象
     * @return AsyncInvoker<ListWebSiteInfoRequest, ListWebSiteInfoResponse>
     */
    public AsyncInvoker<ListWebSiteInfoRequest, ListWebSiteInfoResponse> listWebSiteInfoAsyncInvoker(
        ListWebSiteInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebSiteInfo, hcClient);
    }

    /**
     * 查询Web站点的统计信息
     *
     * 查询Web站点的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteStatisticsRequest 请求对象
     * @return CompletableFuture<ListWebSiteStatisticsResponse>
     */
    public CompletableFuture<ListWebSiteStatisticsResponse> listWebSiteStatisticsAsync(
        ListWebSiteStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebSiteStatistics);
    }

    /**
     * 查询Web站点的统计信息
     *
     * 查询Web站点的服务器数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteStatisticsRequest 请求对象
     * @return AsyncInvoker<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse>
     */
    public AsyncInvoker<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse> listWebSiteStatisticsAsyncInvoker(
        ListWebSiteStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebSiteStatistics, hcClient);
    }

    /**
     * 查询集群下某一命名空间下的工作负载
     *
     * 查询集群下某一命名空间下的工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkLoadsRequest 请求对象
     * @return CompletableFuture<ListWorkLoadsResponse>
     */
    public CompletableFuture<ListWorkLoadsResponse> listWorkLoadsAsync(ListWorkLoadsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWorkLoads);
    }

    /**
     * 查询集群下某一命名空间下的工作负载
     *
     * 查询集群下某一命名空间下的工作负载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkLoadsRequest 请求对象
     * @return AsyncInvoker<ListWorkLoadsRequest, ListWorkLoadsResponse>
     */
    public AsyncInvoker<ListWorkLoadsRequest, ListWorkLoadsResponse> listWorkLoadsAsyncInvoker(
        ListWorkLoadsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWorkLoads, hcClient);
    }

    /**
     * 编辑动态端口蜜罐策略
     *
     * 编辑动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDecoyPortPolicyRequest 请求对象
     * @return CompletableFuture<ModifyDecoyPortPolicyResponse>
     */
    public CompletableFuture<ModifyDecoyPortPolicyResponse> modifyDecoyPortPolicyAsync(
        ModifyDecoyPortPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyDecoyPortPolicy);
    }

    /**
     * 编辑动态端口蜜罐策略
     *
     * 编辑动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDecoyPortPolicyRequest 请求对象
     * @return AsyncInvoker<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse>
     */
    public AsyncInvoker<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse> modifyDecoyPortPolicyAsyncInvoker(
        ModifyDecoyPortPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyDecoyPortPolicy, hcClient);
    }

    /**
     * 添加、编辑或删除常用登录IP地址
     *
     * 添加、编辑或删除常用登录IP地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonIpRequest 请求对象
     * @return CompletableFuture<ModifyLoginCommonIpResponse>
     */
    public CompletableFuture<ModifyLoginCommonIpResponse> modifyLoginCommonIpAsync(ModifyLoginCommonIpRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyLoginCommonIp);
    }

    /**
     * 添加、编辑或删除常用登录IP地址
     *
     * 添加、编辑或删除常用登录IP地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonIpRequest 请求对象
     * @return AsyncInvoker<ModifyLoginCommonIpRequest, ModifyLoginCommonIpResponse>
     */
    public AsyncInvoker<ModifyLoginCommonIpRequest, ModifyLoginCommonIpResponse> modifyLoginCommonIpAsyncInvoker(
        ModifyLoginCommonIpRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyLoginCommonIp, hcClient);
    }

    /**
     * 添加、编辑或删除常用登录地
     *
     * 添加、编辑或删除常用登录地
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonLocationRequest 请求对象
     * @return CompletableFuture<ModifyLoginCommonLocationResponse>
     */
    public CompletableFuture<ModifyLoginCommonLocationResponse> modifyLoginCommonLocationAsync(
        ModifyLoginCommonLocationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyLoginCommonLocation);
    }

    /**
     * 添加、编辑或删除常用登录地
     *
     * 添加、编辑或删除常用登录地
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonLocationRequest 请求对象
     * @return AsyncInvoker<ModifyLoginCommonLocationRequest, ModifyLoginCommonLocationResponse>
     */
    public AsyncInvoker<ModifyLoginCommonLocationRequest, ModifyLoginCommonLocationResponse> modifyLoginCommonLocationAsyncInvoker(
        ModifyLoginCommonLocationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyLoginCommonLocation, hcClient);
    }

    /**
     * 删除告警白名单
     *
     * 删除告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAlarmWhiteListRequest 请求对象
     * @return CompletableFuture<RemoveAlarmWhiteListResponse>
     */
    public CompletableFuture<RemoveAlarmWhiteListResponse> removeAlarmWhiteListAsync(
        RemoveAlarmWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.removeAlarmWhiteList);
    }

    /**
     * 删除告警白名单
     *
     * 删除告警白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAlarmWhiteListRequest 请求对象
     * @return AsyncInvoker<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse>
     */
    public AsyncInvoker<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse> removeAlarmWhiteListAsyncInvoker(
        RemoveAlarmWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.removeAlarmWhiteList, hcClient);
    }

    /**
     * 删除登录白名单
     *
     * 删除登录白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveLoginWhiteListRequest 请求对象
     * @return CompletableFuture<RemoveLoginWhiteListResponse>
     */
    public CompletableFuture<RemoveLoginWhiteListResponse> removeLoginWhiteListAsync(
        RemoveLoginWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.removeLoginWhiteList);
    }

    /**
     * 删除登录白名单
     *
     * 删除登录白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveLoginWhiteListRequest 请求对象
     * @return AsyncInvoker<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse>
     */
    public AsyncInvoker<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse> removeLoginWhiteListAsyncInvoker(
        RemoveLoginWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.removeLoginWhiteList, hcClient);
    }

    /**
     * 删除系统用户白名单
     *
     * 删除系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSystemUserWhiteListRequest 请求对象
     * @return CompletableFuture<RemoveSystemUserWhiteListResponse>
     */
    public CompletableFuture<RemoveSystemUserWhiteListResponse> removeSystemUserWhiteListAsync(
        RemoveSystemUserWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.removeSystemUserWhiteList);
    }

    /**
     * 删除系统用户白名单
     *
     * 删除系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSystemUserWhiteListRequest 请求对象
     * @return AsyncInvoker<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse>
     */
    public AsyncInvoker<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse> removeSystemUserWhiteListAsyncInvoker(
        RemoveSystemUserWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.removeSystemUserWhiteList, hcClient);
    }

    /**
     * 采集单主机资产指纹
     *
     * 采集单主机资产指纹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunHostAssetManualCollectRequest 请求对象
     * @return CompletableFuture<RunHostAssetManualCollectResponse>
     */
    public CompletableFuture<RunHostAssetManualCollectResponse> runHostAssetManualCollectAsync(
        RunHostAssetManualCollectRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.runHostAssetManualCollect);
    }

    /**
     * 采集单主机资产指纹
     *
     * 采集单主机资产指纹
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunHostAssetManualCollectRequest 请求对象
     * @return AsyncInvoker<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse>
     */
    public AsyncInvoker<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse> runHostAssetManualCollectAsyncInvoker(
        RunHostAssetManualCollectRequest request) {
        return new AsyncInvoker<>(request, HssMeta.runHostAssetManualCollect, hcClient);
    }

    /**
     * 设置提示信息配置
     *
     * 设置提示信息配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMalwareRemindersRequest 请求对象
     * @return CompletableFuture<SetMalwareRemindersResponse>
     */
    public CompletableFuture<SetMalwareRemindersResponse> setMalwareRemindersAsync(SetMalwareRemindersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setMalwareReminders);
    }

    /**
     * 设置提示信息配置
     *
     * 设置提示信息配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMalwareRemindersRequest 请求对象
     * @return AsyncInvoker<SetMalwareRemindersRequest, SetMalwareRemindersResponse>
     */
    public AsyncInvoker<SetMalwareRemindersRequest, SetMalwareRemindersResponse> setMalwareRemindersAsyncInvoker(
        SetMalwareRemindersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setMalwareReminders, hcClient);
    }

    /**
     * 设置双因子登录配置
     *
     * 设置双因子登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetTwoFactorLoginConfigRequest 请求对象
     * @return CompletableFuture<SetTwoFactorLoginConfigResponse>
     */
    public CompletableFuture<SetTwoFactorLoginConfigResponse> setTwoFactorLoginConfigAsync(
        SetTwoFactorLoginConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setTwoFactorLoginConfig);
    }

    /**
     * 设置双因子登录配置
     *
     * 设置双因子登录配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetTwoFactorLoginConfigRequest 请求对象
     * @return AsyncInvoker<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse>
     */
    public AsyncInvoker<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse> setTwoFactorLoginConfigAsyncInvoker(
        SetTwoFactorLoginConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setTwoFactorLoginConfig, hcClient);
    }

    /**
     * 资产管理-概览-账户Top
     *
     * 资产管理-概览-账户Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountTopRequest 请求对象
     * @return CompletableFuture<ShowAccountTopResponse>
     */
    public CompletableFuture<ShowAccountTopResponse> showAccountTopAsync(ShowAccountTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAccountTop);
    }

    /**
     * 资产管理-概览-账户Top
     *
     * 资产管理-概览-账户Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountTopRequest 请求对象
     * @return AsyncInvoker<ShowAccountTopRequest, ShowAccountTopResponse>
     */
    public AsyncInvoker<ShowAccountTopRequest, ShowAccountTopResponse> showAccountTopAsyncInvoker(
        ShowAccountTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAccountTop, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-主机Agent状态
     *
     * 资产管理-概览-资产状态-主机Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsStatusRequest 请求对象
     * @return CompletableFuture<ShowAgentStatisticsStatusResponse>
     */
    public CompletableFuture<ShowAgentStatisticsStatusResponse> showAgentStatisticsStatusAsync(
        ShowAgentStatisticsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAgentStatisticsStatus);
    }

    /**
     * 资产管理-概览-资产状态-主机Agent状态
     *
     * 资产管理-概览-资产状态-主机Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsStatusRequest 请求对象
     * @return AsyncInvoker<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse>
     */
    public AsyncInvoker<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse> showAgentStatisticsStatusAsyncInvoker(
        ShowAgentStatisticsStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAgentStatisticsStatus, hcClient);
    }

    /**
     * 查询应用防护开启状态
     *
     * 查询应用防护开启状态：查询单台服务器的应用防护功能开启状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRaspSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowAppRaspSwitchStatusResponse>
     */
    public CompletableFuture<ShowAppRaspSwitchStatusResponse> showAppRaspSwitchStatusAsync(
        ShowAppRaspSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAppRaspSwitchStatus);
    }

    /**
     * 查询应用防护开启状态
     *
     * 查询应用防护开启状态：查询单台服务器的应用防护功能开启状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRaspSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse>
     */
    public AsyncInvoker<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse> showAppRaspSwitchStatusAsyncInvoker(
        ShowAppRaspSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAppRaspSwitchStatus, hcClient);
    }

    /**
     * 统计资产信息数量
     *
     * 资产统计信息，账号、端口、进程等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetStatisticRequest 请求对象
     * @return CompletableFuture<ShowAssetStatisticResponse>
     */
    public CompletableFuture<ShowAssetStatisticResponse> showAssetStatisticAsync(ShowAssetStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAssetStatistic);
    }

    /**
     * 统计资产信息数量
     *
     * 资产统计信息，账号、端口、进程等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetStatisticRequest 请求对象
     * @return AsyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>
     */
    public AsyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatisticAsyncInvoker(
        ShowAssetStatisticRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAssetStatistic, hcClient);
    }

    /**
     * 资产管理-概览-自启动项Top
     *
     * 资产管理-概览-自启动项Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchTopRequest 请求对象
     * @return CompletableFuture<ShowAutoLaunchTopResponse>
     */
    public CompletableFuture<ShowAutoLaunchTopResponse> showAutoLaunchTopAsync(ShowAutoLaunchTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAutoLaunchTop);
    }

    /**
     * 资产管理-概览-自启动项Top
     *
     * 资产管理-概览-自启动项Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchTopRequest 请求对象
     * @return AsyncInvoker<ShowAutoLaunchTopRequest, ShowAutoLaunchTopResponse>
     */
    public AsyncInvoker<ShowAutoLaunchTopRequest, ShowAutoLaunchTopResponse> showAutoLaunchTopAsyncInvoker(
        ShowAutoLaunchTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAutoLaunchTop, hcClient);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息，确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyInfoRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyInfoResponse>
     */
    public CompletableFuture<ShowBackupPolicyInfoResponse> showBackupPolicyInfoAsync(
        ShowBackupPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showBackupPolicyInfo);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息，确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>
     */
    public AsyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfoAsyncInvoker(
        ShowBackupPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showBackupPolicyInfo, hcClient);
    }

    /**
     * 查询基线扫描手动检测结果
     *
     * 查询基线扫描手动检测结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineScanStatusRequest 请求对象
     * @return CompletableFuture<ShowBaselineScanStatusResponse>
     */
    public CompletableFuture<ShowBaselineScanStatusResponse> showBaselineScanStatusAsync(
        ShowBaselineScanStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showBaselineScanStatus);
    }

    /**
     * 查询基线扫描手动检测结果
     *
     * 查询基线扫描手动检测结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineScanStatusRequest 请求对象
     * @return AsyncInvoker<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse>
     */
    public AsyncInvoker<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse> showBaselineScanStatusAsyncInvoker(
        ShowBaselineScanStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showBaselineScanStatus, hcClient);
    }

    /**
     * 查询基线白名单
     *
     * 查询基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineWhiteListRequest 请求对象
     * @return CompletableFuture<ShowBaselineWhiteListResponse>
     */
    public CompletableFuture<ShowBaselineWhiteListResponse> showBaselineWhiteListAsync(
        ShowBaselineWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showBaselineWhiteList);
    }

    /**
     * 查询基线白名单
     *
     * 查询基线白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineWhiteListRequest 请求对象
     * @return AsyncInvoker<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse>
     */
    public AsyncInvoker<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse> showBaselineWhiteListAsyncInvoker(
        ShowBaselineWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showBaselineWhiteList, hcClient);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleDetailRequest 请求对象
     * @return CompletableFuture<ShowCheckRuleDetailResponse>
     */
    public CompletableFuture<ShowCheckRuleDetailResponse> showCheckRuleDetailAsync(ShowCheckRuleDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showCheckRuleDetail);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleDetailRequest 请求对象
     * @return AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public AsyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailAsyncInvoker(
        ShowCheckRuleDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showCheckRuleDetail, hcClient);
    }

    /**
     * 查询集群资产统计数量
     *
     * 查询集群资产统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAssetStatisticsRequest 请求对象
     * @return CompletableFuture<ShowClusterAssetStatisticsResponse>
     */
    public CompletableFuture<ShowClusterAssetStatisticsResponse> showClusterAssetStatisticsAsync(
        ShowClusterAssetStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showClusterAssetStatistics);
    }

    /**
     * 查询集群资产统计数量
     *
     * 查询集群资产统计数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAssetStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse>
     */
    public AsyncInvoker<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse> showClusterAssetStatisticsAsyncInvoker(
        ShowClusterAssetStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showClusterAssetStatistics, hcClient);
    }

    /**
     * 查询集群组件防护策略模板
     *
     * 查询集群防护策略模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterProtectPolicyTemplateRequest 请求对象
     * @return CompletableFuture<ShowClusterProtectPolicyTemplateResponse>
     */
    public CompletableFuture<ShowClusterProtectPolicyTemplateResponse> showClusterProtectPolicyTemplateAsync(
        ShowClusterProtectPolicyTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showClusterProtectPolicyTemplate);
    }

    /**
     * 查询集群组件防护策略模板
     *
     * 查询集群防护策略模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterProtectPolicyTemplateRequest 请求对象
     * @return AsyncInvoker<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse>
     */
    public AsyncInvoker<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse> showClusterProtectPolicyTemplateAsyncInvoker(
        ShowClusterProtectPolicyTemplateRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showClusterProtectPolicyTemplate, hcClient);
    }

    /**
     * 查询某一端口的描述信息
     *
     * 呈现某一端口详细信息，如本地端口：80，类型：TCP，危险程度：正常，端口描述：常用于SSH(SecureShell)-远程登录协议，用于安全登录文件传输（SCP，SFTP）及端口重新定向。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommonPortRequest 请求对象
     * @return CompletableFuture<ShowCommonPortResponse>
     */
    public CompletableFuture<ShowCommonPortResponse> showCommonPortAsync(ShowCommonPortRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showCommonPort);
    }

    /**
     * 查询某一端口的描述信息
     *
     * 呈现某一端口详细信息，如本地端口：80，类型：TCP，危险程度：正常，端口描述：常用于SSH(SecureShell)-远程登录协议，用于安全登录文件传输（SCP，SFTP）及端口重新定向。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommonPortRequest 请求对象
     * @return AsyncInvoker<ShowCommonPortRequest, ShowCommonPortResponse>
     */
    public AsyncInvoker<ShowCommonPortRequest, ShowCommonPortResponse> showCommonPortAsyncInvoker(
        ShowCommonPortRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showCommonPort, hcClient);
    }

    /**
     * 查询容器集群网络的网络信息
     *
     * 查询容器集群网络的网络信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNetworkInfoRequest 请求对象
     * @return CompletableFuture<ShowContainerNetworkInfoResponse>
     */
    public CompletableFuture<ShowContainerNetworkInfoResponse> showContainerNetworkInfoAsync(
        ShowContainerNetworkInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showContainerNetworkInfo);
    }

    /**
     * 查询容器集群网络的网络信息
     *
     * 查询容器集群网络的网络信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNetworkInfoRequest 请求对象
     * @return AsyncInvoker<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse>
     */
    public AsyncInvoker<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse> showContainerNetworkInfoAsyncInvoker(
        ShowContainerNetworkInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showContainerNetworkInfo, hcClient);
    }

    /**
     * 查询容器节点防护总览数据
     *
     * 查询容器节点防护总览数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNodeStatisticsRequest 请求对象
     * @return CompletableFuture<ShowContainerNodeStatisticsResponse>
     */
    public CompletableFuture<ShowContainerNodeStatisticsResponse> showContainerNodeStatisticsAsync(
        ShowContainerNodeStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showContainerNodeStatistics);
    }

    /**
     * 查询容器节点防护总览数据
     *
     * 查询容器节点防护总览数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNodeStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse>
     */
    public AsyncInvoker<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse> showContainerNodeStatisticsAsyncInvoker(
        ShowContainerNodeStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showContainerNodeStatistics, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-容器节点防护状态
     *
     * 资产管理-概览-资产状态-容器节点防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerProtectionStatusRequest 请求对象
     * @return CompletableFuture<ShowContainerProtectionStatusResponse>
     */
    public CompletableFuture<ShowContainerProtectionStatusResponse> showContainerProtectionStatusAsync(
        ShowContainerProtectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showContainerProtectionStatus);
    }

    /**
     * 资产管理-概览-资产状态-容器节点防护状态
     *
     * 资产管理-概览-资产状态-容器节点防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerProtectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse>
     */
    public AsyncInvoker<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse> showContainerProtectionStatusAsyncInvoker(
        ShowContainerProtectionStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showContainerProtectionStatus, hcClient);
    }

    /**
     * 查看默认为新增主机开启防护开关
     *
     * 查看默认为新增主机开启防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortAutoBindRequest 请求对象
     * @return CompletableFuture<ShowDecoyPortAutoBindResponse>
     */
    public CompletableFuture<ShowDecoyPortAutoBindResponse> showDecoyPortAutoBindAsync(
        ShowDecoyPortAutoBindRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showDecoyPortAutoBind);
    }

    /**
     * 查看默认为新增主机开启防护开关
     *
     * 查看默认为新增主机开启防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortAutoBindRequest 请求对象
     * @return AsyncInvoker<ShowDecoyPortAutoBindRequest, ShowDecoyPortAutoBindResponse>
     */
    public AsyncInvoker<ShowDecoyPortAutoBindRequest, ShowDecoyPortAutoBindResponse> showDecoyPortAutoBindAsyncInvoker(
        ShowDecoyPortAutoBindRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showDecoyPortAutoBind, hcClient);
    }

    /**
     * 查看开启防护主机列表
     *
     * 查看开启防护主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortHostListRequest 请求对象
     * @return CompletableFuture<ShowDecoyPortHostListResponse>
     */
    public CompletableFuture<ShowDecoyPortHostListResponse> showDecoyPortHostListAsync(
        ShowDecoyPortHostListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showDecoyPortHostList);
    }

    /**
     * 查看开启防护主机列表
     *
     * 查看开启防护主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortHostListRequest 请求对象
     * @return AsyncInvoker<ShowDecoyPortHostListRequest, ShowDecoyPortHostListResponse>
     */
    public AsyncInvoker<ShowDecoyPortHostListRequest, ShowDecoyPortHostListResponse> showDecoyPortHostListAsyncInvoker(
        ShowDecoyPortHostListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showDecoyPortHostList, hcClient);
    }

    /**
     * 查看动态端口蜜罐策略详情
     *
     * 查看动态端口蜜罐策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortPolicyDetailsRequest 请求对象
     * @return CompletableFuture<ShowDecoyPortPolicyDetailsResponse>
     */
    public CompletableFuture<ShowDecoyPortPolicyDetailsResponse> showDecoyPortPolicyDetailsAsync(
        ShowDecoyPortPolicyDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showDecoyPortPolicyDetails);
    }

    /**
     * 查看动态端口蜜罐策略详情
     *
     * 查看动态端口蜜罐策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortPolicyDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse>
     */
    public AsyncInvoker<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse> showDecoyPortPolicyDetailsAsyncInvoker(
        ShowDecoyPortPolicyDetailsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showDecoyPortPolicyDetails, hcClient);
    }

    /**
     * 查询攻击标识分布统计列表
     *
     * 查询攻击标识分布统计列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventAttackTagRequest 请求对象
     * @return CompletableFuture<ShowEventAttackTagResponse>
     */
    public CompletableFuture<ShowEventAttackTagResponse> showEventAttackTagAsync(ShowEventAttackTagRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showEventAttackTag);
    }

    /**
     * 查询攻击标识分布统计列表
     *
     * 查询攻击标识分布统计列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventAttackTagRequest 请求对象
     * @return AsyncInvoker<ShowEventAttackTagRequest, ShowEventAttackTagResponse>
     */
    public AsyncInvoker<ShowEventAttackTagRequest, ShowEventAttackTagResponse> showEventAttackTagAsyncInvoker(
        ShowEventAttackTagRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showEventAttackTag, hcClient);
    }

    /**
     * 查询单主机资产指纹采集状态
     *
     * 查询单主机资产指纹采集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostAssetManualCollectStatusRequest 请求对象
     * @return CompletableFuture<ShowHostAssetManualCollectStatusResponse>
     */
    public CompletableFuture<ShowHostAssetManualCollectStatusResponse> showHostAssetManualCollectStatusAsync(
        ShowHostAssetManualCollectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showHostAssetManualCollectStatus);
    }

    /**
     * 查询单主机资产指纹采集状态
     *
     * 查询单主机资产指纹采集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostAssetManualCollectStatusRequest 请求对象
     * @return AsyncInvoker<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse>
     */
    public AsyncInvoker<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse> showHostAssetManualCollectStatusAsyncInvoker(
        ShowHostAssetManualCollectStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showHostAssetManualCollectStatus, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-Agent状态
     *
     * 资产管理-概览-资产状态-Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostProtectionStatusRequest 请求对象
     * @return CompletableFuture<ShowHostProtectionStatusResponse>
     */
    public CompletableFuture<ShowHostProtectionStatusResponse> showHostProtectionStatusAsync(
        ShowHostProtectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showHostProtectionStatus);
    }

    /**
     * 资产管理-概览-资产状态-Agent状态
     *
     * 资产管理-概览-资产状态-Agent状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostProtectionStatusRequest 请求对象
     * @return AsyncInvoker<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse>
     */
    public AsyncInvoker<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse> showHostProtectionStatusAsyncInvoker(
        ShowHostProtectionStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showHostProtectionStatus, hcClient);
    }

    /**
     * 查询镜像文件统计信息
     *
     * 查询镜像文件统计信息，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageFilesStatRequest 请求对象
     * @return CompletableFuture<ShowImageFilesStatResponse>
     */
    public CompletableFuture<ShowImageFilesStatResponse> showImageFilesStatAsync(ShowImageFilesStatRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showImageFilesStat);
    }

    /**
     * 查询镜像文件统计信息
     *
     * 查询镜像文件统计信息，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageFilesStatRequest 请求对象
     * @return AsyncInvoker<ShowImageFilesStatRequest, ShowImageFilesStatResponse>
     */
    public AsyncInvoker<ShowImageFilesStatRequest, ShowImageFilesStatResponse> showImageFilesStatAsyncInvoker(
        ShowImageFilesStatRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showImageFilesStat, hcClient);
    }

    /**
     * 资产管理-概览-jar包Top
     *
     * 资产管理-概览-jar包Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJarPackageTopRequest 请求对象
     * @return CompletableFuture<ShowJarPackageTopResponse>
     */
    public CompletableFuture<ShowJarPackageTopResponse> showJarPackageTopAsync(ShowJarPackageTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showJarPackageTop);
    }

    /**
     * 资产管理-概览-jar包Top
     *
     * 资产管理-概览-jar包Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJarPackageTopRequest 请求对象
     * @return AsyncInvoker<ShowJarPackageTopRequest, ShowJarPackageTopResponse>
     */
    public AsyncInvoker<ShowJarPackageTopRequest, ShowJarPackageTopResponse> showJarPackageTopAsyncInvoker(
        ShowJarPackageTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showJarPackageTop, hcClient);
    }

    /**
     * 查询容器详细信息
     *
     * 查询容器详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sContainerDetailRequest 请求对象
     * @return CompletableFuture<ShowK8sContainerDetailResponse>
     */
    public CompletableFuture<ShowK8sContainerDetailResponse> showK8sContainerDetailAsync(
        ShowK8sContainerDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showK8sContainerDetail);
    }

    /**
     * 查询容器详细信息
     *
     * 查询容器详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sContainerDetailRequest 请求对象
     * @return AsyncInvoker<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse>
     */
    public AsyncInvoker<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse> showK8sContainerDetailAsyncInvoker(
        ShowK8sContainerDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showK8sContainerDetail, hcClient);
    }

    /**
     * 查询pod详细信息
     *
     * 查询pod详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sPodDetailRequest 请求对象
     * @return CompletableFuture<ShowK8sPodDetailResponse>
     */
    public CompletableFuture<ShowK8sPodDetailResponse> showK8sPodDetailAsync(ShowK8sPodDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showK8sPodDetail);
    }

    /**
     * 查询pod详细信息
     *
     * 查询pod详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sPodDetailRequest 请求对象
     * @return AsyncInvoker<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse>
     */
    public AsyncInvoker<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse> showK8sPodDetailAsyncInvoker(
        ShowK8sPodDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showK8sPodDetail, hcClient);
    }

    /**
     * 资产管理-概览-内核模块Top
     *
     * 资产管理-概览-内核模块Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKernelModuleTopRequest 请求对象
     * @return CompletableFuture<ShowKernelModuleTopResponse>
     */
    public CompletableFuture<ShowKernelModuleTopResponse> showKernelModuleTopAsync(ShowKernelModuleTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showKernelModuleTop);
    }

    /**
     * 资产管理-概览-内核模块Top
     *
     * 资产管理-概览-内核模块Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKernelModuleTopRequest 请求对象
     * @return AsyncInvoker<ShowKernelModuleTopRequest, ShowKernelModuleTopResponse>
     */
    public AsyncInvoker<ShowKernelModuleTopRequest, ShowKernelModuleTopResponse> showKernelModuleTopAsyncInvoker(
        ShowKernelModuleTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showKernelModuleTop, hcClient);
    }

    /**
     * 查询容器Kubernetes端点详情
     *
     * 查询容器Kubernetes端点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesEndpointInfoRequest 请求对象
     * @return CompletableFuture<ShowKubernetesEndpointInfoResponse>
     */
    public CompletableFuture<ShowKubernetesEndpointInfoResponse> showKubernetesEndpointInfoAsync(
        ShowKubernetesEndpointInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showKubernetesEndpointInfo);
    }

    /**
     * 查询容器Kubernetes端点详情
     *
     * 查询容器Kubernetes端点详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesEndpointInfoRequest 请求对象
     * @return AsyncInvoker<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse>
     */
    public AsyncInvoker<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse> showKubernetesEndpointInfoAsyncInvoker(
        ShowKubernetesEndpointInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showKubernetesEndpointInfo, hcClient);
    }

    /**
     * 查询容器Kubernetes服务详情
     *
     * 查询容器Kubernetes服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesServiceInfoRequest 请求对象
     * @return CompletableFuture<ShowKubernetesServiceInfoResponse>
     */
    public CompletableFuture<ShowKubernetesServiceInfoResponse> showKubernetesServiceInfoAsync(
        ShowKubernetesServiceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showKubernetesServiceInfo);
    }

    /**
     * 查询容器Kubernetes服务详情
     *
     * 查询容器Kubernetes服务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesServiceInfoRequest 请求对象
     * @return AsyncInvoker<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse>
     */
    public AsyncInvoker<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse> showKubernetesServiceInfoAsyncInvoker(
        ShowKubernetesServiceInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showKubernetesServiceInfo, hcClient);
    }

    /**
     * 查询导出任务信息-按查询条件
     *
     * 查询导出任务信息-按查询条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestExportTaskByTypeRequest 请求对象
     * @return CompletableFuture<ShowLatestExportTaskByTypeResponse>
     */
    public CompletableFuture<ShowLatestExportTaskByTypeResponse> showLatestExportTaskByTypeAsync(
        ShowLatestExportTaskByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showLatestExportTaskByType);
    }

    /**
     * 查询导出任务信息-按查询条件
     *
     * 查询导出任务信息-按查询条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestExportTaskByTypeRequest 请求对象
     * @return AsyncInvoker<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse>
     */
    public AsyncInvoker<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse> showLatestExportTaskByTypeAsyncInvoker(
        ShowLatestExportTaskByTypeRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showLatestExportTaskByType, hcClient);
    }

    /**
     * 获取提示信息配置
     *
     * 获取提示信息配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMalwareRemindersRequest 请求对象
     * @return CompletableFuture<ShowMalwareRemindersResponse>
     */
    public CompletableFuture<ShowMalwareRemindersResponse> showMalwareRemindersAsync(
        ShowMalwareRemindersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMalwareReminders);
    }

    /**
     * 获取提示信息配置
     *
     * 获取提示信息配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMalwareRemindersRequest 请求对象
     * @return AsyncInvoker<ShowMalwareRemindersRequest, ShowMalwareRemindersResponse>
     */
    public AsyncInvoker<ShowMalwareRemindersRequest, ShowMalwareRemindersResponse> showMalwareRemindersAsyncInvoker(
        ShowMalwareRemindersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMalwareReminders, hcClient);
    }

    /**
     * 集群网络策略总览
     *
     * 集群网络策略总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkStatisticsRequest 请求对象
     * @return CompletableFuture<ShowNetworkStatisticsResponse>
     */
    public CompletableFuture<ShowNetworkStatisticsResponse> showNetworkStatisticsAsync(
        ShowNetworkStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showNetworkStatistics);
    }

    /**
     * 集群网络策略总览
     *
     * 集群网络策略总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse>
     */
    public AsyncInvoker<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse> showNetworkStatisticsAsyncInvoker(
        ShowNetworkStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showNetworkStatistics, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-操作系统统计信息
     *
     * 资产管理-概览-资产状态-操作系统统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsStatisticsInfoRequest 请求对象
     * @return CompletableFuture<ShowOsStatisticsInfoResponse>
     */
    public CompletableFuture<ShowOsStatisticsInfoResponse> showOsStatisticsInfoAsync(
        ShowOsStatisticsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showOsStatisticsInfo);
    }

    /**
     * 资产管理-概览-资产状态-操作系统统计信息
     *
     * 资产管理-概览-资产状态-操作系统统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsStatisticsInfoRequest 请求对象
     * @return AsyncInvoker<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse>
     */
    public AsyncInvoker<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse> showOsStatisticsInfoAsyncInvoker(
        ShowOsStatisticsInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showOsStatisticsInfo, hcClient);
    }

    /**
     * 获取页面通知信息
     *
     * 获取页面通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageNoticesRequest 请求对象
     * @return CompletableFuture<ShowPageNoticesResponse>
     */
    public CompletableFuture<ShowPageNoticesResponse> showPageNoticesAsync(ShowPageNoticesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showPageNotices);
    }

    /**
     * 获取页面通知信息
     *
     * 获取页面通知信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageNoticesRequest 请求对象
     * @return AsyncInvoker<ShowPageNoticesRequest, ShowPageNoticesResponse>
     */
    public AsyncInvoker<ShowPageNoticesRequest, ShowPageNoticesResponse> showPageNoticesAsyncInvoker(
        ShowPageNoticesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showPageNotices, hcClient);
    }

    /**
     * 查询指定策略的总开关
     *
     * 查询指定策略的总开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicySwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowPolicySwitchStatusResponse>
     */
    public CompletableFuture<ShowPolicySwitchStatusResponse> showPolicySwitchStatusAsync(
        ShowPolicySwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showPolicySwitchStatus);
    }

    /**
     * 查询指定策略的总开关
     *
     * 查询指定策略的总开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicySwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowPolicySwitchStatusRequest, ShowPolicySwitchStatusResponse>
     */
    public AsyncInvoker<ShowPolicySwitchStatusRequest, ShowPolicySwitchStatusResponse> showPolicySwitchStatusAsyncInvoker(
        ShowPolicySwitchStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showPolicySwitchStatus, hcClient);
    }

    /**
     * 资产管理-概览-进程Top
     *
     * 资产管理-概览-进程Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPorcessTopRequest 请求对象
     * @return CompletableFuture<ShowPorcessTopResponse>
     */
    public CompletableFuture<ShowPorcessTopResponse> showPorcessTopAsync(ShowPorcessTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showPorcessTop);
    }

    /**
     * 资产管理-概览-进程Top
     *
     * 资产管理-概览-进程Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPorcessTopRequest 请求对象
     * @return AsyncInvoker<ShowPorcessTopRequest, ShowPorcessTopResponse>
     */
    public AsyncInvoker<ShowPorcessTopRequest, ShowPorcessTopResponse> showPorcessTopAsyncInvoker(
        ShowPorcessTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showPorcessTop, hcClient);
    }

    /**
     * 资产管理-概览-端口Top
     *
     * 资产管理-概览-端口Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTopRequest 请求对象
     * @return CompletableFuture<ShowPortTopResponse>
     */
    public CompletableFuture<ShowPortTopResponse> showPortTopAsync(ShowPortTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showPortTop);
    }

    /**
     * 资产管理-概览-端口Top
     *
     * 资产管理-概览-端口Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTopRequest 请求对象
     * @return AsyncInvoker<ShowPortTopRequest, ShowPortTopResponse>
     */
    public AsyncInvoker<ShowPortTopRequest, ShowPortTopResponse> showPortTopAsyncInvoker(ShowPortTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showPortTop, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-防护配额统计信息
     *
     * 资产管理-概览-资产状态-防护配额统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaStatisticsInfoRequest 请求对象
     * @return CompletableFuture<ShowQuotaStatisticsInfoResponse>
     */
    public CompletableFuture<ShowQuotaStatisticsInfoResponse> showQuotaStatisticsInfoAsync(
        ShowQuotaStatisticsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showQuotaStatisticsInfo);
    }

    /**
     * 资产管理-概览-资产状态-防护配额统计信息
     *
     * 资产管理-概览-资产状态-防护配额统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaStatisticsInfoRequest 请求对象
     * @return AsyncInvoker<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse>
     */
    public AsyncInvoker<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse> showQuotaStatisticsInfoAsyncInvoker(
        ShowQuotaStatisticsInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showQuotaStatisticsInfo, hcClient);
    }

    /**
     * 查询防护策略详情
     *
     * 查询防护策略详情：查询防护策略配置的相关检测规则信息，包含14种检测规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspPolicyDetailRequest 请求对象
     * @return CompletableFuture<ShowRaspPolicyDetailResponse>
     */
    public CompletableFuture<ShowRaspPolicyDetailResponse> showRaspPolicyDetailAsync(
        ShowRaspPolicyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRaspPolicyDetail);
    }

    /**
     * 查询防护策略详情
     *
     * 查询防护策略详情：查询防护策略配置的相关检测规则信息，包含14种检测规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspPolicyDetailRequest 请求对象
     * @return AsyncInvoker<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse>
     */
    public AsyncInvoker<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse> showRaspPolicyDetailAsyncInvoker(
        ShowRaspPolicyDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRaspPolicyDetail, hcClient);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计已添加防护服务器的数量以及近七天微服务RASP攻击数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspProtectStatisticsRequest 请求对象
     * @return CompletableFuture<ShowRaspProtectStatisticsResponse>
     */
    public CompletableFuture<ShowRaspProtectStatisticsResponse> showRaspProtectStatisticsAsync(
        ShowRaspProtectStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRaspProtectStatistics);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计已添加防护服务器的数量以及近七天微服务RASP攻击数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspProtectStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse>
     */
    public AsyncInvoker<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse> showRaspProtectStatisticsAsyncInvoker(
        ShowRaspProtectStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRaspProtectStatistics, hcClient);
    }

    /**
     * 查询防护服务器java应用详情
     *
     * 查询防护服务器java应用详情：查询防护服务器的java应用状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspServerDetailRequest 请求对象
     * @return CompletableFuture<ShowRaspServerDetailResponse>
     */
    public CompletableFuture<ShowRaspServerDetailResponse> showRaspServerDetailAsync(
        ShowRaspServerDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRaspServerDetail);
    }

    /**
     * 查询防护服务器java应用详情
     *
     * 查询防护服务器java应用详情：查询防护服务器的java应用状态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspServerDetailRequest 请求对象
     * @return AsyncInvoker<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse>
     */
    public AsyncInvoker<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse> showRaspServerDetailAsyncInvoker(
        ShowRaspServerDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRaspServerDetail, hcClient);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskConfigDetailRequest 请求对象
     * @return CompletableFuture<ShowRiskConfigDetailResponse>
     */
    public CompletableFuture<ShowRiskConfigDetailResponse> showRiskConfigDetailAsync(
        ShowRiskConfigDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRiskConfigDetail);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskConfigDetailRequest 请求对象
     * @return AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public AsyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailAsyncInvoker(
        ShowRiskConfigDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRiskConfigDetail, hcClient);
    }

    /**
     * 查询单个备份策略信息
     *
     * 查询单个备份策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleBackupPolicyInfoRequest 请求对象
     * @return CompletableFuture<ShowSingleBackupPolicyInfoResponse>
     */
    public CompletableFuture<ShowSingleBackupPolicyInfoResponse> showSingleBackupPolicyInfoAsync(
        ShowSingleBackupPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSingleBackupPolicyInfo);
    }

    /**
     * 查询单个备份策略信息
     *
     * 查询单个备份策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleBackupPolicyInfoRequest 请求对象
     * @return AsyncInvoker<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse>
     */
    public AsyncInvoker<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse> showSingleBackupPolicyInfoAsyncInvoker(
        ShowSingleBackupPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSingleBackupPolicyInfo, hcClient);
    }

    /**
     * 资产管理-概览-软件Top
     *
     * 资产管理-概览-软件Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSoftwareTopRequest 请求对象
     * @return CompletableFuture<ShowSoftwareTopResponse>
     */
    public CompletableFuture<ShowSoftwareTopResponse> showSoftwareTopAsync(ShowSoftwareTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSoftwareTop);
    }

    /**
     * 资产管理-概览-软件Top
     *
     * 资产管理-概览-软件Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSoftwareTopRequest 请求对象
     * @return AsyncInvoker<ShowSoftwareTopRequest, ShowSoftwareTopResponse>
     */
    public AsyncInvoker<ShowSoftwareTopRequest, ShowSoftwareTopResponse> showSoftwareTopAsyncInvoker(
        ShowSoftwareTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSoftwareTop, hcClient);
    }

    /**
     * 漏洞管理-主机视图-主机列表-导出报告
     *
     * 在主机视图中导出漏洞报告详细报告pdf格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulReportDataRequest 请求对象
     * @return CompletableFuture<ShowVulReportDataResponse>
     */
    public CompletableFuture<ShowVulReportDataResponse> showVulReportDataAsync(ShowVulReportDataRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVulReportData);
    }

    /**
     * 漏洞管理-主机视图-主机列表-导出报告
     *
     * 在主机视图中导出漏洞报告详细报告pdf格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulReportDataRequest 请求对象
     * @return AsyncInvoker<ShowVulReportDataRequest, ShowVulReportDataResponse>
     */
    public AsyncInvoker<ShowVulReportDataRequest, ShowVulReportDataResponse> showVulReportDataAsyncInvoker(
        ShowVulReportDataRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVulReportData, hcClient);
    }

    /**
     * 资产管理-概览-WebAppAndServiceTop
     *
     * 资产管理-概览-Web应用TOP5/Web服务TOP5
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebAppAndServiceTopRequest 请求对象
     * @return CompletableFuture<ShowWebAppAndServiceTopResponse>
     */
    public CompletableFuture<ShowWebAppAndServiceTopResponse> showWebAppAndServiceTopAsync(
        ShowWebAppAndServiceTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWebAppAndServiceTop);
    }

    /**
     * 资产管理-概览-WebAppAndServiceTop
     *
     * 资产管理-概览-Web应用TOP5/Web服务TOP5
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebAppAndServiceTopRequest 请求对象
     * @return AsyncInvoker<ShowWebAppAndServiceTopRequest, ShowWebAppAndServiceTopResponse>
     */
    public AsyncInvoker<ShowWebAppAndServiceTopRequest, ShowWebAppAndServiceTopResponse> showWebAppAndServiceTopAsyncInvoker(
        ShowWebAppAndServiceTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWebAppAndServiceTop, hcClient);
    }

    /**
     * 资产管理-概览-Web框架Top
     *
     * 资产管理-概览-Web框架Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebFrameworkTopRequest 请求对象
     * @return CompletableFuture<ShowWebFrameworkTopResponse>
     */
    public CompletableFuture<ShowWebFrameworkTopResponse> showWebFrameworkTopAsync(ShowWebFrameworkTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWebFrameworkTop);
    }

    /**
     * 资产管理-概览-Web框架Top
     *
     * 资产管理-概览-Web框架Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebFrameworkTopRequest 请求对象
     * @return AsyncInvoker<ShowWebFrameworkTopRequest, ShowWebFrameworkTopResponse>
     */
    public AsyncInvoker<ShowWebFrameworkTopRequest, ShowWebFrameworkTopResponse> showWebFrameworkTopAsyncInvoker(
        ShowWebFrameworkTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWebFrameworkTop, hcClient);
    }

    /**
     * 资产管理-概览-Web站点Top
     *
     * 资产管理-概览-Web站点Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebSiteTopRequest 请求对象
     * @return CompletableFuture<ShowWebSiteTopResponse>
     */
    public CompletableFuture<ShowWebSiteTopResponse> showWebSiteTopAsync(ShowWebSiteTopRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWebSiteTop);
    }

    /**
     * 资产管理-概览-Web站点Top
     *
     * 资产管理-概览-Web站点Top
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebSiteTopRequest 请求对象
     * @return AsyncInvoker<ShowWebSiteTopRequest, ShowWebSiteTopResponse>
     */
    public AsyncInvoker<ShowWebSiteTopRequest, ShowWebSiteTopResponse> showWebSiteTopAsyncInvoker(
        ShowWebSiteTopRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWebSiteTop, hcClient);
    }

    /**
     * 开启或关闭程序自动隔离查杀
     *
     * 开启或关闭程序自动隔离查杀
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoKillVirusStatusRequest 请求对象
     * @return CompletableFuture<StartAutoKillVirusStatusResponse>
     */
    public CompletableFuture<StartAutoKillVirusStatusResponse> startAutoKillVirusStatusAsync(
        StartAutoKillVirusStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.startAutoKillVirusStatus);
    }

    /**
     * 开启或关闭程序自动隔离查杀
     *
     * 开启或关闭程序自动隔离查杀
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoKillVirusStatusRequest 请求对象
     * @return AsyncInvoker<StartAutoKillVirusStatusRequest, StartAutoKillVirusStatusResponse>
     */
    public AsyncInvoker<StartAutoKillVirusStatusRequest, StartAutoKillVirusStatusResponse> startAutoKillVirusStatusAsyncInvoker(
        StartAutoKillVirusStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.startAutoKillVirusStatus, hcClient);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护，请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionRequest 请求对象
     * @return CompletableFuture<StartProtectionResponse>
     */
    public CompletableFuture<StartProtectionResponse> startProtectionAsync(StartProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.startProtection);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护，请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionRequest 请求对象
     * @return AsyncInvoker<StartProtectionRequest, StartProtectionResponse>
     */
    public AsyncInvoker<StartProtectionRequest, StartProtectionResponse> startProtectionAsyncInvoker(
        StartProtectionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.startProtection, hcClient);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionRequest 请求对象
     * @return CompletableFuture<StopProtectionResponse>
     */
    public CompletableFuture<StopProtectionResponse> stopProtectionAsync(StopProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.stopProtection);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionRequest 请求对象
     * @return AsyncInvoker<StopProtectionRequest, StopProtectionResponse>
     */
    public AsyncInvoker<StopProtectionRequest, StopProtectionResponse> stopProtectionAsyncInvoker(
        StopProtectionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.stopProtection, hcClient);
    }

    /**
     * 操作集群防护模式
     *
     * 操作集群防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterProtectionModeRequest 请求对象
     * @return CompletableFuture<SwitchClusterProtectionModeResponse>
     */
    public CompletableFuture<SwitchClusterProtectionModeResponse> switchClusterProtectionModeAsync(
        SwitchClusterProtectionModeRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchClusterProtectionMode);
    }

    /**
     * 操作集群防护模式
     *
     * 操作集群防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterProtectionModeRequest 请求对象
     * @return AsyncInvoker<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse>
     */
    public AsyncInvoker<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse> switchClusterProtectionModeAsyncInvoker(
        SwitchClusterProtectionModeRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchClusterProtectionMode, hcClient);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchContainerProtectStatusRequest 请求对象
     * @return CompletableFuture<SwitchContainerProtectStatusResponse>
     */
    public CompletableFuture<SwitchContainerProtectStatusResponse> switchContainerProtectStatusAsync(
        SwitchContainerProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchContainerProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchContainerProtectStatusRequest 请求对象
     * @return AsyncInvoker<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse>
     */
    public AsyncInvoker<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse> switchContainerProtectStatusAsyncInvoker(
        SwitchContainerProtectStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchContainerProtectStatus, hcClient);
    }

    /**
     * 修改默认为新增主机开启防护开关
     *
     * 修改默认为新增主机开启防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortAutoBindRequest 请求对象
     * @return CompletableFuture<SwitchDecoyPortAutoBindResponse>
     */
    public CompletableFuture<SwitchDecoyPortAutoBindResponse> switchDecoyPortAutoBindAsync(
        SwitchDecoyPortAutoBindRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchDecoyPortAutoBind);
    }

    /**
     * 修改默认为新增主机开启防护开关
     *
     * 修改默认为新增主机开启防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortAutoBindRequest 请求对象
     * @return AsyncInvoker<SwitchDecoyPortAutoBindRequest, SwitchDecoyPortAutoBindResponse>
     */
    public AsyncInvoker<SwitchDecoyPortAutoBindRequest, SwitchDecoyPortAutoBindResponse> switchDecoyPortAutoBindAsyncInvoker(
        SwitchDecoyPortAutoBindRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchDecoyPortAutoBind, hcClient);
    }

    /**
     * 切换主机动态端口蜜罐策略
     *
     * 切换主机动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortHostPolicyRequest 请求对象
     * @return CompletableFuture<SwitchDecoyPortHostPolicyResponse>
     */
    public CompletableFuture<SwitchDecoyPortHostPolicyResponse> switchDecoyPortHostPolicyAsync(
        SwitchDecoyPortHostPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchDecoyPortHostPolicy);
    }

    /**
     * 切换主机动态端口蜜罐策略
     *
     * 切换主机动态端口蜜罐策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortHostPolicyRequest 请求对象
     * @return AsyncInvoker<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse>
     */
    public AsyncInvoker<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse> switchDecoyPortHostPolicyAsyncInvoker(
        SwitchDecoyPortHostPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchDecoyPortHostPolicy, hcClient);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchHostsProtectStatusRequest 请求对象
     * @return CompletableFuture<SwitchHostsProtectStatusResponse>
     */
    public CompletableFuture<SwitchHostsProtectStatusResponse> switchHostsProtectStatusAsync(
        SwitchHostsProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchHostsProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchHostsProtectStatusRequest 请求对象
     * @return AsyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>
     */
    public AsyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatusAsyncInvoker(
        SwitchHostsProtectStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchHostsProtectStatus, hcClient);
    }

    /**
     * 开启/关闭应用防护，更新防护端口
     *
     * 开启/关闭应用防护，选择开启的防护策略，选择需要防护的服务器，下发防护策略，可传入端口号更新防护端口，关闭防护则清空策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRaspRequest 请求对象
     * @return CompletableFuture<SwitchRaspResponse>
     */
    public CompletableFuture<SwitchRaspResponse> switchRaspAsync(SwitchRaspRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchRasp);
    }

    /**
     * 开启/关闭应用防护，更新防护端口
     *
     * 开启/关闭应用防护，选择开启的防护策略，选择需要防护的服务器，下发防护策略，可传入端口号更新防护端口，关闭防护则清空策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRaspRequest 请求对象
     * @return AsyncInvoker<SwitchRaspRequest, SwitchRaspResponse>
     */
    public AsyncInvoker<SwitchRaspRequest, SwitchRaspResponse> switchRaspAsyncInvoker(SwitchRaspRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchRasp, hcClient);
    }

    /**
     * 同步容器集群最新数据
     *
     * 同步容器集群最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterListRequest 请求对象
     * @return CompletableFuture<SyncClusterListResponse>
     */
    public CompletableFuture<SyncClusterListResponse> syncClusterListAsync(SyncClusterListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncClusterList);
    }

    /**
     * 同步容器集群最新数据
     *
     * 同步容器集群最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterListRequest 请求对象
     * @return AsyncInvoker<SyncClusterListRequest, SyncClusterListResponse>
     */
    public AsyncInvoker<SyncClusterListRequest, SyncClusterListResponse> syncClusterListAsyncInvoker(
        SyncClusterListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncClusterList, hcClient);
    }

    /**
     * 同步集群防护事件
     *
     * 同步集群防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterProtectionEventRequest 请求对象
     * @return CompletableFuture<SyncClusterProtectionEventResponse>
     */
    public CompletableFuture<SyncClusterProtectionEventResponse> syncClusterProtectionEventAsync(
        SyncClusterProtectionEventRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncClusterProtectionEvent);
    }

    /**
     * 同步集群防护事件
     *
     * 同步集群防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterProtectionEventRequest 请求对象
     * @return AsyncInvoker<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse>
     */
    public AsyncInvoker<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse> syncClusterProtectionEventAsyncInvoker(
        SyncClusterProtectionEventRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncClusterProtectionEvent, hcClient);
    }

    /**
     * 同步集群下网络节点最新数据
     *
     * 同步集群下容器网络策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkNodeRequest 请求对象
     * @return CompletableFuture<SyncContainerNetworkNodeResponse>
     */
    public CompletableFuture<SyncContainerNetworkNodeResponse> syncContainerNetworkNodeAsync(
        SyncContainerNetworkNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncContainerNetworkNode);
    }

    /**
     * 同步集群下网络节点最新数据
     *
     * 同步集群下容器网络策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkNodeRequest 请求对象
     * @return AsyncInvoker<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse>
     */
    public AsyncInvoker<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse> syncContainerNetworkNodeAsyncInvoker(
        SyncContainerNetworkNodeRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncContainerNetworkNode, hcClient);
    }

    /**
     * 同步集群下容器网络策略最新数据
     *
     * 同步集群下容器网络策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkPolicyListRequest 请求对象
     * @return CompletableFuture<SyncContainerNetworkPolicyListResponse>
     */
    public CompletableFuture<SyncContainerNetworkPolicyListResponse> syncContainerNetworkPolicyListAsync(
        SyncContainerNetworkPolicyListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncContainerNetworkPolicyList);
    }

    /**
     * 同步集群下容器网络策略最新数据
     *
     * 同步集群下容器网络策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkPolicyListRequest 请求对象
     * @return AsyncInvoker<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse>
     */
    public AsyncInvoker<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse> syncContainerNetworkPolicyListAsyncInvoker(
        SyncContainerNetworkPolicyListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncContainerNetworkPolicyList, hcClient);
    }

    /**
     * 同步集群下安全组策略最新数据
     *
     * 同步集群下安全组策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncSecurityGroupPoliciesRequest 请求对象
     * @return CompletableFuture<SyncSecurityGroupPoliciesResponse>
     */
    public CompletableFuture<SyncSecurityGroupPoliciesResponse> syncSecurityGroupPoliciesAsync(
        SyncSecurityGroupPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncSecurityGroupPolicies);
    }

    /**
     * 同步集群下安全组策略最新数据
     *
     * 同步集群下安全组策略最新数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncSecurityGroupPoliciesRequest 请求对象
     * @return AsyncInvoker<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse>
     */
    public AsyncInvoker<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse> syncSecurityGroupPoliciesAsyncInvoker(
        SyncSecurityGroupPoliciesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncSecurityGroupPolicies, hcClient);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupPolicyInfoRequest 请求对象
     * @return CompletableFuture<UpdateBackupPolicyInfoResponse>
     */
    public CompletableFuture<UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoAsync(
        UpdateBackupPolicyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateBackupPolicyInfo);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupPolicyInfoRequest 请求对象
     * @return AsyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>
     */
    public AsyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoAsyncInvoker(
        UpdateBackupPolicyInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateBackupPolicyInfo, hcClient);
    }

    /**
     * 容器集群网络更新配置策略
     *
     * 容器集群网络更新配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContainerNetworkPolicyRequest 请求对象
     * @return CompletableFuture<UpdateContainerNetworkPolicyResponse>
     */
    public CompletableFuture<UpdateContainerNetworkPolicyResponse> updateContainerNetworkPolicyAsync(
        UpdateContainerNetworkPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateContainerNetworkPolicy);
    }

    /**
     * 容器集群网络更新配置策略
     *
     * 容器集群网络更新配置策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContainerNetworkPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse>
     */
    public AsyncInvoker<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse> updateContainerNetworkPolicyAsyncInvoker(
        UpdateContainerNetworkPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateContainerNetworkPolicy, hcClient);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略：修改防护策略内容，包含策略名称、相关规则开启状态、防护动作以及检测规则配置，同时给使用该策略的服务器下发新的策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updatePolicy);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略：修改防护策略内容，包含策略名称、相关规则开启状态、防护动作以及检测规则配置，同时给使用该策略的服务器下发新的策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updatePolicy, hcClient);
    }

    /**
     * 修改勒索防护策略
     *
     * 修改勒索防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionPolicyRequest 请求对象
     * @return CompletableFuture<UpdateProtectionPolicyResponse>
     */
    public CompletableFuture<UpdateProtectionPolicyResponse> updateProtectionPolicyAsync(
        UpdateProtectionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateProtectionPolicy);
    }

    /**
     * 修改勒索防护策略
     *
     * 修改勒索防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>
     */
    public AsyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicyAsyncInvoker(
        UpdateProtectionPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateProtectionPolicy, hcClient);
    }

    /**
     * 更新安全组策略
     *
     * 更新安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupPolicyRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupPolicyResponse>
     */
    public CompletableFuture<UpdateSecurityGroupPolicyResponse> updateSecurityGroupPolicyAsync(
        UpdateSecurityGroupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateSecurityGroupPolicy);
    }

    /**
     * 更新安全组策略
     *
     * 更新安全组策略(云原生网络模型)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse> updateSecurityGroupPolicyAsyncInvoker(
        UpdateSecurityGroupPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateSecurityGroupPolicy, hcClient);
    }

    /**
     * 修改系统用户白名单
     *
     * 修改系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSystemUserWhiteListRequest 请求对象
     * @return CompletableFuture<UpdateSystemUserWhiteListResponse>
     */
    public CompletableFuture<UpdateSystemUserWhiteListResponse> updateSystemUserWhiteListAsync(
        UpdateSystemUserWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateSystemUserWhiteList);
    }

    /**
     * 修改系统用户白名单
     *
     * 修改系统用户白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSystemUserWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse>
     */
    public AsyncInvoker<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse> updateSystemUserWhiteListAsyncInvoker(
        UpdateSystemUserWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateSystemUserWhiteList, hcClient);
    }

    /**
     * 修改“病毒查杀按次计费”开关状态
     *
     * 修改“病毒查杀按次计费”开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPayPerScanStatusRequest 请求对象
     * @return CompletableFuture<ChangeAntivirusPayPerScanStatusResponse>
     */
    public CompletableFuture<ChangeAntivirusPayPerScanStatusResponse> changeAntivirusPayPerScanStatusAsync(
        ChangeAntivirusPayPerScanStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAntivirusPayPerScanStatus);
    }

    /**
     * 修改“病毒查杀按次计费”开关状态
     *
     * 修改“病毒查杀按次计费”开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPayPerScanStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse>
     */
    public AsyncInvoker<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse> changeAntivirusPayPerScanStatusAsyncInvoker(
        ChangeAntivirusPayPerScanStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAntivirusPayPerScanStatus, hcClient);
    }

    /**
     * 编辑自定义查杀策略
     *
     * 编辑自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPolicyRequest 请求对象
     * @return CompletableFuture<ChangeAntivirusPolicyResponse>
     */
    public CompletableFuture<ChangeAntivirusPolicyResponse> changeAntivirusPolicyAsync(
        ChangeAntivirusPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAntivirusPolicy);
    }

    /**
     * 编辑自定义查杀策略
     *
     * 编辑自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPolicyRequest 请求对象
     * @return AsyncInvoker<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse>
     */
    public AsyncInvoker<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse> changeAntivirusPolicyAsyncInvoker(
        ChangeAntivirusPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAntivirusPolicy, hcClient);
    }

    /**
     * 创建付费病毒扫描任务
     *
     * 创建付费病毒扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPaidTaskRequest 请求对象
     * @return CompletableFuture<CreateAntiVirusPaidTaskResponse>
     */
    public CompletableFuture<CreateAntiVirusPaidTaskResponse> createAntiVirusPaidTaskAsync(
        CreateAntiVirusPaidTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createAntiVirusPaidTask);
    }

    /**
     * 创建付费病毒扫描任务
     *
     * 创建付费病毒扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPaidTaskRequest 请求对象
     * @return AsyncInvoker<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse>
     */
    public AsyncInvoker<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse> createAntiVirusPaidTaskAsyncInvoker(
        CreateAntiVirusPaidTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createAntiVirusPaidTask, hcClient);
    }

    /**
     * 创建自定义查杀策略
     *
     * 创建自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPolicyRequest 请求对象
     * @return CompletableFuture<CreateAntiVirusPolicyResponse>
     */
    public CompletableFuture<CreateAntiVirusPolicyResponse> createAntiVirusPolicyAsync(
        CreateAntiVirusPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createAntiVirusPolicy);
    }

    /**
     * 创建自定义查杀策略
     *
     * 创建自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse>
     */
    public AsyncInvoker<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse> createAntiVirusPolicyAsyncInvoker(
        CreateAntiVirusPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createAntiVirusPolicy, hcClient);
    }

    /**
     * 创建病毒扫描任务
     *
     * 创建病毒扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusTaskRequest 请求对象
     * @return CompletableFuture<CreateAntiVirusTaskResponse>
     */
    public CompletableFuture<CreateAntiVirusTaskResponse> createAntiVirusTaskAsync(CreateAntiVirusTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createAntiVirusTask);
    }

    /**
     * 创建病毒扫描任务
     *
     * 创建病毒扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusTaskRequest 请求对象
     * @return AsyncInvoker<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse>
     */
    public AsyncInvoker<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse> createAntiVirusTaskAsyncInvoker(
        CreateAntiVirusTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createAntiVirusTask, hcClient);
    }

    /**
     * 删除自定义查杀策略
     *
     * 删除自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntivirusPolicyRequest 请求对象
     * @return CompletableFuture<DeleteAntivirusPolicyResponse>
     */
    public CompletableFuture<DeleteAntivirusPolicyResponse> deleteAntivirusPolicyAsync(
        DeleteAntivirusPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteAntivirusPolicy);
    }

    /**
     * 删除自定义查杀策略
     *
     * 删除自定义查杀策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntivirusPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse>
     */
    public AsyncInvoker<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse> deleteAntivirusPolicyAsyncInvoker(
        DeleteAntivirusPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteAntivirusPolicy, hcClient);
    }

    /**
     * 导出病毒扫描结果列表
     *
     * 导出病毒扫描结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAntiVirusResultRequest 请求对象
     * @return CompletableFuture<ExportAntiVirusResultResponse>
     */
    public CompletableFuture<ExportAntiVirusResultResponse> exportAntiVirusResultAsync(
        ExportAntiVirusResultRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportAntiVirusResult);
    }

    /**
     * 导出病毒扫描结果列表
     *
     * 导出病毒扫描结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAntiVirusResultRequest 请求对象
     * @return AsyncInvoker<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse>
     */
    public AsyncInvoker<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse> exportAntiVirusResultAsyncInvoker(
        ExportAntiVirusResultRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportAntiVirusResult, hcClient);
    }

    /**
     * 处置病毒扫描结果
     *
     * 处置病毒扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleAntiVirusResultRequest 请求对象
     * @return CompletableFuture<HandleAntiVirusResultResponse>
     */
    public CompletableFuture<HandleAntiVirusResultResponse> handleAntiVirusResultAsync(
        HandleAntiVirusResultRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.handleAntiVirusResult);
    }

    /**
     * 处置病毒扫描结果
     *
     * 处置病毒扫描结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleAntiVirusResultRequest 请求对象
     * @return AsyncInvoker<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse>
     */
    public AsyncInvoker<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse> handleAntiVirusResultAsyncInvoker(
        HandleAntiVirusResultRequest request) {
        return new AsyncInvoker<>(request, HssMeta.handleAntiVirusResult, hcClient);
    }

    /**
     * 查询病毒查杀可选服务器列表
     *
     * 查询病毒查杀可选服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusHostRequest 请求对象
     * @return CompletableFuture<ListAntiVirusHostResponse>
     */
    public CompletableFuture<ListAntiVirusHostResponse> listAntiVirusHostAsync(ListAntiVirusHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntiVirusHost);
    }

    /**
     * 查询病毒查杀可选服务器列表
     *
     * 查询病毒查杀可选服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusHostRequest 请求对象
     * @return AsyncInvoker<ListAntiVirusHostRequest, ListAntiVirusHostResponse>
     */
    public AsyncInvoker<ListAntiVirusHostRequest, ListAntiVirusHostResponse> listAntiVirusHostAsyncInvoker(
        ListAntiVirusHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntiVirusHost, hcClient);
    }

    /**
     * 查询付费病毒查杀服务器列表
     *
     * 查询付费病毒查杀服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPaidHostsRequest 请求对象
     * @return CompletableFuture<ListAntiVirusPaidHostsResponse>
     */
    public CompletableFuture<ListAntiVirusPaidHostsResponse> listAntiVirusPaidHostsAsync(
        ListAntiVirusPaidHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntiVirusPaidHosts);
    }

    /**
     * 查询付费病毒查杀服务器列表
     *
     * 查询付费病毒查杀服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPaidHostsRequest 请求对象
     * @return AsyncInvoker<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse>
     */
    public AsyncInvoker<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse> listAntiVirusPaidHostsAsyncInvoker(
        ListAntiVirusPaidHostsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntiVirusPaidHosts, hcClient);
    }

    /**
     * 查询自定义查杀策略列表
     *
     * 查询自定义查杀策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPolicyRequest 请求对象
     * @return CompletableFuture<ListAntiVirusPolicyResponse>
     */
    public CompletableFuture<ListAntiVirusPolicyResponse> listAntiVirusPolicyAsync(ListAntiVirusPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntiVirusPolicy);
    }

    /**
     * 查询自定义查杀策略列表
     *
     * 查询自定义查杀策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPolicyRequest 请求对象
     * @return AsyncInvoker<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse>
     */
    public AsyncInvoker<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse> listAntiVirusPolicyAsyncInvoker(
        ListAntiVirusPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntiVirusPolicy, hcClient);
    }

    /**
     * 查询病毒扫描结果列表
     *
     * 查询病毒扫描结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusResultRequest 请求对象
     * @return CompletableFuture<ListAntiVirusResultResponse>
     */
    public CompletableFuture<ListAntiVirusResultResponse> listAntiVirusResultAsync(ListAntiVirusResultRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntiVirusResult);
    }

    /**
     * 查询病毒扫描结果列表
     *
     * 查询病毒扫描结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusResultRequest 请求对象
     * @return AsyncInvoker<ListAntiVirusResultRequest, ListAntiVirusResultResponse>
     */
    public AsyncInvoker<ListAntiVirusResultRequest, ListAntiVirusResultResponse> listAntiVirusResultAsyncInvoker(
        ListAntiVirusResultRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntiVirusResult, hcClient);
    }

    /**
     * 查看病毒扫描任务列表
     *
     * 查看病毒扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusTaskRequest 请求对象
     * @return CompletableFuture<ListAntiVirusTaskResponse>
     */
    public CompletableFuture<ListAntiVirusTaskResponse> listAntiVirusTaskAsync(ListAntiVirusTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntiVirusTask);
    }

    /**
     * 查看病毒扫描任务列表
     *
     * 查看病毒扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusTaskRequest 请求对象
     * @return AsyncInvoker<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse>
     */
    public AsyncInvoker<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse> listAntiVirusTaskAsyncInvoker(
        ListAntiVirusTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntiVirusTask, hcClient);
    }

    /**
     * 查询病毒查杀免费扫描次数
     *
     * 查询病毒查杀免费扫描次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusFreeQuotaRequest 请求对象
     * @return CompletableFuture<ShowAntivirusFreeQuotaResponse>
     */
    public CompletableFuture<ShowAntivirusFreeQuotaResponse> showAntivirusFreeQuotaAsync(
        ShowAntivirusFreeQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAntivirusFreeQuota);
    }

    /**
     * 查询病毒查杀免费扫描次数
     *
     * 查询病毒查杀免费扫描次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusFreeQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse>
     */
    public AsyncInvoker<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse> showAntivirusFreeQuotaAsyncInvoker(
        ShowAntivirusFreeQuotaRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAntivirusFreeQuota, hcClient);
    }

    /**
     * 查询“病毒查杀按次计费”开关状态
     *
     * 查询“病毒查杀按次计费”开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusPayPerScanStatusRequest 请求对象
     * @return CompletableFuture<ShowAntivirusPayPerScanStatusResponse>
     */
    public CompletableFuture<ShowAntivirusPayPerScanStatusResponse> showAntivirusPayPerScanStatusAsync(
        ShowAntivirusPayPerScanStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAntivirusPayPerScanStatus);
    }

    /**
     * 查询“病毒查杀按次计费”开关状态
     *
     * 查询“病毒查杀按次计费”开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusPayPerScanStatusRequest 请求对象
     * @return AsyncInvoker<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse>
     */
    public AsyncInvoker<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse> showAntivirusPayPerScanStatusAsyncInvoker(
        ShowAntivirusPayPerScanStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAntivirusPayPerScanStatus, hcClient);
    }

    /**
     * 查询病毒查杀统计信息
     *
     * 查询病毒查杀统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusStatisticRequest 请求对象
     * @return CompletableFuture<ShowAntivirusStatisticResponse>
     */
    public CompletableFuture<ShowAntivirusStatisticResponse> showAntivirusStatisticAsync(
        ShowAntivirusStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAntivirusStatistic);
    }

    /**
     * 查询病毒查杀统计信息
     *
     * 查询病毒查杀统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusStatisticRequest 请求对象
     * @return AsyncInvoker<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse>
     */
    public AsyncInvoker<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse> showAntivirusStatisticAsyncInvoker(
        ShowAntivirusStatisticRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAntivirusStatistic, hcClient);
    }

    /**
     * 取消扫描任务
     *
     * 取消扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAntivirusTaskRequest 请求对象
     * @return CompletableFuture<SwitchAntivirusTaskResponse>
     */
    public CompletableFuture<SwitchAntivirusTaskResponse> switchAntivirusTaskAsync(SwitchAntivirusTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchAntivirusTask);
    }

    /**
     * 取消扫描任务
     *
     * 取消扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAntivirusTaskRequest 请求对象
     * @return AsyncInvoker<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse>
     */
    public AsyncInvoker<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse> switchAntivirusTaskAsyncInvoker(
        SwitchAntivirusTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchAntivirusTask, hcClient);
    }

    /**
     * 白名单策略添加主机
     *
     * 白名单策略添加主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyHostRequest 请求对象
     * @return CompletableFuture<AddAppWhitelistPolicyHostResponse>
     */
    public CompletableFuture<AddAppWhitelistPolicyHostResponse> addAppWhitelistPolicyHostAsync(
        AddAppWhitelistPolicyHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addAppWhitelistPolicyHost);
    }

    /**
     * 白名单策略添加主机
     *
     * 白名单策略添加主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyHostRequest 请求对象
     * @return AsyncInvoker<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse>
     */
    public AsyncInvoker<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse> addAppWhitelistPolicyHostAsyncInvoker(
        AddAppWhitelistPolicyHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 新增进程白名单策略进程
     *
     * 新增进程白名单策略进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyProcessRequest 请求对象
     * @return CompletableFuture<AddAppWhitelistPolicyProcessResponse>
     */
    public CompletableFuture<AddAppWhitelistPolicyProcessResponse> addAppWhitelistPolicyProcessAsync(
        AddAppWhitelistPolicyProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addAppWhitelistPolicyProcess);
    }

    /**
     * 新增进程白名单策略进程
     *
     * 新增进程白名单策略进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyProcessRequest 请求对象
     * @return AsyncInvoker<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse>
     */
    public AsyncInvoker<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse> addAppWhitelistPolicyProcessAsyncInvoker(
        AddAppWhitelistPolicyProcessRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addAppWhitelistPolicyProcess, hcClient);
    }

    /**
     * 修改白名单策略
     *
     * 修改白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyRequest 请求对象
     * @return CompletableFuture<ChangeAppWhitelistPolicyResponse>
     */
    public CompletableFuture<ChangeAppWhitelistPolicyResponse> changeAppWhitelistPolicyAsync(
        ChangeAppWhitelistPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAppWhitelistPolicy);
    }

    /**
     * 修改白名单策略
     *
     * 修改白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyRequest 请求对象
     * @return AsyncInvoker<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse>
     */
    public AsyncInvoker<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse> changeAppWhitelistPolicyAsyncInvoker(
        ChangeAppWhitelistPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAppWhitelistPolicy, hcClient);
    }

    /**
     * 标记进程白名单策略识别进程
     *
     * 标记进程白名单策略识别进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyProcessStatusRequest 请求对象
     * @return CompletableFuture<ChangeAppWhitelistPolicyProcessStatusResponse>
     */
    public CompletableFuture<ChangeAppWhitelistPolicyProcessStatusResponse> changeAppWhitelistPolicyProcessStatusAsync(
        ChangeAppWhitelistPolicyProcessStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeAppWhitelistPolicyProcessStatus);
    }

    /**
     * 标记进程白名单策略识别进程
     *
     * 标记进程白名单策略识别进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyProcessStatusRequest 请求对象
     * @return AsyncInvoker<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse>
     */
    public AsyncInvoker<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse> changeAppWhitelistPolicyProcessStatusAsyncInvoker(
        ChangeAppWhitelistPolicyProcessStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeAppWhitelistPolicyProcessStatus, hcClient);
    }

    /**
     * 创建白名单策略
     *
     * 创建白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppWhitelistPolicyRequest 请求对象
     * @return CompletableFuture<CreateAppWhitelistPolicyResponse>
     */
    public CompletableFuture<CreateAppWhitelistPolicyResponse> createAppWhitelistPolicyAsync(
        CreateAppWhitelistPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createAppWhitelistPolicy);
    }

    /**
     * 创建白名单策略
     *
     * 创建白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppWhitelistPolicyRequest 请求对象
     * @return AsyncInvoker<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse>
     */
    public AsyncInvoker<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse> createAppWhitelistPolicyAsyncInvoker(
        CreateAppWhitelistPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createAppWhitelistPolicy, hcClient);
    }

    /**
     * 删除白名单策略
     *
     * 删除白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyRequest 请求对象
     * @return CompletableFuture<DeleteAppWhitelistPolicyResponse>
     */
    public CompletableFuture<DeleteAppWhitelistPolicyResponse> deleteAppWhitelistPolicyAsync(
        DeleteAppWhitelistPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteAppWhitelistPolicy);
    }

    /**
     * 删除白名单策略
     *
     * 删除白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse>
     */
    public AsyncInvoker<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse> deleteAppWhitelistPolicyAsyncInvoker(
        DeleteAppWhitelistPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteAppWhitelistPolicy, hcClient);
    }

    /**
     * 白名单策略删除主机
     *
     * 白名单策略删除主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyHostRequest 请求对象
     * @return CompletableFuture<DeleteAppWhitelistPolicyHostResponse>
     */
    public CompletableFuture<DeleteAppWhitelistPolicyHostResponse> deleteAppWhitelistPolicyHostAsync(
        DeleteAppWhitelistPolicyHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteAppWhitelistPolicyHost);
    }

    /**
     * 白名单策略删除主机
     *
     * 白名单策略删除主机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyHostRequest 请求对象
     * @return AsyncInvoker<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse>
     */
    public AsyncInvoker<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse> deleteAppWhitelistPolicyHostAsyncInvoker(
        DeleteAppWhitelistPolicyHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 查询进程白名单可疑进程
     *
     * 查询进程白名单可疑进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistEventRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistEventResponse>
     */
    public CompletableFuture<ListAppWhitelistEventResponse> listAppWhitelistEventAsync(
        ListAppWhitelistEventRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistEvent);
    }

    /**
     * 查询进程白名单可疑进程
     *
     * 查询进程白名单可疑进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistEventRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse>
     */
    public AsyncInvoker<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse> listAppWhitelistEventAsyncInvoker(
        ListAppWhitelistEventRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistEvent, hcClient);
    }

    /**
     * 查询进程白名单可选服务器列表
     *
     * 查询进程白名单可选服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistHostStatusRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistHostStatusResponse>
     */
    public CompletableFuture<ListAppWhitelistHostStatusResponse> listAppWhitelistHostStatusAsync(
        ListAppWhitelistHostStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistHostStatus);
    }

    /**
     * 查询进程白名单可选服务器列表
     *
     * 查询进程白名单可选服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistHostStatusRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse>
     */
    public AsyncInvoker<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse> listAppWhitelistHostStatusAsyncInvoker(
        ListAppWhitelistHostStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistHostStatus, hcClient);
    }

    /**
     * 查询进程白名单策略列表
     *
     * 查询进程白名单策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistPolicyResponse>
     */
    public CompletableFuture<ListAppWhitelistPolicyResponse> listAppWhitelistPolicyAsync(
        ListAppWhitelistPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistPolicy);
    }

    /**
     * 查询进程白名单策略列表
     *
     * 查询进程白名单策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse>
     */
    public AsyncInvoker<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse> listAppWhitelistPolicyAsyncInvoker(
        ListAppWhitelistPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistPolicy, hcClient);
    }

    /**
     * 查询进程白名单策略关联主机列表
     *
     * 查询进程白名单策略关联主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyHostRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistPolicyHostResponse>
     */
    public CompletableFuture<ListAppWhitelistPolicyHostResponse> listAppWhitelistPolicyHostAsync(
        ListAppWhitelistPolicyHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistPolicyHost);
    }

    /**
     * 查询进程白名单策略关联主机列表
     *
     * 查询进程白名单策略关联主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyHostRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse>
     */
    public AsyncInvoker<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse> listAppWhitelistPolicyHostAsyncInvoker(
        ListAppWhitelistPolicyHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 查询进程白名单策略识别进程
     *
     * 查询进程白名单策略识别进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistPolicyProcessResponse>
     */
    public CompletableFuture<ListAppWhitelistPolicyProcessResponse> listAppWhitelistPolicyProcessAsync(
        ListAppWhitelistPolicyProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistPolicyProcess);
    }

    /**
     * 查询进程白名单策略识别进程
     *
     * 查询进程白名单策略识别进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse>
     */
    public AsyncInvoker<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse> listAppWhitelistPolicyProcessAsyncInvoker(
        ListAppWhitelistPolicyProcessRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistPolicyProcess, hcClient);
    }

    /**
     * 查询进程白名单策略进程扩展列表
     *
     * 查询进程白名单策略进程扩展列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessExtendRequest 请求对象
     * @return CompletableFuture<ListAppWhitelistPolicyProcessExtendResponse>
     */
    public CompletableFuture<ListAppWhitelistPolicyProcessExtendResponse> listAppWhitelistPolicyProcessExtendAsync(
        ListAppWhitelistPolicyProcessExtendRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAppWhitelistPolicyProcessExtend);
    }

    /**
     * 查询进程白名单策略进程扩展列表
     *
     * 查询进程白名单策略进程扩展列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessExtendRequest 请求对象
     * @return AsyncInvoker<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse>
     */
    public AsyncInvoker<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse> listAppWhitelistPolicyProcessExtendAsyncInvoker(
        ListAppWhitelistPolicyProcessExtendRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAppWhitelistPolicyProcessExtend, hcClient);
    }

    /**
     * 统计agent版本不匹配主机数量
     *
     * 统计agent版本不匹配主机数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistAgentStaticsRequest 请求对象
     * @return CompletableFuture<ShowAppWhitelistAgentStaticsResponse>
     */
    public CompletableFuture<ShowAppWhitelistAgentStaticsResponse> showAppWhitelistAgentStaticsAsync(
        ShowAppWhitelistAgentStaticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAppWhitelistAgentStatics);
    }

    /**
     * 统计agent版本不匹配主机数量
     *
     * 统计agent版本不匹配主机数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistAgentStaticsRequest 请求对象
     * @return AsyncInvoker<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse>
     */
    public AsyncInvoker<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse> showAppWhitelistAgentStaticsAsyncInvoker(
        ShowAppWhitelistAgentStaticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAppWhitelistAgentStatics, hcClient);
    }

    /**
     * 查询进程白名单策略详情
     *
     * 查询进程白名单策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistPolicyRequest 请求对象
     * @return CompletableFuture<ShowAppWhitelistPolicyResponse>
     */
    public CompletableFuture<ShowAppWhitelistPolicyResponse> showAppWhitelistPolicyAsync(
        ShowAppWhitelistPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAppWhitelistPolicy);
    }

    /**
     * 查询进程白名单策略详情
     *
     * 查询进程白名单策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse>
     */
    public AsyncInvoker<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse> showAppWhitelistPolicyAsyncInvoker(
        ShowAppWhitelistPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAppWhitelistPolicy, hcClient);
    }

    /**
     * 应用白名单策略
     *
     * 应用白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyHostRequest 请求对象
     * @return CompletableFuture<SwitchAppWhitelistPolicyHostResponse>
     */
    public CompletableFuture<SwitchAppWhitelistPolicyHostResponse> switchAppWhitelistPolicyHostAsync(
        SwitchAppWhitelistPolicyHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchAppWhitelistPolicyHost);
    }

    /**
     * 应用白名单策略
     *
     * 应用白名单策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyHostRequest 请求对象
     * @return AsyncInvoker<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse>
     */
    public AsyncInvoker<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse> switchAppWhitelistPolicyHostAsyncInvoker(
        SwitchAppWhitelistPolicyHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 操作白名单策略学习状态
     *
     * 操作白名单策略学习状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyLearnStatusRequest 请求对象
     * @return CompletableFuture<SwitchAppWhitelistPolicyLearnStatusResponse>
     */
    public CompletableFuture<SwitchAppWhitelistPolicyLearnStatusResponse> switchAppWhitelistPolicyLearnStatusAsync(
        SwitchAppWhitelistPolicyLearnStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.switchAppWhitelistPolicyLearnStatus);
    }

    /**
     * 操作白名单策略学习状态
     *
     * 操作白名单策略学习状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyLearnStatusRequest 请求对象
     * @return AsyncInvoker<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse>
     */
    public AsyncInvoker<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse> switchAppWhitelistPolicyLearnStatusAsyncInvoker(
        SwitchAppWhitelistPolicyLearnStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.switchAppWhitelistPolicyLearnStatus, hcClient);
    }

    /**
     * 从后端导出基线检测报告，生成Excel文件
     *
     * 从后端导出基线检测报告，生成Excel文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBaselineSecurityCheckReportRequest 请求对象
     * @return CompletableFuture<ExportBaselineSecurityCheckReportResponse>
     */
    public CompletableFuture<ExportBaselineSecurityCheckReportResponse> exportBaselineSecurityCheckReportAsync(
        ExportBaselineSecurityCheckReportRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportBaselineSecurityCheckReport);
    }

    /**
     * 从后端导出基线检测报告，生成Excel文件
     *
     * 从后端导出基线检测报告，生成Excel文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBaselineSecurityCheckReportRequest 请求对象
     * @return AsyncInvoker<ExportBaselineSecurityCheckReportRequest, ExportBaselineSecurityCheckReportResponse>
     */
    public AsyncInvoker<ExportBaselineSecurityCheckReportRequest, ExportBaselineSecurityCheckReportResponse> exportBaselineSecurityCheckReportAsyncInvoker(
        ExportBaselineSecurityCheckReportRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportBaselineSecurityCheckReport, hcClient);
    }

    /**
     * 查询基线检查执行操作时影响的范围
     *
     * 查询基线检查执行操作时影响的范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleAffectBaselineRequest 请求对象
     * @return CompletableFuture<ListHandleAffectBaselineResponse>
     */
    public CompletableFuture<ListHandleAffectBaselineResponse> listHandleAffectBaselineAsync(
        ListHandleAffectBaselineRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHandleAffectBaseline);
    }

    /**
     * 查询基线检查执行操作时影响的范围
     *
     * 查询基线检查执行操作时影响的范围
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleAffectBaselineRequest 请求对象
     * @return AsyncInvoker<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse>
     */
    public AsyncInvoker<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse> listHandleAffectBaselineAsyncInvoker(
        ListHandleAffectBaselineRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHandleAffectBaseline, hcClient);
    }

    /**
     * 复制配置检测策略信息
     *
     * 复制配置检测策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBaselinePolicyGroupRequest 请求对象
     * @return CompletableFuture<CopyBaselinePolicyGroupResponse>
     */
    public CompletableFuture<CopyBaselinePolicyGroupResponse> copyBaselinePolicyGroupAsync(
        CopyBaselinePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.copyBaselinePolicyGroup);
    }

    /**
     * 复制配置检测策略信息
     *
     * 复制配置检测策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBaselinePolicyGroupRequest 请求对象
     * @return AsyncInvoker<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse>
     */
    public AsyncInvoker<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse> copyBaselinePolicyGroupAsyncInvoker(
        CopyBaselinePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.copyBaselinePolicyGroup, hcClient);
    }

    /**
     * 查询基线检测策略的基线目录信息
     *
     * 查询基线检测策略的基线目录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineDirectoryRequest 请求对象
     * @return CompletableFuture<ShowBaselineDirectoryResponse>
     */
    public CompletableFuture<ShowBaselineDirectoryResponse> showBaselineDirectoryAsync(
        ShowBaselineDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showBaselineDirectory);
    }

    /**
     * 查询基线检测策略的基线目录信息
     *
     * 查询基线检测策略的基线目录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineDirectoryRequest 请求对象
     * @return AsyncInvoker<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse>
     */
    public AsyncInvoker<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse> showBaselineDirectoryAsyncInvoker(
        ShowBaselineDirectoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showBaselineDirectory, hcClient);
    }

    /**
     * 导出集群环境安全相关信息
     *
     * 导出集群环境安全相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRisksRequest 请求对象
     * @return CompletableFuture<ExportRisksResponse>
     */
    public CompletableFuture<ExportRisksResponse> exportRisksAsync(ExportRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportRisks);
    }

    /**
     * 导出集群环境安全相关信息
     *
     * 导出集群环境安全相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRisksRequest 请求对象
     * @return AsyncInvoker<ExportRisksRequest, ExportRisksResponse>
     */
    public AsyncInvoker<ExportRisksRequest, ExportRisksResponse> exportRisksAsyncInvoker(ExportRisksRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportRisks, hcClient);
    }

    /**
     * 查询集群风险影响的集群资源列表
     *
     * 查询集群风险影响的集群资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRiskAffectResourcesRequest 请求对象
     * @return CompletableFuture<ListClusterRiskAffectResourcesResponse>
     */
    public CompletableFuture<ListClusterRiskAffectResourcesResponse> listClusterRiskAffectResourcesAsync(
        ListClusterRiskAffectResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterRiskAffectResources);
    }

    /**
     * 查询集群风险影响的集群资源列表
     *
     * 查询集群风险影响的集群资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRiskAffectResourcesRequest 请求对象
     * @return AsyncInvoker<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse>
     */
    public AsyncInvoker<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse> listClusterRiskAffectResourcesAsyncInvoker(
        ListClusterRiskAffectResourcesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterRiskAffectResources, hcClient);
    }

    /**
     * 查询集群风险列表
     *
     * 查询集群风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRisksRequest 请求对象
     * @return CompletableFuture<ListClusterRisksResponse>
     */
    public CompletableFuture<ListClusterRisksResponse> listClusterRisksAsync(ListClusterRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listClusterRisks);
    }

    /**
     * 查询集群风险列表
     *
     * 查询集群风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRisksRequest 请求对象
     * @return AsyncInvoker<ListClusterRisksRequest, ListClusterRisksResponse>
     */
    public AsyncInvoker<ListClusterRisksRequest, ListClusterRisksResponse> listClusterRisksAsyncInvoker(
        ListClusterRisksRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listClusterRisks, hcClient);
    }

    /**
     * 查询集群扫描统计数据
     *
     * 查询集群扫描统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterScanStatisticsRequest 请求对象
     * @return CompletableFuture<ShowClusterScanStatisticsResponse>
     */
    public CompletableFuture<ShowClusterScanStatisticsResponse> showClusterScanStatisticsAsync(
        ShowClusterScanStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showClusterScanStatistics);
    }

    /**
     * 查询集群扫描统计数据
     *
     * 查询集群扫描统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterScanStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse>
     */
    public AsyncInvoker<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse> showClusterScanStatisticsAsyncInvoker(
        ShowClusterScanStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showClusterScanStatistics, hcClient);
    }

    /**
     * 查询项目配置
     *
     * 查询项目配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectConfigsRequest 请求对象
     * @return CompletableFuture<ListProjectConfigsResponse>
     */
    public CompletableFuture<ListProjectConfigsResponse> listProjectConfigsAsync(ListProjectConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listProjectConfigs);
    }

    /**
     * 查询项目配置
     *
     * 查询项目配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectConfigsRequest 请求对象
     * @return AsyncInvoker<ListProjectConfigsRequest, ListProjectConfigsResponse>
     */
    public AsyncInvoker<ListProjectConfigsRequest, ListProjectConfigsResponse> listProjectConfigsAsyncInvoker(
        ListProjectConfigsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listProjectConfigs, hcClient);
    }

    /**
     * 修改项目配置
     *
     * 修改项目配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyProjectConfigsRequest 请求对象
     * @return CompletableFuture<ModifyProjectConfigsResponse>
     */
    public CompletableFuture<ModifyProjectConfigsResponse> modifyProjectConfigsAsync(
        ModifyProjectConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyProjectConfigs);
    }

    /**
     * 修改项目配置
     *
     * 修改项目配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyProjectConfigsRequest 请求对象
     * @return AsyncInvoker<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse>
     */
    public AsyncInvoker<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse> modifyProjectConfigsAsyncInvoker(
        ModifyProjectConfigsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyProjectConfigs, hcClient);
    }

    /**
     * 保存用户访问记录
     *
     * 保存用户访问记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveBrowsingHistoryRequest 请求对象
     * @return CompletableFuture<SaveBrowsingHistoryResponse>
     */
    public CompletableFuture<SaveBrowsingHistoryResponse> saveBrowsingHistoryAsync(SaveBrowsingHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.saveBrowsingHistory);
    }

    /**
     * 保存用户访问记录
     *
     * 保存用户访问记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveBrowsingHistoryRequest 请求对象
     * @return AsyncInvoker<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse>
     */
    public AsyncInvoker<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse> saveBrowsingHistoryAsyncInvoker(
        SaveBrowsingHistoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.saveBrowsingHistory, hcClient);
    }

    /**
     * 上传安全报告logo
     *
     * 上传安全报告logo
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadReportLogoRequest 请求对象
     * @return CompletableFuture<UploadReportLogoResponse>
     */
    public CompletableFuture<UploadReportLogoResponse> uploadReportLogoAsync(UploadReportLogoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.uploadReportLogo);
    }

    /**
     * 上传安全报告logo
     *
     * 上传安全报告logo
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadReportLogoRequest 请求对象
     * @return AsyncInvoker<UploadReportLogoRequest, UploadReportLogoResponse>
     */
    public AsyncInvoker<UploadReportLogoRequest, UploadReportLogoResponse> uploadReportLogoAsyncInvoker(
        UploadReportLogoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.uploadReportLogo, hcClient);
    }

    /**
     * 新增cicd配置
     *
     * 新增cicd配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCicdConfigurationRequest 请求对象
     * @return CompletableFuture<AddCicdConfigurationResponse>
     */
    public CompletableFuture<AddCicdConfigurationResponse> addCicdConfigurationAsync(
        AddCicdConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addCicdConfiguration);
    }

    /**
     * 新增cicd配置
     *
     * 新增cicd配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCicdConfigurationRequest 请求对象
     * @return AsyncInvoker<AddCicdConfigurationRequest, AddCicdConfigurationResponse>
     */
    public AsyncInvoker<AddCicdConfigurationRequest, AddCicdConfigurationResponse> addCicdConfigurationAsyncInvoker(
        AddCicdConfigurationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addCicdConfiguration, hcClient);
    }

    /**
     * 新增镜像仓库
     *
     * 新增镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRegistryRequest 请求对象
     * @return CompletableFuture<AddRegistryResponse>
     */
    public CompletableFuture<AddRegistryResponse> addRegistryAsync(AddRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addRegistry);
    }

    /**
     * 新增镜像仓库
     *
     * 新增镜像仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRegistryRequest 请求对象
     * @return AsyncInvoker<AddRegistryRequest, AddRegistryResponse>
     */
    public AsyncInvoker<AddRegistryRequest, AddRegistryResponse> addRegistryAsyncInvoker(AddRegistryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addRegistry, hcClient);
    }

    /**
     * 批量卸载集群daemonset
     *
     * 批量卸载集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAgentDaemonsetRequest 请求对象
     * @return CompletableFuture<BatchDeleteAgentDaemonsetResponse>
     */
    public CompletableFuture<BatchDeleteAgentDaemonsetResponse> batchDeleteAgentDaemonsetAsync(
        BatchDeleteAgentDaemonsetRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchDeleteAgentDaemonset);
    }

    /**
     * 批量卸载集群daemonset
     *
     * 批量卸载集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAgentDaemonsetRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse>
     */
    public AsyncInvoker<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse> batchDeleteAgentDaemonsetAsyncInvoker(
        BatchDeleteAgentDaemonsetRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchDeleteAgentDaemonset, hcClient);
    }

    /**
     * 批量删除镜像仓接入信息
     *
     * 批量删除镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRegistryRequest 请求对象
     * @return CompletableFuture<BatchDeleteRegistryResponse>
     */
    public CompletableFuture<BatchDeleteRegistryResponse> batchDeleteRegistryAsync(BatchDeleteRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchDeleteRegistry);
    }

    /**
     * 批量删除镜像仓接入信息
     *
     * 批量删除镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRegistryRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRegistryRequest, BatchDeleteRegistryResponse>
     */
    public AsyncInvoker<BatchDeleteRegistryRequest, BatchDeleteRegistryResponse> batchDeleteRegistryAsyncInvoker(
        BatchDeleteRegistryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchDeleteRegistry, hcClient);
    }

    /**
     * 批量升级集群daemonset
     *
     * 批量升级集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeAgentDaemonsetRequest 请求对象
     * @return CompletableFuture<BatchUpgradeAgentDaemonsetResponse>
     */
    public CompletableFuture<BatchUpgradeAgentDaemonsetResponse> batchUpgradeAgentDaemonsetAsync(
        BatchUpgradeAgentDaemonsetRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchUpgradeAgentDaemonset);
    }

    /**
     * 批量升级集群daemonset
     *
     * 批量升级集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeAgentDaemonsetRequest 请求对象
     * @return AsyncInvoker<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse>
     */
    public AsyncInvoker<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse> batchUpgradeAgentDaemonsetAsyncInvoker(
        BatchUpgradeAgentDaemonsetRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchUpgradeAgentDaemonset, hcClient);
    }

    /**
     * 创建集群daemonset
     *
     * 创建集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgentDaemonsetRequest 请求对象
     * @return CompletableFuture<CreateAgentDaemonsetResponse>
     */
    public CompletableFuture<CreateAgentDaemonsetResponse> createAgentDaemonsetAsync(
        CreateAgentDaemonsetRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createAgentDaemonset);
    }

    /**
     * 创建集群daemonset
     *
     * 创建集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgentDaemonsetRequest 请求对象
     * @return AsyncInvoker<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse>
     */
    public AsyncInvoker<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse> createAgentDaemonsetAsyncInvoker(
        CreateAgentDaemonsetRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createAgentDaemonset, hcClient);
    }

    /**
     * 生成cicd接入配置命令
     *
     * 生成cicd接入配置命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCicdConfigurationCommandRequest 请求对象
     * @return CompletableFuture<CreateCicdConfigurationCommandResponse>
     */
    public CompletableFuture<CreateCicdConfigurationCommandResponse> createCicdConfigurationCommandAsync(
        CreateCicdConfigurationCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createCicdConfigurationCommand);
    }

    /**
     * 生成cicd接入配置命令
     *
     * 生成cicd接入配置命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCicdConfigurationCommandRequest 请求对象
     * @return AsyncInvoker<CreateCicdConfigurationCommandRequest, CreateCicdConfigurationCommandResponse>
     */
    public AsyncInvoker<CreateCicdConfigurationCommandRequest, CreateCicdConfigurationCommandResponse> createCicdConfigurationCommandAsyncInvoker(
        CreateCicdConfigurationCommandRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createCicdConfigurationCommand, hcClient);
    }

    /**
     * 创建多云集群
     *
     * 创建多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiCloudClustersRequest 请求对象
     * @return CompletableFuture<CreateMultiCloudClustersResponse>
     */
    public CompletableFuture<CreateMultiCloudClustersResponse> createMultiCloudClustersAsync(
        CreateMultiCloudClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createMultiCloudClusters);
    }

    /**
     * 创建多云集群
     *
     * 创建多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiCloudClustersRequest 请求对象
     * @return AsyncInvoker<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse>
     */
    public AsyncInvoker<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse> createMultiCloudClustersAsyncInvoker(
        CreateMultiCloudClustersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createMultiCloudClusters, hcClient);
    }

    /**
     * 删除集群daemonset
     *
     * 删除集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentDaemonsetRequest 请求对象
     * @return CompletableFuture<DeleteAgentDaemonsetResponse>
     */
    public CompletableFuture<DeleteAgentDaemonsetResponse> deleteAgentDaemonsetAsync(
        DeleteAgentDaemonsetRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteAgentDaemonset);
    }

    /**
     * 删除集群daemonset
     *
     * 删除集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentDaemonsetRequest 请求对象
     * @return AsyncInvoker<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse>
     */
    public AsyncInvoker<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> deleteAgentDaemonsetAsyncInvoker(
        DeleteAgentDaemonsetRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteAgentDaemonset, hcClient);
    }

    /**
     * 删除CI/CD配置
     *
     * 删除CI/CD配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCicdConfigurationsRequest 请求对象
     * @return CompletableFuture<DeleteCicdConfigurationsResponse>
     */
    public CompletableFuture<DeleteCicdConfigurationsResponse> deleteCicdConfigurationsAsync(
        DeleteCicdConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteCicdConfigurations);
    }

    /**
     * 删除CI/CD配置
     *
     * 删除CI/CD配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCicdConfigurationsRequest 请求对象
     * @return AsyncInvoker<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse>
     */
    public AsyncInvoker<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse> deleteCicdConfigurationsAsyncInvoker(
        DeleteCicdConfigurationsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteCicdConfigurations, hcClient);
    }

    /**
     * 删除镜像仓接入信息
     *
     * 删除镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRegistryRequest 请求对象
     * @return CompletableFuture<DeleteRegistryResponse>
     */
    public CompletableFuture<DeleteRegistryResponse> deleteRegistryAsync(DeleteRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteRegistry);
    }

    /**
     * 删除镜像仓接入信息
     *
     * 删除镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRegistryRequest 请求对象
     * @return AsyncInvoker<DeleteRegistryRequest, DeleteRegistryResponse>
     */
    public AsyncInvoker<DeleteRegistryRequest, DeleteRegistryResponse> deleteRegistryAsyncInvoker(
        DeleteRegistryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteRegistry, hcClient);
    }

    /**
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）
     *
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）,支持导出恶意文件、软件信息、文件信息、敏感信息、软件合规、镜像构建指令风险。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageSecurityReportTaskRequest 请求对象
     * @return CompletableFuture<ExportImageSecurityReportTaskResponse>
     */
    public CompletableFuture<ExportImageSecurityReportTaskResponse> exportImageSecurityReportTaskAsync(
        ExportImageSecurityReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportImageSecurityReportTask);
    }

    /**
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）
     *
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）,支持导出恶意文件、软件信息、文件信息、敏感信息、软件合规、镜像构建指令风险。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageSecurityReportTaskRequest 请求对象
     * @return AsyncInvoker<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse>
     */
    public AsyncInvoker<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse> exportImageSecurityReportTaskAsyncInvoker(
        ExportImageSecurityReportTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportImageSecurityReportTask, hcClient);
    }

    /**
     * 获取镜像同步任务关联的镜像仓的信息
     *
     * 获取镜像同步任务关联的镜像仓的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateRegistriesRequest 请求对象
     * @return CompletableFuture<ListAssociateRegistriesResponse>
     */
    public CompletableFuture<ListAssociateRegistriesResponse> listAssociateRegistriesAsync(
        ListAssociateRegistriesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAssociateRegistries);
    }

    /**
     * 获取镜像同步任务关联的镜像仓的信息
     *
     * 获取镜像同步任务关联的镜像仓的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateRegistriesRequest 请求对象
     * @return AsyncInvoker<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse>
     */
    public AsyncInvoker<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse> listAssociateRegistriesAsyncInvoker(
        ListAssociateRegistriesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAssociateRegistries, hcClient);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceNodesLabelRequest 请求对象
     * @return CompletableFuture<ListCceNodesLabelResponse>
     */
    public CompletableFuture<ListCceNodesLabelResponse> listCceNodesLabelAsync(ListCceNodesLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCceNodesLabel);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceNodesLabelRequest 请求对象
     * @return AsyncInvoker<ListCceNodesLabelRequest, ListCceNodesLabelResponse>
     */
    public AsyncInvoker<ListCceNodesLabelRequest, ListCceNodesLabelResponse> listCceNodesLabelAsyncInvoker(
        ListCceNodesLabelRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCceNodesLabel, hcClient);
    }

    /**
     * 查询cicd配置列表
     *
     * 查询cicd配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdConfigurationsRequest 请求对象
     * @return CompletableFuture<ListCicdConfigurationsResponse>
     */
    public CompletableFuture<ListCicdConfigurationsResponse> listCicdConfigurationsAsync(
        ListCicdConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCicdConfigurations);
    }

    /**
     * 查询cicd配置列表
     *
     * 查询cicd配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse>
     */
    public AsyncInvoker<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse> listCicdConfigurationsAsyncInvoker(
        ListCicdConfigurationsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCicdConfigurations, hcClient);
    }

    /**
     * 查询cicd镜像列表
     *
     * 查询cicd镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdImagesRequest 请求对象
     * @return CompletableFuture<ListCicdImagesResponse>
     */
    public CompletableFuture<ListCicdImagesResponse> listCicdImagesAsync(ListCicdImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listCicdImages);
    }

    /**
     * 查询cicd镜像列表
     *
     * 查询cicd镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdImagesRequest 请求对象
     * @return AsyncInvoker<ListCicdImagesRequest, ListCicdImagesResponse>
     */
    public AsyncInvoker<ListCicdImagesRequest, ListCicdImagesResponse> listCicdImagesAsyncInvoker(
        ListCicdImagesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listCicdImages, hcClient);
    }

    /**
     * 查询多云集群
     *
     * 查询多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudClustersRequest 请求对象
     * @return CompletableFuture<ListMultiCloudClustersResponse>
     */
    public CompletableFuture<ListMultiCloudClustersResponse> listMultiCloudClustersAsync(
        ListMultiCloudClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listMultiCloudClusters);
    }

    /**
     * 查询多云集群
     *
     * 查询多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudClustersRequest 请求对象
     * @return AsyncInvoker<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse>
     */
    public AsyncInvoker<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse> listMultiCloudClustersAsyncInvoker(
        ListMultiCloudClustersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listMultiCloudClusters, hcClient);
    }

    /**
     * 获取镜像仓列表
     *
     * 获取镜像仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryRequest 请求对象
     * @return CompletableFuture<ListRegistryResponse>
     */
    public CompletableFuture<ListRegistryResponse> listRegistryAsync(ListRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRegistry);
    }

    /**
     * 获取镜像仓列表
     *
     * 获取镜像仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryRequest 请求对象
     * @return AsyncInvoker<ListRegistryRequest, ListRegistryResponse>
     */
    public AsyncInvoker<ListRegistryRequest, ListRegistryResponse> listRegistryAsyncInvoker(
        ListRegistryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRegistry, hcClient);
    }

    /**
     * 查询镜像仓统计数据
     *
     * 查询镜像仓统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryStatisticsRequest 请求对象
     * @return CompletableFuture<ListRegistryStatisticsResponse>
     */
    public CompletableFuture<ListRegistryStatisticsResponse> listRegistryStatisticsAsync(
        ListRegistryStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRegistryStatistics);
    }

    /**
     * 查询镜像仓统计数据
     *
     * 查询镜像仓统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryStatisticsRequest 请求对象
     * @return AsyncInvoker<ListRegistryStatisticsRequest, ListRegistryStatisticsResponse>
     */
    public AsyncInvoker<ListRegistryStatisticsRequest, ListRegistryStatisticsResponse> listRegistryStatisticsAsyncInvoker(
        ListRegistryStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRegistryStatistics, hcClient);
    }

    /**
     * 修改CI/CD配置
     *
     * 修改CI/CD配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCicdConfigurationRequest 请求对象
     * @return CompletableFuture<ModifyCicdConfigurationResponse>
     */
    public CompletableFuture<ModifyCicdConfigurationResponse> modifyCicdConfigurationAsync(
        ModifyCicdConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyCicdConfiguration);
    }

    /**
     * 修改CI/CD配置
     *
     * 修改CI/CD配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCicdConfigurationRequest 请求对象
     * @return AsyncInvoker<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse>
     */
    public AsyncInvoker<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse> modifyCicdConfigurationAsyncInvoker(
        ModifyCicdConfigurationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyCicdConfiguration, hcClient);
    }

    /**
     * 解析多云集群的配置文件
     *
     * 解析多云集群的配置文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseMultiCloudClusterConfigRequest 请求对象
     * @return CompletableFuture<ParseMultiCloudClusterConfigResponse>
     */
    public CompletableFuture<ParseMultiCloudClusterConfigResponse> parseMultiCloudClusterConfigAsync(
        ParseMultiCloudClusterConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.parseMultiCloudClusterConfig);
    }

    /**
     * 解析多云集群的配置文件
     *
     * 解析多云集群的配置文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseMultiCloudClusterConfigRequest 请求对象
     * @return AsyncInvoker<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse>
     */
    public AsyncInvoker<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse> parseMultiCloudClusterConfigAsyncInvoker(
        ParseMultiCloudClusterConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.parseMultiCloudClusterConfig, hcClient);
    }

    /**
     * 删除多云集群
     *
     * 删除多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveMultiCloudClustersRequest 请求对象
     * @return CompletableFuture<RemoveMultiCloudClustersResponse>
     */
    public CompletableFuture<RemoveMultiCloudClustersResponse> removeMultiCloudClustersAsync(
        RemoveMultiCloudClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.removeMultiCloudClusters);
    }

    /**
     * 删除多云集群
     *
     * 删除多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveMultiCloudClustersRequest 请求对象
     * @return AsyncInvoker<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse>
     */
    public AsyncInvoker<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse> removeMultiCloudClustersAsyncInvoker(
        RemoveMultiCloudClustersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.removeMultiCloudClusters, hcClient);
    }

    /**
     * 获取部署模板
     *
     * 获取部署模板，在安装Daemonset的时候提供选择
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDeployTemplateRequest 请求对象
     * @return CompletableFuture<ShowAgentDaemonsetDeployTemplateResponse>
     */
    public CompletableFuture<ShowAgentDaemonsetDeployTemplateResponse> showAgentDaemonsetDeployTemplateAsync(
        ShowAgentDaemonsetDeployTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAgentDaemonsetDeployTemplate);
    }

    /**
     * 获取部署模板
     *
     * 获取部署模板，在安装Daemonset的时候提供选择
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDeployTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse>
     */
    public AsyncInvoker<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse> showAgentDaemonsetDeployTemplateAsyncInvoker(
        ShowAgentDaemonsetDeployTemplateRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAgentDaemonsetDeployTemplate, hcClient);
    }

    /**
     * 获取集群daemonset信息
     *
     * 获取集群daemonset信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDetailInfoRequest 请求对象
     * @return CompletableFuture<ShowAgentDaemonsetDetailInfoResponse>
     */
    public CompletableFuture<ShowAgentDaemonsetDetailInfoResponse> showAgentDaemonsetDetailInfoAsync(
        ShowAgentDaemonsetDetailInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAgentDaemonsetDetailInfo);
    }

    /**
     * 获取集群daemonset信息
     *
     * 获取集群daemonset信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDetailInfoRequest 请求对象
     * @return AsyncInvoker<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse>
     */
    public AsyncInvoker<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse> showAgentDaemonsetDetailInfoAsyncInvoker(
        ShowAgentDaemonsetDetailInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAgentDaemonsetDetailInfo, hcClient);
    }

    /**
     * 查询CI/CD配置信息
     *
     * 查询CI/CD配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCicdConfigurationRequest 请求对象
     * @return CompletableFuture<ShowCicdConfigurationResponse>
     */
    public CompletableFuture<ShowCicdConfigurationResponse> showCicdConfigurationAsync(
        ShowCicdConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showCicdConfiguration);
    }

    /**
     * 查询CI/CD配置信息
     *
     * 查询CI/CD配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCicdConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse>
     */
    public AsyncInvoker<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse> showCicdConfigurationAsyncInvoker(
        ShowCicdConfigurationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showCicdConfiguration, hcClient);
    }

    /**
     * 获取扫描组件镜像上传指令
     *
     * 获取镜像上传指令，上传的镜像是“镜像仓接入功能”和“镜像仓扫描功能”需要的组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageUploadCommandRequest 请求对象
     * @return CompletableFuture<ShowImageUploadCommandResponse>
     */
    public CompletableFuture<ShowImageUploadCommandResponse> showImageUploadCommandAsync(
        ShowImageUploadCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showImageUploadCommand);
    }

    /**
     * 获取扫描组件镜像上传指令
     *
     * 获取镜像上传指令，上传的镜像是“镜像仓接入功能”和“镜像仓扫描功能”需要的组件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageUploadCommandRequest 请求对象
     * @return AsyncInvoker<ShowImageUploadCommandRequest, ShowImageUploadCommandResponse>
     */
    public AsyncInvoker<ShowImageUploadCommandRequest, ShowImageUploadCommandResponse> showImageUploadCommandAsyncInvoker(
        ShowImageUploadCommandRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showImageUploadCommand, hcClient);
    }

    /**
     * 获取多云集群的账号权限
     *
     * 获取多云集群的账号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterAuthRequest 请求对象
     * @return CompletableFuture<ShowMultiCloudClusterAuthResponse>
     */
    public CompletableFuture<ShowMultiCloudClusterAuthResponse> showMultiCloudClusterAuthAsync(
        ShowMultiCloudClusterAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMultiCloudClusterAuth);
    }

    /**
     * 获取多云集群的账号权限
     *
     * 获取多云集群的账号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterAuthRequest 请求对象
     * @return AsyncInvoker<ShowMultiCloudClusterAuthRequest, ShowMultiCloudClusterAuthResponse>
     */
    public AsyncInvoker<ShowMultiCloudClusterAuthRequest, ShowMultiCloudClusterAuthResponse> showMultiCloudClusterAuthAsyncInvoker(
        ShowMultiCloudClusterAuthRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMultiCloudClusterAuth, hcClient);
    }

    /**
     * 获取多云集群的上传镜像指令
     *
     * 获取多云集群的上传镜像指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterImageCommandRequest 请求对象
     * @return CompletableFuture<ShowMultiCloudClusterImageCommandResponse>
     */
    public CompletableFuture<ShowMultiCloudClusterImageCommandResponse> showMultiCloudClusterImageCommandAsync(
        ShowMultiCloudClusterImageCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMultiCloudClusterImageCommand);
    }

    /**
     * 获取多云集群的上传镜像指令
     *
     * 获取多云集群的上传镜像指令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterImageCommandRequest 请求对象
     * @return AsyncInvoker<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse>
     */
    public AsyncInvoker<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse> showMultiCloudClusterImageCommandAsyncInvoker(
        ShowMultiCloudClusterImageCommandRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMultiCloudClusterImageCommand, hcClient);
    }

    /**
     * 获取多云集群的代理安装脚本
     *
     * 获取多云集群的代理安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterProxyScriptRequest 请求对象
     * @return CompletableFuture<ShowMultiCloudClusterProxyScriptResponse>
     */
    public CompletableFuture<ShowMultiCloudClusterProxyScriptResponse> showMultiCloudClusterProxyScriptAsync(
        ShowMultiCloudClusterProxyScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMultiCloudClusterProxyScript);
    }

    /**
     * 获取多云集群的代理安装脚本
     *
     * 获取多云集群的代理安装脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterProxyScriptRequest 请求对象
     * @return AsyncInvoker<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse>
     */
    public AsyncInvoker<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse> showMultiCloudClusterProxyScriptAsyncInvoker(
        ShowMultiCloudClusterProxyScriptRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMultiCloudClusterProxyScript, hcClient);
    }

    /**
     * 同步多云集群的接入状态
     *
     * 同步多云集群的接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudClusterStatusRequest 请求对象
     * @return CompletableFuture<SyncMultiCloudClusterStatusResponse>
     */
    public CompletableFuture<SyncMultiCloudClusterStatusResponse> syncMultiCloudClusterStatusAsync(
        SyncMultiCloudClusterStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.syncMultiCloudClusterStatus);
    }

    /**
     * 同步多云集群的接入状态
     *
     * 同步多云集群的接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudClusterStatusRequest 请求对象
     * @return AsyncInvoker<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse>
     */
    public AsyncInvoker<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse> syncMultiCloudClusterStatusAsyncInvoker(
        SyncMultiCloudClusterStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.syncMultiCloudClusterStatus, hcClient);
    }

    /**
     * 更新集群daemonset
     *
     * 更新集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentDaemonsetRequest 请求对象
     * @return CompletableFuture<UpdateAgentDaemonsetResponse>
     */
    public CompletableFuture<UpdateAgentDaemonsetResponse> updateAgentDaemonsetAsync(
        UpdateAgentDaemonsetRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateAgentDaemonset);
    }

    /**
     * 更新集群daemonset
     *
     * 更新集群daemonset
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentDaemonsetRequest 请求对象
     * @return AsyncInvoker<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse>
     */
    public AsyncInvoker<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> updateAgentDaemonsetAsyncInvoker(
        UpdateAgentDaemonsetRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateAgentDaemonset, hcClient);
    }

    /**
     * 更新多云集群
     *
     * 更新多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiCloudClustersRequest 请求对象
     * @return CompletableFuture<UpdateMultiCloudClustersResponse>
     */
    public CompletableFuture<UpdateMultiCloudClustersResponse> updateMultiCloudClustersAsync(
        UpdateMultiCloudClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateMultiCloudClusters);
    }

    /**
     * 更新多云集群
     *
     * 更新多云集群
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiCloudClustersRequest 请求对象
     * @return AsyncInvoker<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse>
     */
    public AsyncInvoker<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse> updateMultiCloudClustersAsyncInvoker(
        UpdateMultiCloudClustersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateMultiCloudClusters, hcClient);
    }

    /**
     * 编辑镜像仓接入信息
     *
     * 编辑镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRegistryRequest 请求对象
     * @return CompletableFuture<UpdateRegistryResponse>
     */
    public CompletableFuture<UpdateRegistryResponse> updateRegistryAsync(UpdateRegistryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateRegistry);
    }

    /**
     * 编辑镜像仓接入信息
     *
     * 编辑镜像仓接入信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRegistryRequest 请求对象
     * @return AsyncInvoker<UpdateRegistryRequest, UpdateRegistryResponse>
     */
    public AsyncInvoker<UpdateRegistryRequest, UpdateRegistryResponse> updateRegistryAsyncInvoker(
        UpdateRegistryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateRegistry, hcClient);
    }

    /**
     * 变更文件列表
     *
     * 变更文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileEventsRequest 请求对象
     * @return CompletableFuture<ListFileEventsResponse>
     */
    public CompletableFuture<ListFileEventsResponse> listFileEventsAsync(ListFileEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listFileEvents);
    }

    /**
     * 变更文件列表
     *
     * 变更文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileEventsRequest 请求对象
     * @return AsyncInvoker<ListFileEventsRequest, ListFileEventsResponse>
     */
    public AsyncInvoker<ListFileEventsRequest, ListFileEventsResponse> listFileEventsAsyncInvoker(
        ListFileEventsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listFileEvents, hcClient);
    }

    /**
     * 某个服务器变更文件信息
     *
     * 某个服务器变更文件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostEventDetailsRequest 请求对象
     * @return CompletableFuture<ListFileHostEventDetailsResponse>
     */
    public CompletableFuture<ListFileHostEventDetailsResponse> listFileHostEventDetailsAsync(
        ListFileHostEventDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listFileHostEventDetails);
    }

    /**
     * 某个服务器变更文件信息
     *
     * 某个服务器变更文件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostEventDetailsRequest 请求对象
     * @return AsyncInvoker<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse>
     */
    public AsyncInvoker<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse> listFileHostEventDetailsAsyncInvoker(
        ListFileHostEventDetailsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listFileHostEventDetails, hcClient);
    }

    /**
     * 云服务器变更列表
     *
     * 云服务器变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostsRequest 请求对象
     * @return CompletableFuture<ListFileHostsResponse>
     */
    public CompletableFuture<ListFileHostsResponse> listFileHostsAsync(ListFileHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listFileHosts);
    }

    /**
     * 云服务器变更列表
     *
     * 云服务器变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostsRequest 请求对象
     * @return AsyncInvoker<ListFileHostsRequest, ListFileHostsResponse>
     */
    public AsyncInvoker<ListFileHostsRequest, ListFileHostsResponse> listFileHostsAsyncInvoker(
        ListFileHostsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listFileHosts, hcClient);
    }

    /**
     * 获取服务器文件统计信息
     *
     * 获取服务器文件统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileStatisticRequest 请求对象
     * @return CompletableFuture<ShowFileStatisticResponse>
     */
    public CompletableFuture<ShowFileStatisticResponse> showFileStatisticAsync(ShowFileStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showFileStatistic);
    }

    /**
     * 获取服务器文件统计信息
     *
     * 获取服务器文件统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileStatisticRequest 请求对象
     * @return AsyncInvoker<ShowFileStatisticRequest, ShowFileStatisticResponse>
     */
    public AsyncInvoker<ShowFileStatisticRequest, ShowFileStatisticResponse> showFileStatisticAsyncInvoker(
        ShowFileStatisticRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showFileStatistic, hcClient);
    }

    /**
     * 统计服务器数据
     *
     * 统计服务器数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostsStatisticsRequest 请求对象
     * @return CompletableFuture<ShowHostsStatisticsResponse>
     */
    public CompletableFuture<ShowHostsStatisticsResponse> showHostsStatisticsAsync(ShowHostsStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showHostsStatistics);
    }

    /**
     * 统计服务器数据
     *
     * 统计服务器数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostsStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowHostsStatisticsRequest, ShowHostsStatisticsResponse>
     */
    public AsyncInvoker<ShowHostsStatisticsRequest, ShowHostsStatisticsResponse> showHostsStatisticsAsyncInvoker(
        ShowHostsStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showHostsStatistics, hcClient);
    }

    /**
     * 获取iac文件风险路径列表
     *
     * 获取iac文件风险路径列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRiskPathsRequest 请求对象
     * @return CompletableFuture<ListIacFileRiskPathsResponse>
     */
    public CompletableFuture<ListIacFileRiskPathsResponse> listIacFileRiskPathsAsync(
        ListIacFileRiskPathsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listIacFileRiskPaths);
    }

    /**
     * 获取iac文件风险路径列表
     *
     * 获取iac文件风险路径列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRiskPathsRequest 请求对象
     * @return AsyncInvoker<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse>
     */
    public AsyncInvoker<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse> listIacFileRiskPathsAsyncInvoker(
        ListIacFileRiskPathsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listIacFileRiskPaths, hcClient);
    }

    /**
     * 获取iac文件风险列表
     *
     * 获取iac文件风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRisksRequest 请求对象
     * @return CompletableFuture<ListIacFileRisksResponse>
     */
    public CompletableFuture<ListIacFileRisksResponse> listIacFileRisksAsync(ListIacFileRisksRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listIacFileRisks);
    }

    /**
     * 获取iac文件风险列表
     *
     * 获取iac文件风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRisksRequest 请求对象
     * @return AsyncInvoker<ListIacFileRisksRequest, ListIacFileRisksResponse>
     */
    public AsyncInvoker<ListIacFileRisksRequest, ListIacFileRisksResponse> listIacFileRisksAsyncInvoker(
        ListIacFileRisksRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listIacFileRisks, hcClient);
    }

    /**
     * 获取iac文件列表
     *
     * 获取iac文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFilesRequest 请求对象
     * @return CompletableFuture<ListIacFilesResponse>
     */
    public CompletableFuture<ListIacFilesResponse> listIacFilesAsync(ListIacFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listIacFiles);
    }

    /**
     * 获取iac文件列表
     *
     * 获取iac文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFilesRequest 请求对象
     * @return AsyncInvoker<ListIacFilesRequest, ListIacFilesResponse>
     */
    public AsyncInvoker<ListIacFilesRequest, ListIacFilesResponse> listIacFilesAsyncInvoker(
        ListIacFilesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listIacFiles, hcClient);
    }

    /**
     * 新增镜像白名单
     *
     * 新增镜像白名单，目前仅支持漏洞白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageWhiteListsRequest 请求对象
     * @return CompletableFuture<AddImageWhiteListsResponse>
     */
    public CompletableFuture<AddImageWhiteListsResponse> addImageWhiteListsAsync(AddImageWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addImageWhiteLists);
    }

    /**
     * 新增镜像白名单
     *
     * 新增镜像白名单，目前仅支持漏洞白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageWhiteListsRequest 请求对象
     * @return AsyncInvoker<AddImageWhiteListsRequest, AddImageWhiteListsResponse>
     */
    public AsyncInvoker<AddImageWhiteListsRequest, AddImageWhiteListsResponse> addImageWhiteListsAsyncInvoker(
        AddImageWhiteListsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addImageWhiteLists, hcClient);
    }

    /**
     * 镜像仓库镜像批量扫描
     *
     * 镜像仓库镜像批量扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanSwrImageRequest 请求对象
     * @return CompletableFuture<BatchScanSwrImageResponse>
     */
    public CompletableFuture<BatchScanSwrImageResponse> batchScanSwrImageAsync(BatchScanSwrImageRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchScanSwrImage);
    }

    /**
     * 镜像仓库镜像批量扫描
     *
     * 镜像仓库镜像批量扫描
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanSwrImageRequest 请求对象
     * @return AsyncInvoker<BatchScanSwrImageRequest, BatchScanSwrImageResponse>
     */
    public AsyncInvoker<BatchScanSwrImageRequest, BatchScanSwrImageResponse> batchScanSwrImageAsyncInvoker(
        BatchScanSwrImageRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchScanSwrImage, hcClient);
    }

    /**
     * 修改镜像白名单配置信息
     *
     * 修改镜像白名单配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeImageWhiteListRequest 请求对象
     * @return CompletableFuture<ChangeImageWhiteListResponse>
     */
    public CompletableFuture<ChangeImageWhiteListResponse> changeImageWhiteListAsync(
        ChangeImageWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeImageWhiteList);
    }

    /**
     * 修改镜像白名单配置信息
     *
     * 修改镜像白名单配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeImageWhiteListRequest 请求对象
     * @return AsyncInvoker<ChangeImageWhiteListRequest, ChangeImageWhiteListResponse>
     */
    public AsyncInvoker<ChangeImageWhiteListRequest, ChangeImageWhiteListResponse> changeImageWhiteListAsyncInvoker(
        ChangeImageWhiteListRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeImageWhiteList, hcClient);
    }

    /**
     * 删除镜像白名单
     *
     * 删除镜像白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageWhiteListsRequest 请求对象
     * @return CompletableFuture<DeleteImageWhiteListsResponse>
     */
    public CompletableFuture<DeleteImageWhiteListsResponse> deleteImageWhiteListsAsync(
        DeleteImageWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteImageWhiteLists);
    }

    /**
     * 删除镜像白名单
     *
     * 删除镜像白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageWhiteListsRequest 请求对象
     * @return AsyncInvoker<DeleteImageWhiteListsRequest, DeleteImageWhiteListsResponse>
     */
    public AsyncInvoker<DeleteImageWhiteListsRequest, DeleteImageWhiteListsResponse> deleteImageWhiteListsAsyncInvoker(
        DeleteImageWhiteListsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteImageWhiteLists, hcClient);
    }

    /**
     * 处置镜像漏洞
     *
     * 处置镜像漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleImageVulnerabilityRequest 请求对象
     * @return CompletableFuture<HandleImageVulnerabilityResponse>
     */
    public CompletableFuture<HandleImageVulnerabilityResponse> handleImageVulnerabilityAsync(
        HandleImageVulnerabilityRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.handleImageVulnerability);
    }

    /**
     * 处置镜像漏洞
     *
     * 处置镜像漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleImageVulnerabilityRequest 请求对象
     * @return AsyncInvoker<HandleImageVulnerabilityRequest, HandleImageVulnerabilityResponse>
     */
    public AsyncInvoker<HandleImageVulnerabilityRequest, HandleImageVulnerabilityResponse> handleImageVulnerabilityAsyncInvoker(
        HandleImageVulnerabilityRequest request) {
        return new AsyncInvoker<>(request, HssMeta.handleImageVulnerability, hcClient);
    }

    /**
     * 查询容器镜像操作日志
     *
     * 查询容器镜像操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImageLogsRequest 请求对象
     * @return CompletableFuture<ListContainerImageLogsResponse>
     */
    public CompletableFuture<ListContainerImageLogsResponse> listContainerImageLogsAsync(
        ListContainerImageLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerImageLogs);
    }

    /**
     * 查询容器镜像操作日志
     *
     * 查询容器镜像操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImageLogsRequest 请求对象
     * @return AsyncInvoker<ListContainerImageLogsRequest, ListContainerImageLogsResponse>
     */
    public AsyncInvoker<ListContainerImageLogsRequest, ListContainerImageLogsResponse> listContainerImageLogsAsyncInvoker(
        ListContainerImageLogsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerImageLogs, hcClient);
    }

    /**
     * 查询容器镜像列表
     *
     * 查询容器镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImagesRequest 请求对象
     * @return CompletableFuture<ListContainerImagesResponse>
     */
    public CompletableFuture<ListContainerImagesResponse> listContainerImagesAsync(ListContainerImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listContainerImages);
    }

    /**
     * 查询容器镜像列表
     *
     * 查询容器镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImagesRequest 请求对象
     * @return AsyncInvoker<ListContainerImagesRequest, ListContainerImagesResponse>
     */
    public AsyncInvoker<ListContainerImagesRequest, ListContainerImagesResponse> listContainerImagesAsyncInvoker(
        ListContainerImagesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listContainerImages, hcClient);
    }

    /**
     * 查询镜像软件列表
     *
     * 查询镜像软件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAppsRequest 请求对象
     * @return CompletableFuture<ListImageAppsResponse>
     */
    public CompletableFuture<ListImageAppsResponse> listImageAppsAsync(ListImageAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageApps);
    }

    /**
     * 查询镜像软件列表
     *
     * 查询镜像软件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAppsRequest 请求对象
     * @return AsyncInvoker<ListImageAppsRequest, ListImageAppsResponse>
     */
    public AsyncInvoker<ListImageAppsRequest, ListImageAppsResponse> listImageAppsAsyncInvoker(
        ListImageAppsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageApps, hcClient);
    }

    /**
     * 查询镜像漏洞处置操作影响的漏洞列表
     *
     * 查询镜像漏洞处置操作影响的漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageHandleAffectVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListImageHandleAffectVulnerabilitiesResponse>
     */
    public CompletableFuture<ListImageHandleAffectVulnerabilitiesResponse> listImageHandleAffectVulnerabilitiesAsync(
        ListImageHandleAffectVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageHandleAffectVulnerabilities);
    }

    /**
     * 查询镜像漏洞处置操作影响的漏洞列表
     *
     * 查询镜像漏洞处置操作影响的漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageHandleAffectVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListImageHandleAffectVulnerabilitiesRequest, ListImageHandleAffectVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListImageHandleAffectVulnerabilitiesRequest, ListImageHandleAffectVulnerabilitiesResponse> listImageHandleAffectVulnerabilitiesAsyncInvoker(
        ListImageHandleAffectVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageHandleAffectVulnerabilities, hcClient);
    }

    /**
     * 本地镜像列表查询
     *
     * 本地镜像列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageLocalRequest 请求对象
     * @return CompletableFuture<ListImageLocalResponse>
     */
    public CompletableFuture<ListImageLocalResponse> listImageLocalAsync(ListImageLocalRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageLocal);
    }

    /**
     * 本地镜像列表查询
     *
     * 本地镜像列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageLocalRequest 请求对象
     * @return AsyncInvoker<ListImageLocalRequest, ListImageLocalResponse>
     */
    public AsyncInvoker<ListImageLocalRequest, ListImageLocalResponse> listImageLocalAsyncInvoker(
        ListImageLocalRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageLocal, hcClient);
    }

    /**
     * 查询镜像指定安全配置项的检查项列表
     *
     * 查询镜像指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigRulesRequest 请求对象
     * @return CompletableFuture<ListImageRiskConfigRulesResponse>
     */
    public CompletableFuture<ListImageRiskConfigRulesResponse> listImageRiskConfigRulesAsync(
        ListImageRiskConfigRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageRiskConfigRules);
    }

    /**
     * 查询镜像指定安全配置项的检查项列表
     *
     * 查询镜像指定安全配置项的检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigRulesRequest 请求对象
     * @return AsyncInvoker<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse>
     */
    public AsyncInvoker<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> listImageRiskConfigRulesAsyncInvoker(
        ListImageRiskConfigRulesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageRiskConfigRules, hcClient);
    }

    /**
     * 查询镜像安全配置检测结果列表
     *
     * 查询镜像安全配置检测结果列表，当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigsRequest 请求对象
     * @return CompletableFuture<ListImageRiskConfigsResponse>
     */
    public CompletableFuture<ListImageRiskConfigsResponse> listImageRiskConfigsAsync(
        ListImageRiskConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageRiskConfigs);
    }

    /**
     * 查询镜像安全配置检测结果列表
     *
     * 查询镜像安全配置检测结果列表，当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigsRequest 请求对象
     * @return AsyncInvoker<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse>
     */
    public AsyncInvoker<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> listImageRiskConfigsAsyncInvoker(
        ListImageRiskConfigsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageRiskConfigs, hcClient);
    }

    /**
     * 查询镜像的漏洞信息
     *
     * 查询镜像的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListImageVulnerabilitiesResponse>
     */
    public CompletableFuture<ListImageVulnerabilitiesResponse> listImageVulnerabilitiesAsync(
        ListImageVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageVulnerabilities);
    }

    /**
     * 查询镜像的漏洞信息
     *
     * 查询镜像的漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> listImageVulnerabilitiesAsyncInvoker(
        ListImageVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageVulnerabilities, hcClient);
    }

    /**
     * 查询镜像白名单列表
     *
     * 查询镜像白名单列表，目前仅支持漏洞白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWhiteListsRequest 请求对象
     * @return CompletableFuture<ListImageWhiteListsResponse>
     */
    public CompletableFuture<ListImageWhiteListsResponse> listImageWhiteListsAsync(ListImageWhiteListsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageWhiteLists);
    }

    /**
     * 查询镜像白名单列表
     *
     * 查询镜像白名单列表，目前仅支持漏洞白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWhiteListsRequest 请求对象
     * @return AsyncInvoker<ListImageWhiteListsRequest, ListImageWhiteListsResponse>
     */
    public AsyncInvoker<ListImageWhiteListsRequest, ListImageWhiteListsResponse> listImageWhiteListsAsyncInvoker(
        ListImageWhiteListsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageWhiteLists, hcClient);
    }

    /**
     * 查询swr镜像仓库镜像列表-接口已废弃，不再推荐使用
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwrImageRepositoryRequest 请求对象
     * @return CompletableFuture<ListSwrImageRepositoryResponse>
     */
    public CompletableFuture<ListSwrImageRepositoryResponse> listSwrImageRepositoryAsync(
        ListSwrImageRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSwrImageRepository);
    }

    /**
     * 查询swr镜像仓库镜像列表-接口已废弃，不再推荐使用
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwrImageRepositoryRequest 请求对象
     * @return AsyncInvoker<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse>
     */
    public AsyncInvoker<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> listSwrImageRepositoryAsyncInvoker(
        ListSwrImageRepositoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSwrImageRepository, hcClient);
    }

    /**
     * 查看受漏洞影响镜像的软件信息
     *
     * 查看受漏洞影响镜像的软件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageAppsRequest 请求对象
     * @return CompletableFuture<ListVulAffectImageAppsResponse>
     */
    public CompletableFuture<ListVulAffectImageAppsResponse> listVulAffectImageAppsAsync(
        ListVulAffectImageAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulAffectImageApps);
    }

    /**
     * 查看受漏洞影响镜像的软件信息
     *
     * 查看受漏洞影响镜像的软件信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageAppsRequest 请求对象
     * @return AsyncInvoker<ListVulAffectImageAppsRequest, ListVulAffectImageAppsResponse>
     */
    public AsyncInvoker<ListVulAffectImageAppsRequest, ListVulAffectImageAppsResponse> listVulAffectImageAppsAsyncInvoker(
        ListVulAffectImageAppsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulAffectImageApps, hcClient);
    }

    /**
     * 查看受漏洞影响镜像的关联容器信息
     *
     * 查看受漏洞影响镜像的关联容器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageContainersRequest 请求对象
     * @return CompletableFuture<ListVulAffectImageContainersResponse>
     */
    public CompletableFuture<ListVulAffectImageContainersResponse> listVulAffectImageContainersAsync(
        ListVulAffectImageContainersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulAffectImageContainers);
    }

    /**
     * 查看受漏洞影响镜像的关联容器信息
     *
     * 查看受漏洞影响镜像的关联容器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageContainersRequest 请求对象
     * @return AsyncInvoker<ListVulAffectImageContainersRequest, ListVulAffectImageContainersResponse>
     */
    public AsyncInvoker<ListVulAffectImageContainersRequest, ListVulAffectImageContainersResponse> listVulAffectImageContainersAsyncInvoker(
        ListVulAffectImageContainersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulAffectImageContainers, hcClient);
    }

    /**
     * 查看受漏洞影响的镜像列表
     *
     * 查看受漏洞影响的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImagesRequest 请求对象
     * @return CompletableFuture<ListVulAffectImagesResponse>
     */
    public CompletableFuture<ListVulAffectImagesResponse> listVulAffectImagesAsync(ListVulAffectImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulAffectImages);
    }

    /**
     * 查看受漏洞影响的镜像列表
     *
     * 查看受漏洞影响的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImagesRequest 请求对象
     * @return AsyncInvoker<ListVulAffectImagesRequest, ListVulAffectImagesResponse>
     */
    public AsyncInvoker<ListVulAffectImagesRequest, ListVulAffectImagesResponse> listVulAffectImagesAsyncInvoker(
        ListVulAffectImagesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulAffectImages, hcClient);
    }

    /**
     * 漏洞对应cve信息
     *
     * 漏洞对应cve信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilityCveRequest 请求对象
     * @return CompletableFuture<ListVulnerabilityCveResponse>
     */
    public CompletableFuture<ListVulnerabilityCveResponse> listVulnerabilityCveAsync(
        ListVulnerabilityCveRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulnerabilityCve);
    }

    /**
     * 漏洞对应cve信息
     *
     * 漏洞对应cve信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilityCveRequest 请求对象
     * @return AsyncInvoker<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse>
     */
    public AsyncInvoker<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> listVulnerabilityCveAsyncInvoker(
        ListVulnerabilityCveRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulnerabilityCve, hcClient);
    }

    /**
     * 从SWR服务同步镜像列表
     *
     * 从SWR服务同步镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunImageSynchronizeRequest 请求对象
     * @return CompletableFuture<RunImageSynchronizeResponse>
     */
    public CompletableFuture<RunImageSynchronizeResponse> runImageSynchronizeAsync(RunImageSynchronizeRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.runImageSynchronize);
    }

    /**
     * 从SWR服务同步镜像列表
     *
     * 从SWR服务同步镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunImageSynchronizeRequest 请求对象
     * @return AsyncInvoker<RunImageSynchronizeRequest, RunImageSynchronizeResponse>
     */
    public AsyncInvoker<RunImageSynchronizeRequest, RunImageSynchronizeResponse> runImageSynchronizeAsyncInvoker(
        RunImageSynchronizeRequest request) {
        return new AsyncInvoker<>(request, HssMeta.runImageSynchronize, hcClient);
    }

    /**
     * 容器资产-镜像统计
     *
     * 容器资产-镜像统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageAssetStatisticsRequest 请求对象
     * @return CompletableFuture<ShowImageAssetStatisticsResponse>
     */
    public CompletableFuture<ShowImageAssetStatisticsResponse> showImageAssetStatisticsAsync(
        ShowImageAssetStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showImageAssetStatistics);
    }

    /**
     * 容器资产-镜像统计
     *
     * 容器资产-镜像统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageAssetStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse>
     */
    public AsyncInvoker<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse> showImageAssetStatisticsAsyncInvoker(
        ShowImageAssetStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showImageAssetStatistics, hcClient);
    }

    /**
     * 查询镜像配置检查项检测报告
     *
     * 查询镜像配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCheckRuleDetailRequest 请求对象
     * @return CompletableFuture<ShowImageCheckRuleDetailResponse>
     */
    public CompletableFuture<ShowImageCheckRuleDetailResponse> showImageCheckRuleDetailAsync(
        ShowImageCheckRuleDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showImageCheckRuleDetail);
    }

    /**
     * 查询镜像配置检查项检测报告
     *
     * 查询镜像配置检查项检测报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCheckRuleDetailRequest 请求对象
     * @return AsyncInvoker<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse>
     */
    public AsyncInvoker<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> showImageCheckRuleDetailAsyncInvoker(
        ShowImageCheckRuleDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showImageCheckRuleDetail, hcClient);
    }

    /**
     * 查询镜像白名单详情
     *
     * 查询镜像白名单详情，需要分页查询白名单关联的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWhiteListDetailRequest 请求对象
     * @return CompletableFuture<ShowImageWhiteListDetailResponse>
     */
    public CompletableFuture<ShowImageWhiteListDetailResponse> showImageWhiteListDetailAsync(
        ShowImageWhiteListDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showImageWhiteListDetail);
    }

    /**
     * 查询镜像白名单详情
     *
     * 查询镜像白名单详情，需要分页查询白名单关联的镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWhiteListDetailRequest 请求对象
     * @return AsyncInvoker<ShowImageWhiteListDetailRequest, ShowImageWhiteListDetailResponse>
     */
    public AsyncInvoker<ShowImageWhiteListDetailRequest, ShowImageWhiteListDetailResponse> showImageWhiteListDetailAsyncInvoker(
        ShowImageWhiteListDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showImageWhiteListDetail, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageScanTaskRequest 请求对象
     * @return CompletableFuture<CreateManualImageScanTaskResponse>
     */
    public CompletableFuture<CreateManualImageScanTaskResponse> createManualImageScanTaskAsync(
        CreateManualImageScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createManualImageScanTask);
    }

    /**
     * 创建扫描任务
     *
     * 创建扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateManualImageScanTaskRequest, CreateManualImageScanTaskResponse>
     */
    public AsyncInvoker<CreateManualImageScanTaskRequest, CreateManualImageScanTaskResponse> createManualImageScanTaskAsyncInvoker(
        CreateManualImageScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createManualImageScanTask, hcClient);
    }

    /**
     * 获取扫描策略
     *
     * 获取扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanPolicyRequest 请求对象
     * @return CompletableFuture<ListImageScanPolicyResponse>
     */
    public CompletableFuture<ListImageScanPolicyResponse> listImageScanPolicyAsync(ListImageScanPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageScanPolicy);
    }

    /**
     * 获取扫描策略
     *
     * 获取扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanPolicyRequest 请求对象
     * @return AsyncInvoker<ListImageScanPolicyRequest, ListImageScanPolicyResponse>
     */
    public AsyncInvoker<ListImageScanPolicyRequest, ListImageScanPolicyResponse> listImageScanPolicyAsyncInvoker(
        ListImageScanPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageScanPolicy, hcClient);
    }

    /**
     * 获取扫描任务列表
     *
     * 获取扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanTaskRequest 请求对象
     * @return CompletableFuture<ListImageScanTaskResponse>
     */
    public CompletableFuture<ListImageScanTaskResponse> listImageScanTaskAsync(ListImageScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listImageScanTask);
    }

    /**
     * 获取扫描任务列表
     *
     * 获取扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanTaskRequest 请求对象
     * @return AsyncInvoker<ListImageScanTaskRequest, ListImageScanTaskResponse>
     */
    public AsyncInvoker<ListImageScanTaskRequest, ListImageScanTaskResponse> listImageScanTaskAsyncInvoker(
        ListImageScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listImageScanTask, hcClient);
    }

    /**
     * 修改周期扫描策略
     *
     * 修改周期扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyImageScanPolicyRequest 请求对象
     * @return CompletableFuture<ModifyImageScanPolicyResponse>
     */
    public CompletableFuture<ModifyImageScanPolicyResponse> modifyImageScanPolicyAsync(
        ModifyImageScanPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.modifyImageScanPolicy);
    }

    /**
     * 修改周期扫描策略
     *
     * 修改周期扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyImageScanPolicyRequest 请求对象
     * @return AsyncInvoker<ModifyImageScanPolicyRequest, ModifyImageScanPolicyResponse>
     */
    public AsyncInvoker<ModifyImageScanPolicyRequest, ModifyImageScanPolicyResponse> modifyImageScanPolicyAsyncInvoker(
        ModifyImageScanPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.modifyImageScanPolicy, hcClient);
    }

    /**
     * 修改用户的月度运营弹框状态
     *
     * 修改用户的月度运营弹框状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMonthlyOperationReportTipStatusRequest 请求对象
     * @return CompletableFuture<ChangeMonthlyOperationReportTipStatusResponse>
     */
    public CompletableFuture<ChangeMonthlyOperationReportTipStatusResponse> changeMonthlyOperationReportTipStatusAsync(
        ChangeMonthlyOperationReportTipStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeMonthlyOperationReportTipStatus);
    }

    /**
     * 修改用户的月度运营弹框状态
     *
     * 修改用户的月度运营弹框状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMonthlyOperationReportTipStatusRequest 请求对象
     * @return AsyncInvoker<ChangeMonthlyOperationReportTipStatusRequest, ChangeMonthlyOperationReportTipStatusResponse>
     */
    public AsyncInvoker<ChangeMonthlyOperationReportTipStatusRequest, ChangeMonthlyOperationReportTipStatusResponse> changeMonthlyOperationReportTipStatusAsyncInvoker(
        ChangeMonthlyOperationReportTipStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeMonthlyOperationReportTipStatus, hcClient);
    }

    /**
     * 查询月度运营报告列表
     *
     * 查询月度运营报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonthlyOperationReportsRequest 请求对象
     * @return CompletableFuture<ListMonthlyOperationReportsResponse>
     */
    public CompletableFuture<ListMonthlyOperationReportsResponse> listMonthlyOperationReportsAsync(
        ListMonthlyOperationReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listMonthlyOperationReports);
    }

    /**
     * 查询月度运营报告列表
     *
     * 查询月度运营报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonthlyOperationReportsRequest 请求对象
     * @return AsyncInvoker<ListMonthlyOperationReportsRequest, ListMonthlyOperationReportsResponse>
     */
    public AsyncInvoker<ListMonthlyOperationReportsRequest, ListMonthlyOperationReportsResponse> listMonthlyOperationReportsAsyncInvoker(
        ListMonthlyOperationReportsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listMonthlyOperationReports, hcClient);
    }

    /**
     * 查询安全风险列表
     *
     * 查询安全风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRiskRequest 请求对象
     * @return CompletableFuture<ListSecurityRiskResponse>
     */
    public CompletableFuture<ListSecurityRiskResponse> listSecurityRiskAsync(ListSecurityRiskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityRisk);
    }

    /**
     * 查询安全风险列表
     *
     * 查询安全风险列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRiskRequest 请求对象
     * @return AsyncInvoker<ListSecurityRiskRequest, ListSecurityRiskResponse>
     */
    public AsyncInvoker<ListSecurityRiskRequest, ListSecurityRiskResponse> listSecurityRiskAsyncInvoker(
        ListSecurityRiskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSecurityRisk, hcClient);
    }

    /**
     * 查询agent统计数量
     *
     * 查询待升级agent数，在线/离线agent数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsRequest 请求对象
     * @return CompletableFuture<ShowAgentStatisticsResponse>
     */
    public CompletableFuture<ShowAgentStatisticsResponse> showAgentStatisticsAsync(ShowAgentStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showAgentStatistics);
    }

    /**
     * 查询agent统计数量
     *
     * 查询待升级agent数，在线/离线agent数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowAgentStatisticsRequest, ShowAgentStatisticsResponse>
     */
    public AsyncInvoker<ShowAgentStatisticsRequest, ShowAgentStatisticsResponse> showAgentStatisticsAsyncInvoker(
        ShowAgentStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showAgentStatistics, hcClient);
    }

    /**
     * 热点资讯
     *
     * 返回标题，更新时间，资讯级别
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotInformationRequest 请求对象
     * @return CompletableFuture<ShowHotInformationResponse>
     */
    public CompletableFuture<ShowHotInformationResponse> showHotInformationAsync(ShowHotInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showHotInformation);
    }

    /**
     * 热点资讯
     *
     * 返回标题，更新时间，资讯级别
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotInformationRequest 请求对象
     * @return AsyncInvoker<ShowHotInformationRequest, ShowHotInformationResponse>
     */
    public AsyncInvoker<ShowHotInformationRequest, ShowHotInformationResponse> showHotInformationAsyncInvoker(
        ShowHotInformationRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showHotInformation, hcClient);
    }

    /**
     * 查询用户的月度运营弹框状态
     *
     * 查询用户的月度运营弹框状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperaReportNotifyInfoRequest 请求对象
     * @return CompletableFuture<ShowMonthlyOperaReportNotifyInfoResponse>
     */
    public CompletableFuture<ShowMonthlyOperaReportNotifyInfoResponse> showMonthlyOperaReportNotifyInfoAsync(
        ShowMonthlyOperaReportNotifyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMonthlyOperaReportNotifyInfo);
    }

    /**
     * 查询用户的月度运营弹框状态
     *
     * 查询用户的月度运营弹框状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperaReportNotifyInfoRequest 请求对象
     * @return AsyncInvoker<ShowMonthlyOperaReportNotifyInfoRequest, ShowMonthlyOperaReportNotifyInfoResponse>
     */
    public AsyncInvoker<ShowMonthlyOperaReportNotifyInfoRequest, ShowMonthlyOperaReportNotifyInfoResponse> showMonthlyOperaReportNotifyInfoAsyncInvoker(
        ShowMonthlyOperaReportNotifyInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMonthlyOperaReportNotifyInfo, hcClient);
    }

    /**
     * 查询某月月度运营报告的详细信息
     *
     * 查询某月月度运营报告的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperationReportDetailRequest 请求对象
     * @return CompletableFuture<ShowMonthlyOperationReportDetailResponse>
     */
    public CompletableFuture<ShowMonthlyOperationReportDetailResponse> showMonthlyOperationReportDetailAsync(
        ShowMonthlyOperationReportDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showMonthlyOperationReportDetail);
    }

    /**
     * 查询某月月度运营报告的详细信息
     *
     * 查询某月月度运营报告的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperationReportDetailRequest 请求对象
     * @return AsyncInvoker<ShowMonthlyOperationReportDetailRequest, ShowMonthlyOperationReportDetailResponse>
     */
    public AsyncInvoker<ShowMonthlyOperationReportDetailRequest, ShowMonthlyOperationReportDetailResponse> showMonthlyOperationReportDetailAsyncInvoker(
        ShowMonthlyOperationReportDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showMonthlyOperationReportDetail, hcClient);
    }

    /**
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     *
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectStatisticsRequest 请求对象
     * @return CompletableFuture<ShowProtectStatisticsResponse>
     */
    public CompletableFuture<ShowProtectStatisticsResponse> showProtectStatisticsAsync(
        ShowProtectStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showProtectStatistics);
    }

    /**
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     *
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowProtectStatisticsRequest, ShowProtectStatisticsResponse>
     */
    public AsyncInvoker<ShowProtectStatisticsRequest, ShowProtectStatisticsResponse> showProtectStatisticsAsyncInvoker(
        ShowProtectStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showProtectStatistics, hcClient);
    }

    /**
     * 查询风险评分结果
     *
     * 查询风险评分结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskScoreRequest 请求对象
     * @return CompletableFuture<ShowRiskScoreResponse>
     */
    public CompletableFuture<ShowRiskScoreResponse> showRiskScoreAsync(ShowRiskScoreRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRiskScore);
    }

    /**
     * 查询风险评分结果
     *
     * 查询风险评分结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskScoreRequest 请求对象
     * @return AsyncInvoker<ShowRiskScoreRequest, ShowRiskScoreResponse>
     */
    public AsyncInvoker<ShowRiskScoreRequest, ShowRiskScoreResponse> showRiskScoreAsyncInvoker(
        ShowRiskScoreRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRiskScore, hcClient);
    }

    /**
     * 查询月度运营报告福利区公共信息
     *
     * 查询月度运营报告福利区公共信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelfareAreaInfoRequest 请求对象
     * @return CompletableFuture<ShowWelfareAreaInfoResponse>
     */
    public CompletableFuture<ShowWelfareAreaInfoResponse> showWelfareAreaInfoAsync(ShowWelfareAreaInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWelfareAreaInfo);
    }

    /**
     * 查询月度运营报告福利区公共信息
     *
     * 查询月度运营报告福利区公共信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelfareAreaInfoRequest 请求对象
     * @return AsyncInvoker<ShowWelfareAreaInfoRequest, ShowWelfareAreaInfoResponse>
     */
    public AsyncInvoker<ShowWelfareAreaInfoRequest, ShowWelfareAreaInfoResponse> showWelfareAreaInfoAsyncInvoker(
        ShowWelfareAreaInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWelfareAreaInfo, hcClient);
    }

    /**
     * 复制策略组
     *
     * 复制策略组，选择已有的旗舰版或容器版策略组，复制生成新的策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyGroupRequest 请求对象
     * @return CompletableFuture<AddPolicyGroupResponse>
     */
    public CompletableFuture<AddPolicyGroupResponse> addPolicyGroupAsync(AddPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.addPolicyGroup);
    }

    /**
     * 复制策略组
     *
     * 复制策略组，选择已有的旗舰版或容器版策略组，复制生成新的策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyGroupRequest 请求对象
     * @return AsyncInvoker<AddPolicyGroupRequest, AddPolicyGroupResponse>
     */
    public AsyncInvoker<AddPolicyGroupRequest, AddPolicyGroupResponse> addPolicyGroupAsyncInvoker(
        AddPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.addPolicyGroup, hcClient);
    }

    /**
     * 部署策略组
     *
     * 为已经开启旗舰版或容器版防护的服务器部署策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePolicyGroupRequest 请求对象
     * @return CompletableFuture<AssociatePolicyGroupResponse>
     */
    public CompletableFuture<AssociatePolicyGroupResponse> associatePolicyGroupAsync(
        AssociatePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.associatePolicyGroup);
    }

    /**
     * 部署策略组
     *
     * 为已经开启旗舰版或容器版防护的服务器部署策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePolicyGroupRequest 请求对象
     * @return AsyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>
     */
    public AsyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroupAsyncInvoker(
        AssociatePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.associatePolicyGroup, hcClient);
    }

    /**
     * 修改策略组相关内容
     *
     * 修改策略组相关内容，如防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicyGroupRequest 请求对象
     * @return CompletableFuture<ChangePolicyGroupResponse>
     */
    public CompletableFuture<ChangePolicyGroupResponse> changePolicyGroupAsync(ChangePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changePolicyGroup);
    }

    /**
     * 修改策略组相关内容
     *
     * 修改策略组相关内容，如防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicyGroupRequest 请求对象
     * @return AsyncInvoker<ChangePolicyGroupRequest, ChangePolicyGroupResponse>
     */
    public AsyncInvoker<ChangePolicyGroupRequest, ChangePolicyGroupResponse> changePolicyGroupAsyncInvoker(
        ChangePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changePolicyGroup, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除策略组，支持删除非默认并且未关联服务器的策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return CompletableFuture<DeletePolicyGroupResponse>
     */
    public CompletableFuture<DeletePolicyGroupResponse> deletePolicyGroupAsync(DeletePolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除策略组，支持删除非默认并且未关联服务器的策略组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public AsyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupAsyncInvoker(
        DeletePolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return CompletableFuture<ListPolicyGroupResponse>
     */
    public CompletableFuture<ListPolicyGroupResponse> listPolicyGroupAsync(ListPolicyGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public AsyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupAsyncInvoker(
        ListPolicyGroupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listPolicyGroup, hcClient);
    }

    /**
     * 解绑配额
     *
     * 解绑配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHostsQuotaRequest 请求对象
     * @return CompletableFuture<CancelHostsQuotaResponse>
     */
    public CompletableFuture<CancelHostsQuotaResponse> cancelHostsQuotaAsync(CancelHostsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.cancelHostsQuota);
    }

    /**
     * 解绑配额
     *
     * 解绑配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHostsQuotaRequest 请求对象
     * @return AsyncInvoker<CancelHostsQuotaRequest, CancelHostsQuotaResponse>
     */
    public AsyncInvoker<CancelHostsQuotaRequest, CancelHostsQuotaResponse> cancelHostsQuotaAsyncInvoker(
        CancelHostsQuotaRequest request) {
        return new AsyncInvoker<>(request, HssMeta.cancelHostsQuota, hcClient);
    }

    /**
     * HSS服务创建订单订购配额
     *
     * HSS服务创建订单订购配额，只支持包周期计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuotasOrderRequest 请求对象
     * @return CompletableFuture<CreateQuotasOrderResponse>
     */
    public CompletableFuture<CreateQuotasOrderResponse> createQuotasOrderAsync(CreateQuotasOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createQuotasOrder);
    }

    /**
     * HSS服务创建订单订购配额
     *
     * HSS服务创建订单订购配额，只支持包周期计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuotasOrderRequest 请求对象
     * @return AsyncInvoker<CreateQuotasOrderRequest, CreateQuotasOrderResponse>
     */
    public AsyncInvoker<CreateQuotasOrderRequest, CreateQuotasOrderResponse> createQuotasOrderAsyncInvoker(
        CreateQuotasOrderRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createQuotasOrder, hcClient);
    }

    /**
     * 查询资源的锁定状态
     *
     * 按需计费的防护配额转包年/包月过程中，会将防护配额锁定，已锁定的防护配额不支持转包年/包月，通过该接口可查询主机安全防护配额的锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockedStatusRequest 请求对象
     * @return CompletableFuture<ListLockedStatusResponse>
     */
    public CompletableFuture<ListLockedStatusResponse> listLockedStatusAsync(ListLockedStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listLockedStatus);
    }

    /**
     * 查询资源的锁定状态
     *
     * 按需计费的防护配额转包年/包月过程中，会将防护配额锁定，已锁定的防护配额不支持转包年/包月，通过该接口可查询主机安全防护配额的锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockedStatusRequest 请求对象
     * @return AsyncInvoker<ListLockedStatusRequest, ListLockedStatusResponse>
     */
    public AsyncInvoker<ListLockedStatusRequest, ListLockedStatusResponse> listLockedStatusAsyncInvoker(
        ListLockedStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listLockedStatus, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasDetailRequest 请求对象
     * @return CompletableFuture<ListQuotasDetailResponse>
     */
    public CompletableFuture<ListQuotasDetailResponse> listQuotasDetailAsync(ListQuotasDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listQuotasDetail);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasDetailRequest 请求对象
     * @return AsyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>
     */
    public AsyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetailAsyncInvoker(
        ListQuotasDetailRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listQuotasDetail, hcClient);
    }

    /**
     * 批量查询配额ID信息
     *
     * 批量查询配额ID信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceIdsRequest 请求对象
     * @return CompletableFuture<ListResourceIdsResponse>
     */
    public CompletableFuture<ListResourceIdsResponse> listResourceIdsAsync(ListResourceIdsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listResourceIds);
    }

    /**
     * 批量查询配额ID信息
     *
     * 批量查询配额ID信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceIdsRequest 请求对象
     * @return AsyncInvoker<ListResourceIdsRequest, ListResourceIdsResponse>
     */
    public AsyncInvoker<ListResourceIdsRequest, ListResourceIdsResponse> listResourceIdsAsyncInvoker(
        ListResourceIdsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listResourceIds, hcClient);
    }

    /**
     * 查询产商品信息
     *
     * 查询产商品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductdataOfferingInfosRequest 请求对象
     * @return CompletableFuture<ShowProductdataOfferingInfosResponse>
     */
    public CompletableFuture<ShowProductdataOfferingInfosResponse> showProductdataOfferingInfosAsync(
        ShowProductdataOfferingInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showProductdataOfferingInfos);
    }

    /**
     * 查询产商品信息
     *
     * 查询产商品信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductdataOfferingInfosRequest 请求对象
     * @return AsyncInvoker<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse>
     */
    public AsyncInvoker<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> showProductdataOfferingInfosAsyncInvoker(
        ShowProductdataOfferingInfosRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showProductdataOfferingInfos, hcClient);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotasRequest 请求对象
     * @return CompletableFuture<ShowResourceQuotasResponse>
     */
    public CompletableFuture<ShowResourceQuotasResponse> showResourceQuotasAsync(ShowResourceQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showResourceQuotas);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotasRequest 请求对象
     * @return AsyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>
     */
    public AsyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotasAsyncInvoker(
        ShowResourceQuotasRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showResourceQuotas, hcClient);
    }

    /**
     * 查询客户使用的最高版本
     *
     * 查询客户使用的最高版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVersion);
    }

    /**
     * 查询客户使用的最高版本
     *
     * 查询客户使用的最高版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVersion, hcClient);
    }

    /**
     * 创建同步镜像任务
     *
     * 创建同步镜像任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSynchronizeTaskRequest 请求对象
     * @return CompletableFuture<CreateImageSynchronizeTaskResponse>
     */
    public CompletableFuture<CreateImageSynchronizeTaskResponse> createImageSynchronizeTaskAsync(
        CreateImageSynchronizeTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createImageSynchronizeTask);
    }

    /**
     * 创建同步镜像任务
     *
     * 创建同步镜像任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSynchronizeTaskRequest 请求对象
     * @return AsyncInvoker<CreateImageSynchronizeTaskRequest, CreateImageSynchronizeTaskResponse>
     */
    public AsyncInvoker<CreateImageSynchronizeTaskRequest, CreateImageSynchronizeTaskResponse> createImageSynchronizeTaskAsyncInvoker(
        CreateImageSynchronizeTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createImageSynchronizeTask, hcClient);
    }

    /**
     * 查询仓库镜像列表
     *
     * 查询仓库镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryImagesRequest 请求对象
     * @return CompletableFuture<ListRegistryImagesResponse>
     */
    public CompletableFuture<ListRegistryImagesResponse> listRegistryImagesAsync(ListRegistryImagesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listRegistryImages);
    }

    /**
     * 查询仓库镜像列表
     *
     * 查询仓库镜像列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryImagesRequest 请求对象
     * @return AsyncInvoker<ListRegistryImagesRequest, ListRegistryImagesResponse>
     */
    public AsyncInvoker<ListRegistryImagesRequest, ListRegistryImagesResponse> listRegistryImagesAsyncInvoker(
        ListRegistryImagesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listRegistryImages, hcClient);
    }

    /**
     * 查询病毒扫描历史处置记录列表
     *
     * 查询病毒扫描历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntivirusHandleHistoryRequest 请求对象
     * @return CompletableFuture<ListAntivirusHandleHistoryResponse>
     */
    public CompletableFuture<ListAntivirusHandleHistoryResponse> listAntivirusHandleHistoryAsync(
        ListAntivirusHandleHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAntivirusHandleHistory);
    }

    /**
     * 查询病毒扫描历史处置记录列表
     *
     * 查询病毒扫描历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntivirusHandleHistoryRequest 请求对象
     * @return AsyncInvoker<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse>
     */
    public AsyncInvoker<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse> listAntivirusHandleHistoryAsyncInvoker(
        ListAntivirusHandleHistoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAntivirusHandleHistory, hcClient);
    }

    /**
     * 查询告警事件历史处置记录列表
     *
     * 查询告警事件历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventHandleHistoryRequest 请求对象
     * @return CompletableFuture<ListEventHandleHistoryResponse>
     */
    public CompletableFuture<ListEventHandleHistoryResponse> listEventHandleHistoryAsync(
        ListEventHandleHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listEventHandleHistory);
    }

    /**
     * 查询告警事件历史处置记录列表
     *
     * 查询告警事件历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventHandleHistoryRequest 请求对象
     * @return AsyncInvoker<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse>
     */
    public AsyncInvoker<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse> listEventHandleHistoryAsyncInvoker(
        ListEventHandleHistoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listEventHandleHistory, hcClient);
    }

    /**
     * 查询集群的安全体检报告列表
     *
     * 查询集群的安全体检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckClusterReportsRequest 请求对象
     * @return CompletableFuture<ListSecurityCheckClusterReportsResponse>
     */
    public CompletableFuture<ListSecurityCheckClusterReportsResponse> listSecurityCheckClusterReportsAsync(
        ListSecurityCheckClusterReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSecurityCheckClusterReports);
    }

    /**
     * 查询集群的安全体检报告列表
     *
     * 查询集群的安全体检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckClusterReportsRequest 请求对象
     * @return AsyncInvoker<ListSecurityCheckClusterReportsRequest, ListSecurityCheckClusterReportsResponse>
     */
    public AsyncInvoker<ListSecurityCheckClusterReportsRequest, ListSecurityCheckClusterReportsResponse> listSecurityCheckClusterReportsAsyncInvoker(
        ListSecurityCheckClusterReportsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSecurityCheckClusterReports, hcClient);
    }

    /**
     * 查询漏洞历史处置记录列表
     *
     * 查询漏洞历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHandleHistoryRequest 请求对象
     * @return CompletableFuture<ListVulHandleHistoryResponse>
     */
    public CompletableFuture<ListVulHandleHistoryResponse> listVulHandleHistoryAsync(
        ListVulHandleHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHandleHistory);
    }

    /**
     * 查询漏洞历史处置记录列表
     *
     * 查询漏洞历史处置记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHandleHistoryRequest 请求对象
     * @return AsyncInvoker<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse>
     */
    public AsyncInvoker<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse> listVulHandleHistoryAsyncInvoker(
        ListVulHandleHistoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHandleHistory, hcClient);
    }

    /**
     * 查询手动体检状态和进度
     *
     * 查询手动体检状态和进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManualSecurityCheckStatusRequest 请求对象
     * @return CompletableFuture<ShowManualSecurityCheckStatusResponse>
     */
    public CompletableFuture<ShowManualSecurityCheckStatusResponse> showManualSecurityCheckStatusAsync(
        ShowManualSecurityCheckStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showManualSecurityCheckStatus);
    }

    /**
     * 查询手动体检状态和进度
     *
     * 查询手动体检状态和进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManualSecurityCheckStatusRequest 请求对象
     * @return AsyncInvoker<ShowManualSecurityCheckStatusRequest, ShowManualSecurityCheckStatusResponse>
     */
    public AsyncInvoker<ShowManualSecurityCheckStatusRequest, ShowManualSecurityCheckStatusResponse> showManualSecurityCheckStatusAsyncInvoker(
        ShowManualSecurityCheckStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showManualSecurityCheckStatus, hcClient);
    }

    /**
     * 查询集群的安全体检报告信息
     *
     * 查询集群的安全体检报告信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckClusterReportRequest 请求对象
     * @return CompletableFuture<ShowSecurityCheckClusterReportResponse>
     */
    public CompletableFuture<ShowSecurityCheckClusterReportResponse> showSecurityCheckClusterReportAsync(
        ShowSecurityCheckClusterReportRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSecurityCheckClusterReport);
    }

    /**
     * 查询集群的安全体检报告信息
     *
     * 查询集群的安全体检报告信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckClusterReportRequest 请求对象
     * @return AsyncInvoker<ShowSecurityCheckClusterReportRequest, ShowSecurityCheckClusterReportResponse>
     */
    public AsyncInvoker<ShowSecurityCheckClusterReportRequest, ShowSecurityCheckClusterReportResponse> showSecurityCheckClusterReportAsyncInvoker(
        ShowSecurityCheckClusterReportRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSecurityCheckClusterReport, hcClient);
    }

    /**
     * 查询安全体检定时配置信息
     *
     * 查询安全体检定时配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckConfigRequest 请求对象
     * @return CompletableFuture<ShowSecurityCheckConfigResponse>
     */
    public CompletableFuture<ShowSecurityCheckConfigResponse> showSecurityCheckConfigAsync(
        ShowSecurityCheckConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSecurityCheckConfig);
    }

    /**
     * 查询安全体检定时配置信息
     *
     * 查询安全体检定时配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckConfigRequest 请求对象
     * @return AsyncInvoker<ShowSecurityCheckConfigRequest, ShowSecurityCheckConfigResponse>
     */
    public AsyncInvoker<ShowSecurityCheckConfigRequest, ShowSecurityCheckConfigResponse> showSecurityCheckConfigAsyncInvoker(
        ShowSecurityCheckConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSecurityCheckConfig, hcClient);
    }

    /**
     * 查询指定服务器的安全体检报告
     *
     * 查询指定服务器的安全体检报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckHostReportRequest 请求对象
     * @return CompletableFuture<ShowSecurityCheckHostReportResponse>
     */
    public CompletableFuture<ShowSecurityCheckHostReportResponse> showSecurityCheckHostReportAsync(
        ShowSecurityCheckHostReportRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSecurityCheckHostReport);
    }

    /**
     * 查询指定服务器的安全体检报告
     *
     * 查询指定服务器的安全体检报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckHostReportRequest 请求对象
     * @return AsyncInvoker<ShowSecurityCheckHostReportRequest, ShowSecurityCheckHostReportResponse>
     */
    public AsyncInvoker<ShowSecurityCheckHostReportRequest, ShowSecurityCheckHostReportResponse> showSecurityCheckHostReportAsyncInvoker(
        ShowSecurityCheckHostReportRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSecurityCheckHostReport, hcClient);
    }

    /**
     * 启动手动体检
     *
     * 启动手动体检
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualSecurityCheckRequest 请求对象
     * @return CompletableFuture<StartManualSecurityCheckResponse>
     */
    public CompletableFuture<StartManualSecurityCheckResponse> startManualSecurityCheckAsync(
        StartManualSecurityCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.startManualSecurityCheck);
    }

    /**
     * 启动手动体检
     *
     * 启动手动体检
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualSecurityCheckRequest 请求对象
     * @return AsyncInvoker<StartManualSecurityCheckRequest, StartManualSecurityCheckResponse>
     */
    public AsyncInvoker<StartManualSecurityCheckRequest, StartManualSecurityCheckResponse> startManualSecurityCheckAsyncInvoker(
        StartManualSecurityCheckRequest request) {
        return new AsyncInvoker<>(request, HssMeta.startManualSecurityCheck, hcClient);
    }

    /**
     * 取消手动体检
     *
     * 取消手动体检
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopManualSecurityCheckRequest 请求对象
     * @return CompletableFuture<StopManualSecurityCheckResponse>
     */
    public CompletableFuture<StopManualSecurityCheckResponse> stopManualSecurityCheckAsync(
        StopManualSecurityCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.stopManualSecurityCheck);
    }

    /**
     * 取消手动体检
     *
     * 取消手动体检
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopManualSecurityCheckRequest 请求对象
     * @return AsyncInvoker<StopManualSecurityCheckRequest, StopManualSecurityCheckResponse>
     */
    public AsyncInvoker<StopManualSecurityCheckRequest, StopManualSecurityCheckResponse> stopManualSecurityCheckAsyncInvoker(
        StopManualSecurityCheckRequest request) {
        return new AsyncInvoker<>(request, HssMeta.stopManualSecurityCheck, hcClient);
    }

    /**
     * 修改安全体检定时配置信息
     *
     * 修改安全体检定时配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckConfigRequest 请求对象
     * @return CompletableFuture<UpdateSecurityCheckConfigResponse>
     */
    public CompletableFuture<UpdateSecurityCheckConfigResponse> updateSecurityCheckConfigAsync(
        UpdateSecurityCheckConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateSecurityCheckConfig);
    }

    /**
     * 修改安全体检定时配置信息
     *
     * 修改安全体检定时配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckConfigRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityCheckConfigRequest, UpdateSecurityCheckConfigResponse>
     */
    public AsyncInvoker<UpdateSecurityCheckConfigRequest, UpdateSecurityCheckConfigResponse> updateSecurityCheckConfigAsyncInvoker(
        UpdateSecurityCheckConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateSecurityCheckConfig, hcClient);
    }

    /**
     * 修改配置开关状态
     *
     * 修改配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSwitchesStatusRequest 请求对象
     * @return CompletableFuture<ChangeSwitchesStatusResponse>
     */
    public CompletableFuture<ChangeSwitchesStatusResponse> changeSwitchesStatusAsync(
        ChangeSwitchesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeSwitchesStatus);
    }

    /**
     * 修改配置开关状态
     *
     * 修改配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSwitchesStatusRequest 请求对象
     * @return AsyncInvoker<ChangeSwitchesStatusRequest, ChangeSwitchesStatusResponse>
     */
    public AsyncInvoker<ChangeSwitchesStatusRequest, ChangeSwitchesStatusResponse> changeSwitchesStatusAsyncInvoker(
        ChangeSwitchesStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeSwitchesStatus, hcClient);
    }

    /**
     * 查询agent版本信息列表
     *
     * 查询agent版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentVersionRequest 请求对象
     * @return CompletableFuture<ListAgentVersionResponse>
     */
    public CompletableFuture<ListAgentVersionResponse> listAgentVersionAsync(ListAgentVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAgentVersion);
    }

    /**
     * 查询agent版本信息列表
     *
     * 查询agent版本信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentVersionRequest 请求对象
     * @return AsyncInvoker<ListAgentVersionRequest, ListAgentVersionResponse>
     */
    public AsyncInvoker<ListAgentVersionRequest, ListAgentVersionResponse> listAgentVersionAsyncInvoker(
        ListAgentVersionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAgentVersion, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigRequest 请求对象
     * @return CompletableFuture<ListAlarmConfigResponse>
     */
    public CompletableFuture<ListAlarmConfigResponse> listAlarmConfigAsync(ListAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listAlarmConfig);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigRequest 请求对象
     * @return AsyncInvoker<ListAlarmConfigRequest, ListAlarmConfigResponse>
     */
    public AsyncInvoker<ListAlarmConfigRequest, ListAlarmConfigResponse> listAlarmConfigAsyncInvoker(
        ListAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listAlarmConfig, hcClient);
    }

    /**
     * 查询系统配置内容列表
     *
     * 查询系统配置内容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemConfigsRequest 请求对象
     * @return CompletableFuture<ListSystemConfigsResponse>
     */
    public CompletableFuture<ListSystemConfigsResponse> listSystemConfigsAsync(ListSystemConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listSystemConfigs);
    }

    /**
     * 查询系统配置内容列表
     *
     * 查询系统配置内容列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemConfigsRequest 请求对象
     * @return AsyncInvoker<ListSystemConfigsRequest, ListSystemConfigsResponse>
     */
    public AsyncInvoker<ListSystemConfigsRequest, ListSystemConfigsResponse> listSystemConfigsAsyncInvoker(
        ListSystemConfigsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listSystemConfigs, hcClient);
    }

    /**
     * 下载脚本文件
     *
     * 下载脚本文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptFileRequest 请求对象
     * @return CompletableFuture<ShowScriptFileResponse>
     */
    public CompletableFuture<ShowScriptFileResponse> showScriptFileAsync(ShowScriptFileRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showScriptFile);
    }

    /**
     * 下载脚本文件
     *
     * 下载脚本文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptFileRequest 请求对象
     * @return AsyncInvoker<ShowScriptFileRequest, ShowScriptFileResponse>
     */
    public AsyncInvoker<ShowScriptFileRequest, ShowScriptFileResponse> showScriptFileAsyncInvoker(
        ShowScriptFileRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showScriptFile, hcClient);
    }

    /**
     * 获取配置开关状态
     *
     * 获取配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchesStatusRequest 请求对象
     * @return CompletableFuture<ShowSwitchesStatusResponse>
     */
    public CompletableFuture<ShowSwitchesStatusResponse> showSwitchesStatusAsync(ShowSwitchesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showSwitchesStatus);
    }

    /**
     * 获取配置开关状态
     *
     * 获取配置开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchesStatusRequest 请求对象
     * @return AsyncInvoker<ShowSwitchesStatusRequest, ShowSwitchesStatusResponse>
     */
    public AsyncInvoker<ShowSwitchesStatusRequest, ShowSwitchesStatusResponse> showSwitchesStatusAsyncInvoker(
        ShowSwitchesStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showSwitchesStatus, hcClient);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlarmConfigResponse>
     */
    public CompletableFuture<UpdateAlarmConfigResponse> updateAlarmConfigAsync(UpdateAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateAlarmConfig);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public AsyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigAsyncInvoker(
        UpdateAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createTask, hcClient);
    }

    /**
     * 查询当前任务关联的资源列表
     *
     * 查询当前任务关联的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskResourcesRequest 请求对象
     * @return CompletableFuture<ListTaskResourcesResponse>
     */
    public CompletableFuture<ListTaskResourcesResponse> listTaskResourcesAsync(ListTaskResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listTaskResources);
    }

    /**
     * 查询当前任务关联的资源列表
     *
     * 查询当前任务关联的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskResourcesRequest 请求对象
     * @return AsyncInvoker<ListTaskResourcesRequest, ListTaskResourcesResponse>
     */
    public AsyncInvoker<ListTaskResourcesRequest, ListTaskResourcesResponse> listTaskResourcesAsyncInvoker(
        ListTaskResourcesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listTaskResources, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listTasks, hcClient);
    }

    /**
     * 查询任务统计数据
     *
     * 查询任务统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatisticsRequest 请求对象
     * @return CompletableFuture<ShowTaskStatisticsResponse>
     */
    public CompletableFuture<ShowTaskStatisticsResponse> showTaskStatisticsAsync(ShowTaskStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showTaskStatistics);
    }

    /**
     * 查询任务统计数据
     *
     * 查询任务统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse>
     */
    public AsyncInvoker<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse> showTaskStatisticsAsyncInvoker(
        ShowTaskStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showTaskStatistics, hcClient);
    }

    /**
     * 修改漏洞扫描策略
     *
     * 修改漏洞扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulScanPolicyRequest 请求对象
     * @return CompletableFuture<ChangeVulScanPolicyResponse>
     */
    public CompletableFuture<ChangeVulScanPolicyResponse> changeVulScanPolicyAsync(ChangeVulScanPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeVulScanPolicy);
    }

    /**
     * 修改漏洞扫描策略
     *
     * 修改漏洞扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulScanPolicyRequest 请求对象
     * @return AsyncInvoker<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse>
     */
    public AsyncInvoker<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> changeVulScanPolicyAsyncInvoker(
        ChangeVulScanPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeVulScanPolicy, hcClient);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulStatusRequest 请求对象
     * @return CompletableFuture<ChangeVulStatusResponse>
     */
    public CompletableFuture<ChangeVulStatusResponse> changeVulStatusAsync(ChangeVulStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.changeVulStatus);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulStatusRequest 请求对象
     * @return AsyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>
     */
    public AsyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatusAsyncInvoker(
        ChangeVulStatusRequest request) {
        return new AsyncInvoker<>(request, HssMeta.changeVulStatus, hcClient);
    }

    /**
     * 创建漏洞扫描任务
     *
     * 创建漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVulnerabilityScanTaskRequest 请求对象
     * @return CompletableFuture<CreateVulnerabilityScanTaskResponse>
     */
    public CompletableFuture<CreateVulnerabilityScanTaskResponse> createVulnerabilityScanTaskAsync(
        CreateVulnerabilityScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.createVulnerabilityScanTask);
    }

    /**
     * 创建漏洞扫描任务
     *
     * 创建漏洞扫描任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVulnerabilityScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse>
     */
    public AsyncInvoker<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> createVulnerabilityScanTaskAsyncInvoker(
        CreateVulnerabilityScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.createVulnerabilityScanTask, hcClient);
    }

    /**
     * 创建历史处理的漏洞导出任务
     *
     * 创建历史处理的漏洞导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportHandledVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ExportHandledVulnerabilitiesResponse>
     */
    public CompletableFuture<ExportHandledVulnerabilitiesResponse> exportHandledVulnerabilitiesAsync(
        ExportHandledVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportHandledVulnerabilities);
    }

    /**
     * 创建历史处理的漏洞导出任务
     *
     * 创建历史处理的漏洞导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportHandledVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse>
     */
    public AsyncInvoker<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse> exportHandledVulnerabilitiesAsyncInvoker(
        ExportHandledVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportHandledVulnerabilities, hcClient);
    }

    /**
     * 创建漏洞处置历史记录的导出任务
     *
     * 创建漏洞处置历史记录的导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulHandleHistoryRequest 请求对象
     * @return CompletableFuture<ExportVulHandleHistoryResponse>
     */
    public CompletableFuture<ExportVulHandleHistoryResponse> exportVulHandleHistoryAsync(
        ExportVulHandleHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportVulHandleHistory);
    }

    /**
     * 创建漏洞处置历史记录的导出任务
     *
     * 创建漏洞处置历史记录的导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulHandleHistoryRequest 请求对象
     * @return AsyncInvoker<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse>
     */
    public AsyncInvoker<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse> exportVulHandleHistoryAsyncInvoker(
        ExportVulHandleHistoryRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportVulHandleHistory, hcClient);
    }

    /**
     * 导出漏洞及漏洞影响的主机的相关信息
     *
     * 导出漏洞及漏洞影响的主机的相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulsRequest 请求对象
     * @return CompletableFuture<ExportVulsResponse>
     */
    public CompletableFuture<ExportVulsResponse> exportVulsAsync(ExportVulsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportVuls);
    }

    /**
     * 导出漏洞及漏洞影响的主机的相关信息
     *
     * 导出漏洞及漏洞影响的主机的相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulsRequest 请求对象
     * @return AsyncInvoker<ExportVulsRequest, ExportVulsResponse>
     */
    public AsyncInvoker<ExportVulsRequest, ExportVulsResponse> exportVulsAsyncInvoker(ExportVulsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportVuls, hcClient);
    }

    /**
     * 处理的漏洞
     *
     * 查询今日处理漏洞/累计处理漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleVulsRequest 请求对象
     * @return CompletableFuture<ListHandleVulsResponse>
     */
    public CompletableFuture<ListHandleVulsResponse> listHandleVulsAsync(ListHandleVulsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHandleVuls);
    }

    /**
     * 处理的漏洞
     *
     * 查询今日处理漏洞/累计处理漏洞
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleVulsRequest 请求对象
     * @return AsyncInvoker<ListHandleVulsRequest, ListHandleVulsResponse>
     */
    public AsyncInvoker<ListHandleVulsRequest, ListHandleVulsResponse> listHandleVulsAsyncInvoker(
        ListHandleVulsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHandleVuls, hcClient);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostVulsRequest 请求对象
     * @return CompletableFuture<ListHostVulsResponse>
     */
    public CompletableFuture<ListHostVulsResponse> listHostVulsAsync(ListHostVulsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostVuls);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostVulsRequest 请求对象
     * @return AsyncInvoker<ListHostVulsRequest, ListHostVulsResponse>
     */
    public AsyncInvoker<ListHostVulsRequest, ListHostVulsResponse> listHostVulsAsyncInvoker(
        ListHostVulsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostVuls, hcClient);
    }

    /**
     * 查询单个漏洞影响的容器app信息
     *
     * 查询单个漏洞影响的容器app信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainerAppsRequest 请求对象
     * @return CompletableFuture<ListVulContainerAppsResponse>
     */
    public CompletableFuture<ListVulContainerAppsResponse> listVulContainerAppsAsync(
        ListVulContainerAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulContainerApps);
    }

    /**
     * 查询单个漏洞影响的容器app信息
     *
     * 查询单个漏洞影响的容器app信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainerAppsRequest 请求对象
     * @return AsyncInvoker<ListVulContainerAppsRequest, ListVulContainerAppsResponse>
     */
    public AsyncInvoker<ListVulContainerAppsRequest, ListVulContainerAppsResponse> listVulContainerAppsAsyncInvoker(
        ListVulContainerAppsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulContainerApps, hcClient);
    }

    /**
     * 查询单个漏洞影响的容器信息
     *
     * 查询单个漏洞影响的容器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainersRequest 请求对象
     * @return CompletableFuture<ListVulContainersResponse>
     */
    public CompletableFuture<ListVulContainersResponse> listVulContainersAsync(ListVulContainersRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulContainers);
    }

    /**
     * 查询单个漏洞影响的容器信息
     *
     * 查询单个漏洞影响的容器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainersRequest 请求对象
     * @return AsyncInvoker<ListVulContainersRequest, ListVulContainersResponse>
     */
    public AsyncInvoker<ListVulContainersRequest, ListVulContainersResponse> listVulContainersAsyncInvoker(
        ListVulContainersRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulContainers, hcClient);
    }

    /**
     * 查询受影响服务器详情-软件列表
     *
     * 查询受影响服务器详情-软件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostAppsRequest 请求对象
     * @return CompletableFuture<ListVulHostAppsResponse>
     */
    public CompletableFuture<ListVulHostAppsResponse> listVulHostAppsAsync(ListVulHostAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHostApps);
    }

    /**
     * 查询受影响服务器详情-软件列表
     *
     * 查询受影响服务器详情-软件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostAppsRequest 请求对象
     * @return AsyncInvoker<ListVulHostAppsRequest, ListVulHostAppsResponse>
     */
    public AsyncInvoker<ListVulHostAppsRequest, ListVulHostAppsResponse> listVulHostAppsAsyncInvoker(
        ListVulHostAppsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHostApps, hcClient);
    }

    /**
     * 查询可回滚的备份列表
     *
     * 查询可回滚的备份列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostBackupsRequest 请求对象
     * @return CompletableFuture<ListVulHostBackupsResponse>
     */
    public CompletableFuture<ListVulHostBackupsResponse> listVulHostBackupsAsync(ListVulHostBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHostBackups);
    }

    /**
     * 查询可回滚的备份列表
     *
     * 查询可回滚的备份列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostBackupsRequest 请求对象
     * @return AsyncInvoker<ListVulHostBackupsRequest, ListVulHostBackupsResponse>
     */
    public AsyncInvoker<ListVulHostBackupsRequest, ListVulHostBackupsResponse> listVulHostBackupsAsyncInvoker(
        ListVulHostBackupsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHostBackups, hcClient);
    }

    /**
     * 查询受影响服务器详情-进程列表
     *
     * 查询受影响服务器详情-进程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostProcessRequest 请求对象
     * @return CompletableFuture<ListVulHostProcessResponse>
     */
    public CompletableFuture<ListVulHostProcessResponse> listVulHostProcessAsync(ListVulHostProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHostProcess);
    }

    /**
     * 查询受影响服务器详情-进程列表
     *
     * 查询受影响服务器详情-进程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostProcessRequest 请求对象
     * @return AsyncInvoker<ListVulHostProcessRequest, ListVulHostProcessResponse>
     */
    public AsyncInvoker<ListVulHostProcessRequest, ListVulHostProcessResponse> listVulHostProcessAsyncInvoker(
        ListVulHostProcessRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHostProcess, hcClient);
    }

    /**
     * 查询处理对应的主机存储库的列表
     *
     * 查询处理对应的主机存储库的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVaultsRequest 请求对象
     * @return CompletableFuture<ListVulHostVaultsResponse>
     */
    public CompletableFuture<ListVulHostVaultsResponse> listVulHostVaultsAsync(ListVulHostVaultsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHostVaults);
    }

    /**
     * 查询处理对应的主机存储库的列表
     *
     * 查询处理对应的主机存储库的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVaultsRequest 请求对象
     * @return AsyncInvoker<ListVulHostVaultsRequest, ListVulHostVaultsResponse>
     */
    public AsyncInvoker<ListVulHostVaultsRequest, ListVulHostVaultsResponse> listVulHostVaultsAsyncInvoker(
        ListVulHostVaultsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHostVaults, hcClient);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostsRequest 请求对象
     * @return CompletableFuture<ListVulHostsResponse>
     */
    public CompletableFuture<ListVulHostsResponse> listVulHostsAsync(ListVulHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulHosts);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostsRequest 请求对象
     * @return AsyncInvoker<ListVulHostsRequest, ListVulHostsResponse>
     */
    public AsyncInvoker<ListVulHostsRequest, ListVulHostsResponse> listVulHostsAsyncInvoker(
        ListVulHostsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulHosts, hcClient);
    }

    /**
     * 查询漏洞扫描任务列表
     *
     * 查询漏洞扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskRequest 请求对象
     * @return CompletableFuture<ListVulScanTaskResponse>
     */
    public CompletableFuture<ListVulScanTaskResponse> listVulScanTaskAsync(ListVulScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulScanTask);
    }

    /**
     * 查询漏洞扫描任务列表
     *
     * 查询漏洞扫描任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskRequest 请求对象
     * @return AsyncInvoker<ListVulScanTaskRequest, ListVulScanTaskResponse>
     */
    public AsyncInvoker<ListVulScanTaskRequest, ListVulScanTaskResponse> listVulScanTaskAsyncInvoker(
        ListVulScanTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulScanTask, hcClient);
    }

    /**
     * 查询漏洞扫描任务对应的主机列表
     *
     * 查询漏洞扫描任务对应的主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskHostRequest 请求对象
     * @return CompletableFuture<ListVulScanTaskHostResponse>
     */
    public CompletableFuture<ListVulScanTaskHostResponse> listVulScanTaskHostAsync(ListVulScanTaskHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulScanTaskHost);
    }

    /**
     * 查询漏洞扫描任务对应的主机列表
     *
     * 查询漏洞扫描任务对应的主机列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskHostRequest 请求对象
     * @return AsyncInvoker<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse>
     */
    public AsyncInvoker<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> listVulScanTaskHostAsyncInvoker(
        ListVulScanTaskHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulScanTaskHost, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return CompletableFuture<ListVulnerabilitiesResponse>
     */
    public CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilitiesAsync(ListVulnerabilitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public AsyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesAsyncInvoker(
        ListVulnerabilitiesRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listVulnerabilities, hcClient);
    }

    /**
     * 记录用户查看漏洞任务管理页面的最后时间
     *
     * 记录用户查看漏洞任务管理页面的最后时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordUserViewVulTaskRequest 请求对象
     * @return CompletableFuture<RecordUserViewVulTaskResponse>
     */
    public CompletableFuture<RecordUserViewVulTaskResponse> recordUserViewVulTaskAsync(
        RecordUserViewVulTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.recordUserViewVulTask);
    }

    /**
     * 记录用户查看漏洞任务管理页面的最后时间
     *
     * 记录用户查看漏洞任务管理页面的最后时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordUserViewVulTaskRequest 请求对象
     * @return AsyncInvoker<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse>
     */
    public AsyncInvoker<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse> recordUserViewVulTaskAsyncInvoker(
        RecordUserViewVulTaskRequest request) {
        return new AsyncInvoker<>(request, HssMeta.recordUserViewVulTask, hcClient);
    }

    /**
     * 用备份进行回滚
     *
     * 用备份进行回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreVulHostBackupRequest 请求对象
     * @return CompletableFuture<RestoreVulHostBackupResponse>
     */
    public CompletableFuture<RestoreVulHostBackupResponse> restoreVulHostBackupAsync(
        RestoreVulHostBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.restoreVulHostBackup);
    }

    /**
     * 用备份进行回滚
     *
     * 用备份进行回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreVulHostBackupRequest 请求对象
     * @return AsyncInvoker<RestoreVulHostBackupRequest, RestoreVulHostBackupResponse>
     */
    public AsyncInvoker<RestoreVulHostBackupRequest, RestoreVulHostBackupResponse> restoreVulHostBackupAsyncInvoker(
        RestoreVulHostBackupRequest request) {
        return new AsyncInvoker<>(request, HssMeta.restoreVulHostBackup, hcClient);
    }

    /**
     * 查询漏洞处理对应主机的备份相关统计信息
     *
     * 查询漏洞处理对应主机的备份相关统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulBackupStatisticsRequest 请求对象
     * @return CompletableFuture<ShowVulBackupStatisticsResponse>
     */
    public CompletableFuture<ShowVulBackupStatisticsResponse> showVulBackupStatisticsAsync(
        ShowVulBackupStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVulBackupStatistics);
    }

    /**
     * 查询漏洞处理对应主机的备份相关统计信息
     *
     * 查询漏洞处理对应主机的备份相关统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulBackupStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowVulBackupStatisticsRequest, ShowVulBackupStatisticsResponse>
     */
    public AsyncInvoker<ShowVulBackupStatisticsRequest, ShowVulBackupStatisticsResponse> showVulBackupStatisticsAsyncInvoker(
        ShowVulBackupStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVulBackupStatistics, hcClient);
    }

    /**
     * 查询漏洞扫描策略
     *
     * 查询漏洞扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanPolicyRequest 请求对象
     * @return CompletableFuture<ShowVulScanPolicyResponse>
     */
    public CompletableFuture<ShowVulScanPolicyResponse> showVulScanPolicyAsync(ShowVulScanPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVulScanPolicy);
    }

    /**
     * 查询漏洞扫描策略
     *
     * 查询漏洞扫描策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanPolicyRequest 请求对象
     * @return AsyncInvoker<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse>
     */
    public AsyncInvoker<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> showVulScanPolicyAsyncInvoker(
        ShowVulScanPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVulScanPolicy, hcClient);
    }

    /**
     * 查询漏洞管理统计数据
     *
     * 查询漏洞管理统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulStaticsRequest 请求对象
     * @return CompletableFuture<ShowVulStaticsResponse>
     */
    public CompletableFuture<ShowVulStaticsResponse> showVulStaticsAsync(ShowVulStaticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVulStatics);
    }

    /**
     * 查询漏洞管理统计数据
     *
     * 查询漏洞管理统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulStaticsRequest 请求对象
     * @return AsyncInvoker<ShowVulStaticsRequest, ShowVulStaticsResponse>
     */
    public AsyncInvoker<ShowVulStaticsRequest, ShowVulStaticsResponse> showVulStaticsAsyncInvoker(
        ShowVulStaticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVulStatics, hcClient);
    }

    /**
     * 获取漏洞任务的未读数量
     *
     * 获取漏洞任务的未读数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulTaskStatisticsRequest 请求对象
     * @return CompletableFuture<ShowVulTaskStatisticsResponse>
     */
    public CompletableFuture<ShowVulTaskStatisticsResponse> showVulTaskStatisticsAsync(
        ShowVulTaskStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showVulTaskStatistics);
    }

    /**
     * 获取漏洞任务的未读数量
     *
     * 获取漏洞任务的未读数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulTaskStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse>
     */
    public AsyncInvoker<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse> showVulTaskStatisticsAsyncInvoker(
        ShowVulTaskStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showVulTaskStatistics, hcClient);
    }

    /**
     * 批量开启网页防篡改防护
     *
     * 批量开启网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartWebTamperProtectionRequest 请求对象
     * @return CompletableFuture<BatchStartWebTamperProtectionResponse>
     */
    public CompletableFuture<BatchStartWebTamperProtectionResponse> batchStartWebTamperProtectionAsync(
        BatchStartWebTamperProtectionRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.batchStartWebTamperProtection);
    }

    /**
     * 批量开启网页防篡改防护
     *
     * 批量开启网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartWebTamperProtectionRequest 请求对象
     * @return AsyncInvoker<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse>
     */
    public AsyncInvoker<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse> batchStartWebTamperProtectionAsyncInvoker(
        BatchStartWebTamperProtectionRequest request) {
        return new AsyncInvoker<>(request, HssMeta.batchStartWebTamperProtection, hcClient);
    }

    /**
     * 删除远端备份服务器
     *
     * 删除远端备份服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupHostInfoRequest 请求对象
     * @return CompletableFuture<DeleteBackupHostInfoResponse>
     */
    public CompletableFuture<DeleteBackupHostInfoResponse> deleteBackupHostInfoAsync(
        DeleteBackupHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.deleteBackupHostInfo);
    }

    /**
     * 删除远端备份服务器
     *
     * 删除远端备份服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupHostInfoRequest 请求对象
     * @return AsyncInvoker<DeleteBackupHostInfoRequest, DeleteBackupHostInfoResponse>
     */
    public AsyncInvoker<DeleteBackupHostInfoRequest, DeleteBackupHostInfoResponse> deleteBackupHostInfoAsyncInvoker(
        DeleteBackupHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.deleteBackupHostInfo, hcClient);
    }

    /**
     * 导出网页防篡改防护目录列表
     *
     * 导出网页防篡改防护目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportWebTamperHostRequest 请求对象
     * @return CompletableFuture<ExportWebTamperHostResponse>
     */
    public CompletableFuture<ExportWebTamperHostResponse> exportWebTamperHostAsync(ExportWebTamperHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.exportWebTamperHost);
    }

    /**
     * 导出网页防篡改防护目录列表
     *
     * 导出网页防篡改防护目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportWebTamperHostRequest 请求对象
     * @return AsyncInvoker<ExportWebTamperHostRequest, ExportWebTamperHostResponse>
     */
    public AsyncInvoker<ExportWebTamperHostRequest, ExportWebTamperHostResponse> exportWebTamperHostAsyncInvoker(
        ExportWebTamperHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.exportWebTamperHost, hcClient);
    }

    /**
     * 查询远端备份服务器列表
     *
     * 查询远端备份服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupHostsInfoRequest 请求对象
     * @return CompletableFuture<ListBackupHostsInfoResponse>
     */
    public CompletableFuture<ListBackupHostsInfoResponse> listBackupHostsInfoAsync(ListBackupHostsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listBackupHostsInfo);
    }

    /**
     * 查询远端备份服务器列表
     *
     * 查询远端备份服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupHostsInfoRequest 请求对象
     * @return AsyncInvoker<ListBackupHostsInfoRequest, ListBackupHostsInfoResponse>
     */
    public AsyncInvoker<ListBackupHostsInfoRequest, ListBackupHostsInfoResponse> listBackupHostsInfoAsyncInvoker(
        ListBackupHostsInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listBackupHostsInfo, hcClient);
    }

    /**
     * 查询静态网页防篡改防护事件
     *
     * 查询静态网页防篡改防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostProtectHistoryInfoRequest 请求对象
     * @return CompletableFuture<ListHostProtectHistoryInfoResponse>
     */
    public CompletableFuture<ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoAsync(
        ListHostProtectHistoryInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostProtectHistoryInfo);
    }

    /**
     * 查询静态网页防篡改防护事件
     *
     * 查询静态网页防篡改防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostProtectHistoryInfoRequest 请求对象
     * @return AsyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>
     */
    public AsyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoAsyncInvoker(
        ListHostProtectHistoryInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostProtectHistoryInfo, hcClient);
    }

    /**
     * 查询动态网页防篡改防护事件
     *
     * 查询动态网页防篡改防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return CompletableFuture<ListHostRaspProtectHistoryInfoResponse>
     */
    public CompletableFuture<ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoAsync(
        ListHostRaspProtectHistoryInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHostRaspProtectHistoryInfo);
    }

    /**
     * 查询动态网页防篡改防护事件
     *
     * 查询动态网页防篡改防护事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return AsyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>
     */
    public AsyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoAsyncInvoker(
        ListHostRaspProtectHistoryInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listHostRaspProtectHistoryInfo, hcClient);
    }

    /**
     * 查询可开启网页防篡改的服务器列表
     *
     * 查询可开启网页防篡改的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperHostRequest 请求对象
     * @return CompletableFuture<ListWebTamperHostResponse>
     */
    public CompletableFuture<ListWebTamperHostResponse> listWebTamperHostAsync(ListWebTamperHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWebTamperHost);
    }

    /**
     * 查询可开启网页防篡改的服务器列表
     *
     * 查询可开启网页防篡改的服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperHostRequest 请求对象
     * @return AsyncInvoker<ListWebTamperHostRequest, ListWebTamperHostResponse>
     */
    public AsyncInvoker<ListWebTamperHostRequest, ListWebTamperHostResponse> listWebTamperHostAsyncInvoker(
        ListWebTamperHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWebTamperHost, hcClient);
    }

    /**
     * 查询网页防篡改防护列表
     *
     * 查询网页防篡改防护列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWtpProtectHostRequest 请求对象
     * @return CompletableFuture<ListWtpProtectHostResponse>
     */
    public CompletableFuture<ListWtpProtectHostResponse> listWtpProtectHostAsync(ListWtpProtectHostRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listWtpProtectHost);
    }

    /**
     * 查询网页防篡改防护列表
     *
     * 查询网页防篡改防护列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWtpProtectHostRequest 请求对象
     * @return AsyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>
     */
    public AsyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHostAsyncInvoker(
        ListWtpProtectHostRequest request) {
        return new AsyncInvoker<>(request, HssMeta.listWtpProtectHost, hcClient);
    }

    /**
     * 暂停或恢复网页防篡改的防护目录
     *
     * 暂停或恢复网页防篡改的防护目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectDirSwitchInfoRequest 请求对象
     * @return CompletableFuture<SetProtectDirSwitchInfoResponse>
     */
    public CompletableFuture<SetProtectDirSwitchInfoResponse> setProtectDirSwitchInfoAsync(
        SetProtectDirSwitchInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setProtectDirSwitchInfo);
    }

    /**
     * 暂停或恢复网页防篡改的防护目录
     *
     * 暂停或恢复网页防篡改的防护目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectDirSwitchInfoRequest 请求对象
     * @return AsyncInvoker<SetProtectDirSwitchInfoRequest, SetProtectDirSwitchInfoResponse>
     */
    public AsyncInvoker<SetProtectDirSwitchInfoRequest, SetProtectDirSwitchInfoResponse> setProtectDirSwitchInfoAsyncInvoker(
        SetProtectDirSwitchInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setProtectDirSwitchInfo, hcClient);
    }

    /**
     * 开启关闭动态网页防篡改防护
     *
     * 开启关闭动态网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRaspSwitchRequest 请求对象
     * @return CompletableFuture<SetRaspSwitchResponse>
     */
    public CompletableFuture<SetRaspSwitchResponse> setRaspSwitchAsync(SetRaspSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setRaspSwitch);
    }

    /**
     * 开启关闭动态网页防篡改防护
     *
     * 开启关闭动态网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRaspSwitchRequest 请求对象
     * @return AsyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>
     */
    public AsyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitchAsyncInvoker(
        SetRaspSwitchRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setRaspSwitch, hcClient);
    }

    /**
     * 开启或关闭远端备份
     *
     * 为已开启网页防篡改的服务器，开启或关闭远端备份功能，仅限Linux服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRemoteBackupInfoRequest 请求对象
     * @return CompletableFuture<SetRemoteBackupInfoResponse>
     */
    public CompletableFuture<SetRemoteBackupInfoResponse> setRemoteBackupInfoAsync(SetRemoteBackupInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setRemoteBackupInfo);
    }

    /**
     * 开启或关闭远端备份
     *
     * 为已开启网页防篡改的服务器，开启或关闭远端备份功能，仅限Linux服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRemoteBackupInfoRequest 请求对象
     * @return AsyncInvoker<SetRemoteBackupInfoRequest, SetRemoteBackupInfoResponse>
     */
    public AsyncInvoker<SetRemoteBackupInfoRequest, SetRemoteBackupInfoResponse> setRemoteBackupInfoAsyncInvoker(
        SetRemoteBackupInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setRemoteBackupInfo, hcClient);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWtpProtectionStatusInfoRequest 请求对象
     * @return CompletableFuture<SetWtpProtectionStatusInfoResponse>
     */
    public CompletableFuture<SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoAsync(
        SetWtpProtectionStatusInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.setWtpProtectionStatusInfo);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWtpProtectionStatusInfoRequest 请求对象
     * @return AsyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>
     */
    public AsyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoAsyncInvoker(
        SetWtpProtectionStatusInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.setWtpProtectionStatusInfo, hcClient);
    }

    /**
     * 查询远端备份服务器信息
     *
     * 查询远端备份服务器信息：查询远端备份服务器的相关信息，包含服务器名称、地址、端口号、备份路径、运行状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteBackupHostInfoRequest 请求对象
     * @return CompletableFuture<ShowRemoteBackupHostInfoResponse>
     */
    public CompletableFuture<ShowRemoteBackupHostInfoResponse> showRemoteBackupHostInfoAsync(
        ShowRemoteBackupHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showRemoteBackupHostInfo);
    }

    /**
     * 查询远端备份服务器信息
     *
     * 查询远端备份服务器信息：查询远端备份服务器的相关信息，包含服务器名称、地址、端口号、备份路径、运行状态信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteBackupHostInfoRequest 请求对象
     * @return AsyncInvoker<ShowRemoteBackupHostInfoRequest, ShowRemoteBackupHostInfoResponse>
     */
    public AsyncInvoker<ShowRemoteBackupHostInfoRequest, ShowRemoteBackupHostInfoResponse> showRemoteBackupHostInfoAsyncInvoker(
        ShowRemoteBackupHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showRemoteBackupHostInfo, hcClient);
    }

    /**
     * 查看网页防篡改策略信息
     *
     * 查看网页防篡改策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperHostPolicyRequest 请求对象
     * @return CompletableFuture<ShowWebTamperHostPolicyResponse>
     */
    public CompletableFuture<ShowWebTamperHostPolicyResponse> showWebTamperHostPolicyAsync(
        ShowWebTamperHostPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWebTamperHostPolicy);
    }

    /**
     * 查看网页防篡改策略信息
     *
     * 查看网页防篡改策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperHostPolicyRequest 请求对象
     * @return AsyncInvoker<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse>
     */
    public AsyncInvoker<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse> showWebTamperHostPolicyAsyncInvoker(
        ShowWebTamperHostPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWebTamperHostPolicy, hcClient);
    }

    /**
     * 查询动态网页防篡改的Tomcat bin目录
     *
     * 查询动态网页防篡改的Tomcat bin目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperRaspPathRequest 请求对象
     * @return CompletableFuture<ShowWebTamperRaspPathResponse>
     */
    public CompletableFuture<ShowWebTamperRaspPathResponse> showWebTamperRaspPathAsync(
        ShowWebTamperRaspPathRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWebTamperRaspPath);
    }

    /**
     * 查询动态网页防篡改的Tomcat bin目录
     *
     * 查询动态网页防篡改的Tomcat bin目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperRaspPathRequest 请求对象
     * @return AsyncInvoker<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse>
     */
    public AsyncInvoker<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse> showWebTamperRaspPathAsyncInvoker(
        ShowWebTamperRaspPathRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWebTamperRaspPath, hcClient);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计防护服务器数、防护目录数、近七天的已防御篡改攻击数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWtpProtectStatisticsRequest 请求对象
     * @return CompletableFuture<ShowWtpProtectStatisticsResponse>
     */
    public CompletableFuture<ShowWtpProtectStatisticsResponse> showWtpProtectStatisticsAsync(
        ShowWtpProtectStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.showWtpProtectStatistics);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计防护服务器数、防护目录数、近七天的已防御篡改攻击数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWtpProtectStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowWtpProtectStatisticsRequest, ShowWtpProtectStatisticsResponse>
     */
    public AsyncInvoker<ShowWtpProtectStatisticsRequest, ShowWtpProtectStatisticsResponse> showWtpProtectStatisticsAsyncInvoker(
        ShowWtpProtectStatisticsRequest request) {
        return new AsyncInvoker<>(request, HssMeta.showWtpProtectStatistics, hcClient);
    }

    /**
     * 添加或修改远端备份服务器
     *
     * 添加或修改远端备份服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupHostInfoRequest 请求对象
     * @return CompletableFuture<UpdateBackupHostInfoResponse>
     */
    public CompletableFuture<UpdateBackupHostInfoResponse> updateBackupHostInfoAsync(
        UpdateBackupHostInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateBackupHostInfo);
    }

    /**
     * 添加或修改远端备份服务器
     *
     * 添加或修改远端备份服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupHostInfoRequest 请求对象
     * @return AsyncInvoker<UpdateBackupHostInfoRequest, UpdateBackupHostInfoResponse>
     */
    public AsyncInvoker<UpdateBackupHostInfoRequest, UpdateBackupHostInfoResponse> updateBackupHostInfoAsyncInvoker(
        UpdateBackupHostInfoRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateBackupHostInfo, hcClient);
    }

    /**
     * 编辑网页防篡改策略信息
     *
     * 编辑网页防篡改策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperHostPolicyRequest 请求对象
     * @return CompletableFuture<UpdateWebTamperHostPolicyResponse>
     */
    public CompletableFuture<UpdateWebTamperHostPolicyResponse> updateWebTamperHostPolicyAsync(
        UpdateWebTamperHostPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateWebTamperHostPolicy);
    }

    /**
     * 编辑网页防篡改策略信息
     *
     * 编辑网页防篡改策略信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperHostPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse>
     */
    public AsyncInvoker<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse> updateWebTamperHostPolicyAsyncInvoker(
        UpdateWebTamperHostPolicyRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateWebTamperHostPolicy, hcClient);
    }

    /**
     * 修改动态网页防篡改的Tomcat bin目录
     *
     * 修改动态网页防篡改的Tomcat bin目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperRaspPathRequest 请求对象
     * @return CompletableFuture<UpdateWebTamperRaspPathResponse>
     */
    public CompletableFuture<UpdateWebTamperRaspPathResponse> updateWebTamperRaspPathAsync(
        UpdateWebTamperRaspPathRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.updateWebTamperRaspPath);
    }

    /**
     * 修改动态网页防篡改的Tomcat bin目录
     *
     * 修改动态网页防篡改的Tomcat bin目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperRaspPathRequest 请求对象
     * @return AsyncInvoker<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse>
     */
    public AsyncInvoker<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse> updateWebTamperRaspPathAsyncInvoker(
        UpdateWebTamperRaspPathRequest request) {
        return new AsyncInvoker<>(request, HssMeta.updateWebTamperRaspPath, hcClient);
    }

}

package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.hss.v5.model.AddSecurityCheckPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddSecurityCheckPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddVulWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddVulWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociateBackupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociateBackupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociateHostAssetValueRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociateHostAssetValueResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociateHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociateHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociateProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteRegistryRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteRegistryResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchExportBaselineTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchExportBaselineTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchExportLocalVulTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchExportLocalVulTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchModifyPortStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchModifyPortStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanLocalImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanLocalImageResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ChangeContainerStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeContainerStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeExtendedWeakPasswordRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeExtendedWeakPasswordResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeFilePathWhiteDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeFilePathWhiteDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeFilePathWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeFilePathWhiteListsResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostIgnoreStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostIgnoreStatusResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ChangeSensitiveInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeSensitiveInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeSwitchesStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeSwitchesStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulWhiteListResponse;
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
import com.huaweicloud.sdk.hss.v5.model.CreateVpcEndpointRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVpcEndpointResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateWebTamperProtectionConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateWebTamperProtectionConfigResponse;
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
import com.huaweicloud.sdk.hss.v5.model.DeleteDuplicationInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteDuplicationInfoResponse;
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
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityCheckPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityCheckPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteVulWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteVulWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteWebTamperProtectionConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteWebTamperProtectionConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.DownloadAssetFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DownloadAssetFileResponse;
import com.huaweicloud.sdk.hss.v5.model.DownloadEventSourceFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DownloadEventSourceFileResponse;
import com.huaweicloud.sdk.hss.v5.model.EnableTrustServiceRequest;
import com.huaweicloud.sdk.hss.v5.model.EnableTrustServiceResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportBaselineSecurityCheckReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportBaselineSecurityCheckReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportEventRequestRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportEventRequestResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportSecurityCheckReportRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportSecurityCheckReportResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportTaskInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportTaskInfoResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListAgentDaemonsetClusterNodesLabelRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentDaemonsetClusterNodesLabelResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentDaemonsetInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentDaemonsetInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentVersionRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentVersionResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAllRiskConfigCheckRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAllRiskConfigCheckRulesResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListBackedupByHostIdRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackedupByHostIdResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBackupHostsInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackupHostsInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBackupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackupPolicyResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListCheckRuleHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckRuleHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCheckRuleResourcesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckRuleResourcesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCheckRulesInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckRulesInfoResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortAvailableHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortAvailableHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDictionariesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDictionariesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDockerPluginsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDockerPluginsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventAttCkRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventAttCkResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventForensicRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventForensicResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventOperatesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventOperatesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventTopRiskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventTopRiskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventTypeRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventTypeResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListGlobalImageAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalImageAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalImageFilesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalImageFilesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalMalwareRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalMalwareResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHandleVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHandleVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHostCheckRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHostCheckRulesResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListImageBuildCommandRisksImagesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageBuildCommandRisksImagesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageBuildCommandRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageBuildCommandRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageFilesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageFilesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageHandleAffectVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageHandleAffectVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageMalwareRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageMalwareResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageNonCompliantAppRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageNonCompliantAppResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImagePwdComplexityRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImagePwdComplexityResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageSensitiveInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageSensitiveInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageSensitiveRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageSensitiveResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageWeakPwdUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageWeakPwdUsersResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageAppInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageAppInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLocalImageHostsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListPluginInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPluginInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPluginInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPluginInstallScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPluginStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPluginStatusResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListSameEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSameEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckClusterReportsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckClusterReportsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityCheckPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityRiskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityRiskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListServerlessAssetDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListServerlessAssetDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ListServerlessAssetRequest;
import com.huaweicloud.sdk.hss.v5.model.ListServerlessAssetResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSimilarHandledEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSimilarHandledEventsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListTrustServiceStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTrustServiceStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUrgentVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUrgentVulnerabilitiesResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListVulHostHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostProcessRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostProcessResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVaultsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVaultsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepairCmdsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepairCmdsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepairFailedDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepairFailedDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepoImageRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulRepoImageResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulWhiteListVulOptionsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulWhiteListVulOptionsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperImageOptionsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperImageOptionsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionContainerRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionContainerResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionDirectoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperProtectionDirectoryResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginWhiteIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyLoginWhiteIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.RecreateVulScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.RecreateVulScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RestoreDuplicationInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.RestoreDuplicationInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.RestoreVulHostBackupRequest;
import com.huaweicloud.sdk.hss.v5.model.RestoreVulHostBackupResponse;
import com.huaweicloud.sdk.hss.v5.model.RetryTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.RetryTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.RunBaselineDetectRequest;
import com.huaweicloud.sdk.hss.v5.model.RunBaselineDetectResponse;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectRequest;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectResponse;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.SendSecurityReportRequest;
import com.huaweicloud.sdk.hss.v5.model.SendSecurityReportResponse;
import com.huaweicloud.sdk.hss.v5.model.SetMalwareRemindersRequest;
import com.huaweicloud.sdk.hss.v5.model.SetMalwareRemindersResponse;
import com.huaweicloud.sdk.hss.v5.model.SetManualDetectRequest;
import com.huaweicloud.sdk.hss.v5.model.SetManualDetectResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowAgentAddressRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentAddressResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowBackupInfoByBackupIdRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupInfoByBackupIdResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineDirectoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineDirectoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineOverviewRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineOverviewResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleFixFailDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleFixFailDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCicdConfigurationRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCicdConfigurationResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterAssetStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterAssetStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterProtectPolicyTemplateRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterProtectPolicyTemplateResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterScanStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowClusterScanStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCmsVulDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCmsVulDetailResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowDefaultSecurityCheckPolicyDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDefaultSecurityCheckPolicyDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowDefaultSecurityCheckPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDefaultSecurityCheckPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowEndpointStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowEndpointStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowEventAttackTagRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowEventAttackTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowEventSeverityRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowEventSeverityResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowExportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowExportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowExtendedWeakPasswordRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowExtendedWeakPasswordResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowFilePathWhiteDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowFilePathWhiteDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowFilePathWhiteListsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowFilePathWhiteListsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowImageBaselineStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageBaselineStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageFilesStatRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageFilesStatResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImagePayPerScanStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImagePayPerScanStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageSecurityReportStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageSecurityReportStatisticResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowLinuxVulDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowLinuxVulDetailResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowPortTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowPortTopResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowProcessTopRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProcessTopResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowScanStatusResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowVulAffectedStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulAffectedStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulBackupStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulBackupStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulReportDataRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulReportDataResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanTaskEstimatedTimeRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanTaskEstimatedTimeResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulWhiteListDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulWhiteListDetailResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowWindosVulDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWindosVulDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWtpProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWtpProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.StartAutoKillVirusStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.StartAutoKillVirusStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.StartManualSecurityCheckRequest;
import com.huaweicloud.sdk.hss.v5.model.StartManualSecurityCheckResponse;
import com.huaweicloud.sdk.hss.v5.model.StartPluginRequest;
import com.huaweicloud.sdk.hss.v5.model.StartPluginResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopImageScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.StopImageScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.StopManualSecurityCheckRequest;
import com.huaweicloud.sdk.hss.v5.model.StopManualSecurityCheckResponse;
import com.huaweicloud.sdk.hss.v5.model.StopPluginRequest;
import com.huaweicloud.sdk.hss.v5.model.StopPluginResponse;
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
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchFirewallStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchFirewallStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchWebTamperProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchWebTamperProtectStatusResponse;
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
import com.huaweicloud.sdk.hss.v5.model.UninstallAgentsRequest;
import com.huaweicloud.sdk.hss.v5.model.UninstallAgentsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityCheckPolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityCheckPolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperProtectionConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperProtectionConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathResponse;
import com.huaweicloud.sdk.hss.v5.model.UpgradeAgentsRequest;
import com.huaweicloud.sdk.hss.v5.model.UpgradeAgentsResponse;
import com.huaweicloud.sdk.hss.v5.model.UploadReportLogoRequest;
import com.huaweicloud.sdk.hss.v5.model.UploadReportLogoResponse;
import com.huaweicloud.sdk.hss.v5.model.ValidateAdminRequest;
import com.huaweicloud.sdk.hss.v5.model.ValidateAdminResponse;

public class HssClient {

    protected HcClient hcClient;

    public HssClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssClient> newBuilder() {
        ClientBuilder<HssClient> clientBuilder = new ClientBuilder<>(HssClient::new);
        return clientBuilder;
    }

    /**
     * 新建cce集成防护配置
     *
     * 新建cce集成防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCceIntegrationProtectionRequest 请求对象
     * @return AddCceIntegrationProtectionResponse
     */
    public AddCceIntegrationProtectionResponse addCceIntegrationProtection(AddCceIntegrationProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addCceIntegrationProtection);
    }

    /**
     * 新建cce集成防护配置
     *
     * 新建cce集成防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCceIntegrationProtectionRequest 请求对象
     * @return SyncInvoker<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse>
     */
    public SyncInvoker<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> addCceIntegrationProtectionInvoker(
        AddCceIntegrationProtectionRequest request) {
        return new SyncInvoker<>(request, HssMeta.addCceIntegrationProtection, hcClient);
    }

    /**
     * 添加登录白名单
     *
     * 添加登录白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLoginWhiteListRequest 请求对象
     * @return AddLoginWhiteListResponse
     */
    public AddLoginWhiteListResponse addLoginWhiteList(AddLoginWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addLoginWhiteList);
    }

    /**
     * 添加登录白名单
     *
     * 添加登录白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddLoginWhiteListRequest 请求对象
     * @return SyncInvoker<AddLoginWhiteListRequest, AddLoginWhiteListResponse>
     */
    public SyncInvoker<AddLoginWhiteListRequest, AddLoginWhiteListResponse> addLoginWhiteListInvoker(
        AddLoginWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.addLoginWhiteList, hcClient);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略：创建防护策略，包含策略名称、相关规则开启状态、防护动作以及检测规则配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyRequest 请求对象
     * @return AddPolicyResponse
     */
    public AddPolicyResponse addPolicy(AddPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addPolicy);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略：创建防护策略，包含策略名称、相关规则开启状态、防护动作以及检测规则配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyRequest 请求对象
     * @return SyncInvoker<AddPolicyRequest, AddPolicyResponse>
     */
    public SyncInvoker<AddPolicyRequest, AddPolicyResponse> addPolicyInvoker(AddPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.addPolicy, hcClient);
    }

    /**
     * 添加系统用户白名单
     *
     * 添加系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSystemUserWhiteListRequest 请求对象
     * @return AddSystemUserWhiteListResponse
     */
    public AddSystemUserWhiteListResponse addSystemUserWhiteList(AddSystemUserWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addSystemUserWhiteList);
    }

    /**
     * 添加系统用户白名单
     *
     * 添加系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSystemUserWhiteListRequest 请求对象
     * @return SyncInvoker<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse>
     */
    public SyncInvoker<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse> addSystemUserWhiteListInvoker(
        AddSystemUserWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.addSystemUserWhiteList, hcClient);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return BatchAddAccountsResponse
     */
    public BatchAddAccountsResponse batchAddAccounts(BatchAddAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchAddAccounts);
    }

    /**
     * 批量添加账号
     *
     * 批量添加账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAccountsRequest 请求对象
     * @return SyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse>
     */
    public SyncInvoker<BatchAddAccountsRequest, BatchAddAccountsResponse> batchAddAccountsInvoker(
        BatchAddAccountsRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchAddAccounts, hcClient);
    }

    /**
     * 全量处理告警事件
     *
     * 全量处理告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeEventRequest 请求对象
     * @return BatchChangeEventResponse
     */
    public BatchChangeEventResponse batchChangeEvent(BatchChangeEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchChangeEvent);
    }

    /**
     * 全量处理告警事件
     *
     * 全量处理告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchChangeEventRequest 请求对象
     * @return SyncInvoker<BatchChangeEventRequest, BatchChangeEventResponse>
     */
    public SyncInvoker<BatchChangeEventRequest, BatchChangeEventResponse> batchChangeEventInvoker(
        BatchChangeEventRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchChangeEvent, hcClient);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return BatchCreateTagsResponse
     */
    public BatchCreateTagsResponse batchCreateTags(BatchCreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchCreateTags);
    }

    /**
     * 批量创建标签
     *
     * 批量创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse>
     */
    public SyncInvoker<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTagsInvoker(
        BatchCreateTagsRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchCreateTags, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchDeleteTags);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchDeleteTags, hcClient);
    }

    /**
     * 修改开放端口状态
     *
     * 修改开放端口状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyPortStatusRequest 请求对象
     * @return BatchModifyPortStatusResponse
     */
    public BatchModifyPortStatusResponse batchModifyPortStatus(BatchModifyPortStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchModifyPortStatus);
    }

    /**
     * 修改开放端口状态
     *
     * 修改开放端口状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchModifyPortStatusRequest 请求对象
     * @return SyncInvoker<BatchModifyPortStatusRequest, BatchModifyPortStatusResponse>
     */
    public SyncInvoker<BatchModifyPortStatusRequest, BatchModifyPortStatusResponse> batchModifyPortStatusInvoker(
        BatchModifyPortStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchModifyPortStatus, hcClient);
    }

    /**
     * 解除已拦截IP
     *
     * 解除已拦截IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBlockedIpRequest 请求对象
     * @return ChangeBlockedIpResponse
     */
    public ChangeBlockedIpResponse changeBlockedIp(ChangeBlockedIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeBlockedIp);
    }

    /**
     * 解除已拦截IP
     *
     * 解除已拦截IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBlockedIpRequest 请求对象
     * @return SyncInvoker<ChangeBlockedIpRequest, ChangeBlockedIpResponse>
     */
    public SyncInvoker<ChangeBlockedIpRequest, ChangeBlockedIpResponse> changeBlockedIpInvoker(
        ChangeBlockedIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeBlockedIp, hcClient);
    }

    /**
     * 修改告警状态
     *
     * 修改告警状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterEventsRequest 请求对象
     * @return ChangeClusterEventsResponse
     */
    public ChangeClusterEventsResponse changeClusterEvents(ChangeClusterEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeClusterEvents);
    }

    /**
     * 修改告警状态
     *
     * 修改告警状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterEventsRequest 请求对象
     * @return SyncInvoker<ChangeClusterEventsRequest, ChangeClusterEventsResponse>
     */
    public SyncInvoker<ChangeClusterEventsRequest, ChangeClusterEventsResponse> changeClusterEventsInvoker(
        ChangeClusterEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeClusterEvents, hcClient);
    }

    /**
     * 修改集群防护策略
     *
     * 修改集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterProtectionPolicyRequest 请求对象
     * @return ChangeClusterProtectionPolicyResponse
     */
    public ChangeClusterProtectionPolicyResponse changeClusterProtectionPolicy(
        ChangeClusterProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeClusterProtectionPolicy);
    }

    /**
     * 修改集群防护策略
     *
     * 修改集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeClusterProtectionPolicyRequest 请求对象
     * @return SyncInvoker<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse>
     */
    public SyncInvoker<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse> changeClusterProtectionPolicyInvoker(
        ChangeClusterProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeClusterProtectionPolicy, hcClient);
    }

    /**
     * 管理容器生命周期
     *
     * 管理容器生命周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeContainerStatusRequest 请求对象
     * @return ChangeContainerStatusResponse
     */
    public ChangeContainerStatusResponse changeContainerStatus(ChangeContainerStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeContainerStatus);
    }

    /**
     * 管理容器生命周期
     *
     * 管理容器生命周期。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeContainerStatusRequest 请求对象
     * @return SyncInvoker<ChangeContainerStatusRequest, ChangeContainerStatusResponse>
     */
    public SyncInvoker<ChangeContainerStatusRequest, ChangeContainerStatusResponse> changeContainerStatusInvoker(
        ChangeContainerStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeContainerStatus, hcClient);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEventRequest 请求对象
     * @return ChangeEventResponse
     */
    public ChangeEventResponse changeEvent(ChangeEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeEvent);
    }

    /**
     * 处理告警事件
     *
     * 处理告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeEventRequest 请求对象
     * @return SyncInvoker<ChangeEventRequest, ChangeEventResponse>
     */
    public SyncInvoker<ChangeEventRequest, ChangeEventResponse> changeEventInvoker(ChangeEventRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeEvent, hcClient);
    }

    /**
     * 恢复已隔离文件
     *
     * 恢复已隔离文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIsolatedFileRequest 请求对象
     * @return ChangeIsolatedFileResponse
     */
    public ChangeIsolatedFileResponse changeIsolatedFile(ChangeIsolatedFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeIsolatedFile);
    }

    /**
     * 恢复已隔离文件
     *
     * 恢复已隔离文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIsolatedFileRequest 请求对象
     * @return SyncInvoker<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse>
     */
    public SyncInvoker<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> changeIsolatedFileInvoker(
        ChangeIsolatedFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeIsolatedFile, hcClient);
    }

    /**
     * 开启或关闭恶意软件云查样本收集配置
     *
     * 开启或关闭恶意软件云查样本收集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMalwareCollectStatusRequest 请求对象
     * @return ChangeMalwareCollectStatusResponse
     */
    public ChangeMalwareCollectStatusResponse changeMalwareCollectStatus(ChangeMalwareCollectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeMalwareCollectStatus);
    }

    /**
     * 开启或关闭恶意软件云查样本收集配置
     *
     * 开启或关闭恶意软件云查样本收集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMalwareCollectStatusRequest 请求对象
     * @return SyncInvoker<ChangeMalwareCollectStatusRequest, ChangeMalwareCollectStatusResponse>
     */
    public SyncInvoker<ChangeMalwareCollectStatusRequest, ChangeMalwareCollectStatusResponse> changeMalwareCollectStatusInvoker(
        ChangeMalwareCollectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeMalwareCollectStatus, hcClient);
    }

    /**
     * 新建集群防护策略
     *
     * 新建集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterProtectionPolicyRequest 请求对象
     * @return CreateClusterProtectionPolicyResponse
     */
    public CreateClusterProtectionPolicyResponse createClusterProtectionPolicy(
        CreateClusterProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createClusterProtectionPolicy);
    }

    /**
     * 新建集群防护策略
     *
     * 新建集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClusterProtectionPolicyRequest 请求对象
     * @return SyncInvoker<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse>
     */
    public SyncInvoker<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse> createClusterProtectionPolicyInvoker(
        CreateClusterProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createClusterProtectionPolicy, hcClient);
    }

    /**
     * 同步集群信息
     *
     * 同步集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersInfoRequest 请求对象
     * @return CreateClustersInfoResponse
     */
    public CreateClustersInfoResponse createClustersInfo(CreateClustersInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createClustersInfo);
    }

    /**
     * 同步集群信息
     *
     * 同步集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClustersInfoRequest 请求对象
     * @return SyncInvoker<CreateClustersInfoRequest, CreateClustersInfoResponse>
     */
    public SyncInvoker<CreateClustersInfoRequest, CreateClustersInfoResponse> createClustersInfoInvoker(
        CreateClustersInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.createClustersInfo, hcClient);
    }

    /**
     * 容器集群网络添加配置策略
     *
     * 容器集群网络添加配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateContainerNetworkPolicyRequest 请求对象
     * @return CreateContainerNetworkPolicyResponse
     */
    public CreateContainerNetworkPolicyResponse createContainerNetworkPolicy(
        CreateContainerNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createContainerNetworkPolicy);
    }

    /**
     * 容器集群网络添加配置策略
     *
     * 容器集群网络添加配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateContainerNetworkPolicyRequest 请求对象
     * @return SyncInvoker<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse>
     */
    public SyncInvoker<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse> createContainerNetworkPolicyInvoker(
        CreateContainerNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createContainerNetworkPolicy, hcClient);
    }

    /**
     * 新增动态端口蜜罐策略
     *
     * 新增动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDecoyPortPolicyRequest 请求对象
     * @return CreateDecoyPortPolicyResponse
     */
    public CreateDecoyPortPolicyResponse createDecoyPortPolicy(CreateDecoyPortPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createDecoyPortPolicy);
    }

    /**
     * 新增动态端口蜜罐策略
     *
     * 新增动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDecoyPortPolicyRequest 请求对象
     * @return SyncInvoker<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse>
     */
    public SyncInvoker<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse> createDecoyPortPolicyInvoker(
        CreateDecoyPortPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createDecoyPortPolicy, hcClient);
    }

    /**
     * 创建全局资产扫描任务
     *
     * 创建全局资产扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalAssetScanTaskRequest 请求对象
     * @return CreateGlobalAssetScanTaskResponse
     */
    public CreateGlobalAssetScanTaskResponse createGlobalAssetScanTask(CreateGlobalAssetScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createGlobalAssetScanTask);
    }

    /**
     * 创建全局资产扫描任务
     *
     * 创建全局资产扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGlobalAssetScanTaskRequest 请求对象
     * @return SyncInvoker<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse>
     */
    public SyncInvoker<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse> createGlobalAssetScanTaskInvoker(
        CreateGlobalAssetScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createGlobalAssetScanTask, hcClient);
    }

    /**
     * 创建安全组策略
     *
     * 创建安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupPolicyRequest 请求对象
     * @return CreateSecurityGroupPolicyResponse
     */
    public CreateSecurityGroupPolicyResponse createSecurityGroupPolicy(CreateSecurityGroupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createSecurityGroupPolicy);
    }

    /**
     * 创建安全组策略
     *
     * 创建安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupPolicyRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse>
     */
    public SyncInvoker<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse> createSecurityGroupPolicyInvoker(
        CreateSecurityGroupPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createSecurityGroupPolicy, hcClient);
    }

    /**
     * 删除账号
     *
     * 删除账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountRequest 请求对象
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteAccount);
    }

    /**
     * 删除账号
     *
     * 删除账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAccountRequest 请求对象
     * @return SyncInvoker<DeleteAccountRequest, DeleteAccountResponse>
     */
    public SyncInvoker<DeleteAccountRequest, DeleteAccountResponse> deleteAccountInvoker(DeleteAccountRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteAccount, hcClient);
    }

    /**
     * 删除集群防护策略
     *
     * 删除集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterProtectionPolicyRequest 请求对象
     * @return DeleteClusterProtectionPolicyResponse
     */
    public DeleteClusterProtectionPolicyResponse deleteClusterProtectionPolicy(
        DeleteClusterProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteClusterProtectionPolicy);
    }

    /**
     * 删除集群防护策略
     *
     * 删除集群防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClusterProtectionPolicyRequest 请求对象
     * @return SyncInvoker<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse>
     */
    public SyncInvoker<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse> deleteClusterProtectionPolicyInvoker(
        DeleteClusterProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteClusterProtectionPolicy, hcClient);
    }

    /**
     * 容器集群网络删除配置策略
     *
     * 容器集群网络删除配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteContainerNetworkPolicyRequest 请求对象
     * @return DeleteContainerNetworkPolicyResponse
     */
    public DeleteContainerNetworkPolicyResponse deleteContainerNetworkPolicy(
        DeleteContainerNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteContainerNetworkPolicy);
    }

    /**
     * 容器集群网络删除配置策略
     *
     * 容器集群网络删除配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteContainerNetworkPolicyRequest 请求对象
     * @return SyncInvoker<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse>
     */
    public SyncInvoker<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse> deleteContainerNetworkPolicyInvoker(
        DeleteContainerNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteContainerNetworkPolicy, hcClient);
    }

    /**
     * 关闭主机动态端口蜜罐策略
     *
     * 关闭主机动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortHostPolicyRequest 请求对象
     * @return DeleteDecoyPortHostPolicyResponse
     */
    public DeleteDecoyPortHostPolicyResponse deleteDecoyPortHostPolicy(DeleteDecoyPortHostPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteDecoyPortHostPolicy);
    }

    /**
     * 关闭主机动态端口蜜罐策略
     *
     * 关闭主机动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortHostPolicyRequest 请求对象
     * @return SyncInvoker<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse>
     */
    public SyncInvoker<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse> deleteDecoyPortHostPolicyInvoker(
        DeleteDecoyPortHostPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteDecoyPortHostPolicy, hcClient);
    }

    /**
     * 删除动态端口蜜罐策略
     *
     * 删除动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortPolicyRequest 请求对象
     * @return DeleteDecoyPortPolicyResponse
     */
    public DeleteDecoyPortPolicyResponse deleteDecoyPortPolicy(DeleteDecoyPortPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteDecoyPortPolicy);
    }

    /**
     * 删除动态端口蜜罐策略
     *
     * 删除动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDecoyPortPolicyRequest 请求对象
     * @return SyncInvoker<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse>
     */
    public SyncInvoker<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse> deleteDecoyPortPolicyInvoker(
        DeleteDecoyPortPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteDecoyPortPolicy, hcClient);
    }

    /**
     * 删除已隔离文件
     *
     * 删除已隔离文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIsolatedFileRequest 请求对象
     * @return DeleteIsolatedFileResponse
     */
    public DeleteIsolatedFileResponse deleteIsolatedFile(DeleteIsolatedFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteIsolatedFile);
    }

    /**
     * 删除已隔离文件
     *
     * 删除已隔离文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIsolatedFileRequest 请求对象
     * @return SyncInvoker<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse>
     */
    public SyncInvoker<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse> deleteIsolatedFileInvoker(
        DeleteIsolatedFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteIsolatedFile, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略：删除策略，已经在使用的防护策略不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略：删除策略，已经在使用的防护策略不能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deletePolicy, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceInstanceTagRequest 请求对象
     * @return DeleteResourceInstanceTagResponse
     */
    public DeleteResourceInstanceTagResponse deleteResourceInstanceTag(DeleteResourceInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteResourceInstanceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除单个资源下的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse>
     */
    public SyncInvoker<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTagInvoker(
        DeleteResourceInstanceTagRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteResourceInstanceTag, hcClient);
    }

    /**
     * 删除安全组策略
     *
     * 删除安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupPolicyRequest 请求对象
     * @return DeleteSecurityGroupPolicyResponse
     */
    public DeleteSecurityGroupPolicyResponse deleteSecurityGroupPolicy(DeleteSecurityGroupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteSecurityGroupPolicy);
    }

    /**
     * 删除安全组策略
     *
     * 删除安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupPolicyRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse>
     */
    public SyncInvoker<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse> deleteSecurityGroupPolicyInvoker(
        DeleteSecurityGroupPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteSecurityGroupPolicy, hcClient);
    }

    /**
     * 导出资产指纹信息
     *
     * 导出资产指纹信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetFileRequest 请求对象
     * @return DownloadAssetFileResponse
     */
    public DownloadAssetFileResponse downloadAssetFile(DownloadAssetFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.downloadAssetFile);
    }

    /**
     * 导出资产指纹信息
     *
     * 导出资产指纹信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetFileRequest 请求对象
     * @return SyncInvoker<DownloadAssetFileRequest, DownloadAssetFileResponse>
     */
    public SyncInvoker<DownloadAssetFileRequest, DownloadAssetFileResponse> downloadAssetFileInvoker(
        DownloadAssetFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.downloadAssetFile, hcClient);
    }

    /**
     * 下载告警源文件
     *
     * 下载告警源文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadEventSourceFileRequest 请求对象
     * @return DownloadEventSourceFileResponse
     */
    public DownloadEventSourceFileResponse downloadEventSourceFile(DownloadEventSourceFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.downloadEventSourceFile);
    }

    /**
     * 下载告警源文件
     *
     * 下载告警源文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadEventSourceFileRequest 请求对象
     * @return SyncInvoker<DownloadEventSourceFileRequest, DownloadEventSourceFileResponse>
     */
    public SyncInvoker<DownloadEventSourceFileRequest, DownloadEventSourceFileResponse> downloadEventSourceFileInvoker(
        DownloadEventSourceFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.downloadEventSourceFile, hcClient);
    }

    /**
     * 开启可信服务
     *
     * 开启可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableTrustServiceRequest 请求对象
     * @return EnableTrustServiceResponse
     */
    public EnableTrustServiceResponse enableTrustService(EnableTrustServiceRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.enableTrustService);
    }

    /**
     * 开启可信服务
     *
     * 开启可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableTrustServiceRequest 请求对象
     * @return SyncInvoker<EnableTrustServiceRequest, EnableTrustServiceResponse>
     */
    public SyncInvoker<EnableTrustServiceRequest, EnableTrustServiceResponse> enableTrustServiceInvoker(
        EnableTrustServiceRequest request) {
        return new SyncInvoker<>(request, HssMeta.enableTrustService, hcClient);
    }

    /**
     * 创建容器导出任务
     *
     * 创建容器导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportContainerListRequest 请求对象
     * @return ExportContainerListResponse
     */
    public ExportContainerListResponse exportContainerList(ExportContainerListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportContainerList);
    }

    /**
     * 创建容器导出任务
     *
     * 创建容器导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportContainerListRequest 请求对象
     * @return SyncInvoker<ExportContainerListRequest, ExportContainerListResponse>
     */
    public SyncInvoker<ExportContainerListRequest, ExportContainerListResponse> exportContainerListInvoker(
        ExportContainerListRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportContainerList, hcClient);
    }

    /**
     * 导出漏洞请求
     *
     * 导出入侵事件请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportEventRequestRequest 请求对象
     * @return ExportEventRequestResponse
     */
    public ExportEventRequestResponse exportEventRequest(ExportEventRequestRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportEventRequest);
    }

    /**
     * 导出漏洞请求
     *
     * 导出入侵事件请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportEventRequestRequest 请求对象
     * @return SyncInvoker<ExportEventRequestRequest, ExportEventRequestResponse>
     */
    public SyncInvoker<ExportEventRequestRequest, ExportEventRequestResponse> exportEventRequestInvoker(
        ExportEventRequestRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportEventRequest, hcClient);
    }

    /**
     * 查询多账号列表
     *
     * 查询多账号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAccounts);
    }

    /**
     * 查询多账号列表
     *
     * 查询多账号列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return SyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public SyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsInvoker(ListAccountsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAccounts, hcClient);
    }

    /**
     * 查询agent安装脚本
     *
     * 查询agent安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInstallScriptRequest 请求对象
     * @return ListAgentInstallScriptResponse
     */
    public ListAgentInstallScriptResponse listAgentInstallScript(ListAgentInstallScriptRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAgentInstallScript);
    }

    /**
     * 查询agent安装脚本
     *
     * 查询agent安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInstallScriptRequest 请求对象
     * @return SyncInvoker<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse>
     */
    public SyncInvoker<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> listAgentInstallScriptInvoker(
        ListAgentInstallScriptRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAgentInstallScript, hcClient);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhiteListRequest 请求对象
     * @return ListAlarmWhiteListResponse
     */
    public ListAlarmWhiteListResponse listAlarmWhiteList(ListAlarmWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAlarmWhiteList);
    }

    /**
     * 查询告警白名单列表
     *
     * 查询告警白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmWhiteListRequest 请求对象
     * @return SyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse>
     */
    public SyncInvoker<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteListInvoker(
        ListAlarmWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAlarmWhiteList, hcClient);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppChangeHistoriesRequest 请求对象
     * @return ListAppChangeHistoriesResponse
     */
    public ListAppChangeHistoriesResponse listAppChangeHistories(ListAppChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppChangeHistories);
    }

    /**
     * 获取软件信息的历史变动记录
     *
     * 获取软件信息的历史变动记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse>
     */
    public SyncInvoker<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistoriesInvoker(
        ListAppChangeHistoriesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppChangeHistories, hcClient);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppStatisticsRequest 请求对象
     * @return ListAppStatisticsResponse
     */
    public ListAppStatisticsResponse listAppStatistics(ListAppStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppStatistics);
    }

    /**
     * 查询软件列表
     *
     * 查询软件列表，支持通过软件名称查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppStatisticsRequest 请求对象
     * @return SyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse>
     */
    public SyncInvoker<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatisticsInvoker(
        ListAppStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppStatistics, hcClient);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listApps);
    }

    /**
     * 查询软件的服务器列表
     *
     * 查询软件的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listApps, hcClient);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return ListAutoLaunchChangeHistoriesResponse
     */
    public ListAutoLaunchChangeHistoriesResponse listAutoLaunchChangeHistories(
        ListAutoLaunchChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchChangeHistories);
    }

    /**
     * 获取自启动项的历史变动记录
     *
     * 获取自启动项的历史变动记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse>
     */
    public SyncInvoker<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistoriesInvoker(
        ListAutoLaunchChangeHistoriesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAutoLaunchChangeHistories, hcClient);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchStatisticsRequest 请求对象
     * @return ListAutoLaunchStatisticsResponse
     */
    public ListAutoLaunchStatisticsResponse listAutoLaunchStatistics(ListAutoLaunchStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchStatistics);
    }

    /**
     * 查询自启动项信息
     *
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchStatisticsRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse>
     */
    public SyncInvoker<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatisticsInvoker(
        ListAutoLaunchStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAutoLaunchStatistics, hcClient);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchsRequest 请求对象
     * @return ListAutoLaunchsResponse
     */
    public ListAutoLaunchsResponse listAutoLaunchs(ListAutoLaunchsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoLaunchs);
    }

    /**
     * 查询自启动项的服务列表
     *
     * 查询自启动项的服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchsRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse>
     */
    public SyncInvoker<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchsInvoker(
        ListAutoLaunchsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAutoLaunchs, hcClient);
    }

    /**
     * 查询已拦截IP列表
     *
     * 查询已拦截IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockedIpRequest 请求对象
     * @return ListBlockedIpResponse
     */
    public ListBlockedIpResponse listBlockedIp(ListBlockedIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBlockedIp);
    }

    /**
     * 查询已拦截IP列表
     *
     * 查询已拦截IP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockedIpRequest 请求对象
     * @return SyncInvoker<ListBlockedIpRequest, ListBlockedIpResponse>
     */
    public SyncInvoker<ListBlockedIpRequest, ListBlockedIpResponse> listBlockedIpInvoker(ListBlockedIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBlockedIp, hcClient);
    }

    /**
     * 获取集群配置
     *
     * 获取集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterConfigRequest 请求对象
     * @return ListCceClusterConfigResponse
     */
    public ListCceClusterConfigResponse listCceClusterConfig(ListCceClusterConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCceClusterConfig);
    }

    /**
     * 获取集群配置
     *
     * 获取集群配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterConfigRequest 请求对象
     * @return SyncInvoker<ListCceClusterConfigRequest, ListCceClusterConfigResponse>
     */
    public SyncInvoker<ListCceClusterConfigRequest, ListCceClusterConfigResponse> listCceClusterConfigInvoker(
        ListCceClusterConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCceClusterConfig, hcClient);
    }

    /**
     * 批量获取容器集群风险信息
     *
     * 批量获取容器集群风险信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterDetectRiskRequest 请求对象
     * @return ListCceClusterDetectRiskResponse
     */
    public ListCceClusterDetectRiskResponse listCceClusterDetectRisk(ListCceClusterDetectRiskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCceClusterDetectRisk);
    }

    /**
     * 批量获取容器集群风险信息
     *
     * 批量获取容器集群风险信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceClusterDetectRiskRequest 请求对象
     * @return SyncInvoker<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse>
     */
    public SyncInvoker<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse> listCceClusterDetectRiskInvoker(
        ListCceClusterDetectRiskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCceClusterDetectRisk, hcClient);
    }

    /**
     * 查询检测规则列表
     *
     * 查询检测规则列表：查询默认检测规则信息，包含14种检测规则，默认都不开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckFeatureRuleRequest 请求对象
     * @return ListCheckFeatureRuleResponse
     */
    public ListCheckFeatureRuleResponse listCheckFeatureRule(ListCheckFeatureRuleRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCheckFeatureRule);
    }

    /**
     * 查询检测规则列表
     *
     * 查询检测规则列表：查询默认检测规则信息，包含14种检测规则，默认都不开启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckFeatureRuleRequest 请求对象
     * @return SyncInvoker<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse>
     */
    public SyncInvoker<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse> listCheckFeatureRuleInvoker(
        ListCheckFeatureRuleRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCheckFeatureRule, hcClient);
    }

    /**
     * 查询k8s集群审计日志列表
     *
     * 查询k8s集群审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAuditLogsRequest 请求对象
     * @return ListClusterAuditLogsResponse
     */
    public ListClusterAuditLogsResponse listClusterAuditLogs(ListClusterAuditLogsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterAuditLogs);
    }

    /**
     * 查询k8s集群审计日志列表
     *
     * 查询k8s集群审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterAuditLogsRequest 请求对象
     * @return SyncInvoker<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse>
     */
    public SyncInvoker<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse> listClusterAuditLogsInvoker(
        ListClusterAuditLogsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterAuditLogs, hcClient);
    }

    /**
     * 查询k8s集群事件列表
     *
     * 查询k8s集群事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventLogsRequest 请求对象
     * @return ListClusterEventLogsResponse
     */
    public ListClusterEventLogsResponse listClusterEventLogs(ListClusterEventLogsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterEventLogs);
    }

    /**
     * 查询k8s集群事件列表
     *
     * 查询k8s集群事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventLogsRequest 请求对象
     * @return SyncInvoker<ListClusterEventLogsRequest, ListClusterEventLogsResponse>
     */
    public SyncInvoker<ListClusterEventLogsRequest, ListClusterEventLogsResponse> listClusterEventLogsInvoker(
        ListClusterEventLogsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterEventLogs, hcClient);
    }

    /**
     * 获取所有集群中告警事件
     *
     * 获取所有集群中告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventsRequest 请求对象
     * @return ListClusterEventsResponse
     */
    public ListClusterEventsResponse listClusterEvents(ListClusterEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterEvents);
    }

    /**
     * 获取所有集群中告警事件
     *
     * 获取所有集群中告警事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterEventsRequest 请求对象
     * @return SyncInvoker<ListClusterEventsRequest, ListClusterEventsResponse>
     */
    public SyncInvoker<ListClusterEventsRequest, ListClusterEventsResponse> listClusterEventsInvoker(
        ListClusterEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterEvents, hcClient);
    }

    /**
     * 集群防护概览
     *
     * 集群防护概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectOverviewRequest 请求对象
     * @return ListClusterProtectOverviewResponse
     */
    public ListClusterProtectOverviewResponse listClusterProtectOverview(ListClusterProtectOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectOverview);
    }

    /**
     * 集群防护概览
     *
     * 集群防护概览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectOverviewRequest 请求对象
     * @return SyncInvoker<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse>
     */
    public SyncInvoker<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse> listClusterProtectOverviewInvoker(
        ListClusterProtectOverviewRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectOverview, hcClient);
    }

    /**
     * 查询集群组件防护策略模板列表
     *
     * 查询集群防护策略模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectPolicyTemplatesRequest 请求对象
     * @return ListClusterProtectPolicyTemplatesResponse
     */
    public ListClusterProtectPolicyTemplatesResponse listClusterProtectPolicyTemplates(
        ListClusterProtectPolicyTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectPolicyTemplates);
    }

    /**
     * 查询集群组件防护策略模板列表
     *
     * 查询集群防护策略模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectPolicyTemplatesRequest 请求对象
     * @return SyncInvoker<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse>
     */
    public SyncInvoker<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse> listClusterProtectPolicyTemplatesInvoker(
        ListClusterProtectPolicyTemplatesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectPolicyTemplates, hcClient);
    }

    /**
     * 获取集群防护默认策略列表
     *
     * 获取集群防护默认策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionDefaultPolicyRequest 请求对象
     * @return ListClusterProtectionDefaultPolicyResponse
     */
    public ListClusterProtectionDefaultPolicyResponse listClusterProtectionDefaultPolicy(
        ListClusterProtectionDefaultPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectionDefaultPolicy);
    }

    /**
     * 获取集群防护默认策略列表
     *
     * 获取集群防护默认策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionDefaultPolicyRequest 请求对象
     * @return SyncInvoker<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse>
     */
    public SyncInvoker<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse> listClusterProtectionDefaultPolicyInvoker(
        ListClusterProtectionDefaultPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectionDefaultPolicy, hcClient);
    }

    /**
     * 查询集群防护信息
     *
     * 查询集群防护信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionInfoRequest 请求对象
     * @return ListClusterProtectionInfoResponse
     */
    public ListClusterProtectionInfoResponse listClusterProtectionInfo(ListClusterProtectionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectionInfo);
    }

    /**
     * 查询集群防护信息
     *
     * 查询集群防护信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionInfoRequest 请求对象
     * @return SyncInvoker<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse>
     */
    public SyncInvoker<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse> listClusterProtectionInfoInvoker(
        ListClusterProtectionInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectionInfo, hcClient);
    }

    /**
     * 获取集群所有防护项
     *
     * 获取集群所有防护项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionItemRequest 请求对象
     * @return ListClusterProtectionItemResponse
     */
    public ListClusterProtectionItemResponse listClusterProtectionItem(ListClusterProtectionItemRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectionItem);
    }

    /**
     * 获取集群所有防护项
     *
     * 获取集群所有防护项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionItemRequest 请求对象
     * @return SyncInvoker<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse>
     */
    public SyncInvoker<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse> listClusterProtectionItemInvoker(
        ListClusterProtectionItemRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectionItem, hcClient);
    }

    /**
     * 获取集群防护策略列表
     *
     * 获取集群防护策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyRequest 请求对象
     * @return ListClusterProtectionPolicyResponse
     */
    public ListClusterProtectionPolicyResponse listClusterProtectionPolicy(ListClusterProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectionPolicy);
    }

    /**
     * 获取集群防护策略列表
     *
     * 获取集群防护策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyRequest 请求对象
     * @return SyncInvoker<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse>
     */
    public SyncInvoker<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse> listClusterProtectionPolicyInvoker(
        ListClusterProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectionPolicy, hcClient);
    }

    /**
     * 查看指定策略的详情
     *
     * 查看指定策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyDetailRequest 请求对象
     * @return ListClusterProtectionPolicyDetailResponse
     */
    public ListClusterProtectionPolicyDetailResponse listClusterProtectionPolicyDetail(
        ListClusterProtectionPolicyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterProtectionPolicyDetail);
    }

    /**
     * 查看指定策略的详情
     *
     * 查看指定策略的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterProtectionPolicyDetailRequest 请求对象
     * @return SyncInvoker<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse>
     */
    public SyncInvoker<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse> listClusterProtectionPolicyDetailInvoker(
        ListClusterProtectionPolicyDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterProtectionPolicyDetail, hcClient);
    }

    /**
     * 获取部分提示信息
     *
     * 获取部分提示信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonTipsRequest 请求对象
     * @return ListCommonTipsResponse
     */
    public ListCommonTipsResponse listCommonTips(ListCommonTipsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCommonTips);
    }

    /**
     * 获取部分提示信息
     *
     * 获取部分提示信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommonTipsRequest 请求对象
     * @return SyncInvoker<ListCommonTipsRequest, ListCommonTipsResponse>
     */
    public SyncInvoker<ListCommonTipsRequest, ListCommonTipsResponse> listCommonTipsInvoker(
        ListCommonTipsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCommonTips, hcClient);
    }

    /**
     * 查询容器内运行的命令列表
     *
     * 查询容器内运行的命令列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerCmdLogsRequest 请求对象
     * @return ListContainerCmdLogsResponse
     */
    public ListContainerCmdLogsResponse listContainerCmdLogs(ListContainerCmdLogsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerCmdLogs);
    }

    /**
     * 查询容器内运行的命令列表
     *
     * 查询容器内运行的命令列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerCmdLogsRequest 请求对象
     * @return SyncInvoker<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse>
     */
    public SyncInvoker<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse> listContainerCmdLogsInvoker(
        ListContainerCmdLogsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerCmdLogs, hcClient);
    }

    /**
     * 查询容器日志列表
     *
     * 查询容器日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerLogsRequest 请求对象
     * @return ListContainerLogsResponse
     */
    public ListContainerLogsResponse listContainerLogs(ListContainerLogsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerLogs);
    }

    /**
     * 查询容器日志列表
     *
     * 查询容器日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerLogsRequest 请求对象
     * @return SyncInvoker<ListContainerLogsRequest, ListContainerLogsResponse>
     */
    public SyncInvoker<ListContainerLogsRequest, ListContainerLogsResponse> listContainerLogsInvoker(
        ListContainerLogsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerLogs, hcClient);
    }

    /**
     * 查询容器防护的集群信息
     *
     * 查询容器防护的集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkClustersRequest 请求对象
     * @return ListContainerNetworkClustersResponse
     */
    public ListContainerNetworkClustersResponse listContainerNetworkClusters(
        ListContainerNetworkClustersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerNetworkClusters);
    }

    /**
     * 查询容器防护的集群信息
     *
     * 查询容器防护的集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkClustersRequest 请求对象
     * @return SyncInvoker<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse>
     */
    public SyncInvoker<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse> listContainerNetworkClustersInvoker(
        ListContainerNetworkClustersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerNetworkClusters, hcClient);
    }

    /**
     * 查询容器集群VPC网络的节点列表
     *
     * 查询容器集群网络的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkNodeListRequest 请求对象
     * @return ListContainerNetworkNodeListResponse
     */
    public ListContainerNetworkNodeListResponse listContainerNetworkNodeList(
        ListContainerNetworkNodeListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerNetworkNodeList);
    }

    /**
     * 查询容器集群VPC网络的节点列表
     *
     * 查询容器集群网络的节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkNodeListRequest 请求对象
     * @return SyncInvoker<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse>
     */
    public SyncInvoker<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse> listContainerNetworkNodeListInvoker(
        ListContainerNetworkNodeListRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerNetworkNodeList, hcClient);
    }

    /**
     * 查询容器集群网络的策略列表
     *
     * 查询容器集群网络的策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkPolicyRequest 请求对象
     * @return ListContainerNetworkPolicyResponse
     */
    public ListContainerNetworkPolicyResponse listContainerNetworkPolicy(ListContainerNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerNetworkPolicy);
    }

    /**
     * 查询容器集群网络的策略列表
     *
     * 查询容器集群网络的策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNetworkPolicyRequest 请求对象
     * @return SyncInvoker<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse>
     */
    public SyncInvoker<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse> listContainerNetworkPolicyInvoker(
        ListContainerNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerNetworkPolicy, hcClient);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return ListContainerNodesResponse
     */
    public ListContainerNodesResponse listContainerNodes(ListContainerNodesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerNodes);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return SyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>
     */
    public SyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodesInvoker(
        ListContainerNodesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerNodes, hcClient);
    }

    /**
     * 查询容器基本信息列表
     *
     * 查询容器基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainersRequest 请求对象
     * @return ListContainersResponse
     */
    public ListContainersResponse listContainers(ListContainersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainers);
    }

    /**
     * 查询容器基本信息列表
     *
     * 查询容器基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainersRequest 请求对象
     * @return SyncInvoker<ListContainersRequest, ListContainersResponse>
     */
    public SyncInvoker<ListContainersRequest, ListContainersResponse> listContainersInvoker(
        ListContainersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainers, hcClient);
    }

    /**
     * 查看支持配置动态端口蜜罐的主机列表
     *
     * 查看支持配置动态端口蜜罐的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortAvailableHostRequest 请求对象
     * @return ListDecoyPortAvailableHostResponse
     */
    public ListDecoyPortAvailableHostResponse listDecoyPortAvailableHost(ListDecoyPortAvailableHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listDecoyPortAvailableHost);
    }

    /**
     * 查看支持配置动态端口蜜罐的主机列表
     *
     * 查看支持配置动态端口蜜罐的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortAvailableHostRequest 请求对象
     * @return SyncInvoker<ListDecoyPortAvailableHostRequest, ListDecoyPortAvailableHostResponse>
     */
    public SyncInvoker<ListDecoyPortAvailableHostRequest, ListDecoyPortAvailableHostResponse> listDecoyPortAvailableHostInvoker(
        ListDecoyPortAvailableHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listDecoyPortAvailableHost, hcClient);
    }

    /**
     * 查看动态端口蜜罐策略
     *
     * 查看动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortPolicyRequest 请求对象
     * @return ListDecoyPortPolicyResponse
     */
    public ListDecoyPortPolicyResponse listDecoyPortPolicy(ListDecoyPortPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listDecoyPortPolicy);
    }

    /**
     * 查看动态端口蜜罐策略
     *
     * 查看动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDecoyPortPolicyRequest 请求对象
     * @return SyncInvoker<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse>
     */
    public SyncInvoker<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse> listDecoyPortPolicyInvoker(
        ListDecoyPortPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listDecoyPortPolicy, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDockerPluginsRequest 请求对象
     * @return ListDockerPluginsResponse
     */
    public ListDockerPluginsResponse listDockerPlugins(ListDockerPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listDockerPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDockerPluginsRequest 请求对象
     * @return SyncInvoker<ListDockerPluginsRequest, ListDockerPluginsResponse>
     */
    public SyncInvoker<ListDockerPluginsRequest, ListDockerPluginsResponse> listDockerPluginsInvoker(
        ListDockerPluginsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listDockerPlugins, hcClient);
    }

    /**
     * 下载导出文件
     *
     * 下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadExportedFileRequest 请求对象
     * @return ListDownloadExportedFileResponse
     */
    public ListDownloadExportedFileResponse listDownloadExportedFile(ListDownloadExportedFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listDownloadExportedFile);
    }

    /**
     * 下载导出文件
     *
     * 下载导出文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDownloadExportedFileRequest 请求对象
     * @return SyncInvoker<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse>
     */
    public SyncInvoker<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> listDownloadExportedFileInvoker(
        ListDownloadExportedFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.listDownloadExportedFile, hcClient);
    }

    /**
     * 查询ATT&amp;CK攻击阶段统计列表
     *
     * 查询ATT&amp;CK攻击阶段统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventAttCkRequest 请求对象
     * @return ListEventAttCkResponse
     */
    public ListEventAttCkResponse listEventAttCk(ListEventAttCkRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventAttCk);
    }

    /**
     * 查询ATT&amp;CK攻击阶段统计列表
     *
     * 查询ATT&amp;CK攻击阶段统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventAttCkRequest 请求对象
     * @return SyncInvoker<ListEventAttCkRequest, ListEventAttCkResponse>
     */
    public SyncInvoker<ListEventAttCkRequest, ListEventAttCkResponse> listEventAttCkInvoker(
        ListEventAttCkRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventAttCk, hcClient);
    }

    /**
     * 查询具体事件的调查取证信息
     *
     * 查询具体事件的调查取证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventForensicRequest 请求对象
     * @return ListEventForensicResponse
     */
    public ListEventForensicResponse listEventForensic(ListEventForensicRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventForensic);
    }

    /**
     * 查询具体事件的调查取证信息
     *
     * 查询具体事件的调查取证信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventForensicRequest 请求对象
     * @return SyncInvoker<ListEventForensicRequest, ListEventForensicResponse>
     */
    public SyncInvoker<ListEventForensicRequest, ListEventForensicResponse> listEventForensicInvoker(
        ListEventForensicRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventForensic, hcClient);
    }

    /**
     * 查询事件支持的处理类型
     *
     * 查询事件支持的处理类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventOperatesRequest 请求对象
     * @return ListEventOperatesResponse
     */
    public ListEventOperatesResponse listEventOperates(ListEventOperatesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventOperates);
    }

    /**
     * 查询事件支持的处理类型
     *
     * 查询事件支持的处理类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventOperatesRequest 请求对象
     * @return SyncInvoker<ListEventOperatesRequest, ListEventOperatesResponse>
     */
    public SyncInvoker<ListEventOperatesRequest, ListEventOperatesResponse> listEventOperatesInvoker(
        ListEventOperatesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventOperates, hcClient);
    }

    /**
     * 查询TOP5事件类型统计列表--接口已废弃
     *
     * 查询TOP5事件类型统计列表--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTopRiskRequest 请求对象
     * @return ListEventTopRiskResponse
     */
    public ListEventTopRiskResponse listEventTopRisk(ListEventTopRiskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventTopRisk);
    }

    /**
     * 查询TOP5事件类型统计列表--接口已废弃
     *
     * 查询TOP5事件类型统计列表--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTopRiskRequest 请求对象
     * @return SyncInvoker<ListEventTopRiskRequest, ListEventTopRiskResponse>
     */
    public SyncInvoker<ListEventTopRiskRequest, ListEventTopRiskResponse> listEventTopRiskInvoker(
        ListEventTopRiskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventTopRisk, hcClient);
    }

    /**
     * 查询事件类型统计列表
     *
     * 查询事件类型统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTypeRequest 请求对象
     * @return ListEventTypeResponse
     */
    public ListEventTypeResponse listEventType(ListEventTypeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventType);
    }

    /**
     * 查询事件类型统计列表
     *
     * 查询事件类型统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTypeRequest 请求对象
     * @return SyncInvoker<ListEventTypeRequest, ListEventTypeResponse>
     */
    public SyncInvoker<ListEventTypeRequest, ListEventTypeResponse> listEventTypeInvoker(ListEventTypeRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventType, hcClient);
    }

    /**
     * 查询资产全局扫描任务状态
     *
     * 查询资产全局扫描任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalAssetScanTaskRequest 请求对象
     * @return ListGlobalAssetScanTaskResponse
     */
    public ListGlobalAssetScanTaskResponse listGlobalAssetScanTask(ListGlobalAssetScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGlobalAssetScanTask);
    }

    /**
     * 查询资产全局扫描任务状态
     *
     * 查询资产全局扫描任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalAssetScanTaskRequest 请求对象
     * @return SyncInvoker<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse>
     */
    public SyncInvoker<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse> listGlobalAssetScanTaskInvoker(
        ListGlobalAssetScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGlobalAssetScanTask, hcClient);
    }

    /**
     * 查询已隔离文件列表
     *
     * 查询已隔离文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsolatedFileRequest 请求对象
     * @return ListIsolatedFileResponse
     */
    public ListIsolatedFileResponse listIsolatedFile(ListIsolatedFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listIsolatedFile);
    }

    /**
     * 查询已隔离文件列表
     *
     * 查询已隔离文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIsolatedFileRequest 请求对象
     * @return SyncInvoker<ListIsolatedFileRequest, ListIsolatedFileResponse>
     */
    public SyncInvoker<ListIsolatedFileRequest, ListIsolatedFileResponse> listIsolatedFileInvoker(
        ListIsolatedFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.listIsolatedFile, hcClient);
    }

    /**
     * 查询指定中间件的服务器列表
     *
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageHostInfoRequest 请求对象
     * @return ListJarPackageHostInfoResponse
     */
    public ListJarPackageHostInfoResponse listJarPackageHostInfo(ListJarPackageHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listJarPackageHostInfo);
    }

    /**
     * 查询指定中间件的服务器列表
     *
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageHostInfoRequest 请求对象
     * @return SyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse>
     */
    public SyncInvoker<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfoInvoker(
        ListJarPackageHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listJarPackageHostInfo, hcClient);
    }

    /**
     * 查询指定主机的中间件信息
     *
     * 查询指定主机的中间件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageInfoRequest 请求对象
     * @return ListJarPackageInfoResponse
     */
    public ListJarPackageInfoResponse listJarPackageInfo(ListJarPackageInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listJarPackageInfo);
    }

    /**
     * 查询指定主机的中间件信息
     *
     * 查询指定主机的中间件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageInfoRequest 请求对象
     * @return SyncInvoker<ListJarPackageInfoRequest, ListJarPackageInfoResponse>
     */
    public SyncInvoker<ListJarPackageInfoRequest, ListJarPackageInfoResponse> listJarPackageInfoInvoker(
        ListJarPackageInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listJarPackageInfo, hcClient);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageStatisticsRequest 请求对象
     * @return ListJarPackageStatisticsResponse
     */
    public ListJarPackageStatisticsResponse listJarPackageStatistics(ListJarPackageStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listJarPackageStatistics);
    }

    /**
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJarPackageStatisticsRequest 请求对象
     * @return SyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse>
     */
    public SyncInvoker<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatisticsInvoker(
        ListJarPackageStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listJarPackageStatistics, hcClient);
    }

    /**
     * 查询cronjobs基本信息列表
     *
     * 查询cronjobs基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sCronJobsRequest 请求对象
     * @return ListK8sCronJobsResponse
     */
    public ListK8sCronJobsResponse listK8sCronJobs(ListK8sCronJobsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sCronJobs);
    }

    /**
     * 查询cronjobs基本信息列表
     *
     * 查询cronjobs基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sCronJobsRequest 请求对象
     * @return SyncInvoker<ListK8sCronJobsRequest, ListK8sCronJobsResponse>
     */
    public SyncInvoker<ListK8sCronJobsRequest, ListK8sCronJobsResponse> listK8sCronJobsInvoker(
        ListK8sCronJobsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sCronJobs, hcClient);
    }

    /**
     * 查询daemonsets基本信息列表
     *
     * 查询daemonsets基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDaemonSetsRequest 请求对象
     * @return ListK8sDaemonSetsResponse
     */
    public ListK8sDaemonSetsResponse listK8sDaemonSets(ListK8sDaemonSetsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sDaemonSets);
    }

    /**
     * 查询daemonsets基本信息列表
     *
     * 查询daemonsets基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDaemonSetsRequest 请求对象
     * @return SyncInvoker<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse>
     */
    public SyncInvoker<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse> listK8sDaemonSetsInvoker(
        ListK8sDaemonSetsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sDaemonSets, hcClient);
    }

    /**
     * 查询deployment基本信息列表
     *
     * 查询deployment基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDeploymentsRequest 请求对象
     * @return ListK8sDeploymentsResponse
     */
    public ListK8sDeploymentsResponse listK8sDeployments(ListK8sDeploymentsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sDeployments);
    }

    /**
     * 查询deployment基本信息列表
     *
     * 查询deployment基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sDeploymentsRequest 请求对象
     * @return SyncInvoker<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse>
     */
    public SyncInvoker<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse> listK8sDeploymentsInvoker(
        ListK8sDeploymentsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sDeployments, hcClient);
    }

    /**
     * 查询jobs基本信息列表
     *
     * 查询jobs基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sJobsRequest 请求对象
     * @return ListK8sJobsResponse
     */
    public ListK8sJobsResponse listK8sJobs(ListK8sJobsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sJobs);
    }

    /**
     * 查询jobs基本信息列表
     *
     * 查询jobs基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sJobsRequest 请求对象
     * @return SyncInvoker<ListK8sJobsRequest, ListK8sJobsResponse>
     */
    public SyncInvoker<ListK8sJobsRequest, ListK8sJobsResponse> listK8sJobsInvoker(ListK8sJobsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sJobs, hcClient);
    }

    /**
     * 查询pod基本信息列表
     *
     * 查询pod基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sPodsRequest 请求对象
     * @return ListK8sPodsResponse
     */
    public ListK8sPodsResponse listK8sPods(ListK8sPodsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sPods);
    }

    /**
     * 查询pod基本信息列表
     *
     * 查询pod基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sPodsRequest 请求对象
     * @return SyncInvoker<ListK8sPodsRequest, ListK8sPodsResponse>
     */
    public SyncInvoker<ListK8sPodsRequest, ListK8sPodsResponse> listK8sPodsInvoker(ListK8sPodsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sPods, hcClient);
    }

    /**
     * 查询statefulset基本信息列表
     *
     * 查询statefulset基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sStatefulSetsRequest 请求对象
     * @return ListK8sStatefulSetsResponse
     */
    public ListK8sStatefulSetsResponse listK8sStatefulSets(ListK8sStatefulSetsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listK8sStatefulSets);
    }

    /**
     * 查询statefulset基本信息列表
     *
     * 查询statefulset基本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListK8sStatefulSetsRequest 请求对象
     * @return SyncInvoker<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse>
     */
    public SyncInvoker<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse> listK8sStatefulSetsInvoker(
        ListK8sStatefulSetsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listK8sStatefulSets, hcClient);
    }

    /**
     * 查询指定内核模块的服务器列表
     *
     * 查询指定内核模块的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleHostInfoRequest 请求对象
     * @return ListKernelModuleHostInfoResponse
     */
    public ListKernelModuleHostInfoResponse listKernelModuleHostInfo(ListKernelModuleHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKernelModuleHostInfo);
    }

    /**
     * 查询指定内核模块的服务器列表
     *
     * 查询指定内核模块的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleHostInfoRequest 请求对象
     * @return SyncInvoker<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse>
     */
    public SyncInvoker<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse> listKernelModuleHostInfoInvoker(
        ListKernelModuleHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKernelModuleHostInfo, hcClient);
    }

    /**
     * 查询指定主机的内核模块信息
     *
     * 查询指定主机的内核模块信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleInfoRequest 请求对象
     * @return ListKernelModuleInfoResponse
     */
    public ListKernelModuleInfoResponse listKernelModuleInfo(ListKernelModuleInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKernelModuleInfo);
    }

    /**
     * 查询指定主机的内核模块信息
     *
     * 查询指定主机的内核模块信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleInfoRequest 请求对象
     * @return SyncInvoker<ListKernelModuleInfoRequest, ListKernelModuleInfoResponse>
     */
    public SyncInvoker<ListKernelModuleInfoRequest, ListKernelModuleInfoResponse> listKernelModuleInfoInvoker(
        ListKernelModuleInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKernelModuleInfo, hcClient);
    }

    /**
     * 查询内核模块的统计信息
     *
     * 查询内核模块的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleStatisticsRequest 请求对象
     * @return ListKernelModuleStatisticsResponse
     */
    public ListKernelModuleStatisticsResponse listKernelModuleStatistics(ListKernelModuleStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKernelModuleStatistics);
    }

    /**
     * 查询内核模块的统计信息
     *
     * 查询内核模块的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelModuleStatisticsRequest 请求对象
     * @return SyncInvoker<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse>
     */
    public SyncInvoker<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse> listKernelModuleStatisticsInvoker(
        ListKernelModuleStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKernelModuleStatistics, hcClient);
    }

    /**
     * 查询容器Kubernetes集群列表
     *
     * 查询容器Kubernetes集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesClusterDetailsRequest 请求对象
     * @return ListKubernetesClusterDetailsResponse
     */
    public ListKubernetesClusterDetailsResponse listKubernetesClusterDetails(
        ListKubernetesClusterDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKubernetesClusterDetails);
    }

    /**
     * 查询容器Kubernetes集群列表
     *
     * 查询容器Kubernetes集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesClusterDetailsRequest 请求对象
     * @return SyncInvoker<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse>
     */
    public SyncInvoker<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse> listKubernetesClusterDetailsInvoker(
        ListKubernetesClusterDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKubernetesClusterDetails, hcClient);
    }

    /**
     * 查询容器Kubernetes端点列表
     *
     * 查询容器Kubernetes端点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesEndpointDetailsRequest 请求对象
     * @return ListKubernetesEndpointDetailsResponse
     */
    public ListKubernetesEndpointDetailsResponse listKubernetesEndpointDetails(
        ListKubernetesEndpointDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKubernetesEndpointDetails);
    }

    /**
     * 查询容器Kubernetes端点列表
     *
     * 查询容器Kubernetes端点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesEndpointDetailsRequest 请求对象
     * @return SyncInvoker<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse>
     */
    public SyncInvoker<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse> listKubernetesEndpointDetailsInvoker(
        ListKubernetesEndpointDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKubernetesEndpointDetails, hcClient);
    }

    /**
     * 查询容器Kubernetes服务列表
     *
     * 查询容器Kubernetes服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesServiceDetailsRequest 请求对象
     * @return ListKubernetesServiceDetailsResponse
     */
    public ListKubernetesServiceDetailsResponse listKubernetesServiceDetails(
        ListKubernetesServiceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listKubernetesServiceDetails);
    }

    /**
     * 查询容器Kubernetes服务列表
     *
     * 查询容器Kubernetes服务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKubernetesServiceDetailsRequest 请求对象
     * @return SyncInvoker<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse>
     */
    public SyncInvoker<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse> listKubernetesServiceDetailsInvoker(
        ListKubernetesServiceDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listKubernetesServiceDetails, hcClient);
    }

    /**
     * 查询登录白名单列表
     *
     * 查询登录白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteListRequest 请求对象
     * @return ListLoginWhiteListResponse
     */
    public ListLoginWhiteListResponse listLoginWhiteList(ListLoginWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLoginWhiteList);
    }

    /**
     * 查询登录白名单列表
     *
     * 查询登录白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteListRequest 请求对象
     * @return SyncInvoker<ListLoginWhiteListRequest, ListLoginWhiteListResponse>
     */
    public SyncInvoker<ListLoginWhiteListRequest, ListLoginWhiteListResponse> listLoginWhiteListInvoker(
        ListLoginWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLoginWhiteList, hcClient);
    }

    /**
     * 查询恶意软件云查样本收集配置开关状态
     *
     * 查询恶意软件云查样本收集配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMalwareCollectStatusRequest 请求对象
     * @return ListMalwareCollectStatusResponse
     */
    public ListMalwareCollectStatusResponse listMalwareCollectStatus(ListMalwareCollectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listMalwareCollectStatus);
    }

    /**
     * 查询恶意软件云查样本收集配置开关状态
     *
     * 查询恶意软件云查样本收集配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMalwareCollectStatusRequest 请求对象
     * @return SyncInvoker<ListMalwareCollectStatusRequest, ListMalwareCollectStatusResponse>
     */
    public SyncInvoker<ListMalwareCollectStatusRequest, ListMalwareCollectStatusResponse> listMalwareCollectStatusInvoker(
        ListMalwareCollectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listMalwareCollectStatus, hcClient);
    }

    /**
     * 获取集群下的namespace
     *
     * 获取集群下的namespace。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listNamespaces);
    }

    /**
     * 获取集群下的namespace
     *
     * 获取集群下的namespace。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNamespacesRequest 请求对象
     * @return SyncInvoker<ListNamespacesRequest, ListNamespacesResponse>
     */
    public SyncInvoker<ListNamespacesRequest, ListNamespacesResponse> listNamespacesInvoker(
        ListNamespacesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listNamespaces, hcClient);
    }

    /**
     * 查询账号组织
     *
     * 查询账号组织。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return ListOrganizationTreeResponse
     */
    public ListOrganizationTreeResponse listOrganizationTree(ListOrganizationTreeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listOrganizationTree);
    }

    /**
     * 查询账号组织
     *
     * 查询账号组织。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationTreeRequest 请求对象
     * @return SyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse>
     */
    public SyncInvoker<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTreeInvoker(
        ListOrganizationTreeRequest request) {
        return new SyncInvoker<>(request, HssMeta.listOrganizationTree, hcClient);
    }

    /**
     * 获取docker插件安装脚本
     *
     * 获取docker插件安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInstallScriptRequest 请求对象
     * @return ListPluginInstallScriptResponse
     */
    public ListPluginInstallScriptResponse listPluginInstallScript(ListPluginInstallScriptRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPluginInstallScript);
    }

    /**
     * 获取docker插件安装脚本
     *
     * 获取docker插件安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInstallScriptRequest 请求对象
     * @return SyncInvoker<ListPluginInstallScriptRequest, ListPluginInstallScriptResponse>
     */
    public SyncInvoker<ListPluginInstallScriptRequest, ListPluginInstallScriptResponse> listPluginInstallScriptInvoker(
        ListPluginInstallScriptRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPluginInstallScript, hcClient);
    }

    /**
     * 查询指定开放端口的服务器列表
     *
     * 查询具备该端口的主机/容器的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortHostRequest 请求对象
     * @return ListPortHostResponse
     */
    public ListPortHostResponse listPortHost(ListPortHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPortHost);
    }

    /**
     * 查询指定开放端口的服务器列表
     *
     * 查询具备该端口的主机/容器的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortHostRequest 请求对象
     * @return SyncInvoker<ListPortHostRequest, ListPortHostResponse>
     */
    public SyncInvoker<ListPortHostRequest, ListPortHostResponse> listPortHostInvoker(ListPortHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPortHost, hcClient);
    }

    /**
     * 查询开放端口统计信息
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortStatisticsRequest 请求对象
     * @return ListPortStatisticsResponse
     */
    public ListPortStatisticsResponse listPortStatistics(ListPortStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPortStatistics);
    }

    /**
     * 查询开放端口统计信息
     *
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortStatisticsRequest 请求对象
     * @return SyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse>
     */
    public SyncInvoker<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatisticsInvoker(
        ListPortStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPortStatistics, hcClient);
    }

    /**
     * 查询单服务器的开放端口列表
     *
     * 查询单服务器的开放端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPorts);
    }

    /**
     * 查询单服务器的开放端口列表
     *
     * 查询单服务器的开放端口列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPorts, hcClient);
    }

    /**
     * 查询进程统计信息
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessStatisticsRequest 请求对象
     * @return ListProcessStatisticsResponse
     */
    public ListProcessStatisticsResponse listProcessStatistics(ListProcessStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProcessStatistics);
    }

    /**
     * 查询进程统计信息
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessStatisticsRequest 请求对象
     * @return SyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse>
     */
    public SyncInvoker<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatisticsInvoker(
        ListProcessStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProcessStatistics, hcClient);
    }

    /**
     * 查询指定进程的服务器列表
     *
     * 具备该进程的主机/容器的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesHostRequest 请求对象
     * @return ListProcessesHostResponse
     */
    public ListProcessesHostResponse listProcessesHost(ListProcessesHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProcessesHost);
    }

    /**
     * 查询指定进程的服务器列表
     *
     * 具备该进程的主机/容器的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesHostRequest 请求对象
     * @return SyncInvoker<ListProcessesHostRequest, ListProcessesHostResponse>
     */
    public SyncInvoker<ListProcessesHostRequest, ListProcessesHostResponse> listProcessesHostInvoker(
        ListProcessesHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProcessesHost, hcClient);
    }

    /**
     * 查询租户当前项目下所有用过的标签
     *
     * 查询租户当前项目下所有用过的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProjectTags);
    }

    /**
     * 查询租户当前项目下所有用过的标签
     *
     * 查询租户当前项目下所有用过的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProjectTags, hcClient);
    }

    /**
     * 查询防护服务器列表
     *
     * 查询防护服务器列表：查询防护服务器相关数据，包含服务器名称、ip地址、操作系统、服务器组名称、防护策略、防护状态、微服务防护状态、RASP防护状态、RASP攻击数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServersRequest 请求对象
     * @return ListProtectionServersResponse
     */
    public ListProtectionServersResponse listProtectionServers(ListProtectionServersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProtectionServers);
    }

    /**
     * 查询防护服务器列表
     *
     * 查询防护服务器列表：查询防护服务器相关数据，包含服务器名称、ip地址、操作系统、服务器组名称、防护策略、防护状态、微服务防护状态、RASP防护状态、RASP攻击数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServersRequest 请求对象
     * @return SyncInvoker<ListProtectionServersRequest, ListProtectionServersResponse>
     */
    public SyncInvoker<ListProtectionServersRequest, ListProtectionServersResponse> listProtectionServersInvoker(
        ListProtectionServersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProtectionServers, hcClient);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryExportTaskRequest 请求对象
     * @return ListQueryExportTaskResponse
     */
    public ListQueryExportTaskResponse listQueryExportTask(ListQueryExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listQueryExportTask);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryExportTaskRequest 请求对象
     * @return SyncInvoker<ListQueryExportTaskRequest, ListQueryExportTaskResponse>
     */
    public SyncInvoker<ListQueryExportTaskRequest, ListQueryExportTaskResponse> listQueryExportTaskInvoker(
        ListQueryExportTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listQueryExportTask, hcClient);
    }

    /**
     * 查询应用防护事件列表
     *
     * 查询应用防护事件列表：展示防护事件相关信息，包含告警级别、服务器名称、告警名称、告警时间、攻击源ip、攻击源url数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspEventsRequest 请求对象
     * @return ListRaspEventsResponse
     */
    public ListRaspEventsResponse listRaspEvents(ListRaspEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRaspEvents);
    }

    /**
     * 查询应用防护事件列表
     *
     * 查询应用防护事件列表：展示防护事件相关信息，包含告警级别、服务器名称、告警名称、告警时间、攻击源ip、攻击源url数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspEventsRequest 请求对象
     * @return SyncInvoker<ListRaspEventsRequest, ListRaspEventsResponse>
     */
    public SyncInvoker<ListRaspEventsRequest, ListRaspEventsResponse> listRaspEventsInvoker(
        ListRaspEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRaspEvents, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表：查询创建的防护策略信息，包含防护策略名称、检测规则、关联服务器数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspPoliciesRequest 请求对象
     * @return ListRaspPoliciesResponse
     */
    public ListRaspPoliciesResponse listRaspPolicies(ListRaspPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRaspPolicies);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表：查询创建的防护策略信息，包含防护策略名称、检测规则、关联服务器数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRaspPoliciesRequest 请求对象
     * @return SyncInvoker<ListRaspPoliciesRequest, ListRaspPoliciesResponse>
     */
    public SyncInvoker<ListRaspPoliciesRequest, ListRaspPoliciesResponse> listRaspPoliciesInvoker(
        ListRaspPoliciesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRaspPolicies, hcClient);
    }

    /**
     * 查询单个资源的资源标签
     *
     * 查询单个资源的资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceTagRequest 请求对象
     * @return ListResourceInstanceTagResponse
     */
    public ListResourceInstanceTagResponse listResourceInstanceTag(ListResourceInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listResourceInstanceTag);
    }

    /**
     * 查询单个资源的资源标签
     *
     * 查询单个资源的资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstanceTagRequest 请求对象
     * @return SyncInvoker<ListResourceInstanceTagRequest, ListResourceInstanceTagResponse>
     */
    public SyncInvoker<ListResourceInstanceTagRequest, ListResourceInstanceTagResponse> listResourceInstanceTagInvoker(
        ListResourceInstanceTagRequest request) {
        return new SyncInvoker<>(request, HssMeta.listResourceInstanceTag, hcClient);
    }

    /**
     * 查询某告警事件的相同告警列表
     *
     * 查询某告警事件的相同告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSameEventsRequest 请求对象
     * @return ListSameEventsResponse
     */
    public ListSameEventsResponse listSameEvents(ListSameEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSameEvents);
    }

    /**
     * 查询某告警事件的相同告警列表
     *
     * 查询某告警事件的相同告警列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSameEventsRequest 请求对象
     * @return SyncInvoker<ListSameEventsRequest, ListSameEventsResponse>
     */
    public SyncInvoker<ListSameEventsRequest, ListSameEventsResponse> listSameEventsInvoker(
        ListSameEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSameEvents, hcClient);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityEventsRequest 请求对象
     * @return ListSecurityEventsResponse
     */
    public ListSecurityEventsResponse listSecurityEvents(ListSecurityEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityEvents);
    }

    /**
     * 查入侵事件列表
     *
     * 查入侵事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityEventsRequest 请求对象
     * @return SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse>
     */
    public SyncInvoker<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEventsInvoker(
        ListSecurityEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityEvents, hcClient);
    }

    /**
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     *
     * 查询云原生网络模式2.0的集群已配置的安全组策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupPoliciesRequest 请求对象
     * @return ListSecurityGroupPoliciesResponse
     */
    public ListSecurityGroupPoliciesResponse listSecurityGroupPolicies(ListSecurityGroupPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityGroupPolicies);
    }

    /**
     * 查询云原生网络模式2.0的集群已配置的安全组策略
     *
     * 查询云原生网络模式2.0的集群已配置的安全组策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupPoliciesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse>
     */
    public SyncInvoker<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse> listSecurityGroupPoliciesInvoker(
        ListSecurityGroupPoliciesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityGroupPolicies, hcClient);
    }

    /**
     * 查询企业项目下所有的安全组列表
     *
     * 查询企业项目下所有的安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityGroups);
    }

    /**
     * 查询企业项目下所有的安全组列表
     *
     * 查询企业项目下所有的安全组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询某告警事件关联的已处理的相似告警
     *
     * 查询某告警事件关联的已处理的相似告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimilarHandledEventsRequest 请求对象
     * @return ListSimilarHandledEventsResponse
     */
    public ListSimilarHandledEventsResponse listSimilarHandledEvents(ListSimilarHandledEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSimilarHandledEvents);
    }

    /**
     * 查询某告警事件关联的已处理的相似告警
     *
     * 查询某告警事件关联的已处理的相似告警。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimilarHandledEventsRequest 请求对象
     * @return SyncInvoker<ListSimilarHandledEventsRequest, ListSimilarHandledEventsResponse>
     */
    public SyncInvoker<ListSimilarHandledEventsRequest, ListSimilarHandledEventsResponse> listSimilarHandledEventsInvoker(
        ListSimilarHandledEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSimilarHandledEvents, hcClient);
    }

    /**
     * 查询系统用户白名单列表
     *
     * 查询系统用户白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemUserWhiteListRequest 请求对象
     * @return ListSystemUserWhiteListResponse
     */
    public ListSystemUserWhiteListResponse listSystemUserWhiteList(ListSystemUserWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSystemUserWhiteList);
    }

    /**
     * 查询系统用户白名单列表
     *
     * 查询系统用户白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemUserWhiteListRequest 请求对象
     * @return SyncInvoker<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse>
     */
    public SyncInvoker<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse> listSystemUserWhiteListInvoker(
        ListSystemUserWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSystemUserWhiteList, hcClient);
    }

    /**
     * 获取可信服务状态
     *
     * 获取可信服务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustServiceStatusRequest 请求对象
     * @return ListTrustServiceStatusResponse
     */
    public ListTrustServiceStatusResponse listTrustServiceStatus(ListTrustServiceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listTrustServiceStatus);
    }

    /**
     * 获取可信服务状态
     *
     * 获取可信服务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustServiceStatusRequest 请求对象
     * @return SyncInvoker<ListTrustServiceStatusRequest, ListTrustServiceStatusResponse>
     */
    public SyncInvoker<ListTrustServiceStatusRequest, ListTrustServiceStatusResponse> listTrustServiceStatusInvoker(
        ListTrustServiceStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listTrustServiceStatus, hcClient);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserChangeHistoriesRequest 请求对象
     * @return ListUserChangeHistoriesResponse
     */
    public ListUserChangeHistoriesResponse listUserChangeHistories(ListUserChangeHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUserChangeHistories);
    }

    /**
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserChangeHistoriesRequest 请求对象
     * @return SyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse>
     */
    public SyncInvoker<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistoriesInvoker(
        ListUserChangeHistoriesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listUserChangeHistories, hcClient);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserStatisticsRequest 请求对象
     * @return ListUserStatisticsResponse
     */
    public ListUserStatisticsResponse listUserStatistics(ListUserStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUserStatistics);
    }

    /**
     * 查询账号信息列表
     *
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserStatisticsRequest 请求对象
     * @return SyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse>
     */
    public SyncInvoker<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatisticsInvoker(
        ListUserStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listUserStatistics, hcClient);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUsers);
    }

    /**
     * 查询账号的服务器列表
     *
     * 查询账号的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listUsers, hcClient);
    }

    /**
     * 查询Web服务、Web应用、数据库的统计信息
     *
     * 查询Web服务、Web应用、数据库的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServiceStatisticsRequest 请求对象
     * @return ListWebAppAndServiceStatisticsResponse
     */
    public ListWebAppAndServiceStatisticsResponse listWebAppAndServiceStatistics(
        ListWebAppAndServiceStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebAppAndServiceStatistics);
    }

    /**
     * 查询Web服务、Web应用、数据库的统计信息
     *
     * 查询Web服务、Web应用、数据库的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServiceStatisticsRequest 请求对象
     * @return SyncInvoker<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse>
     */
    public SyncInvoker<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse> listWebAppAndServiceStatisticsInvoker(
        ListWebAppAndServiceStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebAppAndServiceStatistics, hcClient);
    }

    /**
     * 查询指定Web服务、Web应用、数据库的服务器列表
     *
     * 查询指定Web服务、Web应用、数据库的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServicesRequest 请求对象
     * @return ListWebAppAndServicesResponse
     */
    public ListWebAppAndServicesResponse listWebAppAndServices(ListWebAppAndServicesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebAppAndServices);
    }

    /**
     * 查询指定Web服务、Web应用、数据库的服务器列表
     *
     * 查询指定Web服务、Web应用、数据库的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebAppAndServicesRequest 请求对象
     * @return SyncInvoker<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse>
     */
    public SyncInvoker<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse> listWebAppAndServicesInvoker(
        ListWebAppAndServicesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebAppAndServices, hcClient);
    }

    /**
     * 查询指定Web框架的服务器列表
     *
     * 查询指定Web框架的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkHostInfoRequest 请求对象
     * @return ListWebFrameworkHostInfoResponse
     */
    public ListWebFrameworkHostInfoResponse listWebFrameworkHostInfo(ListWebFrameworkHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebFrameworkHostInfo);
    }

    /**
     * 查询指定Web框架的服务器列表
     *
     * 查询指定Web框架的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkHostInfoRequest 请求对象
     * @return SyncInvoker<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse>
     */
    public SyncInvoker<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse> listWebFrameworkHostInfoInvoker(
        ListWebFrameworkHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebFrameworkHostInfo, hcClient);
    }

    /**
     * 查询指定主机的Web框架信息
     *
     * 查询指定主机的Web框架信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkInfoRequest 请求对象
     * @return ListWebFrameworkInfoResponse
     */
    public ListWebFrameworkInfoResponse listWebFrameworkInfo(ListWebFrameworkInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebFrameworkInfo);
    }

    /**
     * 查询指定主机的Web框架信息
     *
     * 查询指定主机的Web框架信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkInfoRequest 请求对象
     * @return SyncInvoker<ListWebFrameworkInfoRequest, ListWebFrameworkInfoResponse>
     */
    public SyncInvoker<ListWebFrameworkInfoRequest, ListWebFrameworkInfoResponse> listWebFrameworkInfoInvoker(
        ListWebFrameworkInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebFrameworkInfo, hcClient);
    }

    /**
     * 查询Web框架的统计信息
     *
     * 查询Web框架的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkStatisticsRequest 请求对象
     * @return ListWebFrameworkStatisticsResponse
     */
    public ListWebFrameworkStatisticsResponse listWebFrameworkStatistics(ListWebFrameworkStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebFrameworkStatistics);
    }

    /**
     * 查询Web框架的统计信息
     *
     * 查询Web框架的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebFrameworkStatisticsRequest 请求对象
     * @return SyncInvoker<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse>
     */
    public SyncInvoker<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse> listWebFrameworkStatisticsInvoker(
        ListWebFrameworkStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebFrameworkStatistics, hcClient);
    }

    /**
     * 查询指定Web站点的服务器列表
     *
     * 查询指定Web站点的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteHostInfoRequest 请求对象
     * @return ListWebSiteHostInfoResponse
     */
    public ListWebSiteHostInfoResponse listWebSiteHostInfo(ListWebSiteHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebSiteHostInfo);
    }

    /**
     * 查询指定Web站点的服务器列表
     *
     * 查询指定Web站点的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteHostInfoRequest 请求对象
     * @return SyncInvoker<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse>
     */
    public SyncInvoker<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse> listWebSiteHostInfoInvoker(
        ListWebSiteHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebSiteHostInfo, hcClient);
    }

    /**
     * 查询指定主机的Web站点信息
     *
     * 查询指定主机的Web站点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteInfoRequest 请求对象
     * @return ListWebSiteInfoResponse
     */
    public ListWebSiteInfoResponse listWebSiteInfo(ListWebSiteInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebSiteInfo);
    }

    /**
     * 查询指定主机的Web站点信息
     *
     * 查询指定主机的Web站点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteInfoRequest 请求对象
     * @return SyncInvoker<ListWebSiteInfoRequest, ListWebSiteInfoResponse>
     */
    public SyncInvoker<ListWebSiteInfoRequest, ListWebSiteInfoResponse> listWebSiteInfoInvoker(
        ListWebSiteInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebSiteInfo, hcClient);
    }

    /**
     * 查询Web站点的统计信息
     *
     * 查询Web站点的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteStatisticsRequest 请求对象
     * @return ListWebSiteStatisticsResponse
     */
    public ListWebSiteStatisticsResponse listWebSiteStatistics(ListWebSiteStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebSiteStatistics);
    }

    /**
     * 查询Web站点的统计信息
     *
     * 查询Web站点的服务器数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebSiteStatisticsRequest 请求对象
     * @return SyncInvoker<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse>
     */
    public SyncInvoker<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse> listWebSiteStatisticsInvoker(
        ListWebSiteStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebSiteStatistics, hcClient);
    }

    /**
     * 查询集群下某一命名空间下的工作负载
     *
     * 查询集群下某一命名空间下的工作负载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkLoadsRequest 请求对象
     * @return ListWorkLoadsResponse
     */
    public ListWorkLoadsResponse listWorkLoads(ListWorkLoadsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWorkLoads);
    }

    /**
     * 查询集群下某一命名空间下的工作负载
     *
     * 查询集群下某一命名空间下的工作负载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkLoadsRequest 请求对象
     * @return SyncInvoker<ListWorkLoadsRequest, ListWorkLoadsResponse>
     */
    public SyncInvoker<ListWorkLoadsRequest, ListWorkLoadsResponse> listWorkLoadsInvoker(ListWorkLoadsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWorkLoads, hcClient);
    }

    /**
     * 编辑动态端口蜜罐策略
     *
     * 编辑动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDecoyPortPolicyRequest 请求对象
     * @return ModifyDecoyPortPolicyResponse
     */
    public ModifyDecoyPortPolicyResponse modifyDecoyPortPolicy(ModifyDecoyPortPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyDecoyPortPolicy);
    }

    /**
     * 编辑动态端口蜜罐策略
     *
     * 编辑动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDecoyPortPolicyRequest 请求对象
     * @return SyncInvoker<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse>
     */
    public SyncInvoker<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse> modifyDecoyPortPolicyInvoker(
        ModifyDecoyPortPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyDecoyPortPolicy, hcClient);
    }

    /**
     * 删除告警白名单
     *
     * 删除告警白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAlarmWhiteListRequest 请求对象
     * @return RemoveAlarmWhiteListResponse
     */
    public RemoveAlarmWhiteListResponse removeAlarmWhiteList(RemoveAlarmWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.removeAlarmWhiteList);
    }

    /**
     * 删除告警白名单
     *
     * 删除告警白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAlarmWhiteListRequest 请求对象
     * @return SyncInvoker<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse>
     */
    public SyncInvoker<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse> removeAlarmWhiteListInvoker(
        RemoveAlarmWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.removeAlarmWhiteList, hcClient);
    }

    /**
     * 删除登录白名单
     *
     * 删除登录白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveLoginWhiteListRequest 请求对象
     * @return RemoveLoginWhiteListResponse
     */
    public RemoveLoginWhiteListResponse removeLoginWhiteList(RemoveLoginWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.removeLoginWhiteList);
    }

    /**
     * 删除登录白名单
     *
     * 删除登录白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveLoginWhiteListRequest 请求对象
     * @return SyncInvoker<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse>
     */
    public SyncInvoker<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse> removeLoginWhiteListInvoker(
        RemoveLoginWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.removeLoginWhiteList, hcClient);
    }

    /**
     * 删除系统用户白名单
     *
     * 删除系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSystemUserWhiteListRequest 请求对象
     * @return RemoveSystemUserWhiteListResponse
     */
    public RemoveSystemUserWhiteListResponse removeSystemUserWhiteList(RemoveSystemUserWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.removeSystemUserWhiteList);
    }

    /**
     * 删除系统用户白名单
     *
     * 删除系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSystemUserWhiteListRequest 请求对象
     * @return SyncInvoker<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse>
     */
    public SyncInvoker<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse> removeSystemUserWhiteListInvoker(
        RemoveSystemUserWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.removeSystemUserWhiteList, hcClient);
    }

    /**
     * 采集单主机资产指纹
     *
     * 采集单主机资产指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunHostAssetManualCollectRequest 请求对象
     * @return RunHostAssetManualCollectResponse
     */
    public RunHostAssetManualCollectResponse runHostAssetManualCollect(RunHostAssetManualCollectRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.runHostAssetManualCollect);
    }

    /**
     * 采集单主机资产指纹
     *
     * 采集单主机资产指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunHostAssetManualCollectRequest 请求对象
     * @return SyncInvoker<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse>
     */
    public SyncInvoker<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse> runHostAssetManualCollectInvoker(
        RunHostAssetManualCollectRequest request) {
        return new SyncInvoker<>(request, HssMeta.runHostAssetManualCollect, hcClient);
    }

    /**
     * 设置提示信息配置
     *
     * 设置提示信息配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMalwareRemindersRequest 请求对象
     * @return SetMalwareRemindersResponse
     */
    public SetMalwareRemindersResponse setMalwareReminders(SetMalwareRemindersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setMalwareReminders);
    }

    /**
     * 设置提示信息配置
     *
     * 设置提示信息配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMalwareRemindersRequest 请求对象
     * @return SyncInvoker<SetMalwareRemindersRequest, SetMalwareRemindersResponse>
     */
    public SyncInvoker<SetMalwareRemindersRequest, SetMalwareRemindersResponse> setMalwareRemindersInvoker(
        SetMalwareRemindersRequest request) {
        return new SyncInvoker<>(request, HssMeta.setMalwareReminders, hcClient);
    }

    /**
     * 资产管理-概览-账户Top
     *
     * 资产管理-概览-账户Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountTopRequest 请求对象
     * @return ShowAccountTopResponse
     */
    public ShowAccountTopResponse showAccountTop(ShowAccountTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAccountTop);
    }

    /**
     * 资产管理-概览-账户Top
     *
     * 资产管理-概览-账户Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountTopRequest 请求对象
     * @return SyncInvoker<ShowAccountTopRequest, ShowAccountTopResponse>
     */
    public SyncInvoker<ShowAccountTopRequest, ShowAccountTopResponse> showAccountTopInvoker(
        ShowAccountTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAccountTop, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-主机Agent状态
     *
     * 资产管理-概览-资产状态-主机Agent状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsStatusRequest 请求对象
     * @return ShowAgentStatisticsStatusResponse
     */
    public ShowAgentStatisticsStatusResponse showAgentStatisticsStatus(ShowAgentStatisticsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAgentStatisticsStatus);
    }

    /**
     * 资产管理-概览-资产状态-主机Agent状态
     *
     * 资产管理-概览-资产状态-主机Agent状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsStatusRequest 请求对象
     * @return SyncInvoker<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse>
     */
    public SyncInvoker<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse> showAgentStatisticsStatusInvoker(
        ShowAgentStatisticsStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAgentStatisticsStatus, hcClient);
    }

    /**
     * 查询应用防护开启状态
     *
     * 查询应用防护开启状态：查询单台服务器的应用防护功能开启状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRaspSwitchStatusRequest 请求对象
     * @return ShowAppRaspSwitchStatusResponse
     */
    public ShowAppRaspSwitchStatusResponse showAppRaspSwitchStatus(ShowAppRaspSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAppRaspSwitchStatus);
    }

    /**
     * 查询应用防护开启状态
     *
     * 查询应用防护开启状态：查询单台服务器的应用防护功能开启状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRaspSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse>
     */
    public SyncInvoker<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse> showAppRaspSwitchStatusInvoker(
        ShowAppRaspSwitchStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAppRaspSwitchStatus, hcClient);
    }

    /**
     * 统计资产信息数量
     *
     * 资产统计信息，账号、端口、进程等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetStatisticRequest 请求对象
     * @return ShowAssetStatisticResponse
     */
    public ShowAssetStatisticResponse showAssetStatistic(ShowAssetStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAssetStatistic);
    }

    /**
     * 统计资产信息数量
     *
     * 资产统计信息，账号、端口、进程等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetStatisticRequest 请求对象
     * @return SyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse>
     */
    public SyncInvoker<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatisticInvoker(
        ShowAssetStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAssetStatistic, hcClient);
    }

    /**
     * 资产管理-概览-自启动项Top
     *
     * 资产管理-概览-自启动项Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchTopRequest 请求对象
     * @return ShowAutoLaunchTopResponse
     */
    public ShowAutoLaunchTopResponse showAutoLaunchTop(ShowAutoLaunchTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAutoLaunchTop);
    }

    /**
     * 资产管理-概览-自启动项Top
     *
     * 资产管理-概览-自启动项Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchTopRequest 请求对象
     * @return SyncInvoker<ShowAutoLaunchTopRequest, ShowAutoLaunchTopResponse>
     */
    public SyncInvoker<ShowAutoLaunchTopRequest, ShowAutoLaunchTopResponse> showAutoLaunchTopInvoker(
        ShowAutoLaunchTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAutoLaunchTop, hcClient);
    }

    /**
     * 查询集群资产统计数量
     *
     * 查询集群资产统计数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAssetStatisticsRequest 请求对象
     * @return ShowClusterAssetStatisticsResponse
     */
    public ShowClusterAssetStatisticsResponse showClusterAssetStatistics(ShowClusterAssetStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showClusterAssetStatistics);
    }

    /**
     * 查询集群资产统计数量
     *
     * 查询集群资产统计数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterAssetStatisticsRequest 请求对象
     * @return SyncInvoker<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse>
     */
    public SyncInvoker<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse> showClusterAssetStatisticsInvoker(
        ShowClusterAssetStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showClusterAssetStatistics, hcClient);
    }

    /**
     * 查询集群组件防护策略模板
     *
     * 查询集群防护策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterProtectPolicyTemplateRequest 请求对象
     * @return ShowClusterProtectPolicyTemplateResponse
     */
    public ShowClusterProtectPolicyTemplateResponse showClusterProtectPolicyTemplate(
        ShowClusterProtectPolicyTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showClusterProtectPolicyTemplate);
    }

    /**
     * 查询集群组件防护策略模板
     *
     * 查询集群防护策略模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterProtectPolicyTemplateRequest 请求对象
     * @return SyncInvoker<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse>
     */
    public SyncInvoker<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse> showClusterProtectPolicyTemplateInvoker(
        ShowClusterProtectPolicyTemplateRequest request) {
        return new SyncInvoker<>(request, HssMeta.showClusterProtectPolicyTemplate, hcClient);
    }

    /**
     * 查询某一端口的描述信息
     *
     * 呈现某一端口详细信息，如本地端口：80，类型：TCP，危险程度：正常，端口描述：常用于SSH(SecureShell)-远程登录协议，用于安全登录文件传输（SCP，SFTP）及端口重新定向。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommonPortRequest 请求对象
     * @return ShowCommonPortResponse
     */
    public ShowCommonPortResponse showCommonPort(ShowCommonPortRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCommonPort);
    }

    /**
     * 查询某一端口的描述信息
     *
     * 呈现某一端口详细信息，如本地端口：80，类型：TCP，危险程度：正常，端口描述：常用于SSH(SecureShell)-远程登录协议，用于安全登录文件传输（SCP，SFTP）及端口重新定向。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommonPortRequest 请求对象
     * @return SyncInvoker<ShowCommonPortRequest, ShowCommonPortResponse>
     */
    public SyncInvoker<ShowCommonPortRequest, ShowCommonPortResponse> showCommonPortInvoker(
        ShowCommonPortRequest request) {
        return new SyncInvoker<>(request, HssMeta.showCommonPort, hcClient);
    }

    /**
     * 查询容器集群网络的网络信息
     *
     * 查询容器集群网络的网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNetworkInfoRequest 请求对象
     * @return ShowContainerNetworkInfoResponse
     */
    public ShowContainerNetworkInfoResponse showContainerNetworkInfo(ShowContainerNetworkInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showContainerNetworkInfo);
    }

    /**
     * 查询容器集群网络的网络信息
     *
     * 查询容器集群网络的网络信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNetworkInfoRequest 请求对象
     * @return SyncInvoker<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse>
     */
    public SyncInvoker<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse> showContainerNetworkInfoInvoker(
        ShowContainerNetworkInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showContainerNetworkInfo, hcClient);
    }

    /**
     * 查询容器节点防护总览数据
     *
     * 查询容器节点防护总览数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNodeStatisticsRequest 请求对象
     * @return ShowContainerNodeStatisticsResponse
     */
    public ShowContainerNodeStatisticsResponse showContainerNodeStatistics(ShowContainerNodeStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showContainerNodeStatistics);
    }

    /**
     * 查询容器节点防护总览数据
     *
     * 查询容器节点防护总览数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerNodeStatisticsRequest 请求对象
     * @return SyncInvoker<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse>
     */
    public SyncInvoker<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse> showContainerNodeStatisticsInvoker(
        ShowContainerNodeStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showContainerNodeStatistics, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-容器节点防护状态
     *
     * 资产管理-概览-资产状态-容器节点防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerProtectionStatusRequest 请求对象
     * @return ShowContainerProtectionStatusResponse
     */
    public ShowContainerProtectionStatusResponse showContainerProtectionStatus(
        ShowContainerProtectionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showContainerProtectionStatus);
    }

    /**
     * 资产管理-概览-资产状态-容器节点防护状态
     *
     * 资产管理-概览-资产状态-容器节点防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContainerProtectionStatusRequest 请求对象
     * @return SyncInvoker<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse>
     */
    public SyncInvoker<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse> showContainerProtectionStatusInvoker(
        ShowContainerProtectionStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showContainerProtectionStatus, hcClient);
    }

    /**
     * 查看默认为新增主机开启防护开关
     *
     * 查看默认为新增主机开启防护开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortAutoBindRequest 请求对象
     * @return ShowDecoyPortAutoBindResponse
     */
    public ShowDecoyPortAutoBindResponse showDecoyPortAutoBind(ShowDecoyPortAutoBindRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showDecoyPortAutoBind);
    }

    /**
     * 查看默认为新增主机开启防护开关
     *
     * 查看默认为新增主机开启防护开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortAutoBindRequest 请求对象
     * @return SyncInvoker<ShowDecoyPortAutoBindRequest, ShowDecoyPortAutoBindResponse>
     */
    public SyncInvoker<ShowDecoyPortAutoBindRequest, ShowDecoyPortAutoBindResponse> showDecoyPortAutoBindInvoker(
        ShowDecoyPortAutoBindRequest request) {
        return new SyncInvoker<>(request, HssMeta.showDecoyPortAutoBind, hcClient);
    }

    /**
     * 查看开启防护主机列表
     *
     * 查看开启防护主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortHostListRequest 请求对象
     * @return ShowDecoyPortHostListResponse
     */
    public ShowDecoyPortHostListResponse showDecoyPortHostList(ShowDecoyPortHostListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showDecoyPortHostList);
    }

    /**
     * 查看开启防护主机列表
     *
     * 查看开启防护主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortHostListRequest 请求对象
     * @return SyncInvoker<ShowDecoyPortHostListRequest, ShowDecoyPortHostListResponse>
     */
    public SyncInvoker<ShowDecoyPortHostListRequest, ShowDecoyPortHostListResponse> showDecoyPortHostListInvoker(
        ShowDecoyPortHostListRequest request) {
        return new SyncInvoker<>(request, HssMeta.showDecoyPortHostList, hcClient);
    }

    /**
     * 查看动态端口蜜罐策略详情
     *
     * 查看动态端口蜜罐策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortPolicyDetailsRequest 请求对象
     * @return ShowDecoyPortPolicyDetailsResponse
     */
    public ShowDecoyPortPolicyDetailsResponse showDecoyPortPolicyDetails(ShowDecoyPortPolicyDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showDecoyPortPolicyDetails);
    }

    /**
     * 查看动态端口蜜罐策略详情
     *
     * 查看动态端口蜜罐策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDecoyPortPolicyDetailsRequest 请求对象
     * @return SyncInvoker<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse>
     */
    public SyncInvoker<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse> showDecoyPortPolicyDetailsInvoker(
        ShowDecoyPortPolicyDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showDecoyPortPolicyDetails, hcClient);
    }

    /**
     * 查询攻击标识分布统计列表
     *
     * 查询攻击标识分布统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventAttackTagRequest 请求对象
     * @return ShowEventAttackTagResponse
     */
    public ShowEventAttackTagResponse showEventAttackTag(ShowEventAttackTagRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showEventAttackTag);
    }

    /**
     * 查询攻击标识分布统计列表
     *
     * 查询攻击标识分布统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventAttackTagRequest 请求对象
     * @return SyncInvoker<ShowEventAttackTagRequest, ShowEventAttackTagResponse>
     */
    public SyncInvoker<ShowEventAttackTagRequest, ShowEventAttackTagResponse> showEventAttackTagInvoker(
        ShowEventAttackTagRequest request) {
        return new SyncInvoker<>(request, HssMeta.showEventAttackTag, hcClient);
    }

    /**
     * 查询威胁等级统计列表
     *
     * 查询威胁等级统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventSeverityRequest 请求对象
     * @return ShowEventSeverityResponse
     */
    public ShowEventSeverityResponse showEventSeverity(ShowEventSeverityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showEventSeverity);
    }

    /**
     * 查询威胁等级统计列表
     *
     * 查询威胁等级统计列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventSeverityRequest 请求对象
     * @return SyncInvoker<ShowEventSeverityRequest, ShowEventSeverityResponse>
     */
    public SyncInvoker<ShowEventSeverityRequest, ShowEventSeverityResponse> showEventSeverityInvoker(
        ShowEventSeverityRequest request) {
        return new SyncInvoker<>(request, HssMeta.showEventSeverity, hcClient);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskRequest 请求对象
     * @return ShowExportTaskResponse
     */
    public ShowExportTaskResponse showExportTask(ShowExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showExportTask);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskRequest 请求对象
     * @return SyncInvoker<ShowExportTaskRequest, ShowExportTaskResponse>
     */
    public SyncInvoker<ShowExportTaskRequest, ShowExportTaskResponse> showExportTaskInvoker(
        ShowExportTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.showExportTask, hcClient);
    }

    /**
     * 查询单主机资产指纹采集状态
     *
     * 查询单主机资产指纹采集状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostAssetManualCollectStatusRequest 请求对象
     * @return ShowHostAssetManualCollectStatusResponse
     */
    public ShowHostAssetManualCollectStatusResponse showHostAssetManualCollectStatus(
        ShowHostAssetManualCollectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showHostAssetManualCollectStatus);
    }

    /**
     * 查询单主机资产指纹采集状态
     *
     * 查询单主机资产指纹采集状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostAssetManualCollectStatusRequest 请求对象
     * @return SyncInvoker<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse>
     */
    public SyncInvoker<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse> showHostAssetManualCollectStatusInvoker(
        ShowHostAssetManualCollectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showHostAssetManualCollectStatus, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-Agent状态
     *
     * 资产管理-概览-资产状态-Agent状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostProtectionStatusRequest 请求对象
     * @return ShowHostProtectionStatusResponse
     */
    public ShowHostProtectionStatusResponse showHostProtectionStatus(ShowHostProtectionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showHostProtectionStatus);
    }

    /**
     * 资产管理-概览-资产状态-Agent状态
     *
     * 资产管理-概览-资产状态-Agent状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostProtectionStatusRequest 请求对象
     * @return SyncInvoker<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse>
     */
    public SyncInvoker<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse> showHostProtectionStatusInvoker(
        ShowHostProtectionStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showHostProtectionStatus, hcClient);
    }

    /**
     * 资产管理-概览-jar包Top
     *
     * 资产管理-概览-jar包Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJarPackageTopRequest 请求对象
     * @return ShowJarPackageTopResponse
     */
    public ShowJarPackageTopResponse showJarPackageTop(ShowJarPackageTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showJarPackageTop);
    }

    /**
     * 资产管理-概览-jar包Top
     *
     * 资产管理-概览-jar包Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJarPackageTopRequest 请求对象
     * @return SyncInvoker<ShowJarPackageTopRequest, ShowJarPackageTopResponse>
     */
    public SyncInvoker<ShowJarPackageTopRequest, ShowJarPackageTopResponse> showJarPackageTopInvoker(
        ShowJarPackageTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showJarPackageTop, hcClient);
    }

    /**
     * 查询容器详细信息
     *
     * 查询容器详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sContainerDetailRequest 请求对象
     * @return ShowK8sContainerDetailResponse
     */
    public ShowK8sContainerDetailResponse showK8sContainerDetail(ShowK8sContainerDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showK8sContainerDetail);
    }

    /**
     * 查询容器详细信息
     *
     * 查询容器详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sContainerDetailRequest 请求对象
     * @return SyncInvoker<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse>
     */
    public SyncInvoker<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse> showK8sContainerDetailInvoker(
        ShowK8sContainerDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showK8sContainerDetail, hcClient);
    }

    /**
     * 查询pod详细信息
     *
     * 查询pod详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sPodDetailRequest 请求对象
     * @return ShowK8sPodDetailResponse
     */
    public ShowK8sPodDetailResponse showK8sPodDetail(ShowK8sPodDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showK8sPodDetail);
    }

    /**
     * 查询pod详细信息
     *
     * 查询pod详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowK8sPodDetailRequest 请求对象
     * @return SyncInvoker<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse>
     */
    public SyncInvoker<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse> showK8sPodDetailInvoker(
        ShowK8sPodDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showK8sPodDetail, hcClient);
    }

    /**
     * 资产管理-概览-内核模块Top
     *
     * 资产管理-概览-内核模块Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKernelModuleTopRequest 请求对象
     * @return ShowKernelModuleTopResponse
     */
    public ShowKernelModuleTopResponse showKernelModuleTop(ShowKernelModuleTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showKernelModuleTop);
    }

    /**
     * 资产管理-概览-内核模块Top
     *
     * 资产管理-概览-内核模块Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKernelModuleTopRequest 请求对象
     * @return SyncInvoker<ShowKernelModuleTopRequest, ShowKernelModuleTopResponse>
     */
    public SyncInvoker<ShowKernelModuleTopRequest, ShowKernelModuleTopResponse> showKernelModuleTopInvoker(
        ShowKernelModuleTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showKernelModuleTop, hcClient);
    }

    /**
     * 查询容器Kubernetes端点详情
     *
     * 查询容器Kubernetes端点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesEndpointInfoRequest 请求对象
     * @return ShowKubernetesEndpointInfoResponse
     */
    public ShowKubernetesEndpointInfoResponse showKubernetesEndpointInfo(ShowKubernetesEndpointInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showKubernetesEndpointInfo);
    }

    /**
     * 查询容器Kubernetes端点详情
     *
     * 查询容器Kubernetes端点详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesEndpointInfoRequest 请求对象
     * @return SyncInvoker<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse>
     */
    public SyncInvoker<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse> showKubernetesEndpointInfoInvoker(
        ShowKubernetesEndpointInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showKubernetesEndpointInfo, hcClient);
    }

    /**
     * 查询容器Kubernetes服务详情
     *
     * 查询容器Kubernetes服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesServiceInfoRequest 请求对象
     * @return ShowKubernetesServiceInfoResponse
     */
    public ShowKubernetesServiceInfoResponse showKubernetesServiceInfo(ShowKubernetesServiceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showKubernetesServiceInfo);
    }

    /**
     * 查询容器Kubernetes服务详情
     *
     * 查询容器Kubernetes服务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKubernetesServiceInfoRequest 请求对象
     * @return SyncInvoker<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse>
     */
    public SyncInvoker<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse> showKubernetesServiceInfoInvoker(
        ShowKubernetesServiceInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showKubernetesServiceInfo, hcClient);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestExportTaskByTypeRequest 请求对象
     * @return ShowLatestExportTaskByTypeResponse
     */
    public ShowLatestExportTaskByTypeResponse showLatestExportTaskByType(ShowLatestExportTaskByTypeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showLatestExportTaskByType);
    }

    /**
     * 查询导出任务信息
     *
     * 查询导出任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestExportTaskByTypeRequest 请求对象
     * @return SyncInvoker<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse>
     */
    public SyncInvoker<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse> showLatestExportTaskByTypeInvoker(
        ShowLatestExportTaskByTypeRequest request) {
        return new SyncInvoker<>(request, HssMeta.showLatestExportTaskByType, hcClient);
    }

    /**
     * 获取提示信息配置
     *
     * 获取提示信息配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMalwareRemindersRequest 请求对象
     * @return ShowMalwareRemindersResponse
     */
    public ShowMalwareRemindersResponse showMalwareReminders(ShowMalwareRemindersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMalwareReminders);
    }

    /**
     * 获取提示信息配置
     *
     * 获取提示信息配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMalwareRemindersRequest 请求对象
     * @return SyncInvoker<ShowMalwareRemindersRequest, ShowMalwareRemindersResponse>
     */
    public SyncInvoker<ShowMalwareRemindersRequest, ShowMalwareRemindersResponse> showMalwareRemindersInvoker(
        ShowMalwareRemindersRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMalwareReminders, hcClient);
    }

    /**
     * 集群网络策略总览
     *
     * 集群网络策略总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkStatisticsRequest 请求对象
     * @return ShowNetworkStatisticsResponse
     */
    public ShowNetworkStatisticsResponse showNetworkStatistics(ShowNetworkStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showNetworkStatistics);
    }

    /**
     * 集群网络策略总览
     *
     * 集群网络策略总览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkStatisticsRequest 请求对象
     * @return SyncInvoker<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse>
     */
    public SyncInvoker<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse> showNetworkStatisticsInvoker(
        ShowNetworkStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showNetworkStatistics, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-操作系统统计信息
     *
     * 资产管理-概览-资产状态-操作系统统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsStatisticsInfoRequest 请求对象
     * @return ShowOsStatisticsInfoResponse
     */
    public ShowOsStatisticsInfoResponse showOsStatisticsInfo(ShowOsStatisticsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showOsStatisticsInfo);
    }

    /**
     * 资产管理-概览-资产状态-操作系统统计信息
     *
     * 资产管理-概览-资产状态-操作系统统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOsStatisticsInfoRequest 请求对象
     * @return SyncInvoker<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse>
     */
    public SyncInvoker<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse> showOsStatisticsInfoInvoker(
        ShowOsStatisticsInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showOsStatisticsInfo, hcClient);
    }

    /**
     * 获取页面通知信息
     *
     * 获取页面通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageNoticesRequest 请求对象
     * @return ShowPageNoticesResponse
     */
    public ShowPageNoticesResponse showPageNotices(ShowPageNoticesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showPageNotices);
    }

    /**
     * 获取页面通知信息
     *
     * 获取页面通知信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageNoticesRequest 请求对象
     * @return SyncInvoker<ShowPageNoticesRequest, ShowPageNoticesResponse>
     */
    public SyncInvoker<ShowPageNoticesRequest, ShowPageNoticesResponse> showPageNoticesInvoker(
        ShowPageNoticesRequest request) {
        return new SyncInvoker<>(request, HssMeta.showPageNotices, hcClient);
    }

    /**
     * 资产管理-概览-端口Top
     *
     * 资产管理-概览-端口Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTopRequest 请求对象
     * @return ShowPortTopResponse
     */
    public ShowPortTopResponse showPortTop(ShowPortTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showPortTop);
    }

    /**
     * 资产管理-概览-端口Top
     *
     * 资产管理-概览-端口Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTopRequest 请求对象
     * @return SyncInvoker<ShowPortTopRequest, ShowPortTopResponse>
     */
    public SyncInvoker<ShowPortTopRequest, ShowPortTopResponse> showPortTopInvoker(ShowPortTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showPortTop, hcClient);
    }

    /**
     * 资产管理-概览-进程Top
     *
     * 资产管理-概览-进程Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessTopRequest 请求对象
     * @return ShowProcessTopResponse
     */
    public ShowProcessTopResponse showProcessTop(ShowProcessTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showProcessTop);
    }

    /**
     * 资产管理-概览-进程Top
     *
     * 资产管理-概览-进程Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessTopRequest 请求对象
     * @return SyncInvoker<ShowProcessTopRequest, ShowProcessTopResponse>
     */
    public SyncInvoker<ShowProcessTopRequest, ShowProcessTopResponse> showProcessTopInvoker(
        ShowProcessTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showProcessTop, hcClient);
    }

    /**
     * 资产管理-概览-资产状态-防护配额统计信息
     *
     * 资产管理-概览-资产状态-防护配额统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaStatisticsInfoRequest 请求对象
     * @return ShowQuotaStatisticsInfoResponse
     */
    public ShowQuotaStatisticsInfoResponse showQuotaStatisticsInfo(ShowQuotaStatisticsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showQuotaStatisticsInfo);
    }

    /**
     * 资产管理-概览-资产状态-防护配额统计信息
     *
     * 资产管理-概览-资产状态-防护配额统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaStatisticsInfoRequest 请求对象
     * @return SyncInvoker<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse>
     */
    public SyncInvoker<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse> showQuotaStatisticsInfoInvoker(
        ShowQuotaStatisticsInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showQuotaStatisticsInfo, hcClient);
    }

    /**
     * 查询防护策略详情
     *
     * 查询防护策略详情：查询防护策略配置的相关检测规则信息，包含14种检测规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspPolicyDetailRequest 请求对象
     * @return ShowRaspPolicyDetailResponse
     */
    public ShowRaspPolicyDetailResponse showRaspPolicyDetail(ShowRaspPolicyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRaspPolicyDetail);
    }

    /**
     * 查询防护策略详情
     *
     * 查询防护策略详情：查询防护策略配置的相关检测规则信息，包含14种检测规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspPolicyDetailRequest 请求对象
     * @return SyncInvoker<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse>
     */
    public SyncInvoker<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse> showRaspPolicyDetailInvoker(
        ShowRaspPolicyDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRaspPolicyDetail, hcClient);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计已添加防护服务器的数量以及近七天微服务RASP攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspProtectStatisticsRequest 请求对象
     * @return ShowRaspProtectStatisticsResponse
     */
    public ShowRaspProtectStatisticsResponse showRaspProtectStatistics(ShowRaspProtectStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRaspProtectStatistics);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计已添加防护服务器的数量以及近七天微服务RASP攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspProtectStatisticsRequest 请求对象
     * @return SyncInvoker<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse>
     */
    public SyncInvoker<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse> showRaspProtectStatisticsInvoker(
        ShowRaspProtectStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRaspProtectStatistics, hcClient);
    }

    /**
     * 查询防护服务器java应用详情
     *
     * 查询防护服务器java应用详情：查询防护服务器的java应用状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspServerDetailRequest 请求对象
     * @return ShowRaspServerDetailResponse
     */
    public ShowRaspServerDetailResponse showRaspServerDetail(ShowRaspServerDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRaspServerDetail);
    }

    /**
     * 查询防护服务器java应用详情
     *
     * 查询防护服务器java应用详情：查询防护服务器的java应用状态列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRaspServerDetailRequest 请求对象
     * @return SyncInvoker<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse>
     */
    public SyncInvoker<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse> showRaspServerDetailInvoker(
        ShowRaspServerDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRaspServerDetail, hcClient);
    }

    /**
     * 资产管理-概览-软件Top
     *
     * 资产管理-概览-软件Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSoftwareTopRequest 请求对象
     * @return ShowSoftwareTopResponse
     */
    public ShowSoftwareTopResponse showSoftwareTop(ShowSoftwareTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSoftwareTop);
    }

    /**
     * 资产管理-概览-软件Top
     *
     * 资产管理-概览-软件Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSoftwareTopRequest 请求对象
     * @return SyncInvoker<ShowSoftwareTopRequest, ShowSoftwareTopResponse>
     */
    public SyncInvoker<ShowSoftwareTopRequest, ShowSoftwareTopResponse> showSoftwareTopInvoker(
        ShowSoftwareTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSoftwareTop, hcClient);
    }

    /**
     * 资产管理-概览-WebAppAndServiceTop
     *
     * 资产管理-概览-Web应用TOP5/Web服务TOP5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebAppAndServiceTopRequest 请求对象
     * @return ShowWebAppAndServiceTopResponse
     */
    public ShowWebAppAndServiceTopResponse showWebAppAndServiceTop(ShowWebAppAndServiceTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWebAppAndServiceTop);
    }

    /**
     * 资产管理-概览-WebAppAndServiceTop
     *
     * 资产管理-概览-Web应用TOP5/Web服务TOP5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebAppAndServiceTopRequest 请求对象
     * @return SyncInvoker<ShowWebAppAndServiceTopRequest, ShowWebAppAndServiceTopResponse>
     */
    public SyncInvoker<ShowWebAppAndServiceTopRequest, ShowWebAppAndServiceTopResponse> showWebAppAndServiceTopInvoker(
        ShowWebAppAndServiceTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWebAppAndServiceTop, hcClient);
    }

    /**
     * 资产管理-概览-Web框架Top
     *
     * 资产管理-概览-Web框架Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebFrameworkTopRequest 请求对象
     * @return ShowWebFrameworkTopResponse
     */
    public ShowWebFrameworkTopResponse showWebFrameworkTop(ShowWebFrameworkTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWebFrameworkTop);
    }

    /**
     * 资产管理-概览-Web框架Top
     *
     * 资产管理-概览-Web框架Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebFrameworkTopRequest 请求对象
     * @return SyncInvoker<ShowWebFrameworkTopRequest, ShowWebFrameworkTopResponse>
     */
    public SyncInvoker<ShowWebFrameworkTopRequest, ShowWebFrameworkTopResponse> showWebFrameworkTopInvoker(
        ShowWebFrameworkTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWebFrameworkTop, hcClient);
    }

    /**
     * 资产管理-概览-Web站点Top
     *
     * 资产管理-概览-Web站点Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebSiteTopRequest 请求对象
     * @return ShowWebSiteTopResponse
     */
    public ShowWebSiteTopResponse showWebSiteTop(ShowWebSiteTopRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWebSiteTop);
    }

    /**
     * 资产管理-概览-Web站点Top
     *
     * 资产管理-概览-Web站点Top。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebSiteTopRequest 请求对象
     * @return SyncInvoker<ShowWebSiteTopRequest, ShowWebSiteTopResponse>
     */
    public SyncInvoker<ShowWebSiteTopRequest, ShowWebSiteTopResponse> showWebSiteTopInvoker(
        ShowWebSiteTopRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWebSiteTop, hcClient);
    }

    /**
     * 操作集群防护模式
     *
     * 操作集群防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterProtectionModeRequest 请求对象
     * @return SwitchClusterProtectionModeResponse
     */
    public SwitchClusterProtectionModeResponse switchClusterProtectionMode(SwitchClusterProtectionModeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchClusterProtectionMode);
    }

    /**
     * 操作集群防护模式
     *
     * 操作集群防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchClusterProtectionModeRequest 请求对象
     * @return SyncInvoker<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse>
     */
    public SyncInvoker<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse> switchClusterProtectionModeInvoker(
        SwitchClusterProtectionModeRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchClusterProtectionMode, hcClient);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchContainerProtectStatusRequest 请求对象
     * @return SwitchContainerProtectStatusResponse
     */
    public SwitchContainerProtectStatusResponse switchContainerProtectStatus(
        SwitchContainerProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchContainerProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchContainerProtectStatusRequest 请求对象
     * @return SyncInvoker<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse>
     */
    public SyncInvoker<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse> switchContainerProtectStatusInvoker(
        SwitchContainerProtectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchContainerProtectStatus, hcClient);
    }

    /**
     * 修改默认为新增主机开启防护开关
     *
     * 修改默认为新增主机开启防护开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortAutoBindRequest 请求对象
     * @return SwitchDecoyPortAutoBindResponse
     */
    public SwitchDecoyPortAutoBindResponse switchDecoyPortAutoBind(SwitchDecoyPortAutoBindRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchDecoyPortAutoBind);
    }

    /**
     * 修改默认为新增主机开启防护开关
     *
     * 修改默认为新增主机开启防护开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortAutoBindRequest 请求对象
     * @return SyncInvoker<SwitchDecoyPortAutoBindRequest, SwitchDecoyPortAutoBindResponse>
     */
    public SyncInvoker<SwitchDecoyPortAutoBindRequest, SwitchDecoyPortAutoBindResponse> switchDecoyPortAutoBindInvoker(
        SwitchDecoyPortAutoBindRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchDecoyPortAutoBind, hcClient);
    }

    /**
     * 切换主机动态端口蜜罐策略
     *
     * 切换主机动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortHostPolicyRequest 请求对象
     * @return SwitchDecoyPortHostPolicyResponse
     */
    public SwitchDecoyPortHostPolicyResponse switchDecoyPortHostPolicy(SwitchDecoyPortHostPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchDecoyPortHostPolicy);
    }

    /**
     * 切换主机动态端口蜜罐策略
     *
     * 切换主机动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortHostPolicyRequest 请求对象
     * @return SyncInvoker<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse>
     */
    public SyncInvoker<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse> switchDecoyPortHostPolicyInvoker(
        SwitchDecoyPortHostPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchDecoyPortHostPolicy, hcClient);
    }

    /**
     * 启用动态端口蜜罐策略
     *
     * 启用动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortPolicyRequest 请求对象
     * @return SwitchDecoyPortPolicyResponse
     */
    public SwitchDecoyPortPolicyResponse switchDecoyPortPolicy(SwitchDecoyPortPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchDecoyPortPolicy);
    }

    /**
     * 启用动态端口蜜罐策略
     *
     * 启用动态端口蜜罐策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchDecoyPortPolicyRequest 请求对象
     * @return SyncInvoker<SwitchDecoyPortPolicyRequest, SwitchDecoyPortPolicyResponse>
     */
    public SyncInvoker<SwitchDecoyPortPolicyRequest, SwitchDecoyPortPolicyResponse> switchDecoyPortPolicyInvoker(
        SwitchDecoyPortPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchDecoyPortPolicy, hcClient);
    }

    /**
     * 开启/关闭应用防护，更新防护端口
     *
     * 开启/关闭应用防护，选择开启的防护策略，选择需要防护的服务器，下发防护策略，可传入端口号更新防护端口，关闭防护则清空策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRaspRequest 请求对象
     * @return SwitchRaspResponse
     */
    public SwitchRaspResponse switchRasp(SwitchRaspRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchRasp);
    }

    /**
     * 开启/关闭应用防护，更新防护端口
     *
     * 开启/关闭应用防护，选择开启的防护策略，选择需要防护的服务器，下发防护策略，可传入端口号更新防护端口，关闭防护则清空策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchRaspRequest 请求对象
     * @return SyncInvoker<SwitchRaspRequest, SwitchRaspResponse>
     */
    public SyncInvoker<SwitchRaspRequest, SwitchRaspResponse> switchRaspInvoker(SwitchRaspRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchRasp, hcClient);
    }

    /**
     * 同步容器集群最新数据
     *
     * 同步容器集群最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterListRequest 请求对象
     * @return SyncClusterListResponse
     */
    public SyncClusterListResponse syncClusterList(SyncClusterListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncClusterList);
    }

    /**
     * 同步容器集群最新数据
     *
     * 同步容器集群最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterListRequest 请求对象
     * @return SyncInvoker<SyncClusterListRequest, SyncClusterListResponse>
     */
    public SyncInvoker<SyncClusterListRequest, SyncClusterListResponse> syncClusterListInvoker(
        SyncClusterListRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncClusterList, hcClient);
    }

    /**
     * 同步集群防护事件
     *
     * 同步集群防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterProtectionEventRequest 请求对象
     * @return SyncClusterProtectionEventResponse
     */
    public SyncClusterProtectionEventResponse syncClusterProtectionEvent(SyncClusterProtectionEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncClusterProtectionEvent);
    }

    /**
     * 同步集群防护事件
     *
     * 同步集群防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncClusterProtectionEventRequest 请求对象
     * @return SyncInvoker<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse>
     */
    public SyncInvoker<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse> syncClusterProtectionEventInvoker(
        SyncClusterProtectionEventRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncClusterProtectionEvent, hcClient);
    }

    /**
     * 同步集群下网络节点最新数据
     *
     * 同步集群下容器网络策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkNodeRequest 请求对象
     * @return SyncContainerNetworkNodeResponse
     */
    public SyncContainerNetworkNodeResponse syncContainerNetworkNode(SyncContainerNetworkNodeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncContainerNetworkNode);
    }

    /**
     * 同步集群下网络节点最新数据
     *
     * 同步集群下容器网络策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkNodeRequest 请求对象
     * @return SyncInvoker<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse>
     */
    public SyncInvoker<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse> syncContainerNetworkNodeInvoker(
        SyncContainerNetworkNodeRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncContainerNetworkNode, hcClient);
    }

    /**
     * 同步集群下容器网络策略最新数据
     *
     * 同步集群下容器网络策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkPolicyListRequest 请求对象
     * @return SyncContainerNetworkPolicyListResponse
     */
    public SyncContainerNetworkPolicyListResponse syncContainerNetworkPolicyList(
        SyncContainerNetworkPolicyListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncContainerNetworkPolicyList);
    }

    /**
     * 同步集群下容器网络策略最新数据
     *
     * 同步集群下容器网络策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncContainerNetworkPolicyListRequest 请求对象
     * @return SyncInvoker<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse>
     */
    public SyncInvoker<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse> syncContainerNetworkPolicyListInvoker(
        SyncContainerNetworkPolicyListRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncContainerNetworkPolicyList, hcClient);
    }

    /**
     * 同步集群下安全组策略最新数据
     *
     * 同步集群下安全组策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncSecurityGroupPoliciesRequest 请求对象
     * @return SyncSecurityGroupPoliciesResponse
     */
    public SyncSecurityGroupPoliciesResponse syncSecurityGroupPolicies(SyncSecurityGroupPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncSecurityGroupPolicies);
    }

    /**
     * 同步集群下安全组策略最新数据
     *
     * 同步集群下安全组策略最新数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncSecurityGroupPoliciesRequest 请求对象
     * @return SyncInvoker<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse>
     */
    public SyncInvoker<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse> syncSecurityGroupPoliciesInvoker(
        SyncSecurityGroupPoliciesRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncSecurityGroupPolicies, hcClient);
    }

    /**
     * 容器集群网络更新配置策略
     *
     * 容器集群网络更新配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContainerNetworkPolicyRequest 请求对象
     * @return UpdateContainerNetworkPolicyResponse
     */
    public UpdateContainerNetworkPolicyResponse updateContainerNetworkPolicy(
        UpdateContainerNetworkPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateContainerNetworkPolicy);
    }

    /**
     * 容器集群网络更新配置策略
     *
     * 容器集群网络更新配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContainerNetworkPolicyRequest 请求对象
     * @return SyncInvoker<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse>
     */
    public SyncInvoker<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse> updateContainerNetworkPolicyInvoker(
        UpdateContainerNetworkPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateContainerNetworkPolicy, hcClient);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略：修改防护策略内容，包含策略名称、相关规则开启状态、防护动作以及检测规则配置，同时给使用该策略的服务器下发新的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updatePolicy);
    }

    /**
     * 修改防护策略
     *
     * 修改防护策略：修改防护策略内容，包含策略名称、相关规则开启状态、防护动作以及检测规则配置，同时给使用该策略的服务器下发新的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.updatePolicy, hcClient);
    }

    /**
     * 更新安全组策略
     *
     * 更新安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupPolicyRequest 请求对象
     * @return UpdateSecurityGroupPolicyResponse
     */
    public UpdateSecurityGroupPolicyResponse updateSecurityGroupPolicy(UpdateSecurityGroupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateSecurityGroupPolicy);
    }

    /**
     * 更新安全组策略
     *
     * 更新安全组策略(云原生网络模型)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupPolicyRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse>
     */
    public SyncInvoker<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse> updateSecurityGroupPolicyInvoker(
        UpdateSecurityGroupPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateSecurityGroupPolicy, hcClient);
    }

    /**
     * 修改系统用户白名单
     *
     * 修改系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSystemUserWhiteListRequest 请求对象
     * @return UpdateSystemUserWhiteListResponse
     */
    public UpdateSystemUserWhiteListResponse updateSystemUserWhiteList(UpdateSystemUserWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateSystemUserWhiteList);
    }

    /**
     * 修改系统用户白名单
     *
     * 修改系统用户白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSystemUserWhiteListRequest 请求对象
     * @return SyncInvoker<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse>
     */
    public SyncInvoker<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse> updateSystemUserWhiteListInvoker(
        UpdateSystemUserWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateSystemUserWhiteList, hcClient);
    }

    /**
     * 校验当前账号是否是管理员账号（包含组织管理员和委托管理员）
     *
     * 校验当前账号是否是管理员账号（包含组织管理员和委托管理员）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAdminRequest 请求对象
     * @return ValidateAdminResponse
     */
    public ValidateAdminResponse validateAdmin(ValidateAdminRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.validateAdmin);
    }

    /**
     * 校验当前账号是否是管理员账号（包含组织管理员和委托管理员）
     *
     * 校验当前账号是否是管理员账号（包含组织管理员和委托管理员）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateAdminRequest 请求对象
     * @return SyncInvoker<ValidateAdminRequest, ValidateAdminResponse>
     */
    public SyncInvoker<ValidateAdminRequest, ValidateAdminResponse> validateAdminInvoker(ValidateAdminRequest request) {
        return new SyncInvoker<>(request, HssMeta.validateAdmin, hcClient);
    }

    /**
     * 修改“病毒查杀按次计费”开关状态
     *
     * 修改“病毒查杀按次计费”开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPayPerScanStatusRequest 请求对象
     * @return ChangeAntivirusPayPerScanStatusResponse
     */
    public ChangeAntivirusPayPerScanStatusResponse changeAntivirusPayPerScanStatus(
        ChangeAntivirusPayPerScanStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAntivirusPayPerScanStatus);
    }

    /**
     * 修改“病毒查杀按次计费”开关状态
     *
     * 修改“病毒查杀按次计费”开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPayPerScanStatusRequest 请求对象
     * @return SyncInvoker<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse>
     */
    public SyncInvoker<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse> changeAntivirusPayPerScanStatusInvoker(
        ChangeAntivirusPayPerScanStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAntivirusPayPerScanStatus, hcClient);
    }

    /**
     * 编辑自定义查杀策略
     *
     * 编辑自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPolicyRequest 请求对象
     * @return ChangeAntivirusPolicyResponse
     */
    public ChangeAntivirusPolicyResponse changeAntivirusPolicy(ChangeAntivirusPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAntivirusPolicy);
    }

    /**
     * 编辑自定义查杀策略
     *
     * 编辑自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAntivirusPolicyRequest 请求对象
     * @return SyncInvoker<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse>
     */
    public SyncInvoker<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse> changeAntivirusPolicyInvoker(
        ChangeAntivirusPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAntivirusPolicy, hcClient);
    }

    /**
     * 创建付费病毒扫描任务
     *
     * 创建付费病毒扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPaidTaskRequest 请求对象
     * @return CreateAntiVirusPaidTaskResponse
     */
    public CreateAntiVirusPaidTaskResponse createAntiVirusPaidTask(CreateAntiVirusPaidTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createAntiVirusPaidTask);
    }

    /**
     * 创建付费病毒扫描任务
     *
     * 创建付费病毒扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPaidTaskRequest 请求对象
     * @return SyncInvoker<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse>
     */
    public SyncInvoker<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse> createAntiVirusPaidTaskInvoker(
        CreateAntiVirusPaidTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createAntiVirusPaidTask, hcClient);
    }

    /**
     * 创建自定义查杀策略
     *
     * 创建自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPolicyRequest 请求对象
     * @return CreateAntiVirusPolicyResponse
     */
    public CreateAntiVirusPolicyResponse createAntiVirusPolicy(CreateAntiVirusPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createAntiVirusPolicy);
    }

    /**
     * 创建自定义查杀策略
     *
     * 创建自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusPolicyRequest 请求对象
     * @return SyncInvoker<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse>
     */
    public SyncInvoker<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse> createAntiVirusPolicyInvoker(
        CreateAntiVirusPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createAntiVirusPolicy, hcClient);
    }

    /**
     * 创建病毒扫描任务
     *
     * 创建病毒扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusTaskRequest 请求对象
     * @return CreateAntiVirusTaskResponse
     */
    public CreateAntiVirusTaskResponse createAntiVirusTask(CreateAntiVirusTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createAntiVirusTask);
    }

    /**
     * 创建病毒扫描任务
     *
     * 创建病毒扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiVirusTaskRequest 请求对象
     * @return SyncInvoker<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse>
     */
    public SyncInvoker<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse> createAntiVirusTaskInvoker(
        CreateAntiVirusTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createAntiVirusTask, hcClient);
    }

    /**
     * 删除自定义查杀策略
     *
     * 删除自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntivirusPolicyRequest 请求对象
     * @return DeleteAntivirusPolicyResponse
     */
    public DeleteAntivirusPolicyResponse deleteAntivirusPolicy(DeleteAntivirusPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteAntivirusPolicy);
    }

    /**
     * 删除自定义查杀策略
     *
     * 删除自定义查杀策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntivirusPolicyRequest 请求对象
     * @return SyncInvoker<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse>
     */
    public SyncInvoker<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse> deleteAntivirusPolicyInvoker(
        DeleteAntivirusPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteAntivirusPolicy, hcClient);
    }

    /**
     * 导出病毒扫描结果列表
     *
     * 导出病毒扫描结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAntiVirusResultRequest 请求对象
     * @return ExportAntiVirusResultResponse
     */
    public ExportAntiVirusResultResponse exportAntiVirusResult(ExportAntiVirusResultRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportAntiVirusResult);
    }

    /**
     * 导出病毒扫描结果列表
     *
     * 导出病毒扫描结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportAntiVirusResultRequest 请求对象
     * @return SyncInvoker<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse>
     */
    public SyncInvoker<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse> exportAntiVirusResultInvoker(
        ExportAntiVirusResultRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportAntiVirusResult, hcClient);
    }

    /**
     * 处置病毒扫描结果
     *
     * 处置病毒扫描结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleAntiVirusResultRequest 请求对象
     * @return HandleAntiVirusResultResponse
     */
    public HandleAntiVirusResultResponse handleAntiVirusResult(HandleAntiVirusResultRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.handleAntiVirusResult);
    }

    /**
     * 处置病毒扫描结果
     *
     * 处置病毒扫描结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleAntiVirusResultRequest 请求对象
     * @return SyncInvoker<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse>
     */
    public SyncInvoker<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse> handleAntiVirusResultInvoker(
        HandleAntiVirusResultRequest request) {
        return new SyncInvoker<>(request, HssMeta.handleAntiVirusResult, hcClient);
    }

    /**
     * 查询病毒查杀可选服务器列表
     *
     * 查询病毒查杀可选服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusHostRequest 请求对象
     * @return ListAntiVirusHostResponse
     */
    public ListAntiVirusHostResponse listAntiVirusHost(ListAntiVirusHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntiVirusHost);
    }

    /**
     * 查询病毒查杀可选服务器列表
     *
     * 查询病毒查杀可选服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusHostRequest 请求对象
     * @return SyncInvoker<ListAntiVirusHostRequest, ListAntiVirusHostResponse>
     */
    public SyncInvoker<ListAntiVirusHostRequest, ListAntiVirusHostResponse> listAntiVirusHostInvoker(
        ListAntiVirusHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntiVirusHost, hcClient);
    }

    /**
     * 查询付费病毒查杀服务器列表
     *
     * 查询付费病毒查杀服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPaidHostsRequest 请求对象
     * @return ListAntiVirusPaidHostsResponse
     */
    public ListAntiVirusPaidHostsResponse listAntiVirusPaidHosts(ListAntiVirusPaidHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntiVirusPaidHosts);
    }

    /**
     * 查询付费病毒查杀服务器列表
     *
     * 查询付费病毒查杀服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPaidHostsRequest 请求对象
     * @return SyncInvoker<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse>
     */
    public SyncInvoker<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse> listAntiVirusPaidHostsInvoker(
        ListAntiVirusPaidHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntiVirusPaidHosts, hcClient);
    }

    /**
     * 查询自定义查杀策略列表
     *
     * 查询自定义查杀策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPolicyRequest 请求对象
     * @return ListAntiVirusPolicyResponse
     */
    public ListAntiVirusPolicyResponse listAntiVirusPolicy(ListAntiVirusPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntiVirusPolicy);
    }

    /**
     * 查询自定义查杀策略列表
     *
     * 查询自定义查杀策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusPolicyRequest 请求对象
     * @return SyncInvoker<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse>
     */
    public SyncInvoker<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse> listAntiVirusPolicyInvoker(
        ListAntiVirusPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntiVirusPolicy, hcClient);
    }

    /**
     * 查询病毒扫描结果列表
     *
     * 查询病毒扫描结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusResultRequest 请求对象
     * @return ListAntiVirusResultResponse
     */
    public ListAntiVirusResultResponse listAntiVirusResult(ListAntiVirusResultRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntiVirusResult);
    }

    /**
     * 查询病毒扫描结果列表
     *
     * 查询病毒扫描结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusResultRequest 请求对象
     * @return SyncInvoker<ListAntiVirusResultRequest, ListAntiVirusResultResponse>
     */
    public SyncInvoker<ListAntiVirusResultRequest, ListAntiVirusResultResponse> listAntiVirusResultInvoker(
        ListAntiVirusResultRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntiVirusResult, hcClient);
    }

    /**
     * 查看病毒扫描任务列表
     *
     * 查看病毒扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusTaskRequest 请求对象
     * @return ListAntiVirusTaskResponse
     */
    public ListAntiVirusTaskResponse listAntiVirusTask(ListAntiVirusTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntiVirusTask);
    }

    /**
     * 查看病毒扫描任务列表
     *
     * 查看病毒扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiVirusTaskRequest 请求对象
     * @return SyncInvoker<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse>
     */
    public SyncInvoker<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse> listAntiVirusTaskInvoker(
        ListAntiVirusTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntiVirusTask, hcClient);
    }

    /**
     * 查询病毒查杀免费扫描次数
     *
     * 查询病毒查杀免费扫描次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusFreeQuotaRequest 请求对象
     * @return ShowAntivirusFreeQuotaResponse
     */
    public ShowAntivirusFreeQuotaResponse showAntivirusFreeQuota(ShowAntivirusFreeQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAntivirusFreeQuota);
    }

    /**
     * 查询病毒查杀免费扫描次数
     *
     * 查询病毒查杀免费扫描次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusFreeQuotaRequest 请求对象
     * @return SyncInvoker<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse>
     */
    public SyncInvoker<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse> showAntivirusFreeQuotaInvoker(
        ShowAntivirusFreeQuotaRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAntivirusFreeQuota, hcClient);
    }

    /**
     * 查询“病毒查杀按次计费”开关状态
     *
     * 查询“病毒查杀按次计费”开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusPayPerScanStatusRequest 请求对象
     * @return ShowAntivirusPayPerScanStatusResponse
     */
    public ShowAntivirusPayPerScanStatusResponse showAntivirusPayPerScanStatus(
        ShowAntivirusPayPerScanStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAntivirusPayPerScanStatus);
    }

    /**
     * 查询“病毒查杀按次计费”开关状态
     *
     * 查询“病毒查杀按次计费”开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusPayPerScanStatusRequest 请求对象
     * @return SyncInvoker<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse>
     */
    public SyncInvoker<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse> showAntivirusPayPerScanStatusInvoker(
        ShowAntivirusPayPerScanStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAntivirusPayPerScanStatus, hcClient);
    }

    /**
     * 查询病毒查杀统计信息
     *
     * 查询病毒查杀统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusStatisticRequest 请求对象
     * @return ShowAntivirusStatisticResponse
     */
    public ShowAntivirusStatisticResponse showAntivirusStatistic(ShowAntivirusStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAntivirusStatistic);
    }

    /**
     * 查询病毒查杀统计信息
     *
     * 查询病毒查杀统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntivirusStatisticRequest 请求对象
     * @return SyncInvoker<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse>
     */
    public SyncInvoker<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse> showAntivirusStatisticInvoker(
        ShowAntivirusStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAntivirusStatistic, hcClient);
    }

    /**
     * 取消扫描任务
     *
     * 取消扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAntivirusTaskRequest 请求对象
     * @return SwitchAntivirusTaskResponse
     */
    public SwitchAntivirusTaskResponse switchAntivirusTask(SwitchAntivirusTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchAntivirusTask);
    }

    /**
     * 取消扫描任务
     *
     * 取消扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAntivirusTaskRequest 请求对象
     * @return SyncInvoker<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse>
     */
    public SyncInvoker<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse> switchAntivirusTaskInvoker(
        SwitchAntivirusTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchAntivirusTask, hcClient);
    }

    /**
     * 白名单策略添加主机
     *
     * 白名单策略添加主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyHostRequest 请求对象
     * @return AddAppWhitelistPolicyHostResponse
     */
    public AddAppWhitelistPolicyHostResponse addAppWhitelistPolicyHost(AddAppWhitelistPolicyHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addAppWhitelistPolicyHost);
    }

    /**
     * 白名单策略添加主机
     *
     * 白名单策略添加主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyHostRequest 请求对象
     * @return SyncInvoker<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse>
     */
    public SyncInvoker<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse> addAppWhitelistPolicyHostInvoker(
        AddAppWhitelistPolicyHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.addAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 新增进程白名单策略进程
     *
     * 新增进程白名单策略进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyProcessRequest 请求对象
     * @return AddAppWhitelistPolicyProcessResponse
     */
    public AddAppWhitelistPolicyProcessResponse addAppWhitelistPolicyProcess(
        AddAppWhitelistPolicyProcessRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addAppWhitelistPolicyProcess);
    }

    /**
     * 新增进程白名单策略进程
     *
     * 新增进程白名单策略进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppWhitelistPolicyProcessRequest 请求对象
     * @return SyncInvoker<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse>
     */
    public SyncInvoker<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse> addAppWhitelistPolicyProcessInvoker(
        AddAppWhitelistPolicyProcessRequest request) {
        return new SyncInvoker<>(request, HssMeta.addAppWhitelistPolicyProcess, hcClient);
    }

    /**
     * 修改白名单策略
     *
     * 修改白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyRequest 请求对象
     * @return ChangeAppWhitelistPolicyResponse
     */
    public ChangeAppWhitelistPolicyResponse changeAppWhitelistPolicy(ChangeAppWhitelistPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAppWhitelistPolicy);
    }

    /**
     * 修改白名单策略
     *
     * 修改白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyRequest 请求对象
     * @return SyncInvoker<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse>
     */
    public SyncInvoker<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse> changeAppWhitelistPolicyInvoker(
        ChangeAppWhitelistPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAppWhitelistPolicy, hcClient);
    }

    /**
     * 标记进程白名单策略识别进程
     *
     * 标记进程白名单策略识别进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyProcessStatusRequest 请求对象
     * @return ChangeAppWhitelistPolicyProcessStatusResponse
     */
    public ChangeAppWhitelistPolicyProcessStatusResponse changeAppWhitelistPolicyProcessStatus(
        ChangeAppWhitelistPolicyProcessStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAppWhitelistPolicyProcessStatus);
    }

    /**
     * 标记进程白名单策略识别进程
     *
     * 标记进程白名单策略识别进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAppWhitelistPolicyProcessStatusRequest 请求对象
     * @return SyncInvoker<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse>
     */
    public SyncInvoker<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse> changeAppWhitelistPolicyProcessStatusInvoker(
        ChangeAppWhitelistPolicyProcessStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAppWhitelistPolicyProcessStatus, hcClient);
    }

    /**
     * 创建白名单策略
     *
     * 创建白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppWhitelistPolicyRequest 请求对象
     * @return CreateAppWhitelistPolicyResponse
     */
    public CreateAppWhitelistPolicyResponse createAppWhitelistPolicy(CreateAppWhitelistPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createAppWhitelistPolicy);
    }

    /**
     * 创建白名单策略
     *
     * 创建白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppWhitelistPolicyRequest 请求对象
     * @return SyncInvoker<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse>
     */
    public SyncInvoker<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse> createAppWhitelistPolicyInvoker(
        CreateAppWhitelistPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.createAppWhitelistPolicy, hcClient);
    }

    /**
     * 删除白名单策略
     *
     * 删除白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyRequest 请求对象
     * @return DeleteAppWhitelistPolicyResponse
     */
    public DeleteAppWhitelistPolicyResponse deleteAppWhitelistPolicy(DeleteAppWhitelistPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteAppWhitelistPolicy);
    }

    /**
     * 删除白名单策略
     *
     * 删除白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyRequest 请求对象
     * @return SyncInvoker<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse>
     */
    public SyncInvoker<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse> deleteAppWhitelistPolicyInvoker(
        DeleteAppWhitelistPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteAppWhitelistPolicy, hcClient);
    }

    /**
     * 白名单策略删除主机
     *
     * 白名单策略删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyHostRequest 请求对象
     * @return DeleteAppWhitelistPolicyHostResponse
     */
    public DeleteAppWhitelistPolicyHostResponse deleteAppWhitelistPolicyHost(
        DeleteAppWhitelistPolicyHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteAppWhitelistPolicyHost);
    }

    /**
     * 白名单策略删除主机
     *
     * 白名单策略删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppWhitelistPolicyHostRequest 请求对象
     * @return SyncInvoker<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse>
     */
    public SyncInvoker<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse> deleteAppWhitelistPolicyHostInvoker(
        DeleteAppWhitelistPolicyHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 查询进程白名单可疑进程
     *
     * 查询进程白名单可疑进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistEventRequest 请求对象
     * @return ListAppWhitelistEventResponse
     */
    public ListAppWhitelistEventResponse listAppWhitelistEvent(ListAppWhitelistEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistEvent);
    }

    /**
     * 查询进程白名单可疑进程
     *
     * 查询进程白名单可疑进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistEventRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse>
     */
    public SyncInvoker<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse> listAppWhitelistEventInvoker(
        ListAppWhitelistEventRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistEvent, hcClient);
    }

    /**
     * 查询进程白名单可选服务器列表
     *
     * 查询进程白名单可选服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistHostStatusRequest 请求对象
     * @return ListAppWhitelistHostStatusResponse
     */
    public ListAppWhitelistHostStatusResponse listAppWhitelistHostStatus(ListAppWhitelistHostStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistHostStatus);
    }

    /**
     * 查询进程白名单可选服务器列表
     *
     * 查询进程白名单可选服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistHostStatusRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse>
     */
    public SyncInvoker<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse> listAppWhitelistHostStatusInvoker(
        ListAppWhitelistHostStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistHostStatus, hcClient);
    }

    /**
     * 查询进程白名单策略列表
     *
     * 查询进程白名单策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyRequest 请求对象
     * @return ListAppWhitelistPolicyResponse
     */
    public ListAppWhitelistPolicyResponse listAppWhitelistPolicy(ListAppWhitelistPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistPolicy);
    }

    /**
     * 查询进程白名单策略列表
     *
     * 查询进程白名单策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse>
     */
    public SyncInvoker<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse> listAppWhitelistPolicyInvoker(
        ListAppWhitelistPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistPolicy, hcClient);
    }

    /**
     * 查询进程白名单策略关联主机列表
     *
     * 查询进程白名单策略关联主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyHostRequest 请求对象
     * @return ListAppWhitelistPolicyHostResponse
     */
    public ListAppWhitelistPolicyHostResponse listAppWhitelistPolicyHost(ListAppWhitelistPolicyHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistPolicyHost);
    }

    /**
     * 查询进程白名单策略关联主机列表
     *
     * 查询进程白名单策略关联主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyHostRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse>
     */
    public SyncInvoker<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse> listAppWhitelistPolicyHostInvoker(
        ListAppWhitelistPolicyHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 查询进程白名单策略识别进程
     *
     * 查询进程白名单策略识别进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessRequest 请求对象
     * @return ListAppWhitelistPolicyProcessResponse
     */
    public ListAppWhitelistPolicyProcessResponse listAppWhitelistPolicyProcess(
        ListAppWhitelistPolicyProcessRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistPolicyProcess);
    }

    /**
     * 查询进程白名单策略识别进程
     *
     * 查询进程白名单策略识别进程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse>
     */
    public SyncInvoker<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse> listAppWhitelistPolicyProcessInvoker(
        ListAppWhitelistPolicyProcessRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistPolicyProcess, hcClient);
    }

    /**
     * 查询进程白名单策略进程扩展列表
     *
     * 查询进程白名单策略进程扩展列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessExtendRequest 请求对象
     * @return ListAppWhitelistPolicyProcessExtendResponse
     */
    public ListAppWhitelistPolicyProcessExtendResponse listAppWhitelistPolicyProcessExtend(
        ListAppWhitelistPolicyProcessExtendRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAppWhitelistPolicyProcessExtend);
    }

    /**
     * 查询进程白名单策略进程扩展列表
     *
     * 查询进程白名单策略进程扩展列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppWhitelistPolicyProcessExtendRequest 请求对象
     * @return SyncInvoker<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse>
     */
    public SyncInvoker<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse> listAppWhitelistPolicyProcessExtendInvoker(
        ListAppWhitelistPolicyProcessExtendRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAppWhitelistPolicyProcessExtend, hcClient);
    }

    /**
     * 统计agent版本不匹配主机数量
     *
     * 统计agent版本不匹配主机数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistAgentStaticsRequest 请求对象
     * @return ShowAppWhitelistAgentStaticsResponse
     */
    public ShowAppWhitelistAgentStaticsResponse showAppWhitelistAgentStatics(
        ShowAppWhitelistAgentStaticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAppWhitelistAgentStatics);
    }

    /**
     * 统计agent版本不匹配主机数量
     *
     * 统计agent版本不匹配主机数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistAgentStaticsRequest 请求对象
     * @return SyncInvoker<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse>
     */
    public SyncInvoker<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse> showAppWhitelistAgentStaticsInvoker(
        ShowAppWhitelistAgentStaticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAppWhitelistAgentStatics, hcClient);
    }

    /**
     * 查询进程白名单策略详情
     *
     * 查询进程白名单策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistPolicyRequest 请求对象
     * @return ShowAppWhitelistPolicyResponse
     */
    public ShowAppWhitelistPolicyResponse showAppWhitelistPolicy(ShowAppWhitelistPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAppWhitelistPolicy);
    }

    /**
     * 查询进程白名单策略详情
     *
     * 查询进程白名单策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppWhitelistPolicyRequest 请求对象
     * @return SyncInvoker<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse>
     */
    public SyncInvoker<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse> showAppWhitelistPolicyInvoker(
        ShowAppWhitelistPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAppWhitelistPolicy, hcClient);
    }

    /**
     * 应用白名单策略
     *
     * 应用白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyHostRequest 请求对象
     * @return SwitchAppWhitelistPolicyHostResponse
     */
    public SwitchAppWhitelistPolicyHostResponse switchAppWhitelistPolicyHost(
        SwitchAppWhitelistPolicyHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchAppWhitelistPolicyHost);
    }

    /**
     * 应用白名单策略
     *
     * 应用白名单策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyHostRequest 请求对象
     * @return SyncInvoker<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse>
     */
    public SyncInvoker<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse> switchAppWhitelistPolicyHostInvoker(
        SwitchAppWhitelistPolicyHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchAppWhitelistPolicyHost, hcClient);
    }

    /**
     * 操作白名单策略学习状态
     *
     * 操作白名单策略学习状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyLearnStatusRequest 请求对象
     * @return SwitchAppWhitelistPolicyLearnStatusResponse
     */
    public SwitchAppWhitelistPolicyLearnStatusResponse switchAppWhitelistPolicyLearnStatus(
        SwitchAppWhitelistPolicyLearnStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchAppWhitelistPolicyLearnStatus);
    }

    /**
     * 操作白名单策略学习状态
     *
     * 操作白名单策略学习状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAppWhitelistPolicyLearnStatusRequest 请求对象
     * @return SyncInvoker<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse>
     */
    public SyncInvoker<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse> switchAppWhitelistPolicyLearnStatusInvoker(
        SwitchAppWhitelistPolicyLearnStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchAppWhitelistPolicyLearnStatus, hcClient);
    }

    /**
     * 新增基线白名单
     *
     * 新增基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBaselineWhiteListRequest 请求对象
     * @return AddBaselineWhiteListResponse
     */
    public AddBaselineWhiteListResponse addBaselineWhiteList(AddBaselineWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addBaselineWhiteList);
    }

    /**
     * 新增基线白名单
     *
     * 新增基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBaselineWhiteListRequest 请求对象
     * @return SyncInvoker<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse>
     */
    public SyncInvoker<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse> addBaselineWhiteListInvoker(
        AddBaselineWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.addBaselineWhiteList, hcClient);
    }

    /**
     * 新建配置检测策略信息
     *
     * 新建配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityCheckPolicyGroupRequest 请求对象
     * @return AddSecurityCheckPolicyGroupResponse
     */
    public AddSecurityCheckPolicyGroupResponse addSecurityCheckPolicyGroup(AddSecurityCheckPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addSecurityCheckPolicyGroup);
    }

    /**
     * 新建配置检测策略信息
     *
     * 新建配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityCheckPolicyGroupRequest 请求对象
     * @return SyncInvoker<AddSecurityCheckPolicyGroupRequest, AddSecurityCheckPolicyGroupResponse>
     */
    public SyncInvoker<AddSecurityCheckPolicyGroupRequest, AddSecurityCheckPolicyGroupResponse> addSecurityCheckPolicyGroupInvoker(
        AddSecurityCheckPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.addSecurityCheckPolicyGroup, hcClient);
    }

    /**
     * 修改基线白名单
     *
     * 修改基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaselineWhiteListRequest 请求对象
     * @return ChangeBaselineWhiteListResponse
     */
    public ChangeBaselineWhiteListResponse changeBaselineWhiteList(ChangeBaselineWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeBaselineWhiteList);
    }

    /**
     * 修改基线白名单
     *
     * 修改基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaselineWhiteListRequest 请求对象
     * @return SyncInvoker<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse>
     */
    public SyncInvoker<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse> changeBaselineWhiteListInvoker(
        ChangeBaselineWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeBaselineWhiteList, hcClient);
    }

    /**
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     *
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCheckRuleActionRequest 请求对象
     * @return ChangeCheckRuleActionResponse
     */
    public ChangeCheckRuleActionResponse changeCheckRuleAction(ChangeCheckRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeCheckRuleAction);
    }

    /**
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     *
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeCheckRuleActionRequest 请求对象
     * @return SyncInvoker<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse>
     */
    public SyncInvoker<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> changeCheckRuleActionInvoker(
        ChangeCheckRuleActionRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeCheckRuleAction, hcClient);
    }

    /**
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     *
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordComplexityStatusRequest 请求对象
     * @return ChangePasswordComplexityStatusResponse
     */
    public ChangePasswordComplexityStatusResponse changePasswordComplexityStatus(
        ChangePasswordComplexityStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changePasswordComplexityStatus);
    }

    /**
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略
     *
     * 对口令复杂度检测未通过的主机进行忽略/取消忽略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePasswordComplexityStatusRequest 请求对象
     * @return SyncInvoker<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse>
     */
    public SyncInvoker<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse> changePasswordComplexityStatusInvoker(
        ChangePasswordComplexityStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changePasswordComplexityStatus, hcClient);
    }

    /**
     * 复制配置检测策略信息
     *
     * 复制配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBaselinePolicyGroupRequest 请求对象
     * @return CopyBaselinePolicyGroupResponse
     */
    public CopyBaselinePolicyGroupResponse copyBaselinePolicyGroup(CopyBaselinePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.copyBaselinePolicyGroup);
    }

    /**
     * 复制配置检测策略信息
     *
     * 复制配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyBaselinePolicyGroupRequest 请求对象
     * @return SyncInvoker<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse>
     */
    public SyncInvoker<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse> copyBaselinePolicyGroupInvoker(
        CopyBaselinePolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.copyBaselinePolicyGroup, hcClient);
    }

    /**
     * 删除基线白名单
     *
     * 删除基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaselineWhiteListRequest 请求对象
     * @return DeleteBaselineWhiteListResponse
     */
    public DeleteBaselineWhiteListResponse deleteBaselineWhiteList(DeleteBaselineWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteBaselineWhiteList);
    }

    /**
     * 删除基线白名单
     *
     * 删除基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaselineWhiteListRequest 请求对象
     * @return SyncInvoker<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse>
     */
    public SyncInvoker<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse> deleteBaselineWhiteListInvoker(
        DeleteBaselineWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteBaselineWhiteList, hcClient);
    }

    /**
     * 删除指定配置检测策略信息
     *
     * 删除指定配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityCheckPolicyGroupRequest 请求对象
     * @return DeleteSecurityCheckPolicyGroupResponse
     */
    public DeleteSecurityCheckPolicyGroupResponse deleteSecurityCheckPolicyGroup(
        DeleteSecurityCheckPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteSecurityCheckPolicyGroup);
    }

    /**
     * 删除指定配置检测策略信息
     *
     * 删除指定配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityCheckPolicyGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityCheckPolicyGroupRequest, DeleteSecurityCheckPolicyGroupResponse>
     */
    public SyncInvoker<DeleteSecurityCheckPolicyGroupRequest, DeleteSecurityCheckPolicyGroupResponse> deleteSecurityCheckPolicyGroupInvoker(
        DeleteSecurityCheckPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteSecurityCheckPolicyGroup, hcClient);
    }

    /**
     * 从后端导出基线检测报告，生成Excel文件
     *
     * 从后端导出基线检测报告，生成Excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBaselineSecurityCheckReportRequest 请求对象
     * @return ExportBaselineSecurityCheckReportResponse
     */
    public ExportBaselineSecurityCheckReportResponse exportBaselineSecurityCheckReport(
        ExportBaselineSecurityCheckReportRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportBaselineSecurityCheckReport);
    }

    /**
     * 从后端导出基线检测报告，生成Excel文件
     *
     * 从后端导出基线检测报告，生成Excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportBaselineSecurityCheckReportRequest 请求对象
     * @return SyncInvoker<ExportBaselineSecurityCheckReportRequest, ExportBaselineSecurityCheckReportResponse>
     */
    public SyncInvoker<ExportBaselineSecurityCheckReportRequest, ExportBaselineSecurityCheckReportResponse> exportBaselineSecurityCheckReportInvoker(
        ExportBaselineSecurityCheckReportRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportBaselineSecurityCheckReport, hcClient);
    }

    /**
     * 按查询结果导出配置检测报告
     *
     * 按查询结果导出配置检测报告，生成Excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSecurityCheckReportRequest 请求对象
     * @return ExportSecurityCheckReportResponse
     */
    public ExportSecurityCheckReportResponse exportSecurityCheckReport(ExportSecurityCheckReportRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportSecurityCheckReport);
    }

    /**
     * 按查询结果导出配置检测报告
     *
     * 按查询结果导出配置检测报告，生成Excel文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSecurityCheckReportRequest 请求对象
     * @return SyncInvoker<ExportSecurityCheckReportRequest, ExportSecurityCheckReportResponse>
     */
    public SyncInvoker<ExportSecurityCheckReportRequest, ExportSecurityCheckReportResponse> exportSecurityCheckReportInvoker(
        ExportSecurityCheckReportRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportSecurityCheckReport, hcClient);
    }

    /**
     * 查询指定策略组的检查项列表
     *
     * 查询指定策略组的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllRiskConfigCheckRulesRequest 请求对象
     * @return ListAllRiskConfigCheckRulesResponse
     */
    public ListAllRiskConfigCheckRulesResponse listAllRiskConfigCheckRules(ListAllRiskConfigCheckRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAllRiskConfigCheckRules);
    }

    /**
     * 查询指定策略组的检查项列表
     *
     * 查询指定策略组的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllRiskConfigCheckRulesRequest 请求对象
     * @return SyncInvoker<ListAllRiskConfigCheckRulesRequest, ListAllRiskConfigCheckRulesResponse>
     */
    public SyncInvoker<ListAllRiskConfigCheckRulesRequest, ListAllRiskConfigCheckRulesResponse> listAllRiskConfigCheckRulesInvoker(
        ListAllRiskConfigCheckRulesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAllRiskConfigCheckRules, hcClient);
    }

    /**
     * 查询基线白名单列表
     *
     * 查询基线白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaselineWhiteListsRequest 请求对象
     * @return ListBaselineWhiteListsResponse
     */
    public ListBaselineWhiteListsResponse listBaselineWhiteLists(ListBaselineWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBaselineWhiteLists);
    }

    /**
     * 查询基线白名单列表
     *
     * 查询基线白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaselineWhiteListsRequest 请求对象
     * @return SyncInvoker<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse>
     */
    public SyncInvoker<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse> listBaselineWhiteListsInvoker(
        ListBaselineWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBaselineWhiteLists, hcClient);
    }

    /**
     * 查询配置检查项影响到的服务器列表
     *
     * 查询配置检查项影响到的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRuleHostRequest 请求对象
     * @return ListCheckRuleHostResponse
     */
    public ListCheckRuleHostResponse listCheckRuleHost(ListCheckRuleHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCheckRuleHost);
    }

    /**
     * 查询配置检查项影响到的服务器列表
     *
     * 查询配置检查项影响到的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRuleHostRequest 请求对象
     * @return SyncInvoker<ListCheckRuleHostRequest, ListCheckRuleHostResponse>
     */
    public SyncInvoker<ListCheckRuleHostRequest, ListCheckRuleHostResponse> listCheckRuleHostInvoker(
        ListCheckRuleHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCheckRuleHost, hcClient);
    }

    /**
     * 查询基线检查执行操作时影响的范围
     *
     * 查询基线检查执行操作时影响的范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleAffectBaselineRequest 请求对象
     * @return ListHandleAffectBaselineResponse
     */
    public ListHandleAffectBaselineResponse listHandleAffectBaseline(ListHandleAffectBaselineRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHandleAffectBaseline);
    }

    /**
     * 查询基线检查执行操作时影响的范围
     *
     * 查询基线检查执行操作时影响的范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleAffectBaselineRequest 请求对象
     * @return SyncInvoker<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse>
     */
    public SyncInvoker<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse> listHandleAffectBaselineInvoker(
        ListHandleAffectBaselineRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHandleAffectBaseline, hcClient);
    }

    /**
     * 查看主机对应的检查项
     *
     * 查询配置检查项影响到的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostCheckRulesRequest 请求对象
     * @return ListHostCheckRulesResponse
     */
    public ListHostCheckRulesResponse listHostCheckRules(ListHostCheckRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostCheckRules);
    }

    /**
     * 查看主机对应的检查项
     *
     * 查询配置检查项影响到的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostCheckRulesRequest 请求对象
     * @return SyncInvoker<ListHostCheckRulesRequest, ListHostCheckRulesResponse>
     */
    public SyncInvoker<ListHostCheckRulesRequest, ListHostCheckRulesResponse> listHostCheckRulesInvoker(
        ListHostCheckRulesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostCheckRules, hcClient);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPasswordComplexityRequest 请求对象
     * @return ListPasswordComplexityResponse
     */
    public ListPasswordComplexityResponse listPasswordComplexity(ListPasswordComplexityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPasswordComplexity);
    }

    /**
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPasswordComplexityRequest 请求对象
     * @return SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse>
     */
    public SyncInvoker<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexityInvoker(
        ListPasswordComplexityRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPasswordComplexity, hcClient);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigCheckRulesRequest 请求对象
     * @return ListRiskConfigCheckRulesResponse
     */
    public ListRiskConfigCheckRulesResponse listRiskConfigCheckRules(ListRiskConfigCheckRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigCheckRules);
    }

    /**
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigCheckRulesRequest 请求对象
     * @return SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse>
     */
    public SyncInvoker<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRulesInvoker(
        ListRiskConfigCheckRulesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRiskConfigCheckRules, hcClient);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigHostsRequest 请求对象
     * @return ListRiskConfigHostsResponse
     */
    public ListRiskConfigHostsResponse listRiskConfigHosts(ListRiskConfigHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigHosts);
    }

    /**
     * 查询指定安全配置项的受影响服务器列表
     *
     * 查询指定安全配置项的受影响服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigHostsRequest 请求对象
     * @return SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse>
     */
    public SyncInvoker<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHostsInvoker(
        ListRiskConfigHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRiskConfigHosts, hcClient);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigsRequest 请求对象
     * @return ListRiskConfigsResponse
     */
    public ListRiskConfigsResponse listRiskConfigs(ListRiskConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRiskConfigs);
    }

    /**
     * 查询租户的服务器安全配置检测结果列表
     *
     * 查询租户的服务器安全配置检测结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskConfigsRequest 请求对象
     * @return SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse>
     */
    public SyncInvoker<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigsInvoker(
        ListRiskConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRiskConfigs, hcClient);
    }

    /**
     * 查询配置检测策略组列表
     *
     * 查询配置检测策略组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckPolicyGroupRequest 请求对象
     * @return ListSecurityCheckPolicyGroupResponse
     */
    public ListSecurityCheckPolicyGroupResponse listSecurityCheckPolicyGroup(
        ListSecurityCheckPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityCheckPolicyGroup);
    }

    /**
     * 查询配置检测策略组列表
     *
     * 查询配置检测策略组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListSecurityCheckPolicyGroupRequest, ListSecurityCheckPolicyGroupResponse>
     */
    public SyncInvoker<ListSecurityCheckPolicyGroupRequest, ListSecurityCheckPolicyGroupResponse> listSecurityCheckPolicyGroupInvoker(
        ListSecurityCheckPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityCheckPolicyGroup, hcClient);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeakPasswordUsersRequest 请求对象
     * @return ListWeakPasswordUsersResponse
     */
    public ListWeakPasswordUsersResponse listWeakPasswordUsers(ListWeakPasswordUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWeakPasswordUsers);
    }

    /**
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWeakPasswordUsersRequest 请求对象
     * @return SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse>
     */
    public SyncInvoker<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsersInvoker(
        ListWeakPasswordUsersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWeakPasswordUsers, hcClient);
    }

    /**
     * 手动检测：对策略中选择的主机，进行配置检测和弱口令检测
     *
     * 手动检测：对策略中选择的主机，进行配置检测和弱口令检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunBaselineDetectRequest 请求对象
     * @return RunBaselineDetectResponse
     */
    public RunBaselineDetectResponse runBaselineDetect(RunBaselineDetectRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.runBaselineDetect);
    }

    /**
     * 手动检测：对策略中选择的主机，进行配置检测和弱口令检测
     *
     * 手动检测：对策略中选择的主机，进行配置检测和弱口令检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunBaselineDetectRequest 请求对象
     * @return SyncInvoker<RunBaselineDetectRequest, RunBaselineDetectResponse>
     */
    public SyncInvoker<RunBaselineDetectRequest, RunBaselineDetectResponse> runBaselineDetectInvoker(
        RunBaselineDetectRequest request) {
        return new SyncInvoker<>(request, HssMeta.runBaselineDetect, hcClient);
    }

    /**
     * 查询基线检测策略的基线目录信息
     *
     * 查询基线检测策略的基线目录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineDirectoryRequest 请求对象
     * @return ShowBaselineDirectoryResponse
     */
    public ShowBaselineDirectoryResponse showBaselineDirectory(ShowBaselineDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBaselineDirectory);
    }

    /**
     * 查询基线检测策略的基线目录信息
     *
     * 查询基线检测策略的基线目录信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineDirectoryRequest 请求对象
     * @return SyncInvoker<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse>
     */
    public SyncInvoker<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse> showBaselineDirectoryInvoker(
        ShowBaselineDirectoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBaselineDirectory, hcClient);
    }

    /**
     * 查询基线检查的统计数据信息
     *
     * 查询基线检查的统计数据信息，用来展示基线检查页面的统计数据和图表数据，包括最近检测时间、检测主机数、检测基线数、主机配置检查项数、主机配置基线通过率、主机配置风险top5、主机弱口令检测统计、主机弱口令风险top5等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineOverviewRequest 请求对象
     * @return ShowBaselineOverviewResponse
     */
    public ShowBaselineOverviewResponse showBaselineOverview(ShowBaselineOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBaselineOverview);
    }

    /**
     * 查询基线检查的统计数据信息
     *
     * 查询基线检查的统计数据信息，用来展示基线检查页面的统计数据和图表数据，包括最近检测时间、检测主机数、检测基线数、主机配置检查项数、主机配置基线通过率、主机配置风险top5、主机弱口令检测统计、主机弱口令风险top5等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineOverviewRequest 请求对象
     * @return SyncInvoker<ShowBaselineOverviewRequest, ShowBaselineOverviewResponse>
     */
    public SyncInvoker<ShowBaselineOverviewRequest, ShowBaselineOverviewResponse> showBaselineOverviewInvoker(
        ShowBaselineOverviewRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBaselineOverview, hcClient);
    }

    /**
     * 查询基线扫描手动检测结果
     *
     * 查询基线扫描手动检测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineScanStatusRequest 请求对象
     * @return ShowBaselineScanStatusResponse
     */
    public ShowBaselineScanStatusResponse showBaselineScanStatus(ShowBaselineScanStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBaselineScanStatus);
    }

    /**
     * 查询基线扫描手动检测结果
     *
     * 查询基线扫描手动检测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineScanStatusRequest 请求对象
     * @return SyncInvoker<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse>
     */
    public SyncInvoker<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse> showBaselineScanStatusInvoker(
        ShowBaselineScanStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBaselineScanStatus, hcClient);
    }

    /**
     * 查询基线检查的统计数据信息，包括弱口令，口令复杂度，配置检测
     *
     * 查询基线检查的风险数统计信息，包括弱口令，口令复杂度，配置检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineStatisticRequest 请求对象
     * @return ShowBaselineStatisticResponse
     */
    public ShowBaselineStatisticResponse showBaselineStatistic(ShowBaselineStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBaselineStatistic);
    }

    /**
     * 查询基线检查的统计数据信息，包括弱口令，口令复杂度，配置检测
     *
     * 查询基线检查的风险数统计信息，包括弱口令，口令复杂度，配置检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineStatisticRequest 请求对象
     * @return SyncInvoker<ShowBaselineStatisticRequest, ShowBaselineStatisticResponse>
     */
    public SyncInvoker<ShowBaselineStatisticRequest, ShowBaselineStatisticResponse> showBaselineStatisticInvoker(
        ShowBaselineStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBaselineStatistic, hcClient);
    }

    /**
     * 查询单个基线白名单
     *
     * 查询单个基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineWhiteListRequest 请求对象
     * @return ShowBaselineWhiteListResponse
     */
    public ShowBaselineWhiteListResponse showBaselineWhiteList(ShowBaselineWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBaselineWhiteList);
    }

    /**
     * 查询单个基线白名单
     *
     * 查询单个基线白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaselineWhiteListRequest 请求对象
     * @return SyncInvoker<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse>
     */
    public SyncInvoker<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse> showBaselineWhiteListInvoker(
        ShowBaselineWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBaselineWhiteList, hcClient);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleDetailRequest 请求对象
     * @return ShowCheckRuleDetailResponse
     */
    public ShowCheckRuleDetailResponse showCheckRuleDetail(ShowCheckRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCheckRuleDetail);
    }

    /**
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleDetailRequest 请求对象
     * @return SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse>
     */
    public SyncInvoker<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetailInvoker(
        ShowCheckRuleDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showCheckRuleDetail, hcClient);
    }

    /**
     * 查询检查项修复失败原因
     *
     * 查询检查项修复失败原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleFixFailDetailRequest 请求对象
     * @return ShowCheckRuleFixFailDetailResponse
     */
    public ShowCheckRuleFixFailDetailResponse showCheckRuleFixFailDetail(ShowCheckRuleFixFailDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCheckRuleFixFailDetail);
    }

    /**
     * 查询检查项修复失败原因
     *
     * 查询检查项修复失败原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckRuleFixFailDetailRequest 请求对象
     * @return SyncInvoker<ShowCheckRuleFixFailDetailRequest, ShowCheckRuleFixFailDetailResponse>
     */
    public SyncInvoker<ShowCheckRuleFixFailDetailRequest, ShowCheckRuleFixFailDetailResponse> showCheckRuleFixFailDetailInvoker(
        ShowCheckRuleFixFailDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showCheckRuleFixFailDetail, hcClient);
    }

    /**
     * 查询配置检测策略的默认基线信息
     *
     * 查询配置检测策略的默认基线信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultSecurityCheckPolicyRequest 请求对象
     * @return ShowDefaultSecurityCheckPolicyResponse
     */
    public ShowDefaultSecurityCheckPolicyResponse showDefaultSecurityCheckPolicy(
        ShowDefaultSecurityCheckPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showDefaultSecurityCheckPolicy);
    }

    /**
     * 查询配置检测策略的默认基线信息
     *
     * 查询配置检测策略的默认基线信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultSecurityCheckPolicyRequest 请求对象
     * @return SyncInvoker<ShowDefaultSecurityCheckPolicyRequest, ShowDefaultSecurityCheckPolicyResponse>
     */
    public SyncInvoker<ShowDefaultSecurityCheckPolicyRequest, ShowDefaultSecurityCheckPolicyResponse> showDefaultSecurityCheckPolicyInvoker(
        ShowDefaultSecurityCheckPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.showDefaultSecurityCheckPolicy, hcClient);
    }

    /**
     * 查询基线的详细检查项
     *
     * 查询基线的详细检查项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultSecurityCheckPolicyDetailsRequest 请求对象
     * @return ShowDefaultSecurityCheckPolicyDetailsResponse
     */
    public ShowDefaultSecurityCheckPolicyDetailsResponse showDefaultSecurityCheckPolicyDetails(
        ShowDefaultSecurityCheckPolicyDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showDefaultSecurityCheckPolicyDetails);
    }

    /**
     * 查询基线的详细检查项
     *
     * 查询基线的详细检查项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultSecurityCheckPolicyDetailsRequest 请求对象
     * @return SyncInvoker<ShowDefaultSecurityCheckPolicyDetailsRequest, ShowDefaultSecurityCheckPolicyDetailsResponse>
     */
    public SyncInvoker<ShowDefaultSecurityCheckPolicyDetailsRequest, ShowDefaultSecurityCheckPolicyDetailsResponse> showDefaultSecurityCheckPolicyDetailsInvoker(
        ShowDefaultSecurityCheckPolicyDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showDefaultSecurityCheckPolicyDetails, hcClient);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskConfigDetailRequest 请求对象
     * @return ShowRiskConfigDetailResponse
     */
    public ShowRiskConfigDetailResponse showRiskConfigDetail(ShowRiskConfigDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRiskConfigDetail);
    }

    /**
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskConfigDetailRequest 请求对象
     * @return SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse>
     */
    public SyncInvoker<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetailInvoker(
        ShowRiskConfigDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRiskConfigDetail, hcClient);
    }

    /**
     * 修改指定配置检测策略信息
     *
     * 修改指定配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckPolicyGroupRequest 请求对象
     * @return UpdateSecurityCheckPolicyGroupResponse
     */
    public UpdateSecurityCheckPolicyGroupResponse updateSecurityCheckPolicyGroup(
        UpdateSecurityCheckPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateSecurityCheckPolicyGroup);
    }

    /**
     * 修改指定配置检测策略信息
     *
     * 修改指定配置检测策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckPolicyGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityCheckPolicyGroupRequest, UpdateSecurityCheckPolicyGroupResponse>
     */
    public SyncInvoker<UpdateSecurityCheckPolicyGroupRequest, UpdateSecurityCheckPolicyGroupResponse> updateSecurityCheckPolicyGroupInvoker(
        UpdateSecurityCheckPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateSecurityCheckPolicyGroup, hcClient);
    }

    /**
     * 导出集群环境安全相关信息
     *
     * 导出集群环境安全相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRisksRequest 请求对象
     * @return ExportRisksResponse
     */
    public ExportRisksResponse exportRisks(ExportRisksRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportRisks);
    }

    /**
     * 导出集群环境安全相关信息
     *
     * 导出集群环境安全相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportRisksRequest 请求对象
     * @return SyncInvoker<ExportRisksRequest, ExportRisksResponse>
     */
    public SyncInvoker<ExportRisksRequest, ExportRisksResponse> exportRisksInvoker(ExportRisksRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportRisks, hcClient);
    }

    /**
     * 查询集群风险影响的集群资源列表
     *
     * 查询集群风险影响的集群资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRiskAffectResourcesRequest 请求对象
     * @return ListClusterRiskAffectResourcesResponse
     */
    public ListClusterRiskAffectResourcesResponse listClusterRiskAffectResources(
        ListClusterRiskAffectResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterRiskAffectResources);
    }

    /**
     * 查询集群风险影响的集群资源列表
     *
     * 查询集群风险影响的集群资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRiskAffectResourcesRequest 请求对象
     * @return SyncInvoker<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse>
     */
    public SyncInvoker<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse> listClusterRiskAffectResourcesInvoker(
        ListClusterRiskAffectResourcesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterRiskAffectResources, hcClient);
    }

    /**
     * 查询集群风险列表
     *
     * 查询集群风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRisksRequest 请求对象
     * @return ListClusterRisksResponse
     */
    public ListClusterRisksResponse listClusterRisks(ListClusterRisksRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listClusterRisks);
    }

    /**
     * 查询集群风险列表
     *
     * 查询集群风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClusterRisksRequest 请求对象
     * @return SyncInvoker<ListClusterRisksRequest, ListClusterRisksResponse>
     */
    public SyncInvoker<ListClusterRisksRequest, ListClusterRisksResponse> listClusterRisksInvoker(
        ListClusterRisksRequest request) {
        return new SyncInvoker<>(request, HssMeta.listClusterRisks, hcClient);
    }

    /**
     * 查询集群扫描统计数据
     *
     * 查询集群扫描统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterScanStatisticsRequest 请求对象
     * @return ShowClusterScanStatisticsResponse
     */
    public ShowClusterScanStatisticsResponse showClusterScanStatistics(ShowClusterScanStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showClusterScanStatistics);
    }

    /**
     * 查询集群扫描统计数据
     *
     * 查询集群扫描统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClusterScanStatisticsRequest 请求对象
     * @return SyncInvoker<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse>
     */
    public SyncInvoker<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse> showClusterScanStatisticsInvoker(
        ShowClusterScanStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showClusterScanStatistics, hcClient);
    }

    /**
     * 查询项目配置
     *
     * 查询项目配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectConfigsRequest 请求对象
     * @return ListProjectConfigsResponse
     */
    public ListProjectConfigsResponse listProjectConfigs(ListProjectConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProjectConfigs);
    }

    /**
     * 查询项目配置
     *
     * 查询项目配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectConfigsRequest 请求对象
     * @return SyncInvoker<ListProjectConfigsRequest, ListProjectConfigsResponse>
     */
    public SyncInvoker<ListProjectConfigsRequest, ListProjectConfigsResponse> listProjectConfigsInvoker(
        ListProjectConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProjectConfigs, hcClient);
    }

    /**
     * 修改项目配置
     *
     * 修改项目配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyProjectConfigsRequest 请求对象
     * @return ModifyProjectConfigsResponse
     */
    public ModifyProjectConfigsResponse modifyProjectConfigs(ModifyProjectConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyProjectConfigs);
    }

    /**
     * 修改项目配置
     *
     * 修改项目配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyProjectConfigsRequest 请求对象
     * @return SyncInvoker<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse>
     */
    public SyncInvoker<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse> modifyProjectConfigsInvoker(
        ModifyProjectConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyProjectConfigs, hcClient);
    }

    /**
     * 保存用户访问记录
     *
     * 保存用户访问记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveBrowsingHistoryRequest 请求对象
     * @return SaveBrowsingHistoryResponse
     */
    public SaveBrowsingHistoryResponse saveBrowsingHistory(SaveBrowsingHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.saveBrowsingHistory);
    }

    /**
     * 保存用户访问记录
     *
     * 保存用户访问记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveBrowsingHistoryRequest 请求对象
     * @return SyncInvoker<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse>
     */
    public SyncInvoker<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse> saveBrowsingHistoryInvoker(
        SaveBrowsingHistoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.saveBrowsingHistory, hcClient);
    }

    /**
     * 上传安全报告logo
     *
     * 上传安全报告logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadReportLogoRequest 请求对象
     * @return UploadReportLogoResponse
     */
    public UploadReportLogoResponse uploadReportLogo(UploadReportLogoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.uploadReportLogo);
    }

    /**
     * 上传安全报告logo
     *
     * 上传安全报告logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadReportLogoRequest 请求对象
     * @return SyncInvoker<UploadReportLogoRequest, UploadReportLogoResponse>
     */
    public SyncInvoker<UploadReportLogoRequest, UploadReportLogoResponse> uploadReportLogoInvoker(
        UploadReportLogoRequest request) {
        return new SyncInvoker<>(request, HssMeta.uploadReportLogo, hcClient);
    }

    /**
     * 新增cicd配置
     *
     * 新增cicd配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCicdConfigurationRequest 请求对象
     * @return AddCicdConfigurationResponse
     */
    public AddCicdConfigurationResponse addCicdConfiguration(AddCicdConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addCicdConfiguration);
    }

    /**
     * 新增cicd配置
     *
     * 新增cicd配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCicdConfigurationRequest 请求对象
     * @return SyncInvoker<AddCicdConfigurationRequest, AddCicdConfigurationResponse>
     */
    public SyncInvoker<AddCicdConfigurationRequest, AddCicdConfigurationResponse> addCicdConfigurationInvoker(
        AddCicdConfigurationRequest request) {
        return new SyncInvoker<>(request, HssMeta.addCicdConfiguration, hcClient);
    }

    /**
     * 新增镜像仓库
     *
     * 新增镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRegistryRequest 请求对象
     * @return AddRegistryResponse
     */
    public AddRegistryResponse addRegistry(AddRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addRegistry);
    }

    /**
     * 新增镜像仓库
     *
     * 新增镜像仓库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRegistryRequest 请求对象
     * @return SyncInvoker<AddRegistryRequest, AddRegistryResponse>
     */
    public SyncInvoker<AddRegistryRequest, AddRegistryResponse> addRegistryInvoker(AddRegistryRequest request) {
        return new SyncInvoker<>(request, HssMeta.addRegistry, hcClient);
    }

    /**
     * 批量卸载集群daemonset
     *
     * 批量卸载集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAgentDaemonsetRequest 请求对象
     * @return BatchDeleteAgentDaemonsetResponse
     */
    public BatchDeleteAgentDaemonsetResponse batchDeleteAgentDaemonset(BatchDeleteAgentDaemonsetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchDeleteAgentDaemonset);
    }

    /**
     * 批量卸载集群daemonset
     *
     * 批量卸载集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAgentDaemonsetRequest 请求对象
     * @return SyncInvoker<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse>
     */
    public SyncInvoker<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse> batchDeleteAgentDaemonsetInvoker(
        BatchDeleteAgentDaemonsetRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchDeleteAgentDaemonset, hcClient);
    }

    /**
     * 批量删除镜像仓接入信息
     *
     * 批量删除镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRegistryRequest 请求对象
     * @return BatchDeleteRegistryResponse
     */
    public BatchDeleteRegistryResponse batchDeleteRegistry(BatchDeleteRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchDeleteRegistry);
    }

    /**
     * 批量删除镜像仓接入信息
     *
     * 批量删除镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRegistryRequest 请求对象
     * @return SyncInvoker<BatchDeleteRegistryRequest, BatchDeleteRegistryResponse>
     */
    public SyncInvoker<BatchDeleteRegistryRequest, BatchDeleteRegistryResponse> batchDeleteRegistryInvoker(
        BatchDeleteRegistryRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchDeleteRegistry, hcClient);
    }

    /**
     * 批量升级集群daemonset
     *
     * 批量升级集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeAgentDaemonsetRequest 请求对象
     * @return BatchUpgradeAgentDaemonsetResponse
     */
    public BatchUpgradeAgentDaemonsetResponse batchUpgradeAgentDaemonset(BatchUpgradeAgentDaemonsetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchUpgradeAgentDaemonset);
    }

    /**
     * 批量升级集群daemonset
     *
     * 批量升级集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeAgentDaemonsetRequest 请求对象
     * @return SyncInvoker<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse>
     */
    public SyncInvoker<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse> batchUpgradeAgentDaemonsetInvoker(
        BatchUpgradeAgentDaemonsetRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchUpgradeAgentDaemonset, hcClient);
    }

    /**
     * 创建集群daemonset
     *
     * 创建集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgentDaemonsetRequest 请求对象
     * @return CreateAgentDaemonsetResponse
     */
    public CreateAgentDaemonsetResponse createAgentDaemonset(CreateAgentDaemonsetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createAgentDaemonset);
    }

    /**
     * 创建集群daemonset
     *
     * 创建集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgentDaemonsetRequest 请求对象
     * @return SyncInvoker<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse>
     */
    public SyncInvoker<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse> createAgentDaemonsetInvoker(
        CreateAgentDaemonsetRequest request) {
        return new SyncInvoker<>(request, HssMeta.createAgentDaemonset, hcClient);
    }

    /**
     * 生成cicd接入配置命令
     *
     * 生成cicd接入配置命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCicdConfigurationCommandRequest 请求对象
     * @return CreateCicdConfigurationCommandResponse
     */
    public CreateCicdConfigurationCommandResponse createCicdConfigurationCommand(
        CreateCicdConfigurationCommandRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createCicdConfigurationCommand);
    }

    /**
     * 生成cicd接入配置命令
     *
     * 生成cicd接入配置命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCicdConfigurationCommandRequest 请求对象
     * @return SyncInvoker<CreateCicdConfigurationCommandRequest, CreateCicdConfigurationCommandResponse>
     */
    public SyncInvoker<CreateCicdConfigurationCommandRequest, CreateCicdConfigurationCommandResponse> createCicdConfigurationCommandInvoker(
        CreateCicdConfigurationCommandRequest request) {
        return new SyncInvoker<>(request, HssMeta.createCicdConfigurationCommand, hcClient);
    }

    /**
     * 创建多云集群
     *
     * 创建多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiCloudClustersRequest 请求对象
     * @return CreateMultiCloudClustersResponse
     */
    public CreateMultiCloudClustersResponse createMultiCloudClusters(CreateMultiCloudClustersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createMultiCloudClusters);
    }

    /**
     * 创建多云集群
     *
     * 创建多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiCloudClustersRequest 请求对象
     * @return SyncInvoker<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse>
     */
    public SyncInvoker<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse> createMultiCloudClustersInvoker(
        CreateMultiCloudClustersRequest request) {
        return new SyncInvoker<>(request, HssMeta.createMultiCloudClusters, hcClient);
    }

    /**
     * 删除集群daemonset
     *
     * 删除集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentDaemonsetRequest 请求对象
     * @return DeleteAgentDaemonsetResponse
     */
    public DeleteAgentDaemonsetResponse deleteAgentDaemonset(DeleteAgentDaemonsetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteAgentDaemonset);
    }

    /**
     * 删除集群daemonset
     *
     * 删除集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgentDaemonsetRequest 请求对象
     * @return SyncInvoker<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse>
     */
    public SyncInvoker<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> deleteAgentDaemonsetInvoker(
        DeleteAgentDaemonsetRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteAgentDaemonset, hcClient);
    }

    /**
     * 删除CI/CD配置
     *
     * 删除CI/CD配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCicdConfigurationsRequest 请求对象
     * @return DeleteCicdConfigurationsResponse
     */
    public DeleteCicdConfigurationsResponse deleteCicdConfigurations(DeleteCicdConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteCicdConfigurations);
    }

    /**
     * 删除CI/CD配置
     *
     * 删除CI/CD配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCicdConfigurationsRequest 请求对象
     * @return SyncInvoker<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse>
     */
    public SyncInvoker<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse> deleteCicdConfigurationsInvoker(
        DeleteCicdConfigurationsRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteCicdConfigurations, hcClient);
    }

    /**
     * 删除镜像仓接入信息
     *
     * 删除镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRegistryRequest 请求对象
     * @return DeleteRegistryResponse
     */
    public DeleteRegistryResponse deleteRegistry(DeleteRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteRegistry);
    }

    /**
     * 删除镜像仓接入信息
     *
     * 删除镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRegistryRequest 请求对象
     * @return SyncInvoker<DeleteRegistryRequest, DeleteRegistryResponse>
     */
    public SyncInvoker<DeleteRegistryRequest, DeleteRegistryResponse> deleteRegistryInvoker(
        DeleteRegistryRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteRegistry, hcClient);
    }

    /**
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）
     *
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）,支持导出恶意文件、软件信息、文件信息、敏感信息、软件合规、镜像构建指令风险。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageSecurityReportTaskRequest 请求对象
     * @return ExportImageSecurityReportTaskResponse
     */
    public ExportImageSecurityReportTaskResponse exportImageSecurityReportTask(
        ExportImageSecurityReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportImageSecurityReportTask);
    }

    /**
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）
     *
     * 创建镜像安全报告信息导出任务（支持全量/批量导出）,支持导出恶意文件、软件信息、文件信息、敏感信息、软件合规、镜像构建指令风险。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageSecurityReportTaskRequest 请求对象
     * @return SyncInvoker<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse>
     */
    public SyncInvoker<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse> exportImageSecurityReportTaskInvoker(
        ExportImageSecurityReportTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportImageSecurityReportTask, hcClient);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDaemonsetClusterNodesLabelRequest 请求对象
     * @return ListAgentDaemonsetClusterNodesLabelResponse
     */
    public ListAgentDaemonsetClusterNodesLabelResponse listAgentDaemonsetClusterNodesLabel(
        ListAgentDaemonsetClusterNodesLabelRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAgentDaemonsetClusterNodesLabel);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDaemonsetClusterNodesLabelRequest 请求对象
     * @return SyncInvoker<ListAgentDaemonsetClusterNodesLabelRequest, ListAgentDaemonsetClusterNodesLabelResponse>
     */
    public SyncInvoker<ListAgentDaemonsetClusterNodesLabelRequest, ListAgentDaemonsetClusterNodesLabelResponse> listAgentDaemonsetClusterNodesLabelInvoker(
        ListAgentDaemonsetClusterNodesLabelRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAgentDaemonsetClusterNodesLabel, hcClient);
    }

    /**
     * 获取集群daemonset列表
     *
     * 获取集群daemonset列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDaemonsetInfoRequest 请求对象
     * @return ListAgentDaemonsetInfoResponse
     */
    public ListAgentDaemonsetInfoResponse listAgentDaemonsetInfo(ListAgentDaemonsetInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAgentDaemonsetInfo);
    }

    /**
     * 获取集群daemonset列表
     *
     * 获取集群daemonset列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentDaemonsetInfoRequest 请求对象
     * @return SyncInvoker<ListAgentDaemonsetInfoRequest, ListAgentDaemonsetInfoResponse>
     */
    public SyncInvoker<ListAgentDaemonsetInfoRequest, ListAgentDaemonsetInfoResponse> listAgentDaemonsetInfoInvoker(
        ListAgentDaemonsetInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAgentDaemonsetInfo, hcClient);
    }

    /**
     * 获取镜像同步任务关联的镜像仓的信息
     *
     * 获取镜像同步任务关联的镜像仓的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateRegistriesRequest 请求对象
     * @return ListAssociateRegistriesResponse
     */
    public ListAssociateRegistriesResponse listAssociateRegistries(ListAssociateRegistriesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAssociateRegistries);
    }

    /**
     * 获取镜像同步任务关联的镜像仓的信息
     *
     * 获取镜像同步任务关联的镜像仓的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociateRegistriesRequest 请求对象
     * @return SyncInvoker<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse>
     */
    public SyncInvoker<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse> listAssociateRegistriesInvoker(
        ListAssociateRegistriesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAssociateRegistries, hcClient);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceNodesLabelRequest 请求对象
     * @return ListCceNodesLabelResponse
     */
    public ListCceNodesLabelResponse listCceNodesLabel(ListCceNodesLabelRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCceNodesLabel);
    }

    /**
     * 获取集群节点标签
     *
     * 获取集群节点标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCceNodesLabelRequest 请求对象
     * @return SyncInvoker<ListCceNodesLabelRequest, ListCceNodesLabelResponse>
     */
    public SyncInvoker<ListCceNodesLabelRequest, ListCceNodesLabelResponse> listCceNodesLabelInvoker(
        ListCceNodesLabelRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCceNodesLabel, hcClient);
    }

    /**
     * 查询cicd配置列表
     *
     * 查询cicd配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdConfigurationsRequest 请求对象
     * @return ListCicdConfigurationsResponse
     */
    public ListCicdConfigurationsResponse listCicdConfigurations(ListCicdConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCicdConfigurations);
    }

    /**
     * 查询cicd配置列表
     *
     * 查询cicd配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdConfigurationsRequest 请求对象
     * @return SyncInvoker<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse>
     */
    public SyncInvoker<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse> listCicdConfigurationsInvoker(
        ListCicdConfigurationsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCicdConfigurations, hcClient);
    }

    /**
     * 查询cicd镜像列表
     *
     * 查询cicd镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdImagesRequest 请求对象
     * @return ListCicdImagesResponse
     */
    public ListCicdImagesResponse listCicdImages(ListCicdImagesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCicdImages);
    }

    /**
     * 查询cicd镜像列表
     *
     * 查询cicd镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCicdImagesRequest 请求对象
     * @return SyncInvoker<ListCicdImagesRequest, ListCicdImagesResponse>
     */
    public SyncInvoker<ListCicdImagesRequest, ListCicdImagesResponse> listCicdImagesInvoker(
        ListCicdImagesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCicdImages, hcClient);
    }

    /**
     * 查询多云集群
     *
     * 查询多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudClustersRequest 请求对象
     * @return ListMultiCloudClustersResponse
     */
    public ListMultiCloudClustersResponse listMultiCloudClusters(ListMultiCloudClustersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listMultiCloudClusters);
    }

    /**
     * 查询多云集群
     *
     * 查询多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMultiCloudClustersRequest 请求对象
     * @return SyncInvoker<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse>
     */
    public SyncInvoker<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse> listMultiCloudClustersInvoker(
        ListMultiCloudClustersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listMultiCloudClusters, hcClient);
    }

    /**
     * 获取镜像仓列表
     *
     * 获取镜像仓列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryRequest 请求对象
     * @return ListRegistryResponse
     */
    public ListRegistryResponse listRegistry(ListRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRegistry);
    }

    /**
     * 获取镜像仓列表
     *
     * 获取镜像仓列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryRequest 请求对象
     * @return SyncInvoker<ListRegistryRequest, ListRegistryResponse>
     */
    public SyncInvoker<ListRegistryRequest, ListRegistryResponse> listRegistryInvoker(ListRegistryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRegistry, hcClient);
    }

    /**
     * 查询镜像仓统计数据
     *
     * 查询镜像仓统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryStatisticsRequest 请求对象
     * @return ListRegistryStatisticsResponse
     */
    public ListRegistryStatisticsResponse listRegistryStatistics(ListRegistryStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRegistryStatistics);
    }

    /**
     * 查询镜像仓统计数据
     *
     * 查询镜像仓统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryStatisticsRequest 请求对象
     * @return SyncInvoker<ListRegistryStatisticsRequest, ListRegistryStatisticsResponse>
     */
    public SyncInvoker<ListRegistryStatisticsRequest, ListRegistryStatisticsResponse> listRegistryStatisticsInvoker(
        ListRegistryStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRegistryStatistics, hcClient);
    }

    /**
     * 修改CI/CD配置
     *
     * 修改CI/CD配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCicdConfigurationRequest 请求对象
     * @return ModifyCicdConfigurationResponse
     */
    public ModifyCicdConfigurationResponse modifyCicdConfiguration(ModifyCicdConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyCicdConfiguration);
    }

    /**
     * 修改CI/CD配置
     *
     * 修改CI/CD配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCicdConfigurationRequest 请求对象
     * @return SyncInvoker<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse>
     */
    public SyncInvoker<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse> modifyCicdConfigurationInvoker(
        ModifyCicdConfigurationRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyCicdConfiguration, hcClient);
    }

    /**
     * 解析多云集群的配置文件
     *
     * 解析多云集群的配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseMultiCloudClusterConfigRequest 请求对象
     * @return ParseMultiCloudClusterConfigResponse
     */
    public ParseMultiCloudClusterConfigResponse parseMultiCloudClusterConfig(
        ParseMultiCloudClusterConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.parseMultiCloudClusterConfig);
    }

    /**
     * 解析多云集群的配置文件
     *
     * 解析多云集群的配置文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseMultiCloudClusterConfigRequest 请求对象
     * @return SyncInvoker<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse>
     */
    public SyncInvoker<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse> parseMultiCloudClusterConfigInvoker(
        ParseMultiCloudClusterConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.parseMultiCloudClusterConfig, hcClient);
    }

    /**
     * 删除多云集群
     *
     * 删除多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveMultiCloudClustersRequest 请求对象
     * @return RemoveMultiCloudClustersResponse
     */
    public RemoveMultiCloudClustersResponse removeMultiCloudClusters(RemoveMultiCloudClustersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.removeMultiCloudClusters);
    }

    /**
     * 删除多云集群
     *
     * 删除多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveMultiCloudClustersRequest 请求对象
     * @return SyncInvoker<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse>
     */
    public SyncInvoker<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse> removeMultiCloudClustersInvoker(
        RemoveMultiCloudClustersRequest request) {
        return new SyncInvoker<>(request, HssMeta.removeMultiCloudClusters, hcClient);
    }

    /**
     * 集群公网接入方式网络配置信息
     *
     * 集群公网接入方式网络配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentAddressRequest 请求对象
     * @return ShowAgentAddressResponse
     */
    public ShowAgentAddressResponse showAgentAddress(ShowAgentAddressRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAgentAddress);
    }

    /**
     * 集群公网接入方式网络配置信息
     *
     * 集群公网接入方式网络配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentAddressRequest 请求对象
     * @return SyncInvoker<ShowAgentAddressRequest, ShowAgentAddressResponse>
     */
    public SyncInvoker<ShowAgentAddressRequest, ShowAgentAddressResponse> showAgentAddressInvoker(
        ShowAgentAddressRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAgentAddress, hcClient);
    }

    /**
     * 获取部署模板
     *
     * 获取部署模板，在安装Daemonset的时候提供选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDeployTemplateRequest 请求对象
     * @return ShowAgentDaemonsetDeployTemplateResponse
     */
    public ShowAgentDaemonsetDeployTemplateResponse showAgentDaemonsetDeployTemplate(
        ShowAgentDaemonsetDeployTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAgentDaemonsetDeployTemplate);
    }

    /**
     * 获取部署模板
     *
     * 获取部署模板，在安装Daemonset的时候提供选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDeployTemplateRequest 请求对象
     * @return SyncInvoker<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse>
     */
    public SyncInvoker<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse> showAgentDaemonsetDeployTemplateInvoker(
        ShowAgentDaemonsetDeployTemplateRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAgentDaemonsetDeployTemplate, hcClient);
    }

    /**
     * 获取集群daemonset信息
     *
     * 获取集群daemonset信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDetailInfoRequest 请求对象
     * @return ShowAgentDaemonsetDetailInfoResponse
     */
    public ShowAgentDaemonsetDetailInfoResponse showAgentDaemonsetDetailInfo(
        ShowAgentDaemonsetDetailInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAgentDaemonsetDetailInfo);
    }

    /**
     * 获取集群daemonset信息
     *
     * 获取集群daemonset信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentDaemonsetDetailInfoRequest 请求对象
     * @return SyncInvoker<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse>
     */
    public SyncInvoker<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse> showAgentDaemonsetDetailInfoInvoker(
        ShowAgentDaemonsetDetailInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAgentDaemonsetDetailInfo, hcClient);
    }

    /**
     * 查询CI/CD配置信息
     *
     * 查询CI/CD配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCicdConfigurationRequest 请求对象
     * @return ShowCicdConfigurationResponse
     */
    public ShowCicdConfigurationResponse showCicdConfiguration(ShowCicdConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCicdConfiguration);
    }

    /**
     * 查询CI/CD配置信息
     *
     * 查询CI/CD配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCicdConfigurationRequest 请求对象
     * @return SyncInvoker<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse>
     */
    public SyncInvoker<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse> showCicdConfigurationInvoker(
        ShowCicdConfigurationRequest request) {
        return new SyncInvoker<>(request, HssMeta.showCicdConfiguration, hcClient);
    }

    /**
     * 获取扫描组件镜像上传指令
     *
     * 获取镜像上传指令，上传的镜像是“镜像仓接入功能”和“镜像仓扫描功能”需要的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageUploadCommandRequest 请求对象
     * @return ShowImageUploadCommandResponse
     */
    public ShowImageUploadCommandResponse showImageUploadCommand(ShowImageUploadCommandRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageUploadCommand);
    }

    /**
     * 获取扫描组件镜像上传指令
     *
     * 获取镜像上传指令，上传的镜像是“镜像仓接入功能”和“镜像仓扫描功能”需要的组件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageUploadCommandRequest 请求对象
     * @return SyncInvoker<ShowImageUploadCommandRequest, ShowImageUploadCommandResponse>
     */
    public SyncInvoker<ShowImageUploadCommandRequest, ShowImageUploadCommandResponse> showImageUploadCommandInvoker(
        ShowImageUploadCommandRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageUploadCommand, hcClient);
    }

    /**
     * 获取多云集群的账号权限
     *
     * 获取多云集群的账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterAuthRequest 请求对象
     * @return ShowMultiCloudClusterAuthResponse
     */
    public ShowMultiCloudClusterAuthResponse showMultiCloudClusterAuth(ShowMultiCloudClusterAuthRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMultiCloudClusterAuth);
    }

    /**
     * 获取多云集群的账号权限
     *
     * 获取多云集群的账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterAuthRequest 请求对象
     * @return SyncInvoker<ShowMultiCloudClusterAuthRequest, ShowMultiCloudClusterAuthResponse>
     */
    public SyncInvoker<ShowMultiCloudClusterAuthRequest, ShowMultiCloudClusterAuthResponse> showMultiCloudClusterAuthInvoker(
        ShowMultiCloudClusterAuthRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMultiCloudClusterAuth, hcClient);
    }

    /**
     * 获取多云集群的上传镜像指令
     *
     * 获取多云集群的上传镜像指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterImageCommandRequest 请求对象
     * @return ShowMultiCloudClusterImageCommandResponse
     */
    public ShowMultiCloudClusterImageCommandResponse showMultiCloudClusterImageCommand(
        ShowMultiCloudClusterImageCommandRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMultiCloudClusterImageCommand);
    }

    /**
     * 获取多云集群的上传镜像指令
     *
     * 获取多云集群的上传镜像指令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterImageCommandRequest 请求对象
     * @return SyncInvoker<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse>
     */
    public SyncInvoker<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse> showMultiCloudClusterImageCommandInvoker(
        ShowMultiCloudClusterImageCommandRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMultiCloudClusterImageCommand, hcClient);
    }

    /**
     * 获取多云集群的代理安装脚本
     *
     * 获取多云集群的代理安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterProxyScriptRequest 请求对象
     * @return ShowMultiCloudClusterProxyScriptResponse
     */
    public ShowMultiCloudClusterProxyScriptResponse showMultiCloudClusterProxyScript(
        ShowMultiCloudClusterProxyScriptRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMultiCloudClusterProxyScript);
    }

    /**
     * 获取多云集群的代理安装脚本
     *
     * 获取多云集群的代理安装脚本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMultiCloudClusterProxyScriptRequest 请求对象
     * @return SyncInvoker<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse>
     */
    public SyncInvoker<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse> showMultiCloudClusterProxyScriptInvoker(
        ShowMultiCloudClusterProxyScriptRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMultiCloudClusterProxyScript, hcClient);
    }

    /**
     * 同步多云集群的接入状态
     *
     * 同步多云集群的接入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudClusterStatusRequest 请求对象
     * @return SyncMultiCloudClusterStatusResponse
     */
    public SyncMultiCloudClusterStatusResponse syncMultiCloudClusterStatus(SyncMultiCloudClusterStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.syncMultiCloudClusterStatus);
    }

    /**
     * 同步多云集群的接入状态
     *
     * 同步多云集群的接入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncMultiCloudClusterStatusRequest 请求对象
     * @return SyncInvoker<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse>
     */
    public SyncInvoker<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse> syncMultiCloudClusterStatusInvoker(
        SyncMultiCloudClusterStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.syncMultiCloudClusterStatus, hcClient);
    }

    /**
     * 更新集群daemonset
     *
     * 更新集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentDaemonsetRequest 请求对象
     * @return UpdateAgentDaemonsetResponse
     */
    public UpdateAgentDaemonsetResponse updateAgentDaemonset(UpdateAgentDaemonsetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateAgentDaemonset);
    }

    /**
     * 更新集群daemonset
     *
     * 更新集群daemonset。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentDaemonsetRequest 请求对象
     * @return SyncInvoker<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse>
     */
    public SyncInvoker<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> updateAgentDaemonsetInvoker(
        UpdateAgentDaemonsetRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateAgentDaemonset, hcClient);
    }

    /**
     * 更新多云集群
     *
     * 更新多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiCloudClustersRequest 请求对象
     * @return UpdateMultiCloudClustersResponse
     */
    public UpdateMultiCloudClustersResponse updateMultiCloudClusters(UpdateMultiCloudClustersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateMultiCloudClusters);
    }

    /**
     * 更新多云集群
     *
     * 更新多云集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMultiCloudClustersRequest 请求对象
     * @return SyncInvoker<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse>
     */
    public SyncInvoker<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse> updateMultiCloudClustersInvoker(
        UpdateMultiCloudClustersRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateMultiCloudClusters, hcClient);
    }

    /**
     * 编辑镜像仓接入信息
     *
     * 编辑镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRegistryRequest 请求对象
     * @return UpdateRegistryResponse
     */
    public UpdateRegistryResponse updateRegistry(UpdateRegistryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateRegistry);
    }

    /**
     * 编辑镜像仓接入信息
     *
     * 编辑镜像仓接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRegistryRequest 请求对象
     * @return SyncInvoker<UpdateRegistryRequest, UpdateRegistryResponse>
     */
    public SyncInvoker<UpdateRegistryRequest, UpdateRegistryResponse> updateRegistryInvoker(
        UpdateRegistryRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateRegistry, hcClient);
    }

    /**
     * 变更文件列表
     *
     * 变更文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileEventsRequest 请求对象
     * @return ListFileEventsResponse
     */
    public ListFileEventsResponse listFileEvents(ListFileEventsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listFileEvents);
    }

    /**
     * 变更文件列表
     *
     * 变更文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileEventsRequest 请求对象
     * @return SyncInvoker<ListFileEventsRequest, ListFileEventsResponse>
     */
    public SyncInvoker<ListFileEventsRequest, ListFileEventsResponse> listFileEventsInvoker(
        ListFileEventsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listFileEvents, hcClient);
    }

    /**
     * 某个服务器变更文件信息
     *
     * 某个服务器变更文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostEventDetailsRequest 请求对象
     * @return ListFileHostEventDetailsResponse
     */
    public ListFileHostEventDetailsResponse listFileHostEventDetails(ListFileHostEventDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listFileHostEventDetails);
    }

    /**
     * 某个服务器变更文件信息
     *
     * 某个服务器变更文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostEventDetailsRequest 请求对象
     * @return SyncInvoker<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse>
     */
    public SyncInvoker<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse> listFileHostEventDetailsInvoker(
        ListFileHostEventDetailsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listFileHostEventDetails, hcClient);
    }

    /**
     * 云服务器变更列表
     *
     * 云服务器变更列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostsRequest 请求对象
     * @return ListFileHostsResponse
     */
    public ListFileHostsResponse listFileHosts(ListFileHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listFileHosts);
    }

    /**
     * 云服务器变更列表
     *
     * 云服务器变更列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileHostsRequest 请求对象
     * @return SyncInvoker<ListFileHostsRequest, ListFileHostsResponse>
     */
    public SyncInvoker<ListFileHostsRequest, ListFileHostsResponse> listFileHostsInvoker(ListFileHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listFileHosts, hcClient);
    }

    /**
     * 获取服务器文件统计信息
     *
     * 获取服务器文件统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileStatisticRequest 请求对象
     * @return ShowFileStatisticResponse
     */
    public ShowFileStatisticResponse showFileStatistic(ShowFileStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showFileStatistic);
    }

    /**
     * 获取服务器文件统计信息
     *
     * 获取服务器文件统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileStatisticRequest 请求对象
     * @return SyncInvoker<ShowFileStatisticRequest, ShowFileStatisticResponse>
     */
    public SyncInvoker<ShowFileStatisticRequest, ShowFileStatisticResponse> showFileStatisticInvoker(
        ShowFileStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showFileStatistic, hcClient);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHostsGroupRequest 请求对象
     * @return AddHostsGroupResponse
     */
    public AddHostsGroupResponse addHostsGroup(AddHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addHostsGroup);
    }

    /**
     * 创建服务器组
     *
     * 创建服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHostsGroupRequest 请求对象
     * @return SyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse>
     */
    public SyncInvoker<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroupInvoker(AddHostsGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.addHostsGroup, hcClient);
    }

    /**
     * 关联资产重要性
     *
     * 关联资产重要性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateHostAssetValueRequest 请求对象
     * @return AssociateHostAssetValueResponse
     */
    public AssociateHostAssetValueResponse associateHostAssetValue(AssociateHostAssetValueRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associateHostAssetValue);
    }

    /**
     * 关联资产重要性
     *
     * 关联资产重要性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateHostAssetValueRequest 请求对象
     * @return SyncInvoker<AssociateHostAssetValueRequest, AssociateHostAssetValueResponse>
     */
    public SyncInvoker<AssociateHostAssetValueRequest, AssociateHostAssetValueResponse> associateHostAssetValueInvoker(
        AssociateHostAssetValueRequest request) {
        return new SyncInvoker<>(request, HssMeta.associateHostAssetValue, hcClient);
    }

    /**
     * 分配到组
     *
     * 分配到组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateHostsGroupRequest 请求对象
     * @return AssociateHostsGroupResponse
     */
    public AssociateHostsGroupResponse associateHostsGroup(AssociateHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associateHostsGroup);
    }

    /**
     * 分配到组
     *
     * 分配到组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateHostsGroupRequest 请求对象
     * @return SyncInvoker<AssociateHostsGroupRequest, AssociateHostsGroupResponse>
     */
    public SyncInvoker<AssociateHostsGroupRequest, AssociateHostsGroupResponse> associateHostsGroupInvoker(
        AssociateHostsGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.associateHostsGroup, hcClient);
    }

    /**
     * 开启或关闭“自动绑定配额”配置开关
     *
     * 开启或关闭“自动绑定配额”配置开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAutoOpenQuotaStatusRequest 请求对象
     * @return ChangeAutoOpenQuotaStatusResponse
     */
    public ChangeAutoOpenQuotaStatusResponse changeAutoOpenQuotaStatus(ChangeAutoOpenQuotaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAutoOpenQuotaStatus);
    }

    /**
     * 开启或关闭“自动绑定配额”配置开关
     *
     * 开启或关闭“自动绑定配额”配置开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAutoOpenQuotaStatusRequest 请求对象
     * @return SyncInvoker<ChangeAutoOpenQuotaStatusRequest, ChangeAutoOpenQuotaStatusResponse>
     */
    public SyncInvoker<ChangeAutoOpenQuotaStatusRequest, ChangeAutoOpenQuotaStatusResponse> changeAutoOpenQuotaStatusInvoker(
        ChangeAutoOpenQuotaStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAutoOpenQuotaStatus, hcClient);
    }

    /**
     * 忽略/取消忽略主机
     *
     * 忽略/取消忽略主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostIgnoreStatusRequest 请求对象
     * @return ChangeHostIgnoreStatusResponse
     */
    public ChangeHostIgnoreStatusResponse changeHostIgnoreStatus(ChangeHostIgnoreStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeHostIgnoreStatus);
    }

    /**
     * 忽略/取消忽略主机
     *
     * 忽略/取消忽略主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostIgnoreStatusRequest 请求对象
     * @return SyncInvoker<ChangeHostIgnoreStatusRequest, ChangeHostIgnoreStatusResponse>
     */
    public SyncInvoker<ChangeHostIgnoreStatusRequest, ChangeHostIgnoreStatusResponse> changeHostIgnoreStatusInvoker(
        ChangeHostIgnoreStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeHostIgnoreStatus, hcClient);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostsGroupRequest 请求对象
     * @return ChangeHostsGroupResponse
     */
    public ChangeHostsGroupResponse changeHostsGroup(ChangeHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeHostsGroup);
    }

    /**
     * 编辑服务器组
     *
     * 编辑服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeHostsGroupRequest 请求对象
     * @return SyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse>
     */
    public SyncInvoker<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroupInvoker(
        ChangeHostsGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeHostsGroup, hcClient);
    }

    /**
     * 创建VPC终端节点
     *
     * 创建VPC终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEndpointRequest 请求对象
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(CreateVpcEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createVpcEndpoint);
    }

    /**
     * 创建VPC终端节点
     *
     * 创建VPC终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEndpointRequest 请求对象
     * @return SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>
     */
    public SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse> createVpcEndpointInvoker(
        CreateVpcEndpointRequest request) {
        return new SyncInvoker<>(request, HssMeta.createVpcEndpoint, hcClient);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostsGroupRequest 请求对象
     * @return DeleteHostsGroupResponse
     */
    public DeleteHostsGroupResponse deleteHostsGroup(DeleteHostsGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteHostsGroup);
    }

    /**
     * 删除服务器组
     *
     * 删除服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostsGroupRequest 请求对象
     * @return SyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse>
     */
    public SyncInvoker<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroupInvoker(
        DeleteHostsGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteHostsGroup, hcClient);
    }

    /**
     * 查询“自动绑定配额”配置开关状态
     *
     * 查询“自动绑定配额”配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoOpenQuotaStatusRequest 请求对象
     * @return ListAutoOpenQuotaStatusResponse
     */
    public ListAutoOpenQuotaStatusResponse listAutoOpenQuotaStatus(ListAutoOpenQuotaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoOpenQuotaStatus);
    }

    /**
     * 查询“自动绑定配额”配置开关状态
     *
     * 查询“自动绑定配额”配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoOpenQuotaStatusRequest 请求对象
     * @return SyncInvoker<ListAutoOpenQuotaStatusRequest, ListAutoOpenQuotaStatusResponse>
     */
    public SyncInvoker<ListAutoOpenQuotaStatusRequest, ListAutoOpenQuotaStatusResponse> listAutoOpenQuotaStatusInvoker(
        ListAutoOpenQuotaStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAutoOpenQuotaStatus, hcClient);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostGroups);
    }

    /**
     * 查询服务器组列表
     *
     * 查询服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostGroups, hcClient);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostStatusRequest 请求对象
     * @return ListHostStatusResponse
     */
    public ListHostStatusResponse listHostStatus(ListHostStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostStatus);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostStatusRequest 请求对象
     * @return SyncInvoker<ListHostStatusRequest, ListHostStatusResponse>
     */
    public SyncInvoker<ListHostStatusRequest, ListHostStatusResponse> listHostStatusInvoker(
        ListHostStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostStatus, hcClient);
    }

    /**
     * ECS风险状况
     *
     * ECS风险状况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRiskRequest 请求对象
     * @return ListHostsRiskResponse
     */
    public ListHostsRiskResponse listHostsRisk(ListHostsRiskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostsRisk);
    }

    /**
     * ECS风险状况
     *
     * ECS风险状况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostsRiskRequest 请求对象
     * @return SyncInvoker<ListHostsRiskRequest, ListHostsRiskResponse>
     */
    public SyncInvoker<ListHostsRiskRequest, ListHostsRiskResponse> listHostsRiskInvoker(ListHostsRiskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostsRisk, hcClient);
    }

    /**
     * 查询主机策略列表
     *
     * 查询主机策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPolicies);
    }

    /**
     * 查询主机策略列表
     *
     * 查询主机策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public SyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesInvoker(ListPoliciesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPolicies, hcClient);
    }

    /**
     * 下发手动检测
     *
     * 下发手动检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetManualDetectRequest 请求对象
     * @return SetManualDetectResponse
     */
    public SetManualDetectResponse setManualDetect(SetManualDetectRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setManualDetect);
    }

    /**
     * 下发手动检测
     *
     * 下发手动检测。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetManualDetectRequest 请求对象
     * @return SyncInvoker<SetManualDetectRequest, SetManualDetectResponse>
     */
    public SyncInvoker<SetManualDetectRequest, SetManualDetectResponse> setManualDetectInvoker(
        SetManualDetectRequest request) {
        return new SyncInvoker<>(request, HssMeta.setManualDetect, hcClient);
    }

    /**
     * 查询每个主机的终端节点的创建状态
     *
     * 查询每个主机的终端节点的创建状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointStatusRequest 请求对象
     * @return ShowEndpointStatusResponse
     */
    public ShowEndpointStatusResponse showEndpointStatus(ShowEndpointStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showEndpointStatus);
    }

    /**
     * 查询每个主机的终端节点的创建状态
     *
     * 查询每个主机的终端节点的创建状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointStatusRequest 请求对象
     * @return SyncInvoker<ShowEndpointStatusRequest, ShowEndpointStatusResponse>
     */
    public SyncInvoker<ShowEndpointStatusRequest, ShowEndpointStatusResponse> showEndpointStatusInvoker(
        ShowEndpointStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showEndpointStatus, hcClient);
    }

    /**
     * 统计服务器数据
     *
     * 统计服务器数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostsStatisticsRequest 请求对象
     * @return ShowHostsStatisticsResponse
     */
    public ShowHostsStatisticsResponse showHostsStatistics(ShowHostsStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showHostsStatistics);
    }

    /**
     * 统计服务器数据
     *
     * 统计服务器数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostsStatisticsRequest 请求对象
     * @return SyncInvoker<ShowHostsStatisticsRequest, ShowHostsStatisticsResponse>
     */
    public SyncInvoker<ShowHostsStatisticsRequest, ShowHostsStatisticsResponse> showHostsStatisticsInvoker(
        ShowHostsStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showHostsStatistics, hcClient);
    }

    /**
     * 查询手动检测状态
     *
     * 查询手动检测状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanStatusRequest 请求对象
     * @return ShowScanStatusResponse
     */
    public ShowScanStatusResponse showScanStatus(ShowScanStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showScanStatus);
    }

    /**
     * 查询手动检测状态
     *
     * 查询手动检测状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScanStatusRequest 请求对象
     * @return SyncInvoker<ShowScanStatusRequest, ShowScanStatusResponse>
     */
    public SyncInvoker<ShowScanStatusRequest, ShowScanStatusResponse> showScanStatusInvoker(
        ShowScanStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showScanStatus, hcClient);
    }

    /**
     * 修改防火墙授权状态
     *
     * 修改防火墙授权状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFirewallStatusRequest 请求对象
     * @return SwitchFirewallStatusResponse
     */
    public SwitchFirewallStatusResponse switchFirewallStatus(SwitchFirewallStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchFirewallStatus);
    }

    /**
     * 修改防火墙授权状态
     *
     * 修改防火墙授权状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFirewallStatusRequest 请求对象
     * @return SyncInvoker<SwitchFirewallStatusRequest, SwitchFirewallStatusResponse>
     */
    public SyncInvoker<SwitchFirewallStatusRequest, SwitchFirewallStatusResponse> switchFirewallStatusInvoker(
        SwitchFirewallStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchFirewallStatus, hcClient);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchHostsProtectStatusRequest 请求对象
     * @return SwitchHostsProtectStatusResponse
     */
    public SwitchHostsProtectStatusResponse switchHostsProtectStatus(SwitchHostsProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchHostsProtectStatus);
    }

    /**
     * 切换防护状态
     *
     * 切换防护状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchHostsProtectStatusRequest 请求对象
     * @return SyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse>
     */
    public SyncInvoker<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatusInvoker(
        SwitchHostsProtectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchHostsProtectStatus, hcClient);
    }

    /**
     * 卸载Agent
     *
     * 卸载Agent。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallAgentsRequest 请求对象
     * @return UninstallAgentsResponse
     */
    public UninstallAgentsResponse uninstallAgents(UninstallAgentsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.uninstallAgents);
    }

    /**
     * 卸载Agent
     *
     * 卸载Agent。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallAgentsRequest 请求对象
     * @return SyncInvoker<UninstallAgentsRequest, UninstallAgentsResponse>
     */
    public SyncInvoker<UninstallAgentsRequest, UninstallAgentsResponse> uninstallAgentsInvoker(
        UninstallAgentsRequest request) {
        return new SyncInvoker<>(request, HssMeta.uninstallAgents, hcClient);
    }

    /**
     * 升级Agent
     *
     * 升级Agent。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeAgentsRequest 请求对象
     * @return UpgradeAgentsResponse
     */
    public UpgradeAgentsResponse upgradeAgents(UpgradeAgentsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.upgradeAgents);
    }

    /**
     * 升级Agent
     *
     * 升级Agent。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeAgentsRequest 请求对象
     * @return SyncInvoker<UpgradeAgentsRequest, UpgradeAgentsResponse>
     */
    public SyncInvoker<UpgradeAgentsRequest, UpgradeAgentsResponse> upgradeAgentsInvoker(UpgradeAgentsRequest request) {
        return new SyncInvoker<>(request, HssMeta.upgradeAgents, hcClient);
    }

    /**
     * 获取iac文件风险路径列表
     *
     * 获取iac文件风险路径列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRiskPathsRequest 请求对象
     * @return ListIacFileRiskPathsResponse
     */
    public ListIacFileRiskPathsResponse listIacFileRiskPaths(ListIacFileRiskPathsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listIacFileRiskPaths);
    }

    /**
     * 获取iac文件风险路径列表
     *
     * 获取iac文件风险路径列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRiskPathsRequest 请求对象
     * @return SyncInvoker<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse>
     */
    public SyncInvoker<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse> listIacFileRiskPathsInvoker(
        ListIacFileRiskPathsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listIacFileRiskPaths, hcClient);
    }

    /**
     * 获取iac文件风险列表
     *
     * 获取iac文件风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRisksRequest 请求对象
     * @return ListIacFileRisksResponse
     */
    public ListIacFileRisksResponse listIacFileRisks(ListIacFileRisksRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listIacFileRisks);
    }

    /**
     * 获取iac文件风险列表
     *
     * 获取iac文件风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFileRisksRequest 请求对象
     * @return SyncInvoker<ListIacFileRisksRequest, ListIacFileRisksResponse>
     */
    public SyncInvoker<ListIacFileRisksRequest, ListIacFileRisksResponse> listIacFileRisksInvoker(
        ListIacFileRisksRequest request) {
        return new SyncInvoker<>(request, HssMeta.listIacFileRisks, hcClient);
    }

    /**
     * 获取iac文件列表
     *
     * 获取iac文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFilesRequest 请求对象
     * @return ListIacFilesResponse
     */
    public ListIacFilesResponse listIacFiles(ListIacFilesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listIacFiles);
    }

    /**
     * 获取iac文件列表
     *
     * 获取iac文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIacFilesRequest 请求对象
     * @return SyncInvoker<ListIacFilesRequest, ListIacFilesResponse>
     */
    public SyncInvoker<ListIacFilesRequest, ListIacFilesResponse> listIacFilesInvoker(ListIacFilesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listIacFiles, hcClient);
    }

    /**
     * 新增镜像白名单
     *
     * 新增镜像白名单，目前仅支持漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageWhiteListsRequest 请求对象
     * @return AddImageWhiteListsResponse
     */
    public AddImageWhiteListsResponse addImageWhiteLists(AddImageWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addImageWhiteLists);
    }

    /**
     * 新增镜像白名单
     *
     * 新增镜像白名单，目前仅支持漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageWhiteListsRequest 请求对象
     * @return SyncInvoker<AddImageWhiteListsRequest, AddImageWhiteListsResponse>
     */
    public SyncInvoker<AddImageWhiteListsRequest, AddImageWhiteListsResponse> addImageWhiteListsInvoker(
        AddImageWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.addImageWhiteLists, hcClient);
    }

    /**
     * 镜像仓库基线检查批量导出（支持全量导出）
     *
     * 镜像仓库基线检查批量导出（支持全量导出）,若导出镜像类型为cicd类型的数据，需要传参image_type为cicd。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportBaselineTaskRequest 请求对象
     * @return BatchExportBaselineTaskResponse
     */
    public BatchExportBaselineTaskResponse batchExportBaselineTask(BatchExportBaselineTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchExportBaselineTask);
    }

    /**
     * 镜像仓库基线检查批量导出（支持全量导出）
     *
     * 镜像仓库基线检查批量导出（支持全量导出）,若导出镜像类型为cicd类型的数据，需要传参image_type为cicd。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportBaselineTaskRequest 请求对象
     * @return SyncInvoker<BatchExportBaselineTaskRequest, BatchExportBaselineTaskResponse>
     */
    public SyncInvoker<BatchExportBaselineTaskRequest, BatchExportBaselineTaskResponse> batchExportBaselineTaskInvoker(
        BatchExportBaselineTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchExportBaselineTask, hcClient);
    }

    /**
     * 本地镜像漏洞批量导出（支持全量导出）
     *
     * 本地镜像漏洞批量导出（支持全量导出）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportLocalVulTaskRequest 请求对象
     * @return BatchExportLocalVulTaskResponse
     */
    public BatchExportLocalVulTaskResponse batchExportLocalVulTask(BatchExportLocalVulTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchExportLocalVulTask);
    }

    /**
     * 本地镜像漏洞批量导出（支持全量导出）
     *
     * 本地镜像漏洞批量导出（支持全量导出）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExportLocalVulTaskRequest 请求对象
     * @return SyncInvoker<BatchExportLocalVulTaskRequest, BatchExportLocalVulTaskResponse>
     */
    public SyncInvoker<BatchExportLocalVulTaskRequest, BatchExportLocalVulTaskResponse> batchExportLocalVulTaskInvoker(
        BatchExportLocalVulTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchExportLocalVulTask, hcClient);
    }

    /**
     * 本地镜像扫描
     *
     * 本地镜像扫描。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanLocalImageRequest 请求对象
     * @return BatchScanLocalImageResponse
     */
    public BatchScanLocalImageResponse batchScanLocalImage(BatchScanLocalImageRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchScanLocalImage);
    }

    /**
     * 本地镜像扫描
     *
     * 本地镜像扫描。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanLocalImageRequest 请求对象
     * @return SyncInvoker<BatchScanLocalImageRequest, BatchScanLocalImageResponse>
     */
    public SyncInvoker<BatchScanLocalImageRequest, BatchScanLocalImageResponse> batchScanLocalImageInvoker(
        BatchScanLocalImageRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchScanLocalImage, hcClient);
    }

    /**
     * 镜像仓库镜像批量扫描--接口已废弃
     *
     * 镜像仓库镜像批量扫描--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanSwrImageRequest 请求对象
     * @return BatchScanSwrImageResponse
     */
    public BatchScanSwrImageResponse batchScanSwrImage(BatchScanSwrImageRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchScanSwrImage);
    }

    /**
     * 镜像仓库镜像批量扫描--接口已废弃
     *
     * 镜像仓库镜像批量扫描--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchScanSwrImageRequest 请求对象
     * @return SyncInvoker<BatchScanSwrImageRequest, BatchScanSwrImageResponse>
     */
    public SyncInvoker<BatchScanSwrImageRequest, BatchScanSwrImageResponse> batchScanSwrImageInvoker(
        BatchScanSwrImageRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchScanSwrImage, hcClient);
    }

    /**
     * 修改镜像的自定义弱口令
     *
     * 修改镜像的自定义弱口令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeExtendedWeakPasswordRequest 请求对象
     * @return ChangeExtendedWeakPasswordResponse
     */
    public ChangeExtendedWeakPasswordResponse changeExtendedWeakPassword(ChangeExtendedWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeExtendedWeakPassword);
    }

    /**
     * 修改镜像的自定义弱口令
     *
     * 修改镜像的自定义弱口令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeExtendedWeakPasswordRequest 请求对象
     * @return SyncInvoker<ChangeExtendedWeakPasswordRequest, ChangeExtendedWeakPasswordResponse>
     */
    public SyncInvoker<ChangeExtendedWeakPasswordRequest, ChangeExtendedWeakPasswordResponse> changeExtendedWeakPasswordInvoker(
        ChangeExtendedWeakPasswordRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeExtendedWeakPassword, hcClient);
    }

    /**
     * 修改镜像的敏感信息文件路径白名单--接口已废弃
     *
     * 修改镜像的敏感信息文件路径白名单--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFilePathWhiteDetailRequest 请求对象
     * @return ChangeFilePathWhiteDetailResponse
     */
    public ChangeFilePathWhiteDetailResponse changeFilePathWhiteDetail(ChangeFilePathWhiteDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeFilePathWhiteDetail);
    }

    /**
     * 修改镜像的敏感信息文件路径白名单--接口已废弃
     *
     * 修改镜像的敏感信息文件路径白名单--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFilePathWhiteDetailRequest 请求对象
     * @return SyncInvoker<ChangeFilePathWhiteDetailRequest, ChangeFilePathWhiteDetailResponse>
     */
    public SyncInvoker<ChangeFilePathWhiteDetailRequest, ChangeFilePathWhiteDetailResponse> changeFilePathWhiteDetailInvoker(
        ChangeFilePathWhiteDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeFilePathWhiteDetail, hcClient);
    }

    /**
     * 修改镜像的敏感信息文件路径白名单
     *
     * 修改镜像的敏感信息文件路径白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFilePathWhiteListsRequest 请求对象
     * @return ChangeFilePathWhiteListsResponse
     */
    public ChangeFilePathWhiteListsResponse changeFilePathWhiteLists(ChangeFilePathWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeFilePathWhiteLists);
    }

    /**
     * 修改镜像的敏感信息文件路径白名单
     *
     * 修改镜像的敏感信息文件路径白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFilePathWhiteListsRequest 请求对象
     * @return SyncInvoker<ChangeFilePathWhiteListsRequest, ChangeFilePathWhiteListsResponse>
     */
    public SyncInvoker<ChangeFilePathWhiteListsRequest, ChangeFilePathWhiteListsResponse> changeFilePathWhiteListsInvoker(
        ChangeFilePathWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeFilePathWhiteLists, hcClient);
    }

    /**
     * 修改镜像白名单配置信息
     *
     * 修改镜像白名单配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeImageWhiteListRequest 请求对象
     * @return ChangeImageWhiteListResponse
     */
    public ChangeImageWhiteListResponse changeImageWhiteList(ChangeImageWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeImageWhiteList);
    }

    /**
     * 修改镜像白名单配置信息
     *
     * 修改镜像白名单配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeImageWhiteListRequest 请求对象
     * @return SyncInvoker<ChangeImageWhiteListRequest, ChangeImageWhiteListResponse>
     */
    public SyncInvoker<ChangeImageWhiteListRequest, ChangeImageWhiteListResponse> changeImageWhiteListInvoker(
        ChangeImageWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeImageWhiteList, hcClient);
    }

    /**
     * 敏感信息操作处理
     *
     * 敏感信息操作处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSensitiveInfoRequest 请求对象
     * @return ChangeSensitiveInfoResponse
     */
    public ChangeSensitiveInfoResponse changeSensitiveInfo(ChangeSensitiveInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeSensitiveInfo);
    }

    /**
     * 敏感信息操作处理
     *
     * 敏感信息操作处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSensitiveInfoRequest 请求对象
     * @return SyncInvoker<ChangeSensitiveInfoRequest, ChangeSensitiveInfoResponse>
     */
    public SyncInvoker<ChangeSensitiveInfoRequest, ChangeSensitiveInfoResponse> changeSensitiveInfoInvoker(
        ChangeSensitiveInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeSensitiveInfo, hcClient);
    }

    /**
     * 删除镜像白名单
     *
     * 删除镜像白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageWhiteListsRequest 请求对象
     * @return DeleteImageWhiteListsResponse
     */
    public DeleteImageWhiteListsResponse deleteImageWhiteLists(DeleteImageWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteImageWhiteLists);
    }

    /**
     * 删除镜像白名单
     *
     * 删除镜像白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageWhiteListsRequest 请求对象
     * @return SyncInvoker<DeleteImageWhiteListsRequest, DeleteImageWhiteListsResponse>
     */
    public SyncInvoker<DeleteImageWhiteListsRequest, DeleteImageWhiteListsResponse> deleteImageWhiteListsInvoker(
        DeleteImageWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteImageWhiteLists, hcClient);
    }

    /**
     * 处置镜像漏洞
     *
     * 处置镜像漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleImageVulnerabilityRequest 请求对象
     * @return HandleImageVulnerabilityResponse
     */
    public HandleImageVulnerabilityResponse handleImageVulnerability(HandleImageVulnerabilityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.handleImageVulnerability);
    }

    /**
     * 处置镜像漏洞
     *
     * 处置镜像漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandleImageVulnerabilityRequest 请求对象
     * @return SyncInvoker<HandleImageVulnerabilityRequest, HandleImageVulnerabilityResponse>
     */
    public SyncInvoker<HandleImageVulnerabilityRequest, HandleImageVulnerabilityResponse> handleImageVulnerabilityInvoker(
        HandleImageVulnerabilityRequest request) {
        return new SyncInvoker<>(request, HssMeta.handleImageVulnerability, hcClient);
    }

    /**
     * 查询配置检查项影响到的资源列表
     *
     * 查询配置检查项影响到的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRuleResourcesRequest 请求对象
     * @return ListCheckRuleResourcesResponse
     */
    public ListCheckRuleResourcesResponse listCheckRuleResources(ListCheckRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCheckRuleResources);
    }

    /**
     * 查询配置检查项影响到的资源列表
     *
     * 查询配置检查项影响到的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRuleResourcesRequest 请求对象
     * @return SyncInvoker<ListCheckRuleResourcesRequest, ListCheckRuleResourcesResponse>
     */
    public SyncInvoker<ListCheckRuleResourcesRequest, ListCheckRuleResourcesResponse> listCheckRuleResourcesInvoker(
        ListCheckRuleResourcesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCheckRuleResources, hcClient);
    }

    /**
     * 查询基线检查的配置检查信息
     *
     * 查询基线检查的配置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRulesInfoRequest 请求对象
     * @return ListCheckRulesInfoResponse
     */
    public ListCheckRulesInfoResponse listCheckRulesInfo(ListCheckRulesInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listCheckRulesInfo);
    }

    /**
     * 查询基线检查的配置检查信息
     *
     * 查询基线检查的配置检查信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCheckRulesInfoRequest 请求对象
     * @return SyncInvoker<ListCheckRulesInfoRequest, ListCheckRulesInfoResponse>
     */
    public SyncInvoker<ListCheckRulesInfoRequest, ListCheckRulesInfoResponse> listCheckRulesInfoInvoker(
        ListCheckRulesInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listCheckRulesInfo, hcClient);
    }

    /**
     * 查询容器镜像操作日志
     *
     * 查询容器镜像操作日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImageLogsRequest 请求对象
     * @return ListContainerImageLogsResponse
     */
    public ListContainerImageLogsResponse listContainerImageLogs(ListContainerImageLogsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerImageLogs);
    }

    /**
     * 查询容器镜像操作日志
     *
     * 查询容器镜像操作日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImageLogsRequest 请求对象
     * @return SyncInvoker<ListContainerImageLogsRequest, ListContainerImageLogsResponse>
     */
    public SyncInvoker<ListContainerImageLogsRequest, ListContainerImageLogsResponse> listContainerImageLogsInvoker(
        ListContainerImageLogsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerImageLogs, hcClient);
    }

    /**
     * 查询容器镜像列表
     *
     * 查询容器镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImagesRequest 请求对象
     * @return ListContainerImagesResponse
     */
    public ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listContainerImages);
    }

    /**
     * 查询容器镜像列表
     *
     * 查询容器镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerImagesRequest 请求对象
     * @return SyncInvoker<ListContainerImagesRequest, ListContainerImagesResponse>
     */
    public SyncInvoker<ListContainerImagesRequest, ListContainerImagesResponse> listContainerImagesInvoker(
        ListContainerImagesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listContainerImages, hcClient);
    }

    /**
     * 获取镜像软件信息
     *
     * 获取镜像软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalImageAppsRequest 请求对象
     * @return ListGlobalImageAppsResponse
     */
    public ListGlobalImageAppsResponse listGlobalImageApps(ListGlobalImageAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGlobalImageApps);
    }

    /**
     * 获取镜像软件信息
     *
     * 获取镜像软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalImageAppsRequest 请求对象
     * @return SyncInvoker<ListGlobalImageAppsRequest, ListGlobalImageAppsResponse>
     */
    public SyncInvoker<ListGlobalImageAppsRequest, ListGlobalImageAppsResponse> listGlobalImageAppsInvoker(
        ListGlobalImageAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGlobalImageApps, hcClient);
    }

    /**
     * 获取镜像文件信息
     *
     * 获取镜像文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalImageFilesRequest 请求对象
     * @return ListGlobalImageFilesResponse
     */
    public ListGlobalImageFilesResponse listGlobalImageFiles(ListGlobalImageFilesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGlobalImageFiles);
    }

    /**
     * 获取镜像文件信息
     *
     * 获取镜像文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalImageFilesRequest 请求对象
     * @return SyncInvoker<ListGlobalImageFilesRequest, ListGlobalImageFilesResponse>
     */
    public SyncInvoker<ListGlobalImageFilesRequest, ListGlobalImageFilesResponse> listGlobalImageFilesInvoker(
        ListGlobalImageFilesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGlobalImageFiles, hcClient);
    }

    /**
     * 查询租户恶意文件列表
     *
     * 查询租户恶意文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalMalwareRequest 请求对象
     * @return ListGlobalMalwareResponse
     */
    public ListGlobalMalwareResponse listGlobalMalware(ListGlobalMalwareRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGlobalMalware);
    }

    /**
     * 查询租户恶意文件列表
     *
     * 查询租户恶意文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalMalwareRequest 请求对象
     * @return SyncInvoker<ListGlobalMalwareRequest, ListGlobalMalwareResponse>
     */
    public SyncInvoker<ListGlobalMalwareRequest, ListGlobalMalwareResponse> listGlobalMalwareInvoker(
        ListGlobalMalwareRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGlobalMalware, hcClient);
    }

    /**
     * 租户的漏洞信息
     *
     * 租户的漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalVulnerabilitiesRequest 请求对象
     * @return ListGlobalVulnerabilitiesResponse
     */
    public ListGlobalVulnerabilitiesResponse listGlobalVulnerabilities(ListGlobalVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGlobalVulnerabilities);
    }

    /**
     * 租户的漏洞信息
     *
     * 租户的漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGlobalVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListGlobalVulnerabilitiesRequest, ListGlobalVulnerabilitiesResponse>
     */
    public SyncInvoker<ListGlobalVulnerabilitiesRequest, ListGlobalVulnerabilitiesResponse> listGlobalVulnerabilitiesInvoker(
        ListGlobalVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGlobalVulnerabilities, hcClient);
    }

    /**
     * 查询镜像软件列表
     *
     * 查询镜像软件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAppsRequest 请求对象
     * @return ListImageAppsResponse
     */
    public ListImageAppsResponse listImageApps(ListImageAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageApps);
    }

    /**
     * 查询镜像软件列表
     *
     * 查询镜像软件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageAppsRequest 请求对象
     * @return SyncInvoker<ListImageAppsRequest, ListImageAppsResponse>
     */
    public SyncInvoker<ListImageAppsRequest, ListImageAppsResponse> listImageAppsInvoker(ListImageAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageApps, hcClient);
    }

    /**
     * 查询镜像的基础镜像信息
     *
     * 查询镜像的基础镜像信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBasicImageRequest 请求对象
     * @return ListImageBasicImageResponse
     */
    public ListImageBasicImageResponse listImageBasicImage(ListImageBasicImageRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageBasicImage);
    }

    /**
     * 查询镜像的基础镜像信息
     *
     * 查询镜像的基础镜像信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBasicImageRequest 请求对象
     * @return SyncInvoker<ListImageBasicImageRequest, ListImageBasicImageResponse>
     */
    public SyncInvoker<ListImageBasicImageRequest, ListImageBasicImageResponse> listImageBasicImageInvoker(
        ListImageBasicImageRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageBasicImage, hcClient);
    }

    /**
     * 获取镜像构建指令风险信息
     *
     * 获取镜像构建指令风险信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBuildCommandRisksRequest 请求对象
     * @return ListImageBuildCommandRisksResponse
     */
    public ListImageBuildCommandRisksResponse listImageBuildCommandRisks(ListImageBuildCommandRisksRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageBuildCommandRisks);
    }

    /**
     * 获取镜像构建指令风险信息
     *
     * 获取镜像构建指令风险信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBuildCommandRisksRequest 请求对象
     * @return SyncInvoker<ListImageBuildCommandRisksRequest, ListImageBuildCommandRisksResponse>
     */
    public SyncInvoker<ListImageBuildCommandRisksRequest, ListImageBuildCommandRisksResponse> listImageBuildCommandRisksInvoker(
        ListImageBuildCommandRisksRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageBuildCommandRisks, hcClient);
    }

    /**
     * 查询镜像构建指令影响到的镜像列表
     *
     * 查询镜像构建指令影响到的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBuildCommandRisksImagesRequest 请求对象
     * @return ListImageBuildCommandRisksImagesResponse
     */
    public ListImageBuildCommandRisksImagesResponse listImageBuildCommandRisksImages(
        ListImageBuildCommandRisksImagesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageBuildCommandRisksImages);
    }

    /**
     * 查询镜像构建指令影响到的镜像列表
     *
     * 查询镜像构建指令影响到的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageBuildCommandRisksImagesRequest 请求对象
     * @return SyncInvoker<ListImageBuildCommandRisksImagesRequest, ListImageBuildCommandRisksImagesResponse>
     */
    public SyncInvoker<ListImageBuildCommandRisksImagesRequest, ListImageBuildCommandRisksImagesResponse> listImageBuildCommandRisksImagesInvoker(
        ListImageBuildCommandRisksImagesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageBuildCommandRisksImages, hcClient);
    }

    /**
     * 查询镜像文件列表
     *
     * 查询镜像文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageFilesRequest 请求对象
     * @return ListImageFilesResponse
     */
    public ListImageFilesResponse listImageFiles(ListImageFilesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageFiles);
    }

    /**
     * 查询镜像文件列表
     *
     * 查询镜像文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageFilesRequest 请求对象
     * @return SyncInvoker<ListImageFilesRequest, ListImageFilesResponse>
     */
    public SyncInvoker<ListImageFilesRequest, ListImageFilesResponse> listImageFilesInvoker(
        ListImageFilesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageFiles, hcClient);
    }

    /**
     * 查询镜像漏洞处置操作影响的漏洞列表
     *
     * 查询镜像漏洞处置操作影响的漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageHandleAffectVulnerabilitiesRequest 请求对象
     * @return ListImageHandleAffectVulnerabilitiesResponse
     */
    public ListImageHandleAffectVulnerabilitiesResponse listImageHandleAffectVulnerabilities(
        ListImageHandleAffectVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageHandleAffectVulnerabilities);
    }

    /**
     * 查询镜像漏洞处置操作影响的漏洞列表
     *
     * 查询镜像漏洞处置操作影响的漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageHandleAffectVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListImageHandleAffectVulnerabilitiesRequest, ListImageHandleAffectVulnerabilitiesResponse>
     */
    public SyncInvoker<ListImageHandleAffectVulnerabilitiesRequest, ListImageHandleAffectVulnerabilitiesResponse> listImageHandleAffectVulnerabilitiesInvoker(
        ListImageHandleAffectVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageHandleAffectVulnerabilities, hcClient);
    }

    /**
     * 本地镜像列表查询
     *
     * 本地镜像列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageLocalRequest 请求对象
     * @return ListImageLocalResponse
     */
    public ListImageLocalResponse listImageLocal(ListImageLocalRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageLocal);
    }

    /**
     * 本地镜像列表查询
     *
     * 本地镜像列表查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageLocalRequest 请求对象
     * @return SyncInvoker<ListImageLocalRequest, ListImageLocalResponse>
     */
    public SyncInvoker<ListImageLocalRequest, ListImageLocalResponse> listImageLocalInvoker(
        ListImageLocalRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageLocal, hcClient);
    }

    /**
     * 查询镜像恶意文件列表
     *
     * 查询镜像恶意文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMalwareRequest 请求对象
     * @return ListImageMalwareResponse
     */
    public ListImageMalwareResponse listImageMalware(ListImageMalwareRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageMalware);
    }

    /**
     * 查询镜像恶意文件列表
     *
     * 查询镜像恶意文件列表，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMalwareRequest 请求对象
     * @return SyncInvoker<ListImageMalwareRequest, ListImageMalwareResponse>
     */
    public SyncInvoker<ListImageMalwareRequest, ListImageMalwareResponse> listImageMalwareInvoker(
        ListImageMalwareRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageMalware, hcClient);
    }

    /**
     * 查询镜像的不合规软件信息
     *
     * 查询镜像的不合规软件信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageNonCompliantAppRequest 请求对象
     * @return ListImageNonCompliantAppResponse
     */
    public ListImageNonCompliantAppResponse listImageNonCompliantApp(ListImageNonCompliantAppRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageNonCompliantApp);
    }

    /**
     * 查询镜像的不合规软件信息
     *
     * 查询镜像的不合规软件信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageNonCompliantAppRequest 请求对象
     * @return SyncInvoker<ListImageNonCompliantAppRequest, ListImageNonCompliantAppResponse>
     */
    public SyncInvoker<ListImageNonCompliantAppRequest, ListImageNonCompliantAppResponse> listImageNonCompliantAppInvoker(
        ListImageNonCompliantAppRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageNonCompliantApp, hcClient);
    }

    /**
     * 查询镜像口令复杂度策略检测报告
     *
     * 查询镜像口令复杂度策略检测报告，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagePwdComplexityRequest 请求对象
     * @return ListImagePwdComplexityResponse
     */
    public ListImagePwdComplexityResponse listImagePwdComplexity(ListImagePwdComplexityRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImagePwdComplexity);
    }

    /**
     * 查询镜像口令复杂度策略检测报告
     *
     * 查询镜像口令复杂度策略检测报告，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagePwdComplexityRequest 请求对象
     * @return SyncInvoker<ListImagePwdComplexityRequest, ListImagePwdComplexityResponse>
     */
    public SyncInvoker<ListImagePwdComplexityRequest, ListImagePwdComplexityResponse> listImagePwdComplexityInvoker(
        ListImagePwdComplexityRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImagePwdComplexity, hcClient);
    }

    /**
     * 查询镜像指定安全配置项的检查项列表
     *
     * 查询镜像指定安全配置项的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigRulesRequest 请求对象
     * @return ListImageRiskConfigRulesResponse
     */
    public ListImageRiskConfigRulesResponse listImageRiskConfigRules(ListImageRiskConfigRulesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageRiskConfigRules);
    }

    /**
     * 查询镜像指定安全配置项的检查项列表
     *
     * 查询镜像指定安全配置项的检查项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigRulesRequest 请求对象
     * @return SyncInvoker<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse>
     */
    public SyncInvoker<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> listImageRiskConfigRulesInvoker(
        ListImageRiskConfigRulesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageRiskConfigRules, hcClient);
    }

    /**
     * 查询镜像安全配置检测结果列表
     *
     * 查询镜像安全配置检测结果列表，当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigsRequest 请求对象
     * @return ListImageRiskConfigsResponse
     */
    public ListImageRiskConfigsResponse listImageRiskConfigs(ListImageRiskConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageRiskConfigs);
    }

    /**
     * 查询镜像安全配置检测结果列表
     *
     * 查询镜像安全配置检测结果列表，当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageRiskConfigsRequest 请求对象
     * @return SyncInvoker<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse>
     */
    public SyncInvoker<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> listImageRiskConfigsInvoker(
        ListImageRiskConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageRiskConfigs, hcClient);
    }

    /**
     * 查询镜像的敏感信息
     *
     * 查询镜像的敏感信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSensitiveRequest 请求对象
     * @return ListImageSensitiveResponse
     */
    public ListImageSensitiveResponse listImageSensitive(ListImageSensitiveRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageSensitive);
    }

    /**
     * 查询镜像的敏感信息
     *
     * 查询镜像的敏感信息，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSensitiveRequest 请求对象
     * @return SyncInvoker<ListImageSensitiveRequest, ListImageSensitiveResponse>
     */
    public SyncInvoker<ListImageSensitiveRequest, ListImageSensitiveResponse> listImageSensitiveInvoker(
        ListImageSensitiveRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageSensitive, hcClient);
    }

    /**
     * 查询镜像的敏感信息
     *
     * 查询镜像的敏感信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSensitiveInfoRequest 请求对象
     * @return ListImageSensitiveInfoResponse
     */
    public ListImageSensitiveInfoResponse listImageSensitiveInfo(ListImageSensitiveInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageSensitiveInfo);
    }

    /**
     * 查询镜像的敏感信息
     *
     * 查询镜像的敏感信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageSensitiveInfoRequest 请求对象
     * @return SyncInvoker<ListImageSensitiveInfoRequest, ListImageSensitiveInfoResponse>
     */
    public SyncInvoker<ListImageSensitiveInfoRequest, ListImageSensitiveInfoResponse> listImageSensitiveInfoInvoker(
        ListImageSensitiveInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageSensitiveInfo, hcClient);
    }

    /**
     * 查询镜像的漏洞信息
     *
     * 查询镜像的漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageVulnerabilitiesRequest 请求对象
     * @return ListImageVulnerabilitiesResponse
     */
    public ListImageVulnerabilitiesResponse listImageVulnerabilities(ListImageVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageVulnerabilities);
    }

    /**
     * 查询镜像的漏洞信息
     *
     * 查询镜像的漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse>
     */
    public SyncInvoker<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> listImageVulnerabilitiesInvoker(
        ListImageVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageVulnerabilities, hcClient);
    }

    /**
     * 查镜像询弱口令检测结果列表
     *
     * 查询镜像弱口令检测结果列表，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWeakPwdUsersRequest 请求对象
     * @return ListImageWeakPwdUsersResponse
     */
    public ListImageWeakPwdUsersResponse listImageWeakPwdUsers(ListImageWeakPwdUsersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageWeakPwdUsers);
    }

    /**
     * 查镜像询弱口令检测结果列表
     *
     * 查询镜像弱口令检测结果列表，若镜像类型为cicd镜像，则需传参镜像类型和镜像id唯一确定一条cicd镜像信息；若镜像类型为其他镜像仓类型，需要传参镜像类型、组织名称、镜像名称、镜像版本名称唯一确定一条其他镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWeakPwdUsersRequest 请求对象
     * @return SyncInvoker<ListImageWeakPwdUsersRequest, ListImageWeakPwdUsersResponse>
     */
    public SyncInvoker<ListImageWeakPwdUsersRequest, ListImageWeakPwdUsersResponse> listImageWeakPwdUsersInvoker(
        ListImageWeakPwdUsersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageWeakPwdUsers, hcClient);
    }

    /**
     * 查询镜像白名单列表
     *
     * 查询镜像白名单列表，目前仅支持漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWhiteListsRequest 请求对象
     * @return ListImageWhiteListsResponse
     */
    public ListImageWhiteListsResponse listImageWhiteLists(ListImageWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageWhiteLists);
    }

    /**
     * 查询镜像白名单列表
     *
     * 查询镜像白名单列表，目前仅支持漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageWhiteListsRequest 请求对象
     * @return SyncInvoker<ListImageWhiteListsRequest, ListImageWhiteListsResponse>
     */
    public SyncInvoker<ListImageWhiteListsRequest, ListImageWhiteListsResponse> listImageWhiteListsInvoker(
        ListImageWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageWhiteLists, hcClient);
    }

    /**
     * 查询本地镜像的软件信息
     *
     * 查询本地镜像的软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageAppInfoRequest 请求对象
     * @return ListLocalImageAppInfoResponse
     */
    public ListLocalImageAppInfoResponse listLocalImageAppInfo(ListLocalImageAppInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLocalImageAppInfo);
    }

    /**
     * 查询本地镜像的软件信息
     *
     * 查询本地镜像的软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageAppInfoRequest 请求对象
     * @return SyncInvoker<ListLocalImageAppInfoRequest, ListLocalImageAppInfoResponse>
     */
    public SyncInvoker<ListLocalImageAppInfoRequest, ListLocalImageAppInfoResponse> listLocalImageAppInfoInvoker(
        ListLocalImageAppInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLocalImageAppInfo, hcClient);
    }

    /**
     * 查询本地镜像的容器信息
     *
     * 查询本地镜像的容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageContainersRequest 请求对象
     * @return ListLocalImageContainersResponse
     */
    public ListLocalImageContainersResponse listLocalImageContainers(ListLocalImageContainersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLocalImageContainers);
    }

    /**
     * 查询本地镜像的容器信息
     *
     * 查询本地镜像的容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageContainersRequest 请求对象
     * @return SyncInvoker<ListLocalImageContainersRequest, ListLocalImageContainersResponse>
     */
    public SyncInvoker<ListLocalImageContainersRequest, ListLocalImageContainersResponse> listLocalImageContainersInvoker(
        ListLocalImageContainersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLocalImageContainers, hcClient);
    }

    /**
     * 查询本地镜像的主机信息
     *
     * 查询本地镜像的主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageHostsRequest 请求对象
     * @return ListLocalImageHostsResponse
     */
    public ListLocalImageHostsResponse listLocalImageHosts(ListLocalImageHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLocalImageHosts);
    }

    /**
     * 查询本地镜像的主机信息
     *
     * 查询本地镜像的主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLocalImageHostsRequest 请求对象
     * @return SyncInvoker<ListLocalImageHostsRequest, ListLocalImageHostsResponse>
     */
    public SyncInvoker<ListLocalImageHostsRequest, ListLocalImageHostsResponse> listLocalImageHostsInvoker(
        ListLocalImageHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLocalImageHosts, hcClient);
    }

    /**
     * 查询swr镜像仓库镜像列表-接口已废弃，不再推荐使用
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwrImageRepositoryRequest 请求对象
     * @return ListSwrImageRepositoryResponse
     */
    public ListSwrImageRepositoryResponse listSwrImageRepository(ListSwrImageRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSwrImageRepository);
    }

    /**
     * 查询swr镜像仓库镜像列表-接口已废弃，不再推荐使用
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSwrImageRepositoryRequest 请求对象
     * @return SyncInvoker<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse>
     */
    public SyncInvoker<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> listSwrImageRepositoryInvoker(
        ListSwrImageRepositoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSwrImageRepository, hcClient);
    }

    /**
     * 查看受漏洞影响镜像的软件信息
     *
     * 查看受漏洞影响镜像的软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageAppsRequest 请求对象
     * @return ListVulAffectImageAppsResponse
     */
    public ListVulAffectImageAppsResponse listVulAffectImageApps(ListVulAffectImageAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulAffectImageApps);
    }

    /**
     * 查看受漏洞影响镜像的软件信息
     *
     * 查看受漏洞影响镜像的软件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageAppsRequest 请求对象
     * @return SyncInvoker<ListVulAffectImageAppsRequest, ListVulAffectImageAppsResponse>
     */
    public SyncInvoker<ListVulAffectImageAppsRequest, ListVulAffectImageAppsResponse> listVulAffectImageAppsInvoker(
        ListVulAffectImageAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulAffectImageApps, hcClient);
    }

    /**
     * 查看受漏洞影响镜像的关联容器信息
     *
     * 查看受漏洞影响镜像的关联容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageContainersRequest 请求对象
     * @return ListVulAffectImageContainersResponse
     */
    public ListVulAffectImageContainersResponse listVulAffectImageContainers(
        ListVulAffectImageContainersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulAffectImageContainers);
    }

    /**
     * 查看受漏洞影响镜像的关联容器信息
     *
     * 查看受漏洞影响镜像的关联容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImageContainersRequest 请求对象
     * @return SyncInvoker<ListVulAffectImageContainersRequest, ListVulAffectImageContainersResponse>
     */
    public SyncInvoker<ListVulAffectImageContainersRequest, ListVulAffectImageContainersResponse> listVulAffectImageContainersInvoker(
        ListVulAffectImageContainersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulAffectImageContainers, hcClient);
    }

    /**
     * 查看受漏洞影响的镜像列表
     *
     * 查看受漏洞影响的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImagesRequest 请求对象
     * @return ListVulAffectImagesResponse
     */
    public ListVulAffectImagesResponse listVulAffectImages(ListVulAffectImagesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulAffectImages);
    }

    /**
     * 查看受漏洞影响的镜像列表
     *
     * 查看受漏洞影响的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulAffectImagesRequest 请求对象
     * @return SyncInvoker<ListVulAffectImagesRequest, ListVulAffectImagesResponse>
     */
    public SyncInvoker<ListVulAffectImagesRequest, ListVulAffectImagesResponse> listVulAffectImagesInvoker(
        ListVulAffectImagesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulAffectImages, hcClient);
    }

    /**
     * 漏洞影响的镜像信息
     *
     * 查询单个漏洞影响的镜像仓库中的镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepoImageRequest 请求对象
     * @return ListVulRepoImageResponse
     */
    public ListVulRepoImageResponse listVulRepoImage(ListVulRepoImageRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulRepoImage);
    }

    /**
     * 漏洞影响的镜像信息
     *
     * 查询单个漏洞影响的镜像仓库中的镜像信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepoImageRequest 请求对象
     * @return SyncInvoker<ListVulRepoImageRequest, ListVulRepoImageResponse>
     */
    public SyncInvoker<ListVulRepoImageRequest, ListVulRepoImageResponse> listVulRepoImageInvoker(
        ListVulRepoImageRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulRepoImage, hcClient);
    }

    /**
     * 漏洞对应cve信息
     *
     * 漏洞对应cve信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilityCveRequest 请求对象
     * @return ListVulnerabilityCveResponse
     */
    public ListVulnerabilityCveResponse listVulnerabilityCve(ListVulnerabilityCveRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulnerabilityCve);
    }

    /**
     * 漏洞对应cve信息
     *
     * 漏洞对应cve信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilityCveRequest 请求对象
     * @return SyncInvoker<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse>
     */
    public SyncInvoker<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> listVulnerabilityCveInvoker(
        ListVulnerabilityCveRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulnerabilityCve, hcClient);
    }

    /**
     * 从SWR服务同步镜像列表--接口已废弃
     *
     * 从SWR服务同步镜像列表--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunImageSynchronizeRequest 请求对象
     * @return RunImageSynchronizeResponse
     */
    public RunImageSynchronizeResponse runImageSynchronize(RunImageSynchronizeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.runImageSynchronize);
    }

    /**
     * 从SWR服务同步镜像列表--接口已废弃
     *
     * 从SWR服务同步镜像列表--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunImageSynchronizeRequest 请求对象
     * @return SyncInvoker<RunImageSynchronizeRequest, RunImageSynchronizeResponse>
     */
    public SyncInvoker<RunImageSynchronizeRequest, RunImageSynchronizeResponse> runImageSynchronizeInvoker(
        RunImageSynchronizeRequest request) {
        return new SyncInvoker<>(request, HssMeta.runImageSynchronize, hcClient);
    }

    /**
     * 查询镜像的自定义弱口令
     *
     * 查询镜像的自定义弱口令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExtendedWeakPasswordRequest 请求对象
     * @return ShowExtendedWeakPasswordResponse
     */
    public ShowExtendedWeakPasswordResponse showExtendedWeakPassword(ShowExtendedWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showExtendedWeakPassword);
    }

    /**
     * 查询镜像的自定义弱口令
     *
     * 查询镜像的自定义弱口令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExtendedWeakPasswordRequest 请求对象
     * @return SyncInvoker<ShowExtendedWeakPasswordRequest, ShowExtendedWeakPasswordResponse>
     */
    public SyncInvoker<ShowExtendedWeakPasswordRequest, ShowExtendedWeakPasswordResponse> showExtendedWeakPasswordInvoker(
        ShowExtendedWeakPasswordRequest request) {
        return new SyncInvoker<>(request, HssMeta.showExtendedWeakPassword, hcClient);
    }

    /**
     * 查询镜像的敏感信息文件路径白名单--接口已废弃
     *
     * 查询镜像的敏感信息文件路径白名单--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFilePathWhiteDetailRequest 请求对象
     * @return ShowFilePathWhiteDetailResponse
     */
    public ShowFilePathWhiteDetailResponse showFilePathWhiteDetail(ShowFilePathWhiteDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showFilePathWhiteDetail);
    }

    /**
     * 查询镜像的敏感信息文件路径白名单--接口已废弃
     *
     * 查询镜像的敏感信息文件路径白名单--接口已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFilePathWhiteDetailRequest 请求对象
     * @return SyncInvoker<ShowFilePathWhiteDetailRequest, ShowFilePathWhiteDetailResponse>
     */
    public SyncInvoker<ShowFilePathWhiteDetailRequest, ShowFilePathWhiteDetailResponse> showFilePathWhiteDetailInvoker(
        ShowFilePathWhiteDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showFilePathWhiteDetail, hcClient);
    }

    /**
     * 查询镜像的敏感信息文件路径白名单
     *
     * 查询镜像的敏感信息文件路径白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFilePathWhiteListsRequest 请求对象
     * @return ShowFilePathWhiteListsResponse
     */
    public ShowFilePathWhiteListsResponse showFilePathWhiteLists(ShowFilePathWhiteListsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showFilePathWhiteLists);
    }

    /**
     * 查询镜像的敏感信息文件路径白名单
     *
     * 查询镜像的敏感信息文件路径白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFilePathWhiteListsRequest 请求对象
     * @return SyncInvoker<ShowFilePathWhiteListsRequest, ShowFilePathWhiteListsResponse>
     */
    public SyncInvoker<ShowFilePathWhiteListsRequest, ShowFilePathWhiteListsResponse> showFilePathWhiteListsInvoker(
        ShowFilePathWhiteListsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showFilePathWhiteLists, hcClient);
    }

    /**
     * 容器资产-镜像统计
     *
     * 容器资产-镜像统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageAssetStatisticsRequest 请求对象
     * @return ShowImageAssetStatisticsResponse
     */
    public ShowImageAssetStatisticsResponse showImageAssetStatistics(ShowImageAssetStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageAssetStatistics);
    }

    /**
     * 容器资产-镜像统计
     *
     * 容器资产-镜像统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageAssetStatisticsRequest 请求对象
     * @return SyncInvoker<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse>
     */
    public SyncInvoker<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse> showImageAssetStatisticsInvoker(
        ShowImageAssetStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageAssetStatistics, hcClient);
    }

    /**
     * 查询基线检查的统计数据信息
     *
     * 查询基线检查的统计数据信息，包括弱口令，口令复杂度，配置检测，若查询单个cicd镜像的统计数据，需要传参image_type和image_id；若要查询单个仓库镜像的统计数据，需要传参image_type、组织名称、镜像名称和镜像版本名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBaselineStatisticRequest 请求对象
     * @return ShowImageBaselineStatisticResponse
     */
    public ShowImageBaselineStatisticResponse showImageBaselineStatistic(ShowImageBaselineStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageBaselineStatistic);
    }

    /**
     * 查询基线检查的统计数据信息
     *
     * 查询基线检查的统计数据信息，包括弱口令，口令复杂度，配置检测，若查询单个cicd镜像的统计数据，需要传参image_type和image_id；若要查询单个仓库镜像的统计数据，需要传参image_type、组织名称、镜像名称和镜像版本名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBaselineStatisticRequest 请求对象
     * @return SyncInvoker<ShowImageBaselineStatisticRequest, ShowImageBaselineStatisticResponse>
     */
    public SyncInvoker<ShowImageBaselineStatisticRequest, ShowImageBaselineStatisticResponse> showImageBaselineStatisticInvoker(
        ShowImageBaselineStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageBaselineStatistic, hcClient);
    }

    /**
     * 查询镜像配置检查项检测报告
     *
     * 查询镜像配置检查项检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCheckRuleDetailRequest 请求对象
     * @return ShowImageCheckRuleDetailResponse
     */
    public ShowImageCheckRuleDetailResponse showImageCheckRuleDetail(ShowImageCheckRuleDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageCheckRuleDetail);
    }

    /**
     * 查询镜像配置检查项检测报告
     *
     * 查询镜像配置检查项检测报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageCheckRuleDetailRequest 请求对象
     * @return SyncInvoker<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse>
     */
    public SyncInvoker<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> showImageCheckRuleDetailInvoker(
        ShowImageCheckRuleDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageCheckRuleDetail, hcClient);
    }

    /**
     * 查询镜像文件统计信息
     *
     * 查询镜像文件统计信息，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageFilesStatRequest 请求对象
     * @return ShowImageFilesStatResponse
     */
    public ShowImageFilesStatResponse showImageFilesStat(ShowImageFilesStatRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageFilesStat);
    }

    /**
     * 查询镜像文件统计信息
     *
     * 查询镜像文件统计信息，若镜像为cicd镜像，只需传参image_id,无需关注组织名称，镜像名称和镜像版本名称；若镜像类型为其他镜像类型，组织名称，镜像名称和镜像版本名称必填。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageFilesStatRequest 请求对象
     * @return SyncInvoker<ShowImageFilesStatRequest, ShowImageFilesStatResponse>
     */
    public SyncInvoker<ShowImageFilesStatRequest, ShowImageFilesStatResponse> showImageFilesStatInvoker(
        ShowImageFilesStatRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageFilesStat, hcClient);
    }

    /**
     * 镜像安全报告导出统计
     *
     * 镜像安全报告导出统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageSecurityReportStatisticRequest 请求对象
     * @return ShowImageSecurityReportStatisticResponse
     */
    public ShowImageSecurityReportStatisticResponse showImageSecurityReportStatistic(
        ShowImageSecurityReportStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageSecurityReportStatistic);
    }

    /**
     * 镜像安全报告导出统计
     *
     * 镜像安全报告导出统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageSecurityReportStatisticRequest 请求对象
     * @return SyncInvoker<ShowImageSecurityReportStatisticRequest, ShowImageSecurityReportStatisticResponse>
     */
    public SyncInvoker<ShowImageSecurityReportStatisticRequest, ShowImageSecurityReportStatisticResponse> showImageSecurityReportStatisticInvoker(
        ShowImageSecurityReportStatisticRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageSecurityReportStatistic, hcClient);
    }

    /**
     * 查询镜像白名单详情
     *
     * 查询镜像白名单详情，需要分页查询白名单关联的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWhiteListDetailRequest 请求对象
     * @return ShowImageWhiteListDetailResponse
     */
    public ShowImageWhiteListDetailResponse showImageWhiteListDetail(ShowImageWhiteListDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImageWhiteListDetail);
    }

    /**
     * 查询镜像白名单详情
     *
     * 查询镜像白名单详情，需要分页查询白名单关联的镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageWhiteListDetailRequest 请求对象
     * @return SyncInvoker<ShowImageWhiteListDetailRequest, ShowImageWhiteListDetailResponse>
     */
    public SyncInvoker<ShowImageWhiteListDetailRequest, ShowImageWhiteListDetailResponse> showImageWhiteListDetailInvoker(
        ShowImageWhiteListDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImageWhiteListDetail, hcClient);
    }

    /**
     * 创建扫描任务
     *
     * 创建扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageScanTaskRequest 请求对象
     * @return CreateManualImageScanTaskResponse
     */
    public CreateManualImageScanTaskResponse createManualImageScanTask(CreateManualImageScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createManualImageScanTask);
    }

    /**
     * 创建扫描任务
     *
     * 创建扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualImageScanTaskRequest 请求对象
     * @return SyncInvoker<CreateManualImageScanTaskRequest, CreateManualImageScanTaskResponse>
     */
    public SyncInvoker<CreateManualImageScanTaskRequest, CreateManualImageScanTaskResponse> createManualImageScanTaskInvoker(
        CreateManualImageScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createManualImageScanTask, hcClient);
    }

    /**
     * 获取扫描策略
     *
     * 获取扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanPolicyRequest 请求对象
     * @return ListImageScanPolicyResponse
     */
    public ListImageScanPolicyResponse listImageScanPolicy(ListImageScanPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageScanPolicy);
    }

    /**
     * 获取扫描策略
     *
     * 获取扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanPolicyRequest 请求对象
     * @return SyncInvoker<ListImageScanPolicyRequest, ListImageScanPolicyResponse>
     */
    public SyncInvoker<ListImageScanPolicyRequest, ListImageScanPolicyResponse> listImageScanPolicyInvoker(
        ListImageScanPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageScanPolicy, hcClient);
    }

    /**
     * 获取扫描任务列表
     *
     * 获取扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanTaskRequest 请求对象
     * @return ListImageScanTaskResponse
     */
    public ListImageScanTaskResponse listImageScanTask(ListImageScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listImageScanTask);
    }

    /**
     * 获取扫描任务列表
     *
     * 获取扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageScanTaskRequest 请求对象
     * @return SyncInvoker<ListImageScanTaskRequest, ListImageScanTaskResponse>
     */
    public SyncInvoker<ListImageScanTaskRequest, ListImageScanTaskResponse> listImageScanTaskInvoker(
        ListImageScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listImageScanTask, hcClient);
    }

    /**
     * 修改周期扫描策略
     *
     * 修改周期扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyImageScanPolicyRequest 请求对象
     * @return ModifyImageScanPolicyResponse
     */
    public ModifyImageScanPolicyResponse modifyImageScanPolicy(ModifyImageScanPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyImageScanPolicy);
    }

    /**
     * 修改周期扫描策略
     *
     * 修改周期扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyImageScanPolicyRequest 请求对象
     * @return SyncInvoker<ModifyImageScanPolicyRequest, ModifyImageScanPolicyResponse>
     */
    public SyncInvoker<ModifyImageScanPolicyRequest, ModifyImageScanPolicyResponse> modifyImageScanPolicyInvoker(
        ModifyImageScanPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyImageScanPolicy, hcClient);
    }

    /**
     * 查询镜像按次扫描统计数据
     *
     * 查询镜像按次扫描统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImagePayPerScanStatisticsRequest 请求对象
     * @return ShowImagePayPerScanStatisticsResponse
     */
    public ShowImagePayPerScanStatisticsResponse showImagePayPerScanStatistics(
        ShowImagePayPerScanStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showImagePayPerScanStatistics);
    }

    /**
     * 查询镜像按次扫描统计数据
     *
     * 查询镜像按次扫描统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImagePayPerScanStatisticsRequest 请求对象
     * @return SyncInvoker<ShowImagePayPerScanStatisticsRequest, ShowImagePayPerScanStatisticsResponse>
     */
    public SyncInvoker<ShowImagePayPerScanStatisticsRequest, ShowImagePayPerScanStatisticsResponse> showImagePayPerScanStatisticsInvoker(
        ShowImagePayPerScanStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showImagePayPerScanStatistics, hcClient);
    }

    /**
     * 终止仓库镜像扫描任务
     *
     * 终止仓库镜像扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopImageScanTaskRequest 请求对象
     * @return StopImageScanTaskResponse
     */
    public StopImageScanTaskResponse stopImageScanTask(StopImageScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.stopImageScanTask);
    }

    /**
     * 终止仓库镜像扫描任务
     *
     * 终止仓库镜像扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopImageScanTaskRequest 请求对象
     * @return SyncInvoker<StopImageScanTaskRequest, StopImageScanTaskResponse>
     */
    public SyncInvoker<StopImageScanTaskRequest, StopImageScanTaskResponse> stopImageScanTaskInvoker(
        StopImageScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.stopImageScanTask, hcClient);
    }

    /**
     * 修改用户的月度运营弹框状态
     *
     * 修改用户的月度运营弹框状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMonthlyOperationReportTipStatusRequest 请求对象
     * @return ChangeMonthlyOperationReportTipStatusResponse
     */
    public ChangeMonthlyOperationReportTipStatusResponse changeMonthlyOperationReportTipStatus(
        ChangeMonthlyOperationReportTipStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeMonthlyOperationReportTipStatus);
    }

    /**
     * 修改用户的月度运营弹框状态
     *
     * 修改用户的月度运营弹框状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMonthlyOperationReportTipStatusRequest 请求对象
     * @return SyncInvoker<ChangeMonthlyOperationReportTipStatusRequest, ChangeMonthlyOperationReportTipStatusResponse>
     */
    public SyncInvoker<ChangeMonthlyOperationReportTipStatusRequest, ChangeMonthlyOperationReportTipStatusResponse> changeMonthlyOperationReportTipStatusInvoker(
        ChangeMonthlyOperationReportTipStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeMonthlyOperationReportTipStatus, hcClient);
    }

    /**
     * 月度运营总结报告导出
     *
     * 月度运营总结报告导出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTaskInfoRequest 请求对象
     * @return ExportTaskInfoResponse
     */
    public ExportTaskInfoResponse exportTaskInfo(ExportTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportTaskInfo);
    }

    /**
     * 月度运营总结报告导出
     *
     * 月度运营总结报告导出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTaskInfoRequest 请求对象
     * @return SyncInvoker<ExportTaskInfoRequest, ExportTaskInfoResponse>
     */
    public SyncInvoker<ExportTaskInfoRequest, ExportTaskInfoResponse> exportTaskInfoInvoker(
        ExportTaskInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportTaskInfo, hcClient);
    }

    /**
     * 查询月度运营报告列表
     *
     * 查询月度运营报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonthlyOperationReportsRequest 请求对象
     * @return ListMonthlyOperationReportsResponse
     */
    public ListMonthlyOperationReportsResponse listMonthlyOperationReports(ListMonthlyOperationReportsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listMonthlyOperationReports);
    }

    /**
     * 查询月度运营报告列表
     *
     * 查询月度运营报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonthlyOperationReportsRequest 请求对象
     * @return SyncInvoker<ListMonthlyOperationReportsRequest, ListMonthlyOperationReportsResponse>
     */
    public SyncInvoker<ListMonthlyOperationReportsRequest, ListMonthlyOperationReportsResponse> listMonthlyOperationReportsInvoker(
        ListMonthlyOperationReportsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listMonthlyOperationReports, hcClient);
    }

    /**
     * 查询安全风险列表
     *
     * 查询安全风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRiskRequest 请求对象
     * @return ListSecurityRiskResponse
     */
    public ListSecurityRiskResponse listSecurityRisk(ListSecurityRiskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityRisk);
    }

    /**
     * 查询安全风险列表
     *
     * 查询安全风险列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityRiskRequest 请求对象
     * @return SyncInvoker<ListSecurityRiskRequest, ListSecurityRiskResponse>
     */
    public SyncInvoker<ListSecurityRiskRequest, ListSecurityRiskResponse> listSecurityRiskInvoker(
        ListSecurityRiskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityRisk, hcClient);
    }

    /**
     * 查询agent统计数量
     *
     * 查询待升级agent数，在线/离线agent数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsRequest 请求对象
     * @return ShowAgentStatisticsResponse
     */
    public ShowAgentStatisticsResponse showAgentStatistics(ShowAgentStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showAgentStatistics);
    }

    /**
     * 查询agent统计数量
     *
     * 查询待升级agent数，在线/离线agent数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentStatisticsRequest 请求对象
     * @return SyncInvoker<ShowAgentStatisticsRequest, ShowAgentStatisticsResponse>
     */
    public SyncInvoker<ShowAgentStatisticsRequest, ShowAgentStatisticsResponse> showAgentStatisticsInvoker(
        ShowAgentStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showAgentStatistics, hcClient);
    }

    /**
     * 热点资讯
     *
     * 返回标题，更新时间，资讯级别。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotInformationRequest 请求对象
     * @return ShowHotInformationResponse
     */
    public ShowHotInformationResponse showHotInformation(ShowHotInformationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showHotInformation);
    }

    /**
     * 热点资讯
     *
     * 返回标题，更新时间，资讯级别。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotInformationRequest 请求对象
     * @return SyncInvoker<ShowHotInformationRequest, ShowHotInformationResponse>
     */
    public SyncInvoker<ShowHotInformationRequest, ShowHotInformationResponse> showHotInformationInvoker(
        ShowHotInformationRequest request) {
        return new SyncInvoker<>(request, HssMeta.showHotInformation, hcClient);
    }

    /**
     * 查询用户的月度运营弹框状态
     *
     * 查询用户的月度运营弹框状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperaReportNotifyInfoRequest 请求对象
     * @return ShowMonthlyOperaReportNotifyInfoResponse
     */
    public ShowMonthlyOperaReportNotifyInfoResponse showMonthlyOperaReportNotifyInfo(
        ShowMonthlyOperaReportNotifyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMonthlyOperaReportNotifyInfo);
    }

    /**
     * 查询用户的月度运营弹框状态
     *
     * 查询用户的月度运营弹框状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperaReportNotifyInfoRequest 请求对象
     * @return SyncInvoker<ShowMonthlyOperaReportNotifyInfoRequest, ShowMonthlyOperaReportNotifyInfoResponse>
     */
    public SyncInvoker<ShowMonthlyOperaReportNotifyInfoRequest, ShowMonthlyOperaReportNotifyInfoResponse> showMonthlyOperaReportNotifyInfoInvoker(
        ShowMonthlyOperaReportNotifyInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMonthlyOperaReportNotifyInfo, hcClient);
    }

    /**
     * 查询某月月度运营报告的详细信息
     *
     * 查询某月月度运营报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperationReportDetailRequest 请求对象
     * @return ShowMonthlyOperationReportDetailResponse
     */
    public ShowMonthlyOperationReportDetailResponse showMonthlyOperationReportDetail(
        ShowMonthlyOperationReportDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showMonthlyOperationReportDetail);
    }

    /**
     * 查询某月月度运营报告的详细信息
     *
     * 查询某月月度运营报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonthlyOperationReportDetailRequest 请求对象
     * @return SyncInvoker<ShowMonthlyOperationReportDetailRequest, ShowMonthlyOperationReportDetailResponse>
     */
    public SyncInvoker<ShowMonthlyOperationReportDetailRequest, ShowMonthlyOperationReportDetailResponse> showMonthlyOperationReportDetailInvoker(
        ShowMonthlyOperationReportDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showMonthlyOperationReportDetail, hcClient);
    }

    /**
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     *
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectStatisticsRequest 请求对象
     * @return ShowProtectStatisticsResponse
     */
    public ShowProtectStatisticsResponse showProtectStatistics(ShowProtectStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showProtectStatistics);
    }

    /**
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数
     *
     * 查询守护天数，病毒库更新时间，漏洞库更新时间，各模块累计次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectStatisticsRequest 请求对象
     * @return SyncInvoker<ShowProtectStatisticsRequest, ShowProtectStatisticsResponse>
     */
    public SyncInvoker<ShowProtectStatisticsRequest, ShowProtectStatisticsResponse> showProtectStatisticsInvoker(
        ShowProtectStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showProtectStatistics, hcClient);
    }

    /**
     * 查询风险评分结果
     *
     * 查询风险评分结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskScoreRequest 请求对象
     * @return ShowRiskScoreResponse
     */
    public ShowRiskScoreResponse showRiskScore(ShowRiskScoreRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRiskScore);
    }

    /**
     * 查询风险评分结果
     *
     * 查询风险评分结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRiskScoreRequest 请求对象
     * @return SyncInvoker<ShowRiskScoreRequest, ShowRiskScoreResponse>
     */
    public SyncInvoker<ShowRiskScoreRequest, ShowRiskScoreResponse> showRiskScoreInvoker(ShowRiskScoreRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRiskScore, hcClient);
    }

    /**
     * 查询月度运营报告福利区公共信息
     *
     * 查询月度运营报告福利区公共信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelfareAreaInfoRequest 请求对象
     * @return ShowWelfareAreaInfoResponse
     */
    public ShowWelfareAreaInfoResponse showWelfareAreaInfo(ShowWelfareAreaInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWelfareAreaInfo);
    }

    /**
     * 查询月度运营报告福利区公共信息
     *
     * 查询月度运营报告福利区公共信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelfareAreaInfoRequest 请求对象
     * @return SyncInvoker<ShowWelfareAreaInfoRequest, ShowWelfareAreaInfoResponse>
     */
    public SyncInvoker<ShowWelfareAreaInfoRequest, ShowWelfareAreaInfoResponse> showWelfareAreaInfoInvoker(
        ShowWelfareAreaInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWelfareAreaInfo, hcClient);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInfoRequest 请求对象
     * @return ListPluginInfoResponse
     */
    public ListPluginInfoResponse listPluginInfo(ListPluginInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPluginInfo);
    }

    /**
     * 查询插件详情
     *
     * 查询插件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInfoRequest 请求对象
     * @return SyncInvoker<ListPluginInfoRequest, ListPluginInfoResponse>
     */
    public SyncInvoker<ListPluginInfoRequest, ListPluginInfoResponse> listPluginInfoInvoker(
        ListPluginInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPluginInfo, hcClient);
    }

    /**
     * 查询插件应用列表
     *
     * 查询插件应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginStatusRequest 请求对象
     * @return ListPluginStatusResponse
     */
    public ListPluginStatusResponse listPluginStatus(ListPluginStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPluginStatus);
    }

    /**
     * 查询插件应用列表
     *
     * 查询插件应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginStatusRequest 请求对象
     * @return SyncInvoker<ListPluginStatusRequest, ListPluginStatusResponse>
     */
    public SyncInvoker<ListPluginStatusRequest, ListPluginStatusResponse> listPluginStatusInvoker(
        ListPluginStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPluginStatus, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginsRequest 请求对象
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPlugins, hcClient);
    }

    /**
     * 启动插件
     *
     * 启动插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPluginRequest 请求对象
     * @return StartPluginResponse
     */
    public StartPluginResponse startPlugin(StartPluginRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.startPlugin);
    }

    /**
     * 启动插件
     *
     * 启动插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPluginRequest 请求对象
     * @return SyncInvoker<StartPluginRequest, StartPluginResponse>
     */
    public SyncInvoker<StartPluginRequest, StartPluginResponse> startPluginInvoker(StartPluginRequest request) {
        return new SyncInvoker<>(request, HssMeta.startPlugin, hcClient);
    }

    /**
     * 停止插件
     *
     * 停止插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPluginRequest 请求对象
     * @return StopPluginResponse
     */
    public StopPluginResponse stopPlugin(StopPluginRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.stopPlugin);
    }

    /**
     * 停止插件
     *
     * 停止插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopPluginRequest 请求对象
     * @return SyncInvoker<StopPluginRequest, StopPluginResponse>
     */
    public SyncInvoker<StopPluginRequest, StopPluginResponse> stopPluginInvoker(StopPluginRequest request) {
        return new SyncInvoker<>(request, HssMeta.stopPlugin, hcClient);
    }

    /**
     * 复制策略组
     *
     * 复制策略组，选择已有的旗舰版或容器版策略组，复制生成新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyGroupRequest 请求对象
     * @return AddPolicyGroupResponse
     */
    public AddPolicyGroupResponse addPolicyGroup(AddPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addPolicyGroup);
    }

    /**
     * 复制策略组
     *
     * 复制策略组，选择已有的旗舰版或容器版策略组，复制生成新的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyGroupRequest 请求对象
     * @return SyncInvoker<AddPolicyGroupRequest, AddPolicyGroupResponse>
     */
    public SyncInvoker<AddPolicyGroupRequest, AddPolicyGroupResponse> addPolicyGroupInvoker(
        AddPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.addPolicyGroup, hcClient);
    }

    /**
     * 部署策略组
     *
     * 为已经开启旗舰版或容器版防护的服务器部署策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePolicyGroupRequest 请求对象
     * @return AssociatePolicyGroupResponse
     */
    public AssociatePolicyGroupResponse associatePolicyGroup(AssociatePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associatePolicyGroup);
    }

    /**
     * 部署策略组
     *
     * 为已经开启旗舰版或容器版防护的服务器部署策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociatePolicyGroupRequest 请求对象
     * @return SyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse>
     */
    public SyncInvoker<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroupInvoker(
        AssociatePolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.associatePolicyGroup, hcClient);
    }

    /**
     * 修改策略组相关内容
     *
     * 修改策略组相关内容，如防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicyGroupRequest 请求对象
     * @return ChangePolicyGroupResponse
     */
    public ChangePolicyGroupResponse changePolicyGroup(ChangePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changePolicyGroup);
    }

    /**
     * 修改策略组相关内容
     *
     * 修改策略组相关内容，如防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicyGroupRequest 请求对象
     * @return SyncInvoker<ChangePolicyGroupRequest, ChangePolicyGroupResponse>
     */
    public SyncInvoker<ChangePolicyGroupRequest, ChangePolicyGroupResponse> changePolicyGroupInvoker(
        ChangePolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.changePolicyGroup, hcClient);
    }

    /**
     * 删除策略组
     *
     * 删除策略组，支持删除非默认并且未关联服务器的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroup(DeletePolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deletePolicyGroup);
    }

    /**
     * 删除策略组
     *
     * 删除策略组，支持删除非默认并且未关联服务器的策略组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyGroupRequest 请求对象
     * @return SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse>
     */
    public SyncInvoker<DeletePolicyGroupRequest, DeletePolicyGroupResponse> deletePolicyGroupInvoker(
        DeletePolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.deletePolicyGroup, hcClient);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return ListPolicyGroupResponse
     */
    public ListPolicyGroupResponse listPolicyGroup(ListPolicyGroupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listPolicyGroup);
    }

    /**
     * 查询策略组列表
     *
     * 查询策略组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyGroupRequest 请求对象
     * @return SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse>
     */
    public SyncInvoker<ListPolicyGroupRequest, ListPolicyGroupResponse> listPolicyGroupInvoker(
        ListPolicyGroupRequest request) {
        return new SyncInvoker<>(request, HssMeta.listPolicyGroup, hcClient);
    }

    /**
     * 解绑配额
     *
     * 解绑配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHostsQuotaRequest 请求对象
     * @return CancelHostsQuotaResponse
     */
    public CancelHostsQuotaResponse cancelHostsQuota(CancelHostsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.cancelHostsQuota);
    }

    /**
     * 解绑配额
     *
     * 解绑配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHostsQuotaRequest 请求对象
     * @return SyncInvoker<CancelHostsQuotaRequest, CancelHostsQuotaResponse>
     */
    public SyncInvoker<CancelHostsQuotaRequest, CancelHostsQuotaResponse> cancelHostsQuotaInvoker(
        CancelHostsQuotaRequest request) {
        return new SyncInvoker<>(request, HssMeta.cancelHostsQuota, hcClient);
    }

    /**
     * HSS服务创建订单订购配额
     *
     * HSS服务创建订单订购配额，只支持包周期计费模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuotasOrderRequest 请求对象
     * @return CreateQuotasOrderResponse
     */
    public CreateQuotasOrderResponse createQuotasOrder(CreateQuotasOrderRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createQuotasOrder);
    }

    /**
     * HSS服务创建订单订购配额
     *
     * HSS服务创建订单订购配额，只支持包周期计费模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuotasOrderRequest 请求对象
     * @return SyncInvoker<CreateQuotasOrderRequest, CreateQuotasOrderResponse>
     */
    public SyncInvoker<CreateQuotasOrderRequest, CreateQuotasOrderResponse> createQuotasOrderInvoker(
        CreateQuotasOrderRequest request) {
        return new SyncInvoker<>(request, HssMeta.createQuotasOrder, hcClient);
    }

    /**
     * 查询资源的锁定状态
     *
     * 按需计费的防护配额转包年/包月过程中，会将防护配额锁定，已锁定的防护配额不支持转包年/包月，通过该接口可查询主机安全防护配额的锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockedStatusRequest 请求对象
     * @return ListLockedStatusResponse
     */
    public ListLockedStatusResponse listLockedStatus(ListLockedStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLockedStatus);
    }

    /**
     * 查询资源的锁定状态
     *
     * 按需计费的防护配额转包年/包月过程中，会将防护配额锁定，已锁定的防护配额不支持转包年/包月，通过该接口可查询主机安全防护配额的锁定状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockedStatusRequest 请求对象
     * @return SyncInvoker<ListLockedStatusRequest, ListLockedStatusResponse>
     */
    public SyncInvoker<ListLockedStatusRequest, ListLockedStatusResponse> listLockedStatusInvoker(
        ListLockedStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLockedStatus, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasDetailRequest 请求对象
     * @return ListQuotasDetailResponse
     */
    public ListQuotasDetailResponse listQuotasDetail(ListQuotasDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listQuotasDetail);
    }

    /**
     * 查询配额详情
     *
     * 查询配额详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasDetailRequest 请求对象
     * @return SyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse>
     */
    public SyncInvoker<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetailInvoker(
        ListQuotasDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.listQuotasDetail, hcClient);
    }

    /**
     * 批量查询配额ID信息
     *
     * 批量查询配额ID信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceIdsRequest 请求对象
     * @return ListResourceIdsResponse
     */
    public ListResourceIdsResponse listResourceIds(ListResourceIdsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listResourceIds);
    }

    /**
     * 批量查询配额ID信息
     *
     * 批量查询配额ID信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceIdsRequest 请求对象
     * @return SyncInvoker<ListResourceIdsRequest, ListResourceIdsResponse>
     */
    public SyncInvoker<ListResourceIdsRequest, ListResourceIdsResponse> listResourceIdsInvoker(
        ListResourceIdsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listResourceIds, hcClient);
    }

    /**
     * 查询产商品信息
     *
     * 查询产商品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductdataOfferingInfosRequest 请求对象
     * @return ShowProductdataOfferingInfosResponse
     */
    public ShowProductdataOfferingInfosResponse showProductdataOfferingInfos(
        ShowProductdataOfferingInfosRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showProductdataOfferingInfos);
    }

    /**
     * 查询产商品信息
     *
     * 查询产商品信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductdataOfferingInfosRequest 请求对象
     * @return SyncInvoker<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse>
     */
    public SyncInvoker<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> showProductdataOfferingInfosInvoker(
        ShowProductdataOfferingInfosRequest request) {
        return new SyncInvoker<>(request, HssMeta.showProductdataOfferingInfos, hcClient);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotasRequest 请求对象
     * @return ShowResourceQuotasResponse
     */
    public ShowResourceQuotasResponse showResourceQuotas(ShowResourceQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showResourceQuotas);
    }

    /**
     * 查询配额信息
     *
     * 查询配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceQuotasRequest 请求对象
     * @return SyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse>
     */
    public SyncInvoker<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotasInvoker(
        ShowResourceQuotasRequest request) {
        return new SyncInvoker<>(request, HssMeta.showResourceQuotas, hcClient);
    }

    /**
     * 查询客户使用的最高版本
     *
     * 查询客户使用的最高版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVersion);
    }

    /**
     * 查询客户使用的最高版本
     *
     * 查询客户使用的最高版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVersion, hcClient);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectionPolicyRequest 请求对象
     * @return AddProtectionPolicyResponse
     */
    public AddProtectionPolicyResponse addProtectionPolicy(AddProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addProtectionPolicy);
    }

    /**
     * 添加防护策略
     *
     * 添加防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectionPolicyRequest 请求对象
     * @return SyncInvoker<AddProtectionPolicyRequest, AddProtectionPolicyResponse>
     */
    public SyncInvoker<AddProtectionPolicyRequest, AddProtectionPolicyResponse> addProtectionPolicyInvoker(
        AddProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.addProtectionPolicy, hcClient);
    }

    /**
     * 存储库绑定备份策略
     *
     * 存储库绑定备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBackupPolicyRequest 请求对象
     * @return AssociateBackupPolicyResponse
     */
    public AssociateBackupPolicyResponse associateBackupPolicy(AssociateBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associateBackupPolicy);
    }

    /**
     * 存储库绑定备份策略
     *
     * 存储库绑定备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateBackupPolicyRequest 请求对象
     * @return SyncInvoker<AssociateBackupPolicyRequest, AssociateBackupPolicyResponse>
     */
    public SyncInvoker<AssociateBackupPolicyRequest, AssociateBackupPolicyResponse> associateBackupPolicyInvoker(
        AssociateBackupPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.associateBackupPolicy, hcClient);
    }

    /**
     * 切换勒索防护策略
     *
     * 切换勒索防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateProtectionPolicyRequest 请求对象
     * @return AssociateProtectionPolicyResponse
     */
    public AssociateProtectionPolicyResponse associateProtectionPolicy(AssociateProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.associateProtectionPolicy);
    }

    /**
     * 切换勒索防护策略
     *
     * 切换勒索防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateProtectionPolicyRequest 请求对象
     * @return SyncInvoker<AssociateProtectionPolicyRequest, AssociateProtectionPolicyResponse>
     */
    public SyncInvoker<AssociateProtectionPolicyRequest, AssociateProtectionPolicyResponse> associateProtectionPolicyInvoker(
        AssociateProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.associateProtectionPolicy, hcClient);
    }

    /**
     * 批量开启勒索病毒防护2.0
     *
     * 批量开启勒索病毒防护，若开启备份防护，请保证该region有cbr云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartProtectionRequest 请求对象
     * @return BatchStartProtectionResponse
     */
    public BatchStartProtectionResponse batchStartProtection(BatchStartProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchStartProtection);
    }

    /**
     * 批量开启勒索病毒防护2.0
     *
     * 批量开启勒索病毒防护，若开启备份防护，请保证该region有cbr云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartProtectionRequest 请求对象
     * @return SyncInvoker<BatchStartProtectionRequest, BatchStartProtectionResponse>
     */
    public SyncInvoker<BatchStartProtectionRequest, BatchStartProtectionResponse> batchStartProtectionInvoker(
        BatchStartProtectionRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchStartProtection, hcClient);
    }

    /**
     * 删除备份副本
     *
     * 删除备份副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDuplicationInfoRequest 请求对象
     * @return DeleteDuplicationInfoResponse
     */
    public DeleteDuplicationInfoResponse deleteDuplicationInfo(DeleteDuplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteDuplicationInfo);
    }

    /**
     * 删除备份副本
     *
     * 删除备份副本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDuplicationInfoRequest 请求对象
     * @return SyncInvoker<DeleteDuplicationInfoRequest, DeleteDuplicationInfoResponse>
     */
    public SyncInvoker<DeleteDuplicationInfoRequest, DeleteDuplicationInfoResponse> deleteDuplicationInfoInvoker(
        DeleteDuplicationInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteDuplicationInfo, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionPolicyRequest 请求对象
     * @return DeleteProtectionPolicyResponse
     */
    public DeleteProtectionPolicyResponse deleteProtectionPolicy(DeleteProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteProtectionPolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectionPolicyRequest 请求对象
     * @return SyncInvoker<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse>
     */
    public SyncInvoker<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse> deleteProtectionPolicyInvoker(
        DeleteProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteProtectionPolicy, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackedupByHostIdRequest 请求对象
     * @return ListBackedupByHostIdResponse
     */
    public ListBackedupByHostIdResponse listBackedupByHostId(ListBackedupByHostIdRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBackedupByHostId);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackedupByHostIdRequest 请求对象
     * @return SyncInvoker<ListBackedupByHostIdRequest, ListBackedupByHostIdResponse>
     */
    public SyncInvoker<ListBackedupByHostIdRequest, ListBackedupByHostIdResponse> listBackedupByHostIdInvoker(
        ListBackedupByHostIdRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBackedupByHostId, hcClient);
    }

    /**
     * 查询备份策略列表
     *
     * 查询备份策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupPolicyRequest 请求对象
     * @return ListBackupPolicyResponse
     */
    public ListBackupPolicyResponse listBackupPolicy(ListBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBackupPolicy);
    }

    /**
     * 查询备份策略列表
     *
     * 查询备份策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupPolicyRequest 请求对象
     * @return SyncInvoker<ListBackupPolicyRequest, ListBackupPolicyResponse>
     */
    public SyncInvoker<ListBackupPolicyRequest, ListBackupPolicyResponse> listBackupPolicyInvoker(
        ListBackupPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBackupPolicy, hcClient);
    }

    /**
     * 查询备份存储库列表
     *
     * 查询备份存储库列表，若进行绑定主机，则需要额外判断，同时满足以下条件：1、存储库状态为“可用”状态；2、备份策略状态为“已启用”；3、存储库有剩余可用备份容量；4、存储库绑定的服务器数量少于256。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupVaultsRequest 请求对象
     * @return ListBackupVaultsResponse
     */
    public ListBackupVaultsResponse listBackupVaults(ListBackupVaultsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBackupVaults);
    }

    /**
     * 查询备份存储库列表
     *
     * 查询备份存储库列表，若进行绑定主机，则需要额外判断，同时满足以下条件：1、存储库状态为“可用”状态；2、备份策略状态为“已启用”；3、存储库有剩余可用备份容量；4、存储库绑定的服务器数量少于256。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupVaultsRequest 请求对象
     * @return SyncInvoker<ListBackupVaultsRequest, ListBackupVaultsResponse>
     */
    public SyncInvoker<ListBackupVaultsRequest, ListBackupVaultsResponse> listBackupVaultsInvoker(
        ListBackupVaultsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBackupVaults, hcClient);
    }

    /**
     * 查询备份恢复任务列表
     *
     * 查询备份恢复任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationLogsByVaultNameRequest 请求对象
     * @return ListOperationLogsByVaultNameResponse
     */
    public ListOperationLogsByVaultNameResponse listOperationLogsByVaultName(
        ListOperationLogsByVaultNameRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listOperationLogsByVaultName);
    }

    /**
     * 查询备份恢复任务列表
     *
     * 查询备份恢复任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOperationLogsByVaultNameRequest 请求对象
     * @return SyncInvoker<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse>
     */
    public SyncInvoker<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse> listOperationLogsByVaultNameInvoker(
        ListOperationLogsByVaultNameRequest request) {
        return new SyncInvoker<>(request, HssMeta.listOperationLogsByVaultName, hcClient);
    }

    /**
     * 查询勒索病毒的防护策略列表
     *
     * 查询勒索病毒的防护策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionPolicyRequest 请求对象
     * @return ListProtectionPolicyResponse
     */
    public ListProtectionPolicyResponse listProtectionPolicy(ListProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProtectionPolicy);
    }

    /**
     * 查询勒索病毒的防护策略列表
     *
     * 查询勒索病毒的防护策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionPolicyRequest 请求对象
     * @return SyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse>
     */
    public SyncInvoker<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicyInvoker(
        ListProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProtectionPolicy, hcClient);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServerRequest 请求对象
     * @return ListProtectionServerResponse
     */
    public ListProtectionServerResponse listProtectionServer(ListProtectionServerRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listProtectionServer);
    }

    /**
     * 查询勒索防护服务器列表
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectionServerRequest 请求对象
     * @return SyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse>
     */
    public SyncInvoker<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServerInvoker(
        ListProtectionServerRequest request) {
        return new SyncInvoker<>(request, HssMeta.listProtectionServer, hcClient);
    }

    /**
     * 查询勒索防护服务器列表2.0
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRansomwareProtectionNodesRequest 请求对象
     * @return ListRansomwareProtectionNodesResponse
     */
    public ListRansomwareProtectionNodesResponse listRansomwareProtectionNodes(
        ListRansomwareProtectionNodesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRansomwareProtectionNodes);
    }

    /**
     * 查询勒索防护服务器列表2.0
     *
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRansomwareProtectionNodesRequest 请求对象
     * @return SyncInvoker<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse>
     */
    public SyncInvoker<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse> listRansomwareProtectionNodesInvoker(
        ListRansomwareProtectionNodesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRansomwareProtectionNodes, hcClient);
    }

    /**
     * 备份恢复
     *
     * 备份恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreDuplicationInfoRequest 请求对象
     * @return RestoreDuplicationInfoResponse
     */
    public RestoreDuplicationInfoResponse restoreDuplicationInfo(RestoreDuplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.restoreDuplicationInfo);
    }

    /**
     * 备份恢复
     *
     * 备份恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreDuplicationInfoRequest 请求对象
     * @return SyncInvoker<RestoreDuplicationInfoRequest, RestoreDuplicationInfoResponse>
     */
    public SyncInvoker<RestoreDuplicationInfoRequest, RestoreDuplicationInfoResponse> restoreDuplicationInfoInvoker(
        RestoreDuplicationInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.restoreDuplicationInfo, hcClient);
    }

    /**
     * 查询指定备份信息
     *
     * 查询指定备份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupInfoByBackupIdRequest 请求对象
     * @return ShowBackupInfoByBackupIdResponse
     */
    public ShowBackupInfoByBackupIdResponse showBackupInfoByBackupId(ShowBackupInfoByBackupIdRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBackupInfoByBackupId);
    }

    /**
     * 查询指定备份信息
     *
     * 查询指定备份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupInfoByBackupIdRequest 请求对象
     * @return SyncInvoker<ShowBackupInfoByBackupIdRequest, ShowBackupInfoByBackupIdResponse>
     */
    public SyncInvoker<ShowBackupInfoByBackupIdRequest, ShowBackupInfoByBackupIdResponse> showBackupInfoByBackupIdInvoker(
        ShowBackupInfoByBackupIdRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBackupInfoByBackupId, hcClient);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息，确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyInfoRequest 请求对象
     * @return ShowBackupPolicyInfoResponse
     */
    public ShowBackupPolicyInfoResponse showBackupPolicyInfo(ShowBackupPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showBackupPolicyInfo);
    }

    /**
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息，确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyInfoRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse>
     */
    public SyncInvoker<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfoInvoker(
        ShowBackupPolicyInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showBackupPolicyInfo, hcClient);
    }

    /**
     * 查询单个备份策略信息
     *
     * 查询单个备份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleBackupPolicyInfoRequest 请求对象
     * @return ShowSingleBackupPolicyInfoResponse
     */
    public ShowSingleBackupPolicyInfoResponse showSingleBackupPolicyInfo(ShowSingleBackupPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSingleBackupPolicyInfo);
    }

    /**
     * 查询单个备份策略信息
     *
     * 查询单个备份策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleBackupPolicyInfoRequest 请求对象
     * @return SyncInvoker<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse>
     */
    public SyncInvoker<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse> showSingleBackupPolicyInfoInvoker(
        ShowSingleBackupPolicyInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSingleBackupPolicyInfo, hcClient);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护，请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionRequest 请求对象
     * @return StartProtectionResponse
     */
    public StartProtectionResponse startProtection(StartProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.startProtection);
    }

    /**
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护，请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartProtectionRequest 请求对象
     * @return SyncInvoker<StartProtectionRequest, StartProtectionResponse>
     */
    public SyncInvoker<StartProtectionRequest, StartProtectionResponse> startProtectionInvoker(
        StartProtectionRequest request) {
        return new SyncInvoker<>(request, HssMeta.startProtection, hcClient);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionRequest 请求对象
     * @return StopProtectionResponse
     */
    public StopProtectionResponse stopProtection(StopProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.stopProtection);
    }

    /**
     * 关闭勒索病毒防护
     *
     * 关闭勒索病毒防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopProtectionRequest 请求对象
     * @return SyncInvoker<StopProtectionRequest, StopProtectionResponse>
     */
    public SyncInvoker<StopProtectionRequest, StopProtectionResponse> stopProtectionInvoker(
        StopProtectionRequest request) {
        return new SyncInvoker<>(request, HssMeta.stopProtection, hcClient);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupPolicyInfoRequest 请求对象
     * @return UpdateBackupPolicyInfoResponse
     */
    public UpdateBackupPolicyInfoResponse updateBackupPolicyInfo(UpdateBackupPolicyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateBackupPolicyInfo);
    }

    /**
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupPolicyInfoRequest 请求对象
     * @return SyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse>
     */
    public SyncInvoker<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfoInvoker(
        UpdateBackupPolicyInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateBackupPolicyInfo, hcClient);
    }

    /**
     * 修改勒索防护策略
     *
     * 修改勒索防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionPolicyRequest 请求对象
     * @return UpdateProtectionPolicyResponse
     */
    public UpdateProtectionPolicyResponse updateProtectionPolicy(UpdateProtectionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateProtectionPolicy);
    }

    /**
     * 修改勒索防护策略
     *
     * 修改勒索防护策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectionPolicyRequest 请求对象
     * @return SyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>
     */
    public SyncInvoker<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicyInvoker(
        UpdateProtectionPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateProtectionPolicy, hcClient);
    }

    /**
     * 创建同步镜像任务
     *
     * 创建同步镜像任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSynchronizeTaskRequest 请求对象
     * @return CreateImageSynchronizeTaskResponse
     */
    public CreateImageSynchronizeTaskResponse createImageSynchronizeTask(CreateImageSynchronizeTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createImageSynchronizeTask);
    }

    /**
     * 创建同步镜像任务
     *
     * 创建同步镜像任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageSynchronizeTaskRequest 请求对象
     * @return SyncInvoker<CreateImageSynchronizeTaskRequest, CreateImageSynchronizeTaskResponse>
     */
    public SyncInvoker<CreateImageSynchronizeTaskRequest, CreateImageSynchronizeTaskResponse> createImageSynchronizeTaskInvoker(
        CreateImageSynchronizeTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createImageSynchronizeTask, hcClient);
    }

    /**
     * 查询仓库镜像列表
     *
     * 查询仓库镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryImagesRequest 请求对象
     * @return ListRegistryImagesResponse
     */
    public ListRegistryImagesResponse listRegistryImages(ListRegistryImagesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listRegistryImages);
    }

    /**
     * 查询仓库镜像列表
     *
     * 查询仓库镜像列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRegistryImagesRequest 请求对象
     * @return SyncInvoker<ListRegistryImagesRequest, ListRegistryImagesResponse>
     */
    public SyncInvoker<ListRegistryImagesRequest, ListRegistryImagesResponse> listRegistryImagesInvoker(
        ListRegistryImagesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listRegistryImages, hcClient);
    }

    /**
     * 发送安全报告
     *
     * 发送安全报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSecurityReportRequest 请求对象
     * @return SendSecurityReportResponse
     */
    public SendSecurityReportResponse sendSecurityReport(SendSecurityReportRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.sendSecurityReport);
    }

    /**
     * 发送安全报告
     *
     * 发送安全报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSecurityReportRequest 请求对象
     * @return SyncInvoker<SendSecurityReportRequest, SendSecurityReportResponse>
     */
    public SyncInvoker<SendSecurityReportRequest, SendSecurityReportResponse> sendSecurityReportInvoker(
        SendSecurityReportRequest request) {
        return new SyncInvoker<>(request, HssMeta.sendSecurityReport, hcClient);
    }

    /**
     * 查询病毒扫描历史处置记录列表
     *
     * 查询病毒扫描历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntivirusHandleHistoryRequest 请求对象
     * @return ListAntivirusHandleHistoryResponse
     */
    public ListAntivirusHandleHistoryResponse listAntivirusHandleHistory(ListAntivirusHandleHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAntivirusHandleHistory);
    }

    /**
     * 查询病毒扫描历史处置记录列表
     *
     * 查询病毒扫描历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntivirusHandleHistoryRequest 请求对象
     * @return SyncInvoker<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse>
     */
    public SyncInvoker<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse> listAntivirusHandleHistoryInvoker(
        ListAntivirusHandleHistoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAntivirusHandleHistory, hcClient);
    }

    /**
     * 查询告警事件历史处置记录列表
     *
     * 查询告警事件历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventHandleHistoryRequest 请求对象
     * @return ListEventHandleHistoryResponse
     */
    public ListEventHandleHistoryResponse listEventHandleHistory(ListEventHandleHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listEventHandleHistory);
    }

    /**
     * 查询告警事件历史处置记录列表
     *
     * 查询告警事件历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventHandleHistoryRequest 请求对象
     * @return SyncInvoker<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse>
     */
    public SyncInvoker<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse> listEventHandleHistoryInvoker(
        ListEventHandleHistoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listEventHandleHistory, hcClient);
    }

    /**
     * 查询集群的安全体检报告列表
     *
     * 查询集群的安全体检报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckClusterReportsRequest 请求对象
     * @return ListSecurityCheckClusterReportsResponse
     */
    public ListSecurityCheckClusterReportsResponse listSecurityCheckClusterReports(
        ListSecurityCheckClusterReportsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSecurityCheckClusterReports);
    }

    /**
     * 查询集群的安全体检报告列表
     *
     * 查询集群的安全体检报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityCheckClusterReportsRequest 请求对象
     * @return SyncInvoker<ListSecurityCheckClusterReportsRequest, ListSecurityCheckClusterReportsResponse>
     */
    public SyncInvoker<ListSecurityCheckClusterReportsRequest, ListSecurityCheckClusterReportsResponse> listSecurityCheckClusterReportsInvoker(
        ListSecurityCheckClusterReportsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSecurityCheckClusterReports, hcClient);
    }

    /**
     * 查询漏洞历史处置记录列表
     *
     * 查询漏洞历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHandleHistoryRequest 请求对象
     * @return ListVulHandleHistoryResponse
     */
    public ListVulHandleHistoryResponse listVulHandleHistory(ListVulHandleHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHandleHistory);
    }

    /**
     * 查询漏洞历史处置记录列表
     *
     * 查询漏洞历史处置记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHandleHistoryRequest 请求对象
     * @return SyncInvoker<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse>
     */
    public SyncInvoker<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse> listVulHandleHistoryInvoker(
        ListVulHandleHistoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHandleHistory, hcClient);
    }

    /**
     * 查询手动体检状态和进度
     *
     * 查询手动体检状态和进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManualSecurityCheckStatusRequest 请求对象
     * @return ShowManualSecurityCheckStatusResponse
     */
    public ShowManualSecurityCheckStatusResponse showManualSecurityCheckStatus(
        ShowManualSecurityCheckStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showManualSecurityCheckStatus);
    }

    /**
     * 查询手动体检状态和进度
     *
     * 查询手动体检状态和进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowManualSecurityCheckStatusRequest 请求对象
     * @return SyncInvoker<ShowManualSecurityCheckStatusRequest, ShowManualSecurityCheckStatusResponse>
     */
    public SyncInvoker<ShowManualSecurityCheckStatusRequest, ShowManualSecurityCheckStatusResponse> showManualSecurityCheckStatusInvoker(
        ShowManualSecurityCheckStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showManualSecurityCheckStatus, hcClient);
    }

    /**
     * 查询集群的安全体检报告信息
     *
     * 查询集群的安全体检报告信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckClusterReportRequest 请求对象
     * @return ShowSecurityCheckClusterReportResponse
     */
    public ShowSecurityCheckClusterReportResponse showSecurityCheckClusterReport(
        ShowSecurityCheckClusterReportRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSecurityCheckClusterReport);
    }

    /**
     * 查询集群的安全体检报告信息
     *
     * 查询集群的安全体检报告信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckClusterReportRequest 请求对象
     * @return SyncInvoker<ShowSecurityCheckClusterReportRequest, ShowSecurityCheckClusterReportResponse>
     */
    public SyncInvoker<ShowSecurityCheckClusterReportRequest, ShowSecurityCheckClusterReportResponse> showSecurityCheckClusterReportInvoker(
        ShowSecurityCheckClusterReportRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSecurityCheckClusterReport, hcClient);
    }

    /**
     * 查询安全体检定时配置信息
     *
     * 查询安全体检定时配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckConfigRequest 请求对象
     * @return ShowSecurityCheckConfigResponse
     */
    public ShowSecurityCheckConfigResponse showSecurityCheckConfig(ShowSecurityCheckConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSecurityCheckConfig);
    }

    /**
     * 查询安全体检定时配置信息
     *
     * 查询安全体检定时配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckConfigRequest 请求对象
     * @return SyncInvoker<ShowSecurityCheckConfigRequest, ShowSecurityCheckConfigResponse>
     */
    public SyncInvoker<ShowSecurityCheckConfigRequest, ShowSecurityCheckConfigResponse> showSecurityCheckConfigInvoker(
        ShowSecurityCheckConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSecurityCheckConfig, hcClient);
    }

    /**
     * 查询指定服务器的安全体检报告
     *
     * 查询指定服务器的安全体检报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckHostReportRequest 请求对象
     * @return ShowSecurityCheckHostReportResponse
     */
    public ShowSecurityCheckHostReportResponse showSecurityCheckHostReport(ShowSecurityCheckHostReportRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSecurityCheckHostReport);
    }

    /**
     * 查询指定服务器的安全体检报告
     *
     * 查询指定服务器的安全体检报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityCheckHostReportRequest 请求对象
     * @return SyncInvoker<ShowSecurityCheckHostReportRequest, ShowSecurityCheckHostReportResponse>
     */
    public SyncInvoker<ShowSecurityCheckHostReportRequest, ShowSecurityCheckHostReportResponse> showSecurityCheckHostReportInvoker(
        ShowSecurityCheckHostReportRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSecurityCheckHostReport, hcClient);
    }

    /**
     * 启动手动体检
     *
     * 启动手动体检。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualSecurityCheckRequest 请求对象
     * @return StartManualSecurityCheckResponse
     */
    public StartManualSecurityCheckResponse startManualSecurityCheck(StartManualSecurityCheckRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.startManualSecurityCheck);
    }

    /**
     * 启动手动体检
     *
     * 启动手动体检。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartManualSecurityCheckRequest 请求对象
     * @return SyncInvoker<StartManualSecurityCheckRequest, StartManualSecurityCheckResponse>
     */
    public SyncInvoker<StartManualSecurityCheckRequest, StartManualSecurityCheckResponse> startManualSecurityCheckInvoker(
        StartManualSecurityCheckRequest request) {
        return new SyncInvoker<>(request, HssMeta.startManualSecurityCheck, hcClient);
    }

    /**
     * 取消手动体检
     *
     * 取消手动体检。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopManualSecurityCheckRequest 请求对象
     * @return StopManualSecurityCheckResponse
     */
    public StopManualSecurityCheckResponse stopManualSecurityCheck(StopManualSecurityCheckRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.stopManualSecurityCheck);
    }

    /**
     * 取消手动体检
     *
     * 取消手动体检。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopManualSecurityCheckRequest 请求对象
     * @return SyncInvoker<StopManualSecurityCheckRequest, StopManualSecurityCheckResponse>
     */
    public SyncInvoker<StopManualSecurityCheckRequest, StopManualSecurityCheckResponse> stopManualSecurityCheckInvoker(
        StopManualSecurityCheckRequest request) {
        return new SyncInvoker<>(request, HssMeta.stopManualSecurityCheck, hcClient);
    }

    /**
     * 修改安全体检定时配置信息
     *
     * 修改安全体检定时配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckConfigRequest 请求对象
     * @return UpdateSecurityCheckConfigResponse
     */
    public UpdateSecurityCheckConfigResponse updateSecurityCheckConfig(UpdateSecurityCheckConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateSecurityCheckConfig);
    }

    /**
     * 修改安全体检定时配置信息
     *
     * 修改安全体检定时配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityCheckConfigRequest 请求对象
     * @return SyncInvoker<UpdateSecurityCheckConfigRequest, UpdateSecurityCheckConfigResponse>
     */
    public SyncInvoker<UpdateSecurityCheckConfigRequest, UpdateSecurityCheckConfigResponse> updateSecurityCheckConfigInvoker(
        UpdateSecurityCheckConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateSecurityCheckConfig, hcClient);
    }

    /**
     * 查询Serverless资产列表--接口已废弃
     *
     * 查询Serverless资产列表--接口已废弃
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerlessAssetRequest 请求对象
     * @return ListServerlessAssetResponse
     */
    public ListServerlessAssetResponse listServerlessAsset(ListServerlessAssetRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listServerlessAsset);
    }

    /**
     * 查询Serverless资产列表--接口已废弃
     *
     * 查询Serverless资产列表--接口已废弃
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerlessAssetRequest 请求对象
     * @return SyncInvoker<ListServerlessAssetRequest, ListServerlessAssetResponse>
     */
    public SyncInvoker<ListServerlessAssetRequest, ListServerlessAssetResponse> listServerlessAssetInvoker(
        ListServerlessAssetRequest request) {
        return new SyncInvoker<>(request, HssMeta.listServerlessAsset, hcClient);
    }

    /**
     * 查询Serverless资产详细信息--接口已废弃
     *
     * 查询Serverless资产详细信息--接口已废弃
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerlessAssetDetailRequest 请求对象
     * @return ListServerlessAssetDetailResponse
     */
    public ListServerlessAssetDetailResponse listServerlessAssetDetail(ListServerlessAssetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listServerlessAssetDetail);
    }

    /**
     * 查询Serverless资产详细信息--接口已废弃
     *
     * 查询Serverless资产详细信息--接口已废弃
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerlessAssetDetailRequest 请求对象
     * @return SyncInvoker<ListServerlessAssetDetailRequest, ListServerlessAssetDetailResponse>
     */
    public SyncInvoker<ListServerlessAssetDetailRequest, ListServerlessAssetDetailResponse> listServerlessAssetDetailInvoker(
        ListServerlessAssetDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.listServerlessAssetDetail, hcClient);
    }

    /**
     * 开启或关闭“Agent自动升级”配置开关
     *
     * 开启或关闭“Agent自动升级”配置开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentAutoUpgradeStatusRequest 请求对象
     * @return ChangeAgentAutoUpgradeStatusResponse
     */
    public ChangeAgentAutoUpgradeStatusResponse changeAgentAutoUpgradeStatus(
        ChangeAgentAutoUpgradeStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeAgentAutoUpgradeStatus);
    }

    /**
     * 开启或关闭“Agent自动升级”配置开关
     *
     * 开启或关闭“Agent自动升级”配置开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAgentAutoUpgradeStatusRequest 请求对象
     * @return SyncInvoker<ChangeAgentAutoUpgradeStatusRequest, ChangeAgentAutoUpgradeStatusResponse>
     */
    public SyncInvoker<ChangeAgentAutoUpgradeStatusRequest, ChangeAgentAutoUpgradeStatusResponse> changeAgentAutoUpgradeStatusInvoker(
        ChangeAgentAutoUpgradeStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeAgentAutoUpgradeStatus, hcClient);
    }

    /**
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     *
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicySwitchStatusRequest 请求对象
     * @return ChangePolicySwitchStatusResponse
     */
    public ChangePolicySwitchStatusResponse changePolicySwitchStatus(ChangePolicySwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changePolicySwitchStatus);
    }

    /**
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略
     *
     * 修改指定策略的总开关，将该策略的所有主机都打开或者关闭此策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePolicySwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangePolicySwitchStatusRequest, ChangePolicySwitchStatusResponse>
     */
    public SyncInvoker<ChangePolicySwitchStatusRequest, ChangePolicySwitchStatusResponse> changePolicySwitchStatusInvoker(
        ChangePolicySwitchStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changePolicySwitchStatus, hcClient);
    }

    /**
     * 修改配置开关状态
     *
     * 修改配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSwitchesStatusRequest 请求对象
     * @return ChangeSwitchesStatusResponse
     */
    public ChangeSwitchesStatusResponse changeSwitchesStatus(ChangeSwitchesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeSwitchesStatus);
    }

    /**
     * 修改配置开关状态
     *
     * 修改配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSwitchesStatusRequest 请求对象
     * @return SyncInvoker<ChangeSwitchesStatusRequest, ChangeSwitchesStatusResponse>
     */
    public SyncInvoker<ChangeSwitchesStatusRequest, ChangeSwitchesStatusResponse> changeSwitchesStatusInvoker(
        ChangeSwitchesStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeSwitchesStatus, hcClient);
    }

    /**
     * 查询“Agent自动升级”配置开关状态
     *
     * 查询“Agent自动升级”配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentAutoUpgradeStatusRequest 请求对象
     * @return ListAgentAutoUpgradeStatusResponse
     */
    public ListAgentAutoUpgradeStatusResponse listAgentAutoUpgradeStatus(ListAgentAutoUpgradeStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAgentAutoUpgradeStatus);
    }

    /**
     * 查询“Agent自动升级”配置开关状态
     *
     * 查询“Agent自动升级”配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentAutoUpgradeStatusRequest 请求对象
     * @return SyncInvoker<ListAgentAutoUpgradeStatusRequest, ListAgentAutoUpgradeStatusResponse>
     */
    public SyncInvoker<ListAgentAutoUpgradeStatusRequest, ListAgentAutoUpgradeStatusResponse> listAgentAutoUpgradeStatusInvoker(
        ListAgentAutoUpgradeStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAgentAutoUpgradeStatus, hcClient);
    }

    /**
     * 查询agent版本信息列表
     *
     * 查询agent版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentVersionRequest 请求对象
     * @return ListAgentVersionResponse
     */
    public ListAgentVersionResponse listAgentVersion(ListAgentVersionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAgentVersion);
    }

    /**
     * 查询agent版本信息列表
     *
     * 查询agent版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentVersionRequest 请求对象
     * @return SyncInvoker<ListAgentVersionRequest, ListAgentVersionResponse>
     */
    public SyncInvoker<ListAgentVersionRequest, ListAgentVersionResponse> listAgentVersionInvoker(
        ListAgentVersionRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAgentVersion, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigRequest 请求对象
     * @return ListAlarmConfigResponse
     */
    public ListAlarmConfigResponse listAlarmConfig(ListAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAlarmConfig);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmConfigRequest 请求对象
     * @return SyncInvoker<ListAlarmConfigRequest, ListAlarmConfigResponse>
     */
    public SyncInvoker<ListAlarmConfigRequest, ListAlarmConfigResponse> listAlarmConfigInvoker(
        ListAlarmConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAlarmConfig, hcClient);
    }

    /**
     * 查询程序自动隔离查杀状态
     *
     * 查询程序自动隔离查杀状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoKillVirusStatusRequest 请求对象
     * @return ListAutoKillVirusStatusResponse
     */
    public ListAutoKillVirusStatusResponse listAutoKillVirusStatus(ListAutoKillVirusStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listAutoKillVirusStatus);
    }

    /**
     * 查询程序自动隔离查杀状态
     *
     * 查询程序自动隔离查杀状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoKillVirusStatusRequest 请求对象
     * @return SyncInvoker<ListAutoKillVirusStatusRequest, ListAutoKillVirusStatusResponse>
     */
    public SyncInvoker<ListAutoKillVirusStatusRequest, ListAutoKillVirusStatusResponse> listAutoKillVirusStatusInvoker(
        ListAutoKillVirusStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.listAutoKillVirusStatus, hcClient);
    }

    /**
     * 获取字典列表
     *
     * 获取字典列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionariesRequest 请求对象
     * @return ListDictionariesResponse
     */
    public ListDictionariesResponse listDictionaries(ListDictionariesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listDictionaries);
    }

    /**
     * 获取字典列表
     *
     * 获取字典列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDictionariesRequest 请求对象
     * @return SyncInvoker<ListDictionariesRequest, ListDictionariesResponse>
     */
    public SyncInvoker<ListDictionariesRequest, ListDictionariesResponse> listDictionariesInvoker(
        ListDictionariesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listDictionaries, hcClient);
    }

    /**
     * 查询常用登录IP信息
     *
     * 查询常用登录IP信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonIpRequest 请求对象
     * @return ListLoginCommonIpResponse
     */
    public ListLoginCommonIpResponse listLoginCommonIp(ListLoginCommonIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLoginCommonIp);
    }

    /**
     * 查询常用登录IP信息
     *
     * 查询常用登录IP信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonIpRequest 请求对象
     * @return SyncInvoker<ListLoginCommonIpRequest, ListLoginCommonIpResponse>
     */
    public SyncInvoker<ListLoginCommonIpRequest, ListLoginCommonIpResponse> listLoginCommonIpInvoker(
        ListLoginCommonIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLoginCommonIp, hcClient);
    }

    /**
     * 查询常用登录地信息
     *
     * 查询常用登录地信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonLocationRequest 请求对象
     * @return ListLoginCommonLocationResponse
     */
    public ListLoginCommonLocationResponse listLoginCommonLocation(ListLoginCommonLocationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLoginCommonLocation);
    }

    /**
     * 查询常用登录地信息
     *
     * 查询常用登录地信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginCommonLocationRequest 请求对象
     * @return SyncInvoker<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse>
     */
    public SyncInvoker<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse> listLoginCommonLocationInvoker(
        ListLoginCommonLocationRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLoginCommonLocation, hcClient);
    }

    /**
     * 查询SSH登录IP白名单列表
     *
     * 查询SSH登录IP白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteIpRequest 请求对象
     * @return ListLoginWhiteIpResponse
     */
    public ListLoginWhiteIpResponse listLoginWhiteIp(ListLoginWhiteIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listLoginWhiteIp);
    }

    /**
     * 查询SSH登录IP白名单列表
     *
     * 查询SSH登录IP白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoginWhiteIpRequest 请求对象
     * @return SyncInvoker<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse>
     */
    public SyncInvoker<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse> listLoginWhiteIpInvoker(
        ListLoginWhiteIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.listLoginWhiteIp, hcClient);
    }

    /**
     * 查询系统配置内容列表
     *
     * 查询系统配置内容列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemConfigsRequest 请求对象
     * @return ListSystemConfigsResponse
     */
    public ListSystemConfigsResponse listSystemConfigs(ListSystemConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listSystemConfigs);
    }

    /**
     * 查询系统配置内容列表
     *
     * 查询系统配置内容列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemConfigsRequest 请求对象
     * @return SyncInvoker<ListSystemConfigsRequest, ListSystemConfigsResponse>
     */
    public SyncInvoker<ListSystemConfigsRequest, ListSystemConfigsResponse> listSystemConfigsInvoker(
        ListSystemConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listSystemConfigs, hcClient);
    }

    /**
     * 查询双因子主机列表
     *
     * 查询双因子主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoFactorLoginHostRequest 请求对象
     * @return ListTwoFactorLoginHostResponse
     */
    public ListTwoFactorLoginHostResponse listTwoFactorLoginHost(ListTwoFactorLoginHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listTwoFactorLoginHost);
    }

    /**
     * 查询双因子主机列表
     *
     * 查询双因子主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoFactorLoginHostRequest 请求对象
     * @return SyncInvoker<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse>
     */
    public SyncInvoker<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse> listTwoFactorLoginHostInvoker(
        ListTwoFactorLoginHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listTwoFactorLoginHost, hcClient);
    }

    /**
     * 添加、编辑或删除常用登录IP地址
     *
     * 添加、编辑或删除常用登录IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonIpRequest 请求对象
     * @return ModifyLoginCommonIpResponse
     */
    public ModifyLoginCommonIpResponse modifyLoginCommonIp(ModifyLoginCommonIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyLoginCommonIp);
    }

    /**
     * 添加、编辑或删除常用登录IP地址
     *
     * 添加、编辑或删除常用登录IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonIpRequest 请求对象
     * @return SyncInvoker<ModifyLoginCommonIpRequest, ModifyLoginCommonIpResponse>
     */
    public SyncInvoker<ModifyLoginCommonIpRequest, ModifyLoginCommonIpResponse> modifyLoginCommonIpInvoker(
        ModifyLoginCommonIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyLoginCommonIp, hcClient);
    }

    /**
     * 添加、编辑或删除常用登录地
     *
     * 添加、编辑或删除常用登录地。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonLocationRequest 请求对象
     * @return ModifyLoginCommonLocationResponse
     */
    public ModifyLoginCommonLocationResponse modifyLoginCommonLocation(ModifyLoginCommonLocationRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyLoginCommonLocation);
    }

    /**
     * 添加、编辑或删除常用登录地
     *
     * 添加、编辑或删除常用登录地。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginCommonLocationRequest 请求对象
     * @return SyncInvoker<ModifyLoginCommonLocationRequest, ModifyLoginCommonLocationResponse>
     */
    public SyncInvoker<ModifyLoginCommonLocationRequest, ModifyLoginCommonLocationResponse> modifyLoginCommonLocationInvoker(
        ModifyLoginCommonLocationRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyLoginCommonLocation, hcClient);
    }

    /**
     * 添加、删除、编辑、启用或禁用登录IP白名单
     *
     * 添加、删除、编辑、启用或禁用登录IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginWhiteIpRequest 请求对象
     * @return ModifyLoginWhiteIpResponse
     */
    public ModifyLoginWhiteIpResponse modifyLoginWhiteIp(ModifyLoginWhiteIpRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.modifyLoginWhiteIp);
    }

    /**
     * 添加、删除、编辑、启用或禁用登录IP白名单
     *
     * 添加、删除、编辑、启用或禁用登录IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyLoginWhiteIpRequest 请求对象
     * @return SyncInvoker<ModifyLoginWhiteIpRequest, ModifyLoginWhiteIpResponse>
     */
    public SyncInvoker<ModifyLoginWhiteIpRequest, ModifyLoginWhiteIpResponse> modifyLoginWhiteIpInvoker(
        ModifyLoginWhiteIpRequest request) {
        return new SyncInvoker<>(request, HssMeta.modifyLoginWhiteIp, hcClient);
    }

    /**
     * 设置双因子登录配置
     *
     * 设置双因子登录配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetTwoFactorLoginConfigRequest 请求对象
     * @return SetTwoFactorLoginConfigResponse
     */
    public SetTwoFactorLoginConfigResponse setTwoFactorLoginConfig(SetTwoFactorLoginConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setTwoFactorLoginConfig);
    }

    /**
     * 设置双因子登录配置
     *
     * 设置双因子登录配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetTwoFactorLoginConfigRequest 请求对象
     * @return SyncInvoker<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse>
     */
    public SyncInvoker<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse> setTwoFactorLoginConfigInvoker(
        SetTwoFactorLoginConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.setTwoFactorLoginConfig, hcClient);
    }

    /**
     * 查询指定策略的总开关
     *
     * 查询指定策略的总开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicySwitchStatusRequest 请求对象
     * @return ShowPolicySwitchStatusResponse
     */
    public ShowPolicySwitchStatusResponse showPolicySwitchStatus(ShowPolicySwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showPolicySwitchStatus);
    }

    /**
     * 查询指定策略的总开关
     *
     * 查询指定策略的总开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicySwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowPolicySwitchStatusRequest, ShowPolicySwitchStatusResponse>
     */
    public SyncInvoker<ShowPolicySwitchStatusRequest, ShowPolicySwitchStatusResponse> showPolicySwitchStatusInvoker(
        ShowPolicySwitchStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showPolicySwitchStatus, hcClient);
    }

    /**
     * 下载脚本文件
     *
     * 下载脚本文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptFileRequest 请求对象
     * @return ShowScriptFileResponse
     */
    public ShowScriptFileResponse showScriptFile(ShowScriptFileRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showScriptFile);
    }

    /**
     * 下载脚本文件
     *
     * 下载脚本文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowScriptFileRequest 请求对象
     * @return SyncInvoker<ShowScriptFileRequest, ShowScriptFileResponse>
     */
    public SyncInvoker<ShowScriptFileRequest, ShowScriptFileResponse> showScriptFileInvoker(
        ShowScriptFileRequest request) {
        return new SyncInvoker<>(request, HssMeta.showScriptFile, hcClient);
    }

    /**
     * 获取配置开关状态
     *
     * 获取配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchesStatusRequest 请求对象
     * @return ShowSwitchesStatusResponse
     */
    public ShowSwitchesStatusResponse showSwitchesStatus(ShowSwitchesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showSwitchesStatus);
    }

    /**
     * 获取配置开关状态
     *
     * 获取配置开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSwitchesStatusRequest 请求对象
     * @return SyncInvoker<ShowSwitchesStatusRequest, ShowSwitchesStatusResponse>
     */
    public SyncInvoker<ShowSwitchesStatusRequest, ShowSwitchesStatusResponse> showSwitchesStatusInvoker(
        ShowSwitchesStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.showSwitchesStatus, hcClient);
    }

    /**
     * 开启或关闭程序自动隔离查杀
     *
     * 开启或关闭程序自动隔离查杀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoKillVirusStatusRequest 请求对象
     * @return StartAutoKillVirusStatusResponse
     */
    public StartAutoKillVirusStatusResponse startAutoKillVirusStatus(StartAutoKillVirusStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.startAutoKillVirusStatus);
    }

    /**
     * 开启或关闭程序自动隔离查杀
     *
     * 开启或关闭程序自动隔离查杀。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAutoKillVirusStatusRequest 请求对象
     * @return SyncInvoker<StartAutoKillVirusStatusRequest, StartAutoKillVirusStatusResponse>
     */
    public SyncInvoker<StartAutoKillVirusStatusRequest, StartAutoKillVirusStatusResponse> startAutoKillVirusStatusInvoker(
        StartAutoKillVirusStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.startAutoKillVirusStatus, hcClient);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return UpdateAlarmConfigResponse
     */
    public UpdateAlarmConfigResponse updateAlarmConfig(UpdateAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateAlarmConfig);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigInvoker(
        UpdateAlarmConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createTask, hcClient);
    }

    /**
     * 查询当前任务关联的资源列表
     *
     * 查询当前任务关联的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskResourcesRequest 请求对象
     * @return ListTaskResourcesResponse
     */
    public ListTaskResourcesResponse listTaskResources(ListTaskResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listTaskResources);
    }

    /**
     * 查询当前任务关联的资源列表
     *
     * 查询当前任务关联的资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskResourcesRequest 请求对象
     * @return SyncInvoker<ListTaskResourcesRequest, ListTaskResourcesResponse>
     */
    public SyncInvoker<ListTaskResourcesRequest, ListTaskResourcesResponse> listTaskResourcesInvoker(
        ListTaskResourcesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listTaskResources, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, HssMeta.listTasks, hcClient);
    }

    /**
     * 重新运行任务
     *
     * 重新运行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryTaskRequest 请求对象
     * @return RetryTaskResponse
     */
    public RetryTaskResponse retryTask(RetryTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.retryTask);
    }

    /**
     * 重新运行任务
     *
     * 重新运行任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryTaskRequest 请求对象
     * @return SyncInvoker<RetryTaskRequest, RetryTaskResponse>
     */
    public SyncInvoker<RetryTaskRequest, RetryTaskResponse> retryTaskInvoker(RetryTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.retryTask, hcClient);
    }

    /**
     * 查询任务统计数据
     *
     * 查询任务统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatisticsRequest 请求对象
     * @return ShowTaskStatisticsResponse
     */
    public ShowTaskStatisticsResponse showTaskStatistics(ShowTaskStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showTaskStatistics);
    }

    /**
     * 查询任务统计数据
     *
     * 查询任务统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskStatisticsRequest 请求对象
     * @return SyncInvoker<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse>
     */
    public SyncInvoker<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse> showTaskStatisticsInvoker(
        ShowTaskStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showTaskStatistics, hcClient);
    }

    /**
     * 添加漏洞白名单
     *
     * 添加漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVulWhiteListRequest 请求对象
     * @return AddVulWhiteListResponse
     */
    public AddVulWhiteListResponse addVulWhiteList(AddVulWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.addVulWhiteList);
    }

    /**
     * 添加漏洞白名单
     *
     * 添加漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVulWhiteListRequest 请求对象
     * @return SyncInvoker<AddVulWhiteListRequest, AddVulWhiteListResponse>
     */
    public SyncInvoker<AddVulWhiteListRequest, AddVulWhiteListResponse> addVulWhiteListInvoker(
        AddVulWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.addVulWhiteList, hcClient);
    }

    /**
     * 修改漏洞扫描策略
     *
     * 修改漏洞扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulScanPolicyRequest 请求对象
     * @return ChangeVulScanPolicyResponse
     */
    public ChangeVulScanPolicyResponse changeVulScanPolicy(ChangeVulScanPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeVulScanPolicy);
    }

    /**
     * 修改漏洞扫描策略
     *
     * 修改漏洞扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulScanPolicyRequest 请求对象
     * @return SyncInvoker<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse>
     */
    public SyncInvoker<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> changeVulScanPolicyInvoker(
        ChangeVulScanPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeVulScanPolicy, hcClient);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulStatusRequest 请求对象
     * @return ChangeVulStatusResponse
     */
    public ChangeVulStatusResponse changeVulStatus(ChangeVulStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeVulStatus);
    }

    /**
     * 修改漏洞的状态
     *
     * 修改漏洞的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulStatusRequest 请求对象
     * @return SyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse>
     */
    public SyncInvoker<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatusInvoker(
        ChangeVulStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeVulStatus, hcClient);
    }

    /**
     * 修改漏洞白名单
     *
     * 修改漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulWhiteListRequest 请求对象
     * @return ChangeVulWhiteListResponse
     */
    public ChangeVulWhiteListResponse changeVulWhiteList(ChangeVulWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.changeVulWhiteList);
    }

    /**
     * 修改漏洞白名单
     *
     * 修改漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVulWhiteListRequest 请求对象
     * @return SyncInvoker<ChangeVulWhiteListRequest, ChangeVulWhiteListResponse>
     */
    public SyncInvoker<ChangeVulWhiteListRequest, ChangeVulWhiteListResponse> changeVulWhiteListInvoker(
        ChangeVulWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.changeVulWhiteList, hcClient);
    }

    /**
     * 创建漏洞扫描任务
     *
     * 创建漏洞扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVulnerabilityScanTaskRequest 请求对象
     * @return CreateVulnerabilityScanTaskResponse
     */
    public CreateVulnerabilityScanTaskResponse createVulnerabilityScanTask(CreateVulnerabilityScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createVulnerabilityScanTask);
    }

    /**
     * 创建漏洞扫描任务
     *
     * 创建漏洞扫描任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVulnerabilityScanTaskRequest 请求对象
     * @return SyncInvoker<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse>
     */
    public SyncInvoker<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> createVulnerabilityScanTaskInvoker(
        CreateVulnerabilityScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.createVulnerabilityScanTask, hcClient);
    }

    /**
     * 删除漏洞白名单
     *
     * 删除漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVulWhiteListRequest 请求对象
     * @return DeleteVulWhiteListResponse
     */
    public DeleteVulWhiteListResponse deleteVulWhiteList(DeleteVulWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteVulWhiteList);
    }

    /**
     * 删除漏洞白名单
     *
     * 删除漏洞白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVulWhiteListRequest 请求对象
     * @return SyncInvoker<DeleteVulWhiteListRequest, DeleteVulWhiteListResponse>
     */
    public SyncInvoker<DeleteVulWhiteListRequest, DeleteVulWhiteListResponse> deleteVulWhiteListInvoker(
        DeleteVulWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteVulWhiteList, hcClient);
    }

    /**
     * 创建历史处理的漏洞导出任务
     *
     * 创建历史处理的漏洞导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportHandledVulnerabilitiesRequest 请求对象
     * @return ExportHandledVulnerabilitiesResponse
     */
    public ExportHandledVulnerabilitiesResponse exportHandledVulnerabilities(
        ExportHandledVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportHandledVulnerabilities);
    }

    /**
     * 创建历史处理的漏洞导出任务
     *
     * 创建历史处理的漏洞导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportHandledVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse>
     */
    public SyncInvoker<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse> exportHandledVulnerabilitiesInvoker(
        ExportHandledVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportHandledVulnerabilities, hcClient);
    }

    /**
     * 创建漏洞处置历史记录的导出任务
     *
     * 创建漏洞处置历史记录的导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulHandleHistoryRequest 请求对象
     * @return ExportVulHandleHistoryResponse
     */
    public ExportVulHandleHistoryResponse exportVulHandleHistory(ExportVulHandleHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportVulHandleHistory);
    }

    /**
     * 创建漏洞处置历史记录的导出任务
     *
     * 创建漏洞处置历史记录的导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulHandleHistoryRequest 请求对象
     * @return SyncInvoker<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse>
     */
    public SyncInvoker<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse> exportVulHandleHistoryInvoker(
        ExportVulHandleHistoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportVulHandleHistory, hcClient);
    }

    /**
     * 导出漏洞及漏洞影响的主机的相关信息
     *
     * 导出漏洞及漏洞影响的主机的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulsRequest 请求对象
     * @return ExportVulsResponse
     */
    public ExportVulsResponse exportVuls(ExportVulsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportVuls);
    }

    /**
     * 导出漏洞及漏洞影响的主机的相关信息
     *
     * 导出漏洞及漏洞影响的主机的相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportVulsRequest 请求对象
     * @return SyncInvoker<ExportVulsRequest, ExportVulsResponse>
     */
    public SyncInvoker<ExportVulsRequest, ExportVulsResponse> exportVulsInvoker(ExportVulsRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportVuls, hcClient);
    }

    /**
     * 查看镜像漏洞的历史处置记录
     *
     * 查看镜像漏洞的历史处置记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulOperationsRequest 请求对象
     * @return ListGeneralImageVulOperationsResponse
     */
    public ListGeneralImageVulOperationsResponse listGeneralImageVulOperations(
        ListGeneralImageVulOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGeneralImageVulOperations);
    }

    /**
     * 查看镜像漏洞的历史处置记录
     *
     * 查看镜像漏洞的历史处置记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulOperationsRequest 请求对象
     * @return SyncInvoker<ListGeneralImageVulOperationsRequest, ListGeneralImageVulOperationsResponse>
     */
    public SyncInvoker<ListGeneralImageVulOperationsRequest, ListGeneralImageVulOperationsResponse> listGeneralImageVulOperationsInvoker(
        ListGeneralImageVulOperationsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGeneralImageVulOperations, hcClient);
    }

    /**
     * 查看所有类型镜像的漏洞
     *
     * 查看所有类型镜像的漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulsRequest 请求对象
     * @return ListGeneralImageVulsResponse
     */
    public ListGeneralImageVulsResponse listGeneralImageVuls(ListGeneralImageVulsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listGeneralImageVuls);
    }

    /**
     * 查看所有类型镜像的漏洞
     *
     * 查看所有类型镜像的漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeneralImageVulsRequest 请求对象
     * @return SyncInvoker<ListGeneralImageVulsRequest, ListGeneralImageVulsResponse>
     */
    public SyncInvoker<ListGeneralImageVulsRequest, ListGeneralImageVulsResponse> listGeneralImageVulsInvoker(
        ListGeneralImageVulsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listGeneralImageVuls, hcClient);
    }

    /**
     * 处理的漏洞
     *
     * 查询今日处理漏洞/累计处理漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleVulsRequest 请求对象
     * @return ListHandleVulsResponse
     */
    public ListHandleVulsResponse listHandleVuls(ListHandleVulsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHandleVuls);
    }

    /**
     * 处理的漏洞
     *
     * 查询今日处理漏洞/累计处理漏洞。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandleVulsRequest 请求对象
     * @return SyncInvoker<ListHandleVulsRequest, ListHandleVulsResponse>
     */
    public SyncInvoker<ListHandleVulsRequest, ListHandleVulsResponse> listHandleVulsInvoker(
        ListHandleVulsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHandleVuls, hcClient);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostVulsRequest 请求对象
     * @return ListHostVulsResponse
     */
    public ListHostVulsResponse listHostVuls(ListHostVulsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostVuls);
    }

    /**
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostVulsRequest 请求对象
     * @return SyncInvoker<ListHostVulsRequest, ListHostVulsResponse>
     */
    public SyncInvoker<ListHostVulsRequest, ListHostVulsResponse> listHostVulsInvoker(ListHostVulsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostVuls, hcClient);
    }

    /**
     * 查询应急漏洞列表
     *
     * 查询应急漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUrgentVulnerabilitiesRequest 请求对象
     * @return ListUrgentVulnerabilitiesResponse
     */
    public ListUrgentVulnerabilitiesResponse listUrgentVulnerabilities(ListUrgentVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listUrgentVulnerabilities);
    }

    /**
     * 查询应急漏洞列表
     *
     * 查询应急漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUrgentVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListUrgentVulnerabilitiesRequest, ListUrgentVulnerabilitiesResponse>
     */
    public SyncInvoker<ListUrgentVulnerabilitiesRequest, ListUrgentVulnerabilitiesResponse> listUrgentVulnerabilitiesInvoker(
        ListUrgentVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listUrgentVulnerabilities, hcClient);
    }

    /**
     * 查询单个漏洞影响的容器app信息
     *
     * 查询单个漏洞影响的容器app信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainerAppsRequest 请求对象
     * @return ListVulContainerAppsResponse
     */
    public ListVulContainerAppsResponse listVulContainerApps(ListVulContainerAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulContainerApps);
    }

    /**
     * 查询单个漏洞影响的容器app信息
     *
     * 查询单个漏洞影响的容器app信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainerAppsRequest 请求对象
     * @return SyncInvoker<ListVulContainerAppsRequest, ListVulContainerAppsResponse>
     */
    public SyncInvoker<ListVulContainerAppsRequest, ListVulContainerAppsResponse> listVulContainerAppsInvoker(
        ListVulContainerAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulContainerApps, hcClient);
    }

    /**
     * 查询单个漏洞影响的容器信息
     *
     * 查询单个漏洞影响的容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainersRequest 请求对象
     * @return ListVulContainersResponse
     */
    public ListVulContainersResponse listVulContainers(ListVulContainersRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulContainers);
    }

    /**
     * 查询单个漏洞影响的容器信息
     *
     * 查询单个漏洞影响的容器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulContainersRequest 请求对象
     * @return SyncInvoker<ListVulContainersRequest, ListVulContainersResponse>
     */
    public SyncInvoker<ListVulContainersRequest, ListVulContainersResponse> listVulContainersInvoker(
        ListVulContainersRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulContainers, hcClient);
    }

    /**
     * 查询受影响服务器详情-软件列表
     *
     * 查询受影响服务器详情-软件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostAppsRequest 请求对象
     * @return ListVulHostAppsResponse
     */
    public ListVulHostAppsResponse listVulHostApps(ListVulHostAppsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostApps);
    }

    /**
     * 查询受影响服务器详情-软件列表
     *
     * 查询受影响服务器详情-软件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostAppsRequest 请求对象
     * @return SyncInvoker<ListVulHostAppsRequest, ListVulHostAppsResponse>
     */
    public SyncInvoker<ListVulHostAppsRequest, ListVulHostAppsResponse> listVulHostAppsInvoker(
        ListVulHostAppsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostApps, hcClient);
    }

    /**
     * 查询可回滚的备份列表
     *
     * 查询可回滚的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostBackupsRequest 请求对象
     * @return ListVulHostBackupsResponse
     */
    public ListVulHostBackupsResponse listVulHostBackups(ListVulHostBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostBackups);
    }

    /**
     * 查询可回滚的备份列表
     *
     * 查询可回滚的备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostBackupsRequest 请求对象
     * @return SyncInvoker<ListVulHostBackupsRequest, ListVulHostBackupsResponse>
     */
    public SyncInvoker<ListVulHostBackupsRequest, ListVulHostBackupsResponse> listVulHostBackupsInvoker(
        ListVulHostBackupsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostBackups, hcClient);
    }

    /**
     * 查询主机视图下的主机漏洞信息
     *
     * 查询主机视图下的主机漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostHostsRequest 请求对象
     * @return ListVulHostHostsResponse
     */
    public ListVulHostHostsResponse listVulHostHosts(ListVulHostHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostHosts);
    }

    /**
     * 查询主机视图下的主机漏洞信息
     *
     * 查询主机视图下的主机漏洞信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostHostsRequest 请求对象
     * @return SyncInvoker<ListVulHostHostsRequest, ListVulHostHostsResponse>
     */
    public SyncInvoker<ListVulHostHostsRequest, ListVulHostHostsResponse> listVulHostHostsInvoker(
        ListVulHostHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostHosts, hcClient);
    }

    /**
     * 查询受影响服务器详情-进程列表
     *
     * 查询受影响服务器详情-进程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostProcessRequest 请求对象
     * @return ListVulHostProcessResponse
     */
    public ListVulHostProcessResponse listVulHostProcess(ListVulHostProcessRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostProcess);
    }

    /**
     * 查询受影响服务器详情-进程列表
     *
     * 查询受影响服务器详情-进程列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostProcessRequest 请求对象
     * @return SyncInvoker<ListVulHostProcessRequest, ListVulHostProcessResponse>
     */
    public SyncInvoker<ListVulHostProcessRequest, ListVulHostProcessResponse> listVulHostProcessInvoker(
        ListVulHostProcessRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostProcess, hcClient);
    }

    /**
     * 查询处理对应的主机存储库的列表
     *
     * 查询处理对应的主机存储库的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVaultsRequest 请求对象
     * @return ListVulHostVaultsResponse
     */
    public ListVulHostVaultsResponse listVulHostVaults(ListVulHostVaultsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostVaults);
    }

    /**
     * 查询处理对应的主机存储库的列表
     *
     * 查询处理对应的主机存储库的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVaultsRequest 请求对象
     * @return SyncInvoker<ListVulHostVaultsRequest, ListVulHostVaultsResponse>
     */
    public SyncInvoker<ListVulHostVaultsRequest, ListVulHostVaultsResponse> listVulHostVaultsInvoker(
        ListVulHostVaultsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostVaults, hcClient);
    }

    /**
     * 主机-漏洞平铺漏洞列表
     *
     * 查询紧急修复/未完成修复漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVulsRequest 请求对象
     * @return ListVulHostVulsResponse
     */
    public ListVulHostVulsResponse listVulHostVuls(ListVulHostVulsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHostVuls);
    }

    /**
     * 主机-漏洞平铺漏洞列表
     *
     * 查询紧急修复/未完成修复漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostVulsRequest 请求对象
     * @return SyncInvoker<ListVulHostVulsRequest, ListVulHostVulsResponse>
     */
    public SyncInvoker<ListVulHostVulsRequest, ListVulHostVulsResponse> listVulHostVulsInvoker(
        ListVulHostVulsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHostVuls, hcClient);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostsRequest 请求对象
     * @return ListVulHostsResponse
     */
    public ListVulHostsResponse listVulHosts(ListVulHostsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulHosts);
    }

    /**
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulHostsRequest 请求对象
     * @return SyncInvoker<ListVulHostsRequest, ListVulHostsResponse>
     */
    public SyncInvoker<ListVulHostsRequest, ListVulHostsResponse> listVulHostsInvoker(ListVulHostsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulHosts, hcClient);
    }

    /**
     * 查询漏洞修复命令列表
     *
     * 查询漏洞修复命令列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepairCmdsRequest 请求对象
     * @return ListVulRepairCmdsResponse
     */
    public ListVulRepairCmdsResponse listVulRepairCmds(ListVulRepairCmdsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulRepairCmds);
    }

    /**
     * 查询漏洞修复命令列表
     *
     * 查询漏洞修复命令列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepairCmdsRequest 请求对象
     * @return SyncInvoker<ListVulRepairCmdsRequest, ListVulRepairCmdsResponse>
     */
    public SyncInvoker<ListVulRepairCmdsRequest, ListVulRepairCmdsResponse> listVulRepairCmdsInvoker(
        ListVulRepairCmdsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulRepairCmds, hcClient);
    }

    /**
     * 查询漏洞修复失败信息
     *
     * 查询漏洞修复失败信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepairFailedDetailRequest 请求对象
     * @return ListVulRepairFailedDetailResponse
     */
    public ListVulRepairFailedDetailResponse listVulRepairFailedDetail(ListVulRepairFailedDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulRepairFailedDetail);
    }

    /**
     * 查询漏洞修复失败信息
     *
     * 查询漏洞修复失败信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulRepairFailedDetailRequest 请求对象
     * @return SyncInvoker<ListVulRepairFailedDetailRequest, ListVulRepairFailedDetailResponse>
     */
    public SyncInvoker<ListVulRepairFailedDetailRequest, ListVulRepairFailedDetailResponse> listVulRepairFailedDetailInvoker(
        ListVulRepairFailedDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulRepairFailedDetail, hcClient);
    }

    /**
     * 查询漏洞扫描任务列表
     *
     * 查询漏洞扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskRequest 请求对象
     * @return ListVulScanTaskResponse
     */
    public ListVulScanTaskResponse listVulScanTask(ListVulScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulScanTask);
    }

    /**
     * 查询漏洞扫描任务列表
     *
     * 查询漏洞扫描任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskRequest 请求对象
     * @return SyncInvoker<ListVulScanTaskRequest, ListVulScanTaskResponse>
     */
    public SyncInvoker<ListVulScanTaskRequest, ListVulScanTaskResponse> listVulScanTaskInvoker(
        ListVulScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulScanTask, hcClient);
    }

    /**
     * 查询漏洞扫描任务对应的主机列表
     *
     * 查询漏洞扫描任务对应的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskHostRequest 请求对象
     * @return ListVulScanTaskHostResponse
     */
    public ListVulScanTaskHostResponse listVulScanTaskHost(ListVulScanTaskHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulScanTaskHost);
    }

    /**
     * 查询漏洞扫描任务对应的主机列表
     *
     * 查询漏洞扫描任务对应的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulScanTaskHostRequest 请求对象
     * @return SyncInvoker<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse>
     */
    public SyncInvoker<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> listVulScanTaskHostInvoker(
        ListVulScanTaskHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulScanTaskHost, hcClient);
    }

    /**
     * 查询漏洞白名单列表
     *
     * 查询漏洞白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulWhiteListRequest 请求对象
     * @return ListVulWhiteListResponse
     */
    public ListVulWhiteListResponse listVulWhiteList(ListVulWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulWhiteList);
    }

    /**
     * 查询漏洞白名单列表
     *
     * 查询漏洞白名单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulWhiteListRequest 请求对象
     * @return SyncInvoker<ListVulWhiteListRequest, ListVulWhiteListResponse>
     */
    public SyncInvoker<ListVulWhiteListRequest, ListVulWhiteListResponse> listVulWhiteListInvoker(
        ListVulWhiteListRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulWhiteList, hcClient);
    }

    /**
     * 查询添加白名单时的漏洞选项
     *
     * 查询添加白名单时的漏洞选项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulWhiteListVulOptionsRequest 请求对象
     * @return ListVulWhiteListVulOptionsResponse
     */
    public ListVulWhiteListVulOptionsResponse listVulWhiteListVulOptions(ListVulWhiteListVulOptionsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulWhiteListVulOptions);
    }

    /**
     * 查询添加白名单时的漏洞选项
     *
     * 查询添加白名单时的漏洞选项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulWhiteListVulOptionsRequest 请求对象
     * @return SyncInvoker<ListVulWhiteListVulOptionsRequest, ListVulWhiteListVulOptionsResponse>
     */
    public SyncInvoker<ListVulWhiteListVulOptionsRequest, ListVulWhiteListVulOptionsResponse> listVulWhiteListVulOptionsInvoker(
        ListVulWhiteListVulOptionsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulWhiteListVulOptions, hcClient);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return ListVulnerabilitiesResponse
     */
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listVulnerabilities);
    }

    /**
     * 查询漏洞列表
     *
     * 查询漏洞列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVulnerabilitiesRequest 请求对象
     * @return SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
     */
    public SyncInvoker<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilitiesInvoker(
        ListVulnerabilitiesRequest request) {
        return new SyncInvoker<>(request, HssMeta.listVulnerabilities, hcClient);
    }

    /**
     * 记录用户查看漏洞任务管理页面的最后时间
     *
     * 记录用户查看漏洞任务管理页面的最后时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordUserViewVulTaskRequest 请求对象
     * @return RecordUserViewVulTaskResponse
     */
    public RecordUserViewVulTaskResponse recordUserViewVulTask(RecordUserViewVulTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.recordUserViewVulTask);
    }

    /**
     * 记录用户查看漏洞任务管理页面的最后时间
     *
     * 记录用户查看漏洞任务管理页面的最后时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordUserViewVulTaskRequest 请求对象
     * @return SyncInvoker<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse>
     */
    public SyncInvoker<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse> recordUserViewVulTaskInvoker(
        RecordUserViewVulTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.recordUserViewVulTask, hcClient);
    }

    /**
     * 重新扫描之前漏洞扫描任务中的主机
     *
     * 重新扫描之前漏洞扫描任务中的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateVulScanTaskRequest 请求对象
     * @return RecreateVulScanTaskResponse
     */
    public RecreateVulScanTaskResponse recreateVulScanTask(RecreateVulScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.recreateVulScanTask);
    }

    /**
     * 重新扫描之前漏洞扫描任务中的主机
     *
     * 重新扫描之前漏洞扫描任务中的主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecreateVulScanTaskRequest 请求对象
     * @return SyncInvoker<RecreateVulScanTaskRequest, RecreateVulScanTaskResponse>
     */
    public SyncInvoker<RecreateVulScanTaskRequest, RecreateVulScanTaskResponse> recreateVulScanTaskInvoker(
        RecreateVulScanTaskRequest request) {
        return new SyncInvoker<>(request, HssMeta.recreateVulScanTask, hcClient);
    }

    /**
     * 用备份进行回滚
     *
     * 用备份进行回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreVulHostBackupRequest 请求对象
     * @return RestoreVulHostBackupResponse
     */
    public RestoreVulHostBackupResponse restoreVulHostBackup(RestoreVulHostBackupRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.restoreVulHostBackup);
    }

    /**
     * 用备份进行回滚
     *
     * 用备份进行回滚。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreVulHostBackupRequest 请求对象
     * @return SyncInvoker<RestoreVulHostBackupRequest, RestoreVulHostBackupResponse>
     */
    public SyncInvoker<RestoreVulHostBackupRequest, RestoreVulHostBackupResponse> restoreVulHostBackupInvoker(
        RestoreVulHostBackupRequest request) {
        return new SyncInvoker<>(request, HssMeta.restoreVulHostBackup, hcClient);
    }

    /**
     * 查询webcms漏洞基本信息
     *
     * 查询webcms漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCmsVulDetailRequest 请求对象
     * @return ShowCmsVulDetailResponse
     */
    public ShowCmsVulDetailResponse showCmsVulDetail(ShowCmsVulDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showCmsVulDetail);
    }

    /**
     * 查询webcms漏洞基本信息
     *
     * 查询webcms漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCmsVulDetailRequest 请求对象
     * @return SyncInvoker<ShowCmsVulDetailRequest, ShowCmsVulDetailResponse>
     */
    public SyncInvoker<ShowCmsVulDetailRequest, ShowCmsVulDetailResponse> showCmsVulDetailInvoker(
        ShowCmsVulDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showCmsVulDetail, hcClient);
    }

    /**
     * 查询linux漏洞基本信息
     *
     * 查询linux漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLinuxVulDetailRequest 请求对象
     * @return ShowLinuxVulDetailResponse
     */
    public ShowLinuxVulDetailResponse showLinuxVulDetail(ShowLinuxVulDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showLinuxVulDetail);
    }

    /**
     * 查询linux漏洞基本信息
     *
     * 查询linux漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLinuxVulDetailRequest 请求对象
     * @return SyncInvoker<ShowLinuxVulDetailRequest, ShowLinuxVulDetailResponse>
     */
    public SyncInvoker<ShowLinuxVulDetailRequest, ShowLinuxVulDetailResponse> showLinuxVulDetailInvoker(
        ShowLinuxVulDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showLinuxVulDetail, hcClient);
    }

    /**
     * 统计受影响服务器和漏洞数量
     *
     * 统计受影响服务器和漏洞数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulAffectedStaticsRequest 请求对象
     * @return ShowVulAffectedStaticsResponse
     */
    public ShowVulAffectedStaticsResponse showVulAffectedStatics(ShowVulAffectedStaticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulAffectedStatics);
    }

    /**
     * 统计受影响服务器和漏洞数量
     *
     * 统计受影响服务器和漏洞数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulAffectedStaticsRequest 请求对象
     * @return SyncInvoker<ShowVulAffectedStaticsRequest, ShowVulAffectedStaticsResponse>
     */
    public SyncInvoker<ShowVulAffectedStaticsRequest, ShowVulAffectedStaticsResponse> showVulAffectedStaticsInvoker(
        ShowVulAffectedStaticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulAffectedStatics, hcClient);
    }

    /**
     * 查询漏洞处理对应主机的备份相关统计信息
     *
     * 查询漏洞处理对应主机的备份相关统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulBackupStatisticsRequest 请求对象
     * @return ShowVulBackupStatisticsResponse
     */
    public ShowVulBackupStatisticsResponse showVulBackupStatistics(ShowVulBackupStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulBackupStatistics);
    }

    /**
     * 查询漏洞处理对应主机的备份相关统计信息
     *
     * 查询漏洞处理对应主机的备份相关统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulBackupStatisticsRequest 请求对象
     * @return SyncInvoker<ShowVulBackupStatisticsRequest, ShowVulBackupStatisticsResponse>
     */
    public SyncInvoker<ShowVulBackupStatisticsRequest, ShowVulBackupStatisticsResponse> showVulBackupStatisticsInvoker(
        ShowVulBackupStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulBackupStatistics, hcClient);
    }

    /**
     * 漏洞管理-主机视图-主机列表-导出报告
     *
     * 在主机视图中导出漏洞报告详细报告pdf格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulReportDataRequest 请求对象
     * @return ShowVulReportDataResponse
     */
    public ShowVulReportDataResponse showVulReportData(ShowVulReportDataRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulReportData);
    }

    /**
     * 漏洞管理-主机视图-主机列表-导出报告
     *
     * 在主机视图中导出漏洞报告详细报告pdf格式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulReportDataRequest 请求对象
     * @return SyncInvoker<ShowVulReportDataRequest, ShowVulReportDataResponse>
     */
    public SyncInvoker<ShowVulReportDataRequest, ShowVulReportDataResponse> showVulReportDataInvoker(
        ShowVulReportDataRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulReportData, hcClient);
    }

    /**
     * 查询漏洞扫描策略
     *
     * 查询漏洞扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanPolicyRequest 请求对象
     * @return ShowVulScanPolicyResponse
     */
    public ShowVulScanPolicyResponse showVulScanPolicy(ShowVulScanPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulScanPolicy);
    }

    /**
     * 查询漏洞扫描策略
     *
     * 查询漏洞扫描策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanPolicyRequest 请求对象
     * @return SyncInvoker<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse>
     */
    public SyncInvoker<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> showVulScanPolicyInvoker(
        ShowVulScanPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulScanPolicy, hcClient);
    }

    /**
     * 查询漏洞扫描的预估时间
     *
     * 查询漏洞扫描的预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanTaskEstimatedTimeRequest 请求对象
     * @return ShowVulScanTaskEstimatedTimeResponse
     */
    public ShowVulScanTaskEstimatedTimeResponse showVulScanTaskEstimatedTime(
        ShowVulScanTaskEstimatedTimeRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulScanTaskEstimatedTime);
    }

    /**
     * 查询漏洞扫描的预估时间
     *
     * 查询漏洞扫描的预估时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulScanTaskEstimatedTimeRequest 请求对象
     * @return SyncInvoker<ShowVulScanTaskEstimatedTimeRequest, ShowVulScanTaskEstimatedTimeResponse>
     */
    public SyncInvoker<ShowVulScanTaskEstimatedTimeRequest, ShowVulScanTaskEstimatedTimeResponse> showVulScanTaskEstimatedTimeInvoker(
        ShowVulScanTaskEstimatedTimeRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulScanTaskEstimatedTime, hcClient);
    }

    /**
     * 查询漏洞管理统计数据
     *
     * 查询漏洞管理统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulStaticsRequest 请求对象
     * @return ShowVulStaticsResponse
     */
    public ShowVulStaticsResponse showVulStatics(ShowVulStaticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulStatics);
    }

    /**
     * 查询漏洞管理统计数据
     *
     * 查询漏洞管理统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulStaticsRequest 请求对象
     * @return SyncInvoker<ShowVulStaticsRequest, ShowVulStaticsResponse>
     */
    public SyncInvoker<ShowVulStaticsRequest, ShowVulStaticsResponse> showVulStaticsInvoker(
        ShowVulStaticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulStatics, hcClient);
    }

    /**
     * 获取漏洞任务的未读数量
     *
     * 获取漏洞任务的未读数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulTaskStatisticsRequest 请求对象
     * @return ShowVulTaskStatisticsResponse
     */
    public ShowVulTaskStatisticsResponse showVulTaskStatistics(ShowVulTaskStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulTaskStatistics);
    }

    /**
     * 获取漏洞任务的未读数量
     *
     * 获取漏洞任务的未读数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulTaskStatisticsRequest 请求对象
     * @return SyncInvoker<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse>
     */
    public SyncInvoker<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse> showVulTaskStatisticsInvoker(
        ShowVulTaskStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulTaskStatistics, hcClient);
    }

    /**
     * 查询漏洞白名单详情
     *
     * 查询漏洞白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulWhiteListDetailRequest 请求对象
     * @return ShowVulWhiteListDetailResponse
     */
    public ShowVulWhiteListDetailResponse showVulWhiteListDetail(ShowVulWhiteListDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showVulWhiteListDetail);
    }

    /**
     * 查询漏洞白名单详情
     *
     * 查询漏洞白名单详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVulWhiteListDetailRequest 请求对象
     * @return SyncInvoker<ShowVulWhiteListDetailRequest, ShowVulWhiteListDetailResponse>
     */
    public SyncInvoker<ShowVulWhiteListDetailRequest, ShowVulWhiteListDetailResponse> showVulWhiteListDetailInvoker(
        ShowVulWhiteListDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showVulWhiteListDetail, hcClient);
    }

    /**
     * 查询windows漏洞基本信息
     *
     * 查询windows漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindosVulDetailRequest 请求对象
     * @return ShowWindosVulDetailResponse
     */
    public ShowWindosVulDetailResponse showWindosVulDetail(ShowWindosVulDetailRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWindosVulDetail);
    }

    /**
     * 查询windows漏洞基本信息
     *
     * 查询windows漏洞基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindosVulDetailRequest 请求对象
     * @return SyncInvoker<ShowWindosVulDetailRequest, ShowWindosVulDetailResponse>
     */
    public SyncInvoker<ShowWindosVulDetailRequest, ShowWindosVulDetailResponse> showWindosVulDetailInvoker(
        ShowWindosVulDetailRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWindosVulDetail, hcClient);
    }

    /**
     * 批量开启网页防篡改防护
     *
     * 批量开启网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartWebTamperProtectionRequest 请求对象
     * @return BatchStartWebTamperProtectionResponse
     */
    public BatchStartWebTamperProtectionResponse batchStartWebTamperProtection(
        BatchStartWebTamperProtectionRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.batchStartWebTamperProtection);
    }

    /**
     * 批量开启网页防篡改防护
     *
     * 批量开启网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartWebTamperProtectionRequest 请求对象
     * @return SyncInvoker<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse>
     */
    public SyncInvoker<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse> batchStartWebTamperProtectionInvoker(
        BatchStartWebTamperProtectionRequest request) {
        return new SyncInvoker<>(request, HssMeta.batchStartWebTamperProtection, hcClient);
    }

    /**
     * 创建网页防篡改防护配置
     *
     * 创建网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebTamperProtectionConfigRequest 请求对象
     * @return CreateWebTamperProtectionConfigResponse
     */
    public CreateWebTamperProtectionConfigResponse createWebTamperProtectionConfig(
        CreateWebTamperProtectionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.createWebTamperProtectionConfig);
    }

    /**
     * 创建网页防篡改防护配置
     *
     * 创建网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebTamperProtectionConfigRequest 请求对象
     * @return SyncInvoker<CreateWebTamperProtectionConfigRequest, CreateWebTamperProtectionConfigResponse>
     */
    public SyncInvoker<CreateWebTamperProtectionConfigRequest, CreateWebTamperProtectionConfigResponse> createWebTamperProtectionConfigInvoker(
        CreateWebTamperProtectionConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.createWebTamperProtectionConfig, hcClient);
    }

    /**
     * 删除远端备份服务器
     *
     * 删除远端备份服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupHostInfoRequest 请求对象
     * @return DeleteBackupHostInfoResponse
     */
    public DeleteBackupHostInfoResponse deleteBackupHostInfo(DeleteBackupHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteBackupHostInfo);
    }

    /**
     * 删除远端备份服务器
     *
     * 删除远端备份服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupHostInfoRequest 请求对象
     * @return SyncInvoker<DeleteBackupHostInfoRequest, DeleteBackupHostInfoResponse>
     */
    public SyncInvoker<DeleteBackupHostInfoRequest, DeleteBackupHostInfoResponse> deleteBackupHostInfoInvoker(
        DeleteBackupHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteBackupHostInfo, hcClient);
    }

    /**
     * 删除网页防篡改防护配置
     *
     * 删除网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebTamperProtectionConfigRequest 请求对象
     * @return DeleteWebTamperProtectionConfigResponse
     */
    public DeleteWebTamperProtectionConfigResponse deleteWebTamperProtectionConfig(
        DeleteWebTamperProtectionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.deleteWebTamperProtectionConfig);
    }

    /**
     * 删除网页防篡改防护配置
     *
     * 删除网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebTamperProtectionConfigRequest 请求对象
     * @return SyncInvoker<DeleteWebTamperProtectionConfigRequest, DeleteWebTamperProtectionConfigResponse>
     */
    public SyncInvoker<DeleteWebTamperProtectionConfigRequest, DeleteWebTamperProtectionConfigResponse> deleteWebTamperProtectionConfigInvoker(
        DeleteWebTamperProtectionConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.deleteWebTamperProtectionConfig, hcClient);
    }

    /**
     * 导出网页防篡改防护目录列表
     *
     * 导出网页防篡改防护目录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportWebTamperHostRequest 请求对象
     * @return ExportWebTamperHostResponse
     */
    public ExportWebTamperHostResponse exportWebTamperHost(ExportWebTamperHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.exportWebTamperHost);
    }

    /**
     * 导出网页防篡改防护目录列表
     *
     * 导出网页防篡改防护目录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportWebTamperHostRequest 请求对象
     * @return SyncInvoker<ExportWebTamperHostRequest, ExportWebTamperHostResponse>
     */
    public SyncInvoker<ExportWebTamperHostRequest, ExportWebTamperHostResponse> exportWebTamperHostInvoker(
        ExportWebTamperHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.exportWebTamperHost, hcClient);
    }

    /**
     * 查询远端备份服务器列表
     *
     * 查询远端备份服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupHostsInfoRequest 请求对象
     * @return ListBackupHostsInfoResponse
     */
    public ListBackupHostsInfoResponse listBackupHostsInfo(ListBackupHostsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listBackupHostsInfo);
    }

    /**
     * 查询远端备份服务器列表
     *
     * 查询远端备份服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupHostsInfoRequest 请求对象
     * @return SyncInvoker<ListBackupHostsInfoRequest, ListBackupHostsInfoResponse>
     */
    public SyncInvoker<ListBackupHostsInfoRequest, ListBackupHostsInfoResponse> listBackupHostsInfoInvoker(
        ListBackupHostsInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listBackupHostsInfo, hcClient);
    }

    /**
     * 查询静态网页防篡改防护事件
     *
     * 查询静态网页防篡改防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostProtectHistoryInfoRequest 请求对象
     * @return ListHostProtectHistoryInfoResponse
     */
    public ListHostProtectHistoryInfoResponse listHostProtectHistoryInfo(ListHostProtectHistoryInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostProtectHistoryInfo);
    }

    /**
     * 查询静态网页防篡改防护事件
     *
     * 查询静态网页防篡改防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostProtectHistoryInfoRequest 请求对象
     * @return SyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse>
     */
    public SyncInvoker<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfoInvoker(
        ListHostProtectHistoryInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostProtectHistoryInfo, hcClient);
    }

    /**
     * 查询动态网页防篡改防护事件
     *
     * 查询动态网页防篡改防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return ListHostRaspProtectHistoryInfoResponse
     */
    public ListHostRaspProtectHistoryInfoResponse listHostRaspProtectHistoryInfo(
        ListHostRaspProtectHistoryInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listHostRaspProtectHistoryInfo);
    }

    /**
     * 查询动态网页防篡改防护事件
     *
     * 查询动态网页防篡改防护事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRaspProtectHistoryInfoRequest 请求对象
     * @return SyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse>
     */
    public SyncInvoker<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfoInvoker(
        ListHostRaspProtectHistoryInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.listHostRaspProtectHistoryInfo, hcClient);
    }

    /**
     * 查询网页防篡改事件列表
     *
     * 查询网页防篡改事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperEventRequest 请求对象
     * @return ListWebTamperEventResponse
     */
    public ListWebTamperEventResponse listWebTamperEvent(ListWebTamperEventRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperEvent);
    }

    /**
     * 查询网页防篡改事件列表
     *
     * 查询网页防篡改事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperEventRequest 请求对象
     * @return SyncInvoker<ListWebTamperEventRequest, ListWebTamperEventResponse>
     */
    public SyncInvoker<ListWebTamperEventRequest, ListWebTamperEventResponse> listWebTamperEventInvoker(
        ListWebTamperEventRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperEvent, hcClient);
    }

    /**
     * 查询可开启网页防篡改的服务器列表
     *
     * 查询可开启网页防篡改的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperHostRequest 请求对象
     * @return ListWebTamperHostResponse
     */
    public ListWebTamperHostResponse listWebTamperHost(ListWebTamperHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperHost);
    }

    /**
     * 查询可开启网页防篡改的服务器列表
     *
     * 查询可开启网页防篡改的服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperHostRequest 请求对象
     * @return SyncInvoker<ListWebTamperHostRequest, ListWebTamperHostResponse>
     */
    public SyncInvoker<ListWebTamperHostRequest, ListWebTamperHostResponse> listWebTamperHostInvoker(
        ListWebTamperHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperHost, hcClient);
    }

    /**
     * 查询容器网页版防篡改镜像选项列表
     *
     * 查询容器网页版防篡改镜像选项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperImageOptionsRequest 请求对象
     * @return ListWebTamperImageOptionsResponse
     */
    public ListWebTamperImageOptionsResponse listWebTamperImageOptions(ListWebTamperImageOptionsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperImageOptions);
    }

    /**
     * 查询容器网页版防篡改镜像选项列表
     *
     * 查询容器网页版防篡改镜像选项列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperImageOptionsRequest 请求对象
     * @return SyncInvoker<ListWebTamperImageOptionsRequest, ListWebTamperImageOptionsResponse>
     */
    public SyncInvoker<ListWebTamperImageOptionsRequest, ListWebTamperImageOptionsResponse> listWebTamperImageOptionsInvoker(
        ListWebTamperImageOptionsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperImageOptions, hcClient);
    }

    /**
     * 查询容器网页防篡改防护统计数据
     *
     * 查询容器网页防篡改防护统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectStatisticsRequest 请求对象
     * @return ListWebTamperProtectStatisticsResponse
     */
    public ListWebTamperProtectStatisticsResponse listWebTamperProtectStatistics(
        ListWebTamperProtectStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperProtectStatistics);
    }

    /**
     * 查询容器网页防篡改防护统计数据
     *
     * 查询容器网页防篡改防护统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectStatisticsRequest 请求对象
     * @return SyncInvoker<ListWebTamperProtectStatisticsRequest, ListWebTamperProtectStatisticsResponse>
     */
    public SyncInvoker<ListWebTamperProtectStatisticsRequest, ListWebTamperProtectStatisticsResponse> listWebTamperProtectStatisticsInvoker(
        ListWebTamperProtectStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperProtectStatistics, hcClient);
    }

    /**
     * 查询网页防篡改防护配置列表
     *
     * 查询网页防篡改防护配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionConfigsRequest 请求对象
     * @return ListWebTamperProtectionConfigsResponse
     */
    public ListWebTamperProtectionConfigsResponse listWebTamperProtectionConfigs(
        ListWebTamperProtectionConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperProtectionConfigs);
    }

    /**
     * 查询网页防篡改防护配置列表
     *
     * 查询网页防篡改防护配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionConfigsRequest 请求对象
     * @return SyncInvoker<ListWebTamperProtectionConfigsRequest, ListWebTamperProtectionConfigsResponse>
     */
    public SyncInvoker<ListWebTamperProtectionConfigsRequest, ListWebTamperProtectionConfigsResponse> listWebTamperProtectionConfigsInvoker(
        ListWebTamperProtectionConfigsRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperProtectionConfigs, hcClient);
    }

    /**
     * 查询防护配置关联的容器信息列表
     *
     * 查询防护配置关联的容器信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionContainerRequest 请求对象
     * @return ListWebTamperProtectionContainerResponse
     */
    public ListWebTamperProtectionContainerResponse listWebTamperProtectionContainer(
        ListWebTamperProtectionContainerRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperProtectionContainer);
    }

    /**
     * 查询防护配置关联的容器信息列表
     *
     * 查询防护配置关联的容器信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionContainerRequest 请求对象
     * @return SyncInvoker<ListWebTamperProtectionContainerRequest, ListWebTamperProtectionContainerResponse>
     */
    public SyncInvoker<ListWebTamperProtectionContainerRequest, ListWebTamperProtectionContainerResponse> listWebTamperProtectionContainerInvoker(
        ListWebTamperProtectionContainerRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperProtectionContainer, hcClient);
    }

    /**
     * 查询防护配置关联的容器的防护目录列表
     *
     * 查询防护配置关联的容器的防护目录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionDirectoryRequest 请求对象
     * @return ListWebTamperProtectionDirectoryResponse
     */
    public ListWebTamperProtectionDirectoryResponse listWebTamperProtectionDirectory(
        ListWebTamperProtectionDirectoryRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWebTamperProtectionDirectory);
    }

    /**
     * 查询防护配置关联的容器的防护目录列表
     *
     * 查询防护配置关联的容器的防护目录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebTamperProtectionDirectoryRequest 请求对象
     * @return SyncInvoker<ListWebTamperProtectionDirectoryRequest, ListWebTamperProtectionDirectoryResponse>
     */
    public SyncInvoker<ListWebTamperProtectionDirectoryRequest, ListWebTamperProtectionDirectoryResponse> listWebTamperProtectionDirectoryInvoker(
        ListWebTamperProtectionDirectoryRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWebTamperProtectionDirectory, hcClient);
    }

    /**
     * 查询网页防篡改防护列表
     *
     * 查询网页防篡改防护列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWtpProtectHostRequest 请求对象
     * @return ListWtpProtectHostResponse
     */
    public ListWtpProtectHostResponse listWtpProtectHost(ListWtpProtectHostRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.listWtpProtectHost);
    }

    /**
     * 查询网页防篡改防护列表
     *
     * 查询网页防篡改防护列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWtpProtectHostRequest 请求对象
     * @return SyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse>
     */
    public SyncInvoker<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHostInvoker(
        ListWtpProtectHostRequest request) {
        return new SyncInvoker<>(request, HssMeta.listWtpProtectHost, hcClient);
    }

    /**
     * 暂停或恢复网页防篡改的防护目录
     *
     * 暂停或恢复网页防篡改的防护目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectDirSwitchInfoRequest 请求对象
     * @return SetProtectDirSwitchInfoResponse
     */
    public SetProtectDirSwitchInfoResponse setProtectDirSwitchInfo(SetProtectDirSwitchInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setProtectDirSwitchInfo);
    }

    /**
     * 暂停或恢复网页防篡改的防护目录
     *
     * 暂停或恢复网页防篡改的防护目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProtectDirSwitchInfoRequest 请求对象
     * @return SyncInvoker<SetProtectDirSwitchInfoRequest, SetProtectDirSwitchInfoResponse>
     */
    public SyncInvoker<SetProtectDirSwitchInfoRequest, SetProtectDirSwitchInfoResponse> setProtectDirSwitchInfoInvoker(
        SetProtectDirSwitchInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.setProtectDirSwitchInfo, hcClient);
    }

    /**
     * 开启关闭动态网页防篡改防护
     *
     * 开启关闭动态网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRaspSwitchRequest 请求对象
     * @return SetRaspSwitchResponse
     */
    public SetRaspSwitchResponse setRaspSwitch(SetRaspSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setRaspSwitch);
    }

    /**
     * 开启关闭动态网页防篡改防护
     *
     * 开启关闭动态网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRaspSwitchRequest 请求对象
     * @return SyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse>
     */
    public SyncInvoker<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitchInvoker(SetRaspSwitchRequest request) {
        return new SyncInvoker<>(request, HssMeta.setRaspSwitch, hcClient);
    }

    /**
     * 开启或关闭远端备份
     *
     * 为已开启网页防篡改的服务器，开启或关闭远端备份功能，仅限Linux服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRemoteBackupInfoRequest 请求对象
     * @return SetRemoteBackupInfoResponse
     */
    public SetRemoteBackupInfoResponse setRemoteBackupInfo(SetRemoteBackupInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setRemoteBackupInfo);
    }

    /**
     * 开启或关闭远端备份
     *
     * 为已开启网页防篡改的服务器，开启或关闭远端备份功能，仅限Linux服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRemoteBackupInfoRequest 请求对象
     * @return SyncInvoker<SetRemoteBackupInfoRequest, SetRemoteBackupInfoResponse>
     */
    public SyncInvoker<SetRemoteBackupInfoRequest, SetRemoteBackupInfoResponse> setRemoteBackupInfoInvoker(
        SetRemoteBackupInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.setRemoteBackupInfo, hcClient);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWtpProtectionStatusInfoRequest 请求对象
     * @return SetWtpProtectionStatusInfoResponse
     */
    public SetWtpProtectionStatusInfoResponse setWtpProtectionStatusInfo(SetWtpProtectionStatusInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.setWtpProtectionStatusInfo);
    }

    /**
     * 开启关闭网页防篡改防护
     *
     * 开启关闭网页防篡改防护。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWtpProtectionStatusInfoRequest 请求对象
     * @return SyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse>
     */
    public SyncInvoker<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfoInvoker(
        SetWtpProtectionStatusInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.setWtpProtectionStatusInfo, hcClient);
    }

    /**
     * 查询远端备份服务器信息
     *
     * 查询远端备份服务器信息：查询远端备份服务器的相关信息，包含服务器名称、地址、端口号、备份路径、运行状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteBackupHostInfoRequest 请求对象
     * @return ShowRemoteBackupHostInfoResponse
     */
    public ShowRemoteBackupHostInfoResponse showRemoteBackupHostInfo(ShowRemoteBackupHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showRemoteBackupHostInfo);
    }

    /**
     * 查询远端备份服务器信息
     *
     * 查询远端备份服务器信息：查询远端备份服务器的相关信息，包含服务器名称、地址、端口号、备份路径、运行状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteBackupHostInfoRequest 请求对象
     * @return SyncInvoker<ShowRemoteBackupHostInfoRequest, ShowRemoteBackupHostInfoResponse>
     */
    public SyncInvoker<ShowRemoteBackupHostInfoRequest, ShowRemoteBackupHostInfoResponse> showRemoteBackupHostInfoInvoker(
        ShowRemoteBackupHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.showRemoteBackupHostInfo, hcClient);
    }

    /**
     * 查看网页防篡改策略信息
     *
     * 查看网页防篡改策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperHostPolicyRequest 请求对象
     * @return ShowWebTamperHostPolicyResponse
     */
    public ShowWebTamperHostPolicyResponse showWebTamperHostPolicy(ShowWebTamperHostPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWebTamperHostPolicy);
    }

    /**
     * 查看网页防篡改策略信息
     *
     * 查看网页防篡改策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperHostPolicyRequest 请求对象
     * @return SyncInvoker<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse>
     */
    public SyncInvoker<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse> showWebTamperHostPolicyInvoker(
        ShowWebTamperHostPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWebTamperHostPolicy, hcClient);
    }

    /**
     * 查询动态网页防篡改的Tomcat bin目录
     *
     * 查询动态网页防篡改的Tomcat bin目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperRaspPathRequest 请求对象
     * @return ShowWebTamperRaspPathResponse
     */
    public ShowWebTamperRaspPathResponse showWebTamperRaspPath(ShowWebTamperRaspPathRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWebTamperRaspPath);
    }

    /**
     * 查询动态网页防篡改的Tomcat bin目录
     *
     * 查询动态网页防篡改的Tomcat bin目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebTamperRaspPathRequest 请求对象
     * @return SyncInvoker<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse>
     */
    public SyncInvoker<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse> showWebTamperRaspPathInvoker(
        ShowWebTamperRaspPathRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWebTamperRaspPath, hcClient);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计防护服务器数、防护目录数、近七天的已防御篡改攻击数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWtpProtectStatisticsRequest 请求对象
     * @return ShowWtpProtectStatisticsResponse
     */
    public ShowWtpProtectStatisticsResponse showWtpProtectStatistics(ShowWtpProtectStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.showWtpProtectStatistics);
    }

    /**
     * 防护数据统计
     *
     * 防护数据统计：统计防护服务器数、防护目录数、近七天的已防御篡改攻击数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWtpProtectStatisticsRequest 请求对象
     * @return SyncInvoker<ShowWtpProtectStatisticsRequest, ShowWtpProtectStatisticsResponse>
     */
    public SyncInvoker<ShowWtpProtectStatisticsRequest, ShowWtpProtectStatisticsResponse> showWtpProtectStatisticsInvoker(
        ShowWtpProtectStatisticsRequest request) {
        return new SyncInvoker<>(request, HssMeta.showWtpProtectStatistics, hcClient);
    }

    /**
     * 开启/关闭容器网页防篡改防护配置
     *
     * 开启/关闭容器网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWebTamperProtectStatusRequest 请求对象
     * @return SwitchWebTamperProtectStatusResponse
     */
    public SwitchWebTamperProtectStatusResponse switchWebTamperProtectStatus(
        SwitchWebTamperProtectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.switchWebTamperProtectStatus);
    }

    /**
     * 开启/关闭容器网页防篡改防护配置
     *
     * 开启/关闭容器网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWebTamperProtectStatusRequest 请求对象
     * @return SyncInvoker<SwitchWebTamperProtectStatusRequest, SwitchWebTamperProtectStatusResponse>
     */
    public SyncInvoker<SwitchWebTamperProtectStatusRequest, SwitchWebTamperProtectStatusResponse> switchWebTamperProtectStatusInvoker(
        SwitchWebTamperProtectStatusRequest request) {
        return new SyncInvoker<>(request, HssMeta.switchWebTamperProtectStatus, hcClient);
    }

    /**
     * 添加或修改远端备份服务器
     *
     * 添加或修改远端备份服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupHostInfoRequest 请求对象
     * @return UpdateBackupHostInfoResponse
     */
    public UpdateBackupHostInfoResponse updateBackupHostInfo(UpdateBackupHostInfoRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateBackupHostInfo);
    }

    /**
     * 添加或修改远端备份服务器
     *
     * 添加或修改远端备份服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupHostInfoRequest 请求对象
     * @return SyncInvoker<UpdateBackupHostInfoRequest, UpdateBackupHostInfoResponse>
     */
    public SyncInvoker<UpdateBackupHostInfoRequest, UpdateBackupHostInfoResponse> updateBackupHostInfoInvoker(
        UpdateBackupHostInfoRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateBackupHostInfo, hcClient);
    }

    /**
     * 编辑网页防篡改策略信息
     *
     * 编辑网页防篡改策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperHostPolicyRequest 请求对象
     * @return UpdateWebTamperHostPolicyResponse
     */
    public UpdateWebTamperHostPolicyResponse updateWebTamperHostPolicy(UpdateWebTamperHostPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateWebTamperHostPolicy);
    }

    /**
     * 编辑网页防篡改策略信息
     *
     * 编辑网页防篡改策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperHostPolicyRequest 请求对象
     * @return SyncInvoker<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse>
     */
    public SyncInvoker<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse> updateWebTamperHostPolicyInvoker(
        UpdateWebTamperHostPolicyRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateWebTamperHostPolicy, hcClient);
    }

    /**
     * 修改网页防篡改防护配置
     *
     * 修改网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperProtectionConfigRequest 请求对象
     * @return UpdateWebTamperProtectionConfigResponse
     */
    public UpdateWebTamperProtectionConfigResponse updateWebTamperProtectionConfig(
        UpdateWebTamperProtectionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateWebTamperProtectionConfig);
    }

    /**
     * 修改网页防篡改防护配置
     *
     * 修改网页防篡改防护配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperProtectionConfigRequest 请求对象
     * @return SyncInvoker<UpdateWebTamperProtectionConfigRequest, UpdateWebTamperProtectionConfigResponse>
     */
    public SyncInvoker<UpdateWebTamperProtectionConfigRequest, UpdateWebTamperProtectionConfigResponse> updateWebTamperProtectionConfigInvoker(
        UpdateWebTamperProtectionConfigRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateWebTamperProtectionConfig, hcClient);
    }

    /**
     * 修改动态网页防篡改的Tomcat bin目录
     *
     * 修改动态网页防篡改的Tomcat bin目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperRaspPathRequest 请求对象
     * @return UpdateWebTamperRaspPathResponse
     */
    public UpdateWebTamperRaspPathResponse updateWebTamperRaspPath(UpdateWebTamperRaspPathRequest request) {
        return hcClient.syncInvokeHttp(request, HssMeta.updateWebTamperRaspPath);
    }

    /**
     * 修改动态网页防篡改的Tomcat bin目录
     *
     * 修改动态网页防篡改的Tomcat bin目录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebTamperRaspPathRequest 请求对象
     * @return SyncInvoker<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse>
     */
    public SyncInvoker<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse> updateWebTamperRaspPathInvoker(
        UpdateWebTamperRaspPathRequest request) {
        return new SyncInvoker<>(request, HssMeta.updateWebTamperRaspPath, hcClient);
    }

}
